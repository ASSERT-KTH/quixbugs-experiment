package java_testcases.junit;


public class MERGESORT_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-63, 59, -6, 55, 64, 61, 86, 37, 11, 35, 39, 0, -48, -43)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-48,-43,-6,0,11,35,37,39,55,59,61,64,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 72, 88, 82, 68, 96, 60, -21, 62, 65, 34, 88, 18, -58, -25, 62, 85, 63, 43)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-25,-21,18,34,43,60,62,62,63,65,68,72,76,82,85,88,88,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 36, 62, -38, 66, 18, -95, -83, -34, -33, 27, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-83,-38,-34,-33,18,27,27,36,60,62,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, 11, 55, 55, 44, -92, 4, 37, 58, 6, 52, -54, 20, -3, -32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-54,-32,-3,4,6,7,11,20,37,44,52,55,55,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, -83, -24, -80, 29, -29, -52)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-80,-52,-29,-24,29,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 23, 61, 58, 21, 92, 42, 87, 64, 96, 0, 61, 41, 6, 37, 92, -30)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,0,6,20,21,23,37,41,42,58,61,61,64,87,92,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 55, 14, -65, 4, 61, 39, 56, -39, 51, 2, 83, 12, 12, 37, -10, -12)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-39,-12,-10,2,4,12,12,14,32,37,39,51,55,56,61,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 61, 31, -30, -83, -56, 67, 18, 64)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-56,-30,15,18,31,61,64,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-88, -49, -23, 91, -4, -92, 63, 0, 26, 48, 88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-88,-49,-23,-4,0,26,48,63,88,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 61, 6, -2, -2, 57, 69, 12, 42, -90, 32, -60, 28, 82, 93, 33, 96, 27, 45)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-60,-2,-2,6,12,14,27,28,32,33,42,45,57,61,69,82,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-98, 51, 18, 54, 87, 89, 87, 86, 66)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,18,51,54,66,86,87,87,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 81, 70, -45, -47, 42, 80, 68, 7, 76)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-45,7,28,42,68,70,76,80,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 7, 67, 16, 29, 30, -88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,7,16,29,30,42,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 72, 72, 75, 46, -17, 91, 4, 13, 48, -89, 23, 99, 75, -47, 56, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-47,-17,1,4,13,23,46,48,54,56,72,72,75,75,91,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 17, 68, 0, 94, 50, 3, 66, 90, 88, 96, 51, 72, 84, 78)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,3,17,50,51,66,68,71,72,78,84,88,90,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, -10, 25, -71, 72, 75, 69, 22, 86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-71,-10,22,25,69,72,75,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 82, 59, 54, 37, -46, 73, 50)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,34,37,50,54,59,73,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7, -90, 44, -78, 28, 42, 22, -55, 36)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-78,-55,7,22,28,36,42,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, 55, -41, 49, 17, 29, 30, 34, 46, 90, 10, 8, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,1,8,10,17,29,30,34,46,49,55,81,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 53, 4, -89, -51, -7, 14, -73, 12, 10, 97, 43, 29)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-73,-51,-7,4,10,12,14,29,43,53,82,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-19, 62, 82, -11, 49, 94, 10, 99, -86, -97, -26, 95, 56, 54, 18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-86,-26,-19,-11,10,18,49,54,56,62,82,94,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-6, 8, 52, 66, -58, 35, 53, 33, 44, 88, 13, -66, 10, 76, 11, 21, 7, 86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-58,-6,7,8,10,11,13,21,33,35,44,52,53,66,76,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, 99, -24, 98, 30, 4, 79, 30, 84, 51, -17, 28, 65, 60, 68, -16, -32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,-24,-17,-16,4,28,30,30,51,60,65,68,79,84,89,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 13, 13, 68, -72, 85, -27, 73, -51, 8, 71, 35, 0)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-51,-27,0,8,13,13,35,68,71,73,82,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 87, 1, 25, 12, 55, 50, -28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,1,12,25,34,50,55,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 41)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 94, 22, -93, 55, 18, 81, 39, 94, -38, 6, 65, -54, 64, -11, 14, 38, 1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-54,-38,-11,1,6,14,18,22,38,39,55,59,64,65,81,94,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 97, 23, 47, 21, 36, 6, 39, 93, -70, 48)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,6,21,23,36,39,47,48,84,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 24, 1, 26, -4, 88, 1, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-4,1,1,24,26,80,84,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(16, 49, 3, 3, -77, 74, 58, 38, 76, 1, -31, -12, -80, -76, -67, 73)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-77,-76,-67,-31,-12,1,3,3,16,38,49,58,73,74,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 84, -77, 94, 40, 45, -41, -98, 91, 11, 18, 15, 85, 62, 24, 18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-77,-41,11,15,18,18,24,25,40,45,62,84,85,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 78, 45, 88, 68, -75, 4, -72, 15, -82, 22)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-75,-72,4,15,22,45,68,78,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, 64)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 3, 94, 97)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,20,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 68, 31, 70)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,32,68,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-77, 14, 69, -79, -35, 66, -74, 37, 95, 63, 0)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-77,-74,-35,0,14,37,63,66,69,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 97, -87, 12, 46, 93, 6, 27, 16, 90, 28, 4, 98)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,4,6,12,16,27,28,46,90,93,97,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, -78, 12, -97, -53, 46, -48, 6, -63, 57, 7, -34)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-78,-63,-53,-48,-34,3,6,7,12,46,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 87, 23, 96, 91, -42, 55, 62)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,23,55,62,76,87,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-31, 42, 69, -84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-31,42,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, -94, 14, 68, 82, 53, 36, 9)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,9,14,36,53,68,68,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 78, -26, 52, 25, 31, -17, 79, 72, 69, 10, -32, 94, 57, 21, -38)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-32,-26,-17,6,10,21,25,31,52,57,69,72,78,79,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-70, -65, 20, 83, 35, 25, 58, -44, -79, 84, 28, 72, 69, 32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-70,-65,-44,20,25,28,32,35,58,69,72,83,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 54, 76, 71, 74, 10, 38, -41)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,10,17,38,54,71,74,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-35, 36, 79, 17, 72, -55, 32, 96, 27, 16)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-35,16,17,27,32,36,72,79,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 78, -37, 98, -88, 58, -87, 84, 21, 61, 42, -73)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-87,-73,-37,21,42,58,61,77,78,84,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 40, 0, 0, 30, 55, 80, 59, 3, 0, 79)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,0,0,3,30,40,55,59,76,79,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, -97, 78, 68, 92, 55, -94, -87)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-94,-87,31,55,68,78,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85, 32, 86, -69, -15, 1, 5, 97, -18, -15, 13, -18, 15)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-18,-18,-15,-15,1,5,13,15,32,85,86,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, 95, 52, 78, 31, 52)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,49,52,52,78,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 84, 45, 69, 34, 40, 88, 19, 47, 60, 20, 27, -3, 69, 7, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,7,14,19,20,21,27,34,40,45,47,60,69,69,84,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 23, 52, 0, 65, -80, 22)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,0,22,23,50,52,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-69, 51, 30, 85, 96, 23, -68, 29, 25, 97, -2, 81, -29, 8, 38, 14, -9, 34, 9)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-68,-29,-9,-2,8,9,14,23,25,29,30,34,38,51,81,85,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(3, 25, 76, 54, 15, 11, 35, 98, 71, 72, 14, 0, 59, -30, -64, 8, 31, 26, 30)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-30,0,3,8,11,14,15,25,26,30,31,35,54,59,71,72,76,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-20, -89, 86, -82, -61, 23, 81, 28, 3, 99, -18, 95, 52, 61, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-82,-61,-20,-18,3,23,28,52,60,61,81,86,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 74, 79, 15, 38, 59, 78, 89, 95, 84, 12, 7, 57, -71, 72, 56, 33)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,7,12,15,33,38,56,57,59,63,72,74,78,79,84,89,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-29, 8, 97)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,8,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-20, -84, 4, -76, 15, 64, 1, -12, 66, -81, 54, 46, -5)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-81,-76,-20,-12,-5,1,4,15,46,54,64,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-23, 88, 26, 56, 17, -6, -30, 78, -48, 96, 92, 66, 5, 28, -45, 80)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-45,-30,-23,-6,5,17,26,28,56,66,78,80,88,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(55, 36, 97, 79, 11, 70, 28, 76, 16, 97, -58, -68, -30, 17, -77, 6, 37, 17)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-68,-58,-30,6,11,16,17,17,28,36,37,55,70,76,79,97,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, -29, 54, 67, 6, 16, -11, -94, -45, 70, 17, 43, 90)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-45,-29,-11,6,16,17,43,54,67,70,86,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-74, 68, -91, 76, 8, 43, 57, 19, 8, 24, -68, 6, 21, 8, 12, -31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-74,-68,-31,6,8,8,8,12,19,21,24,43,57,68,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, 38, 90, 38, 15, 19, 57, 50, 41, 69, 58, 70, 83, 31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,19,31,38,38,38,41,50,57,58,69,70,83,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 83, 19, 15, 89, 47, 28, -57, 21, 33, 75, -81, -3, -95)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-81,-57,-3,15,19,21,28,31,33,47,75,83,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 23, 30, 46, 27, 86, 78, 4, 45, 3, 38, 12, -79, 22, 58)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,3,4,12,22,23,27,30,38,45,46,58,67,78,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 61, -27, -44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,-27,13,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 47, 14, 47, 47, 8, 4)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,8,14,47,47,47,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, -11, 93, -17, 85, 45, -42, -63, 54, -68, 7, 23, 21, 84, -1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-63,-42,-17,-11,-1,7,21,23,44,45,54,84,85,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 73, 24, -34, 15, -44, -29, 13, 36, 58, 74, 58, 55, 12, -2, 72, 39, 59)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,-34,-29,-2,6,12,13,15,24,36,39,55,58,58,59,72,73,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, -50, 0, 28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,0,28,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 39, -49, 79, 15, 27, 36, 33, 51, 62, 75, 37, -70, 92, 45, -9)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-49,-9,15,27,33,36,37,39,45,51,62,75,79,80,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 84, 52, 37, -30, 42, 6, 11, 34, 61)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,6,11,34,37,42,52,61,61,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, -38, -39, 58, 74, -67, 10, 36)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-39,-38,10,29,36,58,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-90, -16, 24, 39, -71, -93, 66, 55)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-90,-71,-16,24,39,55,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 14, -47, 3, 18, 36, -60, 80, 39, 35, 18, -92, 23)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-60,-47,3,14,18,18,23,35,36,39,50,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, -53, -34, 37, 17, -23, 41, 69, 91, 78, -12, 36, -12, 55, -79, 14, 13, -32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-53,-34,-32,-23,-12,-12,13,14,17,36,37,41,41,55,69,78,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-11, 9, 41, -39, 62, 23, 28, -43, -8, 39, 5, 17, -54, 80, 55, 76, -15, 59, 34)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-43,-39,-15,-11,-8,5,9,17,23,28,34,39,41,55,59,62,76,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 9, 89, 84, 36, -19, 81, 28, 54, -91, -93, 91, -13, 63, -67, 63)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-91,-67,-19,-13,9,26,28,36,54,63,63,81,84,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 16, 35, 99, 17, 85, 71, -80, 9, 39, -57, 27, -32, 5)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-57,-32,5,9,16,17,23,27,35,39,71,85,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 35, -88)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,35,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-33, 87, 19, 86, 11, 23, -8, 39, 77, -62)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-33,-8,11,19,23,39,77,86,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, -23, 34, 57, 96, 51, -96, -24, 37, 32, -80, 63, 51, 2, -28, 96, 15)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-80,-28,-24,-23,2,15,32,34,37,41,51,51,57,63,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 48, 86, 88, 39, 12, -40, 8, 78, -68, 37, 58, -65, 8, 58, 24, 44, 59)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-65,-40,8,8,12,24,37,39,44,48,58,58,59,74,78,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, 69, 18, 96, 12, -80)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,12,18,69,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, 81, 4, 39, 34, 44, 31, 63, 22)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,22,31,34,39,44,63,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, -56, 97, -33, -84, 48, 51, 97, 13, 77, 85, 53, 50, -95, 93, 10, -85, 94, 58)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-85,-84,-56,-33,10,13,24,48,50,51,53,58,77,85,93,94,97,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 43, 4, 21, 4, 63, 54, 85, 26, 27, -3, 55, 28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,4,4,21,26,27,28,43,54,55,63,76,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-57, 60, 67, 52)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,52,60,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-27, 53, -62, 22, 44, 75, 4, 4, 98, 92, 69, 91, 67, -17, 42, -6, 8, -93)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-62,-27,-17,-6,4,4,8,22,42,44,53,67,69,75,91,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, -16, 22, 27, 82, -57, -56, 83, 52, 71, -51, -63, 50, 17, 21, 61)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-57,-56,-51,-16,17,21,22,27,50,52,61,61,71,82,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 52, 69, 90, 77, 30, -10, 53, 93, 4)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,4,30,52,53,69,77,90,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 55, 27, 96, 41, 60, 72, 98)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,40,41,55,60,72,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38, 62, 61, 82, 69, -96, 56, -34, 78)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-34,38,56,61,62,69,78,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(69, -47, 39, 29, -70, 17, 38, -72, -3, 92, 7, 46, 64, 46, -35, 18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-70,-47,-35,-3,7,17,18,29,38,39,46,46,64,69,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 23, 85, 55, 98, -54, 24, 95, 57, 59, -70)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-54,1,23,24,55,57,59,85,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, 94, 99, 19, 78, 28, -91, 58, 64)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,19,25,28,58,64,78,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(38)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, -85, 13, -49, 83, 26, 54, 21, 70, 88, 48, -14, 39, 84)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-49,-14,13,21,26,39,48,54,70,81,83,84,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-53, 19, 96, -92, 43, 14, 96)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-53,14,19,43,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 77, -4, -24, 96, -20, 6)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-24,-20,-4,6,56,77,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-52, 12, 2, 68, 92, 64, 16, 91, 16, 87, -85, 99, 92, 58, 89, 36, 37, 46, 32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-52,2,12,16,16,32,36,37,46,58,64,68,87,89,91,92,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 17, -58, 69, 61, -96, 6, 1, -97, 98, 17, 10, -69, 98, -20)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-96,-69,-58,-20,1,6,10,17,17,43,61,69,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 34, -17, 97, 98, 62, 33)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,33,34,42,62,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 60, 46, 48, 2, 40, 52, 30, 93, 57, -60, 98, 65, -27, 3)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-27,2,3,11,30,40,46,48,52,57,60,65,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 37, -21, 77, -45, 94, 68, 33, 11, 6, 4, 18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-21,4,6,11,18,33,37,60,68,77,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 84, 62, 10, 19, 23, 27, 17, 21, 67, 20)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,17,19,19,20,21,23,27,62,67,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-92, 89, -26, 50, 27, 52)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-26,27,50,52,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-9, 68, 61, 79, 56, 73, 52, 88, 28, 27, 17, 35, 68)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,17,27,28,35,52,56,61,68,68,73,79,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 73, 28, 27, 8, 90, -47, -23, 64, 28, 80, 20, -56, 16, 35, 23, 71)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-47,-23,8,16,20,23,27,28,28,35,64,67,71,73,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 86, 95, 24, 25, 32, 99, 97, 81, 66, 75, 39, 89, 76, 90, 13)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,24,25,32,39,42,66,75,76,81,86,89,90,95,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 81, 21)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,21,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-57, 61, 69, 66, 8, 24, 20, -53, -74, 26, 16, 90, 31, 2, 74, 25, 79, 33)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-57,-53,2,8,16,20,24,25,26,31,33,61,66,69,74,79,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-75, 29, 77, -44, 83, 8, 26, 82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-44,8,26,29,77,82,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, -76, 76, 70, -72, 4, 48, -17, 44, 72, 44, 27, 40, 42)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-72,-17,4,27,40,42,44,44,48,48,70,72,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(55, 39, -41, 9, 42)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,9,39,42,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, 44, 51, 65, 23, 8, 5, 99, 35, 55, 48, 60, -88, -46, 78, 52, 15)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-46,5,8,15,23,35,44,48,51,52,55,60,65,78,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 29, 11, 42, 50, -72, 13)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,11,13,29,29,42,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 69, 88, 74, 50, -77, 81, 79, 24, 61, -35, -39, 97, 31)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-39,-35,24,31,50,61,65,69,74,79,81,88,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, 94, -61, 22, -67, 73, 84, 4, 0, 5, 66, 33, 43, 27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-61,0,4,5,22,27,33,43,49,66,73,84,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 42, 19, 38, 78, 48, 37, 2)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,9,19,37,38,42,48,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 3, 36, 48, 96, 88, -37, 21, 29, 97, 25, 76, 57, -80, -89, 5, 9)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-80,-37,3,5,9,9,21,25,29,36,48,57,76,88,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, -67, 52, 69, 90, 32, 14, 80, 89, 82, 83, 32, 17, 98, 55, 96, 21, 22, 12)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,12,14,17,21,22,32,32,52,55,61,69,80,82,83,89,90,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-45, 64, 49, -27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-27,49,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-5, -71, 91, 29, -4, -41, 82, -40, -67, 14, 72, 87, 82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-67,-41,-40,-5,-4,14,29,72,82,82,87,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 45, 63)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,45,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 41, -33, 93, 42)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,41,42,43,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 65, -21, 53, 36, -52, 81, 93, -37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-37,-21,36,53,59,65,81,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 34, -78, 12, 57, 6, 27, 87, 34, 84, 87, 47, 59)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,6,12,14,27,34,34,47,57,59,84,87,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 35, -2, 13, 22, 67, 97, 36, -20, 78, 64)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-2,13,22,35,36,56,64,67,78,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, -19, 33, -18, 96, -69, 79, 95, 28, 6, 94, 80, 86, 31, 15, 48, 25)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-19,-18,1,6,15,25,28,31,33,48,79,80,86,94,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 97, 80, 21, 53, 86, 4, 44, 3, -99, 86, -33, -84, 7, 40)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-84,-33,3,4,7,21,40,43,44,53,80,86,86,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-67, 92, -99, 36, 81, 13, -74, 77, 51, 38, 53)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-74,-67,13,36,38,51,53,77,81,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, -88, 54, 69, -59, -34, 92, 60, 26, -43, 31, 40, 21, 68)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-59,-43,-34,21,26,31,40,54,60,68,69,72,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 93, 28, 91, -22, 51, 21, 24, 56, -92, 82, 73, 88, -27, 88, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-27,-22,8,21,24,28,51,56,73,82,84,88,88,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-37, 34, 89, 85, 99, 80, 63, -69, 97, -50, -79, 62)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-69,-50,-37,34,62,63,80,85,89,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(85)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 71, 69, -4, 88, 38, 65, 12, 63, -77, 54, 4, -77, -92, 63, 64, 18, 39, 0)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-77,-77,-4,0,4,12,18,24,38,39,54,63,63,64,65,69,71,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 90, 8, 23, 95, 15, 14, 87, 18, 45, 72, 25)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,14,15,18,23,25,45,65,72,87,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 85, -27, 55, 33, 43, 90, -25, -97, 21, 37, -49, 74, 68, 53, 92)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-49,-27,-25,21,33,37,43,53,55,68,68,74,85,90,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, -40, 37, 41, 16, -4, 94, -11, 86, 86)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-11,-4,16,30,37,41,86,86,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 33, 36, 84, -51, 56, 27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,27,33,36,56,58,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 32, 85, 16, 83, -9, -49, -98, 43, 51)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-49,-9,16,32,43,51,79,83,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(39)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-22, -66, 8, 79, 66, 55, 72, 83, -65, 65, 54, -14, 51, 2, 36)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-65,-22,-14,2,8,36,51,54,55,65,66,72,79,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-53, 59, -57, 66, 39, 48, 27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-53,27,39,48,59,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, -25, -37, 22, -68, 22, 90, 54, 53, -28, 52, 54, 23, 63, 66, 37)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-37,-28,-25,22,22,23,37,52,53,54,54,58,63,66,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-10, 26, 13, 78, -68, -79)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-68,-10,13,26,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 86, 5, 61, -25, -43, 53, 88, 59, -39, 24, 94, 23, 28)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-39,-25,4,5,23,24,28,53,59,61,86,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, 92, 83, 66, -26, 99)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,66,83,92,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 81, -23, 44, 34, 71, 49, -55, 13)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-23,13,34,44,49,71,81,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 26, 10, 53, 8)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,10,26,53,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-43, -32, -21, 0, 16, 85)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,-32,-21,0,16,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 68, 9, -96, 54, 73, -18, 68, 96, 46, 28, -90, -17)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-90,-18,-17,9,13,28,46,54,68,68,73,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(55, -89, 87, -21, 53, 10, 30, 96, 91, -92, -25, 25, 8, 27)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-89,-25,-21,8,10,25,27,30,53,55,87,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 83, 48, 63, 4, -96, -3, 16, 92, 99, 67, 48, -14)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-14,-3,4,16,48,48,50,63,67,83,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 21, 59, -88, 31, 84, 9, 63, 5, -23, 48, 58, -60, 29, 73)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-60,-23,5,9,21,29,31,48,58,59,63,73,84,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-81, 37, -4, 52, 89, 75, 76)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-4,37,52,75,76,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 65, 99, 32, -57, -92, 12, 48, 18)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-57,12,13,18,32,48,65,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, -3, 25, 31, 56, 99, 98, 17, 88, 5, -80, 96)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-3,5,17,25,31,50,56,88,96,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, -11, 22, 4, -61)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-11,4,22,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 51, 47, 52, -64, 58, 82, 5, 47, 60, 47)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,5,40,47,47,47,51,52,58,60,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 34, 38, 28, 37, 36, -13, 3)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,3,27,28,34,36,37,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, -99, 76, -44, 8, -64, 56, -34, 51, 57, 44, 21, 45, 45, -90)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-90,-64,-44,-34,2,8,21,44,45,45,51,56,57,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 56, 20, -40, 64, 72, 72, 31, 2, -24, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-24,2,20,31,44,56,64,66,72,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(97, 24, 39)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,39,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 18, 57, 32)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,32,34,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 50, -62, 21, 46, 53, 32, 60)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,21,29,32,46,50,53,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-12)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9, 24, 56, 38, 64, 94, 25, 8, -33, 30, 98, 18, 54, 34)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,8,9,18,24,25,30,34,38,54,56,64,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, -2, -44, 3, 96, 38, 1, -78, 49, -15, 63, 63, 70, 42, 39, 23, 11, 5, 45)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-44,-15,-2,1,3,5,11,12,23,38,39,42,45,49,63,63,70,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, 26, -98, -59)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-59,26,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 55, 70)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,55,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, -66, 68, 91, 85, -82)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-66,68,78,85,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 94, 8, 63, 65, -69, 38, 50, 32, 75, 85, 57, -90, 63, 83, 65, 4, 87, 5)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-69,4,5,8,13,32,38,50,57,63,63,65,65,75,83,85,87,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 56)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 8, 32, 47, 87, 24, 8, 2, 45, 72, -97)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,2,8,8,24,32,32,45,47,72,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-67, 58, 41, 24, 33, 6, 44)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,6,24,33,41,44,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 97, 11, 88, -32, 2, 18, 43, -50, 73, 56, 2, 95)));
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-32,2,2,2,11,18,43,56,73,88,95,97]", resultFormatted);
    }
}

