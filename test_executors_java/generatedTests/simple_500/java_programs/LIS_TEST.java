package java_programs;


public class LIS_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,-71,4,13,1,42,63,35,2,62,14,-55,40,-38,59,74});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,-98,97,81,82,88,34,-62,61,68,-23,5,72,92});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,11,92,89,80,-58,94,72,-50,6,11,0,80,70,96});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,17,41,3,73,96,38,5,-34,93,52,63,-9,29,-70,1,5,-9});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,85,92,51,22,64,36,-36,32,-11,36,22,-14,12,6,22,-35,-24,32});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,20,-56,78,62,46,-10,0,-55,63,95,3,36,51,84,-99,65,-32});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,31,50,40});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-56,21,88,6,-43,28,83,22,11,92,98,57,-15,19,31,98});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,-54,14,24,-37,53,-50,56,-59,93,85,42});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,26,-78,-23});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,79,-23});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,90,27,77,28,80,88,41,-38,39,95,-74,81,64,30,69});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,15,45,32,-63,15,-6,78,74,37,35,-15,5,88,42});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,59,-70,-7,55,58,42,57,73,70,49,-4});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,5,73,61,75,21,34,44,21});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,-73,49,18,95,92,50,62,35,51,-55});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,88,8,15,-40});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,81,9,86,67,75,98,45,81,6});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,56,87});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,12,29,-70});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,82,60,42,-30,81,35,-15,44,-62});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,7,37,22,25,70,29,11,-55,58});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,-55,11,73,51,90,19,5,21,-38,-56,45,71,91,58,79,-64,50});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,28,6,41,24,35});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10,73,26,6,60,-25,-76,44,34,35,22,12,99,88,93,63});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,-82,-98,86,-97,44});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,7,9,87});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -16,11,74,-67,61,91,24,18,59,-38,53,-38});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,2,54,-69,61,42,12,69});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,-41,30,80,88,71,36,80,98,57,72,64,50,85});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 89,-52,6,-67,55,59,82});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -9,78,-20,10,45,81,43,50,53});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -93,27,41,-5,15,2,70,-13,54,-23,-89,80,-63,42,78,87,49});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,23,-92,7,51,38,5,21,42,32,-37,16,46,53,43,-45,83,-53,24});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,54,6,69,33,87});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,14,-37,72,57,74,46});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,8,15});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,87,49,50,74,71,82,24,54,-75,16,86,79,-75,51,63});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -77,31,72,0,1,-34,-30,20,54,69,36,-21,30,51,52,75,-38});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,4,47,13,42,22,-66,-60,40,18,-97,84,50,16,29,4,91,7});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,67,-37,99,25,-6,63,17});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,42,17,-49,44,98,-75,35,10,46,20,10,77,17,49,37,42});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,-75,73,13,21,68,-95,29,-49,17,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,66,-9,76,-80,33,-76,63,8,57,-81});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -65,84,-93,-20,68,54,71});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,-4,7,95,19,99,83,90,-45,21,33});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,18,72,71,12,93,33,31,58,43,82,28,50,58,57});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,91,9,88,46,21,83,48,34,7,96,65,65,96,10,55,86});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -31,76,-26});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,85,17,8,3,93,-76,-11,23,-40,-60,64,33,42,63});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -65,53,23,72,6,54,54,92,99,62,35,2,-35,76,18});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -66,58,-89,52});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,81,21,39,32,43,-98,63,90,58,15});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,6,-12,98,34,67,-69,67,97,38,47,94,39,62,78,39,43});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,84,68,67,64});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,54,-29,95,74,-79,-25,84,60,21,92,7,69,55,44,84,96});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -99,95,95,38,60,79,32,30,48,-45});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,17,3,15,11,-35,8,49,94});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -45,96,22,2,-57,2,11,90,82,41,36,78,-49});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,53,51,48,3,40,85,91,67,89,6,41,69,68,69,11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -46,30,60,71,89,76,23,38,-67,-51,7,74});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,63,39,53,65,47,72,71,-99,-74,11,-76,22,-8});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,76});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,19,-81,40,62,-14,67,-30,77,86,63,81,48,66,-14,55,26,-36,-99});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,-28,5,41,59,29,2,65,3,-35,55,30,6,10,45,24});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,79,-27,89,-24,80,1,10,79,47,35,64,52,-11,-40,39,30,47});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,29,-72,86,2,-2,36,24,98,-4,44,40,92,18,34,35});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,-34});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -21,96,-71,99,-26,10});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,-87,-35,48,47,-87,60,36,-36,-21,-76,30,83,20,-88,70});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -28,33,68});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,70,-67,50,45,49,64,55,98,56,-82,81});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,50,-88,-13,50,68,33,97,-5,33,90,81,26});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,-92,79,-86,19,-96,75,-2,37,78,56,8,-86,77,88,-62,29,49});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,60,93,15,98,38,7,30,89,-73,65,-26,54,61,82,94});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,-75,72,-72,35});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -78,82,97,56,59,10,96,42,47,20,-57,55});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -22,54,-40,-88,23,36,48,34,52,61,97,49,96,18});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,90,-39,-78,20,6,45,31,67,-98,64,86,7,-2,65,78,39,75,-48});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,42,95,29,88,-31,-64,-6,95,-49,-91,15,2,61,57,92,2});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,92,47,49,27,53,14});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -16,62,39,27,37,65,-79,70,-72,91,-96,-47,8,55,68,4});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,65,63,42,91,-64,1,50,58,17,13,72,80,38,3,79});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,4,97});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,6,30});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,4,73,91,34,41,1,59,9,60,76});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,91,38,3,54,22,-1,13,5,64,24,58,-79,97});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,-46,-75,70,86,-76,48,46});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,99,10,90,29,33});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,65,6,18,13,98,98,61,17,60,69,-88});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,72,-89,50});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,60,43,60,13,6,96,87,97});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -55,81,24,82,47,86,66,97,-8,-18,49,99});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,-78,97,68,-97,-21,34,57,71,1,-10,-89});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,40,53,41,51,35,5,7,40,69,5,56,94,26,90});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,10,-44,63,25,-82});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -34,-20,-68,89,7,12});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,93,77,77,47,99,87,-10,27,82,37,0});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,18,74,0,-31,13,76,40,-20});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,32,-13,76,71,38,56,47,60,41,70,-11,75,26,-58,8,99});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,91});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -5,-27,34,12,-70,-51,18,-30,4});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,65,89,60,14,85,-17,72,37,62});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,13,-84,58,-43,-35,-37,2,67,65,21,88,95,3,-50,-84,88,-15});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,50,54,12,63,-40,-43,82,76,23,-10,17,65});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -47,83,22,15,82,-51,59,72,21,-52,14,42,14,16});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -84,-41});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,87,39,86,73,68,4,88,70,-44,23,-90,55,55,53,-1});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,67,74,88,83,68,-7,61});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,82,-2,61,92,65});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,96,90,81,55,29,42,5,16,57,-60,52,98});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,46,-37,47,56,-61,45,-70,-34,-84,7,85,28,35,45,15,11,-17,54});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,65,27,27,40,-94,22,37,78,-19,48,77,52,-54,52});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,90,-79,78,36,56,43,-81,64,27,45,8,21,75,46});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -68,93,-95,-67,-47,42,76,90,49,15});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,80,54,18,53,85,8,75,-23,56,92});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,23,20,26,15,3,76,87,27,72,12,26,15,74});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,7,9,90,44,54,40,-41,83});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -99});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,83,46,87});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,-8,93,21,39,94,76,57,3,70});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -1,89,97,31,53,41,-6,7,96,-86,33,13,75,13,-40,-11,7,66,35});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,-99,26,-2,44,-36,74,-92,47,49,65,49,70,41,-4,37});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -92,97,23,89,69,50,2,23,18,-16,-17,76,48,9,27});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -4});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -54,67,65,13,78,57,0,54,42,99,65});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 92,51,74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,90,-48,56});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10,83,-93,-61,97,80,-13,-71,10,-93,86,40});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,-32,80,77,14,61,11});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,-3,29,52,66,-34,-6,50,9,25,42,71,93,-58});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,39,90,3,-54,-91,1,31,-87,-36,66,64,89,77,72,-69,1,50});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,41,49,63,84,-69,25,63,73,54,-85,93,-24,-11});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,82,32,36,86,13});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,3,77,36,-14,60,71,36,-10,22,-4,54});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -32,25,73,46,95,70,28,-61,36,96,71,94,98,76,4,79,-26,40});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -83,-37,-67,51,31,43,55,50,35,29,48,62});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,80,61,84,48,70,48,-8,-7,-58,-35});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,4,27,7,74,70});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -94,-22,59,-11,53,60,68,69,12,20});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,95,80,-26,35,-23,85,99,-50,55});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,76,18,-74,-16,19,-10,65,10,73});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,79,16,71,9,62,47,39,27,-39,50,54});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -98,17,34,79,-76,66,9,68,22,7,86,31,41,34,67,90});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,14,-85,7,41,24,46,95,68,37,97,-66,39,57,51,-20,88,79});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -21,39,69,64});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -84,65,52,-4,74,-18,24,-93,8,91,62,36,11,25});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,46,9,91,3,-8,-15,-93,74,63,17});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,84,74,42,44,29,48,61,33,37,27,88,17,23,26,74,-88,77});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,57,-31,46,89});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,27,87,-21,16,73,25,95,17,57,18,29,32});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,-70,-52,-21,31,19,-1,52,3,-40,75,78,66,-78,70,-39});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,26,-6,97,98,57});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -6,25,-40});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,-41,41,29,81,38,81,94,86});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,27,90,65,20,79,-90});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,-71,21,26,47,43,18,6,27,44,71});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,95,33});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,98,62,99,60,44,71});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,40,9,-52,91,72,-18,36});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,-82,80,72,62,83,-73,71,65,38,43});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,90,7,83,84,73,77,-12,-77,87,45,58,76,30,88,-3,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,4,96,77,-15,-41,52});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,87,13,22,31,1});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,83});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,40,19,12,-16,13,36,-25,18,27,1});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,62});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,-16,53,-63,15,21,60,-99,17,20,72,-88,-68,65,-37,71,9,2,83});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -69,96,65,82,92,33,74,54,59});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,63,23,58,55,57,33,53});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,32,35,33,60,69,15,-51,86,22,45,82,-19,-3,-82});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,67,98,-10,40});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,65,14,26,48,75,-39,60,91,17,-82,-30,-60,-41,96,11,22,47,40});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,70,48,46});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 8,28,43,-34,-48,23,78,29});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,75,67,28,72,75,92,62,86,22,7,41,15,-88,25,15,87,91});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,16,12,67,94,12,96,-75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,55,10,-17,33,83,75,-6,44,61,-44,51,66,-84,32,15,68,-95});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-91,-21,68,88,75,86,94,46,75,-75,91});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -71,12,69});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,71,-78,14,36});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,16,98,12,76,59,91});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,44,-92,-17,4,68,19,98,21,41,85});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,-37,35,24,11,86,-48,51});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,75,55,52,39,73,41,-78,90,9,52,56,15,37,-85,71});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,-95,-43,65});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,92,38,5,67,-29,72,89,81,44});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,99,-24,81,97,-39,82,57,6,76,42,93});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,30,37,95,62,27,0,2});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 89});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,35,41,93,80,-83,-43,-79,26,14,-51,72,10,-24,3,-40,-86});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,92,51,87,27,-8,19,84,-56,93,12,8,-17});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,53,2,-15,47,84,93,-11,85,5});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,63,68,84,74,71,59,23,70,43});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,42,85,25});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -40});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,80,78,45});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -29,42,-74,-73,51,8,0,19,8,58,-45,29,11,84,-13,56,86,96,9});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -23,5,41,-60,-48});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -49,66,33,83,40,28,28,23,17,79,-62,50,54});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,46,40,79,59,93,12,99});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -20,97,41,-28,8,23,39});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,-50,38,65,-48,99,-41,90});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,11,48,38,-96,13,-61,92,61,54,51,91,69,27,64,48,13,63,60});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,16,48,31,31});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,51,48,2,61,23,21,67,-11,58,27,13,91,-65,16,98,90});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,23,78,-46,14,32});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,16,92,17,-35,31,58});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,75,48,85,54,60,9,0,11});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,-92});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,93,70,73,67,60,9,88,86,50,46,17,37,69});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,22});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,0,87,51,38,-4,35,28,74});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,16,73,66,68,25,-65,24,28,33,-52,86,28,30,35,31,-68,93,72});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,99,23,-57,48,48,31,28,72,2,73,2,85,94,6,-36});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,82,96,3,3,94,81,34,98,63,20,95});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,-26,79,48,-28,54,86,68,46,55,69,71,25,39,88,83});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,55,20,57,56,2,-39,42,68});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,54,28,43,19,76,94,49,90});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,-6,-1,94,4,15,-27,21,63,62,20,45,-73,-2,-56,65,88,-16});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,-47,76,72});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,19,2});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,23,26,15,-93,50,-72,92,14,32,63,81});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,6,74,-3,96,3,8,-86,21,-51,92,26});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,75});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,52,75,-36,16,2,67,32,-81,25,23,90,47,-19,86,61,39,3,48});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -12,42});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -14,50,42,68,73,48,6,53,-67,63,-76,34});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -18,21,-50,50,4,90,2,37,-42,94,-71,-92,57,59});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,97,13,-61,81,65,38,1,66,50});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,96,85,39,66,-76,63,0,23,1,21,27,72,40,97,27,-38,66});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,40,50,29,-47,41,44,71,-72,-97,34,31,85,17,57,67,-60});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,-43,-97,7,-65,15,39,56,54});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,36,61,58,-8,-23,68,59,-79,11,94,44,-30,75,-71,0,61});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -90,15,-83,38,-46,71,15,96,51,22,65,36});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,84,6,93,41,84,1,60,14,39,56,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 8,-97,51,65,43,64});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -91,25,-33,33,65,53,98,25,87,65,54,29,60,-61,32});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,37,-5,-27,13,58,6,-27,28,59,19,72,65});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,58,-36,29,23,20,82,86,41,72,-80,63,97,85,44,-42,83,-6,15});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,-24,41,77,71,-93,71,73,-67,1,69,18,80,87,-60,90,31});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,47,-62,18,57,94,16,84,-86,-50,37,73,34,-14,9});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,8,28,86,94,82,70,28});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,14,3,81,-21,36,18,83});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,12,31,66,13,-29,94,4,34});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,46,64,42,11,40,32,63,25,54,64,56,93,7});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,91,-94,32,-65,75,5,76,76});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,50,49,-76,9,35,-56,22,14,5,94,40,77,7,99,42});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -99,-49,94,14,47,-75,-96,31,41});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,51,73,13,68,22,49,5,34});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,34,8,84,-93,-50,25,57,71,93,83,70,24,-62,31,6,9,15});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,69,38,39,74,66,40,-30,92,-85,65,94,22,8,89});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,56,99,-84,54,-49,84,89,-21,86,-81,82,-8,38});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,0,-27,43,25,99,53});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -78,25,42,-45,93,53,-77,-83,51,-26,-35,28,-52,82,17,92,40,21,57});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,30});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,79,-15,60,31,56,69,92,30,2});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,-3,38,-35,15,11,3,-66});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,33,-7,98});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,-31,1,3,92,27,60,86,58,51,61,34,90});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,67,79,45,38,-8,17,-41,6,-65,15});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,-91,66,56,-8,80,69,-34,81,39,-78});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,33,50,95,92});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -4,79,55,9});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,73,15,16});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,45,-3,93,16,10,-77,58,87,71,-80,5,57,71,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,82,92,54,79,35});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,36,25,9,-63,-90,-31,33,-13,-42,27,29,13,-23,1,17,61});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,76,-38});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -22,20,-74,16,74,19,3,-41,52,70,59,85,81});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -87,-57,62,71,62,26,-48,63,86,-92,50,34,47,7,94,52,8,3});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -63,90,36,47,82,-18,-91,29,-71,96,-76,19,44,15,20});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,-70,92,37,35,51,-4,-10,53,-97,97,13,60,52,43,50,16,15,61});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -86,81,12,95,77,2,0,80,-37});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,72,34,74,19,29,-32,4,80,-74,22,71,37,85});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,-7,-73,36,39,54,16,-58,49,-52,57,57});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,61,-74,39,89,3,56,-8,20,-54,17,-11,40,23});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 47,49});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -44,78,47});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,-50,24,70,73,-7,31,47,57,-3,2,42,75});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,88,41,22,79,-49,54,22,13,74,70,67,28,88});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,22,-52,84,94,90,89,56,75,98,67,-35,52});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -78,43,25,-21});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 84,-28,89,-40,52,64,39,13,53,51,28,85,16,96,99,64});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,35,-15,58,29,23,57,22,20});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -1,91,35,80,-29,94,35,47,76,27,57,58,8,76});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,-53,69,2,-47,42,89,27,61,97,23,94,-74,38});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,96,22,90,30,68,-14});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -77,17});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,-6,77,12,75,93,44,6,88,27});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,91,0,-41,38,85,9,45,18});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,-94,74,18,-49,19,51,-67,77,-88,-39,54,29});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,-33,34,79});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,14,47,96,36,17,42,97,48,99,36,78,62});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,-51,68,75,5});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,49,23,92,46,43,88,75,47,19,-27,-12,89,93,-41,69,23});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -68,80,64,-16});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,77,95,84,41,29,82});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,-7,40,95,7,1});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,62,17,53,-4,34,7,26,28,76,2,-68,37,30,39});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,81,0,68,4,-66,20,95,1,38,71,92,21,40,39,51});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,82,71,21,19});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -55,55,30,85,-77,88,65,-80,-9});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,5,-29,95,17,51,23,12,82,43,-36,19,-26,-43,80,-4,61});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -85,52,90,72,18});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,78,14,-66,82,55,65,81,30,17,47,7,52,11,-81});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -19,-47,1,95,55,74,37,42,-37,89});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,-77,5,-63,61,54,28,-4,78,-70,84,22,-50});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10,-52,80,90,63,-82});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10,1,71,36,55,64,-78,91,74,80,71,51});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -70,-58,77,27,-11,57,87,28,65,-15,71,70,3,-72});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,71,35,99,69,-93,-80,-69,19,59,56,58,68,77});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 50,35,75,-34,19,37,-91,59,92,68,62,8});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-76,41,49,-4,94,33});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,56});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,9,24,-14,3,45,11,23});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,93,79,33,79,87,76,40});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,55,9,22,-73,-89,-39,73,22,22,61,-70,7,-84,17});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -25,45,-23,-5,29,13,71,70,8,14});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,10,-25,26,71,43,-79,-44,-9,88,62,11,93,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -95,8,95,-89,87,43,76,-37,61,-99,19,81,10,48});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,-76,24,21,65,-81,88,64,38,4,71,50,14,64});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -85,27,21,90,68,33,44,-83,-27,-36,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,4,22,46,31,74,20,37,28});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,44,60,83,82});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,19,-13,75,77,59,93,-13,54,12,54,94,23,33,0,58,34,8});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -27,43,34,57,48,-63,69,31,-61});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -13,83,92,18,49,44});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,8,32,36,30,81,16,17,-13,-66,96,98,-29,43});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,28,93,54,95,77,6,77,2,-89,68,-9,81,61});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -39,34,91,49,96,43,-81,0,-10,14,7,-78,45,-74,43});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,1,7,53,-80,29,67,42,11,64,96,4,75,-56,-46,40,31,-18});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,-92,9,53,24,60,93,59,83,-62,24,4,42,-24});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,82,70,-78,56,10});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -75,75,5,-38,79,83,15,30,59,-62,63,26,-10,84,14,60,-2,9});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,9,54,55,73,68,96,40,88,44,42,39,76,-51,-73,33});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,64,-46,-64,70,-18,-53,72,51,55,-26,26});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,68,-93,-94,65,73,39,49,-70,-71,43,28});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -45,13,97,75,61,97,8,42,27,20,28,55,4});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -89,-21,46,8,27,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,94,19,49,47});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,78,-50,76,16,-37,-14,9,58,89,73});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,9,31,98});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -82,32,6,43,62,3,64,24,45,78,-53,5,8,52,62,77,34,12,50});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,28,91,38,58,71});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,55,72,-21,81,-54,17,37,73,-84,44,-60,13,66});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,90,62,33,74,39,70,21,66,36,29});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,-4,-85,57,87,22,39,79,43,26,49,76,70,71,40,25,27,61,16});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -22,-14,29,-78,25,61,35,96,83,10,61});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,-31,87,68,97,59,2,68,63,62,83});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -89,50,76,59,19,-67,94,56,49,52,-52,26,32,9,0});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -75,66,78});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,42,2,24,9,89,12,57,42,90,14,74});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,45,44,99,12,39,67,80,-73,68,-47,17,39,73});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,65,89,-22,11,24,19,3,91});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,44,52,21,-40,-82,21,82,-30,57});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,6,1,28,20,52,12,34,-34,3,65,-95,0,14,20,-33,82});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -5,20,13,-54,-27,91});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,2,-49,43});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -17});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,17,8,31,52,75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,68,69,38,93,33,-60,48,26,63,77,60,-89});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -81,56,-16,0,-94,-27,33,78,95,-6,21});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,14,7,89,24,17,-26,70});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -21,-27,30,94});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,41,95,2,40,-65,42,35,8,70,41,58,53,88,9,72,26,-58,39});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,63});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,9,17,55,55,77,36,68,83,25,9,17,74,5,93});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,-70,54});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -96,22,37,-79,5,38,76,-42,-98,17,3,21,54,75,72});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -24,83,-89,19,4,56});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,73,40,-42,0,72,-29,83,31,-48,71,34,12,97,-3,-74,84,40});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,32,49,31,70,34,-92,80,42,-32});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -9,68,0,-15,42,76,59,42,35,87,32,40,98,-92});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,53,92,77,76,58,74,23,-34});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,46,78,93,9,67,37,-43,49,68,-18,-69,37,72});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,7,95,90,30,57,90,42,27,-97,60,-13,84,56,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,-54,-25,51});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,-4});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -95,81,92,69,79,71,1,99,-56,-79,57,36,-20,68});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,-50,56,83,11,9,33,-32,72,32,28,95,-18,-49,12});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -33,54,31,79,36,1,32,22,47,39,42,56,30,-44,60});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,85,-8,62,50,87,-61,95,18,49,86,-66,13});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,33,96,59,51,65,30,6,-84,23,69});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -75,46,86,17,-50,-80,20,-99,53,-87});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -24,32,46,79,-67,14,-83,69,92,97,35,-15});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,-63});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -50,18,69,-13,13,1,64,68,22,58,94,76,89,5,47,85,61,42,37});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,41,68,70,-7,-55,12,-52,-59,21,91,67,82,66,64,-41,84,48,44});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 10,0,23,7,37,86,55,72,-25});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,26,1,18,81,35});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,16,37,-68,33,-71,-48,4});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,24,81});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,87,31,13,41,53,66,47,95,57,13,76,31,4,44});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,6,33,3,74,7,66,35,66,91,86,58,59});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,68,36});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 21,11,21,42,61,24,7,91,1,19,73,55,-52,32,44,97});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,48,22,63,69,2,-93,98,76,90,9,4,13,29});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,-42,74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 2,2,43,78,6,86,82,35,43,27,-98});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,44});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,-42,43,9,64,10,-31,31,80,56,42,-52,22,33,24});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,29,35,90,7,5,55,-53,20,81,10,82,-57,18,48});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,52,50,31,1,76,25});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,-19,36,-77,-8,77,56,-65,90,50,9,57,17,50,71,87,9,67});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 47,-56});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,76,99,16,65,2,61,71,-27,48,0,-5,-32,76,45,89,-27});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -95,70,10,-79,91,25,95,57,30,14,65,35,52,56,3});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,34,-86,56,14,97});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,32,-51,-4,-45});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,79,27,52,80,42,67,85,69,55,67,16});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,28,-98,34,-61,49,6});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -30,75,46,46,-70,82,-92,86});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,22});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,72,-25,6,73});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,-9,73,29,5,31,90,89});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,72,45,11,61,47,37});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -47,67,19,13,90,9,83,73,-30,29,-13,56,65,1,19});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,67,81,49,-23,20,11,62,-27,90,29,9,24,-42});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,60,39,43,38,35});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,56,7,-22,84,2});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,36,90,93,57,-28});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,-11,-19,97,28,10,73,-43,49,65,3});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,93,-1,-77,39,-7,-76,57,47,64,79,21,86});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,0,65,61,-79,-69,73,-34,80,79,74,1,23,74,63,65,77,62});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -48,1,36,72,11,-75,-30,-65,37,63,99,94,-87});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -75,92,35,9,6,31,86,58,73,47,58,20,52,75,-37,8,-92,94});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 47,16,72,-65});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,46,8,81,35});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -73,-84,41,50,-50,57,-63,5,79,2,90});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -24,96,76,72,-54,47,50,-59,12,38,61,25,-4,60,20,30,38,73});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -49,-37,44,-44,-12,-43,31,74,30,-95,-6,-15,29,-84,41,13});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,-6,67,44,73,13,-11,81,71});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,-88,96,-97,58,52,16,33,44,30,11,-44,99,46});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -23,15,43,35,68,12,84,12,-50,-94,25,31,-42,75,72,66});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,48,-71,61,91,-14,37,59,50,44,37,77,99,5,83,17,54,38,-39});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,-51,-26});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,53,35,-65,79});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,88,-92,16,15,75,21,-12,15,74,50,10,27,47,-9});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,29,6,16,87,73,-19,32,35,62});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,34,-32});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,-1,78,53});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -12,57,67,34,66,58,-84,-71,33,-25,-8,92,19,16,28,81});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -19,51,22,39,-42,69,-52,2,-50,5,15,-63,90,-9,40,82,-24,73,8});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -32,50});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,91,44,26,79,26,-40});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -39,58,-23,1,34,55,60,14,83,77,76,-31,61,75,50,57,96,-48});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,-15,-37,4});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -31,84,34,38,81,-71,63,35,-58,71,76,44,76,41,-18,49,64,86,-97});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,-85,79,47,93,4,-7});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-64,87,99,25,-6,33,37,74,79,99,15,5,24});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,78,-76,50,14,7,89,51,37});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,15,60,71,-52,8,-45,58,20,26,66});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,30});
        org.junit.Assert.assertEquals( (int) 1, result);
    }
}

