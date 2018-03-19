package java_programs;


public class MERGESORT_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-7, 76, -34, 84, 78, -37, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-34,-7,76,78,84,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 40, -38, 86, -69, 80, 42, 18, 53, -4, 96, 51, 16, 32, 4, 74, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-38,-4,4,7,16,18,32,37,40,42,51,53,74,80,86,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 88, 71, 74, 65, 49, 12, 87, 67, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,12,46,49,65,67,71,74,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, -16, -75, 69, -24, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-24,-16,-8,30,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-20, 81, 39, 63, 43, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,39,41,43,63,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 73, 69, 50, 83, 9, 87, 31, 88, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,9,31,50,69,73,83,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 92, 93, 89, -24, -13, -81, 30, 54, 90, 87, 49, -15, 66, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-24,-15,-13,10,30,33,49,54,66,87,89,90,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-82, 11, -4, 77, 13, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-4,11,13,58,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, -13, 20, 96, 70, 39, 97, 49, 86, 45, 33, 26, 25, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,20,21,25,26,33,39,45,49,70,86,90,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 72, 14, 31, 48, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,13,14,31,48,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 81, -49, 91, 69, 61, 85, 32, 52, -77, 54, 12, 33, 35, 64, 29, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-49,12,29,32,33,35,52,54,57,61,64,64,69,81,85,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 14, 75, 53, 27, 44, 39, -83, -76, 20, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-76,14,20,26,27,29,39,44,53,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-6, 13, 42, 61, 68, 71, 36, 40, 69, -33, 73, 20, 66, -27, 83, 18, 97, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-27,-6,13,18,20,23,36,40,42,61,66,68,69,71,73,83,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-82, 76, 30, 56, 77, 52, 4, 92, 84, 6, 37, -90, 96, -85, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-85,-82,4,6,13,30,37,52,56,76,77,84,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 86, 78, 51, -85, -95, 10, 0, 64, 98, -66, 68, 30, 78, -58, 8, 55, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-85,-66,-58,0,8,10,30,51,55,56,64,68,73,78,78,86,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, 4, 46, 19, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,19,46,88,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, -82, -93, -5, 29, 57, 43, 72, 13, 87, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-82,-5,13,22,24,29,43,57,72,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, -50, 57, 52, 90, 35, 37, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,9,35,37,52,57,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 30, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,30,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 40, 71, 27, 71, 73, 96, -85, 63, 93, 18, -88, 24, -24, 49, -91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-88,-85,-24,18,24,27,40,49,63,71,71,73,74,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 34, 40, 45, 63, 45, 55, -49, 61, 60, 61, 59, 87, 89, 25, -2, 23, -98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-49,-2,17,23,25,34,40,45,45,55,59,60,61,61,63,87,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, -27, 71, 42, 17, 80, 70, -84, 75, 86, -79, -41, -65, 75, 46, 0, -1, -5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-79,-65,-41,-27,-5,-1,0,8,17,42,46,70,71,75,75,80,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 78, -80, -67, 37, 28, 50, 44, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-67,0,28,37,44,50,78,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 45, 7, -54, 68, -52, 74, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-52,3,7,45,54,68,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 20, 60, 93, 93, 33, 94, 88, -2, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,20,33,60,71,86,88,93,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, 70, -56, 34, -97, 90, 16, 49, 88, 21, 82, 90, 90, 64, 91, 67, 11, 43, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-56,7,11,16,21,34,43,49,64,67,70,81,82,88,90,90,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 38, 0, 75, -2, 29, 95, 99, 42, 3, -83, 56, 7, 99, 55, 61, 74, 6, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-2,0,3,6,7,29,38,42,46,55,56,61,74,75,80,95,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-49, 87, -93, -8, 29, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-49,-8,29,44,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 23, 38, 98, 25, -77, 45, -58, 32, 26, 46, 98, 82, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-58,7,23,25,26,32,38,45,46,59,82,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, 5, 15, 99, -14, 90, -2, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-14,-2,5,15,45,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 44, 33, -44, 7, 67, 17, 39, 68, 69, 69, 86, -5, 56, -74, -50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-50,-44,-5,7,17,23,33,39,44,56,67,68,69,69,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 13, 7, 34, 56, 58, 28, 77, 75, 67, 77, 42, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,13,28,34,42,56,57,58,67,75,77,77,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 15, -57, -19, 96, 49, 52, 80, -99, 70, 76, 17, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-57,-19,15,17,47,49,52,70,76,80,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, 31, 59, 43, 98, 49, 60, -92, -16, 29, 18, 67, 61, 93, 4, 11, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-16,4,11,18,29,31,43,49,59,60,61,67,73,85,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 47, 96, -97, 78, 93, 17, 95, 96, -95, 99, 77, 17, 3, 29, 88, 44, 44, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-95,3,17,17,20,29,44,44,47,61,77,78,88,93,95,96,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, -89, 32, 76, 52, 61, 5, -55, 65, 57, 40, 67, 50, 3, 72, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-55,3,5,28,32,40,50,52,57,58,61,65,67,72,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 66, 43, 27, 34, -14, -36, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-14,27,34,43,60,60,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 48, 80, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,48,80,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 0, 30, 80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,30,71,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, 7, 17, 53, -58, 46, 24, -14, 64, -42, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-42,-14,1,7,17,24,46,53,64,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-89, 72, 12, 39, 38, 54, 33, 26, 53, 39, 91, 82, 29, 0, 48, -48, 83, 33, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-78,-48,0,12,26,29,33,33,38,39,39,48,53,54,72,82,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 2, 10, -20, 37, 29, 42, 71, -54, 28, 73, 77, 69, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-20,2,10,28,29,37,42,64,69,71,73,77,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(55, 94, -7, 93, 21, 64, 20, 74, 72, 90, 19, 29, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,19,20,21,24,29,55,64,72,74,90,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, 6, 33, 31, 88, -40, 53, 7, -3, 79, 8, 94, 17, 93, -16, -56, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-40,-16,-3,4,6,7,8,17,30,31,33,53,79,88,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 54, -83, 84, 19, -41, 2, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-41,2,19,42,54,84,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 58, 35, 45, 42, 28, 13, 7, 31, 86, 68, 86, 38, 75, -82, 91, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,3,7,13,28,31,35,38,42,45,58,68,75,86,86,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, -53, 70, 66, -5, 58, -55, 78, 49, 68, 27, 30, -36, -22, 21, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-53,-36,-22,-5,21,27,30,49,50,58,66,68,70,78,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 50, -50, -51, 92, 92, 37, 41, 10, 12, 12, 6, -40, -62, 35, 70, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-51,-50,-40,-31,6,10,12,12,35,37,41,44,50,70,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 42, 54, 84, 42, -80, 48, 48, 60, 70, 54, 98, -9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-9,42,42,48,48,54,54,60,70,83,84,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 81, -25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,27,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 17, 78, 83, 55, 20, 5, -23, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,5,17,20,54,55,78,83,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(16, 14, 20, 31, 71, 77, 53, -30, 40, -28, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-30,-28,14,16,20,31,40,53,71,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-24, 31, 23, 25, 79, -5, 3, 92, -13, 8, 60, -99, 56, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-24,-13,-5,3,8,23,25,31,48,56,60,79,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 10, 69, -97, 59, 71, 37, 89, 66, 59, 28, 52, 88, 76, 26, -21, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-21,2,10,26,28,36,37,52,59,59,66,69,71,76,88,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 18, -26, 58, -10, 68, 59, 81, -48, 9, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-26,-10,9,10,18,41,58,59,68,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, -67, -51, 97, -22, 66, 88, 33, 59, -39, 59, 92, 58, 99, -52, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-52,-51,-44,-39,-22,29,33,58,59,59,66,88,92,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 51, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,51,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 73, 39, 17, 62, 23, 26, 43, 88, 36, -22, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,5,14,17,23,26,36,39,43,62,73,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, -74, 25, 56, 5, 72, -75, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-74,5,25,28,34,56,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 10, 38, 42, 24, -30, -50, -24, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-30,-24,10,24,38,40,42,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 61, 92, -60, 17, 51, 72, 43, 64, 31, -5, -53, -17, 8, 68, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-53,-17,-5,8,17,31,32,43,51,61,61,64,68,72,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 95, 79, 3, 59, 33, 91, 14, 27, 56, -30, -6, -3, 53, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,-6,-3,3,9,14,27,33,53,56,59,79,91,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-37, 93, 49, 52, 37, -13, 26, 11, -27, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-27,-13,7,11,26,37,49,52,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, 18, -53, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,18,39,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 17, 71, -53, -83, 53, 55, 26, 96, -49, -10, 70, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-53,-49,-10,17,26,53,55,58,63,70,71,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-20, 6, 29, 31, 51, -74, 93, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-20,6,29,31,51,83,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 31, 4, 16, 12, 59, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,12,16,31,44,59,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 42, 70, 65, 83, -58, 23, -61, 35, 10, 81, 99, -32, -82, 94, 63, -84, -96, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-84,-82,-61,-58,-32,-31,10,23,26,35,42,63,65,70,81,83,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 44, 81, -57, 62, 67, -57, -79, 60, -3, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-57,-57,-3,8,27,44,60,62,67,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 50, 53, 81, -67, 38, 86, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,31,38,50,53,81,86,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, -33, 36, 82, 23, -48, 64, 97, -67, 67, 82, 75, 18, -94, 18, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-76,-67,-48,-33,18,18,23,30,36,64,67,75,82,82,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 98, 52, 52, -73, 99, 45, 69, 48, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,24,45,48,52,52,67,69,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 24, 25, 56, 34, 42, 63, 22, 9, 2, -49, 75, 6, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,2,6,9,22,24,25,34,42,56,63,71,75,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 83, 76, 89, 39, 43, 63, -51, 78, 63, 31, -44, 78, 4, 42, 0, 9, 79, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-44,0,4,5,9,31,35,39,42,43,63,63,76,78,78,79,83,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-15, 70, 65, 3, 0, 99, 55, 16, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-15,0,3,16,55,65,70,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, -2, 62, -58, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-2,56,62,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-81, 96, 10, 28, -74, 36, 87, 70, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-74,10,28,36,70,87,89,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, -39, 4, 25, -65, 88, 92, 0, 26, -19, 93, 56, -37, 9, 77, 59, 97, 79, -6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-39,-37,-19,-6,0,4,9,20,25,26,56,59,77,79,88,92,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 69, 87, 72, 78, -10, -65, 79, 36, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-10,36,54,55,69,72,78,79,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 97, 63, 15, -74, 75, 56, 40, 25, 9, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,9,15,25,40,56,63,75,86,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 5, 92, 17, 93, -26, 94, 97, 79, 19, 78, 48, 56, 6, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,5,6,17,19,25,48,56,78,79,91,92,93,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, 19, 86, -75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,19,73,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 24, 96, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,66,83,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 35, 35, 32, 88, 2, 32, 19, -9, 51, 95, 53, 48, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,2,19,32,32,35,35,48,51,53,76,82,88,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-23, 0, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,0,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 11, 52, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,51,52,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 39, 90, 85, 36, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,36,39,58,85,90]", resultFormatted);
    }
}

