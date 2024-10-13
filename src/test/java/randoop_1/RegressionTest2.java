package randoop_1;

import model.*;
import control.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

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
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        boolean boolean5 = book4.isAvailable();
        java.lang.String str6 = book4.getAuthor();
        java.lang.String str7 = book4.getTitle();
        boolean boolean8 = book4.isAvailable();
        book4.setAvailable(false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        model.Member member64 = new model.Member((int) (short) 10, "");
        java.lang.String str65 = member64.toString();
        java.lang.String str66 = member64.toString();
        java.time.LocalDate localDate67 = null;
        float float68 = library0.getMemberFine(member64, localDate67);
        int int69 = member64.getId();
        int int70 = member64.getId();
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
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + float68 + "' != '" + 0.0f + "'", float68 == 0.0f);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 10 + "'", int69 == 10);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 10 + "'", int70 == 10);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
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
        model.Member member49 = new model.Member((int) 'a', "");
        java.lang.String str50 = member49.getName();
        java.lang.String str51 = member49.getName();
        java.time.LocalDate localDate52 = null;
        float float53 = library0.getMemberFine(member49, localDate52);
        library0.listAllMembers();
        model.Member member57 = new model.Member(10, "");
        library0.addMember(member57);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + float53 + "' != '" + 0.0f + "'", float53 == 0.0f);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        model.Book book4 = new model.Book("", "hi!", 1, (int) (short) 100);
        java.lang.String str5 = book4.getAuthor();
        java.lang.String str6 = book4.getAuthor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        java.time.LocalDate localDate12 = null;
        loan4.setReturnDate(localDate12);
        java.time.LocalDate localDate14 = loan4.getReturnDate();
        java.time.LocalDate localDate15 = null;
        loan4.extendLoan(localDate15);
        int int17 = loan4.getMemberId();
        int int18 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
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
        model.Book book63 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member66 = new model.Member((int) 'a', "");
        java.lang.String str67 = member66.getName();
        java.lang.String str68 = member66.toString();
        int int69 = member66.getId();
        java.time.LocalDate localDate70 = null;
        library44.lendBook(book63, member66, localDate70);
        java.util.ArrayList<model.Loan> loanList72 = library44.getLoans();
        model.Member member75 = new model.Member((int) 'a', "");
        java.lang.String str76 = member75.getName();
        java.lang.String str77 = member75.getName();
        library44.addMember(member75);
        java.time.LocalDate localDate79 = null;
        float float80 = library0.getMemberFine(member75, localDate79);
        model.Member member83 = new model.Member((int) (short) 10, "");
        library0.addMember(member83);
        java.lang.String str85 = member83.getName();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(bookArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 97 + "'", int69 == 97);
        org.junit.Assert.assertNotNull(loanList72);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 0.0f + "'", float80 == 0.0f);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
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
        model.Member member55 = new model.Member((int) 'a', "");
        java.lang.String str56 = member55.getName();
        java.lang.String str57 = member55.getName();
        java.lang.String str58 = member55.toString();
        int int59 = member55.getId();
        int int60 = member55.getId();
        int int61 = member55.getId();
        library0.addMember(member55);
        int int63 = member55.getId();
        java.lang.String str64 = member55.toString();
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        java.time.LocalDate localDate9 = null;
        loan4.extendLoan(localDate9);
        int int11 = loan4.getBookCode();
        java.time.LocalDate localDate12 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float13 = loan4.calculateFine(localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
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
        java.util.ArrayList<model.Book> bookList56 = library0.getBooks();
        model.Member member57 = null;
        library0.addMember(member57);
        java.time.LocalDate localDate61 = null;
        model.Loan loan63 = new model.Loan(32, 97, localDate61, (float) ' ');
        java.time.LocalDate localDate64 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double65 = library0.getFineDiscount(loan63, localDate64);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(bookList56);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) '4', (int) (short) 10, localDate2, 0.0f);
        int int5 = loan4.getBookCode();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(35, 97, localDate2, (float) (short) -1);
        int int5 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
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
        model.Book book50 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book55 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray56 = new model.Book[] { book50, book55 };
        java.util.ArrayList<model.Book> bookList57 = new java.util.ArrayList<model.Book>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList57, bookArray56);
        library45.setBooks(bookList57);
        model.Book book64 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member67 = new model.Member((int) 'a', "");
        java.lang.String str68 = member67.getName();
        java.lang.String str69 = member67.toString();
        int int70 = member67.getId();
        java.time.LocalDate localDate71 = null;
        library45.lendBook(book64, member67, localDate71);
        java.time.LocalDate localDate75 = null;
        model.Loan loan77 = new model.Loan(0, (int) (short) -1, localDate75, (float) (short) -1);
        float float78 = loan77.getDailyFine();
        int int79 = loan77.getBookCode();
        java.time.LocalDate localDate82 = null;
        model.Loan loan84 = new model.Loan(0, (int) (short) -1, localDate82, (float) (short) -1);
        float float85 = loan84.getDailyFine();
        model.Loan[] loanArray86 = new model.Loan[] { loan77, loan84 };
        java.util.ArrayList<model.Loan> loanList87 = new java.util.ArrayList<model.Loan>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList87, loanArray86);
        library45.setLoans(loanList87);
        library0.setLoans(loanList87);
        library0.listAllBooks();
        java.util.ArrayList<model.Member> memberList92 = library0.getMembers();
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
        org.junit.Assert.assertNotNull(bookArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 97 + "'", int70 == 97);
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + (-1.0f) + "'", float78 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + (-1.0f) + "'", float85 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertNotNull(memberList92);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        model.Book book4 = new model.Book("hi! by ", " by  BY HI! BY HI! BY HI!", (int) '#', 10);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
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
        java.util.ArrayList<model.Loan> loanList47 = library0.getLoans();
        library0.listAllMembers();
        java.util.ArrayList<model.Loan> loanList49 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList50 = library0.getLoans();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertNotNull(loanList47);
        org.junit.Assert.assertNotNull(loanList49);
        org.junit.Assert.assertNotNull(loanList50);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) ' ');
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        java.time.LocalDate localDate7 = loan4.getReturnDate();
        java.time.LocalDate localDate8 = loan4.getReturnDate();
        int int9 = loan4.getBookCode();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
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
        library0.listAllMembers();
        java.util.ArrayList<model.Book> bookList46 = library0.getBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(bookList44);
        org.junit.Assert.assertNotNull(bookList46);
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
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
        model.Member member50 = new model.Member((int) (short) 10, "");
        model.Member member53 = new model.Member((int) 'a', "");
        java.lang.String str54 = member53.getName();
        model.Member member57 = new model.Member((int) 'a', "");
        java.lang.String str58 = member57.getName();
        java.lang.String str59 = member57.getName();
        model.Member member62 = new model.Member((int) 'a', "");
        java.lang.String str63 = member62.getName();
        java.lang.String str64 = member62.toString();
        int int65 = member62.getId();
        model.Member member68 = new model.Member((int) 'a', "");
        java.lang.String str69 = member68.getName();
        java.lang.String str70 = member68.getName();
        model.Member member73 = new model.Member((int) 'a', "");
        java.lang.String str74 = member73.getName();
        java.lang.String str75 = member73.toString();
        int int76 = member73.getId();
        model.Member[] memberArray77 = new model.Member[] { member50, member53, member57, member62, member68, member73 };
        java.util.ArrayList<model.Member> memberList78 = new java.util.ArrayList<model.Member>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList78, memberArray77);
        library47.setMembers(memberList78);
        control.Library library81 = new control.Library();
        java.util.ArrayList<model.Loan> loanList82 = library81.getLoans();
        library47.setLoans(loanList82);
        library0.setLoans(loanList82);
        java.util.ArrayList<model.Book> bookList85 = library0.getBooks();
        library0.listAllBooks();
        java.util.ArrayList<model.Loan> loanList87 = library0.getLoans();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertNotNull(memberArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(loanList82);
        org.junit.Assert.assertNotNull(bookList85);
        org.junit.Assert.assertNotNull(loanList87);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        model.Member member55 = new model.Member((int) 'a', "");
        java.lang.String str56 = member55.getName();
        java.lang.String str57 = member55.getName();
        java.lang.String str58 = member55.toString();
        int int59 = member55.getId();
        int int60 = member55.getId();
        int int61 = member55.getId();
        library0.addMember(member55);
        model.Book book67 = new model.Book("hi!", "", (int) '#', (int) (byte) 0);
        control.Library library68 = new control.Library();
        java.util.ArrayList<model.Loan> loanList69 = library68.getLoans();
        java.util.ArrayList<model.Book> bookList70 = library68.getBooks();
        model.Member member73 = new model.Member((-1), "hi!");
        library68.addMember(member73);
        java.lang.String str75 = member73.getName();
        java.lang.String str76 = member73.toString();
        java.time.LocalDate localDate77 = null;
        library0.lendBook(book67, member73, localDate77);
        model.Member member81 = new model.Member((int) (short) 100, "hi!");
        java.lang.String str82 = member81.toString();
        java.lang.String str83 = member81.getName();
        library0.addMember(member81);
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
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 97 + "'", int59 == 97);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 97 + "'", int61 == 97);
        org.junit.Assert.assertNotNull(loanList69);
        org.junit.Assert.assertNotNull(bookList70);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        control.Library library4 = new control.Library();
        model.Book book9 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book14 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray15 = new model.Book[] { book9, book14 };
        java.util.ArrayList<model.Book> bookList16 = new java.util.ArrayList<model.Book>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList16, bookArray15);
        library4.setBooks(bookList16);
        control.Library library19 = new control.Library();
        model.Book book24 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book29 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray30 = new model.Book[] { book24, book29 };
        java.util.ArrayList<model.Book> bookList31 = new java.util.ArrayList<model.Book>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList31, bookArray30);
        library19.setBooks(bookList31);
        model.Book book38 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member41 = new model.Member((int) 'a', "");
        java.lang.String str42 = member41.getName();
        java.lang.String str43 = member41.toString();
        int int44 = member41.getId();
        java.time.LocalDate localDate45 = null;
        library19.lendBook(book38, member41, localDate45);
        library4.addBook(book38);
        control.Library library48 = new control.Library();
        java.util.ArrayList<model.Loan> loanList49 = library48.getLoans();
        library4.setLoans(loanList49);
        control.Library library51 = new control.Library();
        model.Book book56 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book61 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray62 = new model.Book[] { book56, book61 };
        java.util.ArrayList<model.Book> bookList63 = new java.util.ArrayList<model.Book>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList63, bookArray62);
        library51.setBooks(bookList63);
        model.Book book70 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member73 = new model.Member((int) 'a', "");
        java.lang.String str74 = member73.getName();
        java.lang.String str75 = member73.toString();
        int int76 = member73.getId();
        java.time.LocalDate localDate77 = null;
        library51.lendBook(book70, member73, localDate77);
        int int79 = book70.getValue();
        library4.addBook(book70);
        int int81 = book70.getCode();
        int int82 = book70.getCode();
        int int83 = book70.getValue();
        int int84 = book70.getCode();
        java.lang.String str85 = book70.getAuthor();
        library0.addBook(book70);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(bookArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 97 + "'", int44 == 97);
        org.junit.Assert.assertNotNull(loanList49);
        org.junit.Assert.assertNotNull(bookArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 97 + "'", int79 == 97);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 97 + "'", int83 == 97);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
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
        java.util.ArrayList<model.Loan> loanList46 = library0.getLoans();
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList48 = library0.getMembers();
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
        org.junit.Assert.assertNotNull(loanList46);
        org.junit.Assert.assertNotNull(memberList48);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) -1, (int) ' ', localDate2, (float) 100L);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, (int) (short) 0, localDate2, (float) 100L);
        int int5 = loan4.getMemberId();
        float float6 = loan4.getDailyFine();
        int int7 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        int int16 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + 100.0f + "'", float11 == 100.0f);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        model.Book book4 = new model.Book("hi!", " by HI! by HI! BY HI!", (int) (short) -1, 100);
        int int5 = book4.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        int int14 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + (-1.0f) + "'", float13 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        model.Member member2 = new model.Member((-1), " by  BY HI! BY HI! BY HI!");
        java.lang.String str3 = member2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " by  BY HI! BY HI! BY HI!" + "'", str3, " by  BY HI! BY HI! BY HI!");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        control.Library library71 = new control.Library();
        java.util.ArrayList<model.Loan> loanList72 = library71.getLoans();
        java.util.ArrayList<model.Book> bookList73 = library71.getBooks();
        model.Member member76 = new model.Member((-1), "hi!");
        library71.addMember(member76);
        java.util.ArrayList<model.Loan> loanList78 = library71.getLoans();
        library0.setLoans(loanList78);
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
        org.junit.Assert.assertNotNull(loanList72);
        org.junit.Assert.assertNotNull(bookList73);
        org.junit.Assert.assertNotNull(loanList78);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        int int5 = loan4.getMemberId();
        java.time.LocalDate localDate6 = null;
        loan4.setReturnDate(localDate6);
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        float float10 = loan4.getDailyFine();
        float float11 = loan4.getDailyFine();
        float float12 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float11 + "' != '" + (-1.0f) + "'", float11 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.setReturnDate(localDate10);
        java.time.LocalDate localDate12 = null;
        loan4.setReturnDate(localDate12);
        java.time.LocalDate localDate14 = null;
        loan4.setReturnDate(localDate14);
        java.time.LocalDate localDate16 = loan4.getReturnDate();
        java.time.LocalDate localDate17 = loan4.getReturnDate();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate16);
        org.junit.Assert.assertNull(localDate17);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        float float7 = loan4.getDailyFine();
        int int8 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        model.Member member5 = new model.Member((-1), "hi!");
        library0.addMember(member5);
        java.lang.String str7 = member5.getName();
        java.lang.String str8 = member5.toString();
        java.lang.String str9 = member5.getName();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        model.Book book4 = new model.Book("hi! by HI!", " by  BY HI! BY HI! BY HI!", (int) (byte) -1, 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
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
        model.Member member50 = new model.Member((int) (short) 10, "");
        model.Member member53 = new model.Member((int) 'a', "");
        java.lang.String str54 = member53.getName();
        model.Member member57 = new model.Member((int) 'a', "");
        java.lang.String str58 = member57.getName();
        java.lang.String str59 = member57.getName();
        model.Member member62 = new model.Member((int) 'a', "");
        java.lang.String str63 = member62.getName();
        java.lang.String str64 = member62.toString();
        int int65 = member62.getId();
        model.Member member68 = new model.Member((int) 'a', "");
        java.lang.String str69 = member68.getName();
        java.lang.String str70 = member68.getName();
        model.Member member73 = new model.Member((int) 'a', "");
        java.lang.String str74 = member73.getName();
        java.lang.String str75 = member73.toString();
        int int76 = member73.getId();
        model.Member[] memberArray77 = new model.Member[] { member50, member53, member57, member62, member68, member73 };
        java.util.ArrayList<model.Member> memberList78 = new java.util.ArrayList<model.Member>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList78, memberArray77);
        library47.setMembers(memberList78);
        control.Library library81 = new control.Library();
        java.util.ArrayList<model.Loan> loanList82 = library81.getLoans();
        library47.setLoans(loanList82);
        library0.setLoans(loanList82);
        java.util.ArrayList<model.Book> bookList85 = library0.getBooks();
        java.util.ArrayList<model.Book> bookList86 = library0.getBooks();
        java.util.ArrayList<model.Book> bookList87 = library0.getBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertNotNull(memberArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(loanList82);
        org.junit.Assert.assertNotNull(bookList85);
        org.junit.Assert.assertNotNull(bookList86);
        org.junit.Assert.assertNotNull(bookList87);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) '4', (int) (byte) 1, localDate2, 0.0f);
        int int5 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        boolean boolean63 = book58.isAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        java.lang.String str39 = book38.getAuthor();
        java.lang.String str40 = book38.getTitle();
        model.Member member43 = new model.Member((int) 'a', "");
        java.lang.String str44 = member43.getName();
        java.lang.String str45 = member43.getName();
        java.lang.String str46 = member43.toString();
        java.lang.String str47 = member43.getName();
        java.time.LocalDate localDate48 = null;
        library0.lendBook(book38, member43, localDate48);
        java.lang.String str50 = member43.toString();
        int int51 = member43.getId();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 97 + "'", int51 == 97);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        java.lang.String str53 = book50.getTitle();
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
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        model.Member member68 = new model.Member((int) '#', "hi!");
        int int69 = member68.getId();
        java.lang.String str70 = member68.toString();
        java.time.LocalDate localDate71 = null;
        float float72 = library0.getMemberFine(member68, localDate71);
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertTrue("'" + float72 + "' != '" + 0.0f + "'", float72 == 0.0f);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        model.Book book4 = new model.Book("hi!", "hi! by HI!", (int) (short) -1, 0);
        int int5 = book4.getValue();
        java.lang.Class<?> wildcardClass6 = book4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) ' ');
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        int int7 = loan4.getMemberId();
        java.time.LocalDate localDate8 = loan4.getReturnDate();
        int int9 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, 32, localDate2, (-1.0f));
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        model.Book book4 = new model.Book("hi! by HI!", "hi!", (int) (byte) 100, (int) (byte) 0);
        java.lang.String str5 = book4.getTitle();
        book4.setAvailable(false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! by HI!" + "'", str5, "hi! by HI!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
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
        library0.listAllMembers();
        model.Member member41 = new model.Member((int) ' ', " by HI!");
        library0.addMember(member41);
        library0.listAllBooks();
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
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        control.Library library2 = new control.Library();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        control.Library library6 = new control.Library();
        java.util.ArrayList<model.Loan> loanList7 = library6.getLoans();
        java.util.ArrayList<model.Book> bookList8 = library6.getBooks();
        library3.setBooks(bookList8);
        library2.setBooks(bookList8);
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
        library2.setBooks(bookList63);
        model.Member member70 = new model.Member((int) 'a', "");
        java.lang.String str71 = member70.getName();
        java.lang.String str72 = member70.getName();
        java.time.LocalDate localDate73 = null;
        float float74 = library2.getMemberFine(member70, localDate73);
        library0.addMember(member70);
        model.Member member78 = new model.Member((int) 'a', "");
        java.lang.String str79 = member78.getName();
        java.lang.String str80 = member78.getName();
        java.lang.String str81 = member78.toString();
        int int82 = member78.getId();
        java.time.LocalDate localDate83 = null;
        float float84 = library0.getMemberFine(member78, localDate83);
        int int85 = member78.getId();
        java.lang.String str86 = member78.toString();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(loanList7);
        org.junit.Assert.assertNotNull(bookList8);
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 97 + "'", int82 == 97);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 97 + "'", int85 == 97);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
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
        library0.listAllBooks();
        control.Library library46 = new control.Library();
        model.Member member49 = new model.Member((int) (short) 10, "");
        model.Member member52 = new model.Member((int) 'a', "");
        java.lang.String str53 = member52.getName();
        model.Member member56 = new model.Member((int) 'a', "");
        java.lang.String str57 = member56.getName();
        java.lang.String str58 = member56.getName();
        model.Member member61 = new model.Member((int) 'a', "");
        java.lang.String str62 = member61.getName();
        java.lang.String str63 = member61.toString();
        int int64 = member61.getId();
        model.Member member67 = new model.Member((int) 'a', "");
        java.lang.String str68 = member67.getName();
        java.lang.String str69 = member67.getName();
        model.Member member72 = new model.Member((int) 'a', "");
        java.lang.String str73 = member72.getName();
        java.lang.String str74 = member72.toString();
        int int75 = member72.getId();
        model.Member[] memberArray76 = new model.Member[] { member49, member52, member56, member61, member67, member72 };
        java.util.ArrayList<model.Member> memberList77 = new java.util.ArrayList<model.Member>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList77, memberArray76);
        library46.setMembers(memberList77);
        java.util.ArrayList<model.Member> memberList80 = library46.getMembers();
        library0.setMembers(memberList80);
        library0.listAllBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(bookList44);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertNotNull(memberArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(memberList80);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 0, (int) (byte) -1, localDate2, (float) (short) 100);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        model.Book book4 = new model.Book("", "", (int) (byte) 1, 0);
        boolean boolean5 = book4.isAvailable();
        int int6 = book4.getValue();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        int int5 = book4.getCode();
        int int6 = book4.getCode();
        int int7 = book4.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 0, (int) ' ', localDate2, (float) 10L);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
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
        library0.listAllBooks();
        control.Library library46 = new control.Library();
        model.Member member49 = new model.Member((int) (short) 10, "");
        model.Member member52 = new model.Member((int) 'a', "");
        java.lang.String str53 = member52.getName();
        model.Member member56 = new model.Member((int) 'a', "");
        java.lang.String str57 = member56.getName();
        java.lang.String str58 = member56.getName();
        model.Member member61 = new model.Member((int) 'a', "");
        java.lang.String str62 = member61.getName();
        java.lang.String str63 = member61.toString();
        int int64 = member61.getId();
        model.Member member67 = new model.Member((int) 'a', "");
        java.lang.String str68 = member67.getName();
        java.lang.String str69 = member67.getName();
        model.Member member72 = new model.Member((int) 'a', "");
        java.lang.String str73 = member72.getName();
        java.lang.String str74 = member72.toString();
        int int75 = member72.getId();
        model.Member[] memberArray76 = new model.Member[] { member49, member52, member56, member61, member67, member72 };
        java.util.ArrayList<model.Member> memberList77 = new java.util.ArrayList<model.Member>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList77, memberArray76);
        library46.setMembers(memberList77);
        java.util.ArrayList<model.Member> memberList80 = library46.getMembers();
        library0.setMembers(memberList80);
        java.lang.Class<?> wildcardClass82 = library0.getClass();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(bookList44);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 97 + "'", int75 == 97);
        org.junit.Assert.assertNotNull(memberArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(memberList80);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) -1, (int) (byte) -1, localDate2, (float) 100);
        int int5 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        model.Book book4 = new model.Book(" by  BY HI! BY HI! BY HI!", " by ", 97, (int) ' ');
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        model.Member member2 = new model.Member((int) 'a', "");
        java.lang.String str3 = member2.getName();
        java.lang.String str4 = member2.toString();
        java.lang.String str5 = member2.getName();
        int int6 = member2.getId();
        java.lang.Class<?> wildcardClass7 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(52, (int) (byte) 10, localDate2, (float) '4');
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) 'a');
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
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
        int int40 = member37.getId();
        int int41 = member37.getId();
        int int42 = member37.getId();
        java.lang.String str43 = member37.toString();
        java.lang.String str44 = member37.getName();
        java.lang.Class<?> wildcardClass45 = member37.getClass();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(loanList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 97 + "'", int41 == 97);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) 0, (int) (byte) 1, localDate2, (float) (short) 0);
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        int int7 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        model.Book book4 = new model.Book(" by HI! by HI! BY HI!", " by  BY HI! BY HI! BY HI!", (int) (short) 100, (int) ' ');
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
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
        control.Library library23 = new control.Library();
        model.Book book28 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book33 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray34 = new model.Book[] { book28, book33 };
        java.util.ArrayList<model.Book> bookList35 = new java.util.ArrayList<model.Book>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList35, bookArray34);
        library23.setBooks(bookList35);
        model.Book book42 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member45 = new model.Member((int) 'a', "");
        java.lang.String str46 = member45.getName();
        java.lang.String str47 = member45.toString();
        int int48 = member45.getId();
        java.time.LocalDate localDate49 = null;
        library23.lendBook(book42, member45, localDate49);
        java.time.LocalDate localDate53 = null;
        model.Loan loan55 = new model.Loan(0, (int) (short) -1, localDate53, (float) (short) -1);
        float float56 = loan55.getDailyFine();
        int int57 = loan55.getBookCode();
        java.time.LocalDate localDate60 = null;
        model.Loan loan62 = new model.Loan(0, (int) (short) -1, localDate60, (float) (short) -1);
        float float63 = loan62.getDailyFine();
        model.Loan[] loanArray64 = new model.Loan[] { loan55, loan62 };
        java.util.ArrayList<model.Loan> loanList65 = new java.util.ArrayList<model.Loan>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList65, loanArray64);
        library23.setLoans(loanList65);
        java.util.ArrayList<model.Loan> loanList68 = library23.getLoans();
        java.util.ArrayList<model.Member> memberList69 = library23.getMembers();
        library0.setMembers(memberList69);
        java.util.ArrayList<model.Book> bookList71 = library0.getBooks();
        model.Member member74 = new model.Member((int) ' ', "hi! by HI!");
        int int75 = member74.getId();
        java.time.LocalDate localDate76 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float77 = library0.getMemberFine(member74, localDate76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(loanList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNull(loanList22);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-1.0f) + "'", float56 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + (-1.0f) + "'", float63 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(loanList68);
        org.junit.Assert.assertNotNull(memberList69);
        org.junit.Assert.assertNotNull(bookList71);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 32 + "'", int75 == 32);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
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
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        int int7 = loan4.getBookCode();
        int int8 = loan4.getMemberId();
        java.time.LocalDate localDate9 = null;
        loan4.setReturnDate(localDate9);
        java.time.LocalDate localDate11 = null;
        loan4.setReturnDate(localDate11);
        java.time.LocalDate localDate13 = null;
        loan4.extendLoan(localDate13);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        model.Member member2 = new model.Member(100, "hi! by HI!");
        java.lang.String str3 = member2.toString();
        java.lang.String str4 = member2.toString();
        java.lang.Class<?> wildcardClass5 = member2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! by HI!" + "'", str3, "hi! by HI!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi! by HI!" + "'", str4, "hi! by HI!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
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
        java.util.ArrayList<model.Loan> loanList40 = library0.getLoans();
        control.Library library41 = new control.Library();
        java.util.ArrayList<model.Loan> loanList42 = library41.getLoans();
        java.util.ArrayList<model.Loan> loanList43 = library41.getLoans();
        java.util.ArrayList<model.Member> memberList44 = library41.getMembers();
        model.Book book49 = new model.Book("", "hi!", (int) 'a', 0);
        boolean boolean50 = book49.isAvailable();
        library41.addBook(book49);
        java.util.ArrayList<model.Loan> loanList52 = library41.getLoans();
        library41.listAllMembers();
        library41.listAllMembers();
        library41.listAllMembers();
        model.Book book60 = new model.Book(" by HI! by HI! BY HI!", "hi! by HI!", (int) (short) 0, (int) (short) -1);
        java.lang.String str61 = book60.getAuthor();
        library41.addBook(book60);
        model.Book book67 = new model.Book(" by HI!", "", (int) (short) 100, (int) (short) 1);
        java.lang.String str68 = book67.getTitle();
        model.Member member71 = new model.Member(1, "hi! by HI!");
        java.time.LocalDate localDate72 = null;
        library41.lendBook(book67, member71, localDate72);
        java.time.LocalDate localDate74 = null;
        float float75 = library0.getMemberFine(member71, localDate74);
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
        org.junit.Assert.assertNotNull(loanList40);
        org.junit.Assert.assertNotNull(loanList42);
        org.junit.Assert.assertNotNull(loanList43);
        org.junit.Assert.assertNotNull(memberList44);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(loanList52);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi! by HI!" + "'", str61, "hi! by HI!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + " by HI!" + "'", str68, " by HI!");
        org.junit.Assert.assertTrue("'" + float75 + "' != '" + 0.0f + "'", float75 == 0.0f);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str5 = book4.getAuthor();
        book4.setAvailable(true);
        java.lang.String str8 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " by HI!" + "'", str8, " by HI!");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
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
        model.Book book45 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str46 = book45.getAuthor();
        model.Member member49 = new model.Member((int) (short) 10, "");
        java.lang.String str50 = member49.toString();
        int int51 = member49.getId();
        java.time.LocalDate localDate52 = null;
        library0.lendBook(book45, member49, localDate52);
        model.Member member56 = new model.Member((int) (short) -1, "");
        java.lang.String str57 = member56.toString();
        library0.addMember(member56);
        java.util.ArrayList<model.Member> memberList59 = library0.getMembers();
        java.util.ArrayList<model.Book> bookList60 = library0.getBooks();
        java.time.LocalDate localDate63 = null;
        model.Loan loan65 = new model.Loan(0, (int) (short) -1, localDate63, (float) (short) -1);
        int int66 = loan65.getMemberId();
        java.time.LocalDate localDate67 = null;
        loan65.setReturnDate(localDate67);
        java.time.LocalDate localDate69 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double70 = library0.getFineDiscount(loan65, localDate69);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " by HI!" + "'", str33, " by HI!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 10 + "'", int51 == 10);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(memberList59);
        org.junit.Assert.assertNotNull(bookList60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
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
        library0.listAllBooks();
        model.Book book25 = new model.Book("hi!", " by ", 0, 97);
        library0.addBook(book25);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(loanList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(32, 100, localDate2, (float) 1L);
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, 35, localDate2, 32.0f);
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Book> bookList3 = library0.getBooks();
        java.util.ArrayList<model.Member> memberList4 = library0.getMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(memberList4);
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        model.Book book4 = new model.Book(" by HI! by HI! BY HI!", "hi!", (int) (byte) 10, (int) (byte) 0);
        int int5 = book4.getCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        model.Member member2 = new model.Member((int) (byte) 10, "hi!");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        int int5 = loan4.getMemberId();
        java.time.LocalDate localDate6 = null;
        loan4.setReturnDate(localDate6);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = null;
        loan4.extendLoan(localDate6);
        int int8 = loan4.getBookCode();
        float float9 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + float9 + "' != '" + 100.0f + "'", float9 == 100.0f);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
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
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertNull(localDate9);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        java.time.LocalDate localDate7 = null;
        loan4.setReturnDate(localDate7);
        java.time.LocalDate localDate9 = loan4.getReturnDate();
        java.time.LocalDate localDate10 = null;
        loan4.setReturnDate(localDate10);
        float float12 = loan4.getDailyFine();
        int int13 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
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
        int int42 = book35.getValue();
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(loanList5);
        org.junit.Assert.assertNotNull(bookArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(bookList29);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
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
        java.lang.String str41 = book32.getTitle();
        java.lang.String str42 = book32.toString();
        int int43 = book32.getCode();
        book32.setAvailable(true);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + " by HI!" + "'", str33, " by HI!");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + " by HI!" + "'", str42, " by HI!");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
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
        model.Book book79 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str80 = book79.toString();
        model.Member member83 = new model.Member((int) 'a', "");
        java.lang.String str84 = member83.getName();
        java.lang.String str85 = member83.getName();
        java.time.LocalDate localDate86 = null;
        library47.lendBook(book79, member83, localDate86);
        library0.addBook(book79);
        java.util.ArrayList<model.Member> memberList89 = library0.getMembers();
        library0.listAllBooks();
        java.util.ArrayList<model.Book> bookList91 = library0.getBooks();
        java.util.ArrayList<model.Member> memberList92 = library0.getMembers();
        java.time.LocalDate localDate95 = null;
        model.Loan loan97 = new model.Loan(97, 35, localDate95, 32.0f);
        java.time.LocalDate localDate98 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double99 = library0.getFineDiscount(loan97, localDate98);
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
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertNotNull(bookArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 97 + "'", int72 == 97);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + " by HI!" + "'", str80, " by HI!");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(memberList89);
        org.junit.Assert.assertNotNull(bookList91);
        org.junit.Assert.assertNotNull(memberList92);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 100, 97, localDate2, (float) 10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
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
        java.util.ArrayList<model.Loan> loanList54 = library0.getLoans();
        java.util.ArrayList<model.Loan> loanList55 = null;
        library0.setLoans(loanList55);
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
        org.junit.Assert.assertNotNull(loanList54);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
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
        java.util.ArrayList<model.Loan> loanList47 = library0.getLoans();
        library0.listAllMembers();
        java.util.ArrayList<model.Book> bookList49 = library0.getBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertNotNull(loanList47);
        org.junit.Assert.assertNotNull(bookList49);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
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
        java.util.ArrayList<model.Loan> loanList47 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList48 = library0.getMembers();
        control.Library library49 = new control.Library();
        java.util.ArrayList<model.Loan> loanList50 = library49.getLoans();
        library0.setLoans(loanList50);
        model.Member member54 = new model.Member((int) (short) 10, "");
        java.lang.String str55 = member54.toString();
        java.lang.String str56 = member54.toString();
        library0.addMember(member54);
        java.lang.String str58 = member54.toString();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertNotNull(loanList47);
        org.junit.Assert.assertNotNull(memberList48);
        org.junit.Assert.assertNotNull(loanList50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str5 = book4.getAuthor();
        java.lang.String str6 = book4.getTitle();
        int int7 = book4.getCode();
        boolean boolean8 = book4.isAvailable();
        java.lang.String str9 = book4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " by HI!" + "'", str9, " by HI!");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
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
        model.Member member76 = new model.Member(0, "hi!");
        java.time.LocalDate localDate77 = null;
        float float78 = library0.getMemberFine(member76, localDate77);
        java.lang.String str79 = member76.toString();
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
        org.junit.Assert.assertTrue("'" + float78 + "' != '" + 0.0f + "'", float78 == 0.0f);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        model.Book book4 = new model.Book(" by HI!", "hi! by HI!", (int) (short) 1, (int) (byte) 1);
        book4.setAvailable(false);
        boolean boolean7 = book4.isAvailable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
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
        java.util.ArrayList<model.Loan> loanList47 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList48 = library0.getMembers();
        java.time.LocalDate localDate51 = null;
        model.Loan loan53 = new model.Loan(0, (int) (short) -1, localDate51, (float) (short) -1);
        float float54 = loan53.getDailyFine();
        int int55 = loan53.getBookCode();
        float float56 = loan53.getDailyFine();
        java.time.LocalDate localDate57 = null;
        loan53.extendLoan(localDate57);
        float float59 = loan53.getDailyFine();
        int int60 = loan53.getMemberId();
        java.time.LocalDate localDate61 = loan53.getReturnDate();
        int int62 = loan53.getBookCode();
        java.time.LocalDate localDate63 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double64 = library0.getFineDiscount(loan53, localDate63);
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
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertNotNull(loanList47);
        org.junit.Assert.assertNotNull(memberList48);
        org.junit.Assert.assertTrue("'" + float54 + "' != '" + (-1.0f) + "'", float54 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + float56 + "' != '" + (-1.0f) + "'", float56 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float59 + "' != '" + (-1.0f) + "'", float59 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNull(localDate61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
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
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        model.Book book4 = new model.Book(" by HI!", " by HI!", (int) (byte) 1, (-1));
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) -1, (int) (short) 10, localDate2, (float) (byte) 0);
        java.time.LocalDate localDate5 = loan4.getReturnDate();
        int int6 = loan4.getMemberId();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
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
        java.lang.String str22 = book20.getTitle();
        java.lang.String str23 = book20.toString();
        java.lang.String str24 = book20.getAuthor();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " by " + "'", str23, " by ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        model.Book book8 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str9 = book8.getAuthor();
        library0.addBook(book8);
        java.util.ArrayList<model.Loan> loanList11 = library0.getLoans();
        java.util.ArrayList<model.Member> memberList12 = library0.getMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(loanList11);
        org.junit.Assert.assertNotNull(memberList12);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) 100, (int) (short) 10, localDate2, 32.0f);
        java.time.LocalDate localDate5 = loan4.getReturnDate();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        java.time.LocalDate localDate7 = null;
        loan4.extendLoan(localDate7);
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        library0.setBooks(bookList5);
        java.util.ArrayList<model.Loan> loanList7 = library0.getLoans();
        model.Book book8 = null;
        library0.addBook(book8);
        library0.listAllBooks();
        library0.listAllMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(loanList7);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        int int7 = loan4.getBookCode();
        float float8 = loan4.getDailyFine();
        java.time.LocalDate localDate9 = loan4.getReturnDate();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        float float12 = loan4.getDailyFine();
        java.time.LocalDate localDate13 = null;
        loan4.extendLoan(localDate13);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertNull(localDate9);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + (-1.0f) + "'", float12 == (-1.0f));
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        model.Book book7 = new model.Book("", "hi!", (int) 'a', 0);
        library0.addBook(book7);
        java.time.LocalDate localDate11 = null;
        model.Loan loan13 = new model.Loan((int) 'a', 0, localDate11, (float) (short) 100);
        java.time.LocalDate localDate14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = library0.getFineDiscount(loan13, localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
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
        java.time.LocalDate localDate13 = null;
        loan4.setReturnDate(localDate13);
        java.time.LocalDate localDate15 = loan4.getReturnDate();
        java.time.LocalDate localDate16 = null;
        loan4.extendLoan(localDate16);
        java.time.LocalDate localDate18 = null;
        loan4.extendLoan(localDate18);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate12);
        org.junit.Assert.assertNull(localDate15);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        int int5 = book4.getCode();
        book4.setAvailable(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
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
        library0.listAllMembers();
        model.Member member41 = new model.Member((int) (byte) -1, " by HI!");
        java.time.LocalDate localDate42 = null;
        float float43 = library0.getMemberFine(member41, localDate42);
        int int44 = member41.getId();
        java.lang.String str45 = member41.getName();
        int int46 = member41.getId();
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
        org.junit.Assert.assertTrue("'" + float43 + "' != '" + 0.0f + "'", float43 == 0.0f);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + " by HI!" + "'", str45, " by HI!");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        control.Library library0 = new control.Library();
        model.Book book1 = null;
        library0.addBook(book1);
        java.util.ArrayList<model.Loan> loanList3 = null;
        library0.setLoans(loanList3);
        control.Library library5 = new control.Library();
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book15 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray16 = new model.Book[] { book10, book15 };
        java.util.ArrayList<model.Book> bookList17 = new java.util.ArrayList<model.Book>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList17, bookArray16);
        library5.setBooks(bookList17);
        library5.listAllMembers();
        model.Book book25 = new model.Book("", "", (int) (byte) 1, 0);
        library5.addBook(book25);
        java.util.ArrayList<model.Loan> loanList27 = library5.getLoans();
        control.Library library28 = new control.Library();
        model.Book book33 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book38 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray39 = new model.Book[] { book33, book38 };
        java.util.ArrayList<model.Book> bookList40 = new java.util.ArrayList<model.Book>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList40, bookArray39);
        library28.setBooks(bookList40);
        control.Library library43 = new control.Library();
        model.Book book48 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book53 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray54 = new model.Book[] { book48, book53 };
        java.util.ArrayList<model.Book> bookList55 = new java.util.ArrayList<model.Book>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList55, bookArray54);
        library43.setBooks(bookList55);
        model.Book book62 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member65 = new model.Member((int) 'a', "");
        java.lang.String str66 = member65.getName();
        java.lang.String str67 = member65.toString();
        int int68 = member65.getId();
        java.time.LocalDate localDate69 = null;
        library43.lendBook(book62, member65, localDate69);
        library28.addBook(book62);
        control.Library library72 = new control.Library();
        java.util.ArrayList<model.Loan> loanList73 = library72.getLoans();
        library28.setLoans(loanList73);
        java.util.ArrayList<model.Loan> loanList75 = library28.getLoans();
        java.util.ArrayList<model.Member> memberList76 = library28.getMembers();
        java.util.ArrayList<model.Member> memberList77 = library28.getMembers();
        library5.setMembers(memberList77);
        control.Library library79 = new control.Library();
        control.Library library80 = new control.Library();
        java.util.ArrayList<model.Loan> loanList81 = library80.getLoans();
        java.util.ArrayList<model.Book> bookList82 = library80.getBooks();
        model.Member member85 = new model.Member((-1), "hi!");
        library80.addMember(member85);
        java.time.LocalDate localDate87 = null;
        float float88 = library79.getMemberFine(member85, localDate87);
        java.util.ArrayList<model.Book> bookList89 = library79.getBooks();
        library5.setBooks(bookList89);
        library0.setBooks(bookList89);
        library0.listAllMembers();
        org.junit.Assert.assertNotNull(bookArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(loanList27);
        org.junit.Assert.assertNotNull(bookArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(bookArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 97 + "'", int68 == 97);
        org.junit.Assert.assertNotNull(loanList73);
        org.junit.Assert.assertNotNull(loanList75);
        org.junit.Assert.assertNotNull(memberList76);
        org.junit.Assert.assertNotNull(memberList77);
        org.junit.Assert.assertNotNull(loanList81);
        org.junit.Assert.assertNotNull(bookList82);
        org.junit.Assert.assertTrue("'" + float88 + "' != '" + 0.0f + "'", float88 == 0.0f);
        org.junit.Assert.assertNotNull(bookList89);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
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
        java.util.ArrayList<model.Member> memberList53 = library0.getMembers();
        java.util.ArrayList<model.Member> memberList54 = library0.getMembers();
        model.Book book59 = new model.Book("hi! by HI!", "", 35, (int) ' ');
        model.Member member62 = new model.Member((int) 'a', "");
        java.lang.String str63 = member62.getName();
        java.lang.String str64 = member62.getName();
        java.lang.String str65 = member62.toString();
        java.lang.String str66 = member62.toString();
        java.time.LocalDate localDate67 = null;
        library0.lendBook(book59, member62, localDate67);
        java.lang.String str69 = member62.toString();
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
        org.junit.Assert.assertNotNull(memberList53);
        org.junit.Assert.assertNotNull(memberList54);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        java.time.LocalDate localDate12 = null;
        loan4.setReturnDate(localDate12);
        java.time.LocalDate localDate14 = loan4.getReturnDate();
        java.time.LocalDate localDate15 = null;
        loan4.extendLoan(localDate15);
        java.time.LocalDate localDate17 = null;
        loan4.setReturnDate(localDate17);
        java.time.LocalDate localDate19 = null;
        loan4.extendLoan(localDate19);
        java.time.LocalDate localDate21 = null;
        loan4.setReturnDate(localDate21);
        int int23 = loan4.getMemberId();
        int int24 = loan4.getMemberId();
        float float25 = loan4.getDailyFine();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + (-1.0f) + "'", float25 == (-1.0f));
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Book> bookList3 = library0.getBooks();
        java.util.ArrayList<model.Loan> loanList4 = library0.getLoans();
        control.Library library5 = new control.Library();
        java.util.ArrayList<model.Loan> loanList6 = library5.getLoans();
        control.Library library7 = new control.Library();
        model.Book book12 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book17 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray18 = new model.Book[] { book12, book17 };
        java.util.ArrayList<model.Book> bookList19 = new java.util.ArrayList<model.Book>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList19, bookArray18);
        library7.setBooks(bookList19);
        model.Book book26 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member29 = new model.Member((int) 'a', "");
        java.lang.String str30 = member29.getName();
        java.lang.String str31 = member29.toString();
        int int32 = member29.getId();
        java.time.LocalDate localDate33 = null;
        library7.lendBook(book26, member29, localDate33);
        java.time.LocalDate localDate37 = null;
        model.Loan loan39 = new model.Loan(0, (int) (short) -1, localDate37, (float) (short) -1);
        float float40 = loan39.getDailyFine();
        int int41 = loan39.getBookCode();
        java.time.LocalDate localDate44 = null;
        model.Loan loan46 = new model.Loan(0, (int) (short) -1, localDate44, (float) (short) -1);
        float float47 = loan46.getDailyFine();
        model.Loan[] loanArray48 = new model.Loan[] { loan39, loan46 };
        java.util.ArrayList<model.Loan> loanList49 = new java.util.ArrayList<model.Loan>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList49, loanArray48);
        library7.setLoans(loanList49);
        control.Library library52 = new control.Library();
        java.util.ArrayList<model.Loan> loanList53 = library52.getLoans();
        java.util.ArrayList<model.Book> bookList54 = library52.getBooks();
        control.Library library55 = new control.Library();
        java.util.ArrayList<model.Loan> loanList56 = library55.getLoans();
        java.util.ArrayList<model.Book> bookList57 = library55.getBooks();
        library52.setBooks(bookList57);
        library7.setBooks(bookList57);
        library5.setBooks(bookList57);
        java.util.ArrayList<model.Loan> loanList61 = library5.getLoans();
        control.Library library62 = new control.Library();
        java.util.ArrayList<model.Loan> loanList63 = library62.getLoans();
        java.util.ArrayList<model.Loan> loanList64 = library62.getLoans();
        java.util.ArrayList<model.Member> memberList65 = library62.getMembers();
        library5.setMembers(memberList65);
        library5.listAllBooks();
        java.util.ArrayList<model.Loan> loanList68 = library5.getLoans();
        library0.setLoans(loanList68);
        model.Member member72 = new model.Member((int) ' ', " by HI! by HI! BY HI!");
        java.time.LocalDate localDate73 = null;
        float float74 = library0.getMemberFine(member72, localDate73);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(loanList6);
        org.junit.Assert.assertNotNull(bookArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertTrue("'" + float40 + "' != '" + (-1.0f) + "'", float40 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + float47 + "' != '" + (-1.0f) + "'", float47 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(loanList53);
        org.junit.Assert.assertNotNull(bookList54);
        org.junit.Assert.assertNotNull(loanList56);
        org.junit.Assert.assertNotNull(bookList57);
        org.junit.Assert.assertNotNull(loanList61);
        org.junit.Assert.assertNotNull(loanList63);
        org.junit.Assert.assertNotNull(loanList64);
        org.junit.Assert.assertNotNull(memberList65);
        org.junit.Assert.assertNotNull(loanList68);
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        model.Book book4 = new model.Book("hi!", " by HI! by HI! BY HI!", 0, (int) '4');
        java.lang.Class<?> wildcardClass5 = book4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
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
        model.Member member62 = null;
        library0.addMember(member62);
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList65 = library0.getMembers();
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
        org.junit.Assert.assertNotNull(memberList65);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
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
        java.util.ArrayList<model.Member> memberList53 = library0.getMembers();
        java.util.ArrayList<model.Member> memberList54 = library0.getMembers();
        model.Book book59 = new model.Book("hi! by HI!", "", 35, (int) ' ');
        model.Member member62 = new model.Member((int) 'a', "");
        java.lang.String str63 = member62.getName();
        java.lang.String str64 = member62.getName();
        java.lang.String str65 = member62.toString();
        java.lang.String str66 = member62.toString();
        java.time.LocalDate localDate67 = null;
        library0.lendBook(book59, member62, localDate67);
        java.lang.String str69 = book59.getAuthor();
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
        org.junit.Assert.assertNotNull(memberList53);
        org.junit.Assert.assertNotNull(memberList54);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        model.Book book4 = new model.Book(" by  BY HI! BY HI! BY HI!", " by  BY HI! BY HI! BY HI!", (int) ' ', (int) (short) 10);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        library0.setBooks(bookList5);
        model.Member member9 = new model.Member((int) (short) 100, "");
        library0.addMember(member9);
        java.lang.String str11 = member9.toString();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        boolean boolean5 = book4.isAvailable();
        int int6 = book4.getValue();
        java.lang.String str7 = book4.getTitle();
        java.lang.String str8 = book4.getTitle();
        java.lang.String str9 = book4.getTitle();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 97 + "'", int6 == 97);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, (int) (byte) 1, localDate2, (float) 1);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(52, (int) (short) 100, localDate2, (float) (short) 100);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        model.Book book4 = new model.Book("hi!", "hi!", (int) 'a', (int) (short) 1);
        java.lang.String str5 = book4.toString();
        int int6 = book4.getValue();
        int int7 = book4.getCode();
        java.lang.String str8 = book4.getAuthor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi! by HI!" + "'", str5, "hi! by HI!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
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
        model.Member member50 = new model.Member((int) (short) 10, "");
        model.Member member53 = new model.Member((int) 'a', "");
        java.lang.String str54 = member53.getName();
        model.Member member57 = new model.Member((int) 'a', "");
        java.lang.String str58 = member57.getName();
        java.lang.String str59 = member57.getName();
        model.Member member62 = new model.Member((int) 'a', "");
        java.lang.String str63 = member62.getName();
        java.lang.String str64 = member62.toString();
        int int65 = member62.getId();
        model.Member member68 = new model.Member((int) 'a', "");
        java.lang.String str69 = member68.getName();
        java.lang.String str70 = member68.getName();
        model.Member member73 = new model.Member((int) 'a', "");
        java.lang.String str74 = member73.getName();
        java.lang.String str75 = member73.toString();
        int int76 = member73.getId();
        model.Member[] memberArray77 = new model.Member[] { member50, member53, member57, member62, member68, member73 };
        java.util.ArrayList<model.Member> memberList78 = new java.util.ArrayList<model.Member>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList78, memberArray77);
        library47.setMembers(memberList78);
        control.Library library81 = new control.Library();
        java.util.ArrayList<model.Loan> loanList82 = library81.getLoans();
        library47.setLoans(loanList82);
        library0.setLoans(loanList82);
        java.util.ArrayList<model.Book> bookList85 = library0.getBooks();
        library0.listAllBooks();
        library0.listAllMembers();
        library0.listAllMembers();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 97 + "'", int65 == 97);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 97 + "'", int76 == 97);
        org.junit.Assert.assertNotNull(memberArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(loanList82);
        org.junit.Assert.assertNotNull(bookList85);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        java.time.LocalDate localDate12 = null;
        loan4.setReturnDate(localDate12);
        java.time.LocalDate localDate14 = loan4.getReturnDate();
        java.time.LocalDate localDate15 = null;
        loan4.extendLoan(localDate15);
        java.time.LocalDate localDate17 = loan4.getReturnDate();
        java.time.LocalDate localDate18 = null;
        loan4.extendLoan(localDate18);
        java.time.LocalDate localDate20 = loan4.getReturnDate();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(localDate14);
        org.junit.Assert.assertNull(localDate17);
        org.junit.Assert.assertNull(localDate20);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 1, localDate2, (float) 100L);
        float float5 = loan4.getDailyFine();
        float float6 = loan4.getDailyFine();
        int int7 = loan4.getMemberId();
        java.time.LocalDate localDate8 = null;
        loan4.setReturnDate(localDate8);
        java.time.LocalDate localDate10 = null;
        loan4.setReturnDate(localDate10);
        java.time.LocalDate localDate12 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float13 = loan4.calculateFine(localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 100.0f + "'", float6 == 100.0f);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
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
        boolean boolean66 = book56.isAvailable();
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
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        int int5 = book4.getValue();
        java.lang.String str6 = book4.getAuthor();
        java.lang.String str7 = book4.getTitle();
        java.lang.String str8 = book4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " by HI!" + "'", str8, " by HI!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
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
        int int82 = member76.getId();
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
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 97 + "'", int82 == 97);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(100, (int) (byte) 0, localDate2, (float) ' ');
        int int5 = loan4.getBookCode();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        int int7 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        int int12 = loan4.getMemberId();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        int int7 = loan4.getMemberId();
        java.time.LocalDate localDate8 = null;
        loan4.extendLoan(localDate8);
        float float10 = loan4.getDailyFine();
        java.time.LocalDate localDate11 = null;
        loan4.setReturnDate(localDate11);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + (-1.0f) + "'", float10 == (-1.0f));
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 0, (int) (byte) 10, localDate2, (float) '#');
        java.time.LocalDate localDate5 = null;
        loan4.setReturnDate(localDate5);
        java.time.LocalDate localDate7 = loan4.getReturnDate();
        int int8 = loan4.getMemberId();
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        model.Book book4 = new model.Book("hi! by HI!", "hi!", (int) (byte) 100, (int) (byte) 0);
        int int5 = book4.getCode();
        int int6 = book4.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, 0, localDate2, (float) (byte) 10);
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
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
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) ' ', (int) ' ', localDate2, 0.0f);
        java.time.LocalDate localDate5 = null;
        loan4.extendLoan(localDate5);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
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
        java.util.ArrayList<model.Book> bookList22 = library0.getBooks();
        control.Library library23 = new control.Library();
        model.Book book24 = null;
        library23.addBook(book24);
        control.Library library26 = new control.Library();
        control.Library library27 = new control.Library();
        model.Book book32 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book37 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray38 = new model.Book[] { book32, book37 };
        java.util.ArrayList<model.Book> bookList39 = new java.util.ArrayList<model.Book>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList39, bookArray38);
        library27.setBooks(bookList39);
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
        library27.addBook(book61);
        control.Library library71 = new control.Library();
        java.util.ArrayList<model.Loan> loanList72 = library71.getLoans();
        library27.setLoans(loanList72);
        java.util.ArrayList<model.Loan> loanList74 = library27.getLoans();
        library26.setLoans(loanList74);
        library23.setLoans(loanList74);
        library0.setLoans(loanList74);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(loanList12);
        org.junit.Assert.assertNotNull(bookList13);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(bookList22);
        org.junit.Assert.assertNotNull(bookArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(bookArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 97 + "'", int67 == 97);
        org.junit.Assert.assertNotNull(loanList72);
        org.junit.Assert.assertNotNull(loanList74);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        model.Member member2 = new model.Member((int) (short) 1, "hi! by HI!");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(97, (int) (short) 0, localDate2, (float) 100L);
        int int5 = loan4.getMemberId();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        library0.setBooks(bookList5);
        control.Library library7 = new control.Library();
        control.Library library8 = new control.Library();
        model.Book book13 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book18 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray19 = new model.Book[] { book13, book18 };
        java.util.ArrayList<model.Book> bookList20 = new java.util.ArrayList<model.Book>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList20, bookArray19);
        library8.setBooks(bookList20);
        control.Library library23 = new control.Library();
        model.Book book28 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book33 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray34 = new model.Book[] { book28, book33 };
        java.util.ArrayList<model.Book> bookList35 = new java.util.ArrayList<model.Book>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList35, bookArray34);
        library23.setBooks(bookList35);
        model.Book book42 = new model.Book("", "hi!", 0, (int) 'a');
        model.Member member45 = new model.Member((int) 'a', "");
        java.lang.String str46 = member45.getName();
        java.lang.String str47 = member45.toString();
        int int48 = member45.getId();
        java.time.LocalDate localDate49 = null;
        library23.lendBook(book42, member45, localDate49);
        library8.addBook(book42);
        control.Library library52 = new control.Library();
        java.util.ArrayList<model.Loan> loanList53 = library52.getLoans();
        library8.setLoans(loanList53);
        java.util.ArrayList<model.Loan> loanList55 = library8.getLoans();
        library7.setLoans(loanList55);
        library0.setLoans(loanList55);
        java.util.ArrayList<model.Book> bookList58 = library0.getBooks();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(bookArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(bookArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(loanList53);
        org.junit.Assert.assertNotNull(loanList55);
        org.junit.Assert.assertNotNull(bookList58);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        int int6 = loan4.getBookCode();
        float float7 = loan4.getDailyFine();
        float float8 = loan4.getDailyFine();
        int int9 = loan4.getMemberId();
        java.time.LocalDate localDate10 = null;
        loan4.extendLoan(localDate10);
        int int12 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + (-1.0f) + "'", float7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + float8 + "' != '" + (-1.0f) + "'", float8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
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
        java.util.ArrayList<model.Member> memberList41 = library0.getMembers();
        model.Book book46 = new model.Book("hi!", "", (int) '#', (int) (byte) 0);
        library0.addBook(book46);
        java.lang.String str48 = book46.getTitle();
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
        org.junit.Assert.assertNotNull(memberList41);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
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
        java.util.ArrayList<model.Book> bookList57 = library0.getBooks();
        library0.listAllMembers();
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
        org.junit.Assert.assertNotNull(bookList57);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(1, (-1), localDate2, (float) '4');
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
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
        java.lang.String str64 = member59.toString();
        java.lang.String str65 = member59.getName();
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
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        library0.listAllBooks();
        model.Book book9 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str10 = book9.getAuthor();
        java.lang.String str11 = book9.getTitle();
        java.lang.String str12 = book9.getAuthor();
        book9.setAvailable(false);
        book9.setAvailable(true);
        book9.setAvailable(false);
        library0.addBook(book9);
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
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
        library0.listAllMembers();
        model.Book book39 = null;
        library0.addBook(book39);
        library0.listAllBooks();
        java.util.ArrayList<model.Book> bookList42 = library0.getBooks();
        control.Library library43 = new control.Library();
        java.util.ArrayList<model.Book> bookList44 = library43.getBooks();
        model.Member member47 = new model.Member((int) (short) 1, "");
        java.time.LocalDate localDate48 = null;
        float float49 = library43.getMemberFine(member47, localDate48);
        library0.addMember(member47);
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
        org.junit.Assert.assertNotNull(bookList42);
        org.junit.Assert.assertNotNull(bookList44);
        org.junit.Assert.assertTrue("'" + float49 + "' != '" + 0.0f + "'", float49 == 0.0f);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) 100, (int) (short) 10, localDate2, 32.0f);
        java.time.LocalDate localDate5 = loan4.getReturnDate();
        float float6 = loan4.getDailyFine();
        java.time.LocalDate localDate7 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float8 = loan4.calculateFine(localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertTrue("'" + float6 + "' != '" + 32.0f + "'", float6 == 32.0f);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        model.Book book4 = new model.Book(" by  BY HI! BY HI! BY HI!", " by HI!", 100, (int) '#');
        java.lang.String str5 = book4.getAuthor();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + " by HI!" + "'", str5, " by HI!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
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
        library0.listAllMembers();
        java.util.ArrayList<model.Member> memberList78 = library0.getMembers();
        java.util.ArrayList<model.Book> bookList79 = library0.getBooks();
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
        org.junit.Assert.assertNotNull(memberList78);
        org.junit.Assert.assertNotNull(bookList79);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Book> bookList3 = library0.getBooks();
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
        java.time.LocalDate localDate34 = null;
        model.Loan loan36 = new model.Loan(0, (int) (short) -1, localDate34, (float) (short) -1);
        float float37 = loan36.getDailyFine();
        int int38 = loan36.getBookCode();
        java.time.LocalDate localDate41 = null;
        model.Loan loan43 = new model.Loan(0, (int) (short) -1, localDate41, (float) (short) -1);
        float float44 = loan43.getDailyFine();
        model.Loan[] loanArray45 = new model.Loan[] { loan36, loan43 };
        java.util.ArrayList<model.Loan> loanList46 = new java.util.ArrayList<model.Loan>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.Loan>) loanList46, loanArray45);
        library4.setLoans(loanList46);
        control.Library library49 = new control.Library();
        java.util.ArrayList<model.Loan> loanList50 = library49.getLoans();
        java.util.ArrayList<model.Book> bookList51 = library49.getBooks();
        control.Library library52 = new control.Library();
        java.util.ArrayList<model.Loan> loanList53 = library52.getLoans();
        java.util.ArrayList<model.Book> bookList54 = library52.getBooks();
        library49.setBooks(bookList54);
        library4.setBooks(bookList54);
        library0.setBooks(bookList54);
        library0.listAllBooks();
        library0.listAllMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(bookList3);
        org.junit.Assert.assertNotNull(bookArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 97 + "'", int29 == 97);
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + (-1.0f) + "'", float37 == (-1.0f));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + (-1.0f) + "'", float44 == (-1.0f));
        org.junit.Assert.assertNotNull(loanArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(loanList50);
        org.junit.Assert.assertNotNull(bookList51);
        org.junit.Assert.assertNotNull(loanList53);
        org.junit.Assert.assertNotNull(bookList54);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(10, 100, localDate2, (float) 52);
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) -1, (int) (byte) -1, localDate2, (float) 100);
        java.time.LocalDate localDate5 = loan4.getReturnDate();
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        model.Book book4 = new model.Book(" by ", "hi!", (int) (byte) -1, (int) (byte) -1);
        int int5 = book4.getCode();
        int int6 = book4.getCode();
        int int7 = book4.getValue();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        model.Book book4 = new model.Book("", "", 0, (int) '#');
        boolean boolean5 = book4.isAvailable();
        int int6 = book4.getCode();
        int int7 = book4.getCode();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((-1), 100, localDate2, (float) 35);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
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
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        model.Book book4 = new model.Book("hi!", "hi!", (int) 'a', (int) (short) 1);
        java.lang.String str5 = book4.getTitle();
        book4.setAvailable(true);
        java.lang.String str8 = book4.getAuthor();
        int int9 = book4.getValue();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(0, (int) (short) -1, localDate2, (float) (short) -1);
        float float5 = loan4.getDailyFine();
        java.time.LocalDate localDate6 = loan4.getReturnDate();
        java.time.LocalDate localDate7 = null;
        loan4.extendLoan(localDate7);
        java.time.LocalDate localDate9 = null;
        loan4.extendLoan(localDate9);
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + (-1.0f) + "'", float5 == (-1.0f));
        org.junit.Assert.assertNull(localDate6);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        model.Member member2 = new model.Member((int) (byte) 1, " by ");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
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
        model.Book book77 = new model.Book(" by ", "hi!", (int) (byte) -1, (int) (byte) -1);
        int int78 = book77.getCode();
        boolean boolean79 = book77.isAvailable();
        library0.addBook(book77);
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
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        java.util.ArrayList<model.Book> bookList2 = library0.getBooks();
        java.util.ArrayList<model.Member> memberList3 = library0.getMembers();
        model.Book book8 = new model.Book("", "hi!", 0, (int) 'a');
        java.lang.String str9 = book8.getAuthor();
        library0.addBook(book8);
        model.Book book15 = new model.Book("", "hi!", 0, (int) 'a');
        boolean boolean16 = book15.isAvailable();
        java.lang.String str17 = book15.getAuthor();
        model.Member member20 = new model.Member(0, "");
        java.lang.String str21 = member20.getName();
        int int22 = member20.getId();
        java.time.LocalDate localDate23 = null;
        library0.lendBook(book15, member20, localDate23);
        book15.setAvailable(false);
        java.lang.String str27 = book15.toString();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(bookList2);
        org.junit.Assert.assertNotNull(memberList3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " by HI!" + "'", str27, " by HI!");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        model.Book book4 = new model.Book("", "hi!", 0, (int) 'a');
        int int5 = book4.getValue();
        java.lang.String str6 = book4.getAuthor();
        java.lang.String str7 = book4.getTitle();
        int int8 = book4.getCode();
        java.lang.String str9 = book4.getTitle();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        library0.listAllMembers();
        java.util.ArrayList<model.Book> bookList16 = library0.getBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(bookList16);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        model.Member member2 = new model.Member(0, "");
        java.lang.String str3 = member2.getName();
        int int4 = member2.getId();
        java.lang.String str5 = member2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
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
        java.util.ArrayList<model.Loan> loanList45 = library0.getLoans();
        control.Library library46 = new control.Library();
        java.util.ArrayList<model.Loan> loanList47 = library46.getLoans();
        java.util.ArrayList<model.Book> bookList48 = library46.getBooks();
        model.Book book53 = new model.Book("", "hi!", (int) 'a', 0);
        library46.addBook(book53);
        library0.addBook(book53);
        java.util.ArrayList<model.Loan> loanList56 = library0.getLoans();
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
        org.junit.Assert.assertNotNull(loanList45);
        org.junit.Assert.assertNotNull(loanList47);
        org.junit.Assert.assertNotNull(bookList48);
        org.junit.Assert.assertNotNull(loanList56);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        model.Book book4 = new model.Book("", "hi!", 1, (int) (short) 100);
        java.lang.String str5 = book4.getAuthor();
        java.lang.String str6 = book4.toString();
        book4.setAvailable(false);
        boolean boolean9 = book4.isAvailable();
        boolean boolean10 = book4.isAvailable();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " by HI!" + "'", str6, " by HI!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(32, 97, localDate2, (float) ' ');
        int int5 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
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
        control.Library library41 = new control.Library();
        java.util.ArrayList<model.Loan> loanList42 = library41.getLoans();
        java.util.ArrayList<model.Loan> loanList43 = library41.getLoans();
        control.Library library44 = new control.Library();
        model.Member member47 = new model.Member((int) (short) 10, "");
        model.Member member50 = new model.Member((int) 'a', "");
        java.lang.String str51 = member50.getName();
        model.Member member54 = new model.Member((int) 'a', "");
        java.lang.String str55 = member54.getName();
        java.lang.String str56 = member54.getName();
        model.Member member59 = new model.Member((int) 'a', "");
        java.lang.String str60 = member59.getName();
        java.lang.String str61 = member59.toString();
        int int62 = member59.getId();
        model.Member member65 = new model.Member((int) 'a', "");
        java.lang.String str66 = member65.getName();
        java.lang.String str67 = member65.getName();
        model.Member member70 = new model.Member((int) 'a', "");
        java.lang.String str71 = member70.getName();
        java.lang.String str72 = member70.toString();
        int int73 = member70.getId();
        model.Member[] memberArray74 = new model.Member[] { member47, member50, member54, member59, member65, member70 };
        java.util.ArrayList<model.Member> memberList75 = new java.util.ArrayList<model.Member>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList75, memberArray74);
        library44.setMembers(memberList75);
        library41.setMembers(memberList75);
        java.util.ArrayList<model.Book> bookList79 = library41.getBooks();
        library0.setBooks(bookList79);
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(loanList28);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(loanList42);
        org.junit.Assert.assertNotNull(loanList43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 97 + "'", int73 == 97);
        org.junit.Assert.assertNotNull(memberArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(bookList79);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
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
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(loanList28);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        control.Library library0 = new control.Library();
        model.Book book5 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book book10 = new model.Book("", "hi!", 0, (int) 'a');
        model.Book[] bookArray11 = new model.Book[] { book5, book10 };
        java.util.ArrayList<model.Book> bookList12 = new java.util.ArrayList<model.Book>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<model.Book>) bookList12, bookArray11);
        library0.setBooks(bookList12);
        java.util.ArrayList<model.Loan> loanList15 = library0.getLoans();
        control.Library library16 = new control.Library();
        model.Member member19 = new model.Member((int) (short) 10, "");
        model.Member member22 = new model.Member((int) 'a', "");
        java.lang.String str23 = member22.getName();
        model.Member member26 = new model.Member((int) 'a', "");
        java.lang.String str27 = member26.getName();
        java.lang.String str28 = member26.getName();
        model.Member member31 = new model.Member((int) 'a', "");
        java.lang.String str32 = member31.getName();
        java.lang.String str33 = member31.toString();
        int int34 = member31.getId();
        model.Member member37 = new model.Member((int) 'a', "");
        java.lang.String str38 = member37.getName();
        java.lang.String str39 = member37.getName();
        model.Member member42 = new model.Member((int) 'a', "");
        java.lang.String str43 = member42.getName();
        java.lang.String str44 = member42.toString();
        int int45 = member42.getId();
        model.Member[] memberArray46 = new model.Member[] { member19, member22, member26, member31, member37, member42 };
        java.util.ArrayList<model.Member> memberList47 = new java.util.ArrayList<model.Member>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.Member>) memberList47, memberArray46);
        library16.setMembers(memberList47);
        model.Book book54 = new model.Book("", "hi!", 0, (int) 'a');
        int int55 = book54.getValue();
        library16.addBook(book54);
        java.util.ArrayList<model.Member> memberList57 = library16.getMembers();
        library0.setMembers(memberList57);
        library0.listAllMembers();
        library0.listAllBooks();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(loanList15);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 97 + "'", int45 == 97);
        org.junit.Assert.assertNotNull(memberArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
        org.junit.Assert.assertNotNull(memberList57);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
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
        int int46 = book36.getCode();
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        control.Library library0 = new control.Library();
        java.util.ArrayList<model.Loan> loanList1 = library0.getLoans();
        control.Library library2 = new control.Library();
        control.Library library3 = new control.Library();
        java.util.ArrayList<model.Loan> loanList4 = library3.getLoans();
        java.util.ArrayList<model.Book> bookList5 = library3.getBooks();
        control.Library library6 = new control.Library();
        java.util.ArrayList<model.Loan> loanList7 = library6.getLoans();
        java.util.ArrayList<model.Book> bookList8 = library6.getBooks();
        library3.setBooks(bookList8);
        library2.setBooks(bookList8);
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
        library2.setBooks(bookList63);
        model.Member member70 = new model.Member((int) 'a', "");
        java.lang.String str71 = member70.getName();
        java.lang.String str72 = member70.getName();
        java.time.LocalDate localDate73 = null;
        float float74 = library2.getMemberFine(member70, localDate73);
        library0.addMember(member70);
        model.Member member78 = new model.Member((int) 'a', "");
        java.lang.String str79 = member78.getName();
        java.lang.String str80 = member78.getName();
        java.lang.String str81 = member78.toString();
        int int82 = member78.getId();
        java.time.LocalDate localDate83 = null;
        float float84 = library0.getMemberFine(member78, localDate83);
        library0.listAllBooks();
        java.util.ArrayList<model.Member> memberList86 = library0.getMembers();
        org.junit.Assert.assertNotNull(loanList1);
        org.junit.Assert.assertNotNull(loanList4);
        org.junit.Assert.assertNotNull(bookList5);
        org.junit.Assert.assertNotNull(loanList7);
        org.junit.Assert.assertNotNull(bookList8);
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
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertTrue("'" + float74 + "' != '" + 0.0f + "'", float74 == 0.0f);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 97 + "'", int82 == 97);
        org.junit.Assert.assertTrue("'" + float84 + "' != '" + 0.0f + "'", float84 == 0.0f);
        org.junit.Assert.assertNotNull(memberList86);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (short) 10, 0, localDate2, (float) ' ');
        int int5 = loan4.getBookCode();
        int int6 = loan4.getBookCode();
        java.time.LocalDate localDate7 = null;
        loan4.setReturnDate(localDate7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan((int) (byte) 100, (int) (short) 100, localDate2, (float) ' ');
        int int5 = loan4.getBookCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
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
        java.util.ArrayList<model.Book> bookList58 = library0.getBooks();
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
        org.junit.Assert.assertNotNull(bookList58);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
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
        library0.listAllMembers();
        java.time.LocalDate localDate62 = null;
        model.Loan loan64 = new model.Loan((int) (short) 10, 0, localDate62, (float) ' ');
        int int65 = loan64.getMemberId();
        int int66 = loan64.getMemberId();
        java.time.LocalDate localDate67 = null;
        loan64.setReturnDate(localDate67);
        float float69 = loan64.getDailyFine();
        float float70 = loan64.getDailyFine();
        java.time.LocalDate localDate71 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double72 = library0.getFineDiscount(loan64, localDate71);
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
        org.junit.Assert.assertNotNull(loanList56);
        org.junit.Assert.assertNotNull(memberList57);
        org.junit.Assert.assertNotNull(memberList58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 10 + "'", int66 == 10);
        org.junit.Assert.assertTrue("'" + float69 + "' != '" + 32.0f + "'", float69 == 32.0f);
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 32.0f + "'", float70 == 32.0f);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
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
        java.time.LocalDate localDate15 = null;
        // The following exception was thrown during execution in test generation
        try {
            float float16 = loan4.calculateFine(localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + float5 + "' != '" + 100.0f + "'", float5 == 100.0f);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        java.time.LocalDate localDate2 = null;
        model.Loan loan4 = new model.Loan(32, 32, localDate2, (float) 10L);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        model.Member member2 = new model.Member((int) (short) 10, " by HI!");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
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
        model.Book book33 = new model.Book(" by HI!", "", (int) (short) 100, (int) (short) 1);
        java.lang.String str34 = book33.getTitle();
        library0.addBook(book33);
        int int36 = book33.getCode();
        org.junit.Assert.assertNotNull(bookArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(loanList28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + " by HI!" + "'", str34, " by HI!");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
    }
}

