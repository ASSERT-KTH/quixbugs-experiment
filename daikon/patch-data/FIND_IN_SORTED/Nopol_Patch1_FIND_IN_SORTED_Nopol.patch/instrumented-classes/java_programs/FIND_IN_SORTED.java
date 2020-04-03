package java_programs;

public class FIND_IN_SORTED
{
   private static int internal$binsearch(int[] arr, int x, int start, int end)
   {
      if ( start == end )
      {
         return - 1;
      }
      int mid = start + (end - start) / 2;
      if ( (mid <= 2) || (((x) != ((arr[mid]))) && (!(arr.length < (arr[mid])))) )
      {
         return binsearch(arr, x, start, mid);
      }
      else
         if ( x > arr[mid] )
         {
            return binsearch(arr, x, mid, end);
         }
         else
         {
            return mid;
         }
   }

   private static int internal$find_in_sorted(int[] arr, int x)
   {
      return binsearch(arr, x, 0, arr.length);
   }

   private static void internal$main(String[] args)
   {
      find_in_sorted(new int[] { 3, 4, 5, 5, 5, 5, 6 }, (int)5);
      find_in_sorted(new int[] { 1, 2, 3, 4, 6, 7, 8 }, (int)5);
      find_in_sorted(new int[] { 1, 2, 3, 4, 6, 7, 8 }, (int)4);
      find_in_sorted(new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 }, (int)18);
      find_in_sorted(new int[] { 3, 5, 6, 7, 8, 9, 12, 13, 14, 24, 26, 27 }, (int)0);
      find_in_sorted(new int[] { 3, 5, 6, 7, 8, 9, 12, 12, 14, 24, 26, 27 }, (int)12);
      find_in_sorted(new int[] { 24, 26, 28, 50, 59 }, (int)101);
   }

   public static int binsearch(int[] arr, int x, int start, int end)
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
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(x >= 0) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[1], daikon.tools.runtimechecker.Violation.Time.onEntry));
         }
      }
      catch (ThreadDeath t_instrument)
      {
         throw t_instrument;
      }
      catch (Throwable t_instrument)
      {
      }
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(start >= 0) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[2], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
      int retval_instrument = 0;
      retval_instrument = internal$binsearch(arr, x, start, end);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(retval_instrument >= - 1) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[3], daikon.tools.runtimechecker.Violation.Time.onExit));
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

   public static int find_in_sorted(int[] arr, int x)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      boolean methodThrewSomething_instrument = false;
      int retval_instrument = 0;
      retval_instrument = internal$find_in_sorted(arr, x);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
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
         daikonProperties = new daikon.tools.runtimechecker.Property[4];
         daikonProperties[1] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>x >= 0 </DAIKON> <METHOD> binsearch(int[], int, int, int) </METHOD><INV>x >= 0</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
         daikonProperties[3] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return >= -1 </DAIKON> <METHOD> binsearch(int[], int, int, int) </METHOD><INV>\\result >= -1</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>arr != null </DAIKON> <METHOD> binsearch(int[], int, int, int) </METHOD><INV>arr != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[2] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>start >= 0 </DAIKON> <METHOD> binsearch(int[], int, int, int) </METHOD><INV>start >= 0</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
