package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)86,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)73,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)19,new int[][]{ {73,85},{54,97},{83,89},{62,78},{44,-52}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {78,71},{26,39},{50,69},{74,96}});
        org.junit.Assert.assertEquals( (int) 39, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {26,97},{82,39},{54,8}});
        org.junit.Assert.assertEquals( (int) 97, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)84,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)79,new int[][]{ {98,64},{68,58}});
        org.junit.Assert.assertEquals( (int) 58, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)31,new int[][]{ {73,63},{31,-24},{82,56}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)44,new int[][]{ {49,26},{11,30},{30,44},{35,-48},{14,18},{87,-28},{47,11},{53,16},{27,-99},{77,63},{25,17},{71,43},{12,67},{87,37},{16,27},{50,3},{56,-1},{30,1},{16,91}});
        org.junit.Assert.assertEquals( (int) 188, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)14,new int[][]{ {65,51},{30,29},{15,-70},{49,65},{96,65},{71,27},{81,76},{8,6}});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {59,6},{40,54},{30,90},{36,80},{95,77},{42,24},{9,84},{50,74},{92,47},{61,60}});
        org.junit.Assert.assertEquals( (int) 174, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)35,new int[][]{ {78,42},{93,30},{91,84}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)64,new int[][]{ {27,76},{54,51},{29,-55},{99,-38}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)59,new int[][]{ {68,31},{84,48}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {48,-18}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)38,new int[][]{ {63,41},{96,57},{50,-58},{42,0}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)50,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)54,new int[][]{ {36,89}});
        org.junit.Assert.assertEquals( (int) 89, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)1,new int[][]{ {70,98}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{ {67,0},{80,35},{46,41},{1,14},{7,8}});
        org.junit.Assert.assertEquals( (int) 22, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {16,-26},{30,20}});
        org.junit.Assert.assertEquals( (int) 20, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)40,new int[][]{ {22,75},{92,-38},{58,38},{99,-72},{95,6},{76,0}});
        org.junit.Assert.assertEquals( (int) 75, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)27,new int[][]{ {73,-9}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)13,new int[][]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)4,new int[][]{ {33,62}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)24,new int[][]{ {80,73},{26,52},{90,90},{25,-27},{24,83},{11,73}});
        org.junit.Assert.assertEquals( (int) 83, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)21,new int[][]{ {4,1},{16,-90}});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    public void test_29() throws java.lang.Exception {
    }
}

