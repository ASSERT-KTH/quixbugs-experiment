package java_programs;


public class RPN_EVAL_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.71,0.5,"*")));
        org.junit.Assert.assertEquals( (double) 0.355, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.12,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.0,0.74,0.57,"-",0.49,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.29,0.59,0.91,"*",0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.96,0.56,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.11,"*",0.24,"*",0.18,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.12,"/",0.12,0.32,"*","-")));
        org.junit.Assert.assertEquals( (double) 4.128266666666667, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.28,0.09,0.07,0.64,"+","+")));
        org.junit.Assert.assertEquals( (double) 0.7999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.5,"+",0.12,"/")));
        org.junit.Assert.assertEquals( (double) 11.833333333333334, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.01,0.92,"-","*",0.43,0.74,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.71,0.05,0.84,0.27,"*","+","-")));
        org.junit.Assert.assertEquals( (double) 0.4332, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.8,0.18,"/",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.13,"/")));
        org.junit.Assert.assertEquals( (double) 3.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.29,"+",0.43,"*",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.87,0.12,0.8,"+",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.07,0.91,0.65,0.84,"/","-")));
        org.junit.Assert.assertEquals( (double) 0.1361904761904762, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.15,0.13,0.35,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.032999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.67,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.36,0.06,"/",0.67,0.2,0.61,"*")));
        org.junit.Assert.assertEquals( (double) 0.122, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.73,0.3,0.98,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.24,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.07,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.98,0.47,"/",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.34,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.38,"*",0.87,0.38,0.54,0.72,"-")));
        org.junit.Assert.assertEquals( (double) -0.17999999999999994, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.12,0.96,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.09875, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.59,0.66,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.09,"/",0.98,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.83,"*",0.54,0.05,0.48,0.7,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.7,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.18,"/")));
        org.junit.Assert.assertEquals( (double) 1.3333333333333333, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.08,0.74,0.64,"*")));
        org.junit.Assert.assertEquals( (double) 0.4736, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.15,0.55,"-","-")));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.46,0.53,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.27,0.2,"-",0.2,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.74,0.29,"+",0.99,0.96,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.9789119999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.88,"-",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.19,0.67,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.51,"+",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.92,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.01,"*",0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.33,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.58,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.96,0.11,"-","*",0.7,0.61,"*")));
        org.junit.Assert.assertEquals( (double) 0.427, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.66,0.09,"-")));
        org.junit.Assert.assertEquals( (double) 0.5700000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.09,0.0,0.68,"-",0.41,0.61,"/")));
        org.junit.Assert.assertEquals( (double) 0.6721311475409836, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.76,0.78,"+",0.89,0.2,0.2,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.39,0.25,"*","*",0.32,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.45,0.13,"/",0.65,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.12,0.56,"/",0.58,"/")));
        org.junit.Assert.assertEquals( (double) 0.36945812807881767, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.53,"*",0.63,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.02,0.04,0.07,"*")));
        org.junit.Assert.assertEquals( (double) 0.0028000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.8,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.94,0.66,"*",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.99,"+",0.61,"-",0.67,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.39,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.03,0.39,"-",0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.76,0.68,0.54,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.85,0.47,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.93,0.71,0.81,0.49,0.95,0.26,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.55,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.01,0.19,0.72,0.84,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.23,0.52,"-",0.46,"+",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.17,0.72,0.78,0.09,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.15,"/")));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.05,0.1,"-",0.87,0.95,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.75,"-",0.25,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.86,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.18,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.64,0.51,0.2,0.37,"+",0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.6,"/",0.67,"/",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.68,0.01,"+")));
        org.junit.Assert.assertEquals( (double) 0.6900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.13,"/")));
        org.junit.Assert.assertEquals( (double) 6.692307692307692, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.35,0.1,0.34,"-")));
        org.junit.Assert.assertEquals( (double) -0.24000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.32,0.9,0.57,0.59,0.32,"/")));
        org.junit.Assert.assertEquals( (double) 1.8437499999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.61,0.14,0.05,"-")));
        org.junit.Assert.assertEquals( (double) 0.09000000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.1,0.54,0.3,0.14,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.93,"/",0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.47,0.99,"-",0.23,"-",0.13,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.17,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.48,0.24,0.23,"-","+",0.45,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.17,0.8,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.5,0.09,0.63,"*",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.92,0.31,"*","/",0.74,0.44,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.12,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.71,0.23,0.37,"*",0.42,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.27,0.2,"/",0.48,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.97,0.95,"+",0.15,0.54,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.32,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.32,0.22,"*","+",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.08,0.24,"+",0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.06,"-",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.64,"*")));
        org.junit.Assert.assertEquals( (double) 0.544, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.28,0.75,"-","-")));
        org.junit.Assert.assertEquals( (double) 1.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.51,"/")));
        org.junit.Assert.assertEquals( (double) 1.1176470588235292, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.07,0.06,"-",0.83,"*",0.93,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.43,0.71,0.01,0.83,0.86,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.009651162790697674, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.95,0.2,0.19,0.05,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.49,0.52,"/",0.22,0.83,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.37,0.28,0.31,"+","+",0.36,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.36,0.96,"+","/",0.93,0.84,"+")));
        org.junit.Assert.assertEquals( (double) 1.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.04,0.36,0.62,0.63,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.53,"-",0.27,0.15,"-",0.95,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.02,"*",0.76,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.3,0.73,0.13,"/",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.05,0.65,"*")));
        org.junit.Assert.assertEquals( (double) 0.0325, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.65,1.0,0.29,"*",0.62,0.42,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.09,0.65,0.38,"/",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.2,"/",0.47,0.91,"-")));
        org.junit.Assert.assertEquals( (double) -0.44000000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.83,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.86,0.8,0.14,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.33,0.56,0.93,0.59,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.56,0.66,"/",0.24,"+",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.97,0.15,0.67,0.55,0.27,"-","*")));
        org.junit.Assert.assertEquals( (double) 0.18760000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.79,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.14,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.69,"*")));
        org.junit.Assert.assertEquals( (double) 0.1932, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.83,0.05,"+","*",0.67,"-")));
        org.junit.Assert.assertEquals( (double) 0.1923999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.87,0.18,0.31,"/")));
        org.junit.Assert.assertEquals( (double) 0.5806451612903225, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.91,"*",0.52,"+",0.53,0.23,"+")));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.88,0.78,0.85,0.42,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.99,0.68,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.73,"*")));
        org.junit.Assert.assertEquals( (double) 0.2263, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.23,0.02,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.013043478260869565, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.56,"/")));
        org.junit.Assert.assertEquals( (double) 0.732142857142857, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.31,0.42,0.9,"-")));
        org.junit.Assert.assertEquals( (double) -0.48000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.16,0.16,0.86,"+","/","*")));
        org.junit.Assert.assertEquals( (double) 0.10823529411764705, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,1.0,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.99,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.72,"/",0.89,0.62,0.71,0.58,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.65,"+",0.38,"-",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.85,0.21,0.47,0.67,"+",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.16,"-",0.87,"-")));
        org.junit.Assert.assertEquals( (double) -0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.14,0.3,"-",0.88,0.98,0.83,"-")));
        org.junit.Assert.assertEquals( (double) 0.15000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.84,0.38,"-")));
        org.junit.Assert.assertEquals( (double) 0.45999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.74,"+",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.57,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.0,0.89,0.64,0.62,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.39,0.38,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.91,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.76,"*")));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.22,0.59,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.4,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.03,0.22,0.82,"+")));
        org.junit.Assert.assertEquals( (double) 1.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.46,"*",0.5,"-",0.26,0.8,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.15,0.16,0.31,"+","+")));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.11,0.15,"*",0.79,0.27,"-")));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.0,"+",0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.77,0.83,0.06,"-","+",0.16,"-")));
        org.junit.Assert.assertEquals( (double) 1.3800000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.89,"*",0.86,0.77,"/")));
        org.junit.Assert.assertEquals( (double) 1.1168831168831168, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.28,"+")));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.91,"+",0.4,0.04,"+",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.89,"/")));
        org.junit.Assert.assertEquals( (double) 0.6067415730337079, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.5,0.58,0.39,0.5,0.74,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.15000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.27,0.25,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.22,"/")));
        org.junit.Assert.assertEquals( (double) 0.4545454545454546, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.29,0.67,"+",0.91,0.48,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.36,"/")));
        org.junit.Assert.assertEquals( (double) 0.36111111111111116, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.36,0.28,0.71,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.01,"/",0.32,0.3,"/",0.51,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.95,0.27,0.18,"/","-")));
        org.junit.Assert.assertEquals( (double) -0.5500000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.27,"/")));
        org.junit.Assert.assertEquals( (double) 0.2222222222222222, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.97,0.21,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.63,"-",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.0,0.82,0.22,0.36,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.11,0.65,"/",0.13,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.55,0.93,"/")));
        org.junit.Assert.assertEquals( (double) 0.5913978494623656, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.14,0.11,"*")));
        org.junit.Assert.assertEquals( (double) 0.015400000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.09,0.03,0.6,"*")));
        org.junit.Assert.assertEquals( (double) 0.018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.51,0.76,"*")));
        org.junit.Assert.assertEquals( (double) 0.3876, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.3,0.85,"*",0.07,"+")));
        org.junit.Assert.assertEquals( (double) 0.325, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.33,0.55,0.5,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.34,"+",0.18,"*")));
        org.junit.Assert.assertEquals( (double) 0.162, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.14,"+",0.99,0.11,"-","/",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.38,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.41,0.74,"-",0.07,0.79,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.93,"+",0.28,"-",0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.33,0.96,0.28,0.55,0.86,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.24,0.44,"-","*",0.74,"+")));
        org.junit.Assert.assertEquals( (double) 0.624, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.6,0.83,0.79,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.18,0.34,"-")));
        org.junit.Assert.assertEquals( (double) -0.16000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.31,0.09,0.05,0.1,0.64,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.92,0.21,0.17,0.69,0.1,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.21518987341772156, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.25,"/")));
        org.junit.Assert.assertEquals( (double) 3.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.23,0.16,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.16,0.57,"/")));
        org.junit.Assert.assertEquals( (double) 0.28070175438596495, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.83,0.49,0.38,0.26,"-",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.94,"/",0.95,0.81,0.91,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.65,0.48,0.79,"*",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.17,0.97,"/",0.89,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.81,"+",0.75,"/",0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.82,0.06,0.67,0.1,0.12,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.61,0.31,"*")));
        org.junit.Assert.assertEquals( (double) 0.1891, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.79,"/",0.47,0.52,"/")));
        org.junit.Assert.assertEquals( (double) 0.9038461538461537, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.89,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.58,0.81,0.54,0.41,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.5886, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.59,"*")));
        org.junit.Assert.assertEquals( (double) 0.2655, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.93,0.33,"*",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.51,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.36,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.32,0.55,0.53,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.09328000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.55,0.92,0.48,0.41,"-",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.73,0.54,0.13,0.59,"*","/")));
        org.junit.Assert.assertEquals( (double) 7.040417209908735, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.92,"/",0.91,"-",0.57,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.55,"+",0.96,0.71,"*",0.66,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.85,"-",0.48,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.49,0.79,0.33,"/","-")));
        org.junit.Assert.assertEquals( (double) -1.903939393939394, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.22,0.55,0.14,0.0,"-")));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.7,0.5,0.53,"-")));
        org.junit.Assert.assertEquals( (double) -0.030000000000000027, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.47,0.51,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.01,0.33,0.78,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.023636363636363636, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.37,"+")));
        org.junit.Assert.assertEquals( (double) 1.1600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.46,0.33,0.01,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    public void test_268() throws java.lang.Exception {
    }
}

