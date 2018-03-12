package java_testcases.junit;


public class FIND_IN_SORTED_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-36,-15,-9,6,6,10,10,17,19,23,35,52,59,80,82},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,56,60,63},(int)63);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -38,-36,-30,-26,22,23,25,40,45,62,73},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,13,23,35,72,72,85,88,93,95},(int)-65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,7,47,61,89},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,9,16,20,23,23,26,33,51,52,55,94},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,11,40,76,93},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 76},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-64,-31,-4,5,12,28,28,29,37,41,43,47,47,54,68,85,86,90},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-16,-13,-3,0,8,14,15,17,17,27,31,36,38,54,60,88},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-28,16,34,76,85,96},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,-42,24,27,43,48,77,88},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-1,38,66,74},(int)-45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-46,-11,13,14,29,29,32,43,48,52,68,77,81,93,93},(int)48);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-37,19,31,40,60,62,63},(int)-81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -5,15,25,26,43,55,56,60,64,65,94},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -3,45,50,65,68,77,91},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-45,-36,5,31,32,55,89},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,7,19,21,22,25,28,37,40,47,51,59,74,77,83,86,86,96,98},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,0,46,53,98},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,42,63,66},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -37,-36,-21,23,44},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,2,5,47,49,65,71,91},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-84,-63,9,22,43,47,53,68,97},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 52,71,89},(int)-52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-33,-3,2,2,15,21,28,29,32,32,83,90,92},(int)-19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-51,-51,1,6,9,16,31,32,37,62,69,84},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 14,31,45,59,76,85,89},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -45,-15,13,28,33,91},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,0},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,11},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-72,5,5,13,21,28,28,37,45,60,71,71,97},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-41,-25,-21,-18,7,10,44,61},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,1,5,10,15,19,31,54,55,59,60,79,81,90,93,95},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -21,1,5,7,25,38,39,49,62,70,72,75,89,92,99,99},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,12},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,-37,-15,-3,6,7,18,23,26,31,44,44,47,48,64,67,78,81,81},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -18,15,17,34,44,46,77,81,81},(int)-85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,27,52},(int)-10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 58},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-56,49,76},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-53,-45,-22,7,16,25,36,58,68,69,70,96},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-30,-8,6,6,8,19,44,60,65,98},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-40,29,97},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -3,-2,0,1,9,12,13,20,22,26,31,44,48,50,52,57,78,88},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -1,37,44,61,86},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)-89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,-48,13,66,72,77},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-76,-52,-47,-23,5,9,16,17,23,26,36,36,54,68,77,78,86,95},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 16,18,40,41,45,73},(int)-8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-8,17,70,76},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,18,55,90,96},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-66,-61,-47,-35,-28,0,9,26,33,42,43,63,83,88,92},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,2,7,10,29,55,68,70,81,94,96},(int)96);
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-62,-51,7,9,10,12,23,27,59,69,88},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,37,40,48,50,58,60,60,66,67,73},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-65,0,10,27,60,60},(int)-10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,24,27,96},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-40,39,46,47,92},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-42,-14,0,0,4,12,17,18,30,50,54,54,60,71,82,82},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,1,3,3,5,12,15,28,30,50,65,72,80},(int)-35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-75,0,14,31},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-52,56,72,82},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,2,3,10,11,19,24,37,47,49,51,64,84,90},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 36,44,44,49,67},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-82,-80,-13,8,33,41,49,58,61,63,65,70,99},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,0,0,10,16,33,37,41,42,57,65,84},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,67},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 9,18,44,49,61,88,90},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -7,23,52,65,87},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-74,-49,-36,-32,2,10,30,32,54,58,67,71,80,81,81,84,91,99},(int)-39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-88,-60,-41,-34,-20,-13,22,28,31,36,37,42,46,57,58,58,59,60},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-12,0,10,12,26,28,29,40,42,45,48,64,65,84,95},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-17,7,8,13,14,21,24,26,30,35,36,56,60,65,66,74,78,86},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 30,72},(int)-49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-96,-6,1,4,16,24,63,79,87,91,92,97,97},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 19,41,53,59},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-45,3,3,28,34,40,45,51,55,60,64,66,75},(int)-76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -38,-32,7,17,18,25,33,36,43,48,53,66,66,73,81,82,98},(int)53);
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,31,34},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,13,14,16,18,19,29,31,38,43,50,56,56,71,72,73,74,86,94},(int)-80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-74,-68,29,48,67,83,93},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-53,-45,-25,9,14,22,23,45,56,57,69,77,85},(int)-14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-9,0,5,8,30,52,59,68,69,88},(int)68);
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 25,33,46,62,63},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,2,19,39,39,43,46,52,57,68,78,79,93},(int)-20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-87,-83,-80,-51,5,15,17,37,58,60,62,69,71,72,74,78,82},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -38,4,48,60,70,73,75,86},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,-39,1,9,11,17,33,56,63,74,80,88,93},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 48,53},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,19,38,41,54,65},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,-7,1,22,95},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-88,8,53,78,86,92,99},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,-3,63,63,66,72,90},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-41,-15,27,35,52,52,65,67,71,72,75,80},(int)-62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,29,35},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-58,28,29,44,70,70,79,82,83,91},(int)-12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-53,0,12,18,35,47,74},(int)-2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-53,-26,9,12,19,28,36,42,49,71,72,81,91,96},(int)81);
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-79,-57,-45,-8,33,62,63,87},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-51,-46,-13,28,29,33,38,50,55,57,73,78,83,92,92},(int)78);
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 19,66,76},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,-27,6,22,29,32,69,83,88,89,90,91,98},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,0,5,25,37,98},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,36,44,44,96},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,-61,-37,14,28,37,47,74,91},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -19,55,96},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-49,-37,3,59,62,74,90},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-58,-31,-20,5,29,39,61,76,79,79},(int)-61);
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-4,53},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-51,5,12,18,24,27,28,29,38,41,41,45,52,64,80,86},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-78,0,6,28,33,33,45,46,58,65,76,81,83},(int)-93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 22},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-53,-51,-11,-8,20,21,22,28,33,35,45,46,80,91,95,95,97},(int)-72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-50,-33,18,27,42,46,52,73,75,92},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-67,-66,-54,-50,-14,-2,8,10,20,52,54,58,67,88,90,97,98,99},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-64,-22,-17,13,26,29,31,61,65,67,68,72,74,83,84,84,92,95},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-77,-74,-72,-63,-32,-26,30,33,56,62,63,90},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-70,-38,-36,5,12,18,76,80,87,93,94},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-60,-42,8,18,27,29,39,44,51,52,57,58,75,96,98,98},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-67,-35,-11,0,13,42,47,65,97},(int)-44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,3,38,38,91},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)-48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-48,16,20,48,59,71,74,75,79,87,93},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-76,-48,8,13,21,21,29,32,33,35,64,91},(int)-99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -22,32,48,79,96},(int)-80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 52},(int)-92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-28,6,9,16,33,39,65,83},(int)-37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-86,-50,-40,24,42,50,52,83,94},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-75,-52,-38,1,6,33,34,42,73,75,82,84,90,97},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-38,0,0,5,6,11,20,33,49,59,68,69,75,83,91},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-58},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-15,23,29,44,50,75,78,84,89,92,99},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-41,11,13,25,37,45},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-72,-57,-40,0,0,0,14,19,20,36,46,70,75},(int)-28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-91,-85,-60,-47,-45,-36,-34,-22,-21,3,17,33,49,55,62,99,99,99},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)-93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-49,-27,-22,-11,8,10,52,52,65,71,73,90,91,97},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-73,5,14,19,22,28,37,40,49,60,62,65,72,93,96},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,18,33,39,46,47,47,60,61,72,76,92},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-40,-39,-31,-4,17,17,17,55,74,92},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-48,-31,-19,-12,2,4,5,11,12,29,32,47,56,64,70,73,75,94},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-49,12,23,49,89},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,55,71,76,86,91},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,19,19,21,57,90,93,93},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 64},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-89,-21,-16,-1,2,4,12,12,26,32,39,65,65,85,85,98},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-83,1,3,3,20,42,43,58,61,71,73,74,82,83,90},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-79,-56,-50,-28,5,7,12,17,20,24,32,42,44,64,85,87,93},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,7,16,21,44,51,57,84,89,91},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,-49,-37,-33,3,7,9,30,40,43,44,57,60,62,78,93,94,98,98},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-29,-3,8,16,22,40,41,44,45,85,87,94},(int)87);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-16,-13,29,35,53,69,97,99},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-3,41},(int)-78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-37,-25,-3,1,9,16,36,45,45,45,46,64,65,69,88,90,98},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,14,16,18,28,31,53,85,87},(int)-99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,47,58,59,63,73,81,99},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 94},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,12,12,13,15,17,43,50,53,58,61,72,75,77,80,84,97},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-30,7,45,56,61,81,85},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-43,5,13,13,16,20,27,32,39,42,67,78,79,83,87,91,96,97},(int)-4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-63,-17,4,14,46,55,64,77},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-52,-43,24,27,29,31,45,46,62,63,63,64,78,85,92,95,96,98},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 48,49,67,72,78,86},(int)-75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -22,-20,19,24,28,42,46,51,56,61,73,79,82,83,92},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -2,1,22,36,94},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,-8,14,27,29,42,49,78},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,19,70,71,73,94},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 49,56},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-48,-42,-2,9,36,65,89,92},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -2,16,37,39,69},(int)-69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,-24,-7,15,33,33,41,43,47,65,76,87,88,94,94,99},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-25,23,29,44,69,71,85,92,94,96},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -50,-48,17,18,23,61,66},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-72,30,41,53,59,79,81},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,0,3,51,77,93},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,-30,-22,16,17,19,19,25,31,45,47,65,70,74,76,78,92},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-78,-67,-64,-9,3,5,13,26,36,56,71,72,74},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 17,93},(int)-97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 17,41,86},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)-45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,4,15,29,32,33,42,49,52,72,78,83,85,91},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -22,23,30,31,42,56,59,61,92},(int)-67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-62,5,10,10,31,47,57,75,89,99},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,1,35,50,63,76,83,94},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-68,-60,0,8,20,42,52,68,85,89,99},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-75,3,18,25,34,34,41,80},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-10,23,27,31,35,38,41,42,46,49,82,85,87},(int)41);
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-38,-19,-8,1,1,4,6,7,9,15,37,48,52,95},(int)-52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,38,47,58,61,64},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-53,-32,-14,17,27,38,42,44,50,61,62,98},(int)-86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -12,12,15,29,44,61,67,69,78,88,89,89,90,91,96},(int)-18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-50,-41,-14,11,18,24,26,54,60,64,66,83,84,90,97,99},(int)-14);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-41,-24,26,31,46,53,55,55,97},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }
}

