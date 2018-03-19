package java_programs;


public class LIS_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,81,1,-52,63,21,3,77,-22,10,-31,25,41,47,-6,-61});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,55,28,65,38,74,95,-50,46,68,16,3,-36,5,61,33,58});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,82,34,61,-72,3,-28,49,92});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,48,80,87,66,23,64,-26,27,-68,78,-41,7,96,-32,93,2});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,-94,44,-49,4,49,71,63,54,35,20,91,43,94,27,-8});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,71,64,89,67,36,-76,-5,75,80,7,-9,1,-70,51,97,59,60});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,-37,21});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,42,76,19,-47,52,45,-12,85});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,84,20,80});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,45,22,66,89,-14,85,84,82,-16,31,-94,52});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -99,43,63,76,75,-29,38,90,87,59,98,60,71,31,80,34,15});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,73,37,-3,92,34,-66,19,-79,42,91,46,67,13,21});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,-25,12,21,-62,73,0});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,-98,40,75});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -40,-23,83,56,77,37});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,-48,49,25,60,6,-63,-71,-25,96,17,-21,56,19,70});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,62,87,72,99,16,58,67,48,22,66,51,80,91,77,37});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,62,92,87,-83,20,75,53,-27,25,49,3,67,18,69});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,62,-73,34,27,68,-83,23,55,87,-16,52});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,21});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -2,72,90,4,70,13});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,85,-65,88,93,52,96,-37,22,11,62,-35,-20,15,-13,36,72,-78});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -77,15,-50,40,44,18,61,45,88});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,48,77,47,30,6,82,21,-22,1,58,70,-92,23,24,-63,-82});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,-27,-60,41});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,7,44,38,10,1,-67,27,92,-54,-68,-29,71,37});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -36,53,38,13,76,12,85,30});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,39,64,87,19,-5,75,11,37,9});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,77,26,96,29});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -90,45,94,-19,22});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,-34,7,5,18,44,-16,54,17,52,-37,39});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,22,67,49,54,41,60});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,60,57,-51,36,-26,98,-34,-10,48,-53,21,26,11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,0,-49,39});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,19,22,43,99,31,13,3,33,-86,-49,67,48,88,0});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,8,94,70});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,70,83,-48,-47,57,44,43,97,47,20,19,76,95});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,38,87,66,52,80,59,-43,-94});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -43,-60,4,76,62,89,68,7,13,90,33,99,9});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,90,-35,91,-47,21,71,38,88,-36,68,78,27,33,8,13});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,19,-75});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,-13,54});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,24,55,18,23,76,49,96,14,68,19,57,-3,-24});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,96,-91,-64,53});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,15,54,10,44,-66,-4,22,12,55,59,48});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,-28,40,77});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,94,95});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,23,10,65,33,32});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,74,40,8});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,55,2,65,42,29,28,77,97,8,99,38,68,-38});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,49,74,1,18});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,77,27,9,81,97,-31,83,91,26,-53,64,28});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,13,68,64,8,17,1,36});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,55,-18,59,42,64,-65,73});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,36,4,68,7,40,8,43,64,-53,80,52,69,35});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,85,61,82,5,64,2,48,65,4,77,-43,-74});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,82,42,-47,43,-61});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -42,10,70,95,-20,5,23,28,72,13,53});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -30,74,10,77,-67,-72,58,53,21});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,1,-63,29,82,77,93,75,10,19,16});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,99,37,91});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,69,86,75,1,59,93,47,32,7,94,74,60,79,96});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,-85,90,-2,97,-37,53,25,23,3});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-26,82,28,37,84,56,86,-50,14});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,69,-31,-58,55,20,52,62,-96,14,44,6});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -92,86,78,8,38,6,99,-77,-83,81,-20,61,-27,5,-32});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,4,88,63,95,70});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -41,24,27,74,22,12,68,77,44,10,35});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -10,28,55,46,-63,5,-29,8,77,19});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,65,10});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,31,66,17,21,76,70,23,63,-55,74,-25});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,41,40});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,46,-45});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -52,96,55});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,90});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -88,-58,58,44,4,66,67,71,0,32,76,39,55,77});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,0,1,83});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,-29,84,66,93,27,41,37,65,2,53});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,38,78,58,-93,4,43,-97});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,12,73,32,-88,30,-99,3,94,53,82,-18,41,40,4,-36});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,49,23,14,15,-10,-3,25,29,86,-87,26,-58,87,21,51,79,58});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,-86,49,70,3,88,85,68,-44,-26,63,65,53,8});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,99,72,4});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -21,-84,66,94,11,28,97,62,51,47,14,50,9,1,54,78});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,18,-76,71,68,28});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,82,2,47,38,45});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,17,-80,57,-91,98,-57,28,91,13,32,-99,34,-11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,78,64,30,23});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,54,85,41,99,8,92,60,53,83,59,-85,15,-77,81});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,67,55,23,7,19,79,75});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,-6,81,47,15,96,11,92,22,58,-10,69,36,89,6,52,40});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,55,-37,72,24,-31,65,57,63,26,37,10,-97,14,19});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,26,79,7,50,61,-62,91,48,51,28,-92,-95,6,77});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -76,-66,47,7,96,23,-33,-78,81,10,74,-58,-7,-47,58,-50});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -62,-55,42,36,59,-94,1,82,54,-96,8,-28,39,94});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,-5,64,60,16,6,-68,-53,27,-96,74,97,96,-82,88,95,7,14});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -96,96,99,-81,50,29,75,48,30});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,41,-44,82,91,87,88});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,72,-52,46,88,85,82,10,39,33,73,59,47,13,-43,35,83,97});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -54,71,5,-35,-38,-16,32,-67,74,-6,96,41});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,-18,97,-92,16,-55,69,-43,81,-46,-61});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,3,76,73,87,-80,-16,-74,97,-18,42});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -19,25,55,73});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,-95,7,46,29,42,59,32,-21,26,-98,-48});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,21,67,6,30,-33,26,33});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,24});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,80});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,21,97,5});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,27,15,-90,54,72,82,78,61,-17,95});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -8,95,80,15,-33,39,37,70,48,40,-4,74,17,-58,63});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,58,-31,15});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,98,-26,-38,31});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,59,90,-41,36,73});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,73,-24,33,66,94,36,0,42,69,-74,-31,50,70,21});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,37});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,83,79,46,77,49});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,-2,33,88,-96,20,39,67,78,9});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,33,10,80,6,95,9,83});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -52,4,51,-83,57,10,47,23,89,-78,-20,11,13});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,-63});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,23,-6,51,63,70,-16,61,46,12,-24});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,26,43,34,24,-63,-37,90,-86,96,-41,5,2,-97,99,31,30});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,-66,-94,15,-36});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,78,45,-94,48,-93,-86,92,64,-76,35,31,53,58});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,43,0,-68,-47,41,95,34,-32,44,84,-39,36,68,-11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -23,57,3});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,73,-50,65,25,32,66,11,21,-45});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,44,75,28,10,52,-16,51,48,-37,-55,-21,73,-20,67,20,-35});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,92,-13,82,28,4,60,81});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-79,13,-43,93,26,36,66,22,73});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,55,89,53,9,-55,65,-84,-4});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,56,62,-48,16,26,9,52,45});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,15});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,60,29,11,43,75,-90,33,21,32,50,28,47,37,97,51});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,-12,30,17,-40,81,94,85,96,87,8,22,20});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,83,34,67,73,27,-8,50,97,86});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,19,33});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,13,54,28,-49,66,-17,42,78,35,20,90,18});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -25,15,64});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,49,42,79,55,72,50});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,66,15,35,-36,22,36,20,-20,-92,5,59});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,86,39,78});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -18,57,98,96,48,-57,2,15,4,82,62,1,80});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,10,-87,13,-39,28,4,26,82,97});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10,47,-88,36,31,66,67,61,0,24,58,92,22,23,57,-22});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -3,8,61,26,65});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,-72,72,-7,95,-67,92});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,-97,-34,-11,0,29,11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-24,22,91,27,80,89,-1,-86,55,15,97,38,-26,54,5});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,2,24,31,1,28,96,11,90,57,0});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,-41});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,-8,65,63,32,28,42});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,70,68,-68,-83,17,66,5,51,38,31,36,30,93,14});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,-5,-6,19,92,10,81});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -62,74,78,-61,15,27,99});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,29,42,17,92,80,44,26});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,12,86,-41,41,56,22,79,61,46,-76,82,77,91,48,25});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,26});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,-66,42,93,-82,11,25});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -70,94,54});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,85,16,-87,43,-94,65,81,-57});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,28,0});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -99,66,6,-27,13});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,27});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -5,8,44,27,0,96,-78,-76,62,43});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -73});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,-62,30,-18,61,-1,92,-91,34,70,26,21,3,82,60});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,0,7,22,77,29,40,94,41,-36,-51,95,9,-81});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,64,98,84,37,18,21,-61,80,-52,0,11,63});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,-81,5,-32,-91,-88,23,55,18,-7,43});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,77,6,81,88});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -58,12,94,-57,32,64,43,7,1});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,84,-68,-97,-40});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,37,68,-10,30,43,14,98,41,16,42,66,-60,76,50,-1});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,-51,87,91,25,-63});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,7,8,-26,87,10,-85,-63,24,93,26,31,53,6,-39});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,25,90,20,86,-37,40,8,35,31,32,-90});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,58,16,60});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,2,24,47});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,-34,77,65});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,30,46,6,-20,90});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,-11,-52,-58});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,-40,41,60,-82,79,8,50,77});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,21});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,59,4,50,-32,6,42,53,60,45,64,82,58,33});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,26,4});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,8,55,5,33,7,23,84,86,91});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -88});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,26,35,-85,69,5,36,-78,49,59,66});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,86,31,-37,79,91,-29,-86,60,-75,55,36,17,42,43});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,73,63,81,80,-90,3,11,16,45,30,75,43,84,40,31});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -48,-19,-47,66,72,77,-89,10,39,-85,33,28,80,5,17,49,30});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,80,24,8,78});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -11,57,-29,-81,73,94,50,92,78,40,88,43});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,14,27});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,7,74,90,43,26,81,-82,1,46,2});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,28});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -2,-96,41,6,71,-66,-42,38,35});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,-88,83,-98});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,50,12,0,46,5,17,18,21,64,13,81,43,73,67});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,52,94,38,41,31,10,-66,68});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,52,5,91,0,-30,-50,30,74,56,70,46,16,13,48,-25});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,28,63});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -86,36,3,83,51,95,-64,7,-27,97,2,86});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,-70,32,10,21,78,54,46,96,-68,6,59,-55,-93,44});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -74,-81,-67});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,66,-49,-87,79,61,15});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,90,32,56,10,29,-64,55});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,96});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,20,0,17,-92,68,10,60,89,-80,19,53,44,50,51,-98});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,26,32,5,-70,97,-99,14,22,28,12,38,93,-66,-41,29,39,3,61});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,20,98,95,13,55,37,22,30,14,97,33,57,88,38});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -57,71,85,30,-73,16,-97,-24,50,86,33,2});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,31,20,69,3,53,56,62,-5,94,67,57,82,52,29});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,-17,-29,97,82,-12,-2,56,75,31,48,-15,37,61,34,-39,80});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,94,15,59,49,25});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,-6,76,54,4});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,10,-89,19,-2,84,59,-52});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,38,-55,0,-86,-87,92,90,-61,29,80,39,-99,32});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -77,-50,-59,80,5,-93,71,-10,39});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,6,67,-1,53,8,99,63});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,-95,60,95,-40,11,20,0,27,96,98,97,-73,-11,94,62});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,-54,96,87,56,83});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,78,40,19});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,86,93,71,47,37,67,89,72,4,1,80,42});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,41,26,-52,31,-78,84,-25,98,9,5,-89});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,30,9,45,20,-33,4,94,-13,-68,36});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,31,99,34,58,-91,6,53,49});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,73,83,-89,14,30,34,-90,76,54,37,9,-73,-62});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,66,79,-83,-79,-36,2,17,19,-45});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,71,-68,30,-3,57,82,17,50,65,88,48,-63});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,69,36,33});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,96,-80,1,98,55,90,7,31,-74,77,72,17,-72,0});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,67,81,75,35,-68,-3,-52,60,-2,-66,45,65});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,92,26,55,93,83,44,72,35,-23,38,59,18});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,-18,2,23,27,-71,-76,16,86,58,36,37,97,53,31,-52,76});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,28,-63,50,30,14,45,51,48,77,-61,0,42,89});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,-13,70,58,35,54,12,21,49,61,22,-81,99});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,-21,31,63,48,60,-76,10,69,38,24,34,43,-8,59});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,24,82,54,42,7,76,85});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,17,97,29,58,25,63,16});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,-18,67,77});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,98,60,-76,96,58,61,1,74,65});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,97,54,-54,77,48,60,78,18,44,-71,92,25,-37,62,57,3,13});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,58,98,42,69,24,-18,4,6});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,68,42,-35,38,74,6});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,66,64,83,76,58,84,-68,61,79,31,-54,89,75,-70,40,55,-59});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -14,3,52,82,63,-54});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -96,62,-32,-57,-84,94,-24,39,11,-10,51,-69,36,33,49});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,57,91,43,17,88,-95});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -11,67,70,-56,75,76,58,17,47,-14,-44,5,31,88,20,92,-80});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -43,55,81,46,9,32,23,86,-34,75,-70,51,21,-93,93,79,69});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,95,34,13,64,39,87,65,51,47,63,50,8,55,-26,80,26});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -8,-1,-29,25,-12,39,14,-37,37,-27});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,30,24,11,90,9});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,53,94,61,7});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,-85,26,-23,-39,36,12,99,34,54,57,-66,38,23,64,66,-60,62});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,10,16,36,3,59,79,2});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,60,76,39,83,75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,27,9,87,-36,63,-72,59,54,77,-46,47,74,-47});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,44,32,38,88,80,-84,12,1,39,28,79});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,76,-98});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,0,77,-15,-90,-75,19,76,11});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,85,4,11,79,77,75,15,3,44,70,56,8});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,21,98,92,91});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,-54,18,79,15,-63,-84,43,40});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,-82,82,16,60,69,-93,-59,91,-22,73});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,85,94,-18});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,55,72,74,-4,59,-17,30,81,-66,89,-9,-21,-27,99,0});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -45,28,42,65,37,71,38});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,78,-78,12,51,-7,-13,-88,58,30,94,67,37,8,3,95});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,19,72,61,20,21,11,98,87,77,48,25,62,35,-50,68});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,38,-51});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -14,-80,-49,-88,41,-24,7,29,46,9,37,67,35,81});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -78,-69,58,-87,-85,-79,71,-90,-35});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -59,-22,13,11});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,83,29,42,78,-4,38,-83,-50,-37,63,39,-99,51,5,-19,14,90});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,77,90,26});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,41,20,7,90,11,5,32,59,79,78,61,-78,4});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -8,72,7,10,67,9,-69,78,-87});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,4,0,92,96,69,65,3,98,71});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,86});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -1,80});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -16,71,-12,23,17,-63,89,10,66,59,86,48});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,42,75,63,23,56,15,81,-38,29,58,65,17,76,37,-14,90,28});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -17,3,40,19,62,63,49,79,35,55,25});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,59,80,-60,94,43,18,69,-65,10,85,-41,24,47,22,7,86});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,-33,88,98,71,33,-48,0,65,18,46});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,-80,16,77,30,21,55,14,-83,7,-61,85,99,57,50,19,74});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,29,77});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,83,94,92,-49,28,-12,13,21,68,-90,66,40,-22,-87});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -83,37,-56,58,64,27,84,-36,-28,48,5,-81,82,53,31});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,-47,88});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,14,71,1,7});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,95,6,-30,91,68,80,-82,-13,98});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,55});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -66,54});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,38,22,0,61,95,-15,56,-27,80,-86,97,71});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,9,60});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,12,38,90,-20,1,73,29,68,62});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,10,72,17,82,48,94});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,46,4,79,-92,3,17,-17,10,-20,97,-48,42,53,55,64});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,46});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,9,53,-3,-64,90});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -3,44});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,55,13,7,46,52,98,12,51,75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,86});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,62,7,73,60,-7,56,28,-58});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,88,12,-16,27,68,35,43,73,79});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,21,-53,81,23,34,96,29,87,47,19,0,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,56,13,96,41,85});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,57,86,53,52,-28});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,5,74,70,9,-37,19,4,55});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,-45,57,6,98,94,88});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,34,58,40,60,55});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,65,43,90,28,22,47,73,-64,53,36});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,82,50,44,53,88,92});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -4,-72,32,5,-40});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -31,74,67,85,-82,-94,24,27,48,93,0,7,91,99,1});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -86,48,6,84,41,72,99,93,-10});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,86,45,14,50,-47,15,77,60,3,36,26,0,51});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,56,28,82,83,15,89,52,-23,5});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -41,56,78,-17,33,51,40,95,62});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,-45,45,79,-77,67});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,24,57,-5,91,3,87,65,60,90,-90,34,92,50,27});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,-71,3,4,49,24,70,-78,-35,88,67,-8,91,35,-36,-70});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -91,58,93,37,62,4,31,28,48});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,51,70,28,-77,-85});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,70,19,-87,23,-25,49,-49,35,83,18,93,50,58,38,76});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,92,-80,-81,61,0,48,49,15,56,86,94});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -80,-86});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,82,77,60,22,-26,42});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -12,-19,24,78,14});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,18,99,47,61,44,-45,89,45,78,31});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -44,-88});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,5,60,36});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,32,73,85,17,80,37,64,44,93,41,95,-46});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -40,19,51,87,72,23,74,14,96,-95,54,93,89});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -18,38,29,46,70,-55,23,37,95,-26,55,84,-71,45,89,-81,99,13,-36});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,53,78,2,-50,-47,0,45,49,74,79,13,-89});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,52,41,28,23,22,4,35,-26,-10,-22,-82,27});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,39,69,21,27,6,22,71,11});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,23,8,24,68,6,97});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,48,-44,13,59,41,63,76,64,-97,19,89,21,61,20,39,46,18});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,65,44,21,34,61,-5,96,45,-37,73,18});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,81,-28,4,85,87,28,57,25,61,51,5,22,9,15,44,63,26});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,48,42,93,82,-52,6,5});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,85,77,97,42,11,0,55,81,26});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,11,28,54,78,3,67,49,35,-91,-92});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -69,36,26,58,15,34,27,76,44,8,-20,93});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,83,73,55,63,97,99,-87,-66,-1,-73});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,12,79,38,39,10,54});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,48});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -40,91,22,94});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,15,1,-85,47,74,-72,-28,17,94,12,-69,0,79});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,39,61,96,28,70,0,-90,56,34,59});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,83,99,18,88,54,58,84,34,3,29,55,6,62,93,77,30,-37});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,10,18,24,15,-2,1,73,92,65,-98,-16});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -94,17,-47,26});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,66,68,-26,10,13,91,-94,52,12,20,57,19,67,63});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,3,-57,-42,78,6,74,21,50,4,46,19});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -74,96,17,66,-94,75,32,43,27,93,-25,28,4});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,86,46,-25,90,93,27,-37});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,-24});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,3,68});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,93,91,42,16,13,7,1,10,96,69,31,67,51,-86,73,43});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,-45,39,85,-72,2,65});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -34,40,22,70,11,16,-86,2,-92,96,69,36});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,47,82,5,93});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,15,39,32,85,-19,45,35,-45,17,69});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,21,-48});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,-55,47,0,78});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,57,74,83,64,13,85,-6,75,21,89,24,31,26,-91,22});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,-85,-73,60,87,33,50,-62,79,58,-15,-54,77,35,97,-83,96});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,70,1,46,92,52,69,19,3,79,72,-32,4,41,85,35});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,92,48,65,43,-71,38,85});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,11,93,91,-82});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,47,88,43,61,99,13});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,-18,32,26,-69,86,-8});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -12,87,12,76,-15,19,35,64,33,9,-72});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -25});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,41,-46,47,8,15,24,17,88,40,43,9,74,71,72,1,-39,28});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,17,-49,-8,44,65,92,4,77,33});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,80,68,34,26,-57,59,93,53,43,6,15,-48,99,67,4,29});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,-99,91,85,69,-42,-36,35,88});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,58,48,69,26,71,-16,75,42,-77,0});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-62,-18,-50,-86,45});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,-69,-43,80,98,34,79,50,76,-48,72});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,91,66,86,33,72,-70,4,25,48,65,31,17});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,8,-5,-37,14});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,95,7,24,89,-35,-69,53,96,23,-46,-47,67,25,31,69,-34,-19});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,12,37,54,76,-56,75,61,11,80,23,-72,57,59});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,-42,49,-91,89,87,72,86,22});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,0,70,-19,85,95,14,17,-86,68,61,26,-23,51,63,13});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,-69});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -89,5,61,-87,19,81});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -5,71,62,4,64,5,24,14,20,-57,82});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,63,27,39,-57});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,45});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -88,30,1,61,92});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,59,28,10,94,44,-35,66,55});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,48});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,16,78,33,44,75,-5,97,65,24,34,0,52,91});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-54,58,79,81,92,88,63,24,38,-77,-8,49,15,72});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,-36,70,19,88,26,-88,34,55,62,81,51,-5,96,0,65,-32,38,32});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,16,21});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -34});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -63,-46});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -97,3,52,89,84,-2,-77,-37,33,-86,93,-27,43,-67,-62,68,99,95});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,4,88,20,-68});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,17});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,61,85,51,-70,26,74});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,93,-24,60,15,-99,41,30});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,46,-96,64,98,-40,-77,39,-1,56,89,79,14,0});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,96,51,4,-64,11,12,37,43,-45,36,70,93,68,9,-2});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -95,25,54,16,1,44,68,80,75,-70,45,35,-93,3});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,0,83,-86,37,76,27});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,10,88,5,36,-14,72,94,-85,-80,31,-5,80,11,13,35,-3,39,52});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,30,71,76,11,0,12,-15,81,65,-76,92,58,10,36,27,-63});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,20,66,74});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,77});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,15});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,68,92,74,41,26,58,-63,78,98,-77,-84,88,82});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,43,23,15,45,99,8,98,72,69,65});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,77,52,18,-26,79,80,87,15,44,8,-58,-4,99,85,29,31});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -8,-57,1,-15,63,72});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,20,79,5,74,-48,13,49,91});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,6,32,98,44});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,20,81,69,11,-18,54,2,-50,59,97,30});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -57,44,34,85,33,99,7,40,68,15,-20,6,56,94,98,79,38});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,46,-30,-16,49,82});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,12,67,34,50,16,19,73,-69,49,4,28,74,40,-88});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,-99,26,38,57,12,36,67});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,75,47,6,25,-45,-66,31,52,1,88,70,38});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -14,76,16,89,99,86,-46,-21});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,71,0,-12,78,60,13,98});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,41,59,-9,69,-18,11,81,-74,60,16,94});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,64,75,13,28,63,21,70,40,98});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -96,17,80,81,-18,8,24,87,9,43,82,64,34});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,11});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -56,70});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,-25,75,36,60,-91,-3,48,78,38,-86,47,-12,83});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,7,44,-62,40,-26,15,10,53,43});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -52,81});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,43,14,90,39,64});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -24,22});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,-91,62,65,-69,7,23,95,49,-97});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -29,48,19,83,49,43,4});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,12,36,37,5,58,-20,14});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,73,-19,56});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -67,81,-33,78,44,23,48,5,47,3});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10,-33,89,84,26,48,-86,5,54,97,7,95});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,-6,-91,50,42,86,6,27,56,52,98,17});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,55,12,91,97,86,-82,7,70,80,22,99});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,-83});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,-63,46,30,99,-36,94,5,-59,-28,23,15,52,75,-65,0});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,21,19,87,82,16,44,30,46,69,2,58,27,-60});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -35,-7,64,83,92,15,30,41,60,34,66,59,65,-77});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,58,74,63,84,51,12,38,82,-15,47,41,68,67,-37});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,76,-61});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,94,33,23});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,83,-10,93,57,-54,-12,26,82,-80,32,33});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,-67,-48,-73,35,-55,12,11,50});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -8,52});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,55,22,90,77,50,73,94,91,85,41,19});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,90,1,20,86,97,-57,-93,93,61,74,40,-85,78,-2,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,37,55,15,27,11,56,98,46,28,1,91,21});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -98,63,8,94,75,-91,93,48,25,-89});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,94,99,43,41,82,68,84,77,83,51});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-22,-52,26,7,80,19,61,99,14,42});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,86,74,78,15,82,-10,12,81,7,-62,3,-26,72,41,17});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,98,63,49,21,57,71,9,65,64,43,94,88,-9,99,82});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,4,22,-73,0,74,-50,29,51,-81,56,68,31,35,7,26,34,13});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,62,36,56});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,73,-25,33,95});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,85,39,50,89});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,19,-68,89,54,97,79});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,2,74,34,78,75,80,20,73,50,-69,60,38,79,17});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,13,55,84,-16,30,12,22,35,96,46,98,76,58,37,78,41,-36,59});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,20,19,56,32,8,57,1,80,39,51,-23,-22,22,-2,31});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,19,77,60,65,89,-20,80,93,1,96,30,-17,12,81,50,18});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,-71,82,29,-99,21,-86,16,46,43,93});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,-98,38,12,86,90,24,-86,62,65,1,-14,71,0,29,68});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,14,-80,80});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,95,80,-87,77,33,-15,76,72,53,2,67,-69,14,-45,35,1,27});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -29,-93,-60,29,95,21});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -35,-78,95,8,12,34,47,92,5,62,93,36});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -73});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,13,91,82,99,19,-54,58});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,9,16,92});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,78,75,52,93,-62,69});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,7,35,9,97,16,75,19,57,-28,66,85,62,14,60,-97,61,46});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,37,95,7,58,28,62,-87,65,39,-34,-76,64});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,7,81,-95,95,-59,92,5,38,-3,78,36,24,98});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,90,36});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-83,96,8,66,93,62,89,82,73,97,27,-30});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,23});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -52,1,50,53,11,-21,93,4,-51,79,-97,2,77,40,78,65,44,74});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -29,17,34,53,69,-36,88,95,24,87,44,93,11,45,68});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -33,74,13,46,11,69,7,55,48,-81,18,82,54});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,49,2});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,70,9,-95,95,52,23,76,-34,28,54,69});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,-66,-18,36,54,97,28,18,-27,12,87,46,43,73});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -86,40,50,-71,79,33,64,92,-73,46,-83,95,19,57});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 89,39});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,10,32,-6,-28,-68,57,33,36,3});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -39,6,-38,-51,-10,37,84,55,61,8,15,69,-33,-83,26});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -5,68,-33,17,93,-18,26,52,39,45,77,63,15,-10,48,-36,-67});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,81,58,60,75,98,4,0,12,87,11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,-40,-52,-71,88,51,38,39,53});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,22,71,56,23,16,12,59,45,5});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,18,38,86,50});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,88,89,21,31,96,95,59,54,51,86,47,-51,32,3,80,-98});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,78});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -38,97,-90,50,86,56,49,40,-45,0,73,28,52,-22,-5,93,-24});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -43,-54,-38,85,54,92,9,51,-13,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,86,62,48,1,42});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -15,-74,-63,67,-4});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,85,32,93,8,89,24,21,41,-36,53,79,52,-3,-74});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,35,41,-99,17,88,1});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,3,73,26,20,36,8,31,75,-40,71,30,-39,87,88});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,8,64,54,70,73,26,98,84});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -11,27,99,83,22,98,71,-24,13,86,67,60,-26,61,64,39});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -84,23,-27,43,-79,12,-93,66,30,27,52,42,31,-76,15,25,96});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -66,25,54,5,76,44,58,-12});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,47,59});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,74,27});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,75,11,16,91,18,-25,65,89,1,44});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -19,-23,30,-22,56,72,17,88,45,14,87});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -87,70,33,-43,80,94});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -47,13,63,45,31,91,22,83,9});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,45,11,33,30,-87,91,4,78,27,17,0,-35,48,29,9});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,-69,21,31});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -34,20,-96});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,74,5,-40,-53,14,19,91,16,20,-51,65,50});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,91,63,66,92,46});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,12,27,-48});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,46,21,26,96,72,60,84,89,-51,64,93,-83,14});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -48,56,78,-44,24,49,63,48,44,38,-30,25,32,77,95});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,31,95,24,-33,46,-41,86,-71,92,26,87,22,6,-97,78,16,4});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,-41,71,92,89,-68,23,13,48,77,-85,70,3});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,46,71,50,26,47,17,-46});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -78,-2,17,-14,-43,-71,52,0,53,64,-97,66,87,21,83,-6,12,-65});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -63,46,66,17,1,-2});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 8,-21,45,74,48,99,72,-81,31,-5});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,-17,42,67,97,21,-43,73,83,35,-15,-96,68,45,23});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -84,85,11,80,23,38,34,66});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,68,61,34,65,62,-85});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,48,14,87,46,94,-95,99,11,15,86,19,24,-51,64,35});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,54,30,13,47,60,-81,38,37});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -67,-83,-5,31,69,93,88,72,87,83,51,-32,-71,17,98});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -58,60,3,-15,61,72,70,15,13,32,99,41,74});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -7,-38,75,78,80,-64,74,-5,77,88,-75,10,14,20});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -89,65,90,80,92,1,7,-49,-78,11,43,87,-86,47,-60,99,8});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -51,34});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,70,92,86,19,93,47,45,44,54});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,14,46,36,18});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,-21});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,55,10,50,83,24,36,38});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,16,-74,78,-48,34,76,77,67,-59});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -22,41,53,14,83,86,0,90,25,88});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,-1,-35,44,56,29,74,13,39});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -80,-1,61,-32,35,55,19,53,85,63,-22,-9});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,82,14,39,60,78,-95,66,-58});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,72,90});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,74,-25,35,14,58,65,-30,17,38,41,-83,-45});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,5,83,89,39,-73,40,66,29,68,21,-74,73});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,-68,49,52,77,33,54,10,-24,40,93,47,43,88});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,63,37,79});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,29,92,91,-86,14,-35,8,75,96,67,-87,59,69,-41,-92,57,-4});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -6,84,98,66,51,39,-70,96,7,-44,72,38});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,20,57,39,12,66,29,58,11,-33,-47,90,89,47,-50,38});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,39,33,41});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,41,-5,-31,88,45,-85,-48,13,15,18,63,94,35});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -40,92,32,86,54,71,84,35,21,98});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,0,44,-8,-35,-83,71,91,64,-20,43,87,24,62,21});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -47,38,56,-85,18,73,51,21,-54,0,32,-38,31,87,5});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,-64,76,-79,7,50,43});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,76,72,14,-18,-87});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,3,62,64,54});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,-80});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -61,42,67,30,77,63,70,74,21,79});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,-10,3,11,72,64,52,40});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,6,79,48,86});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,-88,9,97,86,35,63,87});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,-67,68,21,27,37});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,-84,4,26,-61});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,3,64,45,31,89,18,29,27,-73,70});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,97,-65,28});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,1,93,36,88,-26,-51,-69,91,35});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,74,32,8,-80,79,81,48,70,27,66,72,7,49,-37,57,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,-48,61,60,21,82,81,27,14});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,20,39,71,-13,27});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,37,19,29,8,63,69,-28,10,61,53,91});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,36,-76,9,73,72,94,16,62,32});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,-4,-35,46,41,59,-70});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -32,-58,54});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,71});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -8});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,75,-7,64,7,35});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,7,-27,37,41,-59,36,18,-10});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,-51,23,-62,73,42,-32,85,91,67,72,-35,-37,98,7,46,43,66});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,69,51,20,25,85,-72,93,-51});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,-69,48});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,93,-10,37,58});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,91,55,76,16,39,24,73,42,-66,27,69});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,77,16,-44,60,82,75,63,-16,70,13});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,66,35,77,62,56,51,-59,80,28,5,20,-8,4,23,-49,59,14});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,91,52,16,92,79,6,58,82,61,76,-9});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -26,-32,12});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -21,95,22,44,9});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,24,50,95,66,39,21,65,13,30,92,-34,57});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,-9,36,42,-85,-67,26,65,5,71,-81,45,64,41});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,11,6});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -13});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,-85,20,61,21,-30,88});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -9,99,81,-30,4,30,28,-21,21,52,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -64,52,51,74,79,30,22,65,24,64,-8,18});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,70,5,25,-28,82,59,0,-94,71,84,37,58});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,65,19,-67});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,48,20,41,29,91,-44,54,33,-38,52,80,72,89,94,-90,77});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,-74,13,58,52,70,-49,98,63,84,-82,89,56,41,25,79,35});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,29,48,26,-96,-55,-14,75,-86,16,71,28,56,24,30,88});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,86,66,-93,-39,87,74,-83,-87,98,85,67,65,18,-68,78,99,56,94});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,0,-63});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,57,58,38,35,56,3,4,-16,9});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,-5,-36,-60,69,77,76});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,44,-44,55,93,-86,-84,94,20,66,69,73});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,69,70,36});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -64,80,-22});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -36,-7,14,52,23,48,67,94,49,98,44});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,7,73,41,-18,96,-68});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 8});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -48,26,21,24,-77,-96,84,-54,93,37,58,-81,-17,7,6,-43,81});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,69,88,32,-13,45,-21,-49});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,94,93,41,82,84,5,45,-45,11,-52,81,85,46});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,-53,58,37,79,-94,28,66,27,77,32,98,3,-59,85,57,-58});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,83,51,53});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,86,-11,-96,71,-99,58,59,32,47,64,-72});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,71,55,11,4,-31,-22,17,92,47,12,76,28,-92});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,34});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,92,50,36,46,-24,90,88,-42,61,30,93,6,-67,78,60});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,72,-45,56,3,26,32,-99,78,-18,1,12,85,97,98,4});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,70,97,15,64,74,41,50,3,34,0});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 47,64,38,26,97,86,14,5,-35,-87,-77,66,80,9,37,83});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -15,24,-56});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,36,98,-14,26,61,72,-10,-19,86,-84,41,-90});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,19,66,-40,14,-54});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,20,74,-87,9,31,-44});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 47,95,86,63,20,67,54,-18,73,-75,-27,16,37,82,84});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,90,85,18});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -97,78,10,-9,11,1,7});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,3,79,2,-11,95,42,57,38,26,-90,85,54,40,35,73,7,-4});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,20,48,90,-90,29,17,57,75,60,-4,68,-81,35,58,94,42});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,16,55,54,-6,90,-74,86,47,38,30,98,99});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,70,51,0,50,1,42,37});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,-33,50});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,47,38,84,99,10,58,59,51,-44,9,39,2,55,86,60,91,3});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,-2,17,-77});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,20,45,33,80,-95,67,83});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,18,35,93,57,95,60,0,-93,-70,39,28,12,-16});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,51,94,34,83,24,74,80,21,65,4,22,98,26,-52});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,30,42,1,10,99,88});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,95,74,98,44,36});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -88,93,95,63,67,94});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -10,9,7,73,94,13,65,14,11,6});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,45,-80,59,-93,93,5,98,8,80,42,-71,-72});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,91,72,21,96,36,75,16,-96});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,44,29,38,91,84,15,65,-81,10});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,-86});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,87,75});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,57,74,0,91,33,96,67});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,31,25});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,1,52,-39,8,13,60,-75,70,31,36,62,-97,56,-34,35});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,-6,-43,34,47,10,59,-47,12,70,18,5,67,-96,65,91,-70,63});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,21,22,48,24,98,88,62});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,-78,33,-85,-9,75,-90,12,50,39,10,20,86,27,76,38,37,95});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,2,39,-85,83,33,20,50,36,31,60,41,69,46,61,37,13});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,20,64,46,43,72,26,75,22,5,80,15,-47,-16});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,77,33,97,-7,44});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -72,80,92,-42,52});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,-37,84,-53,15,19,33,44,3,7,69,-57,32,20,68,29,13});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,-4,-97,61,59,1,79,46,50,89,39,2,54,53,22});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -71,27,72,-58,7});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,-3,36,5,13,22,34,72,41,48,55,-8,-21,65,-66,97,9,-80});
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,87,82,-20,-24,34,-96,-90,78,19,22,-34,14});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -45,50,25,-55,18,-10,0,87,75,5,35,89,44,96,7});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-45,88,71,-1,8,2,93,-27,25,27,34,66,51});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,45,84,61,70,65,-68,59,80,78,-95,-87,6,13,72,63,51,67});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,67,85,70,5,99,56,27,94,54,98,-24,0,-72,66,81,82,84});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -16,27,37,92,31,-15});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,33,18,59,30,75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,-61,10,63,86,58,26,71,90,5,36,95,49,40,45,94,88,50});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,21,71,54,0,-1,2,77,36,-28,32,30,66,-10,15,78,88});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,-83,26,92,37,-16,27});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,14,-73,0,84,3,99,11,53,16,-28,28});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,76,-55,8,-91,82,38,93,18,41,36,0,91,32,25,74,79});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,53,60,5,68,-76,-14,93,58,2});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -38,28,77,12,-40,11});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,-71,-69,-70,87,-17,7,31,75,99,96,43,53,91,41,10});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -3,58,63,56});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,84,67,83,9,96,2});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,63,78,69});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -34,-84,41,71,74,62,0,47,49,44,70});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,88,89,36,-68,17});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,41,86,-17,62,5});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,73,-49,40,32,69,-32,6,41,80,7,48,-50,49,84,86,57,66,-64});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,97,95,54,-78});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -39,43,47,51,54,39,29,82,64,48,89,-96,42,-94,-12,-5,-66,60});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,28,-38,58,26,-83,8,89,2});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,41,30,37,-62,70,25,-54,26,71,-97,48,16,-4,54,23});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,41,68,57,87,29,80,8,71,50,34,56});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,74,13,35,6,78,-63,-64,69,25,98,15,53,57,43});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,42,92,43,55,-39,83,79,52,33});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,43,3,61,33,37,71,12,17,20,-79,64,67,39});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,20,67,44,75,-44,22,36,59,6,33,-24,-6,40,-40});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,62,46,-91,-42,61,34,76,32,37,43,26,64,41,2,12});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,15,18,29,23,91,62,71,-84,90,47,38,-13,59,57,-9,-86,-23});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,-48,-93,88,97,-64,93,44,12,63,25,52,26,84});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,7,41,81});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -94,57,-1,59,34,70,79,93,0,-60,10,43,82,68,58,56});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,-80,19,20,-43,83,85,47,30,-63,37,-18});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,4,67,43,0,77,92});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -99,97,22,70,43,92,65,1,52,66,-52,11,86,88});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,87,29,-56,-62,99,88,25,70,73,52,16,11,76,31,78,97,-63});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,14,96,87,65,12});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,-60,-72,75,38,5,78,-91,4,-50,-3,-15,31});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -9,32,0,-70,35,69,93,49,68,82,44,71,25,-62,77,-29});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -50,46,15,59,69,-3,38,-11,89,32,45,12,8});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,61,43,10,77,65,-16});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,60,14,31,23,45,63,82});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,82,-52,58,-28,90,2,71});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -44,62,82,52,24,9,5,90,-25,13,-67,-63,92,68,47,83});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,77,-83,33,28,96,78,0,20,-61,-57,-93,34,-8,29,75,45});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,62,43,3});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,88,87,1,53,26,-81,-3,22,63,-84});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,2,45,68,59,26});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -11,96,3,54,99,-72,79,50,-46,83,-48,53,63,13,10,64});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,35,21,66,60});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,40,92,2,75,99,66,-74,-67,-65,-91,67,94,27,45,30,24,49});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,8,60,-67,51,25,-79,58,63,45,34});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,69,24,76,-67,-12,-28});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,61,71,13,-67});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 8,43,85,35,-93});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,-45,73,88,76});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -5,-4,0,76,79,-83});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,70});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -97,-30,92,27,54,-12,47,10,44,-28,68});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,-71,65,73,-40,94,-51,-58,-75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,16,-97,24,92,12,73,54,2,-70,87,97,70,-5,8,96,58,71});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -26,44,18,-75,70,76,59,25,-81,-73,29,80,16,-66,47,95});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,4,-54,61,-42,15,41,23,97,-57,54,5,-30,56,87,40,82,11});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,3,10,72});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,9,42});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -59,96,67,79,82,76,29,24,30,-76,-25});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,48,-42,51,98,77,95,79,63,-53,11,84,70,36,-91,6});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -72,69,-7,-37,0,11,77,33});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,78});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,5,-42,43});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,2,39,4,72,43,93,-2,84,61});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,24,44,85,6,17,78,83,56,4,-3,-91,27,-35,-98,16,94,2});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,-21,86,1,32,76,8,-43,49,14,-99,93,22});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,67,86,-11,95,38,-50,33});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -79,79,68,29});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,-91,-13,72,29});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,61,56,13,-75,40,-81,-36,4,89,71,-60,49,-67});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,70});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,59,21,54,64,-92,68,49,23,60,-54,-8,73,-75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,15,-96,11,32,6});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,43,-51,78,74,31,0,-38,51,85,-25,77,33,-69,-18});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,-75,97,37,-47,76,7,73,1,4,5,0});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,29,19,12,76,92,11,51,67,98});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,-56,-98,29,95,36,37,24});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -73,48,91,23,18,39,84});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,20,59,-91,60,46,31});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -52,-56,61,39,-2,52,-4,8,63,80,9,-73,-26,72,40,44,32});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,0,28,-52,97,32,57,31,85,74,24,18,55,-80,64});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,66,97});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,74,42,3,11,20,58,-46,44,-2,35,8,32,63,-7,83,92,-14});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -19});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,25,-32,29,-74,43,5,94,57,23,-47,81,38});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,68,-44,45,44,-25,63,-58,90,-76,81,-34});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,-49,-26,82,79,50,0,34,-44,92,18,77,66,27,55,-13,32,43});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,-53,40,37,-48,62,64,-1,54});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,57,72,26,82,43,16});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -40,40,-67,-4,16,12,-99,35,-53,11,43,1,17,72,6,34,-96});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -32,28,49,46,38,29,34,73,75,70,11,-82,1});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,57,20,-82,22,-77,8,-38,36});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -79,15,85,69,-57,-83,94,33,16,68,66,63,-90,0,19});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,43,3,-20,50,89,0});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,52,20,87,55,11,77,-48,8,35,-37,16,23,26,89,92,60});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,8,-91,93,36,57,26,48,56,74,-67,78,-89,65,43,-15});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,40,19,-54,21,99,16,7,0});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,9,55,-2,-60,94,49,79,78,23,95,6,80,-7,73,-85});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,14,26,95,-52,9,44,47,-85,49,94,27,-96,30,21});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,-68,27,-49,33,18,-84,47,62,43,5,8,77,-46});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,28,87,23,25,82,-65,18,-5,7,-2});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,43,77,11,79,70,75,-84,-8,15,4,12});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,62,-3,9,52,63,57,69});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 89,-63,41,78,-58,72,-60,79,31,47,44,33});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -85,78,-39,62,51,9,91,31,-8,70});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,-25,80,37,15,21});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,85,94,96,57,63,-79,24,29,-13,1,53,39,-2,59,79,54,-44});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,79,58,74,70});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -30,-98,65,81,17,26});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,-38,14,40,35,68,22,26,12,56,58,43,2,-90,50,30,-34});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,23,80,27,92});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,80,90,37,79,11,62,58,57,-93,4,30,13,-11,-68,39,55,89,86});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,24,55,78,-59,81,-63,94,45});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,73,56});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -45,15,78,41,-49,65,44,-93,37,20,82,13,18,43,5,10,55,53,-90});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,9,-26,77,57,-39,51});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,16,15,39,-16,74});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,25,57,-53,28,0,76,5,38,45,30,12});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,51});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,40,18,74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,70,-37,3,88,56,28,82,17,31,98,74,0});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,85,68,-28,96,29,26,-14,95,-60,97});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,69,81,29,80,-53,15,70,89,77,53});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -82,31,33,-43,40,-8,91,34,26,-45,96});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -36,28});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -29,-83,2,96});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,59,41,4,88,63,13,16,-48,78,-98,53,49,25});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,32,93,38,-16,87,27});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,7,-62,25,29,67,88,54,68,76,84,31,9,58});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,28,83,97,91,90,99});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,34,-78,87,39,83,22,17,63,70,-25,62,60,32,29,0,36,5});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,-51,13,89,-96,23,11});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,24,69,-25,20});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,46,-62,29,-56,89,59,28});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,5,-45,85,18,79,9,-71,30,-48,62});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -50,4,38,-14,64,16,44,49,47,42,21,3,13});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -35,66,-33,74,82,20,56,42,59,61,18,19,8,-60,55,-38,33});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,-73,52,-23,91,25,22,30,50,45,94,28,86});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -4,23,15,40,69,91,14,6,5,27,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,78,73,64,95,65,0,54,81,26});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -6,69,51,-57,22,86,94,34});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,29});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -36,84,72,17,-74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,88,39,23,-16,-13,53,63,-14});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,9,70,69,67,98,34,33,87,-1});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,-91,17,58,81,8,32,-46,78,28,-10,46,70,-50,69,79,98,-56});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,20,97,29,98,79,18,9,19,-13,71,92,56,73,53,48,82,43,30});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,20,30,39,3,-35,71});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,-26,15,62});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,0,-56,11});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,37,-13,60,-56,14});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,94,96,20,45,55,62,-89,33,-64,97,82,-11,64});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,13,85,56,7});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,66,67,78,93,97,16,-39,47,49,45,24,71});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,16,20,10,13,86,93,36,30,41,54});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,55,-39,-99,60,54,25,11,17,-7,35,7,51});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,68,10,34,-53,7});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,17,94,80,6,-20,59,97,-21});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,29,13,-91,0});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,90,78,67,-42,13,30});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,1,31,-42,53,23,13,26,90,39,-34,34,78,-37,54,-35,-86});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -54,34});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,61,58,6,95});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -51,6,-21,25,53,37,73});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -88,62,49,73,20,77,37,18,-10,48,88,85,-68,19,7,-57,17});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,80,2,0,91,52,40,45,35,-98,25,69,96,38,18,89,3});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,62,5,12,48,6,-58,87,97,7,4,63,-18,-86,20,26});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,87,14,61,18,-49,89,47});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,3,-41,51,40,37,72,82,9,88,18,85});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,98,74,-62,3,73,38,0,93});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -39,23,60,29,7,21,10,86});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,37,85,98,-11,91,89,18,86,78,52,72,21,5,34,-9,-66});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -45,62,82,70,20,13,43,54,29,88,24,18,48,47});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,-66,-97,91,3,24,-5,30});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,98,0,70,66});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,29,2,-28,-96,0,43,47,-53,-6,82,86,10,57,59,-38,85});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,51,30,-92,43,26,25,-70,9,11});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,29,96,16,-82,-26,89,33});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,73,18,5,28,66,55,77,19,97,53,61,39,15,82,84});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,2});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,81,45,-95,-71,99,44,1,-62,12,-14,79,42,94});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,5,10,-19});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -94,82,97,-44,-28,0,96,18,64,-89,-59,70,47});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,14});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,23,10,73,90,-26,-78,91,11,40,37,28});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,53,32,72});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,25,96,92,5,76,21,-47});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,-15,50,68,25,93,-89,48,64,60,28,92,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,90,49,45,-88,-3,38,41,74});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -4,-5,55,51,-66,74,12,94,78,39,31,81,-6,97,-68,-74});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,18,48,53,-76,2,75,32,92,69,60,83});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,89,29,10,88,68,26,21,70});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,5,85,50,51});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,68,21,17,53,31,-62,-13,59,87,26,82,3});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,30,76,36,-15,-30,27,67,-62,48,-25,56,5,-50});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -47,90,-81,-71,-24,65,35,-19,25,57});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,97,-74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,32,50,54,62});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -82,30,57,62,0,-52,52,29,34,85,61,67,-27,76,1,93,-77,-45});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,-79,-99,55,7,3,59});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,78,34,-8,-71,75,14,82,56,-41,26,63,46,-55,37,54,11,51});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,17,-77,68,6,-7,-79,25,12,3,55,72,50,-51});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,76,31,18,43,56,40,-71,85,77,64,47,93,9});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -77,-90,13,61,-47,94,19});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,26,50,70,74,58,88,84,13,32,71,10,63,47});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,56,19,94,87,44,47,27,80,79,96,5,22,92,11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -41,70,93,2,-72,30});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,-90,49,6,25,8,39,44,98,84});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -3,81,9,90,68,98,88,97});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,83,56,18,46,76,98,24,65,87,55,31,75,38,26,63,62,-42});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,34,79,9,-11,58,-68,92,38,36,-93,75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,1,77,-3,36,95,28,21,-92,78,25,26,32,84,55,40,50,57,4});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -4,-26,-95,58,-74,41});
        org.junit.Assert.assertEquals( (int) 3, result);
    }
}

