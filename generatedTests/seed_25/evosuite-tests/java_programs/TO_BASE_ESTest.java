/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 01:34:04 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.TO_BASE;

public class TO_BASE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TO_BASE tO_BASE0 = new TO_BASE();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        TO_BASE.to_base(1, 0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = TO_BASE.to_base((-1980), (-1980));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TO_BASE.to_base(1937, (-946));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      TO_BASE.to_base(1, 1);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String string0 = TO_BASE.to_base(1322, 1322);
      assertEquals("10", string0);
  }
}
