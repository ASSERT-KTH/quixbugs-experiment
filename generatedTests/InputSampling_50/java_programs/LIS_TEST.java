package java_programs;


public class LIS_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,73,-44,10});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,-49,99,23,-78});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -42,13,36,56,85,-13,-46,-47,-6,91,70,87,18});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -47,39,-17,4,2,84,-44});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-81,33,-44,-96,70,21,40,92,20,-88,85,19,-11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,48,77,41,59});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,73,48,-3,49,57,91,-39,52,44,35,-7,11,56,5,42,46});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,38,23,40});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,7,35,-99,69,19,10,44});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,0,-46,-3,73,6,-83,69,96,7,-86,67,91,88,29});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -54,54,-90,85,29,-17,56,42,46,41,15,11,59,47,75});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,21,86,-39,-62,50,-38,-7,83,82,60,62});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,11,47});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,79,-56,66,44,26,47,45,6,93,-77,55,72});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,94,55,-64,17,13,41,72});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,68,29,-44,10,86,99,-69,51,67,59,2,69,79,65});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,-46,28,71,35,38,49,88,-94,39,60,-44,63,33});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,76,43,69,62,90,96,-5,29});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,-81,48,16});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,26,48,69,70,47,97,51,1,28,65,10,96,78,-96});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,37,26,92,62,15,31,19,65,38,3,-13});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,51,85,79,66,82,18,64,97,61,1,19,12,22});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -37,55,6,57,-58,71,20,-89});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,3,-36,8,4,53,61,74,60,35,18,-53});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -3,53,66,72,-59,60});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,8,17,5,31,-27,9,59,19,40,-19,53,61,28,95,43,-15,52});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,74,18,71,88,65,-87,12,73,16,-54,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -27,34,50,65,16});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,52,17,-62});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,99,95,26,9,-42,98,68,57,-65,71,20});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,34,66,82,10,-7,29,67});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,76,-84,21,37,-97,36,68,14,91});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -60,-65,52,10,19});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,80,76,74,9,45,75,-28,14,1,30,55});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,68,36,20});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,0});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,21,53,0,3});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 47,63,75});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -32,61,29,83,60,68,22,30,96,98,36,14,-36,53});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,66});
        org.junit.Assert.assertEquals( (int) 2, result);
    }
}

