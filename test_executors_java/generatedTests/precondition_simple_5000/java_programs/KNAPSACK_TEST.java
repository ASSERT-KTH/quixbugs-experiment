package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {45,27},{67,34},{37,62},{58,58}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {50,53},{81,25},{18,12},{26,80}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {73,-48},{79,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {80,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {10,18},{44,27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {30,31},{13,76},{33,13},{51,-95},{69,70}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {23,34},{20,-13},{81,-88},{15,26},{60,45},{9,32},{39,-13},{41,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {54,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {74,-16},{75,92},{92,59},{62,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {13,69},{36,-80},{94,93},{95,30},{52,62},{34,-44},{97,-83},{55,65},{9,71},{81,-81},{83,92}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {16,-45},{85,1},{28,27},{50,21}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {58,1},{78,87}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {53,96},{91,64},{92,62},{99,90},{51,34},{46,36},{39,14},{46,60},{31,95},{30,35},{77,-82},{36,28},{92,38},{30,47},{99,94}});
        org.junit.Assert.assertEquals( (int) 142, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {24,24},{83,99},{91,34},{93,73}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {37,21},{58,-92},{1,77},{49,-3}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {32,43},{2,24},{37,9},{70,28},{57,52},{58,38}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {80,18},{11,59},{81,31},{55,60},{3,43}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {11,95},{24,-26},{53,17}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {2,-88},{89,79},{24,60},{10,84},{38,23}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {68,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {25,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {14,-16},{94,-61},{91,89},{4,89},{22,18},{36,-44},{0,78}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {10,8}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {64,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {22,98},{4,25},{91,30},{68,75},{78,93},{31,-29},{18,32}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {30,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {74,-67},{61,99},{44,15},{93,-5},{30,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {24,-11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {44,-13},{64,62},{5,-94},{7,-25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {50,46},{48,39}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {38,69},{64,52},{58,82},{50,79},{32,0}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {34,5},{94,63}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {36,39},{21,96},{75,79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {75,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {51,53}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {3,1}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {76,85},{10,80},{35,83},{96,-47},{90,64},{18,50},{35,21},{96,7}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {14,62},{85,98},{81,17},{26,-66},{11,-85}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {48,52},{63,62},{80,23}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {84,-99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {98,42},{95,-72},{34,78},{87,31},{72,63},{57,66},{22,22},{59,-38},{98,54},{69,-57},{75,94},{25,81},{42,-56},{7,40}});
        org.junit.Assert.assertEquals( (int) 159, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {24,66},{94,31},{94,79},{65,27},{17,95},{23,27},{31,81},{19,-7},{72,91},{90,-32}});
        org.junit.Assert.assertEquals( (int) 176, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {28,55},{57,35},{50,66},{6,46},{-7,77},{-71,79},{29,66},{28,0},{-76,43},{60,59},{46,16},{22,82},{12,35},{42,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {25,44},{55,94},{76,10},{1,-72}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {81,11},{87,79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {93,-10},{93,-89},{60,62}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {83,32},{34,-22},{68,41},{1,19},{89,8},{18,69},{50,-37},{28,93},{57,78}});
        org.junit.Assert.assertEquals( (int) 181, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {26,67},{12,66},{42,89},{30,30},{94,5},{66,-7}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {3,25},{77,-71}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {82,-86},{50,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {27,71},{18,25},{10,62},{4,70},{25,86},{81,45},{69,26},{41,6},{33,14}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {42,25},{63,20},{67,8}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {52,26},{48,8},{72,65},{81,30},{88,-11}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {1,-79},{29,11},{67,11},{34,-54},{33,65},{3,5},{58,-34},{69,16},{23,-83},{61,38},{62,12},{-41,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {25,94},{82,15},{97,44},{86,7},{15,5}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {10,54},{15,75}});
        org.junit.Assert.assertEquals( (int) 129, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {76,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {70,39},{66,44},{71,79},{6,-42},{97,45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {18,-34},{14,82},{65,6}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {61,51},{60,-82},{21,-50},{78,20},{79,43},{50,90},{34,50},{45,87}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {0,25},{70,7}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {67,-62},{32,-29},{79,-23},{95,34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {91,16},{80,28},{85,83},{43,6},{24,38}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {37,-51},{75,96},{95,28},{44,70},{1,77},{18,72}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {98,59},{10,2},{61,53},{76,98},{64,48},{5,-8},{42,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {42,41},{17,36},{63,93},{26,35},{60,72},{-45,71},{39,88},{54,29},{87,6},{27,50},{10,50},{51,98},{-75,19},{39,91},{-83,67},{87,39},{37,93},{27,-60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {92,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {54,53},{2,31},{41,-20}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {54,18},{79,9},{55,59},{28,26},{27,59},{6,-35}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {65,91},{44,1},{76,43},{7,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {55,8},{42,-61},{98,80},{16,79},{69,80}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {19,-90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {95,82},{25,60},{83,94},{4,18},{42,7},{70,-8},{67,45},{39,35},{11,88},{46,14},{48,65}});
        org.junit.Assert.assertEquals( (int) 106, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {61,40},{78,85},{87,53},{23,11},{78,-61},{66,45},{76,83},{60,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {27,93},{76,-77},{14,17},{5,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {13,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {10,30}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {78,88},{52,-16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {60,22},{90,62},{77,74},{32,94}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {18,55},{4,59}});
        org.junit.Assert.assertEquals( (int) 114, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {62,30},{7,53},{52,90},{12,82}});
        org.junit.Assert.assertEquals( (int) 225, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {86,23},{38,99},{66,76},{99,26},{83,24},{7,74},{17,20}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {62,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {53,96},{39,81},{73,-49},{98,20}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {98,57},{25,64},{66,93},{46,13},{82,25},{23,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {60,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {51,29},{51,69},{67,44},{43,61},{22,68},{24,13}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {51,75},{45,74},{25,71},{37,37},{34,-20},{19,-41},{56,25},{28,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {7,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {83,42},{76,68},{78,69},{65,12},{61,53}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {73,35},{2,94},{72,92},{67,65},{49,46},{87,90},{83,16},{29,-10},{99,91},{79,44},{10,79}});
        org.junit.Assert.assertEquals( (int) 238, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {4,22},{71,32},{16,39},{24,5},{74,52},{28,-96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {6,76},{2,77},{61,64},{97,-4},{59,73},{48,-75},{73,17},{22,96}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {10,-68},{48,48},{50,-29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {5,24},{8,74},{65,-52}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {9,27},{13,12},{87,-2},{98,19}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {81,-77},{21,10},{92,8},{66,65},{87,78},{96,15}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {88,91},{83,-56},{84,20},{39,-79},{34,67},{97,41},{44,30}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {43,61},{80,12},{63,84},{77,97},{72,27}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {3,-81},{92,-47},{30,-24},{63,9},{3,40},{50,-68},{95,32},{66,44},{3,86},{16,6},{38,-6},{24,79},{37,27}});
        org.junit.Assert.assertEquals( (int) 232, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {81,82},{91,43},{-21,48},{-23,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {27,15},{83,-89},{-85,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {2,17},{43,56},{14,52},{53,73},{32,23},{14,51},{93,43},{25,-80},{90,-48},{97,53},{83,10},{21,74},{17,46},{45,-50},{14,28},{72,48},{81,13},{14,84},{74,49}});
        org.junit.Assert.assertEquals( (int) 306, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {91,-74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {54,38},{49,87},{93,77},{25,7},{85,46},{0,54},{78,35},{15,-16}});
        org.junit.Assert.assertEquals( (int) 148, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {93,89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {46,41},{22,4}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {65,44},{57,-29},{54,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {41,76},{91,-1},{92,28},{55,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {91,47},{16,84},{3,-64},{17,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {24,56},{81,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {48,5},{77,44},{75,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {0,-77},{24,66},{12,96},{32,63}});
        org.junit.Assert.assertEquals( (int) 225, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {66,47},{-56,40},{28,28},{1,-54},{99,72},{95,86},{-36,50},{17,-22},{-59,17},{60,58},{-36,-81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {11,46},{73,65},{21,-56},{46,97},{8,94},{6,81},{66,5},{49,55},{5,12},{52,-2},{94,20},{44,33},{46,38},{63,21},{51,17},{67,68},{64,12},{51,53}});
        org.junit.Assert.assertEquals( (int) 233, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {29,-62},{55,25},{4,4}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {36,95},{13,2},{75,31},{38,83}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {93,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {75,29},{54,14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {67,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {62,-57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {35,67},{52,59},{22,-37},{76,-69},{25,71},{92,92},{0,-61},{47,47},{37,24},{19,96}});
        org.junit.Assert.assertEquals( (int) 234, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {55,48}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {32,10},{90,94},{53,40}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {55,71},{13,20}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {85,62},{68,37},{-76,8},{99,-20},{56,-91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {56,37},{86,-29},{91,-25},{40,44},{42,76},{94,83},{76,47},{20,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {5,54},{6,27}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {10,19},{56,6},{22,-58},{36,-76},{88,88},{51,75},{41,68},{30,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {30,67},{84,56},{83,6},{22,58},{4,3}});
        org.junit.Assert.assertEquals( (int) 128, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {87,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {77,63},{1,-2},{67,-25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {30,4},{64,-79},{57,99},{42,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {52,23},{53,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {74,55},{91,3},{87,23},{7,89},{2,43},{97,12},{62,88},{68,23},{53,94}});
        org.junit.Assert.assertEquals( (int) 226, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {75,-50},{76,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {7,12},{9,25},{29,6},{30,86},{13,61},{34,-54},{10,58},{12,-50},{59,74},{16,12},{62,44},{83,56},{86,13},{80,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {19,-79},{93,-97},{73,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {98,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {29,58},{34,1},{79,83},{88,54},{29,-55},{36,36},{68,2},{75,-80},{76,31},{41,-36},{84,89},{61,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {19,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {15,9},{33,17},{65,15},{7,13},{43,85},{38,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {52,54},{-26,4},{22,59},{86,57},{6,55},{33,79},{28,-75},{23,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {0,-23},{74,78},{84,-49},{95,-20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {31,69},{89,76},{57,56},{70,39},{16,46}});
        org.junit.Assert.assertEquals( (int) 125, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {17,-53},{45,58},{78,9},{53,97},{1,4},{21,96}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {13,56},{84,-92},{70,-47},{62,-10},{94,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {61,5},{57,1},{87,12},{44,19},{86,50},{31,11},{95,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {61,84},{52,50},{66,-3}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {96,-53},{77,49},{4,88},{14,69}});
        org.junit.Assert.assertEquals( (int) 157, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {28,31},{21,26},{35,-51},{90,39},{2,65},{21,20}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {93,-28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {83,57},{8,1},{31,97}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {15,63},{3,53},{44,-84},{83,19},{44,42},{34,60}});
        org.junit.Assert.assertEquals( (int) 176, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {67,13},{63,57},{49,86},{86,58},{10,99},{72,2},{94,72},{10,93},{74,24}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {96,71},{31,96},{55,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {27,43},{7,6},{46,9}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {92,6},{59,-64},{76,-59},{80,12},{21,92},{5,39},{92,50},{75,-52},{73,54}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {68,-86},{73,5},{10,90},{97,-87},{84,95},{6,51},{3,74},{52,42},{61,90},{58,5}});
        org.junit.Assert.assertEquals( (int) 215, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {53,38},{11,13},{15,72},{88,-25},{3,36},{86,79}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {17,-11},{95,38},{35,8},{42,86},{11,-51},{67,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {93,-68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {85,-15},{88,63},{64,43}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {53,-75},{70,77},{24,40},{23,-91},{6,35},{96,30},{14,90},{79,-37},{9,-90},{94,-19},{17,97},{40,8},{2,91},{17,17},{88,42},{17,95},{17,-7}});
        org.junit.Assert.assertEquals( (int) 425, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {89,35},{80,29},{7,10},{10,19},{35,13}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {25,-17},{83,-9},{76,36},{6,-68}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {54,24},{1,94},{71,32},{49,76},{38,94},{24,-12},{22,8},{51,-95},{25,94},{98,94},{82,-71}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {25,94},{9,-79},{85,87},{93,-11},{94,0},{22,-1}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {53,21},{46,86},{60,41},{18,97},{65,-79},{66,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {70,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {64,64},{6,-97},{79,44},{89,59},{21,3},{45,63},{71,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {80,65},{72,66},{13,5},{11,-34}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {19,96},{7,-15},{3,49},{15,96},{67,43},{62,99},{92,71},{66,45},{83,95}});
        org.junit.Assert.assertEquals( (int) 241, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {48,38},{20,42},{96,81},{23,26},{25,-61}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {45,65},{98,40},{91,50},{42,-39},{67,-54},{70,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {41,83},{44,53},{11,18},{41,85}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {52,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {83,33},{18,25},{96,-97},{3,70},{4,46},{45,-34},{77,47},{3,5},{96,48},{94,67}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {46,54},{91,-71},{59,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {51,-51},{3,17},{18,13},{62,92},{72,11},{42,-68},{13,-94},{60,-53},{9,46},{10,-46},{74,45},{69,50},{44,92},{65,4},{20,-51},{59,77},{35,87}});
        org.junit.Assert.assertEquals( (int) 179, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {26,6},{10,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {74,0},{59,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {63,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {97,11},{52,58},{69,2}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {96,14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {87,-6},{59,33},{34,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {39,62},{89,-99},{71,91},{61,30},{54,42},{42,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {74,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {78,72},{5,2},{33,87},{1,16},{37,64},{20,50}});
        org.junit.Assert.assertEquals( (int) 169, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {28,7},{44,2},{80,30}});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {60,18},{42,59},{38,86},{29,34},{48,-36},{95,1}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {32,-58},{91,9},{31,-26},{36,94},{34,-8},{0,55},{12,52},{9,-5}});
        org.junit.Assert.assertEquals( (int) 201, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {45,38},{34,-34},{41,56},{61,22},{19,70},{17,78}});
        org.junit.Assert.assertEquals( (int) 148, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {1,-31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {46,-62},{61,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {7,-3},{18,68},{90,40},{69,89},{70,22}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {73,51},{6,52},{75,94},{94,98},{51,38}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {63,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {66,-93},{44,93},{60,-57},{29,-64},{4,34},{24,78},{3,-81},{46,40},{76,33}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {59,54},{34,29},{31,-82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {9,84},{70,4},{98,40},{48,49},{86,-35},{4,79}});
        org.junit.Assert.assertEquals( (int) 163, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {14,51},{56,13},{36,36},{68,38},{49,65}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {34,87},{56,81},{61,28},{23,33},{44,17},{4,-62},{15,70},{35,87},{17,80},{64,-80},{70,55},{4,26}});
        org.junit.Assert.assertEquals( (int) 106, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {42,39},{48,25},{97,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {83,49},{55,31},{68,63},{97,-4},{5,-56},{40,-83},{82,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {85,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {53,75},{5,-85}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {22,47},{1,-16},{31,60}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {65,77},{68,35},{92,55},{56,26},{54,58},{41,73},{49,41},{79,-3},{76,35},{92,98},{6,95}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {4,7},{16,88},{72,56},{14,43}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {85,43},{87,46},{48,-98},{42,46},{99,79},{81,32},{61,37},{17,13},{42,-5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {22,67},{3,62},{79,16},{28,13}});
        org.junit.Assert.assertEquals( (int) 129, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {73,65},{22,52},{52,68},{17,89},{10,14},{63,0},{77,34},{16,14},{39,40},{76,-58},{12,17},{87,59},{68,-93}});
        org.junit.Assert.assertEquals( (int) 209, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {64,17},{83,50},{1,30},{81,35},{12,-20}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {77,32},{68,53},{36,43},{21,-5},{65,40},{35,-63},{35,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {10,24},{17,14},{17,32},{9,42},{39,82},{14,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {71,93},{89,93},{20,46},{8,0}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {16,-4},{94,25},{85,-61},{12,75},{6,64}});
        org.junit.Assert.assertEquals( (int) 139, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {54,19},{23,25},{26,1},{8,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {16,42},{98,-38},{13,37},{74,-14}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {70,93},{92,39},{7,42}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {27,3},{45,4}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {23,73},{52,91},{8,68},{27,83}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {45,3},{8,82},{73,2},{4,91}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-52,20},{68,-94},{91,63},{-51,78},{81,79},{31,63},{3,-36},{-64,-90},{99,-12},{1,96},{30,-15},{89,39},{33,36},{31,72},{70,21},{27,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {43,83},{99,26},{18,-14},{51,24},{75,55},{74,9},{86,99},{0,27},{-32,47},{-39,19},{-95,25},{61,37},{-75,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {96,88},{38,86},{32,-52},{96,87},{54,68},{16,34},{46,17},{94,62},{8,84},{15,88},{1,86},{92,42},{8,-79},{1,94},{13,33}});
        org.junit.Assert.assertEquals( (int) 386, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {95,60},{25,77},{89,86},{91,68},{36,63}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {82,-95},{27,1},{56,41},{7,65},{18,64},{8,-96},{20,25},{63,48},{86,3}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {13,46},{25,44},{90,99},{95,44}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {96,-20},{29,-23},{13,24},{42,-43}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {32,35}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {99,11},{5,62},{30,66},{92,-8},{27,-40},{7,49}});
        org.junit.Assert.assertEquals( (int) 177, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {62,60},{25,51},{78,64},{44,78},{17,64},{94,16},{10,-40},{3,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {14,21},{46,18},{92,61},{85,-82},{62,52},{67,-92},{81,15},{43,23},{54,51},{45,41},{36,88},{26,-24},{70,61},{55,-31},{78,40},{8,67},{22,32},{61,64},{85,12}});
        org.junit.Assert.assertEquals( (int) 187, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {56,-53},{72,56},{55,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {16,-36},{53,41},{92,73},{84,58}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {80,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {94,54},{71,-63},{10,-71},{90,33},{32,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {88,46},{60,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {78,-78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {36,34},{73,-47},{59,18},{46,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {49,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {88,54},{75,96},{5,74},{87,-86},{52,95},{5,91},{4,79},{44,38},{11,90},{95,-24}});
        org.junit.Assert.assertEquals( (int) 244, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {27,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {24,29},{45,-38},{73,-16},{15,72},{18,-86},{39,-88},{88,35},{44,-97},{4,-24},{24,-93},{50,84},{99,98},{40,56},{14,3},{41,-60},{43,91},{17,38}});
        org.junit.Assert.assertEquals( (int) 201, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {21,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {44,82},{98,1},{3,21},{69,-36},{53,98},{81,-15}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {81,-63},{58,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {88,-55},{75,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {87,80},{75,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {29,79},{67,25},{37,84},{74,20},{19,-59},{72,63},{21,66},{19,20},{51,28},{37,12}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {1,44},{86,17},{59,0},{76,83},{85,-54},{30,58},{36,-46}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {48,-54},{84,95},{17,34},{8,83}});
        org.junit.Assert.assertEquals( (int) 117, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {38,63},{74,18}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {14,74},{24,83},{84,98},{66,18},{87,25},{62,77},{3,79},{54,59}});
        org.junit.Assert.assertEquals( (int) 236, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {6,79},{4,-66},{83,60}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {79,93},{86,7},{0,55},{45,20},{30,32}});
        org.junit.Assert.assertEquals( (int) 148, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {36,-69},{27,-62},{65,71},{25,5},{77,29},{12,18}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {90,79},{25,41},{45,51},{63,70},{4,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {82,66},{87,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {86,51},{57,-48},{83,28},{23,88},{19,27},{65,51}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {93,17},{57,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {41,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {34,-90},{85,65},{79,16},{43,30},{37,88},{74,99},{36,-47},{63,87}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {30,56},{42,30},{19,72},{88,37}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {21,18},{76,59}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {24,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {37,26},{62,-9},{61,36},{36,93},{86,-23},{60,62},{12,44},{78,-56}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {70,87},{90,84}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {98,15},{87,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {70,29},{5,6},{76,-64},{88,23},{40,18}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {53,-32},{12,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {63,-66},{90,62},{44,-11},{32,35},{82,95}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {54,87},{0,70},{28,43},{57,45},{51,19},{95,-35},{84,-91},{80,53},{91,20},{42,66},{93,44},{1,-80},{21,75}});
        org.junit.Assert.assertEquals( (int) 254, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {74,43},{80,69}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {53,64},{84,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {55,-67},{7,64},{0,14},{97,-6},{22,-99},{5,96}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {12,3},{9,61},{26,18},{47,31},{78,-54},{80,-30},{51,97},{34,32},{87,67},{91,-41},{35,63},{99,79},{70,88},{55,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {23,59},{63,82},{21,29},{82,-84},{70,-78}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {83,54},{65,27},{93,93},{52,44},{82,74},{-22,50},{75,87},{35,17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {65,73},{55,-36},{42,29},{95,20},{79,41},{83,84},{6,-26},{39,1},{88,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {3,85},{70,33},{15,1},{28,3}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {94,-31},{38,37},{39,7},{92,10},{48,36}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {64,69},{6,95},{84,-42},{88,8},{46,19},{64,-11},{16,75},{93,38}});
        org.junit.Assert.assertEquals( (int) 170, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {35,66}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {87,2},{74,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {6,73},{37,13},{41,61},{7,39},{34,24},{77,31},{51,14},{12,88}});
        org.junit.Assert.assertEquals( (int) 261, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {58,94},{34,49},{47,35}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {6,72},{17,86}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {34,76},{9,8},{95,-29},{88,-48},{36,44}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {88,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {10,14},{77,-69},{46,92},{65,95},{54,53},{7,29},{99,76},{55,2},{89,11}});
        org.junit.Assert.assertEquals( (int) 135, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {29,0},{55,-33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {87,57},{7,55},{29,75},{61,37},{62,49},{67,-51},{9,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {56,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {70,-57},{78,79},{42,17}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {43,26},{96,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {93,31},{82,9},{54,82},{92,66},{9,-81},{79,76}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {41,12},{6,-89},{4,18},{13,37},{23,-8},{89,1},{78,56},{89,10}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {56,-40},{19,-64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {29,-98},{76,61},{36,35},{75,6},{7,61},{4,40},{42,36},{3,-78},{77,37},{72,95},{32,19},{66,9},{0,66},{21,82},{57,37}});
        org.junit.Assert.assertEquals( (int) 106, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {37,-8},{22,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {84,11},{76,18},{57,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {66,-61},{42,80},{22,56}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {42,89},{68,55}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {58,-28},{11,37},{88,-59},{31,7},{61,-54},{31,-19},{22,49},{66,7}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {30,73},{37,58}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {8,32},{78,80},{64,-71}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {70,41},{31,75},{21,37},{69,46}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {12,76},{27,-97},{96,78},{39,-2},{85,61},{16,24},{60,46},{53,26},{23,-46},{24,-96}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {36,83},{2,-92},{50,50},{59,-9},{31,53},{60,84},{27,92},{83,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {32,-19},{67,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {65,30},{55,64},{17,93},{79,17},{61,82},{4,12},{72,39},{39,-21},{37,24},{76,85},{23,47},{46,55},{51,20}});
        org.junit.Assert.assertEquals( (int) 152, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {14,38}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {85,-89},{9,72},{64,61}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {95,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {79,0},{89,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {3,31},{48,-21},{67,67},{34,-80},{1,-55},{81,58},{36,-76}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {4,91},{78,85},{56,47}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {60,72},{55,13},{68,54},{63,48},{9,59},{56,43},{85,28}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {58,53},{67,44},{70,14},{80,34},{48,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {46,57},{42,56},{0,94},{70,75},{8,62},{25,-84},{94,76},{26,40},{53,27},{90,50}});
        org.junit.Assert.assertEquals( (int) 253, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {83,95},{87,78},{56,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {29,41},{53,39},{33,11},{18,-82},{92,78},{63,38},{48,26}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {46,0},{10,92},{77,-18},{2,34},{21,46}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {32,90},{41,85},{50,83},{52,5},{92,36},{41,34},{51,9}});
        org.junit.Assert.assertEquals( (int) 175, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {36,96},{29,45},{75,-52},{14,68},{68,4},{54,34}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {70,27},{23,97},{70,-82},{96,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {51,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {61,36},{18,31},{77,24},{70,57},{73,66},{89,89},{0,62},{87,75}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {98,78},{52,87}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {5,48}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {83,94},{15,6},{59,88}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {64,61},{49,54},{74,6},{89,-21},{83,-56},{62,-17},{55,53}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {23,47},{76,81},{88,21},{47,-66}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {13,44},{79,96},{1,40}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {19,99},{93,50},{52,42},{16,23},{27,89},{82,21},{32,70},{29,16},{96,-74},{14,-27},{2,89},{14,21},{39,60},{69,-40},{49,-24},{21,9},{28,92},{35,33}});
        org.junit.Assert.assertEquals( (int) 211, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {72,50},{37,52},{49,76},{30,35}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {64,48},{28,-17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {41,67},{32,-13},{48,30},{38,-59},{99,86},{56,31}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {74,-57},{90,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {56,20},{48,78}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {35,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {16,84},{51,32},{22,5},{23,-73}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {28,9},{71,39},{37,47},{69,20},{22,-99}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {61,50},{7,17},{32,42},{84,87},{68,3},{60,89},{76,48},{79,54}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {48,10},{4,70},{70,50},{62,95},{35,70}});
        org.junit.Assert.assertEquals( (int) 165, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {44,89},{6,-34},{69,43},{97,31},{8,-85},{44,36},{24,2}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {79,92},{67,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {71,-64},{11,5},{-97,82},{87,42},{63,-74},{-58,70},{-9,17},{44,64},{32,85},{67,-97},{17,53},{84,-10},{17,-4},{29,66},{-62,56},{79,94},{39,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {84,83},{51,97},{86,53}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {13,83}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {92,11},{83,63},{37,31},{77,28}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {38,3},{61,21},{90,11},{9,82},{48,92},{67,55},{68,87},{75,75},{19,80},{77,-7},{99,69},{83,15},{39,0},{50,25},{87,70},{11,23}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {49,69}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {85,88},{30,87},{67,57},{75,5},{91,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {94,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {99,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {10,32},{94,13},{17,16},{-7,93},{-60,-98},{12,28},{2,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {82,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {22,78},{59,1},{-63,53},{77,33},{35,-95},{70,62},{-68,72},{-11,48},{-79,96},{-39,-31},{97,-9},{66,49},{-40,33},{51,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {2,57}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {65,14},{9,57},{18,37},{34,83},{30,28},{44,88},{78,55},{73,24},{59,84}});
        org.junit.Assert.assertEquals( (int) 228, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {47,4},{39,53},{32,97}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {42,44}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {84,12},{69,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {3,-46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {29,29},{53,24},{75,-69},{0,4},{54,-42},{54,92},{47,4},{99,76},{33,37},{2,52},{98,42}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {71,76},{8,77},{0,-36},{6,-15},{42,49},{17,39},{47,-90},{69,44},{95,44},{74,-50}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {8,14},{9,73},{42,33},{13,5}});
        org.junit.Assert.assertEquals( (int) 125, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {62,57},{13,-35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {34,32},{96,2},{76,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-65,97},{39,98},{38,36},{46,35},{4,34},{57,33},{62,43},{73,55},{50,72},{71,77},{84,22},{-67,98},{28,-43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {65,42},{47,19},{55,15},{62,17},{44,-24}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {53,4},{74,16},{1,74}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {34,26},{82,43},{47,65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {35,34},{46,1},{24,44},{89,54},{82,-50}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {39,-84},{44,1},{41,23},{67,19},{3,-93},{76,-28},{75,-45},{10,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {51,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {79,28},{23,-96},{75,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {92,67},{26,-59},{23,62},{36,40},{30,15},{38,66},{46,-23},{42,64},{65,5},{53,0},{53,71},{69,26},{73,28},{11,21}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {74,66},{12,48},{45,24}});
        org.junit.Assert.assertEquals( (int) 114, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {5,-49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {9,1},{60,67}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {14,-25},{79,50},{92,-94}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {8,69}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {60,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {38,15},{95,-19},{11,22}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {60,64},{78,43},{16,22},{65,60},{8,45},{74,54},{65,21},{0,22},{25,56}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {6,-31},{11,-70},{33,-55},{73,69},{71,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {92,28},{85,-64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {35,78},{4,71},{57,74},{27,68},{41,-63},{54,62},{65,29},{31,88},{37,58},{64,78},{11,74},{72,-80},{83,-95}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {13,42},{35,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {85,24},{84,51},{80,12},{54,47},{11,21}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {22,19},{70,-65},{71,85},{76,-52}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {74,6},{40,57},{39,36},{26,20},{82,16}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {18,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {13,-66},{46,97},{16,2},{97,23},{88,34}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {87,27},{80,-72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {94,-86},{21,2},{66,-50},{83,7},{84,17},{24,73},{44,86},{4,65},{39,-10},{35,98},{83,69},{0,68},{24,45},{48,76}});
        org.junit.Assert.assertEquals( (int) 304, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {33,86},{36,10},{52,18},{54,52},{4,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {72,-36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {11,38},{15,-46},{30,44},{84,79},{23,86},{75,58},{16,38},{95,-42}});
        org.junit.Assert.assertEquals( (int) 124, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {68,-68},{64,87},{51,-95},{70,63},{28,28},{87,85},{68,95},{20,5},{20,95},{66,72},{66,72},{74,58},{29,-9},{93,69}});
        org.junit.Assert.assertEquals( (int) 190, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {5,13},{61,25},{15,41},{48,38},{42,-81},{32,95}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {66,-45},{92,73},{39,83},{43,-53},{99,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {13,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {2,88},{27,13},{88,86},{91,73},{57,13},{64,-87},{91,-97},{3,93},{18,35},{7,94},{4,43}});
        org.junit.Assert.assertEquals( (int) 318, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {87,-74},{-19,10},{62,86},{99,66},{30,32},{83,-46},{24,63},{90,90},{33,72},{2,-63},{24,10},{-86,-86},{0,70},{37,-87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {27,-2},{14,-17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {76,43},{13,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {8,26},{25,35},{8,36},{71,3}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {0,-21},{19,-48},{44,-93},{22,81},{81,76},{72,63}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {53,0},{74,-36},{83,-32},{17,83},{40,81}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {76,-19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {13,82},{65,75}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {7,-44},{29,10},{93,-93}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {50,81},{47,-85},{67,64}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {41,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {59,-50},{5,85},{13,75},{14,10}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-75,81},{33,85},{57,47},{69,32},{67,60},{41,-20},{64,75},{63,87},{89,26},{24,44},{75,33},{28,40},{82,16},{68,58},{49,-29},{66,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {5,68},{84,-38},{19,94},{27,21},{90,-47},{9,45},{51,-88}});
        org.junit.Assert.assertEquals( (int) 207, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {24,98},{80,4},{98,56},{88,43},{48,41},{53,38},{50,51},{73,37},{23,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {59,4},{91,61},{83,-12},{41,67},{43,44},{46,76},{66,41},{98,23},{52,86},{84,37},{98,39},{93,-51},{61,37},{21,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {46,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {68,70},{45,2},{65,31},{2,-13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {53,87},{69,47},{18,64},{28,56},{57,61}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {95,35},{8,70},{22,73},{81,39},{76,53},{73,68},{8,61}});
        org.junit.Assert.assertEquals( (int) 204, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {14,59},{20,33},{39,38},{53,68},{46,61},{36,83},{64,81},{26,-93}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {61,63},{67,90},{40,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {4,-97},{48,16},{54,-14},{86,-39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {79,-56},{33,89},{76,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {94,19},{63,16},{87,40},{31,51},{38,78},{95,72},{98,91},{65,13},{68,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {46,37},{37,2},{75,27},{26,54},{7,73}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {78,14},{69,71},{2,41}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {29,12},{38,10},{67,21},{60,21},{92,29},{34,10},{81,-17},{0,9},{97,-70},{42,5},{71,-78},{16,91},{74,14},{22,36},{5,95},{35,8}});
        org.junit.Assert.assertEquals( (int) 104, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {18,-77},{43,51},{6,49},{65,34},{53,98},{61,24},{2,19}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {31,69},{69,68},{73,79},{18,64},{44,81},{70,34},{54,21}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {74,67},{39,17}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {16,42},{41,68},{90,80}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {74,-77},{90,-36},{86,96},{0,-70},{6,18},{17,49},{18,65}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {54,60},{23,90},{75,33},{48,85},{78,-84},{26,70},{21,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {40,78},{16,84},{83,89},{58,-13},{89,74},{91,34}});
        org.junit.Assert.assertEquals( (int) 162, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {10,28}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {49,-6},{55,42}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {65,47},{25,-43},{36,10},{49,-53},{99,30},{14,-58},{95,-13},{16,50},{80,1},{35,2}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {59,-23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {65,19},{21,12}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {60,79},{54,46},{48,25},{45,62},{31,64},{1,32}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {11,53},{77,32},{33,8},{34,-57},{45,-86},{27,39},{49,20},{88,51},{10,47},{78,82}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {14,32},{24,75},{35,34},{93,33}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-35,24},{26,58},{45,-77},{25,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {0,61},{18,3},{32,-54},{28,76},{69,-47},{93,-51},{52,74},{74,81},{46,30},{90,-21},{50,84}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {48,56},{32,-35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {83,68},{28,95},{64,41},{55,95},{66,77},{23,64},{22,85},{63,27},{45,72},{14,58},{97,99},{39,-16},{4,69},{76,91},{67,87},{2,56}});
        org.junit.Assert.assertEquals( (int) 268, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {77,4},{20,-73},{72,62},{36,-8},{86,96},{26,96},{81,8}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {89,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {42,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {56,72},{68,71}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {90,14},{26,-23},{76,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {29,-67},{-3,96},{44,96},{48,-80},{34,82},{31,57},{92,14},{16,80},{-11,-67},{90,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {15,-41},{29,9},{65,55},{36,32},{44,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {22,5},{26,98},{72,27}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {77,-80},{20,37},{93,11},{43,14},{18,67},{34,-61},{41,99},{27,63}});
        org.junit.Assert.assertEquals( (int) 229, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {33,22},{89,34},{74,98},{62,42},{96,73},{26,22},{25,17},{30,14},{97,32},{36,-75},{57,36},{16,-33},{46,43},{2,74},{67,0}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {1,48},{-34,-81},{67,32},{24,-14},{64,-64},{90,3},{-27,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {37,-83},{55,73},{75,54},{29,55},{16,91},{64,23},{29,-97},{38,21},{49,77},{83,15}});
        org.junit.Assert.assertEquals( (int) 168, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {13,0},{73,4},{48,49},{90,23},{41,45},{81,-96},{16,34}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {24,-22},{14,14},{1,70},{58,76},{49,29},{13,67},{25,75},{3,-45},{4,47},{77,74},{15,43},{43,31},{90,55},{0,16},{25,40},{71,-95},{87,-63}});
        org.junit.Assert.assertEquals( (int) 243, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {59,13},{47,97},{45,97},{81,78},{65,87},{74,4},{87,48},{48,95},{10,85},{26,25},{15,64},{99,18},{27,88},{2,73},{56,0},{95,80},{14,26}});
        org.junit.Assert.assertEquals( (int) 248, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {95,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {75,40},{69,44},{61,57},{57,44},{18,12},{92,14},{47,6},{93,82},{85,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {5,97},{11,3},{45,11},{28,15},{61,-92}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {81,20},{89,-44},{3,40},{71,-31},{31,6}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {30,-12},{57,33},{10,75}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {82,34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {36,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {18,54},{93,60},{34,26},{41,-80},{31,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {26,81},{38,14},{64,10}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {54,-27},{43,32},{18,55},{91,59}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {14,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {37,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {22,21},{95,3},{38,18}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {57,-36},{91,60},{18,6},{99,34},{18,-94},{4,84}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {21,67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {93,12},{99,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {65,96},{99,51},{60,50}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {23,-40},{45,10},{34,70},{33,81},{56,83},{26,-50},{10,-81},{27,-63},{20,-60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {65,7},{88,62},{11,-61},{41,82},{30,13}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {23,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {41,35},{97,21},{91,1},{22,82},{90,-74},{47,-70},{35,66},{19,75},{14,63},{26,49},{37,-92},{70,21}});
        org.junit.Assert.assertEquals( (int) 220, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {60,87},{98,93},{99,-44}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {9,49},{65,44}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {41,62},{52,99},{9,32},{40,78},{37,4},{6,-38},{7,39},{23,17},{2,34},{90,17},{52,64},{88,-97},{71,-14},{49,49},{64,45}});
        org.junit.Assert.assertEquals( (int) 204, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {28,0},{41,59},{26,-73},{53,31},{20,37},{74,29},{54,-70},{2,24}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {73,-4},{41,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {49,-43},{88,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {38,-51},{76,-5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {58,-13},{27,53},{68,60},{46,34},{23,93},{49,38},{5,27},{24,3},{76,56},{90,50},{95,10}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-4,37},{30,25},{73,-33},{73,-64},{5,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {28,-76},{86,-43},{53,76},{77,44},{21,46},{46,91},{24,42},{85,87},{91,29},{24,84},{71,-94},{1,75},{8,28},{48,91},{29,90},{37,-26},{76,9}});
        org.junit.Assert.assertEquals( (int) 121, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {90,98},{37,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {93,-96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {67,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {23,48},{42,18},{86,43}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {71,85},{93,15},{91,33},{60,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {53,18},{20,14},{78,-5},{57,26},{43,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {39,26},{63,35},{27,-96},{16,-34},{85,98}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {84,65},{59,65},{35,46},{87,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {74,87},{99,49},{7,24},{0,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {96,3},{16,60},{82,12},{73,57},{4,-12},{43,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {57,-43},{44,-18},{41,94},{71,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {89,3},{3,5},{63,25}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {52,51},{92,4},{76,23},{26,28},{46,24},{23,63},{78,68},{81,76}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {65,-35},{45,36},{24,77},{91,88},{46,-90},{44,52},{96,58},{45,97},{87,83},{16,86},{20,-94},{74,64}});
        org.junit.Assert.assertEquals( (int) 183, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {55,79},{30,8},{33,44},{85,23},{73,73},{54,16},{82,-18},{9,24}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {79,79},{37,84},{50,40}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {8,6},{13,64},{53,-68},{69,-40},{85,26},{69,22},{46,-94},{94,85},{22,61}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {8,-39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {80,42},{23,7},{92,69},{92,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {81,61},{1,69},{64,81}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {57,34},{28,47},{31,30},{38,25}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {28,-38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {88,-15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {2,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {61,65},{55,53},{89,74},{36,59}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {83,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {65,69},{47,2},{93,92},{58,14},{83,76},{63,26},{86,5},{14,63},{16,-55}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {28,9},{76,3},{71,77},{89,3},{78,26},{92,-37},{70,-67},{49,86},{69,57},{92,96},{41,64},{27,15},{22,-11},{13,4},{51,20},{23,25},{26,7},{52,99}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {78,-64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {93,30},{41,17},{39,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {41,67},{94,76},{21,-68},{33,19},{61,20},{-79,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {42,86},{69,32},{15,36},{69,88},{1,-47},{76,3},{13,45},{15,30},{56,64}});
        org.junit.Assert.assertEquals( (int) 111, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {29,45},{3,-33},{29,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {96,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {96,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {71,91},{97,11},{46,-44},{89,1},{26,90},{80,52}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {74,-13},{62,27},{80,-87},{71,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {89,23},{26,50},{8,97},{31,73},{96,5},{47,32},{84,0},{84,30},{54,7},{75,99},{78,16}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {62,83},{7,5},{41,-50},{67,25},{10,2},{15,36},{14,25},{48,28},{45,7}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {98,95},{2,-12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {33,-97},{94,65},{33,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {1,-39},{62,80},{6,61}});
        org.junit.Assert.assertEquals( (int) 141, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {45,-93},{41,15},{10,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {73,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {53,73},{0,60},{63,99},{16,62},{68,94},{15,-39},{40,29}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {42,-8},{52,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {17,43},{7,52},{47,95},{35,98},{89,-32},{36,19}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {39,36},{34,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {26,41},{58,55},{88,-76},{70,56},{99,41},{3,35},{82,56},{85,57},{23,-25},{33,13}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {56,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {3,-66},{97,93},{76,46},{31,-85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {85,64},{65,43},{9,55},{3,20},{62,-57},{0,8}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {35,78}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {82,49},{56,28},{26,-98},{14,17}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {19,21}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {82,-98},{86,-29},{27,-17},{38,55},{29,-86},{5,80},{0,11}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {53,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {19,8},{37,93}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {51,-72},{91,38},{17,31},{83,80},{18,2},{18,63},{26,21},{22,27},{8,-99},{45,-37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {30,-63},{4,25},{25,27},{43,11}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {7,94},{72,-43},{89,37},{60,58},{27,92}});
        org.junit.Assert.assertEquals( (int) 186, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {92,-94},{90,27},{94,91},{23,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {3,18}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {96,14},{95,-47},{50,15},{26,80},{52,13},{48,59},{25,-11},{40,-49},{56,9},{66,-50},{93,59},{12,-40},{13,55},{17,65},{89,22},{60,19},{9,65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {91,27},{42,73},{87,-64}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {64,-43},{73,43},{88,-84},{46,-29},{65,5},{23,86},{73,73},{26,-50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {71,41},{44,-87}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {35,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {49,48},{91,87},{61,-99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {11,14},{60,33},{70,70},{35,8},{96,4},{75,11}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {70,18},{49,81},{24,-87},{31,87},{33,-32},{39,85}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {50,-39},{95,2},{34,78},{91,92},{82,0},{70,-76},{94,-54},{11,85},{8,84},{51,97},{35,-61},{29,5},{17,71},{69,16},{91,1},{27,-53},{35,58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {93,44},{8,40},{43,37}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {31,14},{64,59},{90,26}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {58,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {77,92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {33,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {16,50},{40,82}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {35,71},{74,80},{77,44},{94,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {62,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {87,19}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {84,24},{36,63},{59,9},{45,86},{30,-5},{-77,85},{82,5},{24,2},{-94,28},{62,27},{-24,83},{28,71},{52,-25},{71,22},{50,75},{41,-13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {66,38},{44,-6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {58,30},{63,38},{27,-70},{58,-47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {87,-85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {72,-43},{92,-40},{10,-62},{12,22},{29,45},{18,35},{0,34},{67,15}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {0,32},{82,82},{79,9},{49,46},{0,0},{89,41},{18,69},{61,40},{50,43},{40,42}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {12,24},{5,11},{48,23},{34,50},{85,82},{97,58},{31,9},{29,-93}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {16,34},{63,70},{47,5}});
        org.junit.Assert.assertEquals( (int) 104, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {51,66}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {33,13},{81,-69},{86,-23},{58,5},{78,-89},{10,78},{20,91},{9,63},{61,23},{42,1}});
        org.junit.Assert.assertEquals( (int) 232, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {49,98},{81,94},{76,69},{71,83},{74,82},{5,3},{27,82},{85,84},{2,28}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {60,37},{47,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {53,-54},{95,-40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {29,43},{95,-99},{86,40},{95,7}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {47,-92},{19,77},{67,-34}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {68,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {63,73},{95,51},{19,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {84,-12},{58,94},{56,40},{44,73},{27,47},{19,8},{12,91}});
        org.junit.Assert.assertEquals( (int) 185, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {29,-17},{74,73},{47,35},{5,73},{9,65},{75,-42},{57,25},{42,-8}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {48,86},{92,-35},{59,-57},{97,44},{15,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {72,32},{62,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {87,71},{8,62},{46,85},{25,-42},{40,-30},{3,34},{40,21},{1,-99}});
        org.junit.Assert.assertEquals( (int) 181, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {72,39},{78,-2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {94,20},{56,8},{47,13},{26,79},{64,93},{2,-18},{68,-49}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {89,29},{34,44},{12,-64}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {7,4},{95,47},{15,28},{28,28},{82,61},{32,44},{1,49}});
        org.junit.Assert.assertEquals( (int) 125, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {90,-19},{27,60},{11,44},{74,0},{85,28}});
        org.junit.Assert.assertEquals( (int) 104, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {16,22},{62,1},{86,76},{84,31},{27,39},{83,94}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {23,46},{60,33},{74,54},{-91,-8},{85,78},{13,8},{9,-18},{98,81},{5,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {18,54},{85,-1},{60,99},{63,35},{44,41},{0,46},{20,-56},{91,43},{80,0},{72,41},{84,-84},{49,3},{47,-18},{3,7}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {32,-9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {42,-89},{43,30},{77,91},{78,74},{49,-25},{89,55},{52,-67},{58,-87},{61,7},{51,13},{43,98},{11,25},{98,-49},{21,-68}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {76,89},{17,30},{51,0}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {57,39},{58,62},{79,55},{1,0},{76,63},{98,75},{89,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {4,-34},{36,60},{97,1},{55,23},{96,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {49,94},{13,3},{18,81},{90,2},{96,47},{26,19},{42,9},{63,-97},{12,65},{43,58},{41,66},{67,64},{99,54},{33,59},{62,30},{81,18}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {0,30},{23,45},{14,-8},{38,61},{0,98},{38,-51},{44,52},{37,-76},{88,44},{2,41},{37,74}});
        org.junit.Assert.assertEquals( (int) 243, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {64,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {32,63},{77,42},{27,-52}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {24,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {51,64},{26,53},{95,-20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {13,-95},{90,-30},{24,-7},{90,17},{68,-73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {39,54},{36,38},{39,-54},{6,55},{71,-5},{86,21},{99,-64},{78,65}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {60,-49},{78,94},{74,18},{29,-83},{15,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {13,-47},{29,4},{14,45}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {77,81},{50,51},{69,-43},{54,6},{73,57},{13,25},{11,16}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {81,54},{39,11},{81,14},{8,49},{22,99},{65,98}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {78,-99},{47,34},{77,-71},{44,42},{76,34},{68,-71},{74,19},{81,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {2,-46},{83,-53},{83,99},{60,74},{35,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {42,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {18,17},{39,8},{85,11},{60,74},{22,13},{90,30}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {34,18},{61,45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {47,55},{10,19},{14,74},{42,31}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {58,-23},{70,94},{33,-29},{62,30},{43,32},{98,-58},{98,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {43,76},{7,63},{94,92},{78,-11},{44,62},{5,55},{6,1}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {16,-12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {87,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {30,13},{33,38},{69,-82},{82,-10},{78,39},{66,97},{35,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {56,76},{61,22},{97,56},{17,33},{6,98},{25,75},{23,75},{60,7}});
        org.junit.Assert.assertEquals( (int) 281, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {32,60},{98,25},{71,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {87,-77},{36,-55},{32,87},{2,94},{21,-92},{15,98},{40,60}});
        org.junit.Assert.assertEquals( (int) 339, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {14,-67},{63,50},{58,56},{24,-21},{4,79},{70,38}});
        org.junit.Assert.assertEquals( (int) 135, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {18,16}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {53,65},{2,-50},{29,76},{25,-78},{4,52}});
        org.junit.Assert.assertEquals( (int) 128, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {45,25},{57,25},{62,27},{63,85},{-31,4},{39,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {39,-89},{11,21}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {37,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {73,19},{73,14},{69,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {13,33},{64,5},{11,34},{13,-92}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {15,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {80,62},{65,21}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {81,38},{99,25},{38,-89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-4,87},{97,26},{-83,30},{37,91},{34,34},{-66,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {49,29},{92,5},{93,71},{30,46},{25,28}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {26,98},{46,-25}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {38,62},{75,39},{81,10},{20,-74},{60,70},{35,92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {47,27},{29,44},{95,74}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {96,54},{83,75},{99,-27},{89,53},{70,38},{5,59},{24,-86},{36,26},{49,-30}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {17,70},{51,26},{9,62},{77,36},{51,-16},{61,57},{38,94},{76,74}});
        org.junit.Assert.assertEquals( (int) 156, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {20,6},{21,-89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {36,66},{65,83},{25,47},{46,96}});
        org.junit.Assert.assertEquals( (int) 162, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {3,-60},{34,84},{78,84},{73,52},{86,70},{21,89},{67,-71},{53,62},{62,29},{23,67},{80,34},{38,74},{43,32},{73,57},{95,-93},{32,97},{6,51},{98,19}});
        org.junit.Assert.assertEquals( (int) 253, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {69,14},{17,91},{17,-92},{48,-7},{43,40},{19,-38},{83,52},{3,31},{46,16},{35,20},{-52,10},{99,-78},{27,8},{-86,6},{-84,20},{2,10},{28,-20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {29,69},{52,91}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {45,12},{16,85},{77,39},{20,-59},{5,84},{87,23}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {86,-74},{79,22},{64,19},{86,-17},{23,-81},{99,83},{63,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {94,-93},{37,93},{83,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {50,-64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {8,11},{38,31},{22,50},{8,28},{72,4},{60,87}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {25,0},{62,64}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {69,-48},{16,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {58,68},{-78,12},{95,-49},{62,24},{35,62},{8,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {98,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {43,-52},{83,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {28,18},{56,37},{44,60},{64,12},{98,-22}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {13,16},{51,56},{61,80},{69,78},{75,41}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {47,16},{11,52},{48,18},{0,-75},{20,71},{39,-67},{97,45},{72,80},{38,22}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {46,61}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {31,12},{23,84},{32,7}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {11,24},{99,93},{45,48},{55,39}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {88,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {1,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {45,45},{59,16},{6,22},{43,27},{61,19}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {96,1},{96,27},{89,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {56,56},{7,96},{40,21},{53,-75},{19,59},{26,56},{8,18},{30,33},{92,16},{0,-89},{62,-76},{36,44},{7,99},{29,49},{2,-43},{64,-93}});
        org.junit.Assert.assertEquals( (int) 310, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {61,79},{25,32},{71,5},{72,-80},{76,79},{92,67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {45,90},{89,66},{35,96},{11,13},{31,90},{56,85}});
        org.junit.Assert.assertEquals( (int) 186, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {25,46},{93,10}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {47,98},{73,33},{80,87},{16,8},{35,10},{24,26}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-30,-18},{49,61},{92,73},{-67,50},{72,61},{94,78},{79,29},{77,8},{6,11},{41,7},{50,93},{-99,99},{48,-99},{-77,85},{-88,-47},{-42,28},{9,6},{-42,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {45,-76},{26,-45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {30,28},{34,65},{54,83},{92,20}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {81,93},{86,98},{81,71},{99,88},{68,56},{40,-47},{29,32},{28,94},{59,70},{15,-86},{66,17},{-99,24},{-84,9},{63,38},{92,-88},{-58,-78},{66,72},{-54,41},{97,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {2,52},{1,15},{37,66},{7,84}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {91,13},{21,84},{40,75}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {73,93},{89,27}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {73,35},{54,84},{67,84},{-95,79},{12,23},{-47,38},{-35,53},{-7,16},{-91,50},{77,58},{40,-88},{57,92},{48,54},{2,54},{-35,-4},{87,8},{46,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {68,23},{44,58},{89,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {98,81},{0,58},{49,88},{5,29},{84,8},{84,-82},{82,6},{82,8}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {80,-58},{31,5},{93,62},{29,93},{24,-71},{23,79},{74,85},{23,75},{97,57},{82,-40},{17,80}});
        org.junit.Assert.assertEquals( (int) 252, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {36,17},{58,-60},{75,-88},{63,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {58,40},{75,41},{38,30},{69,43},{49,43},{78,75},{85,83},{27,87},{52,61},{38,26},{16,40},{44,27},{25,70},{83,64},{77,3},{63,61},{43,6},{31,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {84,52},{84,84},{58,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {6,36},{83,14},{17,86},{28,88},{96,10},{62,82},{41,14}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {29,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {9,-15},{42,-84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {0,5},{57,1},{21,70},{9,76},{61,51},{15,-48},{80,41},{33,20},{30,14}});
        org.junit.Assert.assertEquals( (int) 171, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {25,4},{-57,52},{51,93},{-70,13},{-64,54},{96,4},{27,54},{26,3},{47,-44},{-97,-69},{17,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {44,29},{32,29},{66,31},{17,79}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {94,35},{58,71},{97,25},{16,20},{59,-38},{91,71},{37,-49},{54,32}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {43,-73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {30,25},{53,-27},{25,20},{39,-89},{53,90},{90,0}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {52,64},{74,-36},{55,-35},{51,60},{17,89},{68,86},{44,13},{82,-72},{46,13}});
        org.junit.Assert.assertEquals( (int) 175, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {14,11},{53,65},{60,90},{79,71}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {70,40},{72,88},{65,1},{88,53},{86,45},{4,44},{63,96},{97,70},{92,28},{58,70},{12,62}});
        org.junit.Assert.assertEquals( (int) 202, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {10,6},{45,4},{7,-1},{33,-21},{72,99},{99,-54},{91,4},{15,90},{91,12},{57,46}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {19,-13},{52,99},{79,24},{78,76},{6,-21},{42,-28},{51,58},{77,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {23,81},{96,51},{12,67},{32,-42}});
        org.junit.Assert.assertEquals( (int) 148, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {76,21},{59,-69},{85,19},{24,28},{9,37},{9,1},{86,61},{4,33},{26,25},{76,-97},{29,3},{9,-8},{98,53},{84,43},{71,89},{50,61}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {70,-5},{17,83},{28,3},{13,74},{76,34},{32,58},{69,64}});
        org.junit.Assert.assertEquals( (int) 215, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {74,7},{31,-12},{2,5},{33,2},{51,21},{50,78}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {51,66},{81,24},{95,69},{8,29},{35,54},{65,11},{56,93}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {83,-31},{22,25},{85,62},{46,66},{10,53},{8,32},{11,34},{88,-91},{33,-3}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {98,56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {74,84},{76,96},{51,82},{21,92},{30,11},{86,-62},{60,94},{40,82}});
        org.junit.Assert.assertEquals( (int) 103, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {20,44},{61,40},{95,88},{64,20},{86,95},{91,29}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {68,50},{59,-47},{95,69},{11,-89},{95,20},{47,-93}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {35,71},{44,19},{90,27},{11,91},{6,71},{75,-49}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {44,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {15,31},{37,50},{1,52}});
        org.junit.Assert.assertEquals( (int) 133, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {49,16},{99,80},{9,2},{87,76}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {60,70}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {10,40},{71,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {84,6},{45,82},{22,68},{44,30},{14,99},{23,-40}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {38,44},{79,57},{14,-17},{98,-24}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {15,7},{93,-1}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {30,69},{99,57},{23,55},{72,29},{42,87},{48,23},{65,71}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {25,5}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {78,52},{65,31},{77,76},{92,37},{18,98},{57,74},{0,16},{96,81},{50,-56},{81,99}});
        org.junit.Assert.assertEquals( (int) 190, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {89,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {89,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {45,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {3,61},{66,93},{20,95},{82,3},{99,13},{97,-48},{98,66},{18,65},{83,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {66,16},{62,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {32,24}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {90,66},{99,42},{44,56},{14,49},{15,86}});
        org.junit.Assert.assertEquals( (int) 191, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {28,52},{23,99},{39,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {42,36},{63,-59},{39,47},{53,24},{81,78},{17,-10},{18,-44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {63,13},{94,39},{6,74}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {4,60},{93,85},{5,5},{58,10},{86,57}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {31,61},{20,74},{53,65},{97,42},{71,1},{95,54}});
        org.junit.Assert.assertEquals( (int) 139, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {17,5},{43,-87},{78,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {78,87},{85,50}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {86,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {93,69},{12,-81},{34,12},{57,13},{55,63},{14,95},{13,9}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {80,62},{83,42},{26,23},{0,13},{18,-27},{54,-57},{52,52},{24,-93}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {54,87},{57,1},{16,55},{0,-2},{-68,-48},{39,81},{-21,58},{49,78},{1,92},{-27,-3},{63,51},{82,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {19,78},{73,34},{23,75}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {43,95},{86,22}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {81,-84},{34,79},{45,41}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {16,49},{16,18},{58,-15},{63,-94},{11,-21},{25,5},{72,89},{18,-85},{37,24},{94,2},{71,83},{9,40},{42,13},{59,61},{78,29},{57,20},{36,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {47,98},{27,95},{28,34},{68,82}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {9,10},{60,-51},{25,27}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {35,77},{47,44}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {76,11},{98,13},{34,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {38,-30},{37,89},{89,93},{99,89},{51,43},{27,-24},{86,51}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {97,-46},{45,4}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {19,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {67,96},{46,58},{63,40},{84,69},{31,8},{21,67},{5,38},{95,69}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {25,86},{50,-68}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {18,20},{30,97},{63,13},{94,66},{1,78}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {32,31},{51,87},{39,86},{91,78}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {28,-9},{13,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {52,60},{70,40},{76,46},{92,31},{61,-86},{39,52},{15,58},{83,-71}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {1,8},{75,56},{84,76},{71,92},{15,32},{65,80},{82,51},{79,9},{54,53},{8,4},{58,82},{51,-31},{18,-35},{99,55},{12,81}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {4,8},{74,18}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {19,15},{2,98},{77,96},{96,63},{72,-47},{14,9},{33,30},{25,60}});
        org.junit.Assert.assertEquals( (int) 203, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {85,22},{70,97},{80,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {41,77},{27,-13},{27,18},{2,-41},{91,5},{70,95},{24,91},{49,30},{8,11},{44,72},{46,9},{31,2},{38,-2},{79,99},{31,99},{36,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {65,-86},{76,98},{35,12},{72,0},{39,99},{27,-38},{21,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {38,-66},{35,85},{-83,53},{79,5},{-89,38},{10,-80},{73,69},{61,90},{64,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {67,38},{84,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {7,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {14,86}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {99,40},{24,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {91,27},{97,83},{55,53}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {12,22},{60,82}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {78,45},{46,10},{74,80},{13,71},{52,61},{24,59}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {81,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {35,7},{54,58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {13,81},{5,71},{31,18},{33,60},{96,28},{9,25}});
        org.junit.Assert.assertEquals( (int) 177, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {21,-73},{12,-46},{57,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {97,3}});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {52,-13},{30,92},{5,-50}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {96,-65},{49,-77},{26,47},{13,69},{91,70}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {78,-71},{0,-83},{31,59},{95,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {27,-66},{72,84},{61,-12},{58,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {94,34},{99,98},{8,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {31,82},{85,-57},{48,41},{93,85}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {42,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {76,59},{93,74},{87,62},{63,27},{2,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {40,-36},{92,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {11,6},{18,66},{52,28},{80,9},{45,97},{82,-92},{19,8}});
        org.junit.Assert.assertEquals( (int) 177, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {36,3},{30,47}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {7,87},{39,72},{9,5}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {60,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {29,32},{9,79},{18,-88},{85,-40},{59,77},{40,6}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {46,46},{85,-94},{15,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {94,75},{34,70},{71,26},{37,53},{42,-14},{60,-60},{35,35}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {45,38},{51,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {53,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1000() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {10,-50},{39,7},{93,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1001() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {57,94},{34,35}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1002() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {50,48},{62,57},{64,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1003() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {26,-80},{77,33},{57,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1004() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1005() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1006() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {23,35},{90,-32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1007() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1008() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {45,36},{51,78},{7,-65},{95,5},{12,-1},{2,88},{69,-34},{28,-71},{57,95},{84,78},{46,87},{59,1},{13,-18}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1009() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {96,89},{11,78}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1010() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {89,19},{58,38},{50,0}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1011() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1012() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {68,18},{65,32},{4,93},{35,90},{44,88}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1013() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1014() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {16,-72},{83,-35},{41,-43},{32,-83},{13,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1015() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1016() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {86,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1017() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {7,24},{49,-66},{75,5},{97,41},{44,-72}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1018() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {36,14},{91,89},{58,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1019() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {15,9}});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1020() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1021() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {68,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1022() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {29,-93},{16,-49},{23,11},{14,21},{4,84},{35,-86},{20,27},{19,39},{12,39},{88,45},{76,6},{10,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1023() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {38,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1024() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {82,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1025() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {82,57},{11,-49},{53,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1026() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {27,-89},{70,76},{23,-85},{0,96},{73,-94},{50,92},{90,65},{51,48},{97,15},{60,96},{70,0},{54,-23},{36,43},{50,36}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1027() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {62,-84},{14,47},{44,-28},{29,61}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1028() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {95,-50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1029() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {25,50},{44,-3},{41,-49},{16,10},{74,23},{26,26},{18,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1030() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {53,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1031() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1032() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {27,87},{80,62},{24,79},{91,1},{55,6},{13,-4},{54,-24},{62,62},{54,50},{30,56},{93,-90},{42,42},{56,-70},{40,-88},{96,26},{74,-46},{37,54},{84,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1033() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1034() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1035() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {71,85},{7,28},{14,5},{22,12},{73,79}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1036() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {2,92},{53,99},{28,41},{0,-79},{30,91},{57,12},{20,76},{39,45}});
        org.junit.Assert.assertEquals( (int) 259, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1037() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1038() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {79,76},{68,-19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1039() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {87,-63},{79,64},{67,-33},{83,33},{97,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1040() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {78,-77},{21,-21},{8,-53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1041() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {89,-31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1042() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {95,35},{62,-3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1043() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {94,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1044() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {39,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1045() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {45,40},{50,80},{87,-56},{57,8},{36,82},{15,47},{73,5},{97,34},{35,67},{48,71},{4,63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1046() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {27,17},{82,59},{7,52},{28,44},{35,95},{72,-56},{28,33},{19,15},{35,92},{46,29}});
        org.junit.Assert.assertEquals( (int) 162, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1047() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {61,27},{53,-13}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1048() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {51,-34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1049() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {80,-35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1050() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1051() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {1,11}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1052() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {8,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1053() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {34,24},{0,7},{32,4},{79,4},{45,97},{92,15},{8,93}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1054() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1055() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {80,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1056() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {87,-68},{59,-55},{-53,22},{87,4},{82,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1057() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {65,91},{21,91},{46,61}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1058() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1059() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {14,90},{41,3},{90,56},{16,10}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1060() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {43,81},{61,22},{22,73}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1061() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {22,-89},{68,-45},{19,2},{21,-56},{37,83},{83,21},{24,17},{21,33},{54,72},{32,78}});
        org.junit.Assert.assertEquals( (int) 194, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1062() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {37,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1063() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-91,74},{27,20},{78,46},{39,50},{15,13},{58,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1064() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1065() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {9,19},{81,38},{14,-50},{36,6},{87,85},{80,60},{38,67},{89,-41},{2,-18},{83,31},{79,98},{63,-6},{24,-84},{98,-90},{46,89},{14,72}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1066() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {26,52},{5,49},{89,62},{94,25},{78,23}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1067() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {63,-65},{51,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1068() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1069() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {89,47},{21,-20},{70,-27},{75,-68},{44,98},{41,9},{29,57},{15,-54},{34,98},{37,85}});
        org.junit.Assert.assertEquals( (int) 196, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1070() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {70,50},{72,-70},{57,74},{-8,41},{87,-48},{29,78},{60,15},{98,79},{-38,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1071() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {11,38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1072() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {66,76},{61,83},{85,-8},{23,16},{73,49},{4,34},{50,42},{97,97},{17,60},{0,19},{52,99},{7,33}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1073() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {71,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1074() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {36,51},{78,62}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1075() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {27,5},{85,-96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1076() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {61,-51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1077() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {90,12},{95,-22},{14,-98}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1078() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1079() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1080() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {48,-57},{63,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1081() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {45,49},{65,39},{61,49},{62,56},{45,4},{44,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1082() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1083() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {34,94},{57,14},{67,-34},{19,-65}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1084() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {13,17},{81,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1085() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {75,47},{4,9},{71,53},{16,2},{89,18}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1086() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {21,-82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1087() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {74,-42},{15,40},{2,47},{61,-49},{63,-27},{92,-88},{20,-32},{24,15},{75,21},{57,3},{17,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1088() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1089() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {63,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1090() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {66,3},{68,72},{6,11},{66,3},{78,61},{95,49},{21,84},{35,82},{93,-69},{85,-9},{60,-99},{7,62}});
        org.junit.Assert.assertEquals( (int) 239, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1091() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {8,12}});
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1092() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {1,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1093() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {30,-88},{42,-47},{35,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1094() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {48,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1095() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {28,61},{6,74},{55,71}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1096() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {46,28},{52,32},{98,-44},{86,-90},{70,57},{52,51}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1097() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {1,62}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1098() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {26,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1099() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {8,20},{54,98},{27,84}});
        org.junit.Assert.assertEquals( (int) 202, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {85,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {34,60},{58,10}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {20,56},{18,-98},{43,64},{43,-29},{73,56},{84,33},{8,82},{70,79},{64,76},{70,88},{27,94}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {74,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {63,54},{33,37},{80,6},{28,-11},{10,-36},{74,33},{79,-52},{72,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {71,74},{53,-2},{38,53},{60,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {30,41},{70,-28},{99,9},{95,-75},{13,-16},{55,-54},{51,-90}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {92,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {39,-91},{85,70},{27,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {45,29},{49,-75},{30,55},{48,1},{6,-44}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {38,-16},{96,93},{76,-16},{32,2}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-44,48},{61,26},{9,86},{52,66},{-27,4},{70,46},{85,-8},{41,23},{55,-53},{58,-87},{-64,17},{38,-50},{-86,59},{67,-77},{52,65},{59,-10},{7,31},{-49,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {52,-65},{88,93},{23,96},{25,16},{94,75}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {97,35},{86,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {73,34},{4,85},{91,45},{0,68},{34,69},{83,8},{30,83}});
        org.junit.Assert.assertEquals( (int) 236, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {83,-5},{40,37},{77,97},{69,16},{6,-19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {25,-21},{53,27},{72,27},{72,33},{78,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {36,45},{94,19},{52,2},{61,-66},{56,-18},{53,-74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {3,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {29,73},{40,40},{47,80},{61,72}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {17,91}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {77,-71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {93,47},{35,-40},{51,72},{32,34},{26,94},{79,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {63,40},{3,16},{73,45},{10,55}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {8,95},{56,25},{61,23},{2,84},{43,-51},{12,70},{90,58},{61,48},{90,94}});
        org.junit.Assert.assertEquals( (int) 297, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {17,58},{73,71},{10,-30},{90,63},{96,67},{44,94},{62,35},{55,85},{79,43},{61,22},{90,78},{2,-27},{21,65}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {95,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1132() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {93,16},{68,77},{74,-92},{95,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1133() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1134() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {39,63},{81,7},{14,48},{26,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1135() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {55,39},{42,56},{79,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1136() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {34,44},{74,67},{61,43},{11,72},{94,48},{65,63},{84,9},{61,4},{-81,63},{4,88},{15,49},{80,10},{72,51},{59,-99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1137() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {15,-16},{64,5},{37,-23},{96,51},{67,93},{26,77},{67,0},{88,15},{80,-59},{61,43},{20,10},{15,-18},{95,96},{8,42},{70,-79}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1138() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {25,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1139() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {45,96},{32,97},{22,95},{69,80},{68,28}});
        org.junit.Assert.assertEquals( (int) 193, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1140() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1141() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {34,19},{95,31},{80,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1142() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {49,7},{58,52},{64,70},{33,25},{61,87},{39,7},{93,25}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1143() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {84,1},{11,5},{53,56}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1144() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {85,77},{26,10}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1145() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {67,82},{89,55},{0,10},{32,40},{26,24},{39,10},{77,0},{86,59},{51,-96},{90,26},{23,22},{41,-37},{45,94},{93,15}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1146() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {90,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1147() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {28,49},{97,49},{88,35},{69,17},{5,23},{21,-38},{2,18},{60,90}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1148() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {0,58},{20,45}});
        org.junit.Assert.assertEquals( (int) 103, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1149() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {83,-23},{11,46},{76,60},{87,34},{99,86}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1150() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {30,81},{4,62},{71,48}});
        org.junit.Assert.assertEquals( (int) 143, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1151() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {45,-54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1152() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {28,42},{73,45},{63,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1153() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1154() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {46,75},{79,-85},{59,36},{90,-53},{79,-54}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1155() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1156() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {15,74},{77,59}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1157() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {59,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1158() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {42,55},{87,99},{89,23},{75,-24}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1159() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {14,-66},{63,-54},{37,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1160() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {59,66},{24,63},{18,68},{57,-76},{74,84},{91,68},{96,-49},{27,33},{61,27},{95,79},{33,24},{53,-81},{98,54},{90,-3},{18,36}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1161() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {61,19},{48,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1162() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {21,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1163() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {32,72},{2,45},{49,45},{92,72},{93,64},{85,87},{33,75},{17,28},{51,75}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1164() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {17,53},{57,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1165() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {77,87},{36,46},{29,62},{90,35},{74,88},{85,58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1166() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {81,-82},{82,32},{68,8},{73,33},{57,58},{15,15},{72,26},{33,71}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1167() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {48,33},{93,64},{95,-31},{20,-18},{47,29},{29,33},{99,74}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1168() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1169() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {2,27},{41,71},{73,14},{34,2}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1170() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {47,26},{43,-37},{43,99},{55,3},{57,32},{39,17}});
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1171() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {50,-16},{75,-40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1172() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {45,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1173() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {12,80},{13,40},{32,80},{34,64},{86,53},{34,-57},{10,96},{0,21},{38,93},{44,52},{96,92},{1,-66}});
        org.junit.Assert.assertEquals( (int) 330, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1174() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {57,33},{39,38},{78,74},{78,46},{17,41},{94,88},{37,17},{2,-81},{50,23},{40,70},{29,97},{22,44},{83,9},{86,-34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1175() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {90,15},{0,32},{33,80},{82,-64}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1176() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {49,-41},{60,-82},{75,22},{18,52},{81,57},{73,25},{64,18},{3,2},{90,60},{81,15},{83,-85},{85,92},{-91,3},{0,-22},{96,59},{-6,29},{-8,-57},{-73,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1177() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {92,-72},{66,-89},{69,96},{43,22},{-71,84},{10,35},{5,20},{35,71},{90,-65},{-34,69},{52,75},{66,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1178() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {22,51},{90,2},{13,95},{79,-84},{21,76},{24,63}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1179() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {13,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1180() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {72,65},{52,83},{45,17}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1181() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1182() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {54,46},{4,85},{20,-87}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1183() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {27,-82},{45,-63},{90,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1184() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {59,61},{14,94},{93,90},{74,37},{15,92},{29,64},{27,0},{54,-12}});
        org.junit.Assert.assertEquals( (int) 250, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1185() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1186() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {21,5}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1187() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {88,23},{29,2},{57,80},{28,32}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1188() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {10,9}});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1189() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {99,37},{35,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1190() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {13,92},{41,-32},{36,50},{46,31},{40,86},{61,4},{32,73}});
        org.junit.Assert.assertEquals( (int) 178, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1191() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {27,81},{86,-58},{44,5},{60,-56}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1192() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {10,87},{89,-6},{76,-1},{98,26},{20,52},{7,33},{77,40}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1193() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1194() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {33,-30},{0,94}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1195() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1196() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1197() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1198() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {7,44},{2,24}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1199() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {44,93},{76,-46}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1200() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1201() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {37,84},{94,65},{59,45},{48,5}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1202() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {58,41},{69,32},{14,-43},{90,48},{37,-8},{88,47},{30,89},{66,-77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1203() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1204() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1205() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {7,5},{50,-84},{92,83},{14,6}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1206() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1207() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1208() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {13,84},{25,18},{69,-8},{74,58}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1209() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1210() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {41,41},{82,78}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1211() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {67,45},{17,30},{6,-70},{88,62},{79,88},{12,67},{13,65},{95,71},{83,85}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1212() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {44,55},{24,6},{66,99},{18,48},{76,93},{12,13}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1213() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {59,56},{99,-62},{22,1},{4,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1214() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {77,23},{52,25},{50,-31},{9,42},{65,75},{91,-41},{5,25}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1215() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {64,-90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1216() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {11,35},{45,62},{79,33},{57,54},{14,39},{47,32},{96,30},{58,71},{38,4}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1217() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {37,52},{13,32},{28,7}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1218() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {91,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1219() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {99,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1220() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {20,95},{87,32}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1221() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {18,49},{80,93},{98,19},{5,85},{34,12},{31,17}});
        org.junit.Assert.assertEquals( (int) 151, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1222() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {93,36},{25,72},{54,49}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1223() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {24,-46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1224() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1225() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1226() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1227() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {52,88},{83,75},{2,-14},{71,39},{39,86},{52,61},{2,97},{57,80},{80,84},{76,16},{66,55},{58,-10},{21,47},{52,41}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1228() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1229() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {41,-25},{15,46},{87,68},{29,18},{29,62},{12,-65},{97,65},{50,15},{40,-56}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1230() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {30,1},{54,0},{23,60},{58,49},{24,85},{33,-43},{57,63},{34,34},{32,0}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1231() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1232() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {60,89},{32,56},{53,64},{18,71},{54,12},{84,-35},{55,48},{45,52}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1233() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {40,9},{25,44},{18,11},{23,25},{1,71}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1234() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {88,79},{94,98},{0,26}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1235() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {74,90},{8,72},{17,35},{97,93},{81,22},{88,68},{9,97},{93,-60},{56,99},{69,71}});
        org.junit.Assert.assertEquals( (int) 303, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1236() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {2,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1237() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {84,38},{89,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1238() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {60,55},{90,95}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1239() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1240() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {3,39},{6,-99},{6,26}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1241() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {53,-93},{47,32},{68,98},{20,57}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1242() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {79,51},{71,61},{75,82},{92,8},{36,-32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1243() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1244() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1245() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {85,97},{37,8},{58,9},{27,30}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1246() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {40,91},{1,-91},{97,97},{44,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1247() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {19,90},{71,75},{24,31},{48,-8},{22,18},{86,92},{66,56},{17,-6}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1248() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {10,47},{23,84},{50,-16},{82,73},{69,10}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1249() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {52,93},{44,46},{54,90},{77,80},{21,86},{46,-43}});
        org.junit.Assert.assertEquals( (int) 179, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1250() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {55,63},{0,29},{90,1}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1251() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1252() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {67,34},{6,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1253() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {26,97},{24,39},{85,52},{95,-55},{73,92}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1254() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1255() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {0,98},{95,-42},{85,4},{41,21},{98,78},{6,38},{97,96},{19,41}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1256() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {36,45},{2,-72},{95,-46}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1257() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {18,46},{79,35},{21,86},{35,30}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1258() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {50,-90},{59,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1259() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {88,61},{90,28},{33,6},{3,-18}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1260() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {33,-11},{63,75},{37,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1261() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {10,-95},{36,8},{95,-93},{68,87},{64,31},{5,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1262() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {46,-86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1263() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1264() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {76,35},{44,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1265() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {23,8},{21,41}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1266() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {44,42},{20,89},{11,4},{30,47},{74,-55}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1267() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {21,-3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1268() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {70,96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1269() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {5,-35},{44,11},{74,82},{33,97},{87,-10},{47,35},{48,65},{68,-74},{4,76},{64,40},{40,33}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1270() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {38,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1271() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {63,88},{3,45},{25,25},{92,86}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1272() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {85,-14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1273() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {0,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1274() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {25,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1275() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {41,91},{23,9},{63,44},{48,81},{9,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1276() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1277() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {44,90},{55,-70},{85,6},{72,66},{78,33},{70,4},{95,71},{54,-91},{10,66}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1278() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {51,55},{59,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1279() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {64,2}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1280() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {18,77},{31,11},{27,87}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1281() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {99,-7},{67,53},{91,63},{60,57},{24,21}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1282() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {27,37},{83,11},{12,34},{55,87},{52,31},{34,64},{71,24},{23,44},{29,78}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1283() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {90,79},{23,51},{83,18},{13,0},{61,49},{20,0},{18,8},{72,59},{66,49},{88,16},{47,39},{26,27},{53,19},{25,-71}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1284() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {6,5},{91,41},{93,28},{88,93},{62,58},{50,-28},{15,91},{8,42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1285() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {72,42},{37,-27},{47,31},{47,97},{14,39},{3,71},{44,8}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1286() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {95,63},{52,82},{69,28},{3,19}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1287() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {23,47},{95,13},{25,63},{35,43},{67,24},{8,6},{82,-61},{61,99},{36,64},{23,-5}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1288() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {81,10},{90,49},{58,-6},{50,-84},{0,-82},{18,96},{66,4},{32,83},{28,32},{20,43}});
        org.junit.Assert.assertEquals( (int) 179, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1289() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {51,59},{34,51}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1290() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {46,26},{77,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1291() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {69,-25},{24,22},{74,-45},{9,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1292() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {32,66},{90,20},{55,38},{53,79},{94,79}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1293() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {8,-55},{89,51},{-36,25},{36,88},{97,81},{1,96},{38,75},{0,-61},{91,57},{25,6},{97,8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1294() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {39,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1295() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {91,80},{84,6},{77,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1296() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1297() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {30,99},{35,80},{79,47}});
        org.junit.Assert.assertEquals( (int) 179, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1298() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {87,32},{54,58},{82,-12},{98,-71},{71,17}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1299() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {75,34},{8,-76},{92,81},{73,-69}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1300() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {14,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1301() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {95,82},{47,19},{48,75},{53,-44},{83,-50},{19,-76},{13,84},{42,18}});
        org.junit.Assert.assertEquals( (int) 159, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1302() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {82,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1303() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {72,47},{76,34},{84,34},{10,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1304() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {46,83},{71,68},{0,2}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1305() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {55,2},{-43,-82},{-4,65},{96,60},{76,97},{-26,45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1306() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {34,66},{98,40},{1,-72},{45,-17},{69,26},{20,87},{6,-74},{26,31},{9,-92},{13,-53},{3,8},{13,50},{89,66}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1307() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {63,36},{65,63},{75,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1308() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {69,79},{59,-68},{28,-21},{35,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1309() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {12,59},{81,-13},{41,6},{-27,33},{74,22},{30,19},{43,-48},{68,36},{55,-25},{-35,-88},{30,39},{-82,85},{16,88},{-10,55},{97,-77},{58,-42},{-49,6},{38,-51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1310() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {16,3},{23,9},{4,40},{66,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1311() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {60,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1312() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {3,81},{35,62},{94,31},{23,79},{71,21},{83,1},{32,79},{85,42},{54,85}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1313() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1314() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {9,34}});
        org.junit.Assert.assertEquals( (int) 34, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1315() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {78,-63},{64,4},{22,57},{98,62},{87,-57},{10,42},{41,55},{5,96},{91,33}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1316() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {99,13},{61,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1317() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {75,71},{91,-51},{1,56},{59,24},{68,-7},{76,14},{66,16},{54,60},{43,42},{41,83},{25,-59},{36,94},{64,93}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1318() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {33,54},{83,59},{10,8}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    public void test_1319() throws java.lang.Exception {
    }
}

