/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 17:19:25 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.GCD;

public class GCD_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GCD gCD0 = new GCD();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = GCD.gcd(0, (-3181));
      assertEquals((-3181), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = GCD.gcd(4952, 4952);
      assertEquals(4952, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = GCD.gcd(0, 0);
      assertEquals(0, int0);
  }
}
