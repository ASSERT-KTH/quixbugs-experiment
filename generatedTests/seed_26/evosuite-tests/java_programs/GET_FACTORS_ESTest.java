/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 17:27:41 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.GET_FACTORS;

public class GET_FACTORS_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GET_FACTORS gET_FACTORS0 = new GET_FACTORS();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = GET_FACTORS.get_factors(0);
      assertTrue(arrayList0.contains(0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = GET_FACTORS.get_factors(1);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = GET_FACTORS.get_factors(204);
      assertFalse(arrayList0.contains(204));
      assertEquals(4, arrayList0.size());
  }
}
