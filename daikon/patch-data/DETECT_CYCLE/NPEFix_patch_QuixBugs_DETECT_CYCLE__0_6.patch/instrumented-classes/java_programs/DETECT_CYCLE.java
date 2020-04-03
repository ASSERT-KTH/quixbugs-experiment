package java_programs;

import java.util.*;

public class DETECT_CYCLE
{
   private static boolean internal$detect_cycle(Node node)
   {
      Node hare = node;
      Node tortoise = node;
      while ( true )
      {
         if ( hare == null )
         {
            hare = new Node();
         }
         if ( hare.getSuccessor() == null )
            return false;
         tortoise = tortoise.getSuccessor();
         hare = hare.getSuccessor().getSuccessor();
         if ( hare == tortoise )
            return true;
      }
   }

   private static void internal$main(String[] args)
   {
      Node node1 = new Node("1");
      Node node2 = new Node("2", node1);
      Node node3 = new Node("3", node2);
      Node node4 = new Node("4", node3);
      Node node5 = new Node("5", node4);
      detect_cycle(node5);
      node1.setSuccessor(node5);
      detect_cycle(node5);
      node1.setSuccessor(node2);
      detect_cycle(node2);
   }

   public static boolean detect_cycle(Node node)
   {
      daikon.tools.runtimechecker.Runtime.numPptEntries++;
      checkClassInvariantsInstrument(daikon.tools.runtimechecker.Violation.Time.onEntry);
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !(node.value.toString().equals("2") || node.value.toString().equals("5")) )
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
         if ( !(node.successors == null) )
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
         if ( !(node.predecessors == null) )
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
         if ( !(node.successor.value.toString().equals("1") || node.successor.value.toString().equals("4")) )
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
      boolean retval_instrument = false;
      retval_instrument = internal$detect_cycle(node);
      daikon.tools.runtimechecker.Runtime.numNormalPptExits++;
      try
      {
         daikon.tools.runtimechecker.Runtime.numEvaluations++;
         if ( !((node.successor != null) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[16], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.successor.predecessors == null) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[17], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.successor.successor != null) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[18], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.successor.successors == null) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[19], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.successor.value != null) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[20], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.successor.value.toString().equals("4")) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[21], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.value != null) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[22], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.value.toString().equals("5")) || !(retval_instrument == false)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[23], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.successor.value.toString().equals("1") || node.successor.value.toString().equals("4")) || !(retval_instrument == true)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[25], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !((node.value.toString().equals("2") || node.value.toString().equals("5")) || !(retval_instrument == true)) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[26], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !(node.value.toString().equals("2") || node.value.toString().equals("5")) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[27], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !(node.successors == null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[28], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !(node.predecessors == null) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[29], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         if ( !(node.successor.value.toString().equals("1") || node.successor.value.toString().equals("4")) )
         {
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[30], daikon.tools.runtimechecker.Violation.Time.onExit));
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
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[31], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[32], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[33], daikon.tools.runtimechecker.Violation.Time.onEntry));
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
            daikon.tools.runtimechecker.Runtime.violationsAdd(daikon.tools.runtimechecker.Violation.get(daikonProperties[35], daikon.tools.runtimechecker.Violation.Time.onExit));
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
         daikonProperties = new daikon.tools.runtimechecker.Property[168];
         daikonProperties[32] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args.getClass().getName() == java.lang.String[].class </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>args.getClass().getName() == java.lang.String[].class.getName()</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[24] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (orig(node) has only one value) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(\\old(node) != null) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[117] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.value.toString == \"5\" </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.value.toString().equals(\"5\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[167] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.value.toString one of { \"1\", \"4\" } </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successor.value.toString().equals(\"1\") || successor.successor.value.toString().equals(\"4\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[50] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value == orig(value) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.value == \\old(value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[48] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>value.toString == \"1\" </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>value.toString().equals(\"1\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[23] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.value.toString == \"5\") </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.value.toString().equals(\"5\")) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[88] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successors == return.successors </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.successors == \\result.successors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[0] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>node.value.toString one of { \"2\", \"5\" } </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.value.toString().equals(\"2\") || node.value.toString().equals(\"5\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[111] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[4] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.value == orig(node.value) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.value == \\old(node.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[62] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.value.toString == orig(successor.value.toString) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.value.toString().equals(\\old(successor.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[116] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.value has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.value != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[30] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.value.toString one of { \"1\", \"4\" } </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor.value.toString().equals(\"1\") || node.successor.value.toString().equals(\"4\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[70] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.successors == orig(successor.successor.successors) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor.successors == \\old(successor.successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[136] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor == orig(successor) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor == \\old(successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[71] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.successors[..] == orig(successor.successor.successors[..]) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(successor.successor.successors, \\old(successor.successor.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[87] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.value.toString == orig(this.successor.value.toString) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.value.toString().equals(\\old(this.successor.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[140] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor == successor.successor </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor == successor.successor</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[93] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.value == return.successor.value </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.successor.value == \\result.successor.value</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[15] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.successor == orig(node.successor.successor) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor.successor == \\old(node.successor.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[86] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.value == return.value </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.value == \\result.value</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[7] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.predecessors == orig(node.predecessors) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.predecessors == \\old(node.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[36] = daikon.tools.runtimechecker.Property.get("<INVINFO> <OBJECT><DAIKON>this.value != null </DAIKON> <METHOD> null </METHOD><INV>this.value != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[78] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.value.toString one of { \"1\", \"2\", \"3\" } </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor.value.toString().equals(\"1\") || successor.successor.value.toString().equals(\"2\") || successor.successor.value.toString().equals(\"3\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[2] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>node.predecessors == null </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[34] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>args[..] == orig(args[..]) </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(args, \\old(args))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[154] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.predecessors == orig(successor.successor.predecessors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successor.predecessors == \\old(successor.successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[121] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.successor.value has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.value != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[134] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.predecessors == orig(this.predecessors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.predecessors == \\old(this.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[18] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.successor.successor has only one value) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.successor.successor != null) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[55] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor == successor.successor </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.successor == successor.successor</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[133] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successors[..] == orig(this.successors[..]) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(this.successors, \\old(this.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[14] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.predecessors[..] == orig(node.successor.predecessors[..]) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(node.successor.predecessors, \\old(node.successor.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[137] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.value == successor.value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.value == successor.value</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[161] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[97] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.predecessors == return.successor.predecessors </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.successor.predecessors == \\result.successor.predecessors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[52] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.value == successor.value </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.value == successor.value</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[31] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args has only one value </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>args != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[44] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value.toString == \"1\" </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>this.value.toString().equals(\"1\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[5] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.value.toString == orig(node.value.toString) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.value.toString().equals(\\old(node.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[80] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value.toString == orig(this.value.toString) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.value.toString().equals(\\old(this.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[127] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>successor.successors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[40] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>value.toString == \"1\" </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>value.toString().equals(\"1\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[20] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.successor.value has only one value) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.successor.value != null) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[163] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.value.toString one of { \"1\", \"4\" } </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.value.toString().equals(\"1\") || this.successor.successor.value.toString().equals(\"4\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[35] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>args[..].toString == [] </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, \"toString()\"), new String[] {  })</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.stringsequence.OneOfStringSequence </DAIKONCLASS></INVINFO>");
         daikonProperties[166] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.predecessors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[17] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.successor.predecessors == null) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.successor.predecessors == null) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[114] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successors has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successors != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[160] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.value.toString one of { \"2\", \"5\" } </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.value.toString().equals(\"2\") || this.successor.value.toString().equals(\"5\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[138] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successors == orig(this.successor.successors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successors == \\old(this.successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[98] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.predecessors[..] == orig(this.successor.successor.predecessors[..]) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>daikon.Quant.pairwiseEqual(this.successor.successor.predecessors, \\old(this.successor.successor.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[123] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.successor.successors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[146] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.value.toString == orig(successor.value.toString) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.value.toString().equals(\\old(successor.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[108] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.successor.successor == orig(this.successor.successor.successor) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.successor.successor == \\old(this.successor.successor.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[124] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.successor.predecessors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[162] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.predecessors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[29] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.predecessors == null </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[47] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor == null </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>this.successor == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[141] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.value == successor.successor.value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.value == successor.successor.value</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[113] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.value.toString == \"1\" </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.value.toString().equals(\"1\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[60] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>value.toString == orig(value.toString) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>value.toString().equals(\\old(value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[69] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.value.toString == orig(successor.successor.value.toString) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor.value.toString().equals(\\old(successor.successor.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[143] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.predecessors == successor.successor.predecessors </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.predecessors == successor.successor.predecessors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[21] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.successor.value.toString == \"4\") </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.successor.value.toString().equals(\"4\")) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[49] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>successor.successor.value.toString one of { \"1\", \"2\", \"3\" } </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor.value.toString().equals(\"1\") || successor.successor.value.toString().equals(\"2\") || successor.successor.value.toString().equals(\"3\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[164] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.value.toString one of { \"2\", \"5\" } </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.value.toString().equals(\"2\") || successor.value.toString().equals(\"5\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[6] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successors == orig(node.successors) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successors == \\old(node.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[8] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor == orig(node.successor) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor == \\old(node.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[58] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.predecessors == successor.successor.predecessors </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.successor.predecessors == successor.successor.predecessors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[109] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.value != null </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.value != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[100] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return == orig(this.successor) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result == \\old(this.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[147] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successors == orig(successor.successors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successors == \\old(successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[13] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.predecessors == orig(node.successor.predecessors) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor.predecessors == \\old(node.successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[46] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.predecessors has only one value </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>this.predecessors != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[105] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.successor.value == orig(this.successor.successor.value) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.successor.value == \\old(this.successor.successor.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[57] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.successors == successor.successor.successors </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.successor.successors == successor.successor.successors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[28] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successors == null </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[142] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.successors == successor.successor.successors </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.successors == successor.successor.successors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[19] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.successor.successors == null) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.successor.successors == null) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[125] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.successor.successor has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.successor != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[3] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>node.successor.value.toString one of { \"1\", \"4\" } </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor.value.toString().equals(\"1\") || node.successor.value.toString().equals(\"4\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[145] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.value == orig(successor.value) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.value == \\old(successor.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[112] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.value has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.value != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[101] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.value == orig(this.successor.value) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.value == \\old(this.successor.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[118] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.successors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[38] = daikon.tools.runtimechecker.Property.get("<INVINFO> <OBJECT><DAIKON>this.successor.successor.value != null </DAIKON> <METHOD> null </METHOD><INV>this.successor.successor.value != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[65] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.predecessors == orig(successor.predecessors) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.predecessors == \\old(successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[66] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.predecessors[..] == orig(successor.predecessors[..]) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(successor.predecessors, \\old(successor.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[148] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.predecessors == orig(successor.predecessors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.predecessors == \\old(successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[81] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successors == orig(this.successors) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successors == \\old(this.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[120] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.successor has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[130] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value == orig(this.value) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.value == \\old(this.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[33] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>args[..].toString == [] </DAIKON> <METHOD> main(java.lang.String[]) </METHOD><INV>daikon.Quant.pairwiseEqual(daikon.Quant.collectObject(args, \"toString()\"), new String[] {  })</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.stringsequence.OneOfStringSequence </DAIKONCLASS></INVINFO>");
         daikonProperties[139] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.predecessors == orig(this.successor.predecessors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.predecessors == \\old(this.successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[39] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>value has only one value </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>value != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[122] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.successor.value.toString == \"4\" </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.value.toString().equals(\"4\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[1] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>node.successors == null </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[94] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.value.toString == orig(this.successor.successor.value.toString) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.successor.value.toString().equals(\\old(this.successor.successor.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[95] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.successors == return.successor.successors </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.successor.successors == \\result.successor.successors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[25] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == true)  ==>  (node.successor.value.toString one of { \"1\", \"4\" }) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.successor.value.toString().equals(\"1\") || node.successor.value.toString().equals(\"4\")) || !(\\result == true)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[156] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.value != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[77] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.value.toString one of { \"1\", \"2\", \"3\" } </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.successor.value.toString().equals(\"1\") || this.successor.successor.value.toString().equals(\"2\") || this.successor.successor.value.toString().equals(\"3\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[91] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.predecessors[..] == orig(this.successor.predecessors[..]) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>daikon.Quant.pairwiseEqual(this.successor.predecessors, \\old(this.successor.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[96] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.successors[..] == orig(this.successor.successor.successors[..]) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>daikon.Quant.pairwiseEqual(this.successor.successor.successors, \\old(this.successor.successor.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[26] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == true)  ==>  (node.value.toString one of { \"2\", \"5\" }) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.value.toString().equals(\"2\") || node.value.toString().equals(\"5\")) || !(\\result == true)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[10] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.value.toString == orig(node.successor.value.toString) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor.value.toString().equals(\\old(node.successor.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[90] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.predecessors == return.predecessors </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.predecessors == \\result.predecessors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[63] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successors == orig(successor.successors) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successors == \\old(successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[144] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.successor == successor.successor.successor </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.successor.successor == successor.successor.successor</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[126] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>successor.value.toString one of { \"2\", \"5\" } </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.value.toString().equals(\"2\") || successor.value.toString().equals(\"5\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[74] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.successor == orig(successor.successor.successor) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor.successor == \\old(successor.successor.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[43] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value has only one value </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>this.value != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[85] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor == return </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor == \\result</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[132] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successors == orig(this.successors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successors == \\old(this.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[54] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.predecessors == successor.predecessors </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.predecessors == successor.predecessors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[159] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.predecessors has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.predecessors != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[151] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.value.toString == orig(successor.successor.value.toString) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successor.value.toString().equals(\\old(successor.successor.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[56] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.value == successor.successor.value </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.successor.value == successor.successor.value</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[73] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.predecessors[..] == orig(successor.successor.predecessors[..]) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(successor.successor.predecessors, \\old(successor.successor.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[89] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successors[..] == orig(this.successor.successors[..]) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>daikon.Quant.pairwiseEqual(this.successor.successors, \\old(this.successor.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[67] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor == orig(successor.successor) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor == \\old(successor.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[106] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.successor.successors == orig(this.successor.successor.successors) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.successor.successors == \\old(this.successor.successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[9] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.value == orig(node.successor.value) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor.value == \\old(node.successor.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[59] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.successor == successor.successor.successor </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.successor.successor == successor.successor.successor</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[99] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor.successor == return.successor.successor </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.successor.successor == \\result.successor.successor</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[150] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.value == orig(successor.successor.value) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successor.value == \\old(successor.successor.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[42] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>value.toString == orig(value.toString) </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>value.toString().equals(\\old(value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[41] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value == orig(value) </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>this.value == \\old(value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[84] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.predecessors[..] == orig(this.predecessors[..]) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>daikon.Quant.pairwiseEqual(this.predecessors, \\old(this.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[129] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>successor.successor.value.toString one of { \"1\", \"4\" } </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successor.value.toString().equals(\"1\") || successor.successor.value.toString().equals(\"4\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[76] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.predecessors == null </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[158] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successors has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successors != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[83] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.predecessors == orig(this.predecessors) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.predecessors == \\old(this.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[79] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value == orig(this.value) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.value == \\old(this.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[115] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.predecessors has only one value </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.predecessors != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[155] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.predecessors[..] == orig(successor.successor.predecessors[..]) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(successor.successor.predecessors, \\old(successor.successor.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[157] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value.toString == \"1\" </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.value.toString().equals(\"1\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[119] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>this.successor.predecessors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.successor.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[27] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.value.toString one of { \"2\", \"5\" } </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.value.toString().equals(\"2\") || node.value.toString().equals(\"5\")</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.string.OneOfString </DAIKONCLASS></INVINFO>");
         daikonProperties[75] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successors == null </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[22] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.value has only one value) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.value != null) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[12] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.successors[..] == orig(node.successor.successors[..]) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(node.successor.successors, \\old(node.successor.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[68] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.value == orig(successor.successor.value) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor.value == \\old(successor.successor.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[16] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>(return == false)  ==>  (node.successor has only one value) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>(node.successor != null) || !(\\result == false)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.Implication </DAIKONCLASS></INVINFO>");
         daikonProperties[128] = daikon.tools.runtimechecker.Property.get("<INVINFO> <ENTER><DAIKON>successor.predecessors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.predecessors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[45] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successors has only one value </DAIKON> <METHOD> Node(java.lang.String) </METHOD><INV>this.successors != null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[72] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.predecessors == orig(successor.successor.predecessors) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.successor.predecessors == \\old(successor.successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[11] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>node.successor.successors == orig(node.successor.successors) </DAIKON> <METHOD> detect_cycle(java_programs.Node) </METHOD><INV>node.successor.successors == \\old(node.successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[61] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.value == orig(successor.value) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>successor.value == \\old(successor.value)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[92] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successor == return.successor </DAIKON> <METHOD> getSuccessor() </METHOD><INV>this.successor.successor == \\result.successor</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[51] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor == orig(successor) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor == \\old(successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[64] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successors[..] == orig(successor.successors[..]) </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(successor.successors, \\old(successor.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[152] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.successors == orig(successor.successor.successors) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successor.successors == \\old(successor.successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[37] = daikon.tools.runtimechecker.Property.get("<INVINFO> <OBJECT><DAIKON>this.successor.value != null </DAIKON> <METHOD> null </METHOD><INV>this.successor.value != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
         daikonProperties[165] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successors == null </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successors == null</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.OneOfScalar </DAIKONCLASS></INVINFO>");
         daikonProperties[103] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.predecessors == orig(this.successor.predecessors) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.predecessors == \\old(this.successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[104] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.successor == orig(this.successor.successor) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.successor == \\old(this.successor.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[53] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successor.successors == successor.successors </DAIKON> <METHOD> Node(java.lang.String, java_programs.Node) </METHOD><INV>this.successor.successors == successor.successors</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[82] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.successors[..] == orig(this.successors[..]) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>daikon.Quant.pairwiseEqual(this.successors, \\old(this.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[135] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.predecessors[..] == orig(this.predecessors[..]) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(this.predecessors, \\old(this.predecessors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[153] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor.successors[..] == orig(successor.successor.successors[..]) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>daikon.Quant.pairwiseEqual(successor.successor.successors, \\old(successor.successor.successors))</INV> <CONFIDENCE>0.19 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoSequence.SeqSeqIntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[149] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>successor.successor == orig(successor.successor) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>successor.successor == \\old(successor.successor)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[131] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>this.value.toString == orig(this.value.toString) </DAIKON> <METHOD> setSuccessor(java_programs.Node) </METHOD><INV>this.value.toString().equals(\\old(this.value.toString()))</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoString.StringEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[107] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.successor.predecessors == orig(this.successor.successor.predecessors) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.successor.predecessors == \\old(this.successor.successor.predecessors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[102] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.successors == orig(this.successor.successors) </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.successors == \\old(this.successor.successors)</INV> <CONFIDENCE>0.2 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.binary.twoScalar.IntEqual </DAIKONCLASS></INVINFO>");
         daikonProperties[110] = daikon.tools.runtimechecker.Property.get("<INVINFO> <EXIT><DAIKON>return.successor.value != null </DAIKON> <METHOD> getSuccessor() </METHOD><INV>\\result.successor.value != null</INV> <CONFIDENCE>0.91 </CONFIDENCE> <DAIKONCLASS>class daikon.inv.unary.scalar.NonZero </DAIKONCLASS></INVINFO>");
      }
      catch (Exception e)
      {
         System.err.println("malformed invariant. This is probably a bug in the daikon.tools.runtimechecker tool; please submit a bug report.");
         e.printStackTrace();
         System.exit(1);
      }
   }
}
