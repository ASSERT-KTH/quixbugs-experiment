package java_programs;


public class RPN_EVAL_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.55,0.73,0.59,"+")));
        org.junit.Assert.assertEquals( (double) 1.3199999999999998, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.89,0.2,0.05,0.24,0.64,0.16,"*")));
        org.junit.Assert.assertEquals( (double) 0.1024, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.17,0.14,0.4,0.65,0.2)));
        org.junit.Assert.assertEquals( (double) 0.2, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.34,0.49,"+",0.39)));
        org.junit.Assert.assertEquals( (double) 0.39, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.57,0.11)));
        org.junit.Assert.assertEquals( (double) 0.11, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.3,0.25,0.17,0.78,0.83)));
        org.junit.Assert.assertEquals( (double) 0.83, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.64,0.04,"+",0.08,0.86,"/","*")));
        org.junit.Assert.assertEquals( (double) 0.06325581395348838, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.16,0.83,"-",0.41)));
        org.junit.Assert.assertEquals( (double) 0.41, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.82,0.76,0.63)));
        org.junit.Assert.assertEquals( (double) 0.63, result, 0.0);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.lang.Double result = java_programs.RPN_EVAL.rpn_eval(new java.util.ArrayList(java.util.Arrays.asList( 0.35,0.29)));
        org.junit.Assert.assertEquals( (double) 0.29, result, 0.0);
    }


}

