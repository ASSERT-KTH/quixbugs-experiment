package java_testcases.junit;


public class QUICKSORT_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 21, 87)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,81,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 24, -74, 70, 50)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,19,24,50,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 99, -70, 28, 59, -80, -40, 77, 1, 22, 94, -32, 86, 78, -76, 93, 5, 36, -50)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-76,-70,-50,-40,-32,1,5,19,22,28,36,59,77,78,86,93,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, -94, 37, -50, 7, -47, 9, 71, 86, 3, -82, 90, 90, 75, 84, 38, 64, 52)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-82,-50,-47,3,7,9,37,38,52,64,71,72,75,84,86,90,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 3, 49, 27, 57, 89, 93, 35, 99, 35, -47, 18, 33, -37, -55, -44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-47,-44,-37,3,18,27,33,35,35,49,57,72,89,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 31, 91, 56, 39, 52, -92, -45, 61, 63)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-45,31,39,39,52,56,61,63,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, -18, 86, 25, 29)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,25,29,60,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-59, 46, 4, 14, 28, -44, 76, 63, 5, 11, 97, 4)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-44,4,4,5,11,14,28,46,63,76,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, 36, -90, -50)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-50,36,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 73, 74, -86, 3)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,3,73,74,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, -47, 0, -71, 72, 24)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-47,0,24,71,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 47, 21, 95, 87, -86, 10, 46, 72, 61, -49, -94, 86, 61, 83)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-86,-49,10,10,21,46,47,61,61,72,83,86,87,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 41, -17, 50, 80, -9, 48, 19, 15, 3, -43, 32, 6, 47, 43)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-17,-9,3,6,15,19,32,41,43,47,48,50,80,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 94, 38, 28, 70, 47, 47, -76, 32, 90, 61, -76, 88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-76,28,32,38,47,47,53,61,70,88,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 61, 37, 30, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,30,37,40,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, -61, 18, -21, 86, -21, 97, 21, -78)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-61,-21,-21,18,21,34,86,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-24, 51, 72, 14, -38, 11, 62, 99, -62, 9, 82, 21, -37, 24, 43, 15, -98, -44, -51)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-62,-51,-44,-38,-37,-24,9,11,14,15,21,24,43,51,62,72,82,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 73, 74, 67, 43, 41, 59)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,41,43,59,67,73,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, -11, 29, 37, 61, 31, 17, 89, 81, 5, -70, 73)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-11,5,17,26,29,31,37,61,73,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 50, 0, 43, -16, 28, -33, 28, 97, 50, -73, 57, 55, 71, -89, 2)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-73,-33,-16,0,2,28,28,38,43,50,50,55,57,71,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-68, 37, -16, 85, -71, -89, 98, 79, 68, 56, 77)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-71,-68,-16,37,56,68,77,79,85,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 35, 28, -15, 13, 63, 81, -55, 21, -66, 83)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-55,-15,13,21,21,28,35,63,81,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 60, 62, -81, -77, 12, -5, 21, 3, -11, -85, 84, 71, 16, 70, -98, 75)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-85,-81,-77,-11,-5,3,12,16,21,46,60,62,70,71,75,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 92, -45, 98, -58)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-45,37,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 60, -17, 63, 58, 36, 25, -94, -27, 16, 97, -11, 7, 8, -40, 58, 70, 91, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-40,-27,-17,-11,7,8,16,25,36,45,58,58,60,63,70,84,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, -13, -82, 17, -80, -8, 86, -78)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-80,-78,-13,-8,17,54,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 30, 62, 5, 36)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,18,30,36,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 36, 60, 33, -98, -86, 92, 91, 75, 44, -25, 76, 69)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-86,-25,7,33,36,44,60,69,75,76,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 25, 63, 73, 27, -2, -35, 42, 25, -83, -64, 85, 87, 6, 45)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-64,-35,-2,6,25,25,27,42,45,63,73,85,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, -45, -30, 3, -67, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-45,-30,3,21,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-56, 26)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-77, 12, 41, 98, 67, 53, 97, 48, 56, 11, 18, 36, 56, -30, 92, -67, 53, 2, 79)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-67,-30,2,11,12,18,36,41,48,53,53,56,56,67,79,92,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, 77, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,77,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 63, 86, 6, -97)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,6,32,63,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1, 40, 2)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,2,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 81, 9, 86, 29)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,29,40,81,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 67, 8, 17, 77, 47, 58, 78, 31, 27, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,17,27,31,47,49,58,67,77,78,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, 67, 3, 34, 13, 30, 18, 73, 0, 97, 72, 23, 54, 32, 68, -9, 99, 22)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,0,3,13,18,22,23,30,32,34,51,54,67,68,72,73,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 98, 84, 33, 78, 57, 61, -49, -46, 25, 72, 7, 73, -4, 62, 45, 50, 92)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-46,-4,7,11,25,33,45,50,57,61,62,72,73,78,84,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, -31, 49, 95, 98, 74, 61, 83, 87, 69, -72, 17, -83, -12, 75, 95, 9, 40)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-72,-31,-12,9,12,17,40,49,61,69,74,75,83,87,95,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 95, 14)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 36, 8, 42, 42, 65, 83)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,16,36,42,42,65,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 23, 61, -36, 10, 3, 18, 72, -21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-21,3,10,18,23,61,72,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, 42, 33, -82, -99, 80, -23, 77, 73, -5, 59, 3, 21, 21, -71, 36, 93)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-82,-71,-23,-5,3,21,21,33,36,42,45,59,73,77,80,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(92, 47, 30)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,47,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-21, 72, 19, 95, 26, -98, -18, 74, 41, 94, 6, -53)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-53,-21,-18,6,19,26,41,72,74,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 70, -22, 29, 92, -63, 53, 22, -41, 27, 70, 54)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-41,-22,4,22,27,29,53,54,70,70,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 44, 80, 89, 16, 84, 64, 93)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,44,57,64,80,84,89,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 33, 94, 52, 95, 97, 92, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,16,33,52,92,94,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 24, 48, 68, 49, 96, 81, 0, 87, -8, 67, 34, 71, 53, 46, 91)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,0,24,34,46,48,49,49,53,67,68,71,81,87,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 32, 9, 49, -47, -69)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-47,9,32,37,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-42, -87, 85, -97, 47, 83, 28, 48, 66, 9, 62)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-87,-42,9,28,47,48,62,66,83,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 15, 49, 84, -76, 75, -52, 27, 54, 64)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-52,15,19,27,49,54,64,75,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 51, 82, 51, -79, 88, 32, 89, 26, 21, 43, 31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,21,21,26,31,32,43,51,51,82,88,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 50, 78, 3)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,38,50,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 27, 19, 97, 11, 46)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,19,27,46,86,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88, -88, 59, 47, 50)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,47,50,59,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, 99, -44, 93, -39, -63, 99, 34, 7, 12, 78, 16, 28, 76, -75, 15, -48, 19, 38)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-63,-48,-44,-39,7,12,15,16,19,24,28,34,38,76,78,93,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, -95, -14, 89, 66, 97, 81, 63, 95, 17, 47, 5, 84, 76, 80, 16, 13, 92, -76)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-76,-14,5,13,16,17,47,53,63,66,76,80,81,84,89,92,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-81, 85, 43, 46)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,43,46,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 49)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 88, 67, 60, 87, 63, -48, 37, 87, 82, 18, -31, 8, -3)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-31,-3,0,8,18,37,60,63,67,82,87,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, -99, 89, 60, 28, 98, 95, 64, 14, 75)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,14,28,60,64,75,78,89,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 90, 4)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,68,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 72, 35, 83)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,35,72,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 55, 63, 68, 15, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,15,18,55,63,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, -55, 55, 19, 47, 23, -69, 56, -78, -9, 62, 26, 0, 71, 4)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-69,-55,-9,0,4,19,23,26,47,55,56,56,62,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 91, 40, 2, 93)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,26,40,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, -77, 86, 77, 23, 4, 35, -48, -21, 96, -39, 54, 45, 67, 96)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-48,-39,-21,4,23,35,45,45,54,67,77,86,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 77, 88, 95, 7, -21, 28, 74, 67, 44, -10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,-10,7,28,44,67,74,77,85,88,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97, 16, 58, -52)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,16,58,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 50, 49, 90, 86, 67, 60, 93, 93, 3, 42, 31, 23)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,23,30,31,42,49,50,60,67,86,90,93,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, -42)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 46, 12, -10, 81, -1, -4)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,-4,-1,10,12,46,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 94, 10, 21, 9)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,10,21,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, 5, 72, 46, 62, 30, 38, 97, 24, 7, -91, 10, -45, 25)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-45,5,7,10,24,25,30,38,46,62,69,72,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 33, -7)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,33,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 24, 11, 34, 67, 94, 96, 90)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,11,24,34,67,90,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, 43, 29, 95, -77, 75, 84, 96, 54)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,29,43,54,75,82,84,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97, 24, 18, 70, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,24,60,70,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 74, -77, -73, 94, -62, -47, 31, 48, 75, 54, 38)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-73,-62,-47,31,38,48,54,57,74,75,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-24, 18, 96, 76, 95, 6, 80)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-24,6,18,76,80,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1, -55, 43, 10, 45, 33, 99, 48, -87, -77, 76, 29, -51, 58, 23, 75, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-77,-55,-51,1,10,10,23,29,33,43,45,48,58,75,76,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 46, -97, -17)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-17,28,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 88, 69, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,60,69,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 0, 86, 64, 59, 41, -74, 94, -17, 91, 2, 57, 41, 98, 69, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-74,-17,0,2,21,41,41,57,59,64,69,86,91,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, -1, 95)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,29,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, 55, 57, 92, -23, 74, -45, 49, 17, 27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-23,17,27,49,55,57,74,75,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 40, 39, 31, 18, -85, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,10,18,28,31,39,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 50, 64, 23, -5)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,23,36,50,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-74, 25, 0, 55, 34, -1, 47, 34, -34, 47, 98, 7, 5)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-34,-1,0,5,7,25,34,34,47,47,55,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-45, 5, 12, 44, -89, 72, 87, 24, -98, 69, 87)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-89,-45,5,12,24,44,69,72,87,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 0, 51, 93, 27, 78, -21, 71, -95, 69, 52, 75, 12, 12, 43)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-21,0,0,12,12,27,43,51,52,69,71,75,78,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-93, 36, 48, -52, 73, 53, 52, 27, 7, 29)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-52,7,27,29,36,48,52,53,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, -82, 72)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,13,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-91, 68, 75, -13, 89)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-13,68,75,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, -32, 56, -21, 41, -79, 24, 42, 33, 71, 23)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-69,-32,-21,23,24,33,41,42,56,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 48, 57, 15, 68, 61, 66, 26, 82, 82, 76, 60, 47, 67, 25, 59, 41)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,25,26,27,41,47,48,57,59,60,61,66,67,68,76,82,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-56)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-62, -54, 67, 27, -18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-54,-18,27,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(90, 56)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(7, 75, -55, -31, 14, 42, -68)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-55,-31,7,14,42,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 68, 16, 10, 19, -7, -14, 32, 15, 8, 97, 47)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-14,-7,8,10,14,15,16,19,32,47,68,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, -48, 67)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,67,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 61, -74, 75, 12, -54, -87, 20, 40, 45, 76)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-74,-54,12,20,35,40,45,61,75,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 74, 37, 14, 16, 61, 69, 18, -65, 42, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,14,16,18,37,42,61,69,74,84,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-60, 2, 24, 57, 97, 2, 75, 95, -38, 48, 20, 79, 9, -86, 73, 38, 55, -49, 25)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-60,-49,-38,2,2,9,20,24,25,38,48,55,57,73,75,79,95,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-74, 75, 22, 65, 14, -81, 76, 71, 25, -57, 99, -81, 21, 96)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-81,-74,-57,14,21,22,25,65,71,75,76,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, -65)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 10, 27, 0, 36)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,10,27,36,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, -15, -56, 58, 14, 53, 61, 11, 34, 32, 16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-15,11,13,14,16,32,34,53,58,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-62, -54, 99, 4, -43, 0, 99)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-54,-43,0,4,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-49, 30, 84, 73, 93, -30)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-30,30,73,84,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-64, 2, 16, 19, 35, -81, 30, 49, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-64,1,2,16,19,30,35,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, -71, 2, 22)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,2,17,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 87, 67, 84, 19, 73)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,19,67,73,84,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-74, -16, 63)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-16,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(1, -99, -6, 8, -84, 13, 41, 93, 77, 77, 58, 91, 23, 82, 32, 79, -68)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-84,-68,-6,1,8,13,23,32,41,58,77,77,79,82,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, 95, 14, 13, 17, 15, 17, 73, 81)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,13,14,15,17,17,73,81,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 22, 62, -88, 14, 40, 79, 75, 95)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,8,14,22,40,62,75,79,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 29, 93, 35, 35, 72, -10, -27, 87, 58, 67, -27, 32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,-27,-10,29,32,35,35,58,67,72,79,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 51, 19)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,38,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-51, 91, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,37,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, -37, 46, 31, 29, 47, 62, 59, 54, -24)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-24,29,31,46,47,54,59,62,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, -18, -68, 88, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-18,37,80,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 20, 98, 0, 54, 99, 78, -64, 77, 37, 94, 89, 35, 79, 70, 14, 55, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,0,14,20,35,37,37,48,54,55,70,77,78,79,89,94,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-40, 46)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-9, 87, 26, 26, 63, -33, 59, 90, -98, -79, 55, 3, 48)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-79,-33,-9,3,26,26,48,55,59,63,87,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, 20, 8, 99, 64, 16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,16,20,64,76,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, -82, 52, 49, -53, 69, 14, 71, 29, 66, 67, -3, 30, 71)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-53,-3,14,29,30,36,49,52,66,67,69,71,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, -81, 46, 14, 33, 72, 96, 11, 63, 26, 64, 90, 2, 40, 37, 1, 51)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,1,2,11,14,17,26,33,37,40,46,51,63,64,72,90,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, -84, 77, 47, -70, 16, 79, 40, 76, 83, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-70,16,35,40,47,60,76,77,79,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 23, 89, 87, -57, 96, 55, 63, 17, 92, 8, 2, 97, -37, 28, -99, 40)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-57,-37,2,8,17,23,28,40,55,63,81,87,89,92,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 38, 32, 28, -89, -87, 41, 93, 99, 72)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-89,-87,28,32,38,41,72,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-9, 66, 86, 33, 93, 48, -74, 3, 1, 37, -29, -41, -71, 63, 39, 72)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-71,-41,-29,-9,1,3,33,37,39,48,63,66,72,86,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 98, 13, 23, 15, 73, -13, 24, 4, 27, -53, 98, -62, 40, -47, 24)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-53,-47,-13,4,13,15,23,24,24,27,40,66,73,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-49, 61)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, -92, 26, -77, 72, 1, 25, 90, -26, 99, -14, 57, 38, -82, -28, -62, 69, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-82,-77,-62,-28,-26,-14,1,8,12,25,26,38,57,69,72,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 40, 8, 27, 74, 27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,17,27,27,40,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 11, 29, 22, 97, 7, -95, 3, 28, 36, 92, -8, 59, 82, 13, -14)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-14,-8,3,7,11,13,22,28,29,36,55,59,82,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, -41, 69, 65, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,8,65,69,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 77)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 96, 8, 15, 67, 83, -86, 27, 40, 42, 41, 86, 79, 67, 42, 6, 51, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,3,6,8,15,27,40,41,42,42,44,51,67,67,79,83,86,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 26, 28, 71, 61, -71, 78, 41, -17, 76, 36, 20, 76, 45, 40, 97)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-17,20,26,28,36,40,41,45,61,71,76,76,78,79,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 9, 47, 97, 28, 80, 81, 64, -22, 99, 84, -89, 40, 19)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-22,9,19,28,35,40,47,64,80,81,84,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 81, 93, 68, 98, -2, 86, 74, 66, -85, 74, 38, 9, 0)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-2,0,0,9,38,66,68,74,74,81,86,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 24, 74, -24, 72, 68, 11, -32, 2, 38, 73, 20, 0, 39, 2, 0)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,-24,0,0,2,2,11,20,24,38,39,48,68,72,73,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, -61, 80, 56, -53, 73, 89, 99, 51, -34, 96, 25, 57)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-53,-34,25,51,56,57,70,73,80,89,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(18, 24, 72, 87, 56, 49, 28, 49, 64, 43, 24, 78, -68, 71)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,18,24,24,28,43,49,49,56,64,71,72,78,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(83, 87, 38, 39, 92)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,39,83,87,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 4, 39, 71, -65, 42, -21, 67, -31, 40, 87, 96, 79)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-31,-21,4,23,39,40,42,67,71,79,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 31, 64, 83, 15, 62, 92, -90, 72, 13, 92, 61, 88, -64, 11, 92, 32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-64,11,13,15,21,31,32,61,62,64,72,83,88,92,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 47)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, 98, -73, 47, 49)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,47,49,87,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 60, 41, 90, 33, -59, 68, 95, 93, -65, 60, 18, 50, 10, 20, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-59,10,18,20,33,37,41,50,60,60,68,85,90,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-66)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-42, 26, 67, 49)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,26,49,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 26, 99, 64, 75, 19, 9, 83)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,19,26,57,64,75,83,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-55, 23, -71, 8, 84, 18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-55,8,18,23,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-39, 52, 98, -32, 95, 90, 59, -65)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-39,-32,52,59,90,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 34, -30, 94, -68, -16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-30,-16,34,85,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(3, 66, 38, -59, 47)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,3,38,47,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 17, 57, -97, -57)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-57,17,27,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 55, 76, 38, 3, 48, 63, 29, 15, -63, 97, -10, -84, -85, 88, 79, 72)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-84,-63,-10,3,15,29,38,48,55,63,72,76,79,88,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 34, -29, 42, 23, 45, 9)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,9,10,23,34,42,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 79, -4, 69, -53, 94, 11, 83)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-4,11,69,79,79,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-36, 14, -52, 17, 97, 67, 61, 6, 65, -84, 44, 90)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-52,-36,6,14,17,44,61,65,67,90,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, -74, 23, 23, -76, 50, 81, 25, 42, 64, 71, 97, 38, 80, -66, -91, 23, -22)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-76,-74,-66,-22,23,23,23,25,26,38,42,50,64,71,80,81,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, -86, 57, 88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,55,57,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-68, -46, 91, 11, 39, 61, 27, 82, 78, 45, 62, -73, 26, 92, 9, 76, 47)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-68,-46,9,11,26,27,39,45,47,61,62,76,78,82,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 46, -37, 37, 6, 70, -82, 66, 55, 2, 89, 8, 74, -89, 86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-82,-37,2,6,8,37,46,54,55,66,70,74,86,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, -90, -87, -8, -16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-87,-16,-8,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, -28, 19, 53, 81, 42, 84, -12, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,-12,5,10,19,42,53,81,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-82, 74, 92, 77, 80, 0, 36, 10)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,0,10,36,74,77,80,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-44, -32, 29, -17, 42, 56, 86, 85, 70, 86, -31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,-32,-31,-17,29,42,56,70,85,86,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(68, 43, 82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,68,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 24, 14, 74, 84, 89, 15, -96, -98, -78, 72, 88, 57, 47, 95, 34, -16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-96,-78,-16,13,14,15,24,34,47,57,72,74,84,88,89,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-23, 69, 80, 74, -95, -8, 47, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-23,-8,8,47,69,74,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-58, 3, -69, 75, -62, 46, -97, 9, 60, 24, 98, 46, -77, -54, 9, 82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-77,-69,-62,-58,-54,3,9,9,24,46,46,60,75,82,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-93, 83, 37, 98, 63, -49, 80, 47, 91, 3, 0, -44, 23, 26, -48, 46)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-49,-48,-44,0,3,23,26,37,46,47,63,80,83,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 99, 0, 61, 23, 46, 27, 40, 83, 96, -78, -84, 52, 33, 67)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-78,0,23,27,31,33,40,46,52,61,67,83,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, 62, -82, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,9,44,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, -69, 71, 18, -86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-69,18,71,79]", resultFormatted);
    }
}

