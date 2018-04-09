/*
 * This file was automatically generated by EvoSuite
 * Sun Apr 08 19:02:42 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java_programs.KNAPSACK;

public class KNAPSACK_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      int[][] intArray0 = new int[5][9];
      int[] intArray1 = new int[5];
      intArray1[0] = 0;
      intArray1[1] = 0;
      intArray1[2] = 0;
      intArray1[3] = 0;
      intArray1[4] = 0;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[8];
      intArray2[0] = 0;
      intArray2[1] = 0;
      intArray2[2] = 1;
      intArray2[3] = 0;
      intArray2[4] = 0;
      intArray2[5] = 0;
      intArray2[6] = 0;
      intArray0[1] = intArray2;
      int[] intArray3 = new int[6];
      intArray3[0] = 0;
      intArray3[2] = 0;
      intArray3[2] = 1;
      intArray3[4] = 1;
      intArray3[5] = 0;
      intArray0[2] = intArray3;
      int[] intArray4 = new int[4];
      intArray4[0] = 0;
      intArray4[1] = 1;
      intArray4[2] = 0;
      intArray4[3] = 0;
      intArray0[4] = intArray4;
      int[] intArray5 = new int[2];
      intArray5[0] = 0;
      intArray5[1] = 0;
      intArray0[4] = intArray5;
      int int0 = KNAPSACK.knapsack(0, intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[][] intArray0 = new int[1][8];
      int[] intArray1 = new int[5];
      intArray1[0] = 680;
      intArray1[1] = 680;
      intArray1[2] = 680;
      intArray1[3] = 680;
      intArray1[4] = 680;
      intArray0[0] = intArray1;
      KNAPSACK.knapsack(680, intArray0);
      KNAPSACK.knapsack(2474, intArray0);
      KNAPSACK.knapsack(678, intArray0);
      KNAPSACK.knapsack(701, intArray0);
      // Undeclared exception!
      KNAPSACK.knapsack(680, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[][] intArray0 = new int[2][3];
      int[] intArray1 = new int[4];
      intArray1[0] = 817;
      intArray1[1] = 817;
      intArray1[2] = 817;
      intArray1[3] = 817;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[4];
      assertFalse(intArray2.equals((Object)intArray1));
      
      intArray2[0] = 817;
      intArray2[1] = 0;
      intArray2[2] = 817;
      intArray2[3] = 817;
      intArray0[1] = intArray2;
      int int0 = KNAPSACK.knapsack(817, intArray0);
      assertEquals(817, int0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[][] intArray0 = new int[2][6];
      int[] intArray1 = new int[7];
      intArray1[0] = 3001;
      intArray1[1] = 3001;
      intArray1[2] = 3001;
      intArray1[3] = 3001;
      intArray1[4] = 3001;
      intArray1[5] = 3001;
      intArray1[6] = 3001;
      intArray0[0] = intArray1;
      int[] intArray2 = new int[2];
      assertFalse(intArray2.equals((Object)intArray1));
      
      intArray2[0] = 0;
      intArray2[1] = 3001;
      intArray0[1] = intArray2;
      int int0 = KNAPSACK.knapsack(3001, intArray0);
      assertEquals(6002, int0);
      assertEquals(2, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      int[][] intArray0 = new int[1][5];
      int[] intArray1 = new int[0];
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack(0, intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-1258), (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      int[][] intArray0 = new int[0][3];
      int int0 = KNAPSACK.knapsack(274, intArray0);
      assertEquals(0, int0);
      assertEquals(0, intArray0.length);
      
      KNAPSACK kNAPSACK0 = new KNAPSACK();
      assertNotNull(kNAPSACK0);
      
      // Undeclared exception!
      try { 
        KNAPSACK.knapsack((-962), intArray0);
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
