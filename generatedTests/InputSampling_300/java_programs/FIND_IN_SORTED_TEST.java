package java_programs;


public class FIND_IN_SORTED_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-32,-27,1,17,24,32},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-93,-90,-63,-56,-34,37,65,67,74,80,83,84,85},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-71,-64,4,4,9,14,33,36,46,66,94},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -4,15,43,62,67,72,96},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-18,37,58,62,88},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,8,35,44,68,86},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,10,19,30,36,39,44,55,66,69,97},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-84,-50,-23,-19,-14,7,14,14,16,21,27,29,40,44,73,75,78,89},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-49,-17,-16,3,11,15,15,48,51,53,62,69,73,76,92},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-70,-56,1,44,60,67,67,81,96,96},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-35,-19,2,13,14,29,50,51,70,76,83,99},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -6,12,33,62,90},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,26,49,66},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,4,6,8,15,26,32,46,63,64,78,81},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-59,7,33,50,58,60,60,65,66,68,73,75,79,96,96},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 45},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,36,75},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-49,-2,4,9,13,27,55,58,84,90,96,97},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,10,28,52},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,36},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-24,8,15,22,35,46,47,48,49,57,60,63,81,93},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-80,-38,-37,13,21,33,37,42,48,52,53,55,56,61,69,70,84},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 40,63,85},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-44,28,59,94},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -29,-10,3,6,10,13,16,37,40,53,57,64,68,91,94},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,-55,-24,-15,10,24,29,42,47,59,72,75,77,78,91,96,97,99},(int)99);
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 89},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-25,5,6,57,64,69,72,75,79,84},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -20,9,11,15,16,26,31,34,47,74,76,78,98,98},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 55,61,76},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-56,-43,2,50,59,65,65,70,84,95},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-52,-29,-1,17,19,25,28,33,35,52,59,60,63,80,83,84,90},(int)63);
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,-18,3,35,41,78,92},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,10,36,58,92,99},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-56,-46,2,5,19,21,30,36,37,67,68,72,97},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,0,3,4,16,26,32,33,42,49,72,73,93,95,97},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,-59,-12,1,10,14,19,19,26,58,79,96,98},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,4,74,87},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-39,17,22,29,32,43,73,79},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-48,-44,-42,-40,-10,15,18,21,25,61,63,71,78,85,85,89},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-93,-83,-59,6,25,25,25,45,59,93},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-62,11,16,45,69,76,80,99},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-78,-55,11,15,19,23,29,29,37,42,43,48,50,56,74,75,96},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 26},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -12,1,18,38,63,63,64,90,90,96},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -32,-10,39,49,74,76,79,86,94},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -35,-28,16,17,35,66,69,79,82},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -5,11,14,17,40,41,44,45,45,50,52,54,55,61,70,71,72,85,94},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -40,41,47,49,66,68,71,76,77,81,81,93,96},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-25,47,48},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 76},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,52,62,64,66,80,98},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-92,-66,-43,-12,5,14,21,49,50,50,61,66,69,96},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 3,15,30,57,71,71,71,87,95},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 24,32,36,98},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-68,-45,-19,0,2,14,40,78,81,84},(int)2);
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -4,15,19,43,46,49,70,77,78,89,95},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 15,79},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,9,26,50},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-86,-54,-2,4,9,10,13,36,39,42,50,50,52,67,68,83,84,92},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-54,-17,10,11,17,18,28,39,47,48,49,59,67,69,69,72,86},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-68,-41,-27,-22,-16,-11,-10,5,12,16,31,55,63,65,67,73,94,97},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -10,37,59},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-64,-48,-47,0,4,25,25,26,33,39,40,47,50,59,86},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 54},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -37,-36,2,4,14,26,33,34,36,37,48,50,57,64,76,85,85,86,91},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-12,1,10,10,14,19,36,39,64},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 33,76},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-32,4,24,25,41,79,98},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,10,15,77},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,8,60,62,86},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 68},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 19,44,61,83},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-92,-19,-18,1,4,6,22,32,50,57,66,73,82,83,95},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-30,-23,24,30,30,34,43,59,65,80,81,99},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-78,-66,-31,-25,0,6,32,32,37,41,42,42,50,65,89},(int)65);
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-51,-21,-21,-17,14,22,35,38,52,58,72,80},(int)38);
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-40,-15,7,11,14,30,35,45,51,55,59,66,68,79,81,88},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-57,-48,19,22,22,42,50,58,65,70,93},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-47,-42,-38,-38,15,28,44,49,64,71,72,74,75,79},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-35,-16,0,25,28,38,47,53,57,70,72,74,78,94,95},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59,-27,-4,0,1,5,8,10,19,19,31,35,40,57},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-80,-77,-66,-48,-4,7,17,18,34,41,46,49,61,63,81,91},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -12,-7,2,25,36,46,49,54,56,67,77,98,99,99},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,2,25,47,63,63,68,74,82,82,98},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -2,10,11,22,30,44,53,71,76,82},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 68},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,3,5,7,18,50,62,65},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -35,-6,-4,8,10,22,27,29,32,33,40,52,61,61,63,71,78,79,80},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-46,-35,8,27,30,39,60},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-90,5,11,13,40,48,51,59,84,84,98},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-46,-23,6,24,70,85,90,99},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,14,15,18,47,99},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-25,-15,4,5,5,25,55,67,77,91,98},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,0},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-36,3,9,14,39,61,71,92},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 5,13,14,22,30,37,39,47,58,61,65,75,81,82,93,98},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,19,39,43,56,64,75,75,86,96},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,11,18,32,40,70,99},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,15,25,53,67,69,93},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-35,7,27,33,35,37,53,70,89},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-18,2,17,59},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -34,-30,-28,12,18,24,25,46,47,54,58,69,73,84,89},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -44,0,2,8,11,12,34,36,38,63,64,73,77,82,84,88,92,96},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,-8,25,27,93},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,15,56,60,67,77,80,87},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-66,51,72,84,84},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,0,66,75,99},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-58,-55,-4,1,9,11,13,18,34,47,59,60,68,83,93,94,98},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,32,40,71,77,78},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -14,3,48,86,86},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,15,21,25,31,45,55,60,62,70,72,98},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,10,41,84,92,94},(int)84);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-68,-66,-39,-28,-10,2,13,14,18,25,39,47,54,71,80,97,99},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,0,44,66,67,68},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13,14,32,42,49,62},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -35,-23,-3,2,5,5,5,13,15,17,30,45,47,65,74,78,80,89},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-83,-33,-29,1,16,19,35,39,49,50,54,62,69,71,72,74,76,98},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,42,50,60,77,82,97},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-94,-40,8,11,13,45,47,54,60,62,83,89},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -40,21,22,24,31,40,56,95},(int)22);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,39,40,91},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,12,16,42,43,59,68,87,90},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-7,7,7,24,24,29,31,45,47,63,66,71,75,77,81,87},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,3,33,36,44,45,57,57,61,63,68,70,76,90,92,95},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-37,-15,5,25,32,43,46,67,73,77},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 23,41,63,86},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 76,82,84},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 31,78},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-88,-67,-61,1,12,17,21,25,51,69,95},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-61,-54,-38,-31,-16,1,4,9,15,21,57,72,75,96},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 41,69,70},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-27,-17,5,14,22,41,59,83,84,90},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 43},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,16,37,43,45,48,75},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,6,18,22,26,28,32,39,41},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,5,13,27,36,60,74,87,98},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,18,23,24,29,86},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,-8,59,66,90},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-1,47,59},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-66,-40,-35,-30,-10,8,26,36,56,74,90,91,91},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,42,42},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 46,48},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-70,-65,-15,-4,9,13,15,25,28,35,40,43,57,69},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-24,0,5,7,19,39,51,51,52,61,65,72,78,81,82,89},(int)72);
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-35,-20,2,5,9,33,34,40,45,47,48,59,61,81,88,90,90},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,18,18,26,27,31,59,59,77,82,87,89,90,91,91},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-19,22,25,32,67,68,79},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -45,-39,5,23,25,91},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-11,0,50,99},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-73,-64,-16,2,27,30,35,43,60,62,63,80,85,93},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-64,-48,5,15,28,41,47,65,73,84,85,87},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 45,98},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-17,25,28,30,33,37,64,66,72,82,86,92},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -23,14,21,74,87,98},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-80,-69,-6,2,13,16,29,39,49,56,57,62,70,74,79,93,99,99},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,3,5,20,21,24,27,39,49,78,79,90,92},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,2,32,36,42,43,52,65},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-80,-71,-2,5,6,6,35,52,54,74,76,91,99},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 64},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -34,13,13,13,33,43,51,54,65,77,85,96},(int)33);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-84,17,27,49,52,55,73,85,90,91,93,94},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-9,-7,10,14,20,35,62,73,86},(int)86);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13,13,17,36,41,49,51,57,58,69,69,72,72,85,88,91,96,98},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,2,18},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 33,65},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-57,-49,-21,-9,5,11,16,23,25,32,42,49,50,55,58,58,78,84},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-69,-41,-32,4,6,23,28,37,49,51,57,57,68,86,92},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-82,-6,0,7,11,21,44,89,91,96},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-33,7,13,29,40,42,66,66,98},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -24,3,8,11,16,18,40,72,77,81,89,89,91},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -8,13,27,38,55,84},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-81,-30,-4,2,18,30,49,54,60},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-45,-36,-9,3,7,20,20,40,59,59,61,68,69,70,73,82,85,94},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,-22,-7,3,16,32,36,66,84,87,97},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -13,-4,12,16,24,27,51,54,55,77,82,87,88,89},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -37,79},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-84,-36,-35,-19,5,11,21,25,37,38,52,72,95},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-82,-19,13,23,33,38,43,65,68,79,94},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -10,-3,15,19,19,31,66,70,75,94,96},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,2,35,37,56,58,70,84},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-87,-56,-39,-25,-1,10,12,25,30,33,48,64,71,73,85,87,95,95},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,31,42,93},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-74,-66,12,20,21,25,32,38,42,49,50,65,83,85,93},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-50,1,24,35,54,55,59},(int)35);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -26,5,12,21,21,24,26,27,34,36,50,53,56,58,70,91},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -4,8,19,20,21,39,47,52,53,59,61,82,90,92,93,93},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-8,1,3,5,21,24,35,43,45,58,60,61,76,77,90,93},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-63,-62,-2,12,17,26,34,36,48,62,62,65,69,77,79,85,89,97},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-92,-22,20,39,55,62,68,69},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-56,-29,-21,1,8,16,19,29,48,49,58,66,82,87,93},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,2,9,13,13,14,22,33,36,48,67,86,87,88,90,91,91,95},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-78,-68,-65,-53,-2,5,16,21,29,38,57,57,59,80,92,93,96},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,29,61,87},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-58,-8,10,47,58,61,62,78,86,94},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,88},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-59,-52,-41,-40,-26,-25,18,20,26,32,61,62,73,76,81,91,94},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-89,-88,-36,13,21,25,27,37,42,45,53,61,69,70,93,94},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,30,83},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-75,-58,1,4,9,24,33,39,44,51,58,59,68,83,84,87,97},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-57,-49,-31,-29,5,10,16,47,48,49,52,55,69,75,78},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-82,-42,4,8,16,36,47,52},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-85,6,16,28,31,36,40,43,52,70,94},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -32,17,32},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,-32,17,70,76,77,80,83,85,90},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,0,12,23,29,32,38,55,71,78,88},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,5,6,9,28,34,45,52,55,76,80},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-64,0,6,8,12,24,26,30,33,36,46,47,63,69,73},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,6,29,64,67,72,93,95},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-48,2,6,6,15,28,38,41,47,53,58,61,63,77,82,91},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-73,-41,-34,-3,6,47,70,73,74,80,86,99},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-71,-67,1,6,8,23,77,82},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-40,-23,-17,1,3,25,38,42,43,48,52,59,75,77,82,84},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-25,-14,1,9,52,56,58},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,13,23,24,51,65},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-64,-14,-7,31,50,63,69,77,85,89},(int)63);
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-30,0,10,16,23,27,37,46,62,63,67,68,74,80},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 35,47,48,56,64,88,88,97},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -21,-1,31,31,66,68,80},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 16,31,52,57,89,90},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,41,85},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-86,-3,3,5,9,12,22,26,30,32,38,42,44,47,49,53,54,93},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-13,37,78,82,84},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-19,18,21,21,23,35,53,55,59,83},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,-6,16,27,29,30,46,48,53,71,75,80,84},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 29,51,91},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,3,11,26,31,42,50,66,93},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-40,0,8,16,41,87,89,95,98},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-31,-24,-7,2,6,15,30,43,46,56,74,82,91,91},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-34,-14,-8,9,11,12,14,34,43,51,66,73,78},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-69,6,48,85},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-66,-31,-6,19,24,24,42,61,61},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,3,4,8,10,30,77,91,94},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,29,74,87},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-37,1,19,22,40,51,57,76,96},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,9,13,20,23,28,41,48,50,55,58,66,77,94},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 72,73,79},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-57,9,27,32,38,44,51,62,69,73,75,79,88,96},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 44,49},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,3,23,43,54,77},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 33,45},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-48,-11,2,19,31,32,52,60,64,66,67,68,95},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-3,6,22,26,37,43,56,59,66,79,92},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 26},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 69,74},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-65,-9,5,24,31,35,36,43,48,52,67,75,79,89},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,-16,6,7,40,49,68,82},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,19},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 39,43,77},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,0,5,13,15,22,22,34,51,59,61,71,86,98},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-57,3,9,29,31,95,99},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,-22,0,22,22,26,32,77,82,95,97},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 28,85},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-84,-51,-43,5,6,8,18,28,43,44,54,68,75,77,93,99},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-83,-81,-71,-29,33,41,49,49,51,57,60,60,64,66,80,97,97},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,12,23,35,73},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-46,-20,-9,8,18,19,36,50,56,60,66,68,90},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-46,-38,-11,38,58,59,61,78,84,87,94},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,7,19,20,30,47,51,58,61,80,89,90,91,96},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-29,2,8,13,16,19,33,36,38,39,79,95},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 53},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,1,19,20,63,75,87},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-37,-11,8,8,19,27,36,49,55,62,76,93},(int)55);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 29,51,78},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-11,7,36,37,58,70,72,86},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-47,-22,3,3,23,28,46,56,56,57,62,64,79,84,89,91},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,0,16,21,31,32,38,42,45,53,64,70,76,85,88,88,92,94},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,28,55,55,73,82,84,88},(int)55);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-59,75,91},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-35,-20,-8,0,10,10,29,37,49,52,54,54,73,78,79,93,94},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,1,9,18,37,40,45,47,71,72,76,85},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-8,1,14,15,20,31,56,84,89,98},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,10,22,62,75,80,92},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -50,20,39,61,67,76},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 67,96},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,-53,-6,3,3,4,8,9,9,22,42,44,52,60,70,76,77,86},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 15,18,23,91},(int)15);
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-85,-8,8,19,25,39,48,53,55,83,86,98},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-42},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }
}

