package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {5,-95},{68,56},{79,40},{58,-27},{70,91},{69,31},{49,55},{99,85},{98,-88}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {16,22},{25,10},{64,94},{82,27},{88,75}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {36,-59},{54,-54},{73,59},{68,57},{64,-28},{12,86},{11,19}});
        org.junit.Assert.assertEquals( (int) 145, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)65,new int[][]{ {48,20}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)77,new int[][]{ {75,29},{23,65},{78,0}});
        org.junit.Assert.assertEquals( (int) 65, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {16,3},{96,96},{64,-7},{79,27},{24,3},{22,4},{96,99},{62,92},{18,-18}});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {9,64},{55,95}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)3,new int[][]{ {56,55},{12,69},{67,35}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)89,new int[][]{ {17,86},{13,56},{0,84},{87,-82},{2,41}});
        org.junit.Assert.assertEquals( (int) 267, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)42,new int[][]{ {90,67},{30,47},{87,72},{71,-18},{17,64},{64,68}});
        org.junit.Assert.assertEquals( (int) 64, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {24,21},{28,31},{36,48},{77,80},{-70,77},{13,74},{16,-99},{73,-52},{72,27}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)74,new int[][]{ {33,0},{35,95},{36,8}});
        org.junit.Assert.assertEquals( (int) 103, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {57,53},{27,75},{54,-71},{65,81}});
        org.junit.Assert.assertEquals( (int) 81, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)10,new int[][]{ {51,-23},{54,80},{3,30},{96,-16},{57,-49}});
        org.junit.Assert.assertEquals( (int) 30, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {4,-37},{77,21},{92,13},{53,-42},{34,12},{90,-69},{75,29},{94,80},{28,76}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {53,10},{15,10},{19,86}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {30,46}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {29,-20},{81,83},{74,96},{46,67},{51,26},{38,49}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {51,-3},{74,32},{49,62},{26,87},{63,-38},{67,62},{91,48},{80,45},{17,73}});
        org.junit.Assert.assertEquals( (int) 73, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {32,94},{43,40},{87,74},{51,97},{76,42},{21,-11},{83,87},{61,31}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)88,new int[][]{ {25,42},{89,-99},{78,5},{8,6},{19,40}});
        org.junit.Assert.assertEquals( (int) 88, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {92,30},{80,5},{4,48}});
        org.junit.Assert.assertEquals( (int) 48, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)12,new int[][]{ {33,99},{33,14},{36,52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)7,new int[][]{ {87,12},{75,-7},{86,43},{60,57},{76,82}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {71,52},{14,36},{83,-46},{30,74}});
        org.junit.Assert.assertEquals( (int) 74, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {63,38}});
        org.junit.Assert.assertEquals( (int) 38, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)55,new int[][]{ {57,66},{9,23},{17,60},{23,30},{55,84}});
        org.junit.Assert.assertEquals( (int) 113, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {75,10}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {70,39},{53,97},{15,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)58,new int[][]{ {35,54},{7,78},{52,-40},{8,34}});
        org.junit.Assert.assertEquals( (int) 166, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)45,new int[][]{ {6,-95},{61,-71}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)9,new int[][]{ {43,55},{22,38},{19,69},{41,-80}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)29,new int[][]{ {39,35},{6,18},{62,93},{40,62}});
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)52,new int[][]{ {25,99}});
        org.junit.Assert.assertEquals( (int) 99, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)99,new int[][]{ {43,26},{31,45},{63,54},{64,57},{28,90},{15,-32},{83,8},{91,-33}});
        org.junit.Assert.assertEquals( (int) 147, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {51,71},{14,87},{68,99}});
        org.junit.Assert.assertEquals( (int) 87, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)2,new int[][]{ {87,12},{0,67}});
        org.junit.Assert.assertEquals( (int) 67, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{ {93,65},{79,21},{53,-12}});
        org.junit.Assert.assertEquals( (int) 21, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)80,new int[][]{ {65,0},{8,75},{70,70},{26,68},{27,-33},{11,48},{40,66},{73,17},{92,60},{46,93},{11,-75},{78,-62}});
        org.junit.Assert.assertEquals( (int) 236, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)81,new int[][]{ {17,44},{30,96},{10,-45}});
        org.junit.Assert.assertEquals( (int) 140, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {74,76},{11,71},{60,61},{45,-70},{28,39},{13,11},{0,2}});
        org.junit.Assert.assertEquals( (int) 112, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)46,new int[][]{ {68,32},{21,56},{93,72}});
        org.junit.Assert.assertEquals( (int) 56, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)92,new int[][]{ {95,95},{45,67},{13,-8},{67,-36},{32,20},{92,86},{13,-84},{9,23},{73,10}});
        org.junit.Assert.assertEquals( (int) 110, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)70,new int[][]{ {86,73},{41,45},{29,88},{4,2},{22,40},{16,13},{15,-41},{95,30}});
        org.junit.Assert.assertEquals( (int) 141, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)95,new int[][]{ {60,45},{58,70},{10,61},{64,99}});
        org.junit.Assert.assertEquals( (int) 160, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)85,new int[][]{ {40,-51},{51,70},{95,94},{15,22},{90,-30},{38,58},{51,77},{68,75},{17,54},{91,45},{68,41},{29,0}});
        org.junit.Assert.assertEquals( (int) 153, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)83,new int[][]{ {61,20},{77,48},{54,5},{87,43},{22,80}});
        org.junit.Assert.assertEquals( (int) 100, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {10,21},{0,97},{69,87},{20,44},{86,41},{70,-19},{49,-18},{47,-90},{21,-14},{17,29},{89,99},{0,49},{37,72}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {75,-93}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }


}

