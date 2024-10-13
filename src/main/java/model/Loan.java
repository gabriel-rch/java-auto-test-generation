package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Loan {
    private final int memberId;
    private final int bookCode;
    private LocalDate returnDate;
    private final float dailyFine;

    public Loan(int memberId, int bookCode, LocalDate returnDate, float dailyFine) {
        this.memberId = memberId;
        this.bookCode = bookCode;
        this.returnDate = returnDate;
        this.dailyFine = dailyFine;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public float getDailyFine() {
        return dailyFine;
    }

    public int getMemberId() {
        return memberId;
    }

    public int getBookCode() {
        return bookCode;
    }

    public float calculateFine(LocalDate actualReturn) {
        long daysPassed = ChronoUnit.DAYS.between(actualReturn, returnDate);
        return dailyFine * daysPassed;
    }

    public void extendLoan(LocalDate newReturnDate) {
        returnDate = newReturnDate;
    }

}
