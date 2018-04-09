/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 09 02:31:13 GMT 2018
 */

package java_programs;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java_programs.SHORTEST_PATH_LENGTHS;

public class SHORTEST_PATH_LENGTHS_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SHORTEST_PATH_LENGTHS sHORTEST_PATH_LENGTHS0 = new SHORTEST_PATH_LENGTHS();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SHORTEST_PATH_LENGTHS.shortest_path_lengths(90, (Map<List<Integer>, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>(0, 753.17F);
      Map<List<Integer>, Integer> map0 = SHORTEST_PATH_LENGTHS.shortest_path_lengths(1, hashMap0);
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<List<Integer>, Integer> hashMap0 = new HashMap<List<Integer>, Integer>();
      // Undeclared exception!
      SHORTEST_PATH_LENGTHS.shortest_path_lengths(4211, hashMap0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SHORTEST_PATH_LENGTHS.shortest_path_lengths((-2327), (Map<List<Integer>, Integer>) null);
  }
}
