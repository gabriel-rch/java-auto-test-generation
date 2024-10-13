package chatgpt_1;

import model.Loan;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class LoanTest {

    @Test
    public void testLoanConstructor() {
        LocalDate returnDate = LocalDate.now().plusDays(7);
        Loan loan = new Loan(1, 100, returnDate, 5.0f);

        assertEquals(1, loan.getMemberId(), "O ID do membro deve estar correto.");
        assertEquals(100, loan.getBookCode(), "O código do livro deve estar correto.");
        assertEquals(returnDate, loan.getReturnDate(), "A data de devolução deve estar correta.");
        assertEquals(5.0f, loan.getDailyFine(), 0.001f, "A multa diária deve estar correta.");
    }

    @Test
    public void testCalculateFine_NoLate() {
        LocalDate returnDate = LocalDate.now().plusDays(5);
        Loan loan = new Loan(1, 100, returnDate, 10.0f);

        float fine = loan.calculateFine(LocalDate.now());
        assertEquals(0f, fine, "Sem atraso, a multa deve ser zero.");
    }

    @Test
    public void testCalculateFine_WithLate() {
        LocalDate returnDate = LocalDate.now().minusDays(3);
        Loan loan = new Loan(1, 100, returnDate, 10.0f);

        float fine = loan.calculateFine(LocalDate.now());
        assertEquals(30.0f, fine, 0.001f, "Com atraso, a multa deve ser calculada corretamente.");
    }

    @Test
    public void testExtendLoan() {
        LocalDate originalReturnDate = LocalDate.now().plusDays(7);
        Loan loan = new Loan(1, 100, originalReturnDate, 5.0f);

        LocalDate newReturnDate = LocalDate.now().plusDays(14);
        loan.extendLoan(newReturnDate);

        assertEquals(newReturnDate, loan.getReturnDate(), "A data de devolução deve ser atualizada.");
    }
}
