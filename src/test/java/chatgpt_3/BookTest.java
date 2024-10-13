package chatgpt_3;

import model.Book;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    @DisplayName("Criar Livro e Verificar Atributos")
    void testBookCreation() {
        Book book = new Book("Effective Java", "Joshua Bloch", 201, 60);
        assertEquals("Effective Java", book.getTitle());
        assertEquals("Joshua Bloch", book.getAuthor());
        assertEquals(201, book.getCode());
        assertEquals(60, book.getValue());
        assertTrue(book.isAvailable());
    }

    @Test
    @DisplayName("Alterar Disponibilidade do Livro")
    void testSetAvailability() {
        Book book = new Book("Clean Code", "Robert C. Martin", 202, 55);
        assertTrue(book.isAvailable());

        book.setAvailable(false);
        assertFalse(book.isAvailable());

        book.setAvailable(true);
        assertTrue(book.isAvailable());
    }

    @Test
    @DisplayName("Representação em String do Livro")
    void testToString() {
        Book book = new Book("The Pragmatic Programmer", "Andy Hunt", 203, 70);
        assertEquals("The Pragmatic Programmer by ANDY HUNT", book.toString());
    }
}
