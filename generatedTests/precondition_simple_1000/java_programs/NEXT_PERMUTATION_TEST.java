package java_programs;


public class NEXT_PERMUTATION_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 97, 98, 34, 38, 10, 43, 11, 14, 49, 19, 21, -25, 89, 92, 28, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,14,98,43,-25,38,92,34,1,11,10,89,28,49,21,49,19,63,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 56, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,93,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -4, 84, 21, 54, 71, 24, 11, 94, -48, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,-48,94,54,54,65,-4,21,71,63,24,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 51, -20, 53, 56, 72, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,53,51,-20,78,72,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 36, 4, 52, 20, 21, 38, 88, -10, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,-44,4,52,38,21,20,88,-10,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 1, 36, 37, 54, -29, 60, 45, -94, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,36,-29,49,60,45,-94,54,13,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 34, 3, 5, -72, 40, -77, 49, 86, 23, 87, 25, 92, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,61,-66,-72,92,86,-77,23,87,34,5,49,40,25,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 51, 99, 52, 84, -57, 10, 13, 61, 94, 63, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,-57,13,63,63,-64,51,49,94,52,99,49,61,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-6, 88, 41, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,93,88,-6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 2, 66, 99, -40, 40, 91, 77, 46, 30, -31, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,46,2,30,-40,77,66,99,40,91,-32,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 2, 37, 8, -73, 9, 13, 49, 50, -51, -52, 51, 52, 88, 56, 90, -27, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,49,90,50,37,88,8,-66,-52,-27,9,52,-51,-73,51,56,90,26,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 2, 67, 5, 53, 39, 72, 25, 10, 78, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,67,10,67,15,72,5,78,25,53,39,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, 65, 2, -73, 41, 10, 12, 44, 79, 16, 18, 82, -52, 57, 89, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,10,57,-73,32,12,79,1,18,41,65,82,79,-52,89,16,89,44,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, 1, 37, 7, 41, 13, 80, 17, 83, -21, 85, 22, 23, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,85,-21,13,-92,7,41,22,37,80,33,64,1,17,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, 35, 39, 74, 44, 13, -79, 18, 24, 25, 28, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,65,39,63,-79,13,25,96,35,74,25,18,28,62,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 98, -67, 38, 71, -45, -77, -79, 17, 81, 82, 20, 23, 24, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,98,20,24,33,56,-45,82,71,-79,-67,23,-77,81,20,38,98,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, -71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,-71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 35, 83, -85, 70, 24, 72, 73, 90, -30, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,24,70,-85,90,72,-30,13,17,83,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 53, -38, -8, 43, -12, 75, 60, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,43,79,53,80,-12,-38,75,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 33, 82, 4, 86, 87, 91, 92, 12, -29, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,80,86,91,33,92,87,15,80,86,12,82,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -99, -22, 70, 87, 45, 61, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,45,61,94,87,-99,70,-22,48,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 18, -67, 84, 52, 70, 75, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,96,75,97,70,84,76,-67,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 69, 37, -74, 43, 77, -80, -49, -83, 85, 56, -90, 91, 28, -63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,85,-74,69,-83,28,56,77,31,43,-49,-80,31,91,-90,-63,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 2, 37, -25, -73, 74, 59, 75, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,59,-73,37,75,64,2,74,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-3, 38, 42, 13, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,-3,13,38,-15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 35, -70, 40, 42, 43, 16, -82, 86, 88, 60, 93, 61, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,42,60,86,94,93,98,94,43,88,-70,16,35,40,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 84, 75, 92, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,92,75,84,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 1, 99, 4, -74, 9, 42, -92, 78, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,79,33,32,-92,42,-74,9,99,1,78,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(58, 93, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,93,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 37, 6, 7, 8, -12, 75, 45, 78, -18, 53, 24, -26, 90, 92, 28, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,-26,92,53,8,45,78,61,37,3,6,-12,75,-18,28,24,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 65, 33, -90, 73, 57, 76, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,65,32,-90,45,73,57,76,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 51, 67, 6, 38, 58, 91, 29, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,58,51,94,29,96,67,91,63,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 0, 1, 99, -71, 57, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,-71,57,99,42,0,1,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 6, 7, 73, 42, 45, -79, 79, 80, 49, 84, 88, 89, 58, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,73,49,84,80,29,7,58,45,42,88,-79,6,68,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 69, 38, -24, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,69,80,69,72,-24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 3, 39, 57, 74, 77, -32, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,82,57,77,-32,31,74,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 34, 68, -70, 40, 9, 11, -76, 14, -50, 81, 22, 86, -88, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,34,81,97,40,11,-70,22,88,68,14,86,9,-76,-88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 0, 65, 66, 35, 84, 56, -75, 91, 43, 45, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,84,46,91,43,65,56,80,45,-75,0,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 83, 3, 4, -75, 42, 44, 63, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,63,-96,42,83,4,44,3,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 17, 49, 97, 35, 88, 58, 42, 14, 94, -79, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,17,58,49,14,94,97,42,-79,0,-63,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, -69, 4, 37, 70, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,-98,-69,40,37,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, 11, 45, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,11,29,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -7, 11, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-7,11,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 81, -18, 50, 82, 38, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,38,81,63,-18,50,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 49, 67, 69, 26, 44, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,44,49,-17,69,92,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 35, 70, 71, 40, -74, 41, -75, -47, 48, -52, 20, 59, 91, 63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-75,71,41,63,48,-47,59,20,70,32,40,91,95,-52,35,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 67, 53, 71, 89, 42, 91, 45, 93, 14, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,66,14,79,91,42,45,93,67,89,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 6, -71, 72, 44, 77, 16, 81, 18, 21, -23, 55, -25, 25, 59, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,44,6,21,6,16,18,55,72,63,77,25,-71,81,25,59,-25,-23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-85, 9, -91, 58, 93, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,-32,-85,9,9,-91,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 68, 69, 37, -40, 73, 41, -12, 43, 16, 82, 22, -87, 26, 94, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,1,73,22,68,82,-12,94,26,96,69,-87,43,41,37,-63,-40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 35, 68, 5, 69, 38, 74, 17, 51, 84, 21, 58, -31, -95, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,17,5,51,84,67,74,-31,68,-95,35,38,69,94,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 97, 1, 86, 57, 44, -93, 76, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,44,86,45,97,16,1,-93,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, 97, 67, 9, 41, -81, 49, 55, -88, 90, -27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,55,49,-88,90,65,32,-81,-27,97,30,67,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 52, 68, 22, 39, 8, 75, -46, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,22,-47,39,32,8,68,52,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 65, 1, 2, 68, 4, 71, 40, -48, 48, 81, 50, 19, 24, -90, 26, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,40,65,19,50,63,81,19,-48,24,48,-90,26,68,2,1,64,4,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-19, 87, 55, 57, -27, -12, 27, 92, 77, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,63,57,-27,77,55,-19,92,92,27,-12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 64, 66, 4, -47, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,15,66,64,-47,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 16, 1, 65, 4, 72, -57, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,72,4,1,65,65,-57,27,16,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 32, 97, 37, 5, 40, 73, 41, 10, 80, -49, 48, 20, 23, -88, 92, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,80,73,23,37,-88,97,92,20,-49,41,48,96,40,5,10,32,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 98, 2, -70, 14, 47, -49, 82, -19, -52, 85, 92, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,14,85,82,82,92,-70,29,-19,85,98,2,-52,1,-49,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 6, 7, 42, -44, 44, 77, 86, 87, 24, 90, 60, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,87,42,86,24,90,60,6,44,61,1,-44,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71, 87, 91, 92, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,91,92,87,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 84, 85, 88, 57, 41, -91, 58, 59, 94, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,58,88,57,59,31,58,85,94,97,84,97,46,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 51, 52, 53, -26, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,42,51,52,1,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -5, -23, -12, 27, 14, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,-23,-12,-5,27,1,-16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -1, 70, 7, -8, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,7,-8,64,-1,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 99, 71, 56, -9, -58, 59, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,71,56,3,99,-9,44,-58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 85, 23, 39, 26, 58, 28, -61, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,26,39,28,-61,85,77,58,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -22, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,91,-22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 64, 99, 37, 39, 13, 47, -81, -23, 54, 25, 29, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,37,47,13,95,32,-23,25,64,54,99,39,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -33, 32, 17, 82, 83, 35, 88, 60, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,60,48,-33,82,-29,32,83,88,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 3, 43, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,-94,32,33,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 66, -36, 35, 37, -9, 41, -44, 45, 14, -49, 49, 24, 56, -29, -62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,66,-36,24,31,-49,56,45,41,56,37,96,-29,-44,35,49,-62,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 98, 99, 67, 69, 6, 74, 75, -13, -79, 14, -18, 50, 54, 87, 92, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,87,-18,50,92,74,-79,69,-13,64,54,93,99,98,14,67,75,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -69, 73, 90, 44, -13, 13, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,63,-13,62,73,48,90,-69,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 34, -5, 69, 39, 9, 42, 43, 75, 78, -48, -50, 83, 52, 25, 29, 61, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,94,32,29,83,34,-48,-50,39,61,69,78,42,63,43,75,-5,25,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 98, 36, 55, 43, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,82,77,82,43,36,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 38, 72, 56, -26, -28, 12, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,72,49,12,-26,56,-28,-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 1, -69, -71, 75, 43, 45, 77, 14, 84, 21, 56, -57, 58, 91, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,56,84,1,-71,14,58,45,91,75,43,64,30,77,-69,-57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -35, -67, -68, 38, 8, 73, 74, 46, -80, -52, -20, 23, 24, 56, 60, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,38,46,24,74,30,60,8,-52,-20,-68,73,56,-80,1,1,23,-67,-35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 71, 72, 25, 42, 44, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,44,-64,72,25,97,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -34, 2, 18, -36, 6, 9, 74, 59, 12, 13, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,30,2,6,13,12,-36,-34,18,80,9,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -67, 66, 4, 36, -75, -44, 79, 80, 81, 83, 51, 91, -94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-67,4,91,96,36,79,83,-44,-75,-94,66,81,63,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,-15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 4, 72, 41, 9, 75, 77, -18, -52, 54, -57, 57, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,-52,-57,72,54,1,57,4,41,9,77,61,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 68, -37, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,68,67,-37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -69, -6, 37, 7, 8, 9, -11, 74, 47, 16, 17, 85, 88, -90, -91, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,-69,85,8,17,16,66,93,-6,-11,16,74,47,37,-90,88,-91,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -72, 9, -10, 43, -44, 76, 16, 49, 50, 84, -89, -95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,16,43,-89,50,9,63,76,-10,33,43,49,84,-72,-44,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 65, 71, 44, 78, 15, 80, 84, 86, 88, 30, 62, -95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,15,30,31,84,78,62,86,71,0,88,80,65,44,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 10, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,50,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 2, 4, 5, 9, 28, 77, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,4,96,9,5,77,61,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 50, -55, 6, 88, 73, 27, 46, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,73,27,88,-55,48,46,6,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 35, -69, 40, 11, 46, 80, 17, -50, 50, 21, 90, 27, 91, 28, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,95,46,27,90,35,11,17,28,21,-50,66,40,-69,91,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 3, -7, 8, 40, -76, 59, 60, 46, -79, 15, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,8,15,40,60,46,-79,3,-7,17,59,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, -99, 40, 44, -13, 81, 84, 54, 87, 25, 26, 60, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,31,60,84,44,33,63,26,66,-13,87,84,-99,60,54,25,40,-13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-24, 28, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,-24,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, 71, 8, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,38,71,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 67, 6, -72, 44, 45, 80, 48, 19, 54, 23, -89, 56, 92, -30, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,54,23,44,-30,45,19,80,67,-89,56,48,31,65,67,6,92,-72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 33, -19, 35, 52, 70, 39, 10, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,35,81,70,52,10,-19,42,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, -66, 53, 86, 40, -43, 12, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,40,86,12,15,-33,-43,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 86, 55, -9, 43, 45, -46, 30, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,-46,55,30,-66,43,78,86,-9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 86, 88, 25, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 0, 65, -67, 69, 37, 54, 42, 27, 92, -31, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,48,-31,0,54,79,92,69,65,42,37,-67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 33, 3, 83, 68, 5, -6, -87, 56, 10, -12, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,56,-12,68,33,3,68,83,-87,5,-6,-63,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 5, 10, 13, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,1,10,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 84, 22, 39, 9, 57, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,83,39,77,57,9,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -70, -42, 74, 45, 48, 19, -22, 91, 27, -61, 93, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,45,93,-42,61,-61,48,96,-70,74,91,27,19,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 20, -37, 4, 69, 85, 71, 41, -60, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,49,-60,20,71,91,85,-37,41,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, -88, 72, 9, -45, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,9,67,-45,72,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 39, -42, -45, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,66,39,-42,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 65, 21, -55, 86, 71, 56, -10, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-12,56,0,-10,71,-55,86,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 97, -36, 37, -38, 41, 75, 44, -49, 52, -23, 91, 27, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91,33,97,29,37,75,-38,52,41,-36,37,75,-49,94,27,44,-23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 99, 84, 69, 54, 24, 8, 27, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,84,24,69,99,8,54,-50,27,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -33, 2, 3, 71, 74, 12, 44, 47, 18, 84, 21, 85, -24, -59, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,-24,32,47,21,-33,71,21,2,18,-59,12,3,85,74,84,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, 34, -12, -81, 50, 19, -85, 55, 56, 27, -30, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,33,27,56,-12,55,50,66,-30,34,19,-85,-81,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 67, 88, -89, 57, 11, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,88,11,75,75,-89,-67,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 98, 69, 8, 9, 16, 52, 86, 57, 26, -29, 93, -64, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,86,57,9,8,69,-64,98,-29,31,96,16,26,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -3, 37, 85, 21, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,37,66,21,-3,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 17, 34, 98, 37, 39, 40, -90, -76, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,34,39,17,-90,-33,30,40,98,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 35, 84, -22, 87, 72, 8, 57, 74, 13, -80, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,72,48,-22,13,57,8,84,74,-64,87,57,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 52, 86, -58, 92, -61, 44, -78, 14, -79, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,-79,-78,86,92,-61,52,-58,44,99,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -35, 4, 84, 71, 39, -41, 74, 91, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,84,-35,71,31,-65,74,-41,91,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 97, -54, 38, -41, 9, 26, -29, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,9,-54,94,38,29,26,94,-29,97,-41,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 19, 5, 22, 8, 72, 26, 12, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,26,22,8,19,72,79,49,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, -75, 10, 44, 46, 16, 82, 84, -88, -57, 57, 90, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,-75,16,-88,82,-75,57,44,67,60,67,10,-57,90,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(25, 57, -93, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,-93,57,-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, -2, 36, 7, 72, 74, -43, -16, 81, -55, 22, 56, 58, 27, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,-55,62,-16,72,56,81,0,58,22,36,27,74,-2,7,-43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 48, -34, 81, -83, 67, 37, 71, 57, 74, -28, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,74,67,96,57,57,48,-83,-34,78,-28,78,81,37,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -2, 36, 79, 17, 50, 52, 53, -86, 23, -90, 91, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,33,62,-90,79,53,33,92,23,52,-86,17,50,91,-2,92,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 97, 65, -83, 52, -54, 22, -56, 40, 46, 63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,16,22,46,63,-56,52,31,40,-83,-54,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 67, -40, 74, 44, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,74,-40,-82,63,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 98, 66, -99, -36, 67, 6, 7, -77, 50, 52, 21, 89, 91, 27, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,93,91,52,6,98,50,27,52,-36,66,89,67,64,-99,21,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -23, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 99, -69, 69, 40, 72, 74, 11, -12, 76, -14, 78, 15, 21, -56, -89, 24, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,40,69,21,11,-12,-89,24,-69,15,76,72,74,72,-95,-14,99,-56,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 3, -70, 37, 41, 42, -46, 15, -50, 51, -85, 86, 25, -59, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,-70,42,3,37,93,15,-59,41,95,-85,42,25,-2,51,-50,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 50, 85, 22, 72, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,48,93,72,50,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-52, 36, -6, 85, 22, 71, 58, 59, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,59,58,36,-63,22,-52,-6,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 81, 34, 19, 69, 22, -23, 8, -41, 57, 89, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,22,8,34,32,-23,89,-41,22,19,69,-32,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 32, 98, 68, 6, 7, 39, 46, 14, 49, 84, 55, 60, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,46,7,98,84,39,32,55,60,14,6,49,68,-64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 2, -68, 35, 73, 41, 42, 75, 78, 50, 82, 20, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,32,41,75,-68,20,30,50,82,35,35,78,2,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, -10, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,25,-10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 49, 99, 70, 71, 42, 10, 76, -31, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,76,79,1,99,71,49,70,10,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 98, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,81,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 56, 27, 60, 44, -94, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,61,60,56,44,27,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 25, 74, -11, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,93,19,74,-11,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 98, 51, 5, 87, 88, -46, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,88,98,62,-46,33,29,5,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-51, 19, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,-51,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 21, 53, 6, 56, -41, 59, 61, 45, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,59,67,61,56,45,53,-41,77,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -2, 34, 66, -35, 99, 68, 70, 43, -52, 54, 55, 58, 90, 29, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,68,99,70,55,29,54,90,65,34,66,90,-35,30,-2,43,-52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 4, 5, 70, -45, 78, 49, 17, 50, 51, 19, -84, 85, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,85,78,57,5,2,17,70,-45,50,51,19,-84,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 0, 98, 67, 99, 36, 43, 76, 80, 19, 52, 21, 23, 89, 28, 62, 94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,62,67,80,76,43,98,23,99,94,-97,28,89,21,30,36,0,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 84, 7, 58, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,84,58,7,93,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 99, 44, -78, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,62,67,99,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 42, -93, 47, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,63,-93,67,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 38, -40, -10, 9, -75, 11, 81, 51, -53, 86, 89, 25, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-30,89,-53,51,38,86,-10,-10,-75,11,51,-40,4,-40,81,25,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(22, 23, 74, -12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,-12,74,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-86, 71, -93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,63,-86,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -81, 4, 59, 27, 91, 12, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,0,12,4,27,0,-81,46,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 8, -76, 76, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,-76,8,76,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 21, 40, 9, 74, 45, -62, 94, -63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,34,74,9,21,45,40,-63,95,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 90, 59, -45, 30, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,46,90,-45,4,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 38, -8, -58, 93, -47, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-47,38,93,99,-8,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 98, 3, 5, 43, 79, 16, -51, 51, 83, -54, -27, -59, 59, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,3,98,-51,79,97,63,94,51,-59,59,83,-54,16,43,5,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -81, 82, -67, 98, 36, 39, 73, 13, -63, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,48,13,82,39,47,-67,-81,36,73,39,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 1, 51, 85, 75, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,1,51,85,31,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 98, -36, 36, 5, -76, 76, 46, 16, 53, 54, 23, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,76,54,36,23,98,-36,-76,96,46,16,56,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 97, 67, -52, 69, 70, -43, 78, 47, 63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,-43,47,63,67,-50,95,97,70,-52,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 51, 11, -94, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,-94,51,-66,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 40, 73, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[40,73,63,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34, 2, 35, 68, 6, 38, -9, -73, -12, 45, 79, 52, -23, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,-9,35,45,6,38,63,34,-23,68,2,-12,1,-73,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -85, 38, 7, 75, 91, 12, 60, 29, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,29,75,60,38,34,-85,7,91,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -97, 97, -36, -13, 45, 78, 79, -50, 84, -54, 54, 22, -90, 93, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,97,78,-90,79,29,-13,78,94,32,-36,-97,54,84,-54,-50,45,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,-81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -1, -34, 2, 3, 38, 10, 44, 13, -48, 16, 51, 85, 86, 59, 91, 28, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,85,44,2,59,86,-48,-34,16,51,91,38,32,10,3,-1,93,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-68, -25, 8, 9, 28, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,44,-25,9,-68,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, -66, 97, 38, -71, 42, -45, 45, 17, 18, 23, 88, 25, 91, -60, 92, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,91,45,25,-34,-45,29,38,-66,18,42,17,88,23,-60,97,-71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 68, 20, 5, 25, 57, 41, 60, -30, 61, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,57,-30,68,5,33,79,60,20,61,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 97, 66, 7, 75, 43, 77, -16, 47, 51, -22, 85, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75,7,43,1,97,77,-16,88,-22,47,85,51,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -2, 98, 66, 67, 41, -44, 12, 45, 83, 26, -94, 30, -96, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,83,-96,-44,41,98,67,30,97,63,-94,-2,66,12,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 27, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,0,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -42, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,80,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 83, 52, -58, 26, 58, -29, 46, 78, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,46,78,26,58,63,-29,52,-58,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -83, -54, 75, -92, 11, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,75,-92,17,-54,11,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 81, -52, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-34,81,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 24, 72, 59, -14, 94, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,59,94,-14,24,72,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, -69, 6, 15, 49, 82, 52, 53, -22, 87, -94, -31, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,6,-94,15,52,87,35,-22,-69,49,82,31,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, -98, -3, 66, 67, 21, 10, 27, -77, 62, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,67,62,81,78,-77,21,-98,27,66,-3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 67, -85, 40, 57, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,-60,40,-85,32,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 82, 51, 72, -58, 27, 79, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,72,81,51,31,82,-58,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 48, 36, 5, -41, 24, 57, 30, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,96,30,5,24,57,24,14,48,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 34, 36, 38, -27, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,38,95,-27,36,-82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, -98, 2, 67, 4, 69, 9, 82, -84, 51, 90, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,4,2,69,96,90,67,97,-84,82,-95,9,-98,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 67, -71, -73, 49, 17, 50, 20, 53, 21, 55, 25, 89, 26, -28, 27, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,25,49,17,55,89,50,26,-28,53,-71,21,62,20,-36,27,67,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 99, 40, 8, -42, -75, 75, 45, 47, 80, 49, -56, 26, 91, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,-75,91,60,-56,47,40,26,80,8,99,91,75,45,-42,-98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 2, 20, 39, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,34,20,2,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -55, -10, 59, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-55,-94,-10,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 35, 4, 86, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,4,31,35,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 80, -1, 54, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-94,80,-1,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 51, -5, 54, -56, 55, 40, 56, 75, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,61,-56,55,54,-34,40,56,56,75,-5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 19, -6, -55, 26, -28, 43, 92, 44, 62, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,92,26,99,-6,-55,19,-28,43,44,19,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 67, -38, 5, -9, 8, 74, 76, 47, 18, 50, 51, 83, 53, 23, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,-9,-38,51,53,23,0,47,18,29,96,83,50,8,74,5,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 17, 82, 50, 3, -21, 4, -86, -92, 78, 31, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-86,17,17,-21,78,-92,4,31,96,3,15,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 34, 4, 39, 40, 76, -78, 79, 20, 85, -86, -23, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,85,34,-65,20,88,39,40,-23,4,-86,76,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 7, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,34,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 35, -70, 38, -73, 73, 9, -10, 12, 14, 20, 86, 87, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,38,14,24,24,87,86,20,32,35,12,73,86,-70,-10,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 68, 4, 36, 69, 39, 9, 42, 79, -80, 18, 82, 85, 57, 92, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-64,68,69,18,85,82,4,42,79,82,39,57,92,-80,9,36,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 51, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,1,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, -39, -7, 70, -40, 41, -12, 44, 78, -50, 18, 19, -53, 55, -89, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,41,-40,55,-53,-50,-39,78,-7,55,29,70,-89,19,44,36,-12,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -50, 82, 34, -6, 26, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,-6,65,26,82,34,-50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 33, 50, 52, -5, 72, 60, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,60,80,52,50,72,-5,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -18, 3, 25, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,3,79,79,25,-18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -98, 2, 3, 37, -39, 7, 9, -11, 11, 48, 85, -27, 60, 62, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,-98,-27,37,-39,60,3,2,48,9,-64,-65,-11,11,85,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 41, -10, 10, 75, -12, 79, -81, 81, 88, 89, 91, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,79,75,-12,-10,28,-81,28,88,89,65,10,81,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 64, 83, 67, 4, 86, -8, -25, 9, 42, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,80,9,64,-25,4,83,42,67,-8,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, -98, 4, 20, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,-49,-98,20,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 37, 40, 9, 80, 19, 85, -55, 54, 23, 24, 90, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,80,19,40,-55,23,63,90,37,9,37,54,85,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 34, -20, 36, 92, 45, 94, -32, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-32,79,45,94,92,-20,34,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -2, 3, -36, -71, 38, 42, 43, -76, 44, 79, 49, 84, 85, 23, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,44,43,23,42,84,-31,3,32,85,-36,-76,-71,79,79,38,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, -6, 5, 7, 72, -10, 43, 44, -79, 80, 16, -83, 52, 53, -89, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,72,-83,53,37,80,-10,26,52,-6,-79,37,-89,5,16,7,43,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 6, 38, -41, 12, 82, 83, 19, 52, -86, 21, 54, 88, 89, 27, 30, 63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,63,31,52,89,88,6,27,64,83,-86,38,82,12,19,21,30,-41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 97, 65, 2, 98, 4, -13, 12, 83, 21, 88, 90, 26, 60, 29, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,90,21,-13,26,12,30,88,97,4,2,0,83,98,32,60,0,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 66, 99, 37, 43, 77, 48, -19, 88, 26, 91, 92, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,63,88,92,-19,99,63,48,65,77,37,66,91,26,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 80, -4, -10, -80, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,80,-10,-4,79,-80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 84, 20, 54, 87, 39, -9, 29, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,-50,54,-9,95,87,39,29,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 19, 8, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,-26,19,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 67, 69, 53, 94, 47, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,69,2,79,94,53,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 65, 7, 72, 78, 16, -50, 81, 50, 86, -24, 23, 89, 59, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,-50,89,59,86,78,62,33,-24,81,16,-24,23,72,7,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, -50, 82, -53, 36, -10, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,-50,-10,-53,80,30,36,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-37, -70, 45, 77, 46, 79, 80, 49, 86, 56, 88, 91, -28, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,86,-37,-70,56,88,91,46,80,49,88,79,92,-28,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 1, 2, -4, 80, 51, 52, 86, -23, 88, 27, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,88,51,30,80,-4,27,61,86,1,-4,-23,-33,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 51, 83, -26, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,-26,83,-31,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 35, 4, -6, 38, 6, 76, 77, 46, -49, 83, -61, 92, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-36,38,77,95,4,6,-6,35,92,46,83,-49,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 19, 53, 55, 24, 40, 57, 41, 27, 11, 44, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,44,53,27,24,19,1,41,30,11,1,55,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52, 38, -23, 7, -73, 26, 74, -45, 94, 15, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,26,-73,-48,-45,52,38,94,7,74,-23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 87, 89, 91, 59, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,89,91,59,17,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 68, 8, 9, -77, 76, 78, 50, -54, 22, -87, -24, -56, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,76,35,-24,35,76,8,-56,-54,22,9,63,68,50,-87,30,50,78,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 3, 67, 36, 5, 6, -72, -75, 75, 11, -77, -47, -50, 49, -20, -53, 55, 27, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,-50,-53,-47,-77,75,5,-72,96,55,6,3,11,36,-20,49,-75,92,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 66, 4, 69, 40, 42, 11, 45, 17, 49, 21, -91, 27, 93, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,-91,11,34,66,42,61,69,4,21,4,30,40,45,17,49,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-70, 41, 14, 15, -50, 50, 82, 20, 55, 24, 58, 28, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,50,28,41,24,55,-50,-70,82,60,41,20,15,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 86, 55, 8, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,-93,17,8,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 35, 40, 73, 42, 43, 44, 12, 13, 51, 83, 19, 85, 57, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,94,65,42,51,43,13,12,35,83,40,85,19,57,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 67, 70, 40, 72, 73, 9, -82, 90, 58, 26, 92, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,70,73,40,90,30,64,67,72,9,58,26,92,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 17, 40, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,40,17,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, -22, 22, 41, 74, 29, -78, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,41,-96,29,74,-22,-78,-36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 36, 75, 11, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75,11,36,11,93,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38, 70, -40, -41, -73, -74, 77, 45, 78, 46, -53, 84, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,77,-53,45,-40,-41,-73,38,46,-74,84,61,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 67, -70, -39, 38, -74, 75, 76, 12, 14, 79, -82, 18, -53, 90, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76,-82,12,-39,14,90,99,75,93,18,67,79,-74,-53,-70,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 51, 99, 57, -45, 61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,-1,61,93,-45,57,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 98, -40, 9, 76, 79, 15, 53, 85, 24, -57, 57, -63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,31,53,24,-57,85,-63,98,9,85,97,76,79,57,-40,15,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 82, -70, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-70,23,-1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 21)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 34, 98, 8, -44, -50, 17, 50, -52, 85, 53, 21, -27, 27, 59, 91, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,61,32,27,85,34,53,-44,59,98,50,21,-50,98,17,8,91,17,-52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-19, 55, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,24,-19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 49, 98, 4, -24, 76, 29, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,76,-24,49,98,29,47,98,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 68, 54, 73, 74, 11, 61, -96, 63, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,-96,73,74,63,61,11,68,99,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -2, 71, -11, 75, -14, 78, -16, 17, 85, 53, 86, 24, 57, 89, 26, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-16,-14,57,24,31,85,-11,78,61,71,-1,75,24,86,89,-2,17,26,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 85, -72, -11, -29, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,-29,-11,76,85,-72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 3, 70, 9, 10, 75, 11, 78, -52, -54, -57, 56, 58, 59, -92, 94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,-52,-54,-57,75,-2,56,58,94,30,3,11,9,78,70,-92,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -97, 67, -7, 43, 78, 15, 16, -18, 19, 24, 56, 91, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91,67,-7,24,-18,32,27,56,16,19,16,78,15,43,-97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 99, 4, 68, 21, 23, 55, -44, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,23,18,21,-44,55,99,60,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 98, 66, -3, 67, 5, 72, -9, -42, -47, 18, 83, -55, 22, -91, 91, 94, -31, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,72,94,-55,98,5,-47,67,66,22,-9,18,0,91,-91,-42,-31,62,-3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 64, -49, 53, 38, 88, 24, 57, 74, 28, 12, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,96,57,-63,74,28,24,64,38,53,12,-49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 83, 74, 77, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,74,95,83,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -33, 65, 36, 4, 37, 41, 44, 14, 51, 84, -53, 22, -27, 90, 92, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,14,92,84,51,44,-61,-27,-53,44,22,4,41,64,90,37,65,-33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -2, 68, -11, -43, 45, 15, 19, -85, -53, -22, 57, 25, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-11,-22,45,68,59,96,-43,15,19,-2,-53,-85,25,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 4, 37, -73, 8, 41, -74, 44, -46, -49, 18, 83, -21, -86, 54, 23, 91, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,8,23,91,0,41,44,-46,83,92,4,-21,-49,-86,-74,37,54,18,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 6, 38, 11, -77, 46, 78, 47, 49, 52, 85, -86, 86, 23, 24, 90, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,11,47,6,85,49,46,24,90,78,32,38,86,52,23,62,-77,-86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 17, 51, 69, 86, 40, 25, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,25,40,69,51,86,69,-1,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 86, 77, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,-95,34,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(8, -74, 27, 28, 93, 31, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,27,31,79,93,8,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86, 6, 45, 46, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,46,63,46,86,6,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 69, 37, 38, 10, -44, 77, 14, 18, 84, -57, 89, 90, 92, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,36,-57,69,-44,84,77,90,10,37,89,14,28,18,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 1, 51, 4, 53, 11, 93, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,53,1,51,-81,4,93,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 54, 6, 73, -10, 59, -76, -92, 60, 12, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,-76,60,54,0,73,-10,46,12,-92,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 35, 3, 39, 45, 78, 16, 50, 51, 52, -86, 53, 58, -59, 92, 28, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,62,-86,51,58,67,45,58,53,52,78,92,35,16,-59,39,28,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71, -73, 74, 11, 49, 18, 83, 54, 86, 55, 56, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,-73,55,56,83,49,74,62,11,71,62,54,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 98, -5, 36, 4, 6, 38, 74, 78, -15, -50, 53, 55, 26, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,6,53,78,55,-5,32,74,98,60,38,36,-15,4,-50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -36, -38, 9, 74, 11, -19, 82, 51, -84, -87, -92, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,-19,-92,-38,-87,74,65,82,9,-36,11,-84,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 35, -37, 21, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,46,-37,33,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 50, 85, 38, -23, 30, 63, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,63,38,79,85,50,0,32,-23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 4, -43, -92, 61, 93, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[61,4,93,-43,-92,-48,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 20, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 34, 54, 8, -74, -42, 79, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,79,34,8,-74,16,-42,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 3, 53, 22, 26, 43, 13, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,3,26,22,43,53,49,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-4, -71, 71, 8, 15, 79, 48, 84, 89, 26, 28, 92, 61, 94, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,8,84,15,79,89,71,94,61,-4,-71,48,92,-95,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 81, 49, 52, -6, -26, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,81,49,-6,52,76,96,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 51, 37, 54, 86, 23, 40, 72, 10, 29, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,40,37,29,97,72,86,23,51,10,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 4, 37, 38, 72, 73, 9, 77, 48, 17, 19, 84, 56, 89, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,73,37,77,19,72,38,4,64,17,-93,9,89,48,56,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 3, 19, -76, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,19,3,75,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 35, 99, 40, 73, 74, 43, -77, 77, -82, 19, 55, 59, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[40,59,35,73,55,-60,99,-77,73,55,19,55,-82,33,74,77,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 55, 10, 11, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,11,47,16,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -66, -90, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,96,-90,29,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 21, 41, 43, 27, -77, 13, 45, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,13,45,21,63,-77,27,41,27,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -68, 36, -37, 71, 9, -79, -81, 81, -51, 54, 24, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,30,36,66,24,81,71,36,-79,54,-68,9,-37,54,-51,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 34, -48, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,34,-48,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 98, 35, 8, 57, 73, 10, 58, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,73,98,28,8,10,58,35,73,58,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 2, 68, 71, 76, -79, 46, 14, -17, 16, 25, -63, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-17,-79,66,71,71,-96,68,16,2,46,14,76,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -66, 36, 37, 71, 12, 45, 14, 79, 49, 81, -51, 21, 54, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,36,37,-51,90,81,-66,54,45,79,21,14,71,14,12,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 99, -8, 72, 9, 45, -78, 47, 16, 81, -50, 50, -52, 89, 26, 59, 28, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,9,28,72,45,93,-8,50,47,59,26,89,-52,62,81,65,-50,-78,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 0, 64, 66, 35, 69, 6, 71, -44, -12, -45, -80, -84, -27, 92, 60, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,-44,-80,-12,-45,-84,63,35,-1,6,0,66,-27,69,64,71,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 33, 66, 20, -57, 74, 26, 75, -76, 92, 78, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,97,20,74,75,47,92,-76,66,26,-57,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 2, 51, 68, 20, 21, 69, -38, 43, -45, 30, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,43,21,69,68,20,-45,2,15,30,69,-38,43,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-21, -28, 77, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, -66, -50, 2, -5, 55, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-66,-5,2,-50,55,-45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 37, -6, 71, 8, 9, 42, 11, 44, 76, -82, 88, 56, 57, -58, 27, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,44,42,76,99,9,11,88,57,71,-58,62,37,-82,8,-6,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-55, 71, 91, 93, -63, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91,-63,71,78,-55,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 34, 18, 98, 2, 3, 21, 58, 43, 12, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,58,34,21,80,12,18,45,98,43,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-3, 2, 99, 35, 68, 36, 37, 73, 11, 80, 54, -88, -25, 25, 28, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,80,73,35,54,25,-3,-88,-25,37,2,11,95,28,36,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -58, 73, 41, 58, 10, 27, 61, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,27,58,73,33,14,10,61,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 20, -72, 8, 88, -45, 44, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,8,-72,-45,44,20,95,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 7, -77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 87, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 0, 2, 35, 70, 7, 72, 45, 77, 14, 15, 83, 53, -86, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,7,35,72,53,15,2,2,70,72,14,83,-86,45,90,77,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-89, 25, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,-89,-64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 4, 5, 85, 9, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,5,98,31,4,9,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 53, 85, 54, -72, 59, 91, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,54,59,53,77,85,-72,91,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 69, 7, -41, 40, 12, 46, 49, 50, 22, 55, 56, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,-41,22,55,65,7,49,50,27,69,46,40,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 4, 68, 70, 40, 74, 46, 78, -15, 14, -16, 47, 56, 25, 58, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,-16,97,46,91,70,74,4,68,56,25,78,96,47,40,-15,46,14,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 65, -52, 84, 21, 74, 75, 28, 61, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[61,84,75,28,48,47,65,21,-52,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 17, 3, 55, 24, 57, 58, 75, 60, 61, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,17,57,61,24,75,55,3,-81,-46,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 99, 4, 42, 90, 59, -46, 61, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,42,-46,47,66,61,4,90,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 3, -71, 40, -42, 57, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,-71,74,-42,-50,40,57,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-6, 57, 58, 75, 79, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,-6,79,-96,-96,57,75,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 98, -85, 6, 25, 9, 26, 75, 77, 61, -15, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,77,61,9,34,-85,-15,75,46,98,6,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 81, -66, 3, 83, 35, 38, 72, -42, 28, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,72,3,83,35,81,-42,28,-66,38,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 65, 50, 82, 69, 21, 38, 6, 86, 7, 25, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,25,-65,50,6,46,6,82,86,69,21,65,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -40, 39, -46, 80, 84, 54, 55, 88, 58, 28, -30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,28,-46,80,58,88,39,-30,54,95,33,55,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 34, 44, -78, 15, -17, 22, -26, -58, 25, 27, 60, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,44,-58,-96,34,-78,22,27,25,15,-98,60,-17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, 84, 68, -54, -38, 71, 42, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,-15,66,68,33,42,-38,-54,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 20, 10, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,0,20,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(41, 9, 91, 30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,91,41,9,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, -4, 51, 53, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-4,51,54,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, 2, 35, -5, 4, -79, 17, 50, 52, 86, 55, 57, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,66,-5,4,86,55,35,2,-92,17,57,4,33,52,66,50,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 66, 52, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,92,81,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, -5, 4, 5, 88, 89, 91, 11, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,-5,35,4,91,5,11,77,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 66, 20, 7, -88, 40, 28, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,7,33,32,28,76,-88,20,66,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 68, -40, 57, 25, 91, 92, 12, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,25,91,0,92,68,61,25,12,-40,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -66, -35, 2, 40, -13, 77, 46, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,-35,46,62,-66,-13,40,96,77,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-73, 41, 42, 11, 12, -80, -50, 19, 20, 23, -56, 90, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,42,12,11,61,23,-50,-56,19,-73,41,20,-80,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 74, -76, 75, 44, 45, 14, 79, 49, -19, 20, -22, 88, 90, 91, 28, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91,88,14,44,49,79,45,95,98,-76,28,90,62,74,-22,-19,20,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 86, 58, 29, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,67,29,78,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-51, 85, 7, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,-51,56,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 50, 40, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,40,-74,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 16, -82, 17, 68, 70, 24, 91, 28, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,93,-82,68,91,17,80,70,16,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 34, 36, -6, 74, 11, 80, -82, -83, 19, -52, 20, 55, 23, 25, -61, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-6,19,34,74,55,25,0,-29,20,23,36,-83,-52,80,64,11,36,-82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 36, 68, -7, 72, 10, 76, 15, 81, 83, 20, 53, 54, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,83,15,53,53,36,68,10,-7,53,81,72,54,76,83,24,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 84, -69, 87, 7, 9, 90, 75, 43, -94, 47, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,87,34,9,47,75,15,90,43,-69,7,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 67, -71, 72, 41, 44, 12, 15, 84, 86, 26, 91, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,-94,-71,44,67,91,72,86,12,84,41,15,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 66, 50, 5, 87, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,66,5,50,50,81,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, -72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 51, 20, 42, 13, 46, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,20,42,79,19,51,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 99, 55, -57, 56, 89, 91, 59, -94, 46, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,46,91,32,97,-57,89,15,99,-94,59,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34, 36, 69, 39, -8, 40, 44, -78, -79, 78, 80, 81, 85, 56, 58, 59, 28, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,-78,28,39,59,40,56,85,-8,34,1,-95,80,36,58,44,-79,81,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 1, 67, 68, -72, -9, 74, 77, 47, 18, -84, 53, 22, 87, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,31,87,68,53,-72,67,47,-9,77,33,74,1,22,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 91, 12, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,91,12,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(40, -73, 44, -62, 62, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[40,44,62,-73,-62,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 3, -4, 57, 42, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,57,42,76,-82,-4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, -66, 34, 5, -23, 55, 58, -76, 92, -45, 78, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,55,-76,81,-66,92,78,-47,34,58,-23,-45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 97, 2, 18, 37, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,97,94,16,18,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 2, 68, 9, 41, -75, 12, 77, 82, 20, -23, 86, 93, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,12,31,68,1,-23,9,82,93,77,41,86,2,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -1, 97, -35, -4, 68, 37, 73, 9, -44, 44, 13, 47, 80, 87, 24, 60, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,9,64,60,44,62,68,37,-44,44,-4,-1,87,24,47,13,80,-35,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 81, 1, 36, 53, 5, 72, 74, 58, -44, 44, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,74,80,78,-44,81,1,72,5,44,36,80,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 98, -67, -3, 99, 3, 10, 12, 77, -20, 84, 21, 55, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,34,77,3,98,31,55,-67,21,84,12,-20,63,-3,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 70, -71, 73, -43, 78, -80, 79, -49, 80, 83, 84, 20, -86, 21, 88, 91, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,-49,-71,-43,84,83,80,-86,-61,73,-35,88,-80,91,79,78,21,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 4, 69, 7, 42, 74, 13, 47, 52, -53, 54, 23, 87, 25, 58, 92, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,74,58,23,47,92,68,87,61,7,69,47,54,13,52,25,4,-53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 96, 1, 66, 34, -7, 7, 40, 10, -82, 82, 51, 52, 84, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,91,66,96,52,-7,10,34,84,82,1,7,40,-82,51,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 35, 54, 44, 45, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,44,35,16,54,45,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 67, 69, -56, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,67,69,8,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -66, 35, 38, 40, 73, 74, 45, 15, 81, 84, 22, 25, 31, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[40,22,25,73,1,84,-66,35,31,74,81,-96,15,38,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 64, 81, 34, -3, 84, -37, 6, 89, -29, 93, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,34,93,-3,84,6,-29,80,81,64,-37,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 84, 38, 91, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91,84,81,38,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 83, 85, 38, 8, 9, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,9,8,63,38,85,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 66, 34, 5, -73, 43, -14, -47, 48, 81, -18, 18, 82, 19, 28, -61, -96, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,81,19,-14,63,-47,66,28,5,18,43,48,-73,-18,33,-61,34,82,-18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -51, -4, 86, 55, 87, 25, -11, 28, 77, 95, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,95,87,-48,25,1,86,-4,87,77,28,-51,-11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 34, 18, 52, 21, -38, 22, 54, -27, 30, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-27,21,52,-38,2,30,34,22,-80,54,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -98, -35, 70, 38, -9, 8, -41, 42, 44, -54, -88, 24, 89, 25, 29, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,-9,62,25,70,8,63,-88,44,0,-98,38,-54,29,-35,24,8,42,-41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 1, 66, 67, 76, 14, 16, -52, -20, 19, 85, 91, 28, 63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,16,-52,-20,85,1,-52,63,19,66,91,28,31,14,76,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-19, 38, -93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,63,38,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 0, 66, 34, 3, 8, 77, 49, 17, 50, 84, -59, 58, 26, 29, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,84,77,29,3,61,29,66,50,96,-59,58,17,34,96,0,26,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 3, -21, 87, 39, -73, 88, 42, 27, 60, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,42,-73,47,87,39,27,60,-21,3,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 66, -99, 3, 67, 35, 37, 69, 11, 78, -17, 17, -50, 81, 22, 87, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,78,3,37,66,3,69,-50,-17,11,-99,22,62,67,92,97,81,87,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 52, 36, 39, 24, 11, 62, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,24,62,39,-15,52,36,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 69, 6, -56, 72, -93, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,-56,69,6,-93,29,6,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 92, -14, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,62,-14,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 5, 12, 13, 48, 80, 85, 22, 86, -88, 57, 90, 26, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,37,57,5,22,62,22,86,48,13,12,80,62,26,26,85,-88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 36, 8, 12, 14, 15, -49, 81, -50, 18, 19, 21, 87, 27, 91, 29, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,81,8,36,29,-49,21,-50,18,87,30,14,12,27,19,91,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(87, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 71, 8, 73, 11, 13, 15, 16, 50, 19, 84, 52, 23, 88, -58, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,-58,19,28,84,13,8,11,8,23,52,88,28,15,65,73,50,65,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 2, 99, 4, -12, -77, 45, -48, 15, 18, -54, -57, 89, 90, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,99,89,4,-48,45,98,15,-57,-12,2,2,18,90,-12,-77,-54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 33, 66, 3, 68, -6, -14, -78, -55, -90, 27, 28, 61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,3,66,28,-14,97,27,-55,-6,33,61,-55,68,-78,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 68, 38, 39, 71, 11, -50, 18, 19, 83, 87, 24, 26, 93, 61, 31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,24,11,39,93,87,68,71,19,18,31,83,-50,3,26,61,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 3, 38, 41, 44, -80, 81, 50, 53, 87, 90, 29, 61, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,44,87,94,90,-80,53,41,38,50,81,61,33,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -37, 37, 73, 42, 13, 78, 83, -24, 92, 93, -30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,92,96,-37,42,13,37,95,-24,83,73,93,-30,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 67, 4, 73, -13, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,67,49,4,-13,-48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 17, -67, 3, 36, 52, 85, -87, 7, 73, 77, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,85,79,7,-17,36,-87,-67,17,3,73,52,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 49, 33, 21, 57, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,32,49,57,33,-60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 2, -87, 87, 42, 10, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,-47,96,87,2,-87,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 17, 98, 34, 51, -54, 56, -43, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,-54,33,98,76,56,17,34,-43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 66, 98, -36, 84, -23, 73, 91, -45, 62, 47, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,47,84,62,73,-45,62,81,-36,-23,98,79,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 66, 6, 54, 13, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,6,66,54,29,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(54, -15, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,-15,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 81, -50, 84, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,84,16,37,-50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 35, 36, 5, 39, 40, 76, 48, 80, 17, -82, 18, -21, 88, 89, 28, 93, -94, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,89,18,76,93,28,40,35,39,-94,-62,88,17,36,-82,-21,5,0,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 54, 86, 43, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,43,-98,86,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 67, 42, 75, 45, -16, 81, 53, -87, 24, 58, 28, 30, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,28,30,-87,62,75,53,-16,-87,67,81,53,58,24,42,97,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 34, 68, 69, 7, 42, -75, 12, 15, 51, 20, 84, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,12,20,34,62,15,69,42,96,51,7,-75,84,96,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 34, 68, 5, 71, 9, 12, 77, 84, -86, -28, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,5,97,-86,71,77,34,9,63,96,84,68,34,-28,62,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 89, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,89,-80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 4, 26, -43, 42, 43, 11, -95, 94, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,-95,26,-43,94,42,43,14,11,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(8, 73, 10, 28, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,8,28,95,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 97, 33, 69, -71, 76, -46, 16, 82, 19, -85, 55, -25, 56, 57, 90, 28, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,-25,90,63,-71,-1,82,-85,76,69,28,19,16,97,56,57,33,69,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 71, 40, -13, 47, 82, 18, -85, 54, 87, 26, 63, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,82,63,-13,-85,71,-96,26,40,54,67,87,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 68, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 65, 67, 8, 73, 12, 14, 79, 22, -24, 56, -25, -58, 58, -94, 29, 62, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,58,12,-25,-94,29,79,67,-58,65,22,14,73,62,-24,64,94,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(37, 60, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,37,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 32, 33, 82, 90, 91, -47, 30, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,48,82,91,31,32,-47,30,90,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 18, 35, -87, 92, 44, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,46,35,-87,-81,44,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 35, 5, 7, 74, 12, 82, 19, 52, -87, 89, 90, 92, 61, -31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,63,89,5,74,1,7,90,74,35,52,61,82,63,92,19,-31,35,-87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 35, 84, -39, 88, 58, 27, 29, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,84,88,27,58,29,49,35,29,77,-39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 70, 7, 39, 41, 42, -77, -48, 52, 20, 25, 89, -62, 29, 93, 62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,20,7,25,70,64,39,-62,29,89,31,-48,-77,62,93,41,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -1, 33, 70, 6, 74, 42, 80, 81, 50, 51, 52, -53, 54, 25, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,54,33,51,74,52,25,-53,80,-1,70,26,81,42,50,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 64, 1, 54, 6, -73, 24, 73, -58, 76, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,54,-65,64,-73,76,73,24,13,6,-58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 0, 68, 38, 7, -9, 74, 11, 76, 77, -50, -56, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,77,76,74,-9,-56,68,-1,-92,0,7,38,-50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 2, 67, 4, -5, 53, 40, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,4,50,2,63,53,-5,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 54, 38, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,10,-1,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 98, 67, 7, 46, 81, 50, 18, 53, -86, 22, 23, 90, 94, -96, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,22,7,-96,23,46,34,53,81,94,90,18,-96,95,81,67,-86,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 84, -9, -89, 77, 62, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,84,-9,-89,62,77,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -67, -71, 8, -74, 9, -75, 75, -79, -15, 80, 83, 54, 23, 89, 91, 61, -31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-74,-79,89,-71,54,96,61,95,-15,-67,80,9,83,23,91,8,75,-75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 17, 3, 56, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,3,97,57,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 2, 4, 9, 75, 77, 45, -15, -17, 82, 50, 51, 85, 21, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,9,-99,-17,2,21,51,77,82,4,59,50,75,-15,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -98, 98, 86, -23, 71, 56, -27, 26, 43, 29, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,43,97,29,-98,79,86,56,-27,71,-23,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 19, 84, 55, 87, 26, 61, -31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,55,26,-31,87,95,61,84,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -86, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,-86,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 36, 40, 72, 73, 77, 78, 80, -49, 48, 52, 84, 55, 24, -93, -31, -95, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-31,55,-95,80,-49,36,40,48,95,52,73,72,77,24,78,97,84,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 81, 5, 27, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,5,81,80,-46,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 4, 69, 70, 6, 8, 42, 45, 79, 17, 23, 24, -57, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,45,42,24,70,6,90,98,69,23,17,-57,79,6,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 7, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,76,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 1, 36, 38, 70, 39, 73, 75, 11, 53, 22, 55, 24, 59, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,22,39,73,38,24,33,70,73,1,75,59,33,31,53,96,55,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 49, -52, 19, 83, 41, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,15,-52,41,19,83,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, 68, 69, 42, 14, 81, 85, 22, 25, 92, 29, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,68,42,29,81,85,69,42,61,92,14,25,0,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -34, 5, 39, 41, 45, 46, 15, -49, 22, -87, 88, 90, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,5,32,46,22,-34,88,90,15,39,-87,45,61,-49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 33, 98, 35, -37, 9, -75, 11, 43, 16, 82, -85, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,0,11,-75,16,-85,43,1,82,35,33,98,-37,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 70, 38, 79, 15, 47, 16, 18, 51, 52, -54, -26, 57, -92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,70,18,-92,16,15,38,-26,57,36,62,51,-54,47,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, -68, 5, 37, -41, 43, 13, 15, 48, 18, 52, -22, 86, 88, 24, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,-22,-68,13,27,52,15,18,-41,5,88,24,37,43,48,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 97, 51, 3, -85, 21, -38, 85, 70, 44, 28, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,-38,64,93,51,44,-85,3,97,28,70,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-83, 6, 41, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,6,73,41,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 35, 5, -78, 15, 47, 48, -17, 81, -51, 22, 56, -60, 91, 59, 93, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,35,48,93,22,15,56,5,35,-60,47,91,-78,30,-17,61,96,-51,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 64, -66, 4, 39, 72, -11, 22, 89, 58, -91, 28, 29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,58,32,-11,64,4,-66,89,72,-91,28,29,63,28,22,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 98, -89, 41, -75, 77, 93, 29, 14, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,-89,77,41,-75,93,98,-48,-81,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 36, -54, 6, 41, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,41,6,36,-54,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 4, -40, 73, -47, 16, 50, 20, -22, 24, 56, 29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,20,-40,-47,-97,73,16,24,29,63,-22,56,50,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 66, 18, 82, 19, 3, 52, 85, 38, 29, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,85,66,15,18,19,29,82,52,38,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 98, 3, 68, 5, -10, -76, -46, 77, -17, 85, 87, 59, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,68,-46,98,59,85,-17,61,62,5,32,77,-10,-76,77,62,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 51, 37, 21, 25, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,25,75,-34,21,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, -68, 3, 35, 36, 73, 52, -57, 88, 27, 92, 60, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,-57,-68,27,3,92,36,52,88,73,35,92,-2,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 96, 0, 98, -38, 75, 12, 76, -45, 80, 82, 22, 58, 90, 91, 28, 92, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,64,28,98,12,75,96,-38,80,76,82,0,92,-93,90,91,-45,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 70, 7, 73, 43, 44, 46, 49, 84, -86, 22, 87, 56, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,56,-86,84,70,44,7,22,87,46,43,31,32,70,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 21, 38, 88, 58, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,-44,38,88,58,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 50, 51, 83, 68, 69, 71, -90, -11, 92, -79, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,51,68,50,-11,69,69,83,80,63,-90,92,-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 98, 34, 19, 84, 74, 26, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,19,98,84,-50,12,34,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 67, 36, 54, -72, 40, 57, 25, 11, 59, -60, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,59,57,-60,36,67,40,54,25,96,75,-72]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 81, 69, -9, 27, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,96,81,-9,69,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-32, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,-32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 67, -53, 37, -86, 85, -56, 25, -93, 92, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,25,37,-86,-93,92,-56,85,34,67,25,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 83, -14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,96,-14,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 2, -56, -73, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,41,-56,2,-73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 49, 19, 51, 83, -20, 86, 92, 77, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,77,86,64,49,19,51,83,14,92,-20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 51, 36, 37, -23, -8, 89, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,51,89,-23,36,2,-8,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 3, 54, 71, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,3,54,71,88,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 97, 17, 83, 84, 6, 42, 75, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,83,97,6,75,42,80,17,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 98, 36, 70, 39, 40, 9, 10, 43, 44, 79, 17, -85, 85, 89, -93, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,10,43,39,30,9,9,79,98,32,44,40,89,17,36,9,-93,-85,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 18, 51, 68, 53, 74, -27, 58, 75, 94, -79, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,51,-27,94,58,-79,53,68,2,18,75,-15,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 97, 34, 3, 99, 69, 70, 72, 42, 11, 76, 16, 52, 60, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,76,3,76,99,1,60,70,16,42,69,52,72,11,34,97,3,-30]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 67, 84, 71, 42, -11, 46, 78, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,46,78,71,63,84,94,67,-11,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 33, 19, 70, 54, 87, 10, -63, 14, -31, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,19,19,70,87,14,54,15,33,80,10,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 35, 99, 3, -4, 70, 7, 71, 78, 53, -88, -56, 55, 58, 59, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,59,7,31,35,53,71,70,78,99,71,-88,-56,58,3,55,34,55,-4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, 22, 54, 55, -25, -76, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,-76,-25,55,15,54,-18,-76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 32, 97, 37, 7, 8, 73, 43, -46, 18, 53, 54, 23, 57, 60, -62, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,7,73,94,43,60,57,37,18,53,8,-62,54,18,97,-46,23,60,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 19, 69, 37, 5, 70, 22, -10, 9, 77, 15, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,15,32,69,-10,9,70,37,19,77,5,95,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 98, -39, 25, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-39,82,25,12,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 98, -37, 68, 36, -73, 72, 17, 51, -54, 86, -87, -88, 24, 56, 91, 59, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,95,17,-73,24,98,86,72,91,51,-88,-37,56,68,-87,36,51,-54,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 98, 68, 6, 38, 10, 43, 14, 49, -51, 84, 23, 90, 29, -95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,1,68,1,6,23,-51,38,63,90,10,84,14,-95,98,49,29,1,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 1, 50, 67, -23, 25, 43, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,50,1,92,25,-23,67,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 35, 7, -8, 76, 13, 79, 16, 50, 54, 26, -93, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,-8,26,79,16,54,13,35,93,50,34,76,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 33, -21, -54, 55, 8, -27, 45, 77, 46, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,45,77,33,8,-21,-27,46,8,-54,55,-21,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, -83, -36, 22, -75, 61, 46, -79, -16, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-75,-83,22,-16,63,61,46,-36,-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 98, -68, 35, 39, -73, 43, 12, 13, 18, 86, 87, 89, 90, -60, 29, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,90,18,-68,33,-60,29,98,35,12,43,13,39,-73,86,12,62,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 55, 89, 41, -58, -27, 10, 13, -94, -14, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,-94,47,-14,55,89,41,-27,10,32,-58,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 41, 10, -76, 44, 12, 47, 49, -19, 50, 51, -20, 83, 89, 25, -91, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,51,41,-91,-19,89,44,-20,25,36,47,-76,50,25,49,83,12,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -67, 67, -69, -9, 9, -11, -43, 11, -15, -81, 55, 56, -59, 58, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-9,-59,-67,-69,67,58,11,9,-15,55,65,-11,29,-43,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(89, -62, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,62,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 1, -4, 99, 41, 11, 45, -48, 48, 49, 18, 86, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,62,-4,11,86,99,45,49,48,-1,41,1,18,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 7, 71, 40, 12, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,40,95,-36,71,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 66, -37, 69, 5, 75, -48, 18, 52, 85, 24, 91, 59, 29, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,69,-37,29,95,75,52,31,65,91,18,24,5,85,59,-48,69,-37,-48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86, 38, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,40,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-37, 89, 76, -15, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,-15,31,76,89,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 37, -39, 38, 8, 12, 77, 47, 48, 18, 52, 56, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,12,-39,56,18,8,47,99,37,59,52,77,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 68, 70, 7, 72, 9, 10, 47, -18, -20, 83, -21, 26, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,31,-20,-18,9,83,70,68,26,47,26,72,10,9,10,7,-21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 19, 51, 54, -56, 55, 40, 45, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,40,45,-56,19,55,51,47,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 66, -23, 92, 28, 94, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,-35,28,63,94,-23,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 2, -38, 55, -26, 60, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,-31,60,55,-49,2,-38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 69, 40, 28, 30, 14, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,69,30,14,28,46,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 50, 51, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,50,-2,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 19, -84, 20, 24, 90, 43, -92, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,43,-92,80,-84,19,20,24,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 5, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,67,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 0, 33, 98, 68, 44, 16, 49, 81, 21, -86, 56, 90, -60, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,98,90,44,68,49,-60,28,-33,16,-86,0,21,33,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 65, 98, 35, 39, 41, -77, 13, 16, 81, 87, -92, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,16,97,13,98,-77,87,35,-92,39,98,41,91,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 4, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,97,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 67, 37, 5, -79, 82, 84, -26, 25, 57, 58, 93, 94, -63, 30, -31, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,58,-79,82,37,5,94,-26,25,-63,57,65,30,67,84,-64,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, 52, 39, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,87,2,0,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -5, 21, 90, 28, -94, 78, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,-5,90,63,78,-94,28,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -2, 81, 98, 3, 70, 87, -57, 89, 10, -29, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,98,1,70,3,87,-2,81,89,10,-29,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-6, 6, 42, 45, 18, 50, 86, 54, 23, -62, 29, -95, 31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-62,23,42,86,31,-95,18,45,6,50,29,54,95,29,-6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 66, 83, 53, 69, -55, 54, -25, 57, 91, 44, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,57,91,-55,53,61,44,66,69,83,54,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -3, 3, -84, 53, 27, -60, 43, 76, 14, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,27,-60,43,3,53,17,76,-84,-3,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -67, -35, 67, -9, 74, 10, 11, -79, -49, 53, 60, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,53,60,74,11,-67,-35,0,67,10,92,-79,-9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 18, 2, -52, 3, 19, 75, 59, 12, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,-52,18,2,75,46,-50,3,59,19,75,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 97, 3, 99, 20, -25, -57, 26, 59, 44, 29, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,26,65,3,29,59,-25,97,47,-57,99,44,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 3, 68, 20, 36, 6, 7, 12, 45, -79, 79, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,79,83,15,3,12,7,68,20,6,36,-79,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 98, -68, 56, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,56,98,78,-68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 34, 2, 66, 67, -72, 73, 44, 46, 78, 81, -19, 51, 19, 52, 24, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-33,24,44,52,46,67,51,19,34,-19,81,73,28,2,78,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, -51, 98, -22, 88, 56, 57, 76, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,-22,50,94,57,56,76,98,-51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 51, 85, 9, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,-44,-65,85,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -99, 20, 87, 72, -92, 27, 29, 46, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,29,46,-92,63,46,72,20,97,72,27,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -83, 68, 8, 25, -94, 77, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-94,46,25,8,68,-83,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 23, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,23,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -36, -6, -71, 7, 47, 48, 83, 51, 20, -21, 90, -29, 60, 28, 92, 61, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,83,-29,-6,-71,60,61,28,92,93,51,48,-36,20,47,34,-21,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 33, 1, 98, 2, -41, 88, 75, -78, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,-41,-78,2,75,63,-65,1,33,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 32, 64, 96, 1, 67, 71, 13, -48, 81, 52, 94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,0,52,67,32,64,96,94,30,96,1,71,81,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 1, 2, 3, 85, 22, 6, 10, 44, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,29,2,85,22,10,-33,6,3,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 35, 67, 5, 38, -8, 73, -46, 47, 16, 80, 17, -54, 54, 89, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,38,-63,-54,-46,89,89,54,-8,35,17,67,5,47,73,80,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 4, 86, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,-36,4,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, -98, 34, 66, 83, 35, 52, 55, 74, -15, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,63,55,83,66,-18,-98,-15,74,52,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 57, 90, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,90,44,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 99, -38, 71, 9, -75, -47, 15, 18, 83, -55, 54, 55, 24, 59, 93, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,-55,-38,-96,59,83,-47,9,-75,54,71,93,18,55,99,15,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 67, 3, 38, 8, -41, -75, -44, 43, 47, 80, 50, 54, -24, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,35,80,-24,8,50,-41,89,-75,67,3,-44,43,54,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 81, 54, 77, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,17,77,81,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 19, -5, 6, 12, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,45,19,12,-5,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 48, 33, 97, 34, 24, 59, -28, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,59,34,59,47,33,48,-28,24,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 39, 41, 42, 74, 76, 28, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,42,39,41,74,93,28,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 34, 2, 55, 56, 46, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,46,14,34,55,56,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, -68, -60, 46, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-60,14,-68,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 84, 55, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,83,55,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, -4, 35, -69, 4, 24, 56, 75, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,92,75,75,-69,24,-4,56,4,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 98, -4, 5, 69, 70, 41, 74, -77, 78, 18, 85, 55, 24, 57, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,85,70,69,94,0,-77,41,-4,98,78,55,74,78,57,41,24,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 66, 99, 67, 42, 11, 75, -13, 48, -17, 54, 25, 91, 59, -61, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,11,48,99,91,-13,-97,-17,75,66,42,59,62,67,63,-61,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 22, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,22,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 34, 2, 6, 74, 10, 76, 46, 15, 16, 80, 18, 52, 23, 60, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,34,2,16,6,62,65,74,52,60,80,80,15,10,76,92,18,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, -67, -4, 68, -37, -7, -8, -78, 47, 50, 20, 55, 56, 25, -27, 59, -93, 29, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,29,55,-8,-78,25,20,-7,47,59,68,-4,33,-93,-37,56,-67,-27,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -2, 1, 3, 45, 15, 48, 16, -19, 19, 53, -23, -92, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,15,0,95,-23,48,-2,-19,45,53,19,-92,1,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 20, 40, 74, -91, 59, -14, 61, 62, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,59,66,20,62,-14,61,46,40,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 34, 67, 38, 6, -47, 78, -82, 50, 53, 86, 56, 57, 92, 60, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,56,98,-47,38,-82,57,60,86,53,34,38,30,50,78,98,6,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 97, 50, 99, 35, 39, 58, 92, -15, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,58,99,17,-15,17,92,35,50,97,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 18, 53, 86, -8, 8, 56, -90, -44, 12, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,-17,8,18,-44,12,76,-8,12,56,-90,53,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 0, -51, 3, 36, 4, 37, 21, 70, 22, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,37,48,70,-51,36,21,22,59,4,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 84, 68, 52, 69, 39, -88, 56, -74, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,30,56,69,39,-74,96,-88,52,1,1,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, -99, 36, 71, -75, -45, 44, 77, 13, -15, 78, 47, -83, 19, 54, 56, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,77,-45,54,19,56,90,36,44,-83,-15,13,71,32,78,-75,47,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34, -3, -6, 7, 41, 73, -45, 16, -55, 58, 27, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,27,41,73,-55,28,1,58,16,-45,-3,7,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 2, -53, 21, 40, -9, 56, 28, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,40,46,-9,28,21,81,31,2,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, -42, 9, 44, 78, 15, 16, 49, -18, -83, 22, 86, 87, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,15,-42,59,9,87,49,-18,16,98,78,44,22,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 1, 66, -36, 4, -39, 6, 7, 40, 78, 16, -52, 86, 87, 27, 92, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,31,-39,4,86,6,1,87,92,0,78,64,40,7,-52,-36,1,16,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, 2, 66, 39, 10, -12, 77, 47, 15, 48, 23, 89, 26, -61, 61, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,89,48,23,26,-12,10,47,2,15,61,10,32,77,-61,39,29,97,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 16, 2, 36, -38, -87, 25, 27, -77, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-87,27,2,80,16,25,-87,36,-62,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 48, -66, 98, 19, 37, 10, 27, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,37,98,19,10,27,-66,48,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 41, 74, 44, 79, 49, 22, 55, 87, 88, 91, 29, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[44,79,29,55,22,74,34,91,93,88,49,41,87,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, -3, 37, -23, -89, 24, 75, 93, 29, 15, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,-23,-89,15,24,-3,-81,29,37,75,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -20, 19, -36, 53, -9, 26, 10, 11, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,-9,46,53,11,26,10,19,66,-36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 34, 52, 53, 72, 91, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[72,95,91,33,53,34,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 98, 67, 36, 68, 6, 8, -45, 14, 79, -84, 19, 54, 55, 23, 88, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,-84,-62,65,8,36,6,98,88,68,55,23,79,14,67,19,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, -43, 26, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,-43,26,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 65, 99, 35, 37, 5, 70, 74, 10, -13, 79, -81, -51, -85, 85, 22, 27, 28, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,99,35,79,-51,-13,-81,-31,1,27,37,85,5,-85,70,22,74,10,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 68, 53, 23, -56, -90, -12, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,-56,-12,53,-67,-90,46,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 98, -84, 70, 55, -88, 23, -59, 26, 92, 94, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[92,-59,94,98,46,55,-88,-84,17,26,23,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 84, -86, -22, -42, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,43,17,-42,-22,-86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, -34, 73, -75, 42, 75, 78, 79, 47, 16, -18, -19, 51, -85, 87, 56, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,97,79,47,78,16,-75,31,87,-85,51,42,-19,73,-34,63,75,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 20, 84, -5, 69, -40, 56, 25, -27, 75, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,75,-27,14,20,-40,84,56,66,25,-5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 66, 6, 39, 73, 44, 53, 54, 88, -27, 26, 27, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,44,-27,1,73,28,26,53,54,27,88,66,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 32, 66, 67, 37, 70, -72, -76, -84, 22, 87, 25, -59, 91, 93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,93,22,91,37,87,67,25,63,64,-59,-72,-84,66,32,-76,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, -67, -4, 38, 39, 42, 77, 16, -19, -54, 53, -56, 24, 26, -27, 92, 28, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-54,92,77,-4,42,26,-56,24,95,38,16,-66,39,28,-27,53,31,-19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 2, 4, -39, 73, 10, -44, 76, 78, 17, -51, 19, 92, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,-44,19,73,-51,32,76,78,33,17,4,10,29,92,-39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 34, 3, 37, 6, -41, 73, 44, 49, -86, 54, 24, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,94,54,49,6,24,73,34,44,3,34,-41,-86,37,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -97, 97, 52, 4, 7, 73, -11, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,73,0,97,-97,4,7,-11,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71, 41, 11, -46, 79, 80, 83, 84, 54, 87, 56, 24, 58, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,56,-46,41,54,87,11,58,84,71,80,80,83,24,-96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 3, -23, -91, 60, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-23,3,60,-91,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 0, 68, -69, 37, 23, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,23,0,68,37,27,-69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 66, 50, 99, -38, 6, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,99,82,66,29,50,82,-38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 51, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 18, -51, 20, 70, 8, 72, 57, 10, 27, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,18,70,8,-82,-51,27,18,44,10,72,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(70, 88, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,88,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 3, 87, 89, 27, 61, -63, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-63,89,27,61,-35,87,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 50, 3, 84, -5, 5, 40, 88, -76, -95, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,5,50,32,-5,79,3,40,88,-95,-76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 19, -10, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-10,50,60,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 99, 36, 69, 72, 80, 18, -83, 50, 54, -29, 60, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[72,18,0,80,-29,-83,69,94,99,54,36,93,60,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 2, 35, 7, -11, 45, 81, 49, 83, -84, 22, 23, 24, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,-11,22,96,63,81,83,49,24,45,2,7,-84,35,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 33, -35, 69, 23, 40, -26, 90, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,-35,69,40,62,23,81,33,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 19, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,16,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 68, 6, 90, -76, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,6,90,-76,68,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 96, 82, 50, 4, -21, 20, 12, 76, 13, 95, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,-97,96,-21,12,82,13,20,76,95,15,82,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, -70, 41, 92, 61, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[61,-18,41,92,77,-70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 98, 67, 3, 99, 77, 16, 82, 18, 19, 83, 84, 87, 59, 60, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,67,16,-67,98,95,77,3,82,60,18,19,99,60,99,93,83,87,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(21, 85, 37, 72, 57, 90, 42, 11, 43, 61, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,57,85,72,90,11,78,37,61,42,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 81, 20, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,20,12,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 42, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,92,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 67, 6, 41, -80, 16, 17, 83, 52, 84, 58, -28, 28, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,17,-28,16,58,41,83,35,-80,6,52,84,67,35,28,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -49, 33, 66, -37, 5, 6, 77, 13, 78, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,78,33,-37,77,32,13,31,66,5,-49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 98, 99, 39, 41, -43, 75, 12, -79, 81, 85, 26, 59, 94, -31, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,94,39,81,12,85,99,-31,98,-43,26,41,-79,75,39,59,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 16, 98, -9, 58, 93, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,-9,93,16,58,98,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 67, 36, 6, 8, 74, 12, 16, 20, 22, 87, -56, 91, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,74,12,28,20,16,8,87,22,91,36,22,-56,65,65,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, 66, -38, 42, 76, -13, 44, 78, 79, -16, 80, 48, 49, 92, 94, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76,66,94,80,0,48,96,42,-38,92,79,49,-16,-96,-13,78,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 64, 1, 82, -36, 83, -8, 72, -13, 12, 45, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-36,-13,45,82,-8,45,-81,1,83,12,72,31,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 84, -22, 86, 24, -74, 92, -61, 46, 31, 47, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,84,31,-22,92,-66,46,-61,24,-74,95,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-40, -44, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,-44,-40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -35, 4, 38, 54, 70, 39, 42, -27, -77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,42,66,39,4,38,-27,-77,54,70,-35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -98, 7, 16, -50, 83, 53, -55, 86, 23, 90, 60, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,60,-50,29,90,23,0,83,7,53,86,-98,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -2, -66, 98, 99, 39, 71, 73, 12, 45, 18, 84, 54, -26, 90, 92, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,84,39,92,-2,98,90,93,92,54,32,71,73,-26,45,99,-66,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, 39, -59, 44, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,44,39,-59,-5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-73, 9, -28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 65, 2, 67, 52, 69, 73, 89, 25, 26, 45, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,73,67,52,64,65,26,89,25,45,13,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(86, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 81, 65, 18, 54, -8, 8, 72, -58, 58, -29, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,18,58,8,81,78,-29,-58,65,-8,72,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -98, 19, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,32,-98,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 80, 20, 53, -87, 38, 26, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,75,-87,53,32,80,38,32,26,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -24, -74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-24,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 35, 67, 19, 70, 7, 24, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,35,70,14,67,7,64,24,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 88, 8, 26, 60, 61, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,88,61,26,20,8,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 1, 67, 36, -37, 38, 10, -75, 44, 13, 16, -50, 52, 86, 55, 24, 27, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,10,67,13,27,44,38,-50,86,-75,97,55,36,97,-37,61,24,1,52]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -34, 3, 8, -74, 13, -83, -51, 82, 19, 52, 54, -55, -89, -58, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-51,65,-34,-74,3,52,19,65,82,54,-58,61,-89,8,13,-55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55, 8, 88, -59, -31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,55,-31,63,88,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34, 99, -5, 37, 7, -74, 9, 12, 45, -20, -52, -21, 89, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,89,45,-74,12,-20,37,-21,7,9,-52,-5,99,26,9,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -37, 69, 37, 40, 80, 81, 17, 85, 22, 86, 25, -59, 90, 27, 92, 60, 29, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,-59,40,-37,81,29,92,65,90,17,95,69,27,80,25,60,86,85,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 70, 40, -11, 11, 77, -14, 14, 16, 48, -51, 20, -90, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,16,-51,-90,20,48,40,-66,77,-11,11,70,-14,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 4, -69, 74, 10, 45, 78, 16, 51, -52, 20, 53, -54, 87, 24, 90, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,45,74,-33,62,24,20,-52,90,4,-69,87,53,10,-54,78,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-3, 73, -44, 44, 16, 48, -83, 53, 86, 88, 56, 58, 59, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,88,86,56,58,48,-3,-83,-44,94,59,53,73,16,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 85, 23, 88, -58, -60, 45, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-60,85,45,83,23,45,88,-78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 83, -37, 69, 74, 93, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,83,-63,74,93,-82,-37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 34, 68, 69, 75, 11, 78, -47, 82, -52, 55, -25, 56, -90, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,-52,75,78,-25,68,55,97,34,69,56,11,82,-90,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, 9, 42, 76, 13, -80, 79, 48, 49, 19, 52, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,9,49,19,60,79,76,13,1,42,48,52,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 18, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[81,71,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 37, 39, -40, 8, 14, 15, 50, 19, 20, 54, -56, 56, -61, 61, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,20,14,54,94,-61,61,39,8,0,-40,37,15,50,56,93,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, -23, 88, 11, 77, 13, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[77,-23,88,13,14,36,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 98, -7, 7, -13, 12, 49, 18, 21, 88, 27, 93, -32, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,-13,7,-7,98,7,49,88,18,-32,21,93,97,12,-96,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -4, 70, 87, 24, 94, 30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,63,94,24,-4,87,30,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 86, 56, 24, 63, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,63,24,47,56,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(73, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 98, 69, 5, 38, 41, 74, 13, -78, 50, 83, 56, -92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,69,74,98,1,13,38,-78,83,41,50,5,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 64, 98, 3, 6, 41, 10, 74, 76, 44, 45, 14, 47, -50, -83, 18, 90, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,98,14,-83,-50,47,64,10,18,90,6,76,61,74,3,47,44,45,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 0, 98, 18, -58, -75, 60, 93, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,64,-58,98,60,18,-75,79,0,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 4, 69, 24, 73, 12, 76, 13, 93, -62, 14, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,4,3,76,13,24,73,14,-16,93,69,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -50, -71, 54, 41, 43, 28, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,43,-71,-1,-50,54,31,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 0, 96, 49, 50, 99, 4, -71, 56, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-17,56,31,4,46,0,-71,99,-71,50,49,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 82, -47, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,-47,82,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 26, 74, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,93,74,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -72, -10, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,60,-72,-10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 6, 73, 11, 60, 14, 30, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,14,30,32,6,62,60,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 20, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,54,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -50, 67, -24, 73, 41, 25)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,73,-50,41,25,0,-24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 98, -36, 67, 36, 37, 39, 8, 74, 76, 50, 22, 23, -58, 27, -30, -95, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,8,98,-36,23,-30,27,50,22,67,76,74,39,-58,36,37,95,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 97, 5, 37, -71, 38, -44, -18, 53, 24, -90, 26, 27, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,38,5,37,-18,33,24,95,30,53,97,26,32,-90,-44,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 17, 81, 20, -37, 86, -57, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,20,-58,-57,-37,81,64,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 66, 35, 5, 6, 40, -43, 13, 81, 82, 21, 53, -87, 23, 87, 56, 24, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,-43,23,82,6,13,81,87,5,66,90,21,56,24,53,40,35,-87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-36, 83, 35, -55, -9, 89, 59, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[61,-36,-9,59,83,89,-55,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -99, 37, 39, 8, 57, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,8,1,39,37,29,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, -69, 20, 41, 42, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,20,42,-82,-61,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4, 68, 6, 38, 10, -45, 13, 16, 85, 88, 25, 58, 27, 61, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,25,10,13,88,6,61,6,27,38,4,85,-45,-30,68,16]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 2, 98, 68, 6, 7, -42, 10, 11, 79, 81, 17, 19, -86, 87, 92, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,-42,92,2,10,81,17,6,98,87,68,31,7,79,65,63,-86,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 3, 99, 4, 41, 76, 13, 49, 50, 21, 54, 87, 55, 24, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,4,41,3,49,54,2,99,24,4,87,13,21,90,55,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 10, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 66, 5, 10, 76, -80, 47, 80, 50, -87, 24, 27, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,76,-80,5,66,10,27,-87,66,47,80,24,96,-60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 98, 70, 39, 72, 8, -74, -15, 15, 53, 22, -56, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-15,65,39,15,-64,-56,53,98,70,72,-74,8,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 34, 35, 36, 4, 37, -73, 75, -48, 81, 19, 22, 88, 26, 27, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,22,27,35,88,-48,37,-73,36,37,34,-33,4,75,26,93,36,19,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 4, 68, -6, 9, 74, 43, 44, 76, 79, 50, -20, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,-33,4,74,79,44,86,68,43,-6,50,76,-20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -68, -54, 23, 24, -28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,24,-28,82,-54,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 86, 70, 76, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76,86,62,49,70,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(5, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -67, 35, 3, 38, -8, 74, 11, -81, 81, 19, 27, 93, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,81,35,-8,38,34,11,-67,61,27,74,19,-81,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 3, 71, -41, 10, 76, 50, 82, 20, 89, 26, 58, -60, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,-41,93,89,58,65,62,20,50,-60,71,10,3,82,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 48, 50, 84, 87, 23, 25, 89, 61, 13, 30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,-49,25,23,61,48,79,89,50,30,13,84,48]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 34, 3, 84, 20, -53, 21, 7, 90, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,34,7,84,16,90,21,-53,3,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -34, 34, 2, 70, 72, 74, -43, 46, 78, 80, 49, 20, 88, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,34,80,1,-61,72,74,46,34,-34,20,49,-43,78,88,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -4, -5, -37, -40, 46, 78, 79, 17, 50, 21, 57, -27, 28, 93, 62, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,-27,78,-5,57,1,79,28,62,21,17,50,94,-40,93,-4,62,-37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 33, 35, 37, 7, 42, 46, 80, 18, 19, 23, -56, 25, 58, 60, 29, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,23,1,60,60,33,37,42,25,35,18,35,46,-96,7,19,29,80,-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-37, -21, 52, 88, 90, 92, 94, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,90,92,52,-21,78,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 99, 4, 7, 41, -13, -45, 79, 17, 82, -19, 56, 89, 90, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,-62,-45,82,79,34,99,7,89,4,41,17,-19,56,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 64, 1, 19, 52, 69, -71, 12, -46, 93, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,31,52,-46,-71,46,80,64,12,1,69,46,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 34, 82, 6, 89, 25, 41, 44, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,82,30,44,89,6,25,81,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -2, -34, 36, 8, -9, -11, 47, -82, 81, 86, -55, 25, 58, -92, 28, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,-34,32,8,-11,58,28,86,-32,47,-55,25,-82,36,58,-92,-82,81,-9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 99, 51, 4, -38, -55, -8, -14, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,-14,-8,99,81,4,-55,51,-38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 66, -84, -11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-11,66,-84,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 35, 99, 40, -75, 75, -46, 79, 47, 82, 84, 85, -88, -89, 58, 92, 30, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,75,82,-46,-75,-89,92,58,79,47,85,84,66,82,95,40,30,-88,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 66, 37, 12, 76, 15, -48, 83, -22, 24, -91, 91, -31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,83,-22,12,91,24,-31,63,37,76,66,15,-48,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 98, -68, 67, 52, -70, 6, 71, 87, 72, -12, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,-68,67,6,72,52,-12,48,-70,87,94,98,-68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 21, 54, 74, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,74,54,21,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 17, 49, 83, 36, -39, 23, 87, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,45,83,36,23,49,32,-39,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 34, 98, 76, 13, -47, 82, 22, 25, 26, 28, 92, 62, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,28,13,-97,-97,34,25,-47,82,92,76,22,-96,98,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 35, 20, 38, 54, 57, 91, 44, 28, 60, 13, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91,44,35,57,48,38,13,57,28,45,54,20,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 20, -70, 56, 88, 89, 10, 91, -28, 78, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,56,91,78,20,89,10,62,-35,-28,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 81, 18, 2, 82, 51, -62, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,18,51,-62,2,82,81,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 69, -38, 74, -13, 48, 50, -85, 53, 86, 88, 57, 58, -27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,58,-13,-27,48,88,69,-38,50,74,-85,58,32,53,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -3, 57, 90, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,57,64,-3,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7, 88, -91, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,-91,91,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, 98, 41, -43, 12, 17, 18, 51, -21, 53, 86, 89, -59, -62, 30, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[89,17,53,-43,51,32,-62,30,18,98,1,12,-59,1,62,-21,86,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 53, -70, 71, 9, 25, 45, 93, 78, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,-2,53,9,93,71,-70,71,78,25,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 25, 90, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,25,99,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 4, 74, 43, 76, 45, 14, 80, 81, -56, 90, 61, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,76,14,74,90,45,81,1,-56,-64,61,80,43,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 34, 82, -20, 37, -75, 92, 61, 62, 78, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,47,-75,37,92,62,61,-99,34,82,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 64, 17, 18, 50, -73, 91, 11, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,96,-73,91,60,64,18,50,11,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 99, 36, 52, 40, -58, -90, 58, 74, 44, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,58,40,44,74,-58,29,99,-99,52,-90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 36, 68, 71, 44, -82, 87, 88, 28, 29, 94, 31, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,44,-82,29,94,64,31,87,88,28,36,95,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(71, 39, 72, 41, 42, 43, 45, 13, 80, 22, -56, 25, 90, -59, 92, 61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,63,43,42,90,-56,92,71,22,-59,41,61,39,72,13,25,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 42, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,-62,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 57, 9, 26, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,57,26,28,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 35, 70, -40, 8, 41, 9, 42, 75, 43, -44, 46, -18, 50, 56, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,-40,75,41,70,8,26,43,70,46,9,50,26,56,-44,-18,66,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 96, 98, 66, -72, 43, 17, -83, 51, 21, 22, 24, -90, -27, 28, 60, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-65,-95,-27,21,43,96,28,98,51,24,60,66,-83,-72,17,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, -39, 74, 10, 42, -12, 78, 16, 51, 84, 21, 56, 30, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,74,30,99,-63,-12,21,84,78,16,10,51,42,78,-39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 68, 54, -24, 55, 58, 75, 14, 46, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,31,-24,75,55,54,58,46,68,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(20, 53, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 68, 85, 53, 39, 72, 11, 60, 61, -94, 13, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,85,61,68,-94,39,13,19,60,72,11,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 17, 82, -67, 6, -43, 11, 43, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,-65,93,6,95,-43,82,-67,43,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 6, -7, 90, 59, 14, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,90,33,14,-47,59,-7,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 67, 36, -38, 70, 8, 80, -83, 83, 25, 27, 92, 61, -31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,63,80,83,27,83,70,83,-83,2,25,61,36,67,-38,92,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 1, 66, 3, 99, 9, 11, 45, 52, 84, 58, 26, -60, 92, 31, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,66,11,1,92,-60,96,31,58,45,3,52,-64,84,26,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -2, 98, 35, -69, 6, 8, 9, 11, 13, 77, 48, 16, -50, 50, 21, -56, 57, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,6,96,48,98,-2,35,16,13,-69,77,9,11,50,21,57,-56,8,-50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, -52, -86, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,-86,-52,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 68, 36, -8, 72, 10, 43, -12, 77, 81, 17, 83, -20, 54, 22, 23, -29, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,77,43,-12,54,30,22,23,10,81,-8,72,77,-20,96,68,17,36,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-87, 90, 14, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,14,90,-87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 66, 51, 67, 3, 84, 7, -62, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,-62,66,84,97,51,67,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 98, -83, 82, -56, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,76,-83,-2,82,-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 34, 37, 38, 7, 9, 78, 15, -82, 23, -24, 24, 57, 25, 59, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,23,15,9,59,38,96,57,24,7,-24,34,37,78,24,-82,25,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,-67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 1, 66, 36, -69, 5, 70, 8, 9, -11, 13, 18, 82, -87, 90, -60, -64, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,-87,-64,13,5,66,-60,36,-11,-65,1,70,-69,9,31,82,18,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, -84, 53, 70, 39, -74, -27, 74, 15, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-27,39,15,70,74,-74,74,53,-84,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 65, 36, 91, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,17,65,91,91,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -50, -84, -52, -54, 37, -72, 56, 58, 60, -79, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-72,-84,-54,56,-52,37,96,-79,60,37,30,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, -5, 40, 90, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,98,40,92,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 32, 5, 40, 73, 9, -77, 44, 46, 14, 79, 17, 81, 51, -20, 84, 87, -90, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,84,87,73,-77,79,40,-90,17,91,64,9,5,46,-20,44,81,14,32]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 42, 12, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,12,31,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34, 68, 37, 38, 87, 40, 26, 43, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,38,68,37,43,11,34,87,40,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 97, 50, 84, 4, 39, 23, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,84,4,50,23,46,97,46,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 98, 23, 24, 60, -14, -78, 45, -48, 47, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,60,23,98,47,-14,64,24,-78,63,45,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 3, -5, 38, 6, -39, -72, 71, -42, 42, 13, 50, 82, 51, 30, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,-42,-5,30,-72,71,50,38,82,51,6,3,13,33,-39,-96,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 50, 2, 34, -4, 87, 8, 57, 11, 92, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,49,92,11,50,-4,2,57,87,8,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 38, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,38,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 0, 34, 3, 4, 89, 76, 28, 61, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,4,61,89,76,32,0,34,28,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 38, -55, 8, 57, 11, 61, -31, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,8,11,31,17,38,61,-55,-31,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99, 4, 7, 46, 18, -84, -86, 22, 87, 25, 89, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,-84,87,-86,4,-99,18,7,31,89,46,63,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 35, 69, -87, 87, 88, 90, -91, 43, 27, 30, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,30,43,-87,27,88,-33,27,-91,35,46,69,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 81, 82, 38, 23, -8, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,23,38,-8,82,48,82,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 8, 40, 76, 13, 79, 48, -18, 82, 84, 85, -23, 25, 92, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,-18,85,-23,79,76,48,84,92,8,13,82,35,40,31,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 18, 35, 19, 53, 86, 24, 57, 9, -92, 44, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,35,18,64,86,9,53,-92,30,19,44,24,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 99, 4, 69, 6, -72, -77, -46, 16, 82, 56, 61, 93, 95, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,-72,69,61,82,95,16,-77,-46,56,99,93,-32,4,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 19, -57, -94, -78, 78, 62, -15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,49,-94,78,-78,62,49,19,-15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 0, 97, -37, 37, -8, 73, 43, 77, 46, 18, 87, -88, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,18,87,-88,77,-8,23,0,46,97,43,37,-37,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 48, 33, -24, 88, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,48,88,30,-24,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 49, 99, 26, -92, 44, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,44,99,16,-92,62,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 2, 99, 83, 86, -27, -47, -96, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,2,-96,1,86,-47,-27,83,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 9, 44, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79,44,9,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 32, 33, 34, 2, -35, 67, 36, 70, -78, 79, -54, 23, 27, -30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-30,-97,79,2,-78,-35,33,67,32,36,23,63,-54,70,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-54, 21, 10, 28, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,-54,21,10,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(90, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,-64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 18, 35, -52, 84, 68, 6, 15, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,35,15,84,18,63,-52,68,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 69, -93, -61, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,-93,69,-61,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,11,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 19, 20, 53, 54, 38, 23, -89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,20,54,38,-89,53,19,54,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 97, 83, 52, 87, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,87,60,52,97,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 35, 52, 4, 21, -22, 23, 74, -91, 12, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,21,51,52,-22,23,12,-91,23,-46,35,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 2, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,-33,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -99, 83, 67, 4, 38, 23, 89, -42, 58, 28, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,30,38,83,89,28,0,4,58,83,-99,-42,67,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 66, 51, 21, -70, -9, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,21,-70,51,-9,80,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 35, 4, 70, 40, -74, 73, 75, 11, -12, 44, 85, 86, -58, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,75,44,11,35,70,-74,-12,85,4,73,40,-58,64,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 65, 37, -70, -10, -81, 80, 54, 22, 87, -29, 61, 93, 94, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,37,-10,-32,54,94,80,-29,22,0,61,-70,87,93,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 65, 2, 9, 43, 44, 77, 46, 47, 49, 82, 19, 83, 20, 26, 27, 93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,19,93,83,49,47,77,82,0,46,2,9,20,65,27,26,44,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, -3, 3, -43, 10, 44, -13, 47, 18, 19, -22, 86, 90, 27, -61, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,-61,29,19,-98,90,47,44,27,-3,86,-43,-13,10,-22,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 81, 49, -86, 8, 72, 9, 58, 59, -13, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,81,-13,59,8,-80,-86,80,72,9,49,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(7, 58, 45, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,45,-31,45,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 21, 86, 9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,50,21,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 98, 2, 69, 39, 73, 74, 11, 82, -87, 88, 57, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,88,98,69,-87,73,29,74,82,57,2,39,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 97, -34, 65, 2, 71, 75, 45, 13, 80, 23, -31, 30, 63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,97,-34,71,80,23,2,45,13,30,0,75,31,63,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 1, 8, 41, -44, 11, 75, 13, 14, 81, 50, 18, 20, 86, 27, 60, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,81,41,-31,60,13,-44,1,14,8,11,0,75,50,27,20,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, 6, -58, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,-58,82,82,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 4, 53, 88, 24, 10, 74, 27, 61, 45, 78, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,61,4,67,53,78,88,10,24,62,45,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 6, 7, 27, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,27,50,7,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-4, 35, 67, 5, 75, 80, 81, 82, 51, 87, 25, 89, 27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,25,-4,82,82,80,35,51,81,27,75,87,67,5,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 3, 36, 37, 5, 71, 11, -51, 51, -85, 20, -21, 86, 25, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,71,11,51,37,25,60,-85,5,36,20,64,-51,3,-21,37,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -36, 35, 67, 36, 37, 38, -71, 40, 73, -19, -88, 23, 88, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,-36,-88,73,61,31,35,0,-19,88,67,37,-71,40,23,36]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 80, 85, 7, 8, 90, 43, 12, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,12,43,96,80,8,93,7,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-40, 39, -10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,39,-10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 36, -87, -73, 26, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-73,26,36,78,1,-87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 20, 70, 72, 58, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,16,72,20,70,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 97, -70, -23, 40, -90, 59, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,97,-90,64,40,59,-23,97,-76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-83, 34, 19, -41, 73, 28, 45, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,28,30,28,19,-41,28,-83,34,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[50,-35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 18, 68, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,68,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 1, 17, 20, 23, 71, 8, -73, 89, 9, 26, 43)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,89,26,43,8,20,-73,48,1,9,71,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, -67, 6, 71, -41, 73, -43, 11, 46, 79, 18, 85, 54, 56, -25, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,98,6,-43,85,46,56,18,31,73,79,71,54,-25,-67,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 37, 39, 14, 15, 79, 18, 50, -84, 51, 52, 84, 20, 22, -55, 54, 57, 59, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,52,14,-84,51,57,18,50,84,69,15,-55,54,20,59,95,39,37,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 84, 88, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,78,84,0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 68, 12, 45, 79, 82, 51, 21, 25, 26, 28, 60, 95, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,25,12,28,95,63,21,45,68,79,0,26,60,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 66, 69, 7, 39, 73, 44, -78, 14, -80, 18, 51, 22, 23, 55, 87, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-78,-80,18,44,23,69,1,51,22,55,7,29,14,39,87,73,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 34, 51, 84, -5, 68, 6, 55, -58, 59, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,84,-5,6,55,34,-48,17,68,51,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -97, 66, 69, -9, 72, 46, 15, 16, 52, -23, 55, 92, 28, -94, 93, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,46,-23,16,92,52,-94,-9,66,69,72,30,32,15,55,-97,93,28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 96, 51, 19, 54, 86, -24, 39, 41, 73, 59, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[54,-24,51,59,48,86,19,39,41,48,96,29,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, -35, 19, 51, 53, -6, 73, -10, -74, 77, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,73,-35,-98,51,77,-10,53,-74,61,-6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 32, 34, 19, 56, 89, 74, 13, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,56,19,89,13,32,62,74,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 81, -99, -84, 51, 25, 93, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-99,93,25,81,31,-84,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-6, 5, -40, 40, 72, -10, -42, 46, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[40,-40,46,-10,-42,79,72,72,-6,79,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(83, 3, -37, 87, 24, 9, 94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,9,83,94,62,3,24,-37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 98, 34, 3, 37, -71, 73, 10, -13, 15, 80, 48, 21, 57, 59, 28, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[57,37,73,80,48,15,97,21,10,98,48,93,28,3,-71,34,59,-13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 85, 11, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,11,85,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 19, -68, 67, -22, 5, 38, 61, 93, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,38,19,-68,14,-22,61,93,67,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -51, 3, -37, 57, 75, -13, -62, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[75,-13,-37,-62,57,32,3,-51,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 2, 54, 89, -10, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,54,89,61,-10,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 69, 40, 10, 43, -78, 79, 86, -56, 55, 24, 58, 92, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,29,10,-56,92,-78,58,43,24,69,40,86,79,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 18, 50, 56, -9, 44, 92, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[63,56,44,44,18,65,50,-9,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -2, 3, 68, 37, 38, 9, 42, -13, -79, 15, 17, 22, -58, 27, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,-62,37,17,3,-58,15,68,22,9,-79,38,42,1,27,-2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 17, 82, 23, -10, 57, 13, 62, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,23,-10,57,82,64,57,17,30,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 68, 11, -12, 45, 48, -18, 49, 51, 53, -22, 24, 89, 27, -94, 61, -63, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,53,24,-18,53,27,68,48,89,45,-63,-22,30,-94,-12,32,61,49,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(22, 54, -72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,54,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 3, -5, 24, -57, 9, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,-5,3,64,63,-57,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 53, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,65,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 35, 68, -44, 11, -77, 45, 48, -83, 18, 56, 57, 60, 93, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,60,-44,11,-44,45,56,18,57,35,93,68,93,45,-98,-95,48,-77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 38, 71, 73, -13, 76, -49, 83, -86, 53, 24, 90, 60, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,83,-86,38,69,71,24,-13,62,76,73,90,53,-49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -66, -71, 39, 76, -48, 82, 51, 88, 57, -93, 92, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-48,88,82,31,0,61,51,76,39,-66,-93,57,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 32, -33, 99, 51, 21, 38, 40, 73, 9, 42, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,40,73,42,38,32,99,-33,21,-59,51,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -98, 65, -69, -86, 69, 39, 8, -46, 46, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,-46,63,46,-69,-69,-98,-1,65,39,-86,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 82, 3, 20, -56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,82,16,20,-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, 19, 35, 37, -71, 23, 87, -25, 9, 90, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,-2,19,94,35,37,-71,23,87,87,9,-25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 64, 2, 34, 69, -40, -41, 75, -51, -23, 55, -88, 27, -95, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,2,69,-23,96,64,-41,-88,27,-40,-51,95,64,34,75,-95]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 38, -12, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,38,99,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, 82, 4, 41, 58, -28, 61, 62, 47, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,58,47,62,-28,61,-80,-34,41,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 50, 83, 21, 8, 25, 10, 75, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,80,50,75,10,83,27,25,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, -18, 6, 25, 57, 12, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,25,57,15,12,-18,-82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 7, -42, 74, 15, -16, -49, -21, 90, 58, 60, 94, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[90,2,60,2,7,94,15,-16,74,-31,-49,-42,-21,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 4, -72, 72, 41, 12, 44, -77, 85, 55, 59, -96, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,4,44,85,72,12,-72,41,-77,-96,59,55,63,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(81, 98, 50, 83, 7, 8, 89, -77, 44, -14, 46, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,8,81,98,-14,83,95,-77,44,50,7,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 3, 56, 14, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,14,1,95,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -33, 68, -53, 38, 88, -75, -14, 14, 31, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,14,-14,31,68,32,-33,88,-53,38,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 21, 54, 38, 57, 26, 59, 27, 76, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[76,26,54,59,38,15,27,57,21,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -36, 99, 4, 70, 38, 8, 40, 11, 82, 19, 54, 55, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,54,24,4,55,70,32,-36,8,40,99,82,19,38,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 82, 53, -6, 9, 26, 91, 61, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,-6,26,91,82,-50,15,61,-50,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -20, 51, 40, 25, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[25,32,40,47,-20,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55, 24)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 26, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,62,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -8, 71, 23, -25, 89, 26, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-8,-25,89,26,23,0,30,71,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 67, 52, 8, -42, -43, 90, 58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,67,-43,2,52,90,58,-42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 35, 42, 75, 45, 78, 50, -19, 18, 83, 21, 85, 56, -91, 29, 94, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,94,42,35,78,50,62,75,21,-19,-91,29,85,83,18,45,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, -67, 82, -86, 38, -56, 7, 26, 76, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-56,76,30,26,82,-86,17,7,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 85, 77, 63, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,77,-80,63,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 33, 37, -38, 70, 74, 43, 12, 80, 53, -86, -28, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[70,37,62,43,0,12,53,0,80,-86,74,70,33,-28,-38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 99, 67, -69, 36, 76, 13, 16, 49, 81, -83, 50, 89, 91, 61, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,91,99,16,67,91,76,89,-69,98,13,50,67,61,29,36,49,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 81, 2, -38, 70, 25, 41, 14, -79, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,-79,81,-38,25,70,-81,14,41,2,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, -66, 66, 37, 70, 56, 90, 60, 76, -78, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,-16,60,70,-66,37,56,-78,90,76,-49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -85, 54, 70, 72, 75, -28, 13, -48, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,1,54,72,70,13,13,75,-28,-80,-85]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 88, 56, -46, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-46,46,88,68,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(97, 35, 68, 12, 78, 46, 47, 49, 82, 51, 85, -22, -23, 86, 25, 28, 30, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,78,68,82,49,12,47,30,30,51,25,35,85,-22,97,28,-23,86,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52, 24, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,61,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(84, 85, 87, 23, 28, -95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,-95,23,28,85,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 97, 19, 68, -38, 54, 71, 58, -92, 28, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,28,-38,19,77,58,-92,71,97,54,68]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 96, -4, -8, -11, 11, 75, 16, 82, -23, 86, 89, 25, -91, 91, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,11,91,89,-4,75,-91,-23,82,-11,86,25,27,-8,-65,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, -18, 35, -84, 39, 58, 60, 28, 92, -30, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,35,60,28,79,-30,92,58,1,-18,-84]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -87, 8, 41, -45, 12, 93, 78, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,34,41,8,78,-87,31,12,-45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -33, 2, 7, 72, 73, -42, 10, -80, 16, 81, 17, 50, 59, -29, 60, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,0,81,10,2,17,50,73,72,59,-42,7,29,-29,60,-80,73,-33]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 67, 37, 70, 9, 10, 13, 14, 47, 16, 83, 90, 59, -28, 91, 28, 60, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,59,-28,16,9,83,90,67,-67,10,28,47,14,14,70,13,60,91,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, -6, 54, -40, 73, -74, 10, 94, 62, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[94,10,73,-40,63,94,-50,-6,62,54,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 4, -22, -24, 7, 8, -73, -91, 11, 12, -78, -30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,-91,-35,-78,-22,4,-24,-73,7,-30,11,12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 65, 99, -5, 71, 39, 43, 15, -82, 19, 22, 86, 26, 58, -93, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,39,22,26,86,-93,43,-5,-82,33,65,33,19,99,58,65,15,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, 67, 20, 84, 85, 6, -91, 11, 28, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,11,20,11,84,6,60,99,67,85,-91]", resultFormatted);
    }
}

