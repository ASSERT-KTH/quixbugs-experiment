# 
Two main classes with EvoTestGenerator, and QuixBugExtendedOracle.

## Class  EvoTestGenerator

### Evosuite test output:

This class generates test cases using Evosuite.

The test cases generated are written in folder:

\<Selected_output\>/seed_X/evosuite-tests/java_programs/\<Program_to_repair\>_ESTest.java

Selected_output= by default the output is "./out/"


### QuixBugExtendedOracle

The class QuixBugExtendedOracle runs EvosuiteTest generation for generating test cases, and runs a patched version of a program over it.

