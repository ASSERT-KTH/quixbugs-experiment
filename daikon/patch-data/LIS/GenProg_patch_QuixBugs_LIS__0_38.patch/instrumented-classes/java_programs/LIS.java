package java_programs;

import java.util.*;

public class LIS
{
   private static int internal$lis(int[] arr)
   {
      int longest = 0;
      Map<Integer,Integer> ends = new HashMap<Integer,Integer>(100);
      int i = 0;
      for (  int val : arr)
      {
         ArrayList<Integer> prefix_lengths = new ArrayList<Integer>(100);
         for ( int j = 1 ; j < longest + 1 ; j++)
         {
            if ( arr[ends.get(j)] < val )
            {
               prefix_lengths.add(j);
            }
         }
         int length = !prefix_lengths.isEmpty() ? Collections.max(prefix_lengths) : 0;
         ends.put(length + 1, i);
         ends.put(length + 1, i);
         ends.put(length + 1, i);
         ends.put(length + 1, i);
         if ( length == longest || val < arr[ends.get(length + 1)] )
         {
            for ( int j = 1 ; j < longest + 1 ; j++)
            {
               if ( arr[ends.get(j)] < val )
               {
                  prefix_lengths.add(j);
               }
            }
            for ( int j = 1 ; j < longest + 1 ; j++)
            {
               if ( arr[ends.get(j)] < val )
               {
                  prefix_lengths.add(j);
               }
            }
            longest = length + 1;
         }
         i++;
      }
      return longest;
   }

   private static void internal$main(String[] args)
   {
      lis(new int[] { 4, 1, 5, 3, 7, 6, 2 });
      lis(new int[] { 10, 22, 9, 33, 21, 50, 41, 60, 80 });
      lis(new int[] { 7, 10, 9, 2, 3, 8, 1 });
      lis(new int[] { 9, 11, 2, 13, 7, 15 });
   }

   public static int lis(int[] arr)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(daikon.Quant.size(arr) == 6 || daikon.Quant.size(arr) == 7 || daikon.Quant.size(arr) == 9) )
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
      int retval_instrument = 0;
      retval_instrument = internal$lis(arr);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(retval_instrument == 3 || retval_instrument == 4 || retval_instrument == 6) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[2], daikon.tools.runtimechecker.Violation.Time.onExit));
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
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(args != null) )
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
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(args.getClass().getName() == java.lang.String[].class.getName()) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[4], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
         if ( !(daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, "toString()"), new String[] { })) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[5], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
      internal$main(args);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, "toString()"), new String[] { })) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[7], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         daikonProperties = new daikon.tools.runtimechecker.Property[8];
         daikonProperties[7] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>args[..].toString == [] </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, \"toString()\"), new String[] {  })</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.stringsequence.OneOfStringSequence </DAIKONCLASS></INVINFO>");
         daikonProperties[4] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args.getClass().getName() == java.lang.String[].class </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>args.getClass().getName() == java.lang.String[].class.getName()</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>size(arr[..]) one of { 6, 7, 9 } </DAIKON> <METHOD> lis(int[]) </METHOD><INV>daikon.Quant.size(arr) == 6 || daikon.Quant.size(arr) == 7 || daikon.Quant.size(arr) == 9</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[3] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args has only one value </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>args != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[2] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return one of { 3, 4, 6 } </DAIKON> <METHOD> lis(int[]) </METHOD><INV>\\result == 3 || \\result == 4 || \\result == 6</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[5] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args[..].toString == [] </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, \"toString()\"), new String[] {  })</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.stringsequence.OneOfStringSequence </DAIKONCLASS></INVINFO>");
         daikonProperties[1] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>arr[..] == orig(arr[..]) </DAIKON> <METHOD> lis(int[]) </METHOD><INV>daikon.Quant.pairwiseEqual(arr, \\old(arr))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[6] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>args[..] == orig(args[..]) </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(args, \\old(args))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
