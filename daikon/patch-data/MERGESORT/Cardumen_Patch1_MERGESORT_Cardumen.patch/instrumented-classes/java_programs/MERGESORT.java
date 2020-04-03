package java_programs;

import java.util.*;

public class MERGESORT
{
   private static ArrayList<Integer> internal$merge(ArrayList<Integer> left, ArrayList<Integer> right)
   {
      ArrayList<Integer> result = new ArrayList<Integer>(100);
      int i = 0;
      int j = 0;
      while ( i < left.size() && j < right.size() )
      {
         if ( left.get(i) <= right.get(j) )
         {
            result.add(left.get(i));
            i++;
         }
         else
         {
            result.add(right.get(j));
            j++;
         }
      }
      result.addAll(left.subList(i, left.size()).isEmpty() ? right.subList(j, right.size()) : left.subList(i, left.size()));
      return result;
   }

   private static ArrayList<Integer> internal$mergesort(ArrayList<Integer> arr)
   {
      if ( ((arr.size()) / 2) == 0 )
      {
         return arr;
      }
      else
      {
         int middle = arr.size() / 2;
         ArrayList<Integer> left = new ArrayList<Integer>(100);
         left.addAll(arr.subList(0, middle));
         left = mergesort(left);
         ArrayList<Integer> right = new ArrayList<Integer>(100);
         right.addAll(arr.subList(middle, arr.size()));
         right = mergesort(right);
         return merge(left, right);
      }
   }

   private static void internal$main(String[] args)
   {
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 2, 6, 72, 7, 33, 4)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9, 3)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 4, 3, 2, 1)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 4, 3, 1, 2)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 1, 14, 9, 15, 5, 4, 3, 7, 17, 11, 18, 2, 12, 16, 13, 6, 10)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 4, 5, 2, 17, 14, 10, 6, 15, 8, 12, 13, 16, 3, 1, 7, 11)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 14, 7, 16, 9, 5, 24, 21, 19, 17, 12, 10, 1, 15, 23, 25, 11, 3, 2, 6, 22, 8, 20, 4, 18)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 5, 15, 7, 9, 14, 11, 12, 10, 6, 2, 4, 13, 1, 3)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 3, 7, 6, 5, 2, 1)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 3, 1, 5, 2)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 4, 2, 3, 6, 7, 1)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 16, 6, 1, 14, 19, 15, 2, 9, 4, 18, 17, 12, 3, 11, 8, 13, 5, 7)));
      mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 16, 6, 1, 14, 19, 15, 2, 9, 4, 18)));
   }

   public static ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(left != null) )
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
         if ( !(right != null) )
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
         if ( !(daikon.Quant.size(left) >= 1) )
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
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(daikon.Quant.size(right) >= 1) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[3], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
      retval_instrument = internal$merge(left, right);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(retval_instrument != null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[4], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !(daikon.Quant.size(retval_instrument) >= 2) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[5], daikon.tools.runtimechecker.Violation.Time.onExit));
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

   public static ArrayList<Integer> mergesort(ArrayList<Integer> arr)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(arr != null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[6], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
         if ( !(daikon.Quant.size(arr) >= 1) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[7], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
      retval_instrument = internal$mergesort(arr);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(retval_instrument != null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[8], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !(daikon.Quant.size(retval_instrument) >= 1) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[9], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         daikonProperties = new daikon.tools.runtimechecker.Property[10];
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>left != null </DAIKON> <METHOD> merge(java.util.ArrayList, java.util.ArrayList) </METHOD><INV>left != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[1] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>right != null </DAIKON> <METHOD> merge(java.util.ArrayList, java.util.ArrayList) </METHOD><INV>right != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[2] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>size(left[..]) >= 1 </DAIKON> <METHOD> merge(java.util.ArrayList, java.util.ArrayList) </METHOD><INV>daikon.Quant.size(left) >= 1</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
         daikonProperties[3] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>size(right[..]) >= 1 </DAIKON> <METHOD> merge(java.util.ArrayList, java.util.ArrayList) </METHOD><INV>daikon.Quant.size(right) >= 1</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
         daikonProperties[5] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>size(return[..]) >= 2 </DAIKON> <METHOD> merge(java.util.ArrayList, java.util.ArrayList) </METHOD><INV>daikon.Quant.size(\\result) >= 2</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
         daikonProperties[6] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>arr != null </DAIKON> <METHOD> mergesort(java.util.ArrayList) </METHOD><INV>arr != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[8] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return != null </DAIKON> <METHOD> mergesort(java.util.ArrayList) </METHOD><INV>\\result != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[9] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>size(return[..]) >= 1 </DAIKON> <METHOD> mergesort(java.util.ArrayList) </METHOD><INV>daikon.Quant.size(\\result) >= 1</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
         daikonProperties[7] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>size(arr[..]) >= 1 </DAIKON> <METHOD> mergesort(java.util.ArrayList) </METHOD><INV>daikon.Quant.size(arr) >= 1</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBound </DAIKONCLASS></INVINFO>");
         daikonProperties[4] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return != null </DAIKON> <METHOD> merge(java.util.ArrayList, java.util.ArrayList) </METHOD><INV>\\result != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
