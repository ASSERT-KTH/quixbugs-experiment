package java_programs;


public class MERGESORT_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 98, 6, 96, 7, -92, 30, 91, 77, -37, -29, 41, 14, 87, -62, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-62,-37,-29,6,7,14,30,41,58,70,77,87,91,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-37, 17, -52, 33, 2, -87, -74, 41, 83, 0, 80, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-76,-74,-52,-37,0,2,17,33,41,80,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 2, -56, 29, 1, 51, 95, 5, 53, 15, -44, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-44,1,2,5,15,29,32,51,53,84,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 0, 55, 87, 91, 28, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,12,23,28,55,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 80, 21, 32, 90, 40, 60, 13, 42, 41, 33, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,13,21,32,33,33,40,41,42,60,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, -12, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,19,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 52, -23, 21, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,16,21,52,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, 31, 48, 1, -74, -8, 14, 3, 93, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-8,1,3,14,31,38,45,48,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, 9, 34, -13, 13, 93, 19, -55, 82, 32, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-55,-13,9,13,19,32,34,81,82,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-90, -41, 66, 25, -40, 57, 62, 9, 43, -56, 86, 34, 32, 51, -72, 85, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-72,-56,-41,-40,9,25,32,34,43,51,57,62,66,82,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, -25, 99, -88, 75, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-25,7,57,75,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, -14, 8, -28, 27, -59, 15, 72, 6, 10, 24, -68, 88, 61, -94, 1, -33, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-68,-59,-33,-28,-14,1,6,8,10,12,15,24,27,33,61,72,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, 0, 38, 82, 67, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,0,38,67,82,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-91, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-54, 52, -34, 39, 62, 52, 95, 55, 27, 61, 70, 22, 0, 98, 44, -29, -86, 72, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-54,-34,-29,0,22,27,33,39,44,52,52,55,61,62,70,72,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-94, 21, 62, -39, 21, 45, 89, 89, -72, 55, -39, 9, 97, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-72,-39,-39,9,21,21,45,55,62,68,89,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, 61, 88, -7, 5, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,5,36,52,61,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 20, 35, 55, 52, -92, 86, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-69,20,35,52,55,66,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-97, 88, 57, 18, 12, 91, 88, 23, -47, 87, 3, -12, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-47,-12,3,12,18,23,57,87,88,88,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 97, -69, 23, 82, 23, 11, 59, -14, -44, 99, 73, 20, 51, 94, 79, 56, 49, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-44,-14,11,20,23,23,40,46,49,51,56,59,73,79,82,94,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 79, -38, -48, 72, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-38,58,72,79,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, -58, 65, -51, 62, 27, 56, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-51,27,56,62,65,82,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(16, 74, 29, 46, -29, 1, -15, 29, 45, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-15,1,16,29,29,45,46,74,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-19, 24, 28, 36, 21, 77, 41, -26, 46, 0, 83, -64, -50, 66, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-50,-26,-19,0,21,24,28,36,41,46,66,77,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 37, 43, 38, 12, 34, 55, 33, 89, 94, -83, 99, -84, 63, 74, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-83,12,33,34,37,38,43,52,55,63,74,84,89,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, -51, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,36,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 12, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,12,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, -16, 85, 63, 98, 26, -83, -20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-20,-16,26,26,63,85,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 92, 1, 28, 8, 14, 13, 87, -46, 51, 22, 53, 69, 63, 62, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,1,8,13,14,22,28,44,48,51,53,62,63,69,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 69, 25, 11, 18, 64, -91, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,11,18,25,27,64,69,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, 12, 28, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,28,35,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 4, 97, 87, 91, 59, -43, 39, 93, 27, -71, 3, 28, 10, 37, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-43,3,3,4,10,27,28,37,39,59,82,87,91,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 47, 2, 82, 14, 90, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,13,14,47,53,82,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 93, 42, 30, 54, -19, 2, -31, 90, 82, 59, -41, 91, 44, 81, 15, 67, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-31,-19,2,15,30,42,44,54,59,59,67,81,82,82,90,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, -64, 46, 18, 10, 99, 49, 65, 24, -64, 40, 56, 20, 99, 44, 15, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-64,10,15,17,18,20,24,33,40,44,46,49,56,65,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, 60, 20, 81, 4, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,4,20,27,60,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, -38, 76, -85, 57, 28, 16, 55, 76, 35, 11, 45, 7, -22, 44, 34, 63, -9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-38,-22,-9,7,8,11,16,28,34,35,44,45,55,57,63,76,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 98, 23, 38, 92, -45, 88, 17, 59, -43, -98, -39, 44, -40, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-45,-43,-40,-39,7,17,23,38,44,52,59,88,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-41, 37, 24, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,24,26,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-7, 13, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,2,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 61, -55, 71, 34, 61, 51, 63, 48, 97, 60, 46, 49, 40, 81, 42, 15, 15, -87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-55,9,15,15,34,40,42,46,48,49,51,60,61,61,63,71,81,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, 7, 60, -68, 41, 83, -31, 80, 97, 7, 24, -86, 70, 81, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-68,-31,7,7,24,41,60,70,80,81,82,83,88,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 35, 51, 74, 14, 65, 29, -45, 48, 65, 94, 29, -95, 32, 81, 85, 63, 81, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-45,6,14,29,29,32,35,48,48,51,63,65,65,74,81,81,85,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-9, 21, -17, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,-9,21,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 49, -3, -32, 9, 68, 27, 20, -99, 6, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-32,-3,6,9,17,20,27,49,60,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 37, -52, 41, 88, 77, 56, 73, 97, 26, 79, 78, 74, -1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-1,26,29,37,41,56,73,74,77,78,79,88,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-26, 59, -48, 19, 6, -4, 87, 71, -4, 59, 73, 76, 42, -71, 9, 42, 22, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-48,-26,-12,-4,-4,6,9,19,22,42,42,59,59,71,73,76,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-15, 22, 19, 5, -67, 33, 21, 17, 80, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-15,5,17,19,21,22,33,51,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 98, 90, 0, 7, -21, 6, 57, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,0,6,7,57,60,78,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, 13, 26, 58, -72, 29, 0, 6, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,0,6,13,26,29,58,67,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-63, 84, 48, 52, 98, 58, -98, -80, 14, 21, -39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-80,-63,-39,14,21,48,52,58,84,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, -32, 92, 99, 3, 55, 32, -74, 34, 80, 30, 44, 48, 77, -81, 76, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-74,-32,3,30,32,34,44,48,55,73,76,77,80,90,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, -57, -74, 11, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-57,11,47,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, 23, 52, 14, 70, 64, 24, 63, -20, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,14,23,24,52,63,64,68,70,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-19, 83, 8, 55, 71, -40, 74, 89, 42, 27, 64, -74, 0, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-40,-19,0,8,27,42,55,64,71,74,83,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, -3, 57, 91, -99, 87, 87, 2, 6, 14, 84, -52, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-59,-52,-3,2,6,14,34,57,84,87,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 50, 73, 85, -5, 34, 31, -82, 17, 22, 86, 17, 4, 84, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-5,4,14,17,17,22,31,34,50,59,73,84,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, -87, -91, 1, 23, 76, 55, 66, -65, 90, 98, 61, 93, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-87,-65,1,23,55,61,66,76,86,90,93,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, 7, 11, 54, 58, 60, 77, 16, 67, 60, 24, 40, 82, 20, 30, 0, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,3,7,11,16,20,24,30,40,54,58,60,60,67,77,82,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 89, 87, 45, -52, 1, 78, 9, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-52,1,5,9,45,78,87,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-22, -79, 96, -91, 41, 62, -52, 10, 47, 7, 17, 68, 94, 37, 67, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-80,-79,-52,-22,7,10,17,37,41,47,62,67,68,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, -65, 61, 0, 39, -51, 50, 94, 98, 26, 26, 24, 47, -66, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-65,-51,0,24,26,26,38,39,41,47,50,61,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 89, 43, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,82,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, 5, -99, 73, 4, 9, 66, -54, 35, 66, 59, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-54,-19,4,5,7,9,35,59,66,66,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-67, 18, 53, 48, 55, 49, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,18,48,49,53,55,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-31, 92, 14, -95, 95, 67, 99, 37, -95, -78, 95, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-95,-78,-48,-31,14,37,67,92,95,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 84, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,64,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 28, 52, 41, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,28,41,52,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, -25, 18, 32, 91, 85, 96, 94, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,18,29,32,85,91,94,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(22, 35, 17, 22, -65, 50, 16, 34, -60, 3, 60, -70, 27, 31, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-65,-60,3,16,17,22,22,27,31,34,35,50,60,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 96, 46, 91, 36, 40, 32, 52, -54, 2, 10, 27, -80, 39, 92, -16, 78, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-54,-16,2,10,27,32,34,36,39,40,46,52,70,78,91,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 98, 45, 35, -18, 88, -49, 45, 98, 1, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-18,1,35,45,45,49,57,88,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, 49, -50, 62, 45, 50, 52, 92, 34, 96, 77, 74, 26, -58, 66, -6, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-50,-6,26,34,45,49,50,52,62,62,66,72,74,77,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 57, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,57,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, 45, 9, 72, 66, 80, 25, 29, 20, 47, 71, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,20,25,29,45,47,66,71,72,80,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 60, 18, 76, 65, 89, 87, 95, -30, 11, -55, 83, 56, 67, 2, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-30,-8,2,11,18,56,60,65,67,76,83,86,87,89,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 10, -24, -27, 37, 2, -62, 32, 49, 21, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-27,-24,2,10,21,32,37,49,50,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 6, 81, 83, 28, 90, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,6,28,64,81,83,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 74, 44, 70, 65, 83, -49, 64, 59, 71, 6, -21, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-21,6,12,22,44,59,64,65,70,71,74,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 92, 71, -67, -6, 5, -2, 84, -95, 59, 34, 57, 93, 2, 54, 94, 7, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-67,-6,-2,2,5,7,33,34,42,54,57,59,71,84,92,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-29, 16, 46, 89, 31, 32, 59, 12, 57, -38, 92, 57, 17, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-29,12,16,17,31,32,46,55,57,57,59,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-63, 0, 86, 58, 4, 38, -49, 35, -92, 92, -68, 87, -33, 78, 5, 56, 30, -39, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-68,-63,-49,-39,-33,0,2,4,5,30,35,38,56,58,78,86,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, -46, 65, -48, 45, 2, -3, -90, 45, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-48,-46,-3,2,45,45,62,65,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, 61, -61, 92, 19, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-45,19,36,61,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, 74, -42, 94, 59, 6, 23, 95, 2, -33, -18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-33,-18,2,6,23,59,74,88,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, 35, 3, 29, 26, -75, 95, 45, 45, 4, 27, 66, -18, 1, 72, 83, 69, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-18,1,3,4,26,27,29,35,45,45,60,66,69,72,73,83,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-23, 39, -70, 28, 17, 38, 74, -70, 14, 37, 69, 37, 21, 6, 97, -98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-70,-70,-23,6,14,17,21,28,37,37,38,39,69,74,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 57, 28, -93, 33, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,28,33,46,57,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, -14, -50, 59, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-14,23,59,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 93, 39, 64, 49, 93, 72, 67, -79, 25, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,20,25,34,39,49,64,67,72,93,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-80, -56, -87, 27, 83, -1, 9, 77, 41, -35, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-80,-56,-35,-1,9,27,41,62,77,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-4, 58, 40, 61, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,40,58,61,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, -79, 30, 92, 71, 29, 19, 98, -52, -19, 55, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-52,-19,19,27,29,30,42,55,71,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 37, 3, 98, 27, 82, -13, 79, 86, 80, 56, 86, 66, -77, 70, -57, 37, 78, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-57,-13,3,9,27,37,37,56,66,70,78,79,80,82,86,86,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-90, 16, -47, -93, 48, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-90,-47,16,48,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 45, -71, 67, 7, 54, 83, 39, 50, 73, 35, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,7,26,34,35,39,45,50,54,67,73,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 9, 42, -27, 72, 83, -83, 36, 51, 47, 19, 43, -58, 75, 90, 76, -41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-58,-41,-27,5,9,19,36,42,43,47,51,72,75,76,83,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 6, 78, -11, -88, 70, -41, 72, 96, -77, 77, 50, -96, 28, 33, 37, 27, 43, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-88,-77,-41,-11,6,15,27,28,33,37,43,50,70,72,77,78,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 70, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,64,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, 17, -52, 39, 13, 99, 71, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,13,17,30,39,71,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-91, 90, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,30,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, -55, 22, 43, 6, 33, -67, 28, -36, 34, -23, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-55,-36,-23,6,22,28,33,34,43,59,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 50, 73, 73, 42, 81, 55, 62, 29, 43, 69, 86, 64, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,29,42,43,50,55,62,64,69,73,73,81,83,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-1, 55, 13, -91, 54, 79, -45, -26, 36, -66, 79, -78, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-78,-66,-45,-26,-26,-1,13,36,54,55,79,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 68, 56, 72, 33, 37, 45, 70, 82, 4, -95, 86, 76, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,4,33,37,45,47,56,68,70,72,76,82,82,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 8, 97, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,64,83,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, 47, 35, 80, 12, 34, 12, -2, -5, 29, 19, 44, 0, 46, 7, 38, -35, 81, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-5,-2,0,7,12,12,12,19,29,34,35,38,38,44,46,47,80,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 74, 71, 2, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,21,28,71,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-10, 81, 58, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,58,81,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 23, -28, -45, 39, 29, 48, 50, 21, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-28,11,21,23,29,39,48,50,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-1, 60, 89, 8, 47, -40, 3, 31, 73, 99, 20, -89, -90, 54, -73, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-89,-73,-40,-1,3,8,20,31,42,47,54,60,73,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, 82, -58, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-46,82,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-28, 31, -55, 63, 49, -91, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-55,-28,-15,31,49,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 59, 70, 68, 18, 44, 43, -62, 45, 90, 55, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,18,19,43,44,45,55,59,68,70,72,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-26, 46, 22, 46, 10, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,-15,10,22,46,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-88, 70, -42, 24, -90, 40, -66, 87, 3, 7, -67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-88,-67,-66,-42,3,7,24,40,70,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 48, 17, 8, 30, 99, 21, 53, 68, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,8,17,18,21,30,48,53,68,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 54, -98, 39, 78, 86, 62, -96, -68, 5, 74, 77, 23, 21, -82, 11, -64, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-96,-82,-68,-64,0,5,11,21,23,39,53,54,62,74,77,78,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-75, 51, 26, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,26,51,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 95, 52, 31, 86, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,31,52,57,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, -38, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,32,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 12, 20, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,20,25,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, -15, 33, 66, 48, -13, 12, 67, 33, 73, 45, -7, -78, 58, -62, 79, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-62,-15,-13,-7,12,33,33,45,48,58,66,67,70,72,73,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85, 97, 32, 79, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,38,79,85,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 43, 91, 53, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,48,53,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 36, 93, 42, -74, 73, 50, -42, 41, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-42,15,36,41,42,45,50,73,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 51, 28, 99, 14, 51, -22, 10, 44, -29, 16, 98, 96, -63, 79, 56, 78, 49, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-29,-22,10,14,16,28,34,44,49,51,51,56,66,78,79,96,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, 7, 69, 45, 75, 21, 92, -36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,7,21,45,69,75,81,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(16, 55, -37, 66, 1, 83, 55, -40, 33, 86, 4, 15, 68, 57, 11, 46, 91, 61, -21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-37,-21,1,4,11,15,16,33,46,55,55,57,61,66,68,83,86,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 58, 10, 93, -11, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-11,10,50,58,77,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 34, -97, 51, -57, 71, 29, 70, -41, 20, -35, 41, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-57,-41,-35,20,29,33,34,41,51,70,71,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, -53, 56, 2, 8, 13, 47, 5, 84, 37, 50, 61, 87, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,2,5,8,13,37,46,47,50,56,58,61,84,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 9, 44, 98, 50, 18, 44, 54, 3, 66, 6, 60, 12, 7, 99, -98, -46, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-46,-45,3,6,7,9,12,18,44,44,47,50,54,60,66,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, 10, -32, 13, 79, 25, 6, -41, 20, -22, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-41,-32,-22,6,10,13,20,25,79,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 23, 7, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,7,12,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 20, 22, -56, 93, 96, 96, 71, 49, -77, 91, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-56,20,22,29,49,53,71,91,93,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-31, 14, 68, -86, -27, 11, 42, 87, 85, -42, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-42,-31,-27,11,14,42,64,68,85,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 44, 86, -5, -39, 12, 28, 7, 4, 39, 81, 51, 95, 16, 2, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-5,2,4,7,12,16,27,28,39,44,51,81,85,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 97, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,44,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 66, -66, 10, 25, 9, -83, 88, 69, 8, 84, 92, 6, 69, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-66,6,8,9,10,17,25,66,69,69,74,84,88,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 88, 19, 7, -74, 27, 28, 70, 96, -50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-50,7,19,27,28,50,70,88,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, 59, 15, 53, 28, 52, 92, 16, 64, -91, 11, 24, 85, 35, 4, 87, -21, 9, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-77,-21,4,9,11,15,16,24,28,35,43,52,53,59,64,85,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 8, -33, 86, 42, 63, -91, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-33,8,37,42,50,63,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, 48, 76, 55, -39, 75, -60, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-60,-39,48,53,55,75,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, -52, 46, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,6,14,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 62, -40, -60, 29, 4, -26, 21, 52, 46, 61, 5, 92, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-40,-26,4,5,21,29,46,52,60,61,62,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 18, 52, 47, -68, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,18,20,41,47,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 54, 84, 44, -51, 50, 28, 89, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,25,28,44,50,54,84,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, -4, 38, 39, 35, 50, 2, 83, -4, 27, 32, 18, 31, -76, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-4,-4,2,18,27,31,32,35,38,39,50,71,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 27, 92, 93, -2, 40, 71, -76, 26, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-12,-2,26,27,40,46,71,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 90, 28, 89, 75, -73, 92, -49, -45, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-49,-45,2,25,28,75,89,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 39, 15, 31, 78, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,29,31,35,39,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, -10, 6, 20, -96, 23, 1, -1, 53, 17, 42, 80, 47, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-10,-1,1,6,17,20,23,42,47,53,67,80,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, -44, 48, 40, -28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,-28,13,40,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 22, 86, -73, 22, 93, 19, 15, -20, 33, 40, 51, 46, -55, 19, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-55,-20,15,19,19,22,22,33,40,46,51,64,78,86,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-2, 91, 38, 40, 32, -85, 5, 59, 13, 41, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-2,5,13,32,38,40,41,59,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 50, -79, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,27,28,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, -47, 95, 58, 40, 20, -5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-5,20,40,50,58,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 92, 12, 7, -92, 34, 62, -62, -19, 63, 32, 21, 9, 43, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-62,-19,7,9,12,21,32,34,38,43,48,62,63,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 90, 64, 45, -51, 67, 71, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-51,45,57,64,67,71,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 10, -76, 55, -33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-33,10,26,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-80, 81, 19, 98, 13, 29, 90, 13, 54, 25, 92, 9, 21, 7, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,7,9,13,13,14,19,21,25,29,54,81,90,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85, -94, -38, 23, 92, 12, 20, 43, 13, 8, 40, 10, 49, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-38,8,10,12,13,20,23,40,43,49,85,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 59, 96, 59, 17, -82, 47, 20, -42, 76, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-42,17,20,47,51,54,59,59,76,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 80, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,49,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 69, 0, -31, -82, 67, 63, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-31,0,23,43,63,67,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 46, 24, -57, 9, 85, -18, 19, 61, 70, -43, 91, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-43,-18,9,19,24,44,46,61,62,63,70,85,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 82, 68, 58, 25, 91, 11, -22, 67, 8, 26, -10, 21, 51, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,-10,0,8,11,21,25,26,51,58,67,68,82,82,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 92, 61, 60, -72, 86, 98, -90, 92, 50, 65, 27, -60, 64, 46, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-72,-62,-60,27,43,46,50,60,61,64,65,86,92,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, 66, -41, 17, 12, 86, 86, 64, -25, -32, 43, 49, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-32,-25,12,17,17,43,49,62,64,66,86,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-99, 80, 70, 68, -48, -20, 12, 60, 14, -36, 22, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-48,-36,-20,12,14,22,60,68,70,80,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, -9, 45, -45, -63, 96, 93, 78, 40, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-45,-9,40,45,78,80,90,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 47, 3, -96, 89, 88, 30, 58, 80, -85, 93, 80, 21, -17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-85,-17,3,6,21,30,47,58,80,80,88,89,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-72, 56, 47, 60, 12, 99, -79, 50, 21, 44, 48, 49, 54, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-72,-62,12,21,44,47,48,49,50,54,56,60,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-53, -88, 16, -93, 10, 84, -9, 63, -72, -5, -48, 54, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-88,-72,-53,-48,-9,-5,10,16,33,54,63,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 39, 11, -9, 67, 65, 25, 28, 16, 35, 29, 59, 43, 40, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,2,11,16,25,28,29,35,39,40,43,59,65,67,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, -4, 88, 99, 35, -81, 65, 19, 46, 31, -81, 46, 73, 31, 49, 42, 26, 71, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-81,-4,9,19,26,31,31,35,42,46,46,49,65,71,73,88,91,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, 67, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,66,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 45, 88, 28, 12, 89, 30, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,28,30,45,88,89,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85, 77, 31, 43, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,31,43,77,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 80, 92, 81, -60, -31, 43, -77, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-60,-31,24,43,58,80,81,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-81, 92, -62, 37, -23, 41, 91, -82, 37, 25, 32, -63, -50, -23, 16, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-81,-63,-62,-50,-23,-23,16,25,32,37,37,41,74,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-92, 70, -8, 11, 5, -95, 9, -65, 0, 67, 63, -51, 91, 80, 75, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-92,-65,-51,-8,0,5,9,11,48,63,67,70,75,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, -22, 63, 27, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,20,27,53,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 47, 58, 41, -26, 60, -89, 6, 7, -89, 48, 35, 58, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-89,-26,6,7,32,35,41,42,47,48,58,58,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, 71, 63, 13, 65, 53, 5, 61, 15, 30, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,13,15,20,30,53,61,63,65,71,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-75, 19, 4, 5, 16, 12, 73, -63, 34, 54, 26, 23, 55, 56, 27, -75, -72, 93, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-75,-72,-63,4,5,12,16,19,23,26,27,34,54,54,55,56,73,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 80, 54, 32, 53, 30, 41, 74, 59, 36, -55, -41, 17, -23, -55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-55,-41,-23,11,17,30,32,36,41,53,54,59,74,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 99, 14, -18, 28, 99, 18, 35, 96, 92, -16, 97, 41, -15, 33, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,-16,-15,14,18,28,33,35,40,41,91,92,96,97,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, -59, 16, 24, 13, -54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-54,13,16,24,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-66, 11, 87, 92, 36, 5, 6, 26, 83, 58, -62, 29, 46, 45, 46, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-62,5,6,11,26,29,36,45,46,46,58,73,83,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 89, 80, 57, 50, 91, 58, 70, 21, 4, -26, -17, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,-17,4,21,26,50,55,57,58,70,80,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 73, 14, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,64,72,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 85, 14, -66, 38, 19, -97, 9, 25, 85, -32, -18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-66,-32,-18,9,14,19,20,25,38,85,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 5, 18, 22, 91, 79, -29, -74, 87, 81, 62, 37, -17, 29, 40, -94, 9, 72, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-74,-29,-17,5,9,18,22,29,37,40,62,68,72,79,81,87,88,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-57, 13, 37, 40, 32, 53, 89, 69, -7, 43, 66, 49, 71, 57, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-7,13,32,33,37,40,43,49,53,57,66,69,71,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 79, 86, 13, 56, -56, 60, 84, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,9,13,56,60,68,79,84,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 64, -23, 2, 93, 97, 50, -60, 51, 12, 48, 51, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-23,2,8,12,48,50,51,51,64,77,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 45, -11, -78, 58, 95, -32, 79, 79, -91, 40, 13, 87, 69, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-78,-32,-11,13,40,45,57,58,69,79,79,84,87,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 57, -28, 69, 13, -40, 40, 2, 99, -40, 18, 17, -71, -30, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-40,-40,-30,-28,2,13,17,18,40,57,69,73,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 29, -79, 53, 55, 15, 97, 12, 44, 2, 32, -81, 36, 81, -13, 19, 4, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-79,-13,2,4,12,15,19,26,29,32,36,44,53,55,68,81,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-70, 95, 77, -63, 56, -83, 20, 32, 37, 63, 99, -8, 21, 88, -68, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-70,-68,-63,-8,20,21,26,32,37,56,63,77,88,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-17, 29, 37, -66, 76, 21, 99, 68, 21, -6, -92, 82, 71, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-66,-17,-6,10,21,21,29,37,68,71,76,82,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 71, 46, 94, 53, 85, 10, -33, 3, 13, 8, 44, -47, 97, 24, 80, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-33,3,8,10,13,24,33,44,46,53,71,73,80,85,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 20, 11, 14, 87, -62, -32, 65, 51, 24, -54, 7, 44, -38, -77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-62,-54,-38,-32,7,11,14,20,24,44,51,65,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 73, 28, -12, 25, 0, 79, 44, 35, 84, 59, 22, -56, 65, 84, -38, -26, 73, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-38,-26,-12,0,22,25,28,33,35,44,59,65,65,73,73,79,84,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, -3, 64, 54, 38, 55, 59, 90, -1, 90, -62, 83, 30, 28, 35, 89, 21, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-3,-1,21,28,30,35,38,54,55,59,64,65,83,89,90,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 87, -43, -72, 16, 47, 96, 40, 46, 56, 71, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-43,11,16,40,46,47,56,71,87,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 32, -48, 65, 24, 82, 14, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,5,14,24,32,65,76,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-57, -41, 14, 83, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-57,-41,14,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, -75, 28, 82, -15, -87, -59, -70, 4, 22, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-75,-70,-59,-15,4,22,28,53,82,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 11, 97, -43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,2,11,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, 52, -40, 85, 16, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,16,26,52,85,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, -71, 81, 17, 82, 76, 19, 86, 60, 27, 26, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,17,19,26,27,42,60,76,78,81,82,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 15, -69, 37, -39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-39,15,37,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, 94, -99, -78, -51, -11, 38, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-78,-51,-11,38,45,47,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 9, -31, 19, 39, 94, 71, 77, -54, 54, 30, 31, -89, 21, -37, 80, 32, -35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-54,-37,-35,-31,9,19,20,21,30,31,32,39,54,71,77,80,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 33, 31, 85, 90, 0, 22, -31, 35, -76, 97, 89, 80, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-31,0,18,22,27,31,33,35,80,85,89,90,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-56, 73, 35, 19, -10, 88, 58, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-10,19,35,52,58,73,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-39, 88, 18, 50, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,11,18,50,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 58, -46, 81, -21, 43, 10, 69, 60, -59, 86, 33, -91, 60, 62, 0, 9, -98, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-91,-59,-46,-21,0,9,10,33,43,53,57,58,60,60,62,69,81,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, -89, 84, 94, 25, -54, -38, 25, -53, 67, 97, 93, 85, 30, 44, 64, -92, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-89,-54,-53,-38,25,25,30,44,64,67,84,85,88,93,93,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 43, 65, -96, 47, 31, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,31,43,47,65,65,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 10, 64, 56, 44, 28, 9, -91, -42, 29, 3, -86, 65, 91, -88, 11, 97, 94, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-88,-86,-42,3,9,10,11,17,28,29,44,56,64,65,70,91,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, -79, 15, 94, 14, -52, 73, 71, 71, 4, 7, 51, 48, 95, 8, 13, -75, 63, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-75,-52,4,7,8,13,14,15,48,51,53,60,63,71,71,73,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 97, -16, 15, 28, 61, 43, 28, 12, 68, 58, 72, 31, 93, 81, 36, 48, -60, -23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-23,-16,12,15,28,28,31,36,43,48,58,61,67,68,72,81,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 53, 34, 85, 48, 26, 10, 10, -36, 79, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,10,10,26,34,47,48,53,59,79,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 30, 0, 8, -88, 88, 40, -8, 7, 65, 70, 82, 85, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-8,0,7,8,10,30,40,47,65,70,82,85,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 89, 98, 1, 46, 84, -96, 0, -76, 47, 81, -59, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-76,-59,0,0,1,46,47,71,81,84,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, -8, 19, 51, 1, 89, -47, -31, 79, -84, -73, -51, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-73,-51,-47,-31,-8,1,5,19,51,79,89,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 11, 18, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,11,13,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 59, 44, 64, 84, 45, -79, -68, 14, -76, 85, 90, 10, 26, 81, 0, -6, 1, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-76,-68,-6,0,1,10,14,26,41,44,45,59,64,76,81,84,85,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 40, -73, 73, 55, 44, -59, 8, -81, 47, 7, 88, 36, 32, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-81,-73,-59,7,8,32,32,36,40,44,47,55,73,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 32, 54, 7, 14, 41, 46, 81, 91, -1, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,7,14,19,32,41,46,54,78,81,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-38, 1, -76, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-38,1,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, -72, 75, 3, 41, 96, 43, -24, -54, 7, 84, 41, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-54,-24,3,7,27,41,41,43,68,75,84,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, -64, 86, -64, 42, 98, 94, 55, -50, 5, 0, 61, 57, 57, 99, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-64,-50,0,5,34,42,55,57,57,61,82,86,94,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-35, 49, 27, -27, 45, -48, 87, 3, 76, 20, 94, 68, 99, -83, 31, 36, 80, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-48,-35,-27,1,3,20,27,31,36,45,49,68,76,80,87,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 86, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,53,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 25, 65, 55, 55, 36, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,27,32,36,55,55,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 28, 51, 64, 28, 18, -52, 51, 7, 69, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,7,18,28,28,51,51,64,69,73,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 99, 48, 95, 63, 9, -73, 13, 43, 69, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,9,13,43,48,63,69,84,86,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-66, 91, 45, 60, 56, -98, -33, -84, 90, 46, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-84,-66,-33,45,46,54,56,60,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 69, -26, 14, 83, 83, 71, 99, 85, 54, 78, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,14,16,54,69,71,78,83,83,85,91,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, -99, 92, 36, 41, 29, 33, 12, 65, 20, 38, 19, 80, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,12,19,20,29,33,36,38,41,57,65,72,80,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 37, 23, 55, 51, 85, 86, 0, 53, -11, 68, -47, 34, 55, 22, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-11,0,22,23,34,36,37,51,53,55,55,67,68,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(22, 69, 99, 32, 11, 66, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,22,32,66,69,86,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 61, -94, 99, 22, 95, 41, 69, -2, 10, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-2,2,10,22,41,44,61,69,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-75, 99, 16, 25, -50, -55, 44, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-55,-50,16,25,44,66,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, 37, 86, 20, 70, 88, 48, 15, 95, 90, 41, 11, 3, 12, 73, 57, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,11,12,15,20,37,41,48,57,70,73,78,86,88,88,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, -10, 14, 77, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,14,34,40,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 2, 79, 55, 42, 10, 82, 46, 57, -76, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,2,10,37,42,46,55,57,79,79,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, -29, 71, 48, 94, -2, 2, 90, 58, 39, 0, 39, -58, 74, 53, 3, -98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-58,-29,-2,0,2,3,39,39,48,53,58,71,74,81,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(75, 42, 5, -66, -32, -91, 93, 69, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-66,-32,5,8,42,69,75,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, -11, 72, 49, 41, 43, 96, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-11,3,41,43,49,53,72,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-69, 85, 8, -85, 73, 12, 30, -77, 46, -25, 15, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-77,-69,-25,8,12,15,30,46,73,85,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 21, 0, -45, 28, 56, 42, 23, 93, 42, 43, 76, 97, -24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-24,0,21,23,28,34,42,42,43,56,76,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 46, 44, 35, 3, 31, 76, 91, 5, 20, 19, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,3,5,11,19,20,31,35,44,46,76,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, -91, 39, 13, 16, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,12,13,16,36,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(75, 83, 77, 11, 36, 28, 39, 47, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,28,36,39,47,56,75,77,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, 18, 3, 69, 72, 33, 52, -44, -22, 76, -25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-44,-25,-22,3,18,33,52,69,72,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 96, 66, 36, 72, 4, 62, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,13,36,62,66,72,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 53, 45, 49, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,31,45,49,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 50, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,50,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 81, -77, -57, 1, 52, 97, 98, 93, 92, 58, -31, 51, 93, -55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-57,-55,-31,1,51,52,58,81,83,92,93,93,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 83, -69, 86, 34, 64, 14, 26, -71, -77, 60, -49, 7, 2, 95, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-71,-69,-49,2,7,14,26,34,52,60,64,82,83,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 7, 5, 36, 52, 55, 80, -4, -26, 78, 31, 14, 82, 18, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,-26,-4,5,7,14,18,31,36,52,55,78,80,82,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-58, -85, -44, 39, 6, 34, 30, -53, 34, -22, 5, 93, 3, -16, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-58,-53,-44,-22,-16,-8,3,5,6,30,34,34,39,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 76, -47, 0, 5, 94, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,0,5,53,69,76,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, -36, 95, 82, 74, 0, -70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-36,0,26,74,82,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 13, 32, 7, 48, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,13,28,32,48,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(39, 86, 44, 62, 57, -80, 30, 52, -84, -33, -60, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-80,-60,-33,30,39,44,52,57,62,64,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, 46, 29, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,29,40,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-70, 62, -36, 41, 45, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-36,20,41,45,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 33, 64, -21, -44, 88, 78, 66, 6, 23, 75, 17, -83, -20, -51, 6, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-51,-44,-21,-20,6,6,17,23,33,33,60,64,66,75,78,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, -64, 69, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,8,45,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 82, -9, -27, 64, 36, 17, 88, 93, 70, 91, 38, 4, -45, 7, 87, 14, 60, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-27,-9,4,7,14,17,22,36,38,44,60,64,70,82,87,88,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, 21, 49, 66, 28, 89, 78, -71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,21,28,49,62,66,78,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 48, -51, -24, 3, 84, 6, 71, 68, 92, -33, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-33,-24,3,6,25,48,61,68,71,84,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 10, 26, 41, 48, 57, 0, 81, 55, 26, 14, 97, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,8,10,14,26,26,41,48,55,57,71,81,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, 41, 67, -29, 33, 82, -92, 44, 44, 86, 15, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-83,-29,15,33,41,44,44,67,82,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 41, -1, -74, 11, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-1,11,37,41,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 57, 19, 25, 9, 16, 37, -50, 69, 33, 33, 63, 45, 59, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,1,9,16,19,25,33,33,37,45,53,57,59,63,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 19, 80, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,80,91,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 18, 18, 80, 63, 98, 59, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,18,20,29,59,63,80,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-87, -23, -42, 0, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-42,-23,0,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 32, 97, 77, 59, 22, -80, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,22,32,59,77,78,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-36, -45, 61, 63, 30, 16, 91, 10, 70, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-36,10,16,30,61,63,70,77,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, -41, -38, 3, -26, 21, 95, 64, 93, 23, 39, -30, 0, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-41,-38,-30,-26,0,3,8,21,23,39,64,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, -31, 69, 94, 92, 36, 0, 13, -11, 52, 92, 64, 20, 0, 71, 33, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-11,0,0,13,20,33,36,52,54,64,69,71,92,92,94,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 97, -83, 3, 87, 11, 27, 17, 18, -13, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-13,3,11,17,17,18,23,27,87,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, 14, 54, -20, 39, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-19,14,38,39,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 16, 14, 51, 71, 27, 60, -86, 40, -1, 80, 13, -52, 29, -84, 69, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-84,-52,-1,8,13,14,16,27,29,40,51,60,69,71,80,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-50, 24, 6, 44, 62, 18, 31, 14, 98, 62, 34, 90, -63, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-50,6,14,18,24,31,34,44,62,62,69,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 41, -44, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,29,41,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, -89, 43, 71, 38, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-60,20,38,43,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 73, -4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,73,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-98, 42, 59, 79, -6, -91, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-91,-6,42,59,75,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 83, 98, 20, 28, 75, 9, 53, 70, 4, 9, -34, 98, 71, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,4,9,9,20,28,29,53,70,71,75,82,83,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-21, 64, 82, 35, -41, 85, 19, -72, 28, 40, 45, 65, 18, -30, 74, 78, 41, 35, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-41,-30,-21,0,18,19,28,35,35,40,41,45,64,65,74,78,82,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 26, -22, 64, 80, 77, 77, 41, 40, -70, 9, 17, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-22,9,17,26,40,41,41,52,64,77,77,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 80, -5, -27, 55, -91, 69, 12, 17, 67, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-27,-5,12,17,55,67,69,80,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(69, 98, 13, 21, 76, 48, 57, 24, 15, 60, 23, 49, 85, 74, 34, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,15,21,23,24,34,48,49,57,60,69,74,76,85,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-17, 10, 87, 31, 81, 51, 23, 38, 36, 72, -62, 8, 76, 72, 34, 0, 98, 21, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-17,0,8,10,21,23,31,34,36,38,51,59,72,72,76,81,87,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 61, 18, 89, 10, 20, 11, 20, 85, 83, 76, 95, 74, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,11,18,20,20,60,61,74,76,83,85,89,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 75, 89, 75, -22, 73, 96, 16, -6, 69, 47, 34, 3, 66, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-22,-6,3,16,25,34,47,66,69,73,75,75,89,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-32, -25, 30, 45, -74, 3, 64, 90, 75, 26, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-32,-25,3,25,26,30,45,64,75,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 3, 85, 50, 60, 37, 22, -6, -38, -1, 93, 54, 23, 88, 10, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-6,-1,3,10,22,23,37,37,39,50,54,60,85,88,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 47, 13, 58, -26, 51, 60, 34, 27, 38, 11, -65, 62, 96, 30, 37, 66, -52, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-52,-26,11,13,22,27,30,34,37,38,47,51,58,60,61,62,66,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, -63, 12, 29, 52, 80, -76, 53, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-63,12,29,52,53,64,75,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, 75, 87, 97, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,70,75,87,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, 65, 1, 63, -61, 71, 61, 47, -71, -80, -2, -59, 89, 44, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-71,-61,-59,-2,1,44,47,61,63,65,71,74,89,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, -78, -65, 72, 60, 60, 21, 73, 75, 37, 66, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-65,20,21,37,51,60,60,66,72,73,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, -54, 68, 53, 72, 46, 57, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,0,44,46,53,57,68,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-94, -73, 90, 92, 42, 77, -72, 38, 78, 49, 1, 65, 68, 33, 73, -72, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-73,-72,-72,-31,1,33,38,42,49,65,68,73,77,78,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 49, 16, 22, 26, -95, 87, 12, 78, 47, 13, 72, 27, 90, 24, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,12,13,13,16,22,24,26,27,47,49,72,78,87,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, -66, 31, -85, 36, 53, 62, 15, 75, 28, 19, 10, 52, -44, -5, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-66,-44,-5,10,15,19,28,28,31,36,52,53,62,75,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-86, 71, 34, 84, 47, 56, 84, 84, 95, 69, 37, 24, 28, 61, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-31,24,28,34,37,47,56,61,69,71,84,84,84,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-58, 87, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,26,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 27, 58, 44, 47, 97, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,27,44,47,54,58,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 94, 7, 61, -96, -2, 75, -25, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-25,-2,5,7,56,61,75,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 73, 89, 5, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7,24,73,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, -99, 83, 12, 4, 25, 70, 96, 63, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,4,8,12,25,37,63,70,83,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(75, 34, 61, 54, -82, 34, 78, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,3,34,34,54,61,75,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 28, -96, 68, 34, 55, 64, 88, 80, 89, 58, 88, 81, 56, 83, 0, 51, 59, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,0,28,34,51,55,56,58,59,64,68,80,81,83,84,86,88,88,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-71, -85, 21, 29, 2, 82, 24, 33, 73, 13, 87, 9, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-71,2,9,13,21,24,29,33,63,73,82,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, -18, 14, 81, -85, 7, 16, 19, 85, 29, 46, 93, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-18,7,14,16,19,29,46,52,81,85,88,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 62, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,74,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 94, 69, 69, 0, 67, -96, 6, 89, -81, -49, 51, 88, 77, 13, 44, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-81,-49,0,6,13,15,23,44,51,67,69,69,77,88,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-25, -81, 1, 54, 54, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-25,1,28,54,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, 37, 66, 78, 47, 76, 75, 46, 0, 13, 48, 36, 83, 63, 96, 88, 76, -85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,0,13,36,37,46,47,48,63,66,75,76,76,78,83,88,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 51, 27, 42, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,27,37,42,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 78, -83, 30, 75, 85, 82, 38, -29, 81, 15, 50, 74, -21, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-29,-21,15,30,38,41,50,58,74,75,78,81,82,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 70, -74, 21, -44, 39, 93, 69, 35, 18, -83, 93, -69, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-74,-69,-44,18,19,21,24,35,39,69,70,93,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 57, 84, 61, 1, 71, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,33,43,57,61,71,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 67, 44, 23, 7, 23, 15, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,15,23,23,44,67,67,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 60, 16, 33, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,33,52,60,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 26, -29, 27, 56, 8, -46, 95, 68, 79, 7, -13, -56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-46,-29,-13,7,8,8,26,27,56,68,79,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 44, 26, 49, 26, 45, 59, 64, 69, 80, 81, 14, 72, 0, 78, -68, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-26,0,14,26,26,44,45,49,59,64,69,72,78,80,81,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, -59, 59, 99, 64, 48, 67, 79, 44, -33, 43, 68, 3, 61, -96, 10, 37, 30, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-59,-33,3,7,10,30,37,43,44,48,49,59,61,64,67,68,79,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-17, 94, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-17,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-52, 25, 53, 81, -23, 46, -16, 91, 49, -56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-52,-23,-16,25,46,49,53,81,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 97, 36, -30, 44, 77, 55, -77, -96, 4, -94, -57, 58, 87, 6, 50, 58, 26, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-94,-77,-57,-30,4,6,22,26,36,44,47,50,55,58,58,77,87,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 76, 23, 58, 12, -46, -78, 12, 14, 18, 54, 87, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-46,12,12,14,18,23,54,58,66,76,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-29, 75, 92, 93, 53, 79, 80, 59, 91, -31, 74, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-29,2,53,59,74,75,79,80,91,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-39, 17, 94, 19, 45, 95, 22, 85, -9, 45, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-9,17,19,22,25,45,45,85,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 60, 98, -53, 63, 48, -46, 59, 62, -22, 87, 55, 88, 28, 45, 66, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-46,-22,10,28,45,48,55,59,60,62,62,63,66,87,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, 89, 78, 91, 27, 36, 60, 43, 60, 56, 11, 29, 98, 45, -2, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,11,27,29,36,43,45,55,56,60,60,78,89,91,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, 67, 85, 49, 0, -3, 13, 93, 29, 5, -92, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-3,0,5,13,29,35,36,49,67,85,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 39, 91, 55, 66, 88, 0, -53, 65, 84, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-8,0,26,39,55,65,66,84,88,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, 31, 28, 55, -55, 37, -75, 1, 15, 2, 73, 27, 21, 50, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-55,1,1,2,15,21,21,27,28,31,37,50,55,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 43, 14, 59, 99, 76, -22, 0, 99, 87, 8, 66, 90, 73, -2, 3, -42, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-22,-2,0,3,8,14,42,43,59,66,70,73,76,87,90,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, -8, 47, 60, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-8,2,47,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 64, 67, 55, 9, 2, -26, 58, 51, -45, 85, 54, 86, 58, -17, 45, 17, 8, -41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-41,-26,-17,2,8,9,17,24,45,51,54,55,58,58,64,67,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 39, 31, 62, 49, -81, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,7,31,39,49,62,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 60, 83, 53, 73, 26, -15, 30, -48, 70, -10, 17, 48, 39, -72, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-48,-15,-10,11,17,24,26,30,39,48,53,60,70,73,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-76, 22, 85, 32, 64, 39, 59, 32, 99, 37, 48, -64, -43, 79, -84, 77, 57, 87, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-76,-64,-43,1,22,32,32,37,39,48,57,59,64,77,79,85,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 22, 47, 57, 44, 9, 25, 58, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,9,22,25,44,47,57,58,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 50, 3, -50, 13, 17, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,2,3,13,17,40,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 50, 26, 32, -12, 40, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,26,28,32,40,50,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 16, 3, 63, 9, 23, -50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,3,4,9,16,23,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 66, 28, 89, 65, 81, 32, 75, 58, -78, 14, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,4,14,28,28,32,58,65,66,75,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 20, -98, 64, -16, -63, 15, 15, -31, 64, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-63,-31,-16,15,15,20,32,33,64,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, 91, 0, -47, 4, 19, 32, 7, 66, -60, 82, 77, 65, -81, 83, 69, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-60,-47,0,4,7,11,19,32,38,65,66,69,77,82,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, -70, 80, 5, -44, -15, -15, 89, 55, 81, 63, -32, 99, -77, 61, 73, 15, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-70,-44,-32,-15,-15,-15,5,15,55,61,63,73,80,81,89,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, -29, 53, 80, 66, 73, -43, 83, 91, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-29,1,53,66,73,75,80,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-30, 52, 45, 48, 30, 23, 6, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,6,20,23,30,45,48,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, -67, 2, 15, 14, 39, 63, 3, -24, 90, 62, 40, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-24,2,3,14,15,39,40,54,61,62,63,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, -83, -30, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-30,63,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 57, 9, -5, 48, 18, 9, 27, -5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,-5,9,9,18,27,48,53,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, -8, 79, 49, 26, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-8,26,49,79,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 84, 48, 62, -84, -94, 21, 76, 94, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-84,15,21,48,62,76,84,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 79, 95, 29, 98, 31, 82, -39, 95, 79, -4, 22, -89, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-39,-4,16,22,29,31,58,79,79,82,95,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 25, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,25,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 86, 7, -52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,7,63,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 35, 37, 96, 44, -66, 38, 29, 52, 74, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,15,29,35,37,38,44,52,74,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, -90, 34, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,25,28,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-5, 18, 65, 3, 45, 71, 18, 46, 24, 31, 92, -12, 4, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,-5,3,4,18,18,24,31,45,46,65,71,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 83, 99, 46, -70, 33, 98, -76, 3, 47, 33, 97, -13, -56, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-70,-56,-13,3,29,33,33,46,46,47,83,97,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-30, -98, 80, 44, 3, 3, 72, 94, -38, 43, 17, 68, 97, 74, 85, -17, -21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-38,-30,-21,-17,3,3,17,43,44,68,72,74,80,85,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 30, 73, 55, -67, 43, 3, -70, -91, -52, 15, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-70,-67,-52,3,15,30,43,55,73,83,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 37, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,37,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 87, -70, -44, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-44,14,15,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 6, 50, 45, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,31,45,48,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-4, -45, 44, 44, 66, 89, 65, 87, -6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-6,-4,44,44,65,66,87,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, -92, 93, 32, 93, 9, 33, 11, 84, 51, 51, 5, 50, 14, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,5,9,11,14,32,33,50,51,51,60,74,84,93,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 47, 74, 40, 50, 54, 7, 65, 74, -9, 46, 27, 6, 34, 52, -41, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-9,6,7,27,34,40,43,46,47,50,52,54,65,74,74,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 87, 95, 47, 0, -26, 11, 31, -75, 50, 57, 30, 97, 81, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-26,0,2,11,30,31,47,50,57,75,81,87,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-17, 1, 70, 64, 15, 18, 58, 52, -95, -94, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-94,-17,1,15,18,52,58,64,64,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-98, -86, 71, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-86,18,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 95, 16, -42, 99, 87, 97, 13, -8, 14, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-8,13,14,16,48,87,94,95,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, -9, 70, 26, 67, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,26,67,70,75,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 1, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,1,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-7, 1, 54, 59, 48, 90, -63, -81, 95, 77, 3, 11, 78, 29, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-63,-7,1,3,11,29,48,54,54,59,77,78,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-57, 55, 30, 20, 3, 24, -88, -63, 8, 6, 72, 11, 10, 18, 32, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-63,-57,3,6,8,10,11,18,20,24,30,32,55,72,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-97, 67, -93, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-93,39,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 84, 5, -41, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-41,5,6,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, 73, -25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,73,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 61, -62, -34, 59, 3, 94, -3, 52, 10, 14, 9, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-34,-3,3,9,10,14,35,52,53,59,61,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 2, -5, 94, 62, 35, -5, 88, -94, -19, -12, 98, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-19,-12,-5,-5,1,2,35,62,86,88,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-48, 19, 65, 62, 19, 58, 45, -38, 43, 26, 45, 16, 99, 76, 33, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-38,9,16,19,19,26,33,43,45,45,58,62,65,76,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 2, 38, 30, 88, 10, 4, 30, 17, 89, -99, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,2,4,10,17,30,30,38,59,74,88,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(16, 49, 61, -53, -41, -11, 57, 84, 67, 61, 33, 77, 21, 53, -23, 50, 74, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-41,-23,-11,16,19,21,33,49,50,53,57,61,61,67,74,77,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, -18, 15, -58, 42, 57, 55, 82, 52, 25, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-18,15,25,42,52,55,57,58,82,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 11, -33, 37, 79, 32, 1, 54, 52, -7, 17, -76, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-58,-33,-7,1,3,11,17,32,37,52,54,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 90, 63, 72, 53, 77, 74, 2, -73, 11, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,0,2,11,53,63,67,72,74,77,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, 41, -72, 80, -55, 50, 39, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-55,39,41,50,56,80,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-56, 58, -6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-6,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 42, 70, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,42,70,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-28, 10, 83, 15, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,10,15,73,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, -51, 1, 51, 28, 9, 29, 25, -27, 70, 10, 1, 59, 52, 74, 92, 17, 2, -9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-27,-9,1,1,2,9,10,17,25,28,29,51,52,59,70,74,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 80, 2, 43, 35, 89, 96, 98, -44, 36, 77, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,2,22,35,36,43,66,77,80,89,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, 94, 32, 7, -15, 89, 26, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,7,26,32,49,56,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-44, 5, -65, -19, 11, 86, 90, -80, 83, 59, 8, 0, 98, -11, 67, 90, 22, 48, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-65,-44,-19,-11,0,5,8,11,22,48,59,67,83,86,90,90,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 47, 96, -78, 73, 21, 9, 81, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,9,21,47,60,73,80,81,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(16, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, -40, 28, -70, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-40,17,20,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, -89, 65, 40, -58, 8, 46, -99, -56, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-89,-58,-56,8,9,29,40,46,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-72, -31, 6, 13, 85, 54, 50, 77, -12, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-31,-12,6,13,50,54,77,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 73, -69, -35, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-35,10,71,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-32, -90, 73, 34, 32, 98, -56, -68, 59, 14, 60, 1, 42, -76, 79, -39, 75, 18, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-76,-68,-56,-39,-32,1,14,18,32,34,42,59,59,60,73,75,79,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, 20, 10, -8, 78, 79, 89, 29, -22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,-8,10,20,29,45,78,79,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 75, 75, 66, -65, 37, 43, 95, -57, -53, -47, -75, 94, 89, 82, 2, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-65,-57,-53,-47,2,2,37,40,43,66,75,75,82,89,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 53, 62, -89, 82, -48, 79, 86, 6, 94, 64, 14, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-48,6,14,31,53,62,64,79,79,82,86,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 90, 12, 13, 7, 75, -75, 12, 5, 45, 43, 2, -92, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-75,2,5,7,12,12,13,43,45,69,75,86,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 63, -89, 10, 82, 43, -57, 79, 29, 10, 92, 91, -43, 83, 17, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-57,-53,-43,10,10,17,29,43,63,68,79,82,83,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 54, 42, 53, 38, 40, 60, 62, 35, -76, 72, -19, 5, 31, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-19,5,21,24,31,35,38,40,42,53,54,60,62,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 12, 83, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,58,72,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 92, -15, 19, 58, 51, 5, -51, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-15,5,19,46,51,58,76,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 57, 69, 50, 32, 48, 10, 94, -22, -12, 71, 9, 54, 1, -62, 47, -49, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-49,-22,-12,1,9,10,32,33,47,48,50,54,57,69,71,94,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, -69, 73, 11, 70, 83, 69, -60, -85, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-69,-60,3,11,20,69,70,73,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, -98, 66, -4, -97, 15, 68, 61, 40, 79, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-97,-4,5,8,15,40,61,66,68,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, 98, -97, 41, -80, -90, 7, 6, 67, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-90,-80,-80,6,7,7,41,67,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 92, 74, 70, 45, 37, -46, -59, 79, -39, -90, -23, -89, 65, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-89,-59,-46,-39,-23,37,42,45,65,70,74,79,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, -11, -74, -12, 81, 70, 89, -49, 69, 33, 3, 8, -80, 46, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-74,-49,-12,-11,3,8,13,33,35,46,69,70,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 57, 38, 47, 41, 15, -35, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,8,15,38,41,47,57,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, 87, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,74,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, -91, -30, 90, 50, 0, 26, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-30,0,0,26,50,79,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 78, 65, 9, 36, 97, 8, 43, 54, 81, 51, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,9,9,18,36,43,51,54,65,78,81,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, 41, 63, 71, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,43,63,70,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 18, 98, 18, 41, 91, 19, 80, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,18,18,19,41,80,82,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, -13, 64, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,23,42,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 50, 53, 40, 98, 86, 5, 92, 49, 54, 52, 54, 36, -79, 0, -10, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-10,0,1,5,8,36,40,49,50,52,53,54,54,86,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 30, -30, 35, 73, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,26,30,35,73,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 28, 44, 98, 8, -24, 68, 26, 56, -82, 57, 42, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-32,-24,4,8,26,28,42,44,56,57,68,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(69, 65, -7, -88, 30, 52, 44, 77, 31, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-7,30,31,44,52,65,69,77,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 31, 39, 34, 96, -44, 62, 42, 11, 64, 48, 42, 6, 65, 10, 35, 3, 23, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,2,3,6,10,11,23,31,34,35,39,42,42,48,50,62,64,65,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 46, 93, -41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,46,82,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 87, 61, 91, 14, 44, 46, 89, 4, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,14,40,44,46,57,61,87,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-23, 59, 5, 71, 18, -43, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-23,5,18,59,68,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-10, -41, 81, 44, 71, -57, 22, 54, 41, 25, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-57,-41,-10,22,25,41,44,54,71,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 58, -33, 65, 42, 12, 15, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,12,14,15,42,58,65,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 34, 13, 22, 82, 31, 97, 39, 16, -56, 60, -5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-5,13,16,22,31,34,39,60,78,82,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-43, 89, 19, -28, 49, 47, 36, 92, 26, 12, 11, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-28,9,11,12,19,26,36,47,49,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 36, 77, 72, 54, 30, 20, 52, 14, -43, -54, 78, 4, 47, -34, -8, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-43,-34,-8,4,14,15,20,29,30,36,47,52,54,72,77,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 69, -13, 44, -27, 5, 0, -41, 92, 58, 23, 37, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-27,-13,0,5,23,37,44,58,63,69,70,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(39, 49, -26, 25, 66, 51, 92, 39, 71, 15, 35, 74, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,15,25,35,39,39,49,51,58,66,71,74,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 64, -99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,64,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 42, 33, -3, 43, 21, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,14,21,33,42,43,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 80, -12, 26, 36, -14, 24, 29, 37, 84, 62, 88, 38, 92, 56, 89, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-14,-12,13,24,26,29,36,37,38,56,62,80,80,84,88,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 57, 46, 35, 39, 75, 55, -7, 72, 6, -78, 43, 46, 82, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-7,6,35,39,43,46,46,46,55,57,72,75,76,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 7, 28, -93, 63, 1, 17, -78, 29, 71, 46, 81, 67, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-78,1,7,13,17,28,29,46,63,67,71,81,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 11, 58, 0, 80, 99, 17, -70, 64, 88, -59, 7, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-59,0,2,7,11,15,17,58,64,80,88,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 84, -58, -37, 55, 34, 73, 78, 97, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-37,6,26,34,55,73,78,84,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 8, 51, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,9,51,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 90, 99, -20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,28,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-58, 14, 22, -8, -98, 80, 31, 42, 85, 0, 2, 36, 5, -33, 89, 65, -48, 52, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-58,-48,-33,-8,0,2,5,14,22,31,36,42,52,65,67,80,85,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87, 77, 20, 64, 35, 19, -70, 34, 86, -1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-1,19,20,34,35,64,77,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 62, -18, -98, 38, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-18,3,23,38,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, -78, 45, 29, 43, 0, -59, 4, 62, 68, 27, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-59,0,4,20,27,29,43,45,45,62,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, -70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 76, 98, 17, 65, 30, 5, 90, 88, -66, 2, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-66,2,5,17,29,30,65,76,88,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 80, 37, 41, -26, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,37,41,47,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 59, 61, 21, 14, 20, 37, -26, 22, 58, -81, 26, 46, 6, 51, 89, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-81,-26,6,14,20,21,22,26,37,46,51,58,59,61,77,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 92, 64, -65, 2, -99, 85, 17, 43, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-65,-45,0,2,17,43,64,85,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-64, 40, 86, 19, 33, 94, 22, 46, 95, 26, -19, -50, 72, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-50,-19,17,19,22,26,33,40,46,72,86,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(22, 74, 64, 69, -74, 70, -48, 17, 74, 17, 36, 5, 87, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-48,1,5,17,17,22,36,64,69,70,74,74,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-1, 30, 73, 10, 84, -96, 47, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-1,10,17,30,47,73,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 68, 91, 61, 61, 15, 49, 54, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,18,32,49,54,61,61,68,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 67, 46, 91, 17, 79, 23, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,23,23,46,67,79,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-30, 90, 65, 45, 1, -24, 68, 24, 31, 18, 5, 62, -24, 35, 50, 17, 80, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,-24,-24,1,5,15,17,18,24,31,35,45,50,62,65,68,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 8, 50, 9, 50, 65, -70, -90, 61, 9, 94, 78, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-90,-70,8,9,9,19,50,50,61,65,78,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 38, 9, 9, -10, 7, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,7,9,9,12,38,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(39, 48, 10, -86, 60, 91, 58, -80, 88, 56, -90, -25, 35, -71, -63, 34, 82, -20, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-86,-80,-71,-63,-25,-20,10,34,35,39,48,56,58,60,82,82,88,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(75, -46, 29, 35, 63, 2, 33, 69, 2, 85, 8, 25, 30, 13, 43, 60, 28, 26, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,2,2,8,13,25,26,28,29,29,30,33,35,43,60,63,69,75,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 89, 70, 2, 50, -8, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,2,9,50,61,70,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-10, 99, 64, 89, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,2,64,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 7, 0, -78, 14, 97, 19, -25, 64, 30, 24, 45, 39, 29, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-25,0,5,7,14,19,24,29,30,39,45,64,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, -61, 3, 25, 68, 71, 25, 0, 6, -54, 65, 73, 17, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-54,0,3,6,17,25,25,58,65,68,71,73,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 46, 97, 45, 72, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,46,59,72,76,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, -97, 50, 4, -82, 11, -92, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-92,-82,4,11,37,50,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, -17, -15, 39, 68, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,-15,11,39,68,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 68, 90, -81, 2, 81, 44, 34, 47, -37, 82, -29, 4, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-37,-29,2,4,33,34,44,47,68,81,82,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-56, 25, 15, 84, 67, 96, 79, 38, 56, 15, -27, 74, 63, 29, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-27,-19,15,15,25,29,38,56,63,67,74,79,84,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, 29, 35, 50, -8, 2, 94, 88, -78, -74, -50, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-74,-50,-8,2,29,35,38,50,69,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 1, 9, 67, -44, 75, 46, 2, 91, 53, -56, 76, 17, 47, 55, 81, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-44,1,2,9,17,17,46,47,53,55,61,67,75,76,81,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, 52, -85, -4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-4,36,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, -48, -14, 49, 65, -54, -18, 23, -99, -33, 81, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-54,-48,-33,-18,-14,23,49,65,66,68,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 43, 71, 82, -41, 54, 87, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,27,43,54,71,82,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 61, 98, 26, -21, 17, 31, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,-21,17,26,31,37,61,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 91, 30, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,58,67,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(69, 48, 59, 2, 31, 94, -87, -30, 34, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-30,2,31,34,44,48,59,69,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-96, 34, -15, 77, -89, -9, 12, 73, 47, 14, -70, 15, 37, 51, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-89,-70,-15,-9,3,12,14,15,34,37,47,51,73,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, -99, 28, 35, 54, 18, -41, 39, -88, 89, -28, 90, -49, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-88,-60,-49,-41,-28,5,18,28,35,39,54,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-66, 4, 78, -44, 72, 22, 48, 61, -93, 29, 87, 24, 77, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-66,-44,4,22,24,25,29,48,61,72,77,78,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 76, 76, -1, -15, 22, 52, 13, 81, 88, -92, 19, 89, 97, 10, 6, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-15,-1,6,10,13,19,22,50,52,58,76,76,81,88,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87, 56, 39, -93, 76, 40, 56, 72, 65, 9, 72, 79, 44, 58, 27, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,9,15,27,39,40,44,56,56,58,65,72,72,76,79,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, -57, 25, 95, -43, 91, 47, 26, 60, 72, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-43,25,26,27,37,47,60,72,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 53, -82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,13,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 38, -33, 13, -90, 97, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-33,13,18,32,38,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 32, 18, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,23,29,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-93, 68, 60, 14, 10, 33, -68, 25, 18, 3, 29, 44, 85, 16, 31, -97, 28, -20, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-93,-68,-20,3,10,14,16,18,25,28,29,31,33,38,44,60,68,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, 16, 86, 76, 47, -43, 10, 91, 89, 90, 21, 11, 4, 79, 38, -64, 2, -11, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-43,-11,2,4,10,11,16,21,30,38,47,76,79,86,89,90,91,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 98, 88, 9, -36, -66, 64, 70, 69, 69, -4, -66, 84, -77, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-66,-66,-36,-4,9,47,64,69,69,70,84,88,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 23, 39, 94, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,23,24,39,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-38, -12, 55, 19, 61, 49, -33, 31, 9, 58, 91, 33, 0, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-33,-12,0,9,18,19,31,33,49,55,58,61,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-75, 36, 77, 83, 40, -58, 34, -43, 39, -44, 47, 30, 70, 87, 9, 2, 98, -85, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-75,-58,-44,-43,-12,2,9,30,34,36,39,40,47,70,77,83,87,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85, 28, 77, 87, -84, 66, 40, -52, 39, 38, -10, -10, 33, 31, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-52,-10,-10,28,31,33,38,39,40,51,66,77,85,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 50, 50, -33, 34, 71, 21, 8, 11, 57, 10, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,8,10,11,15,21,34,50,50,57,65,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 31, 93, 96, 92, 63, 80, 79, 27, 27, -61, -17, 69, 88, -20, 97, 43, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-61,-20,-17,27,27,31,43,63,69,79,80,88,92,93,96,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-6, 56, 66, 24, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,24,28,56,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 28, 79, 79, 37, 39, 33, -71, 4, -59, -84, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-71,-59,4,28,29,33,37,37,39,79,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85, 76, 59, 40, -35, 45, 60, -81, 88, -21, 44, 90, -2, 33, 42, 49, 14, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-80,-35,-21,-2,14,33,40,42,44,45,49,59,60,76,85,88,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, -81, 12, 14, 38, 43, -62, -25, 12, 24, -2, 53, -41, 63, 59, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-62,-41,-25,-2,12,12,14,24,38,43,53,56,59,60,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 9, 20, 70, 85, 14, 49, 4, 19, 54, 60, 74, 63, -80, -66, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-66,4,9,14,19,20,49,54,60,63,70,74,77,85,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 35, 54, -12, 14, -59, 27, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-12,14,24,27,35,54,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 75, 31, 64, 52, 52, -17, 13, 26, 94, 12, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,12,13,24,26,31,52,52,54,64,75,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 37, -30, 91, -88, 3, 15, 5, 20, 74, 66, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-48,-30,3,5,15,20,34,37,66,74,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 87, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,78,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 22, 8, 31, -75, 27, 76, -63, 7, -1, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-63,-1,7,8,22,27,31,34,35,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-26, 78, 45, 98, 45, 11, 67, 66, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,11,45,45,64,66,67,78,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-43, -5, -4, -5, -63, -65, 10, 35, 86, 64, 51, 89, 52, -19, -15, 40, 97, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-63,-43,-19,-15,-5,-5,-4,10,28,35,40,51,52,64,86,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 94, 47, 94, 91, 44, 17, -53, 80, -71, -61, 29, 8, 58, -27, -43, 76, 40, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-61,-53,-43,-27,8,17,29,40,44,47,58,72,76,80,86,91,94,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 72, 9, 53, -55, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,9,20,53,72,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 14, -10, 84, 78, 60, -98, 90, 82, 71, 27, 13, 49, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-95,-10,9,13,14,27,49,60,71,78,82,84,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 54, -9, 16, 42, -51, -24, 22, 80, 16, 59, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-24,-9,16,16,22,42,46,54,59,78,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, 83, 52, 94, 24, 66, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,52,66,75,83,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 29, 41, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,17,29,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, -35, 6, 70, 71, 61, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,6,22,61,70,71,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 88, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,72,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 53, -51, 91, 65, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,4,53,65,79,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 82, -90, 5, 13, 16, 51, 94, 9, -13, 6, 12, 83, 12, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-13,5,6,9,12,12,13,16,27,44,51,82,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-4, 6, 17, 28, 18, -93, 14, 50, 41, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-4,3,6,14,17,18,28,41,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, 56, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,68,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-85, 23, 20, -47, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-47,20,23,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 31, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,31,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, -44, 66, 69, 28, 47, 16, 33, 38, 50, -83, -33, 96, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-44,-33,-31,0,16,28,33,38,47,50,66,69,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 84, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,56,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-41, 9, 65, 89, 48, 37, 49, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,9,37,48,49,65,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, -16, 36, -80, 62, -15, -81, 93, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-80,-16,-15,-12,36,62,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(55, 98, -79, 54, 12, 93, -73, 2, 22, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-73,2,12,21,22,54,55,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 24, 72, 77, 19, 14, 29, 36, -18, 43, 21, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,14,19,21,24,25,29,31,36,43,72,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-34, 38, -46, 21, 65, -52, 95, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-46,-34,21,38,65,68,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-6, 4, 40, -41, -42, 59, -55, 34, 33, 72, 60, 67, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-42,-41,-6,4,33,34,40,59,60,67,72,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-95, 83, -77, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-77,2,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 49, 43, 8, 21, 82, 88, -5, 29, 61, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-5,4,8,21,29,43,49,61,82,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, -29, 45, -36, 0, 67, 94, -3, 17, 1, -1, -61, 74, 92, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-36,-29,-3,-1,0,1,17,45,51,52,67,74,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-19, 20, 65, 80, 51, 97, 18, 38, 76, -32, 89, -66, 91, 53, 44, 44, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-32,-19,18,20,30,38,44,44,51,53,65,76,80,89,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 70, 92, 8, 33, 48, 47, 25, 24, 92, 77, 87, -86, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,8,10,24,25,33,47,48,56,70,77,87,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 42, 89, 90, 57, -88, 42, 59, 18, 82, -16, 41, -66, 27, -26, 40, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-66,-26,-16,18,25,27,29,40,41,42,42,57,59,82,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 15, 47, 48, 3, 5, 41, 3, 53, -19, -23, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,-19,3,3,5,15,15,41,43,47,48,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 12, -75, 59, 24, 34, 13, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,12,13,23,24,34,59,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, -89, 69, 89, 73, 53, -78, 13, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-78,13,13,53,69,73,83,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 73, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,73,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 5, 91, 78, 96, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,28,59,78,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 79, 56, 24, 91, 6, -51, 40, -6, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-6,6,24,40,41,56,59,79,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-21, -89, 33, 19, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-53,-21,19,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 7, 41, 73, 85, 26, 56, 7, 31, 73, 89, -50, 69, 72, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,7,7,13,26,27,31,41,56,69,72,73,73,85,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 37, 92, 66, 72, -14, -11, 84, 87, 41, 56, 48, 19, 46, -92, 52, 80, 71, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-14,-11,8,15,19,37,41,46,48,52,56,66,71,72,80,84,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, -34, 81, -30, 44, 15, 79, 43, 99, 3, 87, 81, 43, 82, 66, 53, 82, -43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-34,-30,3,15,43,43,44,53,66,73,79,81,81,82,82,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 11, 66, -65, -11, 21, 91, 69, 20, -61, 57, -57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-61,-57,-11,2,11,20,21,57,66,69,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-70, 22, -23, 30, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-23,7,22,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 85, 20, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,20,45,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, -59, 46, 20, 30, 19, 22, 58, -45, 67, 35, -77, 43, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-59,-45,-27,19,20,22,30,35,43,46,58,67,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 18, 88, -16, 77, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,6,18,20,77,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 71, 8, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,66,71,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, -90, 24, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-90,24,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 5, 77, 41, 69, 75, 86, -77, 39, 26, 27, 3, 60, -75, -93, 28, 20, 3, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-77,-75,3,3,5,10,20,26,27,28,39,41,60,65,69,75,77,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, -30, 52, -97, 83, -77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-77,-30,52,83,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-26, 24, 17, 58, 15, -76, 93, 40, 72, 44, 79, 10, 47, 81, 58, 46, 14, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-26,10,14,15,17,24,40,44,46,47,58,58,72,79,81,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 64, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,47,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 56, 52, 14, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,14,52,53,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 17, 34, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,34,41,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 11, 71, 72, 31, 91, -3, 26, 87, 61, -89, 49, -67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-67,-3,11,11,26,31,49,61,71,72,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 85, 66, 38, 74, 52, -3, 43, 92, 92, 85, 50, 56, 62, 93, 99, 85, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,36,38,43,50,52,56,62,66,74,77,85,85,85,92,92,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 0, 33, 96, 41, -86, 85, 37, 72, -47, -72, 5, 66, 30, 7, 54, 98, -12, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-72,-47,-12,0,5,7,30,33,37,41,47,54,66,72,72,85,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-72, 55, 58, 21, 20, -5, -73, 96, -30, 17, 60, -77, -94, -62, 16, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-77,-73,-72,-62,-30,-5,4,16,17,20,21,55,58,60,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 59, -19, 65, -32, 73, 62, 45, 88, 85, 20, 44, 82, 47, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,-19,20,44,45,47,59,62,65,73,78,82,85,88,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 82, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,77,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 63, 56, 32, 62, 52, 99, 26, 33, 99, 82, 97, 45, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,32,33,37,45,52,56,62,63,80,82,97,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 95, 71, 71, -37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,71,71,74,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-70, 80, 9, -60, -61, -71, 77, -88, 17, 52, 33, 12, 14, -34, 40, 63, 2, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-71,-70,-61,-60,-34,2,9,12,14,17,33,40,52,63,77,80,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 68, -77, -33, 80, -91, -69, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-77,-69,-33,3,39,68,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 90, 50, 95, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,50,51,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, 35, 58, 55, 87, 62, -36, 42, -11, -52, 99, 25, 13, 65, -93, -16, -12, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-93,-52,-36,-16,-12,-11,13,25,35,36,42,55,58,62,65,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 80, 1, 20, 76, 99, 80, 90, 23, 54, 76, 81, 3, -96, 16, 75, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,0,1,3,16,20,23,35,54,75,76,76,80,80,81,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-43, -70, 11, -9, 84, -99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-70,-43,-9,11,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 3, 95, 73, 28, 33, 19, -59, 41, 38, 17, 66, 90, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,3,17,19,20,28,33,38,41,48,66,73,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 84, -63, 10, 41, -81, -31, 14, 77, 85, 25, -1, 55, -67, 84, -41, 60, 54, -91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-81,-67,-63,-41,-31,-1,10,14,25,33,41,54,55,60,77,84,84,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 57, 78, 29, 45, 48, 47, 86, 14, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,14,29,45,47,48,57,78,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-38, 92, 31, -52, 31, 75, -77, -84, 66, 54, 64, 52, -35, -68, -27, 89, -29, 10, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-77,-68,-52,-38,-35,-29,-27,10,31,31,47,52,54,64,66,75,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 12, 46, 56, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,17,40,46,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-92, 67, 36, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,36,66,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 56, 74, 11, 49, -75, 73, 54, 89, 14, 78, 32, 40, 90, 52, 8, 51, -40, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-40,8,11,14,32,40,49,51,52,53,54,56,73,74,78,82,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, -9, 51, 49, 53, 7, 89, 47, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,6,7,47,49,51,53,89,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 12, 34, -18, 19, 15, 25, 48, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,12,15,19,25,34,47,48,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 36, 23, 44, 87, 63, 77, 67, 27, -88, 40, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,23,27,36,40,41,44,49,63,67,77,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 72, 13, -72, 78, 8, 68, 23, 59, 66, 52, 89, 90, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,8,12,13,23,25,52,59,66,68,72,78,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-97, -73, 61, -80, 34, 67, 74, 4, -49, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-80,-73,-49,4,34,40,61,67,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 60, 43, 78, 6, 48, 39, 95, 34, 49, 25, 0, 87, 48, 68, 95, 39, -21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,0,6,25,34,39,39,43,48,48,49,52,60,68,78,87,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 29, 92, 10, 78, 12, 68, 84, 16, 82, 10, 36, -47, 41, 76, -80, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-47,10,10,12,16,29,36,41,57,60,68,76,78,82,84,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-17, 32, 58, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,32,52,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, -15, 4, 39, 4, 12, 87, 90, 78, 69, 69, 70, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,4,4,12,39,69,69,70,72,78,87,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-11, 93, 51, 36, -39, 79, 78, 67, 11, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-11,11,17,36,51,67,78,79,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 33, 94, 75, 13, 41, -85, 69, -15, 39, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-15,13,33,39,41,50,69,75,80,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, -43, 57, 17, 36, 97, 87, -31, 49, 32, 98, 25, 59, 4, 99, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-43,-31,4,17,25,32,36,49,57,59,67,87,97,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, 96, 90, 68, 71, -99, 78, 4, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,4,47,68,71,78,90,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, -80, -40, 66, 40, 16, 78, -7, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-40,-7,16,40,66,73,78,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, -90, 76, 16, 17, -50, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-50,16,17,39,63,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 17, -29, -38, 34, 94, 16, 62, 45, 86, 8, 81, 96, -10, -82, 1, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-38,-29,-10,1,8,16,17,34,45,62,81,83,86,86,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 92, 88, 17, -30, 15, -79, -93, 94, 62, 50, -99, 3, -97, 40, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-97,-93,-79,-30,3,3,15,17,17,40,50,62,88,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 37, 14, -82, 90, -84, 46, -58, -56, 35, 10, 82, -71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-82,-71,-58,-56,10,14,31,35,37,46,82,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-7, 22, 12, 39, 90, 34, 46, 21, 70, 52, -97, 16, 81, 11, 22, 53, 74, 48, -49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-49,-7,11,12,16,21,22,22,34,39,46,48,52,53,70,74,81,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, -49, 94, 42, 2, -51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-49,2,42,70,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, -99, -76, 92, 24, 92, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-76,24,40,70,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, 35, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,43,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36, 62, 4, -36, 55, 24, -20, -8, 81, 26, 31, 94, 3, -31, 40, 26, -48, -50, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-48,-36,-31,-20,-8,3,4,24,26,26,31,36,39,40,55,62,81,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 3, -72, 69, -89, 52, 49, 2, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-72,2,3,8,49,52,69,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 7, 85, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,60,61,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 6, 18, 2, 83, -9, 72, -17, 43, 77, 31, 14, -92, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-17,-9,0,2,6,14,18,31,43,72,77,83,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 49, 61, 64, -45, 37, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,25,37,43,49,61,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 49, 84, 21, 93, 64, 51, -60, 76, 72, 86, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,21,49,51,64,68,72,76,84,86,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 83, -99, 84, 21, 44, -36, -42, -10, -61, -76, 46, 68, 2, 93, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-76,-61,-42,-36,-10,2,21,28,44,46,68,69,83,84,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 47, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,47,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, -25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 92, 3, -77, 50, 41, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,3,41,50,80,81,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, -36, 92, 3, 48, 57, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,3,48,51,57,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 68, 97, 28, 84, -27, -61, -65, -26, 1, 87, -44, 47, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-61,-44,-27,-26,1,3,28,47,57,68,84,87,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 0, 50, 54, 90, 89, 28, 0, 80, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,0,0,28,50,54,63,80,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 17, -63, 90, 49, 24, 91, -82, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-63,17,24,46,49,87,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 74, -82, 88, 52, 93, 34, 31, -78, 33, 57, 9, 7, -27, 2, -50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-78,-50,-27,2,7,9,31,33,34,35,52,57,74,88,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, -67, 58, 85, -52, 53, 36, -95, 75, 27, 3, -61, 6, 22, 65, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-67,-61,-52,3,6,15,22,27,36,50,53,58,65,75,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 52, 56, -70, 65, 14, 57, 53, -97, 78, 10, 6, 27, 97, -94, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-94,-70,-48,6,10,14,27,44,52,53,56,57,65,78,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 36, 70, 46, -54, 3, -42, 55, 73, -86, 35, 40, 13, 36, 75, 19, 11, 90, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-54,-42,3,11,13,19,25,35,36,36,40,46,55,60,70,73,75,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 68, -10, -36, -10, 98, 68, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-10,-10,44,68,68,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 38, -74, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,26,38,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 24, -89, -14, 85, 16, 89, 86, 10, 30, -89, 43, 27, 71, 45, 75, 77, 86, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-89,-14,9,10,16,24,27,30,43,45,71,75,77,85,86,86,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85, 85, 44, -6, 74, 28, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,8,28,44,74,85,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 72, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,72,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 44, 6, 56, -24, 13, -68, 31, 71, 91, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-24,6,13,31,44,56,59,71,74,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 11, 80, 66, 26, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,11,26,52,66,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 0, 55, 73, 6, -12, 17, 49, -77, 68, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-12,0,6,17,31,49,55,68,71,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 83, -52, 0, -78, 56, 98, 94, 48, 72, 37, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-62,-52,0,20,37,48,56,72,83,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 45, 89, 62, 70, 43, -8, 4, 61, 16, 28, 99, -88, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-8,4,8,16,28,43,45,55,61,62,70,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-14, 27, 5, -65, 42, 63, 59, 25, 93, 87, 53, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-14,5,25,27,42,52,53,59,63,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-12, 67, 44, 2, 34, 4, -36, -75, 37, 67, 76, 23, 39, 32, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-36,-12,2,4,23,32,34,37,39,44,67,67,76,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-74, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, -72, 72, 91, 39, -58, -74, 35, 1, 54, -49, 0, 25, 91, 11, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-72,-58,-49,0,1,8,11,25,35,39,54,72,91,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, -14, -67, 7, 60, 17, -33, 31, 2, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-33,-14,2,7,17,31,33,60,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 43, 96, 84, 39, 79, -47, 9, 28, 67, 55, -36, -20, -57, -6, 28, 37, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-47,-36,-20,-6,9,18,28,28,37,39,43,55,67,79,83,84,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 82, -15, 25, 30, 84, -24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-24,-15,2,25,30,82,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 1, 46, -95, 84, 82, 63, 31, 4, -69, 6, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-69,1,4,6,6,31,46,46,63,82,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, 75, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,45,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 8, 54, 97, -70, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,5,8,12,54,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, 94, 40, 74, 81, 55, 88, 35, 35, 48, -49, 31, -49, -92, 51, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-77,-49,-49,23,31,35,35,40,48,51,55,74,81,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-31, -39, -18, 13, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-31,-18,13,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 61, 95, 1, 58, -26, 11, 89, 14, 15, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,1,8,11,14,15,23,58,61,89,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 90, 47, -19, 84, 94, 84, 66, 48, -90, 33, 47, 28, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-19,26,28,33,47,47,48,57,66,84,84,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-53, 68, 22, -67, 49, 94, -46, 1, 23, 98, 22, 2, -15, 5, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-67,-53,-46,-15,1,2,5,22,22,23,49,68,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 39, 53, -96, 82, 64, -24, 86, 14, 65, 35, 69, 36, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-24,1,14,35,36,39,44,53,64,65,69,82,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 71, 39, 22, 82, 97, 79, 42, 42, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,39,42,42,60,71,79,82,86,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 16, -8, 99, 97, -49, 59, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-8,16,20,59,91,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 55, 17, 80, 73, 21, -8, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,-8,17,21,34,55,73,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 71, 6, 58, -2, 31, 28, 30, 72, -37, -78, -26, 24, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-37,-26,-2,6,6,24,28,30,31,46,58,71,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 17, -84, 42, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,15,17,42,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 41, 74, 0, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,9,41,61,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 87, 57, -93, -13, 13, 15, 31, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-13,13,15,18,22,31,57,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 34, 69, -49, -93, -78, 41, 88, 10, -93, -70, 76, 88, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-93,-78,-70,-49,10,24,25,34,41,69,76,88,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 4, 69, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,9,69,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 4, 22, -99, 60, 53, 77, 94, 43, 9, 88, 97, 50, 43, 74, 79, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,4,9,22,43,43,50,53,60,74,77,79,80,82,88,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 91, 7, 57, -97, 95, 2, 96, -8, 40, -8, 15, 89, 0, -47, 1, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-47,-8,-8,0,1,2,7,15,40,41,57,79,89,91,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 69, 7, 43, 81, -74, 77, 8, 82, -82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-74,7,8,43,50,69,77,81,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 16, -3, 80, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,16,71,77,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 0, 88, 77, 24, 53, 69, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,0,24,37,53,69,77,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-48, 39, 29, 78, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,29,39,78,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, -37, 26, 69, 62, 34, 81, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,26,27,34,57,62,69,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, -97, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,17,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, -73, 93, -29, -70, 22, 28, -82, 6, 36, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-73,-70,-29,6,16,22,27,28,36,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 60, 11, 41, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,22,35,41,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-39, -77, 41, 33, -69, 47, 52, 58, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-69,-61,-39,33,41,47,52,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 54, -65, 47, 1, 71, 28, 5, 35, 85, 56, 68, 99, 1, 20, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,1,1,5,20,26,28,35,47,54,56,68,71,80,85,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 83, 25, 39, 2, 11, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,4,11,25,39,79,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 6, 77, 94, 54, 16, 92, -99, 89, 57, 7, -58, -86, 40, -12, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-86,-58,-12,3,6,7,16,40,54,57,72,77,89,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 44, 77, 38, 42, 72, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,38,42,44,63,72,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(22, 37, 35, 5, -2, 44, 64, -18, 13, 55, 11, 80, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,-2,5,11,13,22,35,37,44,55,64,64,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, -73, 51, 75, 42, 33, -69, 18, 26, 72, 81, 70, 1, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-69,1,18,26,33,35,42,51,70,72,75,76,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 77, 40, 32, 43, 57, 14, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,14,32,40,43,57,66,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, -22, 39, 81, 35, 79, 5, 78, 28, 21, 68, 70, 65, 54, -66, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-22,0,5,18,21,28,35,39,54,65,68,70,78,79,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-76, 27, 49, 29, -80, 75, 89, 24, 57, 4, 16, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-76,4,16,24,27,29,49,57,75,78,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87, 68, 53, 99, 18, 18, 31, 61, 34, -94, 81, 72, 74, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,18,18,27,31,34,53,61,68,72,74,81,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 49, 49, 71, 29, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,35,49,49,61,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, -81, 41, 86, -66, -99, 68, -6, 24, 2, 38, 21, 34, 44, 99, -62, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-81,-66,-62,-6,2,21,24,34,38,41,44,60,68,82,86,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, -79, 49, 52, 43, 67, 97, 37, 52, 91, 10, 82, 74, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,10,24,37,43,49,52,52,67,74,76,82,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-12, 36, 93, 32, 18, 16, -38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-12,16,18,32,36,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 21, 17, 25, -63, 76, 62, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,12,17,21,25,62,72,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 10, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,25,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, -40, 72, 52, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,44,52,72,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-67, 17, 68, 55, 94, 1, 66, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,1,17,55,66,68,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-20, 37, 48, 38, 60, -45, 93, 33, 2, 50, 2, 13, -49, 68, 44, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-45,-20,2,2,13,33,37,38,44,48,50,60,68,85,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-40, 87, 62, 79, 30, 4, 2, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,2,4,30,49,62,79,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, 97, 62, 80, 96, 66, -72, -43, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-43,21,50,62,66,80,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-65, 10, 53, 18, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,2,10,18,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 13, 6, 48, 74, 23, -35, 7, 76, -98, 45, -36, 24, -62, 50, 95, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-62,-36,-35,6,7,13,23,24,37,45,48,50,61,74,76,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 83, -18, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,19,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 43, 14, -89, -15, 38, 84, -19, 9, -23, -90, -10, 58, 5, -47, -48, 37, -55, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-89,-69,-55,-48,-47,-23,-19,-15,-10,5,9,14,19,37,38,43,58,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 41, 72, 20, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,20,27,41,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 31, -94, -67, 43, 91, -70, -2, -17, 91, 34, 78, 49, 93, 60, 1, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-70,-67,-17,-2,1,31,34,43,49,60,78,91,91,93,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, 47, -56, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,23,47,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, -90, 83, 71, -63, -69, 6, -37, 70, 57, 61, 5, 28, -65, 91, -33, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-69,-65,-63,-46,-37,-33,5,6,28,57,61,70,71,83,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 83, 59, 18, 75, 83, 34, 0, -57, 70, 23, 9, 92, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,0,9,17,18,23,34,51,59,70,75,83,83,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 44, 20, -33, 82, 3, 10, 70, 89, -87, -75, 46, 92, 52, 17, 81, 19, 76, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-75,-33,3,10,17,19,20,44,46,52,70,76,81,82,82,88,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 78, -93, 19, -65, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-65,19,42,62,78,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-83, 4, 21, 8, 48, 93, 17, 72, -66, 24, 92, 72, 45, 97, 78, -30, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-66,-30,4,8,17,21,24,37,45,48,72,72,78,92,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, -78, 11, 36, -31, 96, 14, 39, -6, 66, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-31,-6,11,14,36,39,44,66,85,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 17, 1, 92, 90, 60, -19, 34, 78, 74, 71, 79, 74, -7, 66, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,-7,1,17,32,34,60,66,71,74,74,78,79,79,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 57, 65, -94, 28, 53, -21, 21, 7, 2, -42, 53, 20, -69, 99, -89, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-89,-69,-42,-21,2,2,7,20,21,28,53,53,57,65,80,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 61, 1, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,32,52,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 32, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,66,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, 56, 29, 11, 61, 54, 32, 58, 68, 40, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,11,29,32,40,49,54,56,58,61,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-42, 92, 68, 58, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-31,58,68,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, 32, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,32,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, -10, 73, -74, 95, 6, 64, 54, 92, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-74,-10,6,54,64,73,83,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 76, 19, 99, -53, 21, -4, 47, 10, -40, 67, 40, 27, 80, 32, 64, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-40,-4,10,19,21,27,32,40,42,47,64,67,76,80,88,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, -45, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,13,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, -98, -96, -64, -22, -54, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-96,-94,-64,-54,-22,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-32, -99, 95, 68, 99, 61, -15, -58, 47, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-58,-32,-15,20,47,61,68,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, -28, -15, 55, -21, 89, 48, 55, 82, 29, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,-21,-15,29,48,55,55,62,82,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 60, 56, -61, -43, 60, 32, -82, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-61,-43,5,32,43,56,60,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 57, -6, 64, 40, 5, 14, 42, 83, 64, 82, 50, 74, -20, 90, 20, 88, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-6,5,12,14,20,40,42,50,57,64,64,64,74,82,83,88,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, -53, 98, -91, 98, 59, 84, 95, 38, 83, 37, 33, -42, 99, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-53,-42,24,33,37,38,59,76,83,84,95,98,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 7, 77, 21, -33, 14, 33, 10, 15, 42, 26, -14, 49, 97, 76, 91, 50, 88, -18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-18,-14,7,10,14,15,21,26,33,42,49,50,76,77,88,91,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 19, 99, -36, 69, 77, 99, -67, -79, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-67,-36,19,65,69,77,94,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 20, 28, 30, -95, 0, -47, -77, 93, 84, 39, 93, 7, -18, 68, 45, 99, -20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-77,-47,-20,-18,0,7,20,28,30,39,45,50,68,84,93,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 98, 28, -76, 7, 79, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-76,7,13,28,79,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, -83, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,33,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(69, 17, 27, 47, 25, 33, -92, 83, 33, 0, -1, -53, 94, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-53,-1,0,17,25,27,33,33,47,69,83,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-86, 59, 6, 28, 52, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,3,6,28,52,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-65, 61, 0, 88, 7, 16, 39, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,0,7,16,39,48,61,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 96, -65, 91, 37, 22, 15, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,15,22,37,43,71,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 38, 95, 66, 78, 14, -64, 24, 53, 86, 55, -89, -87, -23, 57, 28, 36, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-87,-64,-23,14,16,24,28,36,38,53,55,57,66,78,86,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 36, 42, 59, -5, 22, 75, 64, 74, 38, -75, 99, -57, -6, 27, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-57,-6,-5,1,22,27,36,38,42,42,59,64,74,75,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-33, 37, 41, 74, 79, 30, 53, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,30,37,41,53,74,79,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 73, 7, 52, 26, 5, 12, -40, 0, -24, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-24,0,5,7,12,18,26,52,56,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 45, 64, -91, 53, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,7,27,45,53,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-64, 37, 24, 80, 88, -59, -30, 64, -51, 73, 20, 69, 18, 19, 36, 30, 59, 67, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-59,-51,-30,18,19,20,24,30,36,37,59,64,67,69,73,80,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, -89, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,21,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-90, 75, 38, -65, 18, -28, -97, 62, 12, 74, -28, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-90,-65,-28,-28,2,12,18,38,62,74,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 35, 46, 80, 22, 83, 31, 70, -55, 73, 17, 96, 37, 2, 36, 99, 97, 78, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-48,2,11,17,22,31,35,36,37,46,70,73,78,80,83,96,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 88, 34, 23, 94, 83, 67, -25, 59, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,21,23,34,35,59,67,83,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, 75, 50, -19, 7, 84, 2, 58, 33, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,2,7,33,42,50,58,62,75,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 79, 92, 56, 34, 33, -69, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,14,33,34,56,72,79,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-23, 59, 87, -92, 15, 83, 35, 63, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-23,15,35,53,59,63,83,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, 2, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,45,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 32, 18, 26, -77, 36, 73, 35, 94, -6, 33, -50, -61, 25, 25, 98, 57, -1, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-61,-50,-8,-6,-1,18,25,25,26,32,33,35,36,54,57,73,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 35, 8, 94, 38, 60, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,8,35,38,60,75,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 74, 44, -49, -86, 85, -20, 60, 15, 84, -99, 18, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-86,-49,-20,15,18,44,60,61,74,84,85,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 2, 80, 75, 57, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,34,57,75,80,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, 61, 17, 84, -91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,17,49,61,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, -18, 22, 44, -68, 20, 70, 29, -44, 26, -5, 61, 74, 20, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-44,-18,-5,20,20,22,26,29,30,44,61,70,74,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, -28, 1, 32, 86, 67, 43, -34, -19, 57, 8, 80, 46, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-28,-19,1,8,9,32,43,46,57,67,73,80,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-30, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, -84, 2, 67, 18, -83, 78, 4, 43, 26, 92, -47, -45, 9, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-83,-47,-45,2,4,9,18,26,41,43,48,67,78,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, -68, 38, 13, 0, 82, -47, 90, -9, 82, 25, 55, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-47,-9,0,13,25,28,33,38,55,82,82,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, 50, 1, -48, -63, 6, 75, -2, 79, -26, 86, -40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-48,-40,-26,-2,1,6,50,75,79,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 67, 61, 81, 25, 67, 65, 52, -67, 69, 33, 13, 17, 96, 24, 17, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,13,17,17,24,25,33,47,52,61,65,67,67,69,81,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, 40, 56, -22, -38, 15, 42, 85, 23, -26, -30, -82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-38,-30,-26,-22,15,23,40,42,56,62,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, -37, -17, 32, 12, 41, 72, 69, -58, 40, 36, 47, 50, -60, -31, -96, 3, 19, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-60,-58,-37,-31,-17,3,12,14,19,32,36,40,41,47,50,51,69,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, -78, 35, 7, -96, 49, 65, 66, 65, 66, 47, 0, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-78,0,7,35,47,49,65,65,66,66,79,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 74, 57, 2, 28, -11, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-11,2,19,28,57,74,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(69, -76, 59, 46, 53, 68, 54, 7, 18, 3, 12, 62, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,3,7,12,18,27,46,53,54,59,62,68,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-88, 17, -38, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-38,17,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 3, 51, 58, 22, -38, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,3,22,25,51,58,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 97, 66, 95, 70, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,46,66,70,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-82, 66, 41, -65, 24, 13, 99, 39, 28, 89, 89, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-65,13,18,24,28,39,41,66,89,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 89, 15, 87, 79, -32, -12, -95, 93, 8, 12, 70, 67, 66, 59, 83, 7, -50, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-50,-32,-12,2,7,8,12,15,59,61,66,67,70,79,83,87,89,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 48, -22, 10, 78, -46, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,-22,10,48,78,82,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-37, 97, -26, 7, 39, 56, 91, 52, 19, -54, 47, 2, 51, 36, 50, 79, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-37,-26,2,7,19,25,36,39,47,50,51,52,56,79,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 18, 47, 21, 57, 52, 10, -85, 3, 21, 27, 39, 14, 7, 65, 42, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,3,7,10,14,17,18,21,21,27,39,41,42,47,52,57,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-98, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-62, 90, 87, 83, 73, 72, 26, -74, 88, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-62,26,72,73,77,83,87,88,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, 98, -60, 29, 66, 23, 10, 73, 75, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-60,7,10,23,29,66,73,75,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 56, 44, 35, 18, -12, 34, 62, -75, 11, 21, -26, -40, -62, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-62,-61,-40,-26,-12,1,11,18,21,34,35,44,56,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, -25, 38, 4, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,2,4,20,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-46, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, 76, -22, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,7,30,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 23, 76, 66, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,58,66,76,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 59, 93, 72, 99, 90, -1, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,13,51,59,72,90,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 86, 69, 66, 61, 10, 81, 75, 18, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,10,11,18,61,66,69,75,81,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-29, 26, 89, 71, 3, -23, 82, 62, 4, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-23,3,4,26,62,71,75,82,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, -76, 39, 29, 78, 75, -55, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-55,29,39,75,78,83,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-94, 62, 46, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,18,46,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 26, -93, 76, 84, 12, -90, 47, 19, 28, 67, 51, 33, 45, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-90,12,19,26,28,33,44,45,47,51,64,67,76,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 45, -53, 40, 62, 54, 77, 19, 60, 97, 40, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,19,25,40,40,45,54,60,62,71,77,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 69, 8, 0, 31, 52, 11, 39, 2, 64, 52, 45, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,8,11,28,31,39,45,52,52,61,64,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 73, 37, -33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,11,37,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 51, 67, 41, 10, 80, 69, 82, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,17,41,51,67,69,77,80,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, -46, 49, 91, -72, 83, -34, 60, 3, 86, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-46,-34,3,24,49,60,83,84,86,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 56, 18, 75, -86, 78, 63, -58, 73, 89, 72, 62, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-58,18,56,62,63,72,73,75,77,78,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, -51, 7, 25, 82, 0, -47, 2, -54, 27, 17, 75, 52, 33, 1, 85, 86, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-51,-47,0,1,2,7,17,20,25,27,33,52,75,82,85,86,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 85, 73, 95, 76, 4, -6, 40, 35, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,0,4,15,35,40,73,76,85,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 18, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,18,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 96, 17, 3, -94, 18, 70, 3, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,3,3,13,17,18,70,79,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-34, -70, 62, 91, -21, 70, 94, 26, 65, 52, 85, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-34,-21,26,27,52,62,65,70,85,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 69, 39, 39, 0, 23, 37, 36, -18, -84, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-18,0,23,36,37,39,39,50,54,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 83, 0, 82, -29, 50, 96, 47, 6, -74, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-74,-29,0,6,20,47,50,82,83,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, -40, 1, 36, 0, 87, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,0,1,15,36,87,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 54, 68, 69, 5, 21, 57, 86, 14, -10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,5,14,21,54,57,68,69,74,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, 38, 79, 84, 76, 26, 55, 11, 3, 96, 72, 14, -93, 60, -9, -19, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-19,-9,3,11,14,26,29,38,55,60,72,76,79,84,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(55, 95, 60, 1, 28, 72, 12, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,12,28,55,60,72,74,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 97, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, 75, 3, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,7,56,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 47, 3, 16, 49, -52, 40, 47, -79, 91, 61, 29, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-52,3,16,29,31,40,43,47,47,49,61,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 65, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,65,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 7, -98, 48, 2, 48, 28, 87, -94, 72, -31, 22, 75, 39, 7, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-94,-31,2,7,7,13,22,28,39,48,48,72,75,78,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-75, 57, 70, 81, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,56,57,70,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, -28, 1, 9, 80, -94, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-28,0,1,9,35,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 77, 68, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,68,71,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, -77, -98, 79, 7, 42, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-77,7,15,42,72,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 42, 54, 36, 74, 2, -2, 97, 78, -81, -45, -49, 99, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-49,-45,-12,-2,2,11,36,42,54,74,78,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-50, 26, 64, -10, -68, 73, 93, -88, -41, 33, 72, 53, -44, -51, 23, 67, 35, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-68,-51,-50,-44,-41,-10,9,23,26,33,35,53,64,67,72,73,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 99, 9, 40, 15, 66, 57, 22, 18, -56, 89, 8, 81, 3, 40, 40, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-56,3,8,9,15,18,22,40,40,40,57,66,68,81,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 77, 54, -28, -45, 22, 0, 85, 89, 54, 32, 22, 76, -27, -71, 45, -70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-70,-45,-28,-27,0,22,22,32,34,45,54,54,76,77,85,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 14, 36, -25, 95, -14, 16, 74, 31, 0, 32, -72, 9, 57, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-25,-14,0,9,14,16,31,32,36,57,70,74,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 57, 65, 19, 34, 36, -33, -15, -7, 52, 63, 97, 57, 53, 30, -66, 91, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-33,-15,-7,19,30,34,36,52,53,57,57,63,65,72,91,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-69, 23, 3, 43, 32, 89, 31, 73, 91, 9, 89, 16, 33, -75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-69,3,9,16,23,31,32,33,43,73,89,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 59, 82, 71, 94, 39, 33, 22, 63, 81, 58, 66, 74, 21, 74, 48, 12, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,21,22,33,39,48,50,58,59,63,66,71,74,74,77,81,82,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 69, 74, 86, -34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,69,74,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 87, 1, 26, -48, -64, 18, 40, 16, -91, 55, 54, -36, 14, -49, -93, -49, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-91,-64,-49,-49,-48,-36,1,4,14,16,18,26,40,53,54,55,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-34, 73, 58, 41, 80, 27, 9, -62, 77, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-34,9,14,27,41,58,73,77,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 45, -90, 62, 40, 88, 33, 21, 89, 44, 5, -41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-41,5,21,33,40,44,45,47,62,88,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 84, 49, 74, 17, -61, 28, -84, 29, 9, 93, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-61,9,17,28,29,49,60,74,77,84,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 67, 45, 84, 5, 59, 36, -33, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,5,33,34,36,45,59,67,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 1, 51, 63, -20, 38, 14, 52, 14, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,1,14,14,27,38,51,52,61,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, -41, -82, -79, -1, 92, 30, -35, -93, 9, 27, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-82,-79,-41,-35,-1,9,27,30,62,70,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, -46, -79, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-46,75,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(90, 30, 11, -50, 7, 15, 65, 40, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-50,7,11,15,30,40,65,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 6, -81, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,6,58,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 35, -48, 87, 82, 71, 59, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,35,59,71,72,75,82,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 18, 26, 2, 18, -59, 39, 27, -20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-20,2,18,18,26,27,39,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 49, 17, -58, 12, 17, -2, -77, 49, 30, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-58,-2,12,17,17,19,30,34,49,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 62, 27, 71, 16, 11, 77, -11, 86, -61, 31, 72, -75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-61,-11,11,16,27,31,56,62,71,72,77,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 65, 2, 73, -25, 29, -54, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-25,2,29,41,65,73,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(69, 31, 81, 29, 98, 6, -77, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,6,29,31,69,75,81,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 51, 59, 74, 85, -97, 94, 45, 48, 80, 99, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,45,48,51,57,59,74,78,80,85,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, 84, 77, -82, 60, -68, 92, 75, 51, 35, 92, 57, -1, -9, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-68,-9,-1,35,45,51,57,60,72,75,77,84,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 30, 47, 9, 57, 91, -15, 87, 60, 71, 23, 62, 31, 63, 0, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,0,9,23,26,26,30,31,47,57,60,62,63,71,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 92, 0, 15, 99, 66, -64, -77, 50, 16, 15, 82, 61, 53, 79, 83, -25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-64,-25,0,15,15,16,50,53,61,65,66,79,82,83,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87, 43, 12, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,12,43,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 14, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,32,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 21, 23, 5, 78, 15, 39, 44, -79, -84, 62, 97, -49, 14, 5, 90, 22, 21, -54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-79,-54,-49,5,5,14,15,21,21,22,23,39,44,62,67,78,90,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 28, 21, 78, 13, 89, 62, 7, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,13,21,26,28,62,78,84,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 44, 22, 1, 15, -96, -68, 49, -56, 29, -63, 53, 3, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-68,-63,-56,1,3,15,22,29,44,49,53,82,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 61, 77, 41, 3, 78, 2, 68, 39, 80, -10, 95, -84, 34, 26, 83, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-10,2,3,8,26,34,39,41,61,68,71,77,78,80,83,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, -58, 56, 37, 27, 73, -54, 97, 17, 11, 50, 35, 79, 21, 17, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-54,11,17,17,21,27,34,35,37,50,53,56,73,79,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 12, -72, 97, -15, 55, 71, 39, 58, 44, -65, 37, 2, -30, 96, 68, -86, -75, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-75,-72,-65,-30,-15,2,12,37,39,44,53,55,58,68,71,92,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 89, -65, -19, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-19,40,68,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 22, 7, 56, 50, -63, 98, 17, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-16,7,17,22,50,56,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, 79, 45, -2, 92, 84, 68, 13, 51, -36, 74, 59, 58, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-2,13,30,36,45,51,58,59,68,74,79,84,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 1, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,46,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 71, 14, 40, 16, 98, 22, 81, -58, 68, -67, 69, 61, 77, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-67,-58,14,16,22,40,44,61,68,69,71,77,81,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, -58, 73, -77, 79, 36, 66, 98, -26, 62, 78, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-58,-26,36,41,54,62,66,73,78,79,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(75, -40, 43, 83, 62, 30, -54, 88, -14, 22, 92, -31, 18, -52, -51, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-52,-51,-40,-31,-14,18,22,30,43,62,75,83,88,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, -29, -5, 37, 10, 47, 85, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-5,10,24,37,47,47,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 92, 13, 51, 67, 46, 51, 34, 54, 46, 93, 28, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,13,19,28,34,46,46,51,51,54,67,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 92, 80, 60, 98, 86, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,52,60,80,86,92,98]", resultFormatted);
    }
}

