package java_programs;


public class QUICKSORT_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-71, 16, 52, 5, 1, -47, -27, 75, -44, 30, 29, -24, 55, 62, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-47,-44,-27,-24,0,1,5,16,29,30,52,55,62,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 69, 74, -65, 77, 65, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,15,18,65,69,74,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, -59, 25, 27, 73, 83, 45, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,25,27,45,57,73,74,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 24, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,24,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, -44, 46, -76, -89, 50, -24, 32, 13, 66, 94, 96, 61, 90, -71, 53, 90, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-76,-71,-44,-24,0,13,32,37,46,50,53,61,66,90,90,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 11, -10, 45, -51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-10,11,35,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 26, 47, 74, -16, -96, 73, 64, -42, 19, 80, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-42,-16,19,26,45,47,50,64,73,74,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, -27, 96, 27, -63, 59, 93, 76, 52, 80, 4, -57, 23, 15, 90, -2, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-57,-27,-2,4,15,23,27,52,59,68,73,76,80,90,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, -44, -70, 48, 50, 18, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-44,17,18,48,50,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 35, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,35,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 47, 83, 69, 2, 80, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,47,49,69,70,80,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 25, -62, 41, -3, -89, 13, 40, 35, 61, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-62,-3,13,25,35,40,41,59,61,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-64, 18, 63, -46, -14, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-46,-14,0,18,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 5, 7, 55, 49, 20, 45, -34, -68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-34,5,7,20,45,49,54,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-68, 92, 93, 9, 62, 28, 78, 28, 39, 25, 52, 10, -39, 85, 89, 38, 45, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-39,9,10,25,28,28,38,39,45,52,62,78,84,85,89,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93, 40, 79, -29, -59, 10, 37, 9, 1, 87, -37, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-37,-29,1,9,10,37,40,75,79,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-72, 67, 32, 33, -78, 68, 21, 60, 5, 18, 98, 94, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-72,1,5,18,21,32,33,60,67,68,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 15, 71, -11, 27, -99, 86, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-11,15,27,29,37,71,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 90, 50, -65, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-65,50,78,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 94, 4, 85, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,4,11,85,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 49, -60, 48, 43, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,30,43,48,49,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 70, 77, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,55,70,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 12, 22, 28, 91, 10, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,12,22,28,72,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, -93, -13, 9, 88, 88, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-13,9,63,87,88,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(92, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 82, 59, 77, 98, 98, 46, 78, 70, 68, 36, 48, -18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,36,46,48,59,68,70,77,78,82,94,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 85, 87, -88, -48, 46, -44, 50, -88, 82, -70, 39, 81, -88, -72, 1, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-88,-88,-72,-70,-48,-44,1,7,18,39,46,50,81,82,85,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 2, 92, -32, -60, -11, 73, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-32,-11,2,53,58,73,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, -77, 78, -83, 92, -79, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-79,-77,7,48,78,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, -46, 83, 1, 85, 22, 41, 78, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,0,1,22,34,41,78,83,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-25, 68, 65, 34, 57, 86, 10, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,8,10,34,57,65,68,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-6, 85, 41, 80, 95, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,41,80,81,85,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-58, 68, 98, 27, 45, -45, 76, -7, 62, 95, 88, 60, 97, 36, 5, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-45,-7,5,6,27,36,45,60,62,68,76,88,95,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-34, 18, 53, 6, 57, 75, 69, 56, 17, 87, 93, 11, 45, 5, 49, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,5,6,11,17,18,45,49,53,56,57,69,73,75,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 56, 0, 26, 21, 19, 5, 89, 51, 25, 66, 95, -20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,0,5,19,21,25,26,46,51,56,66,89,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, -26, -39, 27, 45, 46, 99, 37, -65, 93, 25, 94, 60, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-53,-39,-26,23,25,27,37,45,46,60,93,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 95, -97, 30, 45, 47, -98, 36, -3, 48, 77, 79, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-97,-69,-3,22,30,36,45,47,48,77,79,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 74, 4, -20, 71, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,4,48,71,74,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-17, -23, 19, 71, 88, 96, 26, 64, 67, 76, 28, 50, 25, 23, 79, -50, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-23,-17,19,23,25,26,28,50,58,64,67,71,76,79,88,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 32, 26, 21, 10, 79, 60, 62, 0, -6, -37, 82, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-6,0,10,21,26,32,43,60,62,79,82,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 20, 47, 48, 93, -28, 94, 32, 4, -82, 41, 35, 38, 63, 69, -24, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-28,-24,4,11,20,32,35,38,41,47,48,49,63,69,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 14, -70, -91, 64, -66, 21, 29, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-70,-66,14,21,29,64,65,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-65, -44, 13, 66, 93, 77, 26, 55, 54, 58, -71, 99, 56, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-65,-44,13,26,35,54,55,56,58,66,77,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 3, 9, -81, 53, 56, 61, 76, 60, -50, 24, 19, -68, -80, 99, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-80,-68,-50,0,3,9,19,19,24,53,56,60,61,76,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, -10, 80, 28, 35, -53, 71, 99, 93, 43, 13, 65, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-10,13,28,35,43,60,65,71,80,93,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 42, -14, 60, 77, 75, 34, 13, 39, 14, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-14,13,13,14,34,39,42,59,60,75,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, -96, -96, 4, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-96,4,36,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 85, 83, 90, 44, 47, 88, 23, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,35,44,47,70,83,85,88,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, -96, 7, 93, -75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-75,7,11,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-20, 21, 54, 14, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,4,14,21,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 20, 32, 16, 81, 40, 31, -23, 16, 15, -46, 17, -58, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-46,-23,15,16,16,17,18,20,23,31,32,40,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, -21, 97, 70, 29, 36, 58, 77, -97, 33, 14, 35, 53, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-21,14,20,29,33,35,36,53,55,58,70,77,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 33, 74, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,27,33,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-93, 11, 13, 28, -87, 6, -75, -39, 14, 28, 84, -3, 88, 5, -45, 88, -18, 96, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-87,-75,-45,-39,-18,-3,5,6,11,13,14,28,28,43,84,88,88,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, -72, 27, 65, 23, -51, 54, 8, 46, 46, 72, 44, 60, 38, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-51,8,23,27,31,33,38,44,46,46,54,60,65,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, 64, 2, 44, 54, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,44,54,64,82,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 68, 2, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,21,62,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-38, 89, 87, 86, 31, 77, -72, 15, 56, 44, 55, 79, 25, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-38,15,25,31,44,55,56,63,77,79,86,87,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-78, 98, 93, -9, -17, 55, 73, 3, 78, 81, 72, -71, 25, 47, 12, 8, 28, 68, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-71,-17,-9,3,8,12,25,28,47,55,68,72,73,78,81,93,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 7, -29, -96, 38, 84, 50, 98, 46, 36, -50, 27, 86, 19, 35, 39, 74, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-50,-29,7,19,20,27,35,36,38,39,46,50,74,83,84,86,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 14, 35, 43, 72, 89, 97, 59, 3, 62, 57, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,3,14,22,35,43,57,59,62,72,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 39, 58, 88, 30, 30, 53, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,30,30,39,53,58,61,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 42, 19, 6, 91, 37, 7, 52, 98, 94, 9, 51, 52, 42, 42, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,7,9,19,37,42,42,42,51,52,52,81,85,91,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, -81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-49, -92, 6, 15, -46, 20, 81, 67, 9, -38, -18, 11, 46, 69, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-49,-46,-38,-18,6,9,11,15,20,31,46,67,69,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 20, 88, 58, -56, -56, 45, 83, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-56,20,26,43,45,58,83,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, -74, 99, 74, 25, 74, 5, 36, 67, -81, 81, 64, 18, 57, 5, 46, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-74,-60,5,5,18,25,27,36,46,57,64,67,74,74,81,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 11, 76, 90, 53, 9, 32, 13, 17, 8, 58, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,9,11,13,15,17,32,53,58,76,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, -48, 28, -14, 38, 88, 66, 85, 88, 83, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-14,24,28,38,66,72,83,85,88,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 84, 89, 34, 16, 7, -24, -24, 50, -47, -38, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-38,-24,-24,7,16,32,34,50,67,84,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 24, 6, 70, 78, 56, 47, 13, 57, 89, -8, 24, 54, 48, 88, 88, 51, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,6,13,24,24,47,48,51,51,54,56,57,65,70,78,88,88,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, 64, 50, 59, 28, 1, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,28,50,59,63,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, 36, 36, 41, 2, 8, 81, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,8,36,36,41,64,65,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 40, 67, 29, 42, 9, 77, -20, 20, 57, 9, 45, 38, 25, 38, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,9,9,20,25,29,32,37,38,38,40,42,45,57,67,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-25, 47, 37, 96, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,37,47,74,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 37, 40, -88, 42, 89, 97, 34, 34, 83, -95, 95, 75, 80, 50, -38, 82, 2, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-88,-38,2,34,34,37,40,40,42,50,52,75,80,82,83,89,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 22, 83, 43, 15, 86, 9, 87, 14, 21, 16, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,14,15,16,21,22,43,50,74,83,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-29, -25, 55, 73, -4, 87, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-25,-4,16,55,73,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 33, 16, 51, 34, 15, 80, -79, -3, 93, 42, 91, 13, 72, 87, 27, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-3,13,15,16,27,33,34,42,49,51,72,80,87,91,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 18, 98, 6, 3, -93, 75, -81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-93,-81,3,6,18,75,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 79, 79, -93, 29, 96, 15, 79, 57, 79, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,15,29,57,61,76,79,79,79,79,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-31, 22, -71, 71, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-31,22,70,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-13, -82, 55, 17, -81, 91, 98, 58, 1, 26, 64, 72, 92, 68, 42, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-81,-13,1,16,17,26,42,55,58,64,68,72,91,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 95, 94, 41, 19, 33, 28, -75, 66, -11, 24, 91, -25, -38, 70, 61, 62, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-38,-25,-11,19,24,28,29,33,41,57,61,62,66,70,91,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-98, 36, 92, 12, 86, 31, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,12,31,36,86,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 44, -27, 74, 35, 94, 97, 25, 20, 17, 86, 82, -24, 96, 29, -45, 57, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-27,-24,17,20,25,29,35,35,44,57,74,82,86,94,96,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, -70, 16, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,16,61,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, -61, 38, 60, 10, 3, 36, 3, 90, 51, 3, -58, 92, 32, 37, 51, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-58,3,3,3,10,32,36,37,38,51,51,60,64,84,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 89, 18, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,72,86,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 51, 56, 79, -8, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,33,51,56,72,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 17, 28, 79, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,17,28,39,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, 91, -9, 76, 14, 80, 25, 42, 25, -23, 68, 30, -82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-69,-23,-9,14,25,25,30,42,68,76,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-8, 84, 58, 43, 45, 78, 63, 99, 5, 24, 72, -55, 86, 14, -32, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-32,-8,5,14,22,24,43,45,58,63,72,78,84,86,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-81, 81, 52, -97, 31, -13, 60, 58, -63, 69, 13, 25, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-81,-78,-63,-13,13,25,31,52,58,60,69,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(95, 24, 52, 12, 21, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,21,24,52,61,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 46, 67, 88, 35, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,35,46,67,81,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-84, 40, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,40,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, -7, -23, 56, 42, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,-7,26,42,56,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, 8, 44, 88, 3, 85, 87, 67, -17, 54, 27, 63, 13, -34, 32, 6, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-17,3,6,8,13,25,27,32,44,54,56,63,67,85,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-91, 3, 41, 78, 31, -38, 82, 39, -15, 97, 71, 42, 73, 79, 85, 39, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-38,-15,3,4,31,39,39,41,42,71,73,78,79,82,85,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 61, 92, 4, 28, 51, 65, 65, 31, 67, 4, 21, 21, -15, -45, 48, -70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-45,-15,4,4,21,21,28,31,48,50,51,61,65,65,67,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, 81, 73, -84, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,12,73,81,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, -55, 69, 15, 85, 70, 82, 60, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-55,15,39,60,69,70,82,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, 41, 6, 87, 1, 97, 26, 81, 22, 90, 37, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,6,14,22,26,37,41,74,81,87,90,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97, 81, 26, 67, 64, 74, 45, 74, 36, 95, -23, 11, 70, -41, -39, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-39,-23,11,26,36,45,59,64,67,70,74,74,81,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, 42, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,42,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, -79, 85, 90, 22, 51, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,9,22,34,51,85,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(95, 84, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,84,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 86, 37, 13, -85, -86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-85,13,37,76,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 89, 30, 35, 99, 56, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,35,56,68,89,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, 43, 84, 26, 14, 2, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,2,14,26,43,71,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, -20, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,5,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, 69, 63, 52, 42, 92, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,52,63,69,75,75,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, -11, 55, 40, 28, 61, 19, 36, 71, 31, 12, -30, 70, -65, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-30,-11,7,12,19,28,31,36,40,55,61,70,71,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 24, 35, -48, -98, 75, 94, 51, -20, 3, 77, 5, 60, 64, 37, 55, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-48,-20,3,5,24,35,37,50,51,55,60,63,64,75,77,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 70, 36, 14, 43, 74, 40, -89, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,14,22,27,36,40,43,70,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-23, 29, -86, -77, 94, 2, 46, -93, 32, -57, 86, 1, 89, 35, 33, -1, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-86,-77,-57,-23,-1,1,2,27,29,32,33,35,46,86,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 2, 13, 97, 63, 70, -72, 34, 85, 50, 66, 22, -31, 79, 8, 52, -35, 90, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-35,-31,2,8,13,22,34,50,52,57,63,66,70,79,81,85,90,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-3, 99, 36, 10, 76, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,5,10,36,76,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, -75, 79, 74, -95, 69, 9, 35, -91, 77, 91, 88, 23, 80, 43, 66, -75, -43, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-91,-75,-75,-43,9,23,35,43,48,66,69,74,74,77,79,80,88,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, -5, -26, 64, 45, -25, 36, 86, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-26,-25,-5,18,36,45,64,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, 98, 33, 85, -52, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,6,33,71,85,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-10, 54, -67, 72, 53, 83, 6, -74, 72, 95, 2, -47, 9, 66, 33, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-67,-47,-10,0,2,6,9,33,53,54,66,72,72,83,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93, 67, -78, 98, -93, 64, -31, 91, -87, -50, 49, -21, -92, 59, 23, 33, 81, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-92,-87,-78,-50,-31,-21,23,31,33,49,59,64,67,81,91,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-26, -96, 2, 69, 9, 83, -25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-26,-25,2,9,69,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 26, -28, 23, 12, 72, 0, 44, 24, 44, 52, 49, 10, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,0,10,12,17,23,23,24,26,44,44,49,52,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, -1, 49, -59, 3, 10, -99, 95, 74, 50, 22, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-59,-1,3,9,10,21,22,49,50,74,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 42, 31, 30, 45, 2, -30, 71, 22, 87, 94, 88, 19, 57, 50, -91, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-30,2,19,22,30,31,42,45,50,57,71,76,81,87,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 87, 37, 53, 27, 66, 58, -23, 78, -14, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,-14,27,37,50,53,58,59,66,78,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, -38, 11, 92, 19, 22, -38, 70, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-38,11,19,22,70,75,79,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 35, 66, 31, 37, 72, -32, 71, 84, 18, 55, -71, 75, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-32,7,18,31,33,35,37,55,66,71,72,75,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-40, 46, -57, 90, 1, 6, 18, 7, 53, 29, 14, 11, 49, -54, -12, 56, -83, 80, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-57,-54,-40,-12,1,6,7,11,14,18,29,46,49,49,53,56,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, -36, 35, 59, -77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-36,35,59,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 76, 44, 54, 10, 9, 80, 51, 54, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,9,10,44,44,51,54,54,76,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-28, 78, 78, 20, 96, 9, 23, 62, 83, 46, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,9,20,23,46,62,67,78,78,83,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-89, 25, 68, 7, 30, 51, 70, 0, 79, 25, 53, 54, 9, 59, 72, 96, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,0,7,9,25,25,30,51,53,54,59,68,70,72,79,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 0, 27, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,0,27,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 37, -22, 43, -78, 6, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-22,6,15,37,43,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-79, 95, 92, 77, 92, 30, 32, 0, 66, 37, 18, 54, 3, -39, -25, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-39,-25,0,3,18,30,32,37,49,54,66,77,92,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-61, 53, 72, 12, 56, 7, -68, 11, 51, 1, 54, 30, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-61,1,7,11,12,30,36,51,53,54,56,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, -49, 42, -21, 49, 68, 40, 29, -70, 79, 93, 91, 61, 38, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-58,-49,-21,12,29,38,40,42,49,61,68,79,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-28, 68, 36, 55, 40, 19, 34, 57, 66, 57, 37, 23, -72, -39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-39,-28,19,23,34,36,37,40,55,57,57,66,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-71, 38, 66, -48, 33, 36, 39, 45, 75, -43, 55, 62, 52, -5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-48,-43,-5,33,36,38,39,45,52,55,62,66,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 80, -98, 43, -26, 69, 9, 47, 86, 10, 16, 82, -59, 97, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-59,-26,4,9,10,16,43,47,69,80,82,86,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-83, 5, 23, 43, 36, 89, -45, 14, 84, 20, 6, 59, -35, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-45,-35,5,6,14,20,23,36,43,59,84,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 39, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,39,55,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, 51, 61, 98, 32, 53, 54, 68, 27, 46, 43, 0, 62, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,27,32,43,46,51,53,54,54,61,62,68,74,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 16, 42, -99, -22, 92, -67, -67, 87, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-67,-67,-22,16,37,42,42,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 57, 69, 17, 49, 8, 28, 25, 28, 36, 56, 15, 37, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,15,17,25,28,28,30,36,37,49,54,56,57,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 68, 57, 62, 7, 98, -94, 42, 21, 22, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,7,21,22,38,42,57,62,68,73,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 99, 44, 56, 72, 87, 71, 11, -51, 58, 68, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,11,20,35,44,56,58,68,71,72,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 19, 57, 42, 4, 10, 15, -45, 93, -65, -55, 29, 61, 43, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-55,-45,4,10,15,19,28,29,42,43,50,57,61,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 77, 84, 18, 4, 7, 8, -45, 18, 22, 60, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,0,4,7,8,18,18,22,60,77,84,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 48, 24, 84, -1, -12, 65, 63, 7, 57, 23, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,-1,7,13,23,24,31,48,57,63,65,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-67, 98, -59, 67, -44, 92, 2, 54, -11, 3, 86, -33, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-59,-44,-33,-11,2,3,54,64,67,86,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 33, 80, -81, 41, 53, 93, 38, 97, 24, 29, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,24,29,33,38,41,50,53,80,93,97,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 43, 17, -25, -44, 79, 63, 19, 13, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,-25,13,14,17,19,43,57,63,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 96, -73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,7,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-93, 9, -84, 70, -58, 64, 79, -67, -90, -59, 86, 79, 69, 56, 75, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-90,-84,-67,-59,-58,9,27,56,64,69,70,75,79,79,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, -81, 66, 62, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,62,66,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, -10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-92, 78, 97, 21, 69, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,21,69,78,86,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-2, 7, 51, 5, 88, -15, -1, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,-2,-1,5,7,51,51,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 77, 47, 99, 96, 7, 96, 60, 81, 11, 94, 6, 71, 37, 97, -7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,6,7,11,34,37,47,60,71,77,81,94,96,96,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, -32, 66, 42, 12, 58, 73, 69, 47, 97, 57, 29, 14, 95, 30, 30, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,2,12,14,29,30,30,42,46,47,57,58,66,69,73,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 58, 64, 38, -84, 21, 1, 10, 30, 76, 88, 2, 44, 32, 34, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,1,2,8,10,21,30,32,34,38,44,58,64,76,84,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 73, 81, 8, -29, -27, 23, 22, 50, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-27,8,22,23,50,73,81,86,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-93, 10, 89, 71, 61, 99, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,10,12,61,71,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, -85, -88, 71, 71, -23, 81, 56, 89, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-85,-23,56,61,71,71,78,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 82, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,69,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-55, 93, 84, 27, 80, 20, 80, 50, 34, 4, 23, -75, 28, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-55,4,20,23,27,28,34,49,50,80,80,84,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 85, 89, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,31,85,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 35, 98, 43, 13, 86, 25, 20, 15, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,15,20,25,35,36,43,69,86,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-90, 56, 72, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,56,72,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, 4, 22, 66, 59, 43, 18, 30, 62, 60, 46, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,18,22,30,43,46,59,60,62,66,75,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 45, 79, 34, 73, 85, 7, 89, 48, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,30,34,45,48,49,73,79,85,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 65, 60, 96, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,60,65,70,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 10, 86, 58, 50, 38, 0, 35, 97, 39, 1, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,2,8,10,35,38,39,50,58,86,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, -77, 17, -14, -79, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-77,-14,17,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, 63, -6, 30, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,30,60,63,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 8, -3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,8,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, 6, -72, 19, 42, 3, 52, 94, 83, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-60,3,6,19,25,42,52,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 63, -6, 18, 15, 4, -75, 3, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-6,0,3,4,15,18,44,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 33, 60, 11, 78, 43, 46, -12, 59, 42, 62, -54, 89, 39, 48, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-12,9,11,31,33,39,42,43,46,48,59,60,62,78,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 41, -73, 69, 98, 19, 87, -72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-72,15,19,41,69,87,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 74, 73, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,73,74,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 48, 11, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,11,40,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-1, 86, 81, 11, 88, -36, 67, 42, -13, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-13,-1,11,42,59,67,81,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 93, 28, 4, 77, 68, -46, 0, 80, 61, 56, -99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-46,0,4,21,28,56,61,68,77,80,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 82, 33, 71, 41, 87, 81, -36, 65, -94, 40, 48, 48, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-36,33,40,41,48,48,65,71,77,81,82,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 65, 11, -28, 11, 84, 39, 5, -90, -89, -99, 33, -83, 75, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-90,-89,-83,-28,5,11,11,21,33,39,65,66,75,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-24, 4, 70, 57, -28, 95, 0, 73, -21, 60, 57, 1, 98, -15, 75, 0, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,-24,-21,-15,0,0,1,4,57,57,60,70,71,73,75,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 40, -99, 80, 77, 27, 41, -5, -95, 86, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-95,-5,7,27,40,41,77,80,86,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 97, 96, -12, 4, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,4,9,30,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(77, 30, -78, 78, 96, 83, 91, 34, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,30,34,58,77,78,83,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 44, 48, 95, 40, -42, 53, -27, 56, 85, 67, 5, 84, 60, -5, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-27,-5,5,40,44,48,53,54,56,60,67,84,85,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, 46, 1, 53, -97, 91, 43, 75, 84, 5, -65, 93, 76, 0, -25, 15, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-65,-25,0,1,5,15,43,46,53,58,75,76,78,84,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 43, 72, 84, 58, -9, 9, -23, 33, 45, 72, 51, 73, 81, 40, -77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-23,-9,9,33,40,43,45,51,58,72,72,72,73,81,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, 33, 46, 34, 74, 31, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,33,34,46,74,80,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88, 92, -90, 84, 65, 29, 43, 82, -25, -97, 97, -44, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-90,-44,-25,2,29,43,65,82,84,88,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 60, 98, -1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,60,72,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, -7, 87, 93, 79, 95, 79, 41, 13, 19, 71, 78, 99, 9, 62, 0, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,0,3,9,13,19,41,43,62,71,78,79,79,87,93,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-95, 30, -72, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-72,30,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-65, 44, 40, 95, 61, 21, 5, 99, 16, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,5,16,21,40,44,48,61,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 53, 60, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,24,53,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 8, -26, 89, 72, -55, -40, 29, 29, 21, 87, 16, -84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-55,-40,-26,8,16,21,29,29,72,81,87,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, -86, -76, 99, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-76,2,25,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 75, -95, -13, 28, -13, 67, 22, 25, 80, -17, -38, -66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-66,-38,-17,-13,-13,14,22,25,28,67,75,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 90, 69, 76, 16, 61, 26, 82, 83, 29, 92, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,14,16,26,29,61,69,76,82,83,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 3, 54, 27, 94, 80, 72, 18, 97, 46, 42, -19, -41, 4, 72, 49, -62, -50, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-50,-41,-19,3,4,18,27,42,46,49,54,72,72,72,80,94,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 33, 47, 49, 76, 5, -94, 14, 7, 23, 53, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,5,7,14,18,23,33,33,47,49,53,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 99, 88, 42, 9, 65, 95, 80, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,9,42,44,65,80,88,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 29, 68, 39, 3, 23, 74, -66, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-64,3,23,29,39,68,69,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 25, -82, 74, -65, 74, 31, 16, 72, 19, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-65,3,16,19,25,31,44,72,74,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 20, -79, 93, 90, 9, 60, 70, -39, 65, 31, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-39,7,9,20,31,54,60,65,70,90,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 27, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,70,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 40, 99, 69, 21, 49, 16, 29, -84, 88, 65, 93, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,15,16,18,21,29,40,49,65,69,88,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, -32, 37, 64, -65, -67, 62, 67, 91, -10, -31, -29, -86, 45, 44, -15, 27, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-67,-65,-32,-31,-29,-15,-10,9,27,37,44,45,62,64,67,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-43, 13, 94, 87, 51, 31, 9, 75, 93, -65, 14, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-43,-27,9,13,14,31,51,75,87,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, 27, -65, 75, 9, -92, -34, 69, 47, 89, 97, 15, 35, 38, 16, 10, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-65,-34,1,2,9,10,15,16,27,35,38,47,69,75,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 76, 95, 91, 1, 24, 64, -66, 66, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,1,7,24,40,64,66,76,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-41, 9, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,9,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 31, 62, 32, 71, -22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,31,32,59,62,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(95, 80, -81, -25, -20, -78, -87, 44, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-81,-78,-25,-20,10,44,80,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 67, 56, -71, 1, 51, 26, 61, 99, 5, 19, 79, 85, 11, 28, 8, 28, 48, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,1,5,8,11,19,26,28,28,48,48,51,56,61,67,79,85,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 72, 10, 76, 61, 88, -29, 31, -79, 56, 17, 12, 29, 53, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-29,10,12,17,29,31,48,53,56,61,72,76,76,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-22, 44, 5, 88, 65, 44, -79, 34, 63, -30, 48, 29, 7, 24, 28, 51, 37, 70, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-30,-22,5,6,7,24,28,29,34,37,44,44,48,51,63,65,70,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 6, 47, 71, -9, 14, 22, 26, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,6,7,14,22,26,42,47,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, -66, 21, 45, -2, 17, -21, 7, 86, 65, 39, -96, -4, 49, 41, 4, -92, 76, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-92,-66,-21,-4,-2,4,7,17,20,21,24,39,41,45,49,65,76,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, -52, 91, 72, 95, 30, -97, 72, -87, 46, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-97,-87,-52,30,46,59,72,72,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-68, 27, 7, 77, 21, 83, 7, -27, 73, 90, 73, 25, 75, 26, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-27,7,7,8,21,25,26,27,73,73,75,77,83,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, -33, 11, -1, 17, 56, 66, 24, 72, 54, -27, 46, 86, 86, -41, 82, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-33,-27,-1,11,17,24,26,46,54,56,66,72,76,82,86,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 78, 27, 59, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,34,59,78,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 9, 33, -14, 45, 42, 69, -27, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,-14,9,14,33,42,45,54,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-45, 61, 94, 25, -86, 24, 24, 53, 95, 50, 26, 48, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-45,2,24,24,25,26,48,50,53,61,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, -89, -37, -38, -87, 60, 58, -48, 11, 60, 66, 75, 90, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-87,-48,-38,-37,11,11,28,58,60,60,66,75,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 5, 70, 40, 26, -6, 76, 76, 13, 71, 71, 0, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,0,4,5,13,22,26,40,70,71,71,76,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 33, 68, 28, 85, 12, 92, 4, 80, -71, -71, 33, 39, 55, 79, 49, 19, -36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-71,-36,4,12,19,28,33,33,39,49,55,68,79,80,85,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-77, 91, 82, -36, 63, 54, 66, -12, 22, 69, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-36,-12,10,22,54,63,66,69,82,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, -93, -91, -56, 59, -83, 24, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-91,-83,-56,18,24,55,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 85, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,85,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 95, -27, 56, 96, 42, 64, 21, 74, 79, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,21,42,44,56,58,64,74,79,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, 34, 75, 7, -6, -16, 71, -41, 44, 49, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-16,-6,2,7,34,44,49,71,75,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, -16, -19, 36, 82, 60, 0, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-29,-19,-16,0,36,60,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, -39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 64, -50, 31, -41, 19, 57, 71, -51, 20, -65, -78, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-65,-51,-50,-41,6,19,20,31,57,64,71,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 51, 87, 69, 57, 54, -36, 42, 75, 77, -46, -69, -23, 91, 42, 94, 79, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-46,-36,-23,42,42,44,44,51,54,57,69,75,77,79,87,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 5, 17, 64, 82, 93, -29, 24, -53, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-29,3,5,17,24,64,68,82,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 53, 62, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,53,62,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 95, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,57,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 8, 17, 25, 73, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,8,17,25,31,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 52, 80, 3, 15, 11, 96, 25, 90, 25, 37, 67, 66, 4, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,4,11,15,25,25,37,44,52,62,66,67,80,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, -4, 45, 75, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,45,64,74,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-41, 98, 59, 48, -75, 32, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-41,18,32,48,59,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 60, 43, -49, 14, 56, 5, 94, 8, 39, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,5,8,14,39,43,56,60,80,85,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, -71, 42, 18, 51, -12, 28, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-12,18,28,42,51,58,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 49, 52, -35, 99, -1, 64, 18, 3, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-1,0,3,18,49,52,64,75,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 15, 33, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,15,33,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-64, 15, 65, 77, -27, -85, 78, 96, -56, 76, -63, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-64,-63,-56,-27,15,30,65,76,77,78,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 52, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,20,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-48, -62, 22, 54, 77, 65, -4, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-48,-4,22,54,54,65,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, 11, 46, -21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,11,46,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, -84, 22, 85, 77, 87, -46, 54, 60, -44, 23, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-46,-44,8,22,23,42,54,60,77,85,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 20, 20, 84, 63, 2, 37, 87, -24, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-24,2,20,20,36,37,43,63,84,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 23, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,42,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-52, -20, 82, 94, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-20,58,82,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 30, 26, 64, 73, -14, 94, 89, -61, -99, 44, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-61,-14,7,26,30,44,54,64,73,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 76, -9, 2, -61, 59, -10, -15, -55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-55,-15,-10,-9,0,2,59,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 55, -7, 63, 67, 18, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,18,55,57,61,63,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 13, 78, 6, -21, 19, 54, 81, 15, 69, 9, -39, 22, 25, 94, 72, -78, 25, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-39,-21,5,6,9,13,15,19,22,25,25,54,69,70,72,78,81,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, 72, -80, 64, 56, 3, 15, -28, -35, 70, -9, -62, 14, -84, 74, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-80,-62,-35,-28,-9,3,14,15,51,56,64,70,72,74,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, -67, -2, 82, -4, 57, 99, 67, 54, 37, 52, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-4,-2,30,37,39,52,54,57,67,82,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 47, -57, 82, 26, -53, 13, 43, -1, 4, -90, 9, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-57,-53,-1,4,9,13,26,41,43,47,79,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88, 61, 20, 66, -50, -49, -26, 40, -40, 3, 79, 91, 4, 19, 89, 46, 30, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-49,-40,-26,3,4,19,20,30,40,46,52,61,66,79,88,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-58, -67, 1, 58, 73, 36, 58, 91, 13, 87, -45, -30, 65, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-67,-58,-45,-30,1,13,36,58,58,65,73,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 70, 80, 61, -48, 85, 22, 25, -63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-48,22,25,53,61,70,80,85,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 21, 53, -89, 36, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,21,36,53,65,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, 15, 67, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,56,67,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 96, 80, 68, -7, -88, 47, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-7,24,26,47,68,80,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, 84, 95, 58, -31, -56, -64, 99, 10, 77, -37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-56,-37,-31,10,58,58,77,84,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-40, 68, -39, 73, 3, 71, 94, -48, 61, -92, 92, 22, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-48,-40,-39,3,17,22,61,68,71,73,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, -3, 99, 17, 40, 32, 52, 76, -91, 12, 73, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-3,12,17,32,40,52,73,76,83,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 60, -16, 30, 87, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,30,51,60,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-80, 88, 79, 42, -54, 69, 18, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-54,18,42,69,76,79,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, -44, 78, 47, 24, 0, 7, -33, -85, 40, 26, 96, 4, -16, 58, 46, 20, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-44,-33,-16,0,4,6,7,20,24,26,40,46,47,58,72,78,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 97, 83, 20, -37, 77, 32, 37, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,20,32,37,59,65,77,83,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 21, 83, 4, 30, 56, 91, 97, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,21,30,39,56,66,83,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 44, -66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,26,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 25, 97, -58, -36, 88, 9, 76, -89, -70, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-74,-70,-58,-36,9,25,50,76,88,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-41, 92, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,27,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 39, -20, 64, 87, 11, 36, 48, 59, 67, 22, 8, 91, 21, 39, 98, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,8,11,21,21,22,36,39,39,48,59,64,67,80,87,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 58, 46, 31, 60, 7, 25, 23, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,8,23,25,31,46,58,60,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, -41, 80, 43, -83, 7, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-41,6,7,43,44,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 50, 83, 11, -12, -78, 64, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-19,-12,11,50,62,64,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-70, -16, 15, -53, 34, -1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-53,-16,-1,15,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 6, -49, 94, -48, -18, -71, 1, 58, 25, 52, 31, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-49,-48,-18,1,6,20,25,31,40,52,58,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, 66, 50, -19, 77, 62, -84, 34, 63, 48, 22, 42, 65, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-19,10,22,34,42,47,48,50,62,63,65,66,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 50, 94, 20, -94, 35, 41, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,20,35,41,47,50,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-46, 75, 48, 6, 41, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,6,41,48,75,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 22, -63, 86, -9, 44, 93, 66, -95, -78, 94, 43, 81, 41, 62, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-78,-63,-9,22,41,43,44,46,62,66,66,81,86,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 16, 31, 51, 90, 95, 8, -14, 68, 57, -20, 77, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-14,8,16,31,51,57,67,68,74,77,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-87, 26, 94, 50, 69, -40, 79, -16, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-78,-40,-16,26,50,69,79,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 90, 94, 93, -43, 4, 75, 30, -20, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-20,4,25,30,30,75,90,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 95, 60, 70, -21, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,7,46,60,70,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, -92, 98, 56, 47, -58, 58, 39, 23, 26, 16, -29, 88, 92, 94, 38, -75, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-75,-58,-29,16,23,26,38,39,47,48,56,58,88,88,92,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 72, 64, -34, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,64,72,72,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, -55, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,30,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-45, 7, 42, 28, 74, 64, 4, 90, -63, 24, 5, 9, 84, 94, 3, 95, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-45,3,4,5,7,9,24,28,42,64,69,74,84,90,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 27, 1, -35, 90, 46, -12, 80, 31, 2, 50, -16, -22, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-22,-16,-12,1,2,7,27,31,46,50,80,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 80, 17, 30, 49, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,30,49,59,80,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-55, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 39, 36, 69, 62, 5, 67, -70, 46, 61, 62, 78, 4, 0, 65, 12, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,0,4,5,12,20,36,36,39,46,61,62,62,65,67,69,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 51, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,45,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 57, 72, -75, -62, 12, 77, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-62,12,51,57,72,77,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, -25, 40, 87, 19, -86, 78, 0, 63, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-25,0,15,19,32,40,63,78,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, -43, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,41,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 96, -3, 76, 48, -2, -84, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-3,-2,48,65,76,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-29, 94, 55, 95, -46, -15, 15, 45, -13, 89, 39, 4, 61, 95, 44, 73, 76, -40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,-40,-29,-15,-13,4,15,39,44,45,55,61,73,76,89,94,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 13, -38, 50, 12, -6, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-6,12,13,15,50,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 92, -32, 0, 0, -62, 98, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-62,-32,0,0,85,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-18, 38, 94, 92, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,38,70,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 83, -78, 20, 39, 51, 6, 48, 83, 65, 91, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,6,20,23,39,48,51,60,65,83,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 12, 29, -64, 76, -13, -2, 10, -74, -68, -79, 74, -71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-74,-71,-68,-64,-13,-2,10,12,27,29,74,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, -59, 90, -80, 57, 34, 34, 77, 6, 4, -68, 29, 9, 11, 29, 40, -37, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-68,-59,-37,4,6,9,11,29,29,29,32,34,34,40,57,77,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93, 42, 12, -50, 96, 37, 73, 9, 50, 34, 96, 1, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,1,9,12,34,37,42,50,64,73,93,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-84, 71, 40, -48, 52, 96, 13, 0, 47, 5, 89, 34, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-48,0,5,13,34,40,47,52,71,81,89,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-42, -65, 9, -60, 85, -23, -37, 65, 76, 58, 42, 76, 71, 52, -97, 31, -62, 57, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-65,-62,-60,-42,-37,-23,9,31,42,52,57,58,63,65,71,76,76,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 39, -20, 42, -52, -96, 85, 62, -53, 10, 46, 78, 0, 33, 22, 20, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-53,-52,-20,0,10,20,22,33,39,42,46,62,78,85,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 81, 66, 31, -25, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-25,31,66,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 51, -76, -20, 59, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-20,45,51,59,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-80, 24, 7, 10, -97, -2, 37, 52, 81, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-80,-2,7,10,24,37,52,70,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 82, 88, 69, 25, 50, -4, 72, 48, 30, 33, -98, 85, 81, 44, 89, 51, 15, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-4,15,25,30,33,44,48,50,51,62,62,69,72,81,82,85,88,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 86, 21, 58, 43, 87, 71, 96, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,16,21,43,58,71,86,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-9, 8, -49, -21, -77, 85, 35, 64, -30, 78, 51, 39, 27, 41, -50, 8, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-50,-49,-30,-21,-9,8,8,27,35,39,41,51,64,78,85,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-57, -92, 13, 99, 68, -18, 32, 97, 69, 41, 61, 6, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-57,-18,5,6,13,32,41,61,68,69,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 15, -43, 58, 2, 79, 55, 14, 98, 66, -26, 90, 83, 10, 29, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-26,2,10,10,14,15,29,53,55,58,66,79,83,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, 31, 40, 70, -19, 84, 64, 20, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,19,20,31,40,64,70,74,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 11, -93, 54, 59, 65, 34, 53, -20, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-20,5,11,34,37,53,54,59,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-54, 6, 47, 62, 49, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,6,46,47,49,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 64, 45, -18, 4, 23, 51, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,4,23,29,45,51,64,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 61, -62, -39, 35, -38, 18, 72, 32, 25, 31, 79, -3, 52, 8, -32, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-39,-38,-32,-3,8,18,25,31,32,35,52,61,62,67,72,79,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 26, 49, 87, 25, 38, 42, 86, 26, -19, -56, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-19,25,26,26,38,42,49,69,86,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 15, -25, 23, 42, 70, 33, 64, 67, 42, 6, -34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-25,6,15,20,23,33,42,42,64,67,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-34, 46, -69, -95, 56, 59, 54, 51, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-69,-34,46,51,54,56,59,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 92, 31, 21, 9, -39, -86, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-39,9,21,31,73,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 41, 27, 56, 21, 10, 5, 88, -24, 90, 72, 87, 94, 50, 63, 39, -40, 41, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-24,5,10,14,19,21,27,39,41,41,50,56,63,72,87,88,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 7, 21, 0, 35, 86, 51, 12, 94, 43, 56, 11, 55, -86, 11, 92, 60, 24, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-86,0,7,11,11,12,21,24,35,43,51,55,56,60,84,86,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 22, -84, 53, 85, 3, 63, 30, 8, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-84,3,8,22,30,53,63,70,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 94, 98, 92, 76, 20, 6, 59, 34, 57, 33, 0, -79, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,0,6,20,27,33,34,35,57,59,76,92,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, 50, 25, 10, 15, -39, 12, 87, 1, -13, 2, 50, 27, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-13,1,2,10,12,15,25,27,38,50,50,71,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 56, 39, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,56,69,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 98, -90, -30, 96, 99, 8, -8, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-30,-8,8,11,65,96,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-30, 45, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,27,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 55, 24, -95, 66, 91, -75, 15, 68, 74, 85, 99, -83, 48, 46, -60, -86, 10, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-86,-83,-75,-60,7,10,15,24,46,48,55,66,66,68,74,85,91,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 31, 34, 18, 77, -26, 63, -70, 15, 71, 45, -86, 24, -47, 73, -88, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-86,-70,-47,-26,15,18,24,30,31,34,45,63,71,72,73,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 65, 30, 33, 61, 23, -63, 34, 98, 31, 63, 16, -47, 77, 72, 57, 44, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-47,16,23,30,31,33,34,44,57,61,63,65,72,75,77,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 94, -79, 43, 93, -37, -60, -97, -40, -16, -46, 21, 52, 38, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-79,-60,-46,-40,-37,-16,14,21,38,43,52,76,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, 38, 55, 8, 87, 57, -13, 17, 9, 67, 19, 50, 29, -80, 90, 23, -50, 67, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-50,-13,8,9,17,19,23,25,29,38,50,51,55,57,67,67,87,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-3, 55, 91, 30, 96, 87, 97, 77, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,16,30,55,77,87,91,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 65, -6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,44,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-10, 23, -68, -93, -28, 0, 16, -46, 44, -62, 82, -65, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-68,-65,-62,-46,-28,-10,0,16,23,32,44,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, -29, -33, 74, 90, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-33,-29,6,74,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, -90, 29, 78, 81, 51, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,29,30,45,51,78,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, -44, 4, 44, -52, 79, 9, 32, 90, 46, -54, -91, 74, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-54,-52,-44,1,4,9,32,43,44,46,74,79,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93, 14, -27, 51, 72, 81, 46, -64, 71, -20, -45, 88, 20, -4, 83, 10, 64, -27, -81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-64,-45,-27,-27,-20,-4,10,14,20,46,51,64,71,72,81,83,88,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 4, -25, 69, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,4,23,45,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 64, 59, 15, 4, 36, -58, 32, 28, 52, 35, 83, -56, 40, 14, -91, 29, 67, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-58,-56,4,14,15,18,28,29,32,35,36,40,45,52,59,64,67,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 32, 30, -88, 12, 41, 74, 82, 45, 25, -91, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-88,0,12,25,30,32,41,45,45,74,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 78, -69, 64, 31, 79, 66, 86, 67, 66, 14, -89, 9, 95, -23, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-69,-23,9,14,31,64,66,66,67,69,78,79,86,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-74, 57, 8, 98, 97, 20, 23, -78, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-74,8,20,23,50,57,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 1, 97, 81, 98, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,4,72,81,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-67, 79, 4, 3, 50, 49, 44, 85, 37, 70, -40, 64, 85, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-40,3,4,37,39,44,49,50,64,70,79,85,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, -49, -77, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-49,0,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, 16, 58, 80, 73, 58, 66, 91, 23, -41, 83, -49, -29, 79, 26, 33, 55, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-49,-41,-29,16,23,26,33,55,58,58,66,73,73,79,80,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, -57, -86, 91, -43, 75, 11, -55, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-57,-55,-43,11,20,64,75,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 0, -57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,0,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97, 1, 60, 66, 15, -63, 71, 49, 98, 11, 69, 74, 42, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,1,11,15,42,49,53,60,66,69,71,74,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, -26, -65, -76, 39, 93, 46, 99, 74, -66, 2, 15, 1, 71, 50, -97, 51, -49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-76,-66,-65,-49,-26,1,2,15,39,41,46,50,51,71,74,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 56, 29, 9, 19, 64, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,19,29,56,64,72,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 52, 86, 46, 38, 18, 95, 73, 49, 42, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,18,21,38,42,46,49,52,73,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 25, 91, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,25,50,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 1, 92, 63, 16, 50, 88, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,16,50,54,63,86,88,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-79, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 1, -58, 14, 86, 68, 85, 14, 28, 76, 47, -69, -52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-58,-52,1,14,14,28,47,68,70,76,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, -26, 56, 30, 82, 58, -97, 88, 22, 34, -65, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-65,-48,-26,22,30,34,41,56,58,82,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 50, 0, 28, 61, 37, 35, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,0,28,35,37,50,61,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, 1, -5, -3, 96, 60, 44, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,-3,1,13,44,60,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 45, 66, 9, 14, -37, -27, 82, 48, 61, 73, 62, -71, 9, 45, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-37,-27,9,9,14,39,45,45,48,61,62,66,73,81,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-10, 59, 50, 94, 4, -15, 20, 63, -11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,-11,-10,4,20,50,59,63,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 47, 66, 84, 11, 75, 37, 69, 65, 27, 9, 56, 72, 95, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,9,11,27,37,47,56,64,65,66,69,72,75,84,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 71, 59, 33, 47, -68, -18, 31, 88, 12, 25, 16, -41, 29, 42, 12, 7, 65, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-41,-18,7,12,12,16,25,28,29,31,33,38,42,47,59,65,71,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, 16, 34, 80, 54, 20, 61, 34, 99, 0, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,16,20,21,34,34,54,61,80,83,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 93, 47, 16, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,16,20,47,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-42, 85, -3, 98, 94, 64, 93, 72, 9, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-3,9,64,72,85,93,93,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, -97, 35, 99, 76, -23, -65, 23, 19, 72, 33, 48, 60, 38, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-65,-23,19,23,32,33,35,38,48,60,69,72,76,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 1, 88, 65, 40, 21, -92, 8, 15, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,1,8,15,21,21,40,49,65,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 74, 56, 64, 86, 84, 94, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,56,64,74,84,86,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 37, 68, 56, 47, 90, 98, -16, 98, 81, 80, -4, -59, 63, 4, 92, 54, -33, -37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-37,-33,-16,-4,4,37,47,54,56,59,63,68,80,81,90,92,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 63, 14, -39, 74, 9, 31, 20, -73, 12, -6, 38, 48, 64, -20, 6, 97, 27, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-39,-20,-6,6,9,12,14,20,27,31,33,38,48,63,64,74,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 91, -56, -60, 80, 76, -26, 44, 78, 46, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-56,-26,13,44,46,76,78,80,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 77, 96, 68, 51, 56, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,51,56,64,68,77,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 38, 23, 5, -67, 0, 12, 87, 70, -58, 23, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-58,0,5,12,23,23,27,38,70,74,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-37, 31, 33, 96, -42, 50, 18, 55, 17, 12, -37, 95, 31, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-37,-37,12,17,18,31,31,33,50,55,85,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 87, 14, 34, -19, 65, 94, 93, -4, 92, 23, -70, 72, 40, 20, 7, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-19,-4,7,14,20,22,23,28,34,40,65,72,87,92,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 76, 47, 12, 51, 17, 46, 18, 74, -17, 13, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,12,13,17,18,28,46,47,51,74,76,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 9, 86, 6, 64, 38, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,9,18,38,44,64,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, 19, 59, 86, 58, 6, 1, 63, -67, 4, 60, 32, 5, 7, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,1,2,4,5,6,7,19,32,58,58,59,60,63,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-27, 27, 76, 43, 85, 28, 72, 43, 75, 16, 45, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,16,27,28,43,43,45,72,75,76,85,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 29, 78, -49, 60, 50, -19, -1, -11, 84, 15, 27, -80, 79, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-49,-19,-11,-1,15,27,29,50,52,60,78,79,84,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 21, 46, 68, -53, 67, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,16,18,21,46,67,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 31, 60, -71, 51, 97, 13, 63, 4, 41, 18, 59, -7, -42, 21, 62, 18, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-42,-7,3,4,13,18,18,21,31,41,51,52,59,60,62,63,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 98, 16, 74, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,18,74,82,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(52, 6, 35, 11, -16, 67, -89, 33, 14, 43, 19, -30, 57, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-30,-16,6,11,14,19,32,33,35,43,52,57,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 42, -22, -51, 93, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-22,3,42,74,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 84, 3, -8, 20, 44, 89, 43, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,3,18,20,22,43,44,84,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-32, -33, 40, 35, 21, 16, 43, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-32,16,21,35,40,43,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-95, 95, 38, 79, 53, 94, 40, 97, -13, 36, 47, -16, 55, 56, 80, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-16,-13,36,38,40,47,53,55,56,79,80,83,94,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 98, 6, -26, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-26,5,6,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 82, 5, -73, 0, 13, 63, 5, 89, 65, -89, -29, 23, 49, 47, 83, 99, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-73,-29,0,5,5,5,13,23,23,47,49,63,65,82,83,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 77, -83, -89, -54, -94, 92, 39, 22, 92, -46, -2, 72, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-89,-83,-54,-46,-2,22,39,40,72,77,84,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 47, -48, -72, -68, 78, 16, -59, 45, 65, -4, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-68,-59,-48,-4,16,33,45,47,60,65,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 1, 42, 94, 74, 88, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,37,42,74,84,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, 57, 30, -98, -23, -7, 45, 32, 13, -90, 92, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-90,-23,-7,2,13,30,32,45,57,76,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 13, 84, 9, 63, 58, 55, 27, 19, 35, 81, -99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,9,13,19,27,35,37,55,58,63,81,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, 74, -69, 72, 98, -48, 45, -23, 9, 99, 23, 37, -27, -41, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-48,-41,-27,-23,9,23,37,45,63,72,74,90,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 7, -24, -65, 61, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-65,-24,7,39,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 71, 65, -3, 11, 73, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,11,26,28,65,71,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, 66, 70, 81, 76, -75, 30, 53, 49, -15, 27, -60, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-60,-15,9,27,30,49,53,56,66,70,76,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 73, 21, 9, 26, 91, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,21,26,43,62,73,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 24, 65, 75, 46, -51, 12, 17, 57, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,12,17,24,46,46,57,65,75,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-7, 82, 75, -98, 1, 94, -83, 36, -30, 44, -92, 70, -42, 90, -63, -50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-92,-83,-63,-50,-42,-30,-7,1,36,44,70,75,82,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-87, 32, 55, 93, -13, 25, 18, 50, 87, -67, 65, 84, 99, -7, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-67,-13,-7,18,25,32,50,55,65,84,87,93,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-26, -1, 59, 87, 54, -66, 49, 24, -22, 61, 64, 90, 52, -15, 31, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-26,-22,-15,-1,24,31,37,49,52,54,59,61,64,87,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, 11, 80, 18, -67, 98, 76, 76, 65, 88, 63, -30, 74, 86, 16, 24, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-30,3,6,11,16,18,24,63,65,74,76,76,80,86,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-76, 31, 39, -25, 11, -45, 25, 89, 2, 93, 65, 24, 90, 41, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-45,-25,2,11,24,25,31,39,41,45,65,89,90,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, 57, 98, 85, 28, 94, 7, 69, 65, 62, 44, -68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,7,28,44,57,62,64,65,69,85,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, -93, 79, -8, 28, 86, 44, 26, -16, 86, 54, -43, 77, 24, 0, 73, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-43,-16,-8,0,6,24,26,28,44,54,73,77,79,86,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 51, 42, 92, 22, 36, 84, -91, 31, 76, 80, 76, 17, 49, 44, 89, 46, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-74,17,22,31,32,33,36,42,44,46,49,51,76,76,80,84,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 56, 6, 23, 94, 98, 66, 65, 5, 45, 29, 66, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,6,9,23,29,45,56,65,66,66,68,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 6, -36, 44, 79, 77, -83, 2, -76, 22, 80, 39, 96, 35, -91, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-83,-76,-36,2,6,22,35,39,44,66,77,79,80,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 17, 89, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,19,64,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 45, -63, 19, 11, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,11,19,31,45,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 83, 65, 29, 22, 50, 72, 33, 23, 93, 48, 54, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,23,29,33,40,42,48,50,54,65,72,83,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-29, 0, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,0,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 75, 33, 32, 50, 65, 98, 80, 61, 13, 64, 65, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,21,30,32,33,50,61,64,65,65,75,80,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 51, 56, 41, -84, 2, 43, -99, -88, -65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-88,-84,-65,2,34,41,43,51,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, -83, 6, 73, 91, 3, 14, 80, 57, -97, 56, 51, 96, 81, 99, 68, 20, 22, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-83,3,6,14,20,22,51,56,57,58,68,73,74,80,81,91,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 19, -8, 44, 23, -73, 21, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-8,19,21,23,29,44,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, 91, 32, -17, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,32,73,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 13, 53, 29, 78, 40, -49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,13,29,33,40,53,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, -20, 42, 92, 54, -4, 52, -54, 6, -22, 12, -35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-35,-22,-20,-4,6,12,42,52,54,65,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, -48, 79, -89, 71, -22, 42, 50, 21, 47, 88, 3, 1, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-48,-22,1,3,21,42,47,50,54,61,71,79,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88, 59, 23, 52, 91, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,52,59,88,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 4, 36, 24, 22, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,22,24,34,36,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 64, 45, 81, 74, 4, 90, -22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,4,45,64,74,78,81,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 46, 74, 76, 17, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,46,54,54,74,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 2, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,45,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 76, 75, 99, 63, 11, -88, 24, -67, 56, 75, -33, 18, -10, 66, 79, 78, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-67,-33,-10,11,11,18,24,56,63,66,75,75,76,78,79,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, -54, 4, -64, 56, -29, 60, 50, 66, 20, 63, 38, -54, 19, 71, 37, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-54,-54,-29,4,19,20,31,37,38,45,50,56,60,63,66,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 32, 77, 73, -38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,32,67,73,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 15, -54, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,15,27,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 9, 58, 64, 51, 77, 79, 74, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,11,31,51,58,64,74,77,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, -70, 60, 53, 97, -49, 14, 28, 9, 5, 67, 92, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-49,5,9,11,14,28,53,60,67,92,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, -55, 81, 84, 19, -92, 60, 62, 98, -12, 33, 86, 33, 71, 27, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-55,-53,-12,19,27,33,33,60,60,62,71,81,84,86,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, 22, -87, 22, 24, -11, -47, -66, 93, 60, 83, 57, 41, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-66,-47,-11,5,12,22,22,24,41,57,60,83,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-4, 5, 76, 57, 76, 12, 2, 5, -71, 44, 10, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-4,2,5,5,10,12,44,57,75,76,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 38, 48, 86, 89, 67, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,26,38,48,67,86,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 99, -40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,66,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, 76, 67, 15, -70, 37, 77, 66, 56, 97, 22, -47, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-47,-29,15,22,37,56,66,67,73,76,77,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 74, 15, 88, -22, -74, 73, 86, 79, -75, 4, 39, -78, -23, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-75,-74,-23,-22,4,15,39,50,70,73,74,79,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, 9, 92, -93, 97, -34, 39, 8, 11, 77, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-34,8,9,11,39,58,77,92,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 82, 4, 49, 29, 76, 2, 6, 45, 65, -58, -86, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-58,2,4,6,29,45,49,61,65,72,76,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-21, 63, 81, 22, 99, 66, 60, 18, 33, -91, 77, 30, 27, -96, 48, 88, 3, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-91,-21,3,18,21,22,27,30,33,48,60,63,66,77,81,88,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-65, 53, 83, 13, 97, 82, -91, -59, 18, 57, 92, 0, 35, -17, 60, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-65,-59,-17,0,13,18,25,35,53,57,60,82,83,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-75, 97, -3, 10, 19, 83, 11, 13, 0, 10, 56, 26, 17, 41, 17, 5, 70, -54, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-54,-3,0,5,10,10,11,13,17,17,19,26,34,41,56,70,83,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 19, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,19,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, 81, -25, 13, 65, 76, 43, 11, 93, 44, -53, 28, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-25,11,13,28,41,43,44,65,76,81,86,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, 13, 21, 12, -1, 60, 21, 22, -73, 7, 55, 45, 60, 96, 23, 38, 47, -68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-68,-1,7,12,13,21,21,22,23,38,45,47,55,60,60,74,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 75, -51, 8, 56, 83, 91, 78, 48, 48, 64, 12, 76, 85, 18, 16, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,8,12,16,18,25,48,48,50,56,64,75,76,78,83,85,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-93, 86, 13, 83, 87, 26, -72, 11, 48, 7, 74, 77, -11, 94, 74, 85, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-72,-11,7,11,13,26,48,60,74,74,77,83,85,86,87,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-23, 86, 17, 88, -55, 23, 63, 70, 59, 65, -8, 85, 70, -64, 80, 50, 24, -81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-64,-55,-23,-8,17,23,24,50,59,63,65,70,70,80,85,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 55, -73, 86, -65, 20, 10, -82, 66, -83, 11, -95, 15, -24, 44, 93, -63, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-83,-82,-73,-65,-63,-24,10,11,15,20,44,55,60,66,79,86,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-96, 30, -43, 12, 0, 42, 97, 97, -40, 53, 26, -16, 67, 53, 5, 19, -41, 75, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-43,-41,-40,-16,0,5,12,19,26,30,42,50,53,53,67,75,97,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, -79, -53, 62, 93, 22, -26, 65, 15, 81, 85, -48, 92, 44, 2, 86, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-53,-48,-26,2,12,15,22,38,44,62,65,81,85,86,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 91, 96, 93, -74, 48, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,48,78,91,93,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, -55, 72, 9, 68, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-8,9,68,72,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 5, 41, 48, 88, 94, 8, 24, 28, 27, 85, 37, 90, 57, -49, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,0,5,8,9,24,27,28,37,41,48,57,85,88,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 40, 2, 77, 61, 0, 6, 54, 79, -44, 96, 70, 79, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,0,2,6,32,40,54,61,70,77,79,79,89,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, -41, 25, 28, 8, 33, 75, 46, 40, -2, -66, 71, 27, -91, 94, -12, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-66,-41,-12,-2,8,25,27,28,33,40,46,71,75,76,85,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 83, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,46,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 92, -8, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,28,59,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, 58, 49, 13, -87, 51, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,13,25,49,51,58,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-52, 74, -53, -54, 44, 32, 82, -49, 16, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-53,-52,-49,16,31,32,44,74,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-56, 31, 35, 58, 47, 41, 67, -92, 25, 5, 69, -71, 18, 22, 37, 51, 4, 22, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-71,-56,4,5,8,18,22,22,25,31,35,37,41,47,51,58,67,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 80, -81, 9, 68, 47, 4, 70, 6, 64, 9, -64, 91, 61, -13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-64,-13,4,6,9,9,36,47,61,64,68,70,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 49, 74, 94, 21, 85, 28, 52, 20, 50, 47, -55, 64, -61, 23, 75, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-55,20,21,23,28,47,49,50,52,59,61,64,74,75,85,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 31, 61, 26, -85, 80, 93, 58, -93, 37, 83, -33, 55, 41, -80, 42, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-85,-80,-33,0,23,26,31,37,41,42,55,58,61,80,83,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 12, 78, -79, 78, 41, 36, 89, -58, 58, -55, -99, 87, 44, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-79,-58,-55,12,13,36,41,44,50,58,78,78,87,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, 39, 32, 53, 8, 70, 38, 39, 60, -32, 97, 54, 5, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,1,5,8,25,32,38,39,39,53,54,60,70,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 42, 9, 87, 30, 36, -12, 3, -87, 57, 12, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-12,3,9,12,30,36,38,42,51,57,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-88, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-85, -52, -33, -10, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-52,-33,-10,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-68, 32, 88, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,32,56,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 36, 74, -85, 0, 40, 31, 30, -48, 62, 7, 18, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-48,0,7,18,30,31,36,40,62,74,79,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, 15, 46, 92, 81, 95, 74, 25, -65, 94, 72, 57, 74, -18, 59, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-18,6,15,25,46,57,59,72,74,74,80,81,92,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-68, 77, 98, 29, 61, -89, -34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-68,-34,29,61,77,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 45, 44, 14, 19, 4, 60, 35, 70, 62, -84, 51, 9, 97, 1, -2, 26, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-69,-2,1,4,9,14,19,26,30,35,44,45,51,60,62,70,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 91, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(95, 31, -50, 71, 88, 74, 49, 73, 27, 67, 98, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-27,27,31,49,67,71,73,74,88,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 3, 6, 73, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,6,34,49,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 90, 44, 0, 45, -24, 21, 44, 12, 22, 86, -39, 47, 49, 66, 96, 60, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-24,0,12,21,22,44,44,45,47,49,59,60,66,86,90,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 87, 44, 74, 16, -67, -43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-43,16,44,74,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, -27, 94, 10, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,10,26,84,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 0, 1, 37, 86, 19, -45, 69, 23, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,0,1,19,23,30,37,69,82,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 10, -70, -7, 7, 78, 28, 66, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-7,7,10,21,28,66,66,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, -38, 86, -81, 69, -62, 4, -99, 75, 38, 77, 63, 46, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-81,-62,-38,4,12,38,46,56,63,69,75,77,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-81, 99, 71, 29, 9, -5, -88, 19, 4, 45, 87, 73, 25, 71, -51, 77, 12, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-81,-51,-5,4,9,12,19,25,29,45,70,71,71,73,77,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 2, 6, 25, 14, -11, 53, 64, 75, 43, 82, -52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-11,2,6,14,25,42,43,53,64,75,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, 59, 77, 7, 35, 58, 39, 96, 40, -23, 90, 14, 10, -94, -5, -51, 53, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-51,-23,-5,7,10,14,35,39,40,53,58,59,61,77,80,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, -18, 66, 57, 4, -30, 90, -12, -13, 47, 62, 41, 77, -52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-30,-18,-13,-12,4,41,47,57,62,63,66,77,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, -12, 95, 55, 68, -16, 13, -91, 62, 76, 21, 54, 82, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-16,-12,13,21,50,54,55,62,68,74,76,82,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-90, 7, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,7,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 91, -81, -22, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-22,39,79,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-39, 44, 99, 5, 60, 69, 68, 51, 9, 18, 50, 4, -49, 14, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-39,4,5,9,14,18,33,44,50,51,60,68,69,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 59, 36, 9, 72, 0, 68, 67, 81, 65, -31, -40, 40, 25, 38, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-31,0,9,25,36,38,40,59,62,65,67,68,72,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 28, -79, -51, -93, -75, 99, -20, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-79,-75,-51,-20,13,28,29,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-83, 72, 14, 82, 75, 36, 77, 57, 39, 17, 58, 89, 21, 41, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,14,17,21,36,39,41,57,58,72,75,77,80,82,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 51, -26, 99, 11, 8, 71, -17, -66, 67, 37, 34, 32, 4, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-26,-17,4,8,11,32,34,37,51,54,67,71,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 61, -89, 21, 94, 19, 60, 39, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,19,21,30,39,50,60,61,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, 59, 57, 69, 97, 14, 43, 12, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,14,19,43,57,59,69,82,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 58, 77, 17, 68, 94, 55, 41, 76, 90, 83, 16, 93, 7, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,10,16,17,41,46,55,58,68,76,77,83,90,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, -38, 98, 93, 45, -64, 2, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-38,2,45,76,93,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 95, 64, 80, 11, 52, -75, 22, -48, -62, 56, 92, 73, 37, 35, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-62,-48,0,11,22,35,37,52,56,64,73,80,90,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, -96, -55, 47, 48, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-55,10,37,47,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 41, 2, 44, 75, 95, 6, -3, 21, 70, -38, 50, 90, -93, 73, -38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-38,-38,-3,2,6,14,21,41,44,50,70,73,75,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 16, 2, 49, -37, -25, 89, 64, 46, 49, 47, 11, 86, 86, -67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-37,-25,2,11,13,16,46,47,49,49,64,86,86,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 39, 12, 24, 47, 18, 20, 22, 51, 44, 76, 54, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,18,20,22,24,34,39,44,47,51,54,76,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-65, 77, 68, 57, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,57,68,69,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[40,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 56, -16, 38, 45, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,26,38,45,56,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 16, 15, 9, 34, -20, 18, 20, 55, 92, -4, 95, 97, 73, -18, 46, 42, 0, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-18,-4,0,9,9,15,16,18,20,34,42,46,55,57,73,92,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 65, 45, 5, -38, 58, 38, 58, -43, 85, 4, 62, -5, -82, 14, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-43,-38,-5,4,5,14,38,45,58,58,62,65,85,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-87, 92, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 63, 6, -27, 71, 5, -77, 74, 62, 82, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-27,5,6,62,63,71,74,77,82,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-83, 11, 92, -38, 39, 57, -10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-38,-10,11,39,57,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 10, 52, 42, -44, 65, 25, 95, 15, 96, -10, 98, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,-10,0,10,15,25,42,52,65,79,95,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 40, 25, 66, 82, 49, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,25,40,42,49,66,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 13, 22, 55, 50, 52, 25, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,22,25,50,52,55,55,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, 81, -57, 36, -56, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-56,36,81,83,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 61, 17, 89, 50, 92, 24, 19, 39, 70, 87, 32, -59, 51, -75, 64, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-75,-59,17,19,24,32,39,50,51,61,64,70,79,87,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(52, 24, 31, 13, -69, -22, 4, 87, 15, 42, 3, 41, 70, -82, 21, 63, -52, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-69,-52,-22,3,4,13,15,21,24,31,38,41,42,52,63,70,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, -87, 46, 31, 60, 24, -82, -27, 94, -59, -71, 62, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-82,-71,-59,-27,13,24,31,44,46,60,62,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 34, 98, -28, 51, 86, 8, 87, -53, 22, -33, -15, 16, 27, 37, 57, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-33,-28,-15,8,16,22,27,34,34,37,51,57,86,87,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 90, 16, 85, 45, -37, 0, -76, 71, 70, 32, -24, 40, 80, 15, 76, 98, -17, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-37,-24,-17,0,15,16,32,40,45,69,70,71,76,80,85,87,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 33, 37, -34, 23, 98, 89, -1, -53, 43, 9, 10, 69, -67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-53,-34,-1,9,10,23,31,33,37,43,69,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, -85, 0, 3, 16, 95, 67, 95, -26, 43, 23, 60, -24, 10, -85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-85,-26,-24,0,3,10,16,23,43,56,60,67,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, -88, 96, -47, 36, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-47,36,64,68,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 31, -89, 72, 0, -20, 17, 70, 0, 18, 51, 99, 61, 97, 62, 93, 60, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-20,0,0,7,17,18,31,51,57,60,61,62,70,72,93,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-47, -21, 28, 72, -97, -4, -42, -17, 71, 48, -10, -35, -27, 37, 29, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-89,-47,-42,-35,-27,-21,-17,-10,-4,28,29,37,48,71,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 38, 27, 57, -21, 64, 41, 63, 48, -21, 48, 58, -88, 18, 88, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-88,-21,-21,18,27,38,41,48,48,57,58,63,64,72,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 41, 95, 98, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,72,74,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-76, -60, 99, -34, 10, 7, 97, -77, 79, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-76,-60,-34,7,10,56,79,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, 98, 62, 89, 82, -43, 66, 23, 7, -30, 26, 68, -6, 9, -54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-43,-30,-6,7,9,23,26,62,66,68,73,82,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(77, 27, 32, 16, 64, 55, 23, 56, 30, 24, 13, -50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,13,16,23,24,27,30,32,55,56,64,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, 22, -91, 64, 58, -78, 62, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-78,22,58,58,62,64,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 40, -21, 81, 16, 46, 84, 13, 72, 46, 70, 51, 16, 18, 52, 40, 93, 81, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,13,16,16,18,31,40,40,46,46,51,52,70,72,81,81,84,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 39, -33, 12, 68, 68, 49, -13, 14, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-13,12,14,39,44,49,63,68,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 74, 86, 33, -13, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-13,33,34,74,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 70, -65, -19, 6, 58, 78, 54, 97, 31, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-19,6,31,32,54,58,58,70,78,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 14, 98, 38, 58, 60, 16, 74, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,14,16,38,49,58,60,74,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 72, 71, 8, 54, 93, -89, -76, 81, 2, -33, 18, 56, 80, 71, 75, 27, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-76,-33,2,8,18,27,29,37,54,56,71,71,72,75,80,81,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 96, 41, 62, 40, 91, 29, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,29,40,41,55,62,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, -10, 81, 33, 43, 15, 75, 52, 55, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,-10,7,15,33,43,52,55,75,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 11, 28, 90, 4, 95, 64, 25, 72, 14, -87, 86, 76, -70, -21, 23, 27, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-70,-21,4,11,12,14,23,25,27,28,64,67,72,76,86,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 17, -75, -73, 33, 81, 94, 30, 39, 32, 37, 24, 97, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-73,17,24,30,32,33,37,39,47,55,81,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 1, 47, 91, 1, 13, 14, 30, 40, -19, 47, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,1,1,13,14,30,40,44,47,47,78,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, 26, 80, 87, -85, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,2,26,80,87,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 44, 74, 11, 54, 80, 89, 72, -47, 14, 82, 34, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,11,14,32,34,44,54,61,72,74,80,82,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 49, 94, -74, 40, 24, 94, 82, 97, 11, -26, 11, 99, 45, 60, 38, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-26,11,11,24,38,40,45,48,49,60,68,82,94,94,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-93, 55, 39, 6, 44, 12, -87, 22, 54, 84, 23, 85, -46, -99, 1, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-93,-87,-46,1,6,12,22,23,30,39,44,54,55,84,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 72, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,72,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 38, 84, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,39,70,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-49, 67, 77, 55, 24, 19, 84, 10, 37, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-49,10,19,24,37,55,67,77,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(92, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, 28, 25, 91, 53, 24, -78, -53, -14, -93, 44, 8, -83, 68, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-83,-78,-53,-14,8,24,25,28,28,41,44,53,68,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-97, 96, -80, -93, 54, 20, 70, 25, 34, 0, 8, 58, 64, -24, 33, 45, -86, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-93,-86,-80,-24,0,2,8,20,25,33,34,45,54,58,64,70,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 96, 61, 32, 0, 5, 8, 13, 93, 22, 33, -45, -68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-45,0,5,8,13,22,32,33,36,61,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, -43, -82, 76, 85, 27, 17, -79, 32, 31, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-79,-43,17,24,27,31,32,69,76,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-88, 61, 32, 37, 81, 3, 13, 88, 22, 11, 64, 79, -53, 65, 61, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-53,3,11,13,22,32,37,60,61,61,64,65,79,81,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, -85, 37, -49, 69, 84, 71, -81, 5, -77, 26, 72, 95, 1, 45, 42, 87, 41, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-81,-77,-49,1,5,26,37,41,42,45,68,69,71,72,79,84,87,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 29, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,29,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, -65, 20, 2, 14, 34, -52, 45, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-52,2,14,20,30,34,45,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, 36, 14, 59, 84, 68, 31, 19, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,14,19,31,32,36,59,68,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-61, 69, 49, 41, 96, 31, 13, 7, 9, 42, -51, -40, 25, -2, 21, 86, -17, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-51,-40,-17,-2,7,9,13,21,25,25,31,41,42,49,69,86,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 38, -26, 95, 97, 56, 10, 66, 48, 25, 43, -54, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-26,10,19,25,38,43,48,56,66,90,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, -34, 27, 19, -27, 53, 43, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-27,19,27,28,43,53,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-76, -98, 18, 5, -20, 19, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-76,-20,5,18,19,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 33, 50, 21, -94, 19, 97, 14, 92, 83, 91, -56, 18, 97, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-56,14,18,19,21,29,33,50,68,83,91,92,97,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 96, -96, 98, 8, 87, 37, 96, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,8,27,37,37,87,96,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 66, 87, 52, 57, -23, 73, 50, -35, 20, 59, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-23,8,11,20,50,52,57,59,66,73,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93, 25, -11, 38, 11, -47, 58, 28, 76, -46, 90, 92, 48, -14, 0, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-46,-14,-11,0,11,21,25,28,38,48,58,76,90,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 52, -94, -10, 31, 41, 81, 55, 1, 5, 82, 36, 11, 95, -99, -92, 71, -94, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-94,-94,-92,-10,1,5,11,29,31,36,41,52,55,71,77,81,82,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-11, 94, 39, 82, 27, 53, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,-11,27,39,53,82,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 62, -43, -39, 17, 5, 89, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-39,5,17,62,89,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, 35, 21, 40, 65, 57, 85, 4, 72, 90, 5, 0, 79, 50, 71, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,4,5,21,24,35,40,50,51,57,65,71,72,79,85,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 24, 73, 40, 80, 60, 90, 73, -89, 1, 25, 60, 5, 34, 44, 80, -23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-23,1,5,21,24,25,34,40,44,60,60,73,73,80,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, -38, -22, -94, 98, -95, 56, 82, -72, 16, 26, 87, 79, 34, -75, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-94,-75,-72,-38,-22,16,20,26,34,56,63,79,82,87,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, -5, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,17,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-66, -13, 33, 63, 78, 80, 19, -7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-13,-7,19,33,63,78,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, -47, 57, -64, 68, -55, 75, -41, 87, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-55,-47,-41,2,23,57,68,75,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 25, 94, 27, -90, 24, -13, 38, -13, 72, 59, -35, 39, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-35,-13,-13,24,25,27,38,39,39,50,59,72,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 8, 82, 80, -49, 28, 16, 26, -77, -36, 87, 99, 64, 55, 60, 83, 14, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-49,-36,8,14,16,26,28,35,40,55,60,64,80,82,83,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 12, 6, -64, 15, 63, 38, -36, 44, 46, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-64,-36,6,12,15,38,44,46,63,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 15, 24, -33, -83, 43, 82, 90, 44, 84, 3, 24, 62, 30, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-33,2,3,15,19,24,24,30,43,44,62,82,84,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, -20, 4, 73, 81, 99, 41, 13, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,4,13,16,41,73,81,82,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-33, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, 66, 63, 70, -73, 71, 67, 92, -82, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-73,-64,63,63,66,67,70,71,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 87, 29, 62, 19, 64, 95, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,29,29,39,62,64,87,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-1, 61, 16, -79, 75, 45, 56, 28, 83, 72, 0, 92, 45, -96, 68, -26, -36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-79,-36,-26,-1,0,16,28,45,45,56,61,68,72,75,83,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-9, -71, 23, 63, 0, 98, 76, 21, -32, 76, 26, 27, 62, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-71,-32,-9,0,21,23,26,27,62,63,76,76,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, -75, 27, -58, 32, -1, 93, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-58,-1,20,27,32,43,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-67, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, -96, 70, 70, 28, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-69,28,58,70,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 67, 24, 28, -85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,24,28,28,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 38, 94, 31, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,31,32,38,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-55, 92, 72, 56, -37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-37,56,72,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-50, -15, 18, 10, 16, 33, 13, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-15,10,13,16,18,33,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, -56, 9, 88, 0, 1, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,0,1,9,20,67,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, -65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-11, 22, 52, 20, 26, 67, 38, 56, 74, -90, 91, -77, 15, -97, -11, 80, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-90,-83,-77,-11,-11,15,20,22,26,38,52,56,67,74,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 89, 2, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,34,45,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, -38, 66, 31, -94, 71, 64, 57, -50, 86, 58, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-69,-50,-38,9,31,57,58,64,66,71,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, -37, 47, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,33,47,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, 46, 64, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,46,56,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 4, 9, 82, 42, 52, 9, 61, 71, 45, -21, -65, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-21,4,9,9,42,45,52,60,61,65,71,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 66, 41, 20, 45, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,20,41,45,66,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 52, 64, -65, 54, 24, -68, 58, 76, 32, -6, -97, 42, 39, 95, 31, 7, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-89,-68,-65,-6,5,7,24,31,32,39,42,52,54,58,64,76,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 60, -36, 70, 63, 42, 51, 74, 62, 79, 63, 15, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-26,15,42,51,60,62,63,63,65,70,74,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 5, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,69,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 15, 46, 55, 30, 98, -78, 91, 25, 18, 43, 23, 22, 79, 19, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-32,0,15,18,19,22,23,25,30,43,46,55,79,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 29, 31, 30, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,29,30,31,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 21, 19, 94, 8, 84, 41, -9, 95, 0, -74, 66, 99, 40, -42, 48, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-42,-9,0,8,19,21,28,40,41,48,66,81,84,94,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-77, 12, 82, 44, 2, 44, 60, 59, 89, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,2,12,17,44,44,59,60,82,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88, 25, 27, 48, -81, 84, 80, 19, 74, 12, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,12,19,25,27,48,64,74,80,84,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 53, 58, 6, 80, 69, 50, 94, 51, 61, 40, 97, 70, 53, 16, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,15,16,26,40,50,51,53,53,58,61,69,70,80,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 59, -49, -1, -91, -51, -36, 70, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-51,-49,-36,-1,11,39,59,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 23, 35, 70, -24, 3, 82, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-24,2,3,23,35,70,70,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-83, -7, 41, 14, 46, 23, 99, 14, -81, -64, 75, 32, 87, 66, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-81,-64,-7,14,14,23,32,41,46,66,75,80,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 81, 93, 37, 24, -20, -69, 86, 92, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-20,24,37,37,81,85,86,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, -48, 93, -56, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-48,78,81,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 77, 41, 66, 30, 7, 4, -13, 53, 79, 77, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,4,7,13,30,41,53,66,71,77,77,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 56, -4, 24, 74, 30, 89, 95, 0, 21, 92, 47, 12, -24, 86, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-24,-4,0,12,21,24,29,30,47,56,68,74,86,89,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-45, 52, 63, 12, -35, -44, -40, 79, 46, -28, 34, -29, -25, 93, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-44,-40,-35,-29,-28,-25,12,34,46,52,63,79,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, -69, 55, 23, 90, -87, 49, 92, 85, 80, 57, -66, 9, 89, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-69,-66,9,23,49,50,55,57,78,80,85,89,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 4, 32, -43, 42, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,4,32,42,51,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 63, 35, 34, 64, 92, 36, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,35,36,44,63,64,72,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 65, -22, -29, -31, -3, -51, 65, 10, 8, 86, 55, 12, 29, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-31,-29,-22,-3,8,10,12,29,30,55,65,65,68,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 46, 25, 67, 56, 65, 98, 64, 80, 6, 17, 8, 5, 79, 72, 9, 31, 91, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,6,8,9,17,25,31,37,46,56,64,65,67,72,79,80,81,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 56, 72, 52, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,44,52,56,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 71, -27, -22, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,-22,10,60,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 9, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,34,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 64, 22, 2, 29, -90, 29, 34, 91, 71, 50, 70, 94, -22, -24, 74, 0, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-24,-22,0,2,14,22,29,29,34,50,64,70,71,74,91,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, 81, -21, 97, 67, -35, 8, 37, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-21,8,37,44,67,75,81,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 13, 63, 21, 19, 80, 24, 39, 71, -55, 17, 26, 86, 28, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,13,17,19,20,21,24,26,28,39,63,71,80,86,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 96, 98, 23, 80, 68, -51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-51,23,68,80,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, 51, 62, 4, 84, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,28,41,51,62,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 92, 31, 12, 14, 23, 93, 17, 46, 16, -58, 56, 34, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,11,12,14,16,17,23,31,34,46,56,63,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 38, -61, 38, -62, 51, 70, 11, 37, 98, 4, 0, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-61,0,4,11,35,37,38,38,51,70,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-3, 18, -8, -93, 7, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-8,-3,7,18,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, 82, 12, -34, 58, 2, 41, 67, -85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-34,2,12,41,58,63,67,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, -29, -86, 76, 40, 25, 18, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-29,18,25,40,47,58,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-36, 95, 98, 11, 54, 65, -29, 71, 85, -98, 29, 3, 52, 27, 66, 95, -69, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-69,-36,-29,3,11,27,29,30,52,54,65,66,71,85,95,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-1, 69, 59, 12, 11, -4, 57, -89, -71, 45, 6, 12, -74, 3, -79, 39, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-79,-74,-71,-4,-1,3,6,11,12,12,33,39,45,57,59,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, -87, -60, 75, 24, 29, 52, -30, 44, 72, -17, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-60,-30,-17,24,29,35,36,44,52,72,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 86, 61, 5, 79, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7,59,61,79,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 23, 31, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,23,31,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, 2, 5, -35, 5, -13, -90, -2, 75, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-35,-13,-2,2,5,5,24,69,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(92, 4, 69, 60, 95, 75, 57, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,53,57,60,69,75,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 0, 26, 0, 42, -41, 5, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,0,0,5,26,42,56,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 83, 44, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,38,44,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 72, -20, 53, 87, 3, 64, 14, -91, 13, -65, 90, 31, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-65,-20,3,9,13,14,31,43,53,64,72,87,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 61, 40, 36, 73, -37, 7, 35, 62, 55, -11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-11,7,28,35,36,40,55,61,62,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 96, 61, -34, 23, -82, -44, -23, 86, 83, 41, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-44,-34,-23,23,41,61,65,83,86,88,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 72, 56, 20, 36, 26, 58, -95, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,20,26,28,36,56,58,68,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 12, 68, 56, -17, 57, 26, 93, -58, 35, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-17,12,26,29,35,41,56,57,68,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, 67, 4, 63, 44, 84, 81, 3, -52, 44, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,3,4,44,44,63,64,67,81,84,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 46, 37, 62, 17, 40, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,19,21,37,40,46,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, 48, -77, 86, 11, 73, 73, 33, 7, -7, 74, 35, 21, 77, 17, 24, 99, 57, -75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-75,-7,7,11,12,17,21,24,33,35,48,57,73,73,74,77,86,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 76, 85, -4, 86, 14, -4, 90, 80, 7, 11, 67, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,-4,7,11,14,66,67,76,80,81,85,86,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, 18, 22, 66, 50, -9, 98, 53, 84, 2, -54, 15, 60, -29, 37, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-29,-9,2,15,18,22,37,47,50,53,60,66,75,84,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, 87, 39, 97, 30, 13, -84, 12, 22, 12, 12, -42, 1, -1, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-42,-1,1,12,12,12,13,22,30,39,42,83,87,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-64, 23, 17, 83, 71, 76, 14, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,14,17,23,55,71,76,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 1, 98, 95, 67, 56, 15, 54, -3, 23, 0, -52, 21, -62, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-52,-3,0,1,15,21,23,54,56,67,79,94,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 32, 48, 27, 29, 91, 17, -72, 98, 93, 41, 5, 52, 92, -90, 23, 76, 90, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-72,5,17,23,27,29,32,41,48,52,55,70,76,90,91,92,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 29, 28, 98, 88, -73, 65, -71, 63, 54, 81, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-71,8,28,29,54,63,65,81,81,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, 79, 90, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,79,87,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 48, -36, 89, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,16,28,48,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, -71, 10, 53, 38, 56, 48, 59, -46, 28, 50, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-46,4,10,28,30,38,48,50,53,56,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 68, 68, 38, 10, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,36,38,68,68,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 74, 45, 25, 80, 39, 57, 79, 27, -50, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,25,27,39,45,57,73,74,79,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, -61, 29, 81, -13, 99, 29, 35, 9, 21, 16, 78, 52, 25, 67, 13, 76, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-13,9,13,16,21,25,29,29,35,40,52,64,67,76,78,81,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-21, 35, 51, -1, 27, 54, 40, -80, -13, 91, 2, 24, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-21,-13,-1,2,24,25,27,35,40,51,54,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-98, 99, 80, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,75,80,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 15, 0, -7, 92, 10, 71, 0, 82, -69, 29, -32, 8, -24, 99, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-32,-27,-24,-7,0,0,0,8,10,15,29,71,82,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 27, 15, 81, 42, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,16,27,42,43,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 61, 90, 73, 3, 29, 2, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,14,29,45,61,73,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, 27, 27, 61, 20, 54, 89, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,23,24,27,27,54,61,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 15, -33, 17, 59, -67, 10, 45, 87, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-33,3,10,15,17,45,59,68,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 79, 2, 67, 74, 28, 51, 54, 46, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,28,33,46,51,54,66,67,74,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, -74, 15, 19, 9, 9, 59, 26, 93, 94, 3, 0, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,0,3,9,9,15,19,26,59,59,69,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 10, 59, 67, 81, -18, -48, -35, 60, 42, 57, -9, 2, 30, 18, 72, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-35,-18,-9,2,10,18,27,30,42,57,59,60,67,72,72,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 9, 42, 93, 10, 73, 12, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,9,10,12,42,65,73,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, -50, 56, 2, 39, -60, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-50,2,39,39,56,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 92, -77, 95, 39, 80, 40, 33, -66, 49, 23, 13, -19, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-66,-19,13,23,26,33,39,40,49,52,80,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, -67, 9, 79, 41, 88, 98, 68, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-67,9,19,41,68,79,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 91, 7, 48, 23, 25, -56, 58, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,7,23,25,37,39,48,58,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-57, 59, 45, 47, 23, 96, 58, 33, -3, 27, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-3,23,27,33,45,47,51,58,59,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 96, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 64, 9, -43, 50, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,9,50,53,64,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, -45, 70, 77, 77, -42, -60, 18, 74, 32, 70, 7, 59, 67, 90, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-45,-42,7,15,18,32,33,59,67,70,70,74,77,77,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-23, 48, -3, 28, -3, 74, 36, -93, 30, 33, 50, 23, 38, -3, 55, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-23,-3,-3,-3,12,23,28,30,33,36,38,48,50,55,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 4, 37, 43, 24, 61, 27, 65, 54, 6, 16, -9, 75, 8, 60, -74, -58, -13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-58,-13,-9,4,6,8,16,24,27,37,43,54,60,61,65,75,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, -96, 62, 47, 87, 17, 53, 50, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-63,17,47,48,50,53,62,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 54, 17, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,42,54,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 37, 5, 66, -90, -3, -6, 53, 6, 70, 75, -61, 92, 47, -15, 80, 12, -69, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-69,-61,-15,-6,-3,5,6,8,8,12,37,47,53,66,70,75,80,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 66, 47, 90, 91, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,46,47,66,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 54, 85, 99, 4, 45, 83, -21, 76, -95, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-21,0,4,14,45,54,76,83,85,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-62, 80, 71, 94, 1, -13, 43, 77, -90, 66, 38, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-62,-13,1,25,38,43,66,71,77,80,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1, 11, 87, 61, 64, -6, 88, 98, -27, -81, 61, 31, 71, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-27,-6,1,4,11,31,61,61,64,71,87,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 17, 67, -63, 86, 17, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,5,17,17,20,67,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-73, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-53, 21, 33, 90, -28, 87, -71, 12, -71, -8, 37, -37, 28, 70, 75, -22, 38, 17, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-71,-53,-37,-28,-22,-8,12,17,21,28,31,33,37,38,70,75,87,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 45, 3, 77, 22, 13, 16, 97, 82, 5, 55, 26, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,3,5,13,16,22,26,45,55,68,77,82,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 64, 33, 97, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,33,48,64,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 69, -7, 93, 32, -87, 75, 35, 19, 46, 57, 49, 57, 81, 39, 30, -16, -64, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-64,-16,-7,19,30,32,35,39,42,46,49,57,57,60,69,75,81,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, -35, 3, 14, 71, -32, -4, 86, 84, 86, 67, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-32,-4,3,14,19,67,71,84,86,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 56, 28, 92, 15, 70, 32, -65, 85, 21, 97, 9, 37, -6, -85, -63, 0, -7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-65,-63,-7,-6,0,7,9,15,21,28,32,37,56,70,85,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, 99, -15, 98, 47, 29, 11, 17, -79, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-15,11,17,29,45,47,73,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 99, 79, 33, -46, 11, 20, -96, 31, 3, -16, 51, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-46,-16,3,11,16,20,31,33,44,51,79,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 95, -32, 95, 33, 94, -70, 43, 49, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-32,25,33,43,49,50,94,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 28, 41, 25, -22, 23, 82, 67, 76, 28, 24, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,20,23,24,25,28,28,41,61,67,76,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 1, -24, 28, 32, 51, 68, 87, 69, 84, 96, 16, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-24,1,16,28,32,32,51,68,69,78,84,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 60, 78, 97, 29, 88, 90, 31, -88, -7, 4, 16, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-7,4,16,19,29,31,43,60,78,88,90,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 33, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,33,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-41, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, 32, 33, 7, 66, 92, 9, -79, 13, 46, 93, -40, 33, 89, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-40,-19,2,7,9,13,32,33,33,46,66,89,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 9, -27, 97, 49, 62, 66, 35, 12, 63, 13, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-27,9,12,13,35,49,62,63,66,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, 97, 64, 29, 15, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,29,64,79,83,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 39, 69, -73, 21, 18, 75, 14, 59, -4, 17, 17, 13, -16, 99, 4, 15, 96, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-16,-4,4,11,13,14,15,17,17,18,21,39,58,59,69,75,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 54, -73, 5, 70, 47, -16, 94, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-16,-12,5,28,47,54,70,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, 99, 88, 68, 34, 22, -39, 7, -87, 26, -85, 49, 88, 18, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-85,-39,7,18,22,26,34,34,49,68,88,88,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 80, 10, 17, 22, 72, 70, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,17,22,53,53,70,72,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 74, 83, -73, -63, 44, -98, 16, 18, 6, 56, -14, 95, -43, 71, 70, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-73,-63,-48,-43,-14,6,16,18,31,44,56,70,71,74,83,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 98, 69, 46, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,46,57,69,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, 2, 90, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,41,61,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-22, 39, -17, 23, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,-17,23,39,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, 77, 92, 12, 26, -79, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,12,26,47,48,77,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, -57, 76, 5, 28, 94, 53, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,5,28,31,44,53,76,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 1, 1, -57, 28, -90, 40, 60, 84, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-57,-27,1,1,5,28,40,60,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 66, 30, -16, 85, 69, 81, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,16,30,51,66,69,81,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 57, 24, 80, 55, 2, 49, -73, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,2,10,24,49,55,57,65,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-50, 53, 7, 94, 66, 57, 76, 22, 64, 24, 77, 44, -29, 78, -43, 62, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-43,-29,7,20,22,24,44,53,57,62,64,66,76,77,78,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 77, -73, 72, 98, -53, -4, -30, 89, 51, 36, 96, 39, 35, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-53,-30,-4,0,4,35,36,39,51,72,77,89,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 92, -77, -75, 65, -24, -33, 7, -13, 72, 68, 18, 6, 1, 33, 41, 24, 64, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-75,-33,-24,-13,1,3,6,7,18,24,31,33,41,64,65,68,72,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-62, 75, 13, 73, 67, 9, 36, 21, -22, -48, 22, -72, 55, -6, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-62,-48,-22,-6,8,9,13,21,22,36,55,67,73,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 26, 88, 41, 59, 63, 63, 67, 83, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,26,34,41,59,63,63,67,83,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, -8, 61, 96, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,1,2,61,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-14, 57, 10, 35, 50, 14, -56, 35, -37, 0, 60, -1, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-37,-14,-1,0,10,14,25,35,35,50,57,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-91, 96, 54, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,21,54,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-29, 28, 58, 50, 30, 11, 39, 30, 87, -88, 55, -55, 5, 0, -90, 93, 86, 43, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-88,-55,-29,0,5,11,14,28,30,30,39,43,50,55,58,86,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 15, 86, -76, -80, -87, 69, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-80,-76,15,59,69,85,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 28, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,45,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 25, 32, -29, 91, 98, -99, 25, -75, 17, 63, 33, 51, 30, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-75,-29,10,17,17,25,25,30,32,33,51,63,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 74, 23, 91, 29, -90, 46, 98, 4, 92, -9, -81, -15, 33, 86, 54, 92, -55, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-81,-55,-15,-9,4,10,23,29,29,33,46,54,74,86,91,92,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 53, 65, 51, -9, 98, 75, 45, -15, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,-9,39,45,46,51,53,65,75,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, -47, 74, 94, 90, 34, 71, 50, -87, 22, -61, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-61,-47,22,34,40,50,71,72,74,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-18, 39, 26, 24, 83, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-18,24,26,39,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, -4, 54, 29, 55, 56, 11, 33, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,1,11,29,33,33,54,55,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, -35, 72, 3, -63, -64, 52, 66, -10, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-64,-63,-35,-10,3,36,52,66,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 1, 92, 5, 5, -50, 28, -49, -53, -27, 87, 18, 66, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-50,-49,-27,1,5,5,18,28,45,66,80,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-1, -3, 90, 33, -42, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-3,-1,33,54,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-37, 72, 35, 5, -7, 15, 40, 8, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-7,5,8,15,35,40,50,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, -58, 95, 71, 45, 49, 2, -73, 95, -67, 74, 65, 73, 46, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-67,-58,2,35,45,46,49,65,71,71,73,74,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, 30, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,30,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-1, 1, 74, -52, 28, 85, -7, -43, 62, -64, 68, 59, 71, 42, 66, 18, 82, 85, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-52,-43,-7,-1,1,18,28,42,59,62,63,66,68,71,74,82,85,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, -69, 30, 5, -95, 22, 45, 93, 17, -27, 46, -69, 33, 24, -85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-85,-69,-69,-27,5,17,18,22,24,30,33,45,46,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, -84, 63, 28, 61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,8,28,61,63,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 19, 69, 16, 52, -54, 42, 90, 42, 2, -58, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-54,2,16,19,27,40,42,42,52,69,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-21, 83, 58, 71, 11, -84, -94, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-84,-21,11,58,71,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 94, -34, 22, 15, 73, 57, -13, 24, -24, 73, 67, -9, 18, 69, 88, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-24,-13,-9,15,18,20,22,24,32,57,67,69,73,73,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 5, 74, 3, 59, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,20,59,74,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 72, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,44,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-58, 26, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,26,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 94, 10, 37, 87, 17, 88, 40, 28, 47, 41, 74, -11, 90, 99, 2, 69, -92, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-11,2,10,15,17,28,37,40,41,47,69,74,80,87,88,90,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 89, 97, 89, 47, 83, -95, 26, 35, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,26,35,47,55,83,89,89,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, -92, 56, 73, 42, -41, 37, 0, -39, 95, 36, 29, 29, 94, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-41,-39,0,29,29,36,37,42,56,65,73,75,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(77, -47, 89, 6, 64, 56, 78, 51, 25, 29, 74, 54, -72, 46, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-47,6,25,29,46,51,54,56,64,74,77,77,78,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, -11, -84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-11,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 32, 83, -88, 4, 57, 36, 97, 49, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,4,32,36,49,57,78,83,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 99, -39, -92, 76, 23, 84, 44, -11, 39, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-39,-11,23,39,44,53,67,76,84,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-8, -13, 9, -39, 82, 46, 47, 72, 55, 54, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-13,-8,9,46,47,54,55,71,72,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-11, 8, 39, 82, 34, 25, 92, -4, 99, 93, 43, 63, -40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-11,-4,8,25,34,39,43,63,82,92,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-89, 23, 27, 30, -44, 41, -44, 93, 53, 22, -42, 2, 53, 56, 13, 96, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-44,-44,-42,2,13,22,23,27,30,41,42,53,53,56,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 14, 67, 32, -39, 32, -82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-39,14,14,32,32,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 44, 63, 68, 37, 77, 78, 31, 99, -50, 62, 92, 71, 76, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,17,31,37,43,44,62,63,68,71,76,77,78,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 17, 30, 98, 12, -15, 38, 30, 54, 77, 88, 40, 41, -98, 17, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-15,9,12,17,17,30,30,38,40,41,54,62,77,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 65, 16, 19, 34, -15, -20, 80, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-15,16,19,23,34,52,65,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 83, 28, 2, 61, 94, 32, 21, 72, 79, 34, 0, -71, 74, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,0,2,21,28,32,34,53,61,72,74,75,79,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(52, 77, 24, -49, 85, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,22,24,52,77,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, -49, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,24,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 46, 17, 54, -79, 47, 37, -30, 87, -68, 63, 17, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-68,-61,-30,17,17,32,37,46,47,54,63,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(77, 32, 61, -95, 2, 79, 81, 75, 58, 51, 71, 35, 52, -33, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-92,-33,2,32,35,51,52,58,61,71,75,77,79,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 17, 2, -2, 80, 82, 50, 72, 80, 88, 38, 75, 96, -50, 67, 11, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-50,-2,2,11,17,38,50,59,67,72,75,80,80,82,88,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, 22, 2, 63, 54, 66, 24, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,22,24,54,58,63,66,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, 60, 40, 73, 0, 93, 65, 11, 18, 43, 67, 37, 10, 79, -60, 18, 69, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,0,2,10,11,18,18,37,40,43,56,60,65,67,69,73,79,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 56, 1, 7, 61, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,6,7,50,56,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 17, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,17,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, -46, 16, 91, -24, 43, 60, 92, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,-24,16,20,43,53,60,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 11, 69, -56, 35, 89, -62, 45, 61, -36, 75, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-62,-56,-36,11,35,45,61,69,75,89,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 2, 13, 0, 51, -71, -71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-71,0,2,13,29,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 73, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,52,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 6, 79, 43, 59, 98, -31, 26, 4, 4, -85, 22, 81, -36, 72, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-36,-31,4,4,6,22,26,32,43,59,68,72,79,81,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 34, -76, -17, 72, 61, 28, 54, -3, 30, 88, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-17,-3,28,30,34,54,61,72,86,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 60, 83, -70, 98, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,51,60,60,83,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 52, 62, 76, 17, -20, 59, -12, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-12,17,28,46,52,59,62,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 47, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,47,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, -19, -17, -6, 89, 74, -16, 68, 46, 71, 71, -8, 47, 43, 35, 92, 81, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,-17,-16,-8,-6,28,35,43,46,47,68,71,71,74,81,89,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-32, -98, -63, 67, 31, 32, 53, -42, 87, 30, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-63,-42,-32,30,31,32,53,67,73,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 72, -73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,38,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 18, 57, 14, 44, 61, 57, 80, -87, 21, 90, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,14,18,21,35,42,44,57,57,61,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-70, 9, -26, -5, 85, 10, 39, -63, 13, 80, 57, 68, 67, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-63,-58,-26,-5,9,10,13,39,57,67,68,80,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, -44, 63, 95, 61, 38, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,38,48,59,61,63,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, -83, 6, 2, 84, 47, 42, -16, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-16,2,6,9,42,47,74,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, 1, 39, 7, 99, 75, 34, -95, 43, 71, 96, -12, -79, 77, -37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-79,-37,-12,1,7,25,34,39,43,71,75,77,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 86, -27, 0, 98, -6, 99, 40, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,-6,0,0,40,84,86,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 50, 18, 84, 9, 63, 83, 54, -23, 29, 40, 2, 58, 54, 90, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-23,2,9,18,29,40,50,54,54,58,63,76,83,84,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 45, -31, -84, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-84,-31,45,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-71, -95, 45, 69, 83, 19, 98, -2, 2, 19, -99, 12, -87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-95,-87,-71,-2,2,12,19,19,45,69,83,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 67, -30, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,21,66,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, -89, 6, 17, 53, -24, 12, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-24,6,12,17,19,53,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 79, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,42,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-34, 61, -45, 16, -19, 94, -30, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-34,-30,-19,16,61,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 99, -40, -39, 16, -98, 21, 53, 78, 37, 57, 3, 96, 51, 9, 82, 10, 48, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-40,-39,3,9,10,16,19,21,37,48,51,53,57,74,78,82,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 25, 65, -83, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-83,6,25,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97, -1, 4, 31, 66, 77, 88, -17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,-1,4,31,66,77,88,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(52, -76, 97, 36, 3, 62, 77, -60, 89, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-60,3,17,36,52,62,77,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 62, 73, 8, 16, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,16,43,62,73,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 2, 94, 21, 20, 4, 35, 39, -99, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,2,4,4,20,21,35,39,61,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 96, 21, 20, 96, -22, 89, 89, -2, 73, 87, 48, 59, 28, -93, 15, 50, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-93,-22,-2,15,20,21,28,48,50,59,73,87,89,89,96,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, -24, 45, 53, 76, 31, 29, -12, 30, 23, -64, -20, -50, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-50,-26,-24,-20,-12,13,23,29,30,31,45,53,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, -65, 30, 88, 71, -57, 98, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-57,30,51,71,83,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-72, 65, 76, 74, 89, -14, 70, 5, 38, -59, 47, 92, 50, 67, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-59,-14,5,38,47,50,60,65,67,70,74,76,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-78, -13, 43, 81, -9, 66, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-48,-13,-9,43,66,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, -82, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,62,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-91, 42, 91, 48, 35, 61, -91, 39, 21, 4, 98, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-91,1,4,21,35,39,42,48,61,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, -93, 12, 89, 7, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,2,7,12,20,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 21, 55, 78, 91, 54, 99, 31, 74, 98, 71, 87, -6, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,5,8,21,31,54,55,71,74,78,87,91,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 4, 97, -42, 5, -46, 71, 64, 67, 1, 1, -43, 7, 5, 49, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,-43,-42,1,1,4,5,5,7,49,64,67,70,71,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-7, 78, -19, -59, 12, -50, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-50,-19,-7,12,78,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, 91, 72, -72, 24, 14, -36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-36,14,24,24,72,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, 38, 40, 51, -32, -74, -58, -57, 89, 48, -78, 69, 83, 57, 40, 61, 21, 8, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-74,-58,-57,-32,8,21,38,40,40,48,51,57,61,69,73,83,89,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-88, 16, 60, 69, 18, 40, -26, -45, 15, 34, 6, -71, 78, -17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-71,-45,-26,-17,6,15,16,18,34,40,60,69,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-39, 37, -75, 4, -45, 12, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-45,-39,4,12,37,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-30, 84, 17, 2, 47, 35, 52, 43, 96, 89, 57, 60, 16, -56, 66, -3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-30,-3,2,16,17,35,43,47,52,57,60,66,84,89,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 16, 8, 80, -98, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,8,16,26,80,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 4, -37, 64, -15, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-15,4,29,36,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, -9, 20, 76, -76, 73, 92, 25, 98, 97, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-9,20,25,73,76,92,96,97,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-63, 52, 73, 8, 40, 10, 65, 38, 40, 21, 63, 70, 95, 1, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,1,8,10,21,34,38,40,40,52,63,65,70,73,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-14, 8, 54, 59, 11, 55, -87, 69, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-87,-14,8,11,54,55,59,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 38, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,66,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 50, 27, 63, -30, 72, 21, 63, 84, -31, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-30,21,27,38,45,50,63,63,72,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, 62, -16, 36, -31, 93, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-16,21,36,62,63,93]", resultFormatted);
    }
}

