/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 21:34:48 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.NEXT_PALINDROME;

public class NEXT_PALINDROME_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NEXT_PALINDROME nEXT_PALINDROME0 = new NEXT_PALINDROME();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = new int[1];
      intArray0[0] = 9;
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[1, 1]", string0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = new int[1];
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[1]", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = new int[6];
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[0, 0, 1, 1, 0, 0]", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[] intArray0 = new int[0];
      // Undeclared exception!
      try { 
        NEXT_PALINDROME.next_palindrome(intArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // List length = -1
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        NEXT_PALINDROME.next_palindrome((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[] intArray0 = new int[6];
      intArray0[3] = 9;
      intArray0[4] = 2415;
      String string0 = NEXT_PALINDROME.next_palindrome(intArray0);
      assertEquals("[0, 1, 0, 0, 2416, 0]", string0);
  }
}
