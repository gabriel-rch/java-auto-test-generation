package chatgpt_2;

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

class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Member member1;
    private Member member2;

    @BeforeEach
    void setUp() {
        library = new Library();

        book1 = new Book("Effective Java", "Joshua Bloch", 1, 50);
        book2 = new Book("Clean Code", "Robert C. Martin", 2, 40);

        member1 = new Member(100, "Alice");
        member2 = new Member(101, "Bob");

        library.addBook(book1);
        library.addBook(book2);

        library.addMember(member1);
        library.addMember(member2);
    }

    @Test
    void testAddBook() {
        Book book3 = new Book("Design Patterns", "Erich Gamma", 3, 60);
        library.addBook(book3);
        assertEquals(3, library.getBooks().size());
        assertTrue(library.getBooks().contains(book3));
    }

    @Test
    void testAddMember() {
        Member member3 = new Member(102, "Charlie");
        library.addMember(member3);
        assertEquals(3, library.getMembers().size());
        assertTrue(library.getMembers().contains(member3));
    }

    @Test
    void testLendBookSuccessfully() {
        LocalDate returnDate = LocalDate.now().plusDays(14);
        try {
            library.lendBook(book1, member1, returnDate);
            assertFalse(book1.isAvailable());
            assertEquals(1, library.getLoans().size());

            Loan loan = library.getLoans().get(0);
            assertEquals(member1.getId(), loan.getMemberId());
            assertEquals(book1.getCode(), loan.getBookCode());
            assertEquals(returnDate, loan.getReturnDate());
            assertEquals(book1.getValue() * 0.05f, loan.getDailyFine());
        } catch (BookUnavailableException e) {
            fail("Book should be available for lending.");
        }
    }

    @Test
    void testLendBookUnavailable() {
        LocalDate returnDate = LocalDate.now().plusDays(14);
        try {
            library.lendBook(book1, member1, returnDate);
            assertThrows(BookUnavailableException.class, () -> {
                library.lendBook(book1, member2, returnDate);
            });
        } catch (BookUnavailableException e) {
            fail("First lending should succeed.");
        }
    }

    @Test
    void testGetMemberFine() {
        LocalDate returnDate1 = LocalDate.now().minusDays(5); // Overdue by 5 days
        LocalDate returnDate2 = LocalDate.now().minusDays(2); // Overdue by 2 days

        try {
            library.lendBook(book1, member1, LocalDate.now().minusDays(10));
            library.lendBook(book2, member1, LocalDate.now().minusDays(4));
        } catch (BookUnavailableException e) {
            fail("Books should be available for lending.");
        }

        float fine = library.getMemberFine(member1, LocalDate.now());
        // Fine = (book1 value * 0.05) * 10 + (book2 value * 0.05) * 4
        float expectedFine = (50 * 0.05f) * 10 + (40 * 0.05f) * 4;
        assertEquals(expectedFine, fine, 0.001);
    }

    @Test
    void testGetFineDiscount() {
        LocalDate returnDate = LocalDate.now().minusDays(4); // Overdue by 4 days
        try {
            library.lendBook(book1, member1, returnDate.plusDays(4));
        } catch (BookUnavailableException e) {
            fail("Book should be available for lending.");
        }

        Loan loan = library.getLoans().get(0);
        double fineDiscount = library.getFineDiscount(loan, LocalDate.now());
        float fine = loan.calculateFine(LocalDate.now());
        double expectedDiscount = Math.sqrt(fine);
        double expectedFineDiscount = fine - expectedDiscount;

        assertEquals(expectedFineDiscount, fineDiscount, 0.001);
    }

    @Test
    void testListAllBooks() {
        // Este teste apenas garante que o método executa sem exceções
        assertDoesNotThrow(() -> library.listAllBooks());
    }

    @Test
    void testListAllMembers() {
        // Este teste apenas garante que o método executa sem exceções
        assertDoesNotThrow(() -> library.listAllMembers());
    }
}
