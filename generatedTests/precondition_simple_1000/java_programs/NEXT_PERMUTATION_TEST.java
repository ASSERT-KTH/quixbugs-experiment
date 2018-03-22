package java_programs;


public class NEXT_PERMUTATION_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, -41, -15, 50, 83, 51, 84, 20, 88, 24, -30, 61, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,-41,-15,50,83,51,84,20,88,24,-30,94,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 97, 6, -40, 45, -19, -54, 86, 87, 55, 88, 26, -27, 91, 30, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,64,97,6,-40,45,-19,-54,86,87,55,88,26,-27,91,31,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 85, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,-78,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -34, -66, -68, -5, 71, 41, 10, -12, 79, 17, 51, 86, 87, 24, 56, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-34,-66,-68,-5,71,41,10,-12,79,17,51,86,87,24,89,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 50, 19, 69, 86, 40, 57, 91, 12, -95, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,50,19,69,86,40,57,91,12,-47,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -87, 72, 42, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-87,72,43,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 37, 7, 71, 8, -74, 41, 10, 12, 77, -50, 18, -27, -91, 27, 60, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,37,7,71,8,-74,41,10,12,77,-50,18,-27,-91,60,-62,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 37, 9, -12, 76, 46, 16, -23, 25, -58, -92, 92, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,37,9,-12,76,46,16,-23,25,-58,31,-92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, -68, 73, 12, 78, 82, 19, 52, -87, 23, 24, 89, 26, 59, 91, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-68,73,12,78,82,19,52,-87,23,24,89,26,91,29,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 99, 44, 12, 62, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,99,44,15,12,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(53, 39, 7, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,39,61,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 82, 35, -37, 69, 6, 89, 42, 27, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,82,35,-37,69,6,89,42,79,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 32, 3, 72, -10, 13, 14, 16, -54, 90, 92, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,64,32,3,72,-10,13,14,16,-54,90,95,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 5, 86, 55, -9, 58, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,5,86,55,30,-9,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 69, 40, 75, 44, 13, 18, 50, 20, 85, 55, 90, 27, 28, 60, -31, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,69,40,75,44,13,18,50,20,85,55,90,27,28,60,-31,63,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 50, 20, 72, 90, 75, 92, 62, -48, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,50,20,72,90,75,92,62,63,-48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(13, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 96, -68, 35, 99, -21, 6, 38, 39, -72, 24, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,96,-68,35,99,-21,6,38,39,15,-72,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, -8, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-99,-8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 2, 35, -36, -70, -7, 39, 40, 41, 10, -44, -80, 81, 18, 19, 84, 21, 59, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,2,35,-36,-70,-7,39,40,41,10,-44,-80,81,18,19,84,21,92,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 74, 10, -43, 45, -46, 48, 49, 53, 22, -58, 90, 29, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,74,10,-43,45,-46,48,49,53,22,-58,90,29,94,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -33, 65, 72, 12, -18, 50, 19, -52, 90, 61, 94, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-33,65,72,12,-18,50,19,-52,90,61,94,63,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 34, -3, 2, 37, 70, -9, -74, 9, -13, 15, 82, 50, 84, 56, 89, -91, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,34,-3,2,37,70,-9,-74,9,-13,15,82,50,84,56,89,-30,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 17, 84, 21, 22, -77, 45, 62, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,17,84,21,22,-77,47,45,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 80, 0, 49, 34, 82, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,80,0,49,56,34,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -69, 69, 76, 77, 14, 15, 83, 86, 26, 91, 27, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-69,69,76,77,14,15,83,86,26,91,95,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 4, 36, 5, 40, 72, 10, 42, 11, 12, 16, -49, 85, 90, 26, 61, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,4,36,5,40,72,10,42,11,12,16,-49,85,90,26,61,31,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 34, 3, 35, 37, 7, 71, 43, 12, -77, -80, 82, 54, 92, -29, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,34,3,35,37,7,71,43,12,-77,-80,82,54,92,93,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 80, -65, 18, 19, 86, 87, -41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,80,-65,18,19,87,-41,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -34, 35, 68, 36, 38, -47, 78, -80, -50, 84, -22, 89, -60, 29, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-34,35,68,36,38,-47,78,-80,-50,84,-22,89,29,-64,-60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 17, 51, -5, 70, 22, 24, -13, 77, 61, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,17,51,-5,70,22,24,29,-13,61,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(88, 41, -74, -75, 60, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,41,-74,-64,-75,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(5, 69, 42, -76, -29, 77, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,69,42,-76,15,-29,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 65, 99, 86, 87, 8, 46, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,65,99,86,87,8,47,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 50, 39, -88, 8, -62, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,32,50,39,-88,8,30,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, -51, -35, 20, 6, -72, 55, 74, 27, 60, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-51,-35,20,6,-72,55,74,45,27,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -34, 17, -2, 35, 71, 7, 40, 13, 30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-34,17,-2,35,71,7,40,13,79,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 5, -7, 12, 76, 13, 46, 80, 16, -51, -87, 22, 88, 89, 92, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,5,-7,12,76,13,46,80,16,-51,-87,22,88,92,-64,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 66, 85, 88, -92, 76, 61, 45, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,66,85,88,14,-92,45,61,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(41, 44, 79, 16, 49, 82, 88, 25, -58, 26, -60, 59, 92, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,44,79,16,49,82,88,25,-58,26,-60,63,59,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 98, 18, 52, 68, 70, 87, 74, 26, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,98,18,52,68,74,14,26,70,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 98, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,8,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 97, 2, 37, 21, 55, -94, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,97,2,37,21,55,61,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-58, 59, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,60,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 66, 22, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,66,86,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 4, 8, 43, 13, 46, 49, -84, 20, 52, 84, 85, 54, 56, 28, -29, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,4,8,43,13,46,49,-84,20,52,84,85,54,56,28,93,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 6, -24, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,6,62,-24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, -90, -77, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,-90,44,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 98, 4, 6, -73, 43, -46, 13, 14, -51, 85, 54, 23, 87, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,98,4,6,-73,43,-46,13,14,-51,85,54,58,23,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 50, -54, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,97,50,-54,63,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 0, 65, 1, 35, -38, 69, 7, 9, 43, -13, 46, 14, 48, -18, 85, 24, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,0,65,1,35,-38,69,7,9,43,-13,46,14,48,-18,85,28,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 0, 97, 2, 34, 8, -13, -85, 21, 54, 24, 58, 91, -92, -61, 93, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,0,97,2,34,8,-13,-85,21,54,24,58,91,-92,93,-95,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 20, 69, 85, 21, -86, 38, 73, 91, 76, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,20,69,85,21,-86,38,76,47,73,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 81, 86, -71, -55, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,81,86,-71,47,-55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 5, 72, 9, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,5,72,75,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 97, 51, 69, 53, 55, 41, 27, 44, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,97,51,69,53,55,41,44,-30,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 34, 40, 12, 46, 49, 17, 18, -83, 24, 58, 92, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,34,40,12,46,49,17,18,-83,24,63,58,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 2, 66, 6, 7, 10, -78, 18, 22, 54, -94, 93, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,2,66,6,7,10,-78,18,22,54,-94,95,31,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, -86, 54, 7, -90, 57, 76, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,-86,54,7,-90,63,57,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 67, 85, 86, 71, -56, 87, 12, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,67,85,86,71,-56,87,61,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, -5, 41, 9, -82, -18, 19, 21, 23, 87, 56, 25, -58, 89, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,1,-5,41,9,-82,-18,19,21,23,87,56,25,28,-58,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 7, 42, 45, 78, 16, 50, 83, 20, 55, 60, 28, 31, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,7,42,45,78,16,50,83,20,55,60,31,-96,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(26, 11, -46, -15, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,11,-46,47,-15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 28, 45, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,28,79,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 69, 6, 7, 47, 49, 18, 84, 86, 55, 57, 62, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,69,6,7,47,49,18,84,86,55,62,-63,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 84, -26, 89, 9, -92, 45, 14, -15, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,84,-26,89,9,-15,-96,-92,14,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, 20, 24, 25, -11, 28, 77, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,97,20,24,25,-11,29,28,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, 18, 34, 51, 35, 84, 55, 74, 59, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,18,34,51,35,84,59,30,55,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 70, -94, -48, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,70,-94,15,-48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 37, -38, 56, -89, 9, 25, 12, -29, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,37,-38,56,-89,9,25,12,-29,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 33, 98, 3, 67, 68, -9, 73, 15, 52, -25, -58, 59, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,33,98,3,67,68,-9,73,15,52,-25,-58,60,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 33, 7, 73, 74, -78, 15, -83, 18, -25, -26, 89, 57, 26, 59, 91, 29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,33,7,73,74,-78,15,-83,18,-25,-26,89,57,26,59,91,63,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -67, 67, 99, 52, 5, 55, 24, 10, 76, 15, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-67,67,99,52,5,55,24,10,76,79,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -2, 67, 5, -70, 69, 39, 75, 46, 53, -86, 85, 86, 87, -57, 25, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-2,67,5,-70,69,39,75,46,53,-86,85,86,87,-57,92,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -83, 86, 54, 25, -42, 43, 91, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-83,86,54,25,-42,91,-48,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 97, 2, -5, 9, 58, -45, 13, 45, 30, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,97,2,-5,9,58,-45,13,45,94,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 3, 84, 36, 38, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,3,84,38,8,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 8, 27, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,8,79,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -83, 50, 53, 74, 28, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-83,50,53,74,79,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 66, 38, 6, 8, 26, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,66,38,6,8,91,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -33, 10, 42, 11, 43, -47, -83, 56, 90, 58, 26, 59, 60, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-33,10,42,11,43,-47,-83,56,90,58,26,60,29,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 98, 35, -38, 70, 8, 9, 45, 17, 18, 19, 53, -23, 59, 60, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,98,35,-38,70,8,9,45,17,18,19,53,-23,59,94,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 18, 68, 42, 27, 11, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,18,68,42,27,15,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, 3, 36, 38, 10, 45, -80, 80, -21, 84, 56, 25, -29, 30, -31, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,1,3,36,38,10,45,-80,80,-21,84,56,25,-29,30,31,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, -72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 0, 68, 10, 11, 76, -48, 79, 16, 18, -83, 19, 85, -87, 54, 88, 59, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,0,68,10,11,76,-48,79,16,18,-83,19,85,-87,54,88,59,62,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 98, -99, 36, 37, 86, 57, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,98,-99,36,57,28,37,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 20, -87, -39, 40, 56, -75, 78, -64, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,20,-87,-39,40,56,-75,78,47,-64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 36, -5, 72, 73, -74, 10, 46, 49, 53, 55, -26, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,36,-5,72,73,-74,10,46,49,53,55,91,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 33, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,-97,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 2, 35, 83, 88, 10, 92, 46, 47, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,2,35,83,88,10,92,47,-32,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 36, 38, 39, 29, 45, 93, 31, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,36,38,39,29,45,93,79,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 32, 6, -40, 42, -44, 79, -17, 82, 19, -54, -24, 88, 25, 91, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,32,6,-40,42,-44,79,-17,82,19,-54,-24,88,60,25,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 16, 0, 83, -24, 56, -89, -90, 41, -47, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,16,0,83,-24,56,-89,-90,41,31,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, 66, -8, 41, -79, 17, 18, 51, -52, -23, 87, 58, 92, 63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,66,-8,41,-79,17,18,51,-52,-23,87,58,92,95,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -35, -84, -85, 89, 95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-35,-84,-85,95,63,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 82, 51, 83, 84, -23, 88, 24, -62, 46, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,82,51,83,84,-23,88,24,-62,94,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -51, 98, 68, 56, -42, -74, 89, 12, -93, 45, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-51,98,68,56,-42,-74,89,12,-93,95,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 35, -40, 73, -74, 42, 13, 48, 19, -55, 56, -58, 59, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,35,-40,73,-74,42,13,48,19,-55,56,28,-58,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-83, 34, 87, -57, 8, 44, 93, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,34,87,-57,8,93,-32,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -67, 50, -6, 72, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-67,50,28,-6,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 67, 71, 72, 73, -45, 76, -46, -15, 50, 55, 88, 26, 59, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,67,71,72,73,-45,76,-46,-15,50,55,88,26,59,63,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 16, 1, -50, 98, 69, -70, 53, -58, 58, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,16,1,-50,98,69,-70,53,13,-58,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52, 68, 38, 73, -59, 43, 75, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,68,38,73,-59,43,94,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76,-34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 51, -38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-84, 85, 69, 23, 40, 42, -94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,85,69,23,40,42,30,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 35, 67, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,67,7,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 39, 71, -15, 46, -22, 87, 23, -31, 94, 30, -95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,39,71,-15,46,-22,87,23,-31,94,30,63,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 81, 2, -19, 85, -55, 76, 77, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,81,2,-19,85,-55,77,63,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 51, 37, 57, 27, 44, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,51,37,57,31,27,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 97, 73, -12, 12, 78, 82, 18, 21, 30, 95, 63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,97,73,-12,12,78,82,18,21,31,30,63,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -66, 65, -99, 77, -17, 82, 84, 86, 55, -27, 62, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-66,65,-99,77,-17,82,84,86,55,62,-64,-27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 99, 56, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,99,74,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -65, 96, 34, 72, 74, 42, 75, 12, -77, 14, 16, 83, -21, 84, -28, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-65,96,34,72,74,42,75,12,-77,14,16,83,-21,84,92,-28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(58, -45, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,79,-45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -81, -35, 18, 99, 52, 39, -57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,-81,-35,39,-57,18,52,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, -18, -99, 54, 74, 26, 59, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,-18,-99,54,74,26,75,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-84, 87, 8, -90, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,87,8,94,-90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 2, 21, 7, -44, -63, 46, 78, 94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,2,21,7,-44,-63,46,94,62,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 0, 34, 8, 11, -76, 81, -51, 83, -85, 84, 54, 91, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,0,34,8,11,-76,81,-51,83,-85,84,91,31,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 34, -4, 35, 54, 7, 72, -41, 11, 92, -46, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,34,-4,35,54,7,72,-41,11,92,79,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, 34, 36, -69, 5, 39, 10, 14, 48, 82, 19, 53, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,97,34,36,-69,5,39,10,14,48,82,19,53,95,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 82, -3, 53, -9, 72, 41, 73, -91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,82,-3,53,-9,72,73,-91,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 67, 37, 40, 41, 74, 15, 49, 84, 20, 55, 56, 24, 89, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,67,37,40,41,74,15,49,84,20,55,56,89,-62,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,-36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 96, 65, 34, 5, 71, 76, 77, 47, -82, 52, 53, 21, 25, 61, -31, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,96,65,34,5,71,76,77,47,-82,52,53,21,25,61,62,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 41, 89, 42, 75, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,41,89,75,29,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 35, 52, 54, 70, 71, 93, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,35,52,54,70,93,-46,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, -25, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,30,-25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 68, 4, -6, 8, 15, 80, -18, 18, -57, 91, 59, 60, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,68,4,-6,8,15,80,-18,18,-57,91,60,30,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 4, 6, 70, 10, 76, 16, 50, 20, 21, 53, 86, 89, 91, 60, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,4,6,70,10,76,16,50,20,21,53,86,91,-94,60,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 99, -6, 71, 8, 40, -13, 78, -51, 86, -88, 56, 25, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,99,-6,71,8,40,-13,78,-51,86,-88,56,93,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 69, 6, 76, 77, -48, 80, 81, -82, 50, 19, 22, 24, 25, 27, 29, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,69,6,76,77,-48,80,81,-82,50,19,22,24,25,27,95,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 5, 53, -59, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,5,53,94,-59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -83, 35, 67, 52, 36, 38, 23, 8, -61, 45, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-83,35,67,52,36,38,23,8,45,-95,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -49, 19, 51, 38, -73, 72, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-49,19,51,38,13,-73,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 68, 71, 7, 15, 49, 84, 54, 22, 88, 25, 59, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,68,71,7,15,49,84,54,22,88,59,-94,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 86, 87, 58, 59, 13, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,86,87,58,59,63,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 20, 37, 69, 57, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,20,37,69,75,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 16, 1, 34, 2, 70, 23, 87, 8, 77, -96, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,16,1,34,2,70,23,87,8,77,79,-96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 33, -35, 34, 67, 37, 70, 72, -82, 83, 84, 86, 87, -59, 28, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,33,-35,34,67,37,70,72,-82,83,84,86,87,-59,95,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 82, -55, 93, 13, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,82,-55,93,46,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 1, -68, 40, 44, -45, -52, -85, 84, 21, 23, 59, 92, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,1,-68,40,44,-45,-52,-85,84,21,23,59,94,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 6, 26, 11, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,6,26,45,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 18, 66, 2, 52, 92, 61, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,18,66,2,61,-15,52,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 83, 3, 4, 53, 23, 40, 11, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,83,3,4,53,23,40,60,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, -68, 71, 88, 73, 58, 44, 14, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,-68,73,-32,14,44,58,71,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -50, -6, 85, 6, 39, 40, -60, 44, 14, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-50,-6,85,6,39,40,-60,44,79,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 69, 41, 42, 10, -12, 78, 15, 17, 19, 21, 54, 56, 57, -59, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,69,41,42,10,-12,78,15,17,19,21,54,56,57,62,-59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 66, 5, 55, -89, 88, 75, 93, 62, 63, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,66,5,55,-89,88,75,93,63,15,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 84, -90, -91, 28, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,84,-90,-91,47,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -50, 35, 84, -55, 23, 39, 56, 72, 61, -80, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-50,35,84,-55,23,39,56,72,61,47,-80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -67, 52, 36, 38, 88, 8, 9, 41, 92, 94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-67,52,36,38,88,8,9,41,94,62,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 2, 37, 71, 7, 39, 74, -76, 76, 15, 85, 23, -57, 57, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,2,37,71,7,39,74,-76,76,15,85,23,29,-57,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 2, -68, 84, 68, 56, 92, -13, 14, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,2,-68,84,68,56,92,-13,31,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 81, 34, 12, 14, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,81,34,12,46,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 4, -8, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,4,74,-8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 6, -90, 74, 26, -12, 94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,6,-90,74,26,62,-12,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 70, 39, 46, 49, 19, 54, 55, 87, 89, 25, -91, 59, -30, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,70,39,46,49,19,54,55,87,89,25,-91,59,93,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 19, 35, 21, -43, -44, 44, 60, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,19,35,21,-43,-44,44,94,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 5, 9, 60, -13, 30, 46, -32, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,5,9,60,-13,30,46,31,-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 17, -4, 20, 37, 54, 7, 26, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,17,-4,20,37,54,7,78,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 97, 50, 85, 38, 54, 42, -78, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,97,50,85,38,54,42,15,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 3, 4, -11, 75, 14, 16, 83, 20, -87, 55, 25, -26, 58, 27, 92, 93, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,3,4,-11,75,14,16,83,20,-87,55,25,-26,58,27,93,31,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 99, 57, 74, 60, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,99,57,74,94,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -87, 6, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-87,73,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 35, 67, 4, 72, 43, 14, 79, 80, 82, 86, 55, 24, 93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,35,67,4,72,43,14,79,80,82,86,55,63,24,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 97, 34, 8, 75, -76, 50, 18, 57, 89, -26, 59, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,97,34,8,75,-76,50,18,57,89,59,-29,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 64, 1, 2, -69, 37, -71, 39, 13, 78, 47, 80, -85, 20, 56, 90, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,96,64,1,2,-69,37,-71,39,13,78,47,80,-85,20,90,-27,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -53, -86, 88, -90, 41, -29, 60, 29, 62, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-53,-86,88,-90,41,-29,60,62,-48,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 66, -6, 10, 75, 80, 50, 53, 22, -23, 87, 90, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,66,-6,10,75,80,50,53,22,-23,90,-95,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 2, 3, 67, 69, 38, 39, 74, 10, 46, 50, 52, 21, 27, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,2,3,67,69,38,39,74,10,46,50,52,21,27,31,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 73, -91, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,73,60,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 99, 53, -39, 70, -11, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,99,53,-39,70,13,-11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 51, 70, 39, 73, 60, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,51,70,60,-48,39,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 67, 58, 76, -47, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,67,76,-95,-47,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -81, 34, 20, 53, 7, -41, 9, -91, 10, 75, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-81,34,20,53,7,-41,9,-91,12,10,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 81, 1, 66, -71, 24, 42, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,81,1,66,-71,24,43,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 64, 33, 4, 39, 73, 12, -49, 16, 51, 54, 22, 59, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,64,33,4,39,73,12,-49,16,51,54,22,61,31,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 52, -39, 23, 39, 9, 74, 62, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,52,-39,23,39,47,9,62,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 67, 19, 68, 25, 57, -13, 92, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,67,19,68,25,57,13,-13,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 98, -70, -38, 53, 87, -57, 24, 8, 25, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,98,-70,-38,53,87,-57,24,8,95,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 88, -26, 59, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,88,47,-26,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55, 75, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,79,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, -38, 88, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,76,-38,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 51, 70, 38, 87, 56, 11, 27, 43, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,51,70,38,87,56,11,27,79,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 99, 67, 70, 7, 42, 91, 43, 44, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,99,67,70,7,42,91,44,29,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 32, 98, 34, 40, 76, 86, 56, 26, 61, 30, 62, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,32,98,34,40,76,86,56,26,61,30,94,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -65, 3, 36, -69, -39, 11, 15, 81, 49, -23, 22, 91, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-65,3,36,-69,-39,11,15,81,49,-23,30,22,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 35, 38, 70, 71, 73, 46, 80, 82, 85, -26, 25, 92, 93, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,35,38,70,71,73,46,80,82,85,-26,25,93,-30,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-22, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,-22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 3, 4, 71, 78, 79, -80, 80, 49, -87, 22, 26, 59, -31, 30, 63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,3,4,71,78,79,-80,80,49,-87,22,26,59,-31,30,95,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 81, 5, -9, 9, 42, 77, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,81,5,-9,9,77,-79,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 32, -66, 97, 98, -69, 39, 44, 46, -79, -18, 18, 19, 20, -55, 89, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,32,-66,97,98,-69,39,44,46,-79,-18,18,19,20,-55,95,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 34, 66, 82, -5, 70, -9, 90, 27, 77, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,34,66,82,-5,70,-9,90,31,27,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 98, -4, 4, 6, 38, -44, 43, 78, 14, -49, -17, 17, 50, 52, 85, 62, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,98,-4,4,6,38,-44,43,78,14,-49,-17,17,50,52,85,94,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, -69, 6, -72, 26, 11, -28, 92, 94, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,-69,6,-72,26,11,-28,94,47,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 3, 20, 55, -88, 23, 9, -76, 28, 92, -47, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,20,55,-88,23,9,-76,28,92,46,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 3, 68, -71, 43, -46, -15, 83, -21, 52, 89, 57, 91, -61, 93, 29, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,3,68,-71,43,-46,-15,83,-21,52,89,57,91,-61,93,29,95,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, -71, 71, 43, 12, 44, 13, 20, 87, 56, -25, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,65,-71,71,43,12,44,13,56,-58,-25,20,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(9, 41, 73, 77, -79, -47, 15, -49, 50, 85, 53, 88, 57, 27, 91, -93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,41,73,77,-79,-47,15,-49,50,85,53,88,57,27,91,62,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, 85, 23, -89, -30, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,85,23,-89,78,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 6, 54, 74, 12, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,6,54,74,79,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 1, 2, -68, 5, 15, 17, 18, 22, -92, 27, 93, 94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,1,2,-68,5,15,17,18,22,-92,27,94,30,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, -86, 54, 40, 10, 74, -60, 29, 61, -95, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,-86,54,40,10,74,-60,29,61,15,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 98, 3, 21, 70, 40, -89, -13, 45, -14, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,98,3,21,70,40,-89,-13,45,93,-14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 4, 74, 27, 43, -13, 93, 79, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,4,74,27,43,63,-13,79,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 33, 66, 34, 99, 68, 38, -73, 72, 19, 86, 88, 89, -91, 27, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,33,66,34,99,68,38,-73,72,19,86,88,89,-91,31,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 82, -22, 56, -57, -59, -60, 75, -13, 62, 79, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,82,-22,56,-57,-59,-60,75,-13,79,47,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7, 73, 11, 76, 14, 79, 47, 16, 19, -22, 86, 56, -27, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,73,11,76,14,79,47,16,19,-22,86,56,-27,63,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 1, 2, -68, -23, 86, 39, 9, 25, 62, 79, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,1,2,-68,-23,86,39,9,25,62,95,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 55, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, 36, 68, 71, 25, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,36,68,71,93,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 73, -75, 43, 45, 19, 83, 26, 92, 29, 93, 61, 94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,73,-75,43,45,19,83,26,92,29,93,94,30,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 34, 68, 76, 13, -14, 47, 80, 81, 49, 19, -87, 56, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,34,68,76,13,-14,47,80,81,49,19,-87,56,63,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 2, 98, -68, 37, 70, 82, 83, 57, 26, -59, 91, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,2,98,-68,37,70,82,83,57,26,-59,92,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, -51, 40, 41, 25, -10, 27, 91, 76, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-51,40,41,25,-10,30,27,76,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 40, -41, 72, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,40,-41,78,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, -73, -89, -58, 57, 42, -59, 43, 46, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,-73,-89,-58,57,42,-59,46,-15,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 65, -99, 67, 3, 11, 49, 81, 17, 51, -20, 57, 90, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,65,-99,67,3,11,49,81,17,51,-20,57,94,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -49, 2, 74, -79, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-49,2,74,47,-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 39, -27, 61, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,39,46,-27,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 17, 18, 50, 99, 20, -53, 55, 93, 13, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,1,17,18,50,99,20,-53,93,-48,13,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 0, 1, 2, 68, 6, -73, 75, -77, 77, 78, 50, 83, 55, 23, 56, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,0,1,2,68,6,-73,75,-77,77,78,50,83,55,29,23,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -34, 65, 98, 69, 5, 9, -12, 76, 80, 23, 89, -92, 59, 63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-34,65,98,69,5,9,-12,76,80,23,89,-92,59,95,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 2, 98, -68, 68, -5, 5, 6, 42, 47, 18, 20, 85, 88, 27, 28, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,2,98,-68,68,-5,5,6,42,47,18,20,85,88,27,29,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 48, -66, -52, 4, 38, -71, 88, 25, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,48,-66,-52,4,38,-71,88,74,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, -35, 71, 9, 44, 76, 45, -15, 18, -22, 56, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,97,-35,71,9,44,76,45,-15,18,31,-22,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -56, 24, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-56,88,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, -36, -37, 69, -70, 38, -43, -83, -19, 84, 54, 89, -91, 90, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,-36,-37,69,-70,38,-43,-83,-19,84,54,89,-91,90,94,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 3, 36, 75, 45, 13, 84, 20, 54, 88, 89, 27, -29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,3,36,75,45,13,84,20,54,88,89,27,94,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 37, 70, -43, 14, 78, 47, 80, 18, 19, 84, 20, 22, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,37,70,-43,14,78,47,80,18,19,84,22,-26,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -97, 1, 2, 99, -69, -75, 76, -46, 13, 16, -85, -53, 84, 86, 24, -59, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-97,1,2,99,-69,-75,76,-46,13,16,-85,-53,84,86,24,93,-59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 34, -36, 67, 39, 40, -10, 74, 10, 76, 77, 79, 49, 17, 87, 88, 90, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,34,-36,67,39,40,-10,74,10,76,77,79,49,17,87,90,59,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 19, -13, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-97,-13,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 3, 86, 57, -94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,3,86,57,62,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, 34, 35, 73, 76, -77, -45, 79, 47, 81, 18, 20, -54, 27, 59, 95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,65,34,35,73,76,-77,-45,79,47,81,18,20,-54,27,63,59,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 97, 37, 11, -76, 14, -48, 80, -18, -52, -24, 88, 26, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,97,37,11,-76,14,-48,80,-18,-52,-24,88,60,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, -38, -9, -41, 43, 48, 50, -83, 22, -89, 25, 91, 61, -62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,-38,-9,-41,43,48,50,-83,22,-89,25,91,61,31,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 97, 99, -69, 68, 42, -12, 76, 12, -14, 81, 19, 24, 88, 57, 90, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,96,97,99,-69,68,42,-12,76,12,-14,81,19,24,88,90,31,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 98, 99, 36, -70, 8, -10, 13, -18, 17, 50, 52, 56, 57, 92, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,98,99,36,-70,8,-10,13,-18,17,50,52,56,92,-32,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, -85, -22, 71, 56, 28, 44, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-85,-22,71,56,44,14,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 21, 72, 57, 75, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,21,72,59,57,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 50, 25, 74, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,50,25,74,95,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 66, 2, -68, 20, 70, 73, 91, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,66,2,-68,20,70,91,-93,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 20, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,53,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 97, 3, 74, 76, -45, 77, 45, 16, 84, 21, 91, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,33,97,3,74,76,-45,77,45,16,84,91,-31,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 17, 51, -85, 86, -71, 72, -89, 25, 57, 58, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,17,51,-85,86,-71,72,-89,25,58,47,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 69, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,7,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, 97, 70, -72, 74, 77, 78, -80, 48, 16, -18, -52, 20, 21, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,65,97,70,-72,74,77,78,-80,48,16,-18,-52,20,53,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-72, 73, -74, -27, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,73,-74,61,-27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 41, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,91,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 52, 5, 6, 71, 9, 76, 60, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,52,5,6,71,31,9,60,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -35, 5, -8, -73, 8, 41, -77, 12, 15, 19, 84, 59, 30, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-35,5,-8,-73,8,41,-77,12,15,30,-32,19,59,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 1, 68, 4, 5, 40, 78, 80, 48, 50, 82, -21, 85, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,1,68,4,5,40,78,80,48,50,82,-21,89,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-19, 7, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,-19,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 49, 65, 38, 71, 55, 44, 77, -47, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,49,65,38,71,55,44,77,30,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 81, 65, 49, 19, 84, -62, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,81,65,49,84,-96,-62,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -67, 98, 5, -7, 70, 71, 47, -50, -22, 22, 23, 56, 57, 26, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-67,98,5,-7,70,71,47,-50,-22,22,23,57,-62,26,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, 86, -88, -57, 73, 10, 43, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,97,86,-88,-57,73,10,62,43,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 65, 98, 66, 67, 84, 68, 52, 23, -74, 27, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,65,98,66,67,84,68,52,23,-74,62,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 98, -4, 10, 77, -15, 47, 17, 84, -56, 25, 90, 91, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,98,-4,10,77,-15,47,17,84,-56,25,91,29,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, -99, -69, 39, -75, 12, -47, 17, 18, 52, 86, 22, 25, -59, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,65,-99,-69,39,-75,12,-47,17,18,52,86,22,25,31,-59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 2, 35, 24, -77, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,2,35,24,-32,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, -19, 99, 35, 52, 24, 25, 89, 76, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,-19,99,35,52,24,29,25,76,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 35, 40, 25, 42, 61, -79, 46, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,35,40,25,42,61,-79,47,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, -3, 9, 29, 95, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,-3,9,47,29,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 65, 84, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,84,43,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 4, 8, 20, 53, -86, 22, -87, 23, -89, 57, 58, 60, 92, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,4,8,20,53,-86,22,-87,23,-89,57,58,60,95,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 68, 6, 72, 9, -44, 77, 46, 84, 87, -26, 57, -91, 59, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,68,6,72,9,-44,77,46,84,87,-26,57,-61,-91,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 64, 0, -66, 67, 7, 40, 44, 45, 52, -85, 55, 25, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,64,0,-66,67,7,40,44,45,52,-85,55,31,25,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -98, -68, 69, 70, -10, 42, 43, 16, 19, 52, 53, 27, 92, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-98,-68,69,70,-10,42,43,16,19,52,53,92,-96,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -20, -84, 21, 25, 91, 59, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-20,-84,21,59,-61,25,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -50, 99, 51, -85, 8, 27, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-50,99,51,-85,27,-45,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 72, 8, 80, 53, 54, 55, 57, 58, 92, -61, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,72,8,80,53,54,55,57,58,92,63,-61,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 81, -83, 4, -53, 14, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,81,-83,4,-53,30,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-86, 55, 72, 89, 10, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,55,72,89,61,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 99, 69, 39, -40, 41, -11, 47, 80, 16, -83, 83, 22, 23, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,99,69,39,-40,41,-11,47,80,16,-83,83,22,89,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 32, 18, -84, -53, 38, 11, 12, 78, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,32,18,-84,-53,38,11,78,-31,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 96, 2, -20, -59, 76, 93, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,96,2,-20,-59,93,31,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 33, 6, 71, 39, 41, 42, 76, 45, 47, 79, -21, -91, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,33,6,71,39,41,42,76,45,47,79,-21,63,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 1, 20, 4, 54, 7, -40, 25, 42, -27, 44, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,1,20,4,54,7,-40,25,42,-27,77,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -3, 40, -43, 10, 43, 11, 13, 81, 52, 87, -58, 57, 59, 60, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-3,40,-43,10,43,11,13,81,52,87,-58,57,60,-31,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 68, 36, 71, 7, 11, 75, 77, 15, 18, 23, 87, -57, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,97,68,36,71,7,11,75,77,15,18,23,87,93,-57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 3, -37, 38, 39, 75, -78, 45, 78, 50, 85, -86, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,3,-37,38,39,75,-78,45,78,50,85,59,-86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(74, -44, 77, 62, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,62,-80,-44,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 53, 5, 87, 72, 56, -92, 44, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,53,5,87,72,56,-92,95,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 35, 37, -71, 40, 45, 14, -81, 17, 82, 51, 20, -88, 87, 56, 88, -90, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,35,37,-71,40,45,14,-81,17,82,51,20,-88,87,56,88,61,-90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 34, 69, -40, 41, 9, 17, 51, 52, 53, 23, -26, -58, 94, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,34,69,-40,41,9,17,51,52,53,23,-26,31,-58,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 34, 4, 36, 69, 76, -15, 15, 21, 22, 86, 26, 59, -92, 29, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,34,4,36,69,76,-15,15,21,22,86,26,59,-31,-92,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 36, 84, 39, 27, 43, 45, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,36,84,39,27,45,13,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 20, 25, -14, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,25,-47,-14,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 0, 33, 2, 5, 70, 72, 75, 76, 45, -49, 18, 83, 91, 27, 61, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,0,33,2,5,70,72,75,76,45,-49,18,83,91,27,61,95,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 97, 39, 91, 44, 61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,97,39,91,44,93,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 97, -3, 5, 6, 74, 91, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,97,-3,5,6,91,12,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(53, 24, 91, -29, 13, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,24,91,13,-31,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 35, 7, 58, 77, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,35,7,77,31,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 86, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,12,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 65, 82, 2, -4, -21, -54, 37, 12, 29, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,65,82,2,-4,-21,-54,37,29,-96,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 3, 68, 36, -71, 71, 72, 74, 13, 49, -50, 84, -59, 58, 59, 60, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,3,68,36,-71,71,72,74,13,49,-50,84,-59,58,59,93,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-4, 99, 83, -54, -26, 58, 30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,99,83,-54,-26,58,79,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, -4, 39, 10, 74, -44, -14, 48, -20, 54, 86, 27, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-4,39,10,74,-44,-14,48,-20,54,86,63,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 37, 5, 8, 41, 14, -80, 48, 80, 52, 53, 90, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,37,5,8,41,14,-80,48,80,52,90,31,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 97, 98, -20, 53, 55, -72, 56, -41, -45, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,97,98,-20,53,55,-63,-72,-45,-41,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(22, 8, 57, 91, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,8,91,47,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 4, 36, 71, 56, -9, 40, 63, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,4,36,71,56,-9,63,-64,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 3, -36, -39, -73, -16, 80, 49, 19, 84, 22, -90, 26, 27, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,-36,-39,-73,-16,80,49,19,84,22,-90,26,92,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 20, 6, 40, 27, 12, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,20,6,40,27,78,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 98, 25, 74, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,98,74,-30,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -33, -2, 6, 71, -25, -32, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-33,-2,6,71,-25,-16,-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52, 76, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,78,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 18, 82, 35, -4, 53, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,18,82,35,-4,78,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 50, 5, 6, 55, 40, -10, 25, 89, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,50,5,6,55,40,-10,25,90,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -8, 11, -16, 20, 53, 22, -27, 92, 61, 29, 30, 62, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,-8,11,-16,20,53,22,-27,92,61,29,62,-31,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(41, 44, 16, -52, 86, 54, -88, 56, 58, 91, 60, -94, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,44,16,-52,86,54,-88,56,58,91,60,94,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 86, -75, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,86,77,-75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 68, 71, 26, 43, -77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,68,71,43,-77,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 0, 2, -19, 82, 99, 6, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,0,2,-19,82,99,90,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, -4, 99, 6, 39, 12, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,-4,99,12,-96,6,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 65, -4, 6, 79, 50, 18, 84, 55, -59, 27, 95, -96, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,33,65,-4,6,79,50,18,84,55,-59,27,95,63,-96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -3, 3, 36, -70, 69, 77, 47, -53, 84, 90, 93, 94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-3,3,36,-70,69,77,47,-53,84,90,94,62,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 96, 71, -10, 14, 82, 51, 56, 89, 58, 91, -94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,96,71,-10,14,82,51,56,89,58,91,63,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 71, 73, 75, 76, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,71,73,76,-15,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 52, 92, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,52,93,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -50, -83, 3, 35, 99, 73, 12, 28, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,-50,-83,3,35,99,73,12,61,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6, 57, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,58,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 35, 3, 67, 87, 39, -75, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,35,3,67,87,39,62,-75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -1, 33, 69, 8, -10, -12, 80, 16, -82, -86, -24, 24, 90, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-1,33,69,8,-10,-12,80,16,-82,-86,-24,24,92,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -73, 8, 41, 75, 13, 83, 51, 19, 53, -90, 25, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-73,8,41,75,13,83,51,19,53,-90,30,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 38, 11, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,38,28,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 0, -2, 53, 24, -25, -10, 90, 11, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,0,-2,53,24,-25,-10,90,45,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 3, 70, 6, 72, -82, 17, 52, 85, 55, 24, -61, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,1,3,70,6,72,-82,17,52,85,55,24,62,-61,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 19, 51, 85, -7, -8, 72, 9, 89, 60, -14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,19,51,85,-7,-8,72,60,-14,9,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -98, 68, -6, 8, 41, 50, 22, 23, -25, 56, -61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-98,68,-6,8,41,50,22,23,-25,56,93,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 23, 41, 91, 14, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,23,41,91,63,14,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 84, 38, 39, 72, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,84,38,72,29,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 34, -74, 44, 77, 80, 81, -18, 52, 21, 87, 89, 26, 28, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,34,-74,44,77,80,81,-18,52,21,87,89,26,94,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 23, 40, -46, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,23,40,-46,63,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-38, 85, 9, 11, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,85,9,78,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 8, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,13,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 4, 68, 69, 39, -15, -82, 50, 18, 83, -21, -26, 89, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,4,68,69,39,-15,-82,50,18,83,-21,61,-26,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -38, 71, 40, 10, 43, 75, 46, 79, -84, 23, 25, 57, 89, 60, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-38,71,40,10,43,75,46,79,-84,23,25,57,89,62,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 67, 52, 53, -8, 90, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,67,52,53,45,-8,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, -23, 9, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,-23,94,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -66, 17, 66, 85, 38, 71, 88, 41, -16, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-66,17,66,85,38,71,88,41,95,-16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 72, 77, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,77,-30,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 17, -21, 70, 72, 90, 42, 91, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,17,-21,70,72,90,91,-46,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, -3, -70, 5, 7, 40, 13, 20, 22, 87, -61, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,32,-3,-70,5,7,40,13,20,22,87,29,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 35, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 98, 57, 43, 44, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,98,57,43,94,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(93, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 84, 21, 22, -39, 24, 27, 43, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,84,21,22,-39,24,27,79,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 22, -39, -76, 12, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,22,-39,-76,63,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 3, 71, -10, 11, 13, 14, 16, 48, 19, 53, 54, 86, 22, 89, -27, -62, 30, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,3,71,-10,11,13,14,16,48,19,53,54,86,22,89,-27,30,-64,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -65, 65, 55, -72, 30, 46, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-65,65,55,-72,46,15,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 36, -6, 6, 72, 9, 42, 83, 52, 22, -23, 55, -57, 25, 26, 27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,36,-6,6,72,9,42,83,52,22,-23,55,-57,25,26,30,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 98, 66, 4, 6, 38, 72, 41, 75, 80, -17, -85, -54, 22, 58, -27, 27, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,98,66,4,6,38,72,41,75,80,-17,-85,-54,22,58,-27,31,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 67, 69, -88, 55, 91, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,67,69,-88,91,-95,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -3, 35, 37, -7, -73, 73, -42, 12, 45, 81, 19, 52, 53, 88, -89, 61, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-3,35,37,-7,-73,73,-42,12,45,81,19,52,53,88,61,-95,-89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -97, -98, -69, 6, 72, 76, 14, 78, 47, 80, 49, 20, -22, -87, -60, 60, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-97,-98,-69,6,72,76,14,78,47,80,49,20,-22,-87,-60,62,60,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 67, 20, 5, 86, -55, 8, 74, 44, 93, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,67,20,5,86,-55,8,74,93,-79,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 34, 67, 5, 38, -41, 44, -45, 45, 77, 15, 82, -53, 87, 59, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,34,67,5,38,-41,44,-45,45,77,15,82,59,-93,-53,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 49, 65, -83, 83, 35, 6, -7, 75, 29, 14, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,49,65,-83,83,35,6,-7,75,29,15,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -2, 97, -4, 3, 4, 5, 7, 42, 77, 23, 88, 25, -92, 92, 60, -64, 95, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-2,97,-4,3,4,5,7,42,77,23,88,25,-92,92,60,-32,-64,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 36, -70, 37, -39, 46, 47, -80, 22, 54, 29, 61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,36,-70,37,-39,46,47,-80,22,54,29,63,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 37, 7, 76, -18, 81, 18, 82, 84, 57, 58, 27, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,37,7,76,-18,81,18,82,84,57,58,31,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(60, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 83, -55, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,83,22,-55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -36, -41, 9, -75, 44, 48, 80, -49, 18, 50, 20, -23, 88, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-36,-41,9,-75,44,48,80,-49,18,50,20,57,-23,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -39, 72, 9, 41, -78, 78, -49, -19, 88, 25, -59, 28, -94, 62, 30, 63, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-39,72,9,41,-78,78,-49,-19,88,25,-59,28,-94,62,63,-32,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -33, 0, 34, 67, 68, -40, 41, 9, 45, 52, 57, 60, 28, 31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-33,0,34,67,68,-40,41,9,45,52,57,60,28,95,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -24, 27, 94, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-24,94,15,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -84, 35, -8, 76, 78, 46, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-84,35,-8,76,78,79,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 35, 68, 53, 5, 39, 73, 42, -76, 13, 78, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,35,68,53,5,39,73,42,-76,30,13,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 1, 49, 97, 98, 51, -86, -38, 7, -44, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,1,49,97,98,51,-86,-38,7,31,-44,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 98, 67, 4, 41, -45, 47, -17, 49, -19, 20, -23, 58, 27, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,98,67,4,41,-45,47,-17,49,-19,20,27,-96,-23,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, -67, -3, 99, 36, 40, 72, 41, 74, 52, -86, 91, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-67,-3,99,36,40,72,41,74,52,60,-86,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -68, -86, 70, -9, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-68,-86,70,94,-9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 86, 70, 25, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,86,70,26,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 0, 17, 34, 98, 83, 43, 11, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,0,17,34,98,83,43,62,11,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 3, -10, -74, -11, 77, 46, 47, 51, 85, 55, -88, 57, 29, 30, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,3,-10,-74,-11,77,46,47,51,85,55,-88,57,29,31,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 66, -99, 13, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,66,-99,79,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 35, 67, 5, 7, 72, 73, 42, 44, 77, -47, 15, 49, 20, 29, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,35,67,5,7,72,73,42,44,77,-47,15,49,20,95,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 2, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,83,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 51, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,68,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -3, -36, -7, 73, 46, 15, 48, 17, 18, 51, -85, 54, -26, 90, -30, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-3,-36,-7,73,46,15,48,17,18,51,-85,54,-26,90,30,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -2, 67, -36, 11, 76, 12, 45, 47, 81, 50, 83, -23, 89, 27, 28, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-2,67,-36,11,76,12,45,47,81,50,83,-23,89,27,62,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 68, 69, 5, 71, 40, 75, 18, -20, 51, 83, 52, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,68,69,5,71,40,75,18,-20,52,-30,51,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 33, 35, 4, 21, 38, 39, -25, -74, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,33,35,4,21,38,39,-25,79,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 98, 99, 35, 7, 8, 40, 74, 43, 11, 77, 13, 79, 83, -22, 54, -89, 58, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,98,99,35,7,8,40,74,43,11,77,13,79,83,-22,54,-89,92,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -99, 67, 20, 5, 86, 56, 58, 76, -94, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-99,67,20,5,86,56,58,76,-15,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 98, -69, 4, 69, 43, 13, 16, 59, -30, 62, 30, -31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,98,-69,4,69,43,13,16,59,-30,62,30,63,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-84, 19, -69, 38, 29, 77, -48, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,19,-69,38,29,77,95,-48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -65, 97, 3, 36, -39, 8, 73, -11, 43, 78, -23, 23, 25, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-65,97,3,36,-39,8,73,-11,43,78,-23,23,60,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -35, 4, 5, 70, 6, 40, 9, 43, 47, -24, 88, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-35,4,5,70,6,40,9,43,47,-24,88,63,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 1, 97, 36, -42, 46, 78, 15, -17, 16, 19, -90, 94, 95, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,1,97,36,-42,46,78,15,-17,16,19,-90,95,-96,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -34, 66, 2, 38, 7, -43, 74, 76, 46, 48, 56, 89, 27, 60, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-34,66,2,38,7,-43,74,76,46,48,56,89,27,62,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 36, 23, 24, 41, 42, 26, -63, 14, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,36,23,24,41,42,26,-63,47,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 18, -53, 36, 69, 54, 87, 56, 90, 61, 14, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,18,-53,36,69,54,87,56,90,61,31,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 2, 66, 99, 7, 10, 42, 79, 17, 82, 22, 95, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,33,2,66,99,7,10,42,79,17,82,22,95,63,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -98, 35, 3, 40, -10, 73, 42, 12, -46, -83, -51, 84, 91, 60, 29, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-98,35,3,40,-10,73,42,12,-46,-83,-51,91,-31,29,60,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 99, 4, 40, -12, 12, -14, 78, -48, 82, -51, 54, -91, 59, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,99,4,40,-12,12,-14,78,-48,82,-51,54,-91,60,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -66, 34, 21, 6, 39, -61, 62, -47, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-66,34,21,6,39,-48,-61,-47,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -67, 35, 68, -39, 74, 78, 15, 47, 82, -19, 86, 59, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-67,35,68,-39,74,78,15,47,82,31,-19,59,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 33, 35, -39, 39, 57, -59, -11, 60, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,33,35,-39,39,57,-59,-11,95,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -36, 40, -41, 73, 74, 76, 47, 17, -19, 19, 20, 22, 55, -56, 87, 90, 27, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-36,40,-41,73,74,76,47,17,-19,19,20,22,55,-56,87,90,61,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 68, 37, 73, -46, -79, 49, 53, 87, 88, -25, 91, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,68,37,73,-46,-79,49,53,87,88,63,-25,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 1, 82, 7, 88, -90, 42, 58, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,1,82,7,88,-90,44,42,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-83, -21, 4, 85, 86, 70, 55, -73, -9, 11, 47, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-21,4,85,86,70,55,-73,-9,47,-32,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -84, 68, 88, -89, 73, 27, 76, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-84,68,88,-89,73,76,14,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, -27, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,79,-27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -66, 33, 1, 2, 66, -10, 73, -92, 29, 15, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-66,33,1,2,66,-10,73,-48,-92,15,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 8, -73, 73, 9, 42, 43, 76, 19, 51, 21, 24, 26, 60, -61, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,8,-73,73,9,42,43,76,19,51,21,24,26,60,29,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, -38, 6, 39, 74, -44, 78, 79, 19, 83, 25, 60, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,-38,6,39,74,-44,78,79,19,83,25,92,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 66, 68, 4, -70, 39, 9, 11, 76, 13, -47, 47, 82, 83, 84, 92, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,66,68,4,-70,39,9,11,76,13,-47,47,82,83,92,31,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 36, -5, 40, 10, 76, 44, 77, -51, -57, 57, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,36,-5,40,10,76,44,77,-51,-32,-57,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(5, 7, 88, 73, 90, -43, 27, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7,88,73,90,27,-80,-43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 16, 82, 85, 57, 43, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,16,82,85,57,92,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 33, 35, 99, 36, 41, -44, 77, 16, 18, 21, 24, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,33,35,99,36,41,-44,77,16,18,21,31,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 4, -72, 39, 43, -46, 47, 82, -54, 22, 55, 88, -90, 58, 27, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,4,-72,39,43,-46,47,82,-54,22,55,88,-90,58,95,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(43, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 6, 74, 75, 44, 45, 78, -81, 80, 82, 53, -56, 87, -89, 25, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,6,74,75,44,45,78,-81,80,82,53,-56,87,-89,30,25,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 4, 68, 69, 5, 39, 71, -8, 43, 81, 18, 52, 24, 88, 57, 58, -28, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,4,68,69,5,39,71,-8,43,81,18,52,24,88,58,-96,-28,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 2, 98, -67, 72, 74, 77, -46, 46, 80, 20, 88, 90, 59, 61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,2,98,-67,72,74,77,-46,46,80,20,88,90,59,93,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -51, 94, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,79,-51,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, -19, 19, 85, -56, 42, -47, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,-19,19,85,-56,42,47,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 67, 53, 86, -56, 10, 43, 45, 46, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,67,53,86,-56,10,43,45,95,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 19, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,0,19,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(24, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(5, 7, 40, 72, 42, 44, 81, 49, 19, 51, 52, 23, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7,40,72,42,44,81,49,19,51,52,62,23,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, -4, 5, 8, 73, 91, 28, -14, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,-4,5,8,91,-15,-14,28,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 35, 4, 84, 38, 87, -72, 23, 24, 9, 44, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,35,4,84,38,87,-72,23,24,9,60,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 69, -7, 71, 40, 72, -75, 43, 77, 17, -20, 26, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,69,-7,71,40,72,-75,43,77,17,-20,60,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 82, 68, 84, 22, 71, 25, 73, 14, 94, 78, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,82,68,84,22,71,25,73,14,94,95,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 66, -35, 3, 67, 4, 10, 74, 42, 44, 48, 17, -82, 22, -25, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,66,-35,3,67,4,10,74,42,44,48,17,-82,22,-25,62,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 82, 2, 6, 24, -60, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,82,2,6,24,12,-60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 92, 61, -95, 14, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,92,61,-95,79,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 1, 34, -38, 71, 42, 17, 50, 82, 19, -86, 88, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,33,1,34,-38,71,42,17,50,82,19,88,-90,-86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52, 54, -89, 11, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,54,-89,60,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 41, 59, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,45,41,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 50, 34, 51, 84, 41, 43, 92, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,50,34,51,84,41,92,-64,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 49, -55, 41, 90, 75, 27, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,49,-55,41,90,75,31,27,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 86, 22, 70, 71, 56, 93, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,86,22,70,71,93,-64,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, 66, 35, 39, 40, 9, 10, -76, 79, 80, 83, 19, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,66,35,39,40,9,10,-76,79,80,83,85,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 38, -14, 46, -17, 84, 21, -22, 85, -28, 92, 29, -95, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,38,-14,46,-17,84,21,-22,85,-28,92,29,-95,63,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -2, 34, 7, 71, 41, 73, 10, -13, 83, -88, 24, 25, 58, -91, 92, 61, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-2,34,7,71,41,73,10,-13,83,-88,24,25,58,61,-96,-91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(73, 27, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,28,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, -85, 21, 89, 77, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-85,77,-94,21,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, 53, 90, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,53,91,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 69, 39, 73, 42, 43, -16, 48, 20, 22, 86, 88, 25, 57, 60, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,69,39,73,42,43,-16,48,20,22,86,88,25,57,94,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, -66, 66, 67, 19, 57, 26, 59, 44, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,-66,66,67,19,57,44,-47,26,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 50, 83, 37, 21, 38, 43, 11, -29, 94, 63, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,50,83,37,21,38,43,11,-29,94,79,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 49, 83, 11, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,49,83,31,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 98, -38, 38, -88, 43, -45, -78, 45, 46, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,98,-38,38,-88,43,-45,-78,46,-79,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, -3, 84, 42, 10, -76, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,-3,84,42,10,59,-76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 97, 67, 68, -8, 72, 11, -52, 52, 53, 24, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,33,97,67,68,-8,72,11,-52,52,53,63,24,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 69, 40, 42, 74, 78, 48, 19, -22, 24, -58, 57, 25, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,69,40,42,74,78,48,19,-22,24,-58,57,30,25,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 98, -71, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,98,8,-71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 35, 68, 85, 87, -72, 90, 26, 44, 46, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,35,68,85,87,-72,90,26,46,14,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -36, 68, -39, -15, 78, -16, 17, 18, 82, 53, 85, 87, 88, 60, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-36,68,-39,-15,78,-16,17,18,82,53,85,88,-31,60,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 64, 33, 82, 4, 85, 25, 89, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,64,33,82,4,85,25,93,62,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 0, 51, 54, 6, 89, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,0,51,54,78,6,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 86, 12, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,86,29,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 33, -69, 31, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,33,-32,-69,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -66, 50, 20, 88, 44, 76, 61, 45, 93, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-66,50,20,88,44,76,61,79,45,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 86, 87, 25, 9, -11, 43, 92, 76, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,86,87,25,9,-11,43,92,76,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 49, 81, 68, 88, 44, 93, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,49,81,68,88,78,44,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 50, -51, 19, 5, 86, -9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,50,-51,19,86,-9,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 97, 98, 67, -4, -37, 70, 6, 75, -14, 47, 15, -82, 49, 82, 50, 58, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,97,98,67,-4,-37,70,6,75,-14,47,15,-82,49,82,58,28,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 69, 78, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,78,46,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 24, 56, 74, -91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,24,74,-91,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, 3, 6, 40, 10, 42, 11, 15, 50, 20, 59, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,97,3,6,40,10,42,11,15,50,27,20,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, 6, 41, 73, 14, -48, 15, -81, -50, 49, 51, 86, 87, 88, 90, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,66,6,41,73,14,-48,15,-81,-50,49,51,86,87,90,60,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-85, 7, 29, 61, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,7,61,-79,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 18, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,38,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 85, -87, 41, 62, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,85,-87,62,30,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 66, 51, 7, -72, 8, 90, 12, 61, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,66,51,7,-72,8,90,47,12,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -99, -37, 4, 70, 7, 74, 81, 82, 52, 23, 24, 91, 28, 92, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-99,-37,4,70,7,74,81,82,52,23,24,91,31,28,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 82, 5, 22, 6, 8, 27, 47, 15, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,82,5,22,6,8,27,47,95,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -37, -8, 40, 9, 76, 12, -15, 48, -52, -53, 88, -62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-37,-8,40,9,76,12,-15,48,-52,-53,88,31,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 1, -66, -4, 4, -37, -38, 13, 14, 47, -51, -52, 84, 87, 23, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,1,-66,-4,4,-37,-38,13,14,47,-51,-52,84,87,61,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 0, 35, -69, 21, 40, 89, 9, 27, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,0,35,-69,21,40,89,9,63,27,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, -2, 98, 99, 35, 72, -41, -16, 47, -50, -51, 18, 22, -56, 26, 27, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,97,-2,98,99,35,72,-41,-16,47,-50,-51,18,22,-56,26,31,27,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 58, 43, 75, 11, 77, -14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,58,43,75,77,-14,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 37, -7, 73, 11, 43, 13, 14, -17, 49, -82, -53, 54, 55, 57, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,37,-7,73,11,43,13,14,-17,49,-82,-53,54,57,26,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 49, 17, 36, 23, 59, -79, 46, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,49,17,36,23,59,-79,47,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 83, 39, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,83,56,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 67, 52, -54, 9, 89, 26, 92, 77, 79, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,67,52,-54,9,89,26,92,79,-96,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 98, 35, 3, 70, 78, 62, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,98,35,3,78,15,62,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 66, 70, 74, -44, 47, -21, 85, 54, 57, 90, 27, 92, 28, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,33,66,70,74,-44,47,-21,85,54,57,90,27,92,29,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 2, 70, 71, 41, 43, 44, 14, 47, 49, 83, 58, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,2,70,71,41,43,44,14,47,49,83,58,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 65, 34, 98, 21, 37, 72, -78, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,65,34,98,21,37,72,47,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 71, 91, 11, 75, 76, 28, 77, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,71,91,11,75,76,77,-95,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 1, 81, -3, 19, -21, 86, 9, 73, 10, 75, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,1,81,-3,19,-21,86,9,73,62,10,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -99, 98, 68, 38, 8, 42, 75, -47, -19, 51, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-99,98,68,38,8,42,75,-47,-19,51,31,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86, 75, 45, 13, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,75,45,95,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 67, 4, -71, 7, 71, 11, 77, 14, 15, 82, 54, 25, 59, -92, -61, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,67,4,-71,7,71,11,77,14,15,82,54,25,59,-92,94,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 66, 67, -8, 40, 15, 80, -83, 83, 52, 85, 54, 55, 89, 25, 92, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,66,67,-8,40,15,80,-83,83,52,85,54,55,89,61,25,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 19, 21, 85, 86, 70, 89, 9, 28, 93, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,19,21,85,86,70,89,9,93,-46,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 33, 67, 5, -40, -89, 9, 43, 30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,33,67,5,-40,-89,9,43,79,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-38, 6, 38, 7, 43, 44, 45, 14, -79, 48, 16, 19, -87, -24, 58, 62, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,6,38,7,43,44,45,14,-79,48,16,19,-87,-24,62,30,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, -21, 68, -86, 87, -9, 57, 58, 12, -77, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,-21,68,-86,87,-9,57,58,12,61,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 20, 86, 41, 57, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,20,86,41,59,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -6, 37, 10, -76, 12, 16, 48, 83, 20, 53, -54, 24, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-6,37,10,-76,12,16,48,83,20,53,-54,25,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-88, 7, 56, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,7,77,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 49, -86, 55, 24, 56, 60, 92, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,49,-86,55,24,56,92,47,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -66, 65, -34, 2, 34, -69, 73, 11, 78, 46, -17, -50, 17, 82, -28, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-66,65,-34,2,34,-69,73,11,78,46,-17,-50,17,82,59,-28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(54, 39, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 19, 55, 41, 73, 12, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,19,55,41,73,31,12,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -66, 70, -74, 41, 42, 46, 17, 84, -53, 87, 23, 90, 93, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-66,70,-74,41,42,46,17,84,-53,87,23,93,29,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 40, 73, 74, -44, 45, 46, 16, -82, 81, -84, 84, 85, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,40,73,74,-44,45,46,16,-82,81,-84,85,29,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 4, -89, -90, 26, -61, 93, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,4,-89,-90,26,30,-61,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 58, 29, 93, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,58,78,29,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 53, 38, 55, 40, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,53,40,13,38,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 66, 67, 69, 9, 45, 79, 18, -26, 26, 27, 91, -60, -29, 61, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,66,67,69,9,45,79,18,-26,26,27,91,-60,-29,94,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 34, 99, -36, 39, -74, 77, 46, 79, 18, 21, -87, 88, 25, -60, 93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,34,99,-36,39,-74,77,46,79,18,21,-87,88,25,63,-60,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -17, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,87,-17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -72, -24, 7, 75, -93, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-72,-24,7,75,14,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 35, 67, 68, -37, -38, 5, 7, 72, 10, 81, 20, 53, 55, 59, 31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,35,67,68,-37,-38,5,7,72,10,81,20,53,55,59,95,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 35, 88, 72, -43, -30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,35,88,72,-43,79,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, -69, 68, -70, 70, -41, 27, 59, 43, 12, 76, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,-69,68,-70,70,-41,27,59,43,12,77,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 36, 39, 89, 75, 28, 60, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,36,39,89,75,45,28,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 5, 85, -54, 88, -57, -76, 93, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,5,85,-54,88,-57,-32,-76,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 17, 86, 73, 42, -12, 29, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,17,86,73,42,-12,79,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 17, 5, 8, -42, -58, 74, 77, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,17,5,8,-42,-58,74,79,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 36, 37, 9, -45, 44, 14, 46, 49, 20, 53, 54, 24, -27, 59, -61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,36,37,9,-45,44,14,46,49,20,53,54,24,-27,59,63,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -35, 35, -8, 71, 44, 77, 78, 15, 83, 86, -89, -31, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-35,35,-8,71,44,77,78,15,83,86,-89,-31,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 52, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,5,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -2, 68, 39, 7, 74, 80, -49, -51, 24, 57, 26, 59, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-2,68,39,7,74,80,-49,-51,24,57,30,26,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 90, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,10,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 8, 9, 12, 45, -78, -16, 81, 49, 58, -29, 63, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,8,9,12,45,-78,-16,81,49,58,63,-32,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, -18, 35, 99, 83, 51, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-18,35,99,83,54,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -17, 84, -88, 71, 73, 60, -62, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-17,84,-88,71,73,60,46,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -35, 2, 4, 6, 9, 43, 12, 76, -14, 78, 14, 91, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-35,2,4,6,9,43,12,76,-14,78,29,14,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 96, 97, 3, 37, 75, -82, -87, 55, 87, 24, 92, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,96,97,3,37,75,-82,-87,55,87,92,-62,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -69, -8, 12, 28, -94, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,-69,-8,12,28,46,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(72, 30, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 67, 69, 70, 7, -42, -13, 45, 46, 47, 83, 85, -55, 86, -56, -61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,67,69,70,7,-42,-13,45,46,47,83,85,-55,86,-56,62,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -3, -67, 67, 7, 40, 72, 44, 51, 20, -85, 84, 89, 90, 26, 60, -95, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-3,-67,67,7,40,72,44,51,20,-85,84,89,90,26,60,95,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 7, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,63,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -66, 1, -4, 99, 4, -8, 7, 40, 74, 45, 18, -86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-66,1,-4,99,4,-8,7,45,-86,18,40,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -53, -41, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-53,42,-41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 19, 60, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,19,62,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -99, -8, 74, 79, 15, 17, 51, -22, 24, 90, 59, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-99,-8,74,79,15,17,51,-22,24,90,92,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(40, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 98, 70, 7, 40, 89, 57, 26, 12, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,98,70,7,40,89,57,26,45,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -99, 99, -36, 52, 39, 7, 24, 58, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,-99,99,-36,52,39,7,24,58,62,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 37, 69, -41, -47, 47, -49, 50, 19, 21, 53, 24, -89, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,37,69,-41,-47,47,-49,50,19,21,53,24,31,-89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 54, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,-99,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 68, -6, -72, 7, 41, 44, -81, 17, -52, -20, 26, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,68,-6,-72,7,41,44,-81,17,-52,-20,63,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -3, 66, 3, 67, 68, 7, 40, 9, -76, -16, -80, 79, 51, -85, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-3,66,3,67,68,7,40,9,-76,-16,-80,79,51,95,-85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 82, -52, 68, 53, 38, 73, -27, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,82,-52,68,53,38,73,78,-27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -67, 4, -5, 69, 9, 75, -85, 54, 55, 26, 28, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-67,4,-5,69,9,75,-85,54,55,26,31,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 66, -4, 73, 10, 42, -13, 76, 77, 14, 79, 52, -54, 54, -87, 88, 58, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,66,-4,73,10,42,-13,76,77,14,79,52,-54,54,27,-87,58,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 15, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,-32,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -7, 39, 71, 41, -80, 79, 80, 81, 58, 27, 28, 61, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-7,39,71,41,-80,79,80,81,58,27,28,95,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(5, 71, 7, 57, 90, 75, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,71,7,75,-29,57,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 50, 82, 99, -36, 5, 38, 87, 24, 8, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,50,82,99,-36,5,38,87,24,10,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 71, 74, 42, 77, 82, -20, 85, 21, 86, 54, 91, 59, -93, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,71,74,42,77,82,-20,85,21,86,54,91,59,92,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 99, 3, 36, 6, 72, -43, 74, 11, 13, 15, -88, 23, 88, -58, 57, -28, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,99,3,36,6,72,-43,74,11,13,15,-88,23,88,-58,57,28,-28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 20, 6, -55, 7, 55, 26, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,20,6,-55,7,55,75,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 20, -37, 85, -55, 71, 40, -91, 75, 76, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,20,-37,85,-55,71,40,-91,76,30,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 66, 67, -5, 68, 70, -71, 40, -45, 16, -83, 50, 89, 58, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,66,67,-5,68,70,-71,40,-45,16,-83,50,89,93,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 32, 0, 37, 72, 40, -43, 44, 12, 78, 20, -21, 85, 21, 23, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,32,0,37,72,40,-43,44,12,78,20,-21,85,21,89,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 33, 50, 22, 72, -91, 90, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,33,50,22,72,-15,-91,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 25, 11, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,25,92,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -98, 69, 7, 43, 13, -81, 49, 82, 53, -87, 23, 89, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-98,69,7,43,13,-81,49,82,53,-87,23,91,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-4, 67, 99, 68, -69, -90, 74, 11, -12, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,67,99,68,-69,-90,74,11,31,-12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 97, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-30,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, -3, 3, 20, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-3,20,-26,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -2, 36, 70, 73, 42, 76, 78, 17, 53, -56, 88, 89, 26, 92, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-2,36,70,73,42,76,78,17,53,-56,88,89,29,26,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 97, 2, 9, 57, 25, 58, 77, 93, -30, 14, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,97,2,9,57,25,58,77,93,-30,30,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -50, 84, 40, 58, 10, 29, 46, 79, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-50,84,40,58,10,29,79,-48,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 19, 52, 41, -74, 9, -12, -96, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,19,52,41,-74,9,-12,79,-96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 36, 68, 43, 12, 13, -78, 48, 51, 84, 85, -54, 55, -25, 90, -91, 26, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,36,68,43,12,13,-78,48,51,84,85,-54,55,-25,90,-91,61,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -97, 98, 99, 69, 72, 42, 76, 48, 81, 51, 85, 86, 57, 25, 90, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-97,98,99,69,72,42,76,48,81,51,85,86,57,25,90,95,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 24, 41, 74, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,24,74,-45,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 65, 89, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,89,58,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 32, 50, 52, 69, 55, 73, 11, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,32,50,52,69,55,73,11,95,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 65, 66, -68, 3, -37, 68, 72, 73, -76, -49, 17, 87, 88, 26, 90, 91, -62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,65,66,-68,3,-37,68,72,73,-76,-49,17,87,88,26,90,91,63,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 99, 53, -77, -79, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,99,53,-77,-79,63,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 17, 20, 38, 39, 56, 26, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,17,20,38,56,10,26,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(70, 6, 23, -12, 28, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,6,23,28,-96,-12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 33, 99, 36, 37, 70, 39, 41, 74, 18, 51, 23, -57, -92, 28, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,33,99,36,37,70,39,41,74,18,51,23,-57,-92,31,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 96, 66, 41, 12, -78, -18, -51, 83, -53, 20, 53, 86, 91, -29, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,96,66,41,12,-78,-18,-51,83,-53,20,53,86,91,60,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, -22, 37, 7, 39, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,-22,37,9,7,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 34, -88, -43, -78, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,34,-88,-43,95,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 96, 0, 33, 67, -22, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,96,0,33,67,37,-22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -69, 69, 40, -9, 43, 13, 48, 50, 51, 53, 86, 23, 89, -61, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-69,69,40,-9,43,13,48,50,51,53,86,89,-93,-61,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -52, 4, 5, 21, -71, 88, 9, -43, -77, 12, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-52,4,5,21,-71,88,9,-43,-77,13,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 4, 38, 73, -76, 13, 78, 47, 81, -51, 20, 86, 22, 23, -89, 58, 90, 28, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,4,38,73,-76,13,78,47,81,-51,20,86,22,23,-89,58,90,61,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 24, -57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 49, 65, 1, 99, -36, -53, 21, 69, 10, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,49,65,1,99,-36,-53,21,69,78,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 54, 55, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,55,42,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 4, 23, 60, 92, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,4,23,76,60,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 48, 36, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,48,42,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 36, 43, 11, 44, 14, -16, -17, 19, -20, 20, 24, 60, 61, 94, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,36,43,11,44,14,-16,-17,19,-20,20,24,60,61,95,31,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-51, 3, -38, 57, 11, -13, 94, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,3,-38,57,11,-13,94,63,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 34, 3, -52, 13, -78, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,97,34,3,-52,13,78,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 65, 33, 98, 19, 52, 84, -13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,65,33,98,19,84,-13,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 96, 5, 6, 13, 15, 80, 82, 19, 51, 87, 90, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,96,5,6,13,15,80,82,19,51,90,31,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 34, -67, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,34,71,-67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(22, 56, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,74,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-20, -85, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,25,-85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, -69, 4, -37, 39, -40, -73, 11, 16, -18, 57, 89, 62, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,-69,4,-37,39,-40,-73,11,16,-18,62,-32,57,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 96, -68, 69, 71, 40, -74, 73, 78, 80, 86, -95, -64, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,32,96,-68,69,71,40,-74,73,78,80,86,-64,-96,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -53, -87, 87, 26, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-53,15,-87,26,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(13, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -82, 2, 67, -6, 8, 59, 44, 76, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-82,2,67,-6,8,59,76,29,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, 10, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,94,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 2, 68, 5, 71, 72, 78, 80, 16, 18, 50, -51, 19, 86, 55, -95, 62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,2,68,5,71,72,78,80,16,18,50,-51,19,86,55,31,-95,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 16, 81, 1, 35, 36, -37, 69, 41, 57, 78, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,16,81,1,35,36,-37,69,41,78,-95,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -38, 69, 72, 73, -12, 11, 47, 16, 48, -18, 17, 81, -54, -25, 56, 25, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-38,69,72,73,-12,11,47,16,48,-18,17,81,-54,-25,56,94,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 81, -35, -52, -12, 75, -77, 77, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,81,-35,-52,-12,75,46,-77,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -3, 69, 53, 37, 56, 40, -93, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-3,69,53,37,56,40,-32,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 17, 34, 56, -74, -59, 79, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,17,34,56,-74,-59,95,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 83, 3, 84, 5, 91, -77, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,83,3,84,5,91,78,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -18, 1, 66, 4, 36, -74, 10, 13, 14, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,-18,1,66,4,36,-74,10,13,95,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 65, 34, -39, 70, -40, 9, 42, 14, 79, -19, 83, 84, 85, -57, 59, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,65,34,-39,70,-40,9,42,14,79,-19,83,84,85,30,-57,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -66, 2, 99, 37, 54, 71, 87, -40, 59, 60, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-66,2,99,37,54,71,87,-40,60,28,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 53, -39, 10, 75, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,53,-39,62,10,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 81, 35, 52, 88, -74, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,81,35,52,88,95,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 83, 22, 71, -11, 27, -77, 76, 79, 47, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,83,22,71,-11,27,-77,79,15,47,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 2, 83, 52, 74, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,2,83,52,95,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 24, 89, 41, 13, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,24,89,41,46,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -97, 96, 2, 98, 37, 6, 71, -44, -14, 14, 18, 83, 91, 29, -31, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,-97,96,2,98,37,6,71,-44,-14,14,18,83,91,29,30,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 18, 34, 4, -6, -56, 89, 58, -91, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,18,34,4,-6,-56,89,58,-91,95,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 34, 26, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,-15,17,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 2, 3, 6, 39, 40, 41, 11, 17, 49, 19, 54, 89, 60, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,33,2,3,6,39,40,41,11,17,49,19,54,89,93,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 98, -68, 5, 7, 72, 75, -12, 43, 77, 46, 16, 80, -55, -90, 25, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,98,-68,5,7,72,75,-12,43,77,46,16,80,-55,-90,26,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 99, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,2,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -99, 5, 37, -41, 41, 43, 76, 45, -79, -81, -52, 86, 26, 27, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-99,5,37,-41,41,43,76,45,-79,-81,-52,86,27,-61,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 99, 19, -69, -53, -7, 23, 75, 13, 78, 46, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,99,19,-69,-53,-7,23,75,14,13,46,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-19, 4, 86, 41, 57, 43, 59, 46, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,4,86,41,57,43,59,62,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 3, 85, 22, -58, 91, 45, 30, -48, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,3,85,22,-58,91,45,30,31,-48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, -54, 69, 75, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,-54,75,28,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 33, -67, 50, 37, 39, -8, -40, 11, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,33,-67,50,37,39,-8,-40,63,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86, -24, -58, -26, 58, 90, -76, -60, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,-24,-58,-26,58,90,-76,93,-60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 68, 37, -89, 43, 92, 44, 12, 45, 46, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,68,37,-89,43,92,44,12,46,30,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 22, 58, 94, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,22,78,58,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 23, -57, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,23,13,-57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -97, 39, 76, 79, -84, 24, 56, 89, -29, 30, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-97,39,76,79,-84,24,56,89,-29,31,30,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 28, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52, 6, 72, -42, 25, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,6,72,-42,95,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 6, 8, -25, 24, -74, -10, -14, 77, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,6,8,-25,24,-74,-10,-14,94,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 4, 74, 44, 46, 79, 19, 52, 21, 85, -88, -57, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,4,74,44,46,79,19,52,21,85,-88,62,-57,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 97, 99, 7, 15, 79, 16, -23, 86, 55, 87, 90, 30, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,97,99,7,15,79,16,-23,86,55,87,90,31,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 81, 85, 26, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,85,-95,26,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 38, 86, -26, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,38,86,78,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 4, 69, 42, 45, 15, 16, 82, 52, 85, -55, 55, 89, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,4,69,42,45,15,16,82,52,85,-55,55,95,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,-5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -98, -82, -53, 55, 40, 10, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-98,-82,-53,55,40,60,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 0, -3, 41, 89, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,0,-3,76,41,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 97, 34, -68, 35, 7, 39, 12, 13, 78, 19, 54, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,97,34,-68,35,7,39,12,13,78,19,87,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 65, 66, -69, 70, -40, 10, -46, 50, 84, -85, 20, 22, 87, -58, -27, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,65,66,-69,70,-40,10,-46,50,84,-85,20,22,87,-58,-27,94,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 3, 5, 69, -41, 74, 76, 13, 48, 17, 18, 85, 88, 24, 90, 28, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,3,5,69,-41,74,76,13,48,17,18,85,88,28,-32,24,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 1, 66, 67, 37, 71, 40, 8, 41, 12, 14, -81, -50, 21, -56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,1,66,67,37,71,40,8,41,12,14,-81,21,-56,-50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 34, 35, 36, 69, 38, -72, 10, 19, 85, 86, 89, 90, 27, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,34,35,36,69,38,-72,10,19,85,86,89,90,60,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-83, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,-83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 18, -25, -10, 60, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,18,-25,-10,61,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, -88, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 4, -54, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,4,76,-54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 17, -84, 20, 53, 87, 75, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,17,-84,20,53,87,94,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, -8, 42, 44, 46, 83, -84, 53, 22, -91, 60, 62, 94, 63, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,33,-8,42,44,46,83,-84,53,22,-91,60,63,-64,62,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 66, 2, -3, 67, 6, 7, -72, -43, 10, 77, 16, 82, 84, -22, 86, 54, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,66,2,-3,67,6,7,-72,-43,10,77,16,82,84,-22,86,90,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 81, 98, 36, 56, 59, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,81,98,36,59,31,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 3, 21, 40, 42, 91, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,3,21,40,91,-30,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 65, 98, 36, 37, 5, 15, 16, 81, 18, 86, -60, 61, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,1,65,98,36,37,5,15,16,81,18,86,-60,95,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 73, 89, 26, 58, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,73,89,26,77,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, -25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 0, 40, 75, 17, 50, 83, 53, -88, 57, 29, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,0,40,75,17,50,83,53,-88,57,29,63,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, -87, 86, -90, 73, 91, 27, 30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,-87,86,-90,73,91,27,79,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 69, 40, -41, 9, 75, -45, 45, 79, 48, 82, -88, 90, 91, 27, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,69,40,-41,9,75,-45,45,79,48,82,-88,90,91,31,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 68, 9, -74, 75, 77, -16, 18, 51, 22, 87, 58, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,68,9,-74,75,77,-16,18,51,28,22,58,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 70, 72, 73, 78, -48, 79, -17, 82, 83, 52, -29, 28, 29, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,97,70,72,73,78,-48,79,-17,82,83,52,-29,28,30,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-51, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[61,-51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 82, -84, 38, 39, 11, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,82,-84,38,39,14,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 64, 99, -4, 71, 42, 43, 76, 16, -81, 62, 30, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,64,99,-4,71,42,43,76,16,-63,-81,30,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, -82, 49, 87, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,-82,87,40,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 97, 2, -35, 73, 48, 16, 81, -18, -19, -52, 83, 88, 28, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,32,97,2,-35,73,48,16,81,-18,-19,-52,83,88,95,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 83, 20, -6, 42, 11, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,83,20,-6,42,44,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 65, -82, 68, 54, 40, -41, 25, 90, 74, 11, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,65,-82,68,54,40,-41,25,90,74,76,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -34, 52, -38, 5, 21, 86, 72, 11, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-34,52,-38,5,21,86,72,79,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 97, 17, 50, -19, 19, -68, 85, 55, 58, 13, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,97,17,50,-19,19,-68,85,55,58,78,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(23, -73, 25, 59, 93, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,-73,25,93,30,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(42, 28, -61, 77, 14, 62, 31, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,28,-61,77,14,62,47,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 66, 3, 68, 41, 44, 45, 14, 46, 79, 18, 19, 84, 20, 53, 25, 90, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,66,3,68,41,44,45,14,46,79,18,19,84,20,53,25,90,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, -67, 3, -4, -5, 37, -72, 74, 43, 79, 50, 54, 86, 56, 92, 94, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-67,3,-4,-5,37,-72,74,43,79,50,54,86,56,92,95,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 35, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,55,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 49, 20, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,49,68,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, -35, 99, 36, -37, 4, 69, 70, 74, 45, 15, 84, 20, 21, 22, -56, 57, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,1,-35,99,36,-37,4,69,70,74,45,15,84,20,21,22,-56,58,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, 2, 8, -42, 10, -44, 45, 77, 78, 14, -83, 19, 24, 91, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,97,2,8,-42,10,-44,45,77,78,14,-83,19,63,24,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 66, 67, 36, 70, 40, 79, 53, -22, 54, 87, -59, 91, 94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,66,67,36,70,40,79,53,-22,54,87,-59,94,30,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 28, 76, 44, 45, -62, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,28,76,44,45,14,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 37, 94, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,94,-16,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55, 88, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,-92,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, 57, 74, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,74,31,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 37, 71, 39, -41, 40, -42, 73, 10, 74, 44, 13, 78, 20, 89, 61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,96,37,71,39,-41,40,-42,73,10,74,44,13,78,20,89,63,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -37, 70, 39, -11, 51, 52, 53, 22, 55, -89, 56, 59, 28, 30, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-37,70,39,-11,51,52,53,22,55,-89,56,59,28,62,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 67, 69, 54, 56, 90, 26, -46, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,67,69,54,56,90,26,14,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 67, 5, 38, 8, 72, -44, 11, 44, -20, 87, 55, -24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,67,5,38,8,72,-44,11,44,55,-24,-20,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 32, 1, 65, 99, 68, -73, -10, 79, 48, 19, 21, 87, 59, 62, -63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,32,1,65,99,68,-73,-10,79,48,19,21,87,59,62,31,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, 18, 19, 68, 41, 10, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,18,19,68,41,29,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 5, 38, -87, -88, -42, 75, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,38,-87,-88,47,-42,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -98, 27, -93, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-98,27,14,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -98, -34, 36, 86, 23, -74, 74, -77, 28, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-98,-34,36,86,23,-74,74,28,-79,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 35, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,84,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 33, 99, 5, 69, 42, 43, -78, 15, 80, 85, 54, -55, 56, 60, -31, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,33,99,5,69,42,43,-78,15,80,85,54,-55,56,60,31,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 97, 66, -55, 39, 73, 10, -27, 60, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,97,66,-55,39,73,10,14,-27,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -35, 67, -37, 5, 72, 44, 15, 48, 83, 20, -87, 25, 89, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-35,67,-37,5,72,44,15,48,83,20,-87,25,93,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 53, 7, -44, 14, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,53,7,-44,79,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, -68, 35, 40, 46, 79, -80, 80, -82, 50, 18, 51, 83, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,-68,35,40,46,79,-80,80,-82,50,18,83,21,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, -69, 71, 7, 77, 15, 16, -84, 22, 59, 29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,-69,71,7,77,15,16,-84,22,59,63,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 67, 3, 8, 42, 43, -48, -18, 51, 20, 53, 89, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,67,3,8,42,43,-48,-18,51,20,89,-60,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, 54, 8, 9, 12, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,54,8,9,63,12,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-84, 19, 20, 37, 88, 61, 62, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,19,20,37,88,61,94,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 84, 37, 22, 54, 88, 24, -13, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,84,37,22,54,88,24,77,-13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 4, 70, 7, 13, 46, 79, 15, 49, 82, 54, 55, 88, 25, 57, 58, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,4,70,7,13,46,79,15,49,82,54,55,88,25,57,61,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 0, 83, 54, 93, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,0,83,93,-63,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-19, 34, 99, 67, 87, 55, 25, 62, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,34,99,67,87,55,62,15,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 1, 35, 6, 40, 11, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,1,35,11,-60,6,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 35, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,74,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 81, 54, 7, 58, 12, 77, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,81,54,7,58,77,-16,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -2, 81, -22, 8, 91, 44, 29, 46, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-2,81,-22,8,91,44,30,29,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 77, -94, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,77,14,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 36, 7, 8, -10, 10, 16, 48, 17, 18, -54, 21, 54, 87, 23, 89, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,36,7,8,-10,10,16,48,17,18,-54,21,54,87,57,23,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 55, 71, -25, 10, 59, 76, 13, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,55,71,-25,10,59,76,61,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(5, 24, 73, 10, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,24,73,95,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 0, 1, 67, 6, -87, 24, 57, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,0,1,67,6,-87,57,-92,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -86, -71, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-86,8,-71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 17, 65, -87, 7, 8, 73, 44, 12, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,17,65,-87,7,8,73,44,46,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -1, -67, 99, 35, 36, 78, 15, -48, 57, 59, 28, 60, 29, -94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-1,-67,99,35,36,78,15,-48,57,59,28,60,29,30,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, 35, 38, 70, -41, 77, -16, 21, 87, 60, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,35,38,70,-41,77,-16,21,87,95,31,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 18, 98, 54, -57, 88, 57, -31, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,18,98,54,-57,88,57,31,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34, 36, -10, 73, -13, 46, 53, 86, 58, 27, 28, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,34,36,-10,73,-13,46,53,86,58,28,-61,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(40, 72, 74, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[40,74,59,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -50, -99, 51, 35, 22, -7, 6, 55, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-50,-99,51,35,22,-7,6,61,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 68, 5, 39, -25, -26, 9, 42, 74, 10, -30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,68,5,39,-25,-26,9,42,74,10,95,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -69, 5, 39, 40, 9, 75, 44, 13, -82, 20, -54, -90, -91, 28, -29, -94, -63, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-69,5,39,40,9,75,44,13,-82,20,-54,-90,-91,28,-29,-94,63,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 67, 51, 86, 40, 56, 57, 44, 45, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,67,51,86,40,56,57,44,94,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 21, 23, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,21,87,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 49, 99, 87, -88, 74, 59, 44, -77, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,49,99,87,-88,74,59,44,94,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-84, -39, -42, 44, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-39,-42,62,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, -66, 99, -7, 38, 8, -46, 14, 80, -17, 81, 50, 18, 51, 29, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,33,-66,99,-7,38,8,-46,14,80,-17,81,50,18,51,30,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(72, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 85, 37, 86, 39, -8, 55, 40, 24, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,85,37,86,39,-8,55,40,60,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 68, -70, 5, 7, 74, 77, -46, -14, 83, 22, 24, 88, 89, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,33,68,-70,5,7,74,77,-46,-14,83,22,24,88,89,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-3, 2, 22, 24, 13, 94, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,2,22,24,94,-15,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 0, 2, 50, -6, 69, 22, 42, 13, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,0,2,50,-6,69,22,42,15,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 2, 69, -39, -76, 80, 49, -51, 83, -53, 20, -56, 55, 89, 90, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,96,2,69,-39,-76,80,49,-51,83,-53,20,-56,55,90,31,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 67, 51, 69, 87, -88, 57, -60, 59, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,67,51,69,87,-88,57,-60,62,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 1, -35, 37, 8, -73, 41, 42, 10, -44, -18, 83, 19, 30, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,1,-35,37,8,-73,41,42,10,-44,-18,83,19,94,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 80, 33, 65, 17, 97, 69, 73, 74, 11, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,80,33,65,17,97,69,73,74,46,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 49, 52, 84, 5, 22, 39, 26, 12, 13, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,49,52,84,5,22,39,26,12,15,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 83, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,41,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 35, -70, 69, 7, 8, 72, 76, 16, 86, 23, 90, 28, 61, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,35,-70,69,7,8,72,76,16,86,23,90,28,61,94,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -5, -27, -60, 28, 12, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-5,-27,12,-95,-60,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -70, 40, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-70,77,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, -89, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,56,-89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 33, 2, -23, -8, 88, 40, 56, -41, 92, 61, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,33,2,-23,-8,88,40,56,15,-41,61,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -99, 36, 71, 23, 89, 9, -10, -27, -44, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,-99,36,71,23,89,9,-10,-27,79,-44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 41, 74, 75, 44, 15, 17, 50, -20, 52, 86, 55, 88, -60, 28, 94, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,41,74,75,44,15,17,50,-20,52,86,55,88,-60,28,95,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 2, 35, 38, 6, -78, 17, 83, 20, 21, 88, 91, -94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,2,35,38,6,-78,17,83,20,21,88,91,30,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, -20, 68, 21, 87, 24, 59, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,-20,68,21,87,43,24,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 39, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,47,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 50, 4, -40, 89, 57, -26, 26, 92, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,50,4,-40,89,57,-26,92,-30,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 34, 99, 68, 36, -39, 6, 77, 80, 83, -23, 55, -62, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,34,99,68,36,-39,6,77,80,83,-23,55,-30,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, -2, 83, 67, 52, -8, 39, 71, 27, -31, 30, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-2,83,67,52,-8,39,71,27,-31,78,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 65, 72, -10, 44, 45, 13, 79, -80, 49, 83, 51, 21, 89, 90, 28, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,65,72,-10,44,45,13,79,-80,49,83,51,21,89,90,63,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 83, -39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 67, 20, 52, 68, 21, 8, 41, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,67,20,52,68,21,13,8,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 33, 1, 85, 42, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,33,1,85,93,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(27, 29, 14, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,29,79,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 77, -30, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,77,94,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 4, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,60,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55, 40, 9, 60, -13, -94, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,40,9,60,-13,79,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 6, -78, 61, 13, -95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,6,-78,61,13,63,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 65, -3, 86, -73, 24, 25, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,65,-3,86,-73,24,27,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -99, 4, 69, -70, 77, 46, 47, 16, -49, -85, 54, 86, 23, 89, 59, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-99,4,69,-70,77,46,47,16,-49,-85,54,86,29,23,59,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 18, 68, 87, 90, -31, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,18,68,87,90,78,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-38, 59, 60, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,59,60,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 0, 32, 68, -6, 37, 74, -75, 11, 14, 18, 20, -25, 88, 60, -94, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,0,32,68,-6,37,74,-75,11,14,18,20,-25,88,60,94,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 19, 56, 90, 93, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,19,56,93,79,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 37, 73, -44, -45, 44, -81, 17, 49, 82, -21, -85, -87, 23, 61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,37,73,-44,-45,44,-81,17,49,82,-21,-85,-87,23,93,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -84, 67, 4, 36, 23, 72, 24, -11, 10, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-84,67,4,36,23,72,24,-11,31,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 19, -38, -41, 57, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,19,-38,-41,90,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 1, 22, 86, -88, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,1,22,86,-59,-88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, 36, 37, 71, 10, 75, 82, 84, 53, 87, -24, 26, 60, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,66,36,37,71,10,75,82,84,53,87,-24,26,95,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 3, 73, 75, -76, 13, 20, 86, 55, 56, 24, 28, 62, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,3,73,75,-76,13,20,86,55,56,24,62,-32,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 84, 53, -86, -75, 12, 92, 46, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,84,53,-86,-75,12,92,63,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 34, 99, 3, 70, 73, 41, 47, -18, 81, 53, -92, 60, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,33,34,99,3,70,73,41,47,-18,81,53,-92,61,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -3, 66, 68, 71, 75, -15, 79, 80, 17, 53, 87, 89, 57, -58, 95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-3,66,68,71,75,-15,79,80,17,53,87,89,57,63,-58,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 85, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,-35,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -35, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,34,-35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -38, 37, 71, 8, 41, 74, 11, 80, 17, 18, 21, 57, 58, 59, 91, 61, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-38,37,71,8,41,74,11,80,17,18,21,57,58,61,29,59,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 66, -69, 69, 40, 77, 47, 48, 83, -21, 93, 62, -63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,66,-69,69,40,77,47,48,83,-21,93,62,31,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 82, 53, 10, -91, -13, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,97,82,53,10,-91,-13,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, -85, 25, 58, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,-85,25,94,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 2, 36, -69, 72, 40, 79, 15, 19, 21, 54, 28, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,2,36,-69,72,40,79,15,19,21,54,29,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 97, 66, 99, 8, 11, -77, 81, 83, 22, 59, 92, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,97,66,99,8,11,-77,81,83,22,63,59,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 21, 39, -42, -90, 90, 74, -30, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,21,39,-42,-90,90,74,45,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 58, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,62,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 35, 68, 37, 70, -71, 39, 7, 13, 54, 24, 88, 26, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,35,68,37,70,-71,39,7,13,54,24,88,62,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 49, 65, 50, 18, 4, -27, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,50,-92,-27,4,18,49,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 18, 35, 68, 37, 7, 74, 76, 14, 95, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,18,35,68,37,7,74,76,15,14,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 99, -37, 5, 70, 71, 72, 42, 43, 13, 14, 78, 82, 52, 25, -63, 62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,99,-37,5,70,71,72,42,43,13,14,78,82,52,25,31,-63,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 5, 69, -6, 73, -48, 48, 22, 87, 56, 59, 28, 92, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,5,69,-6,73,-48,48,22,87,56,59,31,28,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, 71, 40, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,71,91,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 99, 68, 69, 5, 73, 44, 76, -52, 83, 53, 87, -88, 88, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,99,68,69,5,73,44,76,-52,83,53,87,61,-88,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -34, 65, 70, -72, 9, 73, 10, 46, 47, 17, 49, 51, 52, -90, 91, 93, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-34,65,70,-72,9,73,10,46,47,17,49,51,52,-90,93,-64,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -53, 54, 61, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-53,54,95,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 69, -42, -76, 43, 14, -49, 48, 54, 25, -91, -28, 92, 93, 29, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,69,-42,-76,43,14,-49,48,54,25,-91,-28,93,-96,29,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 6, 72, 44, 77, 13, 47, 49, 81, 18, 84, 85, -24, 90, -31, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,6,72,44,77,13,47,49,81,18,84,85,-24,90,62,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 38, 70, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,56,38,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 1, 53, 5, 86, 57, -42, 25, 74, 91, 44, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,1,53,5,86,57,-42,25,74,91,60,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(26, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -67, 66, 36, 68, 39, 7, 77, 15, 18, 53, 55, 56, 30, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,-67,66,36,68,39,7,77,15,18,53,55,56,31,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 34, 66, 37, 8, -78, 45, 46, 82, -84, 52, 88, -58, 58, -91, 29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,34,66,37,8,-78,45,46,82,-84,52,88,-58,58,-91,63,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 66, 4, 6, 71, -43, 74, -11, 11, 45, 13, 80, 49, 84, 87, 23, -91, 26, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,66,4,6,71,-43,74,-11,11,45,13,80,49,84,87,23,-91,31,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 86, 7, 42, 43, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,86,7,42,44,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 35, -41, 72, 12, 77, 46, 78, 18, 86, -24, 23, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,35,-41,72,12,77,46,78,18,86,-24,94,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -34, 68, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,44,-34,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 66, 50, 22, -89, 40, 25, 59, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,66,50,22,-89,40,59,-80,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 69, 37, -71, 72, 41, 43, 44, 84, 21, 88, 56, 26, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,69,37,-71,72,41,43,44,84,21,88,56,60,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, 69, -38, 72, -73, 45, 80, 51, 22, -55, 88, -89, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,65,69,-38,72,-73,45,80,51,22,-55,88,62,-89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-83, 66, -35, 18, -36, -85, 85, -6, 6, 89, 77, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,66,-35,18,-36,-85,85,-6,77,-48,6,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 52, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,69,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -65, 96, 67, -6, 39, 42, -16, 47, -49, -84, -20, 51, 84, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-65,96,67,-6,39,42,-16,47,-49,-84,-20,57,51,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 67, 4, 5, 8, 45, 78, 46, -17, 50, 51, -87, 26, -61, -94, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,67,4,5,8,45,78,46,-17,50,51,-87,26,-61,94,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 66, 45, 46, 17, 81, -82, 84, 55, 26, 91, -93, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,66,45,46,17,81,-82,84,55,26,91,29,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 98, -69, 4, 37, 6, 41, -43, 10, 44, -78, 13, 48, -49, 81, 53, 59, -92, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,98,-69,4,37,6,41,-43,10,44,-78,13,48,-49,81,53,59,60,-92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -98, -34, 1, -99, 98, 36, 70, 44, 76, 13, 81, 85, 23, 57, 89, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-98,-34,1,-99,98,36,70,44,76,13,81,85,23,57,89,94,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 33, 2, -7, 71, 7, 42, 13, 14, 80, 54, 88, 91, -60, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,33,2,-7,71,7,42,13,14,80,54,88,91,62,-60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 66, 51, 84, 86, 40, 25, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,66,51,84,86,40,28,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 99, 4, 69, 6, -73, 42, 81, 83, -53, 55, -25, -31, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,99,4,69,6,-73,42,81,83,-53,55,-25,94,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 16, 82, 19, 85, 40, 41, 89, 10, 29, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,16,82,19,85,40,41,89,29,-31,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 38, 88, 9, -13, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,38,88,9,63,-13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, -2, 18, 83, -52, 4, 68, 38, 88, 9, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,97,-2,18,83,-52,4,68,38,88,30,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 91, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,92,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 65, 18, -19, 35, -86, 90, 92, 45, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,65,18,-19,35,-86,92,30,45,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 3, 99, -5, 38, 8, 11, 44, 13, -47, 47, 80, -18, 18, 51, 90, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,3,99,-5,38,8,11,44,13,-47,47,80,-18,18,90,-96,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 67, 3, -5, 5, 69, -41, 41, 19, -86, 54, 87, 23, -58, 90, 91, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,67,3,-5,5,69,-41,41,19,-86,54,87,23,-58,90,91,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -3, -36, 36, -40, -42, 10, 74, 45, 13, 18, 19, 52, 56, 59, -32, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-3,-36,36,-40,-42,10,74,45,13,18,19,52,56,59,31,-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-91, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 71, 76, 79, 16, 81, -50, 22, 55, 23, 87, 27, 62, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,71,76,79,16,81,-50,22,55,23,87,62,-96,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -53, -86, -9, -25, 90, 63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-53,-86,-9,-25,90,95,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -67, 2, 71, 73, 74, 48, 18, 82, 51, 53, 23, 55, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-67,2,71,73,74,48,18,82,51,53,30,23,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 1, 66, 5, -74, 42, 28, 77, 13, 30, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,1,66,5,-74,42,28,77,30,-64,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 35, 99, 67, 6, 40, 10, -77, 47, 80, 56, 57, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,35,99,67,6,40,10,-77,47,80,57,30,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 2, 3, 84, 9, 73, 77, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,2,3,84,9,77,-48,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 2, 51, 4, 85, 69, 38, 86, 89, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,2,51,4,85,69,38,89,63,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-3, 68, 36, 4, 8, 9, 76, 78, -81, 57, 25, -64, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,68,36,4,8,9,76,78,-81,57,25,-32,-64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -4, 38, 41, 42, 10, 75, 23, 88, 90, 61, 30, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-4,38,41,42,10,75,23,88,90,61,31,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 67, -52, 69, 54, 86, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,67,-52,69,86,39,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 82, -36, 20, 4, 38, -72, 58, 92, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,82,-36,20,4,38,-72,92,15,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 3, 55, 88, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,3,88,25,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 70, -73, 89, 60, 46, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,70,15,-73,46,60,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 49, -21, -55, 6, 7, -72, -91, 11, 46, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,49,-21,-55,6,7,-72,-91,46,-80,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 66, 67, -70, -12, 13, 45, 81, -19, 84, 55, 57, 92, -94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,66,67,-70,-12,13,45,81,-19,84,55,57,92,63,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -6, 70, 71, 40, 11, 78, -21, 53, 22, 55, 23, 92, -29, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-6,70,71,40,11,78,-21,53,22,55,23,92,95,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 2, 3, 68, -89, 89, 13, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,2,3,68,-89,89,29,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 37, 24, -73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,-73,-34,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, -3, -36, 68, 37, 70, 71, 42, 77, -16, 48, 55, -25, 91, 60, 62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,65,-3,-36,68,37,70,71,42,77,-16,48,55,-25,91,62,31,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, -70, 54, 39, -89, 74, 27, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,-70,54,39,-89,74,95,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 34, -52, 51, -84, 52, 23, 77, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,34,-52,51,-84,52,23,93,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 69, 70, -75, 47, 49, 51, -22, 21, -24, 55, 88, 59, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,97,69,70,-75,47,49,51,-22,21,-24,55,88,59,62,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 36, -69, -70, 44, 14, 80, 17, 82, -19, 19, 86, 54, 87, 91, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,36,-69,-70,44,14,80,17,82,-19,19,86,54,91,31,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 98, -35, -67, 35, 72, -42, 47, -80, 82, 51, -20, 52, 85, 56, 26, 90, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,98,-35,-67,35,72,-42,47,-80,82,51,-20,52,85,56,27,26,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -35, 38, 8, -43, 43, 83, 85, 23, -28, 92, -31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-35,38,8,-43,43,83,85,23,-28,92,95,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 51, 3, 83, 54, 88, 56, 89, 59, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,33,51,3,83,54,88,56,89,79,59]", resultFormatted);
    }
}

