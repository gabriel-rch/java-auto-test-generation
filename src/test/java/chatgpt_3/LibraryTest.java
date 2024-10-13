package chatgpt_3;

import control.Library;
import exception.BookUnavailableException;
import model.Book;
import model.Loan;
import model.Member;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Member member1;
    private Member member2;

    @BeforeEach
    void setUp() {
        library = new Library();

        book1 = new Book("Java Programming", "Author A", 101, 50);
        book2 = new Book("Python Programming", "Author B", 102, 40);

        member1 = new Member(1, "John Doe");
        member2 = new Member(2, "Jane Smith");

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);
    }

    @Test
    @DisplayName("Adicionar Livro à Biblioteca")
    void testAddBook() {
        Book book3 = new Book("C# Programming", "Author C", 103, 45);
        library.addBook(book3);
        assertEquals(3, library.getBooks().size());
        assertTrue(library.getBooks().contains(book3));
    }

    @Test
    @DisplayName("Adicionar Membro à Biblioteca")
    void testAddMember() {
        Member member3 = new Member(3, "Alice Johnson");
        library.addMember(member3);
        assertEquals(3, library.getMembers().size());
        assertTrue(library.getMembers().contains(member3));
    }

    @Test
    @DisplayName("Emprestar Livro Disponível com Sucesso")
    void testLendBookSuccess() {
        LocalDate returnDate = LocalDate.now().plusDays(14);
        assertDoesNotThrow(() -> library.lendBook(book1, member1, returnDate));
        assertFalse(book1.isAvailable());
        assertEquals(1, library.getLoans().size());

        Loan loan = library.getLoans().get(0);
        assertEquals(member1.getId(), loan.getMemberId());
        assertEquals(book1.getCode(), loan.getBookCode());
        assertEquals(returnDate, loan.getReturnDate());
        assertEquals(book1.getValue() * 0.05f, loan.getDailyFine());
    }

    @Test
    @DisplayName("Emprestar Livro Indisponível Lança Exceção")
    void testLendBookUnavailable() throws BookUnavailableException {
        LocalDate returnDate = LocalDate.now().plusDays(14);
        library.lendBook(book1, member1, returnDate);

        BookUnavailableException exception = assertThrows(BookUnavailableException.class, () -> {
            library.lendBook(book1, member2, returnDate);
        });

        assertNotNull(exception);
    }

    @Test
    @DisplayName("Calcular Multa de Membro")
    void testGetMemberFine() throws BookUnavailableException {
        LocalDate returnDate = LocalDate.now().minusDays(5); // Já passou do retorno
        library.lendBook(book1, member1, returnDate.plusDays(10)); // Deve ter 5 dias de atraso

        float fine = library.getMemberFine(member1, returnDate);
        assertEquals(5 * (book1.getValue() * 0.05f), fine);
    }

    @Test
    @DisplayName("Calcular Desconto na Multa")
    void testGetFineDiscount() throws BookUnavailableException {
        LocalDate returnDate = LocalDate.now().minusDays(3);
        library.lendBook(book2, member2, returnDate.plusDays(7)); // 3 dias de atraso

        Loan loan = library.getLoans().get(0);
        double discount = library.getFineDiscount(loan, returnDate);
        float fine = loan.calculateFine(returnDate);
        double expectedDiscount = Math.sqrt(fine);
        assertEquals(fine - expectedDiscount, discount, 0.0001);
    }

    @Test
    @DisplayName("Listar Todos os Livros")
    void testListAllBooks() {
        // Capturar a saída padrão
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        library.listAllBooks();
        String expectedOutput = book1.toString() + System.lineSeparator() + book2.toString() + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());

        // Restaurar a saída padrão
        System.setOut(System.out);
    }

    @Test
    @DisplayName("Listar Todos os Membros")
    void testListAllMembers() {
        // Capturar a saída padrão
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        library.listAllMembers();
        String expectedOutput = member1.toString() + System.lineSeparator() + member2.toString() + System.lineSeparator();
        assertEquals(expectedOutput, outContent.toString());

        // Restaurar a saída padrão
        System.setOut(System.out);
    }
}
