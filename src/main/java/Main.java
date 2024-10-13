import control.Library;
import exception.BookUnavailableException;
import model.Book;
import model.Member;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Initialize the library
        Library library = new Library();

        // Create some books
        Book book1 = new Book("1984", "George Orwell", 101, 100);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 102, 80);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 103, 90);

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Create some members
        Member member1 = new Member(1, "Alice Johnson");
        Member member2 = new Member(2, "Bob Smith");

        // Add members to the library
        library.addMember(member1);
        library.addMember(member2);

        // Display all books and members
        System.out.println("----- List of Books -----");
        library.listAllBooks();
        System.out.println("\n----- List of Members -----");
        library.listAllMembers();

        // Lend book1 to member1
        try {
            LocalDate returnDate = LocalDate.now().plusDays(14); // Due in 14 days
            library.lendBook(book1, member1, returnDate);
            book1.setAvailable(false); // Mark the book as unavailable
            System.out.println("\nLent \"" + book1 + "\" to " + member1);
        } catch (BookUnavailableException e) {
            System.out.println("\nFailed to lend book: " + e.getMessage());
        }

        // Attempt to lend the same book to member2 (should fail)
        try {
            LocalDate returnDate = LocalDate.now().plusDays(7); // Due in 7 days
            library.lendBook(book1, member2, returnDate);
            book1.setAvailable(false); // This line won't be reached if exception is thrown
            System.out.println("Lent \"" + book1 + "\" to " + member2);
        } catch (BookUnavailableException e) {
            System.out.println("Failed to lend book: " + e.getMessage());
        }

        // Lend book2 to member2
        try {
            LocalDate returnDate = LocalDate.now().minusDays(5); // Overdue by 5 days
            library.lendBook(book2, member2, returnDate);
            book2.setAvailable(false); // Mark the book as unavailable
            System.out.println("\nLent \"" + book2 + "\" to " + member2 + " (Overdue)");
        } catch (BookUnavailableException e) {
            System.out.println("Failed to lend book: " + e.getMessage());
        }

        // Display updated list of books
        System.out.println("\n----- Updated List of Books -----");
        library.listAllBooks();

        // Calculate and display fines
        System.out.println("\n----- Member Fines -----");
        for (Member member : library.getMembers()) {
            float fine = library.getMemberFine(member, LocalDate.now());
            System.out.printf("Fine for %s: $%.2f%n", member, fine);
        }
    }
}