/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 06 04:25:50 GMT 2018
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
      double double0 = SQRT.sqrt(1704.52228, 2537.77868);
      assertEquals(63.494588918592434, double0, 0.01);
  }

//  @Test(timeout = 4000)
//  public void test2()  throws Throwable  {
//      // Undeclared exception!
//      SQRT.sqrt((-1.0), (-57.3087439617));
//  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      double double0 = SQRT.sqrt((-759.0999383588), 1429.37688343);
      assertEquals((-12.020089170649891), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      double double0 = SQRT.sqrt(0.0, 0.0);
      assertEquals(0.0, double0, 0.01);
  }
}
