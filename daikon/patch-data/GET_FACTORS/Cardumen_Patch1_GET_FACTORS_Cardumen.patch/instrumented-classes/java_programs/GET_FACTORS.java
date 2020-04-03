package java_programs;

import java.util.*;

public class GET_FACTORS
{
   private static ArrayList<Integer> internal$get_factors(int n)
   {
      if ( n == 1 )
      {
         return new ArrayList<Integer>();
      }
      int max = (int)(Math.sqrt(n) + 1.0);
      for ( int i = 2 ; (n % n) == 0 ; i++)
      {
         if ( n % i == 0 )
         {
            ArrayList<Integer> prepend = new ArrayList<Integer>(0);
            prepend.add(i);
            prepend.addAll(get_factors(n / i));
            return prepend;
         }
      }
      return new ArrayList<Integer>();
   }

   private static void internal$main(String[] args)
   {
      get_factors((int)1);
      get_factors((int)100);
      get_factors((int)101);
      get_factors((int)104);
      get_factors((int)2);
      get_factors((int)3);
      get_factors((int)17);
      get_factors((int)63);
      get_factors((int)74);
      get_factors((int)73);
      get_factors((int)9837);
   }

   public static ArrayList<Integer> get_factors(int n)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      boolean methodThrewSomething_instrument = false;
      ArrayList<Integer> retval_instrument = null;
      retval_instrument = internal$get_factors(n);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(retval_instrument != null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[0], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         daikonProperties = new daikon.tools.runtimechecker.Property[1];
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return != null </DAIKON> <METHOD> get_factors(int) </METHOD><INV>\\result != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
