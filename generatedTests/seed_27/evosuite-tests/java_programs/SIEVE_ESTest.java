/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 00:22:38 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SIEVE;

public class SIEVE_ESTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SIEVE sIEVE0 = new SIEVE();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>(0);
      Boolean boolean0 = Boolean.FALSE;
      arrayList0.add(boolean0);
      boolean boolean1 = SIEVE.all(arrayList0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Integer integer0 = new Integer(1294);
      // Undeclared exception!
      SIEVE.sieve(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>(0);
      Boolean boolean0 = Boolean.FALSE;
      arrayList0.add(boolean0);
      boolean boolean1 = SIEVE.any(arrayList0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer(45);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp(868, arrayList0);
      boolean boolean0 = SIEVE.any(arrayList1);
      assertTrue(boolean0);
      assertEquals(14, arrayList1.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.all((ArrayList<Boolean>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArrayList<Boolean> arrayList0 = new ArrayList<Boolean>(0);
      arrayList0.add((Boolean) null);
      // Undeclared exception!
      try { 
        SIEVE.any(arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer(0);
      arrayList0.add(integer0);
      // Undeclared exception!
      try { 
        SIEVE.list_comp((-691), arrayList0);
        fail("Expecting exception: ArithmeticException");
      
      } catch(ArithmeticException e) {
         //
         // / by zero
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      arrayList0.add((Integer) null);
      // Undeclared exception!
      try { 
        SIEVE.list_comp((-1), arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        SIEVE.sieve((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp((-1797), arrayList0);
      boolean boolean0 = SIEVE.all(arrayList1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(0);
      ArrayList<Integer> arrayList0 = SIEVE.sieve(integer0);
      assertEquals(0, arrayList0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-431));
      boolean boolean0 = arrayList0.add(integer0);
      ArrayList<Boolean> arrayList1 = SIEVE.list_comp((-1482), arrayList0);
      assertFalse(arrayList1.contains(boolean0));
      assertFalse(arrayList1.isEmpty());
  }
}