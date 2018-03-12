package java_testcases.junit;


public class NEXT_PERMUTATION_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-91, 98, -88, -1, 33, 35, 85, 12)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,98,-88,-1,33,85,12,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-23, 39, 37, 84, 16, 25, 30, 27, 42)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,39,37,84,16,25,30,42,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 19, 12, 53, 7, 7, 64, 7, 56, 17, 35, 38)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,19,12,53,7,7,64,7,56,17,38,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-86, 21, 67, 55, 47, -66, 7, 86, 32, 33, 24, -3, 56, 16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,21,67,55,47,-66,7,86,32,33,24,16,-3,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6, -86, 46, 20, 94, 89)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,-86,46,89,20,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(15, 41, 16, 2, 49, 82, 79, -18, 40, 39, 52, 49, 23, 30, 32, 42, -43, 41)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,41,16,2,49,82,79,-18,40,39,52,49,23,30,32,42,41,-43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(79, 59, 76, 76, 59, 48, 41, 95, 91, 30, 87, 67, 12, 26, 62, -92, 82, 60, 98)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,59,76,76,59,48,41,95,91,30,87,67,12,26,62,-92,82,98,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 58, 48, 20, 82, 15, -10, -29, 27, 71, 87)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,58,48,20,82,15,-10,-29,27,87,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 92, 86, -16, 12, 21, 72, 79, 34, -56, 63, 99, 98, 65, 92, 78, 3, 89)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,92,86,-16,12,21,72,79,34,-56,63,99,98,65,92,78,89,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 97, 26, 40, 89, 99, 37, -98, 49, -72, 2, 89, 61, 75, -82, 81)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,97,26,40,89,99,37,-98,49,-72,2,89,61,75,81,-82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(88, 78, -81, 34, 41, 87, 62)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,78,-81,34,62,41,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-75, -59)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(42, 85, 14, 86, 9, 78, -49, 33, -95, 26)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,85,14,86,9,78,-49,33,26,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, -61, 57, 35, 33)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,33,-61,35,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 44, 10, 76, 71, 6, 25, -7, -50, 5, 27, 31, -7, 28, 57)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,44,10,76,71,6,25,-7,-50,5,27,31,-7,57,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-11, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,-11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(15, -17, 56, 63, -14, 68)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,-17,56,63,68,-14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(27, -59, 12, -70, 75, 63, 56, -83, 11, 37, 11, 39, 3, 58, -53, 39, 50, 23)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,-59,12,-70,75,63,56,-83,11,37,11,39,3,58,-53,50,23,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-87, 29, 48, 86, 20, 15, -64, 98, 47, -99, 88, 7, 36)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,29,48,86,20,15,-64,98,47,-99,88,36,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(70, 6, 60, 57, 19, 95, 11, 76, -11, 35)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,6,60,57,19,95,11,76,35,-11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-60, 75, -43, 49, -29, -88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,75,-29,-88,-43,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(11, -45, 38, -79, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,-45,38,44,-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 64, -36, 76, 54, -21, 97, 36, 23, 2, -96, 17, 3, 18, 86, -89, 31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,64,-36,76,54,-21,97,36,23,2,-96,17,3,18,86,31,-89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(12, 16, -85, 48, 69)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,16,-85,69,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, -51, 9, 0, 72, -88, 45, 47, -59, 26, 79, 11, 62, 41, -34, 99, -43, 63, 19)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,-51,9,0,72,-88,45,47,-59,26,79,11,62,41,-34,99,19,-43,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-62, 8, -14, -48, 21, 71, 18, 85)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,8,-14,-48,21,71,85,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -1, 45, 19, 26, 14, 60, 91, 79, 46, -41, 46, 23, 82, 75)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-1,45,19,26,14,60,91,79,46,-41,46,75,23,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 92, 18, -59, 79, 52, 93, 39, -66, 69, -2, 17, 3, 71, 59, 37, 76, 33)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,92,18,-59,79,52,93,39,-66,69,-2,17,3,71,59,76,33,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(93, -74)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-72)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 84, -88, 93, 29, 82, 23, -40)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,84,-88,93,82,-40,23,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 20, 95, 9, 32, -85, 15, 67, 57, 83, 39, 36, -69, 90, 58, 49, -71)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,20,95,9,32,-85,15,67,57,83,39,36,49,-71,-69,58,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(44, 41)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-63, -95)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 65, 36, 61, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,65,61,21,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(44, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7, 87, 9, 51, 59, 35, -19, -35, -21, 62, 77, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,87,9,51,59,35,-19,-35,-21,77,37,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -73, -28, 50, 78, -91, 95, 87, 18, 2)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-73,-28,50,78,2,-91,18,87,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(31, 69, 61, 2, 92, 71, -38, 18, 32, 51, 66, -44, 62, 77, 82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,69,61,2,92,71,-38,18,32,51,66,-44,62,82,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-84, 19, 12, 55, 99, 27, 92, -94, 17, 12, 99, 87, 6, -17, 43, 84, 52, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,19,12,55,99,27,92,-94,17,12,99,87,6,-17,43,84,60,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(63, -45, 17, 32, 99, -8, 52, 70, -10, 40, 90, 44, 57, 57, -87)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,-45,17,32,99,-8,52,70,-10,40,90,57,-87,44,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(23)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, -19, 17, 6, 27, 46, 90, 86, 10, 50, 13, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-19,17,6,27,46,90,86,13,8,10,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(77, 83, 26, 38, 73, 92, -15, 0, 17, 93, 69)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,83,26,38,73,92,-15,0,69,17,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-37, 88, 5, 45, 16, 0, -45, 51, 18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,88,5,45,16,0,18,-45,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-91, 46, 92, 94, 99, 88, -63, 87, -73, 87, 66, 23, -4, 73, 96, 22)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,46,92,94,99,88,-63,87,-73,87,66,23,-4,96,22,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, -82, 39, 91, 26, 7, 70, 60, 86, -82, 84, 87, 57, 15, 92, -33, 88, 87, 86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,-82,39,91,26,7,70,60,86,-82,84,87,57,15,92,86,-33,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-74, 2, 99, -90, 99, -64, 61, 44, -3, -93, 16, 79, 59, -48, 29)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,2,99,-90,99,-64,61,44,-3,-93,16,79,59,29,-48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(11, -57, 11, 30, 46, 20, 39, 74, 45, 1, 73, 21, 89, -5, 46, 17)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,-57,11,30,46,20,39,74,45,1,73,21,89,17,-5,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-62, -75, -8, 29, 92, 10, 43, 86, -75, 45, 22, 48, -98)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-75,-8,29,92,10,43,86,-75,45,48,-98,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, 24, 44, -33, 95, 41, 81)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,24,44,-33,95,81,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-87, -9, -44, 48, 22, 92, 85, -63, -20, 25, 47, 83, 28, -37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-9,-44,48,22,92,85,-63,-20,25,83,-37,28,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-32, 4, 55, 2, -90, 45, 88, 50, 21, 7, 66)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,4,55,2,-90,45,88,50,21,66,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 69, 89, -82, 74)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,69,89,74,-82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 87, 87, 76, -16, 37, 80, 5, 51, -58, 61, 84, 2, 19, 92, 57, 25, 62, 53)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,87,87,76,-16,37,80,5,51,-58,61,84,2,19,92,57,53,25,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86, 45)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(12, -93, -60, 0, 76, 54, 81, 92, 96, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,-93,-60,0,76,54,81,96,44,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -92, 86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,86,-92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(62, 24, 87, 20, 47, 35, 65, 50)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,24,87,20,47,50,35,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-14, 62, 74)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-14,74,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 2)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 91, 79, 25, 69, 47, -89, 93, 74, 1, 98)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,91,79,25,69,47,-89,93,74,98,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(8, 89, 51, 7, 97, 92, 39, -38, 66, -3, -16, 90, -66, 51, 5, 19, 15)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,89,51,7,97,92,39,-38,66,-3,-16,90,-66,51,15,5,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(60, 96, 91, 13, 7, 18, 73, 51)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,96,91,13,7,51,18,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(89, 63, 83, 97, 63, 46, -55, -36, 22, 25, 91, 93, -3)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,63,83,97,63,46,-55,-36,22,25,93,-3,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55, 0, -43, -42, 60, 53, 39, 89, 38, 52, -13, 13, -61, 74, 1, 29)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,0,-43,-42,60,53,39,89,38,52,-13,13,-61,74,29,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(57)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(94, 44, 59, 72, 12, -84, 4, 83, 96, 4, 39, 46, 20, 6, 38, 28, 50, 26, 39)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,44,59,72,12,-84,4,83,96,4,39,46,20,6,38,28,50,39,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 34, 31, 7, 43, 71, 39, 90, -60, 55, 63)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,34,31,7,43,71,39,90,-60,63,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 88, -35, -38)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-49,-35,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6, 42)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 13, -16, 59, 20, 18, 14, 29, 89)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,13,-16,59,20,18,14,89,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-37, 86, 81, 38, 5, -25, -35, 24, 3, 5)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,86,81,38,5,-25,-35,24,5,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, 72, 69)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(15, 59, 62, 69)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,59,69,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-76, 52, 50, -23, 32, -49, -9, 35, 47, 63, -43, 51, 60, 54, 53, -76, 94)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,52,50,-23,32,-49,-9,35,47,63,-43,51,60,54,53,94,-76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(29, 49, 31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,29,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 86, 38, 74, 57, -14, 4, 28, 22, 23, 59, 54)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,86,38,74,57,-14,4,28,22,54,23,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(75, 9, -63, 1, 41, 89, 21, 54)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75,9,-63,1,41,89,54,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 9, 84, -45, 88, 9, 73, 58, 57, 82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,9,84,-45,88,9,73,58,82,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 66, 56, -88, 99, -16, -63, 90, 57)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,66,56,-88,99,-16,57,-63,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 98, 44, 62, 43, 94, 84, -62, -70, 46, 37, 48, 3, 0, 97, 92, 76)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,98,44,62,43,94,84,-62,-70,46,37,48,3,76,0,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(47, 83, 86, 0, 17, -62, 26, 60, 47)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,83,86,0,17,-62,47,26,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(76, 34, 16, 67, 26, 11, 19, 28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76,34,16,67,26,11,28,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(29, 8, 6, 98, 24, 4, 16, 30, 73, 75)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,8,6,98,24,4,16,30,75,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, -65, 49, -20, 22, 53, 77)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,-65,49,-20,22,77,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 98, -80, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,98,10,-80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 86, -91, 78, -51, 59, 41, 48, 36, 7, 93, 59, 72)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,86,-91,78,-51,59,41,48,36,7,93,72,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(46, 95, 68, 49, 66, 36, 42, 91, 98, 96, 2, -3, -48, 54, 37, 81, -40)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,95,68,49,66,36,42,91,98,96,2,-3,-48,54,81,-40,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 58, -85, 34, 8, -80, 44, 75, 76, -5, -46, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,58,-85,34,8,-80,44,75,76,-5,60,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(9, 3, 76, 8, -12, 17, 19, 15, 99, 92, 50, 35, 89, 35, 52, 11, -51, 47, 86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,3,76,8,-12,17,19,15,99,92,50,35,89,35,52,11,-51,86,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(10, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(13, -66, 17, 63, 14, 85, 74, 14, 12, 56, 2, -17)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,-66,17,63,14,85,74,14,56,-17,2,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(94, 29, 23, 58, 45, 69, 17, 2, 88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,29,23,58,45,69,17,88,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(43, 49, 81, -90, 45, -74, 77, 29, 19, 3, 28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,49,81,-90,45,-74,77,29,19,28,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(90, -46, -36, -45, 72, 64, 38, 55, 73, 98)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,-46,-36,-45,72,64,38,55,98,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(45, 99, 71, 41, 25, 94, -21, 90, -94)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,99,71,41,25,94,90,-94,-21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-29, -82, 1, 56, 55, 73, 74, 97, 57, 29, 9)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-82,1,56,55,73,97,9,29,57,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(28, 0, 70, -64, -70, 89, 22, -22, 27, -43, 20, 43, 84, -51)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,0,70,-64,-70,89,22,-22,27,-43,20,84,-51,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(24, 28, 99, -53)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,99,-53,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -55, 66, 47, -19, -21, 96, 75, 41, 95, 82, 26, 91, 73, 13, 29, 41)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-55,66,47,-19,-21,96,75,41,95,82,26,91,73,13,41,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-51, -15, 97, -18, -24, 44, 51, 37, -60, 80, 50, 0, 12, 19, 8, -6, 71, 57)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-15,97,-18,-24,44,51,37,-60,80,50,0,12,19,8,57,-6,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(92, 70, 55, 15, 75, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,70,55,60,15,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(89, 0, 59, -60, 7, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,0,59,-60,44,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 62, -82, 61, 14, 26, 14, 15, 38, -81, 42, 51, 70, -84, -87, 56, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,62,-82,61,14,26,14,15,38,-81,42,51,70,-84,1,-87,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(87, -9, 46, -54)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,46,-54,-9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, -96, 76, 71, 36, 89)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,-96,76,71,89,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-42, -25, 84, 41, 72, 8, 11, -15)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-25,84,41,72,11,-15,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 6, 97, -93, -82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,6,97,-82,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, -40, 97, 53, 88, -16, 66)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,-40,97,53,88,66,-16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-15, 69, 8, 30, 70, 92, 50, 0, 66, 63, 2, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,69,8,30,70,92,50,0,66,63,84,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 47, 19, 57, 32, 51, 65, -96, 58, 68, 18, 6, 83, 76, 65, -72, 58)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,47,19,57,32,51,65,-96,58,68,18,6,83,76,65,58,-72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(57, -16, 7)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,7,-16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(24, 42, 46, 74, 23, 66, 29, 11, 84, 53, 58, 68, 34, 54)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,42,46,74,23,66,29,11,84,53,58,68,54,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(76, 38, -22, 17, -35, -75, -68, 83, 5, 86, 0, 24, 48)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76,38,-22,17,-35,-75,-68,83,5,86,0,48,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(95, 49, 4, 40, 48, 89, 30, -16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,49,4,40,89,-16,30,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(94, 61, 86, 98, 70, 91, 10, 47, -30, 3, 64, 21, -64, 5, 46, 36)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,61,86,98,70,91,10,47,-30,3,64,21,-64,36,5,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(26, 84, -61, 10, 20, 60, 39, 14, 43, -10, 80, 24, 2, 65, 78, 26)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,84,-61,10,20,60,39,14,43,-10,80,24,2,78,26,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(23, 15, -4, 75, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,15,44,-4,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 32, 36, 5, 62, 38, -44, 91, 16, -49, 33, 20, 70, 31, 22, 35)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,32,36,5,62,38,-44,91,16,-49,33,20,70,31,35,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 17, -4)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 76, -54, 13)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,76,13,-54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 71)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,-99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-28, 79, -65, -13, 9, 68, 62, 54, 37, 64)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,79,-65,-13,9,68,62,54,64,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -58, 80, -84, 29, 42, 52, 24, 39, -12, 83, 63, 45)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,-58,80,-84,29,42,52,24,39,45,-12,63,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, 10, 79, 46, 23, -83, 45, -85, 39)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,10,79,46,23,-83,45,39,-85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(87, 12, 18, 32, 96, 43, 35, 64, 91, 38, 35, 49)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,12,18,32,96,43,35,64,91,38,49,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(75, 40, 95)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75,95,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(61, 33)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(90, -76, 1, 30, 27, 59, 91, -11, 90, 93, 42, 95, -8, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,-76,1,30,27,59,91,-11,90,93,42,95,84,-8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-22, 49, 62, -45, 86, 49, 45, 56, 17, -86, 55, 62, 14, 17, 54, -36, 82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,49,62,-45,86,49,45,56,17,-86,55,62,14,17,54,82,-36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-25, 71, 67)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,-25,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(43, 71, 89, 84, 85, -43, 93, 12, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,71,89,84,85,-43,93,21,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-62, 85, -50, 12, -10, 79, -69, 12, 83, 39, 71)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,85,-50,12,-10,79,-69,12,83,71,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -71, -86, 84, 6, 96, 56, 73, 46, 34, 19, 11, -94, 52, 10, -17)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-71,-86,84,6,96,56,73,46,34,19,11,-17,-94,10,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 24, 95, -88, 26, 25, 78, 24)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,24,95,-88,26,78,24,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(58, 90, -67, 94, 7, -7, 1, 8, 91, 84, 40, 30)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,90,-67,94,7,-7,1,30,8,40,84,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, -58, 66)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,66,-58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 0, 46, -92, 2)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,0,46,2,-92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 56, 62, -24, -76, -2, 72, 88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,56,62,-24,-76,-2,88,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(87, 80, 65, 0, 34, -41, 63, 54)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,80,65,0,34,54,-41,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(46, 29, 6, -90, 16, 4, 58, 85, 64, 13)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,29,6,-90,16,4,64,13,58,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(27, 6)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(63, 34, 39, -35, 91, 44, 30)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,34,39,30,-35,44,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 34, 5, 24, 8, 32, 47, 60, 62, 43, 18, 67, -73, 53, -10, 86, 1, -82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,34,5,24,8,32,47,60,62,43,18,67,-73,53,1,-82,-10,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-87, -47, 36, 92, 51, 35, 7, 8, 98, 82, 4, 71, 93, -92)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-47,36,92,51,35,7,8,98,82,4,93,-92,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(30)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 31, 91, -41, -67, 45, 60, 64, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,31,91,-41,-67,45,64,1,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(10, 25, 19, 20, 13, 58, 10, 14, -25, -29, 26, -46, 44, -25, 33, 28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,25,19,20,13,58,10,14,-25,-29,26,-46,44,28,-25,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(54, 15, 74)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,74,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, 60, 71, 79, 11, -71, -93, 43, 78, 99, 47, -81, 10, 90, -85, 41, 48)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,60,71,79,11,-71,-93,43,78,99,47,-81,10,90,-85,48,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(10, 63, 14, -46, 37, 76, 2, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,63,14,-46,37,76,37,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(46, 78, 2, 27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,78,27,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(63, 82, 88, -30, 70, 39, 86, 27, 21, -75, 35, 87, 11, 13, 21, 92, 61, 62)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,82,88,-30,70,39,86,27,21,-75,35,87,11,13,21,92,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(60, 11, 39, 51, 38, 67)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,11,39,51,67,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 66, 89, 86, 60, 76, -97, 34, 91, 57, 67, 81, 50, 21, 64, 40, 72, 82, 87)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,66,89,86,60,76,-97,34,91,57,67,81,50,21,64,40,72,87,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 38, 9, 10, 36, 89, 47, 20, 84, -46, 80, 53, 64, 12, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,38,9,10,36,89,47,20,84,-46,80,53,64,21,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(8, 67, 56, 33, 43, 34, 6, 29, 11, -67, 38, -20, 64, 0, 72)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,67,56,33,43,34,6,29,11,-67,38,-20,64,72,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 99, 39)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,-65,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 4, 97, 78, -90, -87, 72, 63)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,4,97,78,-90,63,-87,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 12, 51, 5, 4, 62, 1, 32, 13, 15, 7, -17, 9, -74, 84, 94, 30, 5, 6)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,12,51,5,4,62,1,32,13,15,7,-17,9,-74,84,94,30,6,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-70, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,-70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(28, 40, 1, 73, 47, 32, 56, 7, 11, 68, 58, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,40,1,73,47,32,56,7,58,8,11,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(27, 64, -32, 10, 49, 71, 82, -11, -39, 88, 80, 81, 1, 14)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,64,-32,10,49,71,82,-11,-39,88,80,81,14,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(43, 81, 46, 48, -22, 15, 41, 91, 7, 47, 16, 12, 54, 6, 39, 60, -95)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,81,46,48,-22,15,41,91,7,47,16,12,54,6,60,-95,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 10, 96, -20, 94, 87, 22, 12, -58, 11, 37, 18, 35, 10, -20, 19, 48)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,10,96,-20,94,87,22,12,-58,11,37,18,35,10,-20,48,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(70, -95, 21, 30, 48, 63, 67, 81, 57, 21, 14, -29)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,-95,21,30,48,63,81,-29,14,21,57,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(41, 87)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-93, 72, 96, 63, 88, 17, 85, 63, 54, 0, -58, 51, 38)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,72,96,63,88,17,85,63,54,0,38,-58,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 54, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,8,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(60, 84, -55, 13, 70, 39, 37, 43)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,84,-55,13,70,39,43,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 90, 43, 96, 22, 71, 94, 7)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,90,43,96,22,94,7,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-69, 8, 47, 81)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,8,81,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 91, 60, 37, 34, -54, -15, 23, 76, 87, -57, -96)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,91,60,37,34,-54,-15,23,87,-96,-57,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 38, 58, -18, 32, 69, 70)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,38,58,-18,32,70,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-10, 78, -27, 15, 96, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,78,-27,37,15,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-71, 88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,-71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 8, 70, 51, 55, 24, 8, 36, 95, 79, 2, 4, 49, 31, 62, -40, -15)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,8,70,51,55,24,8,36,95,79,2,4,49,31,62,-15,-40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 31, 83, 50, 77)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,31,83,77,50]", resultFormatted);
    }

    public void test_187() throws java.lang.Exception {
    }
}

