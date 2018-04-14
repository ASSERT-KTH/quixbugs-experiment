package java_programs;


public class NEXT_PERMUTATION_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 4, 90, 42, 59, 77, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,4,90,42,77,46,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 97, -66, 3, 70, 7, 43, 75, 45, 46, 17, -56, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,97,-66,3,70,7,43,75,45,46,17,31,-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 65, 83, 68, 4, -54, -71, -27, 27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,65,83,68,4,-54,-71,-27,30,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 67, 53, 21, 38, 22, -89, 26, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,67,53,21,38,22,-89,75,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -37, 39, -11, 42, 45, -15, 47, 80, 17, 20, 86, -26, 57, 91, 59, 60, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-37,39,-11,42,45,-15,47,80,17,20,86,-26,57,91,59,62,60,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 32, 87, -11, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,32,87,59,-11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, -22, -88, -72, 24, 88, 90, 13, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,-22,-88,-72,24,88,90,95,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 2, 4, 5, -72, 72, 45, 77, 46, 78, 83, 89, 25, 59, 30, 62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,2,4,5,-72,72,45,77,46,78,83,89,25,59,31,30,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -51, 53, 71, 39, 25, 9, 60, 45, 78, 47, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-51,53,71,39,25,9,60,47,-80,45,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 7, 73, -11, 12, -17, 83, 52, 22, 23, -24, -58, 25, 92, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,7,73,-11,12,-17,83,52,22,23,-24,-58,92,-31,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 68, 21, 86, 57, 92, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,68,21,86,92,15,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -99, 98, 3, -68, -5, 69, 39, 8, 75, 15, 23, 59, 92, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-99,98,3,-68,-5,69,39,8,75,15,23,92,-64,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, -40, 55, 25, 9, 74, -91, 58, 90, 43, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,33,-40,55,25,9,74,-91,90,-79,43,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, -36, 4, 73, 74, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,-36,4,74,62,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -81, 34, 51, 70, 6, 88, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-81,34,51,70,6,89,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 67, 4, 21, 22, 94, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,67,4,21,79,22,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(40, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 98, -3, 50, 54, 55, 57, -75, 92, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,98,-3,50,54,55,57,-75,93,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 71, 90, 27, 44, 12, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,71,90,27,44,78,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, -71, 55, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,-71,56,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, -34, 66, 34, 68, 36, 8, 41, 43, 48, 49, -88, 26, -93, 60, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,65,-34,66,34,68,36,8,41,43,48,49,-88,26,-62,-93,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 65, 18, 4, 85, 29, 46, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,65,18,4,85,46,15,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -33, 2, 38, 7, 76, 45, 14, 17, -19, 53, 90, 26, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-33,2,38,7,76,45,14,17,-19,53,90,30,26,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 1, 97, -3, 84, 85, 70, -27, 26, -93, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,1,97,-3,84,85,70,-27,26,79,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 18, 35, 3, 69, -70, 6, 42, 27, 76, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,18,35,3,69,-70,6,42,76,12,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -34, 81, 19, 36, 69, 9, 11, -45, -78, 29, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-34,81,19,36,69,9,11,-45,-62,-78,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -52, 36, 26, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,14,-52,26,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 2, 51, -86, -43, 59, 11, 43, 60, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,2,51,-86,-43,59,11,43,78,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-69, 68, 5, 38, 41, 10, 77, 48, 49, -83, 50, 19, -20, 56, 25, 26, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,68,5,38,41,10,77,48,49,-83,50,19,-20,56,25,31,26,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 98, 3, 68, 54, 39, 58, 59, -60, 92, 14, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,98,3,68,54,39,58,59,-60,92,63,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 96, 48, 34, 39, 59, 60, 14, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,96,48,34,39,59,60,31,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 18, -69, 53, 7, -59, 12, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,18,-69,53,7,-59,46,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 83, 20, 53, 21, 86, 23, 10, 43, 28, 78, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,83,20,53,21,86,23,10,43,28,79,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 96, -39, 40, 46, 47, -80, 81, -84, 86, -92, 27, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,64,96,-39,40,46,47,-80,81,-84,86,-92,92,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 32, 65, 69, 39, 74, 43, 78, 81, 83, 84, 21, 90, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,32,65,69,39,74,43,78,81,83,84,26,21,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 2, 3, 68, 71, 7, 9, 73, 43, 77, 15, 19, 51, 86, -57, 25, -27, -63, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,2,3,68,71,7,9,73,43,77,15,19,51,86,-57,25,-27,94,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 4, -72, 41, 9, 43, -13, -46, -17, 48, 22, 55, 90, 27, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,32,4,-72,41,9,43,-13,-46,-17,48,22,55,90,62,27,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 64, 17, -3, 4, -5, 25, 74, -43, 29, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,64,17,-3,4,-5,25,74,-43,47,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 36, -53, -23, 40, -41, 24, 29, 13, 45, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,36,-53,-23,40,-41,24,29,13,95,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 49, 34, 36, 84, 69, -8, 7, 26, 91, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,49,34,36,84,69,-8,7,44,26,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -1, -66, 33, 98, 51, -22, 24, 72, 13, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-1,-66,33,98,51,-22,24,72,62,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 34, 2, 36, 41, 9, 12, 48, 51, 19, 22, -55, 86, 92, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,1,34,2,36,41,9,12,48,51,19,22,-55,92,-93,86]", resultFormatted);
    }
}

