/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 17:57:33 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java_programs.HANOI;

public class HANOI_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HANOI.Pair<String, Integer> hANOI_Pair0 = new HANOI.Pair<String, Integer>(".:|j", integer0);
      Integer integer1 = hANOI_Pair0.getSecond();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(hANOI0, "");
      hANOI_Pair0.setFirst(hANOI0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(hANOI0, "");
      hANOI_Pair0.setSecond("V+C\u0005z|%`'C2|h'z");
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(hANOI0, "");
      String string0 = hANOI_Pair0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer(0);
      HANOI.Pair<Object, Object> hANOI_Pair0 = new HANOI.Pair<Object, Object>(integer0, integer0);
      Object object0 = hANOI_Pair0.getFirst();
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-4242), (-4242), (-4242));
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(1, 2, 0);
      assertEquals(1, list0.size());
  }
}
