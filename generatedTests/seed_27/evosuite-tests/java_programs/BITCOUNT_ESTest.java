/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 12:55:54 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.BITCOUNT;

public class BITCOUNT_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BITCOUNT bITCOUNT0 = new BITCOUNT();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = BITCOUNT.bitcount((-2011));
      assertEquals(24, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = BITCOUNT.bitcount(0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = BITCOUNT.bitcount(32);
      assertEquals(1, int0);
  }
}
