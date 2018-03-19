package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {9,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {19,12}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {40,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {46,41},{70,38},{25,7},{37,64},{61,27},{46,78},{45,58},{93,51}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {97,17},{72,25}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {54,10},{70,12},{2,84},{25,78},{42,14}});
        org.junit.Assert.assertEquals( (int) 162, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {42,80},{0,96},{86,-44},{38,78},{16,5}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {89,47},{37,47},{98,15},{22,47},{93,-9},{46,81},{94,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {10,-90},{44,26},{12,69},{33,38},{19,62},{76,27},{13,11},{43,6},{40,8},{28,69},{33,62},{33,-77},{98,71},{45,59}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {32,16},{32,9}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {32,65},{72,1},{40,10},{33,-48},{49,73},{30,35},{55,47},{56,57},{67,38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {68,55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {33,63},{58,44},{89,90},{89,-79},{26,-32},{60,4},{33,66},{87,-6},{52,62},{98,0},{53,94},{2,51},{9,33},{58,30},{51,81}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {83,42},{82,39},{36,27},{7,-80},{84,14},{18,4},{38,19},{39,-84},{15,71},{3,70},{3,-50},{44,47},{39,34},{56,9},{79,35}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {18,63},{14,74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {62,4},{97,64},{86,2},{98,17},{15,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {82,7},{21,-59},{93,28},{50,70},{28,-34},{37,70},{72,54},{26,-67},{1,61},{90,0}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {57,-47},{40,-32},{30,63},{64,93},{53,83},{18,68},{-96,-40},{79,32},{84,89},{15,13},{-68,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {9,11},{39,33},{69,67},{24,82},{21,74}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {90,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {36,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {16,69},{81,34},{-33,-66},{58,-61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {4,62},{93,14},{93,7},{2,76},{15,74},{20,91},{68,19},{92,6},{41,65},{62,51},{59,27}});
        org.junit.Assert.assertEquals( (int) 303, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {25,60},{70,-42},{20,-88},{85,-93}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {49,-69},{37,15},{28,50},{94,91},{99,7},{82,90},{65,48},{68,2},{97,73},{20,84},{75,-24},{41,7},{48,90},{40,60},{53,37},{71,-32},{76,65},{60,57},{40,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {84,-46},{54,-5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {72,-34},{46,94},{69,21},{6,89},{86,-83},{29,-34},{24,42},{86,10},{1,82},{13,-12},{54,-42},{62,80},{28,39}});
        org.junit.Assert.assertEquals( (int) 307, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {64,95},{38,66},{92,59},{75,54},{16,82},{5,16},{60,-90},{1,69},{71,79},{83,6},{89,80},{49,-86}});
        org.junit.Assert.assertEquals( (int) 233, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {30,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {90,29},{7,-75},{64,-92},{76,-7},{52,-20},{26,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {13,42},{54,54},{3,68},{69,96}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {80,80},{78,-18},{44,26},{31,59},{51,83},{85,42},{37,84},{23,49},{41,-26}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {33,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {88,70},{14,71},{52,58},{71,-3},{31,-97},{42,-73},{20,1}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {4,-93},{63,-30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {9,18},{15,17},{13,38},{3,-52}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {33,-7},{52,35},{95,-90},{8,57},{82,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {87,69},{55,80},{53,73},{14,10},{80,35}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {24,64}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {87,55},{40,56},{36,14},{25,36},{19,11},{58,42},{36,-50},{64,64}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {0,-98},{42,-95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {91,-78},{90,-10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {90,-67},{27,75},{88,31},{86,19},{76,60},{84,-34},{68,27},{60,83},{-11,12},{60,50},{57,48},{-72,64},{5,48},{5,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {43,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {6,-43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {16,43},{1,51},{37,18},{67,11},{33,99},{22,5},{80,-8}});
        org.junit.Assert.assertEquals( (int) 211, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {1,43},{48,96},{63,-33},{76,6},{30,-27},{70,61}});
        org.junit.Assert.assertEquals( (int) 139, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {71,2},{12,90},{20,3},{26,11},{69,67}});
        org.junit.Assert.assertEquals( (int) 157, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {22,1},{74,28},{46,-3},{91,6},{42,26},{53,17}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {91,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {42,70},{40,21},{50,-76}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {28,-72},{23,17},{7,3}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {61,89},{4,78},{25,51},{68,99},{44,81},{84,95},{91,50},{77,34},{55,11},{21,-51},{21,78}});
        org.junit.Assert.assertEquals( (int) 156, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {19,-75},{40,-52},{6,-92},{6,46},{89,74},{94,-55},{71,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {97,25},{58,76},{81,70},{38,36},{5,1}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {6,55},{2,99},{48,86}});
        org.junit.Assert.assertEquals( (int) 240, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {45,52},{34,65},{83,73}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {33,-31},{60,92},{95,8},{46,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {71,27},{70,55},{56,39},{38,84},{95,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {79,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {99,36},{57,96},{96,63},{68,96},{63,26},{18,97},{39,17},{43,33},{57,46},{58,35},{58,-49},{46,-67},{98,7}});
        org.junit.Assert.assertEquals( (int) 114, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {8,17},{8,16},{90,-79},{72,79},{13,58},{15,31},{90,98},{55,72},{25,19}});
        org.junit.Assert.assertEquals( (int) 106, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {41,44},{88,9}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {23,43},{26,-39},{76,23}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {46,63},{53,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {83,0},{78,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {78,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {88,42},{69,22},{12,69},{83,69},{37,-26}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {46,85},{68,57},{21,3},{87,85},{73,42}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {21,-83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {99,21},{2,27},{56,64},{89,82},{95,-33},{23,59},{51,-71},{63,90}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {11,-80},{99,79},{57,66}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {24,82},{97,30}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {4,55},{83,15},{84,14},{32,91},{23,-2},{24,26},{9,80},{85,33},{95,51},{31,-74},{80,-60},{98,56},{14,12},{87,0},{74,7},{9,32}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {71,89},{48,-15},{37,69},{58,97},{99,1},{11,20},{39,39},{41,66},{20,-57},{10,50},{65,58},{24,-57},{93,54},{41,16},{65,27}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {77,-59},{94,46},{92,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {99,5},{66,13},{92,30},{18,20}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {74,48},{40,46},{2,10},{49,24},{67,25},{4,45},{68,65},{89,98},{59,-35},{63,80},{61,98}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {27,-95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {11,-94},{6,45},{66,76},{65,40},{1,-85},{98,-78},{65,24}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {62,85}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {80,67},{40,-57},{79,72},{90,27},{34,41}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {4,84},{97,9},{1,59},{2,64},{54,4},{94,64},{50,68},{83,33},{77,-85},{94,-78},{81,65},{84,31},{53,30},{38,30},{0,84},{44,99},{0,-27},{25,7},{36,50}});
        org.junit.Assert.assertEquals( (int) 341, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {99,72},{23,2},{8,76},{95,68},{-1,78},{-14,63},{-98,2},{35,1},{92,21},{80,-50},{78,48},{73,1},{26,37},{94,74},{4,64},{30,-9},{38,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {0,52},{32,92},{36,38},{5,6},{75,-1}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {4,-16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {67,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {65,-87},{0,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {55,60},{88,22},{87,-96},{46,60},{32,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {78,-7},{69,61},{26,-26},{99,18},{65,64},{45,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {62,88},{91,89},{85,61},{8,6},{49,80},{65,-96},{27,65},{87,51},{11,4},{52,31},{40,77},{17,9},{49,47},{62,-30},{85,95},{2,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {74,-22},{92,-48},{23,12},{59,67},{94,41},{56,35}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {47,78},{29,53},{3,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {99,68},{44,79},{83,0}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {80,38},{94,75},{69,84},{61,16},{7,88}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {57,36},{0,47},{69,43},{80,72}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {12,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {15,10},{57,-9},{82,62},{91,59},{80,-56},{19,0},{35,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {5,27},{24,37},{73,56},{44,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {93,-41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {79,85},{92,-15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {31,-90},{63,30},{41,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {85,64},{43,79},{8,-97},{-60,41},{23,-45},{32,17},{41,35},{16,57},{48,30},{63,-10},{26,58},{36,12},{28,-7},{56,-20},{52,86},{86,89},{60,-17},{63,-63},{37,-89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {52,86},{7,33},{86,0},{93,-80}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {90,27},{39,-13},{9,97},{54,62},{7,58},{90,69},{95,-3},{20,35},{70,41}});
        org.junit.Assert.assertEquals( (int) 217, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {91,-24},{67,89},{26,94},{33,42},{78,45},{5,63},{64,98}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {19,-15},{98,70},{20,-46},{-99,0},{-61,23},{62,-86},{-52,43},{63,-81},{57,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {36,-49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {1,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {23,57},{60,40},{78,31},{90,-20},{41,0},{82,67},{89,94}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {10,5},{50,95}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {38,46},{97,3},{93,46},{58,-23},{21,69},{94,-72},{74,12},{56,62},{4,80},{39,68},{13,-23},{37,57},{19,88},{66,-59},{31,2}});
        org.junit.Assert.assertEquals( (int) 305, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {60,72},{90,66},{44,-16},{70,-71},{41,57},{14,9},{39,79},{19,28}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {25,20},{20,62},{1,87},{56,15},{19,64},{33,-59},{38,6},{47,-91}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {50,61},{57,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {91,40},{54,-63},{56,30},{71,41},{44,-26}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {58,-4},{90,66},{92,46},{15,55},{68,66},{89,47},{21,41},{71,-51},{68,93},{69,30},{73,96},{62,-46},{5,69},{82,61},{12,96}});
        org.junit.Assert.assertEquals( (int) 261, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {8,39},{59,31},{3,1},{44,49},{85,-24},{64,16},{41,19},{0,55},{80,87},{74,77},{74,-69}});
        org.junit.Assert.assertEquals( (int) 182, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {80,2},{83,88},{14,51},{23,65},{12,36},{76,30}});
        org.junit.Assert.assertEquals( (int) 152, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {7,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {40,58},{-99,18},{62,88},{28,-52},{17,-32},{23,-10},{17,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {44,71},{26,26},{7,69},{59,95},{45,1},{11,-67}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {36,13},{12,86},{13,77},{25,28},{93,53},{29,29},{4,-94},{14,-38},{98,9},{47,10}});
        org.junit.Assert.assertEquals( (int) 220, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {73,3}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {48,96},{31,20},{82,6},{88,-73},{15,63},{96,-69}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {44,45},{66,27},{24,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {20,-15},{25,40},{36,28}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {90,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {96,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {91,83},{96,50},{69,60},{56,79},{16,0},{58,7},{98,-87},{50,75},{52,7},{38,48},{14,90},{85,60},{3,6},{11,-19}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {18,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {79,49},{46,-5},{86,-24},{99,90},{79,40},{18,70},{32,89}});
        org.junit.Assert.assertEquals( (int) 159, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {86,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {11,-40},{93,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {67,37},{20,27},{57,24},{90,22},{33,-87},{1,-68},{45,89},{82,43},{86,-41},{41,47},{34,-86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {6,42},{98,55},{2,42}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {98,-63},{99,49},{26,97},{87,3},{90,44},{14,73},{74,83},{22,10},{1,67},{38,89}});
        org.junit.Assert.assertEquals( (int) 326, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {23,96},{78,31},{84,12},{91,59},{31,55},{31,2},{44,30},{26,99},{17,37},{51,79},{4,60}});
        org.junit.Assert.assertEquals( (int) 255, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {79,88},{24,87},{30,97}});
        org.junit.Assert.assertEquals( (int) 184, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {21,24},{32,-37},{27,3}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {92,95},{56,1},{32,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {31,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {74,38},{89,67},{79,6},{97,-64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {49,98},{61,80},{34,-88},{8,-97},{74,2},{93,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {92,81},{26,-36},{84,-81},{48,61},{4,45},{32,32},{57,32},{11,94},{73,60},{37,86},{77,24},{16,56},{65,45},{44,97}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {15,3},{90,-59},{92,73},{20,90},{84,28},{23,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {10,93},{9,48},{86,58}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {37,-99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {58,85},{19,-71},{24,61}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {16,70},{74,-17},{56,-90},{81,43},{67,8},{58,38},{95,-99},{10,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {86,59},{45,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {64,41},{12,28},{48,75},{69,81}});
        org.junit.Assert.assertEquals( (int) 103, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {1,-35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {52,61}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {82,49},{19,-29},{33,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {32,43},{81,18},{57,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {8,58},{12,71},{23,24},{41,52},{70,22},{68,35}});
        org.junit.Assert.assertEquals( (int) 205, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {99,65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {65,59},{59,96},{84,56},{54,73},{77,18},{34,33},{24,-78},{58,66},{58,-97},{8,2},{10,28}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {12,5}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {59,16},{53,88},{55,91},{65,63},{44,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {82,7},{0,94}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {90,-82},{20,-93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {62,52},{76,8},{62,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {97,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {33,-46},{49,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {43,-37},{93,45}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {31,86},{94,28},{46,65},{41,90},{11,90}});
        org.junit.Assert.assertEquals( (int) 176, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {27,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {3,35},{63,77},{32,-88},{61,-52},{19,-84},{25,75},{11,22},{58,71},{37,73},{12,1},{75,48},{39,-18},{70,28},{98,48},{82,65},{41,-70}});
        org.junit.Assert.assertEquals( (int) 206, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {97,82},{53,76},{0,51},{70,65},{30,34},{38,-10},{36,61},{46,12},{59,42},{43,0},{12,-19},{81,55},{79,61},{97,65},{47,51},{12,18},{29,51}});
        org.junit.Assert.assertEquals( (int) 188, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {71,4},{96,9},{48,-3},{43,82},{48,50},{61,10}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {67,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {82,-84},{13,35},{1,81}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {1,50},{27,98}});
        org.junit.Assert.assertEquals( (int) 148, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {96,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-34,-9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {26,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {60,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {53,27},{5,80},{35,2},{38,59},{39,6}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {95,44},{78,3},{66,38},{42,8},{83,70},{36,-14}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {20,60},{24,39}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {84,11},{63,43},{85,-79},{57,-93},{93,40},{19,52},{55,81},{64,22},{39,-14},{91,66},{54,73},{7,80}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {67,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {41,80},{31,-16},{31,63},{50,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {88,93},{70,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {49,39},{0,83},{19,79}});
        org.junit.Assert.assertEquals( (int) 201, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {63,-14},{86,90},{52,50}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {36,93},{7,31},{97,25},{70,21},{48,-68}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {22,2},{6,28},{20,58},{85,-52},{31,10},{44,96},{1,31},{99,88},{62,82},{86,31},{6,97},{96,-1},{34,-68},{45,-92},{85,91}});
        org.junit.Assert.assertEquals( (int) 214, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {96,-37},{6,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-9,67},{-84,88},{-53,99},{37,37},{64,57},{57,64},{-73,96},{82,-8},{-2,29},{34,36},{92,46},{85,-14},{81,28},{94,3},{31,-4},{-62,87},{34,99},{92,-47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {73,79},{85,-61},{17,50},{67,-73},{18,17}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {75,-16},{19,-11},{15,43},{45,7},{77,34},{2,40},{55,94},{33,-95},{22,-36},{12,89},{16,90},{65,48},{62,14},{66,7},{74,-24}});
        org.junit.Assert.assertEquals( (int) 313, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {38,99},{12,-80},{92,75},{36,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {12,8},{82,-24}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {97,83},{69,28},{83,51},{89,75},{94,29},{66,42},{64,-43},{42,74},{0,-66},{49,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {13,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {20,77}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {68,31},{94,4}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {40,3},{79,32},{82,4},{86,73}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {95,1},{37,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {70,-28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {64,26},{85,88},{53,-54},{51,75},{38,76},{47,30},{74,47},{8,66},{56,8},{20,73},{26,-75},{47,-80},{19,26},{43,-30},{33,16},{10,66}});
        org.junit.Assert.assertEquals( (int) 208, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {63,63},{54,-84},{71,0},{91,-22},{18,5},{51,-46},{64,52}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {9,42},{3,6},{83,-70},{41,-41}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {78,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-9,-16},{70,20},{84,13},{-50,-12},{0,52},{32,57},{-60,51},{79,72},{56,-63},{83,21},{45,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {71,2},{99,-76},{93,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {46,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {62,40},{29,8},{33,55},{60,36},{50,-1},{84,21},{26,14},{94,80},{82,38},{37,10},{23,-27},{87,7},{88,9},{0,1}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {79,18},{17,67},{56,80}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {22,45},{3,20}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {74,-79},{64,-89},{19,57},{96,32}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {56,39},{41,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {93,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {98,91},{16,63},{3,59},{54,52},{49,25},{25,-38},{31,40},{58,94},{14,55},{15,86}});
        org.junit.Assert.assertEquals( (int) 263, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {95,-64},{72,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {1,43},{95,-13},{94,8},{13,91},{62,44},{31,-54},{74,96},{28,58}});
        org.junit.Assert.assertEquals( (int) 192, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {88,70},{65,89},{52,28}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {79,61},{29,93},{11,22}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {36,50},{85,38},{52,-14},{65,-45}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {56,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {0,86},{32,68},{2,-43},{75,47}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {23,-22},{81,75},{88,21},{20,64}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {64,93},{57,51},{-3,82},{17,10},{-66,-88},{84,-1},{22,5},{10,79},{39,62},{73,-83},{9,-36},{-6,12},{21,69},{82,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {63,70},{26,46},{49,-42},{38,-82},{40,76},{24,1}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {80,-98},{77,85},{79,-79},{60,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {68,55},{91,-15},{52,46},{4,-83}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {68,-53},{77,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {7,98},{53,13},{17,84}});
        org.junit.Assert.assertEquals( (int) 182, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {30,93},{73,-67},{23,42},{17,93},{58,-62}});
        org.junit.Assert.assertEquals( (int) 228, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {76,2},{61,55},{59,43},{72,-32}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {48,-57},{90,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {30,50},{21,-58},{96,-13},{71,73},{91,-76},{53,63}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {55,-89},{63,39},{20,44},{74,-27},{7,27},{79,65},{8,53}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {17,28}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {33,78},{58,44},{89,90},{16,71},{23,65},{59,-55},{92,93}});
        org.junit.Assert.assertEquals( (int) 149, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {62,39},{19,27},{10,93},{83,42},{22,28},{25,-39},{64,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {8,-75},{77,30},{73,78},{78,-30},{31,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {16,-95},{46,5},{85,10},{46,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {27,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {87,29},{28,64}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {27,37},{7,-62},{36,52}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {43,92},{26,-22},{4,-14},{10,61}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {64,18},{45,-39},{92,39},{76,63},{63,52},{55,4},{63,15},{67,63},{91,92}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {68,27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {13,-99},{18,16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {89,-6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {88,35},{31,37},{47,60},{92,-3},{69,41},{14,15},{54,24},{37,25},{17,42},{42,62},{96,-52},{67,32},{31,98}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {0,82},{92,18},{71,65},{95,44}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {65,86},{78,14},{28,36},{79,71}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {21,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {81,19},{16,25},{66,35}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {6,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {68,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {81,25},{91,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {96,89},{39,59},{60,-14},{74,45},{35,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {74,46},{27,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {25,69},{68,60},{65,38},{2,35},{3,-20},{90,24},{52,34},{40,-47},{37,76},{58,-90},{32,-26},{53,16}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {4,32},{5,40},{78,0},{31,25},{82,74},{71,23},{36,91}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {53,87}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {88,-27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {23,93},{14,81}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {83,22},{2,90},{21,55},{63,61},{45,35},{19,82},{27,76},{50,37}});
        org.junit.Assert.assertEquals( (int) 303, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {30,-23},{20,6},{79,51},{17,64},{65,-42},{88,-55},{42,46},{44,18},{9,34}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {65,39},{7,56},{45,-25},{10,46},{55,8},{8,-33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {9,73},{18,20}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {1,74},{0,45}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {49,63},{77,18},{-84,8},{81,47},{24,70},{86,47},{-48,37},{0,77},{33,-39},{45,81},{90,-19},{69,93},{94,68},{89,58},{23,15},{36,9},{0,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {62,19},{0,30},{86,22},{29,26}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {88,-67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {0,44},{30,37},{43,98},{39,34},{23,-5},{55,94},{38,68}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {16,69},{78,-45},{80,92},{57,-3},{34,81},{9,92},{18,16},{5,44},{34,6}});
        org.junit.Assert.assertEquals( (int) 242, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {93,6},{19,-60},{97,-23},{74,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {0,53},{81,66},{46,13},{30,57},{25,32},{27,-91},{4,19},{70,28}});
        org.junit.Assert.assertEquals( (int) 129, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-20,25},{-6,48},{9,-29},{38,79},{14,45},{12,-27},{88,9},{50,46},{85,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {81,84},{54,1},{18,-36},{56,71},{91,-33},{7,-99}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {92,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {9,-65},{89,73},{22,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {0,65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {15,26},{52,87}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {95,-92},{79,-10},{20,81},{91,-41},{42,-3},{20,-43},{3,59},{57,75},{14,75},{12,-84}});
        org.junit.Assert.assertEquals( (int) 215, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {86,45},{1,7},{25,-91},{62,3},{75,38},{54,88},{45,79},{40,34},{58,78},{8,71},{47,64},{54,96}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {49,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {59,39},{66,90},{29,73},{99,76},{83,-11},{59,30},{90,83},{11,51},{79,54},{3,71},{94,23}});
        org.junit.Assert.assertEquals( (int) 212, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {23,33},{64,41},{13,84},{44,80},{57,29},{43,81},{32,39},{44,43},{56,7},{26,-87}});
        org.junit.Assert.assertEquals( (int) 204, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {85,67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {15,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {6,-93},{61,14},{45,19},{62,90},{88,24}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {55,19},{5,81},{89,-20},{81,-41},{32,81},{4,27},{96,0},{46,42},{95,14},{99,-91},{26,28}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {25,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {43,39},{52,-97}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {24,34},{72,72},{0,59},{40,65},{98,5},{71,58},{95,6},{20,41},{64,60},{27,-83},{22,90},{49,59},{39,69},{81,15},{28,-56},{22,81}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {50,-69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {24,71},{93,83},{9,53},{62,35}});
        org.junit.Assert.assertEquals( (int) 124, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {9,-20},{37,2},{89,87},{98,58},{86,3},{57,61},{78,69},{1,98},{66,89},{65,92},{81,80},{92,49},{68,-80}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {60,93},{85,-87},{72,-73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {92,-99},{22,-89},{99,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {59,7},{1,-35},{84,21},{71,87},{93,99},{52,11},{49,60},{61,3},{67,93},{8,28},{67,74},{9,9},{84,24},{62,-32},{8,21},{9,31}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {94,46},{64,68},{60,96},{60,27},{62,24},{33,20},{71,35},{89,83},{92,26},{31,72},{24,36},{60,38},{56,77},{97,98}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {96,-16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {34,76},{51,7}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {62,64},{37,-26}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {27,-53},{27,19},{-11,70},{56,83},{-99,58},{-54,85},{-99,4},{-17,19},{22,35},{-86,30},{21,11},{26,-84},{-52,-39},{17,-47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {81,39},{9,94},{24,77},{78,5}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {8,67},{50,-60},{64,22}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {72,-65},{13,49},{55,51}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {95,46},{68,70},{74,33},{68,-97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {8,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {18,49}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {16,80},{87,57},{86,3},{72,39},{10,52},{22,-44},{95,-33},{21,50},{42,94},{67,78},{62,28},{49,43},{90,42},{24,-15},{77,70},{3,39},{97,49},{64,79}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {38,74},{-99,-42},{83,96},{-3,44},{83,32},{-48,87},{92,39},{5,52},{33,-94},{-18,84},{94,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {99,-5},{84,3},{60,-43},{87,-70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {43,29},{85,17},{35,7},{26,57},{19,12},{35,51},{78,79},{83,54},{8,8}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {65,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {2,44},{22,91},{13,68},{0,2},{54,63}});
        org.junit.Assert.assertEquals( (int) 114, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {77,16},{97,-32},{66,47},{87,85},{66,96},{41,27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {65,77},{40,-37},{31,93},{95,43},{95,92},{15,-15},{28,-71},{85,68},{17,-64},{69,-90}});
        org.junit.Assert.assertEquals( (int) 170, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {39,86},{46,62},{18,9},{5,35},{26,63},{85,59},{98,4},{39,-89},{65,23},{68,-17},{5,58},{85,12},{0,36}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {36,74},{95,11},{53,23}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {89,93},{21,16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {95,96},{76,0},{20,34},{10,85},{49,30},{16,79},{24,30},{29,1},{9,27}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {17,50},{83,71},{20,-98},{47,51},{15,-84},{52,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {61,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {55,72},{0,74},{90,75}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {41,69},{94,38}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {50,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {32,2},{13,99},{39,-80}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {90,93},{22,12},{93,-96}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {44,58},{77,9},{40,74},{35,-1},{31,19},{96,98},{93,74},{19,22},{95,5},{83,56},{61,16},{98,65},{49,43},{27,89},{22,66},{31,59}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {24,66},{6,64},{83,93}});
        org.junit.Assert.assertEquals( (int) 130, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {92,-48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {16,-83},{6,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {91,91},{4,21},{44,98},{35,99},{38,0},{63,42}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {64,3},{25,70},{75,72},{38,66},{71,21},{96,47},{70,-57},{80,61},{3,56}});
        org.junit.Assert.assertEquals( (int) 126, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {79,90},{18,74},{34,64},{11,44}});
        org.junit.Assert.assertEquals( (int) 182, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {21,22},{9,-52},{22,44},{12,89},{52,49}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {81,10},{39,47},{0,43},{36,14},{31,37}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {61,-30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {89,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {44,22},{73,22},{65,30},{43,74},{46,-23},{40,-27},{36,14},{55,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {8,99},{75,-90},{44,-48},{3,92},{77,64},{25,-49},{22,-21},{34,14}});
        org.junit.Assert.assertEquals( (int) 205, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {35,79},{72,-86},{32,-62},{87,78},{83,-75},{9,19},{90,62},{89,16}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {92,-90},{29,-2},{54,-75},{73,69},{53,90},{68,-78},{52,38},{37,76},{81,-62},{39,17},{0,85},{82,80},{72,82},{38,16},{0,-69}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {44,37}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {22,30},{57,45},{76,13},{72,64},{84,72},{13,61},{20,-55},{86,24},{36,56},{3,0},{58,33}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {39,26},{36,49}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {74,3}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {85,65},{88,90},{45,-31},{4,-48},{29,-66},{6,-31},{54,88},{48,-15},{47,67},{26,97},{37,1}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {21,34},{17,27},{77,63},{90,-64}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {17,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {97,46},{10,80},{63,37},{59,71}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {45,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {68,-19},{18,13},{20,-25},{69,66},{85,56},{59,42}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {83,39},{44,2},{66,-62},{26,-29},{76,88},{40,7},{97,15},{94,16},{73,90},{51,-72},{45,34},{36,38},{52,10},{59,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {53,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {31,82},{38,35},{80,74},{38,71},{24,-58},{47,-37},{45,58}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {84,-27},{90,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {75,53},{10,7},{78,55},{31,60},{-64,70},{89,50},{0,91},{-14,99},{5,68},{57,-77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {49,-13},{14,76},{2,52},{19,4},{30,55},{80,10},{26,79},{2,34}});
        org.junit.Assert.assertEquals( (int) 300, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {39,24},{33,88},{1,75},{74,55},{13,94},{93,40}});
        org.junit.Assert.assertEquals( (int) 169, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {85,61},{-88,70},{9,58},{64,-83},{-14,82},{-39,-60},{89,19},{23,-56},{22,32},{61,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {96,12},{88,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {51,50},{94,-60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {60,11},{80,54},{11,62},{10,20},{32,79},{98,53},{74,66},{47,73}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {64,-41},{29,3},{9,-79}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {74,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {16,69},{63,68},{73,-49},{75,-6},{29,91},{28,11},{59,35},{16,18}});
        org.junit.Assert.assertEquals( (int) 178, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {45,12},{2,68},{22,-51},{76,0},{55,73},{83,-49},{83,79},{81,24},{89,23},{99,-75}});
        org.junit.Assert.assertEquals( (int) 141, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {14,60},{56,87}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {2,16},{38,43},{25,67},{15,32},{40,9}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {81,76},{64,73},{59,69},{0,8},{57,0},{66,54},{99,-53}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {63,-84},{7,52},{20,45}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {38,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {95,39},{94,9},{99,5},{60,24},{12,79},{2,-66}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {54,0},{19,10},{58,20},{47,39},{69,-19},{67,61},{98,59},{13,60},{94,-20},{24,51},{6,-84},{49,84},{84,-65},{8,-45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {5,89},{57,0}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {99,61},{90,59},{0,14},{75,13},{10,96},{65,-55},{94,98}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {51,51},{61,43},{6,0},{31,6},{74,-96},{96,77},{85,96},{23,0},{18,50},{72,22},{94,-31},{58,-56}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {32,3},{30,-2},{12,1},{49,-39},{86,84}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {89,80},{46,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {56,97},{42,85},{18,50},{58,64},{23,41},{81,96},{66,63},{31,31},{63,54},{34,24},{22,-94},{73,35}});
        org.junit.Assert.assertEquals( (int) 176, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {14,80},{39,41},{40,63},{16,39},{27,62}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {41,93},{68,19},{76,21},{61,10},{71,18},{35,19},{48,64},{13,92},{61,52},{40,-40}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {61,33},{41,21},{26,99},{75,-94},{18,75}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {40,1},{57,58},{12,24},{39,-27},{38,71}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {96,95},{76,52},{87,14},{55,41}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {44,10},{29,67},{21,63},{99,81},{87,89},{34,-42},{22,30}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {72,73},{42,85},{35,7},{82,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {60,99},{58,77},{-53,-5},{83,84},{17,9},{69,75},{-60,15},{-23,51},{71,92},{9,70},{67,86},{71,89},{77,77},{58,46},{82,30},{26,67},{28,2},{22,54},{-11,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {57,75},{23,58},{8,-98},{3,42}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {47,0},{4,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {17,22}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {76,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {74,75},{44,-31},{1,87}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {59,24},{12,29},{23,42},{94,41},{81,6}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {67,42},{59,-58},{24,2},{89,-70},{23,59},{77,-57},{41,1},{78,13},{78,43}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {12,51},{72,94},{13,-50},{9,8},{25,35},{89,20},{26,-43},{62,94}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {43,88},{17,-60},{64,68},{74,-2},{59,29},{32,68},{4,66}});
        org.junit.Assert.assertEquals( (int) 156, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {71,-70},{59,-82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {45,-25},{30,22},{73,-72},{77,77},{0,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {61,60},{1,57},{94,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {80,-62},{78,21},{90,-75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {30,25},{99,15},{23,95}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {18,12}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {17,40},{40,5}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {63,94},{89,70},{79,0},{6,91},{96,-32},{72,65},{61,44}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {6,5},{71,-86}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {69,-70},{7,28},{28,-97},{34,42},{13,52},{83,13},{25,49},{74,8}});
        org.junit.Assert.assertEquals( (int) 171, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {52,-76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {61,60}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {64,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {8,-67},{96,99},{68,6},{79,-71},{3,20}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {14,18}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {50,90},{96,33},{3,81}});
        org.junit.Assert.assertEquals( (int) 171, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {37,1}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {10,78},{26,-13},{38,81},{98,-79},{93,-72},{58,75},{74,-53}});
        org.junit.Assert.assertEquals( (int) 159, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {77,42},{4,3}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {67,77},{74,43},{21,3},{42,72},{72,64}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {93,-84},{11,98},{23,53}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {21,-19},{45,95},{84,-75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {83,95},{27,45},{60,23},{87,90},{38,-73},{46,-71},{74,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {69,49},{70,82},{12,-25},{78,-32},{90,82},{32,46},{58,40},{13,11},{59,29},{5,4},{66,7},{92,52},{60,-81},{85,-21}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {53,4},{57,94},{3,39},{42,30},{38,42},{2,-37},{90,78},{71,61},{20,65},{21,22},{80,9},{77,29},{52,63}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {20,7},{0,10},{0,-52},{68,75},{49,-82},{93,82},{42,-68},{1,63},{57,-63},{70,78},{77,73}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {61,17},{83,6},{45,60},{50,86},{65,89},{65,62},{44,2},{6,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {71,1},{63,80},{4,16},{44,76}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {10,12},{99,-10},{58,9},{49,62}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {69,6},{2,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {79,62},{55,49}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {15,17},{37,63},{80,-60},{43,41},{90,-24},{75,54},{26,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {82,15},{58,23},{34,29},{52,22}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {69,73},{42,56},{18,73},{68,19},{60,9},{70,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {5,32},{59,11},{40,-93}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {87,63},{38,42},{3,-11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {12,24}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {53,71},{85,46},{64,28},{31,-61},{77,41},{16,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {56,99},{24,99},{64,-50},{44,15},{42,86},{70,97},{28,51},{21,54},{99,49}});
        org.junit.Assert.assertEquals( (int) 239, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {32,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {5,26},{85,31},{45,71},{90,32}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {14,36},{28,47},{31,22}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {23,70},{85,25},{5,39},{70,88},{19,22},{30,87},{1,22},{96,35},{66,10},{83,46},{76,28},{49,87},{12,45}});
        org.junit.Assert.assertEquals( (int) 148, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {6,-69},{71,67},{56,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {81,81},{43,53},{69,18},{63,-94},{72,58},{31,41},{52,94},{18,50},{84,61},{77,8},{83,88},{3,16},{18,26},{12,22},{82,89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {21,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {16,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {21,79},{70,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {71,-32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {19,30},{7,44},{18,-25},{59,10},{58,75},{48,87},{81,-84},{80,38},{57,28},{87,-13},{7,-67},{60,-77}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {63,45}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {76,34},{30,34},{69,75},{27,4},{35,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {87,79},{18,-26},{88,75},{26,81},{47,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {13,8},{87,76},{74,28}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {73,43},{17,90},{4,18}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {47,96},{50,34},{12,83},{47,9},{16,25}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {23,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {59,45},{54,1},{3,5},{54,28},{76,36},{97,44}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {0,35},{80,-63},{9,48}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {79,56},{26,25},{68,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {45,-45},{95,-8},{75,42},{21,-44},{2,40},{11,68}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {38,-65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {30,40},{24,22},{9,17},{71,56},{52,-9},{69,53},{32,94},{96,5},{21,57},{41,43},{6,-60},{39,74},{20,-75}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {92,57},{79,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {88,76},{47,7},{99,29},{94,-13},{67,97},{54,79},{1,-15},{57,2},{37,96},{67,72},{87,21},{12,7},{67,90},{68,-90},{40,-2}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {65,20},{11,58},{13,19},{86,77},{67,20},{88,94}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {32,-49},{30,25},{97,59}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {91,-25},{11,42},{10,30},{21,69},{78,21},{88,48},{80,79},{71,72},{64,30},{79,83},{87,10},{73,46},{61,22},{66,-69},{32,73},{77,83},{40,36},{55,28},{23,64}});
        org.junit.Assert.assertEquals( (int) 278, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {28,28},{63,69},{91,53},{49,49},{14,56},{17,34}});
        org.junit.Assert.assertEquals( (int) 139, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {85,35},{58,21},{79,57},{42,10},{12,1}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {78,-50},{6,18},{39,36},{97,49},{84,12},{8,45},{79,84},{50,22},{42,9},{15,89},{40,-56},{7,60},{13,35},{74,77}});
        org.junit.Assert.assertEquals( (int) 194, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {27,0},{88,84},{13,-24},{24,37},{99,32},{3,37},{77,6}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {25,90},{34,-38},{78,-48},{81,-49},{62,13},{60,60}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {25,-25},{76,90},{4,11},{11,30},{25,-53}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {97,-49},{69,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {59,58},{70,20}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {42,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {37,-31},{69,51},{2,-17},{61,42}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {66,59},{63,5}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {84,39},{59,42},{95,56}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {13,-63},{23,70},{59,57}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {50,93},{42,22},{16,-58},{26,68},{54,-7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-87,-14},{95,67},{56,26},{-42,66},{16,82},{-73,60},{-61,88},{42,79},{-52,40},{73,44},{40,67},{43,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {72,27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {33,49},{9,82},{77,59},{8,62},{22,1},{2,-84},{28,86}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {73,-27},{62,68},{14,-20},{99,-1},{25,53},{85,10}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {39,3},{27,-97},{27,96},{6,19},{1,75},{29,47},{40,65}});
        org.junit.Assert.assertEquals( (int) 255, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {98,-60},{51,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {0,-68},{51,6},{14,33}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {93,98},{6,88},{20,54}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {62,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {18,19},{20,92},{52,-92},{47,-76},{14,46}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {6,75},{31,4},{43,30},{77,62},{10,9},{94,99},{88,93},{36,14},{22,84}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {37,84},{19,-72},{73,18}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {6,-43},{22,67},{71,-85},{80,26},{13,90},{26,-26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {0,55},{42,55},{47,1},{80,-61},{65,12}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {59,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {31,64},{93,11},{72,91},{92,37},{36,81},{20,62},{47,84},{68,-84},{36,62},{86,1},{10,45},{62,7},{87,43}});
        org.junit.Assert.assertEquals( (int) 109, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {93,42},{86,12},{47,75},{42,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {14,70}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {60,3},{2,5},{69,-56},{80,22},{50,16},{38,66},{26,13}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {89,55},{76,53},{2,55},{3,86}});
        org.junit.Assert.assertEquals( (int) 194, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {0,-42},{10,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {67,34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {98,45},{12,46},{97,-44}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {66,92},{43,55},{15,67},{45,17}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {6,91},{83,40}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {44,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {60,78},{85,36},{51,16},{43,0},{91,52},{97,11},{53,75},{9,8},{24,-24},{79,-94},{95,-7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {16,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {8,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {16,75},{71,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {9,88},{29,-79},{73,43},{64,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {58,16},{58,-39}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {5,98},{61,44},{7,22},{9,7}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {28,74},{93,-14},{5,-69},{54,-18},{65,28},{35,21},{77,44}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {78,8},{73,-51},{34,8},{65,24}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {96,35},{28,36}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {5,22}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {22,7},{91,67}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {32,1},{60,-84},{88,-27},{66,81},{22,71},{91,98},{44,-76},{69,79},{-87,3},{75,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {82,38},{70,57},{12,65},{36,-74},{71,45},{34,60},{88,8},{72,-71},{72,89},{72,57},{5,21},{40,85},{55,39}});
        org.junit.Assert.assertEquals( (int) 171, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {23,47},{78,74},{40,15},{12,28},{24,13}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {48,3}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {93,95},{-15,63},{-83,3},{75,47},{41,30},{22,89},{53,40},{-51,-16},{-60,-17},{8,88},{11,-26},{80,-48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {11,73},{16,38},{14,29}});
        org.junit.Assert.assertEquals( (int) 140, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {82,50},{33,68},{57,66},{81,16},{31,25},{35,67},{12,79},{4,29},{20,95},{29,91}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {98,69},{92,21},{58,45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {94,89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {12,-52},{40,46},{48,-15}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {1,98},{77,27},{7,19},{3,65},{44,-96}});
        org.junit.Assert.assertEquals( (int) 182, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {49,87},{92,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {82,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {9,89},{82,23},{88,64}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {22,3},{55,56},{64,29},{69,34},{45,9},{24,0}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {24,81},{30,87},{13,75},{24,-73},{12,14},{37,90},{25,31},{53,78},{36,-1},{43,2},{38,37}});
        org.junit.Assert.assertEquals( (int) 274, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {61,77},{65,17},{84,94},{96,45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {54,80},{93,-91},{71,27},{98,-82},{40,61},{16,77},{74,73},{0,36},{16,-96}});
        org.junit.Assert.assertEquals( (int) 193, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {47,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {48,82},{37,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {21,43},{88,27},{97,62},{7,51},{91,54}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {78,14},{75,96},{82,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {35,66},{83,69},{81,53},{39,14},{59,14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {42,15},{15,95},{86,-6},{21,83}});
        org.junit.Assert.assertEquals( (int) 193, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {73,-60},{67,95},{76,-91},{35,84},{74,75}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {77,44},{56,-15},{33,48}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {84,-68},{72,3},{58,-82},{28,48},{38,-39},{24,26},{9,24},{45,86}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {52,1}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {69,9},{65,-62},{70,-37},{69,30},{28,28},{57,18},{18,79},{2,-18},{12,70},{75,95},{43,78},{27,40},{29,94},{4,72},{72,2},{71,-88},{83,97},{53,18},{0,39}});
        org.junit.Assert.assertEquals( (int) 394, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {58,10},{46,78},{11,-91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {28,56}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {30,56},{51,76},{8,9},{16,6},{60,54},{47,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {73,66},{94,80},{53,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {9,-2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {13,95},{17,80},{82,3},{53,-19}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {69,30},{59,-95},{29,-36},{48,37},{21,51},{72,79},{77,48},{34,61}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {78,98},{51,51},{45,83},{50,1},{71,9},{18,98},{20,71}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {45,62},{81,12},{60,-72},{39,73},{52,55},{30,-67},{97,14},{91,41},{19,0},{18,0},{91,11},{55,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {1,82},{89,-75}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {46,-15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {8,63},{14,53}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {55,10},{64,76},{8,45},{22,53},{17,-88},{76,34}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {83,57},{69,82},{93,-67},{11,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {83,71},{99,-18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {35,-33},{10,29},{33,21},{46,26}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {83,-90},{84,67},{21,86},{92,61},{89,52},{28,-3},{58,20},{97,-80}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {45,86},{71,35},{79,35},{71,24},{74,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {10,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {10,37},{26,21},{21,34},{1,52},{10,8},{50,-69}});
        org.junit.Assert.assertEquals( (int) 152, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {91,32},{76,-85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {17,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {66,79},{87,45},{72,8},{43,64},{21,84},{70,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {25,27},{48,-21},{87,23},{78,-71}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {43,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {0,46},{58,43}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {13,54},{97,-70},{72,95}});
        org.junit.Assert.assertEquals( (int) 149, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {50,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {64,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {47,44},{36,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {4,2},{91,12}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {19,-82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {41,-84},{8,62},{3,97}});
        org.junit.Assert.assertEquals( (int) 159, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {47,23},{13,33},{98,72},{78,33},{9,93},{64,-80}});
        org.junit.Assert.assertEquals( (int) 126, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {17,-15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {81,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {53,20},{50,-89},{24,49},{49,4},{22,83},{80,66},{0,2},{81,56}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {49,-67},{66,77},{40,52},{31,66},{57,33},{4,-10},{41,6}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {51,69},{11,61},{98,-17},{26,3}});
        org.junit.Assert.assertEquals( (int) 133, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {59,37},{57,6},{69,47},{49,-60},{88,42},{69,2},{52,-18},{48,15},{96,88},{82,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {17,24},{87,-58}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {72,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {49,37},{7,47},{53,5},{95,-28},{43,56}});
        org.junit.Assert.assertEquals( (int) 103, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {64,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {90,22},{21,-57},{74,97},{32,77},{30,90}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {96,51},{57,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {84,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {10,86},{51,97},{21,16},{97,-6},{80,39}});
        org.junit.Assert.assertEquals( (int) 183, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {51,17},{63,89},{15,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {9,-49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {10,65},{44,42}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {7,23},{13,60}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {19,-66},{71,84},{66,54}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {35,-99},{74,3},{39,61},{16,26},{87,25}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {32,-57},{88,88},{93,42},{19,-9},{14,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {40,97},{13,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {73,67},{16,-88},{89,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {97,28},{74,52},{40,-63},{62,29},{51,7}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {12,-48},{79,57},{46,33},{7,-69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {88,99},{78,90},{19,18},{15,17},{57,98},{9,16}});
        org.junit.Assert.assertEquals( (int) 114, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {56,86},{14,33},{59,69}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {33,62},{43,60},{73,45},{13,23}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {80,-18},{71,57},{30,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {13,36},{37,98},{41,47}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {42,-30},{17,98},{5,-56},{6,19},{81,5},{64,95}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {4,-26},{62,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {44,33},{8,10},{47,58},{47,29},{76,91}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {56,13},{67,17},{52,50},{54,39},{40,54},{25,50},{32,56},{23,21},{26,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {12,-95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {84,64},{52,66},{86,43},{50,53},{56,40},{59,97},{74,80},{1,71},{68,79},{97,2},{79,10},{83,65}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {5,20},{84,38},{22,-73},{43,-16},{69,75},{27,0},{15,44}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {24,39},{17,66},{34,19},{9,92},{78,47},{52,-40},{46,48},{12,-48},{89,79}});
        org.junit.Assert.assertEquals( (int) 245, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {7,29},{16,55},{7,39},{94,-80},{84,68},{9,64},{41,66}});
        org.junit.Assert.assertEquals( (int) 224, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {52,75},{65,24},{92,79},{69,-37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {5,62},{58,20},{66,37}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {80,-84},{13,12},{22,69},{38,-37}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {10,-32},{58,62},{3,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {25,27},{51,-95}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {76,1},{71,0},{0,58},{98,33},{23,41}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {63,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {37,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {32,37},{35,73},{22,-15},{7,23},{2,71},{61,63},{28,-12},{29,-5},{22,-84},{49,42}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {64,-80},{70,-61},{25,-48},{40,78},{33,27},{74,86},{9,14},{44,49},{89,47}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {50,19},{11,-93},{14,-40},{84,20},{42,16},{1,88},{45,73},{30,-50}});
        org.junit.Assert.assertEquals( (int) 161, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {60,14},{28,29}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {62,-76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {47,81},{95,7},{23,89},{52,19},{81,25},{94,22}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {54,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {25,92},{65,-65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {98,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {62,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {3,56},{16,63},{41,-32}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {28,-19},{96,97},{80,86},{46,79},{17,72},{34,8}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {35,93},{12,28},{21,90}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {19,45},{18,58},{9,51},{46,1},{88,55},{0,-29},{49,84},{89,-58},{18,25},{33,83}});
        org.junit.Assert.assertEquals( (int) 237, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {74,11},{91,41},{79,22},{89,84},{85,-65},{33,3},{94,90},{34,86},{38,73},{42,65},{31,89},{94,-18}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {92,96},{35,-71},{44,94},{24,88},{94,84}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {7,65},{2,67},{68,-4},{59,69},{85,77},{25,-60},{56,2},{8,93},{47,-45},{92,21},{74,27},{88,46},{34,43},{0,14}});
        org.junit.Assert.assertEquals( (int) 308, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {56,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {19,-35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {51,-75},{75,14},{96,14},{61,-68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {85,21},{92,-91},{95,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {92,1},{33,8},{56,43},{61,34},{21,1},{50,80}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {98,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {24,93},{13,42},{36,89},{77,90},{76,15},{87,79},{38,2},{58,30}});
        org.junit.Assert.assertEquals( (int) 182, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {10,6},{38,49},{8,94},{82,40}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {66,33},{59,76},{23,75},{70,-2},{39,4},{33,79},{7,47}});
        org.junit.Assert.assertEquals( (int) 201, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {67,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {75,64},{58,-39},{41,14},{66,46},{29,-71},{28,26},{3,32}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {69,0},{78,30},{26,3},{95,48},{3,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {90,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {30,58},{84,16},{1,52}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {23,94},{7,-60},{39,52}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {28,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {13,2},{44,73},{93,-63},{74,27},{0,91},{84,82},{47,27},{62,76},{55,7}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {92,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {15,8},{64,76}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {89,47},{96,67},{30,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {26,6}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {77,61},{44,27},{42,36},{62,81},{66,66},{63,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {40,68},{71,32},{56,28},{22,-60},{84,-75}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {48,48},{12,13},{17,8}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {47,37},{88,8},{2,74},{74,94}});
        org.junit.Assert.assertEquals( (int) 111, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {60,15},{43,45},{39,28},{33,69},{87,10},{76,78},{16,-59},{40,37}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {32,76},{22,-44},{35,42}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {20,-84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {16,73},{47,86},{76,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {80,53},{84,69},{15,88},{12,8},{84,-70},{7,26},{30,91},{79,94},{14,34},{22,46}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {47,12},{31,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {11,70},{3,65}});
        org.junit.Assert.assertEquals( (int) 135, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {67,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {39,-12},{62,33},{94,83},{53,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {50,78},{66,75},{61,56},{0,0},{78,38},{84,-6},{11,3},{23,15},{13,66},{74,-36},{-72,62},{2,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {59,66},{2,45},{25,63},{65,14},{60,-91},{83,90}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {82,15},{88,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-6,37},{-69,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {49,74},{88,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {38,-86},{85,49},{52,-37},{0,9},{47,56},{11,31},{99,-80}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {51,95},{27,9},{59,54},{10,-60},{7,84},{98,16},{17,96},{85,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {62,16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {21,73},{74,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {40,38},{61,30},{58,-98},{62,10},{76,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {16,96},{83,-13},{50,-68},{15,-27},{35,48},{58,95},{5,-25},{50,76},{6,-20},{20,-31},{47,19},{22,76},{46,7},{72,56},{1,-7},{22,73},{67,19}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {30,43},{69,49}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {18,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {80,98},{92,97},{53,8},{30,36},{9,38},{55,-22}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {38,85},{91,45},{45,21},{96,69},{54,80},{29,3},{29,6},{41,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {39,88},{90,90},{37,93},{21,46}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {34,86},{69,79},{21,71},{68,70},{50,0},{84,22},{81,-10},{58,80},{21,66},{87,14},{52,88},{79,88},{9,-23},{69,57},{97,80}});
        org.junit.Assert.assertEquals( (int) 223, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {55,51},{24,16},{46,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {2,50},{89,-38},{86,-85},{77,62},{45,34},{6,31},{81,81},{48,14},{63,14},{11,13}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {51,4},{69,-98},{92,48},{41,20},{43,-61},{64,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {33,68},{72,75},{34,48},{96,-94}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {33,-36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {47,54},{82,25},{84,98},{0,-54},{85,38},{82,4},{53,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {66,85}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {98,38},{56,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {43,39},{44,3},{89,99},{45,89},{77,83},{28,27},{86,-14},{33,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {93,36},{51,72},{94,25},{7,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {99,53},{73,32},{51,15},{85,-98},{-7,-37},{7,75},{33,79},{59,41},{87,11},{52,-71},{-43,-19},{-4,97},{45,90},{70,34},{44,49},{4,30},{90,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-31,73},{14,97},{-18,99},{86,73},{81,85},{49,74},{9,13},{2,-61},{59,26},{-14,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {5,16},{36,91}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {5,48},{72,57},{31,71},{58,43},{20,42},{58,19},{23,2},{23,-66},{11,-75},{10,26},{47,68},{77,61},{1,12},{-99,38},{56,11},{28,96},{68,-16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {60,96},{82,50},{6,91},{70,-45},{86,6},{78,3},{17,-10},{57,47}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {11,59},{39,84},{53,65},{66,38},{79,2},{47,31},{80,95}});
        org.junit.Assert.assertEquals( (int) 143, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {89,62},{65,66}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {16,27},{1,82},{58,-58},{98,49},{7,38},{46,95},{95,73},{56,58},{17,78},{48,43},{52,65},{51,96},{97,42}});
        org.junit.Assert.assertEquals( (int) 225, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {51,4},{19,-88},{32,80},{90,76},{51,73}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {0,78},{23,59},{-67,-42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {10,-9},{96,89},{23,68},{73,64},{12,59},{71,90}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {43,15},{82,42},{91,92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {13,30},{52,75},{83,46},{27,-61},{70,-88},{47,96},{11,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {86,88},{55,78},{53,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {89,14},{33,87},{96,8},{32,70},{51,-8},{41,44},{73,87},{47,76},{53,84}});
        org.junit.Assert.assertEquals( (int) 163, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {26,-21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {8,48},{56,55},{96,-5},{48,-1},{95,17},{43,84},{59,78},{14,26}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {99,80},{75,11},{25,-17},{90,46},{15,11},{61,67},{3,-15}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {30,58},{83,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {68,94},{86,-23},{53,-78},{98,-41},{73,-22},{2,73}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {28,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {58,-26},{17,88},{44,74},{64,-22},{67,49},{4,-49},{89,34}});
        org.junit.Assert.assertEquals( (int) 162, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {18,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {19,59},{73,32},{17,41},{49,23},{32,-85},{1,17},{89,82},{9,34},{71,19},{10,55},{25,28},{55,-11},{33,-73},{33,58},{39,-22},{39,13},{85,70}});
        org.junit.Assert.assertEquals( (int) 223, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {64,56},{78,47},{39,-6},{17,95},{75,12},{37,-70},{44,49}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {36,-54},{55,9},{49,59},{69,89},{45,92},{8,-12},{93,-97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {35,1},{73,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {41,-86},{67,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {83,92},{85,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {30,0},{49,28},{32,93},{97,25},{86,18},{91,34},{79,20}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {50,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {1,76},{34,95},{55,55},{3,5},{55,55},{91,-25},{12,56},{96,15},{55,94},{33,85}});
        org.junit.Assert.assertEquals( (int) 232, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {78,30},{57,8},{74,-18}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {62,3},{38,49},{98,61},{99,71},{42,83},{75,-99},{44,32},{41,-55}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {93,70},{73,85},{23,38},{54,-89},{-65,59},{10,5},{60,56},{43,17},{93,0},{92,95},{58,58},{61,-98},{9,35},{16,32},{66,-19},{86,26},{58,33},{41,12},{42,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {82,69},{96,-4},{10,17},{64,73},{43,92},{65,93}});
        org.junit.Assert.assertEquals( (int) 109, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {7,92},{46,-48},{7,32},{61,58},{1,25},{57,64},{62,28},{74,20}});
        org.junit.Assert.assertEquals( (int) 149, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {29,19},{18,27},{76,-46},{66,71}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {16,59}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {54,10},{65,4},{60,40},{46,9},{11,90},{71,91},{82,5},{37,77},{23,-86},{13,-25}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {64,-48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {12,43}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {72,62},{53,79},{61,-41},{45,46},{86,54},{99,93},{31,-36},{65,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {1,7},{11,80},{39,61},{50,65},{66,67},{52,5},{70,19},{4,29},{93,20},{99,46}});
        org.junit.Assert.assertEquals( (int) 181, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {4,79},{5,-62},{87,2}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {98,6},{62,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {58,48},{11,1},{7,18}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {28,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {52,91},{18,60},{42,9}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {43,45},{38,47},{96,89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {10,80},{75,73},{42,69},{16,-96},{52,76}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {52,58},{96,91},{48,56}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {11,18},{37,87},{92,41},{6,91},{33,28},{31,46}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {5,22},{71,-7},{34,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {54,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {17,26},{3,31}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {94,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {54,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {57,43},{2,72},{10,42},{52,32},{79,92}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {54,-9},{27,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {21,59},{80,39},{16,-33},{39,4}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {4,34},{0,36},{0,41},{88,73},{14,17},{55,30},{8,-78},{78,-82},{79,68},{34,31},{74,-72},{19,5},{73,23},{95,-80},{55,53},{75,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {93,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {17,64}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {94,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {65,70},{54,59},{26,4}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {40,-21},{15,12},{65,86},{71,70},{41,81},{38,66},{3,83}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {19,-42},{79,30},{41,-68},{65,8},{9,34},{59,5},{97,39},{-17,69},{30,38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {81,35}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {48,94},{4,17},{39,38},{13,77},{37,73},{13,27},{7,50},{48,37},{29,-48},{55,-68},{69,56},{13,3},{66,49},{2,9},{91,88},{1,-83},{2,67},{96,81},{4,65}});
        org.junit.Assert.assertEquals( (int) 141, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {63,39},{7,-4},{86,57},{34,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {76,89},{29,21},{15,43},{39,61},{53,96},{25,5},{23,83},{84,51}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {60,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {15,-28},{58,98},{82,98},{8,7},{76,62},{61,16},{82,36},{19,29},{59,88}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-27,-22},{35,3},{15,50},{61,17},{9,80},{43,-2},{74,55},{15,43},{-2,0},{59,23},{0,80},{-91,37},{62,72},{-92,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {65,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {33,-39},{4,-80},{72,55},{22,9},{85,-67},{34,31},{84,56},{32,91},{50,7},{62,59},{14,28},{31,12},{43,81},{80,-74},{59,74},{36,8},{40,94},{21,-13}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {80,80},{81,71},{65,61},{10,74},{36,-48},{86,60},{97,-44},{65,62},{19,48}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {74,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {55,64},{78,79},{6,32},{38,-97},{51,82},{94,42},{0,6}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {52,-18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {12,-78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {15,85},{17,92},{32,6},{40,34},{55,90},{68,71},{37,49},{88,35},{91,51}});
        org.junit.Assert.assertEquals( (int) 177, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {72,89},{19,72},{4,79},{7,-94},{4,-65},{78,0}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {92,27},{74,7},{17,13},{70,52},{69,99},{10,97},{-96,79},{85,-58},{20,1},{52,15},{78,84},{51,30},{82,20},{18,-97},{47,21},{22,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {40,34},{52,74},{47,3},{16,67},{27,51},{38,53},{51,67}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {65,-90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {9,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {74,46},{63,73},{52,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {0,3},{14,73},{43,69},{9,48},{14,51},{73,71},{15,-2},{66,61}});
        org.junit.Assert.assertEquals( (int) 196, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {99,-41},{69,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {86,35},{79,46},{22,-11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {3,22}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {43,29},{4,97},{2,46},{45,16}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {76,-28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {9,67},{7,93}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {52,67},{71,20},{97,18}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {39,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {36,90},{17,-49},{60,40},{49,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {78,74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {50,34},{46,16},{35,51},{66,-20},{66,14},{69,83},{75,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {33,66},{42,-92},{0,90},{68,53},{95,34},{35,91},{16,30},{30,98},{35,78},{50,12},{93,5},{44,53},{84,17},{41,-63},{95,-27},{65,73},{76,71},{8,0}});
        org.junit.Assert.assertEquals( (int) 309, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {41,87},{36,98},{95,5}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {65,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {42,6},{5,54},{5,22}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {86,0},{58,55},{10,19},{66,78},{22,4},{73,81},{13,13},{91,9},{9,75},{95,-80},{18,61}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {35,97},{15,-6},{16,19},{29,57},{74,27},{4,-5},{35,47},{58,45},{17,18}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {15,81},{37,-97},{7,39},{15,47},{56,-80},{33,97},{74,39},{62,39}});
        org.junit.Assert.assertEquals( (int) 128, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1000() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {46,-84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1001() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1002() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {76,79},{97,20},{1,-74},{82,74},{28,51},{17,24},{91,36},{76,11},{81,10},{53,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1003() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {64,13},{49,25},{50,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1004() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {67,92},{50,9},{68,-83},{54,86},{25,75},{43,13}});
        org.junit.Assert.assertEquals( (int) 161, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1005() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1006() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1007() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {16,-64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1008() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {78,28},{75,67},{51,1},{42,-89},{85,-2},{80,11},{63,13},{12,67}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1009() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {81,63},{86,81},{19,51},{65,79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1010() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {35,27},{56,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1011() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {91,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1012() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {8,74},{81,-65},{40,71},{48,49},{5,-57},{8,-62},{95,-98},{35,21},{11,98}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1013() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {47,87}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1014() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {3,46},{55,-83},{78,-46},{51,42},{98,91},{38,14},{92,61}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1015() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {44,-1},{62,61}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1016() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {15,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1017() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1018() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1019() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1020() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {92,63},{20,96},{73,72},{21,6}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1021() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {65,21},{87,87},{23,46},{15,30}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1022() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {89,94},{60,82},{50,59},{5,16},{95,93},{56,31},{10,55},{1,31}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1023() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1024() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {32,91},{87,52},{70,-18},{27,71},{60,61},{75,38},{91,74},{9,31},{37,25},{84,83}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1025() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {18,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1026() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {27,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1027() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {20,-40},{43,11}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1028() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1029() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {59,97},{10,11}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1030() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1031() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1032() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {81,50},{48,95},{29,13},{99,80},{75,83},{66,-40},{17,62}});
        org.junit.Assert.assertEquals( (int) 157, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1033() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {8,-39},{4,45},{68,-24},{76,5},{33,-64}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1034() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {91,70},{12,28},{12,45},{28,23},{31,-24},{54,13}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1035() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {45,35},{24,-36},{86,49},{84,40},{15,93},{16,95},{42,6},{7,-26},{17,11},{92,31},{53,-74}});
        org.junit.Assert.assertEquals( (int) 188, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1036() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {19,22},{28,21},{7,32},{69,22}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1037() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {82,17},{27,9},{32,34}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1038() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {16,96},{44,49},{8,-18},{7,82},{25,55},{78,38},{45,67},{12,87}});
        org.junit.Assert.assertEquals( (int) 265, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1039() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {19,73},{81,-45},{20,32}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1040() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {13,76},{52,53},{54,61},{69,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1041() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {51,52},{62,22},{44,5},{45,24},{37,44},{98,85},{15,-69},{80,14}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1042() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1043() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {62,31},{39,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1044() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {14,-38},{85,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1045() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {83,81},{93,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1046() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {70,-33},{96,51},{90,41},{69,-92},{74,33},{55,-44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1047() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {64,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1048() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1049() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {20,4},{93,91},{84,-95},{41,-30},{27,62},{50,81}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1050() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {19,38},{23,32},{28,-76},{8,-78}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1051() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {44,61},{83,46},{55,-44},{4,55},{-70,-44},{-7,68},{-93,-50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1052() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {77,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1053() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {58,-90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1054() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1055() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {83,-52},{63,21},{46,-11}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1056() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {68,17},{94,69},{16,1}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1057() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {30,94},{51,8},{40,6}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1058() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {66,90},{66,54},{64,-12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1059() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {41,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1060() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {20,-61},{95,67},{98,-56},{53,-31},{6,52},{47,95},{83,45},{8,70},{56,-1},{10,94}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1061() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {6,19},{11,27},{47,84},{23,-26},{55,90}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1062() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {81,16},{7,92},{98,85},{36,-18}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1063() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {19,48},{12,20},{46,8},{70,13},{49,59},{15,87},{78,3},{47,42},{84,55},{82,-53},{70,56},{73,52},{65,-89},{19,19},{28,89},{19,80}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1064() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {13,22},{55,77},{41,7},{48,-71},{75,-65},{48,43},{5,98}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1065() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {44,-12},{1,79},{66,87}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1066() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1067() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {28,42},{-39,72},{51,84},{42,30},{19,50},{14,79},{95,48},{91,3},{36,-24},{39,81},{40,-69},{-40,22},{95,-42},{85,7},{37,41},{38,-12},{21,84},{62,-34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1068() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {56,76},{3,2},{3,44},{47,53}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1069() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {30,51},{87,77},{15,13},{89,-66}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1070() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {95,-89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1071() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {56,10},{74,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1072() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {62,-65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1073() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {28,31},{25,84},{52,28},{55,46},{13,70},{59,81},{56,-62},{32,-84},{0,-97}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1074() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1075() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {12,-32},{40,97},{45,30},{98,28},{66,53}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1076() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {9,36},{64,86},{70,-59},{99,41}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1077() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {56,-90},{11,60},{75,-94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1078() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {94,73},{45,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1079() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {10,95},{60,21},{75,45},{41,-5},{39,44},{64,-21},{34,-24},{42,46}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1080() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {47,66},{24,23},{11,76},{-86,-27},{48,76},{92,90},{13,26},{68,51},{61,94},{40,14},{98,7},{-58,51},{-15,77},{4,-29},{77,15},{-26,66},{0,-68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1081() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {60,83}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1082() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {10,64},{60,93},{22,7},{75,80},{40,72},{98,1},{18,56}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1083() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1084() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1085() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1086() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1087() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1088() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {62,12},{80,21},{20,30}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1089() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {1,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1090() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1091() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1092() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {67,-43},{4,91},{84,85},{77,9},{-66,36},{7,74},{64,79},{40,96},{13,92},{-97,80},{70,77},{57,96},{85,45},{42,97},{6,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1093() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1094() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {17,-85},{45,87},{11,33},{82,-17},{85,42},{38,68},{14,-50},{62,-99},{68,21},{28,7},{4,23},{64,86},{25,98},{82,-15},{67,-38}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1095() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1096() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {38,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1097() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1098() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {70,-96},{55,-28},{60,-46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1099() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {59,17},{51,79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {64,-70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {94,-15},{73,37},{41,46},{60,86},{55,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {95,-99},{59,71},{56,55},{61,3},{85,33},{85,78},{23,69},{39,45}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {49,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {40,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {21,32},{86,98},{25,17}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {72,87},{62,55},{90,0},{85,65},{85,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {21,15},{70,29},{3,95},{12,75},{12,10},{49,-80},{11,1},{31,22},{83,86},{58,97},{22,29},{84,74},{44,24},{58,50},{23,42},{72,95}});
        org.junit.Assert.assertEquals( (int) 212, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {25,-7},{63,91},{98,68},{44,46},{26,24}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {12,0},{15,-98},{38,18},{96,-41},{40,74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {16,43},{22,32}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {40,69},{57,52}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {40,69},{28,49},{68,-25}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {58,91},{23,62},{33,-18},{73,94},{53,5},{3,64}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {30,77}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {83,13},{17,10},{59,19},{65,-75},{8,90},{41,63},{18,1}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {59,43},{29,-83},{50,90},{0,92},{29,72},{8,15},{95,-38},{43,-27},{14,87},{22,21},{56,40}});
        org.junit.Assert.assertEquals( (int) 266, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {60,-86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {91,24},{8,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {31,36},{22,-61}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {33,69},{8,68},{66,91},{91,16},{55,-83},{78,28},{-67,68},{30,-75},{33,60},{27,83},{59,-93},{-15,65},{88,92},{20,81},{-35,51},{2,33},{11,54},{51,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {80,78},{7,12}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {69,43},{83,-98},{73,-89},{52,35}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {78,38},{18,79},{7,72},{97,27},{12,77},{19,67},{40,92},{48,84},{8,46},{42,0}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {55,18},{53,-78}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {69,66},{64,71},{18,1},{2,46},{39,8},{55,84},{3,71},{5,74},{31,82}});
        org.junit.Assert.assertEquals( (int) 357, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {26,51},{64,34},{98,66},{26,45},{75,-74},{74,54},{0,61},{69,-66},{69,39},{94,51}});
        org.junit.Assert.assertEquals( (int) 157, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1132() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {49,-73},{19,68},{2,17},{47,57},{75,12},{89,49},{6,0}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1133() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {23,93},{4,48},{4,63},{76,37},{54,36},{32,-85},{87,-49},{34,38},{54,14}});
        org.junit.Assert.assertEquals( (int) 242, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1134() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {58,-11},{20,16},{81,1},{88,32},{8,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1135() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {98,45},{3,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1136() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {7,97},{1,-27}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1137() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {33,14},{11,58},{99,71},{52,-66}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1138() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {15,56},{49,-75},{10,60},{31,25},{15,81},{62,73},{65,-13},{12,48},{89,50},{55,32},{79,50},{63,5},{75,79},{11,94},{48,12},{40,43},{2,-46},{68,-70},{0,93}});
        org.junit.Assert.assertEquals( (int) 432, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1139() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1140() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {50,1},{2,-50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1141() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {9,-88},{19,-36},{79,98},{51,-11},{82,65},{74,5},{46,32},{83,-72}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1142() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {54,44}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1143() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {33,68},{64,32},{44,83},{11,39},{80,6},{6,10},{68,50}});
        org.junit.Assert.assertEquals( (int) 161, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1144() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {2,49},{27,91},{54,82}});
        org.junit.Assert.assertEquals( (int) 222, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1145() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {81,82},{59,82},{31,74},{6,31}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1146() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {41,72},{62,75},{34,97},{23,56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1147() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {75,-82},{30,60},{36,83},{0,46},{1,43},{75,-11},{48,4},{9,-25},{89,61}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1148() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {72,67},{25,86},{92,64},{17,-72},{7,-44},{13,63},{33,14},{17,78},{8,17},{51,80},{94,36},{25,72},{99,9},{12,39}});
        org.junit.Assert.assertEquals( (int) 203, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1149() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {24,-51},{3,78},{14,5},{48,-52}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1150() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1151() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {73,-25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1152() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {12,-38},{21,-22},{88,9},{58,17},{45,64},{83,90},{42,38},{90,24},{73,37},{87,-8},{5,-55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1153() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {15,14},{92,66},{84,-45},{73,-11},{77,-26},{76,34},{77,10},{39,0},{57,20},{90,88},{29,36},{14,6},{57,-24},{72,19},{91,25},{13,-51}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1154() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1155() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {85,55},{64,-23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1156() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {25,63},{18,98}});
        org.junit.Assert.assertEquals( (int) 161, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1157() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {11,41},{58,-87},{1,-58},{75,-2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1158() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {40,94},{92,76},{17,-47},{43,-54},{77,-70},{76,28},{13,97},{59,14},{46,87}});
        org.junit.Assert.assertEquals( (int) 191, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1159() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1160() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1161() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {60,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1162() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1163() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1164() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {92,32},{68,94},{18,79},{80,-73}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1165() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {14,61},{54,83},{61,33},{82,58},{39,0},{90,30},{60,17},{71,99}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1166() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {34,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1167() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {81,89},{24,79},{17,26},{95,32},{69,-12},{99,-13},{44,63},{33,-70},{70,52},{90,77},{57,60},{45,-11},{58,30},{91,-19},{19,3},{59,-67},{77,83},{72,24}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1168() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {51,46},{76,51},{5,-32},{33,16},{39,-87},{88,36},{85,-5},{22,-62},{67,11},{57,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1169() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {82,95},{38,30},{7,57},{24,48},{42,35},{22,21},{54,55},{93,42},{58,15},{82,-1}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1170() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {55,9},{96,98}});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1171() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {55,58},{34,32},{11,55},{22,16},{91,46},{4,82},{93,26},{66,24},{77,63},{88,24},{90,81},{60,53}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1172() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {44,56},{15,36},{86,19},{91,78},{14,95},{98,1}});
        org.junit.Assert.assertEquals( (int) 187, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1173() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {37,20},{61,10},{5,4},{17,30},{93,37},{26,11},{49,75},{19,89},{86,83}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1174() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {79,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1175() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {72,45},{70,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1176() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {10,53},{8,49},{53,19}});
        org.junit.Assert.assertEquals( (int) 121, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1177() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1178() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {23,45}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1179() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {67,99},{46,24},{77,-76},{57,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1180() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {9,-32},{41,86},{97,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1181() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1182() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {46,14},{91,48},{7,70},{50,80},{22,97},{59,86}});
        org.junit.Assert.assertEquals( (int) 253, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1183() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {46,-48},{21,78},{9,8},{65,-10},{33,77},{74,5},{86,26},{97,52},{94,0},{59,84},{80,17},{77,79}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1184() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {23,36},{61,43},{74,40},{55,56},{18,35},{76,8},{65,71},{20,63},{23,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1185() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {72,28},{16,95},{30,16},{57,61}});
        org.junit.Assert.assertEquals( (int) 156, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1186() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {43,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1187() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1188() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {73,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1189() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1190() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {68,30},{89,30},{55,-35},{14,52},{85,17},{5,93},{44,37},{43,13},{74,-67},{49,96},{65,45},{70,66},{87,-29},{70,26},{79,-59},{85,1}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1191() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {25,89},{33,-50},{68,56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1192() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1193() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {61,-28},{5,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1194() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1195() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {0,-4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1196() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {21,80},{24,9},{42,96},{65,41},{61,73},{78,-89},{52,-49},{72,-58}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1197() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1198() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1199() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {23,49},{42,21},{33,76},{66,14},{31,93},{53,-57},{8,-21},{51,34},{72,91},{74,-19},{71,50},{41,68},{94,64},{72,0}});
        org.junit.Assert.assertEquals( (int) 169, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1200() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {88,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1201() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1202() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {64,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1203() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {28,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1204() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {52,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1205() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {50,10},{73,65},{53,1},{11,43}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1206() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1207() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {70,29},{9,-99},{79,96},{12,42}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1208() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {81,75},{83,30},{54,-47},{5,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1209() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {58,72},{90,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1210() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-41,-10},{37,-89},{22,-15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1211() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1212() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {14,71},{63,-85},{85,78},{25,-79}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1213() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {23,46},{89,4},{49,58},{17,-77}});
        org.junit.Assert.assertEquals( (int) 104, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1214() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {92,66},{74,-1},{34,9},{91,-41},{44,21},{10,-16},{90,-92}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1215() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {1,19},{69,48}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1216() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1217() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1218() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {51,30},{44,78},{63,-4},{64,35},{3,95},{51,68},{87,79},{21,5},{33,5},{28,84},{36,53},{56,62}});
        org.junit.Assert.assertEquals( (int) 257, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1219() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {42,1},{98,17},{34,69},{38,-15},{54,82},{54,-78}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1220() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {45,-63},{76,1},{42,17}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1221() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {61,6},{93,75},{82,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1222() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {27,68},{62,23},{68,38},{85,90},{85,37},{25,51},{51,34},{39,15}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1223() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1224() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {3,-97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1225() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {49,31},{56,27},{36,-93},{96,65},{56,2}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1226() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {14,18},{83,0}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1227() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {16,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1228() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1229() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1230() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {63,12},{58,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1231() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {84,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1232() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {36,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1233() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {16,-88},{14,21},{93,80},{65,-31}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1234() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1235() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1236() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {14,95},{28,32}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1237() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1238() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {41,-21},{64,-5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1239() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {46,14},{20,-78},{98,63},{84,-86},{66,-55},{82,67},{86,99},{5,74},{63,-16}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1240() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1241() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {53,66},{39,97},{33,8},{92,4},{99,33},{18,4},{48,15},{9,-72},{67,35}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1242() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {38,28},{62,45},{85,78},{87,14},{17,-65},{29,78}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1243() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {2,-86},{28,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1244() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {72,32},{73,30},{64,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1245() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {0,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1246() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {73,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1247() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1248() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1249() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {88,2},{78,96},{20,22},{70,-29},{93,23},{77,89},{92,75}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1250() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {51,94},{5,35},{65,0},{29,14},{19,86},{3,96},{39,-82},{94,80},{84,58}});
        org.junit.Assert.assertEquals( (int) 217, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1251() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {37,57},{27,60}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1252() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {53,81},{81,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1253() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {50,38}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1254() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {79,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1255() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {26,42},{57,-6},{34,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1256() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {31,92},{70,41},{8,3},{53,47},{35,43}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1257() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {96,83},{23,48},{56,-7}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1258() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1259() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1260() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {83,-49},{57,55},{31,-39}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1261() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {19,39},{83,-4},{64,75},{2,73},{34,99},{34,81}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1262() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {30,-93},{93,87},{68,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1263() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {66,11},{41,70},{45,15},{59,1},{37,85},{59,-95},{70,85},{49,5},{62,-69},{15,92},{16,59},{91,-89},{21,-15},{1,92},{11,-67},{29,45},{65,45},{29,92}});
        org.junit.Assert.assertEquals( (int) 184, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1264() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {92,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1265() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {43,42},{43,69}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1266() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {86,53},{92,97},{21,-42},{94,2},{62,98},{89,7}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1267() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {50,21},{68,3},{89,89},{90,66},{34,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1268() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {55,43},{58,7},{6,83}});
        org.junit.Assert.assertEquals( (int) 126, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1269() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {28,-11},{0,46},{51,14},{63,99},{51,27},{7,-78},{14,62},{36,52},{5,32}});
        org.junit.Assert.assertEquals( (int) 239, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1270() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {34,44},{14,62}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1271() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {77,51},{75,27},{95,75},{2,64},{28,9},{59,34},{82,27},{41,94},{44,18},{0,-38},{78,-11},{32,22},{34,35},{75,77}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1272() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {16,80},{19,19},{90,39},{45,-7}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1273() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {72,53},{46,-2},{86,55},{31,53},{45,-53},{16,0},{19,27}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1274() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {63,81},{59,14},{0,40}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1275() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {5,38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1276() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {45,6},{95,93},{61,55},{52,34},{11,-59},{74,63},{44,34},{18,85},{8,57},{96,63},{0,68},{12,58},{93,93},{97,74}});
        org.junit.Assert.assertEquals( (int) 268, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1277() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {60,30},{55,2},{77,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1278() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {84,58},{14,3},{35,94},{76,55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1279() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {10,42},{60,36},{90,-98},{78,-57},{76,70},{-12,-16},{3,37},{-3,28},{55,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1280() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {85,78},{14,52},{63,33},{99,93},{59,-50},{5,13},{59,36},{39,-59},{51,58},{14,-92},{17,83},{10,43},{72,-78},{13,-94},{44,66},{30,66}});
        org.junit.Assert.assertEquals( (int) 191, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1281() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {10,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1282() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {88,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1283() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1284() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {65,55},{60,12},{21,44},{72,95}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1285() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1286() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1287() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {54,69},{3,83},{52,86},{3,-32},{25,-62}});
        org.junit.Assert.assertEquals( (int) 169, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1288() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {44,77},{29,-96},{17,-39},{78,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1289() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {41,45},{4,-6},{9,20}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1290() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {86,-30},{42,34},{48,69},{7,-87}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1291() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {15,71},{0,47}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1292() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {71,-2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1293() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1294() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {36,71},{8,-54},{69,-5},{42,79},{97,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1295() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {41,79},{72,5}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1296() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {24,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1297() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {84,5},{79,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1298() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {12,73},{8,62},{86,96},{60,68}});
        org.junit.Assert.assertEquals( (int) 135, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1299() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {43,13},{32,54},{33,-3},{48,36},{41,16},{33,-75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1300() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {18,91},{64,65},{54,60},{98,96},{80,77}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1301() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {55,6},{30,97},{99,-86},{61,46}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1302() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {24,-69},{26,70},{97,86},{12,0},{94,-9},{28,31},{3,-20},{84,23},{50,41},{53,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1303() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {36,-76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1304() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {41,36},{36,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1305() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {48,83},{84,52}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1306() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {64,-56},{43,54},{60,74},{24,53},{34,15},{47,43},{7,-6},{17,26},{29,5},{98,51},{94,29},{44,-85},{54,37}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1307() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {41,18},{22,77},{53,55},{38,53}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1308() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {95,45},{31,98},{11,72},{59,97},{80,8},{75,99},{28,41},{56,15},{39,85},{66,57},{9,-69},{64,-17},{16,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1309() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {42,73},{8,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1310() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {95,21},{73,93},{17,17},{52,91},{57,5},{43,-3},{4,-48},{8,96},{73,6},{88,26},{63,52},{5,94},{10,67},{70,-9}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1311() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {33,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1312() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1313() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {41,60},{92,87},{19,43},{9,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1314() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {54,11},{18,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1315() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {97,28},{50,-74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1316() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {92,22},{89,-15},{61,24},{67,42},{86,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1317() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {67,20},{86,23}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1318() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {14,40},{6,13}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1319() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {48,-56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1320() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {83,9},{67,-68},{56,94},{42,-94},{49,50},{90,46},{66,34},{99,71},{28,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1321() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {16,57},{40,70},{38,53},{82,84},{29,86},{44,28},{62,58},{33,35},{32,52},{9,49},{4,44},{68,27}});
        org.junit.Assert.assertEquals( (int) 236, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1322() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {86,-24},{19,28},{48,2}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1323() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {22,52},{62,21},{99,33},{79,87}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1324() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {69,61},{37,-45},{40,57},{17,84},{22,5}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1325() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {39,99},{0,30}});
        org.junit.Assert.assertEquals( (int) 129, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1326() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {18,87},{78,58}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1327() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {16,29},{11,45},{70,5},{81,-89}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1328() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1329() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1330() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {61,62},{38,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1331() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1332() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {1,-14},{21,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1333() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1334() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1335() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {88,77},{89,39},{39,17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1336() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {86,62},{6,-36},{13,81},{94,16},{28,-28},{87,95},{65,37},{57,43}});
        org.junit.Assert.assertEquals( (int) 124, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1337() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {54,14},{37,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1338() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {84,59},{5,71},{91,79},{26,-11},{41,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1339() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1340() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {78,-50},{90,0},{75,82},{82,25},{39,58},{66,43},{83,4},{10,-66},{90,-96},{33,62},{70,64},{85,-94},{18,91},{66,-84},{31,34},{38,-79},{23,6},{79,15},{37,-80}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1341() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {61,90},{-64,79},{35,53},{48,39},{46,55},{54,62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1342() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {22,9},{99,12},{88,23},{35,45},{25,-30},{5,80},{52,41}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1343() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {28,81},{93,82},{12,5},{45,54},{0,60},{20,95},{23,-85},{84,33},{53,82},{76,79},{30,97},{78,-93},{39,-41}});
        org.junit.Assert.assertEquals( (int) 236, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1344() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1345() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {18,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1346() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {66,27},{27,81},{58,11},{69,40},{51,92},{54,-26},{56,-20},{7,58}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1347() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1348() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-27,83},{85,45},{16,43},{51,50},{79,96},{-95,-39},{45,69},{8,48},{75,-17},{68,27},{43,46},{65,19},{92,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1349() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {16,84},{43,6},{3,63},{26,-21},{71,-72}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1350() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {16,-45},{78,20},{53,-91},{98,72},{23,9}});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1351() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {41,22},{54,73}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1352() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {45,95},{3,30}});
        org.junit.Assert.assertEquals( (int) 125, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1353() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {34,48}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1354() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {76,42},{76,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1355() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1356() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {19,23},{40,39},{92,-91},{69,38},{94,57},{15,81},{45,-78},{37,73}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1357() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {76,99},{99,75},{18,-22},{9,30},{35,-60}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1358() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {23,-96},{76,15},{52,-71},{30,26},{15,90},{36,23},{65,-21},{0,-72}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1359() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {21,-60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1360() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {6,43},{93,94},{1,41},{6,-73},{84,48},{19,-64},{1,96}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1361() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {43,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1362() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {57,15},{94,78},{7,29},{78,35},{66,71},{73,62},{65,-81}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1363() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1364() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {55,39},{56,14},{42,89},{28,-27},{30,-71},{6,30},{76,-28},{83,25},{50,64},{5,82},{61,-53},{9,60},{87,-65},{51,97},{53,84}});
        org.junit.Assert.assertEquals( (int) 201, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1365() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1366() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {83,75},{11,25},{22,21},{20,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1367() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {0,57}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1368() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1369() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {54,-64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1370() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {94,56},{43,42},{68,-51},{29,12},{65,25},{70,74},{17,-85},{79,15},{3,79},{23,0},{18,42},{75,81},{91,69}});
        org.junit.Assert.assertEquals( (int) 133, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1371() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {9,53},{34,86}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1372() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {19,-85},{74,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1373() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {83,79},{4,62},{12,53},{88,44},{50,11},{40,70},{65,49},{84,71},{4,24},{65,-17},{55,-25},{64,20},{0,74}});
        org.junit.Assert.assertEquals( (int) 283, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1374() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {66,75},{53,-48},{25,10},{34,65},{82,39}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1375() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {27,21},{8,-32},{15,80}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1376() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {97,40},{88,73},{30,88},{21,66},{64,-31}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1377() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1378() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {89,12},{29,9},{62,79},{-81,84},{39,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1379() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {33,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1380() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {72,66},{32,16},{69,71}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1381() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {0,45}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1382() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {2,-44},{40,23},{13,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1383() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {38,74},{90,56},{56,27},{18,-26},{24,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1384() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {25,-57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1385() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {60,-96},{42,89},{14,17},{75,-69}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1386() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {67,42},{27,87},{7,81},{4,1},{14,-36},{12,14},{7,64},{12,65},{67,21},{57,40}});
        org.junit.Assert.assertEquals( (int) 210, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1387() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {20,1},{82,40},{82,67},{93,64},{52,88},{84,24},{26,89},{54,15},{16,-67}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1388() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {6,-26},{61,44},{92,-3},{67,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1389() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {16,-84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1390() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {34,-61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1391() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1392() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {19,-75},{7,31},{82,83},{0,-78}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1393() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {57,0},{22,58},{8,42},{45,-38},{48,67},{42,99},{57,39},{29,91}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1394() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {6,57}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1395() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {53,22},{90,19}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1396() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {33,-81},{32,-79},{70,-77},{97,30},{67,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1397() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1398() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {40,-40},{1,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1399() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {4,-60},{5,79},{42,78},{49,-71},{90,54},{4,3},{8,34},{76,48}});
        org.junit.Assert.assertEquals( (int) 194, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1400() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {84,-33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1401() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1402() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {55,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1403() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {92,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1404() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {55,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1405() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {29,7},{98,15},{71,-25},{12,70},{68,-70},{22,66}});
        org.junit.Assert.assertEquals( (int) 143, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1406() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {50,35},{69,87},{98,43},{81,-59},{69,80},{33,-21},{67,50},{12,88},{74,-74},{51,96},{88,47},{30,-62}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1407() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {50,23},{23,58},{26,93},{27,28},{28,-56},{37,31},{32,58},{2,11},{62,99},{27,-15},{86,18},{79,67},{2,54},{98,-95},{41,3},{76,83}});
        org.junit.Assert.assertEquals( (int) 244, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1408() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {82,71},{91,87},{60,7},{48,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1409() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {10,96},{26,31},{51,44},{24,1},{35,93}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1410() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {34,77},{11,-17},{26,80},{99,-32},{10,65},{8,98}});
        org.junit.Assert.assertEquals( (int) 243, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1411() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {24,-72},{77,62},{52,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1412() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {63,0},{91,31},{30,-87},{36,0},{69,99},{75,96},{65,-32},{65,91},{38,59},{61,91},{33,61},{72,94},{93,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1413() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1414() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {46,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1415() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {92,-55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1416() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {79,16},{29,70},{57,72},{82,57},{2,68},{49,-9}});
        org.junit.Assert.assertEquals( (int) 138, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1417() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {8,59},{99,-93},{64,61},{33,-28},{65,-56}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1418() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1419() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {38,59},{1,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1420() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {58,71},{28,75},{30,32},{60,2},{50,-42},{38,75},{94,26},{94,92}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1421() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {10,64},{0,98},{58,32},{60,91},{81,12},{47,85},{78,32}});
        org.junit.Assert.assertEquals( (int) 247, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1422() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {79,22},{20,55},{48,1},{7,44},{97,96}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1423() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1424() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {7,-34},{16,71},{97,93},{69,-96},{14,-29},{60,84},{2,83},{92,99}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1425() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {7,15},{14,56}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1426() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1427() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {77,18},{8,97},{33,26},{25,86}});
        org.junit.Assert.assertEquals( (int) 209, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1428() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {52,38},{54,26},{15,78}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1429() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {63,-67},{52,-25},{28,69},{13,-6},{86,20},{81,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1430() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {29,35},{35,82},{3,79},{69,6},{26,-22},{54,5},{77,17},{83,29},{1,42},{83,67},{54,42},{33,22},{61,44},{20,16}});
        org.junit.Assert.assertEquals( (int) 203, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1431() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {38,-60},{68,83},{75,39},{37,35},{4,94},{86,38},{48,86},{90,86},{56,39},{28,70},{85,4},{75,90},{52,77},{73,-65}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1432() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {19,66}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1433() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {71,64},{61,75},{53,15},{0,70},{6,39},{30,39},{33,7},{97,-69},{1,56},{44,91},{58,62},{31,28},{3,0},{39,7},{49,65}});
        org.junit.Assert.assertEquals( (int) 165, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1434() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {9,65},{0,58}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1435() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1436() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {24,7},{39,80},{32,45},{46,88},{37,9},{6,-71},{68,-90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1437() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {84,33},{88,6},{21,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1438() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1439() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {65,75},{74,83},{98,28},{46,70},{3,22},{55,5},{94,71},{10,87},{52,99},{71,-17},{70,52}});
        org.junit.Assert.assertEquals( (int) 109, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1440() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {69,-46},{24,10}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1441() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {66,0},{93,-42},{3,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1442() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1443() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1444() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1445() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {5,-66},{94,88},{66,37},{20,69},{24,56},{99,55},{92,27},{33,30}});
        org.junit.Assert.assertEquals( (int) 125, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1446() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {18,0},{72,49},{35,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1447() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {41,33},{38,33},{86,26},{34,-46},{66,-19},{5,61},{79,27},{90,-35},{86,-22},{89,32},{88,24}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1448() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {22,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1449() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1450() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1451() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {54,63},{67,53}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1452() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {60,-95},{26,10},{46,83},{44,60},{77,-36},{5,49},{93,95}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1453() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {91,77},{98,49},{39,86},{8,41},{37,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1454() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {8,87},{4,78},{42,83},{92,55},{19,59}});
        org.junit.Assert.assertEquals( (int) 224, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1455() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {29,93},{65,29},{37,28}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1456() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {7,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1457() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {72,93},{14,43},{5,-83},{14,10},{79,38},{95,7},{44,72},{41,-53},{0,32},{54,61},{40,-14},{88,14},{94,47},{6,-46},{4,0},{66,-54},{82,1},{18,69}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1458() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {63,43},{5,76},{58,68},{9,78}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1459() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {85,60},{72,61},{29,52},{46,32},{43,90}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1460() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {58,9},{31,6},{97,97},{2,77},{41,48},{2,21},{48,96},{59,-27},{33,7},{87,16}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1461() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {20,48}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1462() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1463() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {97,37},{10,50},{78,89},{24,-57},{72,22},{49,45},{31,83},{10,93},{49,97},{21,37},{43,34}});
        org.junit.Assert.assertEquals( (int) 226, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1464() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {10,-34},{17,79},{8,79},{15,28},{45,48},{21,-16},{83,86},{70,37},{11,-65}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1465() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {19,84},{37,67}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1466() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {87,91},{61,7},{80,29},{81,58},{45,65},{11,18},{26,59}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1467() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1468() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {46,9},{98,95},{17,94},{24,81},{4,90},{73,-16}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1469() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {53,12},{17,52},{50,72},{12,18},{79,60},{58,24},{31,93},{49,24}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1470() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {13,24},{76,64},{66,72},{91,71},{1,23},{18,68},{76,18}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1471() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {26,82},{81,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1472() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1473() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {99,-7},{33,-45},{23,-59},{68,76},{66,-33},{99,54},{95,80},{79,66},{13,32},{6,30},{72,-3},{50,15},{13,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1474() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {92,79},{59,94},{8,-8},{73,39},{89,56},{78,23},{77,93},{18,93},{72,-72}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1475() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {82,83},{96,30},{78,74},{15,34},{23,70},{7,93},{25,89}});
        org.junit.Assert.assertEquals( (int) 286, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1476() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {29,60},{22,-19},{48,13},{53,51},{81,11},{70,-21}});
        org.junit.Assert.assertEquals( (int) 111, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1477() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {78,-2},{20,68},{36,45},{96,15},{42,8},{41,27},{75,-38}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1478() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {34,46},{66,19},{30,87},{10,49},{40,10},{66,67},{93,64},{1,1},{69,72},{4,55},{4,88},{61,51},{51,3},{83,63},{65,64}});
        org.junit.Assert.assertEquals( (int) 280, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1479() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {31,-4},{68,26},{82,14},{4,50},{69,12},{17,76},{25,1}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1480() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {76,98},{7,54},{36,41},{5,4},{71,6},{57,8},{80,98},{58,4},{61,55},{69,45},{40,95},{46,69},{80,18}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1481() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {30,49},{65,58},{-64,60},{95,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1482() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1483() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1484() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {92,-49},{8,95},{66,43},{23,46},{82,29},{40,86},{60,60},{76,74},{37,13},{19,50},{48,60},{70,83},{6,92},{85,60},{73,46},{82,7},{45,69}});
        org.junit.Assert.assertEquals( (int) 283, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1485() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {17,56}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1486() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {64,-12},{71,77},{10,10},{71,-36},{9,21}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1487() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {12,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1488() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {68,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1489() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {0,19},{26,-9},{46,30},{11,81},{75,18},{38,45}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1490() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {67,-24},{21,81},{5,67}});
        org.junit.Assert.assertEquals( (int) 148, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1491() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {95,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1492() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {77,24},{55,19},{89,43},{46,58},{1,42},{72,77}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1493() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1494() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {42,-89},{82,-20},{82,67},{65,76},{13,9},{58,50},{72,85},{75,94},{74,2},{24,61},{2,92},{14,93},{80,55}});
        org.junit.Assert.assertEquals( (int) 270, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1495() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {92,92},{44,69},{99,14}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1496() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1497() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {28,80},{3,61},{59,-30}});
        org.junit.Assert.assertEquals( (int) 141, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1498() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {95,87},{39,-19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1499() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {82,71}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1500() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {56,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1501() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {71,41},{18,65},{38,90},{92,45},{16,46},{62,52},{74,5}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1502() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {16,85},{52,58},{8,45}});
        org.junit.Assert.assertEquals( (int) 130, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1503() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {94,72},{5,27},{52,8}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1504() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {28,76},{80,-77},{15,13}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1505() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1506() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {26,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1507() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {62,80},{89,12},{19,30}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1508() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {59,22},{56,85}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1509() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {47,77},{53,-2},{16,-1},{18,93},{9,65},{32,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1510() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {34,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1511() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {64,-97},{39,78},{42,54},{70,44},{28,94},{20,43},{18,50},{62,2},{25,10},{25,49}});
        org.junit.Assert.assertEquals( (int) 222, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1512() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {50,48},{48,78},{49,6},{42,64},{34,67},{81,79},{80,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1513() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {56,-67},{31,90},{41,27},{72,92}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1514() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {18,20},{60,92},{46,90},{1,19}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1515() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {46,67},{91,84},{6,-31},{75,36}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1516() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {86,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1517() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {70,32},{13,76},{12,50},{26,64},{18,96},{27,94},{65,73}});
        org.junit.Assert.assertEquals( (int) 380, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1518() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {69,-86},{62,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1519() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {76,-59},{78,0},{96,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1520() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {92,22},{28,0},{69,-60},{48,3},{14,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1521() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {66,56},{98,15},{38,-17},{61,67},{63,92},{53,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1522() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1523() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {63,-73},{14,97},{96,71},{71,56},{78,7},{53,36},{50,90},{64,19},{93,83}});
        org.junit.Assert.assertEquals( (int) 187, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1524() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1525() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {21,-66},{80,-75},{65,77},{29,-79},{79,48},{90,54},{90,60},{65,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1526() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {48,99},{59,-52},{49,24}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1527() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {37,63},{55,-42},{92,51},{97,65},{76,-4},{72,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1528() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {43,67},{92,39},{46,-81},{67,42},{52,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1529() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {63,1},{70,10},{41,4},{47,74}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1530() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {84,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1531() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1532() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {23,94},{2,72},{37,-30},{88,47},{80,-11},{13,-33}});
        org.junit.Assert.assertEquals( (int) 166, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1533() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {94,79},{70,85},{78,-27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1534() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {98,70},{16,-57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1535() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {78,26}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1536() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {61,50},{88,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1537() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {95,0},{67,91},{78,16},{16,29}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1538() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1539() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {4,15},{70,36},{70,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1540() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {12,99},{67,-13},{29,37},{69,65},{20,57},{55,20},{63,41},{97,61},{59,43}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1541() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1542() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {95,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1543() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {97,5},{36,95},{78,72},{95,70},{75,98},{85,-26},{91,22},{26,36},{63,-13},{51,-59}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1544() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {45,81},{41,-85},{46,97},{60,33},{25,66},{77,12},{25,-60},{47,78},{41,14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1545() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1546() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {92,87},{25,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1547() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {81,2}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1548() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1549() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {31,37},{86,8},{73,-37},{57,56},{69,66},{90,-80},{0,-23},{46,-20},{1,78},{51,-13},{76,52},{90,46}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1550() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {19,35},{23,27},{95,6},{74,6},{8,83}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1551() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {46,31},{92,-20},{92,57},{80,-19}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1552() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {29,89},{5,92},{63,61},{10,0},{49,78},{40,-32},{16,-63},{12,-37},{31,48},{6,31},{7,19}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1553() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1554() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {12,74},{3,99},{94,2},{19,86}});
        org.junit.Assert.assertEquals( (int) 259, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1555() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {71,91},{74,46},{18,58},{79,90},{83,67},{94,45},{26,87},{69,19},{98,81},{70,24},{15,83}});
        org.junit.Assert.assertEquals( (int) 228, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1556() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {11,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1557() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {18,-35},{47,30},{3,2},{57,-15},{64,93},{24,10},{69,45},{29,90},{91,23},{59,5},{34,66},{31,72},{12,76},{26,12},{61,-56},{49,24}});
        org.junit.Assert.assertEquals( (int) 240, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1558() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {31,0},{58,-4},{86,-15},{18,-4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1559() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {92,69},{92,41},{34,81},{60,19}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1560() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {87,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1561() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1562() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1563() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {82,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1564() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {40,17},{75,70},{24,4},{14,67},{68,92},{89,9},{15,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1565() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {76,97},{12,92},{78,85}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1566() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {47,28},{11,58},{27,11},{91,81},{60,96},{50,18},{50,-23},{95,88},{87,-22},{14,-31},{26,44}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1567() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {72,90},{66,64},{74,-26},{7,82},{0,-75},{83,19},{58,-7},{93,78},{79,70},{83,-64},{64,62},{60,67},{32,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1568() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1569() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {51,28},{17,58},{17,69},{92,10},{45,67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1570() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {13,34},{81,85},{67,14},{49,48},{57,92},{36,74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1571() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {66,94},{54,-99},{72,76},{12,36},{95,34},{94,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1572() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {94,37},{74,55},{37,-33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1573() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1574() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {48,36}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1575() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {30,33},{57,52},{49,84},{84,38}});
        org.junit.Assert.assertEquals( (int) 117, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1576() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1577() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1578() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-7,45},{-23,92},{84,27},{-23,22},{51,31},{66,72},{-15,40},{77,0},{-3,99},{31,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1579() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1580() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {59,54},{67,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1581() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1582() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {69,27},{58,-52},{83,98},{62,90},{43,34},{79,53}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1583() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {58,65},{98,41},{89,-80},{68,67},{85,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1584() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {21,36},{96,75},{75,72},{59,83},{41,26},{65,60},{90,20},{98,43},{92,68},{82,21},{8,-15},{6,-8},{13,95},{28,36}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1585() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {35,93},{38,-41},{90,9},{18,27},{63,93},{92,65}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1586() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1587() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {36,71}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1588() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1589() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {9,88},{84,14}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1590() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {4,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1591() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1592() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {68,71},{55,72},{73,29},{86,96},{97,50},{37,17},{43,81},{55,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1593() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {27,43},{13,52},{75,94},{21,-12},{31,45},{2,76}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1594() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {91,26},{37,-19},{14,11},{64,25},{83,32},{48,14},{3,54}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1595() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {40,35},{86,94},{59,62},{97,67},{7,4},{43,32},{16,46},{38,88},{51,-25},{12,75}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1596() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {90,-19},{95,-73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1597() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {0,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1598() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {49,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1599() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1600() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {72,76},{7,79}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1601() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1602() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {48,-63},{39,45},{94,13},{44,-65},{45,-77},{33,74}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1603() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1604() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {6,89},{78,64},{72,80},{-1,40},{0,97},{-80,21},{99,9},{51,7},{98,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1605() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {55,24}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1606() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1607() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {29,49},{51,-83},{18,55},{34,44},{11,34}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1608() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {79,25},{64,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1609() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {20,24}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1610() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {57,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1611() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {26,70},{50,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1612() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-96,14},{84,32},{-26,52},{28,90},{63,-10},{8,0},{42,11},{31,16},{64,92},{78,9},{-30,-18},{37,95},{22,72},{89,-72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1613() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1614() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {89,73},{57,90},{67,98},{98,82},{71,94},{9,32},{29,8},{47,-44},{11,73},{1,-98},{10,37},{10,-79}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1615() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {66,85},{35,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1616() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {62,81},{32,5},{70,7},{23,47}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1617() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1618() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {56,44},{54,23},{58,63}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1619() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {4,28},{15,95},{80,-18},{0,39},{30,51},{8,92},{-66,60},{76,49},{33,6},{51,64},{57,68},{29,72},{7,98},{62,28},{47,40},{42,35},{47,34},{33,33},{0,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1620() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {83,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1621() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {94,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1622() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {99,94},{14,8},{8,29},{60,84}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1623() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {61,71},{15,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1624() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {88,55},{63,86},{36,99},{37,19},{50,-55},{76,64},{33,60},{55,-26},{96,36},{0,83},{55,-76},{79,23},{37,86},{57,-95},{9,0},{98,80},{48,-38},{91,-3}});
        org.junit.Assert.assertEquals( (int) 182, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1625() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {75,74},{85,60},{32,55},{97,-32},{23,10},{24,90},{0,43},{91,67},{24,52},{2,30},{74,34}});
        org.junit.Assert.assertEquals( (int) 270, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1626() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {95,40},{45,31},{51,49},{89,-41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1627() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {5,10},{66,-29},{0,-1},{65,93},{45,53}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1628() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {74,80},{60,90},{93,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1629() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1630() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {54,6},{68,25},{31,-46},{28,20},{0,-97}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1631() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {55,75}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1632() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1633() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {56,-39},{4,39},{64,-47},{86,89}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1634() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1635() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {46,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1636() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {16,65}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1637() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {2,85},{5,68},{0,-84},{91,18},{22,45},{82,-55}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1638() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {53,-3},{1,-99},{71,24},{87,-67},{88,95},{84,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1639() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {72,-53},{14,-71},{-80,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1640() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1641() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {90,65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1642() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {64,28},{1,99},{91,-58},{18,60}});
        org.junit.Assert.assertEquals( (int) 159, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1643() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {68,46},{96,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1644() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {40,-55},{53,31},{84,39},{24,75},{31,15},{93,43},{27,-20},{21,38},{39,88},{12,82},{67,83},{12,84}});
        org.junit.Assert.assertEquals( (int) 254, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1645() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1646() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1647() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {74,70},{99,42},{62,-48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1648() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {43,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1649() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {4,55},{51,-17},{18,27},{84,80},{52,47},{16,88},{20,37},{24,60},{53,55},{5,87},{97,-81}});
        org.junit.Assert.assertEquals( (int) 327, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1650() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1651() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {57,76},{6,-56},{41,81},{31,87},{2,-15},{6,47},{11,41},{0,27}});
        org.junit.Assert.assertEquals( (int) 242, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1652() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {81,90},{15,81},{55,47},{44,85},{68,29},{23,67},{67,7},{70,27},{51,67},{48,55},{3,66},{79,9},{57,62},{73,5},{43,70},{75,48},{61,53},{44,46}});
        org.junit.Assert.assertEquals( (int) 232, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1653() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {76,30},{21,69},{3,-17},{56,-28},{28,98},{43,22},{34,80}});
        org.junit.Assert.assertEquals( (int) 178, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1654() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {11,41},{8,98},{10,93},{39,80},{93,97},{26,-68}});
        org.junit.Assert.assertEquals( (int) 232, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1655() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {96,47},{22,-97},{83,7},{48,20},{19,59},{98,99},{41,93},{15,71},{72,3},{37,25}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1656() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {82,25},{39,66},{45,21},{51,16},{93,64},{69,6},{99,83},{18,65},{44,37},{74,66},{84,-64},{49,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1657() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1658() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {43,25},{44,23},{82,33},{60,37},{81,96},{44,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1659() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1660() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {9,41},{57,-89},{79,81},{14,-65},{57,-45},{15,87},{97,41}});
        org.junit.Assert.assertEquals( (int) 128, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1661() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {91,96},{19,-55},{17,19},{28,33},{77,-8},{4,83},{61,68},{32,-10},{65,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1662() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {66,70},{22,42},{79,87},{49,-9},{98,92},{71,94}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1663() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {59,3},{72,36},{65,-16},{35,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1664() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {50,71},{64,-41}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1665() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {4,-23},{77,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1666() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {11,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1667() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {45,51},{96,70},{15,26},{44,28},{69,52},{89,-17},{13,16},{84,55},{22,13},{11,48}});
        org.junit.Assert.assertEquals( (int) 103, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1668() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1669() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {10,29},{81,-14},{39,24},{49,7},{49,92},{59,-62}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1670() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {61,20}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1671() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {94,16},{94,7},{-41,-68},{3,48},{14,71},{-77,-88},{62,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1672() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {56,74},{52,36},{14,1}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1673() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1674() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {33,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1675() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {65,56},{0,16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1676() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {51,5},{14,48},{12,89},{30,-67}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1677() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {33,-40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1678() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {36,90},{91,12},{43,77},{25,60}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1679() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {97,38},{52,57},{94,24},{78,42},{17,5},{91,64},{84,42},{32,-96},{5,97},{21,79},{37,52},{41,73},{1,34}});
        org.junit.Assert.assertEquals( (int) 215, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1680() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {54,44},{57,-88},{94,-79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1681() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {56,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1682() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1683() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {3,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1684() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {32,40},{43,42},{39,56},{43,7},{98,-96},{56,-69},{73,70},{50,18},{28,33},{62,5},{97,-30},{21,-69},{87,8},{88,67},{36,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1685() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {48,-36},{99,72},{82,-79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1686() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {42,47},{88,9},{26,13},{74,38},{27,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1687() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {34,56},{17,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1688() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {66,15},{67,99},{85,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1689() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {14,97},{23,-14},{97,15},{40,42},{22,54},{31,11},{42,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1690() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {86,72},{67,58},{31,78},{77,78},{43,2}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1691() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {79,31},{53,85},{5,76},{50,-99},{95,10},{33,-75},{71,-89},{4,64},{83,88},{96,8},{74,75},{62,-96},{71,-51}});
        org.junit.Assert.assertEquals( (int) 225, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1692() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1693() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1694() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {16,30},{28,9},{30,48},{80,-82}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1695() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1696() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1697() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {85,55},{68,-1},{40,-2},{96,38},{69,-3},{6,47},{63,30},{91,96},{86,-10},{38,49},{7,84},{74,23},{39,10},{65,-55},{63,49}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1698() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1699() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {29,56},{6,25}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1700() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1701() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {0,53},{80,13},{84,96},{97,-79},{16,98},{82,41},{30,-89},{99,22},{93,-49},{8,37},{12,3},{38,63},{28,46}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1702() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {68,-71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1703() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {85,58},{0,91},{29,-88},{21,84},{87,56}});
        org.junit.Assert.assertEquals( (int) 175, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1704() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {24,-78},{92,-80},{45,2},{86,30},{65,62},{34,40},{-26,90},{73,10},{69,-25},{91,9},{27,69},{5,11},{70,25},{-51,98},{-20,80},{91,70},{-94,13},{30,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1705() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {64,93},{35,95},{5,69},{89,-72},{40,11},{25,-87},{42,2}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1706() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {71,74},{37,4},{85,-54},{74,61},{2,75}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1707() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1708() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {90,-94},{58,57},{19,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1709() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {94,-76},{65,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1710() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {2,-97},{1,98},{67,2},{46,-13},{29,0},{70,14},{58,70},{2,71},{39,-66},{11,85},{1,19},{28,34},{44,31},{28,25},{62,88},{24,-56},{81,45}});
        org.junit.Assert.assertEquals( (int) 307, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1711() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {85,47},{51,-67},{74,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1712() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {90,-91},{41,78},{6,48},{64,6},{20,71}});
        org.junit.Assert.assertEquals( (int) 149, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1713() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {53,-31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1714() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {90,22},{22,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1715() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {47,50},{62,66},{41,86},{55,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1716() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {54,57},{19,70},{51,35},{5,16},{31,-16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1717() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {92,53},{52,41},{22,73},{76,96},{15,-74}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1718() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1719() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1720() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {69,91},{29,-21},{96,79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1721() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {99,92},{48,93},{66,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1722() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {13,57},{27,70},{33,-10},{17,46},{92,84}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1723() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1724() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1725() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {83,-21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1726() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {52,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1727() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {54,97},{94,92},{29,-41},{83,9},{50,93},{21,-56}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1728() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {76,93},{44,8},{72,13},{44,-45},{8,-32},{5,41},{36,89}});
        org.junit.Assert.assertEquals( (int) 130, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1729() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {73,33},{82,11},{66,-15},{58,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1730() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {84,-44},{71,28},{90,-64},{31,-3},{68,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1731() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {80,94},{87,43},{45,44}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1732() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {39,73},{95,42},{71,20},{0,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1733() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {80,-10},{66,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1734() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {55,91},{58,82},{99,33},{78,16},{34,58},{90,33},{87,35},{89,97},{89,82}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1735() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {83,48},{66,72},{82,9},{77,-32}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1736() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {41,73},{89,91},{3,38}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1737() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {32,28},{16,67},{0,-52},{44,-35},{29,38},{44,6},{20,78},{37,80},{64,40},{56,43},{59,70},{58,0}});
        org.junit.Assert.assertEquals( (int) 225, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1738() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {29,79},{23,35},{35,39},{92,-23},{89,42}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1739() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {87,15},{-90,-39},{30,-94},{-95,17},{65,33},{43,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1740() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1741() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1742() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1743() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {19,29},{10,-35},{8,-85},{32,18},{49,51},{95,71},{89,62},{96,15},{5,-31},{87,26},{30,42},{11,-76}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1744() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1745() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1746() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1747() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {40,-19},{63,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1748() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {17,87},{-10,42},{98,5},{1,81},{83,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1749() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {18,96},{32,-79},{2,-95},{25,26},{22,45},{70,24},{62,49},{42,51},{32,75},{11,75},{73,-83},{88,89}});
        org.junit.Assert.assertEquals( (int) 291, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1750() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {49,77},{91,28},{59,70},{46,65},{74,97},{89,-37},{4,1},{71,99}});
        org.junit.Assert.assertEquals( (int) 143, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1751() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {16,55},{63,-36},{54,0},{8,39},{43,98},{77,82},{65,62}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1752() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {57,65},{48,42},{82,-80},{77,30},{44,22},{80,-22},{86,31}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1753() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {57,71},{15,-47},{22,71},{81,98},{67,5},{93,-82}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1754() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {31,89},{96,39}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1755() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {54,12},{59,52},{26,3},{68,-57},{29,96},{30,-61},{28,8},{48,0},{44,22},{7,87},{49,19}});
        org.junit.Assert.assertEquals( (int) 183, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1756() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {34,11},{93,45},{18,63},{56,17}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1757() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {74,34},{2,13},{36,53},{7,73},{17,70},{39,85},{47,57},{46,80},{81,-90},{79,60}});
        org.junit.Assert.assertEquals( (int) 241, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1758() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {39,-13},{15,66},{51,19},{71,-60},{9,65},{83,42},{2,35}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1759() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {2,-42},{47,39},{94,-22},{52,70}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1760() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1761() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {69,8},{-43,34},{74,-46},{-23,-60},{20,9},{53,-35},{67,18},{-53,56},{-62,14},{21,20},{54,-98},{17,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1762() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {52,-46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1763() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {71,-99},{55,39},{84,-89},{85,1},{87,46},{25,16},{7,68},{94,18},{87,36}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1764() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {41,62},{15,33}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1765() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {61,-50},{20,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1766() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {52,19},{7,-90},{4,68},{0,88},{46,23},{54,35},{61,20},{51,7},{0,3},{57,32}});
        org.junit.Assert.assertEquals( (int) 194, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1767() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {26,16},{14,14},{-59,65},{22,91},{60,1},{-49,50},{-15,2},{84,-53},{-33,52},{30,90},{13,9},{-28,69},{18,0},{-61,16},{73,-70},{5,86},{-30,88},{48,9},{-57,-61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1768() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {95,-96},{5,16},{82,15},{45,-15},{21,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1769() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {53,92},{57,44},{83,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1770() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {99,10},{74,32},{97,66},{62,4},{10,-27},{60,65},{8,17},{82,19},{93,2},{83,69},{12,67}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1771() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {95,-51},{97,-2},{83,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1772() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {65,-84},{62,68},{61,29},{39,47},{30,-22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1773() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {42,-44},{76,1},{55,5},{65,70},{4,9},{71,59},{55,-82},{81,81}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1774() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {28,39},{29,87},{55,21},{57,64},{81,37},{66,81},{92,49}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1775() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {19,65},{17,-4},{35,14},{27,20},{12,93}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1776() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {40,68},{91,1},{23,41},{48,11},{8,4},{55,-6}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1777() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {88,79},{0,91},{27,-19},{20,53},{24,76},{30,4},{79,-96},{88,23},{41,35},{10,32},{17,4},{53,16},{25,27},{23,-30}});
        org.junit.Assert.assertEquals( (int) 252, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1778() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {80,48},{37,54},{13,23},{19,56},{77,9},{25,77},{36,17},{37,12},{43,25},{22,62}});
        org.junit.Assert.assertEquals( (int) 218, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1779() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {62,74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1780() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {42,95},{65,-8},{23,31},{55,88}});
        org.junit.Assert.assertEquals( (int) 126, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1781() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {61,28},{11,-88},{75,56},{27,-43},{13,-97},{84,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1782() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {72,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1783() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {48,9},{60,24},{38,-84},{39,63},{99,14},{90,31},{87,62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1784() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1785() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {48,88},{79,14},{8,40},{89,63},{83,16},{20,-70},{50,27},{11,56},{87,99}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1786() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1787() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {19,-81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1788() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {94,29},{99,-48},{0,35}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1789() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1790() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {85,10},{44,71},{81,-13},{66,69}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1791() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {77,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1792() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {0,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1793() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {15,72},{47,-86},{96,5},{29,57},{8,92},{89,56}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1794() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {16,90},{22,92},{18,93},{94,10},{28,68}});
        org.junit.Assert.assertEquals( (int) 275, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1795() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1796() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {25,11},{62,96}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1797() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {51,98},{84,-73},{57,4},{24,36},{13,95},{4,14},{33,15},{88,50},{90,7},{47,70}});
        org.junit.Assert.assertEquals( (int) 193, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1798() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1799() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1800() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1801() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {97,70},{94,0},{43,95},{40,62},{74,70}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1802() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {80,60},{33,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1803() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {40,61},{10,-35},{21,46}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1804() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {57,-19},{88,73},{20,23},{54,28},{49,-4},{41,-61},{65,47},{66,21},{28,82},{86,13},{33,65},{22,51},{35,30}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1805() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {36,84},{24,-4},{57,-90},{63,4},{97,26},{78,12},{90,58},{39,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1806() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {27,-3},{20,-8},{69,60},{32,50},{93,32},{16,70}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1807() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {63,11},{21,53},{66,80},{61,67},{8,20},{18,97},{72,-16},{52,-66},{16,19}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1808() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1809() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {13,21},{42,-86},{78,72}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1810() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {4,-95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1811() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {7,-48},{24,15},{56,33},{40,27},{46,35},{6,49},{31,47},{25,42},{95,54},{92,75},{33,25},{25,-17},{68,-72},{99,96},{40,-78},{17,83},{60,75}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1812() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {61,10},{32,-37},{82,45},{84,8},{31,-13},{14,60}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1813() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {60,83},{89,93},{57,27},{81,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1814() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {58,20},{44,-67},{29,7},{13,5}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1815() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1816() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {15,72},{62,19},{85,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1817() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {64,28},{42,38},{38,12},{67,-53},{91,76}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1818() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {47,48},{87,2},{81,7},{46,-3},{54,45},{20,-32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1819() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {93,16},{20,68},{62,4},{2,19},{4,43},{74,-59},{99,21}});
        org.junit.Assert.assertEquals( (int) 130, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1820() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1821() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {65,-46},{17,70}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1822() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {95,68},{19,-44},{3,87},{11,-92},{71,92},{62,33},{40,-15},{50,-51},{72,6},{86,78}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1823() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {36,49}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1824() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {15,-21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1825() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {19,82},{53,-22},{12,-41},{79,23},{88,59},{31,-82},{46,0},{32,-82},{45,37}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1826() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {82,32}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1827() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {57,48},{16,27},{22,56},{50,62},{43,27},{43,37},{29,97},{75,-18},{74,47},{6,82},{70,32}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1828() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {16,28}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1829() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {19,70},{90,-88},{93,26}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1830() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1831() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {42,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1832() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {82,67},{26,-91},{92,8},{0,9},{30,36},{40,85}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1833() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {26,98},{23,9},{56,-71},{35,13},{41,55},{35,12}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1834() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {0,65},{71,-55}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1835() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1836() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {93,-71},{42,-35},{76,49},{24,0},{48,-69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1837() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {42,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1838() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {84,53},{29,54},{65,81}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1839() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {30,-50},{23,75},{7,84},{33,-7},{20,76},{20,-52}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1840() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {65,19},{83,98},{97,84},{46,95},{19,61},{29,-11},{27,44},{33,60},{96,36},{45,0}});
        org.junit.Assert.assertEquals( (int) 165, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1841() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {63,50},{95,-51},{71,-1},{57,73},{64,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1842() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {57,-11},{99,1},{10,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1843() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {71,38},{34,56},{97,-35},{76,77},{48,60}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1844() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {90,20},{34,-11},{35,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1845() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {14,-85},{69,-13},{56,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1846() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1847() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {27,-32},{90,33},{72,-52},{11,13},{45,-13},{66,15},{20,13},{69,-97},{80,28},{10,28}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1848() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1849() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1850() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1851() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1852() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {77,0},{30,-4},{-58,-93},{-81,86},{5,30},{27,61},{33,23},{-57,-69},{31,87},{8,62},{6,22},{15,-59},{8,18},{18,81},{73,-78},{37,9},{62,48},{47,17},{87,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1853() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {92,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1854() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {97,41},{33,84},{79,56}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1855() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {24,3},{51,86},{57,87},{77,56}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1856() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {30,6}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1857() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {29,60},{89,17},{62,81},{24,-22},{0,33},{31,48},{88,40}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1858() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {32,19},{12,85}});
        org.junit.Assert.assertEquals( (int) 104, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1859() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {21,94},{39,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1860() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {77,2},{12,-4},{9,50},{76,56},{64,78},{93,-95},{12,67},{74,38},{93,74}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1861() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {92,85},{98,61},{16,87},{4,15},{52,59},{86,-12},{43,59},{50,60},{89,81}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1862() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {5,-5},{5,29},{30,32},{4,10},{20,26},{43,44},{57,80},{39,73},{87,0},{47,-88}});
        org.junit.Assert.assertEquals( (int) 138, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1863() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {62,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1864() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1865() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {71,86},{83,19},{17,-93},{34,62},{52,8},{5,93},{90,-77}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1866() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {3,35},{50,-99}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1867() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {26,57},{3,26},{43,41},{49,72}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1868() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {82,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1869() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {38,77},{60,22}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1870() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {88,8}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1871() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {19,-83},{66,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1872() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {24,-82},{65,47},{46,-68},{13,36},{3,89},{75,63},{73,86},{1,19},{79,17},{6,52},{77,57},{96,11},{62,58}});
        org.junit.Assert.assertEquals( (int) 196, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1873() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {48,3}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1874() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {63,-32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1875() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {54,98},{84,11},{92,86},{74,84},{88,70},{9,90},{19,69},{45,-20},{90,95}});
        org.junit.Assert.assertEquals( (int) 257, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1876() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {59,54},{29,96},{59,94},{73,48},{8,-73},{75,45},{40,11},{44,-2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1877() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1878() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {94,-12},{-4,-21},{50,31},{31,54},{11,-3},{-39,6},{99,66},{71,41},{9,-6},{2,3},{2,51},{98,72},{82,19},{45,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1879() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {78,39},{11,26},{46,57},{42,60},{93,33},{8,-42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1880() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {53,7},{42,82},{81,77},{80,-44},{90,-84},{32,47},{10,34},{56,49},{41,34},{32,66},{0,10}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1881() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {28,83},{88,90},{13,61},{89,-60},{61,-57},{15,16},{34,-22}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1882() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {34,42},{20,-89},{29,66},{60,5},{11,-32}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1883() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1884() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {32,9},{40,98},{18,-39},{89,-76},{2,-96},{66,17},{66,7},{8,-16},{77,49},{25,81},{50,52},{0,16},{15,-42},{99,3},{70,-34},{2,-51},{82,65}});
        org.junit.Assert.assertEquals( (int) 204, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1885() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {28,60},{64,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1886() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {77,-68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1887() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {40,79},{33,56},{90,96},{58,-14}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1888() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1889() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1890() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {1,17},{91,13}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1891() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {89,54},{7,10},{26,-62}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1892() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {70,-73},{91,11},{33,84},{81,21},{77,-87},{59,8},{91,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1893() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {60,34},{2,5},{57,71},{90,-15},{43,29},{65,88},{89,-79},{99,2},{98,-93},{86,24},{27,80},{40,81},{82,74},{92,8},{92,19}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1894() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {74,64},{15,28},{89,8},{28,47},{19,-21}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1895() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1896() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {55,97},{15,-39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1897() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1898() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1899() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {83,48},{91,27},{75,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1900() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {81,29},{99,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1901() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {93,-14},{67,-23},{35,97},{5,87},{67,-96},{29,-97}});
        org.junit.Assert.assertEquals( (int) 184, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1902() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {95,-15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1903() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {97,-41},{11,-62},{58,16},{92,27},{14,73}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1904() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {89,-17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1905() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {21,53},{90,84},{88,-14},{82,85},{47,12},{59,85},{40,24},{62,71},{71,88},{54,75},{51,91},{95,-58},{83,99},{94,59}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1906() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {95,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1907() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1908() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {91,56},{66,88},{37,88},{13,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1909() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {72,-45},{88,39},{40,47},{28,28},{85,66},{18,28},{81,56}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1910() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1911() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {89,90},{21,42},{7,-64},{96,-80},{95,-27},{87,90},{64,53},{10,73},{76,53},{40,73},{65,20},{82,-90},{35,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1912() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {0,86},{18,-79},{43,-67},{48,87},{58,39},{80,15},{49,-15},{32,82},{38,94},{27,5},{31,-16},{10,27}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1913() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1914() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {90,-60},{43,71},{80,2},{14,50},{45,85}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1915() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {95,32},{25,68},{96,7},{44,3},{28,-51},{15,33},{47,22},{86,66},{32,0},{32,-65},{15,79},{62,46},{42,17},{84,69},{84,16},{11,84}});
        org.junit.Assert.assertEquals( (int) 264, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1916() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1917() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {76,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1918() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {22,-45},{23,42},{38,89},{0,49},{84,-88},{92,46},{9,86},{35,1},{92,93},{8,41},{9,56},{66,31},{55,-20}});
        org.junit.Assert.assertEquals( (int) 232, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1919() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-30,18},{4,9},{2,77},{48,-21},{-31,43},{51,79},{33,97},{70,-2},{11,42},{26,47},{-23,97},{60,-10},{63,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1920() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {33,-7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1921() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {19,30},{72,96},{82,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1922() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {87,42},{12,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1923() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {46,4},{81,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1924() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {12,79},{84,37},{37,85},{99,0}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1925() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {50,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1926() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {54,-78},{86,-54},{97,-58},{22,22},{28,-68},{52,16},{6,92},{15,77},{11,59}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1927() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {22,85},{37,3},{62,9},{58,31},{0,42},{39,19}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1928() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {77,95},{35,8}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1929() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {33,7},{80,61},{82,88},{35,27}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1930() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {56,79},{8,8},{84,59},{73,98},{35,10},{37,-31},{74,-92},{25,55}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1931() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {0,56}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1932() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1933() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1934() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {17,67},{95,34},{48,95},{3,4},{64,75},{29,87},{42,-60},{44,13},{6,17},{49,83},{82,41},{77,48}});
        org.junit.Assert.assertEquals( (int) 171, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1935() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {5,-41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1936() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {85,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1937() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {97,-26},{4,5},{5,39},{39,24},{65,-21},{42,95},{99,33},{53,-88},{85,-3},{92,90}});
        org.junit.Assert.assertEquals( (int) 163, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1938() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {81,94},{50,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1939() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {97,44},{71,87},{51,67},{65,2},{10,35},{0,28},{46,-19},{61,-7},{55,19},{64,22},{20,18},{31,33},{93,18},{72,73},{67,34},{-22,-11},{47,-9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1940() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1941() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {32,90},{63,-9},{86,49}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1942() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {84,42},{72,40},{37,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1943() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1944() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {60,32},{78,30},{48,45},{13,6}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1945() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {81,39},{58,48},{10,93},{83,51}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1946() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {89,1},{17,30},{61,95},{37,38},{0,42},{74,46},{90,63},{25,54}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1947() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {15,-37},{4,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1948() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {99,73},{61,56},{66,-16},{71,13},{40,14},{85,97},{65,56},{0,-4},{4,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1949() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {70,34},{54,-17},{8,89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1950() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {55,92},{46,76},{16,-77},{64,-96},{14,-63},{24,33},{75,27}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1951() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1952() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {27,-20},{64,89},{54,48},{32,67},{59,-20},{40,-30}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1953() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1954() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {71,99},{44,80},{37,42},{23,-98},{52,15}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1955() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {7,-66},{37,15},{54,78},{63,-99},{0,11},{19,45}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1956() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {84,90},{62,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1957() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {78,65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1958() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {8,43},{36,92}});
        org.junit.Assert.assertEquals( (int) 135, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1959() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {27,2},{38,41},{97,33},{18,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1960() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {73,59},{41,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1961() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1962() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {46,15},{3,-31},{34,23},{19,-27},{19,22},{84,3},{92,-70},{60,6}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1963() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {50,15},{67,56}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1964() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {0,88},{43,85},{72,57},{31,7},{9,47}});
        org.junit.Assert.assertEquals( (int) 227, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1965() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {0,60},{35,64},{24,81}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1966() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {6,-10},{62,85},{25,79},{53,-82},{57,18},{10,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1967() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {56,31},{-63,45},{17,95},{67,49},{53,36},{50,37},{86,7},{-4,35},{77,-73},{58,-95},{37,18},{75,71},{1,12},{96,54},{24,30},{55,17},{74,17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1968() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1969() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {7,73},{27,-37},{57,91},{60,-63},{13,11},{54,13},{17,66},{39,-78},{88,14}});
        org.junit.Assert.assertEquals( (int) 139, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1970() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {52,28},{44,0},{69,68},{71,11},{55,71},{52,80},{64,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1971() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {25,37},{3,51}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1972() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1973() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {23,8},{89,14},{72,68},{59,89},{3,46},{2,-35},{75,83},{1,93},{50,94},{66,-80},{13,83},{9,12},{26,57},{64,86},{40,60},{38,37}});
        org.junit.Assert.assertEquals( (int) 222, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1974() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {74,-8},{37,96},{75,32}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1975() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {36,28},{6,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1976() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1977() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1978() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {56,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1979() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {33,19},{67,23},{19,87},{14,55},{93,48},{64,96},{50,76}});
        org.junit.Assert.assertEquals( (int) 218, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1980() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {75,31},{45,90},{76,56},{34,88},{74,46},{68,93},{91,88}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1981() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {25,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1982() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {59,66},{53,-31},{75,88},{24,30},{66,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1983() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-57,-99},{85,-61},{43,53},{45,-17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1984() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {50,35},{57,3},{36,22},{29,37},{57,-60},{96,83}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1985() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {68,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1986() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {5,47},{21,73},{88,91},{61,41},{52,4},{54,12}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1987() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {89,61},{1,-21},{25,13},{31,-41},{78,96},{16,70},{22,75},{35,0},{10,21},{88,83},{52,47},{67,87},{84,-45},{73,81}});
        org.junit.Assert.assertEquals( (int) 192, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1988() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1989() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {82,41},{0,-41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1990() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {34,23},{41,-74}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1991() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {99,89},{39,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1992() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {83,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1993() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {32,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1994() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {62,48},{96,72},{56,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1995() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {39,77},{44,-30},{94,42},{17,26},{64,22},{46,29},{89,93},{34,75},{11,62},{5,80},{94,31}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1996() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {52,-92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1997() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1998() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {62,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1999() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {46,71},{2,34},{9,31}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2000() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {0,70}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2001() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {66,93},{68,24},{10,-88},{21,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2002() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {89,68},{48,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2003() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {87,50},{33,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2004() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {12,-42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2005() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {73,12},{85,66}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2006() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {73,-33},{12,90},{87,81},{83,55},{79,-54},{98,5},{96,94},{40,35},{11,64},{45,15},{61,91},{23,-40},{25,77},{82,68},{18,22},{89,59},{43,95},{62,3}});
        org.junit.Assert.assertEquals( (int) 253, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2007() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {42,-9},{98,68},{20,32},{35,21},{1,61},{73,33},{76,9}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2008() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {78,63},{40,2},{38,90},{96,59},{72,12},{39,52},{1,85}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2009() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2010() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2011() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {4,49},{74,-37},{99,73},{44,27}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2012() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {5,9},{61,32},{80,15},{46,82}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2013() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2014() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2015() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {89,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2016() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {83,10},{31,67},{45,-87},{83,-3},{55,78},{17,74},{45,-6},{19,47},{99,-67},{49,37},{53,77},{52,87},{54,97},{91,70}});
        org.junit.Assert.assertEquals( (int) 141, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2017() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {29,19},{32,51},{51,6},{99,49},{26,-26},{73,61},{99,79},{99,47},{0,60},{74,46},{2,5}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2018() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {9,33},{88,-90},{53,53},{46,70},{41,70},{41,82},{73,22},{58,99},{12,82},{88,26},{44,78},{49,98},{84,47}});
        org.junit.Assert.assertEquals( (int) 197, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2019() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {11,34},{74,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2020() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {63,28}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2021() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {6,54},{40,1}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2022() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {51,37},{54,12}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2023() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {56,89},{41,60},{14,89}});
        org.junit.Assert.assertEquals( (int) 178, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2024() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {37,49},{41,83}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2025() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2026() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2027() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2028() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {37,30},{13,84},{88,67},{72,-42},{25,70},{77,36},{92,67},{89,37},{29,13},{8,69},{64,89},{35,94},{5,31}});
        org.junit.Assert.assertEquals( (int) 278, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2029() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2030() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {81,47},{47,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2031() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {29,-69},{60,70},{35,-60},{82,-67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2032() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2033() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {60,48},{83,38},{44,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2034() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {50,55},{47,-23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2035() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {18,28},{12,92}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2036() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {12,25}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2037() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2038() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {7,-96},{77,9},{78,72},{41,0},{96,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2039() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {58,86},{41,-17},{13,99},{9,24}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2040() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {2,-41},{81,86},{91,-35},{35,65},{40,34},{56,79},{95,-77},{56,25},{39,-37},{35,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2041() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {5,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2042() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {9,79},{27,40},{2,72},{40,-53},{7,-29},{88,36},{53,40}});
        org.junit.Assert.assertEquals( (int) 191, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2043() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2044() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {69,83},{84,80},{36,-81},{39,-18},{48,81},{83,90},{0,-9},{49,42},{27,1},{0,80},{95,74},{65,-6},{67,-6},{32,-38}});
        org.junit.Assert.assertEquals( (int) 161, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2045() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {51,-96},{46,71},{44,45},{36,1}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2046() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {55,69},{91,-4},{54,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2047() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {97,85},{4,45},{8,43},{96,30}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2048() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2049() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2050() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {48,26}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2051() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {91,94},{94,-13},{19,34},{77,-7}});
        org.junit.Assert.assertEquals( (int) 34, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2052() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {33,27},{16,66},{54,15}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2053() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2054() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {63,32},{1,-83},{75,-54},{36,57},{89,-93},{8,69},{3,41},{36,89},{71,-70},{47,62},{85,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2055() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2056() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {33,28},{28,75},{96,53},{15,40},{46,39},{93,0}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2057() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {27,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2058() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {96,89},{25,83},{52,86},{17,94},{73,-28},{88,28},{72,-99},{20,54},{73,-57}});
        org.junit.Assert.assertEquals( (int) 177, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2059() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2060() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {66,25}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2061() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2062() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {17,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2063() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {43,90},{78,-13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2064() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {85,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2065() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {88,-25},{84,92},{90,53},{33,14},{21,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2066() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {42,-59},{70,81},{35,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2067() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {34,13},{12,70},{86,82}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2068() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {31,11}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2069() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2070() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {11,31},{33,96}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2071() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {8,92},{22,-37},{48,-33},{33,-17},{90,2},{39,6},{59,0},{55,28},{35,23},{90,71}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2072() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {24,36},{74,56},{86,98},{79,47},{94,30}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2073() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2074() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2075() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2076() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2077() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2078() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {10,74},{67,45},{53,96},{76,77},{92,65},{50,43}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2079() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {8,92},{85,7},{72,-36},{96,15}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2080() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {18,-89},{42,16},{77,31},{81,90},{50,85},{37,83},{43,91},{21,4},{73,-26},{72,12},{15,31},{83,25},{5,56},{9,22},{16,55},{30,67}});
        org.junit.Assert.assertEquals( (int) 231, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2081() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {67,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2082() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {87,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2083() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {84,53},{2,70},{63,83},{5,60}});
        org.junit.Assert.assertEquals( (int) 130, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2084() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {3,89},{13,86},{41,53},{0,43},{86,29},{20,55},{52,43},{9,47},{66,29},{87,58},{52,78},{74,-26},{83,5},{17,90},{39,22},{96,35},{36,72},{62,-42},{95,74}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2085() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {29,66},{9,59}});
        org.junit.Assert.assertEquals( (int) 125, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2086() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {29,38},{31,-92},{40,76},{94,28},{78,55},{62,-70},{56,73},{53,3},{69,68},{58,93},{98,-32},{51,69},{88,57}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2087() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {2,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2088() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {58,-35},{39,54},{84,85},{81,-38},{26,19},{79,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2089() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2090() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {78,0},{85,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2091() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {1,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2092() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {51,-76},{57,30}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2093() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2094() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {62,94},{47,-36},{24,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2095() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2096() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2097() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {79,51},{30,24},{75,96},{23,5},{40,-90},{98,36}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2098() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {48,16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2099() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {87,68},{62,49},{12,15},{17,85},{47,59},{90,1}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {1,1}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {6,-31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {6,37},{1,0},{39,-89}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {25,-40},{0,60},{14,-89},{63,36}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {30,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {0,-87},{34,57},{12,16}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {75,5},{30,-77},{77,65},{28,3},{31,42},{30,37},{74,46},{15,38},{77,64},{10,-51},{22,-64},{58,41},{59,94},{0,85},{67,94},{24,31}});
        org.junit.Assert.assertEquals( (int) 165, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {11,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {74,-6},{80,86},{66,58},{62,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {76,61},{58,7},{40,85},{91,24},{0,2},{12,43},{84,-98},{90,60}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {42,61},{22,92}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {42,55},{-14,4},{22,-48},{27,8},{50,49},{19,97},{68,-36},{48,-71},{1,85},{39,38},{75,-19},{85,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {32,17},{10,76},{7,91},{23,92},{35,58},{10,-53},{0,-28},{62,24},{30,-91},{57,66},{28,50},{6,0},{54,66}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {26,46},{21,88}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {30,27},{27,-23},{99,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {93,2},{37,-85},{92,-48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {51,47},{79,-76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {53,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {79,5},{15,27},{81,7}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {50,-7},{0,7},{35,81},{4,-42},{11,58},{56,-58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {22,0},{65,-34},{-9,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {63,39},{4,10},{96,-24}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {38,52},{13,63},{18,63},{63,86},{35,80},{76,14},{74,49},{5,61},{67,72},{71,45}});
        org.junit.Assert.assertEquals( (int) 187, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {87,60},{47,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2132() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {3,-24},{90,71},{10,23},{60,-9},{45,22},{0,69},{50,63},{16,74},{63,52},{78,8},{75,26},{22,31},{67,-35}});
        org.junit.Assert.assertEquals( (int) 143, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2133() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2134() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {69,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2135() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {17,64},{85,26},{97,75},{25,5},{9,18},{43,81}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2136() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {79,90},{19,15},{12,24},{32,83},{95,8},{68,91},{7,50},{34,33}});
        org.junit.Assert.assertEquals( (int) 133, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2137() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {74,95},{32,25}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2138() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2139() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {55,-17},{51,65},{6,-87},{84,38},{65,95},{69,66},{91,-39},{0,36},{63,29},{80,64},{3,13},{36,6},{37,32},{20,5},{70,9},{34,48}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2140() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {88,26},{8,-76},{87,49},{98,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2141() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2142() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {24,69},{44,-68}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2143() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {97,-52},{61,7},{18,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2144() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {40,22},{64,-36},{71,-56},{84,-39},{60,49},{15,69},{48,10},{95,68},{96,66},{76,7}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2145() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {10,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2146() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2147() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {19,34},{28,31},{73,71},{99,70},{62,34}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2148() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {69,29},{24,65},{23,20},{57,20},{70,-75},{21,28}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2149() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {46,14}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2150() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {87,-93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2151() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {19,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2152() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {23,-81},{92,-4},{87,57},{92,49},{33,66},{74,67},{65,70},{59,92},{24,11},{18,44},{10,-65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2153() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {48,-34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2154() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {23,99},{61,43},{52,30},{17,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2155() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2156() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {80,61},{43,50},{21,31},{92,36},{68,-34},{32,77},{18,41},{67,36},{67,55},{6,-55},{23,-86}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2157() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {27,79},{8,51},{24,96}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2158() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {4,59}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2159() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {22,8},{71,-1},{36,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2160() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {79,43},{91,41},{63,-58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2161() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {66,-47},{93,54},{23,-79},{81,13},{70,38},{79,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2162() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {31,63},{98,92}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2163() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2164() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2165() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {26,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2166() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {88,41},{83,44},{88,-12},{49,11}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2167() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2168() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {77,34},{91,-26},{1,56},{63,5},{8,99},{31,81}});
        org.junit.Assert.assertEquals( (int) 236, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2169() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {82,88},{71,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2170() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {98,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2171() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {3,34},{15,87},{44,-92},{-29,99},{37,-63},{-36,50},{-42,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2172() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {87,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2173() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {49,38},{-69,38},{-66,-2},{13,37},{8,-58},{13,-92},{71,32},{57,92},{74,40},{-64,-88},{85,24},{96,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2174() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {72,95},{78,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2175() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {94,74},{69,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2176() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {43,6},{44,-44},{85,80},{91,88}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2177() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {20,25},{0,1},{51,-52},{26,-88}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2178() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2179() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {17,-55},{45,-96},{79,38},{6,67},{66,31},{38,89}});
        org.junit.Assert.assertEquals( (int) 156, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2180() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {43,59}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2181() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {39,80},{75,79},{16,64},{79,42},{4,84},{89,82},{36,64},{94,42},{97,86},{28,48},{17,-9}});
        org.junit.Assert.assertEquals( (int) 196, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2182() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {89,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2183() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {89,-57},{77,-70},{95,-35},{17,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2184() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {57,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2185() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {88,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2186() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {34,74},{48,37},{2,19},{7,46},{91,-47},{91,91},{93,-55},{22,67}});
        org.junit.Assert.assertEquals( (int) 206, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2187() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2188() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {53,12},{95,39}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2189() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {29,97},{9,53},{33,50}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2190() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {69,97},{63,-35},{19,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2191() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {23,35},{0,71},{14,-65},{63,74},{12,6}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2192() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {13,52},{33,2},{89,-88},{89,10},{10,52},{50,32},{75,69},{30,58},{-84,-7},{91,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2193() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {21,24},{49,97},{29,-75},{50,39},{12,16},{21,78},{51,97}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2194() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {34,86},{38,86},{34,52},{22,68},{5,40}});
        org.junit.Assert.assertEquals( (int) 126, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2195() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2196() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {97,-19},{43,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2197() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {62,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2198() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {97,96},{45,21},{21,10},{97,86},{79,69},{1,82},{83,45},{60,2},{45,18},{48,-93},{54,98},{87,25},{70,87},{47,80},{55,16}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2199() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2200() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {94,77},{38,92},{15,30},{97,44},{18,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2201() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {48,66},{92,59},{36,41},{18,83}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2202() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {27,-85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2203() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {6,20},{6,51},{65,60},{71,1},{11,90},{84,-26},{4,91},{12,-78}});
        org.junit.Assert.assertEquals( (int) 252, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2204() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2205() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {21,56},{16,69},{72,79},{83,72},{32,0},{64,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2206() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {71,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2207() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {45,-94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2208() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {47,84},{12,95},{64,52}});
        org.junit.Assert.assertEquals( (int) 179, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2209() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {56,82},{6,11}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2210() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {44,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2211() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {44,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2212() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2213() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {26,81},{22,31},{78,99},{75,-89},{0,24},{70,63},{81,0}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2214() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {8,23},{44,-42},{59,28},{84,-46},{81,77},{32,63},{5,-71},{58,-55},{10,23},{40,38}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2215() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {97,-9},{50,-15},{1,92},{14,-64},{3,-78}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2216() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {53,-72},{80,-78},{95,45},{61,96},{10,-90},{36,81},{9,79},{84,30},{98,-8},{45,-57}});
        org.junit.Assert.assertEquals( (int) 175, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2217() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {68,39},{48,84},{97,43},{87,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2218() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {14,-70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2219() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2220() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {85,-88},{94,30},{21,24},{25,92},{31,92},{74,-15}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2221() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {55,81},{44,80},{50,43},{59,15},{75,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2222() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {15,-14},{7,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2223() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {77,86},{66,-85},{8,74},{0,88},{34,-12},{22,78}});
        org.junit.Assert.assertEquals( (int) 248, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2224() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {70,16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2225() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {53,66},{10,24},{33,89}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2226() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {96,78},{70,27},{75,73},{42,-18},{31,-45}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2227() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2228() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {91,94},{21,42},{6,99},{67,68},{44,-76},{55,-18}});
        org.junit.Assert.assertEquals( (int) 209, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2229() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {74,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2230() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2231() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {12,33},{26,54},{85,83},{50,8},{90,63},{12,51},{22,84}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2232() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {38,48}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2233() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {65,-92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2234() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {51,99},{92,46},{42,22},{33,59},{94,63},{46,41},{84,41},{55,-88},{92,24},{26,38},{87,32},{3,87},{35,91},{72,10},{35,-49},{10,85},{88,22},{18,48},{53,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2235() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-64,49},{71,62},{68,63},{78,37},{53,9},{-76,83},{56,52},{48,-34},{74,-83},{7,70},{34,89},{49,2},{2,16},{81,3},{71,80},{-17,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2236() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {23,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2237() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2238() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {14,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2239() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {64,-25},{47,8},{75,78},{83,72}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2240() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {75,36},{89,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2241() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {15,98},{62,78}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2242() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {63,-16},{29,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2243() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {42,14},{26,84},{65,73},{28,44},{49,93},{69,14},{50,10},{79,-44},{6,6},{32,9},{61,22},{10,24},{1,8},{88,-52},{1,30},{94,18},{96,-78}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2244() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {53,61},{49,48},{65,38}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2245() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {67,48},{56,-24},{80,-93},{4,83}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2246() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {93,8}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2247() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2248() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {34,3},{61,-28},{45,0},{6,55},{45,82},{78,76},{27,50},{68,56},{42,94},{56,-80},{91,21},{1,83},{41,32}});
        org.junit.Assert.assertEquals( (int) 314, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2249() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {4,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2250() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {33,-11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2251() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {46,97},{65,42},{85,91},{89,43},{45,83},{10,63},{26,60},{70,89},{18,-26},{78,62},{56,44},{14,21},{78,52}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2252() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {46,27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2253() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2254() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {32,17},{41,-33},{28,86},{0,87},{45,28},{75,21},{11,26}});
        org.junit.Assert.assertEquals( (int) 216, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2255() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {74,37},{84,67},{80,26},{16,75},{4,74},{69,74},{46,22},{32,-41},{69,35},{58,65},{60,17},{31,-56},{99,0},{26,39},{87,94},{65,49}});
        org.junit.Assert.assertEquals( (int) 149, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2256() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {61,85},{47,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2257() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {15,11},{69,66}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2258() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {91,10},{93,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2259() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {5,66},{80,14},{83,1},{19,39}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2260() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {99,78},{55,98},{3,20},{44,50},{88,-27},{68,25}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2261() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {55,14},{16,-14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2262() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {42,6},{1,48},{5,74},{52,14}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2263() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {57,0},{72,11},{9,90},{44,57},{53,21},{93,32},{24,53}});
        org.junit.Assert.assertEquals( (int) 143, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2264() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {19,39},{27,60},{47,77}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2265() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {91,-75},{42,-37},{39,83},{40,-27},{98,41},{31,37},{22,12}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2266() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2267() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {96,-98},{12,96},{40,78}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2268() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {72,37},{99,54},{55,4},{27,1},{47,63},{0,96},{66,11},{21,-16}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2269() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {33,8},{94,-90},{4,54},{1,82},{50,23},{26,57},{38,47}});
        org.junit.Assert.assertEquals( (int) 240, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2270() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {37,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2271() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2272() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {45,64},{20,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2273() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {65,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2274() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {28,89},{57,3},{54,-78},{51,52},{59,56}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2275() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2276() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2277() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2278() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2279() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {9,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2280() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {79,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2281() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {35,7},{9,-58},{97,50},{40,20},{69,8},{69,0},{37,94},{32,99},{63,78},{15,3},{12,-2},{5,8}});
        org.junit.Assert.assertEquals( (int) 201, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2282() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2283() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {46,5},{93,96},{5,6},{59,8},{10,91}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2284() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {40,56},{70,66},{50,73},{74,-8},{-43,-69},{45,4},{49,10},{-48,67},{61,83},{30,96},{95,46},{50,31},{79,77},{-42,-67},{55,-28},{68,21},{20,58},{-33,66},{48,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2285() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {86,9},{80,-75},{39,-29},{98,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2286() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2287() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {97,29},{48,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2288() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {32,96},{74,43}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2289() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {81,95},{56,-90},{70,56},{93,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2290() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2291() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2292() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {0,5},{77,77},{-56,29},{89,24},{8,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2293() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {8,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2294() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {60,31},{26,75},{66,83},{94,13}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2295() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {23,67},{41,89}});
        org.junit.Assert.assertEquals( (int) 156, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2296() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {98,-44},{9,91},{57,49},{11,15},{12,82},{40,49},{37,-36},{47,75}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2297() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {72,3},{90,70},{26,-6},{19,50}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2298() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {29,-45},{84,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2299() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {68,29},{25,5},{60,-21},{92,36},{84,32},{80,82},{88,71},{6,4},{81,-59},{41,21},{69,85},{76,1},{96,41}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2300() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2301() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {85,-1},{31,-25},{20,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2302() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {75,16},{79,60},{4,30},{47,91},{39,53},{95,71}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2303() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {14,12},{89,58},{72,21},{58,88},{24,86}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2304() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {16,10},{45,11},{10,59},{9,69},{44,22},{99,58},{68,9}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2305() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {98,82},{89,70},{41,83},{91,-70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2306() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {99,-91},{54,-22},{93,81},{76,56},{52,59},{65,4},{67,75},{87,-7}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2307() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2308() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {34,73},{58,15},{28,8},{67,20},{4,19}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2309() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {10,-4},{38,88},{78,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2310() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {31,78}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2311() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {0,18},{87,92},{56,-65},{37,-82},{1,-63},{71,72}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2312() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {68,73},{98,21},{57,97},{11,52},{13,90},{55,-37}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2313() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {8,73},{25,1},{51,8},{24,45},{50,2},{32,98},{24,8}});
        org.junit.Assert.assertEquals( (int) 216, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2314() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {10,2},{65,20},{86,7},{91,62},{31,-59},{4,61},{14,50},{67,-58},{31,38},{25,63},{46,43},{41,96},{5,98},{82,-57}});
        org.junit.Assert.assertEquals( (int) 305, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2315() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2316() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {90,63},{96,0},{75,5},{76,-40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2317() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {34,17},{92,84},{89,5},{94,73},{19,19},{57,86},{52,70},{41,69},{37,39}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2318() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {84,51},{57,56},{41,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2319() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {80,-56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2320() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2321() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {98,44},{7,8},{60,-8},{32,17}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2322() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {37,96},{63,88},{7,77},{86,47},{74,12},{82,82},{62,90},{12,21},{43,27},{53,48},{93,-33},{23,12},{5,-87},{45,84}});
        org.junit.Assert.assertEquals( (int) 206, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2323() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2324() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2325() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {13,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2326() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2327() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {13,44},{38,54},{41,96},{19,-68},{-82,13},{-95,61},{97,67},{91,50},{-3,-90},{96,56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2328() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-71,59},{94,59},{17,7},{-42,-28},{55,4},{53,92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2329() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {6,6},{5,70},{91,-32},{66,94},{74,-21},{21,44},{8,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2330() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {41,39},{63,7},{4,77},{74,66},{52,49},{13,61},{5,31},{77,77},{87,-92},{79,22},{57,43},{90,2},{43,72},{85,68}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2331() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {80,15},{56,73},{34,73}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2332() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {98,99},{71,94},{84,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2333() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {99,18},{83,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2334() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {66,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2335() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {54,-50},{72,89},{-38,0},{20,-97},{0,54},{60,50},{20,-82},{-64,9},{99,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2336() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {28,20}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2337() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {0,94},{39,33},{53,83},{21,35},{93,30},{51,27},{37,61},{27,61}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2338() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {75,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2339() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2340() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {0,49},{42,99},{85,76},{75,63},{16,87},{90,60}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2341() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {81,95},{89,19},{27,99},{18,-44},{44,38},{91,-6},{76,87},{53,-40},{72,11},{81,10},{40,79},{65,74},{67,47}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2342() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {15,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2343() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {28,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2344() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2345() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {63,-43},{-67,98},{98,66},{42,4},{91,4},{63,2},{-78,47},{38,49},{40,97},{39,-56},{90,93},{-95,-94},{48,12},{95,45},{14,39},{82,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2346() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {63,59},{74,73},{25,37},{50,36},{41,-6},{49,47},{65,92},{41,59},{68,50},{11,22},{43,-94},{23,88},{83,60},{84,24}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2347() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {0,91},{50,82},{15,51},{33,-88},{9,0},{34,60},{39,83},{52,96},{69,97},{17,87},{15,15}});
        org.junit.Assert.assertEquals( (int) 327, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2348() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2349() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2350() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {70,29},{84,7},{60,-13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2351() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {79,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2352() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {90,-15},{27,-41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2353() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {41,-43},{68,14},{60,19},{52,82},{79,42},{78,90},{49,10},{95,33},{16,91}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2354() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {7,-73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2355() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {54,35},{78,-47},{28,53},{86,36},{13,85},{4,87}});
        org.junit.Assert.assertEquals( (int) 225, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2356() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2357() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {86,51},{95,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2358() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {63,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2359() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {57,-66},{68,60},{45,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2360() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {58,95},{70,-82},{37,59},{89,56},{84,13},{42,95},{95,15}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2361() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {86,20},{69,52},{91,41},{83,27},{34,43}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2362() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {80,-82},{54,35},{16,64},{4,8},{24,25},{25,61},{87,-53},{23,49},{73,74},{27,80},{69,86}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2363() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {64,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2364() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {31,58},{87,85},{21,74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2365() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {13,-59},{30,-24},{17,8},{55,5},{89,-8},{43,89},{52,-62}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2366() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {83,61},{93,22},{34,52},{69,28},{80,58},{59,69},{74,40},{77,96},{4,86},{32,11},{96,-99}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2367() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {5,73},{75,56},{16,88},{23,27}});
        org.junit.Assert.assertEquals( (int) 188, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2368() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {7,-47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2369() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2370() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {86,44},{99,4},{64,88},{75,87},{60,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2371() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {13,85},{80,75},{45,12},{0,7},{69,-14},{93,79},{82,86},{73,38},{43,50}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2372() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {59,-69},{15,31},{63,58},{65,55}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2373() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {80,57},{18,24},{88,81}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2374() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {94,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2375() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {8,-89},{68,97},{6,32}});
        org.junit.Assert.assertEquals( (int) 129, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2376() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {13,15},{0,91},{19,39}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2377() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {70,28},{80,51},{46,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2378() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2379() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {2,31},{5,82},{31,-16},{98,-74},{17,34},{49,-35}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2380() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {24,2},{50,53},{21,28}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2381() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {74,55},{35,25}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2382() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {83,64},{92,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2383() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {11,-46},{32,-9},{13,-32},{22,-2},{18,68},{44,1},{37,53},{37,14},{84,33},{92,99},{49,-95},{6,-77},{0,7},{34,9},{16,36},{81,31},{48,69}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2384() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {3,74},{79,59},{54,80}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2385() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {78,66},{42,-30},{81,-62}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2386() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {67,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2387() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {46,16},{88,-17},{72,5},{92,40},{80,-38},{98,51},{54,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2388() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {42,94},{18,5},{70,-92},{98,47},{51,95},{97,-25},{73,28}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2389() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {78,97},{39,51},{0,39},{37,-54},{72,46},{62,69},{64,63},{4,50},{35,47},{13,35},{7,-34},{10,-61},{84,-92},{13,30},{45,-43},{94,36},{87,45}});
        org.junit.Assert.assertEquals( (int) 222, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2390() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {39,-10},{83,86},{71,73},{89,18},{84,-56},{2,16},{82,9},{40,-15},{1,79},{37,4},{28,25}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2391() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {51,59},{20,28},{32,-3},{16,72},{46,-28},{44,82},{3,75},{93,94},{25,23},{27,37},{87,16},{77,64}});
        org.junit.Assert.assertEquals( (int) 229, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2392() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {33,85},{63,28}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2393() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {8,55},{6,40},{10,72},{81,-95},{52,3},{21,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2394() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {3,-44},{34,36}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2395() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2396() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {82,64},{93,38},{99,-8},{-96,-94},{80,10},{22,3},{14,85},{-47,90},{44,2},{51,8},{0,91},{44,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2397() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2398() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2399() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {36,60},{37,53},{58,55},{80,15},{37,40},{66,-83},{4,-74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2400() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {74,11},{35,44}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2401() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {53,-41},{32,50},{97,43},{56,52},{94,18},{72,78},{98,60},{21,85},{93,27},{26,81},{48,70}});
        org.junit.Assert.assertEquals( (int) 166, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2402() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2403() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {57,33},{17,-70}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2404() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {2,-19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2405() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {92,-47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2406() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2407() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {56,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2408() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {60,13}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2409() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {44,75},{25,50},{11,2}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2410() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {9,20},{25,-93}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2411() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {67,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2412() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {35,-19},{73,-38},{23,47},{79,24}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2413() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {14,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2414() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2415() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {68,84},{29,5},{61,40},{56,-77},{53,-50},{99,73},{37,64},{25,60}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2416() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {52,26},{41,64},{7,89},{41,55},{82,4}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2417() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {42,-55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2418() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {24,-43},{71,60},{36,75},{92,-41},{51,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2419() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {51,97},{53,24},{-36,37},{84,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2420() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2421() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {24,63},{47,56},{43,-47},{87,82},{46,3},{66,5},{51,57},{34,27}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2422() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {95,82},{32,77},{88,47},{3,52},{30,95},{13,-77},{45,-93},{8,23},{82,-96},{81,93},{7,91},{76,-72},{69,82}});
        org.junit.Assert.assertEquals( (int) 338, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2423() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2424() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {93,10},{52,58},{42,20},{28,93},{2,74},{19,14},{78,36},{79,25},{68,48},{94,1},{1,40},{37,54},{93,0},{60,60}});
        org.junit.Assert.assertEquals( (int) 261, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2425() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {39,-81},{73,73},{4,40},{78,9},{40,64},{13,21},{43,-58},{96,-3}});
        org.junit.Assert.assertEquals( (int) 104, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2426() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {39,88},{23,1},{6,-55}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2427() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {62,-95},{52,2},{56,96},{22,0},{32,49},{77,55},{86,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2428() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {5,15},{28,96},{64,20},{34,-63},{7,-40},{65,43}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2429() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {58,92},{27,73},{60,11}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2430() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {12,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2431() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {70,55},{56,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2432() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {66,89},{42,18}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2433() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {5,49},{29,72},{8,-84},{38,-65},{7,-95},{41,-61},{28,96},{60,54}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2434() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {57,-31},{76,11},{73,68},{6,-31},{74,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2435() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {33,34}});
        org.junit.Assert.assertEquals( (int) 34, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2436() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2437() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {70,15},{22,28},{2,62},{31,6}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2438() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {95,1},{6,92},{35,76}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2439() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {47,-24},{26,3},{3,9},{41,42},{13,0}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2440() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {87,83},{69,76},{41,55},{83,6},{66,82},{20,24},{26,9},{58,99},{67,-34}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2441() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2442() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {39,6},{8,85},{26,69},{35,8},{60,80},{26,0},{-20,-76},{30,23},{26,-41},{56,54},{98,11},{22,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2443() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {5,23},{32,2},{62,48},{97,82},{5,-72},{31,-4},{75,41},{37,73},{66,28},{83,2},{89,-29},{15,61},{89,-11},{40,78},{17,11},{74,50},{66,66},{6,-10}});
        org.junit.Assert.assertEquals( (int) 162, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2444() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {15,70}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2445() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {20,-93},{21,67},{98,33},{24,36},{52,-90},{25,39},{95,85},{23,17},{45,87},{7,44},{26,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2446() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2447() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {93,27},{34,44},{23,29},{91,44},{51,22},{64,69},{49,69},{78,24},{13,-16},{15,-2},{83,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2448() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {5,69},{23,98},{2,28},{4,87},{25,16},{55,16}});
        org.junit.Assert.assertEquals( (int) 282, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2449() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {91,8},{12,30},{12,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2450() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {85,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2451() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {58,3},{8,-81},{77,39},{43,59},{81,99},{14,41},{32,-31},{62,7},{29,74},{38,39},{61,-6},{35,9},{72,11}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2452() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {44,29},{65,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2453() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {85,55},{50,0},{32,83},{61,63},{66,53}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2454() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {9,30},{99,61},{41,36},{31,49}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2455() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {6,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2456() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2457() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {86,-46},{41,48},{51,29},{65,93},{4,77}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2458() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2459() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {86,9},{65,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2460() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {76,69},{0,3},{19,-28},{26,91},{94,5},{-56,54},{58,79},{76,-7},{11,-97},{31,46},{-17,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2461() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2462() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {19,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2463() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {16,-52},{4,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2464() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-11,63},{13,49},{24,19},{18,10},{2,66},{80,-92},{92,68},{31,92},{3,43},{12,26},{65,9},{-47,45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2465() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {89,44},{94,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2466() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {51,5},{63,83},{27,3}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2467() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {14,50},{1,35},{40,95},{3,4},{32,71},{6,-62},{83,10},{6,-61}});
        org.junit.Assert.assertEquals( (int) 205, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2468() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {51,15},{14,48},{88,50},{53,74},{50,-75}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2469() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {59,-63},{26,15},{79,-98},{85,46},{16,-77}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2470() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {27,90},{74,87},{96,27},{86,24},{12,78},{48,23},{77,25},{33,35},{32,-29},{46,52},{89,57},{99,46},{66,-13},{92,37},{80,7},{95,46},{95,41}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2471() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {62,21},{9,99},{6,25},{65,42},{62,38},{35,1},{17,41}});
        org.junit.Assert.assertEquals( (int) 166, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2472() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {87,51},{33,78},{70,79},{4,-36},{99,93},{27,63}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2473() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {34,78},{75,69},{2,59},{57,92},{52,32},{56,75}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2474() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {0,66},{34,45},{10,-38},{36,28},{29,72},{23,52}});
        org.junit.Assert.assertEquals( (int) 138, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2475() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {84,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2476() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {6,45}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2477() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2478() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {73,-31},{97,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2479() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {71,68},{43,4},{18,2},{96,87}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2480() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {56,-54},{79,58},{19,-85}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2481() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {94,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2482() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2483() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {57,-3},{97,50},{38,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2484() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {41,53},{93,1},{68,83},{15,-9},{91,13},{31,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2485() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {57,26},{22,30},{49,-42}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2486() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {98,93},{73,34},{91,49},{19,-3},{15,-32},{39,91},{93,-92}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2487() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {51,57},{57,41},{4,2},{95,-83},{63,45},{62,23}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2488() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {64,58},{93,52},{30,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2489() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {83,-40},{56,78},{93,92},{81,9},{69,22},{3,26},{40,-45},{63,87},{18,80},{10,40},{50,67},{72,1},{26,57},{38,-9},{19,99},{11,82},{25,-87},{26,90}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2490() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2491() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2492() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {3,59},{44,71},{94,38},{86,37},{27,-23},{56,58},{26,10},{53,-35},{48,59},{16,56},{12,-45},{50,-70},{9,78},{3,-46},{55,40}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2493() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {2,92},{67,58},{9,34},{46,66},{69,32}});
        org.junit.Assert.assertEquals( (int) 192, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2494() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {45,51},{14,23},{32,-4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2495() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2496() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {43,31},{8,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2497() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {85,9},{56,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2498() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {2,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2499() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {24,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2500() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {76,89},{74,-47},{19,71}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2501() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {20,20},{26,54},{69,-58},{73,71}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2502() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2503() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {23,-28},{60,99},{9,63},{51,99},{71,-95},{27,27},{92,25},{11,74},{33,4},{39,28},{8,2},{85,30},{-97,88},{32,4},{76,28},{-19,19},{65,-3},{11,68},{5,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2504() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2505() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {11,61},{87,69},{78,89}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2506() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2507() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {32,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2508() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {32,48},{16,-11},{31,87},{21,81},{40,1},{97,31},{82,45}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2509() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {97,22},{0,27},{56,95}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2510() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {19,70},{75,99},{73,64},{70,-41},{46,34},{71,3},{97,7}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2511() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {75,23},{34,-28},{88,43},{11,40},{10,56}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2512() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2513() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {11,71},{83,28},{86,99},{91,84},{33,4},{43,16},{87,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2514() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {84,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2515() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {84,38},{49,-72},{43,31},{92,15},{92,26},{5,66},{52,72},{56,27},{39,84},{57,-82},{63,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2516() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {58,26},{49,11},{84,51},{92,23},{9,45},{65,92},{94,-41},{27,23},{39,12},{67,32},{20,58},{70,-88},{94,61},{93,48},{46,61},{34,12},{46,9},{81,92},{51,81}});
        org.junit.Assert.assertEquals( (int) 126, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2517() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {81,-40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2518() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2519() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {3,59},{36,20},{66,-53}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2520() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {30,14},{82,-65},{6,52},{89,94}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2521() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {37,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2522() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {61,54},{75,-82},{66,78},{13,-33},{26,80},{62,63},{3,3},{7,92},{19,17},{67,87},{89,80},{90,87},{94,33},{24,-23}});
        org.junit.Assert.assertEquals( (int) 192, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2523() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {46,85},{17,39},{38,4},{70,-86}});
        org.junit.Assert.assertEquals( (int) 124, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2524() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {89,-66},{57,-93},{13,61},{89,48},{43,65},{42,51},{66,56},{24,20},{57,47},{9,61},{62,81},{79,97}});
        org.junit.Assert.assertEquals( (int) 207, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2525() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {33,32},{16,93},{35,-23},{33,27},{66,18},{56,88},{85,42},{8,33},{2,79}});
        org.junit.Assert.assertEquals( (int) 205, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2526() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {55,57},{27,50},{53,21},{47,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2527() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2528() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2529() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {88,-21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2530() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {7,51},{31,94},{9,85},{54,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2531() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {88,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2532() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {89,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2533() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {70,77},{34,12},{43,68}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2534() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {7,32}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2535() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {53,3},{68,14},{1,-86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2536() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {76,-45},{78,85},{83,80},{84,62},{3,26},{12,-99},{29,27}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2537() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {49,94},{72,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2538() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2539() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2540() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {34,74},{15,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2541() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {73,55},{61,27},{30,94},{59,83},{70,-51},{68,65},{3,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2542() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2543() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {87,39},{82,77},{62,62},{31,55},{16,-3}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2544() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {34,82},{30,99}});
        org.junit.Assert.assertEquals( (int) 181, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2545() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2546() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {80,24},{56,49},{30,97},{46,0},{8,81},{96,11},{5,45},{75,71},{3,40},{62,77},{57,49},{74,27},{34,90},{20,99},{25,27}});
        org.junit.Assert.assertEquals( (int) 362, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2547() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {42,95},{47,70},{5,-43},{50,83},{35,85},{17,37}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2548() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {94,-29},{16,12},{30,-69},{81,16},{59,41},{55,51},{92,-28},{42,53},{42,40},{39,30},{82,6},{79,23},{66,-85},{2,72}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2549() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {7,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2550() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2551() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2552() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {99,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2553() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {20,96},{59,87},{49,-50},{15,9},{52,64},{86,53},{84,-2},{23,9},{57,-56}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2554() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {80,55},{24,76},{60,-38},{81,15}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2555() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {57,87},{33,-38},{71,52}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2556() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {0,57},{78,56}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2557() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {69,77},{14,82},{90,-14},{44,-36},{89,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2558() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {56,-63},{31,7},{41,14},{49,1},{79,39},{79,33},{94,91},{59,52},{73,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2559() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {42,-28},{75,-31},{38,0},{61,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2560() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {54,2},{67,36},{7,89},{95,61},{44,54},{62,51},{71,69},{29,-98},{40,-35},{82,81}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2561() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2562() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {6,43},{94,62},{58,75},{96,92}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2563() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {99,-67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2564() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {13,-34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2565() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {14,-95},{12,-53},{44,-13},{84,39},{35,9},{48,99},{11,24},{17,98},{29,36}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2566() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {50,-94},{11,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2567() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {51,41},{35,82},{59,64},{59,89},{52,-8},{30,35},{39,-55},{44,12},{20,-58},{31,-10},{81,21},{53,-50},{85,24},{32,60},{4,89},{0,31},{47,-38},{97,1},{66,91}});
        org.junit.Assert.assertEquals( (int) 202, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2568() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {27,25},{91,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    public void test_2569() throws java.lang.Exception {
    }
}

