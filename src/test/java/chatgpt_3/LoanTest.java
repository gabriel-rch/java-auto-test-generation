package chatgpt_3;

import model.Loan;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LoanTest {

    @Test
    @DisplayName("Criar Empréstimo e Verificar Atributos")
    void testLoanCreation() {
        LocalDate returnDate = LocalDate.now().plusDays(14);
        Loan loan = new Loan(1, 101, returnDate, 2.5f);

        assertEquals(1, loan.getMemberId());
        assertEquals(101, loan.getBookCode());
        assertEquals(returnDate, loan.getReturnDate());
        assertEquals(2.5f, loan.getDailyFine());
    }

    @Test
    @DisplayName("Calcular Multa com Atraso")
    void testCalculateFineWithDelay() {
        LocalDate actualReturn = LocalDate.now();
        LocalDate expectedReturn = actualReturn.minusDays(5); // 5 dias de atraso

        Loan loan = new Loan(1, 101, expectedReturn, 3.0f);
        float fine = loan.calculateFine(actualReturn);
        assertEquals(15.0f, fine); // 5 * 3.0
    }

    @Test
    @DisplayName("Calcular Multa sem Atraso")
    void testCalculateFineWithoutDelay() {
        LocalDate actualReturn = LocalDate.now();
        LocalDate expectedReturn = actualReturn.plusDays(5); // Sem atraso

        Loan loan = new Loan(1, 101, expectedReturn, 3.0f);
        float fine = loan.calculateFine(actualReturn);
        assertEquals(0.0f, fine);
    }

    @Test
    @DisplayName("Estender Empréstimo")
    void testExtendLoan() {
        LocalDate originalReturnDate = LocalDate.now().plusDays(10);
        Loan loan = new Loan(2, 102, originalReturnDate, 2.0f);

        LocalDate newReturnDate = originalReturnDate.plusDays(5);
        loan.extendLoan(newReturnDate);

        assertEquals(newReturnDate, loan.getReturnDate());
    }
}
