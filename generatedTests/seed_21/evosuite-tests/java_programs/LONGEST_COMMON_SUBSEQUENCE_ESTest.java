/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 20:17:40 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.LONGEST_COMMON_SUBSEQUENCE;

public class LONGEST_COMMON_SUBSEQUENCE_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LONGEST_COMMON_SUBSEQUENCE lONGEST_COMMON_SUBSEQUENCE0 = new LONGEST_COMMON_SUBSEQUENCE();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("java_programs.LONGEST_COMMON_SUBSEQUENCE", "java_programs.LONGEST_COMMON_SUBSEQUENCE");
      assertEquals("java_programs.LONGEST_COMMON_SUBSEQUENCE", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("X[$UIGvoU@l^7C", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence("wvS_VF", "java_programs.LONGEST_COMMON_SUBSEQUENCE");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        LONGEST_COMMON_SUBSEQUENCE.longest_common_subsequence((String) null, "?/jf<kJ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
