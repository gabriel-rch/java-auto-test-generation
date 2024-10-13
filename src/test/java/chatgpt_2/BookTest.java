package chatgpt_2;

import model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testBookInitialization() {
        Book book = new Book("The Pragmatic Programmer", "Andrew Hunt", 10, 45);
        assertEquals("The Pragmatic Programmer", book.getTitle());
        assertEquals("Andrew Hunt", book.getAuthor());
        assertEquals(10, book.getCode());
        assertEquals(45, book.getValue());
        assertTrue(book.isAvailable());
    }

    @Test
    void testSetAvailable() {
        Book book = new Book("Refactoring", "Martin Fowler", 11, 55);
        assertTrue(book.isAvailable());
        book.setAvailable(false);
        assertFalse(book.isAvailable());
    }

    @Test
    void testToString() {
        Book book = new Book("Clean Architecture", "Robert C. Martin", 12, 50);
        String expected = "Clean Architecture by ROBERT C. MARTIN";
        assertEquals(expected, book.toString());
    }
}
