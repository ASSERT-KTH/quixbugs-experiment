package java_programs;


public class LIS_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -53,92,52,1,96,58,46,17,3,84,82,88,56,49,-72,79,31,-80,51});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 23,61,68,42,-48,44,62,-6});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 41,73,-15,80,-29,75,98,6,7,79});
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 72});
        org.junit.Assert.assertEquals( (int) 1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,39});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 7,22,-90,-46,89,-20,4,78,-4,70,31,73,17,50,27,10,62});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 83,-6,36,65,54,6,39,46,-19,63,-47});
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ -87,29,-44,-65});
        org.junit.Assert.assertEquals( (int) 2, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 68,55,34,95,-19,20,54,13,-96,29,44,45,79,47,23,89,-51});
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.LIS.lis(new int[]{ 71,64,30,-7,68});
        org.junit.Assert.assertEquals( (int) 2, result);
    }
}

