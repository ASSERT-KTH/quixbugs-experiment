/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 15:06:01 GMT 2018
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
      int int0 = GCD.gcd((-1), 728);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = GCD.gcd(543, 543);
      assertEquals(543, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = GCD.gcd(0, 0);
      assertEquals(0, int0);
  }
}
