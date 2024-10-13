/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 15:43:31 GMT 2024
 */

package evosuite_3;

import org.junit.Test;
import static org.junit.Assert.*;
import model.Book;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Book_ESTest extends Book_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Book book0 = new Book("", "", 605, 605);
      assertTrue(book0.isAvailable());
      
      book0.setAvailable(false);
      boolean boolean0 = book0.isAvailable();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Book book0 = new Book("", "", 0, 0);
      int int0 = book0.getValue();
      assertEquals(0, int0);
      assertTrue(book0.isAvailable());
      assertEquals(0, book0.getCode());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Book book0 = new Book("1b70=6j2", "1b70=6j2", (-3384), (-3384));
      int int0 = book0.getValue();
      assertEquals((-3384), int0);
      assertEquals((-3384), book0.getCode());
      assertTrue(book0.isAvailable());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Book book0 = new Book((String) null, (String) null, 0, 0);
      book0.getTitle();
      assertTrue(book0.isAvailable());
      assertEquals(0, book0.getCode());
      assertEquals(0, book0.getValue());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Book book0 = new Book("!`Xd(;bs|;", "!`Xd(;bs|;", 692, 692);
      book0.getTitle();
      assertTrue(book0.isAvailable());
      assertEquals(692, book0.getValue());
      assertEquals(692, book0.getCode());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Book book0 = new Book("", "", 1, 1);
      int int0 = book0.getCode();
      assertEquals(1, book0.getValue());
      assertEquals(1, int0);
      assertTrue(book0.isAvailable());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Book book0 = new Book((String) null, (String) null, (-4122), 2);
      int int0 = book0.getCode();
      assertTrue(book0.isAvailable());
      assertEquals((-4122), int0);
      assertEquals(2, book0.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Book book0 = new Book((String) null, (String) null, (-4122), 2);
      book0.getAuthor();
      assertEquals((-4122), book0.getCode());
      assertEquals(2, book0.getValue());
      assertTrue(book0.isAvailable());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Book book0 = new Book("", "", 605, 605);
      book0.getAuthor();
      assertEquals(605, book0.getCode());
      assertTrue(book0.isAvailable());
      assertEquals(605, book0.getValue());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Book book0 = new Book("pe", "pe", 0, 0);
      int int0 = book0.getCode();
      assertEquals(0, book0.getValue());
      assertEquals(0, int0);
      assertTrue(book0.isAvailable());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Book book0 = new Book("", "", 11, 11);
      String string0 = book0.toString();
      assertEquals(" by ", string0);
      assertEquals(11, book0.getValue());
      assertEquals(11, book0.getCode());
      assertTrue(book0.isAvailable());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Book book0 = new Book("pe", "pe", 0, 0);
      book0.getAuthor();
      assertEquals(0, book0.getCode());
      assertEquals(0, book0.getValue());
      assertTrue(book0.isAvailable());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Book book0 = new Book("", "", 11, 11);
      int int0 = book0.getValue();
      assertTrue(book0.isAvailable());
      assertEquals(11, book0.getCode());
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Book book0 = new Book("pe", "pe", 0, 0);
      boolean boolean0 = book0.isAvailable();
      assertEquals(0, book0.getValue());
      assertEquals(0, book0.getCode());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Book book0 = new Book("", "", 11, 11);
      book0.getTitle();
      assertEquals(11, book0.getValue());
      assertEquals(11, book0.getCode());
      assertTrue(book0.isAvailable());
  }
}
