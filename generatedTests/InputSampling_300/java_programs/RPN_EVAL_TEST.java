package java_programs;


public class RPN_EVAL_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.53,0.71,0.5,"*",0.43,0.93,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.01,0.25,"+","*",0.46,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.2,0.34,"*")));
        org.junit.Assert.assertEquals( (double) 0.068, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.96,0.41,0.78,0.97,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.26,"/",0.68,0.09,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.21,0.41,"-",0.09,0.34,"/","*")));
        org.junit.Assert.assertEquals( (double) -0.05294117647058822, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.51,0.08,0.23,"*",0.24,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.05,0.33,0.77,0.85,0.4,"-")));
        org.junit.Assert.assertEquals( (double) 0.44999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.59,0.02,"+",0.19,0.78,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.66,0.36,"*",0.59,0.95,"/")));
        org.junit.Assert.assertEquals( (double) 0.6210526315789474, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.42,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.11,0.17,0.99,0.05,0.95,"-")));
        org.junit.Assert.assertEquals( (double) -0.8999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.55,"*",0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.1,0.19,0.57,"-",0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.85,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.24,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.37,"*",0.88,0.1,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.7319, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.75,0.75,"-")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.99,"+",0.69,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.01,"/")));
        org.junit.Assert.assertEquals( (double) 81.0, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.68,0.8,0.61,0.39,0.07,0.37,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.95,0.88,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.53,0.44,"-")));
        org.junit.Assert.assertEquals( (double) 0.09000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.99,0.59,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.24,0.78,"+",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.06,0.12,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.67,0.32,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.81,"*",0.94,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.68,0.4,0.57,"*","-",0.33,"+")));
        org.junit.Assert.assertEquals( (double) 0.782, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.56,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.89,0.1,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.07,0.71,0.23,0.04,0.22,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.85,0.38,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.36,"*",0.05,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.46,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.8,0.49,0.11,0.25,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.2,"*")));
        org.junit.Assert.assertEquals( (double) 0.052000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.29,0.94,0.15,"+","*",0.33,"-")));
        org.junit.Assert.assertEquals( (double) -0.013900000000000079, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.88,"*")));
        org.junit.Assert.assertEquals( (double) 0.044000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.14,0.31,0.06,"+","*",0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.78,0.34,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.8752, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.57,0.61,0.55,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.32,0.17,0.83,"*",0.79,"/",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.18,0.16,"-",0.21,"*",0.21,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.18,"+",0.61,0.86,"*")));
        org.junit.Assert.assertEquals( (double) 0.5246, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.32,0.74,0.26,"/",0.21,"*")));
        org.junit.Assert.assertEquals( (double) 0.5976923076923076, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.73,0.19,0.26,0.79,0.64,0.19,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.74,"-")));
        org.junit.Assert.assertEquals( (double) -0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.2,"+",0.59,0.47,"*",0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.8,0.6,"-")));
        org.junit.Assert.assertEquals( (double) 0.20000000000000007, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.56,1.0,0.66,"/","+","*",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.2,"+")));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.79,"+",0.6,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.99,0.49,0.31,"-")));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.18,"/",0.56,"-")));
        org.junit.Assert.assertEquals( (double) 1.6622222222222223, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.81,"-",0.36,0.75,0.03,0.25,"+")));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.71,0.92,"*",0.36,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.6,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.75,"+",0.45,"+")));
        org.junit.Assert.assertEquals( (double) 1.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.51,"+",0.51,0.17,"/","-")));
        org.junit.Assert.assertEquals( (double) -2.36, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.85,0.35,0.85,"*")));
        org.junit.Assert.assertEquals( (double) 0.2975, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.53,0.3,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.04,"+",0.12,0.0,0.03,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.02,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.15,0.29,0.71,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.02,"/",0.89,0.7,0.73,"/")));
        org.junit.Assert.assertEquals( (double) 0.958904109589041, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.43,0.33,0.49,"-")));
        org.junit.Assert.assertEquals( (double) -0.15999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.33,"+")));
        org.junit.Assert.assertEquals( (double) 1.23, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.66,"-")));
        org.junit.Assert.assertEquals( (double) -0.06000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.69,0.23,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.13,0.33,"-",0.87,"*")));
        org.junit.Assert.assertEquals( (double) -0.17400000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.39,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.05,0.45,0.23,"/","+","+")));
        org.junit.Assert.assertEquals( (double) 2.626521739130435, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.7,0.66,"*",0.09,"*")));
        org.junit.Assert.assertEquals( (double) 0.04157999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.91,0.17,0.06,"/","/",0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.68,"+",0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.8,0.44,0.93,0.97,0.68,"-")));
        org.junit.Assert.assertEquals( (double) 0.2899999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.89,"+",0.62,"-",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.31,"/",0.78,0.73,"+","/")));
        org.junit.Assert.assertEquals( (double) 1.709036530655843, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.99,0.65,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.863076923076923, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.28,0.46,0.09,0.68,"+")));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.72,0.4,0.87,"-",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.33,"-",0.4,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.71,0.46,0.66,0.06,0.28,0.75,"*")));
        org.junit.Assert.assertEquals( (double) 0.21000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.33,0.22,"+","+",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.18,0.88,0.94,"+",0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.43,0.36,"/",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.85,"-",0.7,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.44,0.48,0.34,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.79,0.81,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.005200000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.3,0.38,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.98,0.68,0.23,"+")));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.57,0.07,0.02,"*","/",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.69,"/",0.01,0.5,"/")));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.28,0.03,"/",0.55,0.59,0.8,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.04,"*",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.23,"+",0.84,0.45,0.87,"+",0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.57,"-")));
        org.junit.Assert.assertEquals( (double) 0.3600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.25,"*",0.23,"/")));
        org.junit.Assert.assertEquals( (double) 0.3913043478260869, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.63,0.4,0.55,0.63,"+","+",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.84,0.03,0.38,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.1,0.94,"+",0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.19,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.5,0.68,0.01,"/",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.69,0.78,0.81,"/")));
        org.junit.Assert.assertEquals( (double) 0.9629629629629629, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.13,"+",0.5,0.65,0.5,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.81,"-",0.47,0.95,0.09,0.95,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.95,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.5,"*",0.71,"*")));
        org.junit.Assert.assertEquals( (double) 0.35145, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.16,0.42,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.03,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.03,0.45,0.65,0.05,"*")));
        org.junit.Assert.assertEquals( (double) 0.0325, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.21,0.72,0.08,0.37,"-",0.3,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.64,0.79,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.7600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.26,"/",0.21,"+",0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.27,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.05,"-",0.88,"-",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.48,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.13,0.94,0.68,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.49,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.4,0.11,0.07,0.29,0.94,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.02,0.11,"*",0.21,"/")));
        org.junit.Assert.assertEquals( (double) 0.010476190476190477, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.52,0.57,0.76,0.69,0.84,"*",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.05,"/")));
        org.junit.Assert.assertEquals( (double) 17.0, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.6,"-")));
        org.junit.Assert.assertEquals( (double) -0.26999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.96,0.18,"-",0.48,0.19,0.18,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.33,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.33,"*",0.43,"*")));
        org.junit.Assert.assertEquals( (double) 0.051084, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.75,0.17,"/")));
        org.junit.Assert.assertEquals( (double) 4.411764705882352, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.49,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.17,0.67,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.62,0.56,0.73,"+","-",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.16,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.91,0.15,0.24,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.27,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.48,0.26,0.12,"-","-")));
        org.junit.Assert.assertEquals( (double) 0.33999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.57,0.21,0.49,"/",0.44,0.48,"*")));
        org.junit.Assert.assertEquals( (double) 0.2112, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.77,0.59,0.73,"+",0.11,"*")));
        org.junit.Assert.assertEquals( (double) 0.1452, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.48,"-")));
        org.junit.Assert.assertEquals( (double) -0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.04,0.08,"/",0.61,"+",0.5,"/")));
        org.junit.Assert.assertEquals( (double) 2.2199999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.92,0.88,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.5,0.67,0.26,0.06,0.73,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.88,0.47,"-",0.84,0.49,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.38,"+",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.13,0.04,"*",0.95,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.05,0.85,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.21,0.4,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.98,0.63,0.76,"-",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.47,0.37,0.99,0.28,0.94,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.92,0.14,0.48,0.35,0.52,"+")));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.1,"-",0.02,"/")));
        org.junit.Assert.assertEquals( (double) 13.5, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.65,"-",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.47,"/",0.51,0.73,"*",0.48,"-")));
        org.junit.Assert.assertEquals( (double) -0.10769999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.91,0.58,"*","+",0.94,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.95,0.81,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.84,0.99,0.23,0.08,0.53,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.10350000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.81,0.55,0.82,0.31,"/")));
        org.junit.Assert.assertEquals( (double) 2.6451612903225805, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.9,0.74,0.84,"-",0.15,"*")));
        org.junit.Assert.assertEquals( (double) -0.014999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.84,0.19,0.97,0.46,"/","-","/")));
        org.junit.Assert.assertEquals( (double) -0.43779741672331746, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.92,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.04,0.85,0.6,"+",0.94,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.57,0.95,"+",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.9,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.87,0.24,0.2,"*",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.12,0.67,0.22,0.28,0.1,"*")));
        org.junit.Assert.assertEquals( (double) 0.028000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.65,"+",0.32,0.39,"/",0.84,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.21,0.17,"+",0.0,0.32,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.02,0.9,0.98,0.04,0.19,0.49,"*")));
        org.junit.Assert.assertEquals( (double) 0.0931, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.82,"/",0.97,0.98,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.54,0.87,0.94,0.08,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.07,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.77,0.78,0.93,0.99,"-",0.88,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.97,"/")));
        org.junit.Assert.assertEquals( (double) 0.8762886597938144, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.43,"-",0.93,0.67,0.38,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.98, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.6,0.11,0.77,"*")));
        org.junit.Assert.assertEquals( (double) 0.0847, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.58,0.64,"-")));
        org.junit.Assert.assertEquals( (double) -0.06000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.21,"-",0.25,0.42,"*")));
        org.junit.Assert.assertEquals( (double) 0.105, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.14,0.56,0.75,"*","/",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.13,0.28,0.49,"+",0.64,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.25,0.75,0.22,0.4,0.2,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.0,"-")));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.09,0.43,0.94,"*","-")));
        org.junit.Assert.assertEquals( (double) -0.3141999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.87,0.43,0.85,"+",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.6,"+")));
        org.junit.Assert.assertEquals( (double) 1.6, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.25,0.15,"/","+",0.53,0.64,"/")));
        org.junit.Assert.assertEquals( (double) 0.828125, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.52,0.79,"*","*",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.81,0.99,0.12,0.15,0.78,0.28,"-")));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.54,"-",0.63,"-",0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.06,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.68,"/",0.37,"-",0.44,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.96,0.35,"+")));
        org.junit.Assert.assertEquals( (double) 1.31, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.95,0.65,"+",0.09,0.2,"*",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.65,"+",0.82,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.11,0.9,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.52,0.2,0.14,0.35,"*",0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.47,0.37,0.4,"+",0.56,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.3533834586466165, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.11,"*",0.88,0.82,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.2,0.05,"+")));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.75,0.47,"/",0.28,"/")));
        org.junit.Assert.assertEquals( (double) 5.699088145896656, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.78,"*",0.54,0.55,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.59,0.06,0.82,"-","-","*",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.89,"+",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.45,"+",0.06,0.69,0.38,"-",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.98,0.54,0.2,0.97,0.66,"/",0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.38,0.1,"*",0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.43,"/",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.72,0.7,"+",0.52,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.29,0.37,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.19,0.63,"+",0.97,"/")));
        org.junit.Assert.assertEquals( (double) 0.8453608247422681, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.63,0.16,0.43,0.57,"+")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.74,"-")));
        org.junit.Assert.assertEquals( (double) -0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.27,"*")));
        org.junit.Assert.assertEquals( (double) 0.1566, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.41,"-",0.56,0.14,"*")));
        org.junit.Assert.assertEquals( (double) 0.07840000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.66,0.17,"*",0.44,0.61,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.43,0.2,"/",0.45,0.37,"+")));
        org.junit.Assert.assertEquals( (double) 0.8200000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.97,"-",0.12,0.13,0.62,0.47,"*")));
        org.junit.Assert.assertEquals( (double) 0.2914, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.67,"+",0.63,"/",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.2,"-",0.96,0.09,"-",0.93,"+")));
        org.junit.Assert.assertEquals( (double) 1.8, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.49,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.19,0.19,0.31,0.08,0.62,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.38999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.51,"/",0.64,0.2,"+",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.41,"*",0.85,"/",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.82,0.15,0.16,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.05,0.36,0.63,0.58,"*")));
        org.junit.Assert.assertEquals( (double) 0.3654, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.89,0.77,"/","*",0.54,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.57,"/")));
        org.junit.Assert.assertEquals( (double) 0.4210526315789474, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.42,0.41,0.37,"-","-","+",0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.31,0.7,"+")));
        org.junit.Assert.assertEquals( (double) 1.01, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.49,0.88,"+",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.22,0.66,0.96,0.1,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.79,0.94,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.07,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.34,0.84,"*","/",0.04,"-",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.88,0.08,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.65,0.34,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_280() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.21,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_281() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.84,0.73,0.84,"-","/")));
        org.junit.Assert.assertEquals( (double) -7.636363636363637, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_282() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_283() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.66,0.63,0.72,"*",0.5,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_284() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_285() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_286() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_287() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.61,"*",0.79,"*")));
        org.junit.Assert.assertEquals( (double) 0.245769, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_288() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_289() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.49,"/",0.6,"+",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_290() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.67,"-",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_291() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.49,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_292() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.92,"+",0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_293() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.24,0.83,0.65,"*","/","/")));
        org.junit.Assert.assertEquals( (double) 1.1913958333333334, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_294() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_295() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.52,0.01,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_296() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_297() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.03,0.53,0.05,"-")));
        org.junit.Assert.assertEquals( (double) 0.48000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_298() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.53,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_299() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.55,0.98,"*",0.51,"*","/",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

}

