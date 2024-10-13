package chatgpt_2;

import model.Loan;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    void testLoanInitialization() {
        LocalDate returnDate = LocalDate.now().plusDays(7);
        Loan loan = new Loan(200, 20, returnDate, 2.5f);

        assertEquals(200, loan.getMemberId());
        assertEquals(20, loan.getBookCode());
        assertEquals(returnDate, loan.getReturnDate());
        assertEquals(2.5f, loan.getDailyFine());
    }

    @Test
    void testCalculateFine() {
        LocalDate actualReturn = LocalDate.now();
        LocalDate expectedReturn = LocalDate.now().minusDays(3); // Overdue by 3 days
        Loan loan = new Loan(201, 21, expectedReturn, 1.5f);

        float fine = loan.calculateFine(actualReturn);
        assertEquals(4.5f, fine, 0.001);
    }

    @Test
    void testCalculateFineNotOverdue() {
        LocalDate actualReturn = LocalDate.now();
        LocalDate expectedReturn = LocalDate.now().plusDays(3); // Not overdue
        Loan loan = new Loan(202, 22, expectedReturn, 1.5f);

        float fine = loan.calculateFine(actualReturn);
        assertEquals(-4.5f, fine, 0.001); // Negative fine indicates not overdue
    }

    @Test
    void testExtendLoan() {
        LocalDate originalReturnDate = LocalDate.now().plusDays(7);
        Loan loan = new Loan(203, 23, originalReturnDate, 2.0f);

        LocalDate newReturnDate = LocalDate.now().plusDays(14);
        loan.extendLoan(newReturnDate);

        assertEquals(newReturnDate, loan.getReturnDate());
    }
}
