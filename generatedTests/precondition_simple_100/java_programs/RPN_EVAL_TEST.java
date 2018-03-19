package java_programs;


public class RPN_EVAL_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.44,0.9,0.84,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.05,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.45,0.13,0.86,"*")));
        org.junit.Assert.assertEquals( (double) 0.1118, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.31,0.97,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.31,"-",0.58,0.12,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.72,"-",0.59,"*")));
        org.junit.Assert.assertEquals( (double) -0.34219999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.23,"/")));
        org.junit.Assert.assertEquals( (double) 0.043478260869565216, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.78,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.52,0.43,"-",0.03,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.7,"/",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.36,"/",0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.6,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.52,0.11,0.88,0.3,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.85,0.27,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.1600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.86,0.12,"*",0.6,0.38,0.94,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.57,0.32,0.65,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.31,0.44,0.92,"+",0.17,"+",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.79,"+")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.06,0.62,"+","*",0.75,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.96,0.14,0.52,"-","/","+")));
        org.junit.Assert.assertEquals( (double) -1.986315789473684, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.61,0.73,"-",0.24,0.74,0.05,"/")));
        org.junit.Assert.assertEquals( (double) 14.799999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.83,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.39,0.61,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.13,0.23,1.0,"+","*",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    public void test_27() throws java.lang.Exception {
    }
}

