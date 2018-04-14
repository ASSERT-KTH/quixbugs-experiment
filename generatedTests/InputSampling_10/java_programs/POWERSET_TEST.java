package java_programs;


public class POWERSET_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MSAoC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MSAoC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TKUA","U","KduT","eqqg","silp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[silp],[eqqg],[eqqg,silp],[KduT],[KduT,silp],[KduT,eqqg],[KduT,eqqg,silp],[U],[U,silp],[U,eqqg],[U,eqqg,silp],[U,KduT],[U,KduT,silp],[U,KduT,eqqg],[U,KduT,eqqg,silp],[TKUA],[TKUA,silp],[TKUA,eqqg],[TKUA,eqqg,silp],[TKUA,KduT],[TKUA,KduT,silp],[TKUA,KduT,eqqg],[TKUA,KduT,eqqg,silp],[TKUA,U],[TKUA,U,silp],[TKUA,U,eqqg],[TKUA,U,eqqg,silp],[TKUA,U,KduT],[TKUA,U,KduT,silp],[TKUA,U,KduT,eqqg],[TKUA,U,KduT,eqqg,silp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qc","l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l],[qc],[qc,l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gWKak","pV","sLDM","zC","XpIjO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XpIjO],[zC],[zC,XpIjO],[sLDM],[sLDM,XpIjO],[sLDM,zC],[sLDM,zC,XpIjO],[pV],[pV,XpIjO],[pV,zC],[pV,zC,XpIjO],[pV,sLDM],[pV,sLDM,XpIjO],[pV,sLDM,zC],[pV,sLDM,zC,XpIjO],[gWKak],[gWKak,XpIjO],[gWKak,zC],[gWKak,zC,XpIjO],[gWKak,sLDM],[gWKak,sLDM,XpIjO],[gWKak,sLDM,zC],[gWKak,sLDM,zC,XpIjO],[gWKak,pV],[gWKak,pV,XpIjO],[gWKak,pV,zC],[gWKak,pV,zC,XpIjO],[gWKak,pV,sLDM],[gWKak,pV,sLDM,XpIjO],[gWKak,pV,sLDM,zC],[gWKak,pV,sLDM,zC,XpIjO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YEXw","ykBp","Y","Wv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wv],[Y],[Y,Wv],[ykBp],[ykBp,Wv],[ykBp,Y],[ykBp,Y,Wv],[YEXw],[YEXw,Wv],[YEXw,Y],[YEXw,Y,Wv],[YEXw,ykBp],[YEXw,ykBp,Wv],[YEXw,ykBp,Y],[YEXw,ykBp,Y,Wv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Z","TLYvB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TLYvB],[Z],[Z,TLYvB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uLap","TuA","LB","sZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sZ],[LB],[LB,sZ],[TuA],[TuA,sZ],[TuA,LB],[TuA,LB,sZ],[uLap],[uLap,sZ],[uLap,LB],[uLap,LB,sZ],[uLap,TuA],[uLap,TuA,sZ],[uLap,TuA,LB],[uLap,TuA,LB,sZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rwwu","y","m","fWM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fWM],[m],[m,fWM],[y],[y,fWM],[y,m],[y,m,fWM],[rwwu],[rwwu,fWM],[rwwu,m],[rwwu,m,fWM],[rwwu,y],[rwwu,y,fWM],[rwwu,y,m],[rwwu,y,m,fWM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nlpf","oVb","xr","Caz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Caz],[xr],[xr,Caz],[oVb],[oVb,Caz],[oVb,xr],[oVb,xr,Caz],[nlpf],[nlpf,Caz],[nlpf,xr],[nlpf,xr,Caz],[nlpf,oVb],[nlpf,oVb,Caz],[nlpf,oVb,xr],[nlpf,oVb,xr,Caz]]", resultFormatted);
    }
}

