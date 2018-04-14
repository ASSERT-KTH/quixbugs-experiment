package java_programs;


public class MERGESORT_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, 5, 62, 82, 68, 82, 26, -30, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,5,26,58,62,68,71,82,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 10, 33, 38, 62, 18, 68, -99, 76, 94, 65, 72, 7, 96, -66, -10, 8, 54, -68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-68,-66,-10,7,8,10,18,27,33,38,54,62,65,68,72,76,94,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 42, -3, 54, 69, 4, 33, 72, 45, 83, 10, 47, 11, 58, 87, 85, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,2,4,10,11,15,33,42,45,47,54,58,69,72,83,85,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(45, 27, 21, 59, -75, 46, -54, 83, 88, 10, -51, 43, 22, 59, 78, -72, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-72,-54,-51,10,18,21,22,27,43,45,46,59,59,78,83,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 3, -27, 90, 94, 77, -62, 83, 62, 77, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-27,3,28,41,62,77,77,83,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, -26, 47, 43, -63, 17, 69, 69, 22, -17, 3, -11, -24, 49, 90, 84, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-26,-24,-17,-11,3,13,17,22,43,47,49,67,69,69,84,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 87, 51, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,50,51,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-30, 77, 79, 23, 93, 54, -45, -96, 96, -42, 90, 8, 15, 52, -71, 53, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-71,-45,-42,-30,8,13,15,23,52,53,54,77,79,90,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 21, 9, 50, 82, 72, 53, 32, 66, 5, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,5,9,21,32,32,50,53,66,72,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 95, -17, 89, 11, 8, 20, -19, 55, 26, 96, -76, 80, 49, 82, 46, 68, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-19,-17,8,11,20,26,43,46,49,55,68,80,82,89,95,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-70, 15, 47, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,15,47,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(22, 45, 3, 23, 21, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,21,22,23,45,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, 49, -99, 60, 89, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-88,49,60,89,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, -55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-12, 11, 46, -63, 18, 50, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-12,8,11,18,46,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 43, -35, 69, 48, 19, -87, 69, 74, -10, 92, -83, 63, 35, 37, 23, 92, 55, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-83,-35,-10,14,19,23,35,37,43,48,55,63,69,69,70,74,92,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, 50, 17, 5, 53, -96, 84, -29, -83, -97, 61, 75, 79, 89, -97, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-97,-96,-83,-29,5,14,17,32,50,53,61,75,79,84,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 13, 65, -85, 47, 20, -5, -41, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-41,-5,0,7,13,20,47,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 70, 82, -65, -15, 53, 27, 54, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-15,27,42,53,54,70,82,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, -84, 89, 33, 46, 59, 72, 63, -49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-49,33,46,59,63,72,72,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(62, 35, -62, 98, 36, -15, 21, -37, 74, 90, -94, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-62,-37,-15,21,35,36,62,74,90,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 89, 72, 37, 38, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,38,46,58,72,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 87, 2, -87, 96, 50, 72, 43, 17, 18, 20, 71, 33, 85, -55, 68, 45, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-55,2,8,17,18,20,33,43,45,50,53,68,71,72,85,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 95, 11, -76, 33, 38, 99, 6, -9, 25, -48, 42, -28, 41, 15, 45, 33, -70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-70,-48,-28,-9,6,11,15,25,33,33,35,38,41,42,45,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(39, 72, 9, 97, -16, -80, 32, 17, -92, 45, 82, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-80,-44,-16,9,17,32,39,45,72,82,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 16, 86, 93, -65, 97, 0, 55, 86, 59, 58, 37, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,0,16,37,48,55,58,59,77,86,86,93,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87, -10, 10, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,10,68,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-12, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 58, 90, -19, 80, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,53,56,58,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-55, 20, 39, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,20,23,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, -22, 29, -66, 42, 3, 21, 61, -69, -54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-66,-54,-22,3,21,29,42,44,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87, 16, 48, 65, 1, 60, 40, 28, 52, 9, -2, -5, 70, 15, 3, 97, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,-2,1,3,9,15,16,28,40,48,52,60,65,70,84,87,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 21, 15, 61, 34, 78, 72, 81, 88, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,15,21,34,61,72,78,81,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, -56, -86, 25, -19, 64, 15, 89, -25, -7, 53, -46, 38, 98, 19, 84, -30, 17, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-56,-46,-30,-25,-19,-7,15,17,19,25,38,46,53,64,84,89,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, -97, 93, 91, -69, 22, 90, 7, 32, 7, 33, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-69,7,7,22,32,33,43,90,91,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(71, -35, 94, 59, 73, 56, 8, 97, 47, 32, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,8,32,32,47,56,59,71,73,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(78, -29, -27, 61, 47, 69, 6, -34, 24, 64, 51, 80, 96, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,-34,-29,-27,6,24,47,51,61,64,69,78,80,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 6, -22, 22, -98, 74, 9, 54, 61, 26, 42, -70, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-70,-22,6,9,22,26,42,53,54,61,74,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, 84, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,81,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(16, -93, 19, -80, -23, 14, -3, -91, 28, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-91,-80,-23,-3,14,16,19,28,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(98, -38, 56, 24, -30, -48, 40, 83, 91, 11, 92, 41, 72, 81, 98, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-38,-30,11,24,40,41,56,65,72,81,83,91,92,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-64, 81, -29, 30, -78, -21, 49, -22, 12, -55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-64,-55,-29,-22,-21,12,30,49,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 36, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,15,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(19, 19, 53, 5, 68, -29, -8, 27, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-8,5,19,19,27,53,68,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-28, 94, 23, 19, 61, -99, 2, 37, -36, 0, 22, 19, 29, -74, 13, -41, 61, -91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-91,-74,-41,-36,-28,0,2,13,19,19,22,23,29,37,61,61,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(22, 70, 49, -94, 40, -14, 63, 33, 27, 80, 99, 60, 70, 6, 84, 64, -22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-22,-14,6,22,27,33,40,49,60,63,64,70,70,80,84,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(39, 25, 7, 17, -48, 63, 68, 40, -36, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-36,7,17,25,39,40,52,63,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, -89, 43, 26, 86, 16, -98, 2, 45, 96, -59, 52, 2, -68, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-89,-68,-59,2,2,16,26,40,43,45,52,69,86,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 80, 7, -22, -78, 2, 34, 62, 92, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-22,2,5,7,34,62,65,80,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 91, 45, 27, 0, 23, 11, 87, 97, 12, 62, 11, 87, 99, 34, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,11,11,11,12,23,27,34,45,62,86,87,87,91,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, 62, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,62,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 0, 2, 8, 30, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,8,20,30,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 78, 3, 31, 21, 17, 2, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,17,21,31,69,78,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, -61, 30, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,30,34,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-31, 34, 79, 84, 32, 27, 49, 84, -55, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-31,27,32,34,47,49,79,84,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 87, 37, 25, 64, 5, -71, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,5,23,25,27,37,64,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-63, 34, 25, -19, -85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-63,-19,25,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 21, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,53,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-42, -9, 48, 28, 28, 91, 26, 76, -45, 84, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-42,-9,8,26,28,28,48,76,84,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 58, 50, 47, -21, 89, 45, 20, 15, 10, -74, 74, 1, 2, 84, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-21,1,2,10,15,18,20,45,47,50,58,73,74,84,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(22, -88, 74, 72, 75, 53, 53, 42, 65, 31, 15, -52, -70, 25, 28, -71, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-71,-70,-52,15,18,22,25,28,31,42,53,53,65,72,74,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(25, -25, 68, 62, 5, -35, 18, 89, 7, 78, 50, 58, 36, 36, 3, 51, 43, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-25,3,5,7,18,25,36,36,43,50,51,54,58,62,68,78,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 73, -19, 97, 26, 27, 81, 16, 10, -94, 39, 88, 32, -3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-19,-3,10,16,26,27,32,39,40,73,81,88,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, 43, 3, 30, 81, 43, 51, -82, 66, -67, 42, 52, 99, 44, 29, 28, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-67,3,6,28,29,30,42,43,43,44,46,51,52,66,81,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 98, 23, 74, 56, 3, 73, 71, 46, 4, 68, 0, -1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,0,3,4,23,35,46,56,68,71,73,74,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 52, 79, 99, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,24,52,79,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 27, -63, 32, 79, 12, 29, 19, -78, 95, 4, -19, 78, 10, 54, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-63,-19,4,10,12,19,27,29,32,34,54,77,78,79,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 29, 47, 53, 18, -87, -68, 48, 22, -27, 21, -87, 47, -65, 70, 48, 13, -84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-87,-84,-68,-65,-27,13,18,21,22,29,47,47,48,48,50,53,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 54, 24, 16, 24, 56, 31, 10, 44, -40, 59, 46, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,0,10,16,24,24,31,39,44,46,54,56,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 50, 11, 3, 48, 3, -57, 77, 58, 91, -65, 90, -87, 52, -41, 78, 7, 75, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-69,-65,-57,-41,3,3,7,11,48,50,52,58,64,75,77,78,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 83, 93, 65, 68, 33, 77, 46, -2, 95, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,33,41,46,64,65,68,77,83,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-70, 34, 56, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-70,34,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 93, -6, 19, 96, 33, 97, -45, 50, -86, 25, -54, 16, -5, 8, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-54,-45,-6,-5,8,16,19,25,33,50,65,89,93,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 8, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,53,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(23, 17, 47, 92, -55, 67, 35, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,17,21,23,35,47,67,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(27, 34, 53, -50, -54, 76, 79, 63, 26, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-54,-50,26,27,34,53,63,76,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 40, 58, 5, 24, -86, 75, -17, 18, -14, 40, 44, 12, 76, 18, 93, 64, 44, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-17,-14,5,12,18,18,24,35,40,40,44,44,58,64,75,76,76,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87, 35, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,58,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 71, -63, 91, 2, 42, 94, -26, 46, 38, 25, 7, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-26,2,7,11,25,38,42,46,59,71,91,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-61, -88, 53, 97, 14, 54, 3, 45, 32, 8, 67, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-61,3,8,14,32,42,45,53,54,67,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 41, 13, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,24,41,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, 10, 47, 96, 34, -13, 75, -79, 37, 3, -45, 72, 19, 21, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-45,-13,3,10,16,19,21,34,37,43,47,72,75,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 18, 21, 26, 30, 86, -52, 78, 91, 52, 98, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,18,21,25,26,30,52,67,78,86,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-50, 22, 92, 95, 60, 14, 8, 39, 67, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,1,8,14,22,39,60,67,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 63, 76, 11, 41, 76, 82, 62, 14, 73, 71, -41, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,8,11,14,32,41,62,63,71,73,76,76,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 52, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,40,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, -30, 86, 52, 53, 66, 54, 67, 47, 47, 32, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,32,32,47,47,52,53,54,66,67,69,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 19, 49, 16, 19, 72, 6, 84, 88, 4, 38, 71, 10, 48, 42, 54, -5, 97, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,4,6,10,12,16,19,19,38,42,48,49,54,71,72,84,88,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(80, 28, 89, 58, 69, 17, 54, 58, 38, 61, -70, -74, 86, 79, 94, 13, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-70,13,17,28,34,38,54,58,58,61,69,79,80,86,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 21, -37, 66, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,21,39,66,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, -74, 47, -64, 83, 0, 68, 66, 12, 42, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-64,0,12,40,42,47,66,68,72,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 17, 72, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,17,31,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 26, 30, -93, 29, -96, -19, 82, 97, 39, 40, 21, 65, 89, 94, 26, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-93,-19,21,24,26,26,29,30,39,40,65,82,89,94,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-30, 54, 75, 34, -29, 76, 67, 13, 27, -75, -21, -45, -78, 95, 86, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-75,-45,-30,-29,-21,13,27,34,54,67,75,76,79,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, -77, 43, -42, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-42,41,43,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(94, 87, 16, 1, 74, 85, 37, 82, -23, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,1,16,37,65,74,82,85,87,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[72]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 95, 60, -71, 93, 92, -33, 76, 11, 74, 53, -78, -50, 70, 88, 89, 60, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-71,-50,-33,11,13,28,53,60,60,70,74,76,88,89,92,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(96, 38, 38, 98, 23, 24, 75, -4, -58, 6, 59, 33, 8, 48, 52, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-44,-4,6,8,23,24,33,38,38,48,52,59,75,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 96, 33, 22, 87, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,33,43,56,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(47, 48, 52, 44, 33, -86, 57, 11, 71, 36, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,11,33,36,44,47,48,52,57,71,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-97, 86, 41, -18, 83, 28, 11, -81, 9, 58, 8, 77, 18, -40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-81,-40,-18,8,9,11,18,28,41,58,77,83,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 59, 76, 90, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,65,67,76,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(29, 29, 95, 75, 9, 42, 53, 31, 11, 98, -73, 28, 95, 23, -51, -37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,-51,-37,9,11,23,28,29,29,31,42,53,75,95,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 34, 65, 26, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,18,26,34,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, 24, 35, -30, 12, 89, 63, 22, 21, 83, 76, 67, 12, 71, 14, 72, 54, 31, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,0,12,12,14,17,21,22,24,31,35,54,63,67,71,72,76,83,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(56, 65, -78, 71, 59, 45, 17, 91, 13, 53, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-76,13,17,45,53,56,59,65,71,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(41, 44, 89, 63, -68, 96, 26, 38, 10, 7, 50, 31, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,7,10,26,31,38,41,44,50,63,89,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, -25, 9, -40, 41, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-25,9,28,41,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-21, 62, 2, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,2,62,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(89, 27, 2, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,27,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 59, 49, 61, 55, 26, 51, 65, 18, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,26,40,49,51,55,59,61,65,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-92, 95, -84, 35, -43, 33, 17, 88, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-84,-43,17,33,35,51,88,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-3, 77, 99, 89, 16, 89, 9, 67, 28, 41, 85, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,9,16,28,41,67,77,85,89,89,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, -58, -98, 52, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-58,52,67,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 37, 91, -10, 80, 73, 67, 74, 83, 40, 89, 33, 79, 96, 89, 89, 11, 98, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,11,33,37,40,55,67,72,73,74,79,80,83,89,89,89,91,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, -76, 73, 78, 75, 64, 63, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,19,51,63,64,73,75,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, -41, 62, 95, 12, 68, 5, 77, 54, -82, 31, 38, 11, -14, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-41,-14,5,11,12,18,31,38,54,62,68,77,82,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 32, 14, 41, 47, 95, 61, -25, 95, 89, 15, 65, 87, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,-16,14,15,26,32,41,47,61,65,87,89,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, -23, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,26,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 81, -15, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,13,36,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(37, 15, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,20,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(8, 45, 88, 25, 49, 20, 30, 0, 48, 8, 56, -47, 98, -40, 37, 36, 20, -11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-40,-11,0,8,8,20,20,25,30,36,37,45,48,49,56,88,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(66, 69, 18, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,18,66,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, -32, 85, 38, -65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-32,38,70,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 72, -49, 90, 44, 49, -2, 57, 8, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-2,8,29,44,49,57,72,72,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, -57, 58, 46, 74, 64, 17, 1, 45, -27, -88, 54, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-57,-27,1,2,17,20,45,46,54,58,64,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(20, 40, 85, 75, -84, 14, 90, 80, 60, -55, 23, 73, -31, 13, 11, 78, 32, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-55,-31,11,13,14,20,23,32,40,60,73,75,78,80,85,87,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 14, -7, 83, 52, 3, 11, 73, -93, 85, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-7,3,10,11,14,52,70,73,83,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 10, 23, 10, 79, -51, 64, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,10,10,23,28,31,64,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, -21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, 53, 18, 81, 79, 58, 7, 17, -74, 22, 8, 93, -22, -35, 21, 70, 92, -29, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-35,-29,-22,-19,7,8,17,18,21,22,53,58,70,79,81,82,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(50, 25, 7, 3, 28, -54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,3,7,25,28,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 60, 89, 77, 65, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,42,60,65,77,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, 18, 43, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,18,43,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-76, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 40, 22, 84, 41, -71, 58, 72, 83, 38, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,22,38,40,41,57,58,72,76,83,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(32, -21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 24, 57, -61, 89, 8, 0, 63, 11, 29, 65, 55, 68, 37, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,0,8,11,24,29,37,49,55,57,63,65,68,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 81, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,79,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, -43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(43, -71, 37, 60, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,37,43,56,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 57, -60, 58, 63, 31, 53, -42, -56, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-56,-42,31,53,57,58,62,63,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 19, -80, 95, 18, 85, 67, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,18,19,42,67,85,88,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 57, 43, 16, 58, 22, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,18,22,43,57,58,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(77, 86, 63, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,63,77,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, -88, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,14,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-8, 78, 87, 39, 69, 84, 89, -88, 25, 47, 87, 18, 42, 39, 24, 99, 10, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-8,10,18,20,24,25,39,39,42,47,69,78,84,87,87,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(31, 98, -97, 48, 6, 39, 74, -58, 45, 60, -70, -55, 34, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-70,-58,-55,6,24,31,34,39,45,48,60,74,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(4, 92, 4, -99, -46, 30, 59, 88, 79, 39, 48, 62, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-46,4,4,30,39,48,59,59,62,79,88,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(53, 17, -43, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-43,17,44,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 60, 4, 38, 43, 53, -48, 73, 62, -18, 74, 9, -94, -22, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-48,-47,-22,-18,4,9,38,43,53,60,62,73,74,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-36, -47, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-36,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 25, 24, 40, 7, 96, -78, 54, 18, 96, 19, 96, 32, 77, -64, 45, 39, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-64,0,7,18,19,24,25,32,35,39,40,45,54,77,96,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 13, 7, -50, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,1,7,13,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(99, 29, 22, 94, 94, 29, -89, 25, -74, -53, 38, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-89,-74,-53,22,25,29,29,38,94,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 36, 22, 82, 89, 78, 82, 3, 52, 67, 98, 3, 34, 2, -57, 88, 38, 28, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,2,3,3,22,28,34,36,38,52,60,67,67,78,82,82,88,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 18, 21, 8, 45, 62, -26, -70, 97, 99, 19, 76, 12, 17, 48, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-53,-26,8,12,17,18,19,21,45,48,57,62,76,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, -37, -22, 71, -97, 48, 17, -94, -52, -81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-94,-81,-52,-37,-22,5,17,48,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(82, -37, -76, 86, 56, -47, 16, 24, 47, 37, 41, 69, 42, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-47,-37,16,24,37,41,42,47,56,64,69,82,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 55, 95, 19, 53, 92, 91, 48, -5, 98, 58, 73, 37, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-5,19,37,48,53,55,58,73,74,91,92,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(11, -81, 57, 51, 53, -33, 45, -82, 44, -94, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-82,-81,-33,11,44,45,51,53,57,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 37, -82, 37, -14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-14,2,37,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(15, 33, 86, 9, 35, 5, 20, 60, 8, 92, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,5,8,9,15,20,33,35,60,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(40, 1, 40, -16, 12, 19, 55, 20, 10, 44, 53, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,1,8,10,12,19,20,40,40,44,53,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 35, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,76,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 53, 96, 41, 45, -76, 26, 58, 83, 14, -11, -71, -12, 79, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-71,-12,-11,14,26,36,41,45,53,58,61,79,83,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-72, -7, 26, 57, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-7,26,57,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-66, 19, 8, 31, 27, 26, -5, 97, 64, 85, -90, 58, 42, 5, 68, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-66,-5,5,8,14,19,26,27,31,42,58,64,68,85,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-46, -98, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-46,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(81, 60, 17, 93, 78, 26, 10, 85, 0, 85, 24, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,10,17,24,26,60,78,81,85,85,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 2, 87, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,59,84,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(64, 39, 63, 11, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,39,45,63,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-12, 70, 29, 68, 43, 72, 65, -62, 1, 7, 60, 3, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-12,1,3,7,29,43,60,65,68,70,72,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(44, -36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(79, 9, 67, 68, 19, 5, -13, 39, 47, -90, 24, 89, -36, 58, 58, 39, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-36,-13,5,9,11,19,24,39,39,47,58,58,67,68,79,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(65, 24, 26, 39, 36, 2, 57, 82, 50, 91, -85, -92, 59, 79, 68, 9, 46, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-85,2,9,24,26,36,39,46,50,57,59,65,68,79,82,84,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-62, 66, 49, 22, 20, 77, 20, 46, -69, -5, 97, 33, 81, -92, -17, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-69,-62,-17,-5,20,20,21,22,33,46,49,66,77,81,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(91, 29, 21, 32, 58, 92, 68, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,29,32,58,68,68,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-73, 17, -43, -28, 30, -86, 31, 39, 94, 51, 78, 47, 19, 91, -37, 60, 98, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-73,-43,-37,-28,17,19,19,30,31,39,47,51,60,78,91,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-74, 48, 76, 13, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,13,37,48,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(13, 2, 10, 32, 93, 2, -77, 63, -38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-38,2,2,10,13,32,63,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-53, 96, 26, 1, 85, -6, 36, 45, 93, 81, 76, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-6,1,26,36,45,76,81,84,85,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, 68, -20, 64, -65, 46, -79, 94, 74, -1, 94, 53, 94, -85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-79,-65,-20,-1,46,53,64,68,74,94,94,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-69, 1, 49, 81, -11, 86, 36, 23, 49, -22, -65, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-65,-22,-11,1,23,36,49,49,59,81,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 6, 19, -9, 44, -48, 61, -54, -64, -97, 36, 41, 49, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-64,-54,-48,-9,6,16,19,36,41,44,49,61,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(76, 41, 22, 72, 94, 3, -97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,3,22,41,72,76,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(1, 67, 91, 86, 73, 62, 74, 24, 16, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,16,23,24,62,67,73,74,86,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, 52, 61, 67, -21, 62, 53, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,52,53,61,61,62,67,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 74, -89, 15, 2, 57, -42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-42,2,5,15,57,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(86, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 65, -35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,33,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-22, 51, -86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-22,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-33, 23, 76, 0, 49, 64, 0, 36, -25, -2, 94, -61, 42, 6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-33,-25,-2,0,0,6,23,36,42,49,64,76,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 43, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,43,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-17, 80, -78, 25, 93, 63, 12, 91, -92, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-92,-78,-17,12,25,63,80,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(93, 30, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,92,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(21, 48, 46, 15, 23, 43, 82, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,15,21,23,43,46,48,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(0, 85, -8, 62, 30, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,0,30,35,62,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(73, 87, 84, 3, 95, -56, 33, 95, 94, 21, 58, -59, 5, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-56,3,5,21,33,58,73,84,87,91,94,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-42, -42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-42]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 65, 95, 80, -8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,54,65,80,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(63, 27, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,27,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(42, 83, 27, 71, 67, 28, 26, -66, 46, 12, -31, 68, 51, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-31,12,25,26,27,28,42,46,51,67,68,71,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, 64, 42, 15, -84, 14, 38, 36, 71, -4, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-4,14,15,36,38,42,50,64,70,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-81, 42, 67, 81, 48, -38, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-61,-38,42,48,67,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 58, -30, 72, 91, 78, 44, 55, -27, -99, 0, 78, 69, 15, -93, 34, -84, 28, -81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-93,-84,-81,-30,-27,0,15,28,34,44,55,58,69,72,78,78,83,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, 8, 22, -74, -54, 39, 58, 18, 91, 89, 26, 88, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-54,8,10,10,18,22,26,39,58,88,89,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 28, -19, 6, 89, 29, 59, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,6,28,29,33,59,71,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(92, 77, 63, -43, -76, 10, 30, 68, -8, -54, 39, 54, 33, 8, 86, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-54,-43,-8,8,10,24,30,33,39,54,63,68,77,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 16, 6, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,6,16,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(6, 4, 19, 47, 10, 45, 13, -42, -16, 10, 69, 1, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-16,1,4,6,10,10,13,19,45,47,69,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 91, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,85,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-99, 72, 35, -93, 23, 17, 87, 92, 91, -94, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-94,-93,17,23,35,72,87,91,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(51, -2, 26, 1, 40, 98, 70, 49, -97, 49, -43, -7, 86, 27, -52, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-52,-43,-15,-7,-2,1,26,27,40,49,49,51,70,86,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(10, -9, 43, 31, 55, 68, 61, 92, -60, 60, 50, -53, 2, 96, 46, 53, -51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-53,-51,-9,2,10,31,43,46,50,53,55,60,61,68,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(60, 93, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,60,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, -43, 2, 0, 66, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-43,0,2,66,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33, 14, 88, 55, 17, 82, 92, -27, 88, -40, 97, -62, 94, 18, 92, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,-40,-27,14,17,18,33,35,55,82,88,88,92,92,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(70, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(54, 67, 54, 11, 10, 86, 43, -68, -70, 83, 99, 90, 89, 87, 22, 87, 56, -10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-68,-10,10,11,22,43,54,54,56,67,83,86,87,87,89,90,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(61, 61, 87, 93, 13, 42, -49, 17, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,13,17,42,50,61,61,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(59, 21, -65, 62, 83, -48, 48, 21, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-48,21,21,48,59,62,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(72, -98, -42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-42,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-67, 20, 32, 7, 23, 30, 60, 92, 64, 96, 36, 17, 54, -12, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-12,7,17,20,23,30,32,36,54,60,64,73,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 54, -14, 64, 4, 64, 57, 46, -29, 18, -15, 4, -88, -16, 35, 70, 75, 22, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-29,-16,-15,-14,4,4,18,22,34,35,46,54,55,57,64,64,70,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-79, 28, 92, 0, 90, 23, -16, 68, 47, -38, 94, -66, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-66,-38,-16,0,23,28,47,57,68,90,92,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(48, 40, 6, -13, 23, 95, 81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,6,23,40,48,81,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-90, 49, 0, 67, 34, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,0,34,49,67,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(46, -55, 86, 31, 30, 94, 9, -78, 66, 76, 90, -55, 41, -54, 89, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-78,-55,-55,-54,9,30,31,41,46,66,76,86,89,90,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(95, 51, 0, 45, 48, -98, -35, 25, 55, 42, 65, 46, 90, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-35,0,25,42,45,46,48,51,55,65,77,90,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(35, 18, 68, 85, 47, 17, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,18,35,47,68,85,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 21, 54, 65, 33, -67, 10, 90, 74, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,1,10,21,33,54,65,74,84,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(83, 50, -38, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,50,83,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(12, 89, 63, 62, 77, 34, 25, 16, 0, 95, -33, 45, 76, 14, 87, 95, -21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-21,0,12,14,16,25,34,45,62,63,76,77,87,89,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, -59, 45, -32, 86, 24, 98, 6, 49, 85, -18, 42, 94, -7, 31, 70, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-32,-18,-7,6,18,24,31,42,45,49,59,70,85,86,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(84, 53, 22, -2, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,11,22,53,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(17, -20, 6, 56, 9, 12, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,6,9,12,17,29,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(14, 51, -72, 11, 56, 8, 63, 95, 22, 35, 68, -52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-52,8,11,14,22,35,51,56,63,68,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(26, 13, 56, -25, 65, 51, 11, 44, 42, 8, -92, 84, 74, 22, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-25,8,11,13,22,26,42,44,51,56,65,74,84,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(5, 29, 92, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,29,44,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 84, 40, 34, 75, -27, 6, 93, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,6,30,34,40,74,75,84,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(57, 11, 19, 93, 57, 6, -13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,6,11,19,57,57,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-48, 95, 99, -61, 81, 54, -34, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-48,-34,54,65,81,95,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(49, 98, 94, 75, 92, 3, -66, 79, 86, -89, 95, 44, 40, -72, -22, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-72,-66,-22,3,40,44,49,63,75,79,86,92,94,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-63, -71, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-63,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(58, 59, 11, -98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,11,58,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-82, 44, 43, 42, 58, -12, 36, 82, 89, -37, 33, -56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-56,-37,-12,33,36,42,43,44,58,82,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 80, 27, 60, 85, 63, 67, 69, 99, 68, -12, 97, 55, 14, 80, 87, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,2,14,27,55,60,63,67,68,69,80,80,85,87,91,97,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(18, 59, 33)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,33,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(68, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(88, -68, -14, 10, 33, 24, 60, 74, 44, 21, -53, 86, 89, 91, 91, 87, -35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-53,-35,-14,10,21,24,33,44,60,74,86,87,88,89,91,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(2, 48, -20, 59, 3, 29, 41, 91, -89, 19, 95, 11, 76, 75, 25, 16, 24, 85, -22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-22,-20,2,3,11,16,19,24,25,29,41,48,59,75,76,85,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(34, 66, 12, 84, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,32,34,66,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(30, 93, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,51,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(-50, 71, 8, 30, -84, 74, 91, 60, 82, -69, 57, 91, 76, 54, 2, 72, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-69,-50,2,8,30,54,57,60,68,71,72,74,76,82,91,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(74, 68, 82, -94, 86, -16, -10, 52, 31, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-16,-10,13,31,52,68,74,82,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(67, 0, 71, 68, 89, -46, 29, -49, 97, -97, 44, 12, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-49,-46,0,12,29,44,67,68,71,73,89,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.MERGESORT.mergesort(new java.util.ArrayList(java.util.Arrays.asList(24, 10, -36, 71, -23, 95, -26, -34, 85, 78, -63, 21, 74, 11, 52, 83, 63, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-36,-34,-26,-23,10,11,12,21,24,52,63,71,74,78,83,85,95]", resultFormatted);
    }
}

