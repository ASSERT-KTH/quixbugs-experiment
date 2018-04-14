package java_programs;


public class IS_VALID_PARENTHESIZATION_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))))((((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")))()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()((()())))))))(((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(()(())");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(()((()())()()())(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("true", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")()()))))((()((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("((((()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))((()(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()(()))((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()))()()()()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("true", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))()(()((())()()()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("())()())))))))))()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")))(()(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("())))(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))()())(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(()()))((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("((()))())()(()(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("())");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("true", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(()))(()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()))))((())()((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("())(())()(()(())(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")((((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()((()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()()()(((())()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("())))");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(()()(()(())()))(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")())))((()))");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")())");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")))((())))((()(((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")())))(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("())())()()))())))()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("true", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")(()(())((((()(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")(())(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("true", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))(()()))()()())((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")())))((((((()))((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")(())(())(())((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()))((()))()))()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }
}

