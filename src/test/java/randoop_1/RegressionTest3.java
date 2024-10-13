package randoop_1;

import model.*;
import control.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        int int8 = loan4.getBookCode();
        float float9 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        control.Library library2 = new control.Library();
        model.Book book7 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book12 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray13 = new model.Book[] { book7, book12 };
        java.util.ArrayList<model.Book> bookList14 = new java.util.ArrayList<model.Book>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList14, bookArray13);
        library2.setBooks(bookList14);
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member24 = new model.Member((int) 'a', "");
        java.lang.String str25 = member24.getName();
        java.lang.String str26 = member24.toString();
        int int27 = member24.getId();
        java.time.LocalDate localDate28 = null;
        library2.lendBook(book21, member24, localDate28);
        java.time.LocalDate localDate32 = null;
        model.Loan loan34 = new model.Loan(0, (int) (short) -1, localDate32, (float) (short) -1);
        float float35 = loan34.getDailyFine();
        int int36 = loan34.getBookCode();
        java.time.LocalDate localDate39 = null;
        model.Loan loan41 = new model.Loan(0, (int) (short) -1, localDate39, (float) (short) -1);
        float float42 = loan41.getDailyFine();
        model.Loan[] loanArray43 = new model.Loan[] { loan34, loan41 };
        java.util.ArrayList<model.Loan> loanList44 = new java.util.ArrayList<model.Loan>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList44, loanArray43);
        library2.setLoans(loanList44);
        control.Library library47 = new control.Library();
        java.util.ArrayList<model.Loan> loanList48 = library47.getLoans();
        java.util.ArrayList<model.Book> bookList49 = library47.getBooks();
        control.Library library50 = new control.Library();
        java.util.ArrayList<model.Loan> loanList51 = library50.getLoans();
        java.util.ArrayList<model.Book> bookList52 = library50.getBooks();
        library47.setBooks(bookList52);
        library2.setBooks(bookList52);
        library0.setBooks(bookList52);
        java.util.ArrayList<model.Loan> loanList56 = library0.getLoans();
        control.Library library57 = new control.Library();
        java.util.ArrayList<model.Loan> loanList58 = library57.getLoans();
        java.util.ArrayList<model.Loan> loanList59 = library57.getLoans();
        java.util.ArrayList<model.Member> memberList60 = library57.getMembers();
        library0.setMembers(memberList60);
        library0.listAllBooks();
        java.util.ArrayList<model.Book> bookList63 = library0.getBooks();
        control.Library library64 = new control.Library();
        model.Book book69 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book74 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray75 = new model.Book[] { book69, book74 };
        java.util.ArrayList<model.Book> bookList76 = new java.util.ArrayList<model.Book>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList76, bookArray75);
        library64.setBooks(bookList76);
        library64.listAllMembers();
        model.Book book84 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str85 = book84.getAuthor();
        java.lang.String str86 = book84.getTitle();
        int int87 = book84.getCode();
        model.Member member90 = new model.Member((int) 'a', "");
        java.lang.String str91 = member90.getName();
        java.lang.String str92 = member90.getName();
        int int93 = member90.getId();
        java.time.LocalDate localDate94 = null;
        library64.lendBook(book84, member90, localDate94);
        java.util.ArrayList<model.Loan> loanList96 = library64.getLoans();
        library0.setLoans(loanList96);
        library0.listAllMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(loanList48);
        org.junit.Assert.assertNotNull(bookList49);
        org.junit.Assert.assertNotNull(loanList51);
        org.junit.Assert.assertNotNull(bookList52);
        org.junit.Assert.assertNotNull(loanList56);
        org.junit.Assert.assertNotNull(loanList58);
        org.junit.Assert.assertNotNull(loanList59);
        org.junit.Assert.assertNotNull(memberList60);
        org.junit.Assert.assertNotNull(bookList63);
        org.junit.Assert.assertNotNull(bookArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 97 + "'", int93 == 97);
        org.junit.Assert.assertNotNull(loanList96);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.time.LocalDate localDate30 = null;
        model.Loan loan32 = new model.Loan(0, (int) (short) -1, localDate30, (float) (short) -1);
        float float33 = loan32.getDailyFine();
        int int34 = loan32.getBookCode();
        java.time.LocalDate localDate37 = null;
        model.Loan loan39 = new model.Loan(0, (int) (short) -1, localDate37, (float) (short) -1);
        float float40 = loan39.getDailyFine();
        model.Loan[] loanArray41 = new model.Loan[] { loan32, loan39 };
        java.util.ArrayList<model.Loan> loanList42 = new java.util.ArrayList<model.Loan>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList42, loanArray41);
        library0.setLoans(loanList42);
        control.Library library45 = new control.Library();
        java.util.ArrayList<model.Loan> loanList46 = library45.getLoans();
        java.util.ArrayList<model.Book> bookList47 = library45.getBooks();
        control.Library library48 = new control.Library();
        java.util.ArrayList<model.Loan> loanList49 = library48.getLoans();
        java.util.ArrayList<model.Book> bookList50 = library48.getBooks();
        library45.setBooks(bookList50);
        library0.setBooks(bookList50);
        library0.listAllBooks();
        model.Book book58 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean59 = book58.isAvailable();
        boolean boolean60 = book58.isAvailable();
        java.lang.String str61 = book58.getTitle();
        library0.addBook(book58);
        java.lang.String str63 = book58.toString();
        book58.setAvailable(true);
        int int66 = book58.getValue();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(loanList46);
        org.junit.Assert.assertNotNull(bookList47);
        org.junit.Assert.assertNotNull(loanList49);
        org.junit.Assert.assertNotNull(bookList50);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + " by HI!" + "'", str63, " by HI!");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        control.Library library0 = new control.Library();
        model.Member member3 = new model.Member((int) (short) 10, "");
        model.Member member6 = new model.Member((int) 'a', "");
        java.lang.String str7 = member6.getName();
        model.Member member10 = new model.Member((int) 'a', "");
        java.lang.String str11 = member10.getName();
        java.lang.String str12 = member10.getName();
        model.Member member15 = new model.Member((int) 'a', "");
        java.lang.String str16 = member15.getName();
        java.lang.String str17 = member15.toString();
        int int18 = member15.getId();
        model.Member member21 = new model.Member((int) 'a', "");
        java.lang.String str22 = member21.getName();
        java.lang.String str23 = member21.getName();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        model.Member[] memberArray30 = new model.Member[] { member3, member6, member10, member15, member21, member26 };
        java.util.ArrayList<model.Member> memberList31 = new java.util.ArrayList<model.Member>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList31, memberArray30);
        library0.setMembers(memberList31);
        model.Member member36 = new model.Member((int) 'a', "");
        java.lang.String str37 = member36.getName();
        java.lang.String str38 = member36.toString();
        library0.addMember(member36);
        java.time.LocalDate localDate42 = null;
        model.Loan loan44 = new model.Loan((int) (short) 0, (int) (byte) -1, localDate42, (float) (short) 0);
        java.time.LocalDate localDate45 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double46 = library0.getFineDiscount(loan44, localDate45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(memberArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) -1, (int) (byte) 10, localDate2, (float) (short) 100);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getMemberId();
        java.time.LocalDate localDate7 = null;
        loan4.extendLoan(localDate7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        control.Library library4 = new control.Library();
        java.util.ArrayList<model.Loan> loanList5 = library4.getLoans();
        java.util.ArrayList<model.Book> bookList6 = library4.getBooks();
        library1.setBooks(bookList6);
        library0.setBooks(bookList6);
        control.Library library9 = new control.Library();
        model.Book book14 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray20 = new model.Book[] { book14, book19 };
        java.util.ArrayList<model.Book> bookList21 = new java.util.ArrayList<model.Book>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList21, bookArray20);
        library9.setBooks(bookList21);
        control.Library library24 = new control.Library();
        model.Book book29 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book34 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray35 = new model.Book[] { book29, book34 };
        java.util.ArrayList<model.Book> bookList36 = new java.util.ArrayList<model.Book>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList36, bookArray35);
        library24.setBooks(bookList36);
        model.Book book43 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member46 = new model.Member((int) 'a', "");
        java.lang.String str47 = member46.getName();
        java.lang.String str48 = member46.toString();
        int int49 = member46.getId();
        java.time.LocalDate localDate50 = null;
        library24.lendBook(book43, member46, localDate50);
        library9.addBook(book43);
        control.Library library53 = new control.Library();
        java.util.ArrayList<model.Loan> loanList54 = library53.getLoans();
        library9.setLoans(loanList54);
        library0.setLoans(loanList54);
        model.Member member59 = new model.Member((int) 'a', "");
        java.lang.String str60 = member59.getName();
        java.lang.String str61 = member59.getName();
        java.lang.String str62 = member59.toString();
        library0.addMember(member59);
        java.util.ArrayList<model.Member> memberList64 = library0.getMembers();
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(bookArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(bookArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertNotNull(loanList54);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(memberList64);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) -1, (int) (byte) 10, localDate2, (float) (short) 100);
        float float5 = loan4.getDailyFine();
        float float6 = loan4.getDailyFine();
        java.time.LocalDate localDate7 = null;
        loan4.setReturnDate(localDate7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        control.Library library4 = new control.Library();
        java.util.ArrayList<model.Loan> loanList5 = library4.getLoans();
        java.util.ArrayList<model.Book> bookList6 = library4.getBooks();
        library1.setBooks(bookList6);
        library0.setBooks(bookList6);
        control.Library library9 = new control.Library();
        java.util.ArrayList<model.Loan> loanList10 = library9.getLoans();
        control.Library library11 = new control.Library();
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray22 = new model.Book[] { book16, book21 };
        java.util.ArrayList<model.Book> bookList23 = new java.util.ArrayList<model.Book>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList23, bookArray22);
        library11.setBooks(bookList23);
        model.Book book30 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member33 = new model.Member((int) 'a', "");
        java.lang.String str34 = member33.getName();
        java.lang.String str35 = member33.toString();
        int int36 = member33.getId();
        java.time.LocalDate localDate37 = null;
        library11.lendBook(book30, member33, localDate37);
        java.time.LocalDate localDate41 = null;
        model.Loan loan43 = new model.Loan(0, (int) (short) -1, localDate41, (float) (short) -1);
        float float44 = loan43.getDailyFine();
        int int45 = loan43.getBookCode();
        java.time.LocalDate localDate48 = null;
        model.Loan loan50 = new model.Loan(0, (int) (short) -1, localDate48, (float) (short) -1);
        float float51 = loan50.getDailyFine();
        model.Loan[] loanArray52 = new model.Loan[] { loan43, loan50 };
        java.util.ArrayList<model.Loan> loanList53 = new java.util.ArrayList<model.Loan>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList53, loanArray52);
        library11.setLoans(loanList53);
        control.Library library56 = new control.Library();
        java.util.ArrayList<model.Loan> loanList57 = library56.getLoans();
        java.util.ArrayList<model.Book> bookList58 = library56.getBooks();
        control.Library library59 = new control.Library();
        java.util.ArrayList<model.Loan> loanList60 = library59.getLoans();
        java.util.ArrayList<model.Book> bookList61 = library59.getBooks();
        library56.setBooks(bookList61);
        library11.setBooks(bookList61);
        library9.setBooks(bookList61);
        library0.setBooks(bookList61);
        model.Book book66 = null;
        library0.addBook(book66);
        java.util.ArrayList<model.Member> memberList68 = library0.getMembers();
        java.util.ArrayList<model.Loan> loanList69 = library0.getLoans();
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(loanList10);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.0f) + "'", float51 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(loanList57);
        org.junit.Assert.assertNotNull(bookList58);
        org.junit.Assert.assertNotNull(loanList60);
        org.junit.Assert.assertNotNull(bookList61);
        org.junit.Assert.assertNotNull(memberList68);
        org.junit.Assert.assertNotNull(loanList69);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        int int10 = loan4.getMemberId();
        java.time.LocalDate localDate11 = null;
        loan4.extendLoan(localDate11);
        java.time.LocalDate localDate13 = loan4.getReturnDate();
        java.time.LocalDate localDate14 = null;
        loan4.extendLoan(localDate14);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(localDate13);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        java.time.LocalDate localDate8 = null;
        loan4.extendLoan(localDate8);
        int int10 = loan4.getMemberId();
        java.time.LocalDate localDate11 = null;
        loan4.extendLoan(localDate11);
        int int13 = loan4.getMemberId();
        float float14 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + (-1.0f) + "'", float14 == (-1.0f));
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        model.Member member2 = new model.Member((int) (byte) 0, "hi! by HI!");
        java.lang.String str3 = member2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! by HI!" + "'", str3, "hi! by HI!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        model.Member member2 = new model.Member((int) (short) 100, " by HI!");
        int int3 = member2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        model.Book book4 = new model.Book("", "hi!", (int) 'a', 0);
        book4.setAvailable(false);
        java.lang.String str7 = book4.getAuthor();
        boolean boolean8 = book4.isAvailable();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        float float10 = loan4.getDailyFine();
        java.time.LocalDate localDate11 = null;
        loan4.extendLoan(localDate11);
        java.time.LocalDate localDate13 = null;
        loan4.setReturnDate(localDate13);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        model.Book book4 = new model.Book("", " by  by ", (int) '4', 97);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        int int8 = loan4.getBookCode();
        java.time.LocalDate localDate9 = loan4.getReturnDate();
        java.lang.Class<?> wildcardClass10 = loan4.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        java.time.LocalDate localDate9 = null;
        loan4.extendLoan(localDate9);
        java.time.LocalDate localDate11 = loan4.getReturnDate();
        java.time.LocalDate localDate12 = null;
        loan4.extendLoan(localDate12);
        int int14 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        int int10 = loan4.getMemberId();
        float float11 = loan4.getDailyFine();
        java.time.LocalDate localDate12 = null;
        loan4.extendLoan(localDate12);
        java.time.LocalDate localDate14 = null;
        loan4.extendLoan(localDate14);
        java.time.LocalDate localDate16 = null;
        loan4.extendLoan(localDate16);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        model.Book book8 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean9 = book8.isAvailable();
        library0.addBook(book8);
        java.util.ArrayList<model.Loan> loanList11 = library0.getLoans();
        library0.listAllMembers();
        control.Library library13 = new control.Library();
        model.Member member16 = new model.Member((int) (short) 10, "");
        model.Member member19 = new model.Member((int) 'a', "");
        java.lang.String str20 = member19.getName();
        model.Member member23 = new model.Member((int) 'a', "");
        java.lang.String str24 = member23.getName();
        java.lang.String str25 = member23.getName();
        model.Member member28 = new model.Member((int) 'a', "");
        java.lang.String str29 = member28.getName();
        java.lang.String str30 = member28.toString();
        int int31 = member28.getId();
        model.Member member34 = new model.Member((int) 'a', "");
        java.lang.String str35 = member34.getName();
        java.lang.String str36 = member34.getName();
        model.Member member39 = new model.Member((int) 'a', "");
        java.lang.String str40 = member39.getName();
        java.lang.String str41 = member39.toString();
        int int42 = member39.getId();
        model.Member[] memberArray43 = new model.Member[] { member16, member19, member23, member28, member34, member39 };
        java.util.ArrayList<model.Member> memberList44 = new java.util.ArrayList<model.Member>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList44, memberArray43);
        library13.setMembers(memberList44);
        model.Book book51 = new model.Book("", "hi!", 0, (int) 'a');
        int int52 = book51.getValue();
        library13.addBook(book51);
        control.Library library54 = new control.Library();
        java.util.ArrayList<model.Loan> loanList55 = library54.getLoans();
        java.util.ArrayList<model.Loan> loanList56 = library54.getLoans();
        java.util.ArrayList<model.Member> memberList57 = library54.getMembers();
        model.Book book62 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean63 = book62.isAvailable();
        library54.addBook(book62);
        library13.addBook(book62);
        java.lang.String str66 = book62.getTitle();
        library0.addBook(book62);
        library0.listAllMembers();
        model.Book book73 = new model.Book("hi! by ", " by ", (int) '4', 0);
        int int74 = book73.getValue();
        model.Member member77 = new model.Member((int) (short) 100, " by HI!");
        java.lang.String str78 = member77.getName();
        int int79 = member77.getId();
        java.time.LocalDate localDate80 = null;
        library0.lendBook(book73, member77, localDate80);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(loanList11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(memberArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertNotNull(loanList55);
        org.junit.Assert.assertNotNull(loanList56);
        org.junit.Assert.assertNotNull(memberList57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + " by HI!" + "'", str78, " by HI!");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 100 + "'", int79 == 100);
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        model.Member member6 = new model.Member((-1), "hi!");
        library1.addMember(member6);
        java.time.LocalDate localDate8 = null;
        float float9 = library0.getMemberFine(member6, localDate8);
        java.util.ArrayList<model.Book> bookList10 = library0.getBooks();
        control.Library library11 = new control.Library();
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray22 = new model.Book[] { book16, book21 };
        java.util.ArrayList<model.Book> bookList23 = new java.util.ArrayList<model.Book>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList23, bookArray22);
        library11.setBooks(bookList23);
        model.Book book30 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member33 = new model.Member((int) 'a', "");
        java.lang.String str34 = member33.getName();
        java.lang.String str35 = member33.toString();
        int int36 = member33.getId();
        java.time.LocalDate localDate37 = null;
        library11.lendBook(book30, member33, localDate37);
        java.util.ArrayList<model.Loan> loanList39 = library11.getLoans();
        model.Member member42 = new model.Member((int) 'a', "");
        java.lang.String str43 = member42.getName();
        java.lang.String str44 = member42.getName();
        library11.addMember(member42);
        model.Member member48 = new model.Member((int) 'a', "");
        java.lang.String str49 = member48.getName();
        library11.addMember(member48);
        int int51 = member48.getId();
        int int52 = member48.getId();
        library0.addMember(member48);
        model.Book book58 = new model.Book("", "hi!", 0, (int) 'a');
        boolean boolean59 = book58.isAvailable();
        java.lang.String str60 = book58.getAuthor();
        int int61 = book58.getValue();
        int int62 = book58.getCode();
        library0.addBook(book58);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(loanList39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        float float10 = loan4.getDailyFine();
        float float11 = loan4.getDailyFine();
        java.time.LocalDate localDate12 = loan4.getReturnDate();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) -1, (int) (short) 10, localDate2, (float) 52);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        int int10 = loan4.getMemberId();
        float float11 = loan4.getDailyFine();
        java.time.LocalDate localDate12 = null;
        loan4.extendLoan(localDate12);
        java.time.LocalDate localDate14 = null;
        loan4.extendLoan(localDate14);
        float float16 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + 100.0f + "'", float16 == 100.0f);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.setReturnDate(localDate10);
        int int12 = loan4.getMemberId();
        float float13 = loan4.getDailyFine();
        java.time.LocalDate localDate14 = null;
        loan4.extendLoan(localDate14);
        java.lang.Class<?> wildcardClass16 = loan4.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        float float6 = loan4.getDailyFine();
        int int7 = loan4.getMemberId();
        java.time.LocalDate localDate8 = loan4.getReturnDate();
        java.time.LocalDate localDate9 = null;
        loan4.setReturnDate(localDate9);
        java.time.LocalDate localDate11 = null;
        loan4.setReturnDate(localDate11);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        model.Book book8 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean9 = book8.isAvailable();
        library0.addBook(book8);
        java.util.ArrayList<model.Loan> loanList11 = library0.getLoans();
        library0.listAllMembers();
        control.Library library13 = new control.Library();
        model.Book book18 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray24 = new model.Book[] { book18, book23 };
        java.util.ArrayList<model.Book> bookList25 = new java.util.ArrayList<model.Book>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList25, bookArray24);
        library13.setBooks(bookList25);
        control.Library library28 = new control.Library();
        model.Book book33 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book38 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray39 = new model.Book[] { book33, book38 };
        java.util.ArrayList<model.Book> bookList40 = new java.util.ArrayList<model.Book>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList40, bookArray39);
        library28.setBooks(bookList40);
        model.Book book47 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member50 = new model.Member((int) 'a', "");
        java.lang.String str51 = member50.getName();
        java.lang.String str52 = member50.toString();
        int int53 = member50.getId();
        java.time.LocalDate localDate54 = null;
        library28.lendBook(book47, member50, localDate54);
        library13.addBook(book47);
        control.Library library57 = new control.Library();
        java.util.ArrayList<model.Loan> loanList58 = library57.getLoans();
        library13.setLoans(loanList58);
        control.Library library60 = new control.Library();
        model.Book book65 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book70 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray71 = new model.Book[] { book65, book70 };
        java.util.ArrayList<model.Book> bookList72 = new java.util.ArrayList<model.Book>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList72, bookArray71);
        library60.setBooks(bookList72);
        model.Book book79 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member82 = new model.Member((int) 'a', "");
        java.lang.String str83 = member82.getName();
        java.lang.String str84 = member82.toString();
        int int85 = member82.getId();
        java.time.LocalDate localDate86 = null;
        library60.lendBook(book79, member82, localDate86);
        int int88 = book79.getValue();
        library13.addBook(book79);
        int int90 = book79.getCode();
        int int91 = book79.getCode();
        int int92 = book79.getValue();
        int int93 = book79.getCode();
        boolean boolean94 = book79.isAvailable();
        boolean boolean95 = book79.isAvailable();
        library0.addBook(book79);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(loanList11);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 97 + "'", int53 == 97);
        org.junit.Assert.assertNotNull(loanList58);
        org.junit.Assert.assertNotNull(bookArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 97 + "'", int85 == 97);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 97 + "'", int88 == 97);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 97 + "'", int92 == 97);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        model.Book book4 = new model.Book("hi!", "hi!", (int) (short) -1, (int) (short) -1);
        int int5 = book4.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        control.Library library3 = new control.Library();
        model.Book book8 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book13 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray14 = new model.Book[] { book8, book13 };
        java.util.ArrayList<model.Book> bookList15 = new java.util.ArrayList<model.Book>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList15, bookArray14);
        library3.setBooks(bookList15);
        library3.listAllMembers();
        model.Book book23 = new model.Book("", "", (int) (byte) 1, 0);
        library3.addBook(book23);
        library0.addBook(book23);
        control.Library library26 = new control.Library();
        model.Book book31 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book36 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray37 = new model.Book[] { book31, book36 };
        java.util.ArrayList<model.Book> bookList38 = new java.util.ArrayList<model.Book>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList38, bookArray37);
        library26.setBooks(bookList38);
        control.Library library41 = new control.Library();
        model.Book book46 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book51 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray52 = new model.Book[] { book46, book51 };
        java.util.ArrayList<model.Book> bookList53 = new java.util.ArrayList<model.Book>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList53, bookArray52);
        library41.setBooks(bookList53);
        model.Book book60 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member63 = new model.Member((int) 'a', "");
        java.lang.String str64 = member63.getName();
        java.lang.String str65 = member63.toString();
        int int66 = member63.getId();
        java.time.LocalDate localDate67 = null;
        library41.lendBook(book60, member63, localDate67);
        library26.addBook(book60);
        control.Library library70 = new control.Library();
        java.util.ArrayList<model.Loan> loanList71 = library70.getLoans();
        library26.setLoans(loanList71);
        library0.setLoans(loanList71);
        model.Member member76 = new model.Member((int) 'a', "");
        java.lang.String str77 = member76.getName();
        java.lang.String str78 = member76.toString();
        java.time.LocalDate localDate79 = null;
        float float80 = library0.getMemberFine(member76, localDate79);
        java.lang.String str81 = member76.toString();
        java.lang.String str82 = member76.toString();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(bookArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(bookArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
        org.junit.Assert.assertNotNull(loanList71);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 0.0f + "'", float80 == 0.0f);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str5 = book4.getAuthor();
        java.lang.String str6 = book4.getTitle();
        java.lang.String str7 = book4.getTitle();
        int int8 = book4.getCode();
        int int9 = book4.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, (int) (short) 0, localDate2, (float) 100L);
        int int5 = loan4.getMemberId();
        float float6 = loan4.getDailyFine();
        float float7 = loan4.getDailyFine();
        java.time.LocalDate localDate8 = loan4.getReturnDate();
        java.time.LocalDate localDate9 = loan4.getReturnDate();
        int int10 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 100.0f + "'", float7 == 100.0f);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) ' ');
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        int int7 = loan4.getMemberId();
        java.time.LocalDate localDate8 = loan4.getReturnDate();
        float float9 = loan4.getDailyFine();
        float float10 = loan4.getDailyFine();
        float float11 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 32.0f + "'", float9 == 32.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 32.0f + "'", float10 == 32.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        control.Library library0 = new control.Library();
        model.Member member3 = new model.Member((int) (short) 10, "");
        model.Member member6 = new model.Member((int) 'a', "");
        java.lang.String str7 = member6.getName();
        model.Member member10 = new model.Member((int) 'a', "");
        java.lang.String str11 = member10.getName();
        java.lang.String str12 = member10.getName();
        model.Member member15 = new model.Member((int) 'a', "");
        java.lang.String str16 = member15.getName();
        java.lang.String str17 = member15.toString();
        int int18 = member15.getId();
        model.Member member21 = new model.Member((int) 'a', "");
        java.lang.String str22 = member21.getName();
        java.lang.String str23 = member21.getName();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        model.Member[] memberArray30 = new model.Member[] { member3, member6, member10, member15, member21, member26 };
        java.util.ArrayList<model.Member> memberList31 = new java.util.ArrayList<model.Member>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList31, memberArray30);
        library0.setMembers(memberList31);
        model.Book book38 = new model.Book("", "hi!", 0, (int) 'a');
        int int39 = book38.getValue();
        library0.addBook(book38);
        library0.listAllBooks();
        model.Book book46 = new model.Book("", "hi!", 1, (int) (short) 100);
        java.lang.String str47 = book46.getAuthor();
        boolean boolean48 = book46.isAvailable();
        java.lang.String str49 = book46.getTitle();
        library0.addBook(book46);
        int int51 = book46.getValue();
        book46.setAvailable(false);
        int int54 = book46.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(memberArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 100 + "'", int54 == 100);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.util.ArrayList<model.Loan> loanList28 = library0.getLoans();
        library0.listAllMembers();
        model.Member member32 = new model.Member(52, " by HI! by HI! BY HI!");
        java.time.LocalDate localDate33 = null;
        float float34 = library0.getMemberFine(member32, localDate33);
        java.util.ArrayList<model.Member> memberList35 = library0.getMembers();
        library0.listAllBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(loanList28);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertNotNull(memberList35);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        model.Member member6 = new model.Member((-1), "hi!");
        library1.addMember(member6);
        java.time.LocalDate localDate8 = null;
        float float9 = library0.getMemberFine(member6, localDate8);
        control.Library library10 = new control.Library();
        java.util.ArrayList<model.Loan> loanList11 = library10.getLoans();
        control.Library library12 = new control.Library();
        model.Book book17 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book22 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray23 = new model.Book[] { book17, book22 };
        java.util.ArrayList<model.Book> bookList24 = new java.util.ArrayList<model.Book>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList24, bookArray23);
        library12.setBooks(bookList24);
        model.Book book31 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member34 = new model.Member((int) 'a', "");
        java.lang.String str35 = member34.getName();
        java.lang.String str36 = member34.toString();
        int int37 = member34.getId();
        java.time.LocalDate localDate38 = null;
        library12.lendBook(book31, member34, localDate38);
        java.time.LocalDate localDate42 = null;
        model.Loan loan44 = new model.Loan(0, (int) (short) -1, localDate42, (float) (short) -1);
        float float45 = loan44.getDailyFine();
        int int46 = loan44.getBookCode();
        java.time.LocalDate localDate49 = null;
        model.Loan loan51 = new model.Loan(0, (int) (short) -1, localDate49, (float) (short) -1);
        float float52 = loan51.getDailyFine();
        model.Loan[] loanArray53 = new model.Loan[] { loan44, loan51 };
        java.util.ArrayList<model.Loan> loanList54 = new java.util.ArrayList<model.Loan>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList54, loanArray53);
        library12.setLoans(loanList54);
        control.Library library57 = new control.Library();
        java.util.ArrayList<model.Loan> loanList58 = library57.getLoans();
        java.util.ArrayList<model.Book> bookList59 = library57.getBooks();
        control.Library library60 = new control.Library();
        java.util.ArrayList<model.Loan> loanList61 = library60.getLoans();
        java.util.ArrayList<model.Book> bookList62 = library60.getBooks();
        library57.setBooks(bookList62);
        library12.setBooks(bookList62);
        library10.setBooks(bookList62);
        java.util.ArrayList<model.Loan> loanList66 = library10.getLoans();
        control.Library library67 = new control.Library();
        java.util.ArrayList<model.Loan> loanList68 = library67.getLoans();
        java.util.ArrayList<model.Loan> loanList69 = library67.getLoans();
        java.util.ArrayList<model.Member> memberList70 = library67.getMembers();
        library10.setMembers(memberList70);
        java.util.ArrayList<model.Book> bookList72 = library10.getBooks();
        library0.setBooks(bookList72);
        library0.listAllBooks();
        java.util.ArrayList<model.Book> bookList75 = library0.getBooks();
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(loanList11);
        org.junit.Assert.assertNotNull(bookArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 97 + "'", int37 == 97);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + (-1.0f) + "'", float52 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(loanList58);
        org.junit.Assert.assertNotNull(bookList59);
        org.junit.Assert.assertNotNull(loanList61);
        org.junit.Assert.assertNotNull(bookList62);
        org.junit.Assert.assertNotNull(loanList66);
        org.junit.Assert.assertNotNull(loanList68);
        org.junit.Assert.assertNotNull(loanList69);
        org.junit.Assert.assertNotNull(memberList70);
        org.junit.Assert.assertNotNull(bookList72);
        org.junit.Assert.assertNotNull(bookList75);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) -1, (int) (byte) 10, localDate2, (float) (short) 100);
        float float5 = loan4.getDailyFine();
        float float6 = loan4.getDailyFine();
        java.time.LocalDate localDate7 = null;
        loan4.extendLoan(localDate7);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        model.Member member4 = new model.Member((int) (short) 10, "");
        model.Member member7 = new model.Member((int) 'a', "");
        java.lang.String str8 = member7.getName();
        model.Member member11 = new model.Member((int) 'a', "");
        java.lang.String str12 = member11.getName();
        java.lang.String str13 = member11.getName();
        model.Member member16 = new model.Member((int) 'a', "");
        java.lang.String str17 = member16.getName();
        java.lang.String str18 = member16.toString();
        int int19 = member16.getId();
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.getName();
        model.Member member27 = new model.Member((int) 'a', "");
        java.lang.String str28 = member27.getName();
        java.lang.String str29 = member27.toString();
        int int30 = member27.getId();
        model.Member[] memberArray31 = new model.Member[] { member4, member7, member11, member16, member22, member27 };
        java.util.ArrayList<model.Member> memberList32 = new java.util.ArrayList<model.Member>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList32, memberArray31);
        library1.setMembers(memberList32);
        library0.setMembers(memberList32);
        control.Library library36 = new control.Library();
        control.Library library37 = new control.Library();
        model.Book book42 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book47 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray48 = new model.Book[] { book42, book47 };
        java.util.ArrayList<model.Book> bookList49 = new java.util.ArrayList<model.Book>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList49, bookArray48);
        library37.setBooks(bookList49);
        control.Library library52 = new control.Library();
        model.Book book57 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book62 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray63 = new model.Book[] { book57, book62 };
        java.util.ArrayList<model.Book> bookList64 = new java.util.ArrayList<model.Book>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList64, bookArray63);
        library52.setBooks(bookList64);
        model.Book book71 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member74 = new model.Member((int) 'a', "");
        java.lang.String str75 = member74.getName();
        java.lang.String str76 = member74.toString();
        int int77 = member74.getId();
        java.time.LocalDate localDate78 = null;
        library52.lendBook(book71, member74, localDate78);
        library37.addBook(book71);
        control.Library library81 = new control.Library();
        java.util.ArrayList<model.Loan> loanList82 = library81.getLoans();
        library37.setLoans(loanList82);
        java.util.ArrayList<model.Loan> loanList84 = library37.getLoans();
        library36.setLoans(loanList84);
        library0.setLoans(loanList84);
        java.util.ArrayList<model.Loan> loanList87 = library0.getLoans();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertNotNull(memberArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(bookArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(bookArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertNotNull(loanList82);
        org.junit.Assert.assertNotNull(loanList84);
        org.junit.Assert.assertNotNull(loanList87);
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) -1, (-1), localDate2, (float) (byte) 0);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        control.Library library5 = new control.Library();
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book15 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray16 = new model.Book[] { book10, book15 };
        java.util.ArrayList<model.Book> bookList17 = new java.util.ArrayList<model.Book>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList17, bookArray16);
        library5.setBooks(bookList17);
        model.Book book24 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member27 = new model.Member((int) 'a', "");
        java.lang.String str28 = member27.getName();
        java.lang.String str29 = member27.toString();
        int int30 = member27.getId();
        java.time.LocalDate localDate31 = null;
        library5.lendBook(book24, member27, localDate31);
        java.time.LocalDate localDate35 = null;
        model.Loan loan37 = new model.Loan(0, (int) (short) -1, localDate35, (float) (short) -1);
        float float38 = loan37.getDailyFine();
        int int39 = loan37.getBookCode();
        java.time.LocalDate localDate42 = null;
        model.Loan loan44 = new model.Loan(0, (int) (short) -1, localDate42, (float) (short) -1);
        float float45 = loan44.getDailyFine();
        model.Loan[] loanArray46 = new model.Loan[] { loan37, loan44 };
        java.util.ArrayList<model.Loan> loanList47 = new java.util.ArrayList<model.Loan>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList47, loanArray46);
        library5.setLoans(loanList47);
        control.Library library50 = new control.Library();
        java.util.ArrayList<model.Loan> loanList51 = library50.getLoans();
        java.util.ArrayList<model.Book> bookList52 = library50.getBooks();
        control.Library library53 = new control.Library();
        java.util.ArrayList<model.Loan> loanList54 = library53.getLoans();
        java.util.ArrayList<model.Book> bookList55 = library53.getBooks();
        library50.setBooks(bookList55);
        library5.setBooks(bookList55);
        library3.setBooks(bookList55);
        java.util.ArrayList<model.Loan> loanList59 = library3.getLoans();
        control.Library library60 = new control.Library();
        java.util.ArrayList<model.Loan> loanList61 = library60.getLoans();
        java.util.ArrayList<model.Loan> loanList62 = library60.getLoans();
        java.util.ArrayList<model.Member> memberList63 = library60.getMembers();
        library3.setMembers(memberList63);
        model.Member member67 = new model.Member((int) (short) 10, "");
        java.lang.String str68 = member67.toString();
        java.lang.String str69 = member67.toString();
        java.time.LocalDate localDate70 = null;
        float float71 = library3.getMemberFine(member67, localDate70);
        int int72 = member67.getId();
        java.lang.String str73 = member67.getName();
        library0.addMember(member67);
        java.util.ArrayList<model.Loan> loanList75 = library0.getLoans();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + (-1.0f) + "'", float38 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + (-1.0f) + "'", float45 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(loanList51);
        org.junit.Assert.assertNotNull(bookList52);
        org.junit.Assert.assertNotNull(loanList54);
        org.junit.Assert.assertNotNull(bookList55);
        org.junit.Assert.assertNotNull(loanList59);
        org.junit.Assert.assertNotNull(loanList61);
        org.junit.Assert.assertNotNull(loanList62);
        org.junit.Assert.assertNotNull(memberList63);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + float71 + "' != '" + 0.0f + "'", float71 == 0.0f);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 10 + "'", int72 == 10);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(loanList75);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        model.Book book4 = new model.Book("hi! by HI!", "hi!", (int) (byte) 100, (int) (byte) 0);
        java.lang.String str5 = book4.getTitle();
        java.lang.String str6 = book4.getAuthor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! by HI!" + "'", str5, "hi! by HI!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        model.Member member6 = new model.Member((-1), "hi!");
        library1.addMember(member6);
        java.time.LocalDate localDate8 = null;
        float float9 = library0.getMemberFine(member6, localDate8);
        java.util.ArrayList<model.Book> bookList10 = library0.getBooks();
        control.Library library11 = new control.Library();
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray22 = new model.Book[] { book16, book21 };
        java.util.ArrayList<model.Book> bookList23 = new java.util.ArrayList<model.Book>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList23, bookArray22);
        library11.setBooks(bookList23);
        model.Book book30 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member33 = new model.Member((int) 'a', "");
        java.lang.String str34 = member33.getName();
        java.lang.String str35 = member33.toString();
        int int36 = member33.getId();
        java.time.LocalDate localDate37 = null;
        library11.lendBook(book30, member33, localDate37);
        java.util.ArrayList<model.Loan> loanList39 = library11.getLoans();
        model.Member member42 = new model.Member((int) 'a', "");
        java.lang.String str43 = member42.getName();
        java.lang.String str44 = member42.getName();
        library11.addMember(member42);
        model.Member member48 = new model.Member((int) 'a', "");
        java.lang.String str49 = member48.getName();
        library11.addMember(member48);
        int int51 = member48.getId();
        int int52 = member48.getId();
        library0.addMember(member48);
        model.Book book58 = new model.Book("", "hi!", 0, (int) 'a');
        library0.addBook(book58);
        control.Library library60 = new control.Library();
        model.Book book65 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book70 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray71 = new model.Book[] { book65, book70 };
        java.util.ArrayList<model.Book> bookList72 = new java.util.ArrayList<model.Book>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList72, bookArray71);
        library60.setBooks(bookList72);
        library60.listAllMembers();
        model.Book book80 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str81 = book80.getAuthor();
        java.lang.String str82 = book80.getTitle();
        int int83 = book80.getCode();
        model.Member member86 = new model.Member((int) 'a', "");
        java.lang.String str87 = member86.getName();
        java.lang.String str88 = member86.getName();
        int int89 = member86.getId();
        java.time.LocalDate localDate90 = null;
        library60.lendBook(book80, member86, localDate90);
        java.util.ArrayList<model.Loan> loanList92 = library60.getLoans();
        library0.setLoans(loanList92);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(loanList39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertNotNull(bookArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 97 + "'", int89 == 97);
        org.junit.Assert.assertNotNull(loanList92);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        model.Book book8 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean9 = book8.isAvailable();
        library0.addBook(book8);
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList12 = library0.getMembers();
        java.util.ArrayList<model.Member> memberList13 = library0.getMembers();
        java.util.ArrayList<model.Book> bookList14 = library0.getBooks();
        model.Book book19 = new model.Book("hi! by HI!", "hi!", (int) (byte) 100, (int) (byte) 0);
        java.lang.String str20 = book19.getTitle();
        book19.setAvailable(false);
        library0.addBook(book19);
        book19.setAvailable(false);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(memberList12);
        org.junit.Assert.assertNotNull(memberList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! by HI!" + "'", str20, "hi! by HI!");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 0, (int) 'a', localDate2, (float) 0);
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        java.time.LocalDate localDate7 = null;
        loan4.setReturnDate(localDate7);
        java.time.LocalDate localDate9 = null;
        loan4.extendLoan(localDate9);
        java.time.LocalDate localDate11 = loan4.getReturnDate();
        java.time.LocalDate localDate12 = null;
        loan4.setReturnDate(localDate12);
        java.time.LocalDate localDate14 = loan4.getReturnDate();
        org.junit.Assert.assertNull(localDate11);
        org.junit.Assert.assertNull(localDate14);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        model.Member member6 = new model.Member((-1), "hi!");
        library1.addMember(member6);
        java.time.LocalDate localDate8 = null;
        float float9 = library0.getMemberFine(member6, localDate8);
        java.util.ArrayList<model.Book> bookList10 = library0.getBooks();
        control.Library library11 = new control.Library();
        java.util.ArrayList<model.Loan> loanList12 = library11.getLoans();
        java.util.ArrayList<model.Book> bookList13 = library11.getBooks();
        java.util.ArrayList<model.Book> bookList14 = library11.getBooks();
        java.util.ArrayList<model.Loan> loanList15 = library11.getLoans();
        control.Library library16 = new control.Library();
        java.util.ArrayList<model.Loan> loanList17 = library16.getLoans();
        control.Library library18 = new control.Library();
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book28 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray29 = new model.Book[] { book23, book28 };
        java.util.ArrayList<model.Book> bookList30 = new java.util.ArrayList<model.Book>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList30, bookArray29);
        library18.setBooks(bookList30);
        model.Book book37 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member40 = new model.Member((int) 'a', "");
        java.lang.String str41 = member40.getName();
        java.lang.String str42 = member40.toString();
        int int43 = member40.getId();
        java.time.LocalDate localDate44 = null;
        library18.lendBook(book37, member40, localDate44);
        java.time.LocalDate localDate48 = null;
        model.Loan loan50 = new model.Loan(0, (int) (short) -1, localDate48, (float) (short) -1);
        float float51 = loan50.getDailyFine();
        int int52 = loan50.getBookCode();
        java.time.LocalDate localDate55 = null;
        model.Loan loan57 = new model.Loan(0, (int) (short) -1, localDate55, (float) (short) -1);
        float float58 = loan57.getDailyFine();
        model.Loan[] loanArray59 = new model.Loan[] { loan50, loan57 };
        java.util.ArrayList<model.Loan> loanList60 = new java.util.ArrayList<model.Loan>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList60, loanArray59);
        library18.setLoans(loanList60);
        control.Library library63 = new control.Library();
        java.util.ArrayList<model.Loan> loanList64 = library63.getLoans();
        java.util.ArrayList<model.Book> bookList65 = library63.getBooks();
        control.Library library66 = new control.Library();
        java.util.ArrayList<model.Loan> loanList67 = library66.getLoans();
        java.util.ArrayList<model.Book> bookList68 = library66.getBooks();
        library63.setBooks(bookList68);
        library18.setBooks(bookList68);
        library16.setBooks(bookList68);
        java.util.ArrayList<model.Loan> loanList72 = library16.getLoans();
        control.Library library73 = new control.Library();
        java.util.ArrayList<model.Loan> loanList74 = library73.getLoans();
        java.util.ArrayList<model.Loan> loanList75 = library73.getLoans();
        java.util.ArrayList<model.Member> memberList76 = library73.getMembers();
        library16.setMembers(memberList76);
        library16.listAllBooks();
        java.util.ArrayList<model.Loan> loanList79 = library16.getLoans();
        library11.setLoans(loanList79);
        library0.setLoans(loanList79);
        java.util.ArrayList<model.Book> bookList82 = library0.getBooks();
        model.Loan loan83 = null;
        java.time.LocalDate localDate84 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double85 = library0.getFineDiscount(loan83, localDate84);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(loanList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertNotNull(bookList14);
        org.junit.Assert.assertNotNull(loanList15);
        org.junit.Assert.assertNotNull(loanList17);
        org.junit.Assert.assertNotNull(bookArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.0f) + "'", float51 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + (-1.0f) + "'", float58 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(loanList64);
        org.junit.Assert.assertNotNull(bookList65);
        org.junit.Assert.assertNotNull(loanList67);
        org.junit.Assert.assertNotNull(bookList68);
        org.junit.Assert.assertNotNull(loanList72);
        org.junit.Assert.assertNotNull(loanList74);
        org.junit.Assert.assertNotNull(loanList75);
        org.junit.Assert.assertNotNull(memberList76);
        org.junit.Assert.assertNotNull(loanList79);
        org.junit.Assert.assertNotNull(bookList82);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        model.Book book4 = new model.Book("hi! by HI!", " by  by ", 10, 35);
        java.lang.String str5 = book4.getAuthor();
        java.lang.String str6 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " by  by " + "'", str5, " by  by ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi! by HI! by  BY  BY " + "'", str6, "hi! by HI! by  BY  BY ");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        java.util.ArrayList<model.Loan> loanList4 = null;
        library0.setLoans(loanList4);
        control.Library library6 = new control.Library();
        model.Book book11 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray17 = new model.Book[] { book11, book16 };
        java.util.ArrayList<model.Book> bookList18 = new java.util.ArrayList<model.Book>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList18, bookArray17);
        library6.setBooks(bookList18);
        model.Book book25 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member28 = new model.Member((int) 'a', "");
        java.lang.String str29 = member28.getName();
        java.lang.String str30 = member28.toString();
        int int31 = member28.getId();
        java.time.LocalDate localDate32 = null;
        library6.lendBook(book25, member28, localDate32);
        model.Book book38 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str39 = book38.toString();
        model.Member member42 = new model.Member((int) 'a', "");
        java.lang.String str43 = member42.getName();
        java.lang.String str44 = member42.getName();
        java.time.LocalDate localDate45 = null;
        library6.lendBook(book38, member42, localDate45);
        model.Book book51 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str52 = book51.getAuthor();
        model.Member member55 = new model.Member((int) (short) 10, "");
        java.lang.String str56 = member55.toString();
        int int57 = member55.getId();
        java.time.LocalDate localDate58 = null;
        library6.lendBook(book51, member55, localDate58);
        book51.setAvailable(true);
        book51.setAvailable(true);
        library0.addBook(book51);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 97 + "'", int31 == 97);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + " by HI!" + "'", str39, " by HI!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 10 + "'", int57 == 10);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        library0.listAllMembers();
        model.Book book20 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str21 = book20.getAuthor();
        java.lang.String str22 = book20.getTitle();
        int int23 = book20.getCode();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.getName();
        int int29 = member26.getId();
        java.time.LocalDate localDate30 = null;
        library0.lendBook(book20, member26, localDate30);
        int int32 = book20.getValue();
        int int33 = book20.getValue();
        java.lang.String str34 = book20.toString();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " by HI!" + "'", str34, " by HI!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.setReturnDate(localDate10);
        int int12 = loan4.getMemberId();
        float float13 = loan4.getDailyFine();
        int int14 = loan4.getMemberId();
        java.time.LocalDate localDate15 = null;
        loan4.extendLoan(localDate15);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        java.time.LocalDate localDate12 = loan4.getReturnDate();
        int int13 = loan4.getMemberId();
        java.time.LocalDate localDate14 = null;
        loan4.setReturnDate(localDate14);
        float float16 = loan4.getDailyFine();
        java.time.LocalDate localDate17 = loan4.getReturnDate();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + float16 + "' != '" + (-1.0f) + "'", float16 == (-1.0f));
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        int int7 = loan4.getBookCode();
        float float8 = loan4.getDailyFine();
        java.time.LocalDate localDate9 = loan4.getReturnDate();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        java.time.LocalDate localDate12 = null;
        loan4.extendLoan(localDate12);
        java.time.LocalDate localDate14 = null;
        loan4.setReturnDate(localDate14);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.time.LocalDate localDate30 = null;
        model.Loan loan32 = new model.Loan(0, (int) (short) -1, localDate30, (float) (short) -1);
        float float33 = loan32.getDailyFine();
        int int34 = loan32.getBookCode();
        java.time.LocalDate localDate37 = null;
        model.Loan loan39 = new model.Loan(0, (int) (short) -1, localDate37, (float) (short) -1);
        float float40 = loan39.getDailyFine();
        model.Loan[] loanArray41 = new model.Loan[] { loan32, loan39 };
        java.util.ArrayList<model.Loan> loanList42 = new java.util.ArrayList<model.Loan>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList42, loanArray41);
        library0.setLoans(loanList42);
        control.Library library45 = new control.Library();
        java.util.ArrayList<model.Loan> loanList46 = library45.getLoans();
        java.util.ArrayList<model.Book> bookList47 = library45.getBooks();
        control.Library library48 = new control.Library();
        java.util.ArrayList<model.Loan> loanList49 = library48.getLoans();
        java.util.ArrayList<model.Book> bookList50 = library48.getBooks();
        library45.setBooks(bookList50);
        library0.setBooks(bookList50);
        java.util.ArrayList<model.Member> memberList53 = library0.getMembers();
        control.Library library54 = new control.Library();
        java.util.ArrayList<model.Loan> loanList55 = library54.getLoans();
        java.util.ArrayList<model.Loan> loanList56 = library54.getLoans();
        control.Library library57 = new control.Library();
        model.Member member60 = new model.Member((int) (short) 10, "");
        model.Member member63 = new model.Member((int) 'a', "");
        java.lang.String str64 = member63.getName();
        model.Member member67 = new model.Member((int) 'a', "");
        java.lang.String str68 = member67.getName();
        java.lang.String str69 = member67.getName();
        model.Member member72 = new model.Member((int) 'a', "");
        java.lang.String str73 = member72.getName();
        java.lang.String str74 = member72.toString();
        int int75 = member72.getId();
        model.Member member78 = new model.Member((int) 'a', "");
        java.lang.String str79 = member78.getName();
        java.lang.String str80 = member78.getName();
        model.Member member83 = new model.Member((int) 'a', "");
        java.lang.String str84 = member83.getName();
        java.lang.String str85 = member83.toString();
        int int86 = member83.getId();
        model.Member[] memberArray87 = new model.Member[] { member60, member63, member67, member72, member78, member83 };
        java.util.ArrayList<model.Member> memberList88 = new java.util.ArrayList<model.Member>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList88, memberArray87);
        library57.setMembers(memberList88);
        library54.setMembers(memberList88);
        library54.listAllMembers();
        model.Book book93 = null;
        library54.addBook(book93);
        java.util.ArrayList<model.Loan> loanList95 = library54.getLoans();
        library0.setLoans(loanList95);
        library0.listAllBooks();
        java.util.ArrayList<model.Book> bookList98 = library0.getBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(loanList46);
        org.junit.Assert.assertNotNull(bookList47);
        org.junit.Assert.assertNotNull(loanList49);
        org.junit.Assert.assertNotNull(bookList50);
        org.junit.Assert.assertNotNull(memberList53);
        org.junit.Assert.assertNotNull(loanList55);
        org.junit.Assert.assertNotNull(loanList56);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 97 + "'", int86 == 97);
        org.junit.Assert.assertNotNull(memberArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(loanList95);
        org.junit.Assert.assertNotNull(bookList98);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        library0.setBooks(bookList5);
        model.Member member9 = new model.Member((int) (short) 100, "");
        library0.addMember(member9);
        control.Library library11 = new control.Library();
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray22 = new model.Book[] { book16, book21 };
        java.util.ArrayList<model.Book> bookList23 = new java.util.ArrayList<model.Book>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList23, bookArray22);
        library11.setBooks(bookList23);
        model.Book book30 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member33 = new model.Member((int) 'a', "");
        java.lang.String str34 = member33.getName();
        java.lang.String str35 = member33.toString();
        int int36 = member33.getId();
        java.time.LocalDate localDate37 = null;
        library11.lendBook(book30, member33, localDate37);
        model.Book book43 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str44 = book43.toString();
        model.Member member47 = new model.Member((int) 'a', "");
        java.lang.String str48 = member47.getName();
        java.lang.String str49 = member47.getName();
        java.time.LocalDate localDate50 = null;
        library11.lendBook(book43, member47, localDate50);
        java.lang.String str52 = book43.toString();
        library0.addBook(book43);
        library0.listAllMembers();
        model.Book book59 = new model.Book("", "hi!", (int) 'a', 0);
        book59.setAvailable(true);
        int int62 = book59.getValue();
        java.lang.String str63 = book59.getAuthor();
        int int64 = book59.getCode();
        java.lang.String str65 = book59.getAuthor();
        model.Member member68 = new model.Member((int) (byte) -1, " by HI!");
        java.lang.String str69 = member68.getName();
        java.time.LocalDate localDate70 = null;
        library0.lendBook(book59, member68, localDate70);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " by HI!" + "'", str44, " by HI!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " by HI!" + "'", str52, " by HI!");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + " by HI!" + "'", str69, " by HI!");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        control.Library library15 = new control.Library();
        model.Book book20 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book25 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray26 = new model.Book[] { book20, book25 };
        java.util.ArrayList<model.Book> bookList27 = new java.util.ArrayList<model.Book>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList27, bookArray26);
        library15.setBooks(bookList27);
        model.Book book34 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member37 = new model.Member((int) 'a', "");
        java.lang.String str38 = member37.getName();
        java.lang.String str39 = member37.toString();
        int int40 = member37.getId();
        java.time.LocalDate localDate41 = null;
        library15.lendBook(book34, member37, localDate41);
        library0.addBook(book34);
        control.Library library44 = new control.Library();
        java.util.ArrayList<model.Loan> loanList45 = library44.getLoans();
        library0.setLoans(loanList45);
        control.Library library47 = new control.Library();
        model.Book book52 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book57 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray58 = new model.Book[] { book52, book57 };
        java.util.ArrayList<model.Book> bookList59 = new java.util.ArrayList<model.Book>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList59, bookArray58);
        library47.setBooks(bookList59);
        model.Book book66 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member69 = new model.Member((int) 'a', "");
        java.lang.String str70 = member69.getName();
        java.lang.String str71 = member69.toString();
        int int72 = member69.getId();
        java.time.LocalDate localDate73 = null;
        library47.lendBook(book66, member69, localDate73);
        int int75 = book66.getValue();
        library0.addBook(book66);
        int int77 = book66.getCode();
        java.lang.String str78 = book66.toString();
        java.lang.String str79 = book66.getAuthor();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertNotNull(bookArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + " by HI!" + "'", str78, " by HI!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        model.Book book4 = new model.Book("", "", (int) (short) 0, (int) (byte) 1);
        boolean boolean5 = book4.isAvailable();
        boolean boolean6 = book4.isAvailable();
        java.lang.String str7 = book4.getAuthor();
        java.lang.String str8 = book4.getTitle();
        java.lang.String str9 = book4.toString();
        int int10 = book4.getCode();
        int int11 = book4.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " by " + "'", str9, " by ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        control.Library library3 = new control.Library();
        model.Member member6 = new model.Member((int) (short) 10, "");
        model.Member member9 = new model.Member((int) 'a', "");
        java.lang.String str10 = member9.getName();
        model.Member member13 = new model.Member((int) 'a', "");
        java.lang.String str14 = member13.getName();
        java.lang.String str15 = member13.getName();
        model.Member member18 = new model.Member((int) 'a', "");
        java.lang.String str19 = member18.getName();
        java.lang.String str20 = member18.toString();
        int int21 = member18.getId();
        model.Member member24 = new model.Member((int) 'a', "");
        java.lang.String str25 = member24.getName();
        java.lang.String str26 = member24.getName();
        model.Member member29 = new model.Member((int) 'a', "");
        java.lang.String str30 = member29.getName();
        java.lang.String str31 = member29.toString();
        int int32 = member29.getId();
        model.Member[] memberArray33 = new model.Member[] { member6, member9, member13, member18, member24, member29 };
        java.util.ArrayList<model.Member> memberList34 = new java.util.ArrayList<model.Member>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList34, memberArray33);
        library3.setMembers(memberList34);
        library0.setMembers(memberList34);
        control.Library library38 = new control.Library();
        model.Book book43 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book48 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray49 = new model.Book[] { book43, book48 };
        java.util.ArrayList<model.Book> bookList50 = new java.util.ArrayList<model.Book>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList50, bookArray49);
        library38.setBooks(bookList50);
        model.Book book57 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member60 = new model.Member((int) 'a', "");
        java.lang.String str61 = member60.getName();
        java.lang.String str62 = member60.toString();
        int int63 = member60.getId();
        java.time.LocalDate localDate64 = null;
        library38.lendBook(book57, member60, localDate64);
        java.util.ArrayList<model.Loan> loanList66 = library38.getLoans();
        model.Member member69 = new model.Member((int) 'a', "");
        java.lang.String str70 = member69.getName();
        java.lang.String str71 = member69.getName();
        library38.addMember(member69);
        model.Book book77 = new model.Book("", "", (int) (short) 0, (int) (byte) 1);
        library38.addBook(book77);
        java.lang.String str79 = book77.getAuthor();
        model.Member member82 = new model.Member((int) (short) 10, "");
        java.time.LocalDate localDate83 = null;
        library0.lendBook(book77, member82, localDate83);
        java.lang.String str85 = book77.getTitle();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(memberArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(bookArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(loanList66);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.time.LocalDate localDate30 = null;
        model.Loan loan32 = new model.Loan(0, (int) (short) -1, localDate30, (float) (short) -1);
        float float33 = loan32.getDailyFine();
        int int34 = loan32.getBookCode();
        java.time.LocalDate localDate37 = null;
        model.Loan loan39 = new model.Loan(0, (int) (short) -1, localDate37, (float) (short) -1);
        float float40 = loan39.getDailyFine();
        model.Loan[] loanArray41 = new model.Loan[] { loan32, loan39 };
        java.util.ArrayList<model.Loan> loanList42 = new java.util.ArrayList<model.Loan>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList42, loanArray41);
        library0.setLoans(loanList42);
        model.Member member47 = new model.Member((int) 'a', "");
        java.lang.String str48 = member47.getName();
        java.lang.String str49 = member47.toString();
        int int50 = member47.getId();
        int int51 = member47.getId();
        library0.addMember(member47);
        model.Book book57 = new model.Book(" by HI! by HI! BY HI!", " by HI! by HI! BY HI!", 52, 0);
        model.Member member60 = new model.Member((int) (short) 1, "");
        int int61 = member60.getId();
        java.time.LocalDate localDate62 = null;
        library0.lendBook(book57, member60, localDate62);
        java.util.ArrayList<model.Member> memberList64 = library0.getMembers();
        control.Library library65 = new control.Library();
        model.Book book70 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book75 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray76 = new model.Book[] { book70, book75 };
        java.util.ArrayList<model.Book> bookList77 = new java.util.ArrayList<model.Book>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList77, bookArray76);
        library65.setBooks(bookList77);
        model.Book book84 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member87 = new model.Member((int) 'a', "");
        java.lang.String str88 = member87.getName();
        java.lang.String str89 = member87.toString();
        int int90 = member87.getId();
        java.time.LocalDate localDate91 = null;
        library65.lendBook(book84, member87, localDate91);
        java.time.LocalDate localDate93 = null;
        float float94 = library0.getMemberFine(member87, localDate93);
        int int95 = member87.getId();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(memberList64);
        org.junit.Assert.assertNotNull(bookArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 97 + "'", int90 == 97);
        org.junit.Assert.assertTrue("'" + float94 + "' != '" + 0.0f + "'", float94 == 0.0f);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 97 + "'", int95 == 97);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        model.Book book32 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str33 = book32.toString();
        model.Member member36 = new model.Member((int) 'a', "");
        java.lang.String str37 = member36.getName();
        java.lang.String str38 = member36.getName();
        java.time.LocalDate localDate39 = null;
        library0.lendBook(book32, member36, localDate39);
        int int41 = book32.getCode();
        boolean boolean42 = book32.isAvailable();
        int int43 = book32.getValue();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " by HI!" + "'", str33, " by HI!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 97 + "'", int43 == 97);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        float float6 = loan4.getDailyFine();
        java.time.LocalDate localDate7 = loan4.getReturnDate();
        int int8 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        control.Library library4 = new control.Library();
        model.Book book9 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book14 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray15 = new model.Book[] { book9, book14 };
        java.util.ArrayList<model.Book> bookList16 = new java.util.ArrayList<model.Book>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList16, bookArray15);
        library4.setBooks(bookList16);
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        java.time.LocalDate localDate30 = null;
        library4.lendBook(book23, member26, localDate30);
        model.Book book36 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str37 = book36.toString();
        model.Member member40 = new model.Member((int) 'a', "");
        java.lang.String str41 = member40.getName();
        java.lang.String str42 = member40.getName();
        java.time.LocalDate localDate43 = null;
        library4.lendBook(book36, member40, localDate43);
        library0.addBook(book36);
        library0.listAllMembers();
        library0.listAllBooks();
        java.util.ArrayList<model.Book> bookList48 = null;
        library0.setBooks(bookList48);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " by HI!" + "'", str37, " by HI!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        model.Book book8 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str9 = book8.getAuthor();
        library0.addBook(book8);
        int int11 = book8.getCode();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 0, localDate2, (float) ' ');
        int int5 = loan4.getBookCode();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        java.time.LocalDate localDate7 = null;
        loan4.setReturnDate(localDate7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        control.Library library15 = new control.Library();
        model.Book book20 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book25 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray26 = new model.Book[] { book20, book25 };
        java.util.ArrayList<model.Book> bookList27 = new java.util.ArrayList<model.Book>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList27, bookArray26);
        library15.setBooks(bookList27);
        model.Book book34 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member37 = new model.Member((int) 'a', "");
        java.lang.String str38 = member37.getName();
        java.lang.String str39 = member37.toString();
        int int40 = member37.getId();
        java.time.LocalDate localDate41 = null;
        library15.lendBook(book34, member37, localDate41);
        library0.addBook(book34);
        java.util.ArrayList<model.Book> bookList44 = library0.getBooks();
        model.Book book49 = new model.Book("", "", 0, (int) '#');
        library0.addBook(book49);
        library0.listAllMembers();
        java.time.LocalDate localDate54 = null;
        model.Loan loan56 = new model.Loan(0, (int) (short) -1, localDate54, (float) (short) -1);
        float float57 = loan56.getDailyFine();
        int int58 = loan56.getBookCode();
        float float59 = loan56.getDailyFine();
        float float60 = loan56.getDailyFine();
        int int61 = loan56.getMemberId();
        int int62 = loan56.getMemberId();
        java.time.LocalDate localDate63 = loan56.getReturnDate();
        float float64 = loan56.getDailyFine();
        int int65 = loan56.getMemberId();
        java.time.LocalDate localDate66 = null;
        loan56.extendLoan(localDate66);
        java.time.LocalDate localDate68 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double69 = library0.getFineDiscount(loan56, localDate68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(bookList44);
        org.junit.Assert.assertTrue("'" + float57 + "' != '" + (-1.0f) + "'", float57 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + (-1.0f) + "'", float59 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + (-1.0f) + "'", float60 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNull(localDate63);
        org.junit.Assert.assertTrue("'" + float64 + "' != '" + (-1.0f) + "'", float64 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        control.Library library2 = new control.Library();
        model.Book book7 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book12 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray13 = new model.Book[] { book7, book12 };
        java.util.ArrayList<model.Book> bookList14 = new java.util.ArrayList<model.Book>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList14, bookArray13);
        library2.setBooks(bookList14);
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member24 = new model.Member((int) 'a', "");
        java.lang.String str25 = member24.getName();
        java.lang.String str26 = member24.toString();
        int int27 = member24.getId();
        java.time.LocalDate localDate28 = null;
        library2.lendBook(book21, member24, localDate28);
        java.time.LocalDate localDate32 = null;
        model.Loan loan34 = new model.Loan(0, (int) (short) -1, localDate32, (float) (short) -1);
        float float35 = loan34.getDailyFine();
        int int36 = loan34.getBookCode();
        java.time.LocalDate localDate39 = null;
        model.Loan loan41 = new model.Loan(0, (int) (short) -1, localDate39, (float) (short) -1);
        float float42 = loan41.getDailyFine();
        model.Loan[] loanArray43 = new model.Loan[] { loan34, loan41 };
        java.util.ArrayList<model.Loan> loanList44 = new java.util.ArrayList<model.Loan>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList44, loanArray43);
        library2.setLoans(loanList44);
        control.Library library47 = new control.Library();
        java.util.ArrayList<model.Loan> loanList48 = library47.getLoans();
        java.util.ArrayList<model.Book> bookList49 = library47.getBooks();
        control.Library library50 = new control.Library();
        java.util.ArrayList<model.Loan> loanList51 = library50.getLoans();
        java.util.ArrayList<model.Book> bookList52 = library50.getBooks();
        library47.setBooks(bookList52);
        library2.setBooks(bookList52);
        library0.setBooks(bookList52);
        library0.listAllBooks();
        model.Book book61 = new model.Book("", "hi!", 0, (int) 'a');
        boolean boolean62 = book61.isAvailable();
        java.lang.String str63 = book61.getAuthor();
        java.lang.String str64 = book61.getTitle();
        library0.addBook(book61);
        library0.listAllMembers();
        java.util.ArrayList<model.Loan> loanList67 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList68 = library0.getMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(loanList48);
        org.junit.Assert.assertNotNull(bookList49);
        org.junit.Assert.assertNotNull(loanList51);
        org.junit.Assert.assertNotNull(bookList52);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(loanList67);
        org.junit.Assert.assertNotNull(memberList68);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        control.Library library0 = new control.Library();
        model.Member member3 = new model.Member((int) (short) 10, "");
        model.Member member6 = new model.Member((int) 'a', "");
        java.lang.String str7 = member6.getName();
        model.Member member10 = new model.Member((int) 'a', "");
        java.lang.String str11 = member10.getName();
        java.lang.String str12 = member10.getName();
        model.Member member15 = new model.Member((int) 'a', "");
        java.lang.String str16 = member15.getName();
        java.lang.String str17 = member15.toString();
        int int18 = member15.getId();
        model.Member member21 = new model.Member((int) 'a', "");
        java.lang.String str22 = member21.getName();
        java.lang.String str23 = member21.getName();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        model.Member[] memberArray30 = new model.Member[] { member3, member6, member10, member15, member21, member26 };
        java.util.ArrayList<model.Member> memberList31 = new java.util.ArrayList<model.Member>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList31, memberArray30);
        library0.setMembers(memberList31);
        model.Book book38 = new model.Book("", "hi!", 0, (int) 'a');
        int int39 = book38.getValue();
        library0.addBook(book38);
        control.Library library41 = new control.Library();
        java.util.ArrayList<model.Loan> loanList42 = library41.getLoans();
        java.util.ArrayList<model.Loan> loanList43 = library41.getLoans();
        java.util.ArrayList<model.Member> memberList44 = library41.getMembers();
        model.Book book49 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean50 = book49.isAvailable();
        library41.addBook(book49);
        library0.addBook(book49);
        library0.listAllBooks();
        model.Member member56 = new model.Member((int) ' ', "hi! by HI!");
        java.time.LocalDate localDate57 = null;
        float float58 = library0.getMemberFine(member56, localDate57);
        java.util.ArrayList<model.Loan> loanList59 = library0.getLoans();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(memberArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(loanList42);
        org.junit.Assert.assertNotNull(loanList43);
        org.junit.Assert.assertNotNull(memberList44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertNotNull(loanList59);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        library0.setBooks(bookList5);
        model.Member member9 = new model.Member((int) (short) 100, "");
        library0.addMember(member9);
        control.Library library11 = new control.Library();
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray22 = new model.Book[] { book16, book21 };
        java.util.ArrayList<model.Book> bookList23 = new java.util.ArrayList<model.Book>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList23, bookArray22);
        library11.setBooks(bookList23);
        model.Book book30 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member33 = new model.Member((int) 'a', "");
        java.lang.String str34 = member33.getName();
        java.lang.String str35 = member33.toString();
        int int36 = member33.getId();
        java.time.LocalDate localDate37 = null;
        library11.lendBook(book30, member33, localDate37);
        model.Book book43 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str44 = book43.toString();
        model.Member member47 = new model.Member((int) 'a', "");
        java.lang.String str48 = member47.getName();
        java.lang.String str49 = member47.getName();
        java.time.LocalDate localDate50 = null;
        library11.lendBook(book43, member47, localDate50);
        java.lang.String str52 = book43.toString();
        library0.addBook(book43);
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList55 = library0.getMembers();
        control.Library library56 = new control.Library();
        model.Book book61 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book66 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray67 = new model.Book[] { book61, book66 };
        java.util.ArrayList<model.Book> bookList68 = new java.util.ArrayList<model.Book>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList68, bookArray67);
        library56.setBooks(bookList68);
        model.Book book75 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member78 = new model.Member((int) 'a', "");
        java.lang.String str79 = member78.getName();
        java.lang.String str80 = member78.toString();
        int int81 = member78.getId();
        java.time.LocalDate localDate82 = null;
        library56.lendBook(book75, member78, localDate82);
        model.Member member86 = new model.Member((int) '#', "hi!");
        java.time.LocalDate localDate87 = null;
        float float88 = library56.getMemberFine(member86, localDate87);
        library0.addMember(member86);
        int int90 = member86.getId();
        int int91 = member86.getId();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + " by HI!" + "'", str44, " by HI!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + " by HI!" + "'", str52, " by HI!");
        org.junit.Assert.assertNotNull(memberList55);
        org.junit.Assert.assertNotNull(bookArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 97 + "'", int81 == 97);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 0.0f + "'", float88 == 0.0f);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 35 + "'", int90 == 35);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 35 + "'", int91 == 35);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        int int7 = loan4.getMemberId();
        java.time.LocalDate localDate8 = null;
        loan4.extendLoan(localDate8);
        int int10 = loan4.getMemberId();
        java.time.LocalDate localDate11 = null;
        loan4.extendLoan(localDate11);
        float float13 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.util.ArrayList<model.Member> memberList28 = library0.getMembers();
        control.Library library29 = new control.Library();
        model.Book book34 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book39 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray40 = new model.Book[] { book34, book39 };
        java.util.ArrayList<model.Book> bookList41 = new java.util.ArrayList<model.Book>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList41, bookArray40);
        library29.setBooks(bookList41);
        model.Book book48 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member51 = new model.Member((int) 'a', "");
        java.lang.String str52 = member51.getName();
        java.lang.String str53 = member51.toString();
        int int54 = member51.getId();
        java.time.LocalDate localDate55 = null;
        library29.lendBook(book48, member51, localDate55);
        model.Book book61 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str62 = book61.toString();
        model.Member member65 = new model.Member((int) 'a', "");
        java.lang.String str66 = member65.getName();
        java.lang.String str67 = member65.getName();
        java.time.LocalDate localDate68 = null;
        library29.lendBook(book61, member65, localDate68);
        control.Library library70 = new control.Library();
        java.util.ArrayList<model.Loan> loanList71 = library70.getLoans();
        java.util.ArrayList<model.Book> bookList72 = library70.getBooks();
        model.Member member75 = new model.Member((-1), "hi!");
        library70.addMember(member75);
        java.lang.String str77 = member75.getName();
        java.lang.String str78 = member75.toString();
        java.lang.String str79 = member75.toString();
        java.lang.String str80 = member75.toString();
        java.time.LocalDate localDate81 = null;
        // The following exception was thrown during execution in test generation
        try {
            library0.lendBook(book61, member75, localDate81);
            org.junit.Assert.fail("Expected exception of type exception.BookUnavailableException; message: The requested book is currently unavailable.");
        } catch (exception.BookUnavailableException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(memberList28);
        org.junit.Assert.assertNotNull(bookArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 97 + "'", int54 == 97);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + " by HI!" + "'", str62, " by HI!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(loanList71);
        org.junit.Assert.assertNotNull(bookList72);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        control.Library library0 = new control.Library();
        model.Member member3 = new model.Member((int) (short) 10, "");
        model.Member member6 = new model.Member((int) 'a', "");
        java.lang.String str7 = member6.getName();
        model.Member member10 = new model.Member((int) 'a', "");
        java.lang.String str11 = member10.getName();
        java.lang.String str12 = member10.getName();
        model.Member member15 = new model.Member((int) 'a', "");
        java.lang.String str16 = member15.getName();
        java.lang.String str17 = member15.toString();
        int int18 = member15.getId();
        model.Member member21 = new model.Member((int) 'a', "");
        java.lang.String str22 = member21.getName();
        java.lang.String str23 = member21.getName();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        model.Member[] memberArray30 = new model.Member[] { member3, member6, member10, member15, member21, member26 };
        java.util.ArrayList<model.Member> memberList31 = new java.util.ArrayList<model.Member>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList31, memberArray30);
        library0.setMembers(memberList31);
        java.time.LocalDate localDate36 = null;
        model.Loan loan38 = new model.Loan(0, (int) (short) -1, localDate36, (float) (short) -1);
        float float39 = loan38.getDailyFine();
        int int40 = loan38.getMemberId();
        java.time.LocalDate localDate43 = null;
        model.Loan loan45 = new model.Loan(0, (int) (short) -1, localDate43, (float) (short) -1);
        float float46 = loan45.getDailyFine();
        int int47 = loan45.getBookCode();
        float float48 = loan45.getDailyFine();
        java.time.LocalDate localDate51 = null;
        model.Loan loan53 = new model.Loan(0, (int) (short) -1, localDate51, (float) (short) -1);
        float float54 = loan53.getDailyFine();
        int int55 = loan53.getMemberId();
        model.Loan[] loanArray56 = new model.Loan[] { loan38, loan45, loan53 };
        java.util.ArrayList<model.Loan> loanList57 = new java.util.ArrayList<model.Loan>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList57, loanArray56);
        library0.setLoans(loanList57);
        java.util.ArrayList<model.Loan> loanList60 = library0.getLoans();
        control.Library library61 = new control.Library();
        control.Library library62 = new control.Library();
        java.util.ArrayList<model.Loan> loanList63 = library62.getLoans();
        java.util.ArrayList<model.Book> bookList64 = library62.getBooks();
        control.Library library65 = new control.Library();
        java.util.ArrayList<model.Loan> loanList66 = library65.getLoans();
        java.util.ArrayList<model.Book> bookList67 = library65.getBooks();
        library62.setBooks(bookList67);
        library61.setBooks(bookList67);
        library0.setBooks(bookList67);
        library0.listAllMembers();
        java.time.LocalDate localDate74 = null;
        model.Loan loan76 = new model.Loan((int) (short) 0, (int) (byte) 10, localDate74, (float) '#');
        java.time.LocalDate localDate77 = null;
        loan76.setReturnDate(localDate77);
        int int79 = loan76.getBookCode();
        java.time.LocalDate localDate80 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double81 = library0.getFineDiscount(loan76, localDate80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(memberArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + float39 + "' != '" + (-1.0f) + "'", float39 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + (-1.0f) + "'", float48 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + (-1.0f) + "'", float54 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(loanArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(loanList60);
        org.junit.Assert.assertNotNull(loanList63);
        org.junit.Assert.assertNotNull(bookList64);
        org.junit.Assert.assertNotNull(loanList66);
        org.junit.Assert.assertNotNull(bookList67);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        model.Book book32 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str33 = book32.toString();
        model.Member member36 = new model.Member((int) 'a', "");
        java.lang.String str37 = member36.getName();
        java.lang.String str38 = member36.getName();
        java.time.LocalDate localDate39 = null;
        library0.lendBook(book32, member36, localDate39);
        int int41 = book32.getCode();
        book32.setAvailable(false);
        boolean boolean44 = book32.isAvailable();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " by HI!" + "'", str33, " by HI!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        java.time.LocalDate localDate8 = null;
        loan4.extendLoan(localDate8);
        float float10 = loan4.getDailyFine();
        int int11 = loan4.getMemberId();
        java.time.LocalDate localDate12 = null;
        loan4.extendLoan(localDate12);
        java.time.LocalDate localDate14 = null;
        loan4.extendLoan(localDate14);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        model.Member member2 = new model.Member((int) 'a', "hi! by HI! BY HI!");
        java.lang.String str3 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! by HI! BY HI!" + "'", str3, "hi! by HI! BY HI!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Book> bookList1 = null;
        library0.setBooks(bookList1);
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Loan> loanList5 = library3.getLoans();
        control.Library library6 = new control.Library();
        model.Book book11 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray17 = new model.Book[] { book11, book16 };
        java.util.ArrayList<model.Book> bookList18 = new java.util.ArrayList<model.Book>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList18, bookArray17);
        library6.setBooks(bookList18);
        library6.listAllMembers();
        model.Book book26 = new model.Book("", "", (int) (byte) 1, 0);
        library6.addBook(book26);
        library3.addBook(book26);
        java.util.ArrayList<model.Book> bookList29 = library3.getBooks();
        library0.setBooks(bookList29);
        model.Book book35 = new model.Book("hi! by HI!", " by HI!", (int) (short) 1, 1);
        model.Member member38 = new model.Member((int) '#', "hi!");
        java.lang.String str39 = member38.toString();
        java.time.LocalDate localDate40 = null;
        library0.lendBook(book35, member38, localDate40);
        control.Library library42 = new control.Library();
        model.Book book47 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book52 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray53 = new model.Book[] { book47, book52 };
        java.util.ArrayList<model.Book> bookList54 = new java.util.ArrayList<model.Book>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList54, bookArray53);
        library42.setBooks(bookList54);
        model.Book book61 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member64 = new model.Member((int) 'a', "");
        java.lang.String str65 = member64.getName();
        java.lang.String str66 = member64.toString();
        int int67 = member64.getId();
        java.time.LocalDate localDate68 = null;
        library42.lendBook(book61, member64, localDate68);
        java.util.ArrayList<model.Loan> loanList70 = library42.getLoans();
        model.Member member73 = new model.Member((int) 'a', "");
        java.lang.String str74 = member73.getName();
        java.lang.String str75 = member73.getName();
        library42.addMember(member73);
        model.Member member79 = new model.Member((int) 'a', "");
        java.lang.String str80 = member79.getName();
        library42.addMember(member79);
        int int82 = member79.getId();
        int int83 = member79.getId();
        int int84 = member79.getId();
        java.lang.String str85 = member79.toString();
        java.lang.String str86 = member79.getName();
        java.lang.String str87 = member79.toString();
        java.time.LocalDate localDate88 = null;
        float float89 = library0.getMemberFine(member79, localDate88);
        model.Member member92 = new model.Member((int) (byte) -1, "hi! by HI!");
        library0.addMember(member92);
        java.util.ArrayList<model.Member> memberList94 = library0.getMembers();
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookList29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(bookArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertNotNull(loanList70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 97 + "'", int82 == 97);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 0.0f + "'", float89 == 0.0f);
        org.junit.Assert.assertNotNull(memberList94);
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        java.time.LocalDate localDate12 = null;
        loan4.setReturnDate(localDate12);
        java.time.LocalDate localDate14 = loan4.getReturnDate();
        int int15 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.util.ArrayList<model.Loan> loanList28 = library0.getLoans();
        model.Member member31 = new model.Member((int) 'a', "");
        java.lang.String str32 = member31.getName();
        java.lang.String str33 = member31.getName();
        library0.addMember(member31);
        model.Book book39 = new model.Book("", "", (int) (short) 0, (int) (byte) 1);
        library0.addBook(book39);
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList42 = library0.getMembers();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(loanList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(memberList42);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        library0.setBooks(bookList5);
        model.Member member9 = new model.Member((int) (short) 100, "");
        library0.addMember(member9);
        library0.listAllBooks();
        model.Member member14 = new model.Member(0, "hi!");
        java.lang.String str15 = member14.toString();
        library0.addMember(member14);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        float float9 = loan4.getDailyFine();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + (-1.0f) + "'", float9 == (-1.0f));
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        control.Library library4 = new control.Library();
        java.util.ArrayList<model.Loan> loanList5 = library4.getLoans();
        java.util.ArrayList<model.Book> bookList6 = library4.getBooks();
        library1.setBooks(bookList6);
        library0.setBooks(bookList6);
        model.Book book13 = new model.Book("", "", (int) (short) 0, (int) (byte) 1);
        boolean boolean14 = book13.isAvailable();
        book13.setAvailable(false);
        library0.addBook(book13);
        int int18 = book13.getCode();
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) '#', (int) (short) 0, localDate2, (float) 52);
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        control.Library library0 = new control.Library();
        model.Member member3 = new model.Member((int) (short) 10, "");
        model.Member member6 = new model.Member((int) 'a', "");
        java.lang.String str7 = member6.getName();
        model.Member member10 = new model.Member((int) 'a', "");
        java.lang.String str11 = member10.getName();
        java.lang.String str12 = member10.getName();
        model.Member member15 = new model.Member((int) 'a', "");
        java.lang.String str16 = member15.getName();
        java.lang.String str17 = member15.toString();
        int int18 = member15.getId();
        model.Member member21 = new model.Member((int) 'a', "");
        java.lang.String str22 = member21.getName();
        java.lang.String str23 = member21.getName();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        model.Member[] memberArray30 = new model.Member[] { member3, member6, member10, member15, member21, member26 };
        java.util.ArrayList<model.Member> memberList31 = new java.util.ArrayList<model.Member>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList31, memberArray30);
        library0.setMembers(memberList31);
        control.Library library34 = new control.Library();
        java.util.ArrayList<model.Loan> loanList35 = library34.getLoans();
        library0.setLoans(loanList35);
        control.Library library37 = new control.Library();
        model.Book book42 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book47 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray48 = new model.Book[] { book42, book47 };
        java.util.ArrayList<model.Book> bookList49 = new java.util.ArrayList<model.Book>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList49, bookArray48);
        library37.setBooks(bookList49);
        model.Book book56 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member59 = new model.Member((int) 'a', "");
        java.lang.String str60 = member59.getName();
        java.lang.String str61 = member59.toString();
        int int62 = member59.getId();
        java.time.LocalDate localDate63 = null;
        library37.lendBook(book56, member59, localDate63);
        library0.addBook(book56);
        int int66 = book56.getValue();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(memberArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(loanList35);
        org.junit.Assert.assertNotNull(bookArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 97 + "'", int66 == 97);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, 35, localDate2, (float) (byte) 1);
        float float5 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 1.0f + "'", float5 == 1.0f);
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        int int10 = loan4.getMemberId();
        int int11 = loan4.getMemberId();
        java.time.LocalDate localDate12 = loan4.getReturnDate();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertNull(localDate12);
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        control.Library library4 = new control.Library();
        model.Book book9 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book14 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray15 = new model.Book[] { book9, book14 };
        java.util.ArrayList<model.Book> bookList16 = new java.util.ArrayList<model.Book>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList16, bookArray15);
        library4.setBooks(bookList16);
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        java.time.LocalDate localDate30 = null;
        library4.lendBook(book23, member26, localDate30);
        model.Book book36 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str37 = book36.toString();
        model.Member member40 = new model.Member((int) 'a', "");
        java.lang.String str41 = member40.getName();
        java.lang.String str42 = member40.getName();
        java.time.LocalDate localDate43 = null;
        library4.lendBook(book36, member40, localDate43);
        library0.addBook(book36);
        control.Library library46 = new control.Library();
        model.Book book51 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book56 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray57 = new model.Book[] { book51, book56 };
        java.util.ArrayList<model.Book> bookList58 = new java.util.ArrayList<model.Book>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList58, bookArray57);
        library46.setBooks(bookList58);
        model.Book book65 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member68 = new model.Member((int) 'a', "");
        java.lang.String str69 = member68.getName();
        java.lang.String str70 = member68.toString();
        int int71 = member68.getId();
        java.time.LocalDate localDate72 = null;
        library46.lendBook(book65, member68, localDate72);
        java.time.LocalDate localDate74 = null;
        float float75 = library0.getMemberFine(member68, localDate74);
        model.Member member78 = new model.Member(100, "hi! by HI!");
        library0.addMember(member78);
        library0.listAllMembers();
        java.time.LocalDate localDate83 = null;
        model.Loan loan85 = new model.Loan((int) (byte) -1, 100, localDate83, (float) 10);
        int int86 = loan85.getMemberId();
        java.time.LocalDate localDate87 = null;
        loan85.setReturnDate(localDate87);
        java.time.LocalDate localDate89 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double90 = library0.getFineDiscount(loan85, localDate89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " by HI!" + "'", str37, " by HI!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(bookArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + (-1) + "'", int86 == (-1));
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        control.Library library15 = new control.Library();
        model.Book book20 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book25 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray26 = new model.Book[] { book20, book25 };
        java.util.ArrayList<model.Book> bookList27 = new java.util.ArrayList<model.Book>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList27, bookArray26);
        library15.setBooks(bookList27);
        model.Book book34 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member37 = new model.Member((int) 'a', "");
        java.lang.String str38 = member37.getName();
        java.lang.String str39 = member37.toString();
        int int40 = member37.getId();
        java.time.LocalDate localDate41 = null;
        library15.lendBook(book34, member37, localDate41);
        library0.addBook(book34);
        control.Library library44 = new control.Library();
        model.Book book49 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book54 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray55 = new model.Book[] { book49, book54 };
        java.util.ArrayList<model.Book> bookList56 = new java.util.ArrayList<model.Book>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList56, bookArray55);
        library44.setBooks(bookList56);
        control.Library library59 = new control.Library();
        model.Book book64 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book69 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray70 = new model.Book[] { book64, book69 };
        java.util.ArrayList<model.Book> bookList71 = new java.util.ArrayList<model.Book>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList71, bookArray70);
        library59.setBooks(bookList71);
        model.Book book78 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member81 = new model.Member((int) 'a', "");
        java.lang.String str82 = member81.getName();
        java.lang.String str83 = member81.toString();
        int int84 = member81.getId();
        java.time.LocalDate localDate85 = null;
        library59.lendBook(book78, member81, localDate85);
        library44.addBook(book78);
        control.Library library88 = new control.Library();
        java.util.ArrayList<model.Loan> loanList89 = library88.getLoans();
        library44.setLoans(loanList89);
        library0.setLoans(loanList89);
        java.util.ArrayList<model.Book> bookList92 = library0.getBooks();
        library0.listAllBooks();
        library0.listAllBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(bookArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(bookArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertNotNull(loanList89);
        org.junit.Assert.assertNotNull(bookList92);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        control.Library library15 = new control.Library();
        model.Book book20 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book25 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray26 = new model.Book[] { book20, book25 };
        java.util.ArrayList<model.Book> bookList27 = new java.util.ArrayList<model.Book>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList27, bookArray26);
        library15.setBooks(bookList27);
        control.Library library30 = new control.Library();
        model.Book book35 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book40 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray41 = new model.Book[] { book35, book40 };
        java.util.ArrayList<model.Book> bookList42 = new java.util.ArrayList<model.Book>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList42, bookArray41);
        library30.setBooks(bookList42);
        model.Book book49 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member52 = new model.Member((int) 'a', "");
        java.lang.String str53 = member52.getName();
        java.lang.String str54 = member52.toString();
        int int55 = member52.getId();
        java.time.LocalDate localDate56 = null;
        library30.lendBook(book49, member52, localDate56);
        library15.addBook(book49);
        java.util.ArrayList<model.Book> bookList59 = library15.getBooks();
        model.Book book64 = new model.Book("", "", 0, (int) '#');
        library15.addBook(book64);
        java.lang.String str66 = book64.toString();
        book64.setAvailable(false);
        java.lang.String str69 = book64.toString();
        java.lang.String str70 = book64.getTitle();
        model.Member member73 = new model.Member((int) 'a', "");
        java.lang.String str74 = member73.getName();
        java.lang.String str75 = member73.getName();
        java.lang.String str76 = member73.toString();
        int int77 = member73.getId();
        int int78 = member73.getId();
        int int79 = member73.getId();
        java.lang.String str80 = member73.getName();
        java.time.LocalDate localDate81 = null;
        // The following exception was thrown during execution in test generation
        try {
            library0.lendBook(book64, member73, localDate81);
            org.junit.Assert.fail("Expected exception of type exception.BookUnavailableException; message: The requested book is currently unavailable.");
        } catch (exception.BookUnavailableException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(bookArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(bookList59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + " by " + "'", str66, " by ");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + " by " + "'", str69, " by ");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 97 + "'", int77 == 97);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.util.ArrayList<model.Loan> loanList28 = library0.getLoans();
        model.Member member31 = new model.Member((int) 'a', "");
        java.lang.String str32 = member31.getName();
        java.lang.String str33 = member31.getName();
        library0.addMember(member31);
        model.Member member37 = new model.Member((int) 'a', "");
        java.lang.String str38 = member37.getName();
        library0.addMember(member37);
        model.Member member42 = new model.Member((int) 'a', "");
        java.lang.String str43 = member42.getName();
        java.lang.String str44 = member42.getName();
        java.lang.String str45 = member42.toString();
        int int46 = member42.getId();
        int int47 = member42.getId();
        java.lang.String str48 = member42.getName();
        java.lang.String str49 = member42.toString();
        java.lang.String str50 = member42.toString();
        library0.addMember(member42);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(loanList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 97 + "'", int46 == 97);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        model.Member member2 = new model.Member((int) ' ', " by HI!");
        java.lang.String str3 = member2.toString();
        java.lang.String str4 = member2.getName();
        int int5 = member2.getId();
        java.lang.String str6 = member2.toString();
        java.lang.String str7 = member2.getName();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " by HI!" + "'", str3, " by HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " by HI!" + "'", str4, " by HI!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " by HI!" + "'", str6, " by HI!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + " by HI!" + "'", str7, " by HI!");
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        java.time.LocalDate localDate8 = null;
        loan4.extendLoan(localDate8);
        int int10 = loan4.getMemberId();
        java.time.LocalDate localDate11 = null;
        loan4.extendLoan(localDate11);
        int int13 = loan4.getMemberId();
        java.lang.Class<?> wildcardClass14 = loan4.getClass();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        library0.listAllMembers();
        model.Book book20 = new model.Book("", "", (int) (short) 0, (int) (byte) 1);
        int int21 = book20.getCode();
        library0.addBook(book20);
        model.Member member25 = new model.Member(0, "");
        java.time.LocalDate localDate26 = null;
        float float27 = library0.getMemberFine(member25, localDate26);
        java.util.ArrayList<model.Member> memberList28 = library0.getMembers();
        control.Library library29 = new control.Library();
        model.Member member32 = new model.Member((int) (short) 10, "");
        model.Member member35 = new model.Member((int) 'a', "");
        java.lang.String str36 = member35.getName();
        model.Member member39 = new model.Member((int) 'a', "");
        java.lang.String str40 = member39.getName();
        java.lang.String str41 = member39.getName();
        model.Member member44 = new model.Member((int) 'a', "");
        java.lang.String str45 = member44.getName();
        java.lang.String str46 = member44.toString();
        int int47 = member44.getId();
        model.Member member50 = new model.Member((int) 'a', "");
        java.lang.String str51 = member50.getName();
        java.lang.String str52 = member50.getName();
        model.Member member55 = new model.Member((int) 'a', "");
        java.lang.String str56 = member55.getName();
        java.lang.String str57 = member55.toString();
        int int58 = member55.getId();
        model.Member[] memberArray59 = new model.Member[] { member32, member35, member39, member44, member50, member55 };
        java.util.ArrayList<model.Member> memberList60 = new java.util.ArrayList<model.Member>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList60, memberArray59);
        library29.setMembers(memberList60);
        java.util.ArrayList<model.Loan> loanList63 = library29.getLoans();
        library29.listAllMembers();
        java.util.ArrayList<model.Book> bookList65 = library29.getBooks();
        model.Book book70 = new model.Book("", "", 0, (int) '#');
        control.Library library71 = new control.Library();
        model.Book book76 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book81 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray82 = new model.Book[] { book76, book81 };
        java.util.ArrayList<model.Book> bookList83 = new java.util.ArrayList<model.Book>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList83, bookArray82);
        library71.setBooks(bookList83);
        library71.listAllMembers();
        model.Member member89 = new model.Member(0, "");
        java.lang.String str90 = member89.getName();
        java.time.LocalDate localDate91 = null;
        float float92 = library71.getMemberFine(member89, localDate91);
        java.lang.String str93 = member89.toString();
        java.lang.String str94 = member89.getName();
        java.time.LocalDate localDate95 = null;
        library29.lendBook(book70, member89, localDate95);
        java.time.LocalDate localDate97 = null;
        float float98 = library0.getMemberFine(member89, localDate97);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertNotNull(memberList28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 97 + "'", int58 == 97);
        org.junit.Assert.assertNotNull(memberArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(loanList63);
        org.junit.Assert.assertNotNull(bookList65);
        org.junit.Assert.assertNotNull(bookArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertTrue("'" + float92 + "' != '" + 0.0f + "'", float92 == 0.0f);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertTrue("'" + float98 + "' != '" + 0.0f + "'", float98 == 0.0f);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Book> bookList1 = library0.getBooks();
        model.Member member4 = new model.Member((int) (short) 1, "");
        java.time.LocalDate localDate5 = null;
        float float6 = library0.getMemberFine(member4, localDate5);
        model.Member member7 = null;
        library0.addMember(member7);
        java.util.ArrayList<model.Member> memberList9 = library0.getMembers();
        org.junit.Assert.assertNotNull(bookList1);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 0.0f + "'", float6 == 0.0f);
        org.junit.Assert.assertNotNull(memberList9);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        model.Book book6 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book11 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray12 = new model.Book[] { book6, book11 };
        java.util.ArrayList<model.Book> bookList13 = new java.util.ArrayList<model.Book>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList13, bookArray12);
        library1.setBooks(bookList13);
        control.Library library16 = new control.Library();
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book26 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray27 = new model.Book[] { book21, book26 };
        java.util.ArrayList<model.Book> bookList28 = new java.util.ArrayList<model.Book>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList28, bookArray27);
        library16.setBooks(bookList28);
        model.Book book35 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member38 = new model.Member((int) 'a', "");
        java.lang.String str39 = member38.getName();
        java.lang.String str40 = member38.toString();
        int int41 = member38.getId();
        java.time.LocalDate localDate42 = null;
        library16.lendBook(book35, member38, localDate42);
        library1.addBook(book35);
        control.Library library45 = new control.Library();
        java.util.ArrayList<model.Loan> loanList46 = library45.getLoans();
        library1.setLoans(loanList46);
        java.util.ArrayList<model.Loan> loanList48 = library1.getLoans();
        library0.setLoans(loanList48);
        java.util.ArrayList<model.Loan> loanList50 = library0.getLoans();
        model.Book book55 = new model.Book("", "hi!", 1, (int) (short) 100);
        java.lang.String str56 = book55.getAuthor();
        boolean boolean57 = book55.isAvailable();
        boolean boolean58 = book55.isAvailable();
        model.Member member61 = new model.Member((int) (short) 100, "hi!");
        java.time.LocalDate localDate62 = null;
        library0.lendBook(book55, member61, localDate62);
        java.lang.String str64 = book55.getTitle();
        java.lang.String str65 = book55.getAuthor();
        org.junit.Assert.assertNotNull(bookArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(bookArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertNotNull(loanList46);
        org.junit.Assert.assertNotNull(loanList48);
        org.junit.Assert.assertNotNull(loanList50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Book> bookList1 = null;
        library0.setBooks(bookList1);
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Loan> loanList5 = library3.getLoans();
        control.Library library6 = new control.Library();
        model.Book book11 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray17 = new model.Book[] { book11, book16 };
        java.util.ArrayList<model.Book> bookList18 = new java.util.ArrayList<model.Book>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList18, bookArray17);
        library6.setBooks(bookList18);
        library6.listAllMembers();
        model.Book book26 = new model.Book("", "", (int) (byte) 1, 0);
        library6.addBook(book26);
        library3.addBook(book26);
        java.util.ArrayList<model.Book> bookList29 = library3.getBooks();
        library0.setBooks(bookList29);
        model.Book book35 = new model.Book("hi! by HI!", " by HI!", (int) (short) 1, 1);
        model.Member member38 = new model.Member((int) '#', "hi!");
        java.lang.String str39 = member38.toString();
        java.time.LocalDate localDate40 = null;
        library0.lendBook(book35, member38, localDate40);
        control.Library library42 = new control.Library();
        model.Book book47 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book52 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray53 = new model.Book[] { book47, book52 };
        java.util.ArrayList<model.Book> bookList54 = new java.util.ArrayList<model.Book>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList54, bookArray53);
        library42.setBooks(bookList54);
        model.Book book61 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member64 = new model.Member((int) 'a', "");
        java.lang.String str65 = member64.getName();
        java.lang.String str66 = member64.toString();
        int int67 = member64.getId();
        java.time.LocalDate localDate68 = null;
        library42.lendBook(book61, member64, localDate68);
        java.util.ArrayList<model.Loan> loanList70 = library42.getLoans();
        model.Member member73 = new model.Member((int) 'a', "");
        java.lang.String str74 = member73.getName();
        java.lang.String str75 = member73.getName();
        library42.addMember(member73);
        model.Member member79 = new model.Member((int) 'a', "");
        java.lang.String str80 = member79.getName();
        library42.addMember(member79);
        int int82 = member79.getId();
        int int83 = member79.getId();
        int int84 = member79.getId();
        java.lang.String str85 = member79.toString();
        java.lang.String str86 = member79.getName();
        java.lang.String str87 = member79.toString();
        java.time.LocalDate localDate88 = null;
        float float89 = library0.getMemberFine(member79, localDate88);
        model.Member member92 = new model.Member((int) (byte) -1, "hi! by HI!");
        library0.addMember(member92);
        java.util.ArrayList<model.Loan> loanList94 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList95 = library0.getLoans();
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookList29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(bookArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertNotNull(loanList70);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 97 + "'", int82 == 97);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 0.0f + "'", float89 == 0.0f);
        org.junit.Assert.assertNotNull(loanList94);
        org.junit.Assert.assertNotNull(loanList95);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        control.Library library2 = new control.Library();
        model.Book book7 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book12 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray13 = new model.Book[] { book7, book12 };
        java.util.ArrayList<model.Book> bookList14 = new java.util.ArrayList<model.Book>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList14, bookArray13);
        library2.setBooks(bookList14);
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member24 = new model.Member((int) 'a', "");
        java.lang.String str25 = member24.getName();
        java.lang.String str26 = member24.toString();
        int int27 = member24.getId();
        java.time.LocalDate localDate28 = null;
        library2.lendBook(book21, member24, localDate28);
        java.time.LocalDate localDate32 = null;
        model.Loan loan34 = new model.Loan(0, (int) (short) -1, localDate32, (float) (short) -1);
        float float35 = loan34.getDailyFine();
        int int36 = loan34.getBookCode();
        java.time.LocalDate localDate39 = null;
        model.Loan loan41 = new model.Loan(0, (int) (short) -1, localDate39, (float) (short) -1);
        float float42 = loan41.getDailyFine();
        model.Loan[] loanArray43 = new model.Loan[] { loan34, loan41 };
        java.util.ArrayList<model.Loan> loanList44 = new java.util.ArrayList<model.Loan>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList44, loanArray43);
        library2.setLoans(loanList44);
        control.Library library47 = new control.Library();
        java.util.ArrayList<model.Loan> loanList48 = library47.getLoans();
        java.util.ArrayList<model.Book> bookList49 = library47.getBooks();
        control.Library library50 = new control.Library();
        java.util.ArrayList<model.Loan> loanList51 = library50.getLoans();
        java.util.ArrayList<model.Book> bookList52 = library50.getBooks();
        library47.setBooks(bookList52);
        library2.setBooks(bookList52);
        library0.setBooks(bookList52);
        library0.listAllBooks();
        library0.listAllBooks();
        model.Member member60 = new model.Member(0, " by HI!");
        java.time.LocalDate localDate61 = null;
        float float62 = library0.getMemberFine(member60, localDate61);
        control.Library library63 = new control.Library();
        java.util.ArrayList<model.Loan> loanList64 = library63.getLoans();
        java.util.ArrayList<model.Loan> loanList65 = library63.getLoans();
        java.util.ArrayList<model.Member> memberList66 = library63.getMembers();
        java.util.ArrayList<model.Loan> loanList67 = null;
        library63.setLoans(loanList67);
        java.util.ArrayList<model.Member> memberList69 = library63.getMembers();
        library0.setMembers(memberList69);
        library0.listAllMembers();
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList73 = library0.getMembers();
        model.Member member76 = new model.Member((-1), "hi!");
        int int77 = member76.getId();
        library0.addMember(member76);
        java.util.ArrayList<model.Loan> loanList79 = library0.getLoans();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(loanList48);
        org.junit.Assert.assertNotNull(bookList49);
        org.junit.Assert.assertNotNull(loanList51);
        org.junit.Assert.assertNotNull(bookList52);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertNotNull(loanList64);
        org.junit.Assert.assertNotNull(loanList65);
        org.junit.Assert.assertNotNull(memberList66);
        org.junit.Assert.assertNotNull(memberList69);
        org.junit.Assert.assertNotNull(memberList73);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(loanList79);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        control.Library library2 = new control.Library();
        model.Book book7 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book12 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray13 = new model.Book[] { book7, book12 };
        java.util.ArrayList<model.Book> bookList14 = new java.util.ArrayList<model.Book>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList14, bookArray13);
        library2.setBooks(bookList14);
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member24 = new model.Member((int) 'a', "");
        java.lang.String str25 = member24.getName();
        java.lang.String str26 = member24.toString();
        int int27 = member24.getId();
        java.time.LocalDate localDate28 = null;
        library2.lendBook(book21, member24, localDate28);
        java.time.LocalDate localDate32 = null;
        model.Loan loan34 = new model.Loan(0, (int) (short) -1, localDate32, (float) (short) -1);
        float float35 = loan34.getDailyFine();
        int int36 = loan34.getBookCode();
        java.time.LocalDate localDate39 = null;
        model.Loan loan41 = new model.Loan(0, (int) (short) -1, localDate39, (float) (short) -1);
        float float42 = loan41.getDailyFine();
        model.Loan[] loanArray43 = new model.Loan[] { loan34, loan41 };
        java.util.ArrayList<model.Loan> loanList44 = new java.util.ArrayList<model.Loan>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList44, loanArray43);
        library2.setLoans(loanList44);
        control.Library library47 = new control.Library();
        java.util.ArrayList<model.Loan> loanList48 = library47.getLoans();
        java.util.ArrayList<model.Book> bookList49 = library47.getBooks();
        control.Library library50 = new control.Library();
        java.util.ArrayList<model.Loan> loanList51 = library50.getLoans();
        java.util.ArrayList<model.Book> bookList52 = library50.getBooks();
        library47.setBooks(bookList52);
        library2.setBooks(bookList52);
        library0.setBooks(bookList52);
        java.util.ArrayList<model.Loan> loanList56 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList57 = library0.getMembers();
        java.util.ArrayList<model.Member> memberList58 = library0.getMembers();
        control.Library library59 = new control.Library();
        java.util.ArrayList<model.Loan> loanList60 = library59.getLoans();
        java.util.ArrayList<model.Loan> loanList61 = library59.getLoans();
        control.Library library62 = new control.Library();
        model.Book book67 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book72 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray73 = new model.Book[] { book67, book72 };
        java.util.ArrayList<model.Book> bookList74 = new java.util.ArrayList<model.Book>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList74, bookArray73);
        library62.setBooks(bookList74);
        library62.listAllMembers();
        model.Book book82 = new model.Book("", "", (int) (byte) 1, 0);
        library62.addBook(book82);
        library59.addBook(book82);
        java.util.ArrayList<model.Book> bookList85 = library59.getBooks();
        library0.setBooks(bookList85);
        library0.listAllBooks();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(loanList48);
        org.junit.Assert.assertNotNull(bookList49);
        org.junit.Assert.assertNotNull(loanList51);
        org.junit.Assert.assertNotNull(bookList52);
        org.junit.Assert.assertNotNull(loanList56);
        org.junit.Assert.assertNotNull(memberList57);
        org.junit.Assert.assertNotNull(memberList58);
        org.junit.Assert.assertNotNull(loanList60);
        org.junit.Assert.assertNotNull(loanList61);
        org.junit.Assert.assertNotNull(bookArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(bookList85);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        control.Library library4 = new control.Library();
        java.util.ArrayList<model.Loan> loanList5 = library4.getLoans();
        java.util.ArrayList<model.Book> bookList6 = library4.getBooks();
        library1.setBooks(bookList6);
        library0.setBooks(bookList6);
        control.Library library9 = new control.Library();
        java.util.ArrayList<model.Loan> loanList10 = library9.getLoans();
        control.Library library11 = new control.Library();
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray22 = new model.Book[] { book16, book21 };
        java.util.ArrayList<model.Book> bookList23 = new java.util.ArrayList<model.Book>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList23, bookArray22);
        library11.setBooks(bookList23);
        model.Book book30 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member33 = new model.Member((int) 'a', "");
        java.lang.String str34 = member33.getName();
        java.lang.String str35 = member33.toString();
        int int36 = member33.getId();
        java.time.LocalDate localDate37 = null;
        library11.lendBook(book30, member33, localDate37);
        java.time.LocalDate localDate41 = null;
        model.Loan loan43 = new model.Loan(0, (int) (short) -1, localDate41, (float) (short) -1);
        float float44 = loan43.getDailyFine();
        int int45 = loan43.getBookCode();
        java.time.LocalDate localDate48 = null;
        model.Loan loan50 = new model.Loan(0, (int) (short) -1, localDate48, (float) (short) -1);
        float float51 = loan50.getDailyFine();
        model.Loan[] loanArray52 = new model.Loan[] { loan43, loan50 };
        java.util.ArrayList<model.Loan> loanList53 = new java.util.ArrayList<model.Loan>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList53, loanArray52);
        library11.setLoans(loanList53);
        control.Library library56 = new control.Library();
        java.util.ArrayList<model.Loan> loanList57 = library56.getLoans();
        java.util.ArrayList<model.Book> bookList58 = library56.getBooks();
        control.Library library59 = new control.Library();
        java.util.ArrayList<model.Loan> loanList60 = library59.getLoans();
        java.util.ArrayList<model.Book> bookList61 = library59.getBooks();
        library56.setBooks(bookList61);
        library11.setBooks(bookList61);
        library9.setBooks(bookList61);
        library0.setBooks(bookList61);
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList67 = library0.getMembers();
        control.Library library68 = new control.Library();
        model.Book book73 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book78 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray79 = new model.Book[] { book73, book78 };
        java.util.ArrayList<model.Book> bookList80 = new java.util.ArrayList<model.Book>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList80, bookArray79);
        library68.setBooks(bookList80);
        library68.listAllMembers();
        model.Member member86 = new model.Member(0, "");
        java.lang.String str87 = member86.getName();
        java.time.LocalDate localDate88 = null;
        float float89 = library68.getMemberFine(member86, localDate88);
        java.lang.String str90 = member86.toString();
        library0.addMember(member86);
        library0.listAllBooks();
        library0.listAllBooks();
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookList6);
        org.junit.Assert.assertNotNull(loanList10);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + (-1.0f) + "'", float51 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(loanList57);
        org.junit.Assert.assertNotNull(bookList58);
        org.junit.Assert.assertNotNull(loanList60);
        org.junit.Assert.assertNotNull(bookList61);
        org.junit.Assert.assertNotNull(memberList67);
        org.junit.Assert.assertNotNull(bookArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 0.0f + "'", float89 == 0.0f);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        float float10 = loan4.getDailyFine();
        java.time.LocalDate localDate11 = null;
        loan4.extendLoan(localDate11);
        int int13 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        model.Book book4 = new model.Book("", "", (int) (byte) 1, (int) 'a');
        int int5 = book4.getValue();
        int int6 = book4.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) ' ');
        int int5 = loan4.getBookCode();
        int int6 = loan4.getBookCode();
        java.time.LocalDate localDate7 = null;
        loan4.setReturnDate(localDate7);
        int int9 = loan4.getBookCode();
        int int10 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, (int) (short) 0, localDate2, (float) 100L);
        int int5 = loan4.getMemberId();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        java.time.LocalDate localDate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float8 = loan4.calculateFine(localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(32, (int) (byte) 100, localDate2, (float) 1L);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.setReturnDate(localDate6);
        int int8 = loan4.getMemberId();
        int int9 = loan4.getMemberId();
        float float10 = loan4.getDailyFine();
        int int11 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 100.0f + "'", float10 == 100.0f);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) ' ');
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        java.time.LocalDate localDate7 = loan4.getReturnDate();
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        java.time.LocalDate localDate10 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float11 = loan4.calculateFine(localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        java.lang.Class<?> wildcardClass7 = loan4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        java.time.LocalDate localDate12 = loan4.getReturnDate();
        float float13 = loan4.getDailyFine();
        int int14 = loan4.getMemberId();
        float float15 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + (-1.0f) + "'", float15 == (-1.0f));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        model.Member member2 = new model.Member((int) (byte) 0, " by HI!");
        int int3 = member2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(32, 97, localDate2, (float) ' ');
        java.time.LocalDate localDate5 = loan4.getReturnDate();
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        model.Member member6 = new model.Member((-1), "hi!");
        library1.addMember(member6);
        java.time.LocalDate localDate8 = null;
        float float9 = library0.getMemberFine(member6, localDate8);
        java.util.ArrayList<model.Book> bookList10 = library0.getBooks();
        control.Library library11 = new control.Library();
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray22 = new model.Book[] { book16, book21 };
        java.util.ArrayList<model.Book> bookList23 = new java.util.ArrayList<model.Book>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList23, bookArray22);
        library11.setBooks(bookList23);
        model.Book book30 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member33 = new model.Member((int) 'a', "");
        java.lang.String str34 = member33.getName();
        java.lang.String str35 = member33.toString();
        int int36 = member33.getId();
        java.time.LocalDate localDate37 = null;
        library11.lendBook(book30, member33, localDate37);
        java.util.ArrayList<model.Loan> loanList39 = library11.getLoans();
        model.Member member42 = new model.Member((int) 'a', "");
        java.lang.String str43 = member42.getName();
        java.lang.String str44 = member42.getName();
        library11.addMember(member42);
        model.Member member48 = new model.Member((int) 'a', "");
        java.lang.String str49 = member48.getName();
        library11.addMember(member48);
        int int51 = member48.getId();
        int int52 = member48.getId();
        library0.addMember(member48);
        model.Book book58 = new model.Book("", "hi!", 0, (int) 'a');
        library0.addBook(book58);
        library0.listAllBooks();
        java.util.ArrayList<model.Book> bookList61 = library0.getBooks();
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(bookArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(loanList39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
        org.junit.Assert.assertNotNull(bookList61);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        library0.listAllMembers();
        model.Book book20 = new model.Book("", "", (int) (byte) 1, 0);
        library0.addBook(book20);
        java.util.ArrayList<model.Loan> loanList22 = library0.getLoans();
        control.Library library23 = new control.Library();
        model.Book book28 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book33 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray34 = new model.Book[] { book28, book33 };
        java.util.ArrayList<model.Book> bookList35 = new java.util.ArrayList<model.Book>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList35, bookArray34);
        library23.setBooks(bookList35);
        control.Library library38 = new control.Library();
        model.Book book43 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book48 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray49 = new model.Book[] { book43, book48 };
        java.util.ArrayList<model.Book> bookList50 = new java.util.ArrayList<model.Book>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList50, bookArray49);
        library38.setBooks(bookList50);
        model.Book book57 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member60 = new model.Member((int) 'a', "");
        java.lang.String str61 = member60.getName();
        java.lang.String str62 = member60.toString();
        int int63 = member60.getId();
        java.time.LocalDate localDate64 = null;
        library38.lendBook(book57, member60, localDate64);
        library23.addBook(book57);
        control.Library library67 = new control.Library();
        java.util.ArrayList<model.Loan> loanList68 = library67.getLoans();
        library23.setLoans(loanList68);
        java.util.ArrayList<model.Loan> loanList70 = library23.getLoans();
        java.util.ArrayList<model.Member> memberList71 = library23.getMembers();
        java.util.ArrayList<model.Member> memberList72 = library23.getMembers();
        library0.setMembers(memberList72);
        control.Library library74 = new control.Library();
        control.Library library75 = new control.Library();
        java.util.ArrayList<model.Loan> loanList76 = library75.getLoans();
        java.util.ArrayList<model.Book> bookList77 = library75.getBooks();
        model.Member member80 = new model.Member((-1), "hi!");
        library75.addMember(member80);
        java.time.LocalDate localDate82 = null;
        float float83 = library74.getMemberFine(member80, localDate82);
        java.util.ArrayList<model.Book> bookList84 = library74.getBooks();
        library0.setBooks(bookList84);
        java.util.ArrayList<model.Book> bookList86 = library0.getBooks();
        java.util.ArrayList<model.Book> bookList87 = null;
        library0.setBooks(bookList87);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(loanList22);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(bookArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(loanList68);
        org.junit.Assert.assertNotNull(loanList70);
        org.junit.Assert.assertNotNull(memberList71);
        org.junit.Assert.assertNotNull(memberList72);
        org.junit.Assert.assertNotNull(loanList76);
        org.junit.Assert.assertNotNull(bookList77);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + 0.0f + "'", float83 == 0.0f);
        org.junit.Assert.assertNotNull(bookList84);
        org.junit.Assert.assertNotNull(bookList86);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        int int5 = book4.getValue();
        int int6 = book4.getValue();
        int int7 = book4.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 0, (int) (byte) 10, localDate2, (float) '#');
        java.time.LocalDate localDate5 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float6 = loan4.calculateFine(localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        model.Member member2 = new model.Member((int) (short) 100, "hi!");
        java.lang.String str3 = member2.toString();
        java.lang.String str4 = member2.getName();
        java.lang.String str5 = member2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        control.Library library4 = new control.Library();
        model.Book book9 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book14 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray15 = new model.Book[] { book9, book14 };
        java.util.ArrayList<model.Book> bookList16 = new java.util.ArrayList<model.Book>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList16, bookArray15);
        library4.setBooks(bookList16);
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        java.time.LocalDate localDate30 = null;
        library4.lendBook(book23, member26, localDate30);
        model.Book book36 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str37 = book36.toString();
        model.Member member40 = new model.Member((int) 'a', "");
        java.lang.String str41 = member40.getName();
        java.lang.String str42 = member40.getName();
        java.time.LocalDate localDate43 = null;
        library4.lendBook(book36, member40, localDate43);
        library0.addBook(book36);
        model.Book book50 = new model.Book("", "", 97, (int) 'a');
        java.lang.String str51 = book50.getTitle();
        library0.addBook(book50);
        book50.setAvailable(true);
        java.lang.String str55 = book50.getTitle();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " by HI!" + "'", str37, " by HI!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        control.Library library0 = new control.Library();
        model.Member member3 = new model.Member((int) (short) 10, "");
        model.Member member6 = new model.Member((int) 'a', "");
        java.lang.String str7 = member6.getName();
        model.Member member10 = new model.Member((int) 'a', "");
        java.lang.String str11 = member10.getName();
        java.lang.String str12 = member10.getName();
        model.Member member15 = new model.Member((int) 'a', "");
        java.lang.String str16 = member15.getName();
        java.lang.String str17 = member15.toString();
        int int18 = member15.getId();
        model.Member member21 = new model.Member((int) 'a', "");
        java.lang.String str22 = member21.getName();
        java.lang.String str23 = member21.getName();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        model.Member[] memberArray30 = new model.Member[] { member3, member6, member10, member15, member21, member26 };
        java.util.ArrayList<model.Member> memberList31 = new java.util.ArrayList<model.Member>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList31, memberArray30);
        library0.setMembers(memberList31);
        model.Book book38 = new model.Book("", "hi!", 0, (int) 'a');
        int int39 = book38.getValue();
        library0.addBook(book38);
        control.Library library41 = new control.Library();
        java.util.ArrayList<model.Loan> loanList42 = library41.getLoans();
        java.util.ArrayList<model.Loan> loanList43 = library41.getLoans();
        java.util.ArrayList<model.Member> memberList44 = library41.getMembers();
        model.Book book49 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean50 = book49.isAvailable();
        library41.addBook(book49);
        library0.addBook(book49);
        library0.listAllBooks();
        model.Member member56 = new model.Member((int) ' ', "hi! by HI!");
        java.time.LocalDate localDate57 = null;
        float float58 = library0.getMemberFine(member56, localDate57);
        model.Book book63 = new model.Book("", "", (int) (byte) 1, (int) 'a');
        java.lang.String str64 = book63.getAuthor();
        library0.addBook(book63);
        java.util.ArrayList<model.Book> bookList66 = library0.getBooks();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertNotNull(memberArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 97 + "'", int39 == 97);
        org.junit.Assert.assertNotNull(loanList42);
        org.junit.Assert.assertNotNull(loanList43);
        org.junit.Assert.assertNotNull(memberList44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + float58 + "' != '" + 0.0f + "'", float58 == 0.0f);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(bookList66);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        control.Library library4 = new control.Library();
        model.Book book9 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book14 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray15 = new model.Book[] { book9, book14 };
        java.util.ArrayList<model.Book> bookList16 = new java.util.ArrayList<model.Book>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList16, bookArray15);
        library4.setBooks(bookList16);
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        java.time.LocalDate localDate30 = null;
        library4.lendBook(book23, member26, localDate30);
        model.Book book36 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str37 = book36.toString();
        model.Member member40 = new model.Member((int) 'a', "");
        java.lang.String str41 = member40.getName();
        java.lang.String str42 = member40.getName();
        java.time.LocalDate localDate43 = null;
        library4.lendBook(book36, member40, localDate43);
        library0.addBook(book36);
        control.Library library46 = new control.Library();
        model.Book book51 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book56 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray57 = new model.Book[] { book51, book56 };
        java.util.ArrayList<model.Book> bookList58 = new java.util.ArrayList<model.Book>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList58, bookArray57);
        library46.setBooks(bookList58);
        model.Book book65 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member68 = new model.Member((int) 'a', "");
        java.lang.String str69 = member68.getName();
        java.lang.String str70 = member68.toString();
        int int71 = member68.getId();
        java.time.LocalDate localDate72 = null;
        library46.lendBook(book65, member68, localDate72);
        java.time.LocalDate localDate74 = null;
        float float75 = library0.getMemberFine(member68, localDate74);
        library0.listAllMembers();
        model.Book book81 = new model.Book("hi!", "hi!", (int) 'a', (int) (short) 1);
        java.lang.String str82 = book81.toString();
        int int83 = book81.getValue();
        int int84 = book81.getCode();
        java.lang.String str85 = book81.getAuthor();
        model.Member member88 = new model.Member((int) (short) 100, "hi!");
        java.time.LocalDate localDate89 = null;
        library0.lendBook(book81, member88, localDate89);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " by HI!" + "'", str37, " by HI!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(bookArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi! by HI!" + "'", str82, "hi! by HI!");
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 97 + "'", int84 == 97);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, (int) (byte) 0, localDate2, (float) (byte) -1);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        library0.setBooks(bookList5);
        model.Member member9 = new model.Member((int) (short) 100, "");
        library0.addMember(member9);
        control.Library library11 = new control.Library();
        java.util.ArrayList<model.Loan> loanList12 = library11.getLoans();
        java.util.ArrayList<model.Book> bookList13 = library11.getBooks();
        model.Member member16 = new model.Member((-1), "hi!");
        library11.addMember(member16);
        java.lang.String str18 = member16.getName();
        library0.addMember(member16);
        java.util.ArrayList<model.Loan> loanList20 = null;
        library0.setLoans(loanList20);
        java.util.ArrayList<model.Loan> loanList22 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList23 = library0.getBooks();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(loanList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(loanList22);
        org.junit.Assert.assertNotNull(bookList23);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) '#', 52, localDate2, (float) (short) 0);
        int int5 = loan4.getBookCode();
        java.time.LocalDate localDate6 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float7 = loan4.calculateFine(localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        model.Book book4 = new model.Book(" by HI!", "hi! by ", (int) (byte) -1, (int) '4');
        book4.setAvailable(true);
        book4.setAvailable(true);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        int int5 = book4.getValue();
        int int6 = book4.getCode();
        boolean boolean7 = book4.isAvailable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        control.Library library4 = new control.Library();
        model.Book book9 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book14 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray15 = new model.Book[] { book9, book14 };
        java.util.ArrayList<model.Book> bookList16 = new java.util.ArrayList<model.Book>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList16, bookArray15);
        library4.setBooks(bookList16);
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.toString();
        int int29 = member26.getId();
        java.time.LocalDate localDate30 = null;
        library4.lendBook(book23, member26, localDate30);
        model.Book book36 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str37 = book36.toString();
        model.Member member40 = new model.Member((int) 'a', "");
        java.lang.String str41 = member40.getName();
        java.lang.String str42 = member40.getName();
        java.time.LocalDate localDate43 = null;
        library4.lendBook(book36, member40, localDate43);
        library0.addBook(book36);
        control.Library library46 = new control.Library();
        model.Book book51 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book56 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray57 = new model.Book[] { book51, book56 };
        java.util.ArrayList<model.Book> bookList58 = new java.util.ArrayList<model.Book>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList58, bookArray57);
        library46.setBooks(bookList58);
        model.Book book65 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member68 = new model.Member((int) 'a', "");
        java.lang.String str69 = member68.getName();
        java.lang.String str70 = member68.toString();
        int int71 = member68.getId();
        java.time.LocalDate localDate72 = null;
        library46.lendBook(book65, member68, localDate72);
        java.time.LocalDate localDate74 = null;
        float float75 = library0.getMemberFine(member68, localDate74);
        java.lang.String str76 = member68.toString();
        java.lang.String str77 = member68.getName();
        int int78 = member68.getId();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + " by HI!" + "'", str37, " by HI!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(bookArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 97 + "'", int71 == 97);
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 97 + "'", int78 == 97);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList2 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        java.util.ArrayList<model.Member> memberList4 = library0.getMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(memberList4);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(10, (int) '4', localDate2, (float) (byte) 100);
        int int5 = loan4.getBookCode();
        int int6 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        model.Book book19 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        java.lang.String str24 = member22.toString();
        int int25 = member22.getId();
        java.time.LocalDate localDate26 = null;
        library0.lendBook(book19, member22, localDate26);
        java.time.LocalDate localDate30 = null;
        model.Loan loan32 = new model.Loan(0, (int) (short) -1, localDate30, (float) (short) -1);
        float float33 = loan32.getDailyFine();
        int int34 = loan32.getBookCode();
        java.time.LocalDate localDate37 = null;
        model.Loan loan39 = new model.Loan(0, (int) (short) -1, localDate37, (float) (short) -1);
        float float40 = loan39.getDailyFine();
        model.Loan[] loanArray41 = new model.Loan[] { loan32, loan39 };
        java.util.ArrayList<model.Loan> loanList42 = new java.util.ArrayList<model.Loan>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList42, loanArray41);
        library0.setLoans(loanList42);
        control.Library library45 = new control.Library();
        java.util.ArrayList<model.Loan> loanList46 = library45.getLoans();
        java.util.ArrayList<model.Book> bookList47 = library45.getBooks();
        control.Library library48 = new control.Library();
        java.util.ArrayList<model.Loan> loanList49 = library48.getLoans();
        java.util.ArrayList<model.Book> bookList50 = library48.getBooks();
        library45.setBooks(bookList50);
        library0.setBooks(bookList50);
        library0.listAllBooks();
        model.Member member56 = new model.Member(0, " by HI!");
        library0.addMember(member56);
        java.lang.Class<?> wildcardClass58 = library0.getClass();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + (-1.0f) + "'", float33 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(loanList46);
        org.junit.Assert.assertNotNull(bookList47);
        org.junit.Assert.assertNotNull(loanList49);
        org.junit.Assert.assertNotNull(bookList50);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        model.Book book4 = new model.Book(" by ", "", (int) (short) 10, 0);
        int int5 = book4.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        model.Member member2 = new model.Member((int) '#', " by ");
        java.lang.String str3 = member2.toString();
        java.lang.String str4 = member2.toString();
        java.lang.String str5 = member2.toString();
        java.lang.String str6 = member2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " by " + "'", str3, " by ");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " by " + "'", str4, " by ");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " by " + "'", str5, " by ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " by " + "'", str6, " by ");
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 0, localDate2, (float) ' ');
        int int5 = loan4.getBookCode();
        java.time.LocalDate localDate6 = null;
        loan4.setReturnDate(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.extendLoan(localDate8);
        float float10 = loan4.getDailyFine();
        float float11 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 32.0f + "'", float10 == 32.0f);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 32.0f + "'", float11 == 32.0f);
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, 1, localDate2, 1.0f);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        control.Library library0 = new control.Library();
        control.Library library1 = new control.Library();
        java.util.ArrayList<model.Loan> loanList2 = library1.getLoans();
        java.util.ArrayList<model.Book> bookList3 = library1.getBooks();
        model.Member member6 = new model.Member((-1), "hi!");
        library1.addMember(member6);
        java.time.LocalDate localDate8 = null;
        float float9 = library0.getMemberFine(member6, localDate8);
        java.util.ArrayList<model.Book> bookList10 = library0.getBooks();
        control.Library library11 = new control.Library();
        java.util.ArrayList<model.Loan> loanList12 = library11.getLoans();
        control.Library library13 = new control.Library();
        model.Book book18 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book23 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray24 = new model.Book[] { book18, book23 };
        java.util.ArrayList<model.Book> bookList25 = new java.util.ArrayList<model.Book>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList25, bookArray24);
        library13.setBooks(bookList25);
        model.Book book32 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member35 = new model.Member((int) 'a', "");
        java.lang.String str36 = member35.getName();
        java.lang.String str37 = member35.toString();
        int int38 = member35.getId();
        java.time.LocalDate localDate39 = null;
        library13.lendBook(book32, member35, localDate39);
        java.time.LocalDate localDate43 = null;
        model.Loan loan45 = new model.Loan(0, (int) (short) -1, localDate43, (float) (short) -1);
        float float46 = loan45.getDailyFine();
        int int47 = loan45.getBookCode();
        java.time.LocalDate localDate50 = null;
        model.Loan loan52 = new model.Loan(0, (int) (short) -1, localDate50, (float) (short) -1);
        float float53 = loan52.getDailyFine();
        model.Loan[] loanArray54 = new model.Loan[] { loan45, loan52 };
        java.util.ArrayList<model.Loan> loanList55 = new java.util.ArrayList<model.Loan>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList55, loanArray54);
        library13.setLoans(loanList55);
        control.Library library58 = new control.Library();
        java.util.ArrayList<model.Loan> loanList59 = library58.getLoans();
        java.util.ArrayList<model.Book> bookList60 = library58.getBooks();
        control.Library library61 = new control.Library();
        java.util.ArrayList<model.Loan> loanList62 = library61.getLoans();
        java.util.ArrayList<model.Book> bookList63 = library61.getBooks();
        library58.setBooks(bookList63);
        library13.setBooks(bookList63);
        library11.setBooks(bookList63);
        library11.listAllBooks();
        model.Book book72 = new model.Book("", "hi!", 0, (int) 'a');
        boolean boolean73 = book72.isAvailable();
        java.lang.String str74 = book72.getAuthor();
        java.lang.String str75 = book72.getTitle();
        library11.addBook(book72);
        library11.listAllMembers();
        java.util.ArrayList<model.Loan> loanList78 = library11.getLoans();
        library0.setLoans(loanList78);
        library0.listAllBooks();
        java.util.ArrayList<model.Loan> loanList81 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList82 = library0.getLoans();
        library0.listAllMembers();
        org.junit.Assert.assertNotNull(loanList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 0.0f + "'", float9 == 0.0f);
        org.junit.Assert.assertNotNull(bookList10);
        org.junit.Assert.assertNotNull(loanList12);
        org.junit.Assert.assertNotNull(bookArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + (-1.0f) + "'", float46 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + (-1.0f) + "'", float53 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(loanList59);
        org.junit.Assert.assertNotNull(bookList60);
        org.junit.Assert.assertNotNull(loanList62);
        org.junit.Assert.assertNotNull(bookList63);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(loanList78);
        org.junit.Assert.assertNotNull(loanList81);
        org.junit.Assert.assertNotNull(loanList82);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        int int7 = loan4.getBookCode();
        int int8 = loan4.getMemberId();
        java.time.LocalDate localDate9 = loan4.getReturnDate();
        java.time.LocalDate localDate10 = loan4.getReturnDate();
        java.time.LocalDate localDate11 = loan4.getReturnDate();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertNull(localDate11);
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        control.Library library2 = new control.Library();
        model.Book book7 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book12 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray13 = new model.Book[] { book7, book12 };
        java.util.ArrayList<model.Book> bookList14 = new java.util.ArrayList<model.Book>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList14, bookArray13);
        library2.setBooks(bookList14);
        model.Book book21 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member24 = new model.Member((int) 'a', "");
        java.lang.String str25 = member24.getName();
        java.lang.String str26 = member24.toString();
        int int27 = member24.getId();
        java.time.LocalDate localDate28 = null;
        library2.lendBook(book21, member24, localDate28);
        java.time.LocalDate localDate32 = null;
        model.Loan loan34 = new model.Loan(0, (int) (short) -1, localDate32, (float) (short) -1);
        float float35 = loan34.getDailyFine();
        int int36 = loan34.getBookCode();
        java.time.LocalDate localDate39 = null;
        model.Loan loan41 = new model.Loan(0, (int) (short) -1, localDate39, (float) (short) -1);
        float float42 = loan41.getDailyFine();
        model.Loan[] loanArray43 = new model.Loan[] { loan34, loan41 };
        java.util.ArrayList<model.Loan> loanList44 = new java.util.ArrayList<model.Loan>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList44, loanArray43);
        library2.setLoans(loanList44);
        control.Library library47 = new control.Library();
        java.util.ArrayList<model.Loan> loanList48 = library47.getLoans();
        java.util.ArrayList<model.Book> bookList49 = library47.getBooks();
        control.Library library50 = new control.Library();
        java.util.ArrayList<model.Loan> loanList51 = library50.getLoans();
        java.util.ArrayList<model.Book> bookList52 = library50.getBooks();
        library47.setBooks(bookList52);
        library2.setBooks(bookList52);
        library0.setBooks(bookList52);
        library0.listAllBooks();
        library0.listAllBooks();
        model.Member member60 = new model.Member(0, " by HI!");
        java.time.LocalDate localDate61 = null;
        float float62 = library0.getMemberFine(member60, localDate61);
        java.util.ArrayList<model.Loan> loanList63 = library0.getLoans();
        model.Loan loan64 = null;
        java.time.LocalDate localDate65 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double66 = library0.getFineDiscount(loan64, localDate65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
        org.junit.Assert.assertTrue("'" + float35 + "' != '" + (-1.0f) + "'", float35 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + (-1.0f) + "'", float42 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(loanList48);
        org.junit.Assert.assertNotNull(bookList49);
        org.junit.Assert.assertNotNull(loanList51);
        org.junit.Assert.assertNotNull(bookList52);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertNotNull(loanList63);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        model.Book book4 = new model.Book("", "", 97, (int) 'a');
        java.lang.String str5 = book4.getTitle();
        int int6 = book4.getValue();
        java.lang.String str7 = book4.getAuthor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        control.Library library15 = new control.Library();
        model.Book book20 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book25 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray26 = new model.Book[] { book20, book25 };
        java.util.ArrayList<model.Book> bookList27 = new java.util.ArrayList<model.Book>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList27, bookArray26);
        library15.setBooks(bookList27);
        model.Book book34 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member37 = new model.Member((int) 'a', "");
        java.lang.String str38 = member37.getName();
        java.lang.String str39 = member37.toString();
        int int40 = member37.getId();
        java.time.LocalDate localDate41 = null;
        library15.lendBook(book34, member37, localDate41);
        library0.addBook(book34);
        library0.listAllBooks();
        control.Library library45 = new control.Library();
        java.util.ArrayList<model.Loan> loanList46 = library45.getLoans();
        library0.setLoans(loanList46);
        model.Book book52 = new model.Book("", "hi!", 1, (int) (short) 100);
        java.lang.String str53 = book52.getAuthor();
        boolean boolean54 = book52.isAvailable();
        boolean boolean55 = book52.isAvailable();
        library0.addBook(book52);
        model.Book book61 = new model.Book(" by ", "hi!", (int) (byte) -1, (int) (byte) -1);
        java.lang.String str62 = book61.getTitle();
        control.Library library63 = new control.Library();
        model.Book book68 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book73 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray74 = new model.Book[] { book68, book73 };
        java.util.ArrayList<model.Book> bookList75 = new java.util.ArrayList<model.Book>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList75, bookArray74);
        library63.setBooks(bookList75);
        model.Book book82 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member85 = new model.Member((int) 'a', "");
        java.lang.String str86 = member85.getName();
        java.lang.String str87 = member85.toString();
        int int88 = member85.getId();
        java.time.LocalDate localDate89 = null;
        library63.lendBook(book82, member85, localDate89);
        java.time.LocalDate localDate91 = null;
        library0.lendBook(book61, member85, localDate91);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList46);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + " by " + "'", str62, " by ");
        org.junit.Assert.assertNotNull(bookArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 97 + "'", int88 == 97);
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        model.Book book4 = new model.Book("", "hi!", 1, (int) (short) 100);
        java.lang.String str5 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " by HI!" + "'", str5, " by HI!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        int int10 = loan4.getMemberId();
        java.time.LocalDate localDate11 = null;
        loan4.setReturnDate(localDate11);
        java.time.LocalDate localDate13 = null;
        loan4.extendLoan(localDate13);
        java.time.LocalDate localDate15 = loan4.getReturnDate();
        java.time.LocalDate localDate16 = null;
        loan4.extendLoan(localDate16);
        java.time.LocalDate localDate18 = null;
        loan4.extendLoan(localDate18);
        int int20 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(localDate15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        model.Member member2 = new model.Member((int) (short) 10, " by ");
        int int3 = member2.getId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Book> bookList1 = null;
        library0.setBooks(bookList1);
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Loan> loanList5 = library3.getLoans();
        control.Library library6 = new control.Library();
        model.Book book11 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book16 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray17 = new model.Book[] { book11, book16 };
        java.util.ArrayList<model.Book> bookList18 = new java.util.ArrayList<model.Book>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList18, bookArray17);
        library6.setBooks(bookList18);
        library6.listAllMembers();
        model.Book book26 = new model.Book("", "", (int) (byte) 1, 0);
        library6.addBook(book26);
        library3.addBook(book26);
        java.util.ArrayList<model.Book> bookList29 = library3.getBooks();
        library0.setBooks(bookList29);
        model.Book book35 = new model.Book("hi! by HI!", " by HI!", (int) (short) 1, 1);
        model.Member member38 = new model.Member((int) '#', "hi!");
        java.lang.String str39 = member38.toString();
        java.time.LocalDate localDate40 = null;
        library0.lendBook(book35, member38, localDate40);
        model.Book book46 = new model.Book("", "hi!", 0, (int) 'a');
        int int47 = book46.getValue();
        java.lang.String str48 = book46.getAuthor();
        java.lang.String str49 = book46.getTitle();
        boolean boolean50 = book46.isAvailable();
        book46.setAvailable(false);
        java.lang.String str53 = book46.getTitle();
        library0.addBook(book46);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookList29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 97 + "'", int47 == 97);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) ' ');
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        java.time.LocalDate localDate7 = loan4.getReturnDate();
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        java.time.LocalDate localDate10 = loan4.getReturnDate();
        java.time.LocalDate localDate11 = null;
        loan4.setReturnDate(localDate11);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate10);
    }
}

