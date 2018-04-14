package java_programs;


public class LIS_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,3,37,-36,66,42,48,96,63,-51,57});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,5,34,90,66,97,78,98,-18,92,65,7,15,93,43,74,-33});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -6,58,-56,38,15,95,12,72,50,-86,13,-19,57,23,-12,84,24,52,-59});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,86,21,-27,94,25,45,99,1,76,65,83,-36});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,14,-87,70,60,78,7,-52,-25,81,18});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,35,-62,-32,0,21,-42,47,-41,55,-9,36,48,82,19,8,22,46});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,69,4,97,-76});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,71,73,40,-67,-73,-6,68,-13});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,51,94,16,-23,-34,-61,50,64,99,-87,-24,44});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -75,-24,48});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,44,-42,78,34,-59,-63,2,31,21,22,9,-45,75,91});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 24,31,62,76,61,71,-13,95,-45,-61,23,84,45,1,32});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 44,74,72,94,65,78,53,-38,67,90,31,6,2});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,53,-70,16,28,-9,99,98,19,85,74,67});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,-8,-20,14,68});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,-44,83,94,47,3,57});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,81,18,60,57});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,56,90,54,51,70,-77,-33,16,20,66,99,84,10,-87,-85});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -56,24});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,-40,-56,31,54,11,36,-60,96});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,29,62,-20,16,4,15,36,13,22,-99,33,70,76});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,7,60,67,71,54,15,-25,93,32,55,17,40,52,51,0,10,30,-35});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73,38,-8,82,-69,47,90,29,33,26,98,16,9,15});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,-82,8,98,-48,19,90,-34,1});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,80,36,-46,49,28,91,27});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,41,-18,40,-39,-84,84,8,-24,-92,66,86,83,38,32,7,24,48});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 89,71,63});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,72,54});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,45,84,-46,60,20,78,39,2,61});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -74,99,29,14,-54,49});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -96,12,38,36,-53,31,35,43,80,17,33,40,25});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,55,26,96,-58});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -18,39,73,30,72,-19,62});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,-85,91,4,-76,72,-72,42,29,95,-35,50,34,5,21,86,33,78,81});
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,-9,71});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -69,64,57,98,92,-77,79});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -53,74,37,90,35,73,-73});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,6,47,-51,-61,55,96,78});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,-18});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,27});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-28,55,33,-31,-58,93,25,74,66});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,27,42,81});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,14,9,-64,3,48,76,-47,-58,39,43,38,98,66,53});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,77,61,-62,13,70,37,53,48,79,46,-24,98,25});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,-68,40,-3,80,96,5,-36,53,-56,47});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 6,95,52,84,2});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,7,-83,-27,82,19,31,34});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 43,77});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -85,21,89,23,-7,-43,-70,96});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -16});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -54,-68,10,18,3,27,40,48,0,5,-74,95,82,-12,24});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,62,17,89,51,90,32,41,12,67,47,98,14,-56,9,-55});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,32,20,57,8});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,-72,88,85,58,11,60,4,62,7,25,57,56,41,20,94,10,-84});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,7,-2,87,82,-91,50,-18,29,49,13,96,73,92,84,38,64,22});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,1,-11,4,13,30,19,92,60,-15,58,95,86});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -83,50,-77,99,23,81,37,36,-20,1,25,94,2,55});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,86,22,95,11,36,38,88,40,32,76,-83,17,71,70,65,0});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -43,84,65,17,21,-29,-44,-13,86,52,64,59,89,-66,80,16});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -1,8,99,72,15,-10,-63,-37,-80,31,93,61,35,85,12,57});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -91,6,62,59,-1,17,12,99,-95,56,86,61,-24,94,27,84,74,18,60});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -91,77,45,-8,38,95});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,45});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -74,56,43,82,30,27,68});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16,1,0,55,-33,56,89,38,54,47,-38});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 61,37,48,39,11,-8,14,91,21});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,16,-27,82,95,9,11,20,96,70});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,98,48,-48,57,-8,10,89,34,-75,-15});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,7,-94,96,75,-99,-11,76,98,5,-32});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,82,28,40,74,3,49});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -82,70,50,40,-74,57,15,18});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -12,51,88,30,-28,93,72,-36,0,-72,29,-87,5});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 8,64,71,55,45,-93,63,0,50,31,97});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,-38,85,3,-23,81,0});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 64,15,96,75,62,94,-45});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,24,-86,-59,97,-80,0});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,-9,94,45,6,-98,40,58,-60,84,8,16,67,28});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,84,71,18,7,27,8});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,93,60,19,-15,92,28,44,46,-57,-9,65,4,0,56,1});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,88,10,-27,-79,77,29,8,85,22,44,37,55});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,22,95,83,8,51,1});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,-22,45});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,47,77,98,33,60,49,63,13,37});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 85,61,4,3,-61,38,73,49,1,62,-63});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,81,28,90,69,43,50,71,93,95,-31,51,-45,85,80,1,18});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,65,21,83,25,61,37,-71,72,-29,27});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-89,-84,12,32,-73,46,5,-72,37});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 55,36,62,89,15,22,14,-84,95,56,68,63,54,85,23,53});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,3,-11,15,36,-20,18,70,66,44});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -76,-9,73,38,71,21,5,65,1,35,-38,99,40,-19,45});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,-46});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,40});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,85,-64,-42,97,75,33,68});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,74,-72,61,73,38,11,78,88,-53,87,14,40,37,94,28});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,56,19,2,26,61,-12,44,75,35,-59,60,89,-78,-56});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,90,60,37,-25,61,-32,-40,-29,-85,64,-24,79});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 65,39,20,-17,56,35,34,89,-24,-30,49,-45,19,50,97,2,78,38});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -43,87,11,53,-69,60,7,45,41,34,92,56,40});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,54});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,97,12,62,19,4,42,-63,46,-26,77,85,29,59,68,-17});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 77,59,-64,45,43,83,82,13,19,-61,30,39,37,27});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,30,3});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 62,21,-84,50,32,96,41,-20,7,91,22,85,-64});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,-40,80});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,99,44,14,6,98,89,51,58,17,77,90,69});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,25,64,0,-98,-66,37,75,53});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,-45,86,-90,90,5,0,60,72,24,33,13,-66});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -74,-42,72,22,-11,66,73,33,79,1,-69,86,30});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,13,74,68,-23,2});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,93,65,4,84,99,-3});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,59,60,15,81,2,90,48,33,35,76,7});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -88,67,-9,90});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -31,6,41,25,46,-85});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -68,58,43,-44,54,2,3,-13,41});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -22,48,8,49,-88,-75,55,-13,50,70,77,16,-91,-28,59});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -65,49,-85,50,27,33});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 39,-63,40,92,80,7,53,55,42,64,72,62,77,12,8});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,89,51,-31});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 34,52,4,48,80,27,90,21});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,50,54,27,1,91,4,79,-52,61,80,92,-63,-71,25,62,-57,38,-80});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,6});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,37,3,84,-62,70,4,-24,16,88,10,57,83,92,47});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,75,32});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 15,44,-77,21,-46,48,97,8,-53,10,13,83,82,55});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,-12,37});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -47,85,39,87,6,41,80,15,47,82,49});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -55,68,20,-17,48,59,6,28,75});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,31});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -70,95,28,75,50,64,12,-35,-72,-88});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,-51,6,-13,-18,23,68,55,9,66,18,-75,37,65,11,51,28});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 82,77,50,21,73,22,74,46,69,25,72,32,94,-38,39,14});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,26,43,-12,61,49,47,-26,6,48,93,58,16,-10,88,56,59,-44});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -14,38,-72,51,72,74,60,4,-55,15,-35,71,-25,22});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -18,83,-13,66,18,78,63,85,9,41,59,-6,1,81,17,5});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 91,17,-24,2,97,53,-55,77,-8,67,52,3,87,-37});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,63,78,16,-21,-75,-18,61,43});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 57,71,-92,54});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,74,-19,-8,58,-12,66,35,64,83,0,40,48,84,24,93,82,36});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,20,86,-36,35,-44,29,34,80,-20,-22,55});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,62,-35,41,38,61,32,31,-21});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -36,15,-99,57,16,22,75,46,49,-71});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -43,37,13,-61,70});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 69,92,58});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,28,-6,18,-35,67,-28,48,23});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -82,62,31,28,91,5,84,79,-28,-21,35,-7,77,98,67,-39});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,7,85,-65,49,32,33,59,22,58,-91,5,48,-14,23});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,76,17,-18,8,10,23,51,18,34,12,31,86,37,84,68,94});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,98,-41,32,16,53,92,48,64,75,80,-36,63,-12});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,-29,-91,73,34,71,41,16,54,49,26,79,22,32,50,39});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,94,40,46,84,-14,51});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,39,-76,53,81,95,-45,-60});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 93,39});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,-47,-56,-2,6,-54});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,45,81,99,69,-21,90,87,59,3,26,42,95,74,64,10,17,15});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -81,84,17,49,93,-50,6});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 48,16,36,82});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,15});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -57,92,44,96,3,-88,41,98,-34,28,70,17,23});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,15,21,99,-87,-89,22,77});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,38,13,0,44,64,62,8,41,1,-12,58});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 22,57,53,-51,46,-61,93,97,84,74,-33,73,-50});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,-67,10,90,86});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 73});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,84,17,11,74});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 30,-6,17,20,-64,23,74,6,55,-84,-42});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -56,79,46,24,29,35,55,42,94,58,54,-91,19,78,43,76,6,7,75});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 80,84,-37,66,96,83,52});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 51,85,45,50,15,61});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,89,97,-21,47,12,36,28,-41,48,59,24,66,-90,90,61,-95,-98,32});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,8,3,70,59,82,-13,-20,5,61,-63,53,33,34,57,40,28});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,96,29,2,63,20,-12});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,72,28,68,67,-88,-95,-40,37,-20,84});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,57,70,72,8,-98,19,76,3,34,38,36,18,46});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,13,39,-68,73,95,15,78,8,5,71,2,-54,49,23});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,84,76,-53,24,47,66,-4,58,97,95,40,64,-67});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,61,-62,-65,55,23,31,43,81,66,-57});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 29,44,45,42,46,60,4,19,65,62});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -15});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -41,17,78,-20,41,62,1,-14});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,49,78,57,28,89,71,38,82,-98,90,96,91,67,95});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 13,47,-93,8,96,66,51,1,-75,6,71,49,67});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72,-75,77,1,54,62,34,79,98,-70,52});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 54,70,2,-59,96,-78,3,-34,10,16});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -55,26,84,6});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,-2,20,99});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 60,-29,-25,-80,13,81,57,58,68,-23,43,21,15,42,93,78});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,77,45,67,96,29,35,-12,48,5,6,94,34,-74});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -81,47,74,82,-69,39,72});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,83,68,24,84,55,-81,-89});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,81,13,98,94,14,75,71,74,96,28,-59,27,-46,43});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 12,7});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,-31,92,-43,-57,36,85,58});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,6,-79,30});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 33,48,15,42,39,11,-6,-85,-92,-47,31,-15,8,-48,45,4,84});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,-59,-57,-79,82,47,-96,54,0,69,31,-36,35});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 9,36,77,47,15,44,97,50,-12,60,6,21,17,71,5,75});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,54,13,-38,-58,-39,29,71,56,53,99,-37,-88,86,93,-48});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 16});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 58,75,49,19,-5,-68,-1,-94,92,71,46,53,97,78,96,-30,4});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -82,70,61,0,81,30,8,39});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 1,44,16,25,18,97});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 86,60,11,32});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,-80,48,1,0,62,-85,6,59,66,75,30,20,97,29});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 18,93,-65,-51,53,33,21,67});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,23,71,96,73,58,85,51,0,84,-84,29,-86,-11,92,18,52,32});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 46,38,69,-30,18,-22,-27,41,-46,-44,66,-69,-53});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -21,88,-66});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,-86,-32,72,7,96,-51,14,25,-7,48,43,-44});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 94,51,63,83,-25,30,12,75});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,85,15,2,58,60});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,98,34,52});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,0,61,52,76});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -73,90,47,17});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 52,28,29,76,63,91,78,27,75,61,9,3,74,73,-41,95});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 4,-54,47});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -70,46,-22,83,53,95,59,41,32});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,1,98,33,50});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -83,61,67,-41,55});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 45,-74,-6});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 70,92,48,72,85,2,87,-8,57,35,13,50,52,3,44});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,23,-65,67,75,74,-91,-12,0,44,81,42});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 79,-78,98,-21,26,31,40,81,76,42,-32,74,19,3,-71,1});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -52,90,62,71,67,-27,-84,-66,-19,51,53,85,-37,23});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,88,91,-80,56,-7,33,-25,-3,54,15,63,51,46,12});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 5,87,59,83,8,72});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 56,2,3,59,41,45,85,-36});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,-35,-94});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 59,-63,18,73,-24,12,75,-99,-73,20,72,58});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,77,16,46,7,78,-10,63,41,44,67,58,35,66,4,73,40});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 25,15});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67,27,77,50});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 36,31,21,38,83,57,52,-52,69,51,23,5,40,1,39,61});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 38,75,61,29,50,97,65,22,17,84});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 49,-11,64,69,86,-96,-61,-84});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -82});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 47,4,29,28,66,83,58,92,24,32,-43,2,-20,45,-61});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 88,-91});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 78,7,-18,93,66,17,56,24,-53,73,28,60});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -96,27,-50,69,-7,-8,-51,83});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 11,35,50,84,54,92,67,23,0,-53,38,47,95,-12,88});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -22,78,31,68,-39,-14});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 0,-99,74,3,43,22,24,30,93,-80,19,-85,95,54,46});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-35,98,32,40,23,39,-56,17,29,-59,-8,53,68,97});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 97,35,-61,15,71,73,3});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,63,13,72,41,44,60,84,6,31,57,2,92,33,75,56,27});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 81,52,-32,44,40});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 27,26,21,76});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 90,63,17,88,27,45,-65,34,67,37});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 66,4});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 75,91,84,23,77,98,41,19,-70,16,7,12,70,48,22,20,67,79,36});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 14,33,-18,-56,68,-47,74,7,29,65,77,82,38,-86});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 67});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 42,12,6,66,1,65,25,3,23,47,13,59,51,33,73,38});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 3,25,11,30,-13,85,31,88});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -1,31,6,61,87,64,15,44,41,80,50,24,78,4,-12,54,20,-41});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 32,-51,35,52,7,2,31,4,49,45,47,40,8,72,34,57,29,64});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 19,-73,23,62,8,26,30,12,-72,-88,58,77});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -44,9,0,-99,17,89,10,65,46,28,96,30,16,32,48,67});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 40,0,88});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 98,-31,-30,80,1,8,72,21,78,99,15,26,18,-9,-70});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -23,32,51,30,55,1,-62,4,-17,61});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 87,75,51,7,-19,36,28});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -15,78,86,93,24,68,59,20,26,-22,9,39,-76,40});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 95,18,29,78,16,-69,14,63,31,3,1,17,20,5,-77,36,77});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 20,25});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 76,64});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -59,84,-2,38,70,63,-68,35,37,85,-16});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 35,-5,79,32});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 26,54,12,17,42});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 99,72,15,-52,9,-86,47,92,1,43,70,20,89,74,16,76});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,79,84,64,27,-6,35,89,6,2,74,40,-46,56,-93});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -13});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -65,70,26});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 37,26});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 96,31,-88,-75,65,19,12,18,23,66,77,8,-16,55,32,1,99});
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -22,70,37,88,15,66,6,48});
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -81,82,29,92,62,3,-90,60,25,-55,-73,40,53,0,71,63,-39});
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 53,38,9,36,91,76,97,-26,57,81,90,-82,58,-57,56,-69,68});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 74,8});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 28,73,79,44,66,68,32,-75});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 31,97,62,-90});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 63,54,58,51,76,98,71,57,-52,-53,0,27,14});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 17,-88,64,16,44,78,32,65,22,-43,-26,27,-25,6,73,-47,25,77,38});
        org.junit.Assert.assertEquals( (int) 7, result);
    }
}

