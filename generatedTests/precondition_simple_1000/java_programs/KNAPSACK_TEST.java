package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {23,76},{30,32},{4,99},{27,-43},{87,65}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {47,87},{51,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {77,89},{56,-93},{31,43}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {70,-45},{35,75},{10,80},{58,-89},{94,5},{86,84},{27,-62},{2,37}});
        org.junit.Assert.assertEquals( (int) 192, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {90,2},{77,16},{80,97},{13,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {11,10},{62,-32},{38,30},{56,54},{-19,62},{36,86},{-99,85},{50,14},{-76,-24},{1,81},{69,36},{3,-71},{-58,26},{5,31},{75,89},{17,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {37,57},{10,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {78,18},{84,76},{35,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {98,-15},{5,90},{79,54},{75,12}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {76,65},{63,12},{67,61},{35,58},{37,87},{50,-27},{37,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {54,-15},{52,-88},{90,35},{22,56},{44,-22},{22,99},{36,44},{68,92},{2,78}});
        org.junit.Assert.assertEquals( (int) 233, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {3,-43},{94,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {64,73},{41,63},{30,52},{21,22},{17,-72},{64,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {99,72},{45,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {37,99},{38,25},{6,32},{85,73}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {45,66},{38,86},{1,40},{5,79},{8,-76},{6,68},{97,46},{90,81},{97,41},{99,11}});
        org.junit.Assert.assertEquals( (int) 187, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {58,39},{66,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {43,62},{70,9},{91,37}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {42,22}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {96,64},{49,87},{25,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {44,6}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {77,80},{42,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {50,86},{47,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {99,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {72,74},{62,-86},{14,43},{33,33},{0,-13},{51,34},{14,-45},{6,70},{14,36},{58,0},{89,0},{84,40}});
        org.junit.Assert.assertEquals( (int) 149, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {33,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {30,54},{82,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {15,23},{2,-99}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {59,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {69,38},{74,70},{65,98},{7,-91},{90,32},{43,-90},{43,68},{40,-37},{46,59},{31,63},{87,37},{10,9},{87,-33}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {92,56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {84,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {45,25},{61,61},{18,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {76,24},{25,61},{18,-74},{46,26},{65,79},{28,16},{53,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {43,64},{83,34},{65,33},{74,-55},{54,0},{79,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {31,-13},{73,63},{80,16},{12,41},{8,42},{15,5},{22,36},{21,-66}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {84,90},{94,62},{1,23},{71,30},{23,37},{63,51},{19,31},{12,58},{56,45},{18,67},{62,44},{95,67},{23,48},{69,56}});
        org.junit.Assert.assertEquals( (int) 233, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {51,-74},{23,94}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {73,25},{36,12},{88,31},{81,10},{96,-81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {3,95},{84,87},{30,61},{64,22}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {64,5},{99,78}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {11,85},{45,77},{88,-58},{-64,52},{6,83},{91,-35},{-42,17},{62,33},{-89,90},{27,85},{7,69},{77,61},{88,-29},{-6,94},{62,75},{90,58},{70,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {3,74},{18,58},{76,4},{52,18},{19,85},{94,6},{68,53}});
        org.junit.Assert.assertEquals( (int) 217, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {93,6},{55,87},{25,12}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {28,75},{30,-37},{14,-47},{30,85},{52,68},{85,-76},{39,16},{33,92},{59,77},{7,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {62,20},{98,21},{8,-11},{82,15}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {56,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {82,66},{68,70},{89,-42}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {48,96},{11,-36},{83,-20},{11,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {81,76},{73,12},{10,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {32,6},{46,23},{75,61},{52,6},{53,54},{95,24},{2,30},{50,38},{6,26},{75,-13}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {67,42},{6,81},{69,38},{4,32},{70,21},{93,-7},{93,95},{54,90},{67,85},{68,-62},{18,53},{28,45},{52,81},{19,62},{39,-30},{12,50},{30,74}});
        org.junit.Assert.assertEquals( (int) 302, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {92,-33},{57,33},{65,93},{8,-99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {73,-36},{2,2},{-18,46},{-99,12},{58,-67},{30,-66},{10,-38},{13,-73},{10,72},{40,78},{22,-99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {3,88},{45,38},{89,55},{4,42},{4,97}});
        org.junit.Assert.assertEquals( (int) 265, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {83,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {78,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {10,70},{44,54},{25,-53},{62,-95},{13,-73},{31,9}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {46,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {42,68},{77,67},{56,5},{36,94},{29,74},{78,65}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {9,8},{86,11},{56,-99},{67,73},{28,17}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {78,7},{46,37},{38,-46},{-45,82},{-7,31},{0,23},{45,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {24,62},{40,7},{58,80},{70,10},{42,60},{58,60},{8,48},{39,81},{73,31},{50,-54},{83,22},{62,90},{52,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {17,49},{97,69},{34,48},{59,52},{77,55}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {9,-3},{98,14},{25,-13},{22,85},{72,42},{99,-24},{68,88},{11,81},{50,36}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {99,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {30,15},{76,33},{24,22},{86,66}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {60,18},{24,72},{79,62},{28,-54},{51,-84},{32,46}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {3,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {90,-79},{57,79},{18,7},{64,66},{3,52},{83,76},{24,29}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {80,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {90,77},{82,95},{84,-26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {98,-61},{24,3},{76,28},{5,-70},{24,40},{27,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {83,57},{17,73},{76,-76}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {97,56},{76,44},{69,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {27,74},{83,-76}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {49,67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {15,26},{35,31},{64,16},{38,6},{49,-47},{31,-77},{49,74},{47,-30}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {20,1},{88,23},{94,75}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {61,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {78,45},{41,99},{-77,83},{53,-4},{45,-8},{79,-28},{30,17},{79,14},{63,48},{28,6},{99,82},{62,45},{94,33},{3,-94},{84,8},{89,-74},{51,-81},{56,-78},{0,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {63,-75},{67,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {39,16},{29,12},{55,12}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {21,16},{61,52},{95,23},{11,-43},{47,3},{92,9},{14,-97},{65,68},{44,-15},{94,66},{98,29},{61,21},{65,29},{62,-4},{93,-75}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {53,-46},{14,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {11,50},{63,-72},{99,1},{39,-88},{16,97}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {94,-8},{97,58},{0,-71},{66,-94},{95,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {16,33},{49,7}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {46,12},{61,49},{88,47},{45,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {46,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {39,38}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {57,69},{12,63},{83,3},{78,28}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {82,-69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {28,33},{75,75},{70,27},{86,43}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {44,14},{18,95},{21,16},{36,25},{24,6},{62,18},{67,26},{38,6},{75,4},{31,-71},{44,27}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {23,57},{83,54},{22,5},{33,51},{34,35},{50,44}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {63,-76},{53,-55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {83,90},{98,58},{79,-62},{10,-56},{31,49},{10,21},{11,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {51,92},{56,80},{71,45},{21,91},{88,32},{57,-12},{0,-48},{31,38},{99,2},{0,45},{71,87},{64,42},{87,44},{17,59},{57,87}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {39,67},{67,18},{19,47},{0,33},{53,91}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {99,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {59,10}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {60,42},{77,-69},{22,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {61,60},{20,7},{5,81},{0,-71},{7,10},{7,70},{96,10},{0,52},{17,10},{73,-24},{40,12}});
        org.junit.Assert.assertEquals( (int) 273, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {49,35},{48,6},{36,-14},{55,38}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {44,88},{88,47},{65,-77},{26,76}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {17,4},{70,34},{60,25},{55,-65},{71,40},{16,63},{20,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {96,55},{4,18},{11,-83},{64,63},{73,5},{76,50},{64,20},{17,-49},{24,17}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {22,39},{23,24},{95,87},{46,1},{15,94},{83,9},{-40,-70},{5,60},{21,-14},{42,77},{79,26},{17,-39},{-66,-45},{7,22},{76,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {19,11},{39,14},{7,11},{32,48},{96,64},{1,71},{11,1},{21,29},{79,96},{92,64},{47,78},{20,-39},{79,99},{62,10},{76,-29},{55,9}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {84,28},{13,69},{7,32},{-70,65},{80,14},{52,7},{68,22},{79,-73},{34,10},{96,-39},{49,-81},{67,5},{77,-36},{42,58},{6,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {27,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {51,-66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {93,17},{51,8},{55,17},{82,87},{79,-87},{9,11},{14,98},{51,24},{93,97},{5,0},{94,36},{50,7},{50,58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {66,59},{47,21}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {31,-14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {98,5},{32,78},{17,74},{59,89},{23,6}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {16,58},{0,-64},{44,46},{69,-54},{68,94},{29,92},{5,61},{38,2},{83,-84},{97,87}});
        org.junit.Assert.assertEquals( (int) 257, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {57,-81},{9,31},{55,79},{41,34},{86,44},{3,83},{69,2},{38,4},{5,-12},{48,53},{51,68}});
        org.junit.Assert.assertEquals( (int) 114, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {89,22},{63,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {85,93},{16,-25},{38,84},{8,6},{54,63},{40,61}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {88,60},{-82,22},{51,67},{84,0},{30,52},{45,81},{31,-62},{29,71},{59,3},{93,-93},{16,78},{65,13},{23,48},{95,53},{58,-45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {40,-32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {85,1},{59,41},{50,9},{39,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {94,60},{24,48},{61,-9}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {99,84},{54,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {91,71},{80,-59},{19,74},{11,30},{61,41},{2,-72},{86,74},{18,76},{94,89},{35,55},{91,60}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {95,12},{89,38},{32,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {55,81},{-4,74},{92,14},{55,12},{84,-64},{61,72},{28,79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {46,44},{73,60},{75,86},{-9,46},{21,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {63,99},{88,93},{83,17},{47,27},{-91,14},{70,11},{-87,-88},{36,84},{-14,50},{58,-97},{46,89},{86,36},{87,78},{-72,55},{59,29},{39,87},{91,24},{7,17},{-15,92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {41,33},{64,60},{25,-90},{64,41},{82,-4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {77,46},{85,-61},{96,15},{29,57},{48,86},{36,-40},{13,35},{34,61},{49,-42}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {78,9},{45,38},{57,68},{49,45},{51,-16}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {12,1},{45,70},{4,88}});
        org.junit.Assert.assertEquals( (int) 159, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {29,86},{24,61},{48,65},{98,11}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {16,83},{12,15},{43,39},{93,22},{33,-53},{88,52},{31,-18}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {33,87},{68,80},{48,62},{4,23},{77,22},{77,24}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {12,-9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {16,-53},{33,-47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {68,78},{17,14},{77,-47},{22,31},{26,87},{66,36},{63,81}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {85,84},{17,-8},{59,94},{99,11},{82,88},{4,18},{56,94},{10,-72},{35,35},{8,32},{2,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {8,-52},{81,55},{49,12},{-39,-48},{-48,37},{18,39},{12,4},{4,-38},{70,-29},{93,90},{-1,71},{50,-40},{60,-25},{45,74},{39,67},{40,52},{-99,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {13,62},{92,56},{15,25},{72,17},{25,6},{1,3},{89,18},{59,58}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {84,-5},{3,2},{50,28},{35,99},{27,89},{29,76},{34,37}});
        org.junit.Assert.assertEquals( (int) 190, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {90,-57},{84,23},{-48,74},{42,25},{8,21},{11,9},{35,-44},{-1,39},{28,99},{14,73},{24,97},{39,36},{69,3},{26,8},{-53,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {40,1},{49,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {85,93},{17,87},{35,36},{60,24},{11,-82},{47,-49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {44,-76},{41,83},{29,-35},{36,54}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {60,21},{70,91},{67,86},{46,17},{86,11},{67,75},{86,21},{31,3},{84,41},{42,20},{62,-37}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {61,18},{73,82},{25,-48},{2,-95},{85,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {37,74},{92,82},{49,-54},{56,30},{47,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {92,35},{90,56},{89,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {66,85},{68,55},{43,61},{68,86},{76,92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {44,-12},{43,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {34,30},{99,59},{26,81},{17,49},{1,65},{56,54},{9,5},{56,65},{59,17},{77,63},{43,61}});
        org.junit.Assert.assertEquals( (int) 261, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {27,47},{95,44},{69,71},{29,69},{4,20},{84,21},{85,-18},{89,25},{63,24},{49,88},{15,70},{2,51}});
        org.junit.Assert.assertEquals( (int) 141, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {98,43},{62,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {67,49},{7,-99},{11,24},{33,84},{22,17}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {52,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {72,27},{40,-42},{89,84},{70,-35},{73,17},{35,86},{62,37},{32,46},{34,-98},{51,70},{19,-82},{99,-5},{38,64},{29,98},{45,24}});
        org.junit.Assert.assertEquals( (int) 184, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {53,76},{5,0},{19,30},{11,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {42,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {68,-61},{79,32},{84,65},{22,-87},{8,47},{12,26},{59,39},{46,85}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {33,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {40,90},{47,12}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {26,54},{67,24},{67,42},{69,-5},{30,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {40,32},{68,61},{30,89},{65,8},{65,13},{19,-46},{53,34}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {54,10},{37,7},{79,20},{86,89},{30,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {46,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {38,-26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {70,64},{49,-87},{56,-93},{75,50},{42,78},{64,-78},{61,62},{29,38},{42,-27}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {0,94}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {16,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {56,71}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {84,33},{19,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {44,68},{22,79},{0,93},{89,-83},{98,38}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {71,0},{79,22},{26,22}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {84,10},{3,53}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {93,28},{37,82},{79,34},{57,74},{20,39},{25,54},{31,42},{17,51},{62,40},{42,91},{54,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {80,80},{29,-55},{27,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {3,71},{83,89},{64,16}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {79,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {76,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {48,8},{79,88},{50,-33},{4,76}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {36,74},{56,-49},{57,74},{44,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {90,2},{66,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {1,68},{32,1},{29,-4},{41,67},{51,-89},{18,85}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {28,-25},{25,40},{21,0},{95,51},{85,-83},{37,51},{43,34},{5,33},{24,-15},{29,22},{2,45},{31,49},{4,-34},{22,21},{82,15},{27,84},{76,41},{48,94},{14,-24}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {20,34}});
        org.junit.Assert.assertEquals( (int) 34, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {30,48},{89,62},{82,15},{76,-31}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {93,-83},{59,75},{54,97},{92,87},{5,64}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {67,87},{22,57},{40,27},{52,-36}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    public void test_239() throws java.lang.Exception {
    }
}

