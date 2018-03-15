package java_programs;


public class RPN_EVAL_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.25,0.28,0.48,0.97,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.71,"/",0.45,"-")));
        org.junit.Assert.assertEquals( (double) 0.9443661971830988, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.91,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.62,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.84,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.02,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.98,0.07,0.57,0.44,0.49,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.5300999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.92,0.55,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.14,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.37,0.25,0.7,0.92,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.78,"-")));
        org.junit.Assert.assertEquals( (double) -0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.23,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.96,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.06,0.98,0.55,"/",0.91,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.8118181818181818, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.74,"-",0.11,0.18,"/",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.64,0.86,0.2,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.45,"-",0.88,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.96,"*",0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.93,0.95,0.27,0.01,"-","*","*")));
        org.junit.Assert.assertEquals( (double) 0.22971, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.83,"+")));
        org.junit.Assert.assertEquals( (double) 1.2999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.52,0.92,"*","-",0.97,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.13,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.6,"+",0.15,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.66,"+",0.42,0.16,"*","*",0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.35,0.94,"*","+",0.35,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.24,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.34,"/",0.61,"-")));
        org.junit.Assert.assertEquals( (double) 1.0958823529411763, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.42,0.12,"-",0.23,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.06,0.46,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.24,0.76,0.93,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.45,0.62,0.29,"/",0.65,0.61,"/")));
        org.junit.Assert.assertEquals( (double) 1.0655737704918034, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.44,"-",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.78,0.36,0.59,0.85,0.76,"+")));
        org.junit.Assert.assertEquals( (double) 1.6099999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.53,"+",0.15,"*",0.96,0.89,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.97,0.57,"*","-",0.86,"+",0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.55,"*",0.22,0.93,"*","/")));
        org.junit.Assert.assertEquals( (double) 2.043010752688172, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.88,1.0,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.9,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.2,"+",0.33,0.34,0.19,"/")));
        org.junit.Assert.assertEquals( (double) 1.7894736842105263, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.56,0.77,"/",0.62,"*",0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.47,0.03,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.6599999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.86,0.76,0.64,0.71,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.2,0.33,"-",0.42,0.86,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.77,0.07,0.84,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.9,0.09,"+",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.62,"*",0.97,"-",0.95,"/")));
        org.junit.Assert.assertEquals( (double) -1.0145263157894737, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.55,0.3,0.84,"+")));
        org.junit.Assert.assertEquals( (double) 1.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.08,"*")));
        org.junit.Assert.assertEquals( (double) 0.0248, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.57,0.68,0.61,"+","-",0.95,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.09,0.75,0.32,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.62,0.79,"+",0.97,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.49,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.9,0.89,0.76,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.99,0.17,"/",0.11,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.06,"/")));
        org.junit.Assert.assertEquals( (double) 4.333333333333334, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.2,0.05,0.07,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.5,"+",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.09,0.55,"-",0.16,0.48,"-")));
        org.junit.Assert.assertEquals( (double) -0.31999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.48,"-",0.77,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.38,0.26,"/",0.41,"+",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.66,"+")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.89,0.33,0.03,"+","*",0.8,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.42,0.2,0.69,"-",0.55,"/")));
        org.junit.Assert.assertEquals( (double) -0.8909090909090908, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.0,0.74,"/",0.08,"/")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.88,0.08,"-","-",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.17,0.38,"-",0.14,0.26,0.93,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.08,0.74,0.64,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.04,"-")));
        org.junit.Assert.assertEquals( (double) -0.010000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.61,0.79,0.99,0.91,"+","*")));
        org.junit.Assert.assertEquals( (double) 1.501, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.37,0.33,"*","*",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.56,0.08,0.57,0.53,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.7,0.74,0.85,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.804054054054054, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.02,0.52,0.05,0.25,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.04,0.03,0.5,0.35,0.05,"+")));
        org.junit.Assert.assertEquals( (double) 0.39999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.52,0.96,"-",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.64,"-",0.25,0.52,"*",0.27,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.84,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.39,"-",0.18,0.42,0.33,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.92,0.8,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,1.0,0.41,0.28,"-","/",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.47,0.01,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.6,0.24,"/",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.38,0.34,"-",0.97,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.06,"-",0.33,0.65,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.26,0.06,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.08,0.72,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.29,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.82,"+",0.43,0.71,0.29,0.39,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.58,0.58,"/",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.39,0.69,"-",0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.58,"-",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.88,0.96,"-",0.93,"+",0.47,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.95,0.35,0.23,0.67,"-","-",0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.0,0.59,0.07,0.92,0.36,"-","/")));
        org.junit.Assert.assertEquals( (double) 0.125, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.38,0.99,0.94,0.23,0.91,0.64,"*")));
        org.junit.Assert.assertEquals( (double) 0.5824, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.27,"*",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.19,"-",0.09,0.44,0.47,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.08425531914893616, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.94,"*",0.33,0.78,0.84,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.79,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.11,"/",0.17,0.91,0.54,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.95,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.07,0.24,"-","*",0.77,"-",0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.15,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.78,0.67,"+")));
        org.junit.Assert.assertEquals( (double) 1.4500000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.53,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.11,"+",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.17,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.02,0.98,0.4,0.32,0.39,"-")));
        org.junit.Assert.assertEquals( (double) -0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.2,0.74,0.29,0.13,0.71,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.43,0.63,"-",0.93,0.86,0.19,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.25,0.41,0.17,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.51,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.51,"+",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.2,0.1,"*",0.59,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.85,"/",0.94,"+")));
        org.junit.Assert.assertEquals( (double) 1.2223529411764704, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.11,"/",0.66,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.07,0.06,"*")));
        org.junit.Assert.assertEquals( (double) 0.004200000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.75,0.73,0.14,0.53,"-",0.19,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.11,0.96,0.43,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.59,0.19,0.79,"-",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.28,0.98,0.74,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.57,0.92,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.6,0.09,0.47,"*",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.43,0.23,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.52,"*")));
        org.junit.Assert.assertEquals( (double) 0.5044, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.79,0.23,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.17,0.18,"/")));
        org.junit.Assert.assertEquals( (double) 0.9444444444444445, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.08,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.9,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.72,0.41,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.12,0.37,0.11,"-","/",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.78,0.78,"*","+")));
        org.junit.Assert.assertEquals( (double) 1.0084, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.68,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.32,"*")));
        org.junit.Assert.assertEquals( (double) 0.2368, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.27,0.13,0.57,"+","/",0.52,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.04,0.07,0.69,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.9,0.2,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.17,0.03,0.31,0.09,"/")));
        org.junit.Assert.assertEquals( (double) 3.4444444444444446, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.38,"+")));
        org.junit.Assert.assertEquals( (double) 1.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.61,0.35,"-","*",0.78,"*")));
        org.junit.Assert.assertEquals( (double) 0.180492, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.71,"-",0.85,"*",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.25,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.75,0.6,"+",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.98,0.5,"/")));
        org.junit.Assert.assertEquals( (double) 1.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.69,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.85,0.75,0.21,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.28,"*")));
        org.junit.Assert.assertEquals( (double) 0.24640000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.28,"-",0.96,0.07,"-")));
        org.junit.Assert.assertEquals( (double) 0.8899999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.82,0.52,0.47,0.86,"/",0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.79,0.17,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.69,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.42,0.33,0.57,"*","/",0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.85,0.48,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.92,0.64,"+")));
        org.junit.Assert.assertEquals( (double) 1.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.68,0.18,0.62,0.64,"/",0.74,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.91,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.59,"+")));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.35,"-",0.09,"/",0.66,"*")));
        org.junit.Assert.assertEquals( (double) 3.3733333333333344, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.6,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.05,"+",0.63,"+",0.09,"-")));
        org.junit.Assert.assertEquals( (double) 1.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.78,0.79,"*",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.2,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.71,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.54,"-",0.11,"+",0.35,"*",0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.67,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.2,0.3,0.73,"/",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.48,0.49,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.769591836734694, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.06,"*",0.29,0.9,0.82,0.67,"-")));
        org.junit.Assert.assertEquals( (double) 0.1499999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.99,"*",0.18,0.69,"+")));
        org.junit.Assert.assertEquals( (double) 0.8699999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.76,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.37,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.86,0.1,"/",0.94,0.47,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.73,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.5,0.5,0.38,0.71,0.29,"+")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.1,0.24,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.53,0.82,0.07,0.06,0.09,"+")));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.16,0.4,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.28,"*",0.45,0.58,"*",0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.51,0.71,0.97,"/",0.53,"-","*")));
        org.junit.Assert.assertEquals( (double) 0.10299896907216491, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.24,0.99,0.38,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.47,0.89,0.54,0.58,0.99,0.9,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.76,"+",0.57,0.37,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.79,0.76,"*",1.0,0.41,"-")));
        org.junit.Assert.assertEquals( (double) 0.5900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.05,"/",0.18,0.88,"/",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.5,"-",0.27,"/")));
        org.junit.Assert.assertEquals( (double) 0.18518518518518534, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.63,0.25,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.3,0.5,"-",0.3,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.41,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.17,0.98,0.76,"*",0.55,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.17,"/",0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.55,"-",0.61,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.7,"-",0.52,0.19,"/","+",0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.97,"+",0.77,0.25,"*",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.22,0.43,0.12,0.6,"/",0.89,"*")));
        org.junit.Assert.assertEquals( (double) 0.17800000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.23,0.78,0.64,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.05,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.06,0.05,0.67,0.95,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.19,0.87,0.01,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.52,"/",0.8,"*",0.81,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,1.0,"+")));
        org.junit.Assert.assertEquals( (double) 1.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.99,0.97,"/")));
        org.junit.Assert.assertEquals( (double) 1.0206185567010309, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.1,0.97,0.47,"+",0.2,"+",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.32,0.88,0.55,"*","+",1.0,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.82,0.53,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.42,"-",0.35,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.1,"+",0.8,0.22,0.68,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.3680000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.76,0.27,0.0,0.2,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.96,0.73,0.21,0.23,0.69,"-")));
        org.junit.Assert.assertEquals( (double) -0.45999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.99,0.26,"+")));
        org.junit.Assert.assertEquals( (double) 1.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.82,0.39,0.44,0.56,0.44,0.35,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.58,0.94,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.18,0.75,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.08,"-",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.66,"-",0.49,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.8,"/",0.44,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.42,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.75,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.7,0.58,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.9,"/",0.8,"-",0.74,"*")));
        org.junit.Assert.assertEquals( (double) -0.4851111111111111, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.04,0.67,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.89,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.7,"*",0.03,"+")));
        org.junit.Assert.assertEquals( (double) 0.30999999999999994, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.35,0.42,"/",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.68,0.68,0.1,"+",0.08,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.22,0.5,0.41,0.02,"/",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.32,0.27,0.6,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.81,"*",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.29,0.26,"+",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.38,"/",0.7,0.69,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.15,"*",0.67,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.16,0.13,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.57,0.53,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.06,0.15,0.84,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.2,0.24,0.31,0.76,"-","+")));
        org.junit.Assert.assertEquals( (double) -0.21000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.42,"+",0.61,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.13,0.22,"/")));
        org.junit.Assert.assertEquals( (double) 0.5909090909090909, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.16,"*",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.47,"+",0.36,"/",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.31,0.04,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.35,0.35,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.38,0.95,0.93,"/",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.41,0.98,0.46,0.97,0.72,"+","-")));
        org.junit.Assert.assertEquals( (double) -1.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.19,"/",0.39,0.19,"*","/")));
        org.junit.Assert.assertEquals( (double) 26.28027558775481, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.91,0.22,0.16,"-",0.2,"-")));
        org.junit.Assert.assertEquals( (double) -0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.42,"*",0.59,0.51,"-",0.35,"*")));
        org.junit.Assert.assertEquals( (double) 0.027999999999999983, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.6,"-",0.05,0.62,0.91,0.41,"+")));
        org.junit.Assert.assertEquals( (double) 1.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.7,0.9,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.7477777777777777, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.21,0.67,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.12,"+",0.83,0.37,0.24,0.11,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.77,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.52,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.82,0.11,"/","/",0.0,"*")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.09,0.49,"+")));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.9,0.01,"*")));
        org.junit.Assert.assertEquals( (double) 0.009000000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.89,"+",0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.79,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.43,0.85,"/",0.76,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.49,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.29,0.04,0.03,"/","+",0.28,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.32,"+",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.63,"+",0.03,0.47,0.8,"+","-")));
        org.junit.Assert.assertEquals( (double) -1.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.58,"*",0.91,0.2,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.34,0.73,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.93,0.46,"*",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.63,0.25,"-",0.21,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.5,"*")));
        org.junit.Assert.assertEquals( (double) 0.175, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.25,"*",0.93,0.24,"-")));
        org.junit.Assert.assertEquals( (double) 0.6900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.81,0.45,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.57,0.62,0.39,0.9,"/",0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.25,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.28,0.85,0.66,0.85,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.68,"-",0.25,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.63,0.17,"+")));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.11,0.18,"/")));
        org.junit.Assert.assertEquals( (double) 0.6111111111111112, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.0,"-",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.79,0.4,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.26,0.92,0.74,0.79,0.18,"*")));
        org.junit.Assert.assertEquals( (double) 0.1422, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.24,0.36,0.52,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.29,0.56,"+",0.92,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.58,0.5,0.83,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.99,0.2,0.86,0.26,0.43,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.89,"/",0.95,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.8,0.51,0.91,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.83,"-",0.16,0.46,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.99,0.05,"/",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.88,"/")));
        org.junit.Assert.assertEquals( (double) 0.5227272727272727, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.93,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.53,0.89,"/")));
        org.junit.Assert.assertEquals( (double) 0.5955056179775281, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.13,0.74,0.76,"/",0.68,"*","-")));
        org.junit.Assert.assertEquals( (double) -0.5321052631578947, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.16,"*",0.51,0.69,"+")));
        org.junit.Assert.assertEquals( (double) 1.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.41,0.87,"+",0.81,0.33,0.45,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.31,0.07,"/")));
        org.junit.Assert.assertEquals( (double) 4.428571428571428, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.62,"-",0.07,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.76,0.62,"*",0.16,"*",0.82,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.66,0.82,0.98,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.73,0.26,0.77,"-")));
        org.junit.Assert.assertEquals( (double) -0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.59,0.92,"-","+",0.61,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.89,0.28,"/",0.22,0.04,"+","/")));
        org.junit.Assert.assertEquals( (double) 12.225274725274724, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.15,0.19,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.63,0.7,0.05,0.34,0.61,0.77,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.11,0.78,0.91,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.26,"+",0.17,0.84,0.55,0.09,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.38,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.66,"-")));
        org.junit.Assert.assertEquals( (double) 0.029999999999999916, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.27,0.11,"+")));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.02,0.77,0.99,"-")));
        org.junit.Assert.assertEquals( (double) -0.21999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.02,0.2,0.58,0.97,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.44,0.62,"/",0.25,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.48,0.39,0.26,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.97,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.99,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.99,"*")));
        org.junit.Assert.assertEquals( (double) 0.1584, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.22,"-",0.39,0.74,0.32,"/","-")));
        org.junit.Assert.assertEquals( (double) -1.9224999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.22,"+",0.1,0.03,"*")));
        org.junit.Assert.assertEquals( (double) 0.003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.37,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.08,"/",0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.87,"-",0.76,0.32,"/")));
        org.junit.Assert.assertEquals( (double) 2.375, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.75,0.9,"-","*",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.7,0.88,0.95,"-")));
        org.junit.Assert.assertEquals( (double) -0.06999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.01,0.69,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.54,"*",0.23,0.11,"+",0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.02,0.36,0.28,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.0,0.32,"*",0.89,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.25842696629213485, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.55,"+")));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.6,"+",0.51,"/")));
        org.junit.Assert.assertEquals( (double) 2.5686274509803924, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.05,0.6,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.94,0.76,"-",0.17,0.87,"+")));
        org.junit.Assert.assertEquals( (double) 1.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.86,0.15,0.87,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.79,0.66,0.82,0.12,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.92,0.92,0.7,0.52,0.33,0.1,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.94,0.21,0.66,0.42,"/",0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.47,0.78,"/","-",0.17,"+")));
        org.junit.Assert.assertEquals( (double) -0.07256410256410253, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.53,0.8,0.11,0.61,"*")));
        org.junit.Assert.assertEquals( (double) 0.06709999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.77,0.17,0.21,"+",0.33,"/",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.92,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.08,"-",0.07,"-")));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.67,0.04,"+")));
        org.junit.Assert.assertEquals( (double) 0.7100000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.77,0.22,"*",0.6,0.15,0.06,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.72,0.82,"/",0.48,0.27,0.14,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.37,0.75,0.96,0.63,0.13,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.32,0.97,0.78,0.51,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.31,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.27,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.85,0.87,"*","+",0.56,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.66,"/",0.16,0.92,0.13,0.88,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.69,0.19,0.61,0.55,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.97,0.08,"+",0.97,"*","*",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.48,"*")));
        org.junit.Assert.assertEquals( (double) 0.2208, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.73,0.2,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.8,0.56,0.03,0.48,0.54,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.12,"/",0.86,0.87,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.65,0.89,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.21,0.99,0.48,0.24,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.78,"*",0.49,0.87,0.89,"-")));
        org.junit.Assert.assertEquals( (double) -0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.19,0.29,"/")));
        org.junit.Assert.assertEquals( (double) 0.6551724137931035, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.78,"-",0.36,0.47,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.25,0.65,"*","*",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.17,"-",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.93,"-",0.57,0.81,"+",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.11,"-",0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.31,0.3,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.79,0.89,"-",0.1,0.44,"+",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.35,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.0,0.17,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.42999999999999994, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.07,0.07,0.84,"/",0.0,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.04,"*",0.17,0.1,0.51,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.01,0.14,0.86,"*",0.95,0.79,"/")));
        org.junit.Assert.assertEquals( (double) 1.2025316455696202, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.55,0.81,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.16,0.64,"-")));
        org.junit.Assert.assertEquals( (double) -0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.31,0.74,"+",0.81,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.24,0.61,0.19,0.32,"-",0.26,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.26,"/")));
        org.junit.Assert.assertEquals( (double) 2.5384615384615383, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.74,0.78,"-",0.16,0.92,0.97,"/")));
        org.junit.Assert.assertEquals( (double) 0.9484536082474228, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.06,0.65,0.15,0.06,"-","+",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.59,"*",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.32,"/",0.99,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.49,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.34,0.58,"*",0.78,0.15,0.53,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.16,"/")));
        org.junit.Assert.assertEquals( (double) 2.875, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.31,0.7,"*","-",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.4,"-",0.4,"+",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.08,"+")));
        org.junit.Assert.assertEquals( (double) 0.22000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.28,0.02,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.17,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.82,"+",0.58,0.17,0.38,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.81,0.15,0.05,"/")));
        org.junit.Assert.assertEquals( (double) 2.9999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.93,0.74,0.11,"*")));
        org.junit.Assert.assertEquals( (double) 0.0814, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.03,0.31,0.08,0.93,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.99,"*",0.08,"*",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.13,"+",0.77,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.87,0.58,"-",0.5,0.1,"/",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.15,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.14,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.4,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.07,0.23,0.1,"/")));
        org.junit.Assert.assertEquals( (double) 2.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.32,0.95,0.36,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.96,"-",0.86,0.87,"/",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.86,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.9,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,1.0,"-",0.37,0.82,"+")));
        org.junit.Assert.assertEquals( (double) 1.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.14,0.97,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.69,0.55,0.19,0.66,"*",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.67,0.62,0.82,0.52,"*")));
        org.junit.Assert.assertEquals( (double) 0.4264, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.05,0.99,0.79,0.52,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.86,"+",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.4,0.8,0.7,0.82,"*",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.4,0.03,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.19,"-",0.18,0.53,"+",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.49,0.54,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.66,"+")));
        org.junit.Assert.assertEquals( (double) 1.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.43,0.07,"/")));
        org.junit.Assert.assertEquals( (double) 6.142857142857142, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.33,0.81,"-")));
        org.junit.Assert.assertEquals( (double) -0.48000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.96,"*",0.62,0.34,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.21,0.99,"+",0.59,0.88,0.8,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.01,0.28,"/",0.26,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.82,0.54,0.68,0.54,"*",0.8,"*")));
        org.junit.Assert.assertEquals( (double) 0.29376, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.89,"-",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.96,0.2,"+","-",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.45,"/")));
        org.junit.Assert.assertEquals( (double) 1.0444444444444443, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.72,"/",0.85,0.26,0.27,0.58,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.49,"/",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.34,0.25,"/",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.98,0.37,0.0,0.43,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.76,0.63,"+",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.57,0.69,"/")));
        org.junit.Assert.assertEquals( (double) 0.8260869565217391, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.84,"-",0.26,"/")));
        org.junit.Assert.assertEquals( (double) 0.11538461538461549, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.42,1.0,0.03,0.27,"+","-",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.98,0.96,0.49,"*",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.68,0.74,0.13,0.24,"*","-","/")));
        org.junit.Assert.assertEquals( (double) 0.9593679458239278, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.57,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.56,"/",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.49,0.2,0.08,0.92,0.83,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.31,0.21,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.01,0.93,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.98,"-")));
        org.junit.Assert.assertEquals( (double) -0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.04,0.83,0.28,0.96,0.51,0.2,"-")));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.04,0.45,0.09,0.04,0.64,"*")));
        org.junit.Assert.assertEquals( (double) 0.0256, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.09,"/",0.83,"+")));
        org.junit.Assert.assertEquals( (double) 5.941111111111112, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.71,0.29,0.49,"*",0.65,0.84,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.08,"*",0.49,0.57,"+",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.74,0.45,0.55,"+","*","*")));
        org.junit.Assert.assertEquals( (double) 0.111, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.81,0.01,0.44,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.28,"/",0.99,"/")));
        org.junit.Assert.assertEquals( (double) 2.092352092352092, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.72,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.3,"/",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.98,0.21,"-")));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.28,0.29,0.91,0.04,"*",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.21,"*",0.42,0.83,0.21,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.64,"*",0.78,0.89,0.2,"-",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.77,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.08,"-",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.65,0.49,"+",0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.53,0.28,0.81,"+","*",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.11,"*")));
        org.junit.Assert.assertEquals( (double) 0.06269999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.89,"*",0.26,0.09,"-")));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.66,"/")));
        org.junit.Assert.assertEquals( (double) 0.6212121212121211, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.37,0.95,0.29,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.36,0.35,"+",0.44,"+",0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.39,0.79,0.17,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.27,"+",0.36,0.76,0.54,"-")));
        org.junit.Assert.assertEquals( (double) 0.21999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.55,"+")));
        org.junit.Assert.assertEquals( (double) 1.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.3,0.55,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.89,"+",0.96,"-")));
        org.junit.Assert.assertEquals( (double) 0.18999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.21,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.48,"-")));
        org.junit.Assert.assertEquals( (double) 0.30000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.19,0.18,0.6,"-","+")));
        org.junit.Assert.assertEquals( (double) -0.22999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.7,0.78,0.5,0.39,0.61,0.23,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.42,"/",0.05,0.54,"-",0.0,"*")));
        org.junit.Assert.assertEquals( (double) -0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.41,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.25,"*")));
        org.junit.Assert.assertEquals( (double) 0.1875, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.65,0.06,"*",0.31,0.36,"/",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.85,0.3,0.64,0.08,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.76,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.72,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.05,"+")));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.71,"/")));
        org.junit.Assert.assertEquals( (double) 0.915492957746479, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.28,"*",0.66,"+",0.1,0.77,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.16,"*",0.92,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.84,"-")));
        org.junit.Assert.assertEquals( (double) -0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.35,0.56,0.82,0.01,0.04,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.77,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.53,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.99,0.26,0.74,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.75,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.17,0.25,"/",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.39,"+",0.58,0.39,"*",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.08,"*",0.34,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.04,"+",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.09,"-",0.12,"-",0.32,"-",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.99,0.86,0.52,0.82,0.81,"/")));
        org.junit.Assert.assertEquals( (double) 1.0123456790123455, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.93,0.61,0.66,0.37,0.91,0.44,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.93,0.28,"-","/")));
        org.junit.Assert.assertEquals( (double) 0.7076923076923077, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.36,0.67,0.59,0.88,0.27,0.99,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.25,"+")));
        org.junit.Assert.assertEquals( (double) 1.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.58,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.15,"-")));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.57,0.07,"+")));
        org.junit.Assert.assertEquals( (double) 0.6399999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.92,0.58,"*",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.65,0.35,0.4,0.86,"*")));
        org.junit.Assert.assertEquals( (double) 0.34400000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.09,0.02,"-",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.62,0.98,"-",0.29,0.34,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.77,0.98,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.19,"-",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.89,0.96,"/","-")));
        org.junit.Assert.assertEquals( (double) -0.057083333333333375, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.28,0.72,0.61,"*",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.93,0.45,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.9,0.09,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.26,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.79,"-")));
        org.junit.Assert.assertEquals( (double) -0.35000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.69,"/",0.76,0.2,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.93,0.69,"*")));
        org.junit.Assert.assertEquals( (double) 0.6416999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.29,0.24,0.6,"/",0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.08,"*")));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.76,"-",0.55,0.64,"-")));
        org.junit.Assert.assertEquals( (double) -0.08999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.32,"*")));
        org.junit.Assert.assertEquals( (double) 0.064, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.3,"*",0.8,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.32,0.71,0.18,0.01,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.13,0.65,0.03,"/",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.13,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.81,"*",0.32,0.8,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.18,0.26,0.6,"-")));
        org.junit.Assert.assertEquals( (double) -0.33999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.6,0.11,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.37,"/",0.99,"+",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.23,"/",0.73,"/",0.96,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.88,"-",0.54,0.19,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.29,0.63,0.2,"-",0.87,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.36,"*",0.85,0.39,"-",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.14,0.66,0.62,0.92,0.79,"+")));
        org.junit.Assert.assertEquals( (double) 1.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.71,"-",0.26,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.83,0.26,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.71,"+",0.74,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.68,"-")));
        org.junit.Assert.assertEquals( (double) 0.07999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.28,0.11,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.36,0.69,"*")));
        org.junit.Assert.assertEquals( (double) 0.24839999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.09,"/",0.84,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.78,0.97,0.01,"*",0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.18,0.56,"*","*",0.99,0.79,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.6,0.08,0.99,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.96,"/",0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.52,0.93,0.05,"-",0.78,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.48,0.43,"-",0.91,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.36,0.03,"/",0.46,0.01,0.27,"/")));
        org.junit.Assert.assertEquals( (double) 0.037037037037037035, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.05,"-",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.97,0.79,"+",0.82,"-")));
        org.junit.Assert.assertEquals( (double) 0.9400000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.35,0.2,"+",0.82,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.10960000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.85,0.13,"*","-",0.84,"-",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.93,0.59,0.97,"*",0.43,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.16,0.91,0.59,"*")));
        org.junit.Assert.assertEquals( (double) 0.5369, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.24,0.27,0.57,0.09,0.02,0.95,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.11,0.04,"/")));
        org.junit.Assert.assertEquals( (double) 2.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.87,0.26,0.95,0.13,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.09,"/",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.25,0.55,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.99,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.16,"/",0.96,0.56,"-")));
        org.junit.Assert.assertEquals( (double) 0.3999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.64,0.26,0.03,"+")));
        org.junit.Assert.assertEquals( (double) 0.29000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.08,"+",0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.64,"/")));
        org.junit.Assert.assertEquals( (double) 1.453125, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.24,0.52,0.07,"-")));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.73,0.08,"/")));
        org.junit.Assert.assertEquals( (double) 9.125, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.8,0.84,0.9,0.25,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.77,0.46,0.42,"+")));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.53,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.49,"*")));
        org.junit.Assert.assertEquals( (double) 0.4851, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.2,0.91,"*",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.65,0.59,0.08,0.72,"*")));
        org.junit.Assert.assertEquals( (double) 0.0576, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.51,"/",0.6,"*")));
        org.junit.Assert.assertEquals( (double) 0.1411764705882353, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.93,0.29,"/","-",0.8,"-")));
        org.junit.Assert.assertEquals( (double) -3.706896551724139, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.73,0.52,0.33,"-",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.67,0.31,0.62,0.6,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.29,"-")));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.27,"+")));
        org.junit.Assert.assertEquals( (double) 1.2000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.18,"-",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.17,0.08,"+",0.69,"-")));
        org.junit.Assert.assertEquals( (double) -0.43999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.94,0.05,"-",0.29,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.45,"-")));
        org.junit.Assert.assertEquals( (double) 0.23000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.21,"+")));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.26,0.76,"/",0.98,"/",0.87,"/")));
        org.junit.Assert.assertEquals( (double) 0.40124942899119725, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.14,0.75,"+",0.53,"-","+",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.12,"-",0.43,"+")));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.95,0.51,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.46,0.43,0.52,"/","-",0.29,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.36,0.79,"-",0.52,0.96,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.16,"/",0.67,0.2,"-",0.05,"/")));
        org.junit.Assert.assertEquals( (double) 9.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.17,0.11,"-","*",0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.94,0.67,0.11,0.33,1.0,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.14,0.58,0.08,"*","-",0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.05,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.32,0.71,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.75,0.53,0.63,0.64,"*")));
        org.junit.Assert.assertEquals( (double) 0.4032, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.6,"/",0.74,"-",0.54,"*")));
        org.junit.Assert.assertEquals( (double) 0.19440000000000007, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.93,0.73,0.63,0.55,0.1,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.16,"-",0.64,"/",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.54,0.53,0.93,"-",0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.98,"/")));
        org.junit.Assert.assertEquals( (double) 0.9285714285714286, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.05,0.57,0.37,"+","*","+")));
        org.junit.Assert.assertEquals( (double) 0.777, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.39,0.13,"*",0.81,0.91,"*")));
        org.junit.Assert.assertEquals( (double) 0.7371000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.48,"+",0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.91,"*",0.81,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.68,0.13,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.43,0.6,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.06966, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.37,0.17,0.73,0.49,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.44,0.04,0.58,"+",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.88,0.16,0.42,0.5,"/",0.24,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.03,0.18,"-",0.37,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.06,0.27,"+","+",0.05,"/")));
        org.junit.Assert.assertEquals( (double) 20.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.06,"-",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.61,0.82,0.7,"/",0.57,"+",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.61,0.72,0.66,"/")));
        org.junit.Assert.assertEquals( (double) 1.0909090909090908, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.73,"+",0.47,0.02,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.061276595744680855, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.51,"*",0.77,"*",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.95,0.79,0.52,0.37,0.2,0.1,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.39,0.75,0.8,0.34,"*","/",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.49,0.65,0.02,0.31,"+","/","/")));
        org.junit.Assert.assertEquals( (double) 0.24876923076923077, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.46,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.46,0.64,0.7,"-",0.03,0.35,"-")));
        org.junit.Assert.assertEquals( (double) -0.31999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.03,"/",0.58,"-")));
        org.junit.Assert.assertEquals( (double) 25.08666666666667, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.87,"+",0.17,0.57,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.93,0.25,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.86,0.15,0.38,"+",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.69,"/",0.85,"/")));
        org.junit.Assert.assertEquals( (double) 0.6138107416879796, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.94,0.73,0.76,0.44,"*",0.24,"*")));
        org.junit.Assert.assertEquals( (double) 0.08025600000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.21,0.34,"+",0.7,0.47,"+")));
        org.junit.Assert.assertEquals( (double) 1.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.62,0.97,0.66,0.71,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.48,0.97,0.55,"/")));
        org.junit.Assert.assertEquals( (double) 1.7636363636363634, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.85,"*")));
        org.junit.Assert.assertEquals( (double) 0.034, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.39,"-")));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.93,0.84,0.42,0.81,0.27,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.73,0.73,0.25,"-","+")));
        org.junit.Assert.assertEquals( (double) 1.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.25,"-")));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.73,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.21,0.31,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.56,"-",0.79,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.43,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.49,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.59,0.44,0.62,"-",0.8,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.13,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.18,"*")));
        org.junit.Assert.assertEquals( (double) 0.1764, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.93,0.51,"/")));
        org.junit.Assert.assertEquals( (double) 1.8235294117647058, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.82,0.74,0.45,"/",0.41,0.22,"-")));
        org.junit.Assert.assertEquals( (double) 0.18999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.75,0.65,0.11,0.62,0.48,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.74,"/")));
        org.junit.Assert.assertEquals( (double) 0.9324324324324323, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.7,0.47,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.89,0.66,"+","-")));
        org.junit.Assert.assertEquals( (double) -1.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.91,"+",0.12,"-")));
        org.junit.Assert.assertEquals( (double) 1.0299999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.25,0.31,0.86,0.5,"-","/",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.39,0.82,0.35,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.98,"*",0.34,"*")));
        org.junit.Assert.assertEquals( (double) 0.04664800000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.83,0.68,0.87,0.93,"*",0.7,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.67,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.85,"-")));
        org.junit.Assert.assertEquals( (double) 0.10999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.49,0.3,0.9,0.58,0.91,0.79,"+")));
        org.junit.Assert.assertEquals( (double) 1.7000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.09,0.03,0.48,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.96,0.83,"/","+",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.23,0.27,0.44,"/",0.84,0.07,"+")));
        org.junit.Assert.assertEquals( (double) 0.9099999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.44,"/",0.44,0.5,"/",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.8,"+")));
        org.junit.Assert.assertEquals( (double) 1.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.61,0.24,"-","*")));
        org.junit.Assert.assertEquals( (double) 0.10360000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.5,0.58,0.85,0.68,"+")));
        org.junit.Assert.assertEquals( (double) 1.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.46,0.38,0.42,0.4,0.69,"+",0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.03,"+",0.74,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.29,"-",0.12,0.02,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.62,0.76,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.1,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.52,0.01,0.03,0.08,0.83,"/")));
        org.junit.Assert.assertEquals( (double) 0.0963855421686747, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.47,"-",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.87,0.75,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.34,"-")));
        org.junit.Assert.assertEquals( (double) -0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.35,"+",0.35,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.11,0.53,0.03,0.62,0.95,"-","+")));
        org.junit.Assert.assertEquals( (double) -0.29999999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.46,"/")));
        org.junit.Assert.assertEquals( (double) 1.434782608695652, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.83,0.36,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.71,0.55,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.28,0.87,"-","+",0.06,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.09,0.11,0.86,"+",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.99,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.12,0.89,"*",0.17,0.4,"-")));
        org.junit.Assert.assertEquals( (double) -0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.02,0.9,0.64,0.33,0.92,"*",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.51,0.77,0.63,"-")));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.73,0.4,0.14,"*",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.37,0.62,"+",0.58,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.91,"/",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.61,0.85,"*",0.87,0.92,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.93,0.87,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.59,0.4,"+",0.44,0.56,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.5,0.71,"*")));
        org.junit.Assert.assertEquals( (double) 0.355, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.77,0.18,"+",0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.69,0.58,0.12,0.56,0.13,"-")));
        org.junit.Assert.assertEquals( (double) 0.43000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.32,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.57,0.43,0.54,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.4,0.88,0.78,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.81,"+",0.21,"+",0.51,0.97,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.51,0.61,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.15,0.18,"/",0.41,"-")));
        org.junit.Assert.assertEquals( (double) 0.4233333333333334, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.31,0.87,0.51,0.93,0.76,0.07,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.28,0.23,0.33,0.33,0.0,0.45,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.49,0.39,0.15,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.54,0.28,"+",0.44,"-",0.8,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.61,0.86,0.95,0.46,"-","/",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.1,"/",0.47,"*")));
        org.junit.Assert.assertEquals( (double) 3.9949999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.93,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.84,0.22,"-",0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.88,0.11,"*",0.89,0.56,0.48,"/")));
        org.junit.Assert.assertEquals( (double) 1.1666666666666667, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.62,"-",0.6,0.82,0.23,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.01,0.53,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.38530000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.38,0.33,"*","/",0.86,0.33,"+")));
        org.junit.Assert.assertEquals( (double) 1.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.41,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.48,0.89,0.61,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.43,"/")));
        org.junit.Assert.assertEquals( (double) 0.20930232558139533, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.92,"+",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.69,0.37,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.54,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.89,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.26,0.18,"-",0.52,0.54,"-")));
        org.junit.Assert.assertEquals( (double) -0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.1,0.01,0.59,"*",0.39,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.79,"-",0.62,"-",0.45,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.7,"-",0.89,0.12,0.71,0.49,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.54,"-",0.24,0.35,0.94,"+",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.06,"-")));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.15,0.65,0.01,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.67,0.73,"+")));
        org.junit.Assert.assertEquals( (double) 1.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.81,0.38,"*",0.07,"-",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.28,"*",0.24,0.72,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.8,0.6,0.95,0.19,0.4,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.1,0.76,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.03289473684210526, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.07,0.63,"/",0.89,"-","+")));
        org.junit.Assert.assertEquals( (double) -0.15888888888888886, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.93,"+",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.46,0.51,"+",0.6,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.2,"-",0.05,0.43,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.89,0.42,"*",0.03,"+")));
        org.junit.Assert.assertEquals( (double) 0.40379999999999994, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.35,0.9,"+","-",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.14,"-")));
        org.junit.Assert.assertEquals( (double) -0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.95,"/",0.68,0.21,"-","*")));
        org.junit.Assert.assertEquals( (double) 0.25231578947368427, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.75,"/",0.36,0.1,0.55,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.74,0.08,"*",0.47,"+",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.8,0.24,0.25,0.12,"-",0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.37,"*",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.61,0.43,"/",1.0,"/",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.54,0.9,"+",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.52,0.69,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.58,0.92,0.56,"-","*",0.18,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.55,"*",0.43,"-",0.54,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.84,0.17,0.86,0.07,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.72,"-",0.47,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.61,"/",0.98,0.91,"-",0.84,"*")));
        org.junit.Assert.assertEquals( (double) 0.058799999999999956, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.87,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.29,0.85,0.16,"-","+",0.34,"/")));
        org.junit.Assert.assertEquals( (double) 2.88235294117647, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.16,0.21,"/","/",0.71,"/",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.36,0.4,"-",0.43,0.73,"-")));
        org.junit.Assert.assertEquals( (double) -0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.54,"*",0.48,0.61,0.88,0.56,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.86,0.86,"/",0.34,0.57,"-",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.93,"/",0.02,"-")));
        org.junit.Assert.assertEquals( (double) 0.7434408602150536, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.76,"/",0.63,0.38,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.58,0.34,0.95,0.24,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.54,"/",0.52,0.15,"/",0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.52,0.01,0.19,"+",0.55,"/")));
        org.junit.Assert.assertEquals( (double) 0.36363636363636365, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.82,0.17,0.63,"-")));
        org.junit.Assert.assertEquals( (double) -0.45999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.72,"+",0.42,"*",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.12,"*",0.77,"*")));
        org.junit.Assert.assertEquals( (double) 0.024024, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.74,0.26,"*",0.84,"*")));
        org.junit.Assert.assertEquals( (double) 0.161616, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.32,"*",0.98,0.86,"*",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.81,0.65,"*","-",0.72,0.19,"+")));
        org.junit.Assert.assertEquals( (double) 0.9099999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.9,"+",0.72,0.97,1.0,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.7,0.77,"+")));
        org.junit.Assert.assertEquals( (double) 1.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.02,0.19,"*",0.7,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.61,0.4,0.96,"/")));
        org.junit.Assert.assertEquals( (double) 0.4166666666666667, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.13,"/")));
        org.junit.Assert.assertEquals( (double) 4.846153846153846, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.85,"+",0.0,"*")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.27,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.22,"/",0.91,0.13,0.65,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.4,0.42,0.66,"+",0.03,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.54,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.7,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.3,0.94,"/",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.22,0.57,"/")));
        org.junit.Assert.assertEquals( (double) 0.3859649122807018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.57,0.8,0.34,0.16,"/","+",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.91,0.74,"+","+",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.77,0.32,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.2077922077922078, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.97,"+",0.97,"-")));
        org.junit.Assert.assertEquals( (double) 0.9099999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.39,0.02,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.02,"*",0.05,0.05,"*")));
        org.junit.Assert.assertEquals( (double) 0.0025000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.99,0.88,0.77,0.39,0.39,"-")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.87,"/",0.04,0.74,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.3,0.17,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.92,"-",0.35,"+")));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.03,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.79,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.82,"-")));
        org.junit.Assert.assertEquals( (double) -0.6699999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.17,0.91,"/","+",0.42,0.95,"+")));
        org.junit.Assert.assertEquals( (double) 1.3699999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.9,0.55,"*")));
        org.junit.Assert.assertEquals( (double) 0.49500000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.84,0.87,0.66,0.98,0.84,"*")));
        org.junit.Assert.assertEquals( (double) 0.8231999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.92,0.4,"+",0.52,0.1,"-")));
        org.junit.Assert.assertEquals( (double) 0.42000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.85,0.56,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.89,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.67,"*",0.51,"*")));
        org.junit.Assert.assertEquals( (double) 0.198186, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.2,0.86,0.43,0.37,0.28,0.97,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.01,0.79,"+","/",0.42,"*",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.23,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.19,0.33,"+")));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.48,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.77,"-",0.39,"/")));
        org.junit.Assert.assertEquals( (double) -1.717948717948718, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.39,"*",0.75,0.4,"+",0.42,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.23,0.99,0.7,0.42,0.99,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.1299999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.54,0.1,0.96,0.03,0.64,"-",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.42,0.35,0.92,0.8,"*","+","-")));
        org.junit.Assert.assertEquals( (double) -0.6660000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.73,0.35,"+","+",0.57,0.17,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.93,0.5,0.51,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.45,0.96,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.3,0.75,0.16,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.04,0.98,0.38,0.16,"+","/",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.31,"-",0.8,0.33,"/","+",0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.86,"*",0.32,0.97,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.92,"-",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.85,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.01,"/",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.15,0.75,"/",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.76,"*",0.61,"/",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.18,"-")));
        org.junit.Assert.assertEquals( (double) 0.6000000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.51,0.75,0.84,0.16,0.08,0.34,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.45,0.12,0.43,0.99,0.88,"/",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.64,"+",0.36,0.71,"+",0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.05,"/",0.15,"*",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.23,0.41,"/",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.94,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1000() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.73,0.49,"/","-",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1001() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.67,0.65,0.98,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1002() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1003() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.6,"-",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1004() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.44,0.79,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1005() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.22,"*",0.66,0.25,"/")));
        org.junit.Assert.assertEquals( (double) 2.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1006() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.41,"*",0.28,0.5,0.26,"-",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1007() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1008() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.78,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1009() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.23,"/",0.78,"+")));
        org.junit.Assert.assertEquals( (double) 4.86695652173913, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1010() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.65,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1011() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.06,0.31,0.32,0.41,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1012() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1013() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.94,0.81,"/","*",0.21,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1014() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.44,0.66,0.27,"/",0.81,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1015() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.69,0.06,0.61,0.87,0.91,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1016() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.34,0.57,"+",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1017() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.11,0.91,"/","-",0.66,0.21,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1018() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.77,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1019() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.21,0.2,"/",0.74,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1020() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.92,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1021() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1022() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.83,"*",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1023() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.58,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1024() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.34,"-",0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1025() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1026() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.29,0.83,0.43,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.6469, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1027() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.53,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1028() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.17,"*",0.8,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1029() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.05,"+",0.38,0.32,0.31,"+")));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1030() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1031() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.95,0.15,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1032() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.95,0.5,"+",0.21,"*",0.78,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1033() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.22,"/",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1034() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.72,"/")));
        org.junit.Assert.assertEquals( (double) 0.9305555555555557, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1035() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.39,0.98,0.91,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1036() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1037() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.27,0.82,0.54,"*",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1038() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.2,0.02,0.84,"-",0.3,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1039() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.75,0.97,0.88,0.96,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1040() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.07,0.84,0.78,"*",0.3,0.17,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1041() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.59,0.5,0.22,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1042() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.55,"+")));
        org.junit.Assert.assertEquals( (double) 1.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1043() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1044() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.94,0.8,0.62,0.72,"/",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1045() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1046() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.9,0.31,"-")));
        org.junit.Assert.assertEquals( (double) 0.5900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1047() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.57,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1048() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.31,0.93,0.72,0.56,0.2,0.61,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1049() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.29,"-",0.06,"/",0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1050() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1051() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.64,"/")));
        org.junit.Assert.assertEquals( (double) 0.3125, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1052() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1053() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.28,0.95,0.67,"-")));
        org.junit.Assert.assertEquals( (double) 0.2799999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1054() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.57,0.53,0.54,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.8562, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1055() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.23,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1056() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.57,0.14,"*",0.44,0.68,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1057() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1058() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.72,0.75,0.74,"-","-",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1059() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.02,0.89,0.72,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1060() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.49,"+",0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1061() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.05,0.28,0.09,0.3,"+",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1062() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1063() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.15,"*",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1064() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.5,0.08,0.19,"*")));
        org.junit.Assert.assertEquals( (double) 0.0152, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1065() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.91,0.07,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1066() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.29,0.72,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1067() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.19,0.2,0.18,0.33,0.29,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1068() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1069() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.79,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1070() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.12,0.85,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.43800000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1071() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.98,"+",0.89,0.86,"+","+",0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1072() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1073() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.57,0.44,0.8,0.95,0.14,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1074() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.11,"/",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1075() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.35,0.03,"+",0.69,0.36,"-",0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1076() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.45,"/",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1077() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.85,0.84,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1078() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.02,0.02,0.88,"+",0.27,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1079() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.85,"/")));
        org.junit.Assert.assertEquals( (double) 0.3058823529411765, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1080() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.49,"-")));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1081() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,1.0,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1082() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.97,0.06,"+",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1083() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.85,0.63,0.7,0.74,0.83,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1084() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.73,0.31,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1085() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.75,0.08,"*",0.52,"+",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1086() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.36,0.93,"*","/")));
        org.junit.Assert.assertEquals( (double) 2.6583034647550776, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1087() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1088() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.46,0.31,"-",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1089() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.73,"+")));
        org.junit.Assert.assertEquals( (double) 1.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1090() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.76,"*")));
        org.junit.Assert.assertEquals( (double) 0.07600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1091() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.69,0.88,"*",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1092() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1093() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.05,0.41,"*")));
        org.junit.Assert.assertEquals( (double) 0.0205, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1094() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.47,0.16,"/")));
        org.junit.Assert.assertEquals( (double) 2.9374999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1095() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.32,0.96,"-","+")));
        org.junit.Assert.assertEquals( (double) -0.4399999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1096() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.54,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1097() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1098() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.73,0.35,0.14,0.93,"/",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1099() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.4,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1100() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.18,0.38,"+")));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1101() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.7,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1102() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.89,"*",0.95,"/",0.16,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1103() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.86,"/",0.53,"+",0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1104() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.48,0.07,0.07,0.39,0.59,"-")));
        org.junit.Assert.assertEquals( (double) -0.19999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1105() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.93,"-",0.68,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1106() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1107() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.25,0.58,"/")));
        org.junit.Assert.assertEquals( (double) 0.4310344827586207, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1108() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.05,0.91,"*",0.36,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1109() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.75,"+")));
        org.junit.Assert.assertEquals( (double) 1.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1110() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1111() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1112() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.24,"-",0.19,0.73,0.77,0.62,"*")));
        org.junit.Assert.assertEquals( (double) 0.4774, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1113() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.36,0.64,"-",0.41,0.25,"/",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1114() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1115() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.89,0.38,"+",0.73,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1116() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.1,0.27,"/")));
        org.junit.Assert.assertEquals( (double) 0.37037037037037035, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1117() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.01,1.0,0.69,0.6,"*",0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1118() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.64,0.93,0.38,0.35,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1119() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.81,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1120() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1121() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.74,0.32,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1122() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.41,"/",0.34,"+",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1123() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.81,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1124() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.62,0.18,"-",0.44,"*")));
        org.junit.Assert.assertEquals( (double) 0.1936, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1125() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.12,"/",0.55,"+",0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1126() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1127() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.89,0.83,"+")));
        org.junit.Assert.assertEquals( (double) 1.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1128() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.97,0.25,0.26,"*")));
        org.junit.Assert.assertEquals( (double) 0.065, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1129() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.03,0.68,0.93,"+","-","*")));
        org.junit.Assert.assertEquals( (double) -0.5688, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1130() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.14,"+",0.3,0.63,"-",0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1131() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.9,"+")));
        org.junit.Assert.assertEquals( (double) 1.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1132() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.99,0.52,"+")));
        org.junit.Assert.assertEquals( (double) 1.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1133() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1134() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.31,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1135() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.71,"+",0.09,0.44,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.5088, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1136() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.15,0.29,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1137() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1138() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.19,"-")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1139() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.84,0.51,"+",0.02,"+","-")));
        org.junit.Assert.assertEquals( (double) -1.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1140() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1141() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.09,"/",0.82,0.13,0.94,0.78,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1142() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.27,"+")));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1143() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.29,"-",0.96,"-")));
        org.junit.Assert.assertEquals( (double) -0.6099999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1144() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1145() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.19,0.24,0.37,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1146() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1147() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1148() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.6,0.93,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1149() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.4,"+",0.98,"+",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1150() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1151() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.9,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1152() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.2,0.3,0.38,0.32,0.03,0.4,"/")));
        org.junit.Assert.assertEquals( (double) 0.075, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1153() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.06,"+",0.53,"+")));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1154() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1155() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.74,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1156() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.02,"+",0.04,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1157() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.7,0.7,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1158() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,1.0,0.37,"-",0.25,"+",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1159() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1160() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.39,0.87,0.57,"/","+",0.25,"/")));
        org.junit.Assert.assertEquals( (double) 7.665263157894737, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1161() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1162() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.5,"-",0.93,0.94,0.23,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1163() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.29,"*",0.91,0.63,"+",0.62,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1164() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.28,0.16,0.22,0.27,"*")));
        org.junit.Assert.assertEquals( (double) 0.0594, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1165() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.49,"-",0.34,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1166() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1167() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.17,"*",0.37,0.25,"/","/",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1168() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.6,0.87,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1169() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.1,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1170() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1171() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1172() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.67,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1173() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1174() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.62,"-")));
        org.junit.Assert.assertEquals( (double) -0.09999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1175() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.94,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1176() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.55,0.08,0.97,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1177() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.27,0.16,"-",0.23,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1178() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.25,0.97,0.38,0.05,"/",0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1179() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.81,0.45,0.68,0.04,"-",0.75,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1180() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.38,0.74,0.12,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1181() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.96,0.54,0.34,"+",0.54,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1182() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.02,"/")));
        org.junit.Assert.assertEquals( (double) 44.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1183() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1184() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.53,0.73,0.94,"+",0.93,0.97,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1185() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.88,"*",0.53,0.32,0.87,0.38,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1186() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.77,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1187() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.39,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1188() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1189() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.87,"*",0.75,0.98,"/",0.4,"+")));
        org.junit.Assert.assertEquals( (double) 1.1653061224489796, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1190() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.91,0.92,0.9,"-",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1191() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1192() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.31,0.17,0.2,0.86,"+")));
        org.junit.Assert.assertEquals( (double) 1.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1193() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.76,"+")));
        org.junit.Assert.assertEquals( (double) 1.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1194() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.75,"+",0.5,0.24,"*")));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1195() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.08,"+",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1196() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.91,0.34,"*",0.86,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1197() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.38,0.42,"/")));
        org.junit.Assert.assertEquals( (double) 0.9047619047619048, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1198() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1199() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.94,"-",0.01,"-")));
        org.junit.Assert.assertEquals( (double) -0.43999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1200() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.24,0.78,"/","+")));
        org.junit.Assert.assertEquals( (double) 0.9876923076923076, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1201() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1202() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1203() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.84,"-",0.11,0.18,"+")));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1204() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.43,0.82,0.27,"*",0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1205() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.9,0.1,0.18,"/",0.71,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1206() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.55,"-",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1207() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.2,0.18,0.79,"/",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1208() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.79,0.23,0.01,"/","-",0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1209() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.3,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1210() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1211() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.39,"*",0.69,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1212() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.5,"-")));
        org.junit.Assert.assertEquals( (double) -0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1213() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.29,1.0,0.76,0.4,0.58,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1214() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.19,"-",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1215() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.67,0.01,0.08,0.9,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1216() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1217() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.07,0.39,"*")));
        org.junit.Assert.assertEquals( (double) 0.027300000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1218() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.44,0.82,0.76,"*","+","/")));
        org.junit.Assert.assertEquals( (double) 0.5925507900677202, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1219() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1220() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.0,"*")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1221() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.71,0.96,0.65,"/",0.27,0.27,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1222() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.11,0.66,0.1,0.03,0.28,"/","+")));
        org.junit.Assert.assertEquals( (double) 0.20714285714285713, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1223() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.95,"+",0.76,"/")));
        org.junit.Assert.assertEquals( (double) 2.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1224() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.26,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1225() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.2,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1226() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.12,"+")));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1227() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.71,"+",0.47,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1228() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.38,0.18,0.05,"-","+",0.84,"+")));
        org.junit.Assert.assertEquals( (double) 1.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1229() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.42,0.05,"+",0.87,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1230() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.06,0.11,0.34,"/",0.74,"-")));
        org.junit.Assert.assertEquals( (double) -0.41647058823529415, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1231() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.82,0.72,0.59,0.02,"/",0.81,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1232() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.04,0.54,0.07,0.75,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1233() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.21,0.36,0.39,0.63,"-")));
        org.junit.Assert.assertEquals( (double) -0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1234() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.49,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1235() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.9,0.82,0.1,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1236() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1237() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.51,0.85,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1238() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.06,"-")));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1239() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.83,"/",0.97,0.12,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1240() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.81,"/")));
        org.junit.Assert.assertEquals( (double) 0.7037037037037036, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1241() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.52,"*",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1242() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.75,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1243() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.42,"/",0.52,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1244() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.06,0.4,0.34,"+","+",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1245() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.03,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1246() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.37,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1247() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.75,0.54,0.32,0.72,"*","/",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1248() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.98,0.7,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1249() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.01,"-",0.56,"+",0.09,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1250() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.19,"*")));
        org.junit.Assert.assertEquals( (double) 0.1748, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1251() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.55,"-",0.38,0.94,0.76,0.36,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1252() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.3,"-")));
        org.junit.Assert.assertEquals( (double) -0.19999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1253() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.13,"-",0.18,0.29,0.25,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1254() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.73,"*",0.01,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1255() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.83,0.95,"*","*",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1256() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.09,"*",0.3,"/")));
        org.junit.Assert.assertEquals( (double) 0.141, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1257() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.36,"*",0.91,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1258() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.25,0.01,0.44,"/",0.25,"-")));
        org.junit.Assert.assertEquals( (double) -0.22727272727272727, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1259() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.92,0.67,0.69,0.57,"*",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1260() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.49,"-")));
        org.junit.Assert.assertEquals( (double) -0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1261() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.57,1.0,0.63,"+","+","-")));
        org.junit.Assert.assertEquals( (double) -1.3199999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1262() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.11,"/")));
        org.junit.Assert.assertEquals( (double) 0.4545454545454546, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1263() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.49,0.43,0.42,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1264() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.43,"*",0.33,"/",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1265() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1266() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1267() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.35,"/",0.47,0.37,"/")));
        org.junit.Assert.assertEquals( (double) 1.2702702702702702, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1268() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1269() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.69,0.13,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.35999999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1270() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1271() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.89,0.25,0.62,"+")));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1272() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.51,"-",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1273() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.89,0.02,"+","*",0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1274() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.05,"/",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1275() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1276() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.93,0.06,0.07,"/",0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1277() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.8,0.16,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1278() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.04,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1279() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.66,0.18,"*",0.08,"*")));
        org.junit.Assert.assertEquals( (double) 0.009504, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1280() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.41,0.67,0.61,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1281() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.51,0.6,"*",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1282() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.05,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1283() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.36,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1284() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.92,0.52,"-")));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1285() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.76,"*")));
        org.junit.Assert.assertEquals( (double) 0.6156, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1286() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.09,0.98,"+",0.53,0.44,0.14,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1287() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.38,"/",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1288() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.36,"/",0.8,"/",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1289() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.53,0.6,0.99,0.38,0.65,0.35,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1290() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.76,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1291() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.47,"*")));
        org.junit.Assert.assertEquals( (double) 0.0094, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1292() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.17,0.35,"*",0.08,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1293() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.4,0.02,0.79,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1294() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.95,0.89,0.79,0.84,"*")));
        org.junit.Assert.assertEquals( (double) 0.6636, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1295() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.23,0.86,"/",0.98,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1296() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.6,0.5,"*",0.36,0.97,0.64,"/")));
        org.junit.Assert.assertEquals( (double) 1.515625, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1297() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.08,"/")));
        org.junit.Assert.assertEquals( (double) 3.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1298() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.41,0.8,0.48,"+",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1299() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.61,"*")));
        org.junit.Assert.assertEquals( (double) 0.28669999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1300() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.99,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1301() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.21,"-",0.74,"*",0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1302() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.49,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1303() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1304() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.02,0.73,"/",0.13,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1305() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.1,0.47,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1306() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.42,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1307() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.06,0.19,"+",0.01,"+","/")));
        org.junit.Assert.assertEquals( (double) 3.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1308() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1309() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.69,0.2,0.91,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1310() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.04,"*")));
        org.junit.Assert.assertEquals( (double) 0.0196, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1311() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1312() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.14,0.97,"+",0.13,0.12,0.11,"-")));
        org.junit.Assert.assertEquals( (double) 0.009999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1313() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1314() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.68,0.85,"*","+")));
        org.junit.Assert.assertEquals( (double) 1.098, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1315() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.46,"/",0.84,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1316() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1317() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.7,"-")));
        org.junit.Assert.assertEquals( (double) 0.10000000000000009, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1318() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1319() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1320() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.11,"-",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1321() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.52,0.29,"-",0.57,0.33,"/")));
        org.junit.Assert.assertEquals( (double) 1.727272727272727, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1322() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.2,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1323() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1324() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.71,0.8,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1325() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1326() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,1.0,"/")));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1327() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.76,0.58,0.55,0.16,"*")));
        org.junit.Assert.assertEquals( (double) 0.08800000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1328() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.53,"+",0.02,0.37,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1329() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.29,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1330() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.83,0.06,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1331() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.63,0.55,"+",0.34,0.32,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1332() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.75,0.26,"*",0.83,0.44,0.92,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1333() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.64,0.94,0.24,"+","*",0.54,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1334() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.74,"*",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1335() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.98,0.01,0.97,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1336() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.56,0.09,0.35,0.03,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1337() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1338() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.88,0.95,"*",1.0,0.02,0.94,"*")));
        org.junit.Assert.assertEquals( (double) 0.0188, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1339() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.43,"-",0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1340() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1341() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.84,"/")));
        org.junit.Assert.assertEquals( (double) 0.27380952380952384, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1342() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.87,0.07,"*","+",0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1343() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.87,0.7,"*")));
        org.junit.Assert.assertEquals( (double) 0.609, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1344() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.43,"-")));
        org.junit.Assert.assertEquals( (double) 0.37000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1345() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.03,"*",0.06,0.0,0.97,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1346() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1347() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.46,0.47,"*","-",0.34,0.77,"*")));
        org.junit.Assert.assertEquals( (double) 0.26180000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1348() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.85,0.98,0.38,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.31654, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1349() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1350() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.77,0.54,0.12,"*",0.16,"*",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1351() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.27,0.21,0.62,0.15,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1352() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.49,0.49,"/","*",0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1353() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.68,0.5,0.56,"/",0.1,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1354() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.45,"/",0.3,"-",0.73,"*")));
        org.junit.Assert.assertEquals( (double) 0.511, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1355() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1356() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.95,0.55,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1357() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.02,"/")));
        org.junit.Assert.assertEquals( (double) 32.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1358() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.89,0.23,"-",0.1,"+")));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1359() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.67,0.86,0.67,0.72,0.81,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1360() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.07,"-",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1361() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.07,0.81,"/","*",0.44,"/")));
        org.junit.Assert.assertEquals( (double) 0.03338945005611672, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1362() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.91,"+")));
        org.junit.Assert.assertEquals( (double) 1.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1363() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.48,"/",0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1364() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.19,0.09,0.26,0.87,"-")));
        org.junit.Assert.assertEquals( (double) -0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1365() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.72,0.46,0.28,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.5912, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1366() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1367() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.22,0.79,"/","/",0.84,"+")));
        org.junit.Assert.assertEquals( (double) 4.215454545454546, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1368() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.74,"/",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1369() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.19,0.74,"*")));
        org.junit.Assert.assertEquals( (double) 0.1406, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1370() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1371() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1372() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.61,"-",0.32,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1373() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1374() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.4,"-")));
        org.junit.Assert.assertEquals( (double) 0.08999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1375() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.04,"+",0.12,"*")));
        org.junit.Assert.assertEquals( (double) 0.114, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1376() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.5,0.96,0.71,0.09,"-",0.73,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1377() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.08,0.08,0.71,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1378() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1379() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.36,"/")));
        org.junit.Assert.assertEquals( (double) 1.7222222222222223, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1380() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1381() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1382() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.73,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1383() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.14,0.95,0.48,0.06,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1384() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1385() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.04,"+",0.71,0.36,"*",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1386() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.02,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1387() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.8,0.37,0.18,0.03,0.16,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1388() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.25,0.51,0.33,0.49,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1389() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1390() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.51,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1391() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.82,0.53,0.59,"*",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1392() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.23,"*",0.28,0.94,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1393() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.73,"-",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1394() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1395() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.59,0.93,"-",0.19,0.51,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1396() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.56,0.86,0.12,0.5,0.17,"+",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1397() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.5,"-",0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1398() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.74,0.95,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.18899999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1399() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1400() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1401() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.66,0.45,0.57,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.4494736842105265, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1402() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.25,0.89,0.36,"-",0.04,"*",0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1403() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.28,0.66,"*",0.77,"*",0.26,"+")));
        org.junit.Assert.assertEquals( (double) 0.402296, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1404() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.22,0.67,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1405() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.82,0.85,"+",0.36,0.83,0.51,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1406() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.79,"/")));
        org.junit.Assert.assertEquals( (double) 0.07594936708860758, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1407() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.78,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1408() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.55,0.1,"-","-",0.51,0.75,"/")));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1409() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.26,"+")));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1410() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.59,0.27,0.86,"/")));
        org.junit.Assert.assertEquals( (double) 0.313953488372093, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1411() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.05,0.62,0.16,0.54,"*")));
        org.junit.Assert.assertEquals( (double) 0.0864, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1412() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.57,0.75,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1413() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.51,0.38,0.3,"/",0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1414() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1415() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.02,"*",0.62,"*",0.59,0.25,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1416() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.15,"+",0.74,0.29,"*","+",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1417() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.31,0.88,"+","+",0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1418() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.53,"/",0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1419() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.18,"/")));
        org.junit.Assert.assertEquals( (double) 3.2777777777777777, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1420() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.93,"/",0.23,0.58,0.67,0.25,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1421() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1422() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1423() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1424() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.86,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1425() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.35,0.36,0.45,0.59,"*",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1426() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.64,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1427() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.16,"/",0.15,"+",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1428() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.33,0.65,"-")));
        org.junit.Assert.assertEquals( (double) -0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1429() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.76,"-",0.09,0.99,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1430() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.44,0.51,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1431() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.61,0.59,0.78,"+",0.88,"+",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1432() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.7,0.04,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1433() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.78,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1434() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.32,"+",0.3,"+",0.75,"/")));
        org.junit.Assert.assertEquals( (double) 1.5600000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1435() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.73,0.19,0.03,"-","*")));
        org.junit.Assert.assertEquals( (double) 0.1168, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1436() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1437() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.08,0.31,"/")));
        org.junit.Assert.assertEquals( (double) 0.25806451612903225, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1438() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.58,0.71,0.33,0.19,0.56,"/")));
        org.junit.Assert.assertEquals( (double) 0.33928571428571425, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1439() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.6,0.39,0.94,0.86,0.3,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1440() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.66,0.87,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1441() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.08,"*",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1442() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.62,0.78,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1443() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1444() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1445() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1446() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.14,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1447() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.14,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1448() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.46,0.94,0.55,0.85,"-")));
        org.junit.Assert.assertEquals( (double) -0.29999999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1449() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.22,"-")));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1450() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.82,"*",0.65,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1451() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.93,"*")));
        org.junit.Assert.assertEquals( (double) 0.6975, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1452() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.72,0.2,0.9,0.37,"-",0.88,"+")));
        org.junit.Assert.assertEquals( (double) 1.4100000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1453() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.89,0.49,0.08,"/",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1454() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.63,0.69,0.74,0.61,"*")));
        org.junit.Assert.assertEquals( (double) 0.45139999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1455() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.18,1.0,0.86,0.24,"/","/",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1456() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.27,0.96,"/")));
        org.junit.Assert.assertEquals( (double) 0.28125000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1457() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.73,0.22,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1458() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.4,0.1,"/")));
        org.junit.Assert.assertEquals( (double) 4.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1459() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.3,0.02,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1460() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.16,"+",0.31,"+",0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1461() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.08,0.56,0.24,"*",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1462() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.39,0.95,0.13,"*")));
        org.junit.Assert.assertEquals( (double) 0.1235, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1463() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.41,0.04,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1464() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.59,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1465() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.59,0.93,0.93,0.21,"+","*",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1466() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.97,"*",0.09,0.6,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1467() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.65,0.61,0.29,0.15,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1468() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.72,0.44,0.06,0.23,0.44,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1469() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.63,0.86,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1470() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.31,0.48,0.3,0.41,0.63,0.32,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1471() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.55,"*",0.82,0.98,"-")));
        org.junit.Assert.assertEquals( (double) -0.16000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1472() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1473() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.77,0.07,"*",0.87,0.59,0.44,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1474() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.8,0.1,0.16,0.34,"+","*",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1475() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.48,0.63,0.01,0.65,"*",0.68,"+")));
        org.junit.Assert.assertEquals( (double) 0.6865, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1476() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,1.0,"/",0.41,"-",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1477() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.25,0.33,"*",0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1478() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.34,0.87,0.76,"+")));
        org.junit.Assert.assertEquals( (double) 1.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1479() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.1,0.99,"-",0.8,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1480() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1481() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1482() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1483() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.75,0.08,"/",0.67,"-")));
        org.junit.Assert.assertEquals( (double) 8.705, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1484() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.81,0.5,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1485() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.13,0.39,0.3,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1486() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.49,0.25,0.42,0.25,"+",0.55,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1487() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.61,0.92,"+",0.05,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.017647058823529415, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1488() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.88,0.94,0.14,"+",0.39,"+")));
        org.junit.Assert.assertEquals( (double) 1.4700000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1489() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.59,0.53,0.74,0.83,0.04,0.23,"*")));
        org.junit.Assert.assertEquals( (double) 0.0092, result, 0.0);
    }
}

