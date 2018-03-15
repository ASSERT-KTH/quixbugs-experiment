package java_programs;


public class POWERSET_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eG","cyx","unlfQ","ga","kkQIV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kkQIV],[ga],[ga,kkQIV],[unlfQ],[unlfQ,kkQIV],[unlfQ,ga],[unlfQ,ga,kkQIV],[cyx],[cyx,kkQIV],[cyx,ga],[cyx,ga,kkQIV],[cyx,unlfQ],[cyx,unlfQ,kkQIV],[cyx,unlfQ,ga],[cyx,unlfQ,ga,kkQIV],[eG],[eG,kkQIV],[eG,ga],[eG,ga,kkQIV],[eG,unlfQ],[eG,unlfQ,kkQIV],[eG,unlfQ,ga],[eG,unlfQ,ga,kkQIV],[eG,cyx],[eG,cyx,kkQIV],[eG,cyx,ga],[eG,cyx,ga,kkQIV],[eG,cyx,unlfQ],[eG,cyx,unlfQ,kkQIV],[eG,cyx,unlfQ,ga],[eG,cyx,unlfQ,ga,kkQIV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","ke","AvO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AvO],[ke],[ke,AvO],[R],[R,AvO],[R,ke],[R,ke,AvO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","RRrKk","kS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kS],[RRrKk],[RRrKk,kS],[P],[P,kS],[P,RRrKk],[P,RRrKk,kS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lL","uTSlD","F","v","zTD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zTD],[v],[v,zTD],[F],[F,zTD],[F,v],[F,v,zTD],[uTSlD],[uTSlD,zTD],[uTSlD,v],[uTSlD,v,zTD],[uTSlD,F],[uTSlD,F,zTD],[uTSlD,F,v],[uTSlD,F,v,zTD],[lL],[lL,zTD],[lL,v],[lL,v,zTD],[lL,F],[lL,F,zTD],[lL,F,v],[lL,F,v,zTD],[lL,uTSlD],[lL,uTSlD,zTD],[lL,uTSlD,v],[lL,uTSlD,v,zTD],[lL,uTSlD,F],[lL,uTSlD,F,zTD],[lL,uTSlD,F,v],[lL,uTSlD,F,v,zTD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aUCz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aUCz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x","mqgL","Pj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Pj],[mqgL],[mqgL,Pj],[x],[x,Pj],[x,mqgL],[x,mqgL,Pj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "F","gF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gF],[F],[F,gF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KYQp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KYQp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vsYr","SwBa","mS","dq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dq],[mS],[mS,dq],[SwBa],[SwBa,dq],[SwBa,mS],[SwBa,mS,dq],[vsYr],[vsYr,dq],[vsYr,mS],[vsYr,mS,dq],[vsYr,SwBa],[vsYr,SwBa,dq],[vsYr,SwBa,mS],[vsYr,SwBa,mS,dq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zffx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Zffx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ajI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ajI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","MEwWe","QFvyT","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[QFvyT],[QFvyT,M],[MEwWe],[MEwWe,M],[MEwWe,QFvyT],[MEwWe,QFvyT,M],[A],[A,M],[A,QFvyT],[A,QFvyT,M],[A,MEwWe],[A,MEwWe,M],[A,MEwWe,QFvyT],[A,MEwWe,QFvyT,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "psQZd","zYqv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zYqv],[psQZd],[psQZd,zYqv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Anpp","DMIl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DMIl],[Anpp],[Anpp,DMIl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","upqG","tuoM","LbQJ","UlvuR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UlvuR],[LbQJ],[LbQJ,UlvuR],[tuoM],[tuoM,UlvuR],[tuoM,LbQJ],[tuoM,LbQJ,UlvuR],[upqG],[upqG,UlvuR],[upqG,LbQJ],[upqG,LbQJ,UlvuR],[upqG,tuoM],[upqG,tuoM,UlvuR],[upqG,tuoM,LbQJ],[upqG,tuoM,LbQJ,UlvuR],[R],[R,UlvuR],[R,LbQJ],[R,LbQJ,UlvuR],[R,tuoM],[R,tuoM,UlvuR],[R,tuoM,LbQJ],[R,tuoM,LbQJ,UlvuR],[R,upqG],[R,upqG,UlvuR],[R,upqG,LbQJ],[R,upqG,LbQJ,UlvuR],[R,upqG,tuoM],[R,upqG,tuoM,UlvuR],[R,upqG,tuoM,LbQJ],[R,upqG,tuoM,LbQJ,UlvuR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Hx","FDe","X","YpZu","Pn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Pn],[YpZu],[YpZu,Pn],[X],[X,Pn],[X,YpZu],[X,YpZu,Pn],[FDe],[FDe,Pn],[FDe,YpZu],[FDe,YpZu,Pn],[FDe,X],[FDe,X,Pn],[FDe,X,YpZu],[FDe,X,YpZu,Pn],[Hx],[Hx,Pn],[Hx,YpZu],[Hx,YpZu,Pn],[Hx,X],[Hx,X,Pn],[Hx,X,YpZu],[Hx,X,YpZu,Pn],[Hx,FDe],[Hx,FDe,Pn],[Hx,FDe,YpZu],[Hx,FDe,YpZu,Pn],[Hx,FDe,X],[Hx,FDe,X,Pn],[Hx,FDe,X,YpZu],[Hx,FDe,X,YpZu,Pn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jnV","D","k","l","uKR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uKR],[l],[l,uKR],[k],[k,uKR],[k,l],[k,l,uKR],[D],[D,uKR],[D,l],[D,l,uKR],[D,k],[D,k,uKR],[D,k,l],[D,k,l,uKR],[jnV],[jnV,uKR],[jnV,l],[jnV,l,uKR],[jnV,k],[jnV,k,uKR],[jnV,k,l],[jnV,k,l,uKR],[jnV,D],[jnV,D,uKR],[jnV,D,l],[jnV,D,l,uKR],[jnV,D,k],[jnV,D,k,uKR],[jnV,D,k,l],[jnV,D,k,l,uKR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","QsW","D","dJ","kHw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kHw],[dJ],[dJ,kHw],[D],[D,kHw],[D,dJ],[D,dJ,kHw],[QsW],[QsW,kHw],[QsW,dJ],[QsW,dJ,kHw],[QsW,D],[QsW,D,kHw],[QsW,D,dJ],[QsW,D,dJ,kHw],[B],[B,kHw],[B,dJ],[B,dJ,kHw],[B,D],[B,D,kHw],[B,D,dJ],[B,D,dJ,kHw],[B,QsW],[B,QsW,kHw],[B,QsW,dJ],[B,QsW,dJ,kHw],[B,QsW,D],[B,QsW,D,kHw],[B,QsW,D,dJ],[B,QsW,D,dJ,kHw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tv","TOB","qEpn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qEpn],[TOB],[TOB,qEpn],[tv],[tv,qEpn],[tv,TOB],[tv,TOB,qEpn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aMnV","BtXl","OulT","RWA","hxbp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hxbp],[RWA],[RWA,hxbp],[OulT],[OulT,hxbp],[OulT,RWA],[OulT,RWA,hxbp],[BtXl],[BtXl,hxbp],[BtXl,RWA],[BtXl,RWA,hxbp],[BtXl,OulT],[BtXl,OulT,hxbp],[BtXl,OulT,RWA],[BtXl,OulT,RWA,hxbp],[aMnV],[aMnV,hxbp],[aMnV,RWA],[aMnV,RWA,hxbp],[aMnV,OulT],[aMnV,OulT,hxbp],[aMnV,OulT,RWA],[aMnV,OulT,RWA,hxbp],[aMnV,BtXl],[aMnV,BtXl,hxbp],[aMnV,BtXl,RWA],[aMnV,BtXl,RWA,hxbp],[aMnV,BtXl,OulT],[aMnV,BtXl,OulT,hxbp],[aMnV,BtXl,OulT,RWA],[aMnV,BtXl,OulT,RWA,hxbp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ellg","E","h","CHnl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CHnl],[h],[h,CHnl],[E],[E,CHnl],[E,h],[E,h,CHnl],[Ellg],[Ellg,CHnl],[Ellg,h],[Ellg,h,CHnl],[Ellg,E],[Ellg,E,CHnl],[Ellg,E,h],[Ellg,E,h,CHnl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","Dey","onwDA","dIQ","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[dIQ],[dIQ,o],[onwDA],[onwDA,o],[onwDA,dIQ],[onwDA,dIQ,o],[Dey],[Dey,o],[Dey,dIQ],[Dey,dIQ,o],[Dey,onwDA],[Dey,onwDA,o],[Dey,onwDA,dIQ],[Dey,onwDA,dIQ,o],[P],[P,o],[P,dIQ],[P,dIQ,o],[P,onwDA],[P,onwDA,o],[P,onwDA,dIQ],[P,onwDA,dIQ,o],[P,Dey],[P,Dey,o],[P,Dey,dIQ],[P,Dey,dIQ,o],[P,Dey,onwDA],[P,Dey,onwDA,o],[P,Dey,onwDA,dIQ],[P,Dey,onwDA,dIQ,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "km","VPrS","D","MR","vkD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vkD],[MR],[MR,vkD],[D],[D,vkD],[D,MR],[D,MR,vkD],[VPrS],[VPrS,vkD],[VPrS,MR],[VPrS,MR,vkD],[VPrS,D],[VPrS,D,vkD],[VPrS,D,MR],[VPrS,D,MR,vkD],[km],[km,vkD],[km,MR],[km,MR,vkD],[km,D],[km,D,vkD],[km,D,MR],[km,D,MR,vkD],[km,VPrS],[km,VPrS,vkD],[km,VPrS,MR],[km,VPrS,MR,vkD],[km,VPrS,D],[km,VPrS,D,vkD],[km,VPrS,D,MR],[km,VPrS,D,MR,vkD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HdKen")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HdKen]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "edFA","U","ouIl","UuXgj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UuXgj],[ouIl],[ouIl,UuXgj],[U],[U,UuXgj],[U,ouIl],[U,ouIl,UuXgj],[edFA],[edFA,UuXgj],[edFA,ouIl],[edFA,ouIl,UuXgj],[edFA,U],[edFA,U,UuXgj],[edFA,U,ouIl],[edFA,U,ouIl,UuXgj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Yk","ek","X","GJR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GJR],[X],[X,GJR],[ek],[ek,GJR],[ek,X],[ek,X,GJR],[Yk],[Yk,GJR],[Yk,X],[Yk,X,GJR],[Yk,ek],[Yk,ek,GJR],[Yk,ek,X],[Yk,ek,X,GJR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IAZS","e","rH","SeMEc","IS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IS],[SeMEc],[SeMEc,IS],[rH],[rH,IS],[rH,SeMEc],[rH,SeMEc,IS],[e],[e,IS],[e,SeMEc],[e,SeMEc,IS],[e,rH],[e,rH,IS],[e,rH,SeMEc],[e,rH,SeMEc,IS],[IAZS],[IAZS,IS],[IAZS,SeMEc],[IAZS,SeMEc,IS],[IAZS,rH],[IAZS,rH,IS],[IAZS,rH,SeMEc],[IAZS,rH,SeMEc,IS],[IAZS,e],[IAZS,e,IS],[IAZS,e,SeMEc],[IAZS,e,SeMEc,IS],[IAZS,e,rH],[IAZS,e,rH,IS],[IAZS,e,rH,SeMEc],[IAZS,e,rH,SeMEc,IS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wkz","SFFTn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SFFTn],[wkz],[wkz,SFFTn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Wx","teT","XS","OCQ","zUW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zUW],[OCQ],[OCQ,zUW],[XS],[XS,zUW],[XS,OCQ],[XS,OCQ,zUW],[teT],[teT,zUW],[teT,OCQ],[teT,OCQ,zUW],[teT,XS],[teT,XS,zUW],[teT,XS,OCQ],[teT,XS,OCQ,zUW],[Wx],[Wx,zUW],[Wx,OCQ],[Wx,OCQ,zUW],[Wx,XS],[Wx,XS,zUW],[Wx,XS,OCQ],[Wx,XS,OCQ,zUW],[Wx,teT],[Wx,teT,zUW],[Wx,teT,OCQ],[Wx,teT,OCQ,zUW],[Wx,teT,XS],[Wx,teT,XS,zUW],[Wx,teT,XS,OCQ],[Wx,teT,XS,OCQ,zUW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BCq","Eo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Eo],[BCq],[BCq,Eo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gffg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gffg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cs","XkS","mDZ","XvFvi","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[XvFvi],[XvFvi,O],[mDZ],[mDZ,O],[mDZ,XvFvi],[mDZ,XvFvi,O],[XkS],[XkS,O],[XkS,XvFvi],[XkS,XvFvi,O],[XkS,mDZ],[XkS,mDZ,O],[XkS,mDZ,XvFvi],[XkS,mDZ,XvFvi,O],[Cs],[Cs,O],[Cs,XvFvi],[Cs,XvFvi,O],[Cs,mDZ],[Cs,mDZ,O],[Cs,mDZ,XvFvi],[Cs,mDZ,XvFvi,O],[Cs,XkS],[Cs,XkS,O],[Cs,XkS,XvFvi],[Cs,XkS,XvFvi,O],[Cs,XkS,mDZ],[Cs,XkS,mDZ,O],[Cs,XkS,mDZ,XvFvi],[Cs,XkS,mDZ,XvFvi,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","IUu","owC","hdG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hdG],[owC],[owC,hdG],[IUu],[IUu,hdG],[IUu,owC],[IUu,owC,hdG],[A],[A,hdG],[A,owC],[A,owC,hdG],[A,IUu],[A,IUu,hdG],[A,IUu,owC],[A,IUu,owC,hdG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","g","Y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Y],[g],[g,Y],[Q],[Q,Y],[Q,g],[Q,g,Y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IiQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IiQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TTCQb","D","KS","lykJ","ET")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ET],[lykJ],[lykJ,ET],[KS],[KS,ET],[KS,lykJ],[KS,lykJ,ET],[D],[D,ET],[D,lykJ],[D,lykJ,ET],[D,KS],[D,KS,ET],[D,KS,lykJ],[D,KS,lykJ,ET],[TTCQb],[TTCQb,ET],[TTCQb,lykJ],[TTCQb,lykJ,ET],[TTCQb,KS],[TTCQb,KS,ET],[TTCQb,KS,lykJ],[TTCQb,KS,lykJ,ET],[TTCQb,D],[TTCQb,D,ET],[TTCQb,D,lykJ],[TTCQb,D,lykJ,ET],[TTCQb,D,KS],[TTCQb,D,KS,ET],[TTCQb,D,KS,lykJ],[TTCQb,D,KS,lykJ,ET]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LwGOY","vyMz","tL","oy","uxvtf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uxvtf],[oy],[oy,uxvtf],[tL],[tL,uxvtf],[tL,oy],[tL,oy,uxvtf],[vyMz],[vyMz,uxvtf],[vyMz,oy],[vyMz,oy,uxvtf],[vyMz,tL],[vyMz,tL,uxvtf],[vyMz,tL,oy],[vyMz,tL,oy,uxvtf],[LwGOY],[LwGOY,uxvtf],[LwGOY,oy],[LwGOY,oy,uxvtf],[LwGOY,tL],[LwGOY,tL,uxvtf],[LwGOY,tL,oy],[LwGOY,tL,oy,uxvtf],[LwGOY,vyMz],[LwGOY,vyMz,uxvtf],[LwGOY,vyMz,oy],[LwGOY,vyMz,oy,uxvtf],[LwGOY,vyMz,tL],[LwGOY,vyMz,tL,uxvtf],[LwGOY,vyMz,tL,oy],[LwGOY,vyMz,tL,oy,uxvtf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AD","Ehh","mgPfY","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[mgPfY],[mgPfY,L],[Ehh],[Ehh,L],[Ehh,mgPfY],[Ehh,mgPfY,L],[AD],[AD,L],[AD,mgPfY],[AD,mgPfY,L],[AD,Ehh],[AD,Ehh,L],[AD,Ehh,mgPfY],[AD,Ehh,mgPfY,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QcY","FgyE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FgyE],[QcY],[QcY,FgyE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","C","mCMm","kNN","LiH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LiH],[kNN],[kNN,LiH],[mCMm],[mCMm,LiH],[mCMm,kNN],[mCMm,kNN,LiH],[C],[C,LiH],[C,kNN],[C,kNN,LiH],[C,mCMm],[C,mCMm,LiH],[C,mCMm,kNN],[C,mCMm,kNN,LiH],[s],[s,LiH],[s,kNN],[s,kNN,LiH],[s,mCMm],[s,mCMm,LiH],[s,mCMm,kNN],[s,mCMm,kNN,LiH],[s,C],[s,C,LiH],[s,C,kNN],[s,C,kNN,LiH],[s,C,mCMm],[s,C,mCMm,LiH],[s,C,mCMm,kNN],[s,C,mCMm,kNN,LiH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gUB","VHl","IOP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IOP],[VHl],[VHl,IOP],[gUB],[gUB,IOP],[gUB,VHl],[gUB,VHl,IOP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AB","cXrx","zedqH","fRzw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fRzw],[zedqH],[zedqH,fRzw],[cXrx],[cXrx,fRzw],[cXrx,zedqH],[cXrx,zedqH,fRzw],[AB],[AB,fRzw],[AB,zedqH],[AB,zedqH,fRzw],[AB,cXrx],[AB,cXrx,fRzw],[AB,cXrx,zedqH],[AB,cXrx,zedqH,fRzw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YKXR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YKXR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Nx","HD","Vs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vs],[HD],[HD,Vs],[Nx],[Nx,Vs],[Nx,HD],[Nx,HD,Vs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "X","ai")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ai],[X],[X,ai]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","bmeCy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bmeCy],[a],[a,bmeCy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x","tcG","KHOEB","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[KHOEB],[KHOEB,N],[tcG],[tcG,N],[tcG,KHOEB],[tcG,KHOEB,N],[x],[x,N],[x,KHOEB],[x,KHOEB,N],[x,tcG],[x,tcG,N],[x,tcG,KHOEB],[x,tcG,KHOEB,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sS","bg","LfHj","z","iW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iW],[z],[z,iW],[LfHj],[LfHj,iW],[LfHj,z],[LfHj,z,iW],[bg],[bg,iW],[bg,z],[bg,z,iW],[bg,LfHj],[bg,LfHj,iW],[bg,LfHj,z],[bg,LfHj,z,iW],[sS],[sS,iW],[sS,z],[sS,z,iW],[sS,LfHj],[sS,LfHj,iW],[sS,LfHj,z],[sS,LfHj,z,iW],[sS,bg],[sS,bg,iW],[sS,bg,z],[sS,bg,z,iW],[sS,bg,LfHj],[sS,bg,LfHj,iW],[sS,bg,LfHj,z],[sS,bg,LfHj,z,iW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "S")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[S]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E","LMu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LMu],[E],[E,LMu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","Tz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tz],[b],[b,Tz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Be")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Be]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kAWHY","gz","EQlrY","HmPxL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HmPxL],[EQlrY],[EQlrY,HmPxL],[gz],[gz,HmPxL],[gz,EQlrY],[gz,EQlrY,HmPxL],[kAWHY],[kAWHY,HmPxL],[kAWHY,EQlrY],[kAWHY,EQlrY,HmPxL],[kAWHY,gz],[kAWHY,gz,HmPxL],[kAWHY,gz,EQlrY],[kAWHY,gz,EQlrY,HmPxL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zXdO","DX","tCNb","cj","SKA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SKA],[cj],[cj,SKA],[tCNb],[tCNb,SKA],[tCNb,cj],[tCNb,cj,SKA],[DX],[DX,SKA],[DX,cj],[DX,cj,SKA],[DX,tCNb],[DX,tCNb,SKA],[DX,tCNb,cj],[DX,tCNb,cj,SKA],[zXdO],[zXdO,SKA],[zXdO,cj],[zXdO,cj,SKA],[zXdO,tCNb],[zXdO,tCNb,SKA],[zXdO,tCNb,cj],[zXdO,tCNb,cj,SKA],[zXdO,DX],[zXdO,DX,SKA],[zXdO,DX,cj],[zXdO,DX,cj,SKA],[zXdO,DX,tCNb],[zXdO,DX,tCNb,SKA],[zXdO,DX,tCNb,cj],[zXdO,DX,tCNb,cj,SKA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VoDD","UQoZC","hMD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hMD],[UQoZC],[UQoZC,hMD],[VoDD],[VoDD,hMD],[VoDD,UQoZC],[VoDD,UQoZC,hMD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AJI","Z","ny","vHo","EOY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EOY],[vHo],[vHo,EOY],[ny],[ny,EOY],[ny,vHo],[ny,vHo,EOY],[Z],[Z,EOY],[Z,vHo],[Z,vHo,EOY],[Z,ny],[Z,ny,EOY],[Z,ny,vHo],[Z,ny,vHo,EOY],[AJI],[AJI,EOY],[AJI,vHo],[AJI,vHo,EOY],[AJI,ny],[AJI,ny,EOY],[AJI,ny,vHo],[AJI,ny,vHo,EOY],[AJI,Z],[AJI,Z,EOY],[AJI,Z,vHo],[AJI,Z,vHo,EOY],[AJI,Z,ny],[AJI,Z,ny,EOY],[AJI,Z,ny,vHo],[AJI,Z,ny,vHo,EOY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TWIL","Uwj","i","Gbyy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Gbyy],[i],[i,Gbyy],[Uwj],[Uwj,Gbyy],[Uwj,i],[Uwj,i,Gbyy],[TWIL],[TWIL,Gbyy],[TWIL,i],[TWIL,i,Gbyy],[TWIL,Uwj],[TWIL,Uwj,Gbyy],[TWIL,Uwj,i],[TWIL,Uwj,i,Gbyy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UiAg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UiAg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[y],[U],[U,y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "T")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[T]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vz","G","Z","qPii","EKu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EKu],[qPii],[qPii,EKu],[Z],[Z,EKu],[Z,qPii],[Z,qPii,EKu],[G],[G,EKu],[G,qPii],[G,qPii,EKu],[G,Z],[G,Z,EKu],[G,Z,qPii],[G,Z,qPii,EKu],[vz],[vz,EKu],[vz,qPii],[vz,qPii,EKu],[vz,Z],[vz,Z,EKu],[vz,Z,qPii],[vz,Z,qPii,EKu],[vz,G],[vz,G,EKu],[vz,G,qPii],[vz,G,qPii,EKu],[vz,G,Z],[vz,G,Z,EKu],[vz,G,Z,qPii],[vz,G,Z,qPii,EKu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Vah","EdrOs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EdrOs],[Vah],[Vah,EdrOs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZA","DCx","zoaM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zoaM],[DCx],[DCx,zoaM],[ZA],[ZA,zoaM],[ZA,DCx],[ZA,DCx,zoaM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aIrET","AfGo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AfGo],[aIrET],[aIrET,AfGo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","yA","JgJ","if")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[if],[JgJ],[JgJ,if],[yA],[yA,if],[yA,JgJ],[yA,JgJ,if],[P],[P,if],[P,JgJ],[P,JgJ,if],[P,yA],[P,yA,if],[P,yA,JgJ],[P,yA,JgJ,if]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LZO","a","jVr","EVi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EVi],[jVr],[jVr,EVi],[a],[a,EVi],[a,jVr],[a,jVr,EVi],[LZO],[LZO,EVi],[LZO,jVr],[LZO,jVr,EVi],[LZO,a],[LZO,a,EVi],[LZO,a,jVr],[LZO,a,jVr,EVi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yePoT","WrZW","Bu","OGeyA","CXTo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CXTo],[OGeyA],[OGeyA,CXTo],[Bu],[Bu,CXTo],[Bu,OGeyA],[Bu,OGeyA,CXTo],[WrZW],[WrZW,CXTo],[WrZW,OGeyA],[WrZW,OGeyA,CXTo],[WrZW,Bu],[WrZW,Bu,CXTo],[WrZW,Bu,OGeyA],[WrZW,Bu,OGeyA,CXTo],[yePoT],[yePoT,CXTo],[yePoT,OGeyA],[yePoT,OGeyA,CXTo],[yePoT,Bu],[yePoT,Bu,CXTo],[yePoT,Bu,OGeyA],[yePoT,Bu,OGeyA,CXTo],[yePoT,WrZW],[yePoT,WrZW,CXTo],[yePoT,WrZW,OGeyA],[yePoT,WrZW,OGeyA,CXTo],[yePoT,WrZW,Bu],[yePoT,WrZW,Bu,CXTo],[yePoT,WrZW,Bu,OGeyA],[yePoT,WrZW,Bu,OGeyA,CXTo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eDOe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eDOe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NjLFP","AH","uc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uc],[AH],[AH,uc],[NjLFP],[NjLFP,uc],[NjLFP,AH],[NjLFP,AH,uc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uWVj","rri","Kbidg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Kbidg],[rri],[rri,Kbidg],[uWVj],[uWVj,Kbidg],[uWVj,rri],[uWVj,rri,Kbidg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "i","FoS","OzW","XzYjb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XzYjb],[OzW],[OzW,XzYjb],[FoS],[FoS,XzYjb],[FoS,OzW],[FoS,OzW,XzYjb],[i],[i,XzYjb],[i,OzW],[i,OzW,XzYjb],[i,FoS],[i,FoS,XzYjb],[i,FoS,OzW],[i,FoS,OzW,XzYjb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mNDJz","Bpg","AAou")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AAou],[Bpg],[Bpg,AAou],[mNDJz],[mNDJz,AAou],[mNDJz,Bpg],[mNDJz,Bpg,AAou]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ne")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ne]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TMJ","ZnQH","mB","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[mB],[mB,O],[ZnQH],[ZnQH,O],[ZnQH,mB],[ZnQH,mB,O],[TMJ],[TMJ,O],[TMJ,mB],[TMJ,mB,O],[TMJ,ZnQH],[TMJ,ZnQH,O],[TMJ,ZnQH,mB],[TMJ,ZnQH,mB,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BmWj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BmWj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "poR","Ln","C","PyMq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PyMq],[C],[C,PyMq],[Ln],[Ln,PyMq],[Ln,C],[Ln,C,PyMq],[poR],[poR,PyMq],[poR,C],[poR,C,PyMq],[poR,Ln],[poR,Ln,PyMq],[poR,Ln,C],[poR,Ln,C,PyMq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vfWYA","utO","Ty","pH","yau")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yau],[pH],[pH,yau],[Ty],[Ty,yau],[Ty,pH],[Ty,pH,yau],[utO],[utO,yau],[utO,pH],[utO,pH,yau],[utO,Ty],[utO,Ty,yau],[utO,Ty,pH],[utO,Ty,pH,yau],[vfWYA],[vfWYA,yau],[vfWYA,pH],[vfWYA,pH,yau],[vfWYA,Ty],[vfWYA,Ty,yau],[vfWYA,Ty,pH],[vfWYA,Ty,pH,yau],[vfWYA,utO],[vfWYA,utO,yau],[vfWYA,utO,pH],[vfWYA,utO,pH,yau],[vfWYA,utO,Ty],[vfWYA,utO,Ty,yau],[vfWYA,utO,Ty,pH],[vfWYA,utO,Ty,pH,yau]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NIyu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NIyu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fKnu","ZbTGq","XO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XO],[ZbTGq],[ZbTGq,XO],[fKnu],[fKnu,XO],[fKnu,ZbTGq],[fKnu,ZbTGq,XO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qNP","vdXHw","ZnOrf","NDdBK","ve")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ve],[NDdBK],[NDdBK,ve],[ZnOrf],[ZnOrf,ve],[ZnOrf,NDdBK],[ZnOrf,NDdBK,ve],[vdXHw],[vdXHw,ve],[vdXHw,NDdBK],[vdXHw,NDdBK,ve],[vdXHw,ZnOrf],[vdXHw,ZnOrf,ve],[vdXHw,ZnOrf,NDdBK],[vdXHw,ZnOrf,NDdBK,ve],[qNP],[qNP,ve],[qNP,NDdBK],[qNP,NDdBK,ve],[qNP,ZnOrf],[qNP,ZnOrf,ve],[qNP,ZnOrf,NDdBK],[qNP,ZnOrf,NDdBK,ve],[qNP,vdXHw],[qNP,vdXHw,ve],[qNP,vdXHw,NDdBK],[qNP,vdXHw,NDdBK,ve],[qNP,vdXHw,ZnOrf],[qNP,vdXHw,ZnOrf,ve],[qNP,vdXHw,ZnOrf,NDdBK],[qNP,vdXHw,ZnOrf,NDdBK,ve]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yOZ","PnmHx","Pn","GbnXN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GbnXN],[Pn],[Pn,GbnXN],[PnmHx],[PnmHx,GbnXN],[PnmHx,Pn],[PnmHx,Pn,GbnXN],[yOZ],[yOZ,GbnXN],[yOZ,Pn],[yOZ,Pn,GbnXN],[yOZ,PnmHx],[yOZ,PnmHx,GbnXN],[yOZ,PnmHx,Pn],[yOZ,PnmHx,Pn,GbnXN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HZHF","Ma","EPC","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[EPC],[EPC,K],[Ma],[Ma,K],[Ma,EPC],[Ma,EPC,K],[HZHF],[HZHF,K],[HZHF,EPC],[HZHF,EPC,K],[HZHF,Ma],[HZHF,Ma,K],[HZHF,Ma,EPC],[HZHF,Ma,EPC,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","e","qwptr","Imxb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Imxb],[qwptr],[qwptr,Imxb],[e],[e,Imxb],[e,qwptr],[e,qwptr,Imxb],[D],[D,Imxb],[D,qwptr],[D,qwptr,Imxb],[D,e],[D,e,Imxb],[D,e,qwptr],[D,e,qwptr,Imxb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zk","pCmGY","nV","UBBS","EYFn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EYFn],[UBBS],[UBBS,EYFn],[nV],[nV,EYFn],[nV,UBBS],[nV,UBBS,EYFn],[pCmGY],[pCmGY,EYFn],[pCmGY,UBBS],[pCmGY,UBBS,EYFn],[pCmGY,nV],[pCmGY,nV,EYFn],[pCmGY,nV,UBBS],[pCmGY,nV,UBBS,EYFn],[Zk],[Zk,EYFn],[Zk,UBBS],[Zk,UBBS,EYFn],[Zk,nV],[Zk,nV,EYFn],[Zk,nV,UBBS],[Zk,nV,UBBS,EYFn],[Zk,pCmGY],[Zk,pCmGY,EYFn],[Zk,pCmGY,UBBS],[Zk,pCmGY,UBBS,EYFn],[Zk,pCmGY,nV],[Zk,pCmGY,nV,EYFn],[Zk,pCmGY,nV,UBBS],[Zk,pCmGY,nV,UBBS,EYFn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xMW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xMW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Snbj","LiF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LiF],[Snbj],[Snbj,LiF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","E","oVjg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oVjg],[E],[E,oVjg],[q],[q,oVjg],[q,E],[q,E,oVjg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Oo","TCdpZ","ED")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ED],[TCdpZ],[TCdpZ,ED],[Oo],[Oo,ED],[Oo,TCdpZ],[Oo,TCdpZ,ED]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Iom","rk","m","FEbar")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FEbar],[m],[m,FEbar],[rk],[rk,FEbar],[rk,m],[rk,m,FEbar],[Iom],[Iom,FEbar],[Iom,m],[Iom,m,FEbar],[Iom,rk],[Iom,rk,FEbar],[Iom,rk,m],[Iom,rk,m,FEbar]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Xj","AFTKX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AFTKX],[Xj],[Xj,AFTKX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QOcez","DjiE","tMJO","IFz","Yw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Yw],[IFz],[IFz,Yw],[tMJO],[tMJO,Yw],[tMJO,IFz],[tMJO,IFz,Yw],[DjiE],[DjiE,Yw],[DjiE,IFz],[DjiE,IFz,Yw],[DjiE,tMJO],[DjiE,tMJO,Yw],[DjiE,tMJO,IFz],[DjiE,tMJO,IFz,Yw],[QOcez],[QOcez,Yw],[QOcez,IFz],[QOcez,IFz,Yw],[QOcez,tMJO],[QOcez,tMJO,Yw],[QOcez,tMJO,IFz],[QOcez,tMJO,IFz,Yw],[QOcez,DjiE],[QOcez,DjiE,Yw],[QOcez,DjiE,IFz],[QOcez,DjiE,IFz,Yw],[QOcez,DjiE,tMJO],[QOcez,DjiE,tMJO,Yw],[QOcez,DjiE,tMJO,IFz],[QOcez,DjiE,tMJO,IFz,Yw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eIt","S","d","pe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pe],[d],[d,pe],[S],[S,pe],[S,d],[S,d,pe],[eIt],[eIt,pe],[eIt,d],[eIt,d,pe],[eIt,S],[eIt,S,pe],[eIt,S,d],[eIt,S,d,pe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BXI","Bd","gYDV","V","SMim")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SMim],[V],[V,SMim],[gYDV],[gYDV,SMim],[gYDV,V],[gYDV,V,SMim],[Bd],[Bd,SMim],[Bd,V],[Bd,V,SMim],[Bd,gYDV],[Bd,gYDV,SMim],[Bd,gYDV,V],[Bd,gYDV,V,SMim],[BXI],[BXI,SMim],[BXI,V],[BXI,V,SMim],[BXI,gYDV],[BXI,gYDV,SMim],[BXI,gYDV,V],[BXI,gYDV,V,SMim],[BXI,Bd],[BXI,Bd,SMim],[BXI,Bd,V],[BXI,Bd,V,SMim],[BXI,Bd,gYDV],[BXI,Bd,gYDV,SMim],[BXI,Bd,gYDV,V],[BXI,Bd,gYDV,V,SMim]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AnRIj","S")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[S],[AnRIj],[AnRIj,S]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KVivv","BI","wre","rSmT","TNVd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TNVd],[rSmT],[rSmT,TNVd],[wre],[wre,TNVd],[wre,rSmT],[wre,rSmT,TNVd],[BI],[BI,TNVd],[BI,rSmT],[BI,rSmT,TNVd],[BI,wre],[BI,wre,TNVd],[BI,wre,rSmT],[BI,wre,rSmT,TNVd],[KVivv],[KVivv,TNVd],[KVivv,rSmT],[KVivv,rSmT,TNVd],[KVivv,wre],[KVivv,wre,TNVd],[KVivv,wre,rSmT],[KVivv,wre,rSmT,TNVd],[KVivv,BI],[KVivv,BI,TNVd],[KVivv,BI,rSmT],[KVivv,BI,rSmT,TNVd],[KVivv,BI,wre],[KVivv,BI,wre,TNVd],[KVivv,BI,wre,rSmT],[KVivv,BI,wre,rSmT,TNVd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ObS","fqM","h","y","LYE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LYE],[y],[y,LYE],[h],[h,LYE],[h,y],[h,y,LYE],[fqM],[fqM,LYE],[fqM,y],[fqM,y,LYE],[fqM,h],[fqM,h,LYE],[fqM,h,y],[fqM,h,y,LYE],[ObS],[ObS,LYE],[ObS,y],[ObS,y,LYE],[ObS,h],[ObS,h,LYE],[ObS,h,y],[ObS,h,y,LYE],[ObS,fqM],[ObS,fqM,LYE],[ObS,fqM,y],[ObS,fqM,y,LYE],[ObS,fqM,h],[ObS,fqM,h,LYE],[ObS,fqM,h,y],[ObS,fqM,h,y,LYE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eU","XEXx","NbzN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NbzN],[XEXx],[XEXx,NbzN],[eU],[eU,NbzN],[eU,XEXx],[eU,XEXx,NbzN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qq","c")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[c],[qq],[qq,c]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fX","TIHl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TIHl],[fX],[fX,TIHl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BbP","LwSO","anrl","m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m],[anrl],[anrl,m],[LwSO],[LwSO,m],[LwSO,anrl],[LwSO,anrl,m],[BbP],[BbP,m],[BbP,anrl],[BbP,anrl,m],[BbP,LwSO],[BbP,LwSO,m],[BbP,LwSO,anrl],[BbP,LwSO,anrl,m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gz","ppGI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ppGI],[gz],[gz,ppGI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lms")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lms]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PF","Xant","NTu","UQz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UQz],[NTu],[NTu,UQz],[Xant],[Xant,UQz],[Xant,NTu],[Xant,NTu,UQz],[PF],[PF,UQz],[PF,NTu],[PF,NTu,UQz],[PF,Xant],[PF,Xant,UQz],[PF,Xant,NTu],[PF,Xant,NTu,UQz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","aqqC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aqqC],[D],[D,aqqC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sAT","pZ","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[pZ],[pZ,o],[sAT],[sAT,o],[sAT,pZ],[sAT,pZ,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XWbpS","lpn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lpn],[XWbpS],[XWbpS,lpn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fFu","f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f],[fFu],[fFu,f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Jfqg","T","qzs","jRu","LvpGI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LvpGI],[jRu],[jRu,LvpGI],[qzs],[qzs,LvpGI],[qzs,jRu],[qzs,jRu,LvpGI],[T],[T,LvpGI],[T,jRu],[T,jRu,LvpGI],[T,qzs],[T,qzs,LvpGI],[T,qzs,jRu],[T,qzs,jRu,LvpGI],[Jfqg],[Jfqg,LvpGI],[Jfqg,jRu],[Jfqg,jRu,LvpGI],[Jfqg,qzs],[Jfqg,qzs,LvpGI],[Jfqg,qzs,jRu],[Jfqg,qzs,jRu,LvpGI],[Jfqg,T],[Jfqg,T,LvpGI],[Jfqg,T,jRu],[Jfqg,T,jRu,LvpGI],[Jfqg,T,qzs],[Jfqg,T,qzs,LvpGI],[Jfqg,T,qzs,jRu],[Jfqg,T,qzs,jRu,LvpGI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","Ekf","dE","tFD","zEVI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zEVI],[tFD],[tFD,zEVI],[dE],[dE,zEVI],[dE,tFD],[dE,tFD,zEVI],[Ekf],[Ekf,zEVI],[Ekf,tFD],[Ekf,tFD,zEVI],[Ekf,dE],[Ekf,dE,zEVI],[Ekf,dE,tFD],[Ekf,dE,tFD,zEVI],[a],[a,zEVI],[a,tFD],[a,tFD,zEVI],[a,dE],[a,dE,zEVI],[a,dE,tFD],[a,dE,tFD,zEVI],[a,Ekf],[a,Ekf,zEVI],[a,Ekf,tFD],[a,Ekf,tFD,zEVI],[a,Ekf,dE],[a,Ekf,dE,zEVI],[a,Ekf,dE,tFD],[a,Ekf,dE,tFD,zEVI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SY","w","pLXY","zEE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zEE],[pLXY],[pLXY,zEE],[w],[w,zEE],[w,pLXY],[w,pLXY,zEE],[SY],[SY,zEE],[SY,pLXY],[SY,pLXY,zEE],[SY,w],[SY,w,zEE],[SY,w,pLXY],[SY,w,pLXY,zEE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ra")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ra]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","R","DMED")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DMED],[R],[R,DMED],[p],[p,DMED],[p,R],[p,R,DMED]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TSFzi","dT","u","X","jtBu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jtBu],[X],[X,jtBu],[u],[u,jtBu],[u,X],[u,X,jtBu],[dT],[dT,jtBu],[dT,X],[dT,X,jtBu],[dT,u],[dT,u,jtBu],[dT,u,X],[dT,u,X,jtBu],[TSFzi],[TSFzi,jtBu],[TSFzi,X],[TSFzi,X,jtBu],[TSFzi,u],[TSFzi,u,jtBu],[TSFzi,u,X],[TSFzi,u,X,jtBu],[TSFzi,dT],[TSFzi,dT,jtBu],[TSFzi,dT,X],[TSFzi,dT,X,jtBu],[TSFzi,dT,u],[TSFzi,dT,u,jtBu],[TSFzi,dT,u,X],[TSFzi,dT,u,X,jtBu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VvUo","OL","dGQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dGQ],[OL],[OL,dGQ],[VvUo],[VvUo,dGQ],[VvUo,OL],[VvUo,OL,dGQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PuLZr","I","ga")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ga],[I],[I,ga],[PuLZr],[PuLZr,ga],[PuLZr,I],[PuLZr,I,ga]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Te","E","aL","edsU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[edsU],[aL],[aL,edsU],[E],[E,edsU],[E,aL],[E,aL,edsU],[Te],[Te,edsU],[Te,aL],[Te,aL,edsU],[Te,E],[Te,E,edsU],[Te,E,aL],[Te,E,aL,edsU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oLWwV","BnV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BnV],[oLWwV],[oLWwV,BnV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WuH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WuH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UCCuZ","ocj","tl","Jqb","Kg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Kg],[Jqb],[Jqb,Kg],[tl],[tl,Kg],[tl,Jqb],[tl,Jqb,Kg],[ocj],[ocj,Kg],[ocj,Jqb],[ocj,Jqb,Kg],[ocj,tl],[ocj,tl,Kg],[ocj,tl,Jqb],[ocj,tl,Jqb,Kg],[UCCuZ],[UCCuZ,Kg],[UCCuZ,Jqb],[UCCuZ,Jqb,Kg],[UCCuZ,tl],[UCCuZ,tl,Kg],[UCCuZ,tl,Jqb],[UCCuZ,tl,Jqb,Kg],[UCCuZ,ocj],[UCCuZ,ocj,Kg],[UCCuZ,ocj,Jqb],[UCCuZ,ocj,Jqb,Kg],[UCCuZ,ocj,tl],[UCCuZ,ocj,tl,Kg],[UCCuZ,ocj,tl,Jqb],[UCCuZ,ocj,tl,Jqb,Kg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wQLD","Gmvw","uK","ha")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ha],[uK],[uK,ha],[Gmvw],[Gmvw,ha],[Gmvw,uK],[Gmvw,uK,ha],[wQLD],[wQLD,ha],[wQLD,uK],[wQLD,uK,ha],[wQLD,Gmvw],[wQLD,Gmvw,ha],[wQLD,Gmvw,uK],[wQLD,Gmvw,uK,ha]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ff","Kuehs","em","eLs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eLs],[em],[em,eLs],[Kuehs],[Kuehs,eLs],[Kuehs,em],[Kuehs,em,eLs],[ff],[ff,eLs],[ff,em],[ff,em,eLs],[ff,Kuehs],[ff,Kuehs,eLs],[ff,Kuehs,em],[ff,Kuehs,em,eLs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[r]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xwLkN","HCxr","ZkwGQ","F","PaZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PaZ],[F],[F,PaZ],[ZkwGQ],[ZkwGQ,PaZ],[ZkwGQ,F],[ZkwGQ,F,PaZ],[HCxr],[HCxr,PaZ],[HCxr,F],[HCxr,F,PaZ],[HCxr,ZkwGQ],[HCxr,ZkwGQ,PaZ],[HCxr,ZkwGQ,F],[HCxr,ZkwGQ,F,PaZ],[xwLkN],[xwLkN,PaZ],[xwLkN,F],[xwLkN,F,PaZ],[xwLkN,ZkwGQ],[xwLkN,ZkwGQ,PaZ],[xwLkN,ZkwGQ,F],[xwLkN,ZkwGQ,F,PaZ],[xwLkN,HCxr],[xwLkN,HCxr,PaZ],[xwLkN,HCxr,F],[xwLkN,HCxr,F,PaZ],[xwLkN,HCxr,ZkwGQ],[xwLkN,HCxr,ZkwGQ,PaZ],[xwLkN,HCxr,ZkwGQ,F],[xwLkN,HCxr,ZkwGQ,F,PaZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZwDq","VV","pZzl","OG","Wa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wa],[OG],[OG,Wa],[pZzl],[pZzl,Wa],[pZzl,OG],[pZzl,OG,Wa],[VV],[VV,Wa],[VV,OG],[VV,OG,Wa],[VV,pZzl],[VV,pZzl,Wa],[VV,pZzl,OG],[VV,pZzl,OG,Wa],[ZwDq],[ZwDq,Wa],[ZwDq,OG],[ZwDq,OG,Wa],[ZwDq,pZzl],[ZwDq,pZzl,Wa],[ZwDq,pZzl,OG],[ZwDq,pZzl,OG,Wa],[ZwDq,VV],[ZwDq,VV,Wa],[ZwDq,VV,OG],[ZwDq,VV,OG,Wa],[ZwDq,VV,pZzl],[ZwDq,VV,pZzl,Wa],[ZwDq,VV,pZzl,OG],[ZwDq,VV,pZzl,OG,Wa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UQHB","XGd","EJKK","MkKG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MkKG],[EJKK],[EJKK,MkKG],[XGd],[XGd,MkKG],[XGd,EJKK],[XGd,EJKK,MkKG],[UQHB],[UQHB,MkKG],[UQHB,EJKK],[UQHB,EJKK,MkKG],[UQHB,XGd],[UQHB,XGd,MkKG],[UQHB,XGd,EJKK],[UQHB,XGd,EJKK,MkKG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HmJX","WTtW","hWeoA","DJc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DJc],[hWeoA],[hWeoA,DJc],[WTtW],[WTtW,DJc],[WTtW,hWeoA],[WTtW,hWeoA,DJc],[HmJX],[HmJX,DJc],[HmJX,hWeoA],[HmJX,hWeoA,DJc],[HmJX,WTtW],[HmJX,WTtW,DJc],[HmJX,WTtW,hWeoA],[HmJX,WTtW,hWeoA,DJc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YJ","Cv","C","ehKQ","Fm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Fm],[ehKQ],[ehKQ,Fm],[C],[C,Fm],[C,ehKQ],[C,ehKQ,Fm],[Cv],[Cv,Fm],[Cv,ehKQ],[Cv,ehKQ,Fm],[Cv,C],[Cv,C,Fm],[Cv,C,ehKQ],[Cv,C,ehKQ,Fm],[YJ],[YJ,Fm],[YJ,ehKQ],[YJ,ehKQ,Fm],[YJ,C],[YJ,C,Fm],[YJ,C,ehKQ],[YJ,C,ehKQ,Fm],[YJ,Cv],[YJ,Cv,Fm],[YJ,Cv,ehKQ],[YJ,Cv,ehKQ,Fm],[YJ,Cv,C],[YJ,Cv,C,Fm],[YJ,Cv,C,ehKQ],[YJ,Cv,C,ehKQ,Fm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VDFh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VDFh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BLQeE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BLQeE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LMMO","no","IqF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IqF],[no],[no,IqF],[LMMO],[LMMO,IqF],[LMMO,no],[LMMO,no,IqF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GxHg","QdHf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QdHf],[GxHg],[GxHg,QdHf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qj","pEEO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pEEO],[qj],[qj,pEEO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bkl","cqj","M","bQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bQ],[M],[M,bQ],[cqj],[cqj,bQ],[cqj,M],[cqj,M,bQ],[bkl],[bkl,bQ],[bkl,M],[bkl,M,bQ],[bkl,cqj],[bkl,cqj,bQ],[bkl,cqj,M],[bkl,cqj,M,bQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iyzU","BIIWd","ZJZp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZJZp],[BIIWd],[BIIWd,ZJZp],[iyzU],[iyzU,ZJZp],[iyzU,BIIWd],[iyzU,BIIWd,ZJZp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Chf","EdOwQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EdOwQ],[Chf],[Chf,EdOwQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ECGVF","mMMei","MDt","pCnJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pCnJ],[MDt],[MDt,pCnJ],[mMMei],[mMMei,pCnJ],[mMMei,MDt],[mMMei,MDt,pCnJ],[ECGVF],[ECGVF,pCnJ],[ECGVF,MDt],[ECGVF,MDt,pCnJ],[ECGVF,mMMei],[ECGVF,mMMei,pCnJ],[ECGVF,mMMei,MDt],[ECGVF,mMMei,MDt,pCnJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "McH","KU","ky")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ky],[KU],[KU,ky],[McH],[McH,ky],[McH,KU],[McH,KU,ky]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YNXYC","gAsLV","xB","NrTy","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[NrTy],[NrTy,O],[xB],[xB,O],[xB,NrTy],[xB,NrTy,O],[gAsLV],[gAsLV,O],[gAsLV,NrTy],[gAsLV,NrTy,O],[gAsLV,xB],[gAsLV,xB,O],[gAsLV,xB,NrTy],[gAsLV,xB,NrTy,O],[YNXYC],[YNXYC,O],[YNXYC,NrTy],[YNXYC,NrTy,O],[YNXYC,xB],[YNXYC,xB,O],[YNXYC,xB,NrTy],[YNXYC,xB,NrTy,O],[YNXYC,gAsLV],[YNXYC,gAsLV,O],[YNXYC,gAsLV,NrTy],[YNXYC,gAsLV,NrTy,O],[YNXYC,gAsLV,xB],[YNXYC,gAsLV,xB,O],[YNXYC,gAsLV,xB,NrTy],[YNXYC,gAsLV,xB,NrTy,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vh","CNet","An")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[An],[CNet],[CNet,An],[vh],[vh,An],[vh,CNet],[vh,CNet,An]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YZY","kaC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kaC],[YZY],[YZY,kaC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "evzh","eSCAm","cJet","z","gVN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gVN],[z],[z,gVN],[cJet],[cJet,gVN],[cJet,z],[cJet,z,gVN],[eSCAm],[eSCAm,gVN],[eSCAm,z],[eSCAm,z,gVN],[eSCAm,cJet],[eSCAm,cJet,gVN],[eSCAm,cJet,z],[eSCAm,cJet,z,gVN],[evzh],[evzh,gVN],[evzh,z],[evzh,z,gVN],[evzh,cJet],[evzh,cJet,gVN],[evzh,cJet,z],[evzh,cJet,z,gVN],[evzh,eSCAm],[evzh,eSCAm,gVN],[evzh,eSCAm,z],[evzh,eSCAm,z,gVN],[evzh,eSCAm,cJet],[evzh,eSCAm,cJet,gVN],[evzh,eSCAm,cJet,z],[evzh,eSCAm,cJet,z,gVN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cN","Yv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Yv],[cN],[cN,Yv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IK","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[IK],[IK,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BNWEF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BNWEF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Qq","D","wUh","Fd","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[Fd],[Fd,N],[wUh],[wUh,N],[wUh,Fd],[wUh,Fd,N],[D],[D,N],[D,Fd],[D,Fd,N],[D,wUh],[D,wUh,N],[D,wUh,Fd],[D,wUh,Fd,N],[Qq],[Qq,N],[Qq,Fd],[Qq,Fd,N],[Qq,wUh],[Qq,wUh,N],[Qq,wUh,Fd],[Qq,wUh,Fd,N],[Qq,D],[Qq,D,N],[Qq,D,Fd],[Qq,D,Fd,N],[Qq,D,wUh],[Qq,D,wUh,N],[Qq,D,wUh,Fd],[Qq,D,wUh,Fd,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kQJn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kQJn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","djQUD","ytaif")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ytaif],[djQUD],[djQUD,ytaif],[r],[r,ytaif],[r,djQUD],[r,djQUD,ytaif]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JVSI","SpXLx","rF","TQt","Qupw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Qupw],[TQt],[TQt,Qupw],[rF],[rF,Qupw],[rF,TQt],[rF,TQt,Qupw],[SpXLx],[SpXLx,Qupw],[SpXLx,TQt],[SpXLx,TQt,Qupw],[SpXLx,rF],[SpXLx,rF,Qupw],[SpXLx,rF,TQt],[SpXLx,rF,TQt,Qupw],[JVSI],[JVSI,Qupw],[JVSI,TQt],[JVSI,TQt,Qupw],[JVSI,rF],[JVSI,rF,Qupw],[JVSI,rF,TQt],[JVSI,rF,TQt,Qupw],[JVSI,SpXLx],[JVSI,SpXLx,Qupw],[JVSI,SpXLx,TQt],[JVSI,SpXLx,TQt,Qupw],[JVSI,SpXLx,rF],[JVSI,SpXLx,rF,Qupw],[JVSI,SpXLx,rF,TQt],[JVSI,SpXLx,rF,TQt,Qupw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IxB","VLK","YWwL","rZlL","QseYZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QseYZ],[rZlL],[rZlL,QseYZ],[YWwL],[YWwL,QseYZ],[YWwL,rZlL],[YWwL,rZlL,QseYZ],[VLK],[VLK,QseYZ],[VLK,rZlL],[VLK,rZlL,QseYZ],[VLK,YWwL],[VLK,YWwL,QseYZ],[VLK,YWwL,rZlL],[VLK,YWwL,rZlL,QseYZ],[IxB],[IxB,QseYZ],[IxB,rZlL],[IxB,rZlL,QseYZ],[IxB,YWwL],[IxB,YWwL,QseYZ],[IxB,YWwL,rZlL],[IxB,YWwL,rZlL,QseYZ],[IxB,VLK],[IxB,VLK,QseYZ],[IxB,VLK,rZlL],[IxB,VLK,rZlL,QseYZ],[IxB,VLK,YWwL],[IxB,VLK,YWwL,QseYZ],[IxB,VLK,YWwL,rZlL],[IxB,VLK,YWwL,rZlL,QseYZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "My","bEeE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bEeE],[My],[My,bEeE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Jz","HM","TdVGi","FOUsx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FOUsx],[TdVGi],[TdVGi,FOUsx],[HM],[HM,FOUsx],[HM,TdVGi],[HM,TdVGi,FOUsx],[Jz],[Jz,FOUsx],[Jz,TdVGi],[Jz,TdVGi,FOUsx],[Jz,HM],[Jz,HM,FOUsx],[Jz,HM,TdVGi],[Jz,HM,TdVGi,FOUsx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ae")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ae]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZQ","Wr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wr],[ZQ],[ZQ,Wr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zZ","s","sHeeG","u","JKQvw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JKQvw],[u],[u,JKQvw],[sHeeG],[sHeeG,JKQvw],[sHeeG,u],[sHeeG,u,JKQvw],[s],[s,JKQvw],[s,u],[s,u,JKQvw],[s,sHeeG],[s,sHeeG,JKQvw],[s,sHeeG,u],[s,sHeeG,u,JKQvw],[zZ],[zZ,JKQvw],[zZ,u],[zZ,u,JKQvw],[zZ,sHeeG],[zZ,sHeeG,JKQvw],[zZ,sHeeG,u],[zZ,sHeeG,u,JKQvw],[zZ,s],[zZ,s,JKQvw],[zZ,s,u],[zZ,s,u,JKQvw],[zZ,s,sHeeG],[zZ,s,sHeeG,JKQvw],[zZ,s,sHeeG,u],[zZ,s,sHeeG,u,JKQvw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CJw","g","caOV","gqcF","jnoj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jnoj],[gqcF],[gqcF,jnoj],[caOV],[caOV,jnoj],[caOV,gqcF],[caOV,gqcF,jnoj],[g],[g,jnoj],[g,gqcF],[g,gqcF,jnoj],[g,caOV],[g,caOV,jnoj],[g,caOV,gqcF],[g,caOV,gqcF,jnoj],[CJw],[CJw,jnoj],[CJw,gqcF],[CJw,gqcF,jnoj],[CJw,caOV],[CJw,caOV,jnoj],[CJw,caOV,gqcF],[CJw,caOV,gqcF,jnoj],[CJw,g],[CJw,g,jnoj],[CJw,g,gqcF],[CJw,g,gqcF,jnoj],[CJw,g,caOV],[CJw,g,caOV,jnoj],[CJw,g,caOV,gqcF],[CJw,g,caOV,gqcF,jnoj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zFv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zFv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sE","pc","C","z","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[z],[z,M],[C],[C,M],[C,z],[C,z,M],[pc],[pc,M],[pc,z],[pc,z,M],[pc,C],[pc,C,M],[pc,C,z],[pc,C,z,M],[sE],[sE,M],[sE,z],[sE,z,M],[sE,C],[sE,C,M],[sE,C,z],[sE,C,z,M],[sE,pc],[sE,pc,M],[sE,pc,z],[sE,pc,z,M],[sE,pc,C],[sE,pc,C,M],[sE,pc,C,z],[sE,pc,C,z,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lOZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lOZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gzdWw","F","rFZ","l","bhlx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bhlx],[l],[l,bhlx],[rFZ],[rFZ,bhlx],[rFZ,l],[rFZ,l,bhlx],[F],[F,bhlx],[F,l],[F,l,bhlx],[F,rFZ],[F,rFZ,bhlx],[F,rFZ,l],[F,rFZ,l,bhlx],[gzdWw],[gzdWw,bhlx],[gzdWw,l],[gzdWw,l,bhlx],[gzdWw,rFZ],[gzdWw,rFZ,bhlx],[gzdWw,rFZ,l],[gzdWw,rFZ,l,bhlx],[gzdWw,F],[gzdWw,F,bhlx],[gzdWw,F,l],[gzdWw,F,l,bhlx],[gzdWw,F,rFZ],[gzdWw,F,rFZ,bhlx],[gzdWw,F,rFZ,l],[gzdWw,F,rFZ,l,bhlx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "du","oXdch","sk","WEZ","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[WEZ],[WEZ,O],[sk],[sk,O],[sk,WEZ],[sk,WEZ,O],[oXdch],[oXdch,O],[oXdch,WEZ],[oXdch,WEZ,O],[oXdch,sk],[oXdch,sk,O],[oXdch,sk,WEZ],[oXdch,sk,WEZ,O],[du],[du,O],[du,WEZ],[du,WEZ,O],[du,sk],[du,sk,O],[du,sk,WEZ],[du,sk,WEZ,O],[du,oXdch],[du,oXdch,O],[du,oXdch,WEZ],[du,oXdch,WEZ,O],[du,oXdch,sk],[du,oXdch,sk,O],[du,oXdch,sk,WEZ],[du,oXdch,sk,WEZ,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kLcr","nsNJC","UhCp","DHA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DHA],[UhCp],[UhCp,DHA],[nsNJC],[nsNJC,DHA],[nsNJC,UhCp],[nsNJC,UhCp,DHA],[kLcr],[kLcr,DHA],[kLcr,UhCp],[kLcr,UhCp,DHA],[kLcr,nsNJC],[kLcr,nsNJC,DHA],[kLcr,nsNJC,UhCp],[kLcr,nsNJC,UhCp,DHA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ej","sJ","I","vMCd","Hdeuv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Hdeuv],[vMCd],[vMCd,Hdeuv],[I],[I,Hdeuv],[I,vMCd],[I,vMCd,Hdeuv],[sJ],[sJ,Hdeuv],[sJ,vMCd],[sJ,vMCd,Hdeuv],[sJ,I],[sJ,I,Hdeuv],[sJ,I,vMCd],[sJ,I,vMCd,Hdeuv],[ej],[ej,Hdeuv],[ej,vMCd],[ej,vMCd,Hdeuv],[ej,I],[ej,I,Hdeuv],[ej,I,vMCd],[ej,I,vMCd,Hdeuv],[ej,sJ],[ej,sJ,Hdeuv],[ej,sJ,vMCd],[ej,sJ,vMCd,Hdeuv],[ej,sJ,I],[ej,sJ,I,Hdeuv],[ej,sJ,I,vMCd],[ej,sJ,I,vMCd,Hdeuv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hBza","MMVpP","XMzNO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XMzNO],[MMVpP],[MMVpP,XMzNO],[hBza],[hBza,XMzNO],[hBza,MMVpP],[hBza,MMVpP,XMzNO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TSPuB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TSPuB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UcPzN","exRUo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[exRUo],[UcPzN],[UcPzN,exRUo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SGZJ","H","bVqM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bVqM],[H],[H,bVqM],[SGZJ],[SGZJ,bVqM],[SGZJ,H],[SGZJ,H,bVqM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zLi","XfSAJ","do","aVlh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aVlh],[do],[do,aVlh],[XfSAJ],[XfSAJ,aVlh],[XfSAJ,do],[XfSAJ,do,aVlh],[zLi],[zLi,aVlh],[zLi,do],[zLi,do,aVlh],[zLi,XfSAJ],[zLi,XfSAJ,aVlh],[zLi,XfSAJ,do],[zLi,XfSAJ,do,aVlh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aQ","tYVXm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tYVXm],[aQ],[aQ,tYVXm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AwvHc","b","almq","BVbgv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BVbgv],[almq],[almq,BVbgv],[b],[b,BVbgv],[b,almq],[b,almq,BVbgv],[AwvHc],[AwvHc,BVbgv],[AwvHc,almq],[AwvHc,almq,BVbgv],[AwvHc,b],[AwvHc,b,BVbgv],[AwvHc,b,almq],[AwvHc,b,almq,BVbgv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VPZhg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VPZhg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","VNAyu","DQ","zDrO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zDrO],[DQ],[DQ,zDrO],[VNAyu],[VNAyu,zDrO],[VNAyu,DQ],[VNAyu,DQ,zDrO],[D],[D,zDrO],[D,DQ],[D,DQ,zDrO],[D,VNAyu],[D,VNAyu,zDrO],[D,VNAyu,DQ],[D,VNAyu,DQ,zDrO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ow","niv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[niv],[Ow],[Ow,niv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Qu","rz","IsU","DpkK","kDe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kDe],[DpkK],[DpkK,kDe],[IsU],[IsU,kDe],[IsU,DpkK],[IsU,DpkK,kDe],[rz],[rz,kDe],[rz,DpkK],[rz,DpkK,kDe],[rz,IsU],[rz,IsU,kDe],[rz,IsU,DpkK],[rz,IsU,DpkK,kDe],[Qu],[Qu,kDe],[Qu,DpkK],[Qu,DpkK,kDe],[Qu,IsU],[Qu,IsU,kDe],[Qu,IsU,DpkK],[Qu,IsU,DpkK,kDe],[Qu,rz],[Qu,rz,kDe],[Qu,rz,DpkK],[Qu,rz,DpkK,kDe],[Qu,rz,IsU],[Qu,rz,IsU,kDe],[Qu,rz,IsU,DpkK],[Qu,rz,IsU,DpkK,kDe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SagTj","C","V","UM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UM],[V],[V,UM],[C],[C,UM],[C,V],[C,V,UM],[SagTj],[SagTj,UM],[SagTj,V],[SagTj,V,UM],[SagTj,C],[SagTj,C,UM],[SagTj,C,V],[SagTj,C,V,UM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VRV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VRV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ke")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ke]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lQw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lQw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "T","AVJ","HPUy","wD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wD],[HPUy],[HPUy,wD],[AVJ],[AVJ,wD],[AVJ,HPUy],[AVJ,HPUy,wD],[T],[T,wD],[T,HPUy],[T,HPUy,wD],[T,AVJ],[T,AVJ,wD],[T,AVJ,HPUy],[T,AVJ,HPUy,wD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","rUs","nHzjA","KXF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KXF],[nHzjA],[nHzjA,KXF],[rUs],[rUs,KXF],[rUs,nHzjA],[rUs,nHzjA,KXF],[P],[P,KXF],[P,nHzjA],[P,nHzjA,KXF],[P,rUs],[P,rUs,KXF],[P,rUs,nHzjA],[P,rUs,nHzjA,KXF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GW","V","faub","Kd","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[Kd],[Kd,o],[faub],[faub,o],[faub,Kd],[faub,Kd,o],[V],[V,o],[V,Kd],[V,Kd,o],[V,faub],[V,faub,o],[V,faub,Kd],[V,faub,Kd,o],[GW],[GW,o],[GW,Kd],[GW,Kd,o],[GW,faub],[GW,faub,o],[GW,faub,Kd],[GW,faub,Kd,o],[GW,V],[GW,V,o],[GW,V,Kd],[GW,V,Kd,o],[GW,V,faub],[GW,V,faub,o],[GW,V,faub,Kd],[GW,V,faub,Kd,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","zyDQV","PZt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PZt],[zyDQV],[zyDQV,PZt],[P],[P,PZt],[P,zyDQV],[P,zyDQV,PZt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JPyd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JPyd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bXy","WIL","AXD","LFh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LFh],[AXD],[AXD,LFh],[WIL],[WIL,LFh],[WIL,AXD],[WIL,AXD,LFh],[bXy],[bXy,LFh],[bXy,AXD],[bXy,AXD,LFh],[bXy,WIL],[bXy,WIL,LFh],[bXy,WIL,AXD],[bXy,WIL,AXD,LFh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MovX","XJ","TVcLK","z","cP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cP],[z],[z,cP],[TVcLK],[TVcLK,cP],[TVcLK,z],[TVcLK,z,cP],[XJ],[XJ,cP],[XJ,z],[XJ,z,cP],[XJ,TVcLK],[XJ,TVcLK,cP],[XJ,TVcLK,z],[XJ,TVcLK,z,cP],[MovX],[MovX,cP],[MovX,z],[MovX,z,cP],[MovX,TVcLK],[MovX,TVcLK,cP],[MovX,TVcLK,z],[MovX,TVcLK,z,cP],[MovX,XJ],[MovX,XJ,cP],[MovX,XJ,z],[MovX,XJ,z,cP],[MovX,XJ,TVcLK],[MovX,XJ,TVcLK,cP],[MovX,XJ,TVcLK,z],[MovX,XJ,TVcLK,z,cP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sRvvz","Yqtiw","Ngjwo","pdzy","NGTU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NGTU],[pdzy],[pdzy,NGTU],[Ngjwo],[Ngjwo,NGTU],[Ngjwo,pdzy],[Ngjwo,pdzy,NGTU],[Yqtiw],[Yqtiw,NGTU],[Yqtiw,pdzy],[Yqtiw,pdzy,NGTU],[Yqtiw,Ngjwo],[Yqtiw,Ngjwo,NGTU],[Yqtiw,Ngjwo,pdzy],[Yqtiw,Ngjwo,pdzy,NGTU],[sRvvz],[sRvvz,NGTU],[sRvvz,pdzy],[sRvvz,pdzy,NGTU],[sRvvz,Ngjwo],[sRvvz,Ngjwo,NGTU],[sRvvz,Ngjwo,pdzy],[sRvvz,Ngjwo,pdzy,NGTU],[sRvvz,Yqtiw],[sRvvz,Yqtiw,NGTU],[sRvvz,Yqtiw,pdzy],[sRvvz,Yqtiw,pdzy,NGTU],[sRvvz,Yqtiw,Ngjwo],[sRvvz,Yqtiw,Ngjwo,NGTU],[sRvvz,Yqtiw,Ngjwo,pdzy],[sRvvz,Yqtiw,Ngjwo,pdzy,NGTU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pa","F","Vn","FCdPi","Ctzh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ctzh],[FCdPi],[FCdPi,Ctzh],[Vn],[Vn,Ctzh],[Vn,FCdPi],[Vn,FCdPi,Ctzh],[F],[F,Ctzh],[F,FCdPi],[F,FCdPi,Ctzh],[F,Vn],[F,Vn,Ctzh],[F,Vn,FCdPi],[F,Vn,FCdPi,Ctzh],[pa],[pa,Ctzh],[pa,FCdPi],[pa,FCdPi,Ctzh],[pa,Vn],[pa,Vn,Ctzh],[pa,Vn,FCdPi],[pa,Vn,FCdPi,Ctzh],[pa,F],[pa,F,Ctzh],[pa,F,FCdPi],[pa,F,FCdPi,Ctzh],[pa,F,Vn],[pa,F,Vn,Ctzh],[pa,F,Vn,FCdPi],[pa,F,Vn,FCdPi,Ctzh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Iz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Iz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TN","Jw","dgwv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dgwv],[Jw],[Jw,dgwv],[TN],[TN,dgwv],[TN,Jw],[TN,Jw,dgwv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yCOR","QPaS","exZBX","ekDa","gxm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gxm],[ekDa],[ekDa,gxm],[exZBX],[exZBX,gxm],[exZBX,ekDa],[exZBX,ekDa,gxm],[QPaS],[QPaS,gxm],[QPaS,ekDa],[QPaS,ekDa,gxm],[QPaS,exZBX],[QPaS,exZBX,gxm],[QPaS,exZBX,ekDa],[QPaS,exZBX,ekDa,gxm],[yCOR],[yCOR,gxm],[yCOR,ekDa],[yCOR,ekDa,gxm],[yCOR,exZBX],[yCOR,exZBX,gxm],[yCOR,exZBX,ekDa],[yCOR,exZBX,ekDa,gxm],[yCOR,QPaS],[yCOR,QPaS,gxm],[yCOR,QPaS,ekDa],[yCOR,QPaS,ekDa,gxm],[yCOR,QPaS,exZBX],[yCOR,QPaS,exZBX,gxm],[yCOR,QPaS,exZBX,ekDa],[yCOR,QPaS,exZBX,ekDa,gxm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iyG","f","vUXS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vUXS],[f],[f,vUXS],[iyG],[iyG,vUXS],[iyG,f],[iyG,f,vUXS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hqi","pu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pu],[hqi],[hqi,pu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","GZKNy","RmM","zt","LJmw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LJmw],[zt],[zt,LJmw],[RmM],[RmM,LJmw],[RmM,zt],[RmM,zt,LJmw],[GZKNy],[GZKNy,LJmw],[GZKNy,zt],[GZKNy,zt,LJmw],[GZKNy,RmM],[GZKNy,RmM,LJmw],[GZKNy,RmM,zt],[GZKNy,RmM,zt,LJmw],[a],[a,LJmw],[a,zt],[a,zt,LJmw],[a,RmM],[a,RmM,LJmw],[a,RmM,zt],[a,RmM,zt,LJmw],[a,GZKNy],[a,GZKNy,LJmw],[a,GZKNy,zt],[a,GZKNy,zt,LJmw],[a,GZKNy,RmM],[a,GZKNy,RmM,LJmw],[a,GZKNy,RmM,zt],[a,GZKNy,RmM,zt,LJmw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pq","WBB","pn","fu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fu],[pn],[pn,fu],[WBB],[WBB,fu],[WBB,pn],[WBB,pn,fu],[pq],[pq,fu],[pq,pn],[pq,pn,fu],[pq,WBB],[pq,WBB,fu],[pq,WBB,pn],[pq,WBB,pn,fu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LCxhC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LCxhC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lDZ","qUy","TPb","ptMZn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ptMZn],[TPb],[TPb,ptMZn],[qUy],[qUy,ptMZn],[qUy,TPb],[qUy,TPb,ptMZn],[lDZ],[lDZ,ptMZn],[lDZ,TPb],[lDZ,TPb,ptMZn],[lDZ,qUy],[lDZ,qUy,ptMZn],[lDZ,qUy,TPb],[lDZ,qUy,TPb,ptMZn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uf","oVPMe","Kd","QYjik","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[QYjik],[QYjik,L],[Kd],[Kd,L],[Kd,QYjik],[Kd,QYjik,L],[oVPMe],[oVPMe,L],[oVPMe,QYjik],[oVPMe,QYjik,L],[oVPMe,Kd],[oVPMe,Kd,L],[oVPMe,Kd,QYjik],[oVPMe,Kd,QYjik,L],[uf],[uf,L],[uf,QYjik],[uf,QYjik,L],[uf,Kd],[uf,Kd,L],[uf,Kd,QYjik],[uf,Kd,QYjik,L],[uf,oVPMe],[uf,oVPMe,L],[uf,oVPMe,QYjik],[uf,oVPMe,QYjik,L],[uf,oVPMe,Kd],[uf,oVPMe,Kd,L],[uf,oVPMe,Kd,QYjik],[uf,oVPMe,Kd,QYjik,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dzdM","t","H","X")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[X],[H],[H,X],[t],[t,X],[t,H],[t,H,X],[dzdM],[dzdM,X],[dzdM,H],[dzdM,H,X],[dzdM,t],[dzdM,t,X],[dzdM,t,H],[dzdM,t,H,X]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Np","pT","Xsp","YQ","yap")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yap],[YQ],[YQ,yap],[Xsp],[Xsp,yap],[Xsp,YQ],[Xsp,YQ,yap],[pT],[pT,yap],[pT,YQ],[pT,YQ,yap],[pT,Xsp],[pT,Xsp,yap],[pT,Xsp,YQ],[pT,Xsp,YQ,yap],[Np],[Np,yap],[Np,YQ],[Np,YQ,yap],[Np,Xsp],[Np,Xsp,yap],[Np,Xsp,YQ],[Np,Xsp,YQ,yap],[Np,pT],[Np,pT,yap],[Np,pT,YQ],[Np,pT,YQ,yap],[Np,pT,Xsp],[Np,pT,Xsp,yap],[Np,pT,Xsp,YQ],[Np,pT,Xsp,YQ,yap]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UGNi","NVoJP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NVoJP],[UGNi],[UGNi,NVoJP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OVDYA","ezq","EB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EB],[ezq],[ezq,EB],[OVDYA],[OVDYA,EB],[OVDYA,ezq],[OVDYA,ezq,EB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","rkwbo","phLOT","diZ","f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f],[diZ],[diZ,f],[phLOT],[phLOT,f],[phLOT,diZ],[phLOT,diZ,f],[rkwbo],[rkwbo,f],[rkwbo,diZ],[rkwbo,diZ,f],[rkwbo,phLOT],[rkwbo,phLOT,f],[rkwbo,phLOT,diZ],[rkwbo,phLOT,diZ,f],[p],[p,f],[p,diZ],[p,diZ,f],[p,phLOT],[p,phLOT,f],[p,phLOT,diZ],[p,phLOT,diZ,f],[p,rkwbo],[p,rkwbo,f],[p,rkwbo,diZ],[p,rkwbo,diZ,f],[p,rkwbo,phLOT],[p,rkwbo,phLOT,f],[p,rkwbo,phLOT,diZ],[p,rkwbo,phLOT,diZ,f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","pLLG","jBoK","ooRnv","gvqgb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gvqgb],[ooRnv],[ooRnv,gvqgb],[jBoK],[jBoK,gvqgb],[jBoK,ooRnv],[jBoK,ooRnv,gvqgb],[pLLG],[pLLG,gvqgb],[pLLG,ooRnv],[pLLG,ooRnv,gvqgb],[pLLG,jBoK],[pLLG,jBoK,gvqgb],[pLLG,jBoK,ooRnv],[pLLG,jBoK,ooRnv,gvqgb],[r],[r,gvqgb],[r,ooRnv],[r,ooRnv,gvqgb],[r,jBoK],[r,jBoK,gvqgb],[r,jBoK,ooRnv],[r,jBoK,ooRnv,gvqgb],[r,pLLG],[r,pLLG,gvqgb],[r,pLLG,ooRnv],[r,pLLG,ooRnv,gvqgb],[r,pLLG,jBoK],[r,pLLG,jBoK,gvqgb],[r,pLLG,jBoK,ooRnv],[r,pLLG,jBoK,ooRnv,gvqgb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gx","cOrXr","TxQG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TxQG],[cOrXr],[cOrXr,TxQG],[gx],[gx,TxQG],[gx,cOrXr],[gx,cOrXr,TxQG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iVbG","ClXS","d","oV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oV],[d],[d,oV],[ClXS],[ClXS,oV],[ClXS,d],[ClXS,d,oV],[iVbG],[iVbG,oV],[iVbG,d],[iVbG,d,oV],[iVbG,ClXS],[iVbG,ClXS,oV],[iVbG,ClXS,d],[iVbG,ClXS,d,oV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NKR","OoZFs","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[OoZFs],[OoZFs,M],[NKR],[NKR,M],[NKR,OoZFs],[NKR,OoZFs,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cD","VucGV","jUYdr","YnBy","euaX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[euaX],[YnBy],[YnBy,euaX],[jUYdr],[jUYdr,euaX],[jUYdr,YnBy],[jUYdr,YnBy,euaX],[VucGV],[VucGV,euaX],[VucGV,YnBy],[VucGV,YnBy,euaX],[VucGV,jUYdr],[VucGV,jUYdr,euaX],[VucGV,jUYdr,YnBy],[VucGV,jUYdr,YnBy,euaX],[cD],[cD,euaX],[cD,YnBy],[cD,YnBy,euaX],[cD,jUYdr],[cD,jUYdr,euaX],[cD,jUYdr,YnBy],[cD,jUYdr,YnBy,euaX],[cD,VucGV],[cD,VucGV,euaX],[cD,VucGV,YnBy],[cD,VucGV,YnBy,euaX],[cD,VucGV,jUYdr],[cD,VucGV,jUYdr,euaX],[cD,VucGV,jUYdr,YnBy],[cD,VucGV,jUYdr,YnBy,euaX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f","OBmpg","AcKsR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AcKsR],[OBmpg],[OBmpg,AcKsR],[f],[f,AcKsR],[f,OBmpg],[f,OBmpg,AcKsR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eO","TxAy","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[TxAy],[TxAy,L],[eO],[eO,L],[eO,TxAy],[eO,TxAy,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZWm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZWm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OHL","CMkm","RZbv","adNa","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[adNa],[adNa,M],[RZbv],[RZbv,M],[RZbv,adNa],[RZbv,adNa,M],[CMkm],[CMkm,M],[CMkm,adNa],[CMkm,adNa,M],[CMkm,RZbv],[CMkm,RZbv,M],[CMkm,RZbv,adNa],[CMkm,RZbv,adNa,M],[OHL],[OHL,M],[OHL,adNa],[OHL,adNa,M],[OHL,RZbv],[OHL,RZbv,M],[OHL,RZbv,adNa],[OHL,RZbv,adNa,M],[OHL,CMkm],[OHL,CMkm,M],[OHL,CMkm,adNa],[OHL,CMkm,adNa,M],[OHL,CMkm,RZbv],[OHL,CMkm,RZbv,M],[OHL,CMkm,RZbv,adNa],[OHL,CMkm,RZbv,adNa,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "g","MWcEK","vcJNG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vcJNG],[MWcEK],[MWcEK,vcJNG],[g],[g,vcJNG],[g,MWcEK],[g,MWcEK,vcJNG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mwq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mwq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xA","pVb","SA","qdb","ed")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ed],[qdb],[qdb,ed],[SA],[SA,ed],[SA,qdb],[SA,qdb,ed],[pVb],[pVb,ed],[pVb,qdb],[pVb,qdb,ed],[pVb,SA],[pVb,SA,ed],[pVb,SA,qdb],[pVb,SA,qdb,ed],[xA],[xA,ed],[xA,qdb],[xA,qdb,ed],[xA,SA],[xA,SA,ed],[xA,SA,qdb],[xA,SA,qdb,ed],[xA,pVb],[xA,pVb,ed],[xA,pVb,qdb],[xA,pVb,qdb,ed],[xA,pVb,SA],[xA,pVb,SA,ed],[xA,pVb,SA,qdb],[xA,pVb,SA,qdb,ed]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Lb","h","YLPaI","l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l],[YLPaI],[YLPaI,l],[h],[h,l],[h,YLPaI],[h,YLPaI,l],[Lb],[Lb,l],[Lb,YLPaI],[Lb,YLPaI,l],[Lb,h],[Lb,h,l],[Lb,h,YLPaI],[Lb,h,YLPaI,l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xZ","s","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[s],[s,Z],[xZ],[xZ,Z],[xZ,s],[xZ,s,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jz","Rsui","hc","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[hc],[hc,O],[Rsui],[Rsui,O],[Rsui,hc],[Rsui,hc,O],[jz],[jz,O],[jz,hc],[jz,hc,O],[jz,Rsui],[jz,Rsui,O],[jz,Rsui,hc],[jz,Rsui,hc,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YOjbX","fKh","r","KQefA","ve")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ve],[KQefA],[KQefA,ve],[r],[r,ve],[r,KQefA],[r,KQefA,ve],[fKh],[fKh,ve],[fKh,KQefA],[fKh,KQefA,ve],[fKh,r],[fKh,r,ve],[fKh,r,KQefA],[fKh,r,KQefA,ve],[YOjbX],[YOjbX,ve],[YOjbX,KQefA],[YOjbX,KQefA,ve],[YOjbX,r],[YOjbX,r,ve],[YOjbX,r,KQefA],[YOjbX,r,KQefA,ve],[YOjbX,fKh],[YOjbX,fKh,ve],[YOjbX,fKh,KQefA],[YOjbX,fKh,KQefA,ve],[YOjbX,fKh,r],[YOjbX,fKh,r,ve],[YOjbX,fKh,r,KQefA],[YOjbX,fKh,r,KQefA,ve]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GjjL","U","LHs","fWZ","Jyh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Jyh],[fWZ],[fWZ,Jyh],[LHs],[LHs,Jyh],[LHs,fWZ],[LHs,fWZ,Jyh],[U],[U,Jyh],[U,fWZ],[U,fWZ,Jyh],[U,LHs],[U,LHs,Jyh],[U,LHs,fWZ],[U,LHs,fWZ,Jyh],[GjjL],[GjjL,Jyh],[GjjL,fWZ],[GjjL,fWZ,Jyh],[GjjL,LHs],[GjjL,LHs,Jyh],[GjjL,LHs,fWZ],[GjjL,LHs,fWZ,Jyh],[GjjL,U],[GjjL,U,Jyh],[GjjL,U,fWZ],[GjjL,U,fWZ,Jyh],[GjjL,U,LHs],[GjjL,U,LHs,Jyh],[GjjL,U,LHs,fWZ],[GjjL,U,LHs,fWZ,Jyh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","AuSeW","vBV","oZAgz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oZAgz],[vBV],[vBV,oZAgz],[AuSeW],[AuSeW,oZAgz],[AuSeW,vBV],[AuSeW,vBV,oZAgz],[U],[U,oZAgz],[U,vBV],[U,vBV,oZAgz],[U,AuSeW],[U,AuSeW,oZAgz],[U,AuSeW,vBV],[U,AuSeW,vBV,oZAgz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Rd","EOTM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EOTM],[Rd],[Rd,EOTM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","DuupN","PXbW","fkkeE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fkkeE],[PXbW],[PXbW,fkkeE],[DuupN],[DuupN,fkkeE],[DuupN,PXbW],[DuupN,PXbW,fkkeE],[C],[C,fkkeE],[C,PXbW],[C,PXbW,fkkeE],[C,DuupN],[C,DuupN,fkkeE],[C,DuupN,PXbW],[C,DuupN,PXbW,fkkeE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cRtfK","mYTYi","iAHK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iAHK],[mYTYi],[mYTYi,iAHK],[cRtfK],[cRtfK,iAHK],[cRtfK,mYTYi],[cRtfK,mYTYi,iAHK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","WBVCe","ruXWJ","yni")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yni],[ruXWJ],[ruXWJ,yni],[WBVCe],[WBVCe,yni],[WBVCe,ruXWJ],[WBVCe,ruXWJ,yni],[q],[q,yni],[q,ruXWJ],[q,ruXWJ,yni],[q,WBVCe],[q,WBVCe,yni],[q,WBVCe,ruXWJ],[q,WBVCe,ruXWJ,yni]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VN","k","Gwz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Gwz],[k],[k,Gwz],[VN],[VN,Gwz],[VN,k],[VN,k,Gwz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "j","kBvY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kBvY],[j],[j,kBvY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LzCW","LxEgl","y","kg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kg],[y],[y,kg],[LxEgl],[LxEgl,kg],[LxEgl,y],[LxEgl,y,kg],[LzCW],[LzCW,kg],[LzCW,y],[LzCW,y,kg],[LzCW,LxEgl],[LzCW,LxEgl,kg],[LzCW,LxEgl,y],[LzCW,LxEgl,y,kg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "g","lS","dkOm","usbMf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[usbMf],[dkOm],[dkOm,usbMf],[lS],[lS,usbMf],[lS,dkOm],[lS,dkOm,usbMf],[g],[g,usbMf],[g,dkOm],[g,dkOm,usbMf],[g,lS],[g,lS,usbMf],[g,lS,dkOm],[g,lS,dkOm,usbMf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rGxW","kA","UeJEP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UeJEP],[kA],[kA,UeJEP],[rGxW],[rGxW,UeJEP],[rGxW,kA],[rGxW,kA,UeJEP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","DrNCD","Ex","Puyv","mQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mQ],[Puyv],[Puyv,mQ],[Ex],[Ex,mQ],[Ex,Puyv],[Ex,Puyv,mQ],[DrNCD],[DrNCD,mQ],[DrNCD,Puyv],[DrNCD,Puyv,mQ],[DrNCD,Ex],[DrNCD,Ex,mQ],[DrNCD,Ex,Puyv],[DrNCD,Ex,Puyv,mQ],[P],[P,mQ],[P,Puyv],[P,Puyv,mQ],[P,Ex],[P,Ex,mQ],[P,Ex,Puyv],[P,Ex,Puyv,mQ],[P,DrNCD],[P,DrNCD,mQ],[P,DrNCD,Puyv],[P,DrNCD,Puyv,mQ],[P,DrNCD,Ex],[P,DrNCD,Ex,mQ],[P,DrNCD,Ex,Puyv],[P,DrNCD,Ex,Puyv,mQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YzU","Aj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Aj],[YzU],[YzU,Aj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Z","HB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HB],[Z],[Z,HB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CrEp","NWu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NWu],[CrEp],[CrEp,NWu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","S","CX","i","Is")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Is],[i],[i,Is],[CX],[CX,Is],[CX,i],[CX,i,Is],[S],[S,Is],[S,i],[S,i,Is],[S,CX],[S,CX,Is],[S,CX,i],[S,CX,i,Is],[a],[a,Is],[a,i],[a,i,Is],[a,CX],[a,CX,Is],[a,CX,i],[a,CX,i,Is],[a,S],[a,S,Is],[a,S,i],[a,S,i,Is],[a,S,CX],[a,S,CX,Is],[a,S,CX,i],[a,S,CX,i,Is]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","BAR","iOtwG","RiY","YjfIc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YjfIc],[RiY],[RiY,YjfIc],[iOtwG],[iOtwG,YjfIc],[iOtwG,RiY],[iOtwG,RiY,YjfIc],[BAR],[BAR,YjfIc],[BAR,RiY],[BAR,RiY,YjfIc],[BAR,iOtwG],[BAR,iOtwG,YjfIc],[BAR,iOtwG,RiY],[BAR,iOtwG,RiY,YjfIc],[p],[p,YjfIc],[p,RiY],[p,RiY,YjfIc],[p,iOtwG],[p,iOtwG,YjfIc],[p,iOtwG,RiY],[p,iOtwG,RiY,YjfIc],[p,BAR],[p,BAR,YjfIc],[p,BAR,RiY],[p,BAR,RiY,YjfIc],[p,BAR,iOtwG],[p,BAR,iOtwG,YjfIc],[p,BAR,iOtwG,RiY],[p,BAR,iOtwG,RiY,YjfIc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dnqf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dnqf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mFkM","ZNEt","egajm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[egajm],[ZNEt],[ZNEt,egajm],[mFkM],[mFkM,egajm],[mFkM,ZNEt],[mFkM,ZNEt,egajm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FZgAC","kj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kj],[FZgAC],[FZgAC,kj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nwg","xw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xw],[nwg],[nwg,xw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CpQl","BN","OBleA","uS","mZOnq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mZOnq],[uS],[uS,mZOnq],[OBleA],[OBleA,mZOnq],[OBleA,uS],[OBleA,uS,mZOnq],[BN],[BN,mZOnq],[BN,uS],[BN,uS,mZOnq],[BN,OBleA],[BN,OBleA,mZOnq],[BN,OBleA,uS],[BN,OBleA,uS,mZOnq],[CpQl],[CpQl,mZOnq],[CpQl,uS],[CpQl,uS,mZOnq],[CpQl,OBleA],[CpQl,OBleA,mZOnq],[CpQl,OBleA,uS],[CpQl,OBleA,uS,mZOnq],[CpQl,BN],[CpQl,BN,mZOnq],[CpQl,BN,uS],[CpQl,BN,uS,mZOnq],[CpQl,BN,OBleA],[CpQl,BN,OBleA,mZOnq],[CpQl,BN,OBleA,uS],[CpQl,BN,OBleA,uS,mZOnq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EIT","qtC","dF","hUY","njZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[njZ],[hUY],[hUY,njZ],[dF],[dF,njZ],[dF,hUY],[dF,hUY,njZ],[qtC],[qtC,njZ],[qtC,hUY],[qtC,hUY,njZ],[qtC,dF],[qtC,dF,njZ],[qtC,dF,hUY],[qtC,dF,hUY,njZ],[EIT],[EIT,njZ],[EIT,hUY],[EIT,hUY,njZ],[EIT,dF],[EIT,dF,njZ],[EIT,dF,hUY],[EIT,dF,hUY,njZ],[EIT,qtC],[EIT,qtC,njZ],[EIT,qtC,hUY],[EIT,qtC,hUY,njZ],[EIT,qtC,dF],[EIT,qtC,dF,njZ],[EIT,qtC,dF,hUY],[EIT,qtC,dF,hUY,njZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TjXRq","KWN","d","awdq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[awdq],[d],[d,awdq],[KWN],[KWN,awdq],[KWN,d],[KWN,d,awdq],[TjXRq],[TjXRq,awdq],[TjXRq,d],[TjXRq,d,awdq],[TjXRq,KWN],[TjXRq,KWN,awdq],[TjXRq,KWN,d],[TjXRq,KWN,d,awdq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JAok","eRDwG","HXGNw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HXGNw],[eRDwG],[eRDwG,HXGNw],[JAok],[JAok,HXGNw],[JAok,eRDwG],[JAok,eRDwG,HXGNw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oDzMD","XTN","ARVKW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ARVKW],[XTN],[XTN,ARVKW],[oDzMD],[oDzMD,ARVKW],[oDzMD,XTN],[oDzMD,XTN,ARVKW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FVin","BLaEq","HeS","lT","jR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jR],[lT],[lT,jR],[HeS],[HeS,jR],[HeS,lT],[HeS,lT,jR],[BLaEq],[BLaEq,jR],[BLaEq,lT],[BLaEq,lT,jR],[BLaEq,HeS],[BLaEq,HeS,jR],[BLaEq,HeS,lT],[BLaEq,HeS,lT,jR],[FVin],[FVin,jR],[FVin,lT],[FVin,lT,jR],[FVin,HeS],[FVin,HeS,jR],[FVin,HeS,lT],[FVin,HeS,lT,jR],[FVin,BLaEq],[FVin,BLaEq,jR],[FVin,BLaEq,lT],[FVin,BLaEq,lT,jR],[FVin,BLaEq,HeS],[FVin,BLaEq,HeS,jR],[FVin,BLaEq,HeS,lT],[FVin,BLaEq,HeS,lT,jR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BpMEX","mUbh","Lepp","Ts")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ts],[Lepp],[Lepp,Ts],[mUbh],[mUbh,Ts],[mUbh,Lepp],[mUbh,Lepp,Ts],[BpMEX],[BpMEX,Ts],[BpMEX,Lepp],[BpMEX,Lepp,Ts],[BpMEX,mUbh],[BpMEX,mUbh,Ts],[BpMEX,mUbh,Lepp],[BpMEX,mUbh,Lepp,Ts]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Wo","fTG","Lkuwz","ro","vd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vd],[ro],[ro,vd],[Lkuwz],[Lkuwz,vd],[Lkuwz,ro],[Lkuwz,ro,vd],[fTG],[fTG,vd],[fTG,ro],[fTG,ro,vd],[fTG,Lkuwz],[fTG,Lkuwz,vd],[fTG,Lkuwz,ro],[fTG,Lkuwz,ro,vd],[Wo],[Wo,vd],[Wo,ro],[Wo,ro,vd],[Wo,Lkuwz],[Wo,Lkuwz,vd],[Wo,Lkuwz,ro],[Wo,Lkuwz,ro,vd],[Wo,fTG],[Wo,fTG,vd],[Wo,fTG,ro],[Wo,fTG,ro,vd],[Wo,fTG,Lkuwz],[Wo,fTG,Lkuwz,vd],[Wo,fTG,Lkuwz,ro],[Wo,fTG,Lkuwz,ro,vd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Kvxp","xJUU","U","Za")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Za],[U],[U,Za],[xJUU],[xJUU,Za],[xJUU,U],[xJUU,U,Za],[Kvxp],[Kvxp,Za],[Kvxp,U],[Kvxp,U,Za],[Kvxp,xJUU],[Kvxp,xJUU,Za],[Kvxp,xJUU,U],[Kvxp,xJUU,U,Za]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Dv","oR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oR],[Dv],[Dv,oR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Oy","rDRk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rDRk],[Oy],[Oy,rDRk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","QqU","qvAY","m","aLWQl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aLWQl],[m],[m,aLWQl],[qvAY],[qvAY,aLWQl],[qvAY,m],[qvAY,m,aLWQl],[QqU],[QqU,aLWQl],[QqU,m],[QqU,m,aLWQl],[QqU,qvAY],[QqU,qvAY,aLWQl],[QqU,qvAY,m],[QqU,qvAY,m,aLWQl],[q],[q,aLWQl],[q,m],[q,m,aLWQl],[q,qvAY],[q,qvAY,aLWQl],[q,qvAY,m],[q,qvAY,m,aLWQl],[q,QqU],[q,QqU,aLWQl],[q,QqU,m],[q,QqU,m,aLWQl],[q,QqU,qvAY],[q,QqU,qvAY,aLWQl],[q,QqU,qvAY,m],[q,QqU,qvAY,m,aLWQl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iPJe","UOqoH","vRx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vRx],[UOqoH],[UOqoH,vRx],[iPJe],[iPJe,vRx],[iPJe,UOqoH],[iPJe,UOqoH,vRx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lGCpx","cxZ","BJDyW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BJDyW],[cxZ],[cxZ,BJDyW],[lGCpx],[lGCpx,BJDyW],[lGCpx,cxZ],[lGCpx,cxZ,BJDyW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AF","GqZVP","y","pFe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pFe],[y],[y,pFe],[GqZVP],[GqZVP,pFe],[GqZVP,y],[GqZVP,y,pFe],[AF],[AF,pFe],[AF,y],[AF,y,pFe],[AF,GqZVP],[AF,GqZVP,pFe],[AF,GqZVP,y],[AF,GqZVP,y,pFe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VitJ","h","ddk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ddk],[h],[h,ddk],[VitJ],[VitJ,ddk],[VitJ,h],[VitJ,h,ddk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GXCc","fz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fz],[GXCc],[GXCc,fz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xiMK","ogjEx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ogjEx],[xiMK],[xiMK,ogjEx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AfSi","kirIb","qYg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qYg],[kirIb],[kirIb,qYg],[AfSi],[AfSi,qYg],[AfSi,kirIb],[AfSi,kirIb,qYg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rr","lr","ZeX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZeX],[lr],[lr,ZeX],[rr],[rr,ZeX],[rr,lr],[rr,lr,ZeX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EfqHe","OafH","YM","yHhcz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yHhcz],[YM],[YM,yHhcz],[OafH],[OafH,yHhcz],[OafH,YM],[OafH,YM,yHhcz],[EfqHe],[EfqHe,yHhcz],[EfqHe,YM],[EfqHe,YM,yHhcz],[EfqHe,OafH],[EfqHe,OafH,yHhcz],[EfqHe,OafH,YM],[EfqHe,OafH,YM,yHhcz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "h","Blv","AP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AP],[Blv],[Blv,AP],[h],[h,AP],[h,Blv],[h,Blv,AP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","IoBL","mqi","vB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vB],[mqi],[mqi,vB],[IoBL],[IoBL,vB],[IoBL,mqi],[IoBL,mqi,vB],[A],[A,vB],[A,mqi],[A,mqi,vB],[A,IoBL],[A,IoBL,vB],[A,IoBL,mqi],[A,IoBL,mqi,vB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Rd","tva")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tva],[Rd],[Rd,tva]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","zvzuB","JHk","JqE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JqE],[JHk],[JHk,JqE],[zvzuB],[zvzuB,JqE],[zvzuB,JHk],[zvzuB,JHk,JqE],[d],[d,JqE],[d,JHk],[d,JHk,JqE],[d,zvzuB],[d,zvzuB,JqE],[d,zvzuB,JHk],[d,zvzuB,JHk,JqE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WyIq","Z","J")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[J],[Z],[Z,J],[WyIq],[WyIq,J],[WyIq,Z],[WyIq,Z,J]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ryHxU","nRN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nRN],[ryHxU],[ryHxU,nRN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FQ","iW","wlSuW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wlSuW],[iW],[iW,wlSuW],[FQ],[FQ,wlSuW],[FQ,iW],[FQ,iW,wlSuW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gXzlw","W","Y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Y],[W],[W,Y],[gXzlw],[gXzlw,Y],[gXzlw,W],[gXzlw,W,Y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VLlQB","IX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IX],[VLlQB],[VLlQB,IX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bUCFp","g","Mt","MSNw","FKTj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FKTj],[MSNw],[MSNw,FKTj],[Mt],[Mt,FKTj],[Mt,MSNw],[Mt,MSNw,FKTj],[g],[g,FKTj],[g,MSNw],[g,MSNw,FKTj],[g,Mt],[g,Mt,FKTj],[g,Mt,MSNw],[g,Mt,MSNw,FKTj],[bUCFp],[bUCFp,FKTj],[bUCFp,MSNw],[bUCFp,MSNw,FKTj],[bUCFp,Mt],[bUCFp,Mt,FKTj],[bUCFp,Mt,MSNw],[bUCFp,Mt,MSNw,FKTj],[bUCFp,g],[bUCFp,g,FKTj],[bUCFp,g,MSNw],[bUCFp,g,MSNw,FKTj],[bUCFp,g,Mt],[bUCFp,g,Mt,FKTj],[bUCFp,g,Mt,MSNw],[bUCFp,g,Mt,MSNw,FKTj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bmepC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bmepC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "biQX","Qf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Qf],[biQX],[biQX,Qf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bs","jaaLm","RNhX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RNhX],[jaaLm],[jaaLm,RNhX],[bs],[bs,RNhX],[bs,jaaLm],[bs,jaaLm,RNhX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SYTe","VnQZd","EsbCK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EsbCK],[VnQZd],[VnQZd,EsbCK],[SYTe],[SYTe,EsbCK],[SYTe,VnQZd],[SYTe,VnQZd,EsbCK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gqpUQ","HsfFV","sFK","mh","NHYg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NHYg],[mh],[mh,NHYg],[sFK],[sFK,NHYg],[sFK,mh],[sFK,mh,NHYg],[HsfFV],[HsfFV,NHYg],[HsfFV,mh],[HsfFV,mh,NHYg],[HsfFV,sFK],[HsfFV,sFK,NHYg],[HsfFV,sFK,mh],[HsfFV,sFK,mh,NHYg],[gqpUQ],[gqpUQ,NHYg],[gqpUQ,mh],[gqpUQ,mh,NHYg],[gqpUQ,sFK],[gqpUQ,sFK,NHYg],[gqpUQ,sFK,mh],[gqpUQ,sFK,mh,NHYg],[gqpUQ,HsfFV],[gqpUQ,HsfFV,NHYg],[gqpUQ,HsfFV,mh],[gqpUQ,HsfFV,mh,NHYg],[gqpUQ,HsfFV,sFK],[gqpUQ,HsfFV,sFK,NHYg],[gqpUQ,HsfFV,sFK,mh],[gqpUQ,HsfFV,sFK,mh,NHYg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "atT","OHy","bUBHH","mXvzi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mXvzi],[bUBHH],[bUBHH,mXvzi],[OHy],[OHy,mXvzi],[OHy,bUBHH],[OHy,bUBHH,mXvzi],[atT],[atT,mXvzi],[atT,bUBHH],[atT,bUBHH,mXvzi],[atT,OHy],[atT,OHy,mXvzi],[atT,OHy,bUBHH],[atT,OHy,bUBHH,mXvzi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","HwyVU","z","GkbY","Hd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Hd],[GkbY],[GkbY,Hd],[z],[z,Hd],[z,GkbY],[z,GkbY,Hd],[HwyVU],[HwyVU,Hd],[HwyVU,GkbY],[HwyVU,GkbY,Hd],[HwyVU,z],[HwyVU,z,Hd],[HwyVU,z,GkbY],[HwyVU,z,GkbY,Hd],[C],[C,Hd],[C,GkbY],[C,GkbY,Hd],[C,z],[C,z,Hd],[C,z,GkbY],[C,z,GkbY,Hd],[C,HwyVU],[C,HwyVU,Hd],[C,HwyVU,GkbY],[C,HwyVU,GkbY,Hd],[C,HwyVU,z],[C,HwyVU,z,Hd],[C,HwyVU,z,GkbY],[C,HwyVU,z,GkbY,Hd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "to")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[to]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[t]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VRm","aJvvD","cvXcZ","UR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UR],[cvXcZ],[cvXcZ,UR],[aJvvD],[aJvvD,UR],[aJvvD,cvXcZ],[aJvvD,cvXcZ,UR],[VRm],[VRm,UR],[VRm,cvXcZ],[VRm,cvXcZ,UR],[VRm,aJvvD],[VRm,aJvvD,UR],[VRm,aJvvD,cvXcZ],[VRm,aJvvD,cvXcZ,UR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WHdL","CT","b","ULKHj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ULKHj],[b],[b,ULKHj],[CT],[CT,ULKHj],[CT,b],[CT,b,ULKHj],[WHdL],[WHdL,ULKHj],[WHdL,b],[WHdL,b,ULKHj],[WHdL,CT],[WHdL,CT,ULKHj],[WHdL,CT,b],[WHdL,CT,b,ULKHj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "c")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[c]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hzjM","kge","Xztay")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xztay],[kge],[kge,Xztay],[hzjM],[hzjM,Xztay],[hzjM,kge],[hzjM,kge,Xztay]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dlfPX","F","TQQOG","tsyi","Xne")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xne],[tsyi],[tsyi,Xne],[TQQOG],[TQQOG,Xne],[TQQOG,tsyi],[TQQOG,tsyi,Xne],[F],[F,Xne],[F,tsyi],[F,tsyi,Xne],[F,TQQOG],[F,TQQOG,Xne],[F,TQQOG,tsyi],[F,TQQOG,tsyi,Xne],[dlfPX],[dlfPX,Xne],[dlfPX,tsyi],[dlfPX,tsyi,Xne],[dlfPX,TQQOG],[dlfPX,TQQOG,Xne],[dlfPX,TQQOG,tsyi],[dlfPX,TQQOG,tsyi,Xne],[dlfPX,F],[dlfPX,F,Xne],[dlfPX,F,tsyi],[dlfPX,F,tsyi,Xne],[dlfPX,F,TQQOG],[dlfPX,F,TQQOG,Xne],[dlfPX,F,TQQOG,tsyi],[dlfPX,F,TQQOG,tsyi,Xne]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uEq","mZj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mZj],[uEq],[uEq,mZj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MVKFk","yF","kGqs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kGqs],[yF],[yF,kGqs],[MVKFk],[MVKFk,kGqs],[MVKFk,yF],[MVKFk,yF,kGqs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HNXdQ","wDTh","w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w],[wDTh],[wDTh,w],[HNXdQ],[HNXdQ,w],[HNXdQ,wDTh],[HNXdQ,wDTh,w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mpPSF","TKNaH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TKNaH],[mpPSF],[mpPSF,TKNaH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YkF","kvX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kvX],[YkF],[YkF,kvX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EmwO","Vnh","mmbD","C","hqjqK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hqjqK],[C],[C,hqjqK],[mmbD],[mmbD,hqjqK],[mmbD,C],[mmbD,C,hqjqK],[Vnh],[Vnh,hqjqK],[Vnh,C],[Vnh,C,hqjqK],[Vnh,mmbD],[Vnh,mmbD,hqjqK],[Vnh,mmbD,C],[Vnh,mmbD,C,hqjqK],[EmwO],[EmwO,hqjqK],[EmwO,C],[EmwO,C,hqjqK],[EmwO,mmbD],[EmwO,mmbD,hqjqK],[EmwO,mmbD,C],[EmwO,mmbD,C,hqjqK],[EmwO,Vnh],[EmwO,Vnh,hqjqK],[EmwO,Vnh,C],[EmwO,Vnh,C,hqjqK],[EmwO,Vnh,mmbD],[EmwO,Vnh,mmbD,hqjqK],[EmwO,Vnh,mmbD,C],[EmwO,Vnh,mmbD,C,hqjqK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","U","I","bEa","FBJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FBJ],[bEa],[bEa,FBJ],[I],[I,FBJ],[I,bEa],[I,bEa,FBJ],[U],[U,FBJ],[U,bEa],[U,bEa,FBJ],[U,I],[U,I,FBJ],[U,I,bEa],[U,I,bEa,FBJ],[Q],[Q,FBJ],[Q,bEa],[Q,bEa,FBJ],[Q,I],[Q,I,FBJ],[Q,I,bEa],[Q,I,bEa,FBJ],[Q,U],[Q,U,FBJ],[Q,U,bEa],[Q,U,bEa,FBJ],[Q,U,I],[Q,U,I,FBJ],[Q,U,I,bEa],[Q,U,I,bEa,FBJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LO","wtxrl","UYXr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UYXr],[wtxrl],[wtxrl,UYXr],[LO],[LO,UYXr],[LO,wtxrl],[LO,wtxrl,UYXr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GfvVm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GfvVm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Uw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Uw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NGgQa","JVV","zOWML")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zOWML],[JVV],[JVV,zOWML],[NGgQa],[NGgQa,zOWML],[NGgQa,JVV],[NGgQa,JVV,zOWML]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","IQ","lV","kW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kW],[lV],[lV,kW],[IQ],[IQ,kW],[IQ,lV],[IQ,lV,kW],[d],[d,kW],[d,lV],[d,lV,kW],[d,IQ],[d,IQ,kW],[d,IQ,lV],[d,IQ,lV,kW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bB","xTFP","Nv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Nv],[xTFP],[xTFP,Nv],[bB],[bB,Nv],[bB,xTFP],[bB,xTFP,Nv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uGYn","CX","QbwwZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QbwwZ],[CX],[CX,QbwwZ],[uGYn],[uGYn,QbwwZ],[uGYn,CX],[uGYn,CX,QbwwZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Xz","ot","fQtny","Wpb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wpb],[fQtny],[fQtny,Wpb],[ot],[ot,Wpb],[ot,fQtny],[ot,fQtny,Wpb],[Xz],[Xz,Wpb],[Xz,fQtny],[Xz,fQtny,Wpb],[Xz,ot],[Xz,ot,Wpb],[Xz,ot,fQtny],[Xz,ot,fQtny,Wpb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "khlTA","SJSX","ZMevv","hhM","RP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RP],[hhM],[hhM,RP],[ZMevv],[ZMevv,RP],[ZMevv,hhM],[ZMevv,hhM,RP],[SJSX],[SJSX,RP],[SJSX,hhM],[SJSX,hhM,RP],[SJSX,ZMevv],[SJSX,ZMevv,RP],[SJSX,ZMevv,hhM],[SJSX,ZMevv,hhM,RP],[khlTA],[khlTA,RP],[khlTA,hhM],[khlTA,hhM,RP],[khlTA,ZMevv],[khlTA,ZMevv,RP],[khlTA,ZMevv,hhM],[khlTA,ZMevv,hhM,RP],[khlTA,SJSX],[khlTA,SJSX,RP],[khlTA,SJSX,hhM],[khlTA,SJSX,hhM,RP],[khlTA,SJSX,ZMevv],[khlTA,SJSX,ZMevv,RP],[khlTA,SJSX,ZMevv,hhM],[khlTA,SJSX,ZMevv,hhM,RP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rLHMz","S","kcGe","V")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[V],[kcGe],[kcGe,V],[S],[S,V],[S,kcGe],[S,kcGe,V],[rLHMz],[rLHMz,V],[rLHMz,kcGe],[rLHMz,kcGe,V],[rLHMz,S],[rLHMz,S,V],[rLHMz,S,kcGe],[rLHMz,S,kcGe,V]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OVZ","s","vdSC","cDntP","lDojQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lDojQ],[cDntP],[cDntP,lDojQ],[vdSC],[vdSC,lDojQ],[vdSC,cDntP],[vdSC,cDntP,lDojQ],[s],[s,lDojQ],[s,cDntP],[s,cDntP,lDojQ],[s,vdSC],[s,vdSC,lDojQ],[s,vdSC,cDntP],[s,vdSC,cDntP,lDojQ],[OVZ],[OVZ,lDojQ],[OVZ,cDntP],[OVZ,cDntP,lDojQ],[OVZ,vdSC],[OVZ,vdSC,lDojQ],[OVZ,vdSC,cDntP],[OVZ,vdSC,cDntP,lDojQ],[OVZ,s],[OVZ,s,lDojQ],[OVZ,s,cDntP],[OVZ,s,cDntP,lDojQ],[OVZ,s,vdSC],[OVZ,s,vdSC,lDojQ],[OVZ,s,vdSC,cDntP],[OVZ,s,vdSC,cDntP,lDojQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OQnRS","GuP","eSWo","K","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[K],[K,k],[eSWo],[eSWo,k],[eSWo,K],[eSWo,K,k],[GuP],[GuP,k],[GuP,K],[GuP,K,k],[GuP,eSWo],[GuP,eSWo,k],[GuP,eSWo,K],[GuP,eSWo,K,k],[OQnRS],[OQnRS,k],[OQnRS,K],[OQnRS,K,k],[OQnRS,eSWo],[OQnRS,eSWo,k],[OQnRS,eSWo,K],[OQnRS,eSWo,K,k],[OQnRS,GuP],[OQnRS,GuP,k],[OQnRS,GuP,K],[OQnRS,GuP,K,k],[OQnRS,GuP,eSWo],[OQnRS,GuP,eSWo,k],[OQnRS,GuP,eSWo,K],[OQnRS,GuP,eSWo,K,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XfN","BZx","qG","oZu","Faw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Faw],[oZu],[oZu,Faw],[qG],[qG,Faw],[qG,oZu],[qG,oZu,Faw],[BZx],[BZx,Faw],[BZx,oZu],[BZx,oZu,Faw],[BZx,qG],[BZx,qG,Faw],[BZx,qG,oZu],[BZx,qG,oZu,Faw],[XfN],[XfN,Faw],[XfN,oZu],[XfN,oZu,Faw],[XfN,qG],[XfN,qG,Faw],[XfN,qG,oZu],[XfN,qG,oZu,Faw],[XfN,BZx],[XfN,BZx,Faw],[XfN,BZx,oZu],[XfN,BZx,oZu,Faw],[XfN,BZx,qG],[XfN,BZx,qG,Faw],[XfN,BZx,qG,oZu],[XfN,BZx,qG,oZu,Faw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WBUB","eUal","EaVs","nh","QP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QP],[nh],[nh,QP],[EaVs],[EaVs,QP],[EaVs,nh],[EaVs,nh,QP],[eUal],[eUal,QP],[eUal,nh],[eUal,nh,QP],[eUal,EaVs],[eUal,EaVs,QP],[eUal,EaVs,nh],[eUal,EaVs,nh,QP],[WBUB],[WBUB,QP],[WBUB,nh],[WBUB,nh,QP],[WBUB,EaVs],[WBUB,EaVs,QP],[WBUB,EaVs,nh],[WBUB,EaVs,nh,QP],[WBUB,eUal],[WBUB,eUal,QP],[WBUB,eUal,nh],[WBUB,eUal,nh,QP],[WBUB,eUal,EaVs],[WBUB,eUal,EaVs,QP],[WBUB,eUal,EaVs,nh],[WBUB,eUal,EaVs,nh,QP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","CjJy","SCx","DrsR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DrsR],[SCx],[SCx,DrsR],[CjJy],[CjJy,DrsR],[CjJy,SCx],[CjJy,SCx,DrsR],[d],[d,DrsR],[d,SCx],[d,SCx,DrsR],[d,CjJy],[d,CjJy,DrsR],[d,CjJy,SCx],[d,CjJy,SCx,DrsR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","Vyz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vyz],[R],[R,Vyz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "g","pELmf","axDt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[axDt],[pELmf],[pELmf,axDt],[g],[g,axDt],[g,pELmf],[g,pELmf,axDt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xbSF","RZR","BQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BQ],[RZR],[RZR,BQ],[xbSF],[xbSF,BQ],[xbSF,RZR],[xbSF,RZR,BQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NAS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NAS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[E]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uF","VnXG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VnXG],[uF],[uF,VnXG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pwZuA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pwZuA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TCG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TCG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[V]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","qRHqN","VDX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VDX],[qRHqN],[qRHqN,VDX],[b],[b,VDX],[b,qRHqN],[b,qRHqN,VDX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cwV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cwV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","t","Qe","cNhOe","bfB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bfB],[cNhOe],[cNhOe,bfB],[Qe],[Qe,bfB],[Qe,cNhOe],[Qe,cNhOe,bfB],[t],[t,bfB],[t,cNhOe],[t,cNhOe,bfB],[t,Qe],[t,Qe,bfB],[t,Qe,cNhOe],[t,Qe,cNhOe,bfB],[A],[A,bfB],[A,cNhOe],[A,cNhOe,bfB],[A,Qe],[A,Qe,bfB],[A,Qe,cNhOe],[A,Qe,cNhOe,bfB],[A,t],[A,t,bfB],[A,t,cNhOe],[A,t,cNhOe,bfB],[A,t,Qe],[A,t,Qe,bfB],[A,t,Qe,cNhOe],[A,t,Qe,cNhOe,bfB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","WYya","rZpnX","Ei","sPH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sPH],[Ei],[Ei,sPH],[rZpnX],[rZpnX,sPH],[rZpnX,Ei],[rZpnX,Ei,sPH],[WYya],[WYya,sPH],[WYya,Ei],[WYya,Ei,sPH],[WYya,rZpnX],[WYya,rZpnX,sPH],[WYya,rZpnX,Ei],[WYya,rZpnX,Ei,sPH],[a],[a,sPH],[a,Ei],[a,Ei,sPH],[a,rZpnX],[a,rZpnX,sPH],[a,rZpnX,Ei],[a,rZpnX,Ei,sPH],[a,WYya],[a,WYya,sPH],[a,WYya,Ei],[a,WYya,Ei,sPH],[a,WYya,rZpnX],[a,WYya,rZpnX,sPH],[a,WYya,rZpnX,Ei],[a,WYya,rZpnX,Ei,sPH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","uRXz","UAGU","clG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[clG],[UAGU],[UAGU,clG],[uRXz],[uRXz,clG],[uRXz,UAGU],[uRXz,UAGU,clG],[r],[r,clG],[r,UAGU],[r,UAGU,clG],[r,uRXz],[r,uRXz,clG],[r,uRXz,UAGU],[r,uRXz,UAGU,clG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NOHvs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NOHvs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gATIN","H","iGK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iGK],[H],[H,iGK],[gATIN],[gATIN,iGK],[gATIN,H],[gATIN,H,iGK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FilIi","SkXFC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SkXFC],[FilIi],[FilIi,SkXFC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jtHq","LAjkO","XRx","BvQOi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BvQOi],[XRx],[XRx,BvQOi],[LAjkO],[LAjkO,BvQOi],[LAjkO,XRx],[LAjkO,XRx,BvQOi],[jtHq],[jtHq,BvQOi],[jtHq,XRx],[jtHq,XRx,BvQOi],[jtHq,LAjkO],[jtHq,LAjkO,BvQOi],[jtHq,LAjkO,XRx],[jtHq,LAjkO,XRx,BvQOi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EiGL","YC","vs","Phaol")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Phaol],[vs],[vs,Phaol],[YC],[YC,Phaol],[YC,vs],[YC,vs,Phaol],[EiGL],[EiGL,Phaol],[EiGL,vs],[EiGL,vs,Phaol],[EiGL,YC],[EiGL,YC,Phaol],[EiGL,YC,vs],[EiGL,YC,vs,Phaol]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SqRbl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SqRbl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SUU","ax","Kdc","VWp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VWp],[Kdc],[Kdc,VWp],[ax],[ax,VWp],[ax,Kdc],[ax,Kdc,VWp],[SUU],[SUU,VWp],[SUU,Kdc],[SUU,Kdc,VWp],[SUU,ax],[SUU,ax,VWp],[SUU,ax,Kdc],[SUU,ax,Kdc,VWp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gWGw","b","wdry")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wdry],[b],[b,wdry],[gWGw],[gWGw,wdry],[gWGw,b],[gWGw,b,wdry]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mYt","hNeH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hNeH],[mYt],[mYt,hNeH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","r","CaBCc","fSw","CgGR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CgGR],[fSw],[fSw,CgGR],[CaBCc],[CaBCc,CgGR],[CaBCc,fSw],[CaBCc,fSw,CgGR],[r],[r,CgGR],[r,fSw],[r,fSw,CgGR],[r,CaBCc],[r,CaBCc,CgGR],[r,CaBCc,fSw],[r,CaBCc,fSw,CgGR],[B],[B,CgGR],[B,fSw],[B,fSw,CgGR],[B,CaBCc],[B,CaBCc,CgGR],[B,CaBCc,fSw],[B,CaBCc,fSw,CgGR],[B,r],[B,r,CgGR],[B,r,fSw],[B,r,fSw,CgGR],[B,r,CaBCc],[B,r,CaBCc,CgGR],[B,r,CaBCc,fSw],[B,r,CaBCc,fSw,CgGR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LP","WRvh","FmNFC","BDNP","iEv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iEv],[BDNP],[BDNP,iEv],[FmNFC],[FmNFC,iEv],[FmNFC,BDNP],[FmNFC,BDNP,iEv],[WRvh],[WRvh,iEv],[WRvh,BDNP],[WRvh,BDNP,iEv],[WRvh,FmNFC],[WRvh,FmNFC,iEv],[WRvh,FmNFC,BDNP],[WRvh,FmNFC,BDNP,iEv],[LP],[LP,iEv],[LP,BDNP],[LP,BDNP,iEv],[LP,FmNFC],[LP,FmNFC,iEv],[LP,FmNFC,BDNP],[LP,FmNFC,BDNP,iEv],[LP,WRvh],[LP,WRvh,iEv],[LP,WRvh,BDNP],[LP,WRvh,BDNP,iEv],[LP,WRvh,FmNFC],[LP,WRvh,FmNFC,iEv],[LP,WRvh,FmNFC,BDNP],[LP,WRvh,FmNFC,BDNP,iEv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[V]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "umH","eJE","WGcMH","ccsUO","bA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bA],[ccsUO],[ccsUO,bA],[WGcMH],[WGcMH,bA],[WGcMH,ccsUO],[WGcMH,ccsUO,bA],[eJE],[eJE,bA],[eJE,ccsUO],[eJE,ccsUO,bA],[eJE,WGcMH],[eJE,WGcMH,bA],[eJE,WGcMH,ccsUO],[eJE,WGcMH,ccsUO,bA],[umH],[umH,bA],[umH,ccsUO],[umH,ccsUO,bA],[umH,WGcMH],[umH,WGcMH,bA],[umH,WGcMH,ccsUO],[umH,WGcMH,ccsUO,bA],[umH,eJE],[umH,eJE,bA],[umH,eJE,ccsUO],[umH,eJE,ccsUO,bA],[umH,eJE,WGcMH],[umH,eJE,WGcMH,bA],[umH,eJE,WGcMH,ccsUO],[umH,eJE,WGcMH,ccsUO,bA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","ZGo","OUiU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OUiU],[ZGo],[ZGo,OUiU],[p],[p,OUiU],[p,ZGo],[p,ZGo,OUiU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yGq","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[yGq],[yGq,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AQCN","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[AQCN],[AQCN,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GZUK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GZUK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JTSih","TfRd","u","EmNM","f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f],[EmNM],[EmNM,f],[u],[u,f],[u,EmNM],[u,EmNM,f],[TfRd],[TfRd,f],[TfRd,EmNM],[TfRd,EmNM,f],[TfRd,u],[TfRd,u,f],[TfRd,u,EmNM],[TfRd,u,EmNM,f],[JTSih],[JTSih,f],[JTSih,EmNM],[JTSih,EmNM,f],[JTSih,u],[JTSih,u,f],[JTSih,u,EmNM],[JTSih,u,EmNM,f],[JTSih,TfRd],[JTSih,TfRd,f],[JTSih,TfRd,EmNM],[JTSih,TfRd,EmNM,f],[JTSih,TfRd,u],[JTSih,TfRd,u,f],[JTSih,TfRd,u,EmNM],[JTSih,TfRd,u,EmNM,f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fDT","jB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jB],[fDT],[fDT,jB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iahdI","LMQ","cfE","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[cfE],[cfE,M],[LMQ],[LMQ,M],[LMQ,cfE],[LMQ,cfE,M],[iahdI],[iahdI,M],[iahdI,cfE],[iahdI,cfE,M],[iahdI,LMQ],[iahdI,LMQ,M],[iahdI,LMQ,cfE],[iahdI,LMQ,cfE,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UI","l","zHtZy","WsUaI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WsUaI],[zHtZy],[zHtZy,WsUaI],[l],[l,WsUaI],[l,zHtZy],[l,zHtZy,WsUaI],[UI],[UI,WsUaI],[UI,zHtZy],[UI,zHtZy,WsUaI],[UI,l],[UI,l,WsUaI],[UI,l,zHtZy],[UI,l,zHtZy,WsUaI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ck")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ck]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "izud","cE","kBY","w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w],[kBY],[kBY,w],[cE],[cE,w],[cE,kBY],[cE,kBY,w],[izud],[izud,w],[izud,kBY],[izud,kBY,w],[izud,cE],[izud,cE,w],[izud,cE,kBY],[izud,cE,kBY,w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YGhw","nhh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nhh],[YGhw],[YGhw,nhh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","dI","bZOEX","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[bZOEX],[bZOEX,Z],[dI],[dI,Z],[dI,bZOEX],[dI,bZOEX,Z],[b],[b,Z],[b,bZOEX],[b,bZOEX,Z],[b,dI],[b,dI,Z],[b,dI,bZOEX],[b,dI,bZOEX,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qlK","d","xzli","mhE","WIfi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WIfi],[mhE],[mhE,WIfi],[xzli],[xzli,WIfi],[xzli,mhE],[xzli,mhE,WIfi],[d],[d,WIfi],[d,mhE],[d,mhE,WIfi],[d,xzli],[d,xzli,WIfi],[d,xzli,mhE],[d,xzli,mhE,WIfi],[qlK],[qlK,WIfi],[qlK,mhE],[qlK,mhE,WIfi],[qlK,xzli],[qlK,xzli,WIfi],[qlK,xzli,mhE],[qlK,xzli,mhE,WIfi],[qlK,d],[qlK,d,WIfi],[qlK,d,mhE],[qlK,d,mhE,WIfi],[qlK,d,xzli],[qlK,d,xzli,WIfi],[qlK,d,xzli,mhE],[qlK,d,xzli,mhE,WIfi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zDzS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zDzS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Vtl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vtl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ziuYU","Cuo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Cuo],[ziuYU],[ziuYU,Cuo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ww","e","zQoN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zQoN],[e],[e,zQoN],[Ww],[Ww,zQoN],[Ww,e],[Ww,e,zQoN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","FVg","J","MGF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MGF],[J],[J,MGF],[FVg],[FVg,MGF],[FVg,J],[FVg,J,MGF],[d],[d,MGF],[d,J],[d,J,MGF],[d,FVg],[d,FVg,MGF],[d,FVg,J],[d,FVg,J,MGF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hI","rNNS","uqNoj","HcAYN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HcAYN],[uqNoj],[uqNoj,HcAYN],[rNNS],[rNNS,HcAYN],[rNNS,uqNoj],[rNNS,uqNoj,HcAYN],[hI],[hI,HcAYN],[hI,uqNoj],[hI,uqNoj,HcAYN],[hI,rNNS],[hI,rNNS,HcAYN],[hI,rNNS,uqNoj],[hI,rNNS,uqNoj,HcAYN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JJxs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JJxs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","psR","Nm","KpC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KpC],[Nm],[Nm,KpC],[psR],[psR,KpC],[psR,Nm],[psR,Nm,KpC],[Q],[Q,KpC],[Q,Nm],[Q,Nm,KpC],[Q,psR],[Q,psR,KpC],[Q,psR,Nm],[Q,psR,Nm,KpC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qmK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qmK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hFO","dgAAd","vfs","RJuyE","zCw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zCw],[RJuyE],[RJuyE,zCw],[vfs],[vfs,zCw],[vfs,RJuyE],[vfs,RJuyE,zCw],[dgAAd],[dgAAd,zCw],[dgAAd,RJuyE],[dgAAd,RJuyE,zCw],[dgAAd,vfs],[dgAAd,vfs,zCw],[dgAAd,vfs,RJuyE],[dgAAd,vfs,RJuyE,zCw],[hFO],[hFO,zCw],[hFO,RJuyE],[hFO,RJuyE,zCw],[hFO,vfs],[hFO,vfs,zCw],[hFO,vfs,RJuyE],[hFO,vfs,RJuyE,zCw],[hFO,dgAAd],[hFO,dgAAd,zCw],[hFO,dgAAd,RJuyE],[hFO,dgAAd,RJuyE,zCw],[hFO,dgAAd,vfs],[hFO,dgAAd,vfs,zCw],[hFO,dgAAd,vfs,RJuyE],[hFO,dgAAd,vfs,RJuyE,zCw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "No","srzcg","H","Jcd","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[Jcd],[Jcd,L],[H],[H,L],[H,Jcd],[H,Jcd,L],[srzcg],[srzcg,L],[srzcg,Jcd],[srzcg,Jcd,L],[srzcg,H],[srzcg,H,L],[srzcg,H,Jcd],[srzcg,H,Jcd,L],[No],[No,L],[No,Jcd],[No,Jcd,L],[No,H],[No,H,L],[No,H,Jcd],[No,H,Jcd,L],[No,srzcg],[No,srzcg,L],[No,srzcg,Jcd],[No,srzcg,Jcd,L],[No,srzcg,H],[No,srzcg,H,L],[No,srzcg,H,Jcd],[No,srzcg,H,Jcd,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xEOja","gKdW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gKdW],[xEOja],[xEOja,gKdW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Oas","aKVq","OI","Wd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wd],[OI],[OI,Wd],[aKVq],[aKVq,Wd],[aKVq,OI],[aKVq,OI,Wd],[Oas],[Oas,Wd],[Oas,OI],[Oas,OI,Wd],[Oas,aKVq],[Oas,aKVq,Wd],[Oas,aKVq,OI],[Oas,aKVq,OI,Wd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DuWG","ktTtL","TIyyB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TIyyB],[ktTtL],[ktTtL,TIyyB],[DuWG],[DuWG,TIyyB],[DuWG,ktTtL],[DuWG,ktTtL,TIyyB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tDhtc","qXej","HacR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HacR],[qXej],[qXej,HacR],[tDhtc],[tDhtc,HacR],[tDhtc,qXej],[tDhtc,qXej,HacR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[q]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mD","x","tIhMv","fP","Tc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tc],[fP],[fP,Tc],[tIhMv],[tIhMv,Tc],[tIhMv,fP],[tIhMv,fP,Tc],[x],[x,Tc],[x,fP],[x,fP,Tc],[x,tIhMv],[x,tIhMv,Tc],[x,tIhMv,fP],[x,tIhMv,fP,Tc],[mD],[mD,Tc],[mD,fP],[mD,fP,Tc],[mD,tIhMv],[mD,tIhMv,Tc],[mD,tIhMv,fP],[mD,tIhMv,fP,Tc],[mD,x],[mD,x,Tc],[mD,x,fP],[mD,x,fP,Tc],[mD,x,tIhMv],[mD,x,tIhMv,Tc],[mD,x,tIhMv,fP],[mD,x,tIhMv,fP,Tc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fsu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fsu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ujlGE","XpC","MWJZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MWJZ],[XpC],[XpC,MWJZ],[ujlGE],[ujlGE,MWJZ],[ujlGE,XpC],[ujlGE,XpC,MWJZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Xxjr","Hgar","vj","stTb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[stTb],[vj],[vj,stTb],[Hgar],[Hgar,stTb],[Hgar,vj],[Hgar,vj,stTb],[Xxjr],[Xxjr,stTb],[Xxjr,vj],[Xxjr,vj,stTb],[Xxjr,Hgar],[Xxjr,Hgar,stTb],[Xxjr,Hgar,vj],[Xxjr,Hgar,vj,stTb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","a","qS","PtJR","twrK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[twrK],[PtJR],[PtJR,twrK],[qS],[qS,twrK],[qS,PtJR],[qS,PtJR,twrK],[a],[a,twrK],[a,PtJR],[a,PtJR,twrK],[a,qS],[a,qS,twrK],[a,qS,PtJR],[a,qS,PtJR,twrK],[p],[p,twrK],[p,PtJR],[p,PtJR,twrK],[p,qS],[p,qS,twrK],[p,qS,PtJR],[p,qS,PtJR,twrK],[p,a],[p,a,twrK],[p,a,PtJR],[p,a,PtJR,twrK],[p,a,qS],[p,a,qS,twrK],[p,a,qS,PtJR],[p,a,qS,PtJR,twrK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SzL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SzL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","fe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fe],[t],[t,fe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ab","A","B","Qz","Wpw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wpw],[Qz],[Qz,Wpw],[B],[B,Wpw],[B,Qz],[B,Qz,Wpw],[A],[A,Wpw],[A,Qz],[A,Qz,Wpw],[A,B],[A,B,Wpw],[A,B,Qz],[A,B,Qz,Wpw],[ab],[ab,Wpw],[ab,Qz],[ab,Qz,Wpw],[ab,B],[ab,B,Wpw],[ab,B,Qz],[ab,B,Qz,Wpw],[ab,A],[ab,A,Wpw],[ab,A,Qz],[ab,A,Qz,Wpw],[ab,A,B],[ab,A,B,Wpw],[ab,A,B,Qz],[ab,A,B,Qz,Wpw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IZ","hPgra","CoKV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CoKV],[hPgra],[hPgra,CoKV],[IZ],[IZ,CoKV],[IZ,hPgra],[IZ,hPgra,CoKV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","nq","QIQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QIQ],[nq],[nq,QIQ],[P],[P,QIQ],[P,nq],[P,nq,QIQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PLs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PLs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GiOq","AY","KBAfo","JNfjB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JNfjB],[KBAfo],[KBAfo,JNfjB],[AY],[AY,JNfjB],[AY,KBAfo],[AY,KBAfo,JNfjB],[GiOq],[GiOq,JNfjB],[GiOq,KBAfo],[GiOq,KBAfo,JNfjB],[GiOq,AY],[GiOq,AY,JNfjB],[GiOq,AY,KBAfo],[GiOq,AY,KBAfo,JNfjB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kvgWF","ABdR","i","nUt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nUt],[i],[i,nUt],[ABdR],[ABdR,nUt],[ABdR,i],[ABdR,i,nUt],[kvgWF],[kvgWF,nUt],[kvgWF,i],[kvgWF,i,nUt],[kvgWF,ABdR],[kvgWF,ABdR,nUt],[kvgWF,ABdR,i],[kvgWF,ABdR,i,nUt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UPQK","auI","nSWYh","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[nSWYh],[nSWYh,k],[auI],[auI,k],[auI,nSWYh],[auI,nSWYh,k],[UPQK],[UPQK,k],[UPQK,nSWYh],[UPQK,nSWYh,k],[UPQK,auI],[UPQK,auI,k],[UPQK,auI,nSWYh],[UPQK,auI,nSWYh,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SeXt","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[SeXt],[SeXt,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KnZYe","yQw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yQw],[KnZYe],[KnZYe,yQw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","zgZX","S","d","HsAj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HsAj],[d],[d,HsAj],[S],[S,HsAj],[S,d],[S,d,HsAj],[zgZX],[zgZX,HsAj],[zgZX,d],[zgZX,d,HsAj],[zgZX,S],[zgZX,S,HsAj],[zgZX,S,d],[zgZX,S,d,HsAj],[A],[A,HsAj],[A,d],[A,d,HsAj],[A,S],[A,S,HsAj],[A,S,d],[A,S,d,HsAj],[A,zgZX],[A,zgZX,HsAj],[A,zgZX,d],[A,zgZX,d,HsAj],[A,zgZX,S],[A,zgZX,S,HsAj],[A,zgZX,S,d],[A,zgZX,S,d,HsAj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YZ","otw","I","bN","rp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rp],[bN],[bN,rp],[I],[I,rp],[I,bN],[I,bN,rp],[otw],[otw,rp],[otw,bN],[otw,bN,rp],[otw,I],[otw,I,rp],[otw,I,bN],[otw,I,bN,rp],[YZ],[YZ,rp],[YZ,bN],[YZ,bN,rp],[YZ,I],[YZ,I,rp],[YZ,I,bN],[YZ,I,bN,rp],[YZ,otw],[YZ,otw,rp],[YZ,otw,bN],[YZ,otw,bN,rp],[YZ,otw,I],[YZ,otw,I,rp],[YZ,otw,I,bN],[YZ,otw,I,bN,rp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Kr","ZSd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZSd],[Kr],[Kr,ZSd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","RUI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RUI],[B],[B,RUI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UNl","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[UNl],[UNl,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ptv","MiA","nadiU","HF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HF],[nadiU],[nadiU,HF],[MiA],[MiA,HF],[MiA,nadiU],[MiA,nadiU,HF],[Ptv],[Ptv,HF],[Ptv,nadiU],[Ptv,nadiU,HF],[Ptv,MiA],[Ptv,MiA,HF],[Ptv,MiA,nadiU],[Ptv,MiA,nadiU,HF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "I","BFvE","tC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tC],[BFvE],[BFvE,tC],[I],[I,tC],[I,BFvE],[I,BFvE,tC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fA","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[fA],[fA,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sYX","wb","tfBYw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tfBYw],[wb],[wb,tfBYw],[sYX],[sYX,tfBYw],[sYX,wb],[sYX,wb,tfBYw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mak","kcTX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kcTX],[mak],[mak,kcTX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RaB","WofK","wKvDx","sjIu","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[sjIu],[sjIu,j],[wKvDx],[wKvDx,j],[wKvDx,sjIu],[wKvDx,sjIu,j],[WofK],[WofK,j],[WofK,sjIu],[WofK,sjIu,j],[WofK,wKvDx],[WofK,wKvDx,j],[WofK,wKvDx,sjIu],[WofK,wKvDx,sjIu,j],[RaB],[RaB,j],[RaB,sjIu],[RaB,sjIu,j],[RaB,wKvDx],[RaB,wKvDx,j],[RaB,wKvDx,sjIu],[RaB,wKvDx,sjIu,j],[RaB,WofK],[RaB,WofK,j],[RaB,WofK,sjIu],[RaB,WofK,sjIu,j],[RaB,WofK,wKvDx],[RaB,WofK,wKvDx,j],[RaB,WofK,wKvDx,sjIu],[RaB,WofK,wKvDx,sjIu,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "URadP","i","OIEnd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OIEnd],[i],[i,OIEnd],[URadP],[URadP,OIEnd],[URadP,i],[URadP,i,OIEnd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","v","wLsI","oVEXc","TB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TB],[oVEXc],[oVEXc,TB],[wLsI],[wLsI,TB],[wLsI,oVEXc],[wLsI,oVEXc,TB],[v],[v,TB],[v,oVEXc],[v,oVEXc,TB],[v,wLsI],[v,wLsI,TB],[v,wLsI,oVEXc],[v,wLsI,oVEXc,TB],[d],[d,TB],[d,oVEXc],[d,oVEXc,TB],[d,wLsI],[d,wLsI,TB],[d,wLsI,oVEXc],[d,wLsI,oVEXc,TB],[d,v],[d,v,TB],[d,v,oVEXc],[d,v,oVEXc,TB],[d,v,wLsI],[d,v,wLsI,TB],[d,v,wLsI,oVEXc],[d,v,wLsI,oVEXc,TB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AKBr","jq","VIlo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VIlo],[jq],[jq,VIlo],[AKBr],[AKBr,VIlo],[AKBr,jq],[AKBr,jq,VIlo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CZAI","sNvBc","UvBXr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UvBXr],[sNvBc],[sNvBc,UvBXr],[CZAI],[CZAI,UvBXr],[CZAI,sNvBc],[CZAI,sNvBc,UvBXr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Atiqv","WTUS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WTUS],[Atiqv],[Atiqv,WTUS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iI","qzcY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qzcY],[iI],[iI,qzcY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","K","SP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SP],[K],[K,SP],[q],[q,SP],[q,K],[q,K,SP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HUIO","Rc","eVKhn","VNrm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VNrm],[eVKhn],[eVKhn,VNrm],[Rc],[Rc,VNrm],[Rc,eVKhn],[Rc,eVKhn,VNrm],[HUIO],[HUIO,VNrm],[HUIO,eVKhn],[HUIO,eVKhn,VNrm],[HUIO,Rc],[HUIO,Rc,VNrm],[HUIO,Rc,eVKhn],[HUIO,Rc,eVKhn,VNrm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MMS","pPoR","kg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kg],[pPoR],[pPoR,kg],[MMS],[MMS,kg],[MMS,pPoR],[MMS,pPoR,kg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UPs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UPs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wcUx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wcUx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "u","SpSw","chSmd","sCyb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sCyb],[chSmd],[chSmd,sCyb],[SpSw],[SpSw,sCyb],[SpSw,chSmd],[SpSw,chSmd,sCyb],[u],[u,sCyb],[u,chSmd],[u,chSmd,sCyb],[u,SpSw],[u,SpSw,sCyb],[u,SpSw,chSmd],[u,SpSw,chSmd,sCyb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "je")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[je]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kQzE","BiQMi","BAql")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BAql],[BiQMi],[BiQMi,BAql],[kQzE],[kQzE,BAql],[kQzE,BiQMi],[kQzE,BiQMi,BAql]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WSV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WSV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "js")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[js]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wk","xR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xR],[wk],[wk,xR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LqLK","gaZs","kFvIF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kFvIF],[gaZs],[gaZs,kFvIF],[LqLK],[LqLK,kFvIF],[LqLK,gaZs],[LqLK,gaZs,kFvIF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qDRUQ","hJwJ","aDfS","OUieA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OUieA],[aDfS],[aDfS,OUieA],[hJwJ],[hJwJ,OUieA],[hJwJ,aDfS],[hJwJ,aDfS,OUieA],[qDRUQ],[qDRUQ,OUieA],[qDRUQ,aDfS],[qDRUQ,aDfS,OUieA],[qDRUQ,hJwJ],[qDRUQ,hJwJ,OUieA],[qDRUQ,hJwJ,aDfS],[qDRUQ,hJwJ,aDfS,OUieA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BpKyS","mG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mG],[BpKyS],[BpKyS,mG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uG","dyL","oz","Bxd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Bxd],[oz],[oz,Bxd],[dyL],[dyL,Bxd],[dyL,oz],[dyL,oz,Bxd],[uG],[uG,Bxd],[uG,oz],[uG,oz,Bxd],[uG,dyL],[uG,dyL,Bxd],[uG,dyL,oz],[uG,dyL,oz,Bxd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AOKY","e")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[e],[AOKY],[AOKY,e]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","Mu","J","ijrwH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ijrwH],[J],[J,ijrwH],[Mu],[Mu,ijrwH],[Mu,J],[Mu,J,ijrwH],[r],[r,ijrwH],[r,J],[r,J,ijrwH],[r,Mu],[r,Mu,ijrwH],[r,Mu,J],[r,Mu,J,ijrwH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "c","sM","Ds")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ds],[sM],[sM,Ds],[c],[c,Ds],[c,sM],[c,sM,Ds]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","F","SEDs","kpqVo","aWyV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aWyV],[kpqVo],[kpqVo,aWyV],[SEDs],[SEDs,aWyV],[SEDs,kpqVo],[SEDs,kpqVo,aWyV],[F],[F,aWyV],[F,kpqVo],[F,kpqVo,aWyV],[F,SEDs],[F,SEDs,aWyV],[F,SEDs,kpqVo],[F,SEDs,kpqVo,aWyV],[C],[C,aWyV],[C,kpqVo],[C,kpqVo,aWyV],[C,SEDs],[C,SEDs,aWyV],[C,SEDs,kpqVo],[C,SEDs,kpqVo,aWyV],[C,F],[C,F,aWyV],[C,F,kpqVo],[C,F,kpqVo,aWyV],[C,F,SEDs],[C,F,SEDs,aWyV],[C,F,SEDs,kpqVo],[C,F,SEDs,kpqVo,aWyV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Fh","Z","YNCp","fs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fs],[YNCp],[YNCp,fs],[Z],[Z,fs],[Z,YNCp],[Z,YNCp,fs],[Fh],[Fh,fs],[Fh,YNCp],[Fh,YNCp,fs],[Fh,Z],[Fh,Z,fs],[Fh,Z,YNCp],[Fh,Z,YNCp,fs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DvaCO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DvaCO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tHT","EiZtl","m","vd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vd],[m],[m,vd],[EiZtl],[EiZtl,vd],[EiZtl,m],[EiZtl,m,vd],[tHT],[tHT,vd],[tHT,m],[tHT,m,vd],[tHT,EiZtl],[tHT,EiZtl,vd],[tHT,EiZtl,m],[tHT,EiZtl,m,vd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","r","az","qjQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qjQ],[az],[az,qjQ],[r],[r,qjQ],[r,az],[r,az,qjQ],[q],[q,qjQ],[q,az],[q,az,qjQ],[q,r],[q,r,qjQ],[q,r,az],[q,r,az,qjQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Gezff","U","Vt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vt],[U],[U,Vt],[Gezff],[Gezff,Vt],[Gezff,U],[Gezff,U,Vt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SzdB","vm","pDZ","UWh","ftG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ftG],[UWh],[UWh,ftG],[pDZ],[pDZ,ftG],[pDZ,UWh],[pDZ,UWh,ftG],[vm],[vm,ftG],[vm,UWh],[vm,UWh,ftG],[vm,pDZ],[vm,pDZ,ftG],[vm,pDZ,UWh],[vm,pDZ,UWh,ftG],[SzdB],[SzdB,ftG],[SzdB,UWh],[SzdB,UWh,ftG],[SzdB,pDZ],[SzdB,pDZ,ftG],[SzdB,pDZ,UWh],[SzdB,pDZ,UWh,ftG],[SzdB,vm],[SzdB,vm,ftG],[SzdB,vm,UWh],[SzdB,vm,UWh,ftG],[SzdB,vm,pDZ],[SzdB,vm,pDZ,ftG],[SzdB,vm,pDZ,UWh],[SzdB,vm,pDZ,UWh,ftG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","HpG","aHuP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aHuP],[HpG],[HpG,aHuP],[t],[t,aHuP],[t,HpG],[t,HpG,aHuP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ysZ","PaEt","MVpBH","h","H")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[H],[h],[h,H],[MVpBH],[MVpBH,H],[MVpBH,h],[MVpBH,h,H],[PaEt],[PaEt,H],[PaEt,h],[PaEt,h,H],[PaEt,MVpBH],[PaEt,MVpBH,H],[PaEt,MVpBH,h],[PaEt,MVpBH,h,H],[ysZ],[ysZ,H],[ysZ,h],[ysZ,h,H],[ysZ,MVpBH],[ysZ,MVpBH,H],[ysZ,MVpBH,h],[ysZ,MVpBH,h,H],[ysZ,PaEt],[ysZ,PaEt,H],[ysZ,PaEt,h],[ysZ,PaEt,h,H],[ysZ,PaEt,MVpBH],[ysZ,PaEt,MVpBH,H],[ysZ,PaEt,MVpBH,h],[ysZ,PaEt,MVpBH,h,H]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x","Utjuw","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[Utjuw],[Utjuw,z],[x],[x,z],[x,Utjuw],[x,Utjuw,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YQuKl","fUmuj","ddDl","lR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lR],[ddDl],[ddDl,lR],[fUmuj],[fUmuj,lR],[fUmuj,ddDl],[fUmuj,ddDl,lR],[YQuKl],[YQuKl,lR],[YQuKl,ddDl],[YQuKl,ddDl,lR],[YQuKl,fUmuj],[YQuKl,fUmuj,lR],[YQuKl,fUmuj,ddDl],[YQuKl,fUmuj,ddDl,lR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BOAlO","HP","qBJq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qBJq],[HP],[HP,qBJq],[BOAlO],[BOAlO,qBJq],[BOAlO,HP],[BOAlO,HP,qBJq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UiKu","bOZG","EM","GB","JEy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JEy],[GB],[GB,JEy],[EM],[EM,JEy],[EM,GB],[EM,GB,JEy],[bOZG],[bOZG,JEy],[bOZG,GB],[bOZG,GB,JEy],[bOZG,EM],[bOZG,EM,JEy],[bOZG,EM,GB],[bOZG,EM,GB,JEy],[UiKu],[UiKu,JEy],[UiKu,GB],[UiKu,GB,JEy],[UiKu,EM],[UiKu,EM,JEy],[UiKu,EM,GB],[UiKu,EM,GB,JEy],[UiKu,bOZG],[UiKu,bOZG,JEy],[UiKu,bOZG,GB],[UiKu,bOZG,GB,JEy],[UiKu,bOZG,EM],[UiKu,bOZG,EM,JEy],[UiKu,bOZG,EM,GB],[UiKu,bOZG,EM,GB,JEy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IZbs","BsT","FWbj","BCO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BCO],[FWbj],[FWbj,BCO],[BsT],[BsT,BCO],[BsT,FWbj],[BsT,FWbj,BCO],[IZbs],[IZbs,BCO],[IZbs,FWbj],[IZbs,FWbj,BCO],[IZbs,BsT],[IZbs,BsT,BCO],[IZbs,BsT,FWbj],[IZbs,BsT,FWbj,BCO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kZnH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kZnH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Tcmo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tcmo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "c","XGt","V","JtU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JtU],[V],[V,JtU],[XGt],[XGt,JtU],[XGt,V],[XGt,V,JtU],[c],[c,JtU],[c,V],[c,V,JtU],[c,XGt],[c,XGt,JtU],[c,XGt,V],[c,XGt,V,JtU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ess","DNI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DNI],[ess],[ess,DNI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "csP","i")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[i],[csP],[csP,i]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NZLUi","rt","gFJ","tnUC","GFcHz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GFcHz],[tnUC],[tnUC,GFcHz],[gFJ],[gFJ,GFcHz],[gFJ,tnUC],[gFJ,tnUC,GFcHz],[rt],[rt,GFcHz],[rt,tnUC],[rt,tnUC,GFcHz],[rt,gFJ],[rt,gFJ,GFcHz],[rt,gFJ,tnUC],[rt,gFJ,tnUC,GFcHz],[NZLUi],[NZLUi,GFcHz],[NZLUi,tnUC],[NZLUi,tnUC,GFcHz],[NZLUi,gFJ],[NZLUi,gFJ,GFcHz],[NZLUi,gFJ,tnUC],[NZLUi,gFJ,tnUC,GFcHz],[NZLUi,rt],[NZLUi,rt,GFcHz],[NZLUi,rt,tnUC],[NZLUi,rt,tnUC,GFcHz],[NZLUi,rt,gFJ],[NZLUi,rt,gFJ,GFcHz],[NZLUi,rt,gFJ,tnUC],[NZLUi,rt,gFJ,tnUC,GFcHz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gfp","wMiB","vCbDd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vCbDd],[wMiB],[wMiB,vCbDd],[gfp],[gfp,vCbDd],[gfp,wMiB],[gfp,wMiB,vCbDd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","guT","YKhDn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YKhDn],[guT],[guT,YKhDn],[s],[s,YKhDn],[s,guT],[s,guT,YKhDn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AQB","xM","MqX","IWDjg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IWDjg],[MqX],[MqX,IWDjg],[xM],[xM,IWDjg],[xM,MqX],[xM,MqX,IWDjg],[AQB],[AQB,IWDjg],[AQB,MqX],[AQB,MqX,IWDjg],[AQB,xM],[AQB,xM,IWDjg],[AQB,xM,MqX],[AQB,xM,MqX,IWDjg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "paF","CLxmP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CLxmP],[paF],[paF,CLxmP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","APX","nmoY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nmoY],[APX],[APX,nmoY],[A],[A,nmoY],[A,APX],[A,APX,nmoY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mVcl","gX","PA","DXEsl","akY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[akY],[DXEsl],[DXEsl,akY],[PA],[PA,akY],[PA,DXEsl],[PA,DXEsl,akY],[gX],[gX,akY],[gX,DXEsl],[gX,DXEsl,akY],[gX,PA],[gX,PA,akY],[gX,PA,DXEsl],[gX,PA,DXEsl,akY],[mVcl],[mVcl,akY],[mVcl,DXEsl],[mVcl,DXEsl,akY],[mVcl,PA],[mVcl,PA,akY],[mVcl,PA,DXEsl],[mVcl,PA,DXEsl,akY],[mVcl,gX],[mVcl,gX,akY],[mVcl,gX,DXEsl],[mVcl,gX,DXEsl,akY],[mVcl,gX,PA],[mVcl,gX,PA,akY],[mVcl,gX,PA,DXEsl],[mVcl,gX,PA,DXEsl,akY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nAT","Hsk","QXi","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[QXi],[QXi,K],[Hsk],[Hsk,K],[Hsk,QXi],[Hsk,QXi,K],[nAT],[nAT,K],[nAT,QXi],[nAT,QXi,K],[nAT,Hsk],[nAT,Hsk,K],[nAT,Hsk,QXi],[nAT,Hsk,QXi,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HOX","A","hFTk","w","JE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JE],[w],[w,JE],[hFTk],[hFTk,JE],[hFTk,w],[hFTk,w,JE],[A],[A,JE],[A,w],[A,w,JE],[A,hFTk],[A,hFTk,JE],[A,hFTk,w],[A,hFTk,w,JE],[HOX],[HOX,JE],[HOX,w],[HOX,w,JE],[HOX,hFTk],[HOX,hFTk,JE],[HOX,hFTk,w],[HOX,hFTk,w,JE],[HOX,A],[HOX,A,JE],[HOX,A,w],[HOX,A,w,JE],[HOX,A,hFTk],[HOX,A,hFTk,JE],[HOX,A,hFTk,w],[HOX,A,hFTk,w,JE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SGgj","RD","hnmy","NNcm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NNcm],[hnmy],[hnmy,NNcm],[RD],[RD,NNcm],[RD,hnmy],[RD,hnmy,NNcm],[SGgj],[SGgj,NNcm],[SGgj,hnmy],[SGgj,hnmy,NNcm],[SGgj,RD],[SGgj,RD,NNcm],[SGgj,RD,hnmy],[SGgj,RD,hnmy,NNcm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EEsT","Jb","MVrv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MVrv],[Jb],[Jb,MVrv],[EEsT],[EEsT,MVrv],[EEsT,Jb],[EEsT,Jb,MVrv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Lsy","g","RJCuy","iagI","njLO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[njLO],[iagI],[iagI,njLO],[RJCuy],[RJCuy,njLO],[RJCuy,iagI],[RJCuy,iagI,njLO],[g],[g,njLO],[g,iagI],[g,iagI,njLO],[g,RJCuy],[g,RJCuy,njLO],[g,RJCuy,iagI],[g,RJCuy,iagI,njLO],[Lsy],[Lsy,njLO],[Lsy,iagI],[Lsy,iagI,njLO],[Lsy,RJCuy],[Lsy,RJCuy,njLO],[Lsy,RJCuy,iagI],[Lsy,RJCuy,iagI,njLO],[Lsy,g],[Lsy,g,njLO],[Lsy,g,iagI],[Lsy,g,iagI,njLO],[Lsy,g,RJCuy],[Lsy,g,RJCuy,njLO],[Lsy,g,RJCuy,iagI],[Lsy,g,RJCuy,iagI,njLO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","EH","riTXz","mEv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mEv],[riTXz],[riTXz,mEv],[EH],[EH,mEv],[EH,riTXz],[EH,riTXz,mEv],[s],[s,mEv],[s,riTXz],[s,riTXz,mEv],[s,EH],[s,EH,mEv],[s,EH,riTXz],[s,EH,riTXz,mEv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kk","LYWB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LYWB],[kk],[kk,LYWB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","dvE","Vrs","Ys","TOi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TOi],[Ys],[Ys,TOi],[Vrs],[Vrs,TOi],[Vrs,Ys],[Vrs,Ys,TOi],[dvE],[dvE,TOi],[dvE,Ys],[dvE,Ys,TOi],[dvE,Vrs],[dvE,Vrs,TOi],[dvE,Vrs,Ys],[dvE,Vrs,Ys,TOi],[P],[P,TOi],[P,Ys],[P,Ys,TOi],[P,Vrs],[P,Vrs,TOi],[P,Vrs,Ys],[P,Vrs,Ys,TOi],[P,dvE],[P,dvE,TOi],[P,dvE,Ys],[P,dvE,Ys,TOi],[P,dvE,Vrs],[P,dvE,Vrs,TOi],[P,dvE,Vrs,Ys],[P,dvE,Vrs,Ys,TOi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zwN","eGBJ","U","i","LVuY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LVuY],[i],[i,LVuY],[U],[U,LVuY],[U,i],[U,i,LVuY],[eGBJ],[eGBJ,LVuY],[eGBJ,i],[eGBJ,i,LVuY],[eGBJ,U],[eGBJ,U,LVuY],[eGBJ,U,i],[eGBJ,U,i,LVuY],[zwN],[zwN,LVuY],[zwN,i],[zwN,i,LVuY],[zwN,U],[zwN,U,LVuY],[zwN,U,i],[zwN,U,i,LVuY],[zwN,eGBJ],[zwN,eGBJ,LVuY],[zwN,eGBJ,i],[zwN,eGBJ,i,LVuY],[zwN,eGBJ,U],[zwN,eGBJ,U,LVuY],[zwN,eGBJ,U,i],[zwN,eGBJ,U,i,LVuY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uyPO","XFE","rAQgs","pM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pM],[rAQgs],[rAQgs,pM],[XFE],[XFE,pM],[XFE,rAQgs],[XFE,rAQgs,pM],[uyPO],[uyPO,pM],[uyPO,rAQgs],[uyPO,rAQgs,pM],[uyPO,XFE],[uyPO,XFE,pM],[uyPO,XFE,rAQgs],[uyPO,XFE,rAQgs,pM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","d","nvoWQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nvoWQ],[d],[d,nvoWQ],[D],[D,nvoWQ],[D,d],[D,d,nvoWQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LSwEY","Jw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Jw],[LSwEY],[LSwEY,Jw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nq","KFyE","Smpta","sUAL","NkPSE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NkPSE],[sUAL],[sUAL,NkPSE],[Smpta],[Smpta,NkPSE],[Smpta,sUAL],[Smpta,sUAL,NkPSE],[KFyE],[KFyE,NkPSE],[KFyE,sUAL],[KFyE,sUAL,NkPSE],[KFyE,Smpta],[KFyE,Smpta,NkPSE],[KFyE,Smpta,sUAL],[KFyE,Smpta,sUAL,NkPSE],[nq],[nq,NkPSE],[nq,sUAL],[nq,sUAL,NkPSE],[nq,Smpta],[nq,Smpta,NkPSE],[nq,Smpta,sUAL],[nq,Smpta,sUAL,NkPSE],[nq,KFyE],[nq,KFyE,NkPSE],[nq,KFyE,sUAL],[nq,KFyE,sUAL,NkPSE],[nq,KFyE,Smpta],[nq,KFyE,Smpta,NkPSE],[nq,KFyE,Smpta,sUAL],[nq,KFyE,Smpta,sUAL,NkPSE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LEaQ","L","hVwdz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hVwdz],[L],[L,hVwdz],[LEaQ],[LEaQ,hVwdz],[LEaQ,L],[LEaQ,L,hVwdz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YBN","vdXj","sOUg","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[sOUg],[sOUg,L],[vdXj],[vdXj,L],[vdXj,sOUg],[vdXj,sOUg,L],[YBN],[YBN,L],[YBN,sOUg],[YBN,sOUg,L],[YBN,vdXj],[YBN,vdXj,L],[YBN,vdXj,sOUg],[YBN,vdXj,sOUg,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "T","LDSP","I")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[I],[LDSP],[LDSP,I],[T],[T,I],[T,LDSP],[T,LDSP,I]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TRHGc","npe","cuqd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cuqd],[npe],[npe,cuqd],[TRHGc],[TRHGc,cuqd],[TRHGc,npe],[TRHGc,npe,cuqd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jMbs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jMbs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pxtAk","OE","MZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MZ],[OE],[OE,MZ],[pxtAk],[pxtAk,MZ],[pxtAk,OE],[pxtAk,OE,MZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ufGg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ufGg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "m","YdYb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YdYb],[m],[m,YdYb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","c","i","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[i],[i,n],[c],[c,n],[c,i],[c,i,n],[r],[r,n],[r,i],[r,i,n],[r,c],[r,c,n],[r,c,i],[r,c,i,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZHG","voXvf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[voXvf],[ZHG],[ZHG,voXvf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","YQN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YQN],[s],[s,YQN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SpD","LIiz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LIiz],[SpD],[SpD,LIiz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jRRb","LbLXH","Nvb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Nvb],[LbLXH],[LbLXH,Nvb],[jRRb],[jRRb,Nvb],[jRRb,LbLXH],[jRRb,LbLXH,Nvb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","hwcG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hwcG],[r],[r,hwcG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ccnBW","S","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[S],[S,j],[ccnBW],[ccnBW,j],[ccnBW,S],[ccnBW,S,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ay","Yc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Yc],[Ay],[Ay,Yc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LSTYG","n","aktXT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aktXT],[n],[n,aktXT],[LSTYG],[LSTYG,aktXT],[LSTYG,n],[LSTYG,n,aktXT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SSe","i","ZC","aN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aN],[ZC],[ZC,aN],[i],[i,aN],[i,ZC],[i,ZC,aN],[SSe],[SSe,aN],[SSe,ZC],[SSe,ZC,aN],[SSe,i],[SSe,i,aN],[SSe,i,ZC],[SSe,i,ZC,aN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zgp","yeR","sch","zhPah","ksYbg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ksYbg],[zhPah],[zhPah,ksYbg],[sch],[sch,ksYbg],[sch,zhPah],[sch,zhPah,ksYbg],[yeR],[yeR,ksYbg],[yeR,zhPah],[yeR,zhPah,ksYbg],[yeR,sch],[yeR,sch,ksYbg],[yeR,sch,zhPah],[yeR,sch,zhPah,ksYbg],[Zgp],[Zgp,ksYbg],[Zgp,zhPah],[Zgp,zhPah,ksYbg],[Zgp,sch],[Zgp,sch,ksYbg],[Zgp,sch,zhPah],[Zgp,sch,zhPah,ksYbg],[Zgp,yeR],[Zgp,yeR,ksYbg],[Zgp,yeR,zhPah],[Zgp,yeR,zhPah,ksYbg],[Zgp,yeR,sch],[Zgp,yeR,sch,ksYbg],[Zgp,yeR,sch,zhPah],[Zgp,yeR,sch,zhPah,ksYbg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oP","L","Gd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Gd],[L],[L,Gd],[oP],[oP,Gd],[oP,L],[oP,L,Gd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iQK","IXq","J","mx","THgN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[THgN],[mx],[mx,THgN],[J],[J,THgN],[J,mx],[J,mx,THgN],[IXq],[IXq,THgN],[IXq,mx],[IXq,mx,THgN],[IXq,J],[IXq,J,THgN],[IXq,J,mx],[IXq,J,mx,THgN],[iQK],[iQK,THgN],[iQK,mx],[iQK,mx,THgN],[iQK,J],[iQK,J,THgN],[iQK,J,mx],[iQK,J,mx,THgN],[iQK,IXq],[iQK,IXq,THgN],[iQK,IXq,mx],[iQK,IXq,mx,THgN],[iQK,IXq,J],[iQK,IXq,J,THgN],[iQK,IXq,J,mx],[iQK,IXq,J,mx,THgN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TVs","TOhYM","T","fNSbV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fNSbV],[T],[T,fNSbV],[TOhYM],[TOhYM,fNSbV],[TOhYM,T],[TOhYM,T,fNSbV],[TVs],[TVs,fNSbV],[TVs,T],[TVs,T,fNSbV],[TVs,TOhYM],[TVs,TOhYM,fNSbV],[TVs,TOhYM,T],[TVs,TOhYM,T,fNSbV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vmnkE","oB","dJJ","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[dJJ],[dJJ,z],[oB],[oB,z],[oB,dJJ],[oB,dJJ,z],[vmnkE],[vmnkE,z],[vmnkE,dJJ],[vmnkE,dJJ,z],[vmnkE,oB],[vmnkE,oB,z],[vmnkE,oB,dJJ],[vmnkE,oB,dJJ,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LNXm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LNXm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ozl","jo","FpkxR","IUfC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IUfC],[FpkxR],[FpkxR,IUfC],[jo],[jo,IUfC],[jo,FpkxR],[jo,FpkxR,IUfC],[ozl],[ozl,IUfC],[ozl,FpkxR],[ozl,FpkxR,IUfC],[ozl,jo],[ozl,jo,IUfC],[ozl,jo,FpkxR],[ozl,jo,FpkxR,IUfC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dcCP","oc","ZDf","krhQw","po")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[po],[krhQw],[krhQw,po],[ZDf],[ZDf,po],[ZDf,krhQw],[ZDf,krhQw,po],[oc],[oc,po],[oc,krhQw],[oc,krhQw,po],[oc,ZDf],[oc,ZDf,po],[oc,ZDf,krhQw],[oc,ZDf,krhQw,po],[dcCP],[dcCP,po],[dcCP,krhQw],[dcCP,krhQw,po],[dcCP,ZDf],[dcCP,ZDf,po],[dcCP,ZDf,krhQw],[dcCP,ZDf,krhQw,po],[dcCP,oc],[dcCP,oc,po],[dcCP,oc,krhQw],[dcCP,oc,krhQw,po],[dcCP,oc,ZDf],[dcCP,oc,ZDf,po],[dcCP,oc,ZDf,krhQw],[dcCP,oc,ZDf,krhQw,po]]", resultFormatted);
    }
}

