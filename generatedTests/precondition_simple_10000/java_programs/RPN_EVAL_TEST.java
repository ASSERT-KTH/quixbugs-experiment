package java_programs;


public class RPN_EVAL_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.78,0.47,0.3,"/",0.76,0.06,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.36,0.42,"-")));
        org.junit.Assert.assertEquals( (double) -0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.18,0.73,0.84,"/","-","*")));
        org.junit.Assert.assertEquals( (double) -0.2825095238095238, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.15,"/",0.9,"-",0.84,0.83,"/")));
        org.junit.Assert.assertEquals( (double) 1.0120481927710843, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.99,"-",0.94,0.05,0.83,0.56,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.32,0.44,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.17105263157894737, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.16,0.63,0.77,0.34,0.73,0.32,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.01,0.96,"/",0.71,0.41,0.81,"*")));
        org.junit.Assert.assertEquals( (double) 0.3321, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.07,0.81,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.97,"-",0.91,"-")));
        org.junit.Assert.assertEquals( (double) -1.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.81,0.31,0.82,0.7,"*","+","-")));
        org.junit.Assert.assertEquals( (double) -0.07399999999999984, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.82,"/")));
        org.junit.Assert.assertEquals( (double) 0.475609756097561, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.02,0.02,"+",0.24,"*","+",0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.05,0.27,0.68,"/","+","/",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.64,0.2,0.86,"/","/","*")));
        org.junit.Assert.assertEquals( (double) 1.5136, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.92,0.93,"-")));
        org.junit.Assert.assertEquals( (double) -0.010000000000000009, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.53,0.88,0.9,0.13,0.88,0.05,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,1.0,0.25,"*","-",0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.24,0.75,0.2,0.27,"*",0.27,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.94,"/",0.05,0.83,0.23,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.91,0.03,0.22,0.81,"-",0.11,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.78,0.78,0.25,"+",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.55,0.11,0.08,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.12,0.48,"*","+",0.74,0.1,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.69,0.68,0.41,"/")));
        org.junit.Assert.assertEquals( (double) 1.6585365853658538, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.45,"*")));
        org.junit.Assert.assertEquals( (double) 0.261, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.11,0.28,"+","/")));
        org.junit.Assert.assertEquals( (double) 2.4615384615384612, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.49,"+",0.16,"+")));
        org.junit.Assert.assertEquals( (double) 1.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,1.0,0.13,"-","-",0.97,"*")));
        org.junit.Assert.assertEquals( (double) 0.07759999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.52,0.33,"+",0.38,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.93,0.78,"-",0.81,0.25,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.15900000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.85,0.47,0.15,0.08,"*","-",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.9,0.52,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.04,0.97,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.15,0.67,"+",0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.33,0.68,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.39,"/",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.88,"-",0.6,0.82,"+")));
        org.junit.Assert.assertEquals( (double) 1.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.83,0.74,"+")));
        org.junit.Assert.assertEquals( (double) 1.5699999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.68,0.21,0.88,0.85,"/",0.84,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.16,"/",0.92,"-",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.18,"-",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.53,0.64,0.15,0.8,"/")));
        org.junit.Assert.assertEquals( (double) 0.18749999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.17,0.16,0.5,0.23,"-","*")));
        org.junit.Assert.assertEquals( (double) 0.0432, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.02,0.25,0.3,"*")));
        org.junit.Assert.assertEquals( (double) 0.075, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.6,0.36,"-","+",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.6,"-",0.62,0.15,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.99,0.33,"*",0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,1.0,0.59,"-",0.41,0.5,"-")));
        org.junit.Assert.assertEquals( (double) -0.09000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.69,0.77,"+",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.29,"/",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.97,0.55,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.48,0.35,0.98,"-",0.19,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.34,0.77,0.8,"-",0.66,0.85,"-")));
        org.junit.Assert.assertEquals( (double) -0.18999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.3,0.59,0.4,0.65,0.46,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.7100000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.34,0.07,0.82,"*")));
        org.junit.Assert.assertEquals( (double) 0.0574, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.35,0.64,"+",0.11,0.86,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.93,0.91,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.12,0.22,0.54,0.72,"/")));
        org.junit.Assert.assertEquals( (double) 0.7500000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.19,"*",0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.46,0.04,0.33,0.26,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.61,0.14,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.11,0.45,"*",0.17,0.45,0.77,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.39,0.16,"-")));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.67,0.65,0.95,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.66,"+")));
        org.junit.Assert.assertEquals( (double) 1.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.92,"-",0.86,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.02,0.59,0.01,0.89,"-",0.52,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.2,0.84,"/",0.68,"-","/")));
        org.junit.Assert.assertEquals( (double) -0.769396551724138, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.96,0.44,"+",0.26,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.52,0.71,0.5,0.88,0.88,"-","-")));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.1,0.74,0.15,0.8,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.43,0.72,0.33,"*")));
        org.junit.Assert.assertEquals( (double) 0.2376, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.03,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.34,0.36,0.91,0.05,"*",0.16,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.59,0.28,0.23,"-","+",0.23,"*")));
        org.junit.Assert.assertEquals( (double) 0.1472, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.8,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.44,0.4,0.04,"-","+","/",0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.09,0.91,0.32,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.9,0.28,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.12,"*",0.36,0.74,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.185, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.65,"/",0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.04,0.07,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.56,0.64,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.6,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.65,0.37,"/","+",0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.95,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.02,0.73,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.74,0.4,0.76,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.33,"*")));
        org.junit.Assert.assertEquals( (double) 0.22440000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.44,"+",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.52,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.38,0.38,0.04,"*",0.73,"+")));
        org.junit.Assert.assertEquals( (double) 0.7452, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.13,"+",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.73,0.83,"/",0.46,"/",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.52,0.63,"/")));
        org.junit.Assert.assertEquals( (double) 0.8253968253968255, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.62,0.93,0.61,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.73,"/",0.21,0.24,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.31,0.0,"+",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.48,0.52,0.05,0.65,"+",0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.8,0.13,0.56,"-","*","*",0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.72,0.44,0.42,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.98,"*",0.26,"+",0.85,"-")));
        org.junit.Assert.assertEquals( (double) -0.37439999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.93,"-",0.04,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.84,0.94,0.7,"*","*","*")));
        org.junit.Assert.assertEquals( (double) 0.4587575999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.1,0.46,"+")));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.37,0.06,0.77,0.55,0.62,"+")));
        org.junit.Assert.assertEquals( (double) 1.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.24,"-")));
        org.junit.Assert.assertEquals( (double) -0.13999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.47,"*",0.67,"/",0.34,"/")));
        org.junit.Assert.assertEquals( (double) 0.08252853380158033, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.35,0.09,0.01,"+",0.79,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.19,"+",0.25,0.68,0.54,"/")));
        org.junit.Assert.assertEquals( (double) 1.2592592592592593, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.87,0.7,"-",0.14,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.27,0.01,0.94,"*","*","*",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.49,0.27,"+")));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.65,0.96,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.22,"-")));
        org.junit.Assert.assertEquals( (double) -0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.84,0.84,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.28,0.76,0.96,"-",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.38,0.08,0.8,0.92,"*","/",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.56,0.77,0.95,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.68,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.52,0.96,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.29,0.47,0.81,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.63,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.16,0.29,"/","/",0.31,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.92,0.72,0.24,"/","-")));
        org.junit.Assert.assertEquals( (double) -2.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.3,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.51,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.72,0.52,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.72,0.38,0.03,"+")));
        org.junit.Assert.assertEquals( (double) 0.41000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.95,0.15,0.8,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.6174999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.21,0.03,"-",0.27,0.98,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.44,"*",0.77,0.8,0.93,0.98,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.78,"*",0.26,0.69,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.0,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.1,0.43,"+",0.81,0.7,"+",0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.38,0.57,0.66,"/",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.41,0.78,"+",0.14,0.05,"/","-")));
        org.junit.Assert.assertEquals( (double) -1.6100000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.34,0.97,"*",0.74,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.36,0.31,0.87,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.84,0.86,0.31,"+",0.67,"-",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.57,"/",0.68,0.95,0.51,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.87,0.15,"*",0.7,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.26,"-")));
        org.junit.Assert.assertEquals( (double) -0.08000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.85,0.11,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.14,0.34,0.79,"/")));
        org.junit.Assert.assertEquals( (double) 0.43037974683544306, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.78,1.0,0.15,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.69,0.87,0.4,"-",0.64,0.7,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.0,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.1,0.41,"+",0.79,"-",0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.89,"*",0.09,0.42,0.16,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.67,0.98,"-",0.47,0.16,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.25,"+",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.39,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.18,0.95,0.41,0.03,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.19,0.39,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.36,"-")));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.15,0.35,0.07,0.29,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.3,0.76,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.08,"+",0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.93,0.3,"*",0.5,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.11,"-")));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.99,0.83,0.02,0.51,"+")));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.03,"-",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.36,"+",0.34,"-",0.91,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.8,0.07,"-",0.2,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.12,0.19,0.45,0.7,0.52,"+",0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.94,"-",0.66,0.41,"*",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.98,0.31,0.87,0.05,0.35,0.99,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.14,0.31,"+","+",0.17,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.08,0.11,"*","/",0.85,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.52,"-",0.08,"/",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.82,"+")));
        org.junit.Assert.assertEquals( (double) 1.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.64,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.24,"+",0.02,0.61,0.73,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.95,"*",0.76,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.82,1.0,0.12,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.94,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.34,"-",1.0,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.44,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.16,"*",0.97,0.16,"*",0.71,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.69,"-",0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.26,"/",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.36,0.53,0.19,0.8,0.22,0.23,"+")));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.75,"/",0.35,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.12,"-",0.71,0.17,"*")));
        org.junit.Assert.assertEquals( (double) 0.1207, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.53,"-",0.08,"-")));
        org.junit.Assert.assertEquals( (double) -0.36000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.59,"-",0.21,"-")));
        org.junit.Assert.assertEquals( (double) 0.10000000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.03,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.32,0.9,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.82,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.68,"*",0.36,"/")));
        org.junit.Assert.assertEquals( (double) 1.2088888888888891, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.32,"/",0.06,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.49,0.06,0.63,"*",0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.03,"*")));
        org.junit.Assert.assertEquals( (double) 0.0114, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.04,0.19,0.53,0.63,0.87,0.24,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.35,0.17,0.34,0.35,"/")));
        org.junit.Assert.assertEquals( (double) 0.9714285714285715, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.38,"/")));
        org.junit.Assert.assertEquals( (double) 2.1842105263157894, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.98,0.51,0.15,0.01,0.46,"/")));
        org.junit.Assert.assertEquals( (double) 0.021739130434782608, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.73,"+",0.1,0.98,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.31,0.68,"/",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.79,0.18,0.11,"-",0.33,"*")));
        org.junit.Assert.assertEquals( (double) 0.0231, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.99,"/")));
        org.junit.Assert.assertEquals( (double) 0.25252525252525254, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.79,"*",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.85,"*",0.07,"*",0.47,0.6,"-")));
        org.junit.Assert.assertEquals( (double) -0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.81,0.49,0.25,0.68,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.18014705882352938, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.13,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.85,"/")));
        org.junit.Assert.assertEquals( (double) 0.6352941176470589, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.37,"*",0.45,0.47,0.39,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.42,0.97,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.417, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.03,0.26,0.94,"/",0.78,0.99,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.7,"-",0.1,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.93,0.52,"+",0.65,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.53,0.67,"/","-",0.41,"/")));
        org.junit.Assert.assertEquals( (double) 0.19257371678194404, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.27,0.2,"/",0.93,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.32000000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.38,"/",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.47,0.6,0.89,0.08,"+")));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.56,0.54,"-")));
        org.junit.Assert.assertEquals( (double) 0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.32,"+")));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.1,"-",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.61,0.3,0.21,0.19,"-","-","/")));
        org.junit.Assert.assertEquals( (double) 2.1785714285714284, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.8,0.75,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.6375000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.4,"/")));
        org.junit.Assert.assertEquals( (double) 2.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.89,"*",0.9,0.75,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.31,0.72,"*")));
        org.junit.Assert.assertEquals( (double) 0.22319999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.93,0.08,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.03,0.72,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.64,0.84,0.55,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.68,0.5,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.65,0.26,0.12,0.58,"-")));
        org.junit.Assert.assertEquals( (double) -0.45999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.37,0.55,0.69,0.51,0.77,"/")));
        org.junit.Assert.assertEquals( (double) 0.6623376623376623, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.43,"+")));
        org.junit.Assert.assertEquals( (double) 1.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.44,0.52,0.71,"-",0.94,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.8,0.44,"+",0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.49,0.78,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.86,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.54,0.26,"-",0.1,"/",0.56,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.65,0.94,0.24,0.77,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.66,0.72,0.35,"*","*",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.46,0.24,"/",0.15,0.81,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.84,0.8,0.59,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.99,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.69,0.24,0.84,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.16,0.85,"-",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.14,"-",0.36,0.6,0.5,"-")));
        org.junit.Assert.assertEquals( (double) 0.09999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.77,"*",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.87,0.08,"*")));
        org.junit.Assert.assertEquals( (double) 0.0696, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.37,0.87,"-","-",0.11,0.81,"+")));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.06,0.18,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.43,0.68,"-","+",0.24,"+")));
        org.junit.Assert.assertEquals( (double) 0.8299999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.43,0.14,0.17,"-","/",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.73,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,1.0,0.9,0.64,"-",0.01,0.61,"-")));
        org.junit.Assert.assertEquals( (double) -0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.7,"-",0.03,0.81,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.55,0.48,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.52,0.01,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.318, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.7,"-")));
        org.junit.Assert.assertEquals( (double) -0.5399999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.3,0.93,"/",0.78,"-")));
        org.junit.Assert.assertEquals( (double) -0.4574193548387097, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.41,0.48,"/",0.39,0.78,0.48,"+")));
        org.junit.Assert.assertEquals( (double) 1.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.71,0.73,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.38,0.46,0.47,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.04,0.6,"*")));
        org.junit.Assert.assertEquals( (double) 0.024, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.92,0.57,"*",0.41,"*")));
        org.junit.Assert.assertEquals( (double) 0.21500399999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.43,"/",0.94,0.3,"+",0.4,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.94,"+",0.99,"/")));
        org.junit.Assert.assertEquals( (double) 1.6868686868686869, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.05,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.59,0.11,0.42,0.49,"/",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.31,"+")));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.96,0.73,"+")));
        org.junit.Assert.assertEquals( (double) 1.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.02,"-",0.2,0.87,"*",0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.17,"+")));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.97,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.92,0.45,0.05,"+","/")));
        org.junit.Assert.assertEquals( (double) 1.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.4,"/",0.2,0.04,0.72,"+",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.72,0.07,"*","/")));
        org.junit.Assert.assertEquals( (double) 6.150793650793651, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.44,"*",0.29,"+")));
        org.junit.Assert.assertEquals( (double) 0.6772, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.62,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.21,0.68,0.24,0.35,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.05712, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.01,0.92,"*",0.53,"/","/")));
        org.junit.Assert.assertEquals( (double) 16.1304347826087, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.7,"*",0.44,"+",0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.8,"/",0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.28,0.49,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.76,0.6,0.59,"/")));
        org.junit.Assert.assertEquals( (double) 1.0169491525423728, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.63,"-",0.72,"+")));
        org.junit.Assert.assertEquals( (double) 1.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.99,"-",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.68,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.78,0.76,0.72,0.27,"+",0.11,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.9,0.56,"-",0.92,0.33,"-")));
        org.junit.Assert.assertEquals( (double) 0.5900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.61,1.0,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.16,"*",0.82,"/")));
        org.junit.Assert.assertEquals( (double) 0.14439024390243904, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.49,0.64,0.81,0.25,0.09,"+","-")));
        org.junit.Assert.assertEquals( (double) 0.4700000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.63,0.11,0.95,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.43000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.66,"*")));
        org.junit.Assert.assertEquals( (double) 0.0396, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.23,"-",0.29,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.08,"/")));
        org.junit.Assert.assertEquals( (double) 9.625, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.37,0.78,"*",0.01,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.28,0.96,0.41,0.47,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.09,"/",0.84,"-",0.67,"*",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.41,0.48,0.82,"*",0.6,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.084624, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.92,0.79,"*","/",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.93,1.0,"-")));
        org.junit.Assert.assertEquals( (double) -0.06999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.11,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.27,0.55,"*")));
        org.junit.Assert.assertEquals( (double) 0.14850000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.27,0.56,0.71,0.36,"+",0.69,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.52,0.26,"/",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.37,0.49,0.32,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.99,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.33,"+",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.26,0.48,0.33,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.68,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.4,"+",0.08,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.15,0.55,"*",0.37,"/")));
        org.junit.Assert.assertEquals( (double) 0.222972972972973, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.68,"/")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.09,"*",0.75,0.14,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.26,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.85,0.68,0.35,0.02,0.69,"-")));
        org.junit.Assert.assertEquals( (double) -0.6699999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.03,"-",0.23,"+")));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.91,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.25,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.54,0.27,0.19,0.61,"-")));
        org.junit.Assert.assertEquals( (double) -0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.79,0.45,"-",0.79,0.32,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.4500000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.6,0.1,0.96,0.28,"+",0.21,"-")));
        org.junit.Assert.assertEquals( (double) 1.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.55,"+",0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.96,"+",0.38,0.44,"+",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.93,0.63,0.38,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.86,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.41,"/",0.66,0.71,"/")));
        org.junit.Assert.assertEquals( (double) 0.9295774647887325, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.91,"/")));
        org.junit.Assert.assertEquals( (double) 0.8571428571428571, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.79,0.27,0.81,"-",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.8,"/",0.29,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.39,0.61,0.53,0.65,0.14,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.73,0.66,0.54,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.96,0.96,"-")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.18,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.76,0.73,0.43,"/",0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.73,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.86,"/",0.34,0.16,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.39,0.28,0.74,0.3,"+","/",0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.27,0.11,"+")));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.91,0.21,0.79,0.49,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.86,"-",0.62,0.71,0.85,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.56,"*",0.12,0.99,"*")));
        org.junit.Assert.assertEquals( (double) 0.11879999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.88,"*",0.71,"-",0.22,"/",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.58,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.31,0.12,"*",0.96,"+",0.43,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.33,0.96,0.88,"+",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.4,0.41,0.62,0.9,"/",0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.18,0.35,"/","*",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.81,0.58,0.16,0.4,0.85,"/")));
        org.junit.Assert.assertEquals( (double) 0.4705882352941177, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.72,0.79,"*",0.82,"-","/")));
        org.junit.Assert.assertEquals( (double) -3.941082802547771, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.51,0.6,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.43,"+",0.79,0.48,0.88,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.15,"/",0.97,0.56,0.99,0.66,"-")));
        org.junit.Assert.assertEquals( (double) 0.32999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.9,0.82,0.77,"/","-")));
        org.junit.Assert.assertEquals( (double) -0.16493506493506482, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.86,"/")));
        org.junit.Assert.assertEquals( (double) 0.18604651162790697, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.39,0.35,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.5,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.04,0.51,"/",0.36,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.68,0.49,0.12,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.039984, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.77,0.51,0.72,0.74,0.78,0.48,"/")));
        org.junit.Assert.assertEquals( (double) 1.6250000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.74,"*",0.63,"*",0.3,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.36,0.48,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.13,0.84,"/",0.74,"*",0.16,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.58,0.57,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.33,0.64,0.96,0.61,0.24,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.44,0.56,0.56,0.0,0.44,"/")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.36,0.56,0.45,"/",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.37,"/",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.59,0.92,"-",0.07,0.83,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.69,0.52,"-",0.22,0.29,0.17,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.22,0.61,0.84,0.64,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.99,0.55,"/",0.74,0.67,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.22,0.14,0.96,"-",0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.06,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.56,0.95,"+",0.31,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.73,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.19,0.16,0.16,0.43,0.36,"/",0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.61,0.64,0.92,"*",0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.2,"-",0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.43,0.08,0.13,0.27,0.36,"*",0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.77,"/")));
        org.junit.Assert.assertEquals( (double) 1.025974025974026, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.01,0.7,0.73,"-","+")));
        org.junit.Assert.assertEquals( (double) -0.020000000000000025, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.73,0.83,"-",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.77,"+",0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.43,0.6,0.71,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.83,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.28,"+",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.06,0.06,"*",0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.51,"*",0.96,0.75,0.98,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.86,0.69,0.02,0.87,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.04,"-",0.74,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.79,"/",0.36,"+",0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.86,0.42,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.6,"/",0.08,0.95,"+",0.43,"/")));
        org.junit.Assert.assertEquals( (double) 2.3953488372093026, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.64,"-",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.72,0.97,"/",0.18,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.04123711340206186, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.3,0.19,"-",0.63,"+","+",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.86,0.5,0.46,0.52,0.56,0.63,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.31,"/")));
        org.junit.Assert.assertEquals( (double) 0.03225806451612903, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.54,0.55,"/",0.65,0.75,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.73,0.4,"-")));
        org.junit.Assert.assertEquals( (double) 0.32999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.3,"-")));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.0,0.74,0.21,"+","-",0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.4,0.16,0.5,"+",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.72,0.6,0.6,"/","-",0.52,"+")));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.58,0.87,"-",0.46,"/",0.93,"-")));
        org.junit.Assert.assertEquals( (double) -1.5604347826086957, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.37,0.06,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.54,0.27,0.25,"+","+",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.98,"-",0.55,0.09,0.22,0.31,"*")));
        org.junit.Assert.assertEquals( (double) 0.0682, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.12,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.65,0.55,0.42,"/",0.94,0.26,"+")));
        org.junit.Assert.assertEquals( (double) 1.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.15,0.02,0.74,"+",0.42,0.41,"-")));
        org.junit.Assert.assertEquals( (double) 0.010000000000000009, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.53,"+")));
        org.junit.Assert.assertEquals( (double) 1.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.48,0.29,"+",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.49,0.1,0.76,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.97,"*",0.94,"*")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.17,"-",0.18,0.21,0.35,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.12,"/",0.62,"+",0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.64,0.74,"-")));
        org.junit.Assert.assertEquals( (double) -0.09999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.47,0.1,0.57,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.42,0.67,"+",0.18,0.71,"+")));
        org.junit.Assert.assertEquals( (double) 0.8899999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.42,0.04,0.47,0.27,"/",0.33,"/")));
        org.junit.Assert.assertEquals( (double) 5.274971941638607, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.1,0.12,"/")));
        org.junit.Assert.assertEquals( (double) 0.8333333333333334, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.46,"*",0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.87,0.74,"*")));
        org.junit.Assert.assertEquals( (double) 0.6438, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.96,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.28,0.61,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.54,"*")));
        org.junit.Assert.assertEquals( (double) 0.2916, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.12,0.96,0.12,0.3,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.13,0.99,0.04,"-")));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.86,0.87,0.85,"-")));
        org.junit.Assert.assertEquals( (double) 0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.63,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.64,"*")));
        org.junit.Assert.assertEquals( (double) 0.6208, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.72,0.95,"/",0.96,0.43,"*",0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.75,0.91,"/","/",0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.96,0.66,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.74,0.28,0.9,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.13,0.81,0.46,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.72,"*",0.79,"+",0.76,0.94,"-")));
        org.junit.Assert.assertEquals( (double) -0.17999999999999994, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.13,0.92,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.51,0.71,0.3,0.48,0.99,0.23,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.68,0.02,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.84,0.84,"*",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.75,"*")));
        org.junit.Assert.assertEquals( (double) 0.615, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.2,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.99,"/",0.11,0.87,0.93,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.11758620689655173, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.31,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.33,0.3,0.49,0.84,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.77,0.4,0.27,"+")));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.03,0.43,"+",0.49,0.01,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.46,0.49,0.85,"-","+",0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.2,"+",0.42,"-",0.43,0.64,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.76,0.43,0.05,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.98,0.58,0.49,"*","/")));
        org.junit.Assert.assertEquals( (double) 3.448275862068966, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.26,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.47,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.46,"*",0.82,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.26,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.75,0.92,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.23,0.67,0.92,1.0,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.27,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.6,0.28,0.59,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.11,"*",0.01,"+")));
        org.junit.Assert.assertEquals( (double) 0.0144, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.75,"/",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.62,"*")));
        org.junit.Assert.assertEquals( (double) 0.5456, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.86,"/",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.05,0.32,0.9,0.82,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.04,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.42,0.96,0.64,0.2,"+")));
        org.junit.Assert.assertEquals( (double) 0.8400000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.79,0.8,0.07,"+",0.01,"+")));
        org.junit.Assert.assertEquals( (double) 0.8800000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.44,"-",0.94,"*",0.51,"-")));
        org.junit.Assert.assertEquals( (double) -0.13400000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.28,0.28,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.76,0.47,"-",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.57,"+",0.89,0.14,"+")));
        org.junit.Assert.assertEquals( (double) 1.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.24,0.59,"/","-")));
        org.junit.Assert.assertEquals( (double) -0.10677966101694919, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.92,0.7,0.18,0.12,"-","*")));
        org.junit.Assert.assertEquals( (double) 0.041999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.24,0.75,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.59,"*",0.58,"/")));
        org.junit.Assert.assertEquals( (double) 0.20344827586206896, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.23,0.26,0.61,0.74,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.12,0.36,0.5,"*",0.1,"-",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.17,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.9,0.7,0.45,0.81,"-","/")));
        org.junit.Assert.assertEquals( (double) -1.9444444444444442, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.17,"+",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.07,0.22,"*",0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.4,0.63,0.16,0.72,0.47,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.23,0.7,0.84,0.72,0.13,"/","-")));
        org.junit.Assert.assertEquals( (double) -4.6984615384615385, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.99,0.95,0.46,"/")));
        org.junit.Assert.assertEquals( (double) 2.0652173913043477, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.08,0.84,0.96,"*",0.35,0.79,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.43,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.41,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.76,0.52,0.22,0.98,"*")));
        org.junit.Assert.assertEquals( (double) 0.21559999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.17,0.82,0.51,0.81,"/","*",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.52,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.52,"*",0.83,0.68,"*")));
        org.junit.Assert.assertEquals( (double) 0.5644, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.08,0.71,0.97,"-","-")));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.76,0.61,0.6,"*",0.82,0.06,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.05,"-",0.62,0.55,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.75,"+")));
        org.junit.Assert.assertEquals( (double) 1.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.93,0.36,"-",0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.09,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.56,0.57,"+","/",0.62,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.97,0.82,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.4772399999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.85,"*")));
        org.junit.Assert.assertEquals( (double) 0.034, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.02,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.67,"+")));
        org.junit.Assert.assertEquals( (double) 1.6600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.94,0.43,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.08,"-",0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.22,"*",0.14,0.17,0.67,"+")));
        org.junit.Assert.assertEquals( (double) 0.8400000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.84,0.24,0.48,0.44,0.9,"/")));
        org.junit.Assert.assertEquals( (double) 0.4888888888888889, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.37,"-",0.61,0.31,0.27,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.1,0.77,0.44,"*","/")));
        org.junit.Assert.assertEquals( (double) 0.295159386068477, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.56,0.01,"-",0.26,"*",0.0,"+")));
        org.junit.Assert.assertEquals( (double) 0.14300000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.15,0.67,0.05,"/",0.47,"-",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.25,"/",0.87,0.92,"*",0.33,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.34,0.37,0.54,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.87,0.53,"*")));
        org.junit.Assert.assertEquals( (double) 0.4611, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.47,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.41,"+",0.07,0.97,"+")));
        org.junit.Assert.assertEquals( (double) 1.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.67,0.53,0.02,"-",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.95,"-",0.27,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.74,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.27,"/",0.27,0.34,"/")));
        org.junit.Assert.assertEquals( (double) 0.7941176470588235, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.94,"-",0.7,0.78,"-")));
        org.junit.Assert.assertEquals( (double) -0.08000000000000007, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.37,"*",0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.99,0.97,"-",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.76,0.53,0.24,"/",0.59,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.07,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.88,0.95,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.82,"/",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.33,0.11,0.8,0.68,"-","+","*")));
        org.junit.Assert.assertEquals( (double) 0.0759, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.13,"*",0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.1,0.42,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.08,0.21,"*","/",0.04,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.36,"/",0.84,0.01,0.55,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.72,0.59,"*")));
        org.junit.Assert.assertEquals( (double) 0.42479999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.1,"+",0.38,"/",0.88,0.85,"*")));
        org.junit.Assert.assertEquals( (double) 0.748, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.13,0.39,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.4264, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.55,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.68,0.88,0.64,"-",0.09,0.51,"+")));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.32,0.99,0.89,"/","*",0.93,"+")));
        org.junit.Assert.assertEquals( (double) 1.2859550561797755, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.39,"+")));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.73,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.85,"+",0.0,"+",0.56,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.55,0.69,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.74,0.18,0.88,"*",0.31,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.93,0.13,"-")));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.52,0.44,"*",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.64,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.94,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.98,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.28,0.4,0.74,0.97,"+")));
        org.junit.Assert.assertEquals( (double) 1.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.96,0.5,0.41,"-",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.28,0.9,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.06,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.2,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.33,"+",0.16,"-",0.98,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.97,"-",0.97,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.98,0.19,"/",0.13,0.98,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.41,0.74,"-",0.85,"+",0.46,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.23,0.73,0.54,0.17,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.09,0.97,0.04,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.8,0.64,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.66,"+",0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.25,"/",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.64,0.13,"-",0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.9,0.98,0.24,0.03,0.4,0.97,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.46,0.64,"/",0.36,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.22,0.46,0.46,"-",0.05,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.12,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.78,"+",0.9,0.77,0.77,"+","*")));
        org.junit.Assert.assertEquals( (double) 1.3860000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.9,0.92,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.1,0.55,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.48,0.93,0.62,0.21,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.04,0.73,"/")));
        org.junit.Assert.assertEquals( (double) 0.05479452054794521, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.88,0.98,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.71,0.36,0.67,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.67,"+")));
        org.junit.Assert.assertEquals( (double) 1.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.27,0.46,0.67,0.99,0.31,"/","+")));
        org.junit.Assert.assertEquals( (double) 3.863548387096774, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.46,"-",0.67,0.72,"-")));
        org.junit.Assert.assertEquals( (double) -0.04999999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.85,0.24,0.99,"+")));
        org.junit.Assert.assertEquals( (double) 1.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.2,"*",0.94,"/")));
        org.junit.Assert.assertEquals( (double) 0.14042553191489363, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.37,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.41,0.7,0.45,"/","+",0.76,"+")));
        org.junit.Assert.assertEquals( (double) 2.7255555555555553, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.34,"-",0.68,0.9,"-",0.34,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.67,0.5,0.03,"+",0.42,0.54,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.2,0.05,0.24,"/",0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.53,0.07,"-",0.24,"/","/",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.89,0.62,0.46,0.91,0.96,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.61,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.41,0.42,0.06,"+",0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.47,"/",0.84,0.18,"+",0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,1.0,0.63,"-",0.94,"-")));
        org.junit.Assert.assertEquals( (double) -0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.71,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.75,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.99,1.0,0.22,"-",0.62,"/","*")));
        org.junit.Assert.assertEquals( (double) 1.2454838709677418, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.77,"-",0.73,0.98,0.35,"/")));
        org.junit.Assert.assertEquals( (double) 2.8000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.37,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.82,0.07,0.34,"*",0.45,"+",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.94,0.68,0.73,0.86,"*",0.94,"+")));
        org.junit.Assert.assertEquals( (double) 1.5678, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.54,"+",0.61,"/",0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.31,"-",0.36,"+",0.71,"*",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.49,"/",0.16,0.54,0.71,"-","+")));
        org.junit.Assert.assertEquals( (double) -0.009999999999999926, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.91,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.46,0.4,0.94,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.9,"/")));
        org.junit.Assert.assertEquals( (double) 0.37777777777777777, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.06,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.13,0.13,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.71,"-",0.51,"-",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.64,"*",0.3,"-",0.23,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.1,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.4,0.94,0.22,"*")));
        org.junit.Assert.assertEquals( (double) 0.20679999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.33,"*",0.45,0.45,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.05,0.15,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.01,"*",0.85,0.7,0.93,0.81,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.01,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.79,0.42,"+","+",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.4,0.14,0.44,"*",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.29,0.68,"*",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.79,0.63,0.14,"*",0.55,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.3282, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.33,0.02,0.56,"*",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.78,0.92,0.54,"*",0.55,0.96,"+")));
        org.junit.Assert.assertEquals( (double) 1.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.38,"*")));
        org.junit.Assert.assertEquals( (double) 0.2964, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.56,0.23,0.73,"-")));
        org.junit.Assert.assertEquals( (double) -0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.66,"-",0.5,0.19,0.86,"+",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.53,"+")));
        org.junit.Assert.assertEquals( (double) 1.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.59,"*",0.92,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.19,"*",0.7,0.63,0.55,0.68,"*")));
        org.junit.Assert.assertEquals( (double) 0.37400000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.41,0.7,0.41,"+","/",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.32,"/",0.24,0.84,0.69,0.99,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.08,0.73,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.15,0.56,0.85,"-",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.69,"-",0.38,0.82,"/")));
        org.junit.Assert.assertEquals( (double) 0.4634146341463415, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.82,0.93,0.79,0.1,"+")));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.51,0.54,"+")));
        org.junit.Assert.assertEquals( (double) 1.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.03,"-",0.75,0.07,"*")));
        org.junit.Assert.assertEquals( (double) 0.052500000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.49,1.0,"-",0.36,0.9,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.2,"-",0.07,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.25,0.92,0.76,0.56,0.61,"/")));
        org.junit.Assert.assertEquals( (double) 0.918032786885246, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.62,0.38,0.92,0.17,"*",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.15,"+",0.22,0.38,0.72,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.07479999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,1.0,"/",0.7,0.6,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.7666666666666666, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.02,0.42,0.65,0.79,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.27999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.07,"+",0.19,"/",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.64,"-")));
        org.junit.Assert.assertEquals( (double) -0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.91,0.52,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.15,0.4,"/",0.05,0.13,0.97,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.49,0.12,"*",0.47,"*")));
        org.junit.Assert.assertEquals( (double) 0.027635999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.88,0.55,0.0,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.78,0.6,"/",0.19,"-","+")));
        org.junit.Assert.assertEquals( (double) 1.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.2,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.56,0.95,"+")));
        org.junit.Assert.assertEquals( (double) 1.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.29,"-",0.77,"*",0.4,"-")));
        org.junit.Assert.assertEquals( (double) -0.39230000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.48,"*")));
        org.junit.Assert.assertEquals( (double) 0.0768, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.49,"+")));
        org.junit.Assert.assertEquals( (double) 0.8999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.75,"-",0.15,0.71,"*","+")));
        org.junit.Assert.assertEquals( (double) -0.23350000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.83,0.28,0.86,0.59,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.89,0.49,0.72,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.7355371900826446, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.36,0.03,0.7,"-","+",0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.16,"-",0.31,0.94,"+")));
        org.junit.Assert.assertEquals( (double) 1.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.75,0.53,"+","+",0.54,"+",0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.26,0.68,0.53,"-")));
        org.junit.Assert.assertEquals( (double) 0.15000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.25,"*",0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.99,0.87,"-",0.52,"+")));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.81,0.91,0.79,0.67,0.14,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.51,"*",0.61,"-",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.53,0.45,"*")));
        org.junit.Assert.assertEquals( (double) 0.23850000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.57,0.62,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.028272, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.02,0.99,0.65,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.36,0.8,"+",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.09,"-",0.77,0.96,"+",0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.33,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.26,0.69,0.09,0.46,"+",0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.76,"/")));
        org.junit.Assert.assertEquals( (double) 0.5657894736842105, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.35,"*",0.12,"-",0.33,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.42,"-")));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.46,0.55,0.27,0.78,"-",0.63,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.46,"/")));
        org.junit.Assert.assertEquals( (double) 0.45652173913043476, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.78,0.39,"*",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.19,0.91,0.56,"/",0.04,0.79,"/")));
        org.junit.Assert.assertEquals( (double) 0.05063291139240506, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.83,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.41,"*",0.71,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.86,0.47,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.78,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.56,0.48,"+","*",0.68,"/",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.36,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.29,0.18,"-",0.53,"-")));
        org.junit.Assert.assertEquals( (double) -0.42000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.72,0.92,"/")));
        org.junit.Assert.assertEquals( (double) 0.7826086956521738, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.8,0.06,0.67,0.05,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.89,0.6,0.84,0.66,0.2,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.03,0.43,0.42,0.1,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.14,0.14,"*",0.91,0.65,0.88,"+")));
        org.junit.Assert.assertEquals( (double) 1.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.1,0.69,0.72,"+",0.76,"-")));
        org.junit.Assert.assertEquals( (double) 0.6499999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.58,"/",0.13,0.08,"*","+",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.39,0.9,"*","+",0.38,"/",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.58,0.9,0.02,0.82,0.99,0.66,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.34,0.1,0.32,0.3,0.65,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.84,0.75,0.46,0.56,0.91,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.35,0.36,"-",0.16,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.56,"+")));
        org.junit.Assert.assertEquals( (double) 0.8700000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.89,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.45,0.54,0.39,0.09,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.018954000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.91,0.22,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.01,"+")));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.68,"*",0.49,"+",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.17,"-",0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.24,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.55,0.34,0.03,0.22,"+","*",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.81,"*",0.39,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.25,0.73,0.31,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.41,0.39,0.06,"/","/","/")));
        org.junit.Assert.assertEquals( (double) 5.548780487804879, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.64,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.3,0.8,"*",0.27,"+")));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.74,"*")));
        org.junit.Assert.assertEquals( (double) 0.2516, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.69,0.31,"/")));
        org.junit.Assert.assertEquals( (double) 2.225806451612903, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.04,"*",0.58,0.66,"-",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.26,"/",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.51,"*",0.83,0.35,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.83,0.37,"-",0.34,"-")));
        org.junit.Assert.assertEquals( (double) 0.11999999999999994, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.32,0.39,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.65,0.7,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.8485714285714288, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.12,"+",0.63,"-")));
        org.junit.Assert.assertEquals( (double) -0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.7,0.18,0.14,"*","*","-")));
        org.junit.Assert.assertEquals( (double) 0.90236, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.41,0.98,"/",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.13,0.78,"*",0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.69,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.95,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.1,0.41,0.74,0.18,0.42,"-","-")));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.51,"/",0.15,"-")));
        org.junit.Assert.assertEquals( (double) 1.5558823529411765, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.29,0.84,0.11,0.12,"+","/",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.55,0.4,0.96,0.19,"-",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.4,0.92,"+",0.98,"/")));
        org.junit.Assert.assertEquals( (double) 1.3469387755102042, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.62,0.84,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.62,0.95,0.64,"-","/","+",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.5,"-")));
        org.junit.Assert.assertEquals( (double) -0.33999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.21,"+",0.4,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.89,0.63,0.76,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.78,0.95,0.97,"*")));
        org.junit.Assert.assertEquals( (double) 0.9215, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.26,0.16,"-",0.74,0.74,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.86,0.93,"/",0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.06,"/",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.8,0.76,0.16,0.52,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.32,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.78,"+",0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.57,"/",0.33,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.61,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.33,0.58,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.13,"+",0.27,0.31,"+")));
        org.junit.Assert.assertEquals( (double) 0.5800000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.83,0.11,0.61,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.61,0.33,0.03,0.25,"/",0.54,"-")));
        org.junit.Assert.assertEquals( (double) -0.42000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.2,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.53,"/",0.6,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.71,0.82,0.82,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.02,"-",0.92,0.54,0.46,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.69,0.16,"-")));
        org.junit.Assert.assertEquals( (double) 0.5299999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.62,"+")));
        org.junit.Assert.assertEquals( (double) 1.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.85,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.18,0.03,"*",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.0,"*")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.96,0.92,0.44,0.38,"+",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.64,0.45,0.4,"-","/",0.41,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.45,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.12,"+")));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.3,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.87,0.19,0.74,0.54,0.79,0.6,"*")));
        org.junit.Assert.assertEquals( (double) 0.474, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.89,0.89,0.99,0.01,"*",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.61,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.66,0.9,"*",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.96,0.32,0.31,"*",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.85,"*",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.88,0.5,0.22,0.31,"/",0.46,"-")));
        org.junit.Assert.assertEquals( (double) 0.24967741935483873, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.15,0.02,"*",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.37,0.46,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.37,0.63,0.39,"-")));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.42,0.2,0.54,0.11,0.83,"-",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.44,0.21,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.49,0.6,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.92,"/",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.89,"-",0.93,0.26,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.95,0.36,"/")));
        org.junit.Assert.assertEquals( (double) 2.638888888888889, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.52,0.55,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.27,"+",0.33,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.99,0.58,0.55,"-")));
        org.junit.Assert.assertEquals( (double) 0.029999999999999916, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.67,0.99,0.77,"-")));
        org.junit.Assert.assertEquals( (double) 0.21999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.06,0.36,0.39,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.64,"+",0.44,0.98,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.9,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.61,"-")));
        org.junit.Assert.assertEquals( (double) 0.08999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.87,"-",0.37,"+",0.65,0.3,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.97,0.06,0.57,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.14,0.04,0.9,"-")));
        org.junit.Assert.assertEquals( (double) -0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.5,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.34,0.93,0.83,"+","+",0.37,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.42,"*",0.09,0.16,"/","+")));
        org.junit.Assert.assertEquals( (double) 0.8229, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.69,0.8,"+","/",0.14,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.2,0.89,"*",0.37,0.81,"-",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.17,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.97,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.12,"-",0.93,0.62,0.4,"+",0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.01,0.26,"*",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.44,1.0,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.58,0.88,0.26,0.4,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.93,"/",0.29,"*",0.6,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.32,0.04,0.89,0.95,"+")));
        org.junit.Assert.assertEquals( (double) 1.8399999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.7,0.34,0.45,"-",0.92,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.46,0.08,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.02,0.9,"*",0.52,"+")));
        org.junit.Assert.assertEquals( (double) 0.538, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.6,"*",0.13,0.96,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.61,0.67,"-",0.69,0.75,0.66,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.62,0.3,1.0,0.18,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.98,0.19,"*",0.65,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.1976584615384615, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.7,0.28,0.56,"+",0.15,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.57,0.92,0.86,0.5,"-",0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.08,"-")));
        org.junit.Assert.assertEquals( (double) 0.7100000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.9,0.08,"/",0.88,0.71,0.76,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.53,"-")));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.46,0.47,0.17,"/",0.01,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.34,0.46,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.39,0.31,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.56,0.6,0.72,0.44,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.07,"*")));
        org.junit.Assert.assertEquals( (double) 0.042, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.34,0.89,0.43,0.75,"+","+",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.84,0.85,"/")));
        org.junit.Assert.assertEquals( (double) 0.9882352941176471, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.59,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.36,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.92,"-")));
        org.junit.Assert.assertEquals( (double) -0.2300000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.47,"+")));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.61,0.97,"+",0.56,0.55,"*")));
        org.junit.Assert.assertEquals( (double) 0.30800000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.46,0.7,0.48,0.97,"/",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.3,0.07,0.05,"*")));
        org.junit.Assert.assertEquals( (double) 0.0035000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.82,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.06,"-",0.99,0.93,"+")));
        org.junit.Assert.assertEquals( (double) 1.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.4,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.16,0.22,0.03,0.68,0.76,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.11,0.58,0.94,0.98,"+")));
        org.junit.Assert.assertEquals( (double) 1.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.37,"/")));
        org.junit.Assert.assertEquals( (double) 1.5675675675675675, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.64,"/",0.23,0.11,0.02,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.59,0.32,"*","/")));
        org.junit.Assert.assertEquals( (double) 4.343220338983051, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.17,0.49,"/",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.46,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.66,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.65,0.13,"/",0.29,0.19,"/")));
        org.junit.Assert.assertEquals( (double) 1.526315789473684, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.83,"/",0.07,"*",0.89,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1000() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.19,"-",0.69,"+",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1001() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.45,0.62,0.85,0.34,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1002() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.29,0.39,0.97,"+")));
        org.junit.Assert.assertEquals( (double) 1.3599999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1003() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.25,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1004() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1005() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.68,"+",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1006() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.8,0.38,"-")));
        org.junit.Assert.assertEquals( (double) 0.42000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1007() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.62,"+",0.21,"+",0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1008() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.27,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1009() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.37,0.94,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1010() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1011() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.72,0.53,"-",0.05,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1012() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1013() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.45,"*")));
        org.junit.Assert.assertEquals( (double) 0.216, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1014() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.3,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1015() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.96,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1016() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.92,0.33,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1017() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1018() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.13,"*",0.5,"+")));
        org.junit.Assert.assertEquals( (double) 0.6144000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1019() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1020() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1021() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.33,0.32,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1022() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1023() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.02,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1024() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1025() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.12,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1026() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.04,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1027() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.44,0.77,0.87,"+",0.78,0.91,"-")));
        org.junit.Assert.assertEquals( (double) -0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1028() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.08,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1029() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.52,0.34,0.22,0.74,0.92,"/")));
        org.junit.Assert.assertEquals( (double) 0.8043478260869564, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1030() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.56,"+",0.34,0.7,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1031() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.96,"+",0.86,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1032() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.13,0.66,0.64,0.04,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1033() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.67,"/",0.66,0.35,0.38,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.4818, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1034() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1035() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.92,0.03,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1036() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.64,"-",0.76,0.72,0.7,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1037() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.71,0.54,"/","*",0.64,"-")));
        org.junit.Assert.assertEquals( (double) 0.6616666666666665, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1038() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.28,0.48,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1039() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1040() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.13,0.7,0.42,0.56,0.01,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1041() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.51,0.2,0.52,0.2,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1042() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1043() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.32,"/",0.68,"-")));
        org.junit.Assert.assertEquals( (double) 0.47624999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1044() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.23,"+")));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1045() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.29,0.11,"/")));
        org.junit.Assert.assertEquals( (double) 2.6363636363636362, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1046() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.22,0.97,"/")));
        org.junit.Assert.assertEquals( (double) 0.2268041237113402, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1047() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.16,"-")));
        org.junit.Assert.assertEquals( (double) -0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1048() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1049() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.28,0.01,0.37,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1050() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.77,0.14,"+",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1051() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1052() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1053() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.14,0.56,"*",0.69,"*",0.11,"+")));
        org.junit.Assert.assertEquals( (double) 0.16409600000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1054() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.95,"*")));
        org.junit.Assert.assertEquals( (double) 0.9405, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1055() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.04,0.72,"/")));
        org.junit.Assert.assertEquals( (double) 0.05555555555555556, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1056() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.03,0.41,"+","-",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1057() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.75,0.71,"/",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1058() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.18,0.13,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1059() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.56,"/",0.63,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1060() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.26,0.39,0.12,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.8450000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1061() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.55,"/",0.9,"/",0.85,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1062() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1063() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.05,0.51,"-",0.63,"-",0.28,"+")));
        org.junit.Assert.assertEquals( (double) -0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1064() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.97,0.87,0.24,0.34,0.35,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1065() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1066() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.25,0.59,0.67,"-")));
        org.junit.Assert.assertEquals( (double) -0.08000000000000007, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1067() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.67,0.2,"+",0.02,0.94,0.39,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1068() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.81,0.09,"/")));
        org.junit.Assert.assertEquals( (double) 9.000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1069() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.99,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1070() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.25,"+",0.2,0.0,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1071() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.45,0.8,"-",0.66,0.1,"*")));
        org.junit.Assert.assertEquals( (double) 0.066, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1072() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.24,0.75,0.22,0.58,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1073() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.48,0.15,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1074() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.34,0.23,0.31,0.22,"+","/","+")));
        org.junit.Assert.assertEquals( (double) 0.7739622641509434, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1075() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.23,0.01,0.32,0.26,"*")));
        org.junit.Assert.assertEquals( (double) 0.08320000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1076() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.57,0.9,"+")));
        org.junit.Assert.assertEquals( (double) 1.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1077() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.34,0.99,0.45,"+")));
        org.junit.Assert.assertEquals( (double) 1.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1078() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.94,0.61,0.71,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1079() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.72,"+")));
        org.junit.Assert.assertEquals( (double) 1.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1080() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1081() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.06,0.42,"-",0.98,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1082() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.4,0.56,"-",0.19,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1083() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1084() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.89,0.62,"/",0.97,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1085() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.62,0.22,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1086() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1087() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.45,"-",0.48,0.23,"*",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1088() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1089() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.44,0.01,"-",0.38,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1090() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.82,0.4,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1091() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.5,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1092() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.58,0.86,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.35913599999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1093() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.35,0.49,"+",0.49,"+")));
        org.junit.Assert.assertEquals( (double) 1.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1094() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.78,"/")));
        org.junit.Assert.assertEquals( (double) 0.9102564102564101, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1095() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.29,0.84,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1096() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1097() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.86,"-")));
        org.junit.Assert.assertEquals( (double) -0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1098() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.91,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1099() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.05,0.6,0.8,0.98,"-","+","*")));
        org.junit.Assert.assertEquals( (double) 0.021000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1100() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.91,"/",0.42,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1101() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.6,"+",0.03,0.86,0.37,0.06,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1102() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.2,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1103() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.88,"/")));
        org.junit.Assert.assertEquals( (double) 0.5113636363636364, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1104() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.3,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1105() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.24,"+")));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1106() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.24,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1107() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.71,0.58,0.27,0.0,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1108() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1109() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.35,0.56,0.15,0.6,0.49,0.56,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1110() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.29,"*",0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1111() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1112() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1113() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.6,"*",0.57,0.85,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1114() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.71,"*",0.95,0.02,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1115() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.59,0.25,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1116() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.65,"+",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1117() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1118() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.02,0.02,"+")));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1119() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.77,"*",0.77,0.3,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1120() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.45,"+",0.3,0.62,0.75,0.74,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1121() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.65,"*",0.81,"*",0.88,"+",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1122() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.89,0.92,0.21,0.1,"*",0.81,"*")));
        org.junit.Assert.assertEquals( (double) 0.01701, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1123() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.21,"+")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1124() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1125() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.51,0.27,0.21,"+",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1126() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.41,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1127() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.06,0.71,0.97,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1128() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.28,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1129() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.85,0.09,0.59,"*",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1130() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.95,0.35,0.76,0.33,"-",0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1131() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.77,0.14,0.31,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1132() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.97,"/",0.46,0.06,0.73,"/",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1133() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.9,"-")));
        org.junit.Assert.assertEquals( (double) -0.41000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1134() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.3,0.0,0.75,1.0,"+","-",0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1135() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1136() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1137() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1138() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.18,0.45,"/",0.0,0.12,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1139() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.62,0.59,0.26,0.55,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1140() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.38,0.03,"-",0.25,"-","-")));
        org.junit.Assert.assertEquals( (double) 0.030000000000000027, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1141() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.22,0.63,0.24,"-",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1142() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1143() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.29,0.46,"+")));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1144() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.6,0.95,"-","+",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1145() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.0,0.35,0.48,0.1,0.61,0.96,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1146() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.26,0.1,"/")));
        org.junit.Assert.assertEquals( (double) 2.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1147() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.34,"+")));
        org.junit.Assert.assertEquals( (double) 1.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1148() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.63,"*",0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1149() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1150() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.37,"/",0.22,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1151() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.71,0.67,0.74,0.22,"+")));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1152() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.65,"-",0.68,0.84,0.88,"+")));
        org.junit.Assert.assertEquals( (double) 1.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1153() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.39,0.64,"+",0.09,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1154() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.91,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1155() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.64,0.15,"-","/",0.04,0.75,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1156() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.34,0.07,"/")));
        org.junit.Assert.assertEquals( (double) 4.857142857142857, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1157() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1158() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.64,"-",0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1159() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1160() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.83,0.29,0.21,0.18,"*")));
        org.junit.Assert.assertEquals( (double) 0.0378, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1161() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.6,0.45,0.19,"*")));
        org.junit.Assert.assertEquals( (double) 0.0855, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1162() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1163() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.12,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1164() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,1.0,0.39,"*")));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1165() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.42,"+",0.77,0.72,0.85,0.23,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1166() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.23,0.18,"*",0.97,0.58,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1167() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.73,0.37,0.02,0.98,0.29,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1168() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.79,0.65,0.61,"+","-",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1169() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1170() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.15,0.14,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1171() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.31,0.59,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1172() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.83,"+",0.39,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1173() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.74,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1174() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.34,"+",0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1175() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.03,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1176() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.3,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1177() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.29,"/")));
        org.junit.Assert.assertEquals( (double) 0.4482758620689656, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1178() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.17,0.3,0.42,"*",0.69,0.46,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1179() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.45,0.01,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1180() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.68,0.93,0.53,0.79,0.93,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1181() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1182() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.08,0.65,"+",0.06,0.89,"/")));
        org.junit.Assert.assertEquals( (double) 0.06741573033707865, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1183() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.2,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1184() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.73,"*",0.11,"-")));
        org.junit.Assert.assertEquals( (double) 0.3572, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1185() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.96,0.86,"*",0.88,"-",0.89,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1186() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.82,"/",0.96,0.87,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1187() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.74,"*")));
        org.junit.Assert.assertEquals( (double) 0.42179999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1188() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.11,"/")));
        org.junit.Assert.assertEquals( (double) 8.454545454545455, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1189() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.52,"*")));
        org.junit.Assert.assertEquals( (double) 0.2028, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1190() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.97,0.87,0.77,0.7,0.58,"-",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1191() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.13,0.42,"*","/")));
        org.junit.Assert.assertEquals( (double) 7.692307692307692, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1192() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.23,"/",0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1193() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.33,0.95,"+",0.97,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1194() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.98,0.1,0.92,0.86,0.97,"*",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1195() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.71,0.88,0.45,"-","/")));
        org.junit.Assert.assertEquals( (double) 1.6511627906976745, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1196() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.99,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1197() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1198() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1199() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.53,0.91,0.02,0.99,"+",0.28,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1200() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.02,0.57,0.09,0.91,0.87,0.23,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1201() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.44,0.52,0.36,"-","-",0.88,"-")));
        org.junit.Assert.assertEquals( (double) -0.6000000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1202() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.29,0.56,0.08,0.2,"/",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1203() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.01,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1204() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1205() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.15,0.08,0.69,0.66,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1206() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.74,0.72,"*",0.69,0.92,"/")));
        org.junit.Assert.assertEquals( (double) 0.7499999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1207() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.37,0.32,0.65,0.89,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1208() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.44,"+")));
        org.junit.Assert.assertEquals( (double) 1.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1209() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.54,"*",0.14,"*",0.89,"+",0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1210() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.04,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1211() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.75,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1212() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.95,0.62,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1213() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.21,0.27,"/",0.67,0.09,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1214() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1215() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.83,"+")));
        org.junit.Assert.assertEquals( (double) 1.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1216() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.65,0.38,"*",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1217() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.9,0.0,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1218() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.13,0.56,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1219() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.22,"/",0.53,"/",0.6,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1220() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.64,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1221() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.05,0.96,0.32,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1222() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.58,0.91,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1223() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.68,0.92,"-",0.1,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1224() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.93,"/")));
        org.junit.Assert.assertEquals( (double) 1.053763440860215, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1225() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.91,0.86,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1226() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.73,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1227() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.38,0.62,"*",0.72,"+",0.32,"-")));
        org.junit.Assert.assertEquals( (double) 0.6355999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1228() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.52,"+",0.27,0.96,"-",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1229() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.66,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1230() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.51,0.39,"/","-",0.72,"-")));
        org.junit.Assert.assertEquals( (double) -1.7276923076923076, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1231() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1232() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.11,0.63,0.99,"-","/",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1233() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.18,0.66,0.38,0.4,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.8461538461538461, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1234() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.48,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1235() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.2,"*",0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1236() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.27,0.75,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1237() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.17,"*",0.75,0.99,"+",0.41,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1238() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1239() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.35,0.52,0.83,0.03,0.98,"+")));
        org.junit.Assert.assertEquals( (double) 1.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1240() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1241() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.75,"*")));
        org.junit.Assert.assertEquals( (double) 0.615, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1242() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.75,0.58,"*",0.07,0.47,0.21,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1243() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.31,0.2,0.32,"/","-",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1244() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.95,"/")));
        org.junit.Assert.assertEquals( (double) 0.031578947368421054, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1245() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.71,0.26,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1246() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.83,0.58,0.51,"*")));
        org.junit.Assert.assertEquals( (double) 0.2958, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1247() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.73,0.66,"+",0.1,"-",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1248() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.37,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1249() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.58,0.22,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.5476, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1250() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.39,"/",0.7,"-",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1251() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1252() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.63,0.87,0.42,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1253() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.95,0.62,0.3,"*",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1254() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.41,0.99,"+",0.82,"/")));
        org.junit.Assert.assertEquals( (double) 1.7073170731707317, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1255() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1256() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.94,"+",0.78,"+")));
        org.junit.Assert.assertEquals( (double) 1.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1257() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.42,"*")));
        org.junit.Assert.assertEquals( (double) 0.315, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1258() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.17,0.84,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1259() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.77,"-",0.46,"+")));
        org.junit.Assert.assertEquals( (double) 0.49000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1260() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.22,"-",0.98,0.44,"-",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1261() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.72,0.99,0.84,0.53,0.98,0.6,"+")));
        org.junit.Assert.assertEquals( (double) 1.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1262() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.44,0.34,"*")));
        org.junit.Assert.assertEquals( (double) 0.1496, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1263() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.8,0.51,"-",0.58,0.34,0.77,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1264() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.91,0.52,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1265() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1266() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.77,"-",0.63,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1267() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.14,"-",0.92,0.41,0.73,0.41,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1268() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1269() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.23,"+",0.7,0.24,0.66,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1270() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1271() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.41,0.11,"+",0.66,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1272() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1273() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.32,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1274() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.68,0.17,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1275() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.78,"+")));
        org.junit.Assert.assertEquals( (double) 1.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1276() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.37,0.82,"/",0.63,0.66,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1277() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.48,0.68,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1278() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.75,0.83,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1279() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.8,"-",0.33,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1280() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.5,"*",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1281() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1282() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.14,0.31,0.85,0.14,0.28,"+")));
        org.junit.Assert.assertEquals( (double) 0.42000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1283() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.68,0.45,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1284() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.77,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1285() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1286() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.61,0.52,0.84,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1287() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.75,0.75,"-",0.01,"+")));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1288() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.3,0.43,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1289() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.58,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1290() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1291() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.47,"*",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1292() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.4,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1293() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.38,0.88,"+",0.45,0.46,"/")));
        org.junit.Assert.assertEquals( (double) 0.9782608695652174, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1294() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,1.0,"+",0.63,"*",0.05,"+",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1295() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.85,0.4,0.87,"-")));
        org.junit.Assert.assertEquals( (double) -0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1296() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.49,"+",0.09,0.68,0.18,"-",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1297() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.85,"-",0.73,0.32,0.49,0.38,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1298() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.52,0.91,"+",0.49,0.26,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1299() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.43,0.22,"*","-",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1300() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.6,"-",0.48,0.07,"*",0.45,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1301() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.6,0.1,"/",0.77,"/","-")));
        org.junit.Assert.assertEquals( (double) -7.232207792207792, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1302() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.14,"-",0.64,0.81,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1303() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.43,0.98,0.85,0.4,0.09,"-")));
        org.junit.Assert.assertEquals( (double) 0.31000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1304() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.24,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1305() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.01,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1306() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.43,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1307() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.2,0.1,0.34,"*","/",0.56,"/")));
        org.junit.Assert.assertEquals( (double) 10.504201680672267, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1308() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.15,0.45,0.88,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1309() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.2,"*",0.95,0.39,"*",0.73,"*")));
        org.junit.Assert.assertEquals( (double) 0.270465, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1310() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.72,"*")));
        org.junit.Assert.assertEquals( (double) 0.4824, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1311() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.71,"-",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1312() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.36,"-",0.58,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1313() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.52,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1314() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.91,"-",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1315() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.62,0.16,0.23,0.3,0.23,"*",0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1316() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.46,0.9,0.44,0.85,0.9,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1317() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.63,0.64,0.27,"*")));
        org.junit.Assert.assertEquals( (double) 0.1728, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1318() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.06,0.09,"-",0.84,"+")));
        org.junit.Assert.assertEquals( (double) 0.8099999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1319() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.43,"/",0.73,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1320() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.32,"+",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1321() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.72,0.11,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1322() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.09,"*",0.34,"+",0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1323() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.37,0.8,0.01,"+",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1324() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.02,0.38,0.83,0.67,0.01,"/")));
        org.junit.Assert.assertEquals( (double) 67.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1325() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.62,"/",0.27,"-",0.65,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1326() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.98,0.86,0.26,0.42,"/",0.51,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1327() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.4,0.22,0.41,0.6,0.35,0.61,"/")));
        org.junit.Assert.assertEquals( (double) 0.5737704918032787, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1328() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.24,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1329() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.91,0.31,"*")));
        org.junit.Assert.assertEquals( (double) 0.2821, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1330() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1331() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1332() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.94,0.49,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1333() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.78,0.34,0.94,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1334() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.92,0.86,0.15,"/")));
        org.junit.Assert.assertEquals( (double) 5.733333333333333, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1335() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.47,0.35,0.48,"*","+",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1336() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.21,"/",0.77,"/")));
        org.junit.Assert.assertEquals( (double) 2.2263450834879404, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1337() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.74,0.66,0.72,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1338() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.56,"+",0.2,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1339() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.96,0.08,0.74,0.71,"-","-",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1340() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,1.0,0.63,"/")));
        org.junit.Assert.assertEquals( (double) 1.5873015873015872, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1341() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.74,0.59,0.11,"/",0.36,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1342() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.97,0.25,"-",0.27,0.62,"*",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1343() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.96,0.5,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1344() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.93,"/",0.42,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1345() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.25,"-",0.32,0.47,0.83,0.39,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1346() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1347() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.91,0.59,0.95,"/",0.09,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1348() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.2,0.58,0.67,0.26,0.93,"/")));
        org.junit.Assert.assertEquals( (double) 0.27956989247311825, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1349() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1350() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.11,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1351() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.43,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1352() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1353() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1354() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.74,0.76,0.37,0.87,"+")));
        org.junit.Assert.assertEquals( (double) 1.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1355() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.71,0.81,"+")));
        org.junit.Assert.assertEquals( (double) 1.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1356() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.65,0.98,"*",0.7,0.56,"+")));
        org.junit.Assert.assertEquals( (double) 1.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1357() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1358() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.48,"+",0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1359() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.83,0.25,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1360() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.51,0.39,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1361() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.42,0.5,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1362() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.61,0.6,"+",0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1363() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.25,0.9,0.01,0.21,0.95,0.6,"/")));
        org.junit.Assert.assertEquals( (double) 1.5833333333333333, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1364() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.04,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1365() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.71,0.73,"+",0.45,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1366() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1367() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.05,0.48,0.28,"/",0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1368() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.1,1.0,0.51,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1369() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.63,0.85,0.22,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1370() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.25,"-",0.87,0.81,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1371() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.78,0.29,0.59,0.9,0.11,0.04,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1372() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.63,0.53,0.42,"*")));
        org.junit.Assert.assertEquals( (double) 0.2226, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1373() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.81,0.66,0.62,0.77,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1374() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1375() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.86,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1376() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.66,0.81,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1377() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1378() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.33,0.42,0.05,"-",0.86,"*","/")));
        org.junit.Assert.assertEquals( (double) 1.0370835952231303, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1379() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.23,0.28,"-","/",0.35,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1380() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1381() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.02,0.78,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.384, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1382() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.5,"-")));
        org.junit.Assert.assertEquals( (double) -0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1383() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.04,0.08,"+","*",0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1384() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.14,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1385() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1386() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.38,0.44,"+",0.75,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1387() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1388() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.63,"/",0.41,0.85,"*")));
        org.junit.Assert.assertEquals( (double) 0.3485, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1389() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1390() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.84,0.36,0.94,"-")));
        org.junit.Assert.assertEquals( (double) -0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1391() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.57,0.94,"-")));
        org.junit.Assert.assertEquals( (double) -0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1392() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.61,"/",0.91,"+",0.47,"*")));
        org.junit.Assert.assertEquals( (double) 0.8052409836065573, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1393() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1394() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.82,0.11,"-",0.69,"*")));
        org.junit.Assert.assertEquals( (double) 0.48989999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1395() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.05,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1396() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.69,"-",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1397() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.05,0.98,0.97,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1398() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1399() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.7,"/")));
        org.junit.Assert.assertEquals( (double) 0.942857142857143, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1400() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.62,0.7,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1401() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.33,"+",0.13,0.34,0.82,"/")));
        org.junit.Assert.assertEquals( (double) 0.41463414634146345, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1402() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.64,"/",0.3,0.08,"-")));
        org.junit.Assert.assertEquals( (double) 0.21999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1403() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.86,0.71,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1404() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.81,"/",0.49,"-",0.09,0.91,"+")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1405() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1406() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.24,0.53,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1407() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.6,0.5,"+",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1408() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.22,0.14,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1409() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.14,"-",0.48,0.75,"-",0.91,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1410() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.73,0.01,0.03,"-",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1411() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.75,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1412() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.91,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1413() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.37,0.63,0.53,0.96,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1414() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.7,"*",0.85,"/",0.26,"-",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1415() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1416() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.45,0.64,0.37,"/")));
        org.junit.Assert.assertEquals( (double) 1.7297297297297298, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1417() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.64,0.01,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1418() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.83,0.69,"*",0.3,"+",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1419() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.57,0.39,"+")));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1420() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.38,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1421() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.43,0.39,0.66,"-",0.4,"/")));
        org.junit.Assert.assertEquals( (double) -0.675, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1422() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.29,0.48,"-",0.99,0.71,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1423() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1424() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.41,0.24,0.48,"/")));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1425() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.62,0.83,"-",0.08,0.86,0.45,"*")));
        org.junit.Assert.assertEquals( (double) 0.387, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1426() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.37,"+",0.4,0.38,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.08056000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1427() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.09,"-",0.18,0.64,0.23,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.1566, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1428() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.55,0.51,0.52,0.53,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1429() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1430() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.57,0.4,0.31,"*",0.28,"+")));
        org.junit.Assert.assertEquals( (double) 0.404, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1431() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.33,0.68,0.18,"-",0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1432() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.6,0.03,"-")));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1433() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.61,0.07,0.21,"-",0.1,0.25,"-")));
        org.junit.Assert.assertEquals( (double) -0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1434() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.15,0.8,0.46,0.45,0.27,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.5815, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1435() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.86,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1436() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.17,"*")));
        org.junit.Assert.assertEquals( (double) 0.15130000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1437() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.09,0.14,0.73,"-",0.36,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1438() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1439() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.96,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1440() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.92,"-",0.08,"-")));
        org.junit.Assert.assertEquals( (double) -0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1441() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.16,0.13,0.66,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1442() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.23,"*",0.04,0.88,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1443() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1444() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.07,0.56,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1445() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1446() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.35,0.73,"+",0.43,0.83,"+")));
        org.junit.Assert.assertEquals( (double) 1.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1447() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.95,"/",0.54,0.33,0.68,"-",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1448() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.16,0.27,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1449() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.42,"/",0.45,0.75,0.25,"/",0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1450() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1451() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1452() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1453() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.85,0.08,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1454() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.31,0.59,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.23799999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1455() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1456() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.35,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1457() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.08,0.99,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1458() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.45,"*")));
        org.junit.Assert.assertEquals( (double) 0.17550000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1459() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1460() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.34,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1461() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.93,0.79,"/",0.76,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1462() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.34,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1463() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.47,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1464() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.13,"*",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1465() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.43,"/",0.57,0.19,"/","-")));
        org.junit.Assert.assertEquals( (double) -2.4418604651162785, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1466() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.02,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1467() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1468() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1469() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.25,0.5,"*")));
        org.junit.Assert.assertEquals( (double) 0.125, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1470() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.06,"/",0.09,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1471() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.15,0.11,0.95,0.48,0.13,0.29,"-")));
        org.junit.Assert.assertEquals( (double) -0.15999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1472() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.89,0.62,"/",0.13,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1473() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.04,0.05,"-","-",0.23,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1474() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.13,"-",0.69,0.42,0.96,0.83,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1475() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.23,0.54,0.43,"*",0.25,0.92,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1476() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.08,0.44,0.8,"*")));
        org.junit.Assert.assertEquals( (double) 0.35200000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1477() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.9,0.26,0.36,0.16,"/")));
        org.junit.Assert.assertEquals( (double) 2.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1478() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.21,0.46,0.31,0.98,0.47,"*","/")));
        org.junit.Assert.assertEquals( (double) 0.6730351715154147, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1479() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.51,0.55,"-")));
        org.junit.Assert.assertEquals( (double) -0.040000000000000036, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1480() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.39,"+",0.86,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1481() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.65,0.6,"+",0.73,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1482() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.92,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1483() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.19,"+",0.54,0.76,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1484() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.92,"/",0.43,"+")));
        org.junit.Assert.assertEquals( (double) 0.8321739130434782, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1485() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.88,0.21,"/")));
        org.junit.Assert.assertEquals( (double) 4.190476190476191, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1486() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.81,0.28,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1487() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.96,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1488() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.02,0.12,"*","-",0.58,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1489() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.98,"+",0.96,"/",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1490() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.46,"/",0.59,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1491() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.27,0.72,0.12,0.23,0.84,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1492() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.9,"-")));
        org.junit.Assert.assertEquals( (double) -0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1493() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.76,0.02,0.04,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1494() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.42,0.34,"-",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1495() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.83,0.22,"-",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1496() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.74,"-",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1497() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.73,0.26,"/")));
        org.junit.Assert.assertEquals( (double) 2.8076923076923075, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1498() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.19,0.67,"/")));
        org.junit.Assert.assertEquals( (double) 0.2835820895522388, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1499() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.24,0.61,0.64,0.23,"/","-",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1500() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.53,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1501() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.34,"-",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1502() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.83,"-",0.42,0.69,"-",0.5,"+")));
        org.junit.Assert.assertEquals( (double) 0.23000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1503() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1504() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.91,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1505() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.64,0.07,0.82,0.61,0.4,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1506() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.2,"/")));
        org.junit.Assert.assertEquals( (double) 1.4000000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1507() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1508() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.64,0.39,0.51,"-",0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1509() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.32,0.42,0.33,0.59,"+")));
        org.junit.Assert.assertEquals( (double) 0.9199999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1510() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1511() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.61,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1512() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1513() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.28,0.66,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1514() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.56,0.48,0.82,"-",0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1515() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.13,0.6,0.25,"+","/","+")));
        org.junit.Assert.assertEquals( (double) 1.0529411764705883, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1516() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.85,0.34,0.86,0.78,"-",0.12,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1517() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.52,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1518() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.69,0.09,0.93,"-")));
        org.junit.Assert.assertEquals( (double) -0.8400000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1519() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1520() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.98,"-",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1521() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.6,"/",0.26,"*")));
        org.junit.Assert.assertEquals( (double) 0.026000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1522() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.42,0.1,"*",0.46,0.14,"*",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1523() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.99,0.16,0.81,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1524() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.06,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1525() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.66,0.18,"*",0.0,0.35,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1526() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.41,0.44,0.9,"/",0.19,"-")));
        org.junit.Assert.assertEquals( (double) 0.29888888888888887, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1527() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.11,"/",0.05,0.36,"/","/",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1528() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.78,"/",0.03,0.27,"-","+",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1529() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1530() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.16,"*",0.3,0.53,0.23,0.19,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1531() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.16,0.63,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1532() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1533() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.92,"+")));
        org.junit.Assert.assertEquals( (double) 1.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1534() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.97,0.04,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1535() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.66,"-",0.47,"/")));
        org.junit.Assert.assertEquals( (double) -1.3829787234042554, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1536() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1537() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.19,0.51,0.32,"*",0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1538() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.99,0.74,"+","*",0.08,0.81,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1539() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.74,"-",0.85,0.45,0.58,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1540() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1541() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.57,0.34,0.26,0.58,"-")));
        org.junit.Assert.assertEquals( (double) -0.31999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1542() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1543() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1544() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.54,0.81,0.16,"/",0.7,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1545() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.08,0.64,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1546() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.16,"+")));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1547() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.83,"+",0.64,0.62,0.59,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1548() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.91,0.84,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1549() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1550() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.62,0.15,"+",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1551() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.73,0.74,"/",0.82,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1552() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1553() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.84,"*",0.49,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1554() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.83,0.59,"+",0.59,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1555() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1556() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.06,"*",0.55,"/",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1557() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.22,0.18,0.81,0.95,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1558() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1559() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.65,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1560() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.74,0.05,"/","-",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1561() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.87,0.44,"/",0.95,"-","-",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1562() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.78,0.83,"-",0.45,"+",0.71,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1563() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1564() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.66,0.09,0.96,0.81,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1565() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.8,0.64,"-",0.5,"/",0.26,"/")));
        org.junit.Assert.assertEquals( (double) 1.230769230769231, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1566() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.1,"-",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1567() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.08,"-",0.39,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1568() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.42,0.54,"+",0.63,"-")));
        org.junit.Assert.assertEquals( (double) 0.32999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1569() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1570() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.17,"/",0.98,"+",0.98,0.9,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1571() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1572() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.41,0.22,"-")));
        org.junit.Assert.assertEquals( (double) 0.18999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1573() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.76,0.52,"/",0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1574() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.66,"/",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1575() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1576() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1577() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.8,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1578() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.79,"/",0.71,"*",0.4,"+")));
        org.junit.Assert.assertEquals( (double) 1.289746835443038, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1579() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.19,0.05,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1580() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.85,0.51,0.86,"/")));
        org.junit.Assert.assertEquals( (double) 0.5930232558139535, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1581() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1582() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.12,0.97,0.02,"/")));
        org.junit.Assert.assertEquals( (double) 48.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1583() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.4,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1584() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.92,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1585() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1586() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.27,0.33,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.0258, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1587() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.01,0.56,"-",0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1588() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.34,"/",0.26,0.94,"-",0.39,"-")));
        org.junit.Assert.assertEquals( (double) -1.0699999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1589() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.22,0.1,0.2,"+")));
        org.junit.Assert.assertEquals( (double) 0.30000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1590() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.62,0.58,0.47,"-",0.14,"/")));
        org.junit.Assert.assertEquals( (double) 0.7857142857142856, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1591() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.63,0.6,0.32,0.93,0.59,0.64,"+")));
        org.junit.Assert.assertEquals( (double) 1.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1592() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.41,0.08,0.25,0.73,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1593() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.62,"/",0.32,0.76,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.5154838709677421, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1594() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.93,0.36,0.92,"/","-",0.95,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1595() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.07,0.5,"/")));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1596() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.22,0.69,0.18,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1597() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.42,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1598() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.57,0.46,0.1,0.41,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1599() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.92,"+",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1600() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.95,0.09,"+")));
        org.junit.Assert.assertEquals( (double) 1.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1601() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.46,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1602() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.85,0.79,"-",0.17,0.52,"-","/")));
        org.junit.Assert.assertEquals( (double) -0.17142857142857126, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1603() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1604() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.13,"+",0.62,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1605() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.01,"-",0.33,0.99,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1606() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.68,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1607() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.61,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1608() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.02,"+")));
        org.junit.Assert.assertEquals( (double) 1.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1609() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.77,"/",0.3,0.85,0.28,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1610() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.4,0.93,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.43010752688172044, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1611() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.2,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1612() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.41,"-",0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1613() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1614() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.02,0.77,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1615() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.66,0.2,0.5,"-",0.55,"/")));
        org.junit.Assert.assertEquals( (double) -0.5454545454545454, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1616() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1617() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1618() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.5,0.9,0.36,0.76,"*")));
        org.junit.Assert.assertEquals( (double) 0.2736, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1619() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.63,"/",0.15,0.72,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1620() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.74,0.46,0.78,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1621() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.24,"-",0.94,0.09,"*",0.02,"/")));
        org.junit.Assert.assertEquals( (double) 4.2299999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1622() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.65,"-",0.97,"/",0.94,"/")));
        org.junit.Assert.assertEquals( (double) -0.3509541566132924, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1623() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.26,0.61,"+",0.88,0.19,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1624() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.04,0.05,0.39,0.43,0.88,0.2,"+")));
        org.junit.Assert.assertEquals( (double) 1.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1625() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.64,0.32,"*",0.42,0.31,0.2,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1626() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.96,0.13,0.92,"*","+",0.76,"*")));
        org.junit.Assert.assertEquals( (double) 0.8204959999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1627() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1628() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.97,0.03,"/",0.95,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1629() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.97,0.06,"/")));
        org.junit.Assert.assertEquals( (double) 16.166666666666668, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1630() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.83,"-",0.69,0.52,"-",0.48,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1631() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.81,"*",0.76,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1632() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.35,0.69,"-",0.69,"+")));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1633() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.51,"+",0.29,0.41,"+")));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1634() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.57,"+",0.7,"-")));
        org.junit.Assert.assertEquals( (double) 0.6500000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1635() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.31,"/",0.76,"-")));
        org.junit.Assert.assertEquals( (double) 0.8851612903225807, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1636() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.05,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1637() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.14,"*",0.41,"/")));
        org.junit.Assert.assertEquals( (double) 0.2902439024390244, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1638() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.74,0.58,"+",0.54,0.7,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1639() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1640() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.9,0.81,"+",0.69,"/",0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1641() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1642() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.67,"*",0.88,"/",0.66,"/",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1643() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.81,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1644() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.36,0.64,"+")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1645() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.77,0.8,"-",0.97,"+",0.08,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1646() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1647() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.31,"-")));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1648() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.2,0.7,"/")));
        org.junit.Assert.assertEquals( (double) 0.28571428571428575, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1649() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1650() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.62,"+",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1651() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.31,0.73,"-","*",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1652() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.91,0.89,"*","-",0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1653() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.1,0.91,"-","+",0.8,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1654() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.19,0.92,"+",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1655() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.97,"/")));
        org.junit.Assert.assertEquals( (double) 0.9587628865979382, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1656() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.03,"+",0.81,0.78,0.31,"*")));
        org.junit.Assert.assertEquals( (double) 0.24180000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1657() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.23,0.87,"/",0.12,0.26,"-")));
        org.junit.Assert.assertEquals( (double) -0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1658() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.58,"+")));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1659() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.85,0.28,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.08999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1660() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.63,0.89,"-",0.68,0.34,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1661() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1662() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1663() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.24,0.07,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1664() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.7,"/")));
        org.junit.Assert.assertEquals( (double) 0.04285714285714286, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1665() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.83,0.31,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1666() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.93,0.04,0.94,0.66,0.86,1.0,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1667() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.29,0.37,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.043993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1668() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.91,0.02,0.72,0.79,"+",0.33,"-")));
        org.junit.Assert.assertEquals( (double) 1.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1669() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.73,"-",0.69,0.8,"/",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1670() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.67,0.18,0.75,"/",0.58,0.16,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1671() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1672() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.95,"-",0.18,0.85,"+",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1673() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.55,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1674() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.92,0.75,"+",0.49,0.12,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1675() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.34,"*",0.37,"+",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1676() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1677() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.3,0.37,0.44,0.4,0.14,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1678() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.06,0.14,"-",0.37,"+",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1679() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.53,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1680() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.5,"/")));
        org.junit.Assert.assertEquals( (double) 1.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1681() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.03,0.7,"-",0.83,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1682() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.22,"-",0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1683() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.68,0.23,"-",0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1684() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.55,0.71,0.25,"*",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1685() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.16,"*",0.73,0.71,0.73,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1686() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.82,0.67,0.16,"-",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1687() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.25,0.63,0.99,0.99,"/")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1688() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.04,"/")));
        org.junit.Assert.assertEquals( (double) 17.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1689() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.62,0.01,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1690() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1691() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.06,"-",0.97,0.12,"-",0.85,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1692() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.74,0.22,0.55,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1693() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.84,0.82,0.6,0.13,0.9,"/")));
        org.junit.Assert.assertEquals( (double) 0.14444444444444446, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1694() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.05,0.6,0.04,0.17,"*")));
        org.junit.Assert.assertEquals( (double) 0.0068000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1695() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.33,0.52,"*")));
        org.junit.Assert.assertEquals( (double) 0.1716, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1696() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.53,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1697() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.12,0.24,0.51,0.15,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1698() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.65,0.65,"/")));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1699() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.2,0.72,0.33,"/")));
        org.junit.Assert.assertEquals( (double) 2.1818181818181817, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1700() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.42,0.82,0.47,"+",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1701() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.38,0.9,"+",0.52,0.58,0.99,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1702() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1703() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.05,"*")));
        org.junit.Assert.assertEquals( (double) 0.027000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1704() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.15,0.93,0.57,"-",0.41,0.91,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1705() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1706() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.68,0.41,"-","-",0.96,0.32,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1707() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.68,"*",0.46,0.89,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1708() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1709() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.54,0.33,"/",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1710() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1711() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.27,"*")));
        org.junit.Assert.assertEquals( (double) 0.10800000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1712() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.89,0.7,"/","*",0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1713() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.9,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1714() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1715() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.12,0.37,0.09,0.17,0.92,"/",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1716() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.23,0.89,0.73,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1717() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.6,0.65,0.57,"/",0.27,"-")));
        org.junit.Assert.assertEquals( (double) 0.8703508771929827, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1718() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1719() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1720() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1721() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.48,0.51,0.8,0.7,0.11,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1722() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.72,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1723() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.21,0.55,0.44,0.3,0.64,0.67,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1724() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.56,0.44,0.18,"*",0.59,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1725() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.09,"/")));
        org.junit.Assert.assertEquals( (double) 8.666666666666668, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1726() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.36,"+")));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1727() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.14,"*")));
        org.junit.Assert.assertEquals( (double) 0.12460000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1728() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.28,"+",0.58,"+",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1729() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.77,0.01,"+",0.54,0.27,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1730() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1731() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.93,0.19,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1732() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.15,"/",0.97,"+")));
        org.junit.Assert.assertEquals( (double) 7.236666666666666, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1733() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1734() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.1,0.29,"*")));
        org.junit.Assert.assertEquals( (double) 0.028999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1735() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.44,0.42,"+",0.96,"/",0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1736() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.23,"*",0.16,0.88,0.4,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1737() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.11,0.26,"-","/",0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1738() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1739() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.24,0.37,0.77,0.35,"/",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1740() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.95,"-",0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1741() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.71,"*",0.94,"*",0.83,"*")));
        org.junit.Assert.assertEquals( (double) 0.4320747599999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1742() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.66,"-",0.58,0.35,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1743() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.72,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1744() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.33,0.45,"/")));
        org.junit.Assert.assertEquals( (double) 0.7333333333333334, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1745() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.4,0.43,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1746() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.96,0.01,0.64,"/","-",0.88,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1747() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.99,0.53,0.58,0.72,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1748() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.99,0.61,0.02,0.82,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1749() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.1,"+",0.16,"/")));
        org.junit.Assert.assertEquals( (double) 6.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1750() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.61,"-",0.43,0.59,0.88,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1751() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1752() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.72,"-",0.77,0.57,0.84,"+")));
        org.junit.Assert.assertEquals( (double) 1.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1753() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.54,0.09,0.3,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1754() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.5,"-",0.1,0.98,"-",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1755() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.23,0.43,0.89,0.03,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.46739130434782605, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1756() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1757() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.53,"*",0.1,"+",0.75,"-")));
        org.junit.Assert.assertEquals( (double) -0.25249999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1758() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.76,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1759() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.86,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1760() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.16,"-",0.99,0.03,"-","+")));
        org.junit.Assert.assertEquals( (double) 1.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1761() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.14,0.9,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1762() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.08,0.25,0.29,"+",0.19,0.22,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1763() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.93,0.49,"/",0.37,"/","-")));
        org.junit.Assert.assertEquals( (double) -4.939619415333701, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1764() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.52,0.76,0.17,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1765() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.39,0.06,0.97,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1766() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.41,"+",0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1767() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.32,0.77,"+",0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1768() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.02,"*",0.55,0.19,0.68,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1769() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1770() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.63,0.86,0.31,"+",0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1771() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.12,1.0,"/","-",0.27,"/",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1772() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.74,"/",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1773() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.62,0.85,0.72,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1774() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.05,0.07,0.28,"+",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1775() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1776() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.2,0.67,0.6,0.89,0.71,"/")));
        org.junit.Assert.assertEquals( (double) 1.2535211267605635, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1777() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.01,"/",0.0,0.85,"/",0.12,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1778() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.26,0.47,0.03,0.61,"-")));
        org.junit.Assert.assertEquals( (double) -0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1779() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1780() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.78,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1781() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.77,0.55,"+")));
        org.junit.Assert.assertEquals( (double) 1.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1782() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.42,0.74,0.11,0.86,"-",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1783() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.92,0.37,"-","+",0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1784() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.51,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1785() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.07,0.05,0.72,"-",0.42,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1786() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.58,0.89,0.02,0.77,0.58,"-")));
        org.junit.Assert.assertEquals( (double) 0.19000000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1787() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.73,0.02,0.35,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1788() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.69,"+")));
        org.junit.Assert.assertEquals( (double) 1.1099999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1789() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.26,0.27,0.75,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1790() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.48,0.88,0.25,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1791() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.47,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1792() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.9,"*",0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1793() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.98,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1794() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.68,0.9,"/")));
        org.junit.Assert.assertEquals( (double) 0.7555555555555555, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1795() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.64,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1796() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.37,0.14,0.82,"-","-","+")));
        org.junit.Assert.assertEquals( (double) 1.4799999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1797() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.87,0.83,0.12,0.04,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1798() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.54,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1799() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1800() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.92,"-",0.05,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1801() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.55,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1802() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.62,0.27,0.88,"-")));
        org.junit.Assert.assertEquals( (double) -0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1803() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.93,"-",0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1804() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.27,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1805() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.0,0.12,0.95,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1806() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1807() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.16,"/",0.83,"/",0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1808() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1809() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1810() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.86,0.95,"*",0.92,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1811() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.94,"*",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1812() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1813() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.03,0.82,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.3154, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1814() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.89,0.7,0.93,0.99,"-",0.84,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1815() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.16,0.35,0.78,"/")));
        org.junit.Assert.assertEquals( (double) 0.4487179487179487, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1816() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1817() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.93,0.22,0.64,"/")));
        org.junit.Assert.assertEquals( (double) 0.34375, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1818() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.95,"-")));
        org.junit.Assert.assertEquals( (double) 0.040000000000000036, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1819() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.29,"/",0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1820() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.18,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1821() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.11,"*",0.17,0.59,"-")));
        org.junit.Assert.assertEquals( (double) -0.41999999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1822() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.84,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1823() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1824() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.86,0.3,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1825() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.85,"/")));
        org.junit.Assert.assertEquals( (double) 0.36470588235294116, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1826() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.07,0.04,0.25,"/","-",0.04,"-")));
        org.junit.Assert.assertEquals( (double) -0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1827() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.35,0.32,0.74,0.04,0.14,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1828() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1829() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.92,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1830() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.78,0.07,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1831() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.92,0.96,0.03,0.41,0.09,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1832() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.96,"+",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1833() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.3,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1834() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.87,"*",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1835() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.56,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1836() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.64,"+")));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1837() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1838() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.92,0.55,0.53,"*",0.83,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1839() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.53,0.83,0.84,"+")));
        org.junit.Assert.assertEquals( (double) 1.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1840() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.02,0.36,0.54,0.9,0.88,0.46,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1841() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.73,"/")));
        org.junit.Assert.assertEquals( (double) 0.7397260273972603, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1842() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.69,0.1,0.16,"-",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1843() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.19,0.84,0.39,"/",0.26,0.01,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1844() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.28,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1845() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.38,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1846() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.25,0.07,"+",0.25,0.11,0.47,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1847() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.11,0.46,"/")));
        org.junit.Assert.assertEquals( (double) 0.23913043478260868, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1848() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.46,0.94,"-",0.75,"+","*",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1849() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.6,"*",0.84,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1850() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.63,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1851() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.85,0.83,"*","+",1.0,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1852() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1853() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.77,"+",0.18,0.03,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1854() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.81,0.09,0.26,"*","*",0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1855() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.9,0.43,0.55,0.51,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1856() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.39,"*")));
        org.junit.Assert.assertEquals( (double) 0.0936, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1857() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.54,"*",0.88,0.74,0.64,0.93,"*")));
        org.junit.Assert.assertEquals( (double) 0.5952000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1858() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.6,0.92,"*",0.67,0.5,"/","-")));
        org.junit.Assert.assertEquals( (double) -0.788, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1859() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.56,0.69,0.95,"+",0.77,0.97,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1860() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.01,0.67,0.81,0.89,0.28,"/")));
        org.junit.Assert.assertEquals( (double) 3.1785714285714284, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1861() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.96,"-")));
        org.junit.Assert.assertEquals( (double) -0.8899999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1862() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.1,"*",0.12,0.09,0.92,"*")));
        org.junit.Assert.assertEquals( (double) 0.0828, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1863() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.84,"-",0.54,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1864() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1865() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.23,0.26,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1866() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.83,"-")));
        org.junit.Assert.assertEquals( (double) -0.04999999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1867() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.9,0.75,0.82,0.55,0.88,"-")));
        org.junit.Assert.assertEquals( (double) -0.32999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1868() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.72,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1869() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.56,0.4,0.51,0.35,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1870() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.85,0.44,0.21,"-")));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1871() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.38,"*",0.16,"-",0.6,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1872() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1873() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1874() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.94,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1875() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.04,"-",0.76,0.41,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1876() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.48,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1877() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1878() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.46,"+",0.53,"+")));
        org.junit.Assert.assertEquals( (double) 1.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1879() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.12,0.48,"+")));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1880() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.45,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1881() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.11,0.6,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1882() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.28,"+",0.65,0.19,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1883() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.62,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1884() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.47,0.8,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1885() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.45,0.97,"+",0.77,0.35,"*")));
        org.junit.Assert.assertEquals( (double) 0.26949999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1886() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.46,0.65,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1887() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.16,0.41,"-",0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1888() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.69,"/",0.55,0.14,"-",0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1889() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1890() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.54,"+",0.55,"/",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1891() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.43,"*",0.91,0.9,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1892() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1893() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.28,0.03,0.58,0.95,"+",0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1894() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.48,"*",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1895() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.4,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1896() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1897() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.5,0.7,1.0,"*",0.09,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.10999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1898() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.81,0.08,"/","*")));
        org.junit.Assert.assertEquals( (double) 7.18875, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1899() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.74,"*")));
        org.junit.Assert.assertEquals( (double) 0.6512, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1900() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.93,"/")));
        org.junit.Assert.assertEquals( (double) 0.13978494623655913, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1901() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.91,"/")));
        org.junit.Assert.assertEquals( (double) 0.7142857142857143, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1902() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.37,"/",0.38,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1903() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.63,0.69,0.33,"+",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1904() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.15,0.92,"-","*",0.6,"/")));
        org.junit.Assert.assertEquals( (double) -0.8598333333333334, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1905() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.37,0.09,0.61,0.3,"+",0.59,"*")));
        org.junit.Assert.assertEquals( (double) 0.5368999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1906() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1907() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.28,0.39,"/",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1908() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.32,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1909() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.11,0.47,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.0062039999999999994, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1910() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.15,"*")));
        org.junit.Assert.assertEquals( (double) 0.1065, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1911() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.21,"/",0.02,0.41,"/",0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1912() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.33,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1913() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.59,0.91,"*",0.01,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1914() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.83,0.82,0.42,1.0,"-")));
        org.junit.Assert.assertEquals( (double) -0.5800000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1915() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.12,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1916() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.84,0.59,0.23,"/",0.2,0.92,"-")));
        org.junit.Assert.assertEquals( (double) -0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1917() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1918() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.66,0.15,0.43,0.04,"+",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1919() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.19,0.87,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1920() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.24,"/",0.76,0.53,"/",0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1921() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.29,0.15,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1922() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.24,0.48,0.32,"+")));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1923() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.18,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1924() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.36,0.45,0.39,0.66,"-")));
        org.junit.Assert.assertEquals( (double) -0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1925() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.09,0.63,0.95,"*","*",0.84,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1926() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1927() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.1,0.34,"/",0.19,"*")));
        org.junit.Assert.assertEquals( (double) 0.05588235294117647, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1928() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.6,0.55,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1929() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.61,0.46,0.52,"/")));
        org.junit.Assert.assertEquals( (double) 0.8846153846153846, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1930() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.69,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1931() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1932() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.97,0.38,0.67,0.52,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1933() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.46,0.23,"-",0.2,0.44,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1934() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.67,"*")));
        org.junit.Assert.assertEquals( (double) 0.45560000000000006, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1935() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.84,0.34,0.35,"-",0.64,0.73,"*")));
        org.junit.Assert.assertEquals( (double) 0.4672, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1936() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.22,0.29,"-",0.81,0.85,0.13,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1937() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.11,0.64,0.18,0.8,0.76,0.82,"/")));
        org.junit.Assert.assertEquals( (double) 0.926829268292683, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1938() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1939() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.34,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1940() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.09,0.85,"*",0.29,0.2,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1941() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.45,0.5,0.04,0.84,"*",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1942() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.85,0.8,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1943() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.49,0.78,0.22,0.84,0.47,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1944() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.98,0.65,"+","+",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1945() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.93,0.73,"*",0.58,0.27,"/")));
        org.junit.Assert.assertEquals( (double) 2.148148148148148, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1946() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.36,0.27,0.57,0.7,"-",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1947() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.16,"/")));
        org.junit.Assert.assertEquals( (double) 5.3125, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1948() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.2,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1949() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.87,"+",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1950() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.17,0.67,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1951() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.08,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1952() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1953() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.1,"+")));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1954() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.03,0.83,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1955() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.2,"/")));
        org.junit.Assert.assertEquals( (double) 0.35000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1956() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.33,0.97,0.24,"-",0.01,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1957() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1958() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.87,0.45,0.22,0.53,0.15,"/",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1959() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1960() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.57,"+",0.82,0.46,0.67,0.31,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1961() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.77,"/",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1962() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.41,0.55,0.5,"*")));
        org.junit.Assert.assertEquals( (double) 0.275, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1963() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.19,0.9,0.34,"*")));
        org.junit.Assert.assertEquals( (double) 0.30600000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1964() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.48,"*",0.78,0.83,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1965() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1966() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.94,0.81,0.97,"*",0.79,"-")));
        org.junit.Assert.assertEquals( (double) -0.0042999999999999705, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1967() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.66,0.93,0.41,"+",0.53,0.29,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1968() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.48,0.21,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1969() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.72,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1970() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.54,0.36,0.69,"/","-")));
        org.junit.Assert.assertEquals( (double) 0.01826086956521744, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1971() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.07,"*")));
        org.junit.Assert.assertEquals( (double) 0.0028000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1972() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1973() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.37,0.34,0.88,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1974() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.87,"*",0.34,"+",0.37,"+")));
        org.junit.Assert.assertEquals( (double) 0.9014, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1975() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1976() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.02,"/",0.53,0.01,0.15,0.14,"+")));
        org.junit.Assert.assertEquals( (double) 0.29000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1977() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.14,0.62,0.37,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.8156756756756756, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1978() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.74,0.43,"+")));
        org.junit.Assert.assertEquals( (double) 1.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1979() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.36,0.76,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1980() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.9,0.47,0.22,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1981() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.8,"-",0.03,"*",0.52,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1982() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.34,0.25,0.4,"/",0.57,0.25,"+")));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1983() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.58,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1984() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.47,"/")));
        org.junit.Assert.assertEquals( (double) 1.297872340425532, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1985() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1986() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.71,"*",0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1987() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.46,0.34,0.68,"*",0.05,"*")));
        org.junit.Assert.assertEquals( (double) 0.011560000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1988() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.07,0.14,0.54,"*",0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1989() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.4,0.36,"*",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1990() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1991() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.91,"/")));
        org.junit.Assert.assertEquals( (double) 0.923076923076923, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1992() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.85,0.53,"-")));
        org.junit.Assert.assertEquals( (double) 0.31999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1993() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.82,0.42,0.72,"+",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1994() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.01,0.35,"*","*")));
        org.junit.Assert.assertEquals( (double) 0.0010849999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1995() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.12,0.96,"*",0.37,0.92,"*",0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1996() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1997() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.54,0.5,0.36,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1998() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.13,0.03,"-","/")));
        org.junit.Assert.assertEquals( (double) 5.699999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1999() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.59,"/",0.15,0.31,0.52,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2000() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.84,0.33,0.04,0.17,0.89,0.59,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2001() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.2,"/",0.19,"+",0.85,"+")));
        org.junit.Assert.assertEquals( (double) 2.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2002() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2003() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2004() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.54,"/",0.07,"-",0.34,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2005() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2006() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.46,"+",0.14,"*",0.51,"/",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2007() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.61,0.35,0.15,"/")));
        org.junit.Assert.assertEquals( (double) 2.3333333333333335, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2008() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.91,0.77,0.26,0.8,"/")));
        org.junit.Assert.assertEquals( (double) 0.325, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2009() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.64,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2010() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.65,0.05,0.83,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.507, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2011() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2012() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.68,0.26,"*",0.32,"*",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2013() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.27,"-")));
        org.junit.Assert.assertEquals( (double) 0.14999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2014() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2015() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.86,"*")));
        org.junit.Assert.assertEquals( (double) 0.6192, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2016() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2017() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.82,0.07,"/",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2018() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.35,"-",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2019() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.66,"*",0.37,0.29,0.15,0.5,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2020() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.62,0.3,0.3,0.51,0.29,0.12,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2021() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.17,"+",0.85,"*")));
        org.junit.Assert.assertEquals( (double) 0.7055, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2022() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.79,0.54,"-")));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2023() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.03,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2024() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.88,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2025() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.5,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2026() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.28,0.04,"*")));
        org.junit.Assert.assertEquals( (double) 0.011200000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2027() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.46,0.5,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2028() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.94,0.16,0.17,"-",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2029() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,1.0,0.54,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.4312, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2030() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.7,0.17,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2031() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2032() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.51,0.08,0.5,"/","/",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2033() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.73,0.63,"*")));
        org.junit.Assert.assertEquals( (double) 0.4599, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2034() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2035() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.84,0.51,0.17,"-","+",0.76,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2036() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.41,"*",0.44,0.31,0.26,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2037() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.66,0.51,0.18,"-",0.01,"+",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2038() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.28,"-",0.21,"*")));
        org.junit.Assert.assertEquals( (double) 0.027299999999999987, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2039() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.84,0.94,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2040() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2041() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.22,0.06,0.76,"/","+",0.38,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2042() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.52,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2043() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.05,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2044() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.39,0.87,0.01,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2045() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.33,0.44,"*")));
        org.junit.Assert.assertEquals( (double) 0.1452, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2046() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.89,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2047() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.46,0.37,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2048() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.46,0.56,"-")));
        org.junit.Assert.assertEquals( (double) -0.10000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2049() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.87,0.12,"+",0.41,0.16,"/",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2050() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.32,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2051() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2052() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2053() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.05,0.19,"/",0.62,"-","*")));
        org.junit.Assert.assertEquals( (double) -0.2248105263157895, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2054() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.8,0.12,0.46,"*",0.36,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2055() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.07,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2056() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.75,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2057() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.76,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2058() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.88,"-",0.04,"-")));
        org.junit.Assert.assertEquals( (double) -0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2059() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2060() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.36,"-")));
        org.junit.Assert.assertEquals( (double) 0.30000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2061() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.49,"-")));
        org.junit.Assert.assertEquals( (double) -0.10999999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2062() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.83,0.7,"-")));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2063() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.35,"/",0.83,"-",0.09,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2064() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.76,0.88,0.6,0.93,"/","*",0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2065() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.6,"+")));
        org.junit.Assert.assertEquals( (double) 0.6699999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2066() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2067() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.58,"/",0.96,0.77,0.27,"/",0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2068() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2069() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.14,0.96,0.63,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2070() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.32,0.64,0.28,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2071() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.74,"-",0.03,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2072() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.88,"/",0.7,"+")));
        org.junit.Assert.assertEquals( (double) 0.8590909090909091, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2073() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.63,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2074() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.24,"+",0.88,0.38,0.82,"/")));
        org.junit.Assert.assertEquals( (double) 0.4634146341463415, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2075() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2076() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.03,0.65,0.88,"*",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2077() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.43,0.37,0.05,"+","-",0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2078() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2079() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.05,0.57,0.32,"/",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2080() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2081() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.23,0.37,0.27,0.65,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2082() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.85,0.45,0.03,0.77,0.53,"-",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2083() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.41,0.87,"/","/",0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2084() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2085() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.01,"/",0.59,0.84,"*")));
        org.junit.Assert.assertEquals( (double) 0.49559999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2086() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.14,0.15,"/")));
        org.junit.Assert.assertEquals( (double) 0.9333333333333335, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2087() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.54,0.6,0.4,"-",0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2088() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.41,"-",0.46,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2089() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.98,"-",0.23,"/")));
        org.junit.Assert.assertEquals( (double) -2.4347826086956523, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2090() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.77,0.26,"+",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2091() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.56,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2092() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.34,0.75,0.42,"+")));
        org.junit.Assert.assertEquals( (double) 1.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2093() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.44,0.26,0.6,"+")));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2094() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.48,"/",0.58,0.64,0.85,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2095() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.03,0.34,"*")));
        org.junit.Assert.assertEquals( (double) 0.0102, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2096() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2097() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.38,0.93,0.43,"*","+")));
        org.junit.Assert.assertEquals( (double) 0.7799, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2098() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.76,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2099() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.65,0.72,1.0,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2100() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2101() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.84,0.85,0.18,"+",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2102() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.67,0.91,"/","*",0.64,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2103() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2104() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.33,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2105() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.98,"-")));
        org.junit.Assert.assertEquals( (double) -0.06999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2106() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.56,0.47,0.69,0.87,"-")));
        org.junit.Assert.assertEquals( (double) -0.18000000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2107() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.33,0.75,0.65,0.42,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2108() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.28,0.65,"+",0.12,"-",0.55,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2109() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.32,0.9,0.19,"-",0.97,"/")));
        org.junit.Assert.assertEquals( (double) 0.7319587628865979, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2110() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.15,0.48,"/",0.95,0.29,0.38,"-")));
        org.junit.Assert.assertEquals( (double) -0.09000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2111() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.43,"*",0.97,0.83,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2112() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.55,"-",0.68,"/",0.78,"/",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2113() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.62,1.0,"*",0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2114() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.86,0.95,0.62,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2115() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.94,0.83,0.34,"-",0.42,"*")));
        org.junit.Assert.assertEquals( (double) 0.20579999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2116() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2117() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.37,"+",0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2118() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.38,0.06,0.68,"*","/",0.95,"/")));
        org.junit.Assert.assertEquals( (double) 9.80392156862745, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2119() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.5,0.94,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2120() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.94,"+",0.23,0.52,"+")));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2121() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.84,0.65,0.62,"*")));
        org.junit.Assert.assertEquals( (double) 0.403, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2122() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.43,0.88,0.72,0.26,0.26,"-")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2123() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.7,"+",0.82,0.79,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2124() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.43,0.84,0.37,"/")));
        org.junit.Assert.assertEquals( (double) 2.27027027027027, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2125() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.88,"/",0.33,0.17,0.75,0.53,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2126() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.04,"*")));
        org.junit.Assert.assertEquals( (double) 0.0356, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2127() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.56,"+",0.39,"*",0.55,"-")));
        org.junit.Assert.assertEquals( (double) -0.06639999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2128() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.52,"*",0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2129() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.75,"/")));
        org.junit.Assert.assertEquals( (double) 0.8666666666666667, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2130() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.09,"-",0.41,0.51,"/",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2131() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2132() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.74,0.95,0.86,"+","*",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2133() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.05,0.64,"*",0.45,"*",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2134() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2135() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2136() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.95,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2137() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.87,0.34,0.89,0.24,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2138() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.01,0.91,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2139() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.41,"+",0.98,0.42,"+","*")));
        org.junit.Assert.assertEquals( (double) 1.162, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2140() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.0,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2141() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.07,"*",0.15,"/",0.25,0.53,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2142() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.57,"/")));
        org.junit.Assert.assertEquals( (double) 0.07017543859649124, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2143() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.22,0.3,0.51,0.84,"*")));
        org.junit.Assert.assertEquals( (double) 0.4284, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2144() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.12,0.25,"-",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2145() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2146() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.2,0.73,0.52,"+",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2147() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.42,0.87,0.91,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2148() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2149() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.14,0.42,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2150() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.93,0.02,"/",0.85,"-",0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2151() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.69,0.06,"+")));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2152() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.29,0.91,0.35,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.754, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2153() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.97,0.27,0.23,0.28,0.73,"-")));
        org.junit.Assert.assertEquals( (double) -0.44999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2154() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.67,0.06,"-")));
        org.junit.Assert.assertEquals( (double) 0.6100000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2155() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.35,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2156() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.13,0.12,0.12,0.64,0.09,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2157() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.14,"+",0.35,0.9,0.44,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2158() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2159() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.8,"*")));
        org.junit.Assert.assertEquals( (double) 0.22400000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2160() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2161() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.34,0.27,0.78,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2162() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.58,0.05,"-","+",0.72,"*",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2163() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.91,"+")));
        org.junit.Assert.assertEquals( (double) 1.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2164() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.4,"*",0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2165() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.35,0.61,0.32,"+")));
        org.junit.Assert.assertEquals( (double) 0.9299999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2166() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2167() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2168() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.84,"-",0.7,0.54,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2169() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.38,0.98,0.76,"*",0.92,"*")));
        org.junit.Assert.assertEquals( (double) 0.685216, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2170() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.61,0.6,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2171() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.36,"/",0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2172() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,1.0,0.82,0.05,0.08,"+",0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2173() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.5,0.63,"+","+",0.8,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2174() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.85,0.31,0.45,"*","-",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2175() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.23,0.32,0.45,0.52,"/")));
        org.junit.Assert.assertEquals( (double) 0.8653846153846154, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2176() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.59,0.83,0.63,0.42,"*",0.69,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2177() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2178() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.18,0.13,0.58,0.47,"*")));
        org.junit.Assert.assertEquals( (double) 0.27259999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2179() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.43,"*",0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2180() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.24,0.16,0.67,0.34,0.27,"+",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2181() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.22,0.55,"*","*",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2182() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2183() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.09,0.43,0.51,"-",0.76,"+",0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2184() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.33,0.67,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2185() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.8,0.7,0.84,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2186() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.92,0.69,"/",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2187() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2188() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.53,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2189() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.7,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2190() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.16,0.01,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2191() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2192() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.29,0.42,0.71,0.94,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2193() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.27,0.07,0.11,0.5,"-","-")));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2194() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2195() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.81,0.34,0.85,"+",0.26,0.43,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2196() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.65,0.16,"-","*",0.53,0.54,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2197() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2198() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.84,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2199() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.97,"-")));
        org.junit.Assert.assertEquals( (double) -0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2200() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.18,0.4,"*",0.67,0.18,"/",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2201() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.78,0.5,0.17,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2202() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.67,"/",0.19,"*",0.73,0.28,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2203() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.52,0.38,"+")));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2204() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.56,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2205() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2206() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.18,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2207() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.03,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2208() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.95,0.62,"*","+",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2209() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.84,0.83,0.22,0.89,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2210() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2211() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.16,"/")));
        org.junit.Assert.assertEquals( (double) 5.4375, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2212() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.26,0.31,"/","*",0.41,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2213() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.34,0.14,0.48,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2214() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.82,0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2215() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.09,0.29,0.84,0.02,"*",0.15,"+")));
        org.junit.Assert.assertEquals( (double) 0.1668, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2216() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.66,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2217() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.79,0.71,0.88,0.33,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2218() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2219() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.06,"+",0.82,"/",0.99,0.89,"*")));
        org.junit.Assert.assertEquals( (double) 0.8811, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2220() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.51,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2221() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.12,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2222() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2223() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2224() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2225() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.71,"+",0.56,0.23,0.28,"/",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2226() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2227() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.09,0.82,0.72,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2228() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2229() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.04,0.32,0.37,"+")));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2230() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.06,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2231() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.6,0.97,0.56,0.94,0.1,0.33,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2232() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.96,0.96,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2233() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.92,"/",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2234() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.9,0.01,"-",0.88,"+")));
        org.junit.Assert.assertEquals( (double) 1.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2235() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2236() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.14,"/",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2237() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.86,0.13,"+")));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2238() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.79,"+",0.67,0.59,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2239() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2240() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.12,0.27,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.031200000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2241() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.02,0.9,"/")));
        org.junit.Assert.assertEquals( (double) 0.022222222222222223, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2242() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.41,"/",0.01,0.32,"+")));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2243() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.8,"-",0.27,"+")));
        org.junit.Assert.assertEquals( (double) -0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2244() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.36,0.68,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.4472, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2245() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.35,"+",0.16,"-",0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2246() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.2,"+")));
        org.junit.Assert.assertEquals( (double) 1.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2247() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.82,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2248() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2249() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.18,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2250() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.87,0.77,"/",0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2251() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.63,"/",0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2252() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.04,0.37,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2253() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.07,"+",0.74,0.49,"*")));
        org.junit.Assert.assertEquals( (double) 0.3626, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2254() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.3,0.1,0.21,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2255() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2256() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.02,0.08,0.35,"*","*","/")));
        org.junit.Assert.assertEquals( (double) 1035.7142857142858, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2257() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2258() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2259() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.21,0.53,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2260() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2261() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.03,"/")));
        org.junit.Assert.assertEquals( (double) 32.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2262() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.42,"/",0.05,0.11,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2263() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.44,0.5,0.06,"+")));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2264() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.66,0.84,0.47,0.23,"*")));
        org.junit.Assert.assertEquals( (double) 0.1081, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2265() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.09,0.85,"*")));
        org.junit.Assert.assertEquals( (double) 0.0765, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2266() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.14,"+",0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2267() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2268() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.89,0.73,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2269() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.49,"*")));
        org.junit.Assert.assertEquals( (double) 0.28909999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2270() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2271() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.46,0.85,0.4,"+")));
        org.junit.Assert.assertEquals( (double) 1.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2272() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.22,0.28,0.82,0.24,"+",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2273() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2274() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.02,0.09,0.76,0.37,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2275() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.78,0.01,0.72,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2276() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.95,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2277() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.26,0.78,0.48,"/","-")));
        org.junit.Assert.assertEquals( (double) -1.3650000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2278() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.71,0.64,0.74,0.67,"/",0.04,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2279() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.24,"*",0.4,"-",0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2280() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.65,0.12,"-")));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2281() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.06,0.95,0.16,"+",0.46,"/")));
        org.junit.Assert.assertEquals( (double) 2.413043478260869, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2282() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.81,"/",0.33,0.66,0.83,0.22,"-")));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2283() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.66,0.09,0.15,"*",0.86,"-","/")));
        org.junit.Assert.assertEquals( (double) -0.7796810395747195, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2284() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.85,"/")));
        org.junit.Assert.assertEquals( (double) 0.31764705882352945, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2285() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.96,0.25,"+",0.64,0.61,"-",0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2286() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.7,0.78,0.12,0.88,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2287() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2288() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.14,"*",0.78,0.58,"-")));
        org.junit.Assert.assertEquals( (double) 0.20000000000000007, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2289() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.06,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2290() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2291() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2292() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.99,0.0,"-",0.2,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2293() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.17,0.42,"+","+")));
        org.junit.Assert.assertEquals( (double) 1.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2294() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.64,0.78,"-")));
        org.junit.Assert.assertEquals( (double) -0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2295() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.64,"/",0.49,0.15,0.51,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2296() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.55,0.91,"/")));
        org.junit.Assert.assertEquals( (double) 0.6043956043956045, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2297() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.28,0.24,0.83,0.24,"+",0.67,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2298() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.51,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2299() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.83,0.81,0.26,"+",0.44,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2300() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2301() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.62,0.19,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2302() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.87,"+",0.19,0.54,"/","-")));
        org.junit.Assert.assertEquals( (double) 0.778148148148148, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2303() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2304() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.76,0.99,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2305() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.78,0.45,"/",0.51,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2306() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.15,0.76,0.83,"/")));
        org.junit.Assert.assertEquals( (double) 0.9156626506024097, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2307() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.76,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2308() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.72,0.49,0.38,0.9,"/",0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2309() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.67,"+")));
        org.junit.Assert.assertEquals( (double) 1.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2310() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.01,"+")));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2311() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.44,0.27,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2312() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.62,0.5,0.28,0.67,0.71,"+",0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2313() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.79,"-",0.17,0.34,0.72,"*")));
        org.junit.Assert.assertEquals( (double) 0.24480000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2314() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.68,0.76,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2315() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2316() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.84,0.74,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2317() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.18,"/")));
        org.junit.Assert.assertEquals( (double) 3.7222222222222228, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2318() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.08,0.4,0.74,"/",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2319() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.55,0.59,"+","/",0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2320() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.57,0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2321() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.77,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2322() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.12,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2323() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.26,0.22,"/","+")));
        org.junit.Assert.assertEquals( (double) 1.5918181818181818, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2324() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.96,0.75,0.16,"+")));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2325() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.01,0.62,"/")));
        org.junit.Assert.assertEquals( (double) 0.016129032258064516, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2326() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.42,0.16,"+",0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2327() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2328() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.03,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2329() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.55,0.17,"/","*")));
        org.junit.Assert.assertEquals( (double) 1.6823529411764706, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2330() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.97,"-")));
        org.junit.Assert.assertEquals( (double) -0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2331() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.8,"-",0.2,"-",0.31,"/",0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2332() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.92,0.42,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2333() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.39,0.15,"+")));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2334() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.57,0.43,0.89,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2335() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.61,0.08,"/",0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2336() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.51,0.75,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2337() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.55,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2338() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.44,"+",0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2339() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.37,0.8,"*",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2340() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.63,"+")));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2341() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.0,"+",0.74,"/",0.46,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2342() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.46,0.45,"/","/",0.69,"/")));
        org.junit.Assert.assertEquals( (double) 1.0491493383742914, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2343() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.97,"*")));
        org.junit.Assert.assertEquals( (double) 0.9117999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2344() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.35,0.26,0.37,0.83,"+",0.32,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2345() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.81,0.26,0.73,"+")));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2346() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.56,0.41,0.84,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2347() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.69,0.42,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2348() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.5,"+",0.2,0.39,"*","+")));
        org.junit.Assert.assertEquals( (double) 1.278, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2349() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.21,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2350() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2351() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.91,0.95,0.61,0.16,"/")));
        org.junit.Assert.assertEquals( (double) 3.8125, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2352() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.98,0.28,"/",0.96,0.25,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2353() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.97,0.51,"*")));
        org.junit.Assert.assertEquals( (double) 0.4947, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2354() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.08,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2355() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.46,0.92,0.36,"+",0.43,0.23,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2356() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2357() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.06,0.08,0.9,0.21,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2358() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.97,0.18,0.4,0.05,0.32,"+")));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2359() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.45,0.14,0.21,0.82,"/","-","+")));
        org.junit.Assert.assertEquals( (double) 0.33390243902439026, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2360() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.32,0.09,"-",0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2361() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.46,"-")));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2362() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.54,0.76,0.23,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2363() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.45,0.07,0.28,0.83,0.54,0.57,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2364() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.21,0.46,"*")));
        org.junit.Assert.assertEquals( (double) 0.0966, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2365() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.38,0.62,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2366() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2367() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.61,0.89,0.24,0.67,"/",0.38,"*")));
        org.junit.Assert.assertEquals( (double) 0.13611940298507463, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2368() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.05,0.39,0.64,"+",0.36,0.93,"/")));
        org.junit.Assert.assertEquals( (double) 0.3870967741935484, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2369() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.17,0.66,"+")));
        org.junit.Assert.assertEquals( (double) 0.8300000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2370() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.18,0.89,"/",0.45,0.6,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.15168539325842695, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2371() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.62,0.76,0.66,"-")));
        org.junit.Assert.assertEquals( (double) 0.09999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2372() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.69,0.24,"-",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2373() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.84,"/",0.49,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2374() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.63,"/")));
        org.junit.Assert.assertEquals( (double) 0.031746031746031744, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2375() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2376() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.57,"+",0.33,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2377() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.37,"*",0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2378() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.86,0.12,0.59,"-",0.98,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2379() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.81,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2380() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2381() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.99,"*",0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2382() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.3,0.32,0.63,"-","-","+",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2383() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.23,0.03,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2384() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.96,0.12,0.35,0.07,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.39999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2385() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.15,0.92,"/")));
        org.junit.Assert.assertEquals( (double) 0.16304347826086954, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2386() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.89,0.45,"+",0.22,0.69,0.45,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2387() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.4,0.43,0.54,"*")));
        org.junit.Assert.assertEquals( (double) 0.23220000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2388() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.72,0.72,"/","/",0.76,0.23,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2389() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.12,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2390() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.29,0.12,"+",0.96,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2391() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2392() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.79,0.35,"*",0.53,0.87,"/",0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2393() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.9,0.63,0.88,"-","*",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2394() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.91,0.65,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2395() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.42,0.9,0.95,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.227027027027027, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2396() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.21,0.98,"*",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2397() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.74,0.25,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2398() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.16,"-",0.5,0.03,0.25,0.21,0.14)));
        org.junit.Assert.assertEquals( (double) 0.14, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2399() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2400() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.11,0.39,"*",0.9,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2401() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.74,0.92,"/","/",0.48,0.4,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2402() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2403() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,1.0,0.14,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2404() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.39,0.32,0.45,"+","/",0.67,"*")));
        org.junit.Assert.assertEquals( (double) 0.3393506493506494, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2405() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.96,0.7,"/",0.84,"+",0.17,"/")));
        org.junit.Assert.assertEquals( (double) 13.008403361344536, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2406() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.16,0.15,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2407() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.61,0.59,"/")));
        org.junit.Assert.assertEquals( (double) 1.033898305084746, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2408() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.27,0.55,"+",0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2409() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.67,"-")));
        org.junit.Assert.assertEquals( (double) -0.22000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2410() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.41,0.69,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.09710000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2411() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.17,"*",0.58,0.77,0.28,"/","+")));
        org.junit.Assert.assertEquals( (double) 3.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2412() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2413() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.39,0.47,"+",0.21,0.35,0.36,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2414() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.82,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2415() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.19,"-",0.14,0.95,"*",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2416() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.35,"/",0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2417() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.25,"-")));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2418() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.31,0.72,"-",0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2419() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2420() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.55,"/")));
        org.junit.Assert.assertEquals( (double) 0.8363636363636363, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2421() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.77,"+",0.6,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2422() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.23,0.01,0.81,0.55,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2423() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.67,"/",0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2424() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.04,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2425() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2426() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.04,0.09,0.24,"*",0.73,0.59,"+")));
        org.junit.Assert.assertEquals( (double) 1.3199999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2427() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.91,0.16,"/",0.57,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2428() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.12,0.24,"-")));
        org.junit.Assert.assertEquals( (double) -0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2429() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.14,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2430() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.33,0.19,0.99,0.5,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2431() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.96,0.68,"+")));
        org.junit.Assert.assertEquals( (double) 1.6400000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2432() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2433() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.7,0.02,0.65,0.77,0.65,"+","+")));
        org.junit.Assert.assertEquals( (double) 2.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2434() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.36,0.09,0.71,"-")));
        org.junit.Assert.assertEquals( (double) -0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2435() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.23,0.85,0.94,0.62,0.18,"*")));
        org.junit.Assert.assertEquals( (double) 0.11159999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2436() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.43,0.32,0.39,0.34,"/")));
        org.junit.Assert.assertEquals( (double) 1.1470588235294117, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2437() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.1,"+")));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2438() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.93,0.34,"/",0.61,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2439() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.54,0.43,"+","*",0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2440() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.53,"-",0.25,0.65,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2441() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.46,"*")));
        org.junit.Assert.assertEquals( (double) 0.0138, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2442() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.9,"/",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2443() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.16,"+",0.83,"/")));
        org.junit.Assert.assertEquals( (double) 1.108433734939759, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2444() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.58,0.75,0.28,"-")));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2445() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.59,0.33,"/",0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2446() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.68,"+")));
        org.junit.Assert.assertEquals( (double) 0.8500000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2447() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.13,0.88,"/")));
        org.junit.Assert.assertEquals( (double) 0.14772727272727273, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2448() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.07,0.72,0.87,0.67,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2449() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.36,"*")));
        org.junit.Assert.assertEquals( (double) 0.0468, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2450() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.98,0.97,0.29,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2451() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2452() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.94,0.08,"*",0.27,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2453() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.9,0.45,0.56,"/",0.86,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2454() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.49,0.13,0.99,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2455() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.65,0.67,"-")));
        org.junit.Assert.assertEquals( (double) -0.020000000000000018, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2456() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.29,"/")));
        org.junit.Assert.assertEquals( (double) 2.896551724137931, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2457() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.57,0.95,0.61,0.78,"+")));
        org.junit.Assert.assertEquals( (double) 1.3900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2458() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.81,0.59,0.18,0.12,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2459() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.09,0.03,"+","/")));
        org.junit.Assert.assertEquals( (double) 6.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2460() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.24,"-",0.26,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2461() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2462() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.21,0.78,0.69,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2463() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.06,0.33,"/",0.35,"+",0.35,"/")));
        org.junit.Assert.assertEquals( (double) 1.5194805194805194, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2464() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.66,0.1,0.71,"/","-")));
        org.junit.Assert.assertEquals( (double) 0.5191549295774648, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2465() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.46,0.12,0.13,0.5,0.18,0.84,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2466() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.64,0.02,0.72,0.33,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2467() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.69,0.23,"*")));
        org.junit.Assert.assertEquals( (double) 0.1587, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2468() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.16,0.95,0.76,"/",0.63,"*")));
        org.junit.Assert.assertEquals( (double) 0.7875, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2469() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.74,0.12,0.15,0.51)));
        org.junit.Assert.assertEquals( (double) 0.51, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2470() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.85,"/",0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2471() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.1,0.49,0.31,"*","+",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2472() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.32,0.79,"*",0.19,0.96,"-")));
        org.junit.Assert.assertEquals( (double) -0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2473() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.97,"+",0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2474() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.44,0.67,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2475() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2476() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.2,0.98,"-",0.2,0.56,"*",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2477() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.28,0.38,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2478() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.69,"*",0.28,0.03,0.02,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2479() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.78,0.36,0.94,0.7,"/")));
        org.junit.Assert.assertEquals( (double) 1.342857142857143, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2480() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.2,0.95,0.53,0.21,"+","+","/")));
        org.junit.Assert.assertEquals( (double) 0.1183431952662722, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2481() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.94,0.31,"+",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2482() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.03,"*")));
        org.junit.Assert.assertEquals( (double) 0.008400000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2483() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.32,"*",0.64,"+",0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2484() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.57,"/",0.05,0.78,"+",0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2485() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.35,0.54,0.72,0.45,"+",0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2486() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.19,"/")));
        org.junit.Assert.assertEquals( (double) 4.2105263157894735, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2487() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.64,0.17,"+","-",0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2488() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.13,"-",0.14,0.88,"/")));
        org.junit.Assert.assertEquals( (double) 0.15909090909090912, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2489() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.96,0.37,0.89,"+",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2490() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.22,0.86,0.39,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2491() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.65,0.79,"+",0.66,0.23,"*","-")));
        org.junit.Assert.assertEquals( (double) 1.2882, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2492() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.34,0.83,"-",0.15,"/","*",0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2493() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.49,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2494() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,1.0,0.79,0.77,"+","/")));
        org.junit.Assert.assertEquals( (double) 0.641025641025641, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2495() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.43,"/",0.06,0.62,"/","*",0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2496() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.03,0.63,0.16,0.75,"-","-")));
        org.junit.Assert.assertEquals( (double) 1.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2497() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.99,0.77,"/")));
        org.junit.Assert.assertEquals( (double) 1.2857142857142856, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2498() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.84,"/")));
        org.junit.Assert.assertEquals( (double) 0.09523809523809525, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2499() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.55,1.0,0.31,"-","*","*")));
        org.junit.Assert.assertEquals( (double) 0.314985, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2500() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.66,0.28,0.84,"-",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2501() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.39,"/",0.75,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2502() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2503() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.88,"/",0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2504() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.43,0.81,0.11,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2505() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.64,0.42,"*","+",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2506() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2507() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.79,"*")));
        org.junit.Assert.assertEquals( (double) 0.43450000000000005, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2508() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.64,0.19,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.16000000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2509() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.02,0.47,0.94,"-",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2510() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.23,0.47,0.42,0.8,0.62,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2511() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.05,"+")));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2512() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2513() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.87,"-",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2514() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2515() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2516() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.67,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2517() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.03,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2518() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.89,0.35,"*",0.5,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2519() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.68,0.56,0.36,0.93,"+")));
        org.junit.Assert.assertEquals( (double) 1.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2520() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.78,0.26,0.24,"*",0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2521() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.81,0.56,0.73,"-",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2522() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.76,0.1,"/",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2523() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.44,"+",0.64,0.09,0.45,0.29,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2524() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.93,0.76,0.5,0.74,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2525() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.36,0.36,0.62,0.82)));
        org.junit.Assert.assertEquals( (double) 0.82, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2526() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.32,0.62,"*","+",0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2527() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.86,"+")));
        org.junit.Assert.assertEquals( (double) 1.6600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2528() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.98,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2529() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2530() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.06,"*",0.57,"-",0.98,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2531() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.34,0.8,0.14,0.49,"*",0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2532() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.29,0.4,0.75,"*",0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2533() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.95,"-",0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2534() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.6,"+",0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2535() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.85,0.89,0.27,0.87,"+","*")));
        org.junit.Assert.assertEquals( (double) 1.0146000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2536() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.24,"+",0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2537() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.01,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2538() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2539() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.37,0.85,0.29,"+","/","+")));
        org.junit.Assert.assertEquals( (double) 0.44456140350877194, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2540() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.73,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2541() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.42,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2542() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.25,0.38)));
        org.junit.Assert.assertEquals( (double) 0.38, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2543() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.25,"+")));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2544() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.13,0.44,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2545() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.03,"*",0.69,0.85,"/","-")));
        org.junit.Assert.assertEquals( (double) -0.7829647058823529, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2546() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.51,0.66,"/",0.28,"+")));
        org.junit.Assert.assertEquals( (double) 1.0527272727272727, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2547() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.32,0.48,0.52,"-")));
        org.junit.Assert.assertEquals( (double) -0.040000000000000036, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2548() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.12,0.17,0.05)));
        org.junit.Assert.assertEquals( (double) 0.05, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2549() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.98,0.66,0.57,0.87,0.87,"+")));
        org.junit.Assert.assertEquals( (double) 1.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2550() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.03,0.41,0.76,0.77,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2551() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2552() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2553() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.45,0.79,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2554() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.05,0.54,"/",0.42,0.58,0.5,0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2555() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.66,0.69,0.66,0.31,"+","/",0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2556() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2557() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.51,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2558() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.6,0.3,0.58,0.25)));
        org.junit.Assert.assertEquals( (double) 0.25, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2559() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.74,0.45,0.86,0.11,"-","*","/")));
        org.junit.Assert.assertEquals( (double) 2.192592592592592, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2560() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2561() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.82,"+")));
        org.junit.Assert.assertEquals( (double) 1.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2562() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.87,0.04,0.1,0.41,0.39,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2563() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2564() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2565() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.77,0.86,0.76,1.0,0.35,0.98,"/")));
        org.junit.Assert.assertEquals( (double) 0.35714285714285715, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2566() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.04,0.41,0.49,0.59,"*")));
        org.junit.Assert.assertEquals( (double) 0.28909999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2567() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.11,0.96,"*",0.75,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2568() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.23,"*",0.6,"/",0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2569() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2570() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2571() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.41,"*",0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2572() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.56,0.83,0.2,"-","*","+")));
        org.junit.Assert.assertEquals( (double) 0.36279999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2573() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.42,0.23,"+","+",0.25,0.98,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2574() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.19,0.37,"-",0.6,"*")));
        org.junit.Assert.assertEquals( (double) -0.108, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2575() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.91,0.72,0.77,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2576() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.13,0.12,0.13,0.91,0.06,"-",0.5)));
        org.junit.Assert.assertEquals( (double) 0.5, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2577() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.73,0.3,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2578() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.5,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2579() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.84,0.61,"/",0.62,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2580() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2581() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2582() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.1,0.82,0.25,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2583() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2584() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.9,"/",0.22,"*",0.9,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2585() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.41,0.88,0.38,0.6,"-")));
        org.junit.Assert.assertEquals( (double) -0.21999999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2586() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.3,"/",0.2,1.0)));
        org.junit.Assert.assertEquals( (double) 1.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2587() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2588() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.25,0.76,0.51,0.65,"+")));
        org.junit.Assert.assertEquals( (double) 1.1600000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2589() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.4,0.95,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2590() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2591() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2592() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2593() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.92,0.74,"/")));
        org.junit.Assert.assertEquals( (double) 1.2432432432432432, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2594() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2595() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2596() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.25,0.57,"-",0.12,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2597() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.3,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2598() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.83,0.46,"-",0.42,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2599() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.73,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2600() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.48,0.54,0.01,"/",0.67,0.25,0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2601() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.74,"+",0.4,0.35,0.39,0.81)));
        org.junit.Assert.assertEquals( (double) 0.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2602() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.43,0.25,0.84,0.71,0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2603() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.5,"/",0.22,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2604() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.8,"*",0.52,0.91,0.71,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2605() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.35,0.52,0.45,0.06,0.68,0.29,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2606() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.49,0.76,0.24,"*")));
        org.junit.Assert.assertEquals( (double) 0.1824, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2607() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.88,0.02,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2608() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.71,"-")));
        org.junit.Assert.assertEquals( (double) -0.37999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2609() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.68,0.02,"*",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2610() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.95,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2611() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.16,"*",0.26,0.07,0.2,0.83,"*")));
        org.junit.Assert.assertEquals( (double) 0.166, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2612() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,1.0,"+")));
        org.junit.Assert.assertEquals( (double) 1.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2613() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.62,0.58,0.91,0.27,"-")));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2614() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2615() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.87,"/",0.02,"-",0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2616() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.4,"*",0.78,0.19,"+","-",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2617() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.79,0.36,"+","*")));
        org.junit.Assert.assertEquals( (double) 1.0924999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2618() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.51,0.44)));
        org.junit.Assert.assertEquals( (double) 0.44, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2619() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2620() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.64,0.06,"*",0.25,0.74,0.28,"-")));
        org.junit.Assert.assertEquals( (double) 0.45999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2621() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.37,0.03,"*",0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2622() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.89,1.0,0.08,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2623() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 1.0,0.67,"/")));
        org.junit.Assert.assertEquals( (double) 1.4925373134328357, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2624() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.98,0.01,"+",0.7,"-")));
        org.junit.Assert.assertEquals( (double) 0.29000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2625() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.1,"/",0.18,"-",0.15)));
        org.junit.Assert.assertEquals( (double) 0.15, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2626() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.47,0.81,"-",0.38,0.21,"+")));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2627() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.33,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2628() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.26,0.92,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2629() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2630() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.04,0.64,0.39,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2631() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2632() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2633() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.85,0.78,0.18,"*",0.41,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2634() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.62,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2635() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2636() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.48,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2637() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.01,0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2638() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.63,0.07,0.3,"-",0.54,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2639() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.07,0.68,0.52,"*",0.81,0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2640() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.48,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2641() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.09,"+")));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2642() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.87,0.93,"*",0.71,"/")));
        org.junit.Assert.assertEquals( (double) 1.1395774647887325, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2643() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.85,0.47,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2644() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.61,"+")));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2645() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.55,0.2,0.96,0.22,"+",0.16,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2646() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.87,"+",0.64,0.79,"*","/")));
        org.junit.Assert.assertEquals( (double) 3.34256329113924, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2647() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.31,"/")));
        org.junit.Assert.assertEquals( (double) 1.9354838709677418, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2648() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2649() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.4,"+")));
        org.junit.Assert.assertEquals( (double) 0.8300000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2650() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2651() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.47,0.67,0.93,0.18,0.87,"-",0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2652() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.75,0.96,"+")));
        org.junit.Assert.assertEquals( (double) 1.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2653() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.1,0.55,0.83,"+",0.58,0.09,0.37)));
        org.junit.Assert.assertEquals( (double) 0.37, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2654() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.38,"+",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2655() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.06,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2656() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.89,"/",0.2,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2657() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.85,"*",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2658() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.53,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2659() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2660() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.8,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2661() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.4,"-",0.87,"-",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2662() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.69,0.14,"/",0.36,0.93,0.06,"*")));
        org.junit.Assert.assertEquals( (double) 0.0558, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2663() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2664() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.97,"*",0.83,0.46,0.84,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2665() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.17,"/",0.08)));
        org.junit.Assert.assertEquals( (double) 0.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2666() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.59,0.69,0.92,0.84,0.54,0.25,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2667() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.83,"+",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2668() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2669() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.3,0.61,0.1,0.88,0.65,0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2670() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.58,0.15,"*")));
        org.junit.Assert.assertEquals( (double) 0.087, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2671() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2672() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.21,0.35,"-",0.43,"-",0.27,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2673() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.07,"-",0.72,"*")));
        org.junit.Assert.assertEquals( (double) 0.1872, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2674() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.27,0.64,"+",0.32,0.11,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2675() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.83,0.13,0.38,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2676() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2677() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.45,0.21,"*",0.59,0.43,0.28,0.26)));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2678() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.72,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2679() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.19,0.18,0.22,"-","/",0.53,"*")));
        org.junit.Assert.assertEquals( (double) -2.5174999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2680() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.74,"/",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2681() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2682() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.63,"/",0.14,"-",0.5,"-",0.06)));
        org.junit.Assert.assertEquals( (double) 0.06, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2683() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2684() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.59,0.98,0.29,"-",0.48,0.27,"-")));
        org.junit.Assert.assertEquals( (double) 0.20999999999999996, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2685() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2686() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.56,0.11,"+",0.31,"*")));
        org.junit.Assert.assertEquals( (double) 0.20770000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2687() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2688() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.18,"+")));
        org.junit.Assert.assertEquals( (double) 1.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2689() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.73,0.39,"/")));
        org.junit.Assert.assertEquals( (double) 1.8717948717948716, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2690() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.71,"/")));
        org.junit.Assert.assertEquals( (double) 0.3802816901408451, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2691() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.25,0.19,0.36,0.18,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2692() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.82,0.53,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2693() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.42,0.01,0.3,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2694() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.84,0.01,0.97,0.36,"-","-","/")));
        org.junit.Assert.assertEquals( (double) -1.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2695() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.51,"/",0.87,"-",0.49,"/",0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2696() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2697() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.95,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2698() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.16,0.97,0.51,"-",0.2,"-",0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2699() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.1,"/")));
        org.junit.Assert.assertEquals( (double) 4.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2700() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.68,0.3,"-",0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2701() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.43,0.32,0.61,0.16,0.61,0.06,"*")));
        org.junit.Assert.assertEquals( (double) 0.0366, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2702() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2703() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.67,0.36,0.6,"/","+","/")));
        org.junit.Assert.assertEquals( (double) 0.22834645669291337, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2704() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.91,0.2,0.56,0.08,0.77,"-","/")));
        org.junit.Assert.assertEquals( (double) -0.8115942028985508, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2705() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.61,"+")));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2706() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.87,"*",0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2707() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.91,0.86,0.92,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2708() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2709() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.43,0.61,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2710() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2711() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2712() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2713() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2714() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.76,0.77,0.05,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2715() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.46,0.55,0.66,0.98,"*","+")));
        org.junit.Assert.assertEquals( (double) 1.1968, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2716() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.29,"/")));
        org.junit.Assert.assertEquals( (double) 1.8620689655172415, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2717() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2718() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.66,0.7,0.07,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2719() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.38,0.06,0.83,0.03,"/","+",0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2720() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.31,0.77,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2721() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.95,0.78,"/")));
        org.junit.Assert.assertEquals( (double) 1.2179487179487178, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2722() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.28,"/",0.36,"*",0.74,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2723() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2724() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.36)));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2725() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2726() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.94,"-")));
        org.junit.Assert.assertEquals( (double) -0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2727() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.9,0.28,0.25,"*","-")));
        org.junit.Assert.assertEquals( (double) 0.8300000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2728() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.69,0.4)));
        org.junit.Assert.assertEquals( (double) 0.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2729() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.4,0.56,"/",0.83,"-")));
        org.junit.Assert.assertEquals( (double) -0.11571428571428566, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2730() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.36,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2731() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2732() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.96,0.86,0.88,0.06,"/")));
        org.junit.Assert.assertEquals( (double) 14.666666666666668, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2733() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.48,"+",0.61,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2734() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.64,0.13,"/","-",0.13,"-")));
        org.junit.Assert.assertEquals( (double) -5.0430769230769235, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2735() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.24,0.69,0.44,0.09,"-")));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2736() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.97,"*")));
        org.junit.Assert.assertEquals( (double) 0.2619, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2737() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.37,0.9,"+")));
        org.junit.Assert.assertEquals( (double) 1.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2738() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.52,0.14,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2739() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.32)));
        org.junit.Assert.assertEquals( (double) 0.32, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2740() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.71,"/")));
        org.junit.Assert.assertEquals( (double) 0.2394366197183099, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2741() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.97,0.95)));
        org.junit.Assert.assertEquals( (double) 0.95, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2742() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2743() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.27,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2744() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.67,0.98,"+",0.17,"/")));
        org.junit.Assert.assertEquals( (double) 9.705882352941176, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2745() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.37,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2746() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.51,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2747() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.29,"+",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2748() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.37,"-",0.07,0.6,0.71,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2749() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.32,0.06,"*")));
        org.junit.Assert.assertEquals( (double) 0.0192, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2750() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.24,0.43,0.62,0.46,0.29,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2751() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2752() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.96,"/")));
        org.junit.Assert.assertEquals( (double) 0.052083333333333336, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2753() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2754() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.72,0.29,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2755() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.38,"/")));
        org.junit.Assert.assertEquals( (double) 0.8421052631578947, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2756() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.8,"/",0.34,0.23,"/",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2757() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.77,0.7,"/")));
        org.junit.Assert.assertEquals( (double) 1.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2758() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.68,0.51,"/",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2759() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.93)));
        org.junit.Assert.assertEquals( (double) 0.93, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2760() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.75,0.06,"+",0.62,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2761() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.69,0.16,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2762() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.08,0.68,0.02,0.63,0.25,"+","*")));
        org.junit.Assert.assertEquals( (double) 0.0176, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2763() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.9,0.8,0.09,0.41,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2764() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2765() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.77,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2766() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.67,0.89,0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2767() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.47,"*",0.02,0.15,0.18,0.42,0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2768() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.85,"*",0.78,0.17,0.01,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2769() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.67,"/",0.65,0.28,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2770() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.93,"+",0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2771() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.44,"/")));
        org.junit.Assert.assertEquals( (double) 0.40909090909090906, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2772() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.81,0.96,"-",0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2773() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2774() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.59,0.57,"/")));
        org.junit.Assert.assertEquals( (double) 1.0350877192982457, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2775() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.64,"+",0.55,"+",0.52,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2776() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.65,1.0,0.28,"-","-")));
        org.junit.Assert.assertEquals( (double) -0.06999999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2777() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2778() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.97,0.21,0.72,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2779() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.31,"+",0.12,0.93,"*",0.65)));
        org.junit.Assert.assertEquals( (double) 0.65, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2780() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.44,0.25,"*")));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2781() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.95,"/")));
        org.junit.Assert.assertEquals( (double) 0.8631578947368421, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2782() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.25,0.82,0.01,"+","*",0.96)));
        org.junit.Assert.assertEquals( (double) 0.96, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2783() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.39,0.58,0.15,0.68,0.6,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2784() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.84,0.9,"*",0.78,0.24,0.12,"/")));
        org.junit.Assert.assertEquals( (double) 2.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2785() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.09,0.9,0.14,"*")));
        org.junit.Assert.assertEquals( (double) 0.12600000000000003, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2786() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.08,"*")));
        org.junit.Assert.assertEquals( (double) 0.0424, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2787() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.48,"/",0.83,0.62,"+",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2788() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.12,0.93,"/",0.93,"+")));
        org.junit.Assert.assertEquals( (double) 1.0590322580645162, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2789() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.45)));
        org.junit.Assert.assertEquals( (double) 0.45, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2790() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.88,0.73,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2791() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.56,0.62,0.8,0.24,"*")));
        org.junit.Assert.assertEquals( (double) 0.192, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2792() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.86,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2793() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.69,"*",0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2794() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.97,0.89,0.49,0.0,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2795() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.07,0.43,0.04,0.76,"*")));
        org.junit.Assert.assertEquals( (double) 0.0304, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2796() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.47,"-",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2797() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.79,0.34)));
        org.junit.Assert.assertEquals( (double) 0.34, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2798() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.69,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2799() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.79,0.87,0.07,"/","-",0.44,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2800() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2801() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.55,0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2802() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.32,0.33,0.49,"/",0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2803() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.18,0.72)));
        org.junit.Assert.assertEquals( (double) 0.72, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2804() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.29,0.78,0.76,"+")));
        org.junit.Assert.assertEquals( (double) 1.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2805() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.62,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2806() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.24,"-",0.07,0.68)));
        org.junit.Assert.assertEquals( (double) 0.68, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2807() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.4,"/",0.83,0.35,0.76,0.45,"/")));
        org.junit.Assert.assertEquals( (double) 1.6888888888888889, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2808() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.84,0.84,"*",0.25,"+",0.88,"+")));
        org.junit.Assert.assertEquals( (double) 1.8356, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2809() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.75,0.55,0.84,"+")));
        org.junit.Assert.assertEquals( (double) 1.3900000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2810() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.82,"+")));
        org.junit.Assert.assertEquals( (double) 1.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2811() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.63,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2812() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.55,"-",0.6,"-",0.53,0.63,0.22)));
        org.junit.Assert.assertEquals( (double) 0.22, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2813() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2814() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2815() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2816() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2817() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2818() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.45,0.55,"-",0.34,0.65,0.3,0.85)));
        org.junit.Assert.assertEquals( (double) 0.85, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2819() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.72,"-",0.49,0.23,"*")));
        org.junit.Assert.assertEquals( (double) 0.11270000000000001, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2820() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.4,0.94,"-")));
        org.junit.Assert.assertEquals( (double) -0.5399999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2821() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.66,0.08,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2822() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.23,"-",0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2823() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.53,0.94,0.92,0.49,"+",0.0,"*")));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2824() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.83,"/",0.03,"+",0.43,"+")));
        org.junit.Assert.assertEquals( (double) 1.4479518072289155, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2825() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.05,"*",0.79,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2826() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.22,0.36,0.66,0.24,"*",0.27,0.62,0.28)));
        org.junit.Assert.assertEquals( (double) 0.28, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2827() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.02,0.53,0.78,0.85,0.86)));
        org.junit.Assert.assertEquals( (double) 0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2828() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.76,"-",0.1,0.13,"*",0.11,0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2829() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.93,"/")));
        org.junit.Assert.assertEquals( (double) 0.8602150537634409, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2830() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.95,"*",0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2831() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.67,0.06,"/")));
        org.junit.Assert.assertEquals( (double) 11.166666666666668, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2832() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.24,"+",0.2,"*",0.34,"/")));
        org.junit.Assert.assertEquals( (double) 0.17058823529411762, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2833() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.62,"*",0.6,0.28,0.3,"*",0.9)));
        org.junit.Assert.assertEquals( (double) 0.9, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2834() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.07,0.05,"*",0.8,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2835() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.87,"+",0.1,0.25,0.42,0.33,0.94)));
        org.junit.Assert.assertEquals( (double) 0.94, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2836() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.6,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2837() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.6,0.54,"+",0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2838() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.28,0.04,"-")));
        org.junit.Assert.assertEquals( (double) 0.24000000000000002, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2839() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2840() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2841() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.07,0.36,"+",0.11,0.45,"*",0.44,"*")));
        org.junit.Assert.assertEquals( (double) 0.02178, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2842() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.91,0.61,0.3,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2843() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.44,0.63,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2844() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2845() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2846() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.64,0.77,0.11,0.45,"*")));
        org.junit.Assert.assertEquals( (double) 0.0495, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2847() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.06,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2848() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.78,0.54,0.07,0.18,0.41,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2849() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.59,"/",0.84,0.35,"/")));
        org.junit.Assert.assertEquals( (double) 2.4, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2850() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.96,0.74,"+")));
        org.junit.Assert.assertEquals( (double) 1.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2851() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.18,0.89,0.21)));
        org.junit.Assert.assertEquals( (double) 0.21, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2852() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.47,0.27,0.88,0.65,"-",0.69,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2853() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.3,0.94,"-",0.81,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2854() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.46,0.14,0.97,0.34,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2855() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.13,0.16,0.58,0.05,"-",0.7)));
        org.junit.Assert.assertEquals( (double) 0.7, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2856() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.15,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2857() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.13,0.04,0.34,"-",0.03,0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2858() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.46,0.89,0.61)));
        org.junit.Assert.assertEquals( (double) 0.61, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2859() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.62,0.89,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2860() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.9,0.38,"/",0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2861() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.36,0.21,0.69,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2862() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.94,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2863() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.87,0.66,0.85,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2864() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.91,0.9,0.79)));
        org.junit.Assert.assertEquals( (double) 0.79, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2865() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.47,0.57,"*",0.19,0.83,"/")));
        org.junit.Assert.assertEquals( (double) 0.22891566265060243, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2866() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.9,"/",0.75)));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2867() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.89,"+")));
        org.junit.Assert.assertEquals( (double) 1.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2868() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.76,0.28,0.78,"+",0.59,"-","/")));
        org.junit.Assert.assertEquals( (double) 1.6170212765957444, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2869() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.33,0.06,0.74,"+","-",0.23)));
        org.junit.Assert.assertEquals( (double) 0.23, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2870() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.04,"*",0.79,0.41,0.9,"/")));
        org.junit.Assert.assertEquals( (double) 0.4555555555555555, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2871() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.31,0.26,0.1,0.51,"/",0.23,"*")));
        org.junit.Assert.assertEquals( (double) 0.045098039215686274, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2872() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.85,0.61,"*",0.61,0.45,"-",0.98)));
        org.junit.Assert.assertEquals( (double) 0.98, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2873() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.4,0.62,"*",0.27,0.43,"-")));
        org.junit.Assert.assertEquals( (double) -0.15999999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2874() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.45,0.24,0.07,0.85,"+","-","-")));
        org.junit.Assert.assertEquals( (double) 1.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2875() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.83,0.02,"-",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2876() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.0,0.15,"+",0.1,"*")));
        org.junit.Assert.assertEquals( (double) 0.015, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2877() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.47,0.43,0.43,"-","-",0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2878() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.23,"-")));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2879() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.87,0.6,0.5,"+",0.53,0.46,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2880() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.89,"-",0.43,0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2881() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.1,0.77,0.47)));
        org.junit.Assert.assertEquals( (double) 0.47, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2882() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.84,0.85,0.68,"-")));
        org.junit.Assert.assertEquals( (double) 0.16999999999999993, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2883() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.84,0.57)));
        org.junit.Assert.assertEquals( (double) 0.57, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2884() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.75,"*",0.48,0.86,0.19,"-",0.3)));
        org.junit.Assert.assertEquals( (double) 0.3, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2885() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.99,0.81,0.76,"-","/",0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2886() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.96,0.34,0.55,0.17,"/","-")));
        org.junit.Assert.assertEquals( (double) -2.895294117647059, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2887() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.18,0.6,"+")));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2888() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.73,0.44,"*",0.59,"*")));
        org.junit.Assert.assertEquals( (double) 0.18950799999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2889() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.12,"-")));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2890() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2891() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.15,0.27,0.89,0.36,0.08,0.48)));
        org.junit.Assert.assertEquals( (double) 0.48, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2892() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.87)));
        org.junit.Assert.assertEquals( (double) 0.87, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2893() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.77)));
        org.junit.Assert.assertEquals( (double) 0.77, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2894() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.59,0.84,0.83,"+",0.19,"+",0.13)));
        org.junit.Assert.assertEquals( (double) 0.13, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2895() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.9,0.54,"-")));
        org.junit.Assert.assertEquals( (double) 0.36, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2896() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.99,"*",0.95,"-")));
        org.junit.Assert.assertEquals( (double) -0.39559999999999995, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2897() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.5,0.88,0.93,"+")));
        org.junit.Assert.assertEquals( (double) 1.81, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2898() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.54,0.95,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2899() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.53,0.42)));
        org.junit.Assert.assertEquals( (double) 0.42, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2900() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.37,0.68,0.13,0.53,0.46,0.27,"/","+")));
        org.junit.Assert.assertEquals( (double) 2.2337037037037035, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2901() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,1.0,"+",0.16,0.92,0.07)));
        org.junit.Assert.assertEquals( (double) 0.07, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2902() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.05,"*",0.98,0.8,0.75,"-",0.02)));
        org.junit.Assert.assertEquals( (double) 0.02, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2903() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.94,"/",0.38,0.64,"*",0.76,0.52)));
        org.junit.Assert.assertEquals( (double) 0.52, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2904() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.33,0.15,"+",0.24,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2905() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.81,0.2,"*","+",0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2906() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.98,0.28,"+")));
        org.junit.Assert.assertEquals( (double) 1.26, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2907() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.32,0.46,"/",0.21,0.88,"-","+")));
        org.junit.Assert.assertEquals( (double) 0.02565217391304342, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2908() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.44,0.12,"/",0.17,"+",0.19)));
        org.junit.Assert.assertEquals( (double) 0.19, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2909() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.66,"-",0.68,"*",0.35,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2910() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2911() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.11,"/",0.26,"/")));
        org.junit.Assert.assertEquals( (double) 23.776223776223777, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2912() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.19,0.81,0.03)));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2913() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.57,0.71,"+","/",0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2914() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2915() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.65,0.43,"+")));
        org.junit.Assert.assertEquals( (double) 1.08, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2916() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.33,0.33,0.82,"-","+","*",0.27)));
        org.junit.Assert.assertEquals( (double) 0.27, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2917() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.35,0.68,0.72,"-")));
        org.junit.Assert.assertEquals( (double) -0.039999999999999925, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2918() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.04,0.78,"-",0.44,0.47,"-",0.76)));
        org.junit.Assert.assertEquals( (double) 0.76, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2919() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.58,0.9,"*",0.04)));
        org.junit.Assert.assertEquals( (double) 0.04, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2920() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.97)));
        org.junit.Assert.assertEquals( (double) 0.97, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2921() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.68,0.7,0.52,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2922() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2923() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.66,0.55)));
        org.junit.Assert.assertEquals( (double) 0.55, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2924() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.41,0.44,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2925() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.19,0.56)));
        org.junit.Assert.assertEquals( (double) 0.56, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2926() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.61,0.44,"+",0.09,0.23,0.86,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.3365217391304347, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2927() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.05,"-",0.29,"*")));
        org.junit.Assert.assertEquals( (double) 0.1334, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2928() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.0,0.49,0.83,0.75,0.59,"/")));
        org.junit.Assert.assertEquals( (double) 1.2711864406779663, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2929() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.09,0.03,0.61,0.09,0.64)));
        org.junit.Assert.assertEquals( (double) 0.64, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2930() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.24,0.13,0.56,0.75,0.66,"*")));
        org.junit.Assert.assertEquals( (double) 0.495, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2931() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.49,"*")));
        org.junit.Assert.assertEquals( (double) 0.14209999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2932() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.8,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2933() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.71,0.59,0.7,0.58,"-",0.16,"/")));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2934() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.1,0.44,"+",0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2935() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.78,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2936() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.74,0.92,"/",0.56,0.89,0.11,0.18)));
        org.junit.Assert.assertEquals( (double) 0.18, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2937() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.6,0.17,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2938() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.01,0.83,0.59,0.51,0.66,"/")));
        org.junit.Assert.assertEquals( (double) 0.7727272727272727, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2939() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.52,0.63,"*",0.96,0.15,0.88,0.99,0.66)));
        org.junit.Assert.assertEquals( (double) 0.66, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2940() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.56,0.35,0.85,"+","-")));
        org.junit.Assert.assertEquals( (double) -0.6399999999999999, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2941() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.15,"+",0.89,0.59,0.11,0.99)));
        org.junit.Assert.assertEquals( (double) 0.99, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2942() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.12,0.67,"-",0.56,0.34,"/",0.8)));
        org.junit.Assert.assertEquals( (double) 0.8, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2943() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.42,0.84,0.24,0.35,0.63,"*")));
        org.junit.Assert.assertEquals( (double) 0.22049999999999997, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2944() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.76,0.83,0.29,0.36,0.01,0.43,0.16)));
        org.junit.Assert.assertEquals( (double) 0.16, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2945() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.95,0.61,0.59,0.01,"-",0.44,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2946() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.93,0.68,0.65,0.25,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2947() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.11,0.59)));
        org.junit.Assert.assertEquals( (double) 0.59, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2948() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.17)));
        org.junit.Assert.assertEquals( (double) 0.17, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2949() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.21,0.16,"+",0.32,0.75,"*",0.62)));
        org.junit.Assert.assertEquals( (double) 0.62, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2950() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.48,0.9,"-")));
        org.junit.Assert.assertEquals( (double) -0.42000000000000004, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2951() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.05,0.17,0.52,0.47,"-",0.71)));
        org.junit.Assert.assertEquals( (double) 0.71, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2952() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.7,0.05,0.6)));
        org.junit.Assert.assertEquals( (double) 0.6, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2953() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.56,0.99,0.24,"-")));
        org.junit.Assert.assertEquals( (double) 0.75, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2954() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.01,0.97,0.46)));
        org.junit.Assert.assertEquals( (double) 0.46, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2955() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.02,0.92)));
        org.junit.Assert.assertEquals( (double) 0.92, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2956() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.41,0.89)));
        org.junit.Assert.assertEquals( (double) 0.89, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2957() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.69,0.33)));
        org.junit.Assert.assertEquals( (double) 0.33, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2958() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.26,0.35,0.17,0.53)));
        org.junit.Assert.assertEquals( (double) 0.53, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2959() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.75,0.28,"+",0.41,0.11,"+",0.88)));
        org.junit.Assert.assertEquals( (double) 0.88, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2960() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.24)));
        org.junit.Assert.assertEquals( (double) 0.24, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2961() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.45,0.25,0.85,0.37,0.66,0.54)));
        org.junit.Assert.assertEquals( (double) 0.54, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2962() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.38,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2963() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.27,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2964() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.97,0.4,"*",0.23,"+",0.99,0.74)));
        org.junit.Assert.assertEquals( (double) 0.74, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2965() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.25,0.75,0.72,0.79,0.43,0.56,0.91)));
        org.junit.Assert.assertEquals( (double) 0.91, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2966() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.5,"*",0.65,0.47,"*")));
        org.junit.Assert.assertEquals( (double) 0.3055, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2967() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.49,0.88,"+",0.76,0.27,"/","/")));
        org.junit.Assert.assertEquals( (double) 0.4867105263157895, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2968() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.04,0.53,0.99,0.03,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2969() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.29,0.0,0.98,0.0,0.86,"-")));
        org.junit.Assert.assertEquals( (double) -0.86, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2970() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.06,0.74,0.69)));
        org.junit.Assert.assertEquals( (double) 0.69, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2971() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.33,0.12,0.24,0.0)));
        org.junit.Assert.assertEquals( (double) 0.0, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2972() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.31,0.69,"+",0.54,0.51,0.39,0.1)));
        org.junit.Assert.assertEquals( (double) 0.1, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2973() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.6,0.65,"+","+",0.35)));
        org.junit.Assert.assertEquals( (double) 0.35, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2974() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.13,0.34,"-",0.21,0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2975() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.51,0.23,0.06,0.78,0.58)));
        org.junit.Assert.assertEquals( (double) 0.58, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2976() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.14,0.24,1.0,0.15,0.97,0.07,0.71,0.67)));
        org.junit.Assert.assertEquals( (double) 0.67, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2977() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.2,0.32,0.37,0.84)));
        org.junit.Assert.assertEquals( (double) 0.84, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2978() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.39,0.09)));
        org.junit.Assert.assertEquals( (double) 0.09, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2979() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.23,0.19,0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2980() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.05,0.62,0.24,0.21,"-")));
        org.junit.Assert.assertEquals( (double) 0.03, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2981() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.92,0.97,0.73)));
        org.junit.Assert.assertEquals( (double) 0.73, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2982() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.59,"-",0.72,0.43)));
        org.junit.Assert.assertEquals( (double) 0.43, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2983() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.42,"-",0.42,"*",0.16,0.12)));
        org.junit.Assert.assertEquals( (double) 0.12, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2984() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.67,0.33,0.23,0.31)));
        org.junit.Assert.assertEquals( (double) 0.31, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2985() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.03,0.32,"+",0.12,0.49)));
        org.junit.Assert.assertEquals( (double) 0.49, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2986() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.54,0.89,"+",0.4,"+",0.74,0.88,0.78)));
        org.junit.Assert.assertEquals( (double) 0.78, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2987() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.73,0.69,0.17,0.01)));
        org.junit.Assert.assertEquals( (double) 0.01, result, 0.0);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2988() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.29,0.37,0.74,"*","*",0.82,"+")));
        org.junit.Assert.assertEquals( (double) 0.8994019999999999, result, 0.0);
    }

    public void test_2989() throws java.lang.Exception {
    }
}

