package java_programs;


public class LEVENSHTEIN_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("ZuRSS","oOL");
        org.junit.Assert.assertEquals( (int) 5, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("aJwPVdMt","pKljU");
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("QIsrghju","zUuSLhbrl");
        org.junit.Assert.assertEquals( (int) 8, result);
    }

    @org.junit.Test(timeout = 60000)
    @org.junit.Ignore
    public void test_3() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("AQCydSZE","NPCVEXp");
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("F","UAW");
        org.junit.Assert.assertEquals( (int) 3, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("IraM","ljegxRDTE");
        org.junit.Assert.assertEquals( (int) 9, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("NyzcCYC","PgbYGfzQcS");
        org.junit.Assert.assertEquals( (int) 10, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("zAYG","XMCu");
        org.junit.Assert.assertEquals( (int) 4, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("StHPBAa","m");
        org.junit.Assert.assertEquals( (int) 7, result);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        int result = java_programs.LEVENSHTEIN.levenshtein("IRDSiKd","IU");
        org.junit.Assert.assertEquals( (int) 6, result);
    }
}

