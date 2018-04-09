/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 23:33:56 GMT 2018
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
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Object object0 = new Object();
      arrayList0.add(object0);
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval(arrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.String
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
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
  public void test3()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
      Double double0 = new Double(0.0);
      arrayList0.add(double0);
      Double double1 = RPN_EVAL.rpn_eval(arrayList0);
      assertTrue(arrayList0.contains(double1));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
      Double double0 = new Double(1450.3672659);
      arrayList0.add(double0);
      Double double1 = RPN_EVAL.rpn_eval(arrayList0);
      assertEquals(1450.3672659, (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
      Double double0 = new Double((-1749.190971186));
      arrayList0.add(double0);
      Double double1 = RPN_EVAL.rpn_eval(arrayList0);
      assertEquals((-1749.190971186), (double)double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ArrayList<Double> arrayList0 = new ArrayList<Double>();
      Double double0 = new Double(0.0);
      arrayList0.add(double0);
      Double double1 = new Double((-900.0849477025937));
      arrayList0.add(double1);
      arrayList0.add((Double) null);
      // Undeclared exception!
      try { 
        RPN_EVAL.rpn_eval(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
