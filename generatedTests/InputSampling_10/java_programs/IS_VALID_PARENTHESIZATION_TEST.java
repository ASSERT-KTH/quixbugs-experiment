package java_programs;


public class IS_VALID_PARENTHESIZATION_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")()())()((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(()))((");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("())");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("(())))()(()(");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")(())(()))()(()())");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("))((()))(()()))())");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")((()()(((()");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization(")");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.lang.Boolean result = java_programs.IS_VALID_PARENTHESIZATION.is_valid_parenthesization("()()())((()(()(()))");
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("false", resultFormatted);
    }
}

