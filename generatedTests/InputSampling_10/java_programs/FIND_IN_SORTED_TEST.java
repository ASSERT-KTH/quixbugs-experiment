package java_programs;


public class FIND_IN_SORTED_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{},(int)74);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -36,25,31,58,64,92},(int)35);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -69,-60,-28,-19,2,13,17,24,27,48,56,57,59,73},(int)82);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ 10,67},(int)98);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -82,-58,-53,-39,-27,-26,30,38,39,58,67,70,93},(int)75);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -26,12,47,79,80,93},(int)40);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -12,18,34,34,58,71,81,81},(int)76);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -74,-55,-37,-11,-11,-9,9,12,15,15,32,34,73,83},(int)38);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -83,42},(int)10);
        org.junit.Assert.assertEquals( (int) -1, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.FIND_IN_SORTED.find_in_sorted(new int[]{ -81,-10,0,7,9,28,49,71,72,79,86,87},(int)18);
        org.junit.Assert.assertEquals( (int) -1, result);
    }
}

