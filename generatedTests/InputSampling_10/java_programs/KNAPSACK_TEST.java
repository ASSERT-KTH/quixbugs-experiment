package java_programs;


public class KNAPSACK_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)76,new int[][]{ {31,72}});
        org.junit.Assert.assertEquals( (int) 72, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)37,new int[][]{ {46,57}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)30,new int[][]{ {11,50},{72,-32},{2,6},{49,31},{76,96},{27,68},{61,31},{83,47},{21,39},{34,87},{33,11},{28,-6},{82,-90},{6,20},{60,-24},{75,14}});
        org.junit.Assert.assertEquals( (int) 76, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)8,new int[][]{ {62,34},{51,45},{22,53},{88,80},{15,55},{14,41},{72,71},{81,-77},{94,40},{29,75}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)36,new int[][]{ {57,30},{54,83},{36,84},{99,58}});
        org.junit.Assert.assertEquals( (int) 84, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)60,new int[][]{ {70,51},{3,46},{62,57}});
        org.junit.Assert.assertEquals( (int) 46, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)32,new int[][]{ {30,29},{12,77},{75,93}});
        org.junit.Assert.assertEquals( (int) 77, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)0,new int[][]{ {83,40},{0,92},{58,-64},{38,-6},{17,67},{57,-21}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)43,new int[][]{ {88,-28}});
        org.junit.Assert.assertEquals( (int) 0, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.KNAPSACK.knapsack((int)48,new int[][]{ {65,66},{14,27}});
        org.junit.Assert.assertEquals( (int) 27, result);
    }


}

