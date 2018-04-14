package java_programs;


public class MERGESORT_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, 97, -21, -39, 18, 72, 11, -20, 51, 94, 36, -77, 18, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-39,-21,-20,11,18,18,36,51,72,73,73,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 46, 60, -26, 35, 98, 36, 84, 82, -18, -90, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-26,-18,1,35,36,46,60,82,84,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, -31, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,9,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 31, -56, 53, -77, 7, 97, 78, 62, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-56,7,31,53,58,62,78,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-12, 56, 61, 12, 44, 61, 10, 58, 23, 18, 11, 64, 2, -86, -66, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-66,-12,2,10,11,12,18,23,44,56,58,61,61,61,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, -33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-80, 49, 4, 87, -3, 94, 60, -82, 75, 31, 29, 65, 83, 64, 78, 21, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-80,-3,4,21,29,31,49,59,60,64,65,75,78,83,87,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 90, -79, 69, 2, 89, 50, 29, 6, -22, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-22,2,6,29,50,66,69,84,89,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, -7, 12, 37, 27, 78, 58, 32, 20, -10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,-7,12,20,27,32,37,58,66,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 24, 21, 80, 21, 61, 71, 51, 38, 37, 71, 95, 30, 17, 11, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,17,21,21,24,30,37,38,51,59,61,71,71,80,84,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-37, 45, 38, -74, 40, 56, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-37,30,38,40,45,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 26, 14, 17, 93, 20, 59, 59, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,17,20,24,26,59,59,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 64, -18, 49, 49, 39, 11, 18, 72, 48, 47, 44, 79, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,11,18,18,20,39,44,47,48,49,49,64,72,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 93, 52, 17, 6, 67, -17, 8, 87, 12, 69, 67, 41, 52, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,6,8,11,12,17,41,52,52,62,67,67,69,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 56, 87, -10, -46, 28, 17, 28, 88, 38, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,-10,10,17,28,28,37,38,56,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-21, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-25, -36, 64, 61, 40, 0, 91, 52, 2, -67, 54, 80, 25, 55, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-36,-25,0,0,2,25,40,52,54,55,61,64,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 68, 12, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,55,68,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, 91, -75, -61, 29, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-61,18,21,29,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 95, 47, -12, -25, 17, 56, 10, 90, 56, 51, -11, -54, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-25,-12,-11,10,17,41,47,51,56,56,90,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, 54, 60, 32, 27, 18, 44, -27, 76, 86, -39, -83, -63, 37, 0, 92, 2, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-63,-39,-27,0,2,18,27,32,37,44,54,60,67,76,78,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 31, 33, 63, 36, -57, 54, 83, 56, 95, 40, 59, -99, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-57,5,31,33,36,40,52,54,56,59,63,83,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 51, -44, -85, 64, 55, 19, 28, 20, 24, 31, -43, 55, 25, 89, 18, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-44,-43,18,19,20,24,25,26,28,31,51,54,55,55,64,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, -64, -95, 16, 0, 54, -19, 90, -10, -28, 92, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-64,-28,-19,-10,0,16,20,52,54,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, 16, 68, 15, 67, 96, 41, 32, 65, 37, 45, 24, 38, 73, 2, 56, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,15,16,20,24,32,37,38,41,45,56,65,67,68,70,73,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 68, 51, -53, -88, 57, 78, -91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-88,-53,31,51,57,68,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 46, -38, 76, 86, 68, -84, 39, -94, 62, 73, 27, 37, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-84,-38,27,37,39,46,62,68,72,73,76,83,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 89, 14, -10, -64, 69, -5, 65, 39, -16, 24, 75, 9, 71, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-16,-10,-5,9,14,24,29,39,65,69,71,75,89,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 82, 28, -41, -62, -12, 43, 47, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-41,-12,0,28,43,47,51,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 0, -54, 80, 38, 74, 31, 74, 65, 48, -91, 17, 20, 16, 42, -89, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-89,-54,0,10,16,17,20,31,38,42,48,65,74,74,80,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-13, 23, 53, 61, 83, -66, 15, 66, -94, 27, 21, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-66,-13,15,21,21,23,27,53,61,66,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 27, 53, -70, 19, 48, 43, -59, 97, -2, 29, 9, 31, 39, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-59,-2,1,9,19,27,29,31,39,43,48,49,53,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 92, -10, 32, -67, 92, 99, 84, -87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-67,-10,32,59,84,92,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(52, 8, 23, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,8,23,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, 43, 55, 1, 31, -58, 95, 48, 75, -62, 47, 96, 83, 83, -54, 20, 10, 14, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-58,-54,1,10,14,20,31,43,47,48,55,67,75,83,83,95,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-94, 97, -56, 51, 0, -7, 83, 22, 78, 86, -38, 89, -83, 60, 54, -28, -98, 26, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-94,-83,-56,-38,-28,-7,0,22,26,51,54,60,78,83,86,89,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-45, 39, 7, 90, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,7,39,69,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 94, 78, -36, 64, -17, 3, -16, -89, -26, -15, 52, 8, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-36,-26,-17,-16,-15,3,6,8,44,52,64,78,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 69, 93, -48, 34, -82, 15, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-48,15,34,34,69,76,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, -98, 56, 69, 99, 28, 13, 18, 52, -38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-38,9,13,18,28,52,56,69,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, -1, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-1,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, 81, 58, 92, 73, 56, 15, 42, 39, 77, 41, 98, -36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,7,15,39,41,42,56,58,73,77,81,92,98]", resultFormatted);
    }
}

