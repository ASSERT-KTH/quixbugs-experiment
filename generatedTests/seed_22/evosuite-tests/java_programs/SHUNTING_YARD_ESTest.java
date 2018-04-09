/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 23:53:31 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java_programs.SHUNTING_YARD;

public class SHUNTING_YARD_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SHUNTING_YARD sHUNTING_YARD0 = new SHUNTING_YARD();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      // Undeclared exception!
      try { 
        SHUNTING_YARD.shunting_yard(arrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      List list0 = SHUNTING_YARD.shunting_yard(arrayList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(1076);
      arrayList0.add(integer0);
      List list0 = SHUNTING_YARD.shunting_yard(arrayList0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("-");
      arrayList0.add("-");
      List list0 = SHUNTING_YARD.shunting_yard(arrayList0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("-");
      arrayList0.add("*");
      List list0 = SHUNTING_YARD.shunting_yard(arrayList0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      // Undeclared exception!
      try { 
        SHUNTING_YARD.shunting_yard((ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("*");
      arrayList0.add("-");
      List list0 = SHUNTING_YARD.shunting_yard(arrayList0);
      assertEquals(2, list0.size());
  }
}
