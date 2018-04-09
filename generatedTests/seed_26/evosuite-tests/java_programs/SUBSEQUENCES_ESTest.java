/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 01:11:06 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java_programs.SUBSEQUENCES;

public class SUBSEQUENCES_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      int int0 = (-1);
      int int1 = 1111;
      SUBSEQUENCES.subsequences(int0, int1, int0);
      int int2 = 864;
      SUBSEQUENCES.subsequences(int2, int2, int2);
      int int3 = 0;
      int int4 = 798;
      SUBSEQUENCES.subsequences(int3, int4, int4);
      int int5 = 0;
      int int6 = 0;
      SUBSEQUENCES.subsequences(int5, int6, int5);
      int int7 = 0;
      int int8 = (-4141);
      int int9 = 3480;
      SUBSEQUENCES.subsequences(int7, int8, int9);
      int int10 = 50;
      SUBSEQUENCES.subsequences(int10, int10, int10);
      int int11 = 1426;
      SUBSEQUENCES.subsequences(int8, int7, int11);
      int int12 = 766;
      SUBSEQUENCES.subsequences(int11, int12, int7);
      int int13 = 2041;
      int int14 = 0;
      int int15 = 1;
      SUBSEQUENCES.subsequences(int13, int14, int15);
      int int16 = (-75);
      SUBSEQUENCES.subsequences(int12, int16, int7);
      int int17 = 0;
      SUBSEQUENCES.subsequences(int3, int17, int15);
      int int18 = (-1);
      int int19 = 50;
      SUBSEQUENCES.subsequences(int10, int18, int19);
      int int20 = 0;
      SUBSEQUENCES.subsequences(int20, int9, int5);
      int int21 = (-1955);
      int int22 = 3253;
      SUBSEQUENCES.subsequences(int7, int21, int22);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(0, 0, 0);
      assertFalse(arrayList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      ArrayList<ArrayList> arrayList0 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(1, 1792, 1);
      assertEquals(1791, arrayList0.size());
      
      ArrayList<ArrayList> arrayList1 = (ArrayList<ArrayList>)SUBSEQUENCES.subsequences(679, 1, 1792);
      assertFalse(arrayList1.equals((Object)arrayList0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SUBSEQUENCES.subsequences(0, 50, 1058);
      SUBSEQUENCES sUBSEQUENCES0 = new SUBSEQUENCES();
      // Undeclared exception!
      SUBSEQUENCES.subsequences((-1026), 50, 50);
  }
}
