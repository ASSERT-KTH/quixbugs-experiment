package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {15,59}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {55,64},{21,64},{30,87},{1,67}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {85,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {46,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {92,-11},{73,39},{82,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {87,-45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {4,-6},{82,52},{22,56},{71,-32},{47,-24},{74,4}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {57,83},{83,27},{37,6},{36,26},{83,70},{8,16},{55,84},{36,55},{99,5},{11,66},{92,1},{60,76},{31,74},{19,15},{89,1},{12,39}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {91,10},{71,48},{82,71},{20,55},{63,51},{13,-30},{23,10},{10,0},{49,-26},{51,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {24,74},{53,-30},{60,55},{73,16},{84,-48},{3,8},{68,67},{66,27}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {88,4},{92,-47},{46,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {82,12},{78,-49},{79,63},{92,-93},{43,-75},{14,66},{82,-84},{3,25},{4,-42},{86,43},{2,4},{0,-82},{92,48},{53,56},{7,14}});
        org.junit.Assert.assertEquals( (int) 109, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {64,2}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {5,-97},{27,-92},{18,-17},{92,87},{58,-65},{63,64},{6,76},{62,9},{18,71},{37,21},{25,86},{99,37},{18,60},{80,22},{38,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {81,-93},{7,61},{56,11},{89,-10},{20,77},{28,-27},{33,95},{86,2},{38,45}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {67,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {49,13},{0,42}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {22,18},{51,-81}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {95,-19},{39,41},{8,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {2,9},{78,52},{25,75},{20,-18},{27,98},{26,88},{74,45},{31,79},{85,54},{33,69},{57,21}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {53,6},{28,11},{4,79},{91,-91},{0,55},{1,40}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {74,31},{81,5},{37,43},{42,86},{68,84},{43,67},{48,-89},{80,-1},{79,70},{25,81},{78,-66},{51,95}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {85,38}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {68,47},{30,-67},{50,73},{13,9},{86,9}});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {38,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {28,57},{83,50},{91,86},{38,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {30,56},{11,66},{50,84}});
        org.junit.Assert.assertEquals( (int) 206, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {0,81},{-93,11},{56,5},{8,-29},{58,6},{66,-56},{-73,68},{2,6},{-30,47},{-71,5},{-36,-39},{61,53},{29,24},{60,14},{57,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {11,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {30,64},{87,-99},{67,68}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {91,9},{75,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {85,88},{10,78},{85,35},{73,21}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {40,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {96,22},{60,82},{84,-58},{70,-18},{30,52}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {90,55},{92,-1},{85,1},{41,40},{58,31}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {16,85},{92,63},{70,20},{66,12}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {7,81},{49,43}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {51,95},{74,55},{72,17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {94,54},{1,9},{72,92},{19,82},{24,80},{62,87}});
        org.junit.Assert.assertEquals( (int) 171, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {49,27},{0,37}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {13,31},{98,34},{69,-69}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {99,-94},{93,34},{11,-69},{26,50},{42,-41},{80,-97},{32,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {34,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {3,65},{3,-64},{44,-7},{57,90}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {26,-67},{76,52},{85,0},{1,61},{73,37},{54,79},{4,73},{40,-5},{78,-48},{96,1},{53,99},{87,98},{31,-26}});
        org.junit.Assert.assertEquals( (int) 233, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {59,47},{98,84},{71,50},{52,77},{67,77}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {35,17},{71,-45},{68,73},{22,93},{98,90},{36,88},{15,91}});
        org.junit.Assert.assertEquals( (int) 272, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {12,-70},{82,15},{88,91},{92,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {62,-89},{76,34},{77,47},{13,1},{53,-46},{65,27},{80,41},{78,95},{60,50},{23,29},{11,94},{73,14},{83,-67},{95,35}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {34,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {80,-83},{46,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {24,0},{84,72},{82,20},{61,51},{85,41},{75,86}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {47,16},{71,-42},{19,29},{8,-75}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-20,24},{13,-84},{60,51},{16,65},{9,-9},{-64,67},{26,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {99,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {94,29},{61,48},{-78,-2},{66,38},{67,34},{8,36},{17,-87},{43,93},{72,-73},{7,46},{98,-56},{49,51},{93,68},{-99,89},{60,21},{56,23},{-13,6},{96,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {79,49},{86,87},{89,48},{67,40},{91,-35}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {80,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {91,62},{43,88},{54,8},{70,88},{13,56},{6,19},{28,5},{87,66},{27,1},{10,54},{45,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {99,50},{23,62},{88,56},{51,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {89,39},{83,19},{93,57},{1,-63},{88,-61},{35,46},{77,58},{59,63},{85,8},{26,39},{68,10},{68,76},{17,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {3,-37},{46,-94},{37,14}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {93,15},{26,45},{71,49}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {97,5},{74,41},{47,65},{19,86},{64,-16},{15,59},{85,-8},{11,79},{7,95},{19,35},{95,69},{94,93},{78,-99},{43,3}});
        org.junit.Assert.assertEquals( (int) 260, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {6,9},{43,48},{55,16}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {74,26},{33,0},{88,4},{14,90},{24,55},{63,64},{54,64},{51,9},{66,86},{23,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {53,12},{23,62}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {27,-42},{19,19},{30,55},{11,34},{15,65},{22,82},{41,49}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {62,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {9,6},{9,12},{8,-66},{13,87},{99,69},{84,-46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {11,13},{95,22}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {48,-52},{43,85},{97,35},{99,17},{49,-80},{90,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {3,24},{77,47}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {35,-49},{87,86},{99,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {11,88},{33,-28},{61,95},{67,44},{41,-29},{59,93},{35,10},{69,15},{69,51},{4,49},{33,-54},{41,25},{89,9},{96,19},{42,60},{7,21},{34,-16},{23,35}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {72,10},{48,5},{74,67},{12,35}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {59,-36},{77,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {14,61}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {32,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {66,-17},{85,44},{80,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {2,18}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {26,-19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {50,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {7,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {79,15},{81,7},{21,59},{37,-70},{68,75},{48,81},{98,16},{22,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {6,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {68,-95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {36,17},{26,45},{28,47},{99,-28},{67,97},{72,76},{61,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {39,14},{53,58},{21,74},{49,-11},{2,-42},{63,-44}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {48,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {15,98},{16,31},{33,-88},{72,16},{62,24},{53,70},{24,89},{29,98}});
        org.junit.Assert.assertEquals( (int) 285, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {73,95},{7,74}});
        org.junit.Assert.assertEquals( (int) 169, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {70,39},{35,-99},{39,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {37,-72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {24,36},{20,95},{83,97},{42,43},{-26,-16},{-25,23},{99,46},{64,81},{97,-55},{-20,-13},{-96,-4},{95,-3},{-2,41},{43,22},{20,72},{-81,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {66,24},{11,88},{4,77},{73,49},{27,11}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {83,20},{74,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {91,66},{54,24},{63,55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {8,30},{39,4},{69,89},{9,14},{81,70},{66,6},{30,76},{9,31},{94,-68}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {47,47},{93,61},{39,62},{14,48},{14,79},{99,61},{17,-50},{93,-20},{33,-13},{60,15},{48,12},{44,83},{53,28},{8,22},{94,37},{72,81},{24,-43},{83,77}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {35,28},{63,-54},{77,59},{51,97},{27,17},{72,50},{99,5},{27,-34},{18,77},{9,75},{87,64},{12,-63},{29,-95},{87,84},{11,16},{64,38},{71,46},{70,93}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {97,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {35,84},{61,79},{7,67},{65,18},{12,-14},{31,76}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-33,86},{35,87},{62,59},{55,-65},{-58,51},{-89,-59},{69,12},{3,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }
}

