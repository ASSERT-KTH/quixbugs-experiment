package java_programs;

import java.util.*;

public class QUICKSORT
{
   private static ArrayList<Integer> internal$quicksort(ArrayList<Integer> arr)
   {
      if ( arr.isEmpty() )
      {
         return new ArrayList<Integer>();
      }
      Integer pivot = arr.get(0);
      ArrayList<Integer> lesser = new ArrayList<Integer>();
      ArrayList<Integer> greater = new ArrayList<Integer>();
      for (  Integer x : arr.subList(1, arr.size()))
      {
         if ( x < pivot )
         {
            lesser.add(x);
         }
         else
            greater.add(x);
      }
      ArrayList<Integer> middle = new ArrayList<Integer>();
      middle.add(pivot);
      lesser = quicksort(lesser);
      greater = quicksort(greater);
      greater = quicksort(greater);
      middle.addAll(greater);
      lesser.addAll(middle);
      return lesser;
   }

   private static void internal$main(String[] args)
   {
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(1, 2, 6, 72, 7, 33, 4)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 4, 3, 2, 1)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 4, 3, 1, 2)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 1, 14, 9, 15, 5, 4, 3, 7, 17, 11, 18, 2, 12, 16, 13, 6, 10)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 14, 7, 16, 9, 5, 24, 21, 19, 17, 12, 10, 1, 15, 23, 25, 11, 3, 2, 6, 22, 8, 20, 4, 18)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 5, 15, 7, 9, 14, 11, 12, 10, 6, 2, 4, 13, 1, 3)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 3, 7, 6, 5, 2, 1)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 3, 1, 5, 2)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 4, 2, 3, 6, 7, 1)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 16, 6, 1, 14, 19, 15, 2, 9, 4, 18, 17, 12, 3, 11, 8, 13, 5, 7)));
      quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 16, 6, 1, 14, 19, 15, 2, 9, 4, 18)));
   }

   public static ArrayList<Integer> quicksort(ArrayList<Integer> arr)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(arr != null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[0], daikon.tools.runtimechecker.Violation.Time.onEntry));
         }
      }
      catch (ThreadDeath t_instrument)
      {
         throw t_instrument;
      }
      catch (Throwable t_instrument)
      {
      }
      boolean methodThrewSomething_instrument = false;
      ArrayList<Integer> retval_instrument = null;
      retval_instrument = internal$quicksort(arr);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(retval_instrument != null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[1], daikon.tools.runtimechecker.Violation.Time.onExit));
         }
      }
      catch (ThreadDeath t_instrument)
      {
         throw t_instrument;
      }
      catch (Throwable t_instrument)
      {
      }
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onExit);
      return retval_instrument;
   }

   public static void main(String[] args)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      boolean methodThrewSomething_instrument = false;
      internal$main(args);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onExit);
   }

   private void checkObjectInvariants_instrument(daikon.tools.runtimechecker.Violation.Time time)
   {
   }

   private static void checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time time)
   {
   }

   public static java.util.Set getDaikonInvariants()
   {
      return new java.util.HashSet(java.util.Arrays.asList(daikonProperties));
   }

   public static boolean isDaikonInstrumented()
   {
      return true;
   }

   private static daikon.tools.runtimechecker.Property[] daikonProperties ;

   static
   {
      try
      {
         daikonProperties = new daikon.tools.runtimechecker.Property[2];
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>arr != null </DAIKON> <METHOD> quicksort(java.util.ArrayList) </METHOD><INV>arr != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[1] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return != null </DAIKON> <METHOD> quicksort(java.util.ArrayList) </METHOD><INV>\\result != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
