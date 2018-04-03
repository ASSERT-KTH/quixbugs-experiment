package java_programs;


public class FIND_IN_SORTED_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-28,-18,13,36,43,46,48,49,59,70,80,83,85,99,99},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-28,-27,0,6,10,13,29,53,66,68,69,73,74,80,88,92},(int)0);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -30,6,22,30,80,93},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -26,0,6,15,24,42,42,82,93},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,2,18,18,21,25,34,49,55,81},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -24,23,51,66,97},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-70,-46,-37,-16,-6,3,12,12,28,28,51,66,72,77,80},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-70,-15,10,12,16,34,52,89,99},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,0,5,14,20,47,53,59,66,71,77,82,87,99},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-76,-25,-1,4,19,25,30,32,39,40,51,56,62,66,76,98},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,7,20,60,74,84},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,32},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 27,28,28,35,47,54,65},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-18,3,15,20,25,67,75,78,91,97,97},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 22,23,32,43,51,51,66,67,92,92},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-61,-10,3,15,15,16,26,32,43,44,45,59,62,73,86,89,92,99},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-29,-29,-9,8,12,22,34,45,58,90},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,15,43,70,91,92},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-77,-22,-13,3,23,28,44,53,71,88},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-59,-16,49,60,74,89},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,47,53,53,76,79,80,93,95,99,99},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-52,-42,25,29,40,46,57,72,87},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-39,36,51,81,91,96},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-78,-40,19,31,35,37,38,41,68,69,88,88,93,99,99},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-49,-30,-27,6,12,32,38,52,65,66,80,99},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-54,23,28,30,34,38,47,54,62,70,77,87,90,99},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-43,23,65},(int)65);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 14,16,68,70,92},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 24},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,74,89},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 57,62,87,90},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-21,24,34,42,53,54,55,57,64,65,74},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-58,-36,-26,5,19,21,47,54,60,63,73,86},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -26,36,48,61,61,66,92,96},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,-40,5,24,55,70,85,89},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-38,14,17,37,41,59,61,69,69},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-75,-38,-30,-19,-6,0,14,18,18,34,41,53,55,65,66,78,87,89},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,-19,-18,-15,-3,2,11,14,21,22,23,31,35,49,77,80},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,18,31,39,51,86,97},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 16,23,55,65,75,89},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-71,-58,-55,11,22,26,46,54,60,63,67,68,90,92},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-70,-47,8,20,20,27,57,83,84,86,90,96},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 5,39,60,76},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,2,2,7,20,24,26,31,37,38,43,45,52,67,71,83,83,84,97},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-22,-10,25,45,49,71,73,78,88,94},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 12,27,55,64,76},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-36,5,9,18,22,22,23,33,36,37,52,88,94},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 29,57,92,99},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,20},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13,31,39,43,51,62,80,81,97},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,1,1,5,6,10,11,16,25,35,40,43,53,59,67,70,75,84,94},(int)40);
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-31,1,12,16,27,31,56,75,95},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 38,41,49,58},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,1,48,53},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -30,-12,1,15,16,17,28,70,89},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-45,-39,-8,3,11,13,17,18,38,43,51,74,82},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,5,35,57,63,76,90,98},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-67,-24,-12,4,10,24,39,45,50,52,54,61,98},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-46,1,9,17,17,22,32,37,44,60,62,66,70,71,80,81,83,90},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-82,-65,-13,3,10,12,15,21,32,45,48,58,59,76,78,81},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-53,-1,18,20,41,45,50,50,54,55,90,96},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-55,-5,-2,7,19,43,53,91},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -19,42},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-8,-2,18,49,51,55,60,70,84,87,90,94},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 35},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-9,9,40,51,52,59,73,77},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,65},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-52,-1,32,33,36,37,38,39,39,56,62,74,79,81,93,97},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,30},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-81,14,17,41,51,55,55,61},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-18,16,61,83},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-33,-31,1,8,39,74,75,75,79,80,83},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,17,72,77,80},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 70},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-77,-58,8,17,29,77,86,86,93},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-61,-56,-50,-27,41,43,60,62,62,68,71,82,88,95,98},(int)68);
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-54,-29,-2,38,61,67,69},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-60,-7,-4,8,17,31,38,46,55,62,69,81,94,97},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-20,10,13,26,27,31,44,52,53,61,73,78,79,81,88,94},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-10,-9,8,14,19,23,44,47,80,83,94},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,23,68,68,86},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-68,-68,0,40,67},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,-17,-13,5,6,10,15,21,39,41,47,61,63,66,73},(int)61);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-85,-69,10,28,32,55,58,60,62,67},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,6,13,13,34,53,80,86},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 28,45,71,94},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,8,15,27,41,53,71,75},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-55,-16,30,39,44,52,69,83,96,96},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,29,52,55,76,91,97},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-83,-56,-47,-28,15,15,43,47,58,62,64,71,76,82,92},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-59,-43,-28,-8,4,8,16,19,25,28,41,50,68,77,94},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,18,20,20,22,33,37,45,57,60,61,62,83,91,91},(int)20);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-76,-76,-74,-71,-33,25,29,41,48},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-66,-40,-13,-1,4,12,12,13,20,38,63,75,77,95},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-13,-11,4,13,18,19,19,21,23,26,41,49,51,68,71,85},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,1,7,7,48,63,83,87,93,99},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }
}

