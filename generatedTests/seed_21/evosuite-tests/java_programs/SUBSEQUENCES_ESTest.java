/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 00:52:34 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SUBSEQUENCES;

public class SUBSEQUENCES_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 1, 1);
      assertEquals(1, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      SUBSEQUENCES.subsequences(1, 4821, 50);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SUBSEQUENCES.subsequences(1253, (-4195), (-3386));
  }
}
