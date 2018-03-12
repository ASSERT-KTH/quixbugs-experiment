package java_testcases.junit;


public class GET_FACTORS_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)71);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)29);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)44);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)11);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)40);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)58);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)36);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)76);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)45);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)23);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)53);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)6);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)9);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)88);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)99);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)57);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)13);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)69);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)85);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)77);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)44);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)78);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)22);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)93);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)63);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)57);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)35);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)71);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)18);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)65);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)53);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)97);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)80);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)20);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)73);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)42);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)75);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)84);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)44);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)50);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)83);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)64);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)23);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)36);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)15);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)24);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)27);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)34);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)45);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)44);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)51);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)88);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)11);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)37);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)62);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)75);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)16);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)19);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)5);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)7);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)55);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)40);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)39);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)87);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)74);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)21);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)97);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)31);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)42);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)2);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)97);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)50);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)94);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)6);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)1);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)4);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)81);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)67);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[67]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)42);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)3);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)66);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)76);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)75);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)72);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)80);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)41);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)91);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)90);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)66);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)0);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)83);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)58);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)47);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)62);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)92);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)5);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)22);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)18);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)40);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)76);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)31);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)58);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)49);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)84);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)16);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)64);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)58);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)56);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)94);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)83);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)31);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)10);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)64);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)52);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)29);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)27);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)28);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)61);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[61]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)74);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)57);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)0);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[0]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)41);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)54);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)53);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)55);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)42);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)79);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[79]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)3);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)93);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)92);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)9);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)50);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)69);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)88);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)65);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)25);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)10);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)76);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)60);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)5);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)76);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)52);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)53);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)29);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)35);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)56);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)62);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)92);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)40);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)37);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)83);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)94);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)9);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)2);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)71);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)42);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)97);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)38);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)41);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[41]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)66);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)12);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)65);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)49);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)85);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)3);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)98);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,7,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)83);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[83]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)35);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)86);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)25);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)33);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)73);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)97);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)42);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)5);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)81);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)12);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)90);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)16);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)37);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[37]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)54);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)34);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)8);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)30);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)31);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)10);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)26);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)77);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)3);
        String resultFormatted = java_testcases.junit.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3]", resultFormatted);
    }
}

