package java_programs;


public class NEXT_PERMUTATION_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-34, -67, 34, 52, 73, 9, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-67,34,52,73,44,9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, -71, 24, 11, 44, 77, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,-71,24,11,44,95,77]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 49, 67, 3, -85, 6, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,49,67,3,-85,89,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 99, 52, -90, 57, 44, 79, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,99,52,-90,57,79,15,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 3, -6, 38, 23, 45, 13, 31, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,3,-6,38,23,45,31,-48,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 65, 2, 71, 42, 11, -16, 16, -85, -22, 24, 27, 91, 61, 62, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,65,2,71,42,11,-16,16,-85,-22,24,27,91,61,95,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 17, -68, 41, 60, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,17,-68,41,77,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 97, 98, -99, 4, -38, -71, 39, 72, 15, 16, 83, 87, 24, 25, -27, 60, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,97,98,-99,4,-38,-71,39,72,15,16,83,87,24,25,60,-93,-27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 6, 22, 24, 12, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,6,24,-16,12,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(67, 70, -9, -94, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67,70,-9,30,-94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-3, 67, 4, 10, 75, 18, 82, -85, 84, 85, -24, 91, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,67,4,10,75,18,82,-85,84,85,31,-24,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 85, 21, 37, 10, -91, 92, 13, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,85,21,37,10,-91,92,93,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 0, 52, -90, 11, -13, 76, 78, -79, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,0,52,-90,11,-13,76,78,62,-79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 34, 19, 7, 71, 10, -91, 26, 31, 47, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,33,34,19,7,71,10,-91,26,47,-80,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 17, 67, -9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,67,-9,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 69, 38, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[69,-78,38,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, -33, 50, 83, -56, 41, -74, 26, -44, 27, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-33,50,83,-56,41,-74,26,-44,29,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 70, -7, 72, 42, 45, 17, 81, 49, -88, 57, -27, -63, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,70,-7,72,42,45,17,81,49,-88,57,-27,63,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 36, -74, 75, 12, 79, 16, 81, 51, 22, 90, 27, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,36,-74,75,12,79,16,81,51,22,90,63,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(39, 71, 76, 14, -52, 83, 20, -54, 54, 23, 87, 88, -26, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[39,71,76,14,-52,83,20,-54,54,23,87,88,91,-26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 69, 86, 71, 43, -31, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,69,86,71,43,31,-31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -85, 5, 22, -28, 59, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,-85,5,22,14,-28,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, 87, 25, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,87,42,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 7, 39, 56, 57, 77, 45, 94, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,7,39,56,57,77,45,95,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, -99, 35, 20, -24, -42, 12, 44, -46, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-99,35,20,-24,-42,12,44,95,-46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-21, 5, -24, 58, 42, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,5,-24,58,62,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-18, -51, 19, 70, -40, 73, 11, 28, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,-51,19,70,-40,73,28,-94,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 65, 22, 6, 8, 88, 41, 10, 44, 13, 29, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,65,22,6,8,88,41,10,44,29,-78,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-50, 22, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,-50,22]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 20, 21, 38, -41, 10, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[80,20,21,38,-41,90,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 50, 3, 27, 13, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,50,3,27,95,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 82, -84, -88, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,82,-84,59,-88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 3, 85, 6, 42, -59, 75, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,3,85,6,42,-32,-59,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 65, 18, 52, 37, 54, -56, -40, 25, 9, -42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,65,18,52,37,54,-56,9,-42,-40,25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-82, 8, -9, 46, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,8,15,-9,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 85, 70, -39, -41, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,85,70,-39,91,-41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, 38, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,14,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(35, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 45, 78, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,45,95,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-20, 22, 9, 11, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,22,9,46,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 2, 37, 7, -89, 88, 10, -12, 93, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,2,37,7,-89,88,10,-12,93,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, 34, -6, 43, 83, 84, 22, 87, 25, 26, -61, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,65,34,-6,43,83,84,22,87,25,26,63,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 67, 70, -7, 40, 14, 50, 84, 53, -54, 86, -56, 55, -90, 90, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,67,70,-7,40,14,50,84,53,-54,86,-56,55,30,-90,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 82, -22, 69, 43, 13, 61, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,82,-22,69,43,13,95,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(53, 88, -44, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53,88,79,-44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-84, 19, 35, 23, 56, -60, 76, -13, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,19,35,23,56,-60,76,30,-13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 3, 70, 40, -43, -14, -15, 17, 18, 51, -23, -55, -89, 27, 92, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,70,40,-43,-14,-15,17,18,51,-23,-55,-89,62,27,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -2, 82, 7, 74, -28, 45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-2,82,7,74,45,-28]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 16, -49, 97, 66, -24, -57, 57, -91, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,16,-49,97,66,-24,-57,57,94,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 71, 88, 25, 91, 11, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,71,88,25,91,14,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 80, -51, -40, 25, 41, -62, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,80,-51,-40,25,41,46,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -68, 6, 70, 8, 16, 49, 52, 21, -24, -59, 59, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-68,6,70,8,16,49,52,21,-24,59,-64,-59]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 65, 34, 67, -39, 75, 43, 44, 14, 79, 21, -57, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[33,65,34,67,-39,75,43,44,14,79,21,-57,63,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, -67, -69, 37, 73, 11, 76, -85, -23, 88, 25, 59, 29, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,-67,-69,37,73,11,76,-85,-23,88,25,59,30,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -99, 68, 36, 69, 6, 48, 17, -20, 54, -55, -24, -57, 57, 27, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-99,68,36,69,6,48,17,-20,54,-55,-24,-57,57,61,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 3, -84, 6, -75, 14, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,3,-84,6,-16,-75,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(82, -22, -71, 70, 24, 9, 44, 76, 29, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,-22,-71,70,24,9,44,76,63,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-67, 2, -7, 7, 15, 48, 20, 85, 21, 87, 25, 58, 91, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,2,-7,7,15,48,20,85,21,87,25,91,-93,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -50, 1, 18, -54, 57, 42, 75, 29, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-50,1,18,-54,57,42,75,94,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -67, -36, 8, -11, 44, 12, 79, 16, -19, 84, -22, -88, 57, 61, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,-67,-36,8,-11,44,12,79,16,-19,84,-22,-88,57,62,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 33, -34, 2, 68, -40, -75, -47, -54, 53, 57, 93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,33,-34,2,68,-40,-75,-47,-54,53,63,57,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 34, 83, 8, 90, 12, 76, 92, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,34,83,8,90,12,78,76,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 64, -34, 1, 99, 35, 41, 43, 77, 49, 84, 53, 88, 27, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,64,-34,1,99,35,41,43,77,49,84,88,-96,27,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-81, 4, 38, 8, 57, -44, 12, 29, 61, 93, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,4,38,8,57,-44,12,29,62,61,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(22, 6, 56, 26, 11, 75, 76, 29, -62, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,6,56,26,11,75,76,29,31,-62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 34, 74, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,74,27,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-98, 67, 37, -38, 70, 8, 9, -10, 74, 45, -14, 48, 51, 86, 22, -55, -26, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,67,37,-38,70,8,9,-10,74,45,-14,48,51,86,22,-55,31,-26,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 82, -74, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,82,57,-74]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 69, 6, -11, 74, 12, 45, -79, 47, -82, 50, 82, 20, 54, 24, 89, 27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,69,6,-11,74,12,45,-79,47,-82,50,82,20,54,24,89,30,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-66, 35, -20, -9, 8, 94, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,35,-20,-9,8,95,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -98, 97, 2, 67, 35, 68, 37, -10, -11, -47, -19, 85, 54, 27, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-98,97,2,67,35,68,37,-10,-11,-47,-19,85,54,30,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, 17, 82, 19, 85, 70, 71, -29, 31, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,17,82,19,85,70,71,31,-96,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 33, 82, 87, 7, -73, 72, 24, 58, 91, 77, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,33,82,87,7,-73,72,24,77,14,58,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 35, 3, 68, -7, 6, 71, 9, -76, 12, 13, 25, -91, -94, -64, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[98,35,3,68,-7,6,71,9,-76,12,13,25,-91,-94,31,-64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 33, 34, 71, -10, -46, 78, 46, -16, 47, 48, 51, 54, 56, 57, -91, 29, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,33,34,71,-10,-46,78,46,-16,47,48,51,54,56,57,-91,31,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(2, 98, -35, -36, 36, 37, -71, 6, 38, 74, 43, -80, 15, 17, 81, 51, 84, -87, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,98,-35,-36,36,37,-71,6,38,74,43,-80,15,17,81,51,84,62,-87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(42, -93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 3, 36, 37, 10, 14, -15, 80, -81, 17, 53, 85, -23, 55, 56, 88, 57, 27, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,3,36,37,10,14,-15,80,-81,17,53,85,-23,55,56,88,57,61,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 33, 39, 76, 78, 14, 47, 48, 82, 83, 84, -23, -89, 28, 61, -63, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[96,33,39,76,78,14,47,48,82,83,84,-23,-89,28,61,95,-63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 17, 33, 50, 51, 52, 21, -55, 38, 55, 45, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[49,17,33,50,51,52,21,-55,38,55,62,45]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 80, 81, -54, 6, -74, 13, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,80,81,-54,6,-74,15,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 3, 68, 6, -12, 12, 79, 49, 17, 20, 85, 22, 58, 26, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,3,68,6,-12,12,79,49,17,20,85,22,58,62,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 23, 59, 62, 78, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[18,23,59,78,31,62]", resultFormatted);
    }
}

