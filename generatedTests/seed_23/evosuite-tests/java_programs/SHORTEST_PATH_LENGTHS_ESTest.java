/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 02:08:10 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java_programs.SHORTEST_PATH_LENGTHS;
import org.evosuite.runtime.ViolatedAssumptionAnswer;

public class SHORTEST_PATH_LENGTHS_ESTest {

//  @Test(timeout = 60000)
//  public void test0()  throws Throwable  {
//      int int0 = 0;
//      int int1 = 941;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(941, hashMap0);
//  }

//  @Test(timeout = 60000)
//  public void test1()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      int int0 = 1832;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
//      Integer integer0 = new Integer(1832);
//      hashMap0.put(linkedList0, integer0);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(1832, hashMap0);
//  }

//  @Test(timeout = 60000)
//  public void test2()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      int int0 = 99999;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(99999, hashMap0);
//  }
//
//  @Test(timeout = 60000)
//  public void test3()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      int int0 = (-1190);
//      int int1 = 3768;
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(3768, hashMap0);
//  }

  @Test(timeout = 60000)
  public void test4()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      int int0 = (-1);
      Map<List<Integer>, Integer> map0 = null;
      // Undeclared exception!
      try { 
        SHORTEST_PATH_LENGTHS.shortest_path_lengths(2438, (Map<List<Integer>, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

//  @Test(timeout = 60000)
//  public void test5()  throws Throwable  {
//      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
//      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
//      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-811), hashMap0);
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-811), map0);
//      int int0 = 99999;
//      int int1 = (-2862);
//      Map<List<Integer>, Integer> map1 = null;
//      Map<List<Integer>, Integer> map2 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-2862), (Map<List<Integer>, Integer>) null);
//      // Undeclared exception!
//      SHORTEST_PATH_LENGTHS.shortest_path_lengths(99999, map2);
//  }

  @Test(timeout = 60000)
  public void test6()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-234));
      hashMap0.put(linkedList0, integer0);
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, hashMap0);
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map0);
      Map<List<Integer>, Integer> map2 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map1);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map0);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map1);
      Map<List<Integer>, Integer> map3 = SHORTEST_PATH_LENGTHS.shortest_path_lengths((-3850), map2);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, map3);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map3);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, map0);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-234), map2);
  }

  @Test(timeout = 60000)
  public void test7()  throws Throwable  {
      int int0 = 2;
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      int int1 = (-126);
      Integer integer0 = new Integer((-126));
      linkedList0.add(integer0);
      Integer integer1 = new Integer(0);
      Integer.toUnsignedLong(116);
      hashMap0.put(linkedList0, integer1);
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      Integer integer2 = new Integer(2);
      Integer integer3 = new Integer(942);
      linkedList1.add(integer3);
      linkedList1.add(integer2);
      hashMap0.put(linkedList1, (Integer) null);
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, hashMap0);
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-1), hashMap0);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, map0);
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(2, hashMap0);
      Map<List<Integer>, Integer> map1 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(0, hashMap0);
      // Undeclared exception!
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(116, map1);
  }

  @Test(timeout = 60000)
  public void test8()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
      int int0 = (-2278);
      HashMap<List<Integer>, Integer> hashMap0 = null;
      try {
        hashMap0 = new HashMap<List<Integer>, Integer>((-2278), (-5957.29F));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -2278
         //
      }
  }

  @Test(timeout = 60000)
  public void test9()  throws Throwable  {
      int int0 = (-89);
      int int1 = 0;
      HashMap<List<Integer>, Integer> hashMap0 = null;
      try {
        hashMap0 = new HashMap<List<Integer>, Integer>((-89));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal initial capacity: -89
         //
      }
  }
}
