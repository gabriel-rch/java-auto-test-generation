package chatgpt_1;

import control.Library;
import exception.BookUnavailableException;
import model.Book;
import model.Loan;
import model.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Member member1;
    private Member member2;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book1 = new Book("Effective Java", "Joshua Bloch", 1, 100);
        book2 = new Book("Clean Code", "Robert C. Martin", 2, 80);
        member1 = new Member(1, "Alice");
        member2 = new Member(2, "Bob");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);
    }

    @Test
    public void testAddBook() {
        Book book3 = new Book("Java Concurrency", "Brian Goetz", 3, 120);
        library.addBook(book3);
        assertTrue(library.getBooks().contains(book3), "A biblioteca deve conter o novo livro adicionado.");
    }

    @Test
    public void testAddMember() {
        Member member3 = new Member(3, "Charlie");
        library.addMember(member3);
        assertTrue(library.getMembers().contains(member3), "A biblioteca deve conter o novo membro adicionado.");
    }

    @Test
    public void testLendBook_Success() throws BookUnavailableException {
        LocalDate returnDate = LocalDate.now().plusDays(14);
        library.lendBook(book1, member1, returnDate);

        assertFalse(book1.isAvailable(), "O livro emprestado deve estar indisponível.");
        assertEquals(1, library.getLoans().size(), "Deve haver um empréstimo registrado.");
        Loan loan = library.getLoans().get(0);
        assertEquals(member1.getId(), loan.getMemberId(), "O ID do membro deve estar correto.");
        assertEquals(book1.getCode(), loan.getBookCode(), "O código do livro deve estar correto.");
        assertEquals(returnDate, loan.getReturnDate(), "A data de devolução deve estar correta.");
        assertEquals(book1.getValue() * 0.05f, loan.getDailyFine(), 0.001, "A multa diária deve estar correta.");
    }

    @Test
    public void testLendBook_Unavailable() throws BookUnavailableException {
        LocalDate returnDate = LocalDate.now().plusDays(14);
        library.lendBook(book1, member1, returnDate);
        assertThrows(BookUnavailableException.class, () -> {
            library.lendBook(book1, member2, returnDate);
        }, "Deve lançar BookUnavailableException quando o livro já estiver emprestado.");
    }

    @Test
    public void testGetMemberFine_NoFines() {
        float fine = library.getMemberFine(member1, LocalDate.now());
        assertEquals(0f, fine, "Membro sem empréstimos não deve ter multas.");
    }

    @Test
    public void testGetMemberFine_WithFines() throws BookUnavailableException {
        LocalDate returnDate = LocalDate.now().minusDays(5);
        library.lendBook(book1, member1, returnDate);

        float fine = library.getMemberFine(member1, LocalDate.now());
        assertEquals(book1.getValue() * 0.05f * 5, fine, 0.001f, "A multa calculada deve estar correta.");
    }

    @Test
    public void testGetFineDiscount() throws BookUnavailableException {
        LocalDate returnDate = LocalDate.now().minusDays(9);
        library.lendBook(book1, member1, returnDate);
        Loan loan = library.getLoans().get(0);

        double expectedFine = book1.getValue() * 0.05f * 9;
        double expectedDiscount = Math.sqrt(expectedFine);
        double expectedResult = expectedFine - expectedDiscount;

        double discount = library.getFineDiscount(loan, LocalDate.now());
        assertEquals(expectedResult, discount, 0.001, "O desconto na multa deve estar correto.");
    }

    @Test
    public void testListAllBooks() {
        // Este teste verifica se o método executa sem lançar exceções.
        assertDoesNotThrow(() -> library.listAllBooks(), "listAllBooks deve executar sem erros.");
    }

    @Test
    public void testListAllMembers() {
        // Este teste verifica se o método executa sem lançar exceções.
        assertDoesNotThrow(() -> library.listAllMembers(), "listAllMembers deve executar sem erros.");
    }
}
