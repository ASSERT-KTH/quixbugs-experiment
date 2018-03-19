package java_programs;


public class NEXT_PERMUTATION_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, 10, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,27,10]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 66, -5, -9, 72, 41, -43, -47, -81, 84, 85, 22, 55, -89, 57, 58, 91, 92, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,92,-5,-31,66,-89,91,55,-9,-47,32,58,85,22,57,41,-81,72,-43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(49, 99, 25, 10, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,99,10,25,49]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 81, 82, 21, 40, 88, 56, 42, -60, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[95,21,42,82,96,40,96,42,56,-60,81,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, 64, 20, -86, 6, 24, 74, 58, 27, 45, 61, -78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[45,61,-78,-1,64,74,6,20,58,24,-86,27,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 65, -5, 53, 87, 39, 75, 59, 43, 29, 47, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,47,75,53,-5,31,16,59,87,43,29,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 98, 35, 68, 38, 6, 7, 72, 76, 16, 51, 58, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[38,76,72,95,16,98,64,68,35,58,7,51,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(85, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[85,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 48, -34, 17, 67, -21, 86, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,16,-21,86,67,48,17,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 82, 88, 75, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[64,82,63,88,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 65, 68, -38, 5, 73, 13, 51, 19, -26, -59, 58, 91, 27, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,51,58,73,13,65,-26,91,-59,19,-38,5,32,27,68,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 35, 99, 67, 73, 42, 75, 15, 79, -51, 51, 20, 90, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[35,-51,20,15,99,75,62,42,67,79,90,98,51,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 65, 81, 19, 3, 55, 72, -26, 93, 46, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,55,93,72,81,80,-26,19,79,3,46]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(36, 4, 38, 39, 71, 72, -74, 15, 80, 54, 23, -25, 59, 27, -93, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[15,59,-93,-74,38,72,-64,23,36,39,80,71,54,27,4,-25]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 34, 82, 70, 7, -24, 90, 43, 12, 60, -48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,43,34,-24,12,90,82,-48,60,70,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 80, 21, 53, 23, 8, 90, 42, 59, -93, 62, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,21,53,15,48,59,90,90,80,62,42,23,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 98, 20, 21, 69, 6, 70, -43, 43, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,21,43,18,6,69,98,-43,-96,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(17, 34, 51, 55, 58, 42, 46, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46,51,63,58,42,55,34,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,1]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(6, 71, -57, 56, 24, 42, 91, 60, 13, 14, 63, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,71,14,-57,63,13,91,6,24,15,56,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-2, -83, 50, 8, 40, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,-83,50,-58,40,8]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, 33, 82, 20, 55, 39, -40, 58, 29, 45, 30, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,45,55,30,20,82,58,-40,-49,33,39,62]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-49, -5, 6, 38, 23, -25, 72, 27, -30, -63, 46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,-49,-25,-30,23,-63,46,27,6,72,38]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 38, 87, -44, 43, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-44,38,87,-79,43,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 5, 7, 75, -78, 77, 47, 18, -21, 23, 59, 60, 30, 31, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,66,5,18,-78,-21,23,47,59,30,77,31,7,75,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(99, -37, 8, 9, -42, 76, -45, -15, 47, -20, 53, 22, 87, 58, 90, -31, 63, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[99,63,9,-37,76,47,31,-45,58,-31,-20,53,87,-15,8,-42,22,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 4, 41, 9, 12, 18, 83, 86, -56, 55, 25, 60, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[60,-56,55,41,61,12,83,55,9,18,25,4,86,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(19, -85, 38, 56, -12, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[78,-85,56,19,38,-12]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 0, 99, 36, 37, 12, 46, 79, 51, 20, 87, 23, 25, 60, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,32,25,29,60,36,23,20,46,0,51,79,99,12,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, -36, 61, 62, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[34,-36,62,61,14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 34, 52, 36, 57, 58, 43, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,43,78,57,52,36,34,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, 67, -68, 68, -37, 7, -41, -9, 14, 48, 50, 19, 25, 26, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,50,48,68,67,14,-41,93,25,7,26,19,-37,32,-68,-9]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 96, -35, 70, 39, 71, 9, 44, 48, 16, 19, -53, -57, 60, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,-53,9,70,60,48,-35,39,63,-57,44,0,71,16,19,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, -99, 37, 9, -44, 18, 82, 19, 52, -86, -56, -26, 27, 61, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,-56,37,-86,-44,9,27,-26,18,66,82,52,61,30,-99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 65, 4, 69, 5, 72, 9, -11, 17, -52, 19, 85, 25, -59, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-11,9,4,-52,69,93,-59,85,5,65,72,96,25,19,-52,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 1, 70, 7, 74, -79, 49, 17, 19, -84, -22, 23, -56, 88, -91, -60, 59, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-91,49,70,65,19,-79,59,23,1,-84,17,29,7,88,-22,74,-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 81, 2, 83, 20, 6, 73, -43, -29, -15, 30, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,-15,96,83,73,6,30,81,47,-43,20,-29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 82, 67, -13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[82,67,-13,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 53, 37, 54, 71, 24, 76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[24,76,16,54,71,37,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 82, 4, 86, -72, 90, 75, 60, 45, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,4,-96,90,32,86,75,60,45,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-19, 7, 39, 56, 24, 13)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,7,13,56,39,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(98, 67, 84, 4, 72, 40, -25, 25, 11, 44, 76, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[93,84,98,44,4,67,72,40,11,25,-25,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 67, 36, -6, 70, 6, 43, 78, 20, 53, 87, -56, 29, 93, 95, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,95,67,53,0,36,-6,20,31,70,87,0,93,6,78,43,-56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-65, 48, 49, -19, 98, 35, -85, 88, 60, 12, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,60,-85,48,35,12,93,48,49,-19,98,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 97, -34, 8, -75, 11, 78, 49, 20, 53, -22, -59, 59, 27, -93, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97,20,11,-34,-59,78,-75,49,59,27,61,53,-22,8,32,53,-93]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 34, 25, 12, -46, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,25,12,25,34,-46,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 35, 12, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,12,-97,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-17, 51, -68, 4, -70, 22, 71, 56, 58, 42, 30, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,51,30,4,58,42,-17,71,-70,-68,22,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, -68, 70, 76, -48, -83, 51, 52, 53, 86, -87, 24, 28, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,86,76,52,28,-48,65,70,51,-68,61,-87,53,24]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(3, 68, -39, 41, 42, -43, -14, 47, 17, 84, 21, 56, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,28,68,17,-14,84,41,56,42,3,-43,47,17,-39,21]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -19, -41, 40, 88, 57, 27, 91, 60, -61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,40,88,-19,60,0,27,-61,91,57]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, 52, 21, 22, -39, 88, 42, 11, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[42,-5,88,52,21,22,-39,11,27]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-33, -54, 21, 6, 56, -90, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-54,-33,56,21,75,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 32, 2, -35, 99, 7, 11, 12, 79, 48, 16, -21, 21, 90, 91, 92, -30, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,48,21,7,11,-97,32,-21,63,92,79,91,90,16,99,91,2,-30,-35]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(69, 7, 40, -73, -9, -44, -21, 52, 86, 55, 23, 57, 60, 93, -64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,69,-44,93,60,7,-21,57,86,55,40,23,-73,-9,52,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(80, 33, 83, 19, 5, -86, -91, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,83,80,33,-86,19,15,-91]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 98, 35, 67, 37, 9, 12, -48, -17, 19, 56, 60, 93, -94, -32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[56,35,60,-48,34,-17,12,67,37,93,9,60,98,-32,-94,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-35, 66, 38, 39, 71, 8, 45, 16, 83, 54, 55, 56, 88, 57, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,57,45,56,88,54,92,16,8,-35,66,55,71,38,39]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(24, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, -98, -35, 3, 5, 8, 42, 43, 76, 16, 17, 50, 84, 24, 25, 27, 28, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27,8,93,76,42,8,5,-98,17,3,25,16,-35,96,24,43,28,84,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -97, -65, 32, 97, -9, 73, 42, 44, 15, 81, 49, 18, 54, 22, 23, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,42,-97,81,44,97,49,54,95,18,23,22,15,-65,73,32,44,-9,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, -70, 6, 40, 73, 12, 45, 14, 47, 81, 82, -20, 19, -85, 90, -62, 93, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,12,-62,14,81,93,94,64,82,-20,19,73,40,-70,45,90,47,-85,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(48, 65, -55, 6, 7, 40, 12, 29, -14, 94, -63, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[65,-55,48,-80,6,94,29,7,-63,12,40,-14]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, 68, 6, -9, -11, -44, 75, -77, 47, 48, 54, -88, 61, 30, 94, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,54,-9,-88,0,6,-11,68,47,-77,30,-96,-44,0,75,94,61,48,6]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(76, -16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(52, 87, 88, 13, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47,13,52,87,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 52, 9, 15, 95)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9,52,64,95,15]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 65, 34, 35, 99, 67, -40, 73, 43, 17, -83, 52, 21, -57, 88, -28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[52,35,43,-57,88,99,-40,34,-28,1,17,73,-83,67,21,65]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 98, 86, 89, 75, 93, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,98,89,93,63,75,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(58, 12, 76, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[58,14,12,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(32, 1, 2, 99, -69, 41, -76, 16, 50, 52, 84, 23, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,2,41,-69,52,1,84,-76,31,50,23,32,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(5, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(66, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66,4]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(34, 82, 87, -88, 88, -26, 77, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88,34,-26,77,87,31,82,-88]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-97, 97, 1, 8, 9, 74, 77, 78, 80, 18, -52, 53, 55, 24, 56, 58, 59, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59,74,-52,53,77,78,24,8,9,-94,18,55,-97,58,97,56,1,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(33, 34, 36, 75, -78, -47, 80, 18, 51, -52, 84, 25, 58, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[84,18,25,58,51,36,-52,34,75,30,-78,33,80,-47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(68, 4, 37, 70, -41, 40, 9, 11, 14, 17, 50, 83, -52, 51, 52, 86, 28, -62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83,50,9,86,28,-62,17,11,-52,70,-41,51,52,14,68,4,37,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -51, 21, 38, 22, 28, -61, 14, 62, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,14,79,38,62,22,21,-51,0,-61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(64, 67, 68, 5, 41, -10, 90, 44, 13, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[62,41,68,13,5,64,-10,67,90,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(65, 35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(51, 7, 24, 11, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,24,51,15,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(18, 34, 86, 71, 56, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[86,71,56,34,12,18]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(1, 72, 75, 76, 12, 79, 15, 83, 20, 85, 54, 87, 24, 94, 63, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[87,85,76,72,63,79,83,1,12,54,-96,76,20,24,15,94,75,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(16, 65, 8, 9, 43, 44, 76, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43,9,8,65,16,93,76,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(96, 66, 41, 74, 42, -47, 78, 17, 52, 20, 53, -24, 23, 87, 24, 57, 58, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[74,24,57,-24,96,-47,17,53,53,23,87,27,52,78,66,20,41,58,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(50, 68, -10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[68,-10,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(0, -50, 2, 18, 3, 20, 54, -23, 88, 90, 62, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,0,54,62,20,-50,88,18,3,54,90,78,18,78,-23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-1, -66, 4, -10, 45, 14, 46, 47, 48, 81, 49, 18, 53, 89, 26, 59, -94, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[48,45,59,-94,81,-10,14,18,46,26,47,4,31,53,49,89,-1,-66]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-5, -40, 40, -44, 44, 45, 77, -48, 48, 18, 55, 25, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,25,-48,93,18,-5,45,25,44,40,-44,77,48,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.NEXT_PERMUTATION.next_permutation(new java.util.ArrayList(java.util.Arrays.asList(-4, -41, 90, -11, 59, 12, 94, 14, -80)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-4,94,12,90,59,90,-11,14,-80]", resultFormatted);
    }
}

