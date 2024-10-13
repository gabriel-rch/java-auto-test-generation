package control;

import exception.BookUnavailableException;
import model.Book;
import model.Loan;
import model.Member;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;
    ArrayList<Member> members;
    ArrayList<Loan> loans;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }

    public ArrayList<Loan> getLoans() {
        return loans;
    }

    public void setLoans(ArrayList<Loan> loans) {
        this.loans = loans;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void addMember(Member m) {
        members.add(m);
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void lendBook(Book book, Member member, LocalDate returnDate) throws BookUnavailableException {
        if (book.isAvailable()) {
            Loan loan = new Loan(member.getId(), book.getCode(), returnDate, book.getValue() * 0.05f);
            loans.add(loan);
            book.setAvailable(false);
        } else {
            throw new BookUnavailableException();
        }
    }

    public float getMemberFine(Member member, LocalDate date) {
        return loans
                .stream()
                .filter(loan -> loan.getMemberId() == member.getId())
                .reduce(0f, (subtotal, loan) -> subtotal + loan.calculateFine(date), Float::sum);
    }

    public double getFineDiscount(Loan loan, LocalDate date) {
        float fine = loan.calculateFine(date);
        double discount = Math.sqrt(fine);
        return fine - discount;
    }

    public void listAllBooks() {
        books.forEach(System.out::println);
    }

    public void listAllMembers() {
        members.forEach(System.out::println);
    }
}
