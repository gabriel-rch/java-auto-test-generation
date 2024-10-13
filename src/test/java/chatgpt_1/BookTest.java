package chatgpt_1;

import model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void testBookConstructor() {
        Book book = new Book("The Pragmatic Programmer", "Andy Hunt", 10, 150);
        assertEquals("The Pragmatic Programmer", book.getTitle(), "O título deve estar correto.");
        assertEquals("Andy Hunt", book.getAuthor(), "O autor deve estar correto.");
        assertEquals(10, book.getCode(), "O código deve estar correto.");
        assertEquals(150, book.getValue(), "O valor deve estar correto.");
        assertTrue(book.isAvailable(), "O livro recém-criado deve estar disponível.");
    }

    @Test
    public void testSetAvailable() {
        Book book = new Book("Refactoring", "Martin Fowler", 11, 200);
        assertTrue(book.isAvailable(), "O livro deve estar disponível inicialmente.");
        book.setAvailable(false);
        assertFalse(book.isAvailable(), "O livro deve estar indisponível após a atualização.");
    }

    @Test
    public void testToString() {
        Book book = new Book("Design Patterns", "Erich Gamma", 12, 250);
        String expected = "Design Patterns by ERICH GAMMA";
        assertEquals(expected, book.toString(), "O método toString deve formatar corretamente.");
    }
}
