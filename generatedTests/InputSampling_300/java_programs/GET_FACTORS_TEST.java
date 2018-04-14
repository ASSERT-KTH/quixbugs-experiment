package java_programs;


public class GET_FACTORS_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)967);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[967]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)734);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,367]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)238);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,7,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)141);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,47]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)559);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)73);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)720);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,3,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)320);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)555);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)243);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)442);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,13,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)435);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)961);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)270);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)554);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,277]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)700);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)97);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)884);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,13,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)650);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)538);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,269]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)339);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,113]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)536);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)32);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)117);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)932);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,233]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)871);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)11);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)512);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2,2,2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)440);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,5,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)542);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,271]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)980);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,7,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)562);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,281]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)835);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,167]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)447);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,149]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)275);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,5,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)413);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)502);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,251]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)29);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)70);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)43);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)336);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)943);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)455);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,7,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)290);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)492);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)468);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)550);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)233);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[233]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)970);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)469);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)319);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)487);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[487]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)584);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)966);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)928);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)965);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,193]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)589);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)509);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[509]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)362);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,181]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)616);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,7,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)841);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)2);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)332);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)675);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)247);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)598);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,13,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)9);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)689);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)970);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)320);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)870);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)621);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)171);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)23);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)722);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)570);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,5,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)359);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[359]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)439);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[439]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)836);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,11,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)101);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[101]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)586);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,293]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)560);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)899);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[29,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)731);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)581);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,83]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)50);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)843);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,281]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)437);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)918);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,3,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)211);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[211]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)571);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[571]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)964);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,241]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)857);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[857]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)464);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)542);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,271]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)914);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,457]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)644);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,7,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)469);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)9);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)156);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)34);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)702);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,3,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)70);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)682);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,11,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)801);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)574);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,7,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)321);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,107]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)813);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,271]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)759);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,11,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)983);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[983]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)603);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)605);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,11,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)973);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,139]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)712);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)725);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)261);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)214);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,107]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)523);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[523]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)427);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)400);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)421);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[421]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)42);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)849);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,283]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)430);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)281);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[281]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)227);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[227]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)753);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,251]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)957);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,11,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)395);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)435);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)53);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)334);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,167]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)248);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)468);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)368);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)648);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)380);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)4);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)409);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[409]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)965);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,193]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)561);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,11,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)222);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)547);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[547]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)888);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)66);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)174);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)358);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,179]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)295);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)317);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[317]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)60);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)491);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[491]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)296);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)874);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,19,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)552);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)938);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,7,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)641);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[641]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)288);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)649);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)765);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,5,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)319);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)706);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,353]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)900);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)121);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)678);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,113]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)56);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)917);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,131]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)842);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,421]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)224);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)697);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)177);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,59]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)894);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,149]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)407);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)962);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,13,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)771);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,257]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)961);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[31,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)477);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)17);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)673);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[673]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)850);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)603);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,67]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)979);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)281);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[281]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)691);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[691]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)791);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,113]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)625);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,5,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)863);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[863]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)537);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,179]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)173);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[173]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)682);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,11,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)806);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,13,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)694);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,347]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)827);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[827]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)137);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[137]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)324);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)630);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)461);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[461]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)420);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)970);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,97]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)493);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)870);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)890);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)740);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,37]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)614);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,307]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)120);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)977);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[977]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)623);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)863);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[863]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)68);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)809);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[809]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)741);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,13,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)202);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,101]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)628);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,157]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)493);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)802);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,401]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)620);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)253);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)745);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,149]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)942);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,157]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)908);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,227]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)497);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)220);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)419);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[419]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)462);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,7,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)843);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,281]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)307);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[307]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)789);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,263]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)935);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,11,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)979);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)915);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,5,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)706);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,353]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)652);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,163]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)216);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)738);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)831);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,277]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)919);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[919]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)576);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)793);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[13,61]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)495);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,5,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)473);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)725);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,5,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)22);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)760);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,5,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)946);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,11,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)621);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,3,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)99);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)204);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)606);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,101]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)900);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)229);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[229]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)641);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[641]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)336);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,3,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)323);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[17,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)833);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[7,7,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)601);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[601]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)743);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[743]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)895);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,179]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)570);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,5,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)939);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,313]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)704);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,2,2,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)116);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,29]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)900);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,5,5]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)884);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,13,17]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)734);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,367]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)350);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,5,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)774);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,3,43]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)477);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,53]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)158);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,79]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)171);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,19]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)801);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,3,89]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)656);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)398);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,199]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)701);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[701]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)246);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,3,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)108);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)146);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,73]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)514);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,257]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)840);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,3,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)620);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)519);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,173]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)562);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,281]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)199);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[199]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)620);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,5,31]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)355);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,71]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)968);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,11,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)757);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[757]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)115);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)616);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,7,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)451);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[11,41]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)437);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[19,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)231);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,7,11]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)560);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,2,2,5,7]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)575);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[5,5,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)683);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[683]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)393);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[3,131]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)26);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,13]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)506);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,11,23]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)324);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[2,2,3,3,3,3]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.GET_FACTORS.get_factors((int)71);
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[71]", resultFormatted);
    }
}

