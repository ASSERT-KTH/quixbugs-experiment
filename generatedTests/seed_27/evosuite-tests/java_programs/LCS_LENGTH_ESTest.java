/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 19:26:21 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LCS_LENGTH;

public class LCS_LENGTH_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LCS_LENGTH lCS_LENGTH0 = new LCS_LENGTH();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        LCS_LENGTH.lcs_length("'_MX]Uo'", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("s'd)$HJ3v", "");
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length(".0`CttEb]3>AR2+Fbm", "|1fK.-}iBb`&&`Z4");
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("|1fK.-}iBb`&&`Z4", ".0`CttEb]3>AR2+Fbm");
      assertEquals(1, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = LCS_LENGTH.lcs_length("", "java_programs.LCS_LENGTH");
      assertEquals(0, (int)integer0);
  }
}