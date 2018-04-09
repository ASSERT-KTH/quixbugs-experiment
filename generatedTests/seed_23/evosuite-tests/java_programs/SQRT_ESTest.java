/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 00:35:08 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.SQRT;

public class SQRT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SQRT sQRT0 = new SQRT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      double double0 = SQRT.sqrt(1014.96550495634, 1014.96550495634);
      assertEquals(41.69941734969119, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      SQRT.sqrt((-3397.421857891395), 1524.860582265);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = SQRT.sqrt((-1.0), 2.0);
      assertEquals((-0.5), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = SQRT.sqrt(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}
