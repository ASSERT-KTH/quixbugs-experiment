/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 17:50:39 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java_programs.HANOI;

public class HANOI_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(2);
      HANOI.Pair<Object, String> hANOI_Pair0 = new HANOI.Pair<Object, String>(integer0, "dm*ca75U");
      String string0 = hANOI_Pair0.getSecond();
      assertEquals("dm*ca75U", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(2);
      HANOI.Pair<Integer, Object> hANOI_Pair0 = new HANOI.Pair<Integer, Object>(integer0, integer0);
      hANOI_Pair0.setFirst(integer0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(2);
      HANOI.Pair<Integer, Object> hANOI_Pair0 = new HANOI.Pair<Integer, Object>(integer0, integer0);
      hANOI_Pair0.setSecond((Object) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(2);
      HANOI.Pair<Integer, Object> hANOI_Pair0 = new HANOI.Pair<Integer, Object>(integer0, integer0);
      String string0 = hANOI_Pair0.toString();
      assertEquals("(2, 2)", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer((-1240));
      HANOI.Pair<String, Object> hANOI_Pair0 = new HANOI.Pair<String, Object>("^y])xtXK)x", integer0);
      Object object0 = hANOI_Pair0.getFirst();
      assertEquals("^y])xtXK)x", object0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      HANOI hANOI0 = new HANOI();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi(2, 2, 2);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      List<HANOI.Pair<Integer, Integer>> list0 = HANOI.hanoi((-3691), 1734, 0);
      assertEquals(0, list0.size());
  }
}
