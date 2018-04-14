package java_programs;


public class RPN_EVAL_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.97,0.87,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.14,"*")));
        org.junit.Assert.assertEquals( (double) 0.13720000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.27,0.28,0.58,0.29,"-","*",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.8,0.72,"/",0.0,"-",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.1,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.29,0.3,"*",0.02,"+",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.0,0.75,"+",0.92,"*")));
        org.junit.Assert.assertEquals( (double) 0.6900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.34,0.78,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.39,0.13,0.53,"/","/",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.13,0.52,0.73,0.51,0.75,0.97,"-")));
        org.junit.Assert.assertEquals( (double) -0.21999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.61,"+",0.34,"*",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.48,0.69,"*","*",0.48,0.94,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.55,0.37,0.89,"/",0.9,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.62,"-",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.7,0.4,"/",0.33,"-",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.47,0.6,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.8599999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.79,0.82,0.42,0.29,0.0,0.3,"+")));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.38,"-",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.77,"/",0.74,0.3,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.9232987012987013, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.34,0.71,0.81,0.44,0.47,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.09,0.79,"+",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.6,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.92,"*")));
        org.junit.Assert.assertEquals( (double) 0.5244, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.43,0.51,"*","-",0.13,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.65,0.87,0.16,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.97,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.77,"-",0.71,0.25,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.75,"*",0.34,"+")));
        org.junit.Assert.assertEquals( (double) 0.7150000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.44,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.81,"+",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.5,0.86,"*",0.36,"*",0.23,"/")));
        org.junit.Assert.assertEquals( (double) 0.6730434782608695, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.38,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.72,0.2,"*",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.81,0.28,"-",0.43,"*")));
        org.junit.Assert.assertEquals( (double) 0.22790000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.17,0.02,"/",0.68,"+",0.76,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.86,"+",0.1,"/",0.39,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.61,0.3,"-",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.23,0.19,0.79,"*",0.04,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.05,0.03,"-",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }


}

