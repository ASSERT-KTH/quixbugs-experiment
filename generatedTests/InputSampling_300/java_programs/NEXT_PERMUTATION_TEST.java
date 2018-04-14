package java_programs;


public class NEXT_PERMUTATION_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -3, -5, 69, 72, 11, 12, 78, 82, 57, 28, -63, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-3,-5,69,72,11,12,78,82,57,28,94,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 82, -37, 84, 21, -7, 39, 87, 8, 43, 45, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,82,-37,84,21,-7,39,87,8,43,78,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 4, 23, 77, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,4,30,23,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 53, 23, 39, 56, 74, -75, 91, -61, 44, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,53,23,39,56,74,-75,91,-61,78,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 96, 43, -12, 75, -15, 79, 49, 17, 21, 55, 87, 56, -90, -58, 90, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,96,43,-12,75,-15,79,49,17,21,55,87,56,-90,28,-58,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 7, 56, -27, -93, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,7,56,-27,31,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, -73, 9, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,-73,74,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, -2, -3, 99, 67, 40, 74, 42, -75, 13, -81, 17, 23, 87, 58, 60, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-2,-3,99,67,40,74,42,-75,13,-81,17,23,87,58,93,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 64, -66, -4, -85, 22, 71, 90, 27, 59, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,64,-66,-4,-85,22,71,90,30,27,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 2, 99, 6, -39, 55, 42, -44, 12, -94, 78, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,2,99,6,-39,55,42,-44,12,-64,-94,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 23, 8, -57, 40, 25, -59, 59, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,23,8,-57,40,25,45,-59,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 74, 10, -45, 12, 77, 81, 18, 83, 51, 19, 23, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,74,10,-45,12,77,81,18,83,51,19,25,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 36, 24, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,36,94,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 37, 72, 74, 11, 44, 46, -81, -18, -20, 19, 83, -89, 25, 27, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,37,72,74,11,44,46,-81,-18,-20,19,83,-89,25,93,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 49, -20, 23, 9, 74, 29, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,33,49,-20,23,9,74,29,63,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 17, 33, 49, 7, -11, 27, 44, 94, 30, 47, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,17,33,49,7,-11,27,44,94,31,30,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 1, 33, -2, 34, 4, 71, 42, 77, 14, 47, 17, 58, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,1,33,-2,34,4,71,42,77,14,47,17,58,62,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 83, 99, 86, 22, 88, 10, 26, 44, 60, 45, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,83,99,86,22,88,10,26,45,13,44,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 4, 37, -71, 6, 88, 76, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,4,37,-71,6,88,79,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 2, -76, 43, 12, 77, -79, -80, -17, 83, 85, 53, 22, 59, 28, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,2,-76,43,12,77,-79,-80,-17,83,85,53,22,59,60,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 83, -52, 85, -6, -7, 40, -42, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,83,-52,85,-6,40,-78,-42,-7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 84, -74, 25, 26, 91, 61, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,84,-74,25,61,15,26,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 53, 22, 11, 28, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,53,22,28,-80,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 67, 3, 36, 40, -50, 51, 22, 54, 88, 24, 27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,67,3,36,40,-50,51,22,54,88,24,30,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 18, 67, 99, 84, -5, 70, -56, -40, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,18,67,99,84,-5,70,-56,56,-40]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 5, 85, -8, 25, 90, 91, -47, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,5,85,-8,25,90,91,30,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 34, 4, 37, 55, 87, 24, 41, -75, 27, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,34,4,37,55,87,24,41,-75,76,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 68, 9, -76, 14, 47, 85, 22, 55, 57, 58, -63, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,68,9,-76,14,47,85,22,55,58,-96,-63,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 82, 98, 85, -39, 25, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,82,98,85,-39,60,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 50, 54, 6, 86, -44, 12, 62, 15, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,50,54,6,86,-44,12,62,31,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 8, 57, 26, 47, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,8,57,31,26,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -2, 34, 18, 66, 71, 12, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-2,34,18,66,71,31,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, 3, 85, 21, 53, 22, 70, 41, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,65,3,85,21,53,22,70,63,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 2, 37, -40, 40, 72, 75, 44, 76, 15, 18, -86, 89, 60, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,2,37,-40,40,72,75,44,76,15,18,-32,-86,60,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 35, 68, 85, 86, 70, 25, 90, 91, 75, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,33,35,68,85,86,70,25,90,91,93,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(27, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 35, -56, 7, 8, 42, 78, -47, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,35,-56,7,8,42,78,30,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 18, -36, 37, 25, 26, 91, 44, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,18,-36,37,25,44,-29,26,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 68, 40, 10, 44, 49, 18, 21, 53, 56, 25, 27, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,32,68,40,10,44,49,18,21,53,56,25,59,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -7, 70, 7, 73, 10, 78, 14, -48, -81, 80, -26, 89, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-7,70,7,73,10,78,14,-48,-81,80,-26,90,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 2, 4, 37, 41, 42, -12, 77, 46, 14, 79, -50, 81, 53, 22, -56, 92, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,2,4,37,41,42,-12,77,46,14,79,-50,81,53,22,-56,93,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, 53, 85, 6, 86, 8, -59, -77, 45, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,53,85,6,86,8,-59,45,-79,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 51, 36, -23, 9, -77, -29, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,51,36,-23,9,-77,13,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 66, -35, -37, 37, -72, -42, -74, 82, 51, 20, 21, 58, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,66,-35,-37,37,-72,-42,-74,82,51,20,31,21,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 71, 58, 43, 75, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,71,58,75,-92,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, -38, -6, 40, 74, -11, 43, -48, -16, 49, 21, 87, -90, 27, 28, 62, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,-38,-6,40,74,-11,43,-48,-16,49,21,87,-90,27,62,-63,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 97, 36, 11, 13, 14, 82, -55, 88, 56, -27, 59, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,97,36,11,13,14,82,-55,88,56,30,-27,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 37, -72, 72, -13, 48, -82, 83, 20, 25, -92, -29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,37,-72,72,-13,48,-82,83,20,25,-92,63,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 49, 36, 55, 87, 90, 59, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,49,36,55,87,90,59,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 66, 99, -69, 43, 78, -81, 50, 84, 87, -57, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,96,66,99,-69,43,78,-81,50,84,87,-57,94,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -66, 36, -7, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-66,36,74,-7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 70, -8, -42, 42, 44, -45, 46, -79, 48, 51, -56, 24, -28, 93, -63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,70,-8,-42,42,44,-45,46,-79,48,51,-56,24,-28,93,95,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 65, 82, 6, 57, -10, 42, 30, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,65,82,6,57,-10,42,47,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, -68, 52, 88, 25, 58, 44, -30, -46, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,-68,52,88,25,58,44,-30,30,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 69, 56, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 21, 23, 39, 74, -30, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,21,23,39,74,46,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, -57, -74, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,-57,28,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 84, 85, 60, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,96,85,30,60,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 67, 38, 9, 13, 45, -79, 15, 50, 20, 23, 55, 90, 27, 61, -62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,67,38,9,13,45,-79,15,50,20,23,55,90,27,61,31,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -65, -67, 35, 36, 72, -76, 75, 13, -50, 18, 87, 60, 93, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-65,-67,35,36,72,-76,75,13,-50,18,87,93,31,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -2, -84, 53, 21, 54, 87, 23, 57, 42, 79, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-2,-84,53,21,54,87,23,57,79,15,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 2, 3, -36, 39, 40, 46, -15, 15, 18, 20, 21, 27, 92, 28, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,2,3,-36,39,40,46,-15,15,18,20,21,27,92,31,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 98, -3, 4, 37, 39, -79, 48, 19, -21, 86, -25, -91, 27, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,98,-3,4,37,39,-79,48,19,-21,86,-25,-91,29,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-68, 84, 42, 31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,84,42,95,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 19, 88, 57, -27, 12, -77, 14, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,19,88,57,-27,12,-77,78,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 3, 36, 5, 7, 39, -12, 11, 47, 15, 18, 83, 52, 22, 23, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,3,36,5,7,39,-12,11,47,15,18,83,52,23,-58,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 98, 70, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,29,64,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 18, 25, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,18,45,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 36, 71, 8, 57, 90, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,36,71,8,90,10,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 2, 35, 68, 36, -40, 76, 12, -78, -47, 46, 15, 16, 17, 82, 54, -55, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,2,35,68,36,-40,76,12,-78,-47,46,15,16,17,82,54,23,-55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, -41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,-41,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 68, -70, -42, 10, 46, 17, -51, 22, 23, 55, 56, 57, 27, 60, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,68,-70,-42,10,46,17,-51,22,23,55,56,57,60,-62,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 5, -38, 69, -8, 41, 50, 19, 52, -23, 56, 91, 28, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,5,-38,69,-8,41,50,19,52,-23,56,91,62,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 80, 67, 35, 52, -38, 24, 13, -62, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,80,67,35,52,-38,24,13,79,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 65, 37, 42, -45, 45, 48, 18, 83, 20, 85, 21, 54, 87, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,33,65,37,42,-45,45,48,18,83,20,85,21,54,95,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, -86, 55, 57, 42, 93, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,-86,55,57,77,42,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 0, 2, -41, 73, 42, 10, 14, 17, 53, 55, 56, -26, 57, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,0,2,-41,73,42,10,14,17,53,55,56,57,-29,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 35, 20, 54, 24, 12, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,35,20,54,24,63,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 97, -35, 67, 39, 43, 46, 18, 82, 89, 93, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,97,-35,67,39,43,46,18,82,89,93,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 67, 51, 68, -6, 53, 21, 7, 88, -60, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,67,51,68,-6,53,21,88,-61,-60,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -34, 71, -74, 13, 77, -15, 15, 80, 18, 50, 82, 21, 55, -25, 91, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-34,71,-74,13,77,-15,15,80,18,50,82,21,55,-25,94,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 96, 66, -4, -36, -8, -42, 46, -84, 22, 92, -61, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,96,66,-4,-36,-8,-42,46,-84,22,92,61,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -49, 64, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,28,-49,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 4, -38, 38, -40, 74, 10, -87, 23, 58, -62, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,4,-38,38,-40,74,10,-87,23,58,-62,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -39, 73, 10, -76, -86, 22, 23, -91, 27, -29, 94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-39,73,10,-76,-86,22,23,-91,27,62,-29,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 69, 7, 8, 43, 15, -51, 53, 54, 87, -25, 88, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,69,7,8,43,15,-51,53,54,87,88,-90,-25]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 98, 3, 7, 8, -42, 75, 77, 46, 14, 54, 55, 87, 56, 26, 60, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,98,3,7,8,-42,75,77,46,14,54,55,87,56,26,94,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 51, -9, 73, 10, 13, 45, -79, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,51,-9,73,10,13,45,-16,-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 24, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -2, 33, 98, 34, 67, 3, -5, 5, 37, -15, 50, 21, 56, 93, -32, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-2,33,98,34,67,3,-5,5,37,-15,50,21,56,93,63,-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 33, -37, 69, 40, 9, 12, 76, -16, 16, -82, 20, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,33,-37,69,40,9,12,76,-16,16,-82,87,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 98, 87, 8, 41, 58, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,98,87,8,58,14,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 96, 33, 98, 67, 36, 38, 6, 73, 42, 20, 24, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,96,33,98,67,36,38,6,73,42,24,-62,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 6, 39, 74, 91, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,6,39,91,61,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 1, 3, 4, 7, 71, 73, 42, -16, -17, 91, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,33,1,3,4,7,71,73,42,-16,29,-17,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 49, 97, 83, -55, 56, 73, 59, 44, 93, -47, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,49,97,83,-55,56,73,59,93,-48,-47,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(24, 91, 11, 28, -62, 13, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,91,11,28,-62,93,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 64, 51, 20, 69, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,64,51,22,20,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 50, -55, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,50,71,-55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, 36, 68, 5, 6, 8, 41, 76, 45, 49, 81, 50, 87, -27, 90, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,2,36,68,5,6,8,41,76,45,49,81,50,87,30,-27,61,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -33, -66, 98, 51, 52, 20, 5, 24, -63, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-33,-66,98,51,52,20,5,24,-32,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 1, 2, 36, 74, 77, 48, 50, 82, -84, 83, 86, 87, 56, 90, 26, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,1,2,36,74,77,48,50,82,-84,83,86,87,56,90,63,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 34, 82, 67, 3, 71, -41, 9, -12, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,34,82,67,3,71,-41,9,47,-12]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 0, 85, 37, 26, 43, 15, 79, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,0,85,37,26,43,31,15,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, -18, -19, 88, -13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,-18,-13,-19,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 0, 4, -69, 6, 9, 75, 45, 77, 49, 18, 52, -25, 59, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,0,4,-69,6,9,75,45,77,49,18,52,-25,59,31,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 0, -99, 99, 36, -70, 9, 10, 43, 78, 17, 18, 20, 90, 27, 61, 31, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,0,-99,99,36,-70,9,10,43,78,17,18,20,90,31,-96,27,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -82, -67, -4, -6, 72, -90, 26, 45, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-82,-67,-4,-6,72,-90,26,95,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, 76, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,95,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 80, -49, -33, 97, 98, 38, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,80,-49,-33,98,-29,38,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 97, -69, 87, 72, 24, 89, -93, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,97,-69,87,72,24,89,13,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, -65, 33, -4, 7, 74, 10, 76, 45, 79, 18, -85, -62, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-65,33,-4,7,74,10,76,45,79,18,-85,30,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 67, 5, 8, -74, 44, 17, 82, 22, 23, 88, 89, -29, 28, -30, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,67,5,8,-74,44,17,82,22,23,88,89,-29,28,-30,62,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 98, 85, 87, 24, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,98,87,15,24,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 42, 11, 76, -48, 81, 50, 53, 86, 57, 25, -61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,42,11,76,-48,81,50,53,86,57,25,30,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 34, 68, 56, -26, 90, 12, -45, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,34,68,56,-26,90,12,31,-45]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, -18, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,10,-18]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 69, 41, -80, 17, 81, 49, 53, -55, -88, 55, 56, 92, 60, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,69,41,-80,17,81,49,53,-55,-88,55,60,30,56,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 4, 68, -69, 38, 71, 8, 43, 47, 17, 84, 89, 27, 59, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,1,4,68,-69,38,71,8,43,47,17,84,89,27,59,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 6, 9, 74, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,6,29,9,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(54, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -20, 84, 68, -40, -11, 42, 59, -15, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-20,84,68,-40,-11,42,59,95,-15]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 64, 32, 97, 67, -4, -68, 70, -78, 78, 79, 22, -89, 25, 29, 30, -95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,64,32,97,67,-4,-68,70,-78,78,79,22,-89,25,29,30,63,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -67, 20, 21, 70, 22, 24, 40, 89, 58, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-67,20,21,70,22,24,58,-46,40,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-3, 19, 36, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,19,76,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -3, 34, -36, 40, 74, 42, 43, 76, 13, 14, 49, -83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-3,34,-36,40,74,42,43,76,13,49,-83,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 67, 3, 36, 37, -71, 39, 7, 42, 43, 80, 82, 19, 24, 57, 27, 59, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,67,3,36,37,-71,39,7,42,43,80,82,19,24,57,27,63,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 2, 35, -36, 36, -86, 24, 25, 9, 45, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,2,35,-36,36,-86,24,25,9,95,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -5, 36, 4, 71, 87, 57, 9, 25, 13, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,-5,36,4,71,87,57,13,-16,9,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 65, 97, 37, 70, 72, -11, 76, 13, -16, 48, 17, 51, 20, 21, -59, -28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,65,97,37,70,72,-11,76,13,-16,48,17,51,20,21,-28,-59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 0, 1, 34, 35, 10, -15, 17, 19, -54, 55, 24, -93, 29, -94, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,0,1,34,35,10,-15,17,19,-54,55,24,29,-95,-94,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 3, 53, 42, 28, 29, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,33,3,53,42,29,-31,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 1, 98, 3, 37, 40, -43, 45, 46, 14, -48, 20, 52, 53, 55, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,1,98,3,37,40,-43,45,46,14,-48,20,52,55,-32,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-37, 38, 71, 12, 45, -46, 17, 51, 21, 88, 89, -26, 26, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,38,71,12,45,-46,17,51,21,88,89,26,-60,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 34, 50, 99, 85, 71, 88, 56, 90, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,34,50,99,85,71,88,75,56,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, 83, 39, 24, 25, 42, -12, 28, 45, -46, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,1,83,39,24,25,42,-12,28,45,78,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 34, 66, 87, 24, 61, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,34,66,87,24,61,63,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 96, -85, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,96,76,-85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 34, 35, 38, -76, 84, 52, -86, 56, 24, 29, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,34,35,38,-76,84,52,-86,56,24,29,95,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 67, 84, 52, 54, 6, 72, 45, 61, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,67,84,52,54,6,72,61,-32,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(40, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -49, 1, 50, 34, 54, 55, 11, 44, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-49,1,50,34,54,55,11,63,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 37, 5, 75, -44, 76, 50, 57, -90, 90, 27, 29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,37,5,75,-44,76,50,57,-90,90,27,63,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 99, 40, 41, 14, -48, 52, 20, -54, -57, 27, 28, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,99,40,41,14,-48,52,20,-54,-57,27,29,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7, 72, 73, 75, 12, 14, 80, 51, 84, -87, 22, 56, 58, 27, 60, 61, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,72,73,75,12,14,80,51,84,-87,22,56,58,27,61,-95,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 70, 22, -89, 57, 73, 90, -12, 43, 75, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,70,22,-89,57,73,90,-12,43,76,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 18, 22, 89, 41, 90, -46, 62, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,18,22,89,41,90,47,-46,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-68, 86, 71, 24, 40, 26, 77, 14, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,86,71,24,40,77,-32,14,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 98, -8, -11, 11, 14, -48, 49, -51, 88, 26, 29, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,98,-8,-11,11,14,-48,49,-51,88,26,63,29,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 55, 40, 28, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,13,28,40,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 66, 7, -10, 74, 11, 45, 19, 51, 83, 52, 53, 22, -24, -25, 90, 93, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,66,7,-10,74,11,45,19,51,83,52,53,22,-24,-25,93,61,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -51, -21, 52, 85, -13, 94, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-51,-21,52,85,47,-13,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 33, -4, 52, 4, -54, 71, 73, -43, -29, -62, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,33,-4,52,4,-54,71,73,-43,-29,-48,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 5, 71, -41, -9, 8, 45, 21, 86, 24, 89, -27, 58, 60, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,64,5,71,-41,-9,8,45,21,86,24,89,-27,58,60,94,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 66, 87, 59, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,66,87,62,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 32, -50, 97, 5, 8, 41, 60, 77, -78, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,32,-50,97,5,8,41,60,77,95,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -97, 98, 3, -4, 70, 7, 73, 45, 81, 18, 53, 57, -61, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-97,98,3,-4,70,7,73,45,81,18,53,57,-31,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 0, 66, 68, -21, 7, 71, 41, 60, -29, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,0,66,68,-21,7,71,60,-30,-29,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 2, 35, 67, -71, 7, -73, 41, 13, 78, 79, 15, 16, 18, 24, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,2,35,67,-71,7,-73,41,13,78,79,15,16,18,24,95,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 69, 6, -90, 89, 77, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,69,6,-64,-90,77,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 55, -25, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -67, 3, 37, 69, 43, 45, 77, 48, 22, -23, -55, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-67,3,37,69,43,45,77,48,22,-23,57,-55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 34, 36, 4, -39, 72, -75, 46, 48, -85, 57, 90, -62, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,97,34,36,4,-39,72,-75,46,48,-85,90,-64,-62,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 65, 99, -37, 69, 38, 71, 40, 75, 78, 18, 84, -87, 87, 61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,65,99,-37,69,38,71,40,75,78,18,84,-87,87,63,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 21, -54, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,21,44,-54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 8, 78, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,8,79,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 85, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,3,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 65, 35, 36, -71, 71, 80, 84, 53, 86, 27, 92, 29, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,65,35,36,-71,71,80,84,53,86,27,92,93,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 33, 83, 21, 85, -60, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,33,83,85,-61,-60,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 16, 25, 89, -91, 59, -77, 13, 77, 93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,16,25,89,-91,59,-77,13,93,63,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -18, 66, 82, 84, 25, 11, 60, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-18,66,82,84,25,11,78,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 98, 87, 23, -44, 60, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,98,87,23,13,-44,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -97, 67, 3, 99, 6, 72, -44, 15, 16, 49, 20, 22, 87, 88, 25, 90, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-97,67,3,99,6,72,-44,15,16,49,20,22,87,88,90,-30,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, -70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-51, 34, 52, 85, 69, 54, 23, 40, -26, 9, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,34,52,85,69,54,23,40,9,-32,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 82, -85, -29, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,82,-85,93,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 7, 9, -31, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,9,-80,-31,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -98, 65, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,9,-98,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 0, -6, 53, 24, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,0,14,-6,24,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 82, 52, 44, 61, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,82,52,61,13,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 36, 71, 11, 45, 16, -84, 83, 23, 88, 57, 26, 27, -61, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,36,71,11,45,16,-84,83,23,88,57,26,27,94,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(56, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -17, -52, 37, 54, 23, 42, 75, 30, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-17,-52,37,54,23,75,15,30,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, -36, 67, 70, 38, -41, 74, 82, 50, 85, 87, -30, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,65,-36,67,70,38,-41,74,82,50,85,87,94,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 66, 3, 76, 45, 77, -47, 50, 20, 23, 88, 56, 59, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,66,3,76,45,77,-47,50,20,23,88,56,94,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -8, 44, 77, 15, -81, 18, 82, 88, -90, 26, 90, 60, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-8,44,77,15,-81,18,82,88,-90,29,26,60,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 54, 23, 25, 45, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,54,23,45,15,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 99, -36, 36, 68, 9, 81, 18, 21, 22, 88, 27, -92, -29, 60, -94, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,99,-36,36,68,9,81,18,21,22,88,27,-92,-29,60,93,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -99, 39, 9, 42, -45, -46, 46, 78, 15, 81, 20, 85, 86, 22, -58, 60, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-99,39,9,42,-45,-46,46,78,15,81,20,85,86,22,-32,-58,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 71, 72, -42, 9, 41, -15, 15, 47, 83, 51, 19, 53, 86, 88, 27, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,71,72,-42,9,41,-15,15,47,83,51,19,53,86,88,92,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6, 40, 13, -50, 49, 51, 83, 20, -86, 54, 55, -89, -90, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,40,13,-50,49,51,83,20,-86,54,55,-89,-30,-90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 67, 68, 4, 58, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,67,68,4,79,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 82, -86, 85, 21, 39, 27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,82,-86,85,21,39,30,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 68, 41, 13, 77, 46, 47, 80, 17, -52, 22, 88, 56, 25, -28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,68,41,13,77,46,47,80,17,-52,25,-28,22,56,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 50, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,-32,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 80, 81, 83, 9, 10, 61, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,80,81,83,9,61,-46,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 97, -83, 51, -56, 55, 23, 57, 61, -63, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,97,-83,51,-56,55,23,57,61,62,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(54, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 67, 20, 25, 26, 27, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,67,20,25,27,-61,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, 36, 4, 70, 6, -73, 10, -46, 80, 18, 21, 88, 56, -60, 91, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,65,36,4,70,6,-73,10,-46,80,18,21,88,56,-32,-60,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 66, 84, 70, 26, 43, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,97,66,84,70,43,12,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 19, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,-94,-49]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -66, -53, 86, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-66,-53,91,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-86, 55, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-86,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 5, 6, 40, 9, 74, -12, 48, -82, -18, 49, 53, 54, 55, 89, -61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,5,6,40,9,74,-12,48,-82,-18,49,53,54,55,89,63,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 81, 55, 13, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,81,55,45,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 0, 36, 84, 69, -87, 8, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,0,36,84,69,-87,43,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 19, 22, -41, -74, 74, 12, 28, 13, 61, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,19,22,-41,-74,74,12,28,14,13,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34, 5, -39, 72, 42, 74, 44, 15, 80, 20, -21, 85, 55, 88, 58, 28, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,34,5,-39,72,42,74,44,15,80,20,-21,85,55,88,58,62,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -1, 65, -68, -72, 8, 74, 77, -14, 14, 79, -80, -82, 53, 59, 62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-1,65,-68,-72,8,74,77,-14,14,79,-80,-82,53,62,31,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, -86, 54, 39, 72, -93, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-86,54,39,72,79,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 98, 50, 51, -22, 39, 42, 26, 11, -78, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,98,50,51,-22,39,42,26,11,47,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 1, 3, 99, 21, 8, -9, 90, 11, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,1,3,99,21,8,-9,90,77,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-42, 58, -92, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,58,13,-92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(56, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 3, 99, 36, -69, -70, -24, -28, 11, 28, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,3,99,36,-69,-70,-24,-28,11,79,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 49, 1, 3, 24, 56, 74, -45, 77, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,49,1,3,24,56,74,-45,78,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 70, 41, 44, -77, 12, -81, 16, 19, -20, 83, 51, 84, 86, 56, 29, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,70,41,44,-77,12,-81,16,19,-20,83,51,84,86,56,95,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-7, 11, -61, 12, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,11,-61,95,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -87, 56, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-87,94,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, 20, 70, 10, 26, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,66,20,70,10,61,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -21, -54, 39, 72, -41, -42, -28, 76, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-21,-54,39,72,-41,-42,63,-28,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -19, -36, -72, 12, -78, 14, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-19,-36,-72,12,-78,14,63,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, 54, 56, -75, 59, 27, -61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,54,56,-75,59,27,62,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -5, 58, 92, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-5,92,15,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -8, 56, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-8,59,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 1, 34, 35, 36, 10, 45, 78, 16, 81, 83, -85, 84, 85, 22, 86, 55, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,1,34,35,36,10,45,78,16,81,83,-85,84,85,27,22,55,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 80, 85, 37, 6, 22, -57, -43, 76, -95, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,80,85,37,6,22,-57,-43,76,78,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 54, 71, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,71,-16,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(27, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -65, -83, 88, 59, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-65,11,-83,59,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -2, 81, 36, 4, -70, -74, 43, 12, 46, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-2,81,36,4,-70,-74,43,46,-64,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, -73, 91, 60, -13, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,-15,-73,-13,60,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -65, 32, 0, 33, 8, 76, 16, 20, 88, 57, 89, 61, 93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-65,32,0,33,8,76,16,20,88,57,89,63,61,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 35, 67, 7, -10, 78, 80, 49, 83, 54, 86, -23, -90, 91, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,35,67,7,-10,78,80,49,83,54,86,-23,-90,92,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -67, 83, 73, 41, -90, 89, 9, 90, 44, -47, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-67,83,73,41,-90,89,9,90,44,30,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 51, 24, -74, 90, -94, 45, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,51,24,-74,90,-94,63,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 51, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,56,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(74, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 21, 53, 7, -26, 58, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,21,53,7,58,-60,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 33, 2, 35, 36, -37, 37, -40, -24, 27, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,33,2,35,36,-37,37,-40,-16,-24,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 66, 5, 69, -39, 72, -73, 41, 43, 75, -45, 76, -78, 14, -81, 84, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,66,5,69,-39,72,-73,41,43,75,-45,76,-78,14,-81,90,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 65, 97, 69, 70, 42, 75, 44, 80, 81, -56, 28, 93, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,65,97,69,70,42,75,44,80,81,-56,29,28,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 2, -36, 71, 7, -43, -49, -17, 48, 80, 88, 57, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-35,2,-36,71,7,-43,-49,-17,48,88,-58,57,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 96, 97, 98, 67, 4, 7, 13, 46, 81, 82, 84, 85, -57, 56, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,96,97,98,67,4,7,13,46,81,82,84,85,24,-57,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 87, -72, 73, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,87,45,-72,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 96, 33, 98, 38, -40, 71, 73, 10, -76, 11, 45, 77, 85, 91, 27, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,96,33,98,38,-40,71,73,10,-76,11,45,77,85,91,60,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 34, -71, 7, 9, 73, 43, 77, 48, 23, 88, 58, -92, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,34,-71,7,9,73,43,77,48,23,88,58,-92,62,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 80, -87, 55, 7, 10, 13, 15, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,80,-87,55,7,10,15,-96,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 6, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,42,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 84, 69, 22, -7, 41, 28, 44, -62, 15, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,84,69,22,-7,41,28,44,-62,47,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 52, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,93,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-20, 68, 53, 57, 12, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,68,57,-64,12,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 34, 35, 67, 8, -42, 41, 43, 45, 46, 79, -18, 54, 24, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,97,34,35,67,8,-42,41,43,45,46,79,-18,54,92,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -70, 6, 15, -82, 50, 52, 53, 23, 91, -28, 28, -31, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-70,6,15,-82,50,52,53,23,91,-28,28,31,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-40, 9, -77, 44, -79, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,9,-77,44,79,-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, -85, 69, 24, 73, 11, 44, 30, 63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,-85,69,24,73,11,44,30,95,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 1, 98, 6, 9, 42, -45, 78, -16, -81, 16, 82, -88, 89, 59, 60, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,1,98,6,9,42,-45,78,-16,-81,16,82,-88,89,60,30,59]", resultFormatted);
    }
}

