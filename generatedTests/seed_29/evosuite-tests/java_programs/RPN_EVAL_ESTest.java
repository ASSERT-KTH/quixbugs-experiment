/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 23:48:16 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java_programs.RPN_EVAL;

public class RPN_EVAL_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RPN_EVAL rPN_EVAL0 = new RPN_EVAL();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(745);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval(arrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.lang.String
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
      Double double0 = new Double(600.923);
      arrayList0.add(double0);
      Double double1 = RPN_EVAL.rpn_eval(arrayList0);
      assertTrue(arrayList0.contains(double1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval((ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Double double0 = new Double((-344.57));
      arrayList0.add((Object) double0);
      Double double1 = RPN_EVAL.rpn_eval(arrayList0);
      assertEquals((-344.57), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Double double0 = Double.valueOf((double) 0);
      arrayList0.add((Object) double0);
      arrayList0.add((Object) "+");
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval(arrayList0);
        fail("Expecting exception: EmptyStackException");
      
      } catch(EmptyStackException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>(0);
      Double double0 = Double.valueOf((double) 0);
      arrayList0.add((Object) double0);
      Double double1 = new Double(0);
      arrayList0.add((Object) double1);
      arrayList0.add((Object) "+");
      Double double2 = RPN_EVAL.rpn_eval(arrayList0);
      assertEquals(0.0, (double)double2, 0.01);
  }
}
