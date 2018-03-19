package java_programs;


public class QUICKSORT_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-97, 98, -21, 73, 45, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-21,45,68,73,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 38, -47, 30, 11, 42, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,5,11,20,30,38,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-31, 30, 24, 82, 30, 2, -20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-20,2,24,30,30,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(52, 43, 14, -88, 73, -77, 28, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-77,14,19,28,43,52,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-23, 33, -53, 72, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-23,33,72,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, -19, 80, 58, 24, -31, 26, 35, 44, 98, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-19,24,26,35,37,44,54,58,80,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-30, 6, 56, -12, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,-12,6,10,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 34, 12, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,28,34,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 66, 81, 28, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,41,66,76,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-3, 63, 70, 61, -77, -21, 21, 84, 58, 10, 54, 28, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-21,-3,8,10,21,28,54,58,61,63,70,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, 72, 83, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,56,72,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, 73, 83, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,73,73,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 58, -39, 16, 33, 88, 80, 40, 45, -18, -19, 77, 86, 21, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,-19,-18,16,21,33,40,45,55,58,69,77,80,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1, 34, 69, 74, -30, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,1,34,35,69,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 39, 74, 47, 26, 65, 60, 9, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,9,26,39,47,60,65,74,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, -33, 63, -21, -7, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-21,-7,58,63,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 53, 10, -72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,10,43,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 60, 9, 82, 20, -32, 98, -68, 60, 43, 26, 75, -20, 91, 76, -3, -43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-43,-32,-20,-3,9,20,26,32,43,60,60,75,76,82,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 23, 57, 35, 27, 95, 56, 23, -55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,14,23,23,27,35,56,57,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 1, 11, 95, 99, -86, 50, -12, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-12,1,11,49,50,85,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 56, -93, 83, 66, 89, 13, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,13,14,56,66,83,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-24, 98, 37, 73, -66, 6, 91, -85, 21, -15, 82, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-66,-24,-15,6,21,37,73,77,82,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, -3, 67, 75, -30, 89, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,-3,8,67,75,89,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-78, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 8, 70, -22, 24, 47, 96, 27, 57, 99, -47, 70, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-22,8,24,27,36,38,47,57,70,70,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, -83, -67, 1, 72, 19, 46, 1, 76, 94, 42, 3, 16, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-67,1,1,3,16,16,19,42,46,66,72,76,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 30, -70, 92, -83, 2, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-70,2,10,30,59,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 11, -10, -99, 4, 45, 49, -62, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-62,-10,4,11,33,45,49,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 25, 43, 49, 75, 20, -71, -26, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-26,20,25,31,43,49,75,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 91, 99, 65, 54, -66, 95, 68, 20, -46, 77, 28, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-46,20,28,45,54,65,68,77,91,92,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88, 45, 82, 57, 90, 52, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,52,57,62,82,88,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 14, 87, 40, 61, 88, 11, -83, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,11,14,37,40,42,61,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, 98, 82, 5, -50, 28, -62, 24, -55, 7, 83, -21, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-62,-55,-50,-21,5,7,24,28,35,82,83,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 99, 81, 22, 62, 44, 8, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,22,32,37,44,62,81,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 7, 44, -12, 58, 24, 86, 84, 57, 62, 36, -10, 70, 13, -67, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-12,-10,7,13,24,36,44,57,58,62,70,84,86,86,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 14, 28, 86, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,14,28,34,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, 91, -26, 43, 1, -71, -76, 89, 1, 10, 21, -25, -86, 6, 68, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-76,-71,-26,-25,-15,1,1,6,10,21,43,68,70,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 61, 82, -85, -19, 12, -97, 86, 61, 14, 46, 79, 87, -1, 1, 8, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-85,-19,-1,1,8,12,14,46,61,61,62,76,79,82,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 15, 82, 29, 56, 62, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,29,54,56,62,67,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, 78, 90, -24, 95, 88, 71, -25, 66, -88, 77, 2, 46, 25, 68, 23, 1, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-25,-24,1,2,23,25,46,66,68,71,77,78,80,80,88,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, -73, 94, 34, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-73,4,34,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-88, 75, 28, 38, 68, 49, -16, 1, 34, 90, 29, 11, 59, 89, 59, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-16,1,11,28,29,34,38,49,59,59,68,75,89,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 79, 95, 78, 82, 61, 28, -8, 23, -56, 37, -71, 38, 90, 0, 28, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-56,-8,0,23,28,28,37,38,39,60,61,78,79,82,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 81, 81, 42, 59, -17, 42, 25, 88, 84, 62, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,25,41,42,42,46,59,62,81,81,84,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 86, 6, 66, -83, -27, 42, 87, -23, 77, 87, 62, 31, -11, 77, -6, 60, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-27,-23,-11,-6,6,31,42,60,62,66,68,77,77,86,87,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-36, 17, 17, 41, 17, 6, 32, 56, 32, 80, 54, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,6,17,17,17,32,32,32,41,54,56,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 10, -34, 93, 10, 3, 9, 77, -30, 91, 95, 55, 11, 32, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-30,3,9,10,10,11,32,32,55,69,77,91,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-70, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, -25, 58, 96, 58, -14, 70, 66, 72, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,-14,58,58,66,70,71,72,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-70, 40, 74, -13, 94, 18, 4, 17, 17, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-13,4,14,17,17,18,40,74,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 44, 28, 33, 64, -26, -52, -45, 39, -70, -24, 52, 54, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-52,-45,-26,-24,28,33,38,39,44,52,54,64,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, -21, 83, 12, 13, -51, 4, 39, 92, 48, -34, 28, -4, 90, 88, -65, 95, -78, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-65,-51,-34,-21,-4,4,12,13,22,25,28,39,48,83,88,90,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, 71, -61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,71,74,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, -63, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,11,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, -34, 76, 95, 97, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,5,56,76,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 57, -81, 10, -5, -1, 35, 78, 96, -42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-42,-5,-1,10,35,57,78,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-92, 14, 38, 40, 98, -76, 26, 62, 65, 53, 11, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-76,6,11,14,26,38,40,53,62,65,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 26, 87, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,26,36,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, 60, 65, -17, -90, 99, 23, -94, 21, 12, 96, -96, 8, 68, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-94,-90,-17,8,12,16,21,23,60,65,68,80,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97, 95, -51, -84, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-51,60,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 68, 62, -4, 90, 0, 81, -86, -70, -23, 23, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-70,-23,-4,0,23,31,37,62,68,81,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 66, 40, -62, 1, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,1,19,40,66,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, -17, 5, 37, 81, 72, -70, 91, 65, 72, 75, 35, 3, 42, -65, -52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-65,-52,-17,3,5,35,37,42,65,72,72,75,81,86,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 21, 11, -40, 70, 61, 70, 4, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,4,10,11,21,56,61,70,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 61, 18, -18, -66, -10, 12, 76, 42, 96, 72, 42, 16, 15, 31, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-18,-10,0,12,15,16,18,31,42,42,61,72,76,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-22, -29, 57, -12, 19, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-22,-12,19,57,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 34, 78, 72, 39, 71, -79, 48, 76, 45, 27, 10, 92, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,10,20,27,34,39,45,48,58,71,72,76,78,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-53, 5, 31, 6, 25, 53, 86, 75, 55, -22, 79, 91, 56, 73, -6, 52, 58, -6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-22,-6,-6,5,6,25,31,52,53,55,56,58,73,75,79,86,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 36, 36, 10, 94, 9, 89, -94, 2, 77, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-89,2,9,10,36,36,45,77,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 30, 68, -92, 62, 27, 94, 50, 83, -33, 26, 59, -89, 78, -65, 38, 73, 13, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-89,-65,-33,13,26,27,30,38,48,50,59,62,68,73,78,83,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, 57, 37, -65, 76, 92, 32, 94, 15, -60, 45, 67, 99, 11, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-60,2,11,15,32,37,45,57,67,76,87,92,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, 23, -87, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,23,37,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 18, -82, -20, -44, 7, 96, 32, 40, 95, 55, 53, 4, 57, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-44,-20,4,7,10,18,32,36,40,53,55,57,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 93, 32, 28, 47, 38, 12, 83, 65, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,12,28,32,38,47,50,65,83,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-67, -55, 53, 85, 85, 60, 97, 42, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-55,38,42,53,60,85,85,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-45, 48, -25, 68, 53, 42, 3, 66, 98, 0, 24, -83, 39, 4, -62, -29, 58, 13, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-62,-45,-29,-25,0,3,4,13,24,35,39,42,48,53,58,66,68,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 29, 38, 59, 73, 37, 12, 72, 48, 37, -63, 68, -74, 56, 18, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-63,12,18,29,29,30,37,37,38,48,56,59,68,72,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, -89, 50, 33, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,28,33,50,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 50, 52, -86, 52, -37, 59, 99, 76, -11, 19, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-37,-11,19,20,49,50,52,52,59,76,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-8, 66, 99, 29, 57, -95, 96, -73, 88, 51, 33, 16, 88, -90, -64, 80, -2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-90,-73,-64,-8,-2,16,29,33,51,57,66,80,88,88,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 72, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,60,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, -38, 7, 79, 64, 22, -37, 49, 66, 43, 77, 5, -25, 60, 98, 31, 79, 83, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-37,-25,5,7,17,22,31,43,49,60,64,66,76,77,79,79,83,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 46, 82, 34, 10, -31, 74, -27, 80, -6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-27,-6,9,10,34,46,74,80,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 3, 70, -99, 28, 85, 23, -75, 99, 61, 40, 78, 73, 17, 35, 1, 82, -36, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-75,-36,1,3,17,20,23,28,35,40,61,70,73,78,82,85,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 53, -49, 61, -11, 79, 13, -14, 49, 7, 90, 74, 14, 11, 91, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-14,-11,7,11,13,14,49,53,61,63,65,74,79,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 23, -84, 85, 65, 54, 52, 67, 0, 79, 89, 60, -10, 5, 78, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-10,0,5,23,48,52,54,60,65,67,78,79,85,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 22, -78, 59, 38, 90, 95, 9, -30, 0, 96, -79, -18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-78,-30,-18,0,9,17,22,38,59,90,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 61, 52, 78, 88, 18, 48, 33, 37, 31, -75, 2, 75, 59, 43, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,2,9,16,18,31,33,37,43,48,52,59,61,75,78,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }
}

