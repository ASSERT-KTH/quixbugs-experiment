package java_programs;


public class QUICKSORT_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 33, -59, 7, -97, -11, -96, 23, 48, -44, 14, 16, 66, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-96,-59,-44,-11,7,8,14,15,16,23,33,48,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, 35, 21, -49, 75, 88, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,12,21,35,56,75,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(54, 73, 35, 20, 29, 11, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,20,29,35,54,68,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, 25, 39, 25, -54, 64, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,25,25,39,64,67,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-95, 37, 18, 7, 31, -98, 60, -79, -53, 43, 8, 1, 92, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-95,-79,-53,1,7,8,18,30,31,37,43,60,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 0, -89, 53, 36, 43, 95, -9, 23, -47, -40, 57, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-47,-40,-9,0,4,4,23,36,43,53,57,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-97, 0, 78, 55, 93, 65, 48, 89, 84, -35)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,-35,0,48,55,65,78,84,89,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(44, 88, 1, 20, -29, -56, 52, 32, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-29,1,5,20,32,44,52,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41, 62, 85, -74, 36, -92, -41, 74, 72, -95, 5, 22, 70, 30, 84, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-92,-74,-41,5,17,22,30,36,41,62,70,72,74,84,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 64, -1, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-1,17,64,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(96, 92, 0, -59, 26, 20, 82, 33, 99, -4, 19, 56, 57, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,-4,0,19,20,26,33,48,56,57,82,92,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 71, -50, 13, 74, -32, 35, -20, -11, 98, 69, 98, 3, 62, 4, 76, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-32,-20,-11,3,4,13,35,38,47,62,69,71,74,76,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 3, -35, 21, 15, -11, 34, 98, -75, -3, 14, 60, -41, 43, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-53,-41,-35,-11,-3,3,14,15,21,34,43,53,60,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-17, 7, -19, 42, 42, 18, 25, 5, -87, 95, 93, 23, 46, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-19,-17,5,7,18,23,25,42,42,46,86,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-57, 71, 54, 17, 72, -65, -56, 29, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-57,-56,14,17,29,54,71,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-26, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-2, 5, 53, 50, -41, 89, 10, 37, 56, 6, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-2,2,5,6,10,37,50,53,56,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-81, -57, 25, 62, 8, 26, 20, 46, -11, 12, 35, 60, 79, 37, 36, -98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-81,-57,-11,8,12,20,25,26,35,36,37,46,60,62,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 87, 95, 64, 66, 93, 39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[20,39,64,66,87,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 63, -92, 20, 24, 76, 42, 2, 28, 97, 52, 70, 77, -43, -4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-43,-4,2,20,24,28,42,52,63,70,76,77,84,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 75, 50, 70, 84, 70, -5, 83, 47, 29, 32, -63, 8, 9, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,-5,0,8,9,29,32,32,47,50,70,70,75,83,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 55, -37, 98, 50, 92)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,23,50,55,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 8, 85, -53, 87, 10, -90, 3, 83, 10, -80, 21, 41, -96, 3, 94, 76, 51, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-90,-80,-53,3,3,8,10,10,21,41,51,51,61,76,83,85,87,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, 52, -56, 81, 53, 34, 94, -56, -43, -19, 98, 84, 88, 55, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-56,-43,-19,10,34,52,53,55,58,81,84,88,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-61, 43, 68, 91, 70, 11, 27, 20, 66, 83, 32, 47, 93, 4, 23, -36, -37, -19, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-37,-36,-19,4,10,11,20,23,27,32,43,47,66,68,70,83,91,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, -54, 41, 44, 16, 77, 79, 26, -48, 91, 78, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-48,16,24,26,41,44,63,77,78,79,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 83, -20, 47, 50, 46, 8, -57, -39, 45, 68, 73, 30, 51, 82, 23, 67, 73, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-57,-39,-20,2,8,23,30,45,46,47,50,51,66,67,68,73,73,82,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(92, -46, 34, 37, -84, 55, 50, -43, 73, 34, 64, 95, 65, 6, 84, -48, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-48,-46,-43,6,34,34,37,50,55,63,64,65,73,84,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-84, 17, 6, 21, 7, 90, 54, -88, 37, 80, 73, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-84,6,7,17,21,26,37,54,73,80,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, 54, 81, 74, -85, 80, 50, 82, 48, 22, 24, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,22,24,47,48,50,54,74,80,81,82,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-85, 43, 8, 59, 20, 84, 59, 3, 88, 58, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,3,8,20,43,58,59,59,82,84,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, 29, 22, -13, 44, 69, -31, 50, 56, 30, 14, 82, -20, 82, -52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-31,-20,-13,14,22,24,29,30,44,50,56,69,82,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-20, -6, 72, 12, 88, 87, -38, -40, 0, 11, 90, 22, 36, -8, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-38,-20,-8,-6,0,11,12,22,36,59,72,87,88,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, -16, 52, 74, 60, -19, 9, 67, 75, 97, 96, 3, -32, 78, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-32,-19,-16,1,3,4,9,52,60,67,74,75,78,96,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(39, 38, -6, 70, 65, 62, 3, 2, 59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-6,2,3,38,39,59,62,65,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 7, -1, -46, 27, -66, 75, -58, 41, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-66,-58,-46,-31,-1,7,27,41,75,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,26]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-77, 23, 49, 50, 90, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,23,49,50,51,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, 89, 92, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,61,89,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 33, 29, 34, -37, 10, 39, 33, 80, 57, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-37,10,10,29,33,33,34,39,53,57,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(69, -29, 82, 40, -76, 69, -54, 11, 13, 47, -11, 27, 18, 49, 15, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-76,-54,-29,-11,11,13,15,18,27,40,47,49,65,69,69,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-53, 78, 64, 49, -18, 8, 95, -64, 92, 2, 90, -20, 60, 65, 1, 12, -38, 11, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-53,-38,-20,-18,1,2,8,11,12,49,60,64,65,78,83,90,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(87, -31, 78, 7, 6, 93, 82, -44, -88, 51, -59, -71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-71,-59,-44,-31,6,7,51,78,82,87,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 29, -92, -82, 30, -93, 73, -35, 31, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-92,-82,-35,29,29,30,31,40,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-61, 68, 70, -7, 70, 52, 92, 50, 7, 21, 0, 15, 47, -93, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-61,-7,0,7,15,21,47,50,52,64,68,70,70,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-51, 27, 71, 2, -71, 64, 92, 87, -66, 9, 96, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-66,-51,2,9,12,27,64,71,87,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, 73, 72, 4, -20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-20,4,51,72,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-95, 18, 97, -2, 28, 76, 37, 6, 34, 1, 1, 94, 65, 71, 13, 28, 64, 34, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-2,1,1,6,13,18,28,28,34,34,37,64,65,71,76,94,97,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 87, 67, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,42,67,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 98, 44, 52, -53, 34, 13, 94, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,13,34,40,44,52,77,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[66]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, 36, -15, -80, 86, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-15,31,36,47,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 99, 58, 58, 24, 7, 88, -5, 29, -3, -96, -49, 36, 38, 82, 27, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-49,-5,-3,7,24,27,29,36,38,55,58,58,82,84,88,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(70, -5, 0, 51, 29, -14, -52, 28, 79, 33, 90, -4, 18, 24, -43, -52, 71, 79, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-52,-52,-43,-14,-5,-4,0,18,24,28,29,33,51,70,71,79,79,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(26, 90, 18, -90, 56, 78, 56, 87, 12, 19, 76, 27, 56, 38, 13, -94, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-90,12,13,18,19,26,27,38,56,56,56,76,78,87,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(11, 54, 81, 39, 44, -24, 25, 1, 23, 68, 96, 56, -53, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,-24,1,11,11,23,25,39,44,54,56,68,81,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, 76, -78, 55, 88, 59, 28, 92, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,11,25,28,55,59,76,88,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(4, 8, 99, -42, 50, 16, 64, 52, -20, 26, 41, 91, 43, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-42,-20,4,8,16,26,41,43,50,51,52,64,91,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 29, 89, 99, 19, 20, 22, 66, 64, 81, 86, 5, 15, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,11,15,19,20,22,29,64,66,81,86,89,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(36, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[36,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(12, 55, 94, 11, -49, 36, 64, 95, 92, 43, 43, -43, 23, 57, 86, 56, -26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-43,-26,11,12,23,36,43,43,55,56,57,64,86,92,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 81, 90, 2, 45, 91, -5, 61, 68, -98, -73, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-73,-5,2,10,45,61,68,69,81,90,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, -38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 9, 95, 64, 72, -94, 6, 79, 67, 23, 14, 75, -15, 28, 24, -22, 29, -82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-82,-22,-15,6,9,14,23,24,28,29,62,64,67,72,75,79,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, 37, 33, 50, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,33,37,50,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, -74, -15, 63, 47, 20, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-15,20,28,47,61,63]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-87, 46, 16, 57, 85, 56, 46, 36, 35, 98, -69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-69,16,35,36,46,46,56,57,85,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-56, 77, 37, -70, 16, 51, 11, 45, 15, 4, 63, 27, -26, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-56,-26,4,11,15,16,27,37,45,51,63,77,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, 35, -56, -54, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,-54,8,15,35]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-60, 3, 60, -88, 14, -74, 28, 87, 38, -23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-74,-60,-23,3,14,28,38,60,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(33, 36, 11, 35, 39, -86, 76, 16, 83, 68, 9, 67, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,-63,9,11,16,33,35,36,39,67,68,76,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 31, -35, 57, 50, -77, 89, 4, 28, 66, 57, 76, 45, -76)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-76,-35,4,28,31,45,50,50,57,57,66,76,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(42, 68, 69, 59, 5, 45, -96, 6, 24, -7, 79, 88, 93, 11, -46, 34, -70, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-70,-46,-7,5,6,11,24,34,42,45,59,66,68,69,79,88,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-79, 41, -65, 77, 78, 82, 43, 65, 90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-65,41,43,65,77,78,82,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 16, 31, 22)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,16,22,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 71, 38, 93, 99, 43, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[22,38,43,56,71,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(32, 61, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,32,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 68, 99, 1, 28, -51, -75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-51,1,28,68,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(77, -58, 82, 18, 59, 19, 20, -69, 73, -98, 49, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-69,-58,18,19,20,49,59,73,77,82,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 53, 97, 51, 68, 66, -71, 73, 35, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,12,35,51,53,66,68,73,91,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 8, 76, 7, 36, 92, 64, -18, 78, 85, -51, 61, 75, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,-18,7,8,36,61,63,64,75,76,78,85,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-83, -29, 30, 97, 50, 9, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-29,9,30,49,50,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, -39, -42, 38, 1, -4, 85, 65, -79, -31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-79,-42,-39,-31,-4,1,38,65,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 51, -95, 70, 65, 76, 71, 44, 71, 13, 57, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,13,14,19,44,51,57,65,70,71,71,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 4, 91, 40, 95, 14, -50, -85, 24, -41, 37, 75, 27, 24, 54, 63, 48)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-50,-41,4,14,24,24,27,37,40,48,54,63,66,75,91,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 42, 84, 46, 22, 44, 18, 2, 99, -79, 13, -3, 84, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,-3,2,13,18,22,23,42,44,46,55,84,84,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(73, 75, 0, 47, 21, 55, -50, 55, 48, 40, -17, 11, 24, 75)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-17,0,11,21,24,40,47,48,55,55,73,75,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-42, 19, -3, 24, -58, 71, 43, 52, 74, 25, 50, 64, 45, 23, 17, -10, 63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-42,-10,-3,17,19,23,24,25,43,45,50,52,63,64,71,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(2, 45, 70, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,2,45,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 27, 66, 1, 87)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,27,66,79,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, -52, -64, 52, 70, 35, -81, 48, -11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-81,-64,-52,-11,10,35,48,52,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, -52, 82, 55, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,53,55,69,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-65, 40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,40]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, 7, 16, -9, 18, -36, 94, -99, 11, 35, 46, 83, -25, -57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-57,-36,-25,-9,7,11,16,18,35,46,56,83,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-94, 78, 44, -38, -78, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-78,-38,44,68,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 71, 69, 36, 35, 19, 98, 35, -46, 57, 36, 62, 56, -24, -7, 32, -54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-46,-24,-7,19,32,35,35,36,36,46,56,57,62,69,71,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 96, 37, 61, 14, 43, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,20,37,43,61,86,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, -14, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-14,26,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 25, 20, 89, 71, 85, 37, 79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,20,25,37,71,79,85,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 53, 66, -2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-2,19,53,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-17, 86, 34, 55, 46, 7, 94, 53, -38, 81, 27, 40, 29, -4, 27, 73, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-38,-17,-4,7,20,27,27,29,34,40,46,53,55,73,81,86,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, -7, -34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-34,-7,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 3, -41, 19, 30, 66, 40, 53, 44, -80, 90, 16, 49, 92, 13, 91, 18, 74, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-41,3,8,13,16,18,19,30,40,44,49,53,55,66,74,90,91,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9, -41, 1, 26, 20, 21, 81, 76, 83, 89)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,1,9,20,21,26,76,81,83,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[51,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(19, 74, 49)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,49,74]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-12, -3, 30, 59, 66, 98, 93, -1, 96, 56, 51, 89, 62, 89, 57, 78, 99)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,-3,-1,30,51,56,57,59,62,66,78,89,89,93,96,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, -84, 85, 40, 3, 15, 93, 65, 84, -74, -39, 99, 84, 68, 96, 16, -57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-74,-57,-39,3,15,16,23,40,65,68,84,84,85,93,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, -86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-86,34]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-49, -5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-49,-5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, -67, 59, 4, 27, 1, 12, -11, 31, 25, -77, 50, -39)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-67,-39,-11,1,4,12,25,27,31,50,59,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(89, 53, 17, 40, 35, 35, 79, 38, 34, 56, 21, 41, 8, 87, 30, -97, 94, 69)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-97,8,17,21,30,34,35,35,38,40,41,53,56,69,79,87,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 81, 82, -12, 71, 38, 44, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-12,0,38,44,64,71,81,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, 52, -33, 92, 65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,6,52,65,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-27, 34, 83, 18, 21, 76, 18, 43, -88, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-27,7,18,18,21,34,43,76,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 56, 39, 10, 82, 0, 7, 11, 56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,7,10,11,39,56,56,79,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 24, 18, 82)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,18,24,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, -67, -58, 15, 52, -7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-58,-7,15,52,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 56, 96, -96, 12, -22, 13, -48, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-48,-22,12,13,14,55,56,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-50, 61, 24, -4, -86, 41, 26, 54, -35, -18, 73, 55, 14, 29, -49, 22, 44, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-86,-50,-49,-35,-18,-4,14,22,24,26,29,41,44,54,55,61,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[14,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-31, 96, 80, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,44,80,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, -24, 96, 13, 95, -29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-24,13,85,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 83, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[30,78,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-71, 92, -67, 32, 95, 5, 61, 6, 37, -19, 91, 74, 91, -60, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-67,-60,-60,-19,5,6,32,37,61,74,91,91,92,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-64, 50, 96, 96, 84, 78, -82, 65, -75, 53, 50, -45, 53, 32, 79, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-75,-64,-45,32,50,50,50,53,53,65,78,79,84,96,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(34, 82, 98, 99, -18, 64, 30, 25, 72, 22, 22, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-18,19,22,22,25,30,34,64,72,82,98,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(91, 18, 80, 53, 12, 38, 19, 59, 24, 53, 74, 65, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,18,19,24,38,53,53,59,65,74,78,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(71, 18, 17, -99, 0)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,0,17,18,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 20, 58, -45, 12, 52, 49, 48, -2, -74, -4, 70, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-45,-4,-2,12,20,31,37,48,49,52,58,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 99, -82, 61, 90, 92, 35, 27, 62)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,27,35,48,61,62,90,92,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(75, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[26,75]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[9]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 69, 55, 82, 95, 79, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,55,57,69,79,82,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 12, -15, 96, 28, 64, 88, 60, 64, -98, 29, -21, -87, -73, 88, 49, 18, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-87,-73,-21,-15,12,18,28,29,49,60,64,64,78,84,88,88,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-23, 31, 47, 33, 64, 63, 11, 8, 9, 5, -74, 64, 15, 53, 28)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,-23,5,8,9,11,15,28,31,33,47,53,63,64,64]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(76, -53, 4, 96, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,4,16,76,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(56, 25, 2, 10, 68, -32, 57, 89, 44, -11, 55, 55, 70, -99, 48, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-32,-11,2,10,16,25,44,48,55,55,56,57,68,70,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(61, -87, -59, -70, -14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-87,-70,-59,-14,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(79, 51, -7, 56, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,51,54,56,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 17, 51, 57, 53, 12, 1, -90, 71, -19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-19,1,12,17,51,53,57,60,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 86, 46, 76, -12, 24, 67, 95, 8, -41, 46, 28, 36, 38, 34, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-12,8,11,24,28,34,36,38,46,46,59,67,76,86,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, -7, 60, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-7,28,52,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, 23, 63, 63, 67, 6, 52, -82, -36, 7, 53, 71, -30, 17, 89, 36, 55)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,-36,-30,6,7,17,23,36,52,53,55,63,63,67,71,89,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 55, 87, 58, 67)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[55,58,67,81,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(30, 28, -85, 39, 3, 72, 12, 12, 51, 99, 89, 5, 36, -56, 41, 8, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-56,2,3,5,8,12,12,28,30,36,39,41,51,72,89,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, -94, 83, 15, 32, 84, 39, 56, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-60,15,32,39,56,66,83,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(93, 0, 73, 37, 12, -57, 45, 8, 52, 80, 22, 70, -26, -71, -92, 60, 20, 11, -79)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,-79,-71,-57,-26,0,8,11,12,20,22,37,45,52,60,70,73,80,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-14, 77, 81, 83, 60, 41, 95, -45, -27, 65, -88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-45,-27,-14,41,60,65,77,81,83,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(25, 35, 90, -51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-51,25,35,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, 12, -25, -61, 92, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-25,12,77,92,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-85, 47, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,47,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(20, 83, -45)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-45,20,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 89, 56, -60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,56,57,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(23, 23, -93, 71, 5, 35, 30, -46, 64, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-93,-46,5,15,23,23,30,35,64,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-50, 30, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-50,-46,30]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-2, 56, 70, -84, -92, 67, -95, 43, 32, 35, 75, 32, 82, 33, 31, 79, -51, 56, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-92,-84,-51,-2,4,31,32,32,33,35,43,56,56,67,70,75,79,82]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, -66, -3, 74, 16, 78, 38, 98, 57, 97, 55, -72, 34, 3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-66,-3,3,16,34,38,55,57,64,74,78,97,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 70, 71, 66, -64, 62, 89, 0, 15, 42, 80, 51, 79, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-59,0,15,42,51,62,66,70,71,79,80,89,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-65, 82, 0, 63, 64, 63, 12, 36, 66, 43, -70, 86, -39, 70, 60, 57)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-70,-65,-39,0,12,36,43,57,60,63,63,64,66,70,82,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-52, 22, 41, 33, 50, 69, 51, 66, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,22,33,41,50,51,66,69,72]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 26, 43, 39, 56, 24, 8, 95, 80, 93, 28, 53, 27, 86)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,14,24,26,27,28,39,43,53,56,80,86,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 47, 38, 7, 39, -21, 16, 93, 96, 80, 44, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-21,7,8,16,38,39,43,44,47,80,93,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-62, -3, -15, 85, 20, 6, 88, 72, -69, 86, 85, 39, 59, 84, 23, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,-62,-15,-3,6,20,23,31,39,59,72,84,85,85,86,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, 39, -11, -30, 74, 62, 86, 29, 73, -63, 99, -21, 79, -71, 36, 45, -14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-63,-30,-21,-14,-11,29,36,39,45,55,62,73,74,79,86,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, 9, 73, -61, -56, 67, -55, 73, 59, -7, 36, 99, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-56,-55,-7,7,9,29,36,59,67,73,73,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(80, 40, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-53,40,80]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-14, 48, 64, 71, 56, 1, 94, 6, 3, 48, 58, 48, 18, 77, -33, 5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-33,-14,1,3,5,6,18,48,48,48,56,58,64,71,77,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 87, -19, 66, 46, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-19,1,8,46,66,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 89, 2, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,67,71,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(15, -15, 93, 28, -48, 59, 22, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-15,4,15,22,28,59,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(82, 88, 73, 92, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73,77,82,88,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 95, -77, -45, 58, -73, 87, 1, 73, 22, 18, 18, 48, 44, 38, -44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-73,-45,-44,1,18,18,22,38,44,48,58,73,78,87,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(84, -84, 37, 71, 69, 59, 94, -38, 86, 84, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-38,37,54,59,69,71,84,84,86,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(41)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, 59, 41, 28, 7, -83, -52, 21, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-83,-52,7,21,26,28,41,59,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(29, -7, 26, 53, 86, 81, -29, 73)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-29,-7,26,29,53,73,81,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-67, 57, 15, 83, 85, 20, 2, 56, 82, 67, -18, 87, -42, 46, 59, -46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-67,-46,-42,-18,2,15,20,46,56,57,59,67,82,83,85,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 1, 77, 98, 94, 51)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[1,40,51,77,94,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-90, 91, -94, 21, 91, 0, 82, 48, 9, 35, -83, 0, 0, 64)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,-90,-83,0,0,0,9,21,35,48,64,82,91,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-1, 99, -52, 43, 23, 62, 61, 4, 61, -72, 35, 19, 35, 75, -1, 46, 62, 53, 78)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-52,-1,-1,4,19,23,35,35,43,46,53,61,61,62,62,75,78,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(86, -14, 7, 30)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-14,7,30,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(52, 34, -12, 63, 67, 78, 36, -22, 86, 68, 50, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,-12,15,34,36,50,52,63,67,68,78,86]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(45, -60, 17, 39, 25, -21, 81, 89, 55, 63, 17, 42, 0, 37, 71, 41, 18, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-60,-21,0,17,17,18,25,26,37,39,41,42,45,55,63,71,81,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(67, 89, -3, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,17,67,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 59, 59, 71, -91, 2, -55, 43, 29, 54, 38, 14, 34, 76, 74, 19, 16, 36, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-91,-55,2,14,16,19,29,34,36,38,43,54,59,59,62,71,74,74,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(13, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, -11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-11,58]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, -71, 62, 37, -31, 90, 45, 32, 74, 28, -9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-31,-9,27,28,32,37,45,62,74,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(92, 97, 54, 52, 47, 24, -63)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-63,24,47,52,54,92,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(65, 84, -75, 15)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,15,65,84]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(28, 61, 97, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[28,61,77,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(48, 31, 47, 48, 44, 9, 55, 38, 76, -5)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-5,9,31,38,44,47,48,48,55,76]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-27, -40)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-40,-27]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(66, 76, 5, 91, -53, 22, 74, 0, 58, 54, 54, 47, 40, 1, -42, -68, -4, 84)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,-53,-42,-4,0,1,5,22,40,47,54,54,58,66,74,76,84,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, 18, 56, -59)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-59,18,50,56]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, 57, 67, 28, -3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,28,57,64,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(49, 19, 65, 73, 87, 96, 48, 99, 66, -74, 54, 45, 95, 37, 78, 77, 16)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-74,16,19,37,45,48,49,54,65,66,73,77,78,87,95,96,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(63, -98, 89, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,52,63,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(74, 14, 6, 71, 96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[6,14,71,74,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-84, 34, 75, 53, 70, 43, -16, 91, 64, 65, -13, 6, 91, 68, 78, -10, -53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-53,-16,-13,-10,6,34,43,53,64,65,68,70,75,78,91,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-81, 98, 75, 0, 96, 55, 2, 12, -11, 67, 58, -90, 62, 66, 28, 71)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-81,-11,0,2,12,28,55,58,62,66,67,71,75,96,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 95, -52, -20, 14, 37, 95, 70, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-52,-20,1,14,14,37,70,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, -94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-94,51]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, -13, 68, 94, 74, 99, 18, 26, 30, 38)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-13,18,26,30,38,40,68,74,94,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 25, 59, 58, -65, -34)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-34,25,58,59,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(51, 11, 18, 47, 63, 24, 95, -3, 8, 95, 64, 23, 5, -95, 62, 24, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-3,5,8,11,18,23,24,24,27,47,51,62,63,64,95,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, 77, 67, 33, 82, -27, 58, 62, -84, 35, 98, 11, 23)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-84,-69,-27,11,23,33,35,58,62,67,77,82,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-55, 28, 63, 73, 87, 29, 16, 13, -64, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-64,-55,13,16,18,28,29,63,73,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 51, 93, 27, 35, -89, 15, -80, -64, 84, 78, 95, -96)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-96,-89,-80,-64,15,27,35,51,57,78,84,93,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(60, 50, 29, -47, 94)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,29,50,60,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-81, 60, 62, -81, 95, 61, 25, -98, 11, -17, 39, 36, 56, 4)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-98,-81,-81,-17,4,11,25,36,39,56,60,61,62,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 12, 49, 36, 47, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[12,36,47,49,57,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(14, 8, 96, 0, 95, 26, 28, 27, 89, 37, 70, -79, 20)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-79,0,8,14,20,26,27,28,37,70,89,95,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-69, 41, 61, 57, 18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,18,41,57,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 85, 56, 17, -89, 6, 86, 67, 7, 17, 92, 75, 70, 34, 47, 49, 20, -47, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-89,-47,6,7,17,17,20,34,47,49,50,56,59,67,70,75,85,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(94, 51, 60, -54, 61, -29, 88, 7, 82, 65, 16, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-54,-29,7,16,47,51,60,61,65,82,88,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(55, -9)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-9,55]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-45, -51, -90, -33, 99, 47, 90, 93, 37, 71, 66, -24, -57, 50, 25, 68)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-57,-51,-45,-33,-24,25,37,47,50,66,68,71,90,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-55, 33, 42)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,33,42]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList()));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(8, 20, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,8,20]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(58, -82, 97, 12)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-82,12,58,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-88, -17, 69, 92, 69, 67, 1, -27, 9, 2)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-27,-17,1,2,9,67,69,69,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(38, 69, 46, 13, 41, 0, 97, 54, 85, 11, 27, 77)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0,11,13,27,38,41,46,54,69,77,85,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(77, -95, 18, 12, -5, 95, 54, 21, 11, -57, 98, 74, 95, 50)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-95,-57,-5,11,12,18,21,50,54,74,77,95,95,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, 32, 53, -77, 65, 91, 50, 79, 75, 30, 33, 94, -73, 97, 50, 16, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-73,16,30,32,33,47,50,50,53,65,75,79,88,91,94,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(21, 44)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[21,44]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 61, 66)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,61,66]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(35, 28, 26, 78, -71, 22, -8, 4, -38, 74)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,-38,-8,4,22,26,28,35,74,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 28, 41, 95, 32, 37, 54)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[16,28,32,37,41,54,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(22, 16, -26, 5, 80, 7, 91)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-26,5,7,16,22,80,91]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(0, 55, 51, -25, 83)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-25,0,51,55,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(47, 54, 8)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[8,47,54]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(40, 91, 99, 37, 57, -81, 77, -72, 43, 7, -44, 82, -14, 64, -99, 87, 89, 9, 93)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-99,-81,-72,-44,-14,7,9,37,40,43,57,64,77,82,87,89,91,93,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, 75, 50, -18, 47, 84, 51, 97, 2, -23, -75, 48, 72, 97)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-23,-18,2,24,47,48,50,51,72,75,84,97,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 4, 88)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[4,43,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-55, 62, 12, 48, -31, 86, 67, 27, 31, 44, -6, 1, 46, 92, 74, -27, 1, 72)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-31,-27,-6,1,1,12,27,31,44,46,48,62,67,72,74,86,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-77, 10, 48, 83, 15, -24, 14, 65, 43, 68, -14, 60, 85)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-77,-24,-14,10,14,15,43,48,60,65,68,83,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(31, 5, 6, 27)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,6,27,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-67, 70, -66, 96, 38, -75, 92, 44, -80, 72, 86, 27, 60, 9, 14, -65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-75,-67,-66,-65,9,14,27,38,44,60,70,72,86,92,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(88, 12, 41, 10, 31, 82, 35, 6, 88, 14, 46, 7, 56, 36, 75, 43, -41, -14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-41,-14,6,7,10,12,14,31,35,36,41,43,46,56,75,82,88,88]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(43, 65, 64, 6, 87, 49, 82, 53, 23, 39, 24, -71, 29)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-71,6,23,24,29,39,43,49,53,64,65,82,87]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-46, 44, -61, 28, 6, 2, 48, 35, 8, 70, 17)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-61,-46,2,6,8,17,28,35,44,48,70]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(27, 93, -22, 49, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-22,11,27,49,93]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(10, 98, 14, 90, 31)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[10,14,31,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(78, 49, -56)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-56,49,78]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[46]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(62, 36, 2, 41, 41, 31, 88, 22, 52, 95, 18, 80, 6, 35, 26, -92, 19, 52)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-92,2,6,18,19,22,26,31,35,36,41,41,52,52,62,80,88,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(81, 85, 58, 70, -22, -29, 98, -14, 45, 25, 1, 85, -90, 63, 6, 1)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-29,-22,-14,1,1,6,25,45,58,63,70,81,85,85,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(5, 3, -3, 53, 19, 25, 59, 44, 37, 47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-3,3,5,19,25,37,44,47,53,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 19, 67, -28, 6, 10)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-28,6,10,17,19,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 81, 0, 2, -23, 11, 24, 54, 26, 67, -6, 7)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-23,-6,0,2,7,11,24,26,46,54,67,81]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(64, -78, 42, 84, -25, 84, -21, 47, 98, 91, 14, 69, -55, 5, -18)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-78,-55,-25,-21,-18,5,14,42,47,64,69,84,84,91,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 14, 19, 26, 87, 86, -45, 0, 27, 86, -5, -72, 40, 75, 96, 75, -3)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-72,-45,-5,-3,0,14,19,26,27,40,46,75,75,86,86,87,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(72, 99, 90, 38, 77, -38, -66, -51, -72, -85, 25, 99, 83, 19)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-85,-72,-66,-51,-38,19,25,38,72,77,83,90,99,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, 78, -59, 8, 54, 57, 91, 21, 81, 4, 9, -80, -39, 13, 96, 29, 39, 53)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-80,-59,-39,4,6,8,9,13,21,29,39,53,54,57,78,81,91,96]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(46, 65, 59, 31, -54, 21, 57, 62, -87, 59, -70, 90, 18, 64, 7, -90, -46, 47, 11)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-87,-70,-54,-46,7,11,18,21,31,46,47,57,59,59,62,64,65,90]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(52, 45, -88, 84, -48, -75, 47, 13, 51, 92, -59, 81, 21, 31, 14)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-88,-75,-59,-48,13,14,21,31,45,47,51,52,81,84,92]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(98, 60, 93, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[32,60,93,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(17, 1, 17, -90, 40, 43, -35, 1, 27, -58)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,-58,-35,1,1,17,17,27,40,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(37, 60)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37,60]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(24, 5, 86, 8, 25, -61, -60, 37, 18, 7, 92, 74, 90, 58, 95, 31, 63, 94, -65)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-65,-61,-60,5,7,8,18,24,25,31,37,58,63,74,86,90,92,94,95]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(85, -14, 50, -75, 23, 52, 7, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-75,-14,7,23,50,52,61,85]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(57, 36, 48, -68, 0, 12, 45, 52, 69, 16, 94, 70)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-68,0,12,16,36,45,48,52,57,69,70,94]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(59, 80, 95, 55, 89, -31, -28, 53, -30, 98, 17, 98)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-31,-30,-28,17,53,55,59,80,89,95,98,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(16, 31, 58, 60, 26, 69, 12, 29, 35, 43, 9, 24, -90)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-90,9,12,16,24,26,29,31,35,43,58,60,69]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(-48, 61, 80, 30, 28, 15, 13, 87, 99, 19, -4, 1, -12, 13, 37)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-48,-12,-4,1,13,13,15,19,28,30,37,61,80,87,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(99, 33, 85, 43, 69, 78, 0, -69, 8, 61)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-69,0,8,33,43,61,69,78,85,99]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(50, -58, -27, 26)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-58,-27,26,50]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(6, 21, 38, -55, 55, 98, 90, 64, 52, 43, 64, 47, -21, 32)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-55,-21,6,21,32,38,43,47,52,55,64,64,90,98]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.QUICKSORT.quicksort(new java.util.ArrayList(java.util.Arrays.asList(53, 88, 84, 57, 19, 54, -19, 48, 64, 44, 73, 57, -47)));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[-47,-19,19,44,48,53,54,57,57,64,73,84,88]", resultFormatted);
    }
}

