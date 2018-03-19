package java_programs;


public class FIND_IN_SORTED_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -24,6,9,13,23,74,80},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-33,21,21,47,71,83,84,91,97},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 54,88},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-83,-75,-74,-8,2,8,10,13,18,19,26,30,60,63,70,80,93},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -16},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,57,78,99},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,-42,-38,0,5,6,33,36,48,49,51,52,55,55,55,56,72,72,81},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,13,52,69,72},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-61,-53,16,38,51,72,77,91,95},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-62,2,18,64},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -40,-27,2,7,15,26,63,74,91},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 44},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-68,-48,-16,17,22,27,31,56,72},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -16,9,48,66,88},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-90,-68,-45,-43,-40,-36,-29,-26,-11,-3,3,10,22,24,35,70,93},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,14,16,22,27,29,32,44,68},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -34,7,20,21,26,30,34,66,84,90},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-84,1,15,18,52,79,88},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,15,62,87},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,1,16,37,71,92},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,7,42,42,70,71,89},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,6,25,38,49,65,71,80,86,88},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-53,5,10,26,41,44,47,49,62,79,93,97},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-65,-47,-41,0,5,13,17,34,38,47,53,69,74,76,79,92,98},(int)53);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-12,30,33,53,82,84,98},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,5,9,36,53,64,74,76,78,97},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-49,-20,3,22,34,39,69,75},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-38,-30,-12,26,32,48,49,52,55},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-43,-22,50,58,75,79,89,98},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -27,-24,-2,7,23,23,25,44,65,70,71,76,85,88},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-36,0,2,5,9,11,48,59,63,65,96},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-78,-74,-73,-51,-49,-48,-29,32,39,50,77,78,92,99,99},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-8,-3,13,15,20,38,45,61,62,70,71,85,96,99},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -8,63,94},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,-13,4,9,20,30,31,50,57,65,68,85,91,92},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,9,19,47,53,71},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-51,28,40,50},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,64},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -16,0,40,56,74},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 23,92},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -38,-12,23,25,29,39,79,90,92,93,96},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,13,41,91,94,96},(int)94);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-52,0,5,11,12,20,25,49,52,58,81,87,95,96},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,24,45,58,83},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,16,21,28,29,34,49,54,71,77,79},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-49,-11,12,29,42,51,56,79,94},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-7,12,23,46,84,96},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -50,7,85},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,9,12,15,29,42,49,59,63,75,80,80,85,86,90},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-57,11,13,18,19,22,43,54,55,62,69,72,76,99},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-44,-22,1,7,44,50,57,90},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-77,-59,15,66,71,80,87},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,3,19,21,30,32,50,54,57,61,64,72,74,75,84},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 26,39,47,51,62,75,82,86},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 26,36,38,54,57,60,62,63,72},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-28,-14,9,12,15,26,40,41,42,50,59,66,66,81},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-57,-26,-21,-16,4,11,21,31,36,38,42,57,71,73,76,85,96,98},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,-43,-1,-1,52,56,67,75},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-64,-25,-2,-2,9,18,20,24,26,30,42,51,53,70,72,92},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 29,37},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,29,51},(int)7);
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-77,-54,-13,6,17,25,32,33,52,77,78},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-61,-57,1,10,13,21,27,32,38,41,45,51,66,69,83,91,92},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 14,18},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-53,-2,3,5,10,15,28,31,32,39,40,55,57,61,81,92},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 38,49,55,85},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,7,46},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-58,-34,-22,-19,24,32,39,40,51,67,74,77,81,84,96,98},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-60,-13,3,6,15,17,34,82,85},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,3,8,21,21,37,53,57,63,74,75,81,90,97},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-26,12,15,27,37,58,93},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -29,8,38,43,45,50,50,66,68,69,78,79,84,86,99},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-76,-62,-17,5,5,6,20,22,28,33,38,41,44,52,70,71,85,92},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-55},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-63,-62,-59,-27,13,17,19,25,30,34,59,60,76,78,86,86,87,96},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,6,12,24,99},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 17},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -11,21,27,48,53,61,62,65,72,72,80,80,91},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,4,45,49,68,78},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,11,19,24,38,61,64,68,70,74,75,92},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-33,11,12,30,33,37,52},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-96,-93,-49,7,16,31,38,52,81,86},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-75,13,22,36,41,56,74,83,84,85},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-22,6,10,12,18,27,37,43,46,61,66,67,87,90,91,92,95,98},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -4,15,25,35,38,62,71,83},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -23,-15,5,5,10,34,45,59,74,75,78,91,96},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -27,-20,6,26,35,52,70,86,88,91},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,10,15,49},(int)15);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-85,-59,-12,-2,2,9,15,18,23,26,26,28,28,28,32,46,71,77},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,22,24,25,29,31,46,64,66,70,70,75,76,77,92,93,95},(int)24);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,24,27,28,36,55,71,82,97},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-62,1,3,37,49,64,73,96},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-46,3,6,14,14,29,37,38,40,53,95,95},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,52,61,76,80,82},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,5,10,40,51,86,87,99},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-66,38,45,63,64,72},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-52,-48,14,51,63,68,69,82,85,86,88,91},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-7,9,28,28,29,42,43,55,59,61,66,68,83,98},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,30,84},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -23,15,54,57,68,87,96},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-54,-8,0,39,55,70},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -15,-7,5,17,26,27,32,32,33,38,65,70,77,79,82},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-7,-7,13,32,36,61,90,93},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-10,8,23,49,50,55,69,80},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13,81},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-32,10,26,51,59,60,61,63,70,79,80,84,86,86,92,98},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 24,86,96},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -40,-1,1,6,9,24,46,47,57,76,95},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-26,-25,-23,-17,14,19,25,26,34,40,47,54,59,85,86,87,99},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,18,57},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,21,79},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-26,-24,-23,41,56,58,63},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-28,-11,33,35,80,89},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,3,14,20,45},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -46,-27,0,10,12,14,31,32,37,50,59,65,74,77,82,86,88,96,99},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,0,4,6,8,20,29,37,37,42,47,58,58,60,63,66,68,72,98},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-45,-42,40,41,54,60,63,89,91,99},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-44,1,5,13,17,18,27,31,42,43,43,77,96},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,-11,9,27,39,99},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,-57,8,15,35,37,43,50,91},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,14,33,54,58},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-59,-42,20,61,64,72,76,94},(int)76);
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-84,3,12,20,29,39,47,49,49,71,73,77,83,86,92,97,99},(int)20);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 15,38,73,79},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-64,1,5,7,37,44,57,80,82,85},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-82,-80,-38,-28,3,16,19,30,34,42,43,57,60,71,75,77,92,95},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,47,74,96},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-24,1,8,16,24,26,51,59,62,65,65,67,67,74,95},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-38,3,11,21,26,27,34,40,42,43,58,76,83,84,92},(int)76);
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 71},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,-35,54,59,66,79,86,87,93},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-66,-28,-19,11,15,38,40,43,52,86,87,90},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-93,-43,-36,-23,14,20,22,25,28,32,42,53,70,76,79,94},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 30,52,60,79,81},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-75,-66,-52,8,24,28,32,38,39,47,51,53,66,92,96,97},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-59,-28,22,32,37,45,50,63,63,64,65,83,83,88,92,92},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,-4,51},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,10,37,64},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,63,76},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-74,-21,-7,-1,8,9,17,25,30,45,47,56,61,67,69,79,81},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-36,1,18,42,51,54,67,79,86},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 17,23,32,35,96},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,6,8,9,12,19,26,28,42,44,44,64,66,68,76,82,97,97},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -46,-38,-37,0,8,18,27,28,37,41,62,67,67,78},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,16,50,57,64,64,70,79,82,85},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-26,2,19,34,42,70,72},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-47,-19,11,39,72,75},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,9,44,49,68,73,74},(int)74);
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 23,38,38,48,53,58,76,94},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,-31,-19,7,8,9,11,14,30,42,46,66,90},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-85,-54,3,14,23,34,36,39,45,58,58,73,83},(int)73);
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-53,-39,7,20,34,39,42,45,50,81,86,86,87,89,92,98,98,99},(int)50);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -30,52,57,97},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,20,25,55,65,81},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,14,21,21,36,38,52,89,93},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 15,34,50,58,62,83,96},(int)34);
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-92,-87,-78,-78,-49,1,10,11,12,23,26,49,51,58,68,71},(int)12);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-7,4,7,17,19,21,24,28,31,39,42,45,48,56,77,95,99},(int)17);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-42,5,34,36,45,52,56,56,61,62,64,70,88,97},(int)70);
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 30,63,78},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 51,63,67},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-89,-19,-19,1,20,28,38,57,60,67,70,72,79,90,92},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-16,-4,19,24,36,39,58,58,67,71,78,81,81,89},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,7,26,44,63,78},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 50,70,71},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,-24,17,24,45,64,64,91},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-29,-10,8,8,20,21,27,40,59,61,66,71,84,90,97},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-89,-60,-39,24,41,51,61,66,67,75,76,82,83,90,95},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,57},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-77,-65,-35,-27,-25,3,27,30,55,61,65,68,96},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,-34,17,31,72},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-14,24,28,36,41,54,63,75,84,85},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-98,42,81,95,96},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -35,0,5,12,21,33,34,46,49,54,58,60,65,78,81,90},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 14,21,29,34,45,48,49,57,59,76,85},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 9,20,26,66,66,67,91},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-73,-64,5,18,21,27,34,35,37,40,52,60,61,62,92,97},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,-9,-1,5,27,33,40,48,51,52,59,83,89,89},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-37,0,21,24,25,44,53,66,69,73,81,92,93,97},(int)92);
        org.junit.Assert.assertEquals( (int) 12, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,3,18,22,38,58,65,82},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,14,25,33,41,41,49,50,54,62,85},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-61,-58,53,57,63,66},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-31,-14,48,54,61,86,90},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-62,-10,12,27,32,33,36,41,45,45,51,55,65,67,73,79,92,95},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,29,30,52,70,82,95},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 14,96},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,8,30,57,68,80},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13,19,44,54,83,88,96},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-76,-75,-59,-38,-16,-16,8,10,11,21,35,45,66,73,76,82,98},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-35,23,25,67,67},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-55,11,18,35,37,42,55,93},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -37,79},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-51,-12,45,75,92},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,0,4,7,17,17,22,33,40,51,60,76},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-81,-42,-36,-2,8,25,50,58,62,63,73,82,84,87,87,91,92,98},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,16,34,70,70,77,81,88,94},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,28,51,61,65,66,68,75,83,85,90,90,96},(int)51);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-33,25,45,57,58,80,94},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-78,-57,-49,2,6,8,18,23,71,72,75,75,78,83,85,89,94,96},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-70,-40,6,19,61,69,76,78,80,84,95},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-24,-13,27,47,48,63,77},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18},(int)18);
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 23,29},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -16,12,37,38},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-86,-77,-18,0,12,21,35,44,47,56,70,72,74,81,82,84,87},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-72,-70,-67,-35,-19,0,19,34,50,57,66,86,90,95},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -40,12,33,86,93,98},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-17,44,65,78},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-54,-11,3,11,16,18,24,29,38,42,48,63,64,72,80,94,99},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,1,5,15,39,39,40,43,56,67,81,82,97,98},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-62,-56,-36,-23,8,12,71},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-72,-51,-8,4,6,8,18,23,31,40,50,54,57,64,71,90},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-60,2,3,13,15,33,43,51,51,55,70,87,92,99},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,-38,-1,20,44,58,66,77},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-44,-23,-15,0,2,10,11,22,22,29,44,49,85,88},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-80,-71,-61,8,10,43,44,71,84},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-19,11,20,36,62,76,78,98},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,49,55,61,72},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-20,-13,9,37,45,46,47,47,50,56,56,63,65,70,84,86,94,99},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-7,1,1,2,3,23,33,44,44,59,82,84,89,90},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,-30,-19,83,94,98,99},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-52,-19,13,27,36,40,41,42,62,71,74,91,99},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-53,-11,13,14,21,28,36,67},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-36,17,22,23,39,42,43,46,57,61,70,79},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-71,-54,0,6,10,20,23,24,25,33,37,38,55,78,80,80},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,96},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-91,-88,-80,-17,8,22,33,37,53,56,56,88,98},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-35,-11,-10,-2,9,10,16,38,48,63,68,82},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,26,53,66,75,76,78,98},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,38,50,89},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-90,-48,-41,-14,15,24,30,43,44,76,93},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,8,9,31,33,70,78,81,87},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 12,13,22,44,49,60,94},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-63,-44,0,0,2,7,9,13,17,20,33,65,66,74,88,90},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-9,19,36,54,66,66},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-47,-7,10,12,14,29,75,76,79,85},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-67,-59,-22,3,22,26,39,51,59,67,67,69,77,90,93},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-13,14,36,43,50,80,82,86,92},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59,-9,11,84},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 3},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,-36,14,31,38,54,59,62,68,69,70,72,84,85,93,99},(int)54);
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -13,-6,42,50,54,64,76},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-86,-8,10,13,18,40,44,46,59,67,70,73},(int)10);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-78,-64,31,82},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-72,14,15,32,36,36,55,55,57,58,66,66,77},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-63,-44,-43,-21,-6,3,11,18,20,34,42,42,60,80,81,94},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -11,-1,73,87},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,12,37,40,80,90},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-67,-10,18,30,46,47,48,49,49,50,54,61,62,62,63,74,84,92},(int)18);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-40,1,5,12,12,49,65,75,77,83,85,93,98},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-49,-42,1,9,26,29,45,50,54,55,65,71,72},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-73,-69,-45,-41,-20,-12,-5,19,23,52,52,54,55,72,73,95,98,99},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,3,3,16,24,45,46,73,81,86,88,90,93},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,25},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -22,-11,6,7,20,23,30,33,39,46,50,72,78,84,90},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 20,53},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,7,16,28,32,45,47,59,81,81,82,85,92},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -29,45,71,73,95},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -3,6,48,60,97},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,29,34,34,56,67,74,78,80,90},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 47,60},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -3,7,26,35,50,66},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-3,0,31,40,56,98},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13,22,59},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 26,45,66},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-58,-10,21,23,27,35,77,79,86,92},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-52,-31,1,8,12,13,17,39,49,61,62,63,75,75,94,99},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,3,7,14,16,16,49},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,78},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-50,-25,-13,7,24,31,37,41,51,67,71,90,97},(int)51);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,3,7,9,10,40,49,52,53,57,60,62,65,91,92,99},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -32,-1,3,10,16,26,31,39,40,50,51,70,77,81,91,95,97},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-76,-62,-31,-15,8,9,10,12,14,21,48,70,79,92,96,96},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,0,13,17,43,51,59,61,74,99},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,15,22,74,94},(int)94);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,12,17,26,27,41,50,59,88},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-58,2,3,5,33,35,35,54,57,58,69,71,72,79,81,93,95,95},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 3},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,-13,10,13,17,28,29,31,50,60,65,86,86,88,93},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-4,1,4,8,9,20,26,27,31,87,87},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,1,16,24,49,55,59,64,65,77,83,86,87},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-42,-20,34,43,76},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -34,-28,-21,12,16,22,26,27,35,44,46,50,53,57,64,70},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -34,-31,-11,0,14,29,31,42,43,43,50,52,52,60,61,65,89,94},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-17,4,7,13,31,35,42,47,64,68,69,73,82,87,90,97},(int)4);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,-37,-12,-12,3,15,22,30,42,54,63,70,71,77,85},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 9,12,98},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-75,-70,-59,-33,-27,-18,2,9,39,58,61,76,77,84},(int)61);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-58,4,8,10,11,16,19,31,37,38,43,62,72,82,84,87},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,0,0,13},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,3,5,8,8,14,25,26,28,33,41,44,52,54,62,73,91},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -32,-19,0,1,2,14,22,23,32,41,71,87,87},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 24,50,56,64,79},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-96,0,9,10,17,25,25,27,39,41,51,54,70,89,90,99},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 14,27,36,50,50},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-29,4,16,18,24,47,79},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -2,11,17,18,18,20,29,40,50,59,59,82,85,92,98},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59,-52,-46,-15,2,2,5,15,29,32,52,65,68,81,87,89,90,97},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,-16,4,12,47,52,62,64,66,73,76,78,78,87,99},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 69},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,-47,4,37,43,55,68,73},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-47,-28,-18,7,7,10,14,28,42,43,45,47,56,58,77,91,94,97},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-79,-64,1,10,19,31,35,37,58,62,65,69,84,87,96},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,-2,16,25,32,66,90,96},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,8,71,76,92,98},(int)92);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-61,-53,-20,-17,-17,12,27,34,47,55,61,62,63,72,77,89,97},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-76,-25,-12,-5,4,7,17,31,38,61,71,73,90,92,95,98},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 32},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-24,37,56,99},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-3,34,63,68,73,77},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,11,98},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-66,-63,-36,-25,-7,3,24,26,49,50,56,69,75,76,88},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-62,-16,1,3,8,9,16,19,43,53,56,65,65,70,75,91,99},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-83,-50,5,6,16,42,43,65,76,88},(int)76);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,34,42,43,51,56,60,76,77,99},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-34,-27,-19,-13,5,9,15,24,40,46,73,76,77,79,83,93,97},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,11,22,79,86},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 12,26,51,69},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -40,19,31,65},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -50,49,65},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-58,-9,0,10,20,33,38,44,52,65,75,80,96,96},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-48,-5,13,19,29,33,89,89,95},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-72,9},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,9,26,35,39,39,45,50,53,57,65},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,19,24,27,39,59,62,65,71,74,78,84,88,90,99},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 50},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -11,-9,6,18,27},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -14,9,13,14,24,69,75,79,80,80,81,88,88,97},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-44,-10,1,15,37,47,67,71,74},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -34,9,20,20,29,80},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 22,42,66,72,90},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -50,-25,7,8,34,36,41,73,75,90,90,90},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 21,25,32,58,82,87},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -18,-4,14,36},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -29,-21,6,15,30,60,72,85},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,64},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,1,6,24,29,30,32,38,59,77,81,81,84,85,97,97},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-46,-8,1,17,29,32,35,42,45,66,68,75,80,81,95,96,98},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-36,6,13,14,17,17,27,47,49,52,56,64,73,77,82,84,90,99},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 48,52,95},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -7,6,16,17,26,35,38,53,71,77,87},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 23,56,81,84},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-58,9,57,65,85},(int)9);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-81,-5,3,4,5,21,30,46,48,54,55,56,64,68,71,77,93},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -24,10,14,38,43,75},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 66},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-78,1,42,85,94},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-59,10,15,15,18,22,35,45,61,66,89,95},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-63,-56,-46,-26,-22,8,9,39,49,61,70,84,98},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-57,5,24,28,53,96,97},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,15,42,47,53,58,69,75},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-17,-13,12,18,21,23,24,32,35,40,43,45,47,57,69,70,73,96},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,10,20,27,69,71},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-7,20,21,24,37,44,53,57,62,67,75,84},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-50,36,38,61,66,85,86,90,97},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,6,48,70,81},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-68,-15,4,13,34,52,60,84,86,95},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,11,12,37,40,50,60,63,93,98},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-78,0,3,5,21,39,50,72,79},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-73,-61,-40,-34,12,13,20,28,33,33,51,68,69,70,72,83,83},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,-11,9,70,95},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -18,-16,0,31,50,66,93,97,98},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -19,-2,26,30,33,42,45,48,49,67,78,81,96},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,3,5,8,16,19,29,32,37,44,54,67,68,74,76,82,98},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -34,12,27,34,53,54,56,58,67,78,81,85,92},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-87,-61,-60,1,12,13,31,36,47,58,63,64,80,85,86},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 84},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 46,65},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-76,-23,0,3,4,6,36,36,40,46,53,53,74,84,89,93,95},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,23,26,44,45,79,95},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,49,76,96},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -14,28},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-40,1,45,56,63,66,74,84},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-73,-55,-49,-44,-29,-16,9,14,17,30,48,49,60,72,83,86,99},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,22,73},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,3,36,73,85},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,-22,-8,28,32,52,88},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-75,-31,-14,0,3,27,37,38,61,66,93},(int)60);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 3,9,10,15,22,24,27,60,69,74,98,99},(int)22);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,-9,-7,7,17,36,42,43,48,75,76,76,78,85,88,88,91,97},(int)36);
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -55,-24,-14,6,11,24,53,55,56,70},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,64,74},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-10,4,32,44,51,59,73,82,82,84,94,99,99},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-67,-63,-11,5,5,13,37,45,49,68,72,86,87,87},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,12,32,91,94,96,98},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,33,60,80,81},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-89,-42,-12,19,33,36,38},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-50,-29,-8,4,23,24,45,55,56,63,65,77,93,98},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-64,0,28,58,60,61},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-24,14,14,15,30,33,35,41,42,49,55,64,74,75,90},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,58,77,84,99},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,18,46,69,87},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,28,54},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-71,-65,-29,-27,3,26,28,39,44,51,66,79,81,86,95,96,97},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 12},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,16,23,28,29,30,35,37,41,62,62,69,73,76,89,93,97},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,-17,2,61,74,79},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -38,-35,32,37,38},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-83,-64,5,12,18,22,33,88,88,92},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-81,-33,-15,13,17,25,53,98},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-51,-6,6,11,15,23,27,38,38,44,62,67,71,75,93,99},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-32,11,20,23,23,28,57,67,82},(int)20);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-50,-47,-4,1,7,11,21,28,38,39,43,45,51,56,79,94},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -27,1,2,4,18,33,35,38,43,44,52,69,79,81,93},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,-11,19,26,52,52,57,57,61,63,66,91,94},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-41,-36,-17,-1,19,22,34,38,46,49,58,60,61,73,75,82,84,89},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -18,-13,-4,0,3,7,30,33,64,67,68,85,90,92,95,96,97},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-30},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-84,-61,-59,-39,7,14,19,28,37,40,47,59,69,69,88},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -4,21,22,34,44,50,60,62,67,76,76,82,83,94},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,16,47,47,97},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-15,2,15,26,49,62,69,80,86},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-63,20,50,54,57,93,99},(int)83);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-66,-27,18,27,33,61,78},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-17,1,32,48,85,97},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-48,-45,-18,7,12,20,20,28,31,33,40,42,52,73,77,83,90,96},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -26,-23,23,41,46,48,63,63,65,72,82,96,98},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -22,4,7,21,25,29,43,75,75,81,84,90},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,18,27,43,45,57,69,71,78,80,94,98},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 26,46,67,79,79,82},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,15,21,21,47,47,52,53,56,60,82,86,95,99},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 11,90,96},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 19,65},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -26,0,3,20,52,56,73,77,79,92},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 6,53,80},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,7,10,11,16,40,81},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-13,13,23,85,85},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,7,11,15,34,41,41,63,74,77,81,88,89},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 73,78},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-58,12,15,19,19,25,32,41,49,57,64,67,73},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 59},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-73,-46,-43,12,33,35,38,42,75,80,96,96},(int)80);
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 49,58},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,24,29,39,40,41,60,75,85},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-33,-11,14,60,63,67,80},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-49,-39,1,11,26,29,71,96},(int)29);
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,1,22,33,42,57},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-76,-51,11,15,21,26,29,34,53,65,72,73,90},(int)53);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -15,25,31,44,50,55,92},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,14,18,20,48,50,51,54,61,63,68,68,69,70,72,87,90,94,95},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-49,18,26,35,38,50,57,62,83,86},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-74,-46,7,8,12,32,41,49,68,74,75,83,84,95},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-56,40,40,42,53,53,69,79,82,87},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59,-52,-26,1,1,1,6,38,41,42,53,54,63,77,86,93,95,96},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-7,3,4,6,21,28,34,50,54,68,69,74,95},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 44,61},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-73,-31,-1,4,9,14,18,42,66,69,83,87},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,1,12,17,29,31,44,45,53,69,88},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,13,20,21,30,36,39,52,57,61,78,79,81,85,86,94,96,97},(int)85);
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -4,-2,36,36,40,75},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-86,-31,1,4,10,13,25,34,38,39,41,89,90,98},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-51,-45,-24,-9,-3,0,11,20,35,57,57,69,73,74,86},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-70,-59,-56,-46,-20,14,32,39,39,42,50,61,62,69,84,98},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -46,-27,0,3,13,41,42,61,67,71,72,85,96,96},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-62,-12,28,44,45,62,66,75,92},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -16,-2,11,95},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 15},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-62,-26,-6,0,4,19,26,27,58,69,72,73,80},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-89,-13,-10,2,25,26,36,42,45,46,51,51,58,69,70,77,85,94},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 58,92},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 42,44,67,83,84},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,12,12,23,29,38,46,59,63,67,70,78,85},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -35,-35,8,11,19,19,33,45,46,50,55,59,60,60,67,78,86},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,6,24,60},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,34,76},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-60,-12,5,18,22,61,63,66,81},(int)5);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-64,-13,5,5,7,12,21,23,39,48,55,57,65,73,74,79,96},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-42,0,15,49,54,54,58,67,80},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 52,91},(int)52);
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -8,89,94},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,68},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-77,-44,-35,5,26,36,46,56,88,92},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-44,-20,1,9,10,15,22,25,52,52,55,58,75,82,87},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -2,14,18,23,25,30,42,55,60,60,69,84,89},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,1,5,7,12,16,41,42,44,55,55,76,76,79,90,96,97,99},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-70,-63,-38,11,48,50,51,52,58,67,69,86},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,8,24,45,51,74,83},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-59,-44,-40,-40,-8,11,17,18,26,28,34,40,44,52,70,73,98},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,-48,7,13,13,15,29,34,51,57,61,63,63,72,75,82,87,98},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,9},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-40,-24,-18,-4,11,23,65,72,94},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -14,7,10,25,36,40,56,59,69,83},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,-31,-31,3,6,13,38,43,53,57,67,68,77,89,92,95,99},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-37,-15,-9,9,18,19,28,29,38,43,56,67,81,88,98},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 81},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,22,36,40,44,78},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-43,-21,36,54,56,65},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-59,-42,-19,2,10,14,28,29,38,44,64,72,74,84,86,89,93},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-4,3,4,11,25,36,49,51,67,68,70,90},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59,-58,-55,3,5,9,14,27,45,57,57,61,74,79,96,96,97},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -24,0,4,5,15,25,39,43,53,55,58,72,79,90,94},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -9,5,21,32,34,39,41,47,56,58,63,88},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-26,8,11,16,20,26,33,45,47,61,83,90},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-1,8,13,37,47,47,59,66,83,89,90},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 20,85},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-12,-11,22,28,51,56,59,68,82,87,93,94},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,-11,9,19,37,44,47,52,63,72,74,89,97,97,98},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-75,-50,-41,-7,10,15,49,80,88,89,98},(int)98);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-31,-28,-8,32,34,45,50,63,65,72,75,77,86,86,88,94,99},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -35,-29,18,29,32,39,71,72,73,78,90},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -2,1,2,15,17,20,22,27,28,28,33,38,61,65,71,78,86,89,91},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-69,-18,4,7,7,22,30,35,39,44,49,55,59,62,90,94},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-77,-40,-8,7,24,53,97},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,23,41,42},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-66,14,24,26,38,39,53,57,68,74,78,79,81,98,99},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -29,22,24,70,82},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-79,-16,6,14,37,46,63,64,67,72,72,81,90},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,3,11,14,17,36,59,59,85,86,93},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-94,-25,3,21,44,45,52,57,59,61,65,70,72,82,94},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,7,21,30,33,53,64,68,88,91,92},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-47,23,36,40,53,53,54,65},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-42,-3,7,89,93},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,7,9,14,25,44,47,47,59,62,65,81,85,90,91},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-85,-69,-23,-12,5,8,10,21,28,42,43,53,58,68,76,81,82,96},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-46,6,9,12,32,53,56,59,66,83,89,90,90,92,97},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,14,19,47},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-66,-62,-45,11,12,14,17,43,46,64,71,85,86,86,87,94},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 82},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,-9,20,34,71},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -19,12,25,35,37,66,81,83,83,92,96},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-74,-70,-32,-31,7,44,47,58,63,65,65,71,74,83,84,84,86,89},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-73,12,16,20,24,27,35,39,47,51,52,59,60,61,62,63,68,98},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-66,7,13,33,36,45,70,83,99},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-37,-34,12,26,27,33,43,49,49,65,82,91,96},(int)82);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,-3,4,9,10,15,21,40,63,67,78,95},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,-19,4,9,11,21,21,29,33,35,44,44,51,55,74,77,84,90,94},(int)77);
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -41,-37,-18,9,34,38,43,52,67,76,80,85,88},(int)38);
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,34,50,98},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-55,-51,10,14,17,37,74,78,99},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-68,-32,4,18,24,25,30,40,49,54,57,63,81,82,84,86,93},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-27,47},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-15,9,31,51,61,63},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,45,57,60,68,80,92},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 24,35,55,60,61,62,67},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-48,17,43,44,67,77,88,96,97},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 51,58,63},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-67,-35,30,56,58,62,82,95},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,10,12,16,25,35,44,44,45,51,60,95},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,5,29,35,38,39,54,62,64,74,82,84,86,96},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-12,4,22,33,54,57},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -10,-5,-4,6,12,15,30,37,40,40,50,56,83,86,87,89,92},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-90,-16,6,9,12,16,21,23,30,40,57,57,59,59,74,78,80,96},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,4,20},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -44,-40,-20,-17,2,17,32,38,45,48,65},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 67,73},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,40,50},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 6,89},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-77,-37,-5,-5,7,13,19,30,77,79,86,89,91},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,0,3,3,25,38,39,48,58,62,66,72,87,88},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 49,53,56},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-79,-71,-71,2,8,25,28,32,38,41,44,44,54,60,67,78,81},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-31,-26,-20,10,13,15,18,32,33,40,44,55,61,85,90},(int)61);
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,3,17,36,56,61,71,72,81,89,93},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 22,92},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-21,53,87},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,29,65},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 5,51},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-57,-28,42,60,74,80,83,89,99},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,9,44,44,77,84},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,1,26,45,46,52,69,78,79,79,79,88,90,95},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-66,-32,43,54,65},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,-63,-61,-59,-40,12,15,34,41,45,67,68,76,81,98},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,19,20,44,64,77,77,85,98,99},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,3,15,19,53,66},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,2,15,45,54,60,61,67,68},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,56,61,64,75,81},(int)64);
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-73,-27,-15,8,16,37,62},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-86,-82,-59,-48,-44,-9,-4,6,10,15,28,47,78,78,86,87,93},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-62,-61,-59,21,23,30,47,48,49,50,60,71,75,80,87,98,98},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,8,35,40,67,78,96,98},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,49,58,72,92,95,96,96},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-68,-67,6,29,36,37,42,49,58,73,86,89,99},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-23,-3,-1,14,19,25,33,35,54,55,59,60,64,74,81,83,85,99},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-41,11,16,66},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -46,-37,0,1,8,61,61,81,92},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,10,44,70,77,89},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-70,-32,-3,11,15,21,32,41,41,48,51,65,66,69,76,86,90,96},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-28,4,8,51,65,75,91},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-59,-54,14,33,34,35,54,57,60,67,69},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,23,27,40,56,70,85,95},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,74,77,97,99},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -15,27,29,29},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,1},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-19,-11,0,13,22,59,70},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,9,61},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -60,-26,19,31,34,37,48,52,58,75,77,79,84,94,97,98},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-58,-21,-7,5,11,13,18,20,26,42,43,54,73,84,91},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -38,19,56},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -22,8,23,31,32,32,33,39,42,62,63,73,75,77,79,85,89,95},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,17,24,50,60,66,75,93},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,-39,-30,-14,-3,0,3,8,12,14,24,25,26,51,51,54,76,97},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,16,24,26,33,33,40,47,52,54,55,61,68,78,86,93},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -44,46,59},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-41},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-83,-17,5,28,33},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-51,-48,12,37,38,43,53,60,62,65,82,88,91,92,95,98},(int)60);
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-63,-24,-18,4,7,8,13,14,16,27,48,58,61,66,66,84,90,98},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-56,-27,-7,3,13,32,35,36,40,45,52,61,65,72,76,82,84},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 16,18,20,37,88,90},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,2,6,17,70},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 34,73},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,7,11,13,45,58,62,72,73,89},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -40,0,11,11,15,22,24,27,29,31,57,63,66,88,98,99},(int)3);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-91,-72,-42,11,14,19,20,33,61,79,88},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-98,-74,-71,0,6,7,14,23,36,38,44,47,80,85,88,94,94,99},(int)41);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59,-22},(int)2);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-55,-49,-44,-29,-18,32,43,62,66,69,78,91,97,98},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -16,11,32,41,44,46,54,60,64,64,69,79,83,89,90,94},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,8,21,23,29,40,46,47,57,64,69,73,84,92,98,98},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-79,-29,2,5,25,29,35,40,40,74,91,94,99},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-59,9,11,20,26,29,35,36,37,51,83,97},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -30,-8,-6,-6,8,15,38,43,50,51,63,68,84,88,89},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,1,5,18,19,30,30,35,57,66,67,78,81,89,92,98},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-80,-37,-27,-11,5,28,38,46,66,68,71},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,6,6,19,94,97},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-34,-8,32,34,40,43,52,56,64,67,67,73,80,85,92},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-48,-28,5,15,19,24,27,30,44,51,56,63,65,68,74,75,79,80},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-93,12,16,24,47},(int)12);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -12,-10,1,21,26,30,34,39,40,54,73,78,82,88,93},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,-44},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,-31,5,12,18,22,34,53,71,88,90,93,94,95,98},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-81,-80,23,33,43,45,48,51,61,68},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -37,19,22,27,85,88,93},(int)93);
        org.junit.Assert.assertEquals( (int) 6, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-71,13,35,42,46},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,20,26,26,31,36,48,49,59,63,70,74,88,88,91,93,94},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,-10,18,21,22,22,87},(int)68);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -21,16,17,30,46,59,99},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-90,-32,2,2,5,41,50,62,65,78,89,91,95,95},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -10,12,31,51,60,91},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -30,-10,9,14,14,16,44,46,56,63,64,71,80,88},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-65,7,18,33,35,36,38,44,49,61,70,80,84,91,94},(int)72);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-66,-61,-49,-40,4,8,11,12,13,29,34,51,56,57,61,69,87},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -7,15,19,43,49,51,75,77},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,1,2,31,47,48,78,85,87,90,90,94},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 30,35,35,44,46,47,57,89},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-72,-64,-48,-48,4,35,49,51,61,83,94},(int)83);
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-48,-31,-24,6,11,25,36,63,68},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-62,-56,19,19,25,29,36,46,53,57,59,67,68,81,82,91},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,5,13,17,17,20,20,50,68,74,80,80,81,81,81,88,96,97},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,30,38,43,61,68,70,87},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 12,37,84,86,97},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -49,24,39,49,68,81},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-25,0,4,19,20,32,37,51,60,78,80,84},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-64,-63,-29,5,6,9,17,20,39,51,56,57,58,78,84,89,91,97},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -59,2,5,19,21,32,58,68,69,70,74,75,79,81,94},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,10,16,51,62,83},(int)79);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 67},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-21,-19,0,5,15,23,25,71,86,90},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-47,0,2,6,14,20,26,42,58,86,87,88,92},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-19,7,16,21,42,53,53,66,69,78,79,83,84,85,93,96,98},(int)79);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,-40,3,4,6,15,39,42,46,64,64,68,76,76,80,90},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -8,18,50,55,68,77,86,97},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -77,-67,-17,-10,29,29,35,38,38,43,44,44,46,56,75,78},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 22,27,33,60,62,70,86},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-46,-23,-4,2,3,11,24,25,25,44,45,47,48,57,67,79,98},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-63,-44,-4,16,31,34,35,45,70,78,85},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-47,-25,-21,4,39,42,46,91},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 16,36,39,59},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 99},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,-32,-31,-12,-9,-6,20,37,40,56,59,73,84,87},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-77,-76,-51,-42,10,16,17,22,30,54,58,71,72,82,83,89,91},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 17,20,25,46,93,95,98},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -8,9,17,32,36,47},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-31,25,32,33,42,46,48,53,67,76,98},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -50,-40,-36,-22,-13,0,12,21,25,32,45,53,77,90,93},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,5,18,56,69,77,81},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-35,0,5,7,22,32,55,56,90,97},(int)90);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -44,-9,0,21,33,37,39,70,72,74,81,81,82,82,97,97},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-28,-4,3,24,38,49,69,70},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,0,20,24,33,34,44,48,60,61,67,77,82,84,91,93},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-81,-39,-12,0,3,12,16,18,25,26,32,52,57,58,64,79,88},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-7,-2,-1,2,15,20,35,60,65,70,82,92},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-67,-64,1,3,14,38,40,54,61,82,82,83,89,93,95},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,3,6,21,23,23,44,46,65,76,90,91,92},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-68,-65,-36,-2,21,34,45,50,69,69,76,78,83,85,87,88,98},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-29,-2,5,22,35,43,44,47,48,50,55,68,68,76,81,87},(int)44);
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -19,2,8,31,36,53,65,71},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-9,64,68,79,90,94},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,1,4,17,27,34,36,49,80,91,92},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-34,-23,-1,10,14,23,37,49,50,54,64,65,69,70,79,83,88},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -32,4,11,16,23,75,90},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-72,-2,8,18,25,27,38,41,45,48,56,67,70,77,79,83,87,98},(int)83);
        org.junit.Assert.assertEquals( (int) 16, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,40,69,70},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 12,72},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-17,2,4,21,22,23,47,48,52,52,65,67,73,77,77,93},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,12,32,57,67,81},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-37},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-98,-31,10,28,45,79,81},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -52,6,7,24,48,57,63,65,69,70,82,98},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-59,2,5,6,18,46,47,62,70,74,76,92,96},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,19,27,27,71},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 32,59,90},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-82,0,8,9,9,28,39,43,50,60,80,93,96},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-37,40,42,51,55},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-60,-34,-32,-26,6,17,43,47,49,58,63,72,76,79,87,90,98},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -5,6,28},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-97,-41,-17,-10,0,4,24,25,43,45,86,87,89},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 19,24,35,58,69,85},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,2,9,17,21,22,24,62,96},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,-3,-2,13,14,19,36,36,41,52,59,75,87,89,90,96},(int)90);
        org.junit.Assert.assertEquals( (int) 14, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 85},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-77,-13,-10,1,5,8,20,28,43,55,65,96},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-45,-31,1,2,9,32,33,40,45,48},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-80,-80,-79,-57,-28,9,21,41,58,65,68,74,74,75,81,84,95},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,24,31,43,62,78},(int)31);
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -46,11,23,25,30,37,50,63},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 27,57},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,-3,2,2,19,33,62,95,96,99},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-86,-84,-26,10,21,36,50,52,55,58,81,98},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -27,3,10,50},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 75},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-82,-64,8,26,73,93,95},(int)78);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-18,-1,14,25,38,45,62,65,82,88,94},(int)62);
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-91,-88,-24,1,4,11,21,22,26,35,42,43,50,52,78,92},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-90,-73,-57,-25,-8,-7,14,26,35,41,48,60,73,78,86,97},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,-3,11,11,12,44,93},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,1,2,12,19,31,33,37,39,47,59,84,93,95},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,19,30,61,61},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-72,-58,-18,-15,9,12,27,28,35,44,64,81,84,89},(int)7);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,10,30,33,42,46},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 34,49,77},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-41,2,4,11,12,29,33,36,44,45,54,57,67,71,81,86,91,99},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,32,51,79,85},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,4,12,28,32,55,59,67,68,71,82,85,96},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-66,-43,-7,14,23,23,64,77},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,-1,35,47,65},(int)67);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,40,41,42,42,57,60,67,67,69,91},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-29,-17,-6,8,16,24,31,50,52,59,75,95,99},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,-49,-48,-36,-16,-2,1,18,22,24,30,37,45,47,48,64,81},(int)52);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -51,-22,-12,40,49,51,82},(int)46);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,7,10,26,29,72,80,81,99},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -25,36,78},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-68,-64,-44,7,11,14,19,20,22,26,43,57,91},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 33,49,91},(int)63);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-25,7,8,16,17,29,34,43,72,81,95},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,23,36,42,62,78,79},(int)81);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-53,23,28,31,35,44,45,50,50,64,70,84,93},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -73,-38,-20,5,7,30,50,62,72,89},(int)89);
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-83,-82,-53,0,0,18,20,30,31,36,80,88,91,93,94},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-91,-82,-67,-23,2,15,41,47,57,59,62,69,90,97,99},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 45,50,62},(int)48);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -10,45,47,51,51,74,77,77,95},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-35,-32,5,15,37,42,56,61,72},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-64,-33,29,31,60,65,82,87},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,25,67},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-21,-12,19,28,28,47,53,64,68,76,78,99},(int)28);
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -21,-12,4,10,15,17,21,24,26,29,37,37,40,62,74,80,87,90,99},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -50,2,15,27,47,52,76,90},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -6,-6,10,29,35,37,42,59,75,81,82,83,89},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 13,18,31,39,52,62,63,67,68,82,84,90,99},(int)68);
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-83,-58,-16,-4,16,16,22,30,31,35,35,38,53,76,77,82,85},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 31,40},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,7,12,22,27,40,42,48,63,65,69,71,80},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,-28,17,19,19,23,28,34,39,41,60,64,65,78,79,83,91},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 22,25,26},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -18,-2,24,38,48,54,62,93},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,10,15,21,25,25,49,51,69,76,79,85},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,9},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-67,-30,-18,5,18,20,30,34,42,43,59,66,70,70,70,92,95},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -18,29,33,39,89,93},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 82},(int)93);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-80,-70,-51,-20,2,5,44,52,58,61,65},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-52,-35,-25,1,41},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-68,-44,-12,8,17,18,21,40,43,44,44,59,65,75},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-22,6,7,8,10,13,25,25,31,40,50,54,57,57,63,79,89,91},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -23,16,74,80,83,84,86,89},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,-49,-17,-5,3,5,8,11,14,17,17,17,28,32,37,66,85,89},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -72,-59,-19,-19,-3,0,2,8,12,22,25,31,36,43,44,47},(int)43);
        org.junit.Assert.assertEquals( (int) 13, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-10,0,5,8,8,20,28,41,45,49,51,55,87,88,88,92,99},(int)99);
        org.junit.Assert.assertEquals( (int) 17, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-27,0,5,8,17,19,38,47,60},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -21,3,62},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,21,30,37,46,61,81,87,89,99},(int)27);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-72,-10,13,18,21,28,30,44,55,69,71,72,85,93,94,96},(int)80);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-47,-28,-10,1,12,13,17,17,22,35,40,69,72,78,78,79,85,87},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-60,4,8,12,12,18,26,38,43,51,74,74,74,84,88,88,93,95},(int)95);
        org.junit.Assert.assertEquals( (int) 18, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 16},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,13,25,26,32,35,35,73,77,80,80,80,83,96},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-64,-49,-4,15,18,31,33,33,35,37,44,51,81},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -5,22,27,34,48,51,52,66,75,87},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,28,85,90},(int)8);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-45,-29,5,19,19,77,87},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-24,-15,9,22,30,50,76,80,92,95},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,12,16,25,51,53,62,71,76,88},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -44,-37,-16,22,42,51,53,59,63,67,75,98},(int)88);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-94,-89,-62,-33,-17,10,19,28,33,33,46,50,61,65,82,82,85},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-86,-80,-24,2,12,32,43,44,67,71,87,92,96},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-85,-58,-51,-7,3,22,27,48,55,97},(int)51);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -7,58},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-85,-68,8,17,36,38,38,39,41,47,69,75,85},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-67,-43,-10,2,14,15,17,22,32,37,37,45,50,83,85,86,92},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,4,6,13,15,17,27,53,69},(int)56);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-54,-7,7,8,47,50,59,67,83,83,84,98},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 40,66,94},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -30,-5,-2,2,13,14,19,39,43,64,66,67,88,92,94},(int)67);
        org.junit.Assert.assertEquals( (int) 11, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,0,3,46,48,55},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,46,74,98},(int)96);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-9,60,87},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-9,-7,13,19,27,29,41,45,53,66,78,98},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,-60,7,56,75},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 76,86},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -24,30,67},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,13},(int)54);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-47,17,23,45,61,79},(int)69);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,-56,-49,-37,-34,-13,-8,-1,2,5,23,35,45,47,74,75,93},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -43,-18,2,13,18,20,35,35,51,52,62,69,75,77,80,87},(int)87);
        org.junit.Assert.assertEquals( (int) 15, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-62,-10,-9,-7,4,6,8,18,32,33,36,37,38,43,55,62,70,80},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,20,26,63,67,70,84,94},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-13,54,61,75,78,85},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,0,4,7,21,23,24,32,54,75,78,82,85},(int)17);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-93,48,60,75,89,93},(int)11);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -57,-46,10,32,36,48,52,74,95},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 42},(int)45);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 27,76},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)12);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 8,18,22,32,38,44,54,83,89},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-58,-40,-37,-37,11,23,24,32,37,38,45,55,57,57,59,64,75,82},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -58,-10,45},(int)59);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-41,28,30,52,58,63,72,80,82,90},(int)1);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -33,22,30,47,70,73},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-70,-17,9,35,37,40,46,53,54,56,61,95},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -88,-65,-49,-29,8,25,40,46,48,81,98},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-78,-60,-48,-29,1,23,30,39,47,49,67,73,80,89,96},(int)71);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-47,-12,4,14,18,63,65,76,81,85,87,99},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-42,-33,2,9,10,11,24,32,48,57,68,71,78,84,86,88},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,0,0,6,16,17,74,78,83,94},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -12,4,14,23,34,82,94},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 38,42,71,75,77},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-30,7,8,32,36,38,48,68,72,77,78,83,86,86,89,94},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -27,-2,0,14,35,50,64,69,94},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -11,3,15,25,38,54,59,62,64,74,78,79,80,85,85},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,-47,4,10,42,48,59,83,86,98},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 7,50},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-40,4,5,19,22,24,26,33,48,57,69,77,87,95,98},(int)14);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-15,3,16,32,36,37,40,43,51},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,23,31,52,84},(int)36);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -32,87},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -11,23},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,-49,-44,-14,-6,16,18,24,24,26,28,41,46,77,85,90,95,97},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 18,20,51,65,67,94,98},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -39,21,33,61,74},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-36,-26,0,2,34,38,40,42,45,46,60,67,77,92,94},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -96,-84,-59,-33,-19,10,16,36,54,76,93},(int)93);
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -15},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 1,12,16,22,24,28,29,30,33,33,50,67,68,71,85,97},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-36,-2,5,19,32,44,44,45,48,54,56,67,70,81,83,84,86,94},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-61,-34,0,42},(int)33);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,-53,7,22,28,35,48,57,76,89,92},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -15,27,35},(int)50);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-69,-17,4,11,20,31,33,39,46,52,75,77,82,84,84,95,97},(int)43);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -45,60,65,69},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-45,2,25,38,47,56,84,85},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -62,3,11,15,24,60,64,73,74,79,81,82,85},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-13,13,56,84,90,91},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-59,-47,-7,19,21,31,48,48,52,54,55,56,68,81,90,93},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -86,-32,23,51,70},(int)21);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,33,70,73,82,88,97},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-64,-49,-47,29,41,60,75,98},(int)26);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -65,3,12,35,38,38,40,40,41,42,44,53,72,96},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -45,2,22,40,43,55,73,94,94,95},(int)85);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,30,33,71,78,94},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 21,36},(int)29);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-39,-13,1,2,4,13,29,31,43,58,59,68,80,82,90,92,92},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -46,-45,17,65},(int)0);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 27,88},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 33},(int)25);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -7,-1,11,29,33,34,45,54,68,70,77,90,93},(int)33);
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,9},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-30,10,37,41,56,66,75,79,89,90,91,92},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -48,9,12,16,19,30,54,59,64,82,93,96,97},(int)37);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -61,-17,0,1,6,12,18,23,51,62,63,64,65,66,76,79,98},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -76,-53,40,77,78,79},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -27,-18,1,17,30,43,65,70,71,73,76,90},(int)43);
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,-35,49},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -54,-48,-15,-5,1,2,20,43,51,52,52,59,62,64,67,97},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,5,86},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -75,-19,7,7,15,35,35},(int)19);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -93,-42,0,12,26,65,65,73,76,83,89},(int)20);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-53,-5,12,14,19,30,31,42,43,45,46,57,77,92,95},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,-65,-58,-51,-42,-25,8,15,24,32,34,54,59,65,92,95,96,97},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 2,22},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -98,-89,20,50,56,60,65,82,82,92},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 3,6,10,24,43,51,66,92,95,95},(int)94);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,42,47,48,54,67,87,89},(int)70);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-64,-45,-38,-21,-20,-12,-6,0,3,41,43,51,54,74,79,88,90},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -47,20,69,87},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-29,25,34,81,84},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -42,-15,2,3,10,10,45,52,56,61,66,67,71,81,81,86},(int)65);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -99,-88,-83,-58,-45,-23,-20,-10,12,15,27,32,36,39,48,55,62,89},(int)6);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,9,10,27,31,34,35,36,52,54,57,66,80,81},(int)28);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -68,-36,5,35,53,60,80,90,93,97},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -22,10,22,22,31,33,35,45,59,78,85,89},(int)91);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,17,42,61,84,84,97},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 29,98},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-8,-1,12,42,48,59,74,87,92,98},(int)58);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 9,10,66},(int)77);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,9,13,24,31,38,43,48,65,66,82,98,99},(int)95);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -63,8,15,64,79,82},(int)44);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -80,-68,10,19,22,26,45,54,63,85,86,90,98},(int)53);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-34},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0,2,19,20,22,23,26,28,30,55,65,72,76,77,93,93},(int)30);
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -32,-30,-6,23,61,72},(int)73);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -64,-61,47,52,60,66,78,89},(int)92);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -70,-28,5,13,20,61,64},(int)23);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -71,-40,11,28,33,67,79,87,90},(int)47);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -90,-62,-25,0,16,23,61,94},(int)23);
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -89,-12,1,4,14,38,40,46,47,58,71,87,99},(int)16);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-74,6,8,11,51,82,85},(int)24);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 16,17,21,24,38,38,38,61,62,69,71,77,80,84,89,97},(int)5);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -95,-70,28,52,55,73,79,91},(int)49);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -26,-20,-17,-15,45},(int)97);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)57);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 53,57},(int)32);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -92,-44,-10,6,10,26,30,34,41,41,43,52,74,76,77,85},(int)62);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -56,-33,-21,20,27,47,47,62,76,90},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -97,-60,4,33,54,73,89,92},(int)61);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -94,28},(int)9);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -66,54,58,84},(int)90);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-59,-56,-47,-33,-18,0,1,10,23,23,43,44,50,62,75,80,81,91},(int)99);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 36},(int)64);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -87,-76,-62,-62,4,34,35,37,51,60,71,73,87,92,92},(int)22);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -53,3,40,42,48,50,54,79,82,87,88,94},(int)86);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -78,-24,-22,-4,19,29,33,38,41,45,45,52,66,76,78,85,91,97},(int)87);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 65,77,78,89},(int)34);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 50,62,94},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -91,-10,71,82},(int)66);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 0},(int)89);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 3,79},(int)39);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -85,-62,-26,-16,5,11,11,21,33,34,43,60,75,85},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 4,10,11,58},(int)13);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 6,10,13,16,20,22,32,46,56,60,60,81,89},(int)30);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -28,1,4,24,43,66,72,74,79,93},(int)55);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -84,-77,-38,-16,-11,0,6,8,12,48,64,67,68,73,75,79,88},(int)4);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,29,45,61,68,99},(int)42);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -30,-17,2,3,14,18,36,36,41,48,52,55,59,64,69,69,75},(int)31);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -67,-15,1,20,35},(int)15);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -79,-46,-43,-43,-32,-21,-9,-4,-1,62,66,67,70,71,74,77,96},(int)84);
        org.junit.Assert.assertEquals( (int) -1, result);
    }
}

