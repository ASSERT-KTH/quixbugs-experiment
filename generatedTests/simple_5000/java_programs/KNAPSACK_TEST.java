package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {72,65},{0,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {45,59},{94,-16},{57,15},{34,-60},{47,45},{73,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {68,67},{9,67},{12,46},{50,66}});
        org.junit.Assert.assertEquals( (int) 133, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {44,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {7,17},{43,24},{90,46},{93,90},{24,27},{92,38},{32,82},{63,25}});
        org.junit.Assert.assertEquals( (int) 126, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {35,15},{61,-39},{6,2},{51,53},{96,99},{70,39},{52,93}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {99,90},{90,-19},{92,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {85,52},{96,46},{83,80},{49,-69},{77,-30},{67,-35},{58,84},{77,-84},{93,18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {37,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {86,79},{86,53},{15,99},{11,61},{13,86},{44,78},{5,47},{37,52},{98,31},{-70,3},{13,-7},{45,74},{-32,90},{-55,59},{25,42},{94,84},{-40,54},{87,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {30,69},{28,-62},{68,57}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {18,77},{82,93},{15,-23},{2,7},{13,93},{19,41},{6,35},{34,-46},{79,37},{34,-34},{27,-89},{57,96},{27,-5},{35,38}});
        org.junit.Assert.assertEquals( (int) 253, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {99,33},{21,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {24,25},{0,51},{29,-74},{35,26},{44,-6}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {3,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {22,59},{53,-35}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {21,49},{47,27},{94,7},{7,80},{75,99},{30,69},{99,76},{82,90},{87,12},{77,79},{89,-22}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {31,81},{91,1}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {76,7},{29,22},{49,7},{52,65},{70,83},{47,45},{34,48},{32,30},{37,-89},{14,15},{57,39}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {49,10},{26,64},{76,38},{91,39},{77,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {86,72},{0,19},{57,35},{85,69},{1,45},{63,40},{82,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {58,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {61,19},{43,73},{36,31},{74,16},{74,71},{0,-29},{50,31},{78,24},{16,-46},{23,-34},{49,64},{60,43}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {93,98},{21,-52},{78,86},{87,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-87,15},{24,7},{72,91},{60,81},{97,81},{-69,19},{63,25},{14,-48},{7,53},{-28,80},{29,62},{25,-78},{31,25},{-76,73},{-81,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {63,48},{16,31}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {80,78},{33,90},{43,-10},{27,65},{3,-30},{29,64},{70,-24},{24,95},{21,31},{72,73},{49,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {45,-72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {63,14},{67,25}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {95,-72},{53,80},{5,16},{95,68},{46,12}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {53,-42},{-95,77},{60,48},{72,85},{84,-22},{4,-6},{39,18},{90,68},{25,-27},{44,-41},{62,77},{49,23},{60,85},{6,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {36,-54},{81,-49},{39,70},{58,-68},{20,-61},{78,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {70,-30},{85,31},{48,8}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {49,78},{26,2},{24,24},{85,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {79,41},{76,28},{15,-73},{46,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {30,-90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {75,-46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {11,-17},{20,72},{72,41},{96,10}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {15,85},{90,20}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {66,3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {74,52},{64,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {3,80},{49,74},{1,24}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {32,19},{7,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {9,-67},{39,23},{84,-80},{26,92},{36,40},{46,-41},{98,84},{48,11},{36,-16}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {18,53},{45,13},{9,15},{6,0},{89,-85},{13,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {22,69},{88,74},{22,56},{25,70},{5,87},{91,79},{53,7},{53,76},{84,9},{71,37},{91,74},{28,26}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {6,7}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {94,15},{7,57},{71,79},{82,-41},{30,63},{88,77}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {67,-11},{75,18},{30,55},{40,18},{11,-65},{50,40},{30,39},{66,62},{68,11},{40,81},{38,-82},{79,54},{8,6},{40,-73},{71,-12}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {51,-24},{94,22},{25,68},{68,15},{69,-87},{53,-60},{73,7},{16,52},{20,-76},{88,37}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {95,66},{64,-33},{44,61},{67,-21},{68,97},{85,-65},{22,81},{42,-7},{21,68},{25,82},{68,50},{90,98},{70,38}});
        org.junit.Assert.assertEquals( (int) 231, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {8,55},{2,23},{92,96}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {12,70},{43,93},{97,23}});
        org.junit.Assert.assertEquals( (int) 163, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {73,33},{63,93},{34,-62},{31,64},{71,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {22,-37},{63,26},{34,56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {33,92},{9,41},{2,57},{90,63}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {25,-67},{87,-96},{79,12},{99,-58},{46,-79},{6,-82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {3,61},{28,76},{50,7}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-78,-83},{23,69},{-93,32},{80,80},{94,85},{73,13},{-65,56},{0,23},{-46,-56},{60,99},{-32,-55},{25,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {86,51},{54,46},{11,28},{31,35}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {99,12},{38,3},{52,34},{73,17},{89,13},{15,97},{55,18},{70,17},{25,39},{24,31},{30,52},{52,25},{67,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {0,11},{69,63},{45,72}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {20,2},{6,-34},{8,95},{17,97},{90,20}});
        org.junit.Assert.assertEquals( (int) 194, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {64,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {32,13},{57,84},{81,62},{24,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {45,12},{27,42},{31,-37},{63,-47},{80,63},{66,9},{51,33},{64,-28},{50,90}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {97,65},{8,86},{89,50}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {5,89},{22,59}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {85,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {19,90},{51,5},{63,61},{25,64},{53,-59}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {1,72},{60,0},{29,29},{30,41},{33,20},{96,9}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {67,40},{38,1},{56,6}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {28,-22},{86,-62},{55,51},{39,74},{9,-50},{-13,65},{62,31},{30,15},{-80,-34},{-53,26},{-30,65},{-10,-48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {9,37},{82,29},{29,-38}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {11,-52},{4,99},{79,70},{65,72},{65,-66},{20,11},{54,27},{37,-93}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {89,-25},{48,-23},{92,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {79,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {2,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {60,93},{63,32},{19,-81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {89,59}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {71,48},{59,90},{64,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {34,-94},{20,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {78,49},{25,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {29,-67},{58,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {89,53},{54,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {54,69},{3,32},{8,9}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-27,55},{49,-21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {19,67},{41,-53},{37,89},{73,7},{33,97}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {80,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {11,-30},{49,47},{60,85},{50,-10},{4,59},{66,4}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {95,66},{8,14},{68,25},{16,80}});
        org.junit.Assert.assertEquals( (int) 119, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {28,-33},{88,61},{4,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {11,67},{94,64}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {31,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {27,-54},{88,16},{4,-97},{77,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {67,77},{6,27},{16,57}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {44,60},{77,74},{37,-91},{45,34},{82,32},{13,6},{97,92},{26,8},{93,-33},{67,-85},{8,35},{60,85},{73,5},{90,-96},{77,-75}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {6,26},{22,22},{21,-47},{91,82}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {45,-93},{58,44},{47,26},{68,66},{96,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {65,55},{97,37},{13,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {30,89},{83,-77},{-98,99},{23,45},{66,74},{-17,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {90,24},{41,50},{38,49},{95,39},{6,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {78,28},{95,23},{20,39},{70,60},{27,88},{41,94},{66,-26},{22,7},{32,83},{-72,28},{56,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {66,12},{15,30},{84,79},{45,71},{98,26},{72,-79},{37,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {58,36},{30,-57},{71,11},{98,65},{28,49},{81,22},{27,9},{84,87},{13,29}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {57,86},{68,-6},{65,4}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {59,67},{86,17},{29,-48},{47,99},{89,37},{85,47},{96,69},{71,52},{54,6},{58,-13},{17,61}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {81,55},{47,36},{96,25},{17,-3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {14,85},{36,-16},{54,7},{27,43},{35,67}});
        org.junit.Assert.assertEquals( (int) 152, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {59,-69},{19,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {79,87},{66,41},{16,8},{77,29},{6,92},{54,-49},{62,31},{67,-65}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {85,-61},{40,-8},{28,8},{92,71},{31,41},{28,-69},{13,-86}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {4,73},{17,0},{60,89}});
        org.junit.Assert.assertEquals( (int) 162, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {49,-36},{8,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {12,62},{66,60},{95,-64},{50,92},{70,-16}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {36,-32},{2,-67},{91,85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {35,45},{57,47},{47,30},{25,95}});
        org.junit.Assert.assertEquals( (int) 140, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {46,55},{89,-98}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {33,10},{14,89},{40,44},{43,5},{83,69},{69,56},{30,65},{51,75},{53,34},{75,85},{84,73},{80,19},{83,-8},{32,-13},{25,-48},{96,-6},{27,21},{88,67},{57,5}});
        org.junit.Assert.assertEquals( (int) 154, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {12,47},{22,19},{49,-5},{87,72},{0,33},{88,49},{85,-37},{24,23},{16,89},{13,28},{26,12},{20,46},{8,16},{7,63},{57,87}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {57,63},{98,59},{17,94},{6,42},{58,80},{68,31},{36,60},{26,22},{96,-14},{10,50}});
        org.junit.Assert.assertEquals( (int) 186, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {41,63},{1,-41},{21,74},{41,46},{80,91},{41,-17}});
        org.junit.Assert.assertEquals( (int) 137, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {27,-63},{77,18},{86,27},{87,39},{35,75},{91,98},{39,56},{91,10},{45,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {73,8}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {62,80},{5,-66},{65,1},{89,30},{74,91},{59,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {37,35},{5,84},{97,40}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {0,-82},{49,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {45,-95},{60,-65},{59,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {90,6},{24,95},{79,44},{8,86},{54,41}});
        org.junit.Assert.assertEquals( (int) 222, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {93,-90},{59,-11},{38,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {91,2},{68,-21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {39,4},{84,-64},{5,27},{28,81},{89,-89}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {97,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {27,10},{64,0},{78,-72},{9,-82},{32,28},{91,23},{12,-58}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {54,52},{94,13}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {56,52},{31,-32}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {78,-90},{82,-50},{48,14},{25,12},{79,93},{13,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {10,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {14,39},{14,51},{88,4}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {76,29},{99,38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {49,47},{55,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {42,1},{72,55},{6,-23},{69,46},{52,25},{99,0},{28,87},{97,25},{38,-3},{41,31},{23,71},{81,1}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {25,8},{88,62},{81,88},{20,36},{69,17}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {52,-46},{67,7},{18,81},{11,87},{32,-13},{-40,28},{7,33},{42,38},{80,92},{45,-15},{0,31},{54,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {29,62},{62,16},{24,-73},{65,98},{60,44},{35,84},{76,14},{71,50},{0,22},{84,77},{58,66},{44,-59},{-75,-91},{96,-73},{-88,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {70,80},{38,-3},{36,30},{1,-10},{22,53},{54,-75},{99,80},{45,27}});
        org.junit.Assert.assertEquals( (int) 53, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {51,67},{33,79}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {6,-20},{37,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {57,-2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {0,-28},{45,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {58,57},{1,56},{43,14},{11,27}});
        org.junit.Assert.assertEquals( (int) 140, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {74,-13},{47,-22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {84,49},{94,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {75,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {11,-97},{75,-47},{9,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {46,66},{82,91},{25,41}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {25,14},{75,22},{12,95},{33,38}});
        org.junit.Assert.assertEquals( (int) 109, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {25,97},{26,80},{89,12},{18,79},{32,93},{2,28},{42,91},{7,-43},{26,-38},{76,16},{50,61}});
        org.junit.Assert.assertEquals( (int) 297, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {39,47},{19,-46},{59,4},{4,83},{58,-47},{8,97},{27,-6},{91,33}});
        org.junit.Assert.assertEquals( (int) 180, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {47,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {24,33},{7,35},{70,89}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {55,6},{15,-47},{76,82},{80,4},{72,28},{12,38},{79,36}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {26,99},{17,8},{39,2},{63,-48},{45,75},{24,74},{81,76},{14,52},{64,44},{54,47},{39,65},{59,46},{85,46}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {71,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {93,0},{13,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {77,-10},{78,2},{36,9},{88,33},{24,46}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {88,53},{92,13},{16,60},{90,-48},{9,60},{78,18}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {65,8},{9,71},{87,89}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {57,70},{58,-20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {89,66},{68,15},{3,22},{5,10},{87,39},{83,76},{11,86},{62,66},{50,-43},{37,67}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {83,59},{92,20},{74,45},{53,-33},{77,34},{51,77},{16,3},{99,96},{29,-57}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {79,30},{19,27},{54,35},{35,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {82,-23},{36,37},{76,96},{4,95},{66,62}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {6,41},{32,73},{42,64},{2,96},{38,40},{41,55},{46,41},{16,41},{50,-8},{19,60},{76,56},{11,28},{8,60},{7,70},{16,30},{16,53},{40,-16},{84,19},{94,31}});
        org.junit.Assert.assertEquals( (int) 421, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {16,-68},{76,-28},{40,-38},{99,77},{44,41},{85,19},{88,0},{33,7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {17,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {36,16},{73,71},{73,-78}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {42,86},{37,62}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {61,76},{62,33},{63,61},{65,-87},{49,84},{72,79},{12,67},{14,-21},{66,99},{10,84},{86,83},{75,-82},{29,-44},{30,85},{46,-8}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {58,83}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {46,81},{97,39},{27,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {59,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {11,-62},{87,68},{49,-9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {61,4},{83,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {14,29},{96,-46},{10,43},{56,35},{0,-64}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {97,-7}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {75,44}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {64,15},{34,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {98,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {18,14},{29,72},{54,73},{73,68}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {27,-54},{56,-93},{34,63},{61,67},{94,51},{54,50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {98,34},{49,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {33,91},{87,17},{76,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {9,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {15,5},{86,50},{87,38},{50,84}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {27,63},{66,-48},{15,35},{0,2},{11,13},{85,16}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {97,78},{21,-40},{22,58},{22,-86},{14,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {88,85},{72,7},{0,44},{12,-4}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-68,-23},{90,82},{-9,30},{-58,25},{57,44},{94,86},{19,76},{27,89},{10,59},{93,-49},{26,37},{30,88},{-48,34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {56,-14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {65,91},{70,-36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {79,11},{28,62},{82,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {59,92},{55,-15},{2,26},{45,16},{10,-47},{92,84},{74,14}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {85,43},{92,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {50,62},{94,-34},{97,42},{89,-95},{81,44},{97,22},{93,5}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {37,51},{36,-94},{25,44},{15,44},{6,28},{0,-32},{90,96},{61,-97}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {1,-9},{78,37},{72,25},{86,71},{60,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {57,13},{3,26}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {82,64},{71,-78},{21,17},{13,-89},{8,28},{96,26},{15,-30},{60,-11},{77,83},{38,45}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {80,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {84,45},{78,55},{22,73},{36,61},{62,32},{35,54},{12,92},{8,78},{4,-89},{96,-60},{12,62}});
        org.junit.Assert.assertEquals( (int) 305, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {77,3},{88,51},{44,75},{9,42},{71,66},{27,85},{28,29},{99,-60},{96,32},{97,33},{5,41}});
        org.junit.Assert.assertEquals( (int) 197, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {55,5},{41,-29}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {79,78},{30,5},{65,87},{46,85},{65,-6},{64,82}});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {23,-44},{36,55},{60,0},{33,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {39,12},{11,93},{16,67},{91,38},{47,49}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-88,39},{-23,17},{26,-83},{-85,24},{-56,89},{-11,30},{46,23},{-73,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {48,10},{92,21},{91,78},{6,78},{22,79},{5,-65},{70,13},{0,39}});
        org.junit.Assert.assertEquals( (int) 196, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {71,-26},{20,41}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {72,30},{6,81}});
        org.junit.Assert.assertEquals( (int) 111, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {16,27},{51,53},{74,68},{12,58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {91,52},{24,63},{44,95},{14,-21}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {15,96},{74,17}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {1,-79},{17,68},{96,96},{59,34},{27,70}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {61,80},{28,41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {27,80},{26,95},{45,72}});
        org.junit.Assert.assertEquals( (int) 175, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {71,57},{66,54},{25,-36},{13,31},{20,96},{17,54},{58,42},{75,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {99,1},{85,64},{60,39},{64,3},{80,-67},{14,44},{2,84},{55,-3},{48,68},{49,-48},{32,-55},{18,-97},{89,41},{61,-28}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {44,14},{6,-42},{73,31},{47,79},{5,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {33,27},{2,94}});
        org.junit.Assert.assertEquals( (int) 121, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {47,80},{37,-37},{79,29},{68,36},{89,82},{46,61},{65,-83},{31,70},{18,-55},{74,94}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {75,75},{93,70},{94,-75},{75,5},{1,-74},{40,5},{13,47},{85,56},{97,30}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {72,35},{6,84},{55,85},{61,45}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {16,6},{50,74}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {73,42},{43,72},{20,4},{41,-95},{90,62}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {82,-22},{64,10},{41,91},{79,-14},{66,69},{1,5}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {31,67},{4,27},{68,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {51,-46},{65,-56},{46,19}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {30,40},{17,49},{17,41},{31,54},{32,41},{49,2},{0,7},{0,22},{25,5},{3,57},{43,33},{12,-84},{32,18},{46,11}});
        org.junit.Assert.assertEquals( (int) 230, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {8,45},{9,76},{95,78},{67,41},{91,59},{45,55},{40,18},{46,82},{64,21},{5,63},{15,11},{44,72},{28,89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {54,44},{38,61},{14,14},{33,68},{69,77},{35,-32},{19,23}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {17,40},{21,57},{5,18},{49,20},{47,-43},{26,3},{42,-91},{42,55},{90,47},{63,94},{66,97},{14,-35},{95,49},{90,45},{77,63},{24,-13}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {21,39},{87,95},{18,84},{29,-62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {99,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {34,18},{87,63},{22,3},{95,5},{72,79},{18,69},{29,94},{53,0},{75,19},{99,56},{23,27},{18,75}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {20,2},{76,29}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-96,53},{-75,98},{0,52},{81,-35},{32,87},{34,55},{-77,3},{61,84},{43,93},{26,4},{83,61},{53,47},{19,37},{60,90},{4,52},{64,-56},{89,78},{32,-65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {9,81},{70,64}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {46,90},{85,8},{25,6}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {33,14},{1,98},{37,8},{27,25},{34,-58},{40,80},{8,-77}});
        org.junit.Assert.assertEquals( (int) 178, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {82,-38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {64,-58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {59,9}});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {82,-41},{38,-40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {23,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {73,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {24,51},{19,45},{48,-11},{36,70},{2,75},{97,42},{1,-29},{16,-35},{39,-33},{87,-89},{0,-4},{68,4},{40,-70},{54,7},{94,6},{11,7},{81,70}});
        org.junit.Assert.assertEquals( (int) 196, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {74,-27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {12,41},{82,4},{54,22},{75,4}});
        org.junit.Assert.assertEquals( (int) 41, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {89,86},{84,-8},{2,48},{12,36},{70,93},{26,56},{21,-93},{5,7},{34,39}});
        org.junit.Assert.assertEquals( (int) 111, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {59,90},{76,31},{63,62},{95,16},{26,-59},{35,-63},{42,31},{3,1},{14,69},{50,51},{43,11},{38,9}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {74,-95},{21,54},{92,-74},{13,-5},{55,-29},{68,59},{34,3},{8,28},{20,94},{30,12},{88,86}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {19,32},{13,-85},{45,60},{93,16},{98,70},{44,0},{95,39}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {12,81},{10,62},{66,90},{5,99}});
        org.junit.Assert.assertEquals( (int) 242, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {27,42},{11,90}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {30,-40},{53,-98},{39,37},{14,36}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {46,13},{80,-13},{41,47},{5,-13},{60,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {68,0},{42,22},{37,61},{97,-17},{20,71}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {4,36},{55,5}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {26,61},{56,58},{80,3},{56,50},{90,38},{18,48},{74,2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {73,47},{21,76},{12,-8}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {19,81},{73,12},{83,-49},{77,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {40,31},{20,75},{92,-65},{25,26},{79,15},{25,24},{10,19}});
        org.junit.Assert.assertEquals( (int) 125, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {20,-87},{31,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {41,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {62,55},{97,22},{99,48},{82,40},{92,41},{80,3},{33,0}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {17,44}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {89,28},{93,43},{64,-36},{41,74},{52,-30},{38,80},{15,35},{56,65},{22,73},{83,84},{68,41}});
        org.junit.Assert.assertEquals( (int) 188, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {18,52},{22,46},{28,88},{40,50},{27,81},{41,71},{95,10},{84,40},{11,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {51,32},{59,92},{23,-90}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {65,11},{29,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {12,32},{60,91},{21,40},{70,-12}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {37,40},{38,64},{35,25},{25,10},{68,10},{86,17},{34,21},{59,90},{88,96},{78,51},{18,89},{52,97},{53,40},{92,49}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {68,31},{41,22},{90,63},{12,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {98,7},{50,18},{87,-17},{38,18},{64,90},{16,-85},{80,13},{56,91},{54,-4},{3,61}});
        org.junit.Assert.assertEquals( (int) 152, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {32,44},{94,10},{38,65},{96,44}});
        org.junit.Assert.assertEquals( (int) 109, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {65,85},{32,42},{62,19},{72,61},{3,4},{9,75},{75,69},{78,1},{2,19}});
        org.junit.Assert.assertEquals( (int) 140, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {54,16},{51,-35},{26,-30},{60,-50}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {41,-85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {60,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {99,-91},{17,80},{61,8}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {16,99},{85,50},{34,64}});
        org.junit.Assert.assertEquals( (int) 163, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {60,67},{65,57},{23,69},{64,15},{42,68},{7,-12},{12,41},{65,19}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {42,13},{9,-82},{25,96},{75,-77}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {62,73}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {75,33},{78,71},{11,80},{72,37},{10,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {46,79},{86,97},{38,28},{78,64},{61,64},{69,52},{32,10},{32,84},{12,5},{82,1},{47,72},{40,69},{78,-31},{38,-21},{95,86},{17,96},{11,90}});
        org.junit.Assert.assertEquals( (int) 275, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {94,99},{38,34},{97,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {5,-77},{1,64},{79,26},{64,11},{47,-37},{12,13}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {30,8},{95,13},{9,-16}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {37,19},{36,6},{29,4},{86,-68},{71,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{ {79,32},{99,53}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {57,7},{46,49},{24,4},{52,66}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {42,84},{69,15},{98,75},{90,48},{81,95},{89,-54},{77,88},{46,-47},{12,5},{17,55}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {86,-58},{43,34}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {57,8}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {2,13},{83,59}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {92,72},{1,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {9,29},{26,-18}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {27,52},{52,28},{29,-24},{28,14},{8,66}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {45,26},{73,71},{2,39},{34,66},{0,60},{9,6}});
        org.junit.Assert.assertEquals( (int) 197, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {98,52},{12,42}});
        org.junit.Assert.assertEquals( (int) 42, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {94,7},{58,-16},{29,-13},{30,73},{12,80},{31,-12}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {76,51},{84,98},{81,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {79,76},{79,88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {89,14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {86,-54},{48,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {56,50},{25,80},{18,98},{28,46},{18,31}});
        org.junit.Assert.assertEquals( (int) 178, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {75,39},{85,39},{49,-94},{96,95},{18,-34}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {93,48},{2,89},{41,35},{54,35}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {28,8}});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {94,-39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {80,-66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {2,1},{87,34}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {54,67},{22,86},{27,78},{20,-78},{35,0},{44,-41},{32,88},{12,-75},{88,81},{86,51},{27,48},{90,14},{97,48},{7,77},{52,66},{23,48}});
        org.junit.Assert.assertEquals( (int) 329, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {96,99},{85,50},{60,22}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {88,0},{3,35},{69,-58},{50,57},{43,-86},{74,41},{96,6},{53,92},{51,-26},{73,73},{74,-19},{94,-57},{14,4},{12,65}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {89,10}});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {61,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {7,-20},{69,9},{36,97},{65,89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {55,91},{3,-5},{54,31},{73,11},{58,79},{91,61},{24,61},{0,-74}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {84,-89},{4,-76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {30,95},{88,94},{32,28},{7,77},{85,70},{63,-63}});
        org.junit.Assert.assertEquals( (int) 172, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {34,93},{70,28},{36,-61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-34,14},{77,30},{20,43},{18,-82},{16,14},{82,-99},{4,98},{47,-13},{88,26},{36,72},{13,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {87,-61},{72,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {28,36},{68,22}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {27,-19},{24,9},{31,88},{15,76},{57,84},{24,2},{38,4}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {81,5},{64,37},{17,60},{60,55},{75,10}});
        org.junit.Assert.assertEquals( (int) 115, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {90,-45},{47,69},{16,0},{9,38},{17,13},{20,-63}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {51,91},{58,21},{12,58},{16,8},{35,15},{40,0},{77,-48}});
        org.junit.Assert.assertEquals( (int) 149, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {30,93},{85,-32},{4,73},{65,24},{49,78},{68,71},{92,82}});
        org.junit.Assert.assertEquals( (int) 166, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {53,-29},{64,73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {10,32},{86,77}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {90,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {56,84},{36,83}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {89,44},{61,65},{30,-70},{65,52},{21,83},{32,85},{81,46},{99,60},{25,-24},{13,56}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {98,2},{60,94},{5,-35},{81,28}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {35,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {69,-97},{49,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {79,-8},{59,-33},{81,47},{87,18},{5,84},{87,50},{82,6},{95,39}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {66,81},{36,54}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {56,71},{80,5},{0,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {78,-72},{28,66},{27,84},{7,52},{72,69},{2,41},{13,23}});
        org.junit.Assert.assertEquals( (int) 266, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {74,84},{41,45},{35,16},{59,67},{62,37},{35,34},{67,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {76,92},{76,32},{99,78}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {4,43},{74,2},{5,74},{24,-35},{41,67},{20,-66},{11,31},{38,7},{73,27},{54,79},{28,5},{56,-7},{97,68},{20,-11},{14,20},{53,96},{65,17},{74,37}});
        org.junit.Assert.assertEquals( (int) 264, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {10,-28},{28,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {38,35},{-46,-86},{6,75},{68,-78},{-30,70},{64,17},{-73,98},{61,89},{-8,11},{64,-10},{2,33},{94,3},{17,48},{7,-21},{63,79},{57,9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {94,62},{84,76},{68,7},{98,13},{90,52},{86,55},{27,42},{42,8},{67,7},{89,45},{73,37},{47,53},{83,70},{35,46},{43,23}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {48,21},{78,-75},{74,88},{42,93},{71,39},{8,-96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {66,-86},{18,-21},{8,57},{79,49},{78,26}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {52,25},{70,32},{45,44},{35,53},{4,-9},{26,34},{88,75},{4,73},{17,24},{63,94},{94,60},{6,58},{5,93},{40,40},{82,76}});
        org.junit.Assert.assertEquals( (int) 224, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {34,57},{41,34},{77,75},{0,-23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {42,70},{30,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {12,23}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {7,54},{56,84},{83,64},{66,6},{33,92}});
        org.junit.Assert.assertEquals( (int) 146, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {93,78},{31,14},{49,16}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {35,76},{80,51},{54,13},{10,22}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {57,59},{1,73},{12,-58},{87,82},{49,33},{27,28},{85,60},{84,15},{1,69}});
        org.junit.Assert.assertEquals( (int) 201, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {63,81},{20,70}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {35,35},{-4,15},{18,80},{33,97},{14,89},{-55,-3},{-69,99},{68,-3},{94,2},{34,-48},{18,-47},{27,69},{70,48},{78,-79},{28,8},{78,94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {18,4},{29,12},{94,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {97,94},{75,76}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {69,85},{10,29},{61,42},{94,15},{71,-62},{89,-34},{89,-40}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {60,-36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {30,77},{86,37},{56,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {29,-92},{60,15},{57,55},{64,0},{3,52},{69,14},{6,1},{21,53}});
        org.junit.Assert.assertEquals( (int) 106, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {4,66},{12,55},{10,13},{43,25},{64,93}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {3,19},{80,24}});
        org.junit.Assert.assertEquals( (int) 19, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {56,-65}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {4,25},{95,99},{47,21},{82,9}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {49,-24},{88,4},{55,59}});
        org.junit.Assert.assertEquals( (int) 59, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {44,92},{59,-74},{97,86},{17,86},{21,89},{33,14},{82,36},{26,-89},{52,40},{65,42}});
        org.junit.Assert.assertEquals( (int) 175, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {76,25},{24,83},{13,63},{78,98},{26,70},{81,54},{5,90},{27,77},{33,73},{37,-4},{30,91},{27,21},{77,37},{76,83},{99,54},{38,23},{45,82}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {15,19},{46,52},{71,42},{45,-23},{3,79}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {94,36},{33,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {57,55},{20,99},{25,10},{43,-49}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {64,32},{97,46},{71,66},{2,40},{38,48},{59,45},{66,72},{25,88},{76,-32},{23,36},{38,49}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {5,4},{96,16},{63,81},{90,16},{96,63},{-40,72},{9,-59},{74,3},{-70,7},{-19,23},{-69,-33},{-2,42},{40,-54},{49,64}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {82,15},{88,36}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {58,82},{89,-22},{3,57},{14,70},{-98,2},{76,51},{66,77},{20,-95},{40,-74},{19,65},{17,42},{-57,40},{8,43},{67,89},{-72,-20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {63,4},{60,87},{49,48},{50,24},{86,63},{29,35},{42,-21}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {23,87},{25,96}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {44,-91},{0,-21},{43,29}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {0,-98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {71,97},{4,64}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {31,-73},{12,91},{82,2}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {7,42},{36,6},{19,18}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {83,92},{19,-14},{84,52},{19,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {69,-95},{66,21},{38,24},{25,85},{89,76},{36,35},{41,57}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-35,92},{-41,2},{0,90},{89,62},{47,-85},{80,86},{69,77},{-11,61},{2,24},{48,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {34,-6},{93,-88},{85,27},{11,-3},{18,-2}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {51,29},{37,-39},{76,33},{83,-58},{9,57},{13,92},{66,23},{6,84},{99,2},{90,13},{21,41},{73,10},{27,9},{8,6},{24,71},{94,71}});
        org.junit.Assert.assertEquals( (int) 176, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {63,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {31,56},{72,32},{72,92},{96,26},{63,74},{70,99},{95,58},{76,-63},{85,-75},{66,56},{79,-95}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {4,33},{44,29},{49,98},{30,63},{46,-28},{79,48}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {2,55},{-88,37},{51,43},{97,16},{96,83},{39,-59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {65,31},{54,16},{44,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {93,69},{5,18},{49,10},{51,79},{84,97},{98,30},{60,5},{54,65},{71,70},{59,94}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {8,95},{18,-83},{73,70},{30,1}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {83,21},{33,-81},{35,67},{28,-9},{42,78},{17,10},{85,-66},{59,98},{76,31},{22,95},{5,91},{2,26},{63,90},{10,-1}});
        org.junit.Assert.assertEquals( (int) 290, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {12,36},{82,85}});
        org.junit.Assert.assertEquals( (int) 36, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {36,-55},{85,80},{96,34},{96,63},{43,-64},{51,87}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {92,13},{91,-97},{33,76},{83,32},{25,51},{27,-1},{4,80}});
        org.junit.Assert.assertEquals( (int) 156, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {1,79},{60,95},{84,-55},{39,-40},{23,91},{13,1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {94,31},{93,-3},{71,66},{17,63}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {35,-31},{64,65},{84,9},{93,79},{79,-23},{0,81},{0,85},{57,83},{62,65},{98,48}});
        org.junit.Assert.assertEquals( (int) 166, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {16,22},{12,64},{66,44},{97,7},{92,55},{59,51},{61,70},{77,10},{87,5}});
        org.junit.Assert.assertEquals( (int) 134, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {56,-35},{27,6}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {44,18},{44,39},{45,60},{14,29},{45,33},{76,45},{93,13},{9,55},{35,43},{41,-96},{84,28}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {64,53},{25,49},{52,59},{19,24},{4,75},{70,-84}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{ {27,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {88,95},{86,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {32,39},{80,97},{21,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {33,85},{4,70},{7,60},{23,81},{87,83},{29,99}});
        org.junit.Assert.assertEquals( (int) 314, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {98,-48},{34,-55},{43,33}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {38,21},{60,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {32,32},{59,99}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {71,-98},{34,39},{34,-96}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{ {89,7},{69,46},{23,20},{27,98},{92,42}});
        org.junit.Assert.assertEquals( (int) 144, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {7,62},{61,80}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {35,78},{58,-99},{25,50},{13,74},{44,62},{42,34},{66,1},{80,-32},{33,39},{7,45},{45,81},{13,-18},{28,41},{60,25}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {5,45}});
        org.junit.Assert.assertEquals( (int) 45, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {67,40}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {52,3},{52,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {66,15},{61,-15},{64,27},{19,78},{30,62},{93,81},{40,-66},{80,19},{33,39},{84,-58},{27,30},{90,8},{87,-44},{58,59}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {79,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {39,88},{72,63},{57,-18},{70,81},{23,12},{8,-14},{44,-13},{11,7},{92,7}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {41,61},{89,1},{79,18},{83,63},{75,82},{67,66},{82,33},{44,88},{35,11}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {81,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {17,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {48,-76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {95,64},{73,42},{16,98},{78,-89},{25,60},{81,-32}});
        org.junit.Assert.assertEquals( (int) 158, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {3,-25},{2,51},{4,-80},{20,6},{45,15},{4,-33},{31,-28},{59,89},{88,96},{75,89},{39,38}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {22,99},{47,55}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {24,22},{54,0},{0,50},{27,70},{77,44},{24,35},{57,49},{87,18},{56,-55},{56,41},{72,-54}});
        org.junit.Assert.assertEquals( (int) 155, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {51,5},{48,-89},{34,14},{79,-88},{43,58},{83,25},{61,-49},{44,6},{41,-1},{72,40},{48,9},{64,15},{27,94},{49,6}});
        org.junit.Assert.assertEquals( (int) 152, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {25,9},{23,81},{75,86},{33,-34},{51,-99},{48,25},{86,76},{2,3},{78,83},{78,89},{55,29},{76,98},{57,95},{27,40},{19,66}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {69,68},{73,30}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {73,69},{10,36}});
        org.junit.Assert.assertEquals( (int) 105, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {11,-90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {40,64}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {24,61},{56,99},{72,-31},{58,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {17,11}});
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {21,-17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {78,52},{-22,-45},{26,14},{52,65},{-99,51},{6,74},{89,81},{-56,76},{-1,96},{11,47},{1,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {40,64},{68,59},{62,82},{63,-68},{73,42},{3,-84},{83,-11},{66,61}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {65,52},{79,55},{44,48},{54,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {62,65}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {67,2},{64,22},{44,59}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {82,40},{85,39},{8,-38}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {75,77},{52,92},{16,44},{19,4},{67,19},{24,25},{61,4},{79,69},{23,-38},{62,33}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {85,61}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {84,7},{86,-14},{10,-75},{74,-66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {15,13},{90,75},{3,61},{25,56},{83,76},{36,19},{60,47},{75,66},{25,94},{85,88},{85,87},{77,-52},{18,56},{76,17}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {28,13}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {99,12},{41,-16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {55,85}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {29,-14},{49,85},{49,29},{58,20}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {11,17},{97,59},{38,-52},{24,48},{61,93},{25,11},{27,-13}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {41,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {55,79},{76,54}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {29,97}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {91,69},{0,87},{39,41}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {2,54},{38,1},{73,4},{75,30},{81,-5},{5,17},{47,42},{55,49},{77,-23},{5,68},{35,96},{12,-44}});
        org.junit.Assert.assertEquals( (int) 235, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {10,7},{8,99},{44,38},{99,49}});
        org.junit.Assert.assertEquals( (int) 106, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {89,69},{25,2},{72,-24},{71,80},{71,-43},{92,-29}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {69,78},{1,-56}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {25,69},{83,-34},{82,-11}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {71,91},{43,53},{56,6},{16,75},{82,56},{85,42},{90,34},{10,-28},{66,44}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {58,-73},{98,77},{1,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {79,23},{8,1},{15,-56},{84,40},{43,72},{90,80},{17,-79},{52,61}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {48,1},{14,71},{6,-80},{39,27},{68,-8}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {10,53},{51,-68},{17,27},{5,55},{68,13}});
        org.junit.Assert.assertEquals( (int) 108, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {70,13},{60,74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {52,-10},{7,40},{39,64}});
        org.junit.Assert.assertEquals( (int) 104, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {35,24},{64,-42},{96,49}});
        org.junit.Assert.assertEquals( (int) 24, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {4,95},{68,67},{42,-45},{84,68},{42,89},{25,17},{45,-43},{23,79},{96,98},{58,11},{14,91}});
        org.junit.Assert.assertEquals( (int) 186, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {62,38},{98,24},{82,40},{32,67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {96,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {41,86},{18,-57},{48,16},{52,40},{6,74}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {81,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-47,9},{62,69},{89,94},{40,42},{99,78},{53,68},{83,-85}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {12,34},{70,-12},{92,22},{64,77},{81,30},{27,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {93,4},{0,92},{32,5},{42,40}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {8,21},{83,-27},{16,97}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {54,98}});
        org.junit.Assert.assertEquals( (int) 98, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {89,55},{10,47},{88,-18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {44,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {91,16},{69,49},{47,5},{42,19},{99,85},{83,55}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {60,-25},{75,0},{61,-5},{52,6}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {82,41},{7,-68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {58,35},{28,82},{84,-57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {28,-68},{95,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {39,-74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {93,95},{62,84},{87,46},{42,76},{89,22},{2,41},{99,61},{74,98},{79,94},{74,-92},{47,50},{58,78},{90,27},{94,16}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {70,-5},{53,-75},{81,-3},{-90,-4},{44,-33},{-56,82},{50,57},{25,77},{-17,93},{-15,91},{63,13},{78,0},{55,36},{10,45},{61,80},{26,25},{-92,-13},{-78,67}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {13,95},{23,14},{46,-33},{17,26},{18,-88},{24,83},{10,79},{55,53},{97,25}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {8,-34},{44,92},{18,9},{74,1},{24,85}});
        org.junit.Assert.assertEquals( (int) 85, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {49,1}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {11,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {2,87},{81,80}});
        org.junit.Assert.assertEquals( (int) 167, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {39,57},{30,12},{49,87},{84,80},{25,85},{27,99},{37,16}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {96,50},{48,4},{47,24},{87,75},{19,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {38,-25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {17,6},{54,-12},{41,82},{-36,68},{70,-70},{79,82},{59,19},{50,3},{6,57},{71,-72},{26,13},{68,-17},{15,51},{32,39},{24,8},{37,11},{-82,-18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {8,10},{97,22},{2,14},{49,-35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {91,45},{88,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {78,-6},{-78,-44},{63,72},{53,86},{-29,19},{86,38},{-9,29}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {45,16},{83,3},{8,-87},{52,-8},{73,-33},{92,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {70,57},{12,-46},{97,30}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {96,24},{2,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {95,81},{95,2},{27,-74}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {0,30}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {76,4},{81,-68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {0,-99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {21,27},{74,-26},{78,15},{28,84},{90,2},{71,-44},{72,4},{94,19},{39,89},{24,90},{67,48},{96,47},{79,60},{91,45},{38,25},{52,85}});
        org.junit.Assert.assertEquals( (int) 263, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {36,71},{53,14}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {73,26}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {48,34},{53,-72},{96,-68}});
        org.junit.Assert.assertEquals( (int) 34, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {3,2},{69,-80}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {40,28},{91,63},{11,91},{56,47}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {88,71},{90,87},{39,-54},{41,-41},{64,11},{44,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {13,57},{10,79},{-13,10},{-80,68},{96,0},{92,64},{82,-93},{5,99},{78,56},{82,99},{-33,92}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {50,50},{76,6},{31,95},{57,-63},{59,77},{33,63},{49,-58},{39,60},{88,41},{20,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)94,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {90,20},{9,-88},{45,25},{65,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {52,50},{78,5},{80,55},{75,14},{73,-61},{77,50},{68,0},{24,5},{16,-96},{38,10},{82,-90},{66,2},{7,92},{97,19},{79,80}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {47,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {89,95},{45,72}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {46,-60},{43,71},{57,98},{35,6},{19,30}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {88,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {60,51},{25,-71},{9,-72},{19,95},{15,38},{3,83}});
        org.junit.Assert.assertEquals( (int) 216, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {56,88},{78,48},{0,-73},{33,16},{44,68}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {48,54},{66,7}});
        org.junit.Assert.assertEquals( (int) 54, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {53,83},{2,-85}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {68,-36},{73,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {51,18},{7,16},{78,-99},{-88,10},{75,-78},{70,33},{52,37},{80,44},{8,45},{10,59},{65,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {95,76},{54,17}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {46,-38},{62,39},{84,80},{55,40},{60,67},{39,27},{35,53}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {90,-29},{30,26},{83,87},{37,25},{80,68}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {90,85},{90,94},{14,47}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {64,96},{8,40},{35,64},{83,-44},{67,71},{95,54},{44,98}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {42,80},{97,54}});
        org.junit.Assert.assertEquals( (int) 80, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {94,33},{48,28},{48,14},{1,30},{34,36},{76,-65},{89,21},{72,72},{29,74}});
        org.junit.Assert.assertEquals( (int) 140, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {60,-27},{73,67},{78,33},{89,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {82,48},{81,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {15,20},{87,30},{65,28}});
        org.junit.Assert.assertEquals( (int) 28, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {80,31},{97,30},{35,70},{72,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {89,14},{82,87},{23,20},{57,10}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {77,-48},{56,80},{91,-94},{0,74},{26,-60},{95,-7},{82,74},{5,9},{42,77}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {11,3},{90,9},{30,24},{80,39}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {73,-45},{16,11},{5,65},{3,71}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {12,47},{66,5}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {89,-7},{4,-14},{67,-44},{54,7},{71,-15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {91,26}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {60,63},{34,53},{22,88},{59,4},{98,-9}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {86,-69},{28,21},{78,43},{71,86},{54,12},{79,93}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {7,-39},{52,-78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {92,35},{31,59},{62,31},{83,66},{81,24},{28,73}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {57,14},{41,70},{86,97},{61,9}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {1,18}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {85,21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {91,60},{47,-78},{24,42},{-47,76},{46,88},{-7,32},{13,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {27,93},{27,-70},{97,23},{53,8},{63,85},{20,43},{82,97}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {19,14},{53,72},{33,97}});
        org.junit.Assert.assertEquals( (int) 111, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {89,-23},{19,17},{31,26},{30,-73},{69,80},{13,86},{8,-80},{11,63},{-79,82},{88,28},{13,60},{73,70},{-96,37}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {69,49},{21,13},{48,74}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {49,69},{68,40},{63,-84}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {30,11},{65,93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {42,90},{43,-33},{64,57},{97,19},{2,-52},{20,60},{53,-57},{94,94}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {71,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {14,56}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {66,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {22,90},{7,72},{31,-18},{27,81},{18,99},{55,64},{15,63}});
        org.junit.Assert.assertEquals( (int) 342, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {9,-76},{17,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {39,47},{62,8},{84,52},{85,29},{23,-95},{68,9},{44,96},{68,75},{87,92},{63,86},{81,-85},{0,-19},{15,97}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {82,-78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {67,24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {57,71},{38,26},{52,-99},{82,41},{18,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {78,23},{77,15},{5,-54},{10,37},{71,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {87,62},{61,24},{63,16},{90,17},{84,-19},{69,76},{18,89},{15,33},{64,10},{48,47},{17,42},{38,-73},{53,13},{8,3}});
        org.junit.Assert.assertEquals( (int) 181, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)26,new int[][]{ {37,-76},{34,43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {37,94},{23,-60},{28,-41}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {70,38}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {21,29},{37,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {93,-24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {40,-46},{73,60}});
        org.junit.Assert.assertEquals( (int) 60, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {33,98},{29,44},{28,34},{5,29}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {17,32},{24,-28},{99,87},{45,67},{27,9},{10,62}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {50,85},{31,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {6,-22},{82,-4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {49,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {70,44},{62,50},{20,47},{84,27},{11,59},{94,23},{88,10},{-90,79},{29,10},{35,68},{27,-25},{-96,6},{-5,34},{62,67},{-14,-75},{33,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {31,40},{64,59},{5,76},{37,-17},{55,55},{10,3},{58,0},{71,75},{65,52}});
        org.junit.Assert.assertEquals( (int) 79, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {42,2},{20,27},{2,-91},{68,86},{44,-97},{85,72},{59,-69},{74,80},{31,8},{55,41},{94,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {47,45},{3,25},{15,77},{39,21},{99,-26},{61,15},{23,-80},{73,15},{0,74},{49,-19},{55,47},{5,47},{26,-52},{3,51},{3,-23},{14,45}});
        org.junit.Assert.assertEquals( (int) 274, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {77,-68},{60,43}});
        org.junit.Assert.assertEquals( (int) 43, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {32,-45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {30,74},{84,2}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {93,31},{72,68},{54,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {64,3},{85,73},{28,72},{11,-75},{86,58},{99,-37},{76,6},{34,51},{50,74},{86,-88},{92,-91},{13,-64},{20,-3},{13,13},{55,94},{9,55},{67,90}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {88,22},{28,90},{42,38},{18,55},{33,36},{22,44},{61,87},{10,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {90,24},{60,46},{9,-29},{36,17},{1,15},{65,-22}});
        org.junit.Assert.assertEquals( (int) 32, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {86,47}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {15,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {67,92}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {75,13},{19,61}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {33,46},{36,45},{55,92},{74,51},{51,15}});
        org.junit.Assert.assertEquals( (int) 138, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {14,-95},{10,76},{56,42},{61,72},{9,96},{42,-10},{68,38},{57,16},{96,-45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {3,-45},{92,21},{66,70},{-52,50},{26,98},{16,40},{13,18},{90,22},{2,33},{88,67},{21,19}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {30,25}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {35,39},{62,21},{58,22},{71,27},{73,-93},{70,36},{51,64},{49,-53},{2,50},{95,-17},{29,-1},{84,60},{31,49},{36,15}});
        org.junit.Assert.assertEquals( (int) 163, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {94,34},{84,48},{0,91},{80,39}});
        org.junit.Assert.assertEquals( (int) 91, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {58,33}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {62,81}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {30,50},{97,71}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{ {50,36},{24,8},{70,-21},{4,65},{16,29},{7,-57},{85,73},{90,-61}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {25,44},{81,17}});
        org.junit.Assert.assertEquals( (int) 44, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {63,73},{32,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {99,71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{ {89,76},{54,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {45,51},{51,44},{77,2},{32,1},{45,27},{65,4}});
        org.junit.Assert.assertEquals( (int) 51, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {86,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {70,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {77,23},{59,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {38,77},{58,94},{56,41},{65,23},{12,31},{21,74},{34,17},{19,-67},{7,86}});
        org.junit.Assert.assertEquals( (int) 194, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {74,48},{0,99},{27,31}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {0,-91},{17,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {5,68},{99,-91}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {93,77},{82,85},{61,64},{27,95}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {26,24},{6,29},{47,30},{0,19}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {13,25},{13,86}});
        org.junit.Assert.assertEquals( (int) 111, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {76,59},{47,48},{99,7},{8,-32},{50,5},{35,-63},{64,82},{68,-18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{ {4,-42}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {25,17},{1,65},{80,47}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {12,88},{78,82},{40,59},{80,-38},{96,80},{7,37},{2,-5}});
        org.junit.Assert.assertEquals( (int) 37, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {51,23},{59,78},{3,16}});
        org.junit.Assert.assertEquals( (int) 94, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {34,-66},{88,65},{93,92},{24,77},{-94,89},{-43,49},{97,88},{38,0},{15,-89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {10,30}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {55,-43},{28,31},{48,52},{78,78},{69,68},{98,17}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {78,-43}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {89,58},{98,50},{2,64},{58,55},{44,53}});
        org.junit.Assert.assertEquals( (int) 117, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {84,58},{62,87},{58,35},{45,-6},{13,14}});
        org.junit.Assert.assertEquals( (int) 101, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {23,33},{3,33},{62,40},{86,3},{79,5},{50,96}});
        org.junit.Assert.assertEquals( (int) 33, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {39,9},{62,58},{57,36},{14,53},{51,-62},{24,67},{74,80}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {79,-76},{48,33},{22,-84},{25,-11},{58,99},{99,11},{1,42},{29,23},{65,87},{9,50},{40,-23},{99,7}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {70,62},{15,26},{55,22}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {94,-9},{73,41},{4,73},{4,-94},{43,32},{17,11}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {95,-40},{19,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {35,46}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {21,40}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {40,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {48,58},{33,-43}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {23,-11},{88,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {44,1}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {73,66},{41,-61},{62,9},{30,-29},{69,85},{3,62},{80,72}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {78,35},{35,28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {35,87}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {84,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {29,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {89,-28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {15,21},{41,18},{6,13},{2,85},{69,84},{24,-24},{67,37},{20,11},{38,32},{28,59}});
        org.junit.Assert.assertEquals( (int) 210, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {23,53},{3,54}});
        org.junit.Assert.assertEquals( (int) 107, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {36,88}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {73,32},{66,63}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {39,27},{1,64},{14,24},{54,58},{34,77},{34,50}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {78,20}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {48,62},{82,8},{33,31},{52,27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {14,7},{25,43},{70,78},{34,95},{71,22}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {71,-14},{56,39}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{ {97,89},{52,64}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {39,-73},{98,-24}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {8,-91},{88,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {28,42},{34,26}});
        org.junit.Assert.assertEquals( (int) 68, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {3,20},{36,-44},{62,-96},{19,4},{33,56},{72,27},{12,33},{48,89},{61,49},{75,79},{53,81},{16,90},{48,45},{44,2},{5,7},{8,66},{18,25},{34,19},{36,77}});
        org.junit.Assert.assertEquals( (int) 318, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {99,73},{9,95},{71,44},{24,-36}});
        org.junit.Assert.assertEquals( (int) 95, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {78,91},{81,73},{97,86},{71,91},{24,-20},{37,20},{43,49},{57,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {46,58}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {90,78},{26,-87},{63,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {85,-28},{4,32},{30,89},{97,88},{36,-63},{34,54},{-94,40},{24,77}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {90,16},{-22,30},{6,98},{58,-74},{98,94},{43,57},{16,-75},{42,83},{37,-30},{31,-37},{88,-2},{68,35},{49,68},{79,43},{-32,3},{85,16},{-62,31},{1,69}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {82,50},{97,7},{71,18},{93,-62}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {31,6},{73,44},{5,72},{63,66},{2,-16},{59,20},{45,93},{75,78},{34,5},{74,13},{90,-54},{74,-11},{65,78},{84,-24}});
        org.junit.Assert.assertEquals( (int) 165, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {70,1},{47,89},{52,50}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {56,-70},{40,30},{31,-2},{67,51},{63,53},{48,67},{96,63},{48,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {85,14}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {11,-32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {96,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {15,-61},{77,14},{3,99},{5,20},{39,63},{35,55},{99,90},{51,56},{80,0},{0,-62},{46,1},{39,75},{31,74},{4,39},{37,-31},{59,66},{14,84},{22,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {86,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {40,-34},{57,80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {73,2},{93,-50},{2,62},{19,61},{70,87}});
        org.junit.Assert.assertEquals( (int) 123, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {70,87},{52,74},{38,97},{28,64},{56,93}});
        org.junit.Assert.assertEquals( (int) 161, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {99,2},{58,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {0,-20},{83,17},{37,27},{32,48},{53,33},{10,46},{96,25}});
        org.junit.Assert.assertEquals( (int) 121, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {91,71},{5,30},{28,66},{69,80},{76,4},{92,78},{64,61},{68,55}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {92,23},{39,14},{10,49}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {87,70},{3,18},{15,-18},{31,55},{69,-14},{71,83}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {28,81},{92,56}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {19,94},{18,53},{2,80},{77,96}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {78,-64},{65,42},{31,10},{74,9},{60,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {53,55},{65,92},{50,21},{70,38},{27,50},{10,93},{0,96},{94,68},{84,55},{27,99},{49,53}});
        org.junit.Assert.assertEquals( (int) 341, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {81,93},{74,58},{17,82},{45,77},{80,39},{95,89},{21,63},{8,24},{6,9},{24,-60},{15,44},{18,33},{70,34},{22,75},{57,39}});
        org.junit.Assert.assertEquals( (int) 225, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {76,24},{77,25}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {58,-40},{11,39},{29,61},{23,56},{71,20},{12,63}});
        org.junit.Assert.assertEquals( (int) 102, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {34,35},{59,-19},{61,23},{43,47},{29,64},{44,63},{29,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {45,-35},{65,32},{83,16},{84,8},{3,3},{65,10},{49,92},{92,83},{41,86},{1,94},{21,-10},{4,-56},{33,48},{65,96},{22,95},{26,75}});
        org.junit.Assert.assertEquals( (int) 284, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {49,38},{99,54},{5,-26},{25,22},{45,-10}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {60,6},{80,87}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {74,-85},{18,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {91,17},{30,93},{7,62},{17,26}});
        org.junit.Assert.assertEquals( (int) 181, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {14,71}});
        org.junit.Assert.assertEquals( (int) 71, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {77,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {31,10},{8,10},{91,-86},{3,78},{16,86},{90,20},{94,2}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {78,86},{85,32}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {31,35}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {32,-39},{87,63},{94,19},{0,99},{-59,15}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {66,12},{1,88},{39,8},{60,30}});
        org.junit.Assert.assertEquals( (int) 118, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {99,20},{47,86},{82,87},{93,13},{54,-94},{61,48},{36,67},{56,-1},{55,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)56,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {4,62},{58,-39},{20,97},{69,3},{97,94},{10,5},{57,24},{28,-2}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {51,86},{22,61},{68,20},{51,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {39,84},{29,86},{19,29},{73,48},{77,-18},{57,5},{-4,-20},{-88,45},{64,18},{22,88},{56,87},{-87,89},{4,70},{-60,22},{-83,93},{42,18},{57,-88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {42,61}});
        org.junit.Assert.assertEquals( (int) 61, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {34,94},{57,41},{26,0},{48,-77},{12,79}});
        org.junit.Assert.assertEquals( (int) 173, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {41,-90},{41,13},{34,72},{29,40},{22,4}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {69,28},{48,10},{98,-46},{79,83},{83,12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {41,-80},{97,17},{17,49},{48,9},{8,44},{57,28}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {97,-93},{21,69},{42,-75},{75,23},{12,-48}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {67,75},{50,33},{66,58},{35,24}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {59,47},{86,-86},{89,8},{16,-56},{9,-53},{46,43},{98,56},{58,7},{27,30}});
        org.junit.Assert.assertEquals( (int) 47, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {45,44},{-59,17},{60,86},{42,96},{33,66},{51,39},{67,-57},{44,9},{25,49},{8,43},{-80,-7},{51,42},{67,99},{41,12},{32,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {84,96},{76,26},{7,53},{43,15},{13,10},{70,79},{89,16},{37,54},{15,80},{17,15}});
        org.junit.Assert.assertEquals( (int) 202, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {96,39},{48,58},{80,-56},{97,80},{3,27},{68,40},{32,83},{69,44},{86,-54},{45,14},{8,69},{59,60},{36,-70}});
        org.junit.Assert.assertEquals( (int) 96, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)57,new int[][]{ {76,-22},{54,-1}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {61,65},{17,2},{28,91},{55,4},{32,-42},{12,85},{6,4},{87,25},{76,92},{78,3},{67,32},{98,87},{60,-6},{44,37},{74,5},{5,99},{52,16}});
        org.junit.Assert.assertEquals( (int) 281, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {46,55},{28,69}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {63,91}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {87,54},{80,-47},{31,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {73,50},{0,70},{83,22},{73,51},{0,14}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {86,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {48,55}});
        org.junit.Assert.assertEquals( (int) 55, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {71,82}});
        org.junit.Assert.assertEquals( (int) 82, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {87,32},{64,39},{88,-69},{66,8},{49,-94}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {45,85},{70,57},{9,79},{37,62},{8,-60},{77,94},{98,-24}});
        org.junit.Assert.assertEquals( (int) 164, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-56,5},{-78,77},{11,83},{48,84},{-51,29},{65,47},{1,60},{79,60}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)25,new int[][]{ {79,6},{64,-31},{39,-73}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)16,new int[][]{ {16,16},{19,52}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-24,40},{75,14},{56,53},{-90,14},{54,68},{80,1},{71,13},{-2,28},{97,83},{58,47},{43,76},{-72,-81},{86,67},{-55,74},{92,40},{-10,64},{5,79},{71,79},{75,-89}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)23,new int[][]{ {10,73},{2,90},{65,33},{83,82},{28,-18},{29,23},{50,36},{95,51},{84,-22}});
        org.junit.Assert.assertEquals( (int) 163, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {15,40},{63,52}});
        org.junit.Assert.assertEquals( (int) 40, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)61,new int[][]{ {86,17},{39,78},{26,42},{42,16},{43,93}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {97,43},{56,47},{70,57},{98,4},{21,-60}});
        org.junit.Assert.assertEquals( (int) 57, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)39,new int[][]{ {38,86},{3,-98}});
        org.junit.Assert.assertEquals( (int) 86, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {44,93},{0,27},{92,48},{78,32},{21,-99},{47,12},{69,65},{81,87},{25,3}});
        org.junit.Assert.assertEquals( (int) 120, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {64,53},{64,52},{7,39}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)11,new int[][]{ {69,48},{24,18},{1,2},{56,-80},{34,66}});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)22,new int[][]{ {40,-55},{38,33},{92,-53},{15,13},{41,15}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {42,85},{78,44},{55,38},{35,-37},{14,69},{72,32}});
        org.junit.Assert.assertEquals( (int) 69, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {33,6}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {25,77},{84,75}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {94,21},{86,45}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {91,-43},{20,9},{26,16}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)96,new int[][]{ {9,26},{10,44},{86,33},{59,-67},{14,79},{10,53},{30,30}});
        org.junit.Assert.assertEquals( (int) 232, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {15,50},{65,2}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)71,new int[][]{ {24,23},{95,34},{45,99},{15,-61},{39,95}});
        org.junit.Assert.assertEquals( (int) 122, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {66,23},{31,-20},{73,-44},{43,18},{80,70},{99,2},{4,71},{16,84}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {61,57},{44,72},{90,35},{52,22},{78,49},{-6,17},{-28,94},{80,-68},{-22,77},{-96,10},{61,25},{30,82},{62,83},{86,-19},{-83,-3},{45,71},{-33,-54},{30,92},{86,13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {13,1},{2,76},{41,41},{55,96}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)28,new int[][]{ {84,-37},{15,90}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {60,98},{26,31},{35,-68},{5,15},{38,39},{16,58},{40,15},{8,72},{60,-5},{83,97},{72,-24},{59,-93}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {63,-17},{26,86},{84,-53},{35,-12},{29,13},{21,-58},{73,37},{31,14},{52,37},{-83,10},{82,-3}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {53,95}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {42,46},{26,8},{38,64},{59,56}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {40,82},{77,-62},{56,33},{74,61},{86,26},{59,41},{11,95},{33,53},{80,-83},{57,46},{2,16},{15,81},{79,79},{48,55}});
        org.junit.Assert.assertEquals( (int) 274, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {98,-88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {40,80},{27,-12}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {19,47},{8,15},{81,47}});
        org.junit.Assert.assertEquals( (int) 62, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {23,88},{5,56},{12,64},{22,-81},{44,11},{21,9},{50,32},{10,97},{67,78}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)18,new int[][]{ {16,14},{49,84},{84,8}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{ {87,89},{41,70},{97,51},{4,41},{63,47},{53,-73},{62,-95},{65,30},{1,45},{33,19}});
        org.junit.Assert.assertEquals( (int) 175, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)63,new int[][]{ {49,70},{67,49},{55,35}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {44,31},{44,70},{62,68},{66,-88},{45,46},{7,48},{75,70},{82,60},{46,80},{21,37},{20,13},{15,42},{44,31},{40,83},{49,34}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {18,20},{89,67},{43,-47},{38,52},{75,-56},{84,-10},{15,50},{88,98},{87,-26},{70,79},{52,-19},{48,92},{31,81}});
        org.junit.Assert.assertEquals( (int) 131, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {71,2},{14,75}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {93,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {54,15}});
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {85,-28},{93,53},{50,-13},{65,40},{77,13},{22,87},{23,30},{43,19},{59,51},{25,94},{51,54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)51,new int[][]{ {15,25},{8,-85},{93,42}});
        org.junit.Assert.assertEquals( (int) 25, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {52,-61},{23,45},{96,-27},{27,76},{38,37},{95,-20},{77,67},{84,82},{7,63}});
        org.junit.Assert.assertEquals( (int) 139, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {34,36}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {72,76}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)34,new int[][]{ {83,10},{65,14},{19,53},{86,58},{34,88},{91,-45},{71,36},{24,76},{4,56},{40,-44},{99,36}});
        org.junit.Assert.assertEquals( (int) 132, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)93,new int[][]{ {11,7},{33,9}});
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)91,new int[][]{ {27,80},{10,89}});
        org.junit.Assert.assertEquals( (int) 169, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)17,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {16,40},{63,47},{13,69},{75,11}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)15,new int[][]{ {64,-5},{36,35},{19,75},{12,13},{2,50},{86,13}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {81,90}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{ {62,79},{55,51},{89,64},{99,-34},{54,52},{71,-58},{37,63},{49,5},{13,14},{95,28},{1,3}});
        org.junit.Assert.assertEquals( (int) 66, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {87,35},{70,92},{23,17},{53,92},{93,-78},{15,-81}});
        org.junit.Assert.assertEquals( (int) 92, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {13,18}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {49,-9},{52,-86},{52,49},{86,88}});
        org.junit.Assert.assertEquals( (int) 49, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {43,-52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)68,new int[][]{ {53,95},{5,82},{57,-47},{20,90},{62,48}});
        org.junit.Assert.assertEquals( (int) 177, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1000() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {34,29},{84,-51},{64,99},{46,1},{83,13},{50,24},{17,9},{73,-18},{45,64},{70,35}});
        org.junit.Assert.assertEquals( (int) 29, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1001() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1002() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {58,-1},{54,52}});
        org.junit.Assert.assertEquals( (int) 52, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1003() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1004() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {19,23},{10,54},{53,-44},{56,60},{64,83},{38,89},{47,72},{50,-46},{94,3}});
        org.junit.Assert.assertEquals( (int) 143, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1005() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)82,new int[][]{ {3,39},{96,96},{12,6},{71,21},{77,88},{24,-44}});
        org.junit.Assert.assertEquals( (int) 127, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1006() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)97,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1007() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {67,78}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1008() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)66,new int[][]{ {56,-35},{79,-13}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1009() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {24,56},{93,55},{60,96},{67,-93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1010() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)98,new int[][]{ {68,-32},{80,50}});
        org.junit.Assert.assertEquals( (int) 50, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1011() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)69,new int[][]{ {66,13},{79,-31}});
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1012() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1013() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {42,-59},{53,93},{33,96},{41,1},{-38,76},{20,99}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1014() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)41,new int[][]{ {24,31}});
        org.junit.Assert.assertEquals( (int) 31, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1015() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {10,7},{40,86},{75,4}});
        org.junit.Assert.assertEquals( (int) 93, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1016() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)47,new int[][]{ {83,22},{29,21},{58,33},{72,80},{68,58},{77,92},{85,22},{76,54},{16,-40},{4,42},{66,67},{20,-49},{29,32},{11,-29},{89,9},{62,11}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1017() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {23,82},{84,77},{5,-39},{4,30},{0,96},{65,82},{45,6},{51,96}});
        org.junit.Assert.assertEquals( (int) 222, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1018() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {53,82},{86,26},{17,70}});
        org.junit.Assert.assertEquals( (int) 70, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1019() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {76,11},{60,-32},{14,61},{29,36},{7,-23},{35,-8}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1020() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)33,new int[][]{ {57,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1021() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {74,19},{38,90},{85,0},{37,42},{67,13},{48,35},{31,-47},{4,62},{67,26},{2,73},{80,2},{98,58},{21,56}});
        org.junit.Assert.assertEquals( (int) 281, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1022() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {90,77},{11,-84},{55,7},{60,79}});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1023() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {70,49},{52,42},{22,34},{81,71},{23,-97},{85,71},{41,60},{0,96}});
        org.junit.Assert.assertEquals( (int) 190, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1024() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)6,new int[][]{ {17,-6},{48,63},{10,69},{57,69},{1,63},{97,-15},{88,7},{85,96},{7,10},{79,90}});
        org.junit.Assert.assertEquals( (int) 63, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1025() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {67,79}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1026() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1027() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)5,new int[][]{ {9,51}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1028() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1029() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {31,45},{88,23},{82,46},{74,22},{67,95},{30,45},{22,67},{77,93},{35,-97},{85,7},{65,13},{17,-74},{89,0},{37,74},{89,94}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1030() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)67,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1031() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {67,22},{21,-26}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1032() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {94,83}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1033() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1034() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {79,29},{96,-10},{50,71},{3,10},{34,47},{45,61},{61,21},{40,-56},{85,-25},{76,91},{9,45}});
        org.junit.Assert.assertEquals( (int) 116, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1035() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {56,-52},{30,90},{58,-90},{82,89},{57,-10},{65,13}});
        org.junit.Assert.assertEquals( (int) 90, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1036() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)20,new int[][]{ {5,14}});
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1037() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {27,7},{48,38},{-57,25},{83,67},{-19,75},{98,27},{7,50},{51,44},{88,89},{-72,66}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1038() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {66,80},{5,-97},{53,25},{20,-80},{-26,-71},{27,-54}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1039() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {-50,42},{-76,2},{76,-60},{-21,-76},{41,43},{21,-40},{59,12},{63,24},{56,88},{40,23}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1040() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1041() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)62,new int[][]{ {1,72},{74,66},{24,59},{41,61},{26,-80},{39,88},{14,61}});
        org.junit.Assert.assertEquals( (int) 221, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1042() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {86,60},{95,87},{4,11},{63,-53},{87,39},{36,97},{90,-79},{27,25},{71,98},{40,2},{90,44},{78,-82},{25,65},{1,28},{85,40}});
        org.junit.Assert.assertEquals( (int) 136, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1043() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {24,80},{38,18},{61,69},{35,-81},{12,-65},{19,50},{81,-8},{48,2},{26,70},{23,49},{80,68},{54,80},{18,19},{10,0},{94,33},{65,18},{56,99},{85,14}});
        org.junit.Assert.assertEquals( (int) 150, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1044() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {52,11},{27,27},{57,-92},{70,54},{99,38},{11,20},{25,73},{28,80},{29,43},{84,9},{58,99},{75,-28},{69,53},{27,19}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1045() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {75,14},{30,23},{97,87}});
        org.junit.Assert.assertEquals( (int) 23, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1046() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1047() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1048() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)72,new int[][]{ {19,35}});
        org.junit.Assert.assertEquals( (int) 35, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1049() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {32,89},{49,89},{79,84}});
        org.junit.Assert.assertEquals( (int) 178, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1050() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {13,16},{44,93},{30,35},{80,1},{7,51}});
        org.junit.Assert.assertEquals( (int) 195, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1051() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)90,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1052() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)78,new int[][]{ {2,-96}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1053() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)53,new int[][]{ {83,12},{87,44},{57,1},{7,26}});
        org.junit.Assert.assertEquals( (int) 26, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1054() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)75,new int[][]{ {85,-89},{31,31},{76,-81},{93,73},{26,65},{14,87},{72,33}});
        org.junit.Assert.assertEquals( (int) 183, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1055() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)87,new int[][]{ {27,-14}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1056() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {29,48},{1,-73},{84,-58},{34,36},{78,-21},{95,81},{37,-4},{8,15}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1057() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{ {40,88},{51,9},{96,-28},{25,23},{31,38}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1058() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {19,35},{77,2},{22,89},{98,39},{92,27}});
        org.junit.Assert.assertEquals( (int) 124, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1059() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)49,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1060() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {59,37},{5,41}});
        org.junit.Assert.assertEquals( (int) 78, result);
    }

    public void test_1061() throws java.lang.Exception {
    }
}

