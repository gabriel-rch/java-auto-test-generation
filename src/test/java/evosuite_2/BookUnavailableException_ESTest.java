/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 13 15:36:54 GMT 2024
 */

package evosuite_2;

import org.junit.Test;
import static org.junit.Assert.*;
import exception.BookUnavailableException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BookUnavailableException_ESTest extends BookUnavailableException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BookUnavailableException bookUnavailableException0 = new BookUnavailableException();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BookUnavailableException bookUnavailableException0 = new BookUnavailableException("A5");
  }
}
