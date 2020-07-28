package fr.inria.coming.codefeatures;

public class ManualLISTest {
	/**
	 * Below tests are manually added for assessing LIS patch correctness
	 * 
	 */
	 @org.junit.Test
	    public void test_1() throws java.lang.Exception {
	        int result =LIS.lis(new int[]{4,2,3,1,5});
	        org.junit.Assert.assertEquals( (int) 3, result);
	    }
	    
	    @org.junit.Test
	    public void test_2() throws java.lang.Exception {
	        int result =LIS.lis(new int[]{4,2});
	        org.junit.Assert.assertEquals( (int) 1, result);
	    }
	    
	    @org.junit.Test
	    public void test_3() throws java.lang.Exception {
	        int result =LIS.lis(new int[]{4,5});
	        org.junit.Assert.assertEquals( (int) 2, result);
	    }
    
    @org.junit.Test
    public void test_4() throws java.lang.Exception {
        int result =LIS.lis(new int[]{5,6, 7, 1, 2, 8});
        org.junit.Assert.assertEquals( (int) 4, result);
    }
    
    @org.junit.Test
    public void test_5() throws java.lang.Exception {
        int result =LIS.lis(new int[]{10,9,2,5,3,7,101,18});
        org.junit.Assert.assertEquals( (int) 4, result);
    }
    @org.junit.Test
    public void test_6() throws java.lang.Exception {
        int result =LIS.lis(new int[]{2,1,5,3,6,4,8,9,7});
        org.junit.Assert.assertEquals( (int) 5, result);
    }
    @org.junit.Test
    public void test_7() throws java.lang.Exception {
        int result =LIS.lis(new int[]{10, 22, 9, 33, 21, 50, 41, 60, 80});
        org.junit.Assert.assertEquals( (int) 6, result);
    }
    @org.junit.Test
    public void test_8() throws java.lang.Exception {
        int result =LIS.lis(new int[]{0,8,4,12,2,10,6,14,1,9,5,13,3,11,7,15});
        org.junit.Assert.assertEquals( (int) 6, result);
    }
    
    @org.junit.Test
    public void test_9() throws java.lang.Exception {
        int result =LIS.lis(new int[]{3, 10, 2, 1, 20});
        org.junit.Assert.assertEquals( (int) 3, result);
    }
    
    @org.junit.Test
    public void test_10() throws java.lang.Exception {
        int result =LIS.lis(new int[]{3, 2});
        org.junit.Assert.assertEquals( (int) 1, result);
    }
    
    @org.junit.Test
    public void test_11() throws java.lang.Exception {
        int result =LIS.lis(new int[]{50, 3, 10, 7, 40, 80});
        org.junit.Assert.assertEquals( (int) 4, result);
    }
    
    @org.junit.Test
    public void test_12() throws java.lang.Exception {
        int result =LIS.lis(new int[]{10, 22, 9, 33, 21, 50, 41, 60});
        org.junit.Assert.assertEquals( (int) 5, result);
    }
    
    @org.junit.Test
    public void test_13() throws java.lang.Exception {
        int result =LIS.lis(new int[]{3,2,4,3,8});
        org.junit.Assert.assertEquals( (int) 3, result);
    }
    
    @org.junit.Test
    public void test_14() throws java.lang.Exception {
        int result =LIS.lis(new int[]{5,2,7,4,3,8});
        org.junit.Assert.assertEquals( (int) 3, result);
    }
    
    @org.junit.Test
    public void test_15() throws java.lang.Exception {
        int result =LIS.lis(new int[]{6,2,4,3,7,1,5,20});
        org.junit.Assert.assertEquals( (int) 4, result);
    }
    
    @org.junit.Test
    public void test_16() throws java.lang.Exception {
        int result =LIS.lis(new int[]{16,12,14,13,17,10,15});
        org.junit.Assert.assertEquals( (int) 3, result);
    }
    
   
}
