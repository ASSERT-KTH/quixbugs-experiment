package java_programs;

import java.util.*;
import java.lang.Math.*;

public class SHORTEST_PATH_LENGTHS
{
   final static int INF = 99999 ;

   private static Map<List<Integer>,Integer> internal$shortest_path_lengths(int numNodes, Map<List<Integer>,Integer> length_by_edge)
   {
      Map<List<Integer>,Integer> length_by_path = new HashMap<>();
      for ( int i = 0 ; i < numNodes ; i++)
      {
         for ( int j = 0 ; j < numNodes ; j++)
         {
            List<Integer> edge = new ArrayList<>(Arrays.asList(i, j));
            if ( i == j )
            {
               length_by_path.put(edge, 0);
            }
            else
               if ( length_by_edge.containsKey(edge) )
               {
                  length_by_path.put(edge, length_by_edge.get(edge));
               }
               else
               {
                  return length_by_path;
               }
         }
      }
      for ( int k = 0 ; k < numNodes ; k++)
      {
      }
      return length_by_path;
   }

   private static void internal$main(String[] args)
   {
      Map<List<Integer>,Integer> graph = new HashMap<>();
      graph.put(new ArrayList<Integer>(Arrays.asList(0, 2)), 3);
      graph.put(new ArrayList<Integer>(Arrays.asList(0, 5)), 5);
      graph.put(new ArrayList<Integer>(Arrays.asList(2, 1)), - 2);
      graph.put(new ArrayList<Integer>(Arrays.asList(2, 3)), 7);
      graph.put(new ArrayList<Integer>(Arrays.asList(2, 4)), 4);
      graph.put(new ArrayList<Integer>(Arrays.asList(3, 4)), - 5);
      graph.put(new ArrayList<Integer>(Arrays.asList(4, 5)), - 1);
      shortest_path_lengths(6, graph);
      Map<List<Integer>,Integer> graph2 = new HashMap<>();
      graph2.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
      graph2.put(new ArrayList<Integer>(Arrays.asList(1, 2)), 5);
      graph2.put(new ArrayList<Integer>(Arrays.asList(2, 3)), - 2);
      graph2.put(new ArrayList<Integer>(Arrays.asList(3, 4)), 7);
      shortest_path_lengths(5, graph2);
      Map<List<Integer>,Integer> graph3 = new HashMap<>();
      graph3.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
      graph3.put(new ArrayList<Integer>(Arrays.asList(2, 3)), 5);
      shortest_path_lengths(4, graph3);
      Map<List<Integer>,Integer> graph4 = new HashMap<>();
      graph4.put(new ArrayList<Integer>(Arrays.asList(0, 1)), 3);
      graph4.put(new ArrayList<Integer>(Arrays.asList(1, 2)), 5);
      graph4.put(new ArrayList<Integer>(Arrays.asList(2, 0)), - 1);
      shortest_path_lengths(3, graph4);
   }

   public static Map<List<Integer>,Integer> shortest_path_lengths(int numNodes, Map<List<Integer>,Integer> length_by_edge)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(length_by_edge.getClass().getName() == java.util.HashMap.class.getName()) )
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
      Map<List<Integer>,Integer> retval_instrument = null;
      retval_instrument = internal$shortest_path_lengths(numNodes, length_by_edge);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(retval_instrument.getClass().getName() == java.util.HashMap.class.getName()) )
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
         if ( !(args.getClass().getName() == java.lang.String[].class.getName()) )
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
         if ( !(daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, "toString()"), new String[] { })) )
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
      internal$main(args);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, "toString()"), new String[] { })) )
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
         daikonProperties[4] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>args[..].toString == [] </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, \"toString()\"), new String[] {  })</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.stringsequence.OneOfStringSequence </DAIKONCLASS></INVINFO>");
         daikonProperties[1] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args.getClass().getName() == java.lang.String[].class </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>args.getClass().getName() == java.lang.String[].class.getName()</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[7] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.getClass().getName() == java.util.HashMap.class </DAIKON> <METHOD> shortest_path_lengths(int, java.util.Map) </METHOD><INV>\\result.getClass().getName() == java.util.HashMap.class.getName()</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[6] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.getClass().getName() == orig(length_by_edge.getClass().getName()) </DAIKON> <METHOD> shortest_path_lengths(int, java.util.Map) </METHOD><INV>\\result.getClass().getName() == \\old(length_by_edge.getClass().getName())</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args has only one value </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>args != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[5] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>length_by_edge.getClass().getName() == java.util.HashMap.class </DAIKON> <METHOD> shortest_path_lengths(int, java.util.Map) </METHOD><INV>length_by_edge.getClass().getName() == java.util.HashMap.class.getName()</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[2] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args[..].toString == [] </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, \"toString()\"), new String[] {  })</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.stringsequence.OneOfStringSequence </DAIKONCLASS></INVINFO>");
         daikonProperties[3] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>args[..] == orig(args[..]) </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(args, \\old(args))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
