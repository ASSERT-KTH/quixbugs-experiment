package java_programs;

import java.util.*;

public class SQRT
{
   private static double internal$sqrt(double x, double epsilon)
   {
      double approx = x / 2d;
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      approx = 0.5f * (approx + x / approx);
      return approx;
   }

   private static void internal$main(String[] args)
   {
      sqrt((double)2, (double)0.01);
      sqrt((double)2, (double)0.5);
      sqrt((double)2, (double)0.3);
      sqrt((double)4, (double)0.2);
      sqrt((double)27, (double)0.01);
      sqrt((double)33, (double)0.05);
      sqrt((double)170, (double)0.03);
   }

   public static double sqrt(double x, double epsilon)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(x >= 2.0) )
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
      double retval_instrument = 0;
      retval_instrument = internal$sqrt(x, epsilon);
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
         daikonProperties = new daikon.tools.runtimechecker.Property[1];
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>x >= 2.0 </DAIKON> <METHOD> sqrt(double, double) </METHOD><INV>x >= 2.0</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.LowerBoundFloat </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
