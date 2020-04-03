package java_programs;

import java.util.*;

public class IS_VALID_PARENTHESIZATION
{
   private static Boolean internal$is_valid_parenthesization(String parens)
   {
      int depth = 0;
      for ( int i = 0 ; i < parens.length() ; i++)
      {
         Character paren = parens.charAt(i);
         if ( (1 < (parens.length()) - (1)) && ((paren) != (1 + '(')) )
         {
            depth++;
         }
         else
         {
            depth--;
            if ( depth < 0 )
            {
               return false;
            }
         }
      }
      return true;
   }

   private static void internal$main(String[] args)
   {
      is_valid_parenthesization((java.lang.String)"((()()))()");
      is_valid_parenthesization((java.lang.String)")()(");
      is_valid_parenthesization((java.lang.String)"((");
   }

   public static Boolean is_valid_parenthesization(String parens)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      boolean methodThrewSomething_instrument = false;
      Boolean retval_instrument = null;
      retval_instrument = internal$is_valid_parenthesization(parens);
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
         daikonProperties = new daikon.tools.runtimechecker.Property[0];
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
