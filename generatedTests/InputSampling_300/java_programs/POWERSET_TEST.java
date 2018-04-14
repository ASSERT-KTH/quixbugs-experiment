package java_programs;


public class POWERSET_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CCqV","EYp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EYp],[CCqV],[CCqV,EYp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WnCj","ohe","eukM","FjLt","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[FjLt],[FjLt,n],[eukM],[eukM,n],[eukM,FjLt],[eukM,FjLt,n],[ohe],[ohe,n],[ohe,FjLt],[ohe,FjLt,n],[ohe,eukM],[ohe,eukM,n],[ohe,eukM,FjLt],[ohe,eukM,FjLt,n],[WnCj],[WnCj,n],[WnCj,FjLt],[WnCj,FjLt,n],[WnCj,eukM],[WnCj,eukM,n],[WnCj,eukM,FjLt],[WnCj,eukM,FjLt,n],[WnCj,ohe],[WnCj,ohe,n],[WnCj,ohe,FjLt],[WnCj,ohe,FjLt,n],[WnCj,ohe,eukM],[WnCj,ohe,eukM,n],[WnCj,ohe,eukM,FjLt],[WnCj,ohe,eukM,FjLt,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WH","BAU","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[BAU],[BAU,k],[WH],[WH,k],[WH,BAU],[WH,BAU,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rix","ev","soJJ","RsyXF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RsyXF],[soJJ],[soJJ,RsyXF],[ev],[ev,RsyXF],[ev,soJJ],[ev,soJJ,RsyXF],[rix],[rix,RsyXF],[rix,soJJ],[rix,soJJ,RsyXF],[rix,ev],[rix,ev,RsyXF],[rix,ev,soJJ],[rix,ev,soJJ,RsyXF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iUDY","F")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[F],[iUDY],[iUDY,F]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cYdl","kM","GOtlH","SBOp","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[SBOp],[SBOp,O],[GOtlH],[GOtlH,O],[GOtlH,SBOp],[GOtlH,SBOp,O],[kM],[kM,O],[kM,SBOp],[kM,SBOp,O],[kM,GOtlH],[kM,GOtlH,O],[kM,GOtlH,SBOp],[kM,GOtlH,SBOp,O],[cYdl],[cYdl,O],[cYdl,SBOp],[cYdl,SBOp,O],[cYdl,GOtlH],[cYdl,GOtlH,O],[cYdl,GOtlH,SBOp],[cYdl,GOtlH,SBOp,O],[cYdl,kM],[cYdl,kM,O],[cYdl,kM,SBOp],[cYdl,kM,SBOp,O],[cYdl,kM,GOtlH],[cYdl,kM,GOtlH,O],[cYdl,kM,GOtlH,SBOp],[cYdl,kM,GOtlH,SBOp,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tchxM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tchxM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZwgY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZwgY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HtLb","oCT","tWi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tWi],[oCT],[oCT,tWi],[HtLb],[HtLb,tWi],[HtLb,oCT],[HtLb,oCT,tWi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l],[a],[a,l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "la","lC","zvX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zvX],[lC],[lC,zvX],[la],[la,zvX],[la,lC],[la,lC,zvX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Iq","OY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OY],[Iq],[Iq,OY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GBfba","Y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Y],[GBfba],[GBfba,Y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XnZ","WSEX","cbvQV","soj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[soj],[cbvQV],[cbvQV,soj],[WSEX],[WSEX,soj],[WSEX,cbvQV],[WSEX,cbvQV,soj],[XnZ],[XnZ,soj],[XnZ,cbvQV],[XnZ,cbvQV,soj],[XnZ,WSEX],[XnZ,WSEX,soj],[XnZ,WSEX,cbvQV],[XnZ,WSEX,cbvQV,soj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qC","vTAt","EQX","Gf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Gf],[EQX],[EQX,Gf],[vTAt],[vTAt,Gf],[vTAt,EQX],[vTAt,EQX,Gf],[qC],[qC,Gf],[qC,EQX],[qC,EQX,Gf],[qC,vTAt],[qC,vTAt,Gf],[qC,vTAt,EQX],[qC,vTAt,EQX,Gf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EiF","D","OZtV","pif")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pif],[OZtV],[OZtV,pif],[D],[D,pif],[D,OZtV],[D,OZtV,pif],[EiF],[EiF,pif],[EiF,OZtV],[EiF,OZtV,pif],[EiF,D],[EiF,D,pif],[EiF,D,OZtV],[EiF,D,OZtV,pif]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ohi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ohi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mcjPU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mcjPU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sOxd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sOxd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vKFGh","zad","KGGuy","xHqcb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xHqcb],[KGGuy],[KGGuy,xHqcb],[zad],[zad,xHqcb],[zad,KGGuy],[zad,KGGuy,xHqcb],[vKFGh],[vKFGh,xHqcb],[vKFGh,KGGuy],[vKFGh,KGGuy,xHqcb],[vKFGh,zad],[vKFGh,zad,xHqcb],[vKFGh,zad,KGGuy],[vKFGh,zad,KGGuy,xHqcb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ixWgl","f","vL","QJkcQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QJkcQ],[vL],[vL,QJkcQ],[f],[f,QJkcQ],[f,vL],[f,vL,QJkcQ],[ixWgl],[ixWgl,QJkcQ],[ixWgl,vL],[ixWgl,vL,QJkcQ],[ixWgl,f],[ixWgl,f,QJkcQ],[ixWgl,f,vL],[ixWgl,f,vL,QJkcQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iAuG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iAuG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lJL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lJL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xl","dZ","VtZ","ALQqt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ALQqt],[VtZ],[VtZ,ALQqt],[dZ],[dZ,ALQqt],[dZ,VtZ],[dZ,VtZ,ALQqt],[xl],[xl,ALQqt],[xl,VtZ],[xl,VtZ,ALQqt],[xl,dZ],[xl,dZ,ALQqt],[xl,dZ,VtZ],[xl,dZ,VtZ,ALQqt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kNs","VJzO","ca")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ca],[VJzO],[VJzO,ca],[kNs],[kNs,ca],[kNs,VJzO],[kNs,VJzO,ca]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GUmlK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GUmlK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SmaK","OT","hS","aZAyo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aZAyo],[hS],[hS,aZAyo],[OT],[OT,aZAyo],[OT,hS],[OT,hS,aZAyo],[SmaK],[SmaK,aZAyo],[SmaK,hS],[SmaK,hS,aZAyo],[SmaK,OT],[SmaK,OT,aZAyo],[SmaK,OT,hS],[SmaK,OT,hS,aZAyo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KU","zCzD","xC","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[xC],[xC,N],[zCzD],[zCzD,N],[zCzD,xC],[zCzD,xC,N],[KU],[KU,N],[KU,xC],[KU,xC,N],[KU,zCzD],[KU,zCzD,N],[KU,zCzD,xC],[KU,zCzD,xC,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","HXB","mD","g","sfPGb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sfPGb],[g],[g,sfPGb],[mD],[mD,sfPGb],[mD,g],[mD,g,sfPGb],[HXB],[HXB,sfPGb],[HXB,g],[HXB,g,sfPGb],[HXB,mD],[HXB,mD,sfPGb],[HXB,mD,g],[HXB,mD,g,sfPGb],[R],[R,sfPGb],[R,g],[R,g,sfPGb],[R,mD],[R,mD,sfPGb],[R,mD,g],[R,mD,g,sfPGb],[R,HXB],[R,HXB,sfPGb],[R,HXB,g],[R,HXB,g,sfPGb],[R,HXB,mD],[R,HXB,mD,sfPGb],[R,HXB,mD,g],[R,HXB,mD,g,sfPGb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UvzZQ","J","QzQb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QzQb],[J],[J,QzQb],[UvzZQ],[UvzZQ,QzQb],[UvzZQ,J],[UvzZQ,J,QzQb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bu","xV","rKX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rKX],[xV],[xV,rKX],[Bu],[Bu,rKX],[Bu,xV],[Bu,xV,rKX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bZXx","I","iEw","VJOQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VJOQ],[iEw],[iEw,VJOQ],[I],[I,VJOQ],[I,iEw],[I,iEw,VJOQ],[bZXx],[bZXx,VJOQ],[bZXx,iEw],[bZXx,iEw,VJOQ],[bZXx,I],[bZXx,I,VJOQ],[bZXx,I,iEw],[bZXx,I,iEw,VJOQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Wy","BNR","GSAIv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GSAIv],[BNR],[BNR,GSAIv],[Wy],[Wy,GSAIv],[Wy,BNR],[Wy,BNR,GSAIv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aPX","l","Dxa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Dxa],[l],[l,Dxa],[aPX],[aPX,Dxa],[aPX,l],[aPX,l,Dxa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RGB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RGB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ivP","dN","atvY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[atvY],[dN],[dN,atvY],[ivP],[ivP,atvY],[ivP,dN],[ivP,dN,atvY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aqNhD","djL","RWN","fqBsg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fqBsg],[RWN],[RWN,fqBsg],[djL],[djL,fqBsg],[djL,RWN],[djL,RWN,fqBsg],[aqNhD],[aqNhD,fqBsg],[aqNhD,RWN],[aqNhD,RWN,fqBsg],[aqNhD,djL],[aqNhD,djL,fqBsg],[aqNhD,djL,RWN],[aqNhD,djL,RWN,fqBsg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KVZrS","QpSOb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QpSOb],[KVZrS],[KVZrS,QpSOb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zpipW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zpipW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RfM","y","sSXv","wZCFQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wZCFQ],[sSXv],[sSXv,wZCFQ],[y],[y,wZCFQ],[y,sSXv],[y,sSXv,wZCFQ],[RfM],[RfM,wZCFQ],[RfM,sSXv],[RfM,sSXv,wZCFQ],[RfM,y],[RfM,y,wZCFQ],[RfM,y,sSXv],[RfM,y,sSXv,wZCFQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BwzKF","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[BwzKF],[BwzKF,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Q]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tQOW","OrXy","q","dUv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dUv],[q],[q,dUv],[OrXy],[OrXy,dUv],[OrXy,q],[OrXy,q,dUv],[tQOW],[tQOW,dUv],[tQOW,q],[tQOW,q,dUv],[tQOW,OrXy],[tQOW,OrXy,dUv],[tQOW,OrXy,q],[tQOW,OrXy,q,dUv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ggtlu","fmvD","tyL","wow")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wow],[tyL],[tyL,wow],[fmvD],[fmvD,wow],[fmvD,tyL],[fmvD,tyL,wow],[Ggtlu],[Ggtlu,wow],[Ggtlu,tyL],[Ggtlu,tyL,wow],[Ggtlu,fmvD],[Ggtlu,fmvD,wow],[Ggtlu,fmvD,tyL],[Ggtlu,fmvD,tyL,wow]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qgrvf","iXbMS","y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[y],[iXbMS],[iXbMS,y],[qgrvf],[qgrvf,y],[qgrvf,iXbMS],[qgrvf,iXbMS,y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Q]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IHa","jiwjB","I")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[I],[jiwjB],[jiwjB,I],[IHa],[IHa,I],[IHa,jiwjB],[IHa,jiwjB,I]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nMOF","Z","Opfus","fkc","iH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iH],[fkc],[fkc,iH],[Opfus],[Opfus,iH],[Opfus,fkc],[Opfus,fkc,iH],[Z],[Z,iH],[Z,fkc],[Z,fkc,iH],[Z,Opfus],[Z,Opfus,iH],[Z,Opfus,fkc],[Z,Opfus,fkc,iH],[nMOF],[nMOF,iH],[nMOF,fkc],[nMOF,fkc,iH],[nMOF,Opfus],[nMOF,Opfus,iH],[nMOF,Opfus,fkc],[nMOF,Opfus,fkc,iH],[nMOF,Z],[nMOF,Z,iH],[nMOF,Z,fkc],[nMOF,Z,fkc,iH],[nMOF,Z,Opfus],[nMOF,Z,Opfus,iH],[nMOF,Z,Opfus,fkc],[nMOF,Z,Opfus,fkc,iH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tt","bzug","EK","VU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VU],[EK],[EK,VU],[bzug],[bzug,VU],[bzug,EK],[bzug,EK,VU],[tt],[tt,VU],[tt,EK],[tt,EK,VU],[tt,bzug],[tt,bzug,VU],[tt,bzug,EK],[tt,bzug,EK,VU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KQsKs","DHqL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DHqL],[KQsKs],[KQsKs,DHqL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wFwRi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wFwRi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pW","gRE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gRE],[pW],[pW,gRE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","eDkT","XO","VkK","G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G],[VkK],[VkK,G],[XO],[XO,G],[XO,VkK],[XO,VkK,G],[eDkT],[eDkT,G],[eDkT,VkK],[eDkT,VkK,G],[eDkT,XO],[eDkT,XO,G],[eDkT,XO,VkK],[eDkT,XO,VkK,G],[R],[R,G],[R,VkK],[R,VkK,G],[R,XO],[R,XO,G],[R,XO,VkK],[R,XO,VkK,G],[R,eDkT],[R,eDkT,G],[R,eDkT,VkK],[R,eDkT,VkK,G],[R,eDkT,XO],[R,eDkT,XO,G],[R,eDkT,XO,VkK],[R,eDkT,XO,VkK,G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vMlk","GRDND","E","y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[y],[E],[E,y],[GRDND],[GRDND,y],[GRDND,E],[GRDND,E,y],[vMlk],[vMlk,y],[vMlk,E],[vMlk,E,y],[vMlk,GRDND],[vMlk,GRDND,y],[vMlk,GRDND,E],[vMlk,GRDND,E,y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zkWDM","Z","YrXsU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YrXsU],[Z],[Z,YrXsU],[zkWDM],[zkWDM,YrXsU],[zkWDM,Z],[zkWDM,Z,YrXsU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oe","G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G],[oe],[oe,G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EzxfX","F","kwrYE","sksEe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sksEe],[kwrYE],[kwrYE,sksEe],[F],[F,sksEe],[F,kwrYE],[F,kwrYE,sksEe],[EzxfX],[EzxfX,sksEe],[EzxfX,kwrYE],[EzxfX,kwrYE,sksEe],[EzxfX,F],[EzxfX,F,sksEe],[EzxfX,F,kwrYE],[EzxfX,F,kwrYE,sksEe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ujf","AKqBR","NrFH","KOJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KOJ],[NrFH],[NrFH,KOJ],[AKqBR],[AKqBR,KOJ],[AKqBR,NrFH],[AKqBR,NrFH,KOJ],[ujf],[ujf,KOJ],[ujf,NrFH],[ujf,NrFH,KOJ],[ujf,AKqBR],[ujf,AKqBR,KOJ],[ujf,AKqBR,NrFH],[ujf,AKqBR,NrFH,KOJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","NF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NF],[d],[d,NF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Br","PHIg","e","coXOp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[coXOp],[e],[e,coXOp],[PHIg],[PHIg,coXOp],[PHIg,e],[PHIg,e,coXOp],[Br],[Br,coXOp],[Br,e],[Br,e,coXOp],[Br,PHIg],[Br,PHIg,coXOp],[Br,PHIg,e],[Br,PHIg,e,coXOp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ae","k","IkGpE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IkGpE],[k],[k,IkGpE],[Ae],[Ae,IkGpE],[Ae,k],[Ae,k,IkGpE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pP","XQNy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XQNy],[pP],[pP,XQNy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZYQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZYQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mam","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[mam],[mam,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CnM","qE","LGchg","CmSs","kvQdr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kvQdr],[CmSs],[CmSs,kvQdr],[LGchg],[LGchg,kvQdr],[LGchg,CmSs],[LGchg,CmSs,kvQdr],[qE],[qE,kvQdr],[qE,CmSs],[qE,CmSs,kvQdr],[qE,LGchg],[qE,LGchg,kvQdr],[qE,LGchg,CmSs],[qE,LGchg,CmSs,kvQdr],[CnM],[CnM,kvQdr],[CnM,CmSs],[CnM,CmSs,kvQdr],[CnM,LGchg],[CnM,LGchg,kvQdr],[CnM,LGchg,CmSs],[CnM,LGchg,CmSs,kvQdr],[CnM,qE],[CnM,qE,kvQdr],[CnM,qE,CmSs],[CnM,qE,CmSs,kvQdr],[CnM,qE,LGchg],[CnM,qE,LGchg,kvQdr],[CnM,qE,LGchg,CmSs],[CnM,qE,LGchg,CmSs,kvQdr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xz","LNZbQ","gBo","WYf","iTS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iTS],[WYf],[WYf,iTS],[gBo],[gBo,iTS],[gBo,WYf],[gBo,WYf,iTS],[LNZbQ],[LNZbQ,iTS],[LNZbQ,WYf],[LNZbQ,WYf,iTS],[LNZbQ,gBo],[LNZbQ,gBo,iTS],[LNZbQ,gBo,WYf],[LNZbQ,gBo,WYf,iTS],[xz],[xz,iTS],[xz,WYf],[xz,WYf,iTS],[xz,gBo],[xz,gBo,iTS],[xz,gBo,WYf],[xz,gBo,WYf,iTS],[xz,LNZbQ],[xz,LNZbQ,iTS],[xz,LNZbQ,WYf],[xz,LNZbQ,WYf,iTS],[xz,LNZbQ,gBo],[xz,LNZbQ,gBo,iTS],[xz,LNZbQ,gBo,WYf],[xz,LNZbQ,gBo,WYf,iTS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hpzjD","McIe","f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f],[McIe],[McIe,f],[hpzjD],[hpzjD,f],[hpzjD,McIe],[hpzjD,McIe,f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rCcmR","UL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UL],[rCcmR],[rCcmR,UL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oZ","Rn","cDn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cDn],[Rn],[Rn,cDn],[oZ],[oZ,cDn],[oZ,Rn],[oZ,Rn,cDn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FEo","VQrPJ","JjMJ","XiIFD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XiIFD],[JjMJ],[JjMJ,XiIFD],[VQrPJ],[VQrPJ,XiIFD],[VQrPJ,JjMJ],[VQrPJ,JjMJ,XiIFD],[FEo],[FEo,XiIFD],[FEo,JjMJ],[FEo,JjMJ,XiIFD],[FEo,VQrPJ],[FEo,VQrPJ,XiIFD],[FEo,VQrPJ,JjMJ],[FEo,VQrPJ,JjMJ,XiIFD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cMXrU","JU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JU],[cMXrU],[cMXrU,JU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ron","WREk","LI","HGyy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HGyy],[LI],[LI,HGyy],[WREk],[WREk,HGyy],[WREk,LI],[WREk,LI,HGyy],[ron],[ron,HGyy],[ron,LI],[ron,LI,HGyy],[ron,WREk],[ron,WREk,HGyy],[ron,WREk,LI],[ron,WREk,LI,HGyy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E","bimOQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bimOQ],[E],[E,bimOQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dboN","SkNJO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SkNJO],[dboN],[dboN,SkNJO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[a]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MBD","wV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wV],[MBD],[MBD,wV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","iq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iq],[a],[a,iq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GQh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GQh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zM","voc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[voc],[zM],[zM,voc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Pc","rw","PJ","xT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xT],[PJ],[PJ,xT],[rw],[rw,xT],[rw,PJ],[rw,PJ,xT],[Pc],[Pc,xT],[Pc,PJ],[Pc,PJ,xT],[Pc,rw],[Pc,rw,xT],[Pc,rw,PJ],[Pc,rw,PJ,xT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZeM","foQ","GOc","UT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UT],[GOc],[GOc,UT],[foQ],[foQ,UT],[foQ,GOc],[foQ,GOc,UT],[ZeM],[ZeM,UT],[ZeM,GOc],[ZeM,GOc,UT],[ZeM,foQ],[ZeM,foQ,UT],[ZeM,foQ,GOc],[ZeM,foQ,GOc,UT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Li")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Li]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Hx","gCBT","ldgC","Veey")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Veey],[ldgC],[ldgC,Veey],[gCBT],[gCBT,Veey],[gCBT,ldgC],[gCBT,ldgC,Veey],[Hx],[Hx,Veey],[Hx,ldgC],[Hx,ldgC,Veey],[Hx,gCBT],[Hx,gCBT,Veey],[Hx,gCBT,ldgC],[Hx,gCBT,ldgC,Veey]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "F","wjQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wjQ],[F],[F,wjQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Xaz","Kms")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Kms],[Xaz],[Xaz,Kms]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WpL","C","nQip","FzS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FzS],[nQip],[nQip,FzS],[C],[C,FzS],[C,nQip],[C,nQip,FzS],[WpL],[WpL,FzS],[WpL,nQip],[WpL,nQip,FzS],[WpL,C],[WpL,C,FzS],[WpL,C,nQip],[WpL,C,nQip,FzS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vyf","Qh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Qh],[vyf],[vyf,Qh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AOQy","ueM","xQX","Ra")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ra],[xQX],[xQX,Ra],[ueM],[ueM,Ra],[ueM,xQX],[ueM,xQX,Ra],[AOQy],[AOQy,Ra],[AOQy,xQX],[AOQy,xQX,Ra],[AOQy,ueM],[AOQy,ueM,Ra],[AOQy,ueM,xQX],[AOQy,ueM,xQX,Ra]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Re","LfXI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LfXI],[Re],[Re,LfXI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Pd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Pd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","ka","G","K","PJft")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PJft],[K],[K,PJft],[G],[G,PJft],[G,K],[G,K,PJft],[ka],[ka,PJft],[ka,K],[ka,K,PJft],[ka,G],[ka,G,PJft],[ka,G,K],[ka,G,K,PJft],[D],[D,PJft],[D,K],[D,K,PJft],[D,G],[D,G,PJft],[D,G,K],[D,G,K,PJft],[D,ka],[D,ka,PJft],[D,ka,K],[D,ka,K,PJft],[D,ka,G],[D,ka,G,PJft],[D,ka,G,K],[D,ka,G,K,PJft]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DaE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DaE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Cp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aB","BeE","cAe","euBE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[euBE],[cAe],[cAe,euBE],[BeE],[BeE,euBE],[BeE,cAe],[BeE,cAe,euBE],[aB],[aB,euBE],[aB,cAe],[aB,cAe,euBE],[aB,BeE],[aB,BeE,euBE],[aB,BeE,cAe],[aB,BeE,cAe,euBE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cfHW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cfHW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YUN","jAsE","KWf","lh","ZV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZV],[lh],[lh,ZV],[KWf],[KWf,ZV],[KWf,lh],[KWf,lh,ZV],[jAsE],[jAsE,ZV],[jAsE,lh],[jAsE,lh,ZV],[jAsE,KWf],[jAsE,KWf,ZV],[jAsE,KWf,lh],[jAsE,KWf,lh,ZV],[YUN],[YUN,ZV],[YUN,lh],[YUN,lh,ZV],[YUN,KWf],[YUN,KWf,ZV],[YUN,KWf,lh],[YUN,KWf,lh,ZV],[YUN,jAsE],[YUN,jAsE,ZV],[YUN,jAsE,lh],[YUN,jAsE,lh,ZV],[YUN,jAsE,KWf],[YUN,jAsE,KWf,ZV],[YUN,jAsE,KWf,lh],[YUN,jAsE,KWf,lh,ZV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","oGkgU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oGkgU],[q],[q,oGkgU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","MR","tKcSp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tKcSp],[MR],[MR,tKcSp],[U],[U,tKcSp],[U,MR],[U,MR,tKcSp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BxP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BxP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[W]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xq","QYpge")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QYpge],[xq],[xq,QYpge]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KmQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KmQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Qbe","Tk","nU","SKbCE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SKbCE],[nU],[nU,SKbCE],[Tk],[Tk,SKbCE],[Tk,nU],[Tk,nU,SKbCE],[Qbe],[Qbe,SKbCE],[Qbe,nU],[Qbe,nU,SKbCE],[Qbe,Tk],[Qbe,Tk,SKbCE],[Qbe,Tk,nU],[Qbe,Tk,nU,SKbCE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GNJN","GD","Ge")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ge],[GD],[GD,Ge],[GNJN],[GNJN,Ge],[GNJN,GD],[GNJN,GD,Ge]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rwzJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rwzJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YWTo","Htxn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Htxn],[YWTo],[YWTo,Htxn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "j","PuRiM","cTVh","XWUZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XWUZ],[cTVh],[cTVh,XWUZ],[PuRiM],[PuRiM,XWUZ],[PuRiM,cTVh],[PuRiM,cTVh,XWUZ],[j],[j,XWUZ],[j,cTVh],[j,cTVh,XWUZ],[j,PuRiM],[j,PuRiM,XWUZ],[j,PuRiM,cTVh],[j,PuRiM,cTVh,XWUZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ljpN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ljpN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YM","bW","UGaa","RzLVm","tCi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tCi],[RzLVm],[RzLVm,tCi],[UGaa],[UGaa,tCi],[UGaa,RzLVm],[UGaa,RzLVm,tCi],[bW],[bW,tCi],[bW,RzLVm],[bW,RzLVm,tCi],[bW,UGaa],[bW,UGaa,tCi],[bW,UGaa,RzLVm],[bW,UGaa,RzLVm,tCi],[YM],[YM,tCi],[YM,RzLVm],[YM,RzLVm,tCi],[YM,UGaa],[YM,UGaa,tCi],[YM,UGaa,RzLVm],[YM,UGaa,RzLVm,tCi],[YM,bW],[YM,bW,tCi],[YM,bW,RzLVm],[YM,bW,RzLVm,tCi],[YM,bW,UGaa],[YM,bW,UGaa,tCi],[YM,bW,UGaa,RzLVm],[YM,bW,UGaa,RzLVm,tCi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gMx","dpP","loW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[loW],[dpP],[dpP,loW],[gMx],[gMx,loW],[gMx,dpP],[gMx,dpP,loW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lIP","wTJ","IU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IU],[wTJ],[wTJ,IU],[lIP],[lIP,IU],[lIP,wTJ],[lIP,wTJ,IU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Eq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Eq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zATG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zATG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "X","DPE","GseW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GseW],[DPE],[DPE,GseW],[X],[X,GseW],[X,DPE],[X,DPE,GseW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "td","DPAg","aOFX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aOFX],[DPAg],[DPAg,aOFX],[td],[td,aOFX],[td,DPAg],[td,DPAg,aOFX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ex","jco","uO","TTeP","uR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uR],[TTeP],[TTeP,uR],[uO],[uO,uR],[uO,TTeP],[uO,TTeP,uR],[jco],[jco,uR],[jco,TTeP],[jco,TTeP,uR],[jco,uO],[jco,uO,uR],[jco,uO,TTeP],[jco,uO,TTeP,uR],[ex],[ex,uR],[ex,TTeP],[ex,TTeP,uR],[ex,uO],[ex,uO,uR],[ex,uO,TTeP],[ex,uO,TTeP,uR],[ex,jco],[ex,jco,uR],[ex,jco,TTeP],[ex,jco,TTeP,uR],[ex,jco,uO],[ex,jco,uO,uR],[ex,jco,uO,TTeP],[ex,jco,uO,TTeP,uR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bgqz","tkMM","gcSXA","rXlqg","zpDbJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zpDbJ],[rXlqg],[rXlqg,zpDbJ],[gcSXA],[gcSXA,zpDbJ],[gcSXA,rXlqg],[gcSXA,rXlqg,zpDbJ],[tkMM],[tkMM,zpDbJ],[tkMM,rXlqg],[tkMM,rXlqg,zpDbJ],[tkMM,gcSXA],[tkMM,gcSXA,zpDbJ],[tkMM,gcSXA,rXlqg],[tkMM,gcSXA,rXlqg,zpDbJ],[Bgqz],[Bgqz,zpDbJ],[Bgqz,rXlqg],[Bgqz,rXlqg,zpDbJ],[Bgqz,gcSXA],[Bgqz,gcSXA,zpDbJ],[Bgqz,gcSXA,rXlqg],[Bgqz,gcSXA,rXlqg,zpDbJ],[Bgqz,tkMM],[Bgqz,tkMM,zpDbJ],[Bgqz,tkMM,rXlqg],[Bgqz,tkMM,rXlqg,zpDbJ],[Bgqz,tkMM,gcSXA],[Bgqz,tkMM,gcSXA,zpDbJ],[Bgqz,tkMM,gcSXA,rXlqg],[Bgqz,tkMM,gcSXA,rXlqg,zpDbJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WX","U","K","dSSff","NnpK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NnpK],[dSSff],[dSSff,NnpK],[K],[K,NnpK],[K,dSSff],[K,dSSff,NnpK],[U],[U,NnpK],[U,dSSff],[U,dSSff,NnpK],[U,K],[U,K,NnpK],[U,K,dSSff],[U,K,dSSff,NnpK],[WX],[WX,NnpK],[WX,dSSff],[WX,dSSff,NnpK],[WX,K],[WX,K,NnpK],[WX,K,dSSff],[WX,K,dSSff,NnpK],[WX,U],[WX,U,NnpK],[WX,U,dSSff],[WX,U,dSSff,NnpK],[WX,U,K],[WX,U,K,NnpK],[WX,U,K,dSSff],[WX,U,K,dSSff,NnpK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XyF","bVK","zEH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zEH],[bVK],[bVK,zEH],[XyF],[XyF,zEH],[XyF,bVK],[XyF,bVK,zEH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kREN","YSphn","df","YM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YM],[df],[df,YM],[YSphn],[YSphn,YM],[YSphn,df],[YSphn,df,YM],[kREN],[kREN,YM],[kREN,df],[kREN,df,YM],[kREN,YSphn],[kREN,YSphn,YM],[kREN,YSphn,df],[kREN,YSphn,df,YM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZjFrB","gU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gU],[ZjFrB],[ZjFrB,gU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FIt","Xz","u","ggV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ggV],[u],[u,ggV],[Xz],[Xz,ggV],[Xz,u],[Xz,u,ggV],[FIt],[FIt,ggV],[FIt,u],[FIt,u,ggV],[FIt,Xz],[FIt,Xz,ggV],[FIt,Xz,u],[FIt,Xz,u,ggV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Y","RJLS","bFJM","xrV","IRHL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IRHL],[xrV],[xrV,IRHL],[bFJM],[bFJM,IRHL],[bFJM,xrV],[bFJM,xrV,IRHL],[RJLS],[RJLS,IRHL],[RJLS,xrV],[RJLS,xrV,IRHL],[RJLS,bFJM],[RJLS,bFJM,IRHL],[RJLS,bFJM,xrV],[RJLS,bFJM,xrV,IRHL],[Y],[Y,IRHL],[Y,xrV],[Y,xrV,IRHL],[Y,bFJM],[Y,bFJM,IRHL],[Y,bFJM,xrV],[Y,bFJM,xrV,IRHL],[Y,RJLS],[Y,RJLS,IRHL],[Y,RJLS,xrV],[Y,RJLS,xrV,IRHL],[Y,RJLS,bFJM],[Y,RJLS,bFJM,IRHL],[Y,RJLS,bFJM,xrV],[Y,RJLS,bFJM,xrV,IRHL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uRqv","SWq","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[SWq],[SWq,o],[uRqv],[uRqv,o],[uRqv,SWq],[uRqv,SWq,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VOFy","uACGj","ije")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ije],[uACGj],[uACGj,ije],[VOFy],[VOFy,ije],[VOFy,uACGj],[VOFy,uACGj,ije]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CoRh","CGohR","WBdne","hXYOQ","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[hXYOQ],[hXYOQ,N],[WBdne],[WBdne,N],[WBdne,hXYOQ],[WBdne,hXYOQ,N],[CGohR],[CGohR,N],[CGohR,hXYOQ],[CGohR,hXYOQ,N],[CGohR,WBdne],[CGohR,WBdne,N],[CGohR,WBdne,hXYOQ],[CGohR,WBdne,hXYOQ,N],[CoRh],[CoRh,N],[CoRh,hXYOQ],[CoRh,hXYOQ,N],[CoRh,WBdne],[CoRh,WBdne,N],[CoRh,WBdne,hXYOQ],[CoRh,WBdne,hXYOQ,N],[CoRh,CGohR],[CoRh,CGohR,N],[CoRh,CGohR,hXYOQ],[CoRh,CGohR,hXYOQ,N],[CoRh,CGohR,WBdne],[CoRh,CGohR,WBdne,N],[CoRh,CGohR,WBdne,hXYOQ],[CoRh,CGohR,WBdne,hXYOQ,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Hj","tUnY","UA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UA],[tUnY],[tUnY,UA],[Hj],[Hj,UA],[Hj,tUnY],[Hj,tUnY,UA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bd","iwGpB","JiyaS","RhGGa","Dm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Dm],[RhGGa],[RhGGa,Dm],[JiyaS],[JiyaS,Dm],[JiyaS,RhGGa],[JiyaS,RhGGa,Dm],[iwGpB],[iwGpB,Dm],[iwGpB,RhGGa],[iwGpB,RhGGa,Dm],[iwGpB,JiyaS],[iwGpB,JiyaS,Dm],[iwGpB,JiyaS,RhGGa],[iwGpB,JiyaS,RhGGa,Dm],[bd],[bd,Dm],[bd,RhGGa],[bd,RhGGa,Dm],[bd,JiyaS],[bd,JiyaS,Dm],[bd,JiyaS,RhGGa],[bd,JiyaS,RhGGa,Dm],[bd,iwGpB],[bd,iwGpB,Dm],[bd,iwGpB,RhGGa],[bd,iwGpB,RhGGa,Dm],[bd,iwGpB,JiyaS],[bd,iwGpB,JiyaS,Dm],[bd,iwGpB,JiyaS,RhGGa],[bd,iwGpB,JiyaS,RhGGa,Dm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NqAi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NqAi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nQy","lE","vwI","hEw","mUZBJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mUZBJ],[hEw],[hEw,mUZBJ],[vwI],[vwI,mUZBJ],[vwI,hEw],[vwI,hEw,mUZBJ],[lE],[lE,mUZBJ],[lE,hEw],[lE,hEw,mUZBJ],[lE,vwI],[lE,vwI,mUZBJ],[lE,vwI,hEw],[lE,vwI,hEw,mUZBJ],[nQy],[nQy,mUZBJ],[nQy,hEw],[nQy,hEw,mUZBJ],[nQy,vwI],[nQy,vwI,mUZBJ],[nQy,vwI,hEw],[nQy,vwI,hEw,mUZBJ],[nQy,lE],[nQy,lE,mUZBJ],[nQy,lE,hEw],[nQy,lE,hEw,mUZBJ],[nQy,lE,vwI],[nQy,lE,vwI,mUZBJ],[nQy,lE,vwI,hEw],[nQy,lE,vwI,hEw,mUZBJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hwvG","ARaHD","GWbSN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GWbSN],[ARaHD],[ARaHD,GWbSN],[hwvG],[hwvG,GWbSN],[hwvG,ARaHD],[hwvG,ARaHD,GWbSN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","Qhkt","AX","j","cMQj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cMQj],[j],[j,cMQj],[AX],[AX,cMQj],[AX,j],[AX,j,cMQj],[Qhkt],[Qhkt,cMQj],[Qhkt,j],[Qhkt,j,cMQj],[Qhkt,AX],[Qhkt,AX,cMQj],[Qhkt,AX,j],[Qhkt,AX,j,cMQj],[C],[C,cMQj],[C,j],[C,j,cMQj],[C,AX],[C,AX,cMQj],[C,AX,j],[C,AX,j,cMQj],[C,Qhkt],[C,Qhkt,cMQj],[C,Qhkt,j],[C,Qhkt,j,cMQj],[C,Qhkt,AX],[C,Qhkt,AX,cMQj],[C,Qhkt,AX,j],[C,Qhkt,AX,j,cMQj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MVZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MVZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","uIspB","y","JNJB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JNJB],[y],[y,JNJB],[uIspB],[uIspB,JNJB],[uIspB,y],[uIspB,y,JNJB],[R],[R,JNJB],[R,y],[R,y,JNJB],[R,uIspB],[R,uIspB,JNJB],[R,uIspB,y],[R,uIspB,y,JNJB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FkX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FkX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FO","jxKeh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jxKeh],[FO],[FO,jxKeh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","N","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[N],[N,n],[d],[d,n],[d,N],[d,N,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gmLR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gmLR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zZLX","BdEim","vP","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[vP],[vP,M],[BdEim],[BdEim,M],[BdEim,vP],[BdEim,vP,M],[zZLX],[zZLX,M],[zZLX,vP],[zZLX,vP,M],[zZLX,BdEim],[zZLX,BdEim,M],[zZLX,BdEim,vP],[zZLX,BdEim,vP,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XJ","kdMN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kdMN],[XJ],[XJ,kdMN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TTkB","s")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[s],[TTkB],[TTkB,s]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bQGW","jkMLs","U")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[U],[jkMLs],[jkMLs,U],[bQGW],[bQGW,U],[bQGW,jkMLs],[bQGW,jkMLs,U]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","GK","dhk","TA","TKHJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TKHJ],[TA],[TA,TKHJ],[dhk],[dhk,TKHJ],[dhk,TA],[dhk,TA,TKHJ],[GK],[GK,TKHJ],[GK,TA],[GK,TA,TKHJ],[GK,dhk],[GK,dhk,TKHJ],[GK,dhk,TA],[GK,dhk,TA,TKHJ],[r],[r,TKHJ],[r,TA],[r,TA,TKHJ],[r,dhk],[r,dhk,TKHJ],[r,dhk,TA],[r,dhk,TA,TKHJ],[r,GK],[r,GK,TKHJ],[r,GK,TA],[r,GK,TA,TKHJ],[r,GK,dhk],[r,GK,dhk,TKHJ],[r,GK,dhk,TA],[r,GK,dhk,TA,TKHJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WZt","Jto")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Jto],[WZt],[WZt,Jto]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gAqe","B","LEHep","GaQnf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GaQnf],[LEHep],[LEHep,GaQnf],[B],[B,GaQnf],[B,LEHep],[B,LEHep,GaQnf],[gAqe],[gAqe,GaQnf],[gAqe,LEHep],[gAqe,LEHep,GaQnf],[gAqe,B],[gAqe,B,GaQnf],[gAqe,B,LEHep],[gAqe,B,LEHep,GaQnf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Q]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OVhv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OVhv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RdS","zazS","he")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[he],[zazS],[zazS,he],[RdS],[RdS,he],[RdS,zazS],[RdS,zazS,he]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "di","fIHiI","xV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xV],[fIHiI],[fIHiI,xV],[di],[di,xV],[di,fIHiI],[di,fIHiI,xV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BR","UWe","BAKX","ex","JWhw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JWhw],[ex],[ex,JWhw],[BAKX],[BAKX,JWhw],[BAKX,ex],[BAKX,ex,JWhw],[UWe],[UWe,JWhw],[UWe,ex],[UWe,ex,JWhw],[UWe,BAKX],[UWe,BAKX,JWhw],[UWe,BAKX,ex],[UWe,BAKX,ex,JWhw],[BR],[BR,JWhw],[BR,ex],[BR,ex,JWhw],[BR,BAKX],[BR,BAKX,JWhw],[BR,BAKX,ex],[BR,BAKX,ex,JWhw],[BR,UWe],[BR,UWe,JWhw],[BR,UWe,ex],[BR,UWe,ex,JWhw],[BR,UWe,BAKX],[BR,UWe,BAKX,JWhw],[BR,UWe,BAKX,ex],[BR,UWe,BAKX,ex,JWhw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mRo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mRo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x","J","CbN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CbN],[J],[J,CbN],[x],[x,CbN],[x,J],[x,J,CbN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","VH","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[VH],[VH,K],[q],[q,K],[q,VH],[q,VH,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QLL","YGNpQ","KQ","pSaf","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[pSaf],[pSaf,N],[KQ],[KQ,N],[KQ,pSaf],[KQ,pSaf,N],[YGNpQ],[YGNpQ,N],[YGNpQ,pSaf],[YGNpQ,pSaf,N],[YGNpQ,KQ],[YGNpQ,KQ,N],[YGNpQ,KQ,pSaf],[YGNpQ,KQ,pSaf,N],[QLL],[QLL,N],[QLL,pSaf],[QLL,pSaf,N],[QLL,KQ],[QLL,KQ,N],[QLL,KQ,pSaf],[QLL,KQ,pSaf,N],[QLL,YGNpQ],[QLL,YGNpQ,N],[QLL,YGNpQ,pSaf],[QLL,YGNpQ,pSaf,N],[QLL,YGNpQ,KQ],[QLL,YGNpQ,KQ,N],[QLL,YGNpQ,KQ,pSaf],[QLL,YGNpQ,KQ,pSaf,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EjL","fRrn","DUY","aAHKo","kaP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kaP],[aAHKo],[aAHKo,kaP],[DUY],[DUY,kaP],[DUY,aAHKo],[DUY,aAHKo,kaP],[fRrn],[fRrn,kaP],[fRrn,aAHKo],[fRrn,aAHKo,kaP],[fRrn,DUY],[fRrn,DUY,kaP],[fRrn,DUY,aAHKo],[fRrn,DUY,aAHKo,kaP],[EjL],[EjL,kaP],[EjL,aAHKo],[EjL,aAHKo,kaP],[EjL,DUY],[EjL,DUY,kaP],[EjL,DUY,aAHKo],[EjL,DUY,aAHKo,kaP],[EjL,fRrn],[EjL,fRrn,kaP],[EjL,fRrn,aAHKo],[EjL,fRrn,aAHKo,kaP],[EjL,fRrn,DUY],[EjL,fRrn,DUY,kaP],[EjL,fRrn,DUY,aAHKo],[EjL,fRrn,DUY,aAHKo,kaP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tkJbh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tkJbh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nuSb","JtsO","u","tQCDM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tQCDM],[u],[u,tQCDM],[JtsO],[JtsO,tQCDM],[JtsO,u],[JtsO,u,tQCDM],[nuSb],[nuSb,tQCDM],[nuSb,u],[nuSb,u,tQCDM],[nuSb,JtsO],[nuSb,JtsO,tQCDM],[nuSb,JtsO,u],[nuSb,JtsO,u,tQCDM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dE","QIj","goUE","yg","KI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KI],[yg],[yg,KI],[goUE],[goUE,KI],[goUE,yg],[goUE,yg,KI],[QIj],[QIj,KI],[QIj,yg],[QIj,yg,KI],[QIj,goUE],[QIj,goUE,KI],[QIj,goUE,yg],[QIj,goUE,yg,KI],[dE],[dE,KI],[dE,yg],[dE,yg,KI],[dE,goUE],[dE,goUE,KI],[dE,goUE,yg],[dE,goUE,yg,KI],[dE,QIj],[dE,QIj,KI],[dE,QIj,yg],[dE,QIj,yg,KI],[dE,QIj,goUE],[dE,QIj,goUE,KI],[dE,QIj,goUE,yg],[dE,QIj,goUE,yg,KI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kwLAn","gA","vjLE","UP","uWJOl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uWJOl],[UP],[UP,uWJOl],[vjLE],[vjLE,uWJOl],[vjLE,UP],[vjLE,UP,uWJOl],[gA],[gA,uWJOl],[gA,UP],[gA,UP,uWJOl],[gA,vjLE],[gA,vjLE,uWJOl],[gA,vjLE,UP],[gA,vjLE,UP,uWJOl],[kwLAn],[kwLAn,uWJOl],[kwLAn,UP],[kwLAn,UP,uWJOl],[kwLAn,vjLE],[kwLAn,vjLE,uWJOl],[kwLAn,vjLE,UP],[kwLAn,vjLE,UP,uWJOl],[kwLAn,gA],[kwLAn,gA,uWJOl],[kwLAn,gA,UP],[kwLAn,gA,UP,uWJOl],[kwLAn,gA,vjLE],[kwLAn,gA,vjLE,uWJOl],[kwLAn,gA,vjLE,UP],[kwLAn,gA,vjLE,UP,uWJOl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vXEAa","d","EEF","JCALC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JCALC],[EEF],[EEF,JCALC],[d],[d,JCALC],[d,EEF],[d,EEF,JCALC],[vXEAa],[vXEAa,JCALC],[vXEAa,EEF],[vXEAa,EEF,JCALC],[vXEAa,d],[vXEAa,d,JCALC],[vXEAa,d,EEF],[vXEAa,d,EEF,JCALC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dvI","mfT","qm","GV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GV],[qm],[qm,GV],[mfT],[mfT,GV],[mfT,qm],[mfT,qm,GV],[dvI],[dvI,GV],[dvI,qm],[dvI,qm,GV],[dvI,mfT],[dvI,mfT,GV],[dvI,mfT,qm],[dvI,mfT,qm,GV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nkQgq","xMFeb","qd","FQY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FQY],[qd],[qd,FQY],[xMFeb],[xMFeb,FQY],[xMFeb,qd],[xMFeb,qd,FQY],[nkQgq],[nkQgq,FQY],[nkQgq,qd],[nkQgq,qd,FQY],[nkQgq,xMFeb],[nkQgq,xMFeb,FQY],[nkQgq,xMFeb,qd],[nkQgq,xMFeb,qd,FQY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UE","jMEl","xhnT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xhnT],[jMEl],[jMEl,xhnT],[UE],[UE,xhnT],[UE,jMEl],[UE,jMEl,xhnT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uBP","IPPd","L","AiD","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[AiD],[AiD,o],[L],[L,o],[L,AiD],[L,AiD,o],[IPPd],[IPPd,o],[IPPd,AiD],[IPPd,AiD,o],[IPPd,L],[IPPd,L,o],[IPPd,L,AiD],[IPPd,L,AiD,o],[uBP],[uBP,o],[uBP,AiD],[uBP,AiD,o],[uBP,L],[uBP,L,o],[uBP,L,AiD],[uBP,L,AiD,o],[uBP,IPPd],[uBP,IPPd,o],[uBP,IPPd,AiD],[uBP,IPPd,AiD,o],[uBP,IPPd,L],[uBP,IPPd,L,o],[uBP,IPPd,L,AiD],[uBP,IPPd,L,AiD,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tF","JABh","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[JABh],[JABh,o],[tF],[tF,o],[tF,JABh],[tF,JABh,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","cCBa","zRl","PX","oLLgi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oLLgi],[PX],[PX,oLLgi],[zRl],[zRl,oLLgi],[zRl,PX],[zRl,PX,oLLgi],[cCBa],[cCBa,oLLgi],[cCBa,PX],[cCBa,PX,oLLgi],[cCBa,zRl],[cCBa,zRl,oLLgi],[cCBa,zRl,PX],[cCBa,zRl,PX,oLLgi],[A],[A,oLLgi],[A,PX],[A,PX,oLLgi],[A,zRl],[A,zRl,oLLgi],[A,zRl,PX],[A,zRl,PX,oLLgi],[A,cCBa],[A,cCBa,oLLgi],[A,cCBa,PX],[A,cCBa,PX,oLLgi],[A,cCBa,zRl],[A,cCBa,zRl,oLLgi],[A,cCBa,zRl,PX],[A,cCBa,zRl,PX,oLLgi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","Ev","LaL","ZRQu","rrRKl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rrRKl],[ZRQu],[ZRQu,rrRKl],[LaL],[LaL,rrRKl],[LaL,ZRQu],[LaL,ZRQu,rrRKl],[Ev],[Ev,rrRKl],[Ev,ZRQu],[Ev,ZRQu,rrRKl],[Ev,LaL],[Ev,LaL,rrRKl],[Ev,LaL,ZRQu],[Ev,LaL,ZRQu,rrRKl],[p],[p,rrRKl],[p,ZRQu],[p,ZRQu,rrRKl],[p,LaL],[p,LaL,rrRKl],[p,LaL,ZRQu],[p,LaL,ZRQu,rrRKl],[p,Ev],[p,Ev,rrRKl],[p,Ev,ZRQu],[p,Ev,ZRQu,rrRKl],[p,Ev,LaL],[p,Ev,LaL,rrRKl],[p,Ev,LaL,ZRQu],[p,Ev,LaL,ZRQu,rrRKl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sNQQH","HjuVR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HjuVR],[sNQQH],[sNQQH,HjuVR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nfI","EqVyQ","d","Nszqu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Nszqu],[d],[d,Nszqu],[EqVyQ],[EqVyQ,Nszqu],[EqVyQ,d],[EqVyQ,d,Nszqu],[nfI],[nfI,Nszqu],[nfI,d],[nfI,d,Nszqu],[nfI,EqVyQ],[nfI,EqVyQ,Nszqu],[nfI,EqVyQ,d],[nfI,EqVyQ,d,Nszqu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mm","f","asUOg","sRdG","ExqXS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ExqXS],[sRdG],[sRdG,ExqXS],[asUOg],[asUOg,ExqXS],[asUOg,sRdG],[asUOg,sRdG,ExqXS],[f],[f,ExqXS],[f,sRdG],[f,sRdG,ExqXS],[f,asUOg],[f,asUOg,ExqXS],[f,asUOg,sRdG],[f,asUOg,sRdG,ExqXS],[Mm],[Mm,ExqXS],[Mm,sRdG],[Mm,sRdG,ExqXS],[Mm,asUOg],[Mm,asUOg,ExqXS],[Mm,asUOg,sRdG],[Mm,asUOg,sRdG,ExqXS],[Mm,f],[Mm,f,ExqXS],[Mm,f,sRdG],[Mm,f,sRdG,ExqXS],[Mm,f,asUOg],[Mm,f,asUOg,ExqXS],[Mm,f,asUOg,sRdG],[Mm,f,asUOg,sRdG,ExqXS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jsk","EGYCU","OD","f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f],[OD],[OD,f],[EGYCU],[EGYCU,f],[EGYCU,OD],[EGYCU,OD,f],[jsk],[jsk,f],[jsk,OD],[jsk,OD,f],[jsk,EGYCU],[jsk,EGYCU,f],[jsk,EGYCU,OD],[jsk,EGYCU,OD,f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pe","ZJswC","TuXns","elT","Nl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Nl],[elT],[elT,Nl],[TuXns],[TuXns,Nl],[TuXns,elT],[TuXns,elT,Nl],[ZJswC],[ZJswC,Nl],[ZJswC,elT],[ZJswC,elT,Nl],[ZJswC,TuXns],[ZJswC,TuXns,Nl],[ZJswC,TuXns,elT],[ZJswC,TuXns,elT,Nl],[pe],[pe,Nl],[pe,elT],[pe,elT,Nl],[pe,TuXns],[pe,TuXns,Nl],[pe,TuXns,elT],[pe,TuXns,elT,Nl],[pe,ZJswC],[pe,ZJswC,Nl],[pe,ZJswC,elT],[pe,ZJswC,elT,Nl],[pe,ZJswC,TuXns],[pe,ZJswC,TuXns,Nl],[pe,ZJswC,TuXns,elT],[pe,ZJswC,TuXns,elT,Nl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uv","AU","uQyjP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uQyjP],[AU],[AU,uQyjP],[uv],[uv,uQyjP],[uv,AU],[uv,AU,uQyjP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XH","v","LIX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LIX],[v],[v,LIX],[XH],[XH,LIX],[XH,v],[XH,v,LIX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "S","s")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[s],[S],[S,s]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","BRy","ycB","iWahO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iWahO],[ycB],[ycB,iWahO],[BRy],[BRy,iWahO],[BRy,ycB],[BRy,ycB,iWahO],[p],[p,iWahO],[p,ycB],[p,ycB,iWahO],[p,BRy],[p,BRy,iWahO],[p,BRy,ycB],[p,BRy,ycB,iWahO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yAnh","ZuU","wBUF","BfTD","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[BfTD],[BfTD,n],[wBUF],[wBUF,n],[wBUF,BfTD],[wBUF,BfTD,n],[ZuU],[ZuU,n],[ZuU,BfTD],[ZuU,BfTD,n],[ZuU,wBUF],[ZuU,wBUF,n],[ZuU,wBUF,BfTD],[ZuU,wBUF,BfTD,n],[yAnh],[yAnh,n],[yAnh,BfTD],[yAnh,BfTD,n],[yAnh,wBUF],[yAnh,wBUF,n],[yAnh,wBUF,BfTD],[yAnh,wBUF,BfTD,n],[yAnh,ZuU],[yAnh,ZuU,n],[yAnh,ZuU,BfTD],[yAnh,ZuU,BfTD,n],[yAnh,ZuU,wBUF],[yAnh,ZuU,wBUF,n],[yAnh,ZuU,wBUF,BfTD],[yAnh,ZuU,wBUF,BfTD,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","BKcv","kSpbQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kSpbQ],[BKcv],[BKcv,kSpbQ],[B],[B,kSpbQ],[B,BKcv],[B,BKcv,kSpbQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","b","GQeX","mrehs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mrehs],[GQeX],[GQeX,mrehs],[b],[b,mrehs],[b,GQeX],[b,GQeX,mrehs],[P],[P,mrehs],[P,GQeX],[P,GQeX,mrehs],[P,b],[P,b,mrehs],[P,b,GQeX],[P,b,GQeX,mrehs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","eyIS","B","gPzZ","JaFkL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JaFkL],[gPzZ],[gPzZ,JaFkL],[B],[B,JaFkL],[B,gPzZ],[B,gPzZ,JaFkL],[eyIS],[eyIS,JaFkL],[eyIS,gPzZ],[eyIS,gPzZ,JaFkL],[eyIS,B],[eyIS,B,JaFkL],[eyIS,B,gPzZ],[eyIS,B,gPzZ,JaFkL],[P],[P,JaFkL],[P,gPzZ],[P,gPzZ,JaFkL],[P,B],[P,B,JaFkL],[P,B,gPzZ],[P,B,gPzZ,JaFkL],[P,eyIS],[P,eyIS,JaFkL],[P,eyIS,gPzZ],[P,eyIS,gPzZ,JaFkL],[P,eyIS,B],[P,eyIS,B,JaFkL],[P,eyIS,B,gPzZ],[P,eyIS,B,gPzZ,JaFkL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QGK","mJX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mJX],[QGK],[QGK,mJX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gaykD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gaykD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "I")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[I]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QbB","ssaB","rM","Xd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xd],[rM],[rM,Xd],[ssaB],[ssaB,Xd],[ssaB,rM],[ssaB,rM,Xd],[QbB],[QbB,Xd],[QbB,rM],[QbB,rM,Xd],[QbB,ssaB],[QbB,ssaB,Xd],[QbB,ssaB,rM],[QbB,ssaB,rM,Xd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qomzQ","Wa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wa],[qomzQ],[qomzQ,Wa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dE","pBR","t","FTLkH","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[FTLkH],[FTLkH,M],[t],[t,M],[t,FTLkH],[t,FTLkH,M],[pBR],[pBR,M],[pBR,FTLkH],[pBR,FTLkH,M],[pBR,t],[pBR,t,M],[pBR,t,FTLkH],[pBR,t,FTLkH,M],[dE],[dE,M],[dE,FTLkH],[dE,FTLkH,M],[dE,t],[dE,t,M],[dE,t,FTLkH],[dE,t,FTLkH,M],[dE,pBR],[dE,pBR,M],[dE,pBR,FTLkH],[dE,pBR,FTLkH,M],[dE,pBR,t],[dE,pBR,t,M],[dE,pBR,t,FTLkH],[dE,pBR,t,FTLkH,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FuDe","GaO","BScWr","jzj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jzj],[BScWr],[BScWr,jzj],[GaO],[GaO,jzj],[GaO,BScWr],[GaO,BScWr,jzj],[FuDe],[FuDe,jzj],[FuDe,BScWr],[FuDe,BScWr,jzj],[FuDe,GaO],[FuDe,GaO,jzj],[FuDe,GaO,BScWr],[FuDe,GaO,BScWr,jzj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XHeB","Fwdah","OmBs","THTz","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[THTz],[THTz,n],[OmBs],[OmBs,n],[OmBs,THTz],[OmBs,THTz,n],[Fwdah],[Fwdah,n],[Fwdah,THTz],[Fwdah,THTz,n],[Fwdah,OmBs],[Fwdah,OmBs,n],[Fwdah,OmBs,THTz],[Fwdah,OmBs,THTz,n],[XHeB],[XHeB,n],[XHeB,THTz],[XHeB,THTz,n],[XHeB,OmBs],[XHeB,OmBs,n],[XHeB,OmBs,THTz],[XHeB,OmBs,THTz,n],[XHeB,Fwdah],[XHeB,Fwdah,n],[XHeB,Fwdah,THTz],[XHeB,Fwdah,THTz,n],[XHeB,Fwdah,OmBs],[XHeB,Fwdah,OmBs,n],[XHeB,Fwdah,OmBs,THTz],[XHeB,Fwdah,OmBs,THTz,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bw","QZXeL","wEXg","iWRQ","ReGM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ReGM],[iWRQ],[iWRQ,ReGM],[wEXg],[wEXg,ReGM],[wEXg,iWRQ],[wEXg,iWRQ,ReGM],[QZXeL],[QZXeL,ReGM],[QZXeL,iWRQ],[QZXeL,iWRQ,ReGM],[QZXeL,wEXg],[QZXeL,wEXg,ReGM],[QZXeL,wEXg,iWRQ],[QZXeL,wEXg,iWRQ,ReGM],[Bw],[Bw,ReGM],[Bw,iWRQ],[Bw,iWRQ,ReGM],[Bw,wEXg],[Bw,wEXg,ReGM],[Bw,wEXg,iWRQ],[Bw,wEXg,iWRQ,ReGM],[Bw,QZXeL],[Bw,QZXeL,ReGM],[Bw,QZXeL,iWRQ],[Bw,QZXeL,iWRQ,ReGM],[Bw,QZXeL,wEXg],[Bw,QZXeL,wEXg,ReGM],[Bw,QZXeL,wEXg,iWRQ],[Bw,QZXeL,wEXg,iWRQ,ReGM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YPX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YPX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YSk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YSk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","Be","QmKsP","E","hTDP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hTDP],[E],[E,hTDP],[QmKsP],[QmKsP,hTDP],[QmKsP,E],[QmKsP,E,hTDP],[Be],[Be,hTDP],[Be,E],[Be,E,hTDP],[Be,QmKsP],[Be,QmKsP,hTDP],[Be,QmKsP,E],[Be,QmKsP,E,hTDP],[P],[P,hTDP],[P,E],[P,E,hTDP],[P,QmKsP],[P,QmKsP,hTDP],[P,QmKsP,E],[P,QmKsP,E,hTDP],[P,Be],[P,Be,hTDP],[P,Be,E],[P,Be,E,hTDP],[P,Be,QmKsP],[P,Be,QmKsP,hTDP],[P,Be,QmKsP,E],[P,Be,QmKsP,E,hTDP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","WKk","L","ZX","DJDCT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DJDCT],[ZX],[ZX,DJDCT],[L],[L,DJDCT],[L,ZX],[L,ZX,DJDCT],[WKk],[WKk,DJDCT],[WKk,ZX],[WKk,ZX,DJDCT],[WKk,L],[WKk,L,DJDCT],[WKk,L,ZX],[WKk,L,ZX,DJDCT],[t],[t,DJDCT],[t,ZX],[t,ZX,DJDCT],[t,L],[t,L,DJDCT],[t,L,ZX],[t,L,ZX,DJDCT],[t,WKk],[t,WKk,DJDCT],[t,WKk,ZX],[t,WKk,ZX,DJDCT],[t,WKk,L],[t,WKk,L,DJDCT],[t,WKk,L,ZX],[t,WKk,L,ZX,DJDCT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tBsID","wXg","fN","Y","JoXq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JoXq],[Y],[Y,JoXq],[fN],[fN,JoXq],[fN,Y],[fN,Y,JoXq],[wXg],[wXg,JoXq],[wXg,Y],[wXg,Y,JoXq],[wXg,fN],[wXg,fN,JoXq],[wXg,fN,Y],[wXg,fN,Y,JoXq],[tBsID],[tBsID,JoXq],[tBsID,Y],[tBsID,Y,JoXq],[tBsID,fN],[tBsID,fN,JoXq],[tBsID,fN,Y],[tBsID,fN,Y,JoXq],[tBsID,wXg],[tBsID,wXg,JoXq],[tBsID,wXg,Y],[tBsID,wXg,Y,JoXq],[tBsID,wXg,fN],[tBsID,wXg,fN,JoXq],[tBsID,wXg,fN,Y],[tBsID,wXg,fN,Y,JoXq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[E]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Grpf","IvTyS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IvTyS],[Grpf],[Grpf,IvTyS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gKD","dYby","dG","V","MiGe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MiGe],[V],[V,MiGe],[dG],[dG,MiGe],[dG,V],[dG,V,MiGe],[dYby],[dYby,MiGe],[dYby,V],[dYby,V,MiGe],[dYby,dG],[dYby,dG,MiGe],[dYby,dG,V],[dYby,dG,V,MiGe],[gKD],[gKD,MiGe],[gKD,V],[gKD,V,MiGe],[gKD,dG],[gKD,dG,MiGe],[gKD,dG,V],[gKD,dG,V,MiGe],[gKD,dYby],[gKD,dYby,MiGe],[gKD,dYby,V],[gKD,dYby,V,MiGe],[gKD,dYby,dG],[gKD,dYby,dG,MiGe],[gKD,dYby,dG,V],[gKD,dYby,dG,V,MiGe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","X","DC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DC],[X],[X,DC],[V],[V,DC],[V,X],[V,X,DC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dWAJD","uW","Wm","OXmJp","npWN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[npWN],[OXmJp],[OXmJp,npWN],[Wm],[Wm,npWN],[Wm,OXmJp],[Wm,OXmJp,npWN],[uW],[uW,npWN],[uW,OXmJp],[uW,OXmJp,npWN],[uW,Wm],[uW,Wm,npWN],[uW,Wm,OXmJp],[uW,Wm,OXmJp,npWN],[dWAJD],[dWAJD,npWN],[dWAJD,OXmJp],[dWAJD,OXmJp,npWN],[dWAJD,Wm],[dWAJD,Wm,npWN],[dWAJD,Wm,OXmJp],[dWAJD,Wm,OXmJp,npWN],[dWAJD,uW],[dWAJD,uW,npWN],[dWAJD,uW,OXmJp],[dWAJD,uW,OXmJp,npWN],[dWAJD,uW,Wm],[dWAJD,uW,Wm,npWN],[dWAJD,uW,Wm,OXmJp],[dWAJD,uW,Wm,OXmJp,npWN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","rSa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rSa],[q],[q,rSa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XwdE","REowt","Kj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Kj],[REowt],[REowt,Kj],[XwdE],[XwdE,Kj],[XwdE,REowt],[XwdE,REowt,Kj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","GXnc","Mi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mi],[GXnc],[GXnc,Mi],[V],[V,Mi],[V,GXnc],[V,GXnc,Mi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IuE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IuE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","vL","Lw","Cq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Cq],[Lw],[Lw,Cq],[vL],[vL,Cq],[vL,Lw],[vL,Lw,Cq],[b],[b,Cq],[b,Lw],[b,Lw,Cq],[b,vL],[b,vL,Cq],[b,vL,Lw],[b,vL,Lw,Cq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iLJdG","LTIQ","hSGX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hSGX],[LTIQ],[LTIQ,hSGX],[iLJdG],[iLJdG,hSGX],[iLJdG,LTIQ],[iLJdG,LTIQ,hSGX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VWuL","bNO","IsO","nBh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nBh],[IsO],[IsO,nBh],[bNO],[bNO,nBh],[bNO,IsO],[bNO,IsO,nBh],[VWuL],[VWuL,nBh],[VWuL,IsO],[VWuL,IsO,nBh],[VWuL,bNO],[VWuL,bNO,nBh],[VWuL,bNO,IsO],[VWuL,bNO,IsO,nBh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RmFq","a","TjmsA","w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w],[TjmsA],[TjmsA,w],[a],[a,w],[a,TjmsA],[a,TjmsA,w],[RmFq],[RmFq,w],[RmFq,TjmsA],[RmFq,TjmsA,w],[RmFq,a],[RmFq,a,w],[RmFq,a,TjmsA],[RmFq,a,TjmsA,w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BWmv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BWmv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IVepT","AWzVj","aIsF","WdG","YcI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YcI],[WdG],[WdG,YcI],[aIsF],[aIsF,YcI],[aIsF,WdG],[aIsF,WdG,YcI],[AWzVj],[AWzVj,YcI],[AWzVj,WdG],[AWzVj,WdG,YcI],[AWzVj,aIsF],[AWzVj,aIsF,YcI],[AWzVj,aIsF,WdG],[AWzVj,aIsF,WdG,YcI],[IVepT],[IVepT,YcI],[IVepT,WdG],[IVepT,WdG,YcI],[IVepT,aIsF],[IVepT,aIsF,YcI],[IVepT,aIsF,WdG],[IVepT,aIsF,WdG,YcI],[IVepT,AWzVj],[IVepT,AWzVj,YcI],[IVepT,AWzVj,WdG],[IVepT,AWzVj,WdG,YcI],[IVepT,AWzVj,aIsF],[IVepT,AWzVj,aIsF,YcI],[IVepT,AWzVj,aIsF,WdG],[IVepT,AWzVj,aIsF,WdG,YcI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IN","ekHI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ekHI],[IN],[IN,ekHI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BXwN","ZM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZM],[BXwN],[BXwN,ZM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WGG","wA","wEHv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wEHv],[wA],[wA,wEHv],[WGG],[WGG,wEHv],[WGG,wA],[WGG,wA,wEHv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XeanA","PQ","libq","CJic")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CJic],[libq],[libq,CJic],[PQ],[PQ,CJic],[PQ,libq],[PQ,libq,CJic],[XeanA],[XeanA,CJic],[XeanA,libq],[XeanA,libq,CJic],[XeanA,PQ],[XeanA,PQ,CJic],[XeanA,PQ,libq],[XeanA,PQ,libq,CJic]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UFBSX","i","ctL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ctL],[i],[i,ctL],[UFBSX],[UFBSX,ctL],[UFBSX,i],[UFBSX,i,ctL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ibGc","jRRZH","QXYJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QXYJ],[jRRZH],[jRRZH,QXYJ],[ibGc],[ibGc,QXYJ],[ibGc,jRRZH],[ibGc,jRRZH,QXYJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f","MQs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MQs],[f],[f,MQs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "T")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[T]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zmc","ObXkT","Faw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Faw],[ObXkT],[ObXkT,Faw],[Zmc],[Zmc,Faw],[Zmc,ObXkT],[Zmc,ObXkT,Faw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kou","df","Vk","x","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[x],[x,Z],[Vk],[Vk,Z],[Vk,x],[Vk,x,Z],[df],[df,Z],[df,x],[df,x,Z],[df,Vk],[df,Vk,Z],[df,Vk,x],[df,Vk,x,Z],[kou],[kou,Z],[kou,x],[kou,x,Z],[kou,Vk],[kou,Vk,Z],[kou,Vk,x],[kou,Vk,x,Z],[kou,df],[kou,df,Z],[kou,df,x],[kou,df,x,Z],[kou,df,Vk],[kou,df,Vk,Z],[kou,df,Vk,x],[kou,df,Vk,x,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NuEf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NuEf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xH","YI","e","bVqT","Egl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Egl],[bVqT],[bVqT,Egl],[e],[e,Egl],[e,bVqT],[e,bVqT,Egl],[YI],[YI,Egl],[YI,bVqT],[YI,bVqT,Egl],[YI,e],[YI,e,Egl],[YI,e,bVqT],[YI,e,bVqT,Egl],[xH],[xH,Egl],[xH,bVqT],[xH,bVqT,Egl],[xH,e],[xH,e,Egl],[xH,e,bVqT],[xH,e,bVqT,Egl],[xH,YI],[xH,YI,Egl],[xH,YI,bVqT],[xH,YI,bVqT,Egl],[xH,YI,e],[xH,YI,e,Egl],[xH,YI,e,bVqT],[xH,YI,e,bVqT,Egl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KXfy","QPjK","YxUV","FS","Rq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Rq],[FS],[FS,Rq],[YxUV],[YxUV,Rq],[YxUV,FS],[YxUV,FS,Rq],[QPjK],[QPjK,Rq],[QPjK,FS],[QPjK,FS,Rq],[QPjK,YxUV],[QPjK,YxUV,Rq],[QPjK,YxUV,FS],[QPjK,YxUV,FS,Rq],[KXfy],[KXfy,Rq],[KXfy,FS],[KXfy,FS,Rq],[KXfy,YxUV],[KXfy,YxUV,Rq],[KXfy,YxUV,FS],[KXfy,YxUV,FS,Rq],[KXfy,QPjK],[KXfy,QPjK,Rq],[KXfy,QPjK,FS],[KXfy,QPjK,FS,Rq],[KXfy,QPjK,YxUV],[KXfy,QPjK,YxUV,Rq],[KXfy,QPjK,YxUV,FS],[KXfy,QPjK,YxUV,FS,Rq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LhBg","HcqK","eHCs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eHCs],[HcqK],[HcqK,eHCs],[LhBg],[LhBg,eHCs],[LhBg,HcqK],[LhBg,HcqK,eHCs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jNw","qSk","qliBD","k","nbczL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nbczL],[k],[k,nbczL],[qliBD],[qliBD,nbczL],[qliBD,k],[qliBD,k,nbczL],[qSk],[qSk,nbczL],[qSk,k],[qSk,k,nbczL],[qSk,qliBD],[qSk,qliBD,nbczL],[qSk,qliBD,k],[qSk,qliBD,k,nbczL],[jNw],[jNw,nbczL],[jNw,k],[jNw,k,nbczL],[jNw,qliBD],[jNw,qliBD,nbczL],[jNw,qliBD,k],[jNw,qliBD,k,nbczL],[jNw,qSk],[jNw,qSk,nbczL],[jNw,qSk,k],[jNw,qSk,k,nbczL],[jNw,qSk,qliBD],[jNw,qSk,qliBD,nbczL],[jNw,qSk,qliBD,k],[jNw,qSk,qliBD,k,nbczL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YM","F","tul")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tul],[F],[F,tul],[YM],[YM,tul],[YM,F],[YM,F,tul]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zT","ZAIJT","zWYFh","UD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UD],[zWYFh],[zWYFh,UD],[ZAIJT],[ZAIJT,UD],[ZAIJT,zWYFh],[ZAIJT,zWYFh,UD],[zT],[zT,UD],[zT,zWYFh],[zT,zWYFh,UD],[zT,ZAIJT],[zT,ZAIJT,UD],[zT,ZAIJT,zWYFh],[zT,ZAIJT,zWYFh,UD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "noV","mC","tuDT","fp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fp],[tuDT],[tuDT,fp],[mC],[mC,fp],[mC,tuDT],[mC,tuDT,fp],[noV],[noV,fp],[noV,tuDT],[noV,tuDT,fp],[noV,mC],[noV,mC,fp],[noV,mC,tuDT],[noV,mC,tuDT,fp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PTms")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PTms]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oLR","ajkz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ajkz],[oLR],[oLR,ajkz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RVt","Bl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Bl],[RVt],[RVt,Bl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YL","fzrOC","qlo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qlo],[fzrOC],[fzrOC,qlo],[YL],[YL,qlo],[YL,fzrOC],[YL,fzrOC,qlo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Lbv","tMqn","ehAz","ZGV","wVfP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wVfP],[ZGV],[ZGV,wVfP],[ehAz],[ehAz,wVfP],[ehAz,ZGV],[ehAz,ZGV,wVfP],[tMqn],[tMqn,wVfP],[tMqn,ZGV],[tMqn,ZGV,wVfP],[tMqn,ehAz],[tMqn,ehAz,wVfP],[tMqn,ehAz,ZGV],[tMqn,ehAz,ZGV,wVfP],[Lbv],[Lbv,wVfP],[Lbv,ZGV],[Lbv,ZGV,wVfP],[Lbv,ehAz],[Lbv,ehAz,wVfP],[Lbv,ehAz,ZGV],[Lbv,ehAz,ZGV,wVfP],[Lbv,tMqn],[Lbv,tMqn,wVfP],[Lbv,tMqn,ZGV],[Lbv,tMqn,ZGV,wVfP],[Lbv,tMqn,ehAz],[Lbv,tMqn,ehAz,wVfP],[Lbv,tMqn,ehAz,ZGV],[Lbv,tMqn,ehAz,ZGV,wVfP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[a]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SFHfb","zRGP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zRGP],[SFHfb],[SFHfb,zRGP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LXl","g","udn","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[udn],[udn,o],[g],[g,o],[g,udn],[g,udn,o],[LXl],[LXl,o],[LXl,udn],[LXl,udn,o],[LXl,g],[LXl,g,o],[LXl,g,udn],[LXl,g,udn,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cyC","LKl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LKl],[cyC],[cyC,LKl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ivOJB","rBv","GjJd","eiKi","hIMjS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hIMjS],[eiKi],[eiKi,hIMjS],[GjJd],[GjJd,hIMjS],[GjJd,eiKi],[GjJd,eiKi,hIMjS],[rBv],[rBv,hIMjS],[rBv,eiKi],[rBv,eiKi,hIMjS],[rBv,GjJd],[rBv,GjJd,hIMjS],[rBv,GjJd,eiKi],[rBv,GjJd,eiKi,hIMjS],[ivOJB],[ivOJB,hIMjS],[ivOJB,eiKi],[ivOJB,eiKi,hIMjS],[ivOJB,GjJd],[ivOJB,GjJd,hIMjS],[ivOJB,GjJd,eiKi],[ivOJB,GjJd,eiKi,hIMjS],[ivOJB,rBv],[ivOJB,rBv,hIMjS],[ivOJB,rBv,eiKi],[ivOJB,rBv,eiKi,hIMjS],[ivOJB,rBv,GjJd],[ivOJB,rBv,GjJd,hIMjS],[ivOJB,rBv,GjJd,eiKi],[ivOJB,rBv,GjJd,eiKi,hIMjS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hwIs","vXFWb","Qk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Qk],[vXFWb],[vXFWb,Qk],[hwIs],[hwIs,Qk],[hwIs,vXFWb],[hwIs,vXFWb,Qk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","wYEXo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wYEXo],[a],[a,wYEXo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QHK","BaliD","w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w],[BaliD],[BaliD,w],[QHK],[QHK,w],[QHK,BaliD],[QHK,BaliD,w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AXjPn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AXjPn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EjaKE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EjaKE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YdQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YdQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GZ","avhm","wfE","QsK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QsK],[wfE],[wfE,QsK],[avhm],[avhm,QsK],[avhm,wfE],[avhm,wfE,QsK],[GZ],[GZ,QsK],[GZ,wfE],[GZ,wfE,QsK],[GZ,avhm],[GZ,avhm,QsK],[GZ,avhm,wfE],[GZ,avhm,wfE,QsK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JMy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JMy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bcopc","osAb","apXq","nG","mIeq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mIeq],[nG],[nG,mIeq],[apXq],[apXq,mIeq],[apXq,nG],[apXq,nG,mIeq],[osAb],[osAb,mIeq],[osAb,nG],[osAb,nG,mIeq],[osAb,apXq],[osAb,apXq,mIeq],[osAb,apXq,nG],[osAb,apXq,nG,mIeq],[Bcopc],[Bcopc,mIeq],[Bcopc,nG],[Bcopc,nG,mIeq],[Bcopc,apXq],[Bcopc,apXq,mIeq],[Bcopc,apXq,nG],[Bcopc,apXq,nG,mIeq],[Bcopc,osAb],[Bcopc,osAb,mIeq],[Bcopc,osAb,nG],[Bcopc,osAb,nG,mIeq],[Bcopc,osAb,apXq],[Bcopc,osAb,apXq,mIeq],[Bcopc,osAb,apXq,nG],[Bcopc,osAb,apXq,nG,mIeq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lTYC","aqd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aqd],[lTYC],[lTYC,aqd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","Mwmxf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mwmxf],[p],[p,Mwmxf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TF","ax","rAZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rAZ],[ax],[ax,rAZ],[TF],[TF,rAZ],[TF,ax],[TF,ax,rAZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QJwB","E","MQXU","WlLf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WlLf],[MQXU],[MQXU,WlLf],[E],[E,WlLf],[E,MQXU],[E,MQXU,WlLf],[QJwB],[QJwB,WlLf],[QJwB,MQXU],[QJwB,MQXU,WlLf],[QJwB,E],[QJwB,E,WlLf],[QJwB,E,MQXU],[QJwB,E,MQXU,WlLf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rjlk","KN","t","hRra","fGplM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fGplM],[hRra],[hRra,fGplM],[t],[t,fGplM],[t,hRra],[t,hRra,fGplM],[KN],[KN,fGplM],[KN,hRra],[KN,hRra,fGplM],[KN,t],[KN,t,fGplM],[KN,t,hRra],[KN,t,hRra,fGplM],[rjlk],[rjlk,fGplM],[rjlk,hRra],[rjlk,hRra,fGplM],[rjlk,t],[rjlk,t,fGplM],[rjlk,t,hRra],[rjlk,t,hRra,fGplM],[rjlk,KN],[rjlk,KN,fGplM],[rjlk,KN,hRra],[rjlk,KN,hRra,fGplM],[rjlk,KN,t],[rjlk,KN,t,fGplM],[rjlk,KN,t,hRra],[rjlk,KN,t,hRra,fGplM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XBuO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XBuO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dpyW","afCc","y","JOb","Ub")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ub],[JOb],[JOb,Ub],[y],[y,Ub],[y,JOb],[y,JOb,Ub],[afCc],[afCc,Ub],[afCc,JOb],[afCc,JOb,Ub],[afCc,y],[afCc,y,Ub],[afCc,y,JOb],[afCc,y,JOb,Ub],[dpyW],[dpyW,Ub],[dpyW,JOb],[dpyW,JOb,Ub],[dpyW,y],[dpyW,y,Ub],[dpyW,y,JOb],[dpyW,y,JOb,Ub],[dpyW,afCc],[dpyW,afCc,Ub],[dpyW,afCc,JOb],[dpyW,afCc,JOb,Ub],[dpyW,afCc,y],[dpyW,afCc,y,Ub],[dpyW,afCc,y,JOb],[dpyW,afCc,y,JOb,Ub]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XEcS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XEcS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kxTRf","a","Zhr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Zhr],[a],[a,Zhr],[kxTRf],[kxTRf,Zhr],[kxTRf,a],[kxTRf,a,Zhr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ctI","Qo","bZHR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bZHR],[Qo],[Qo,bZHR],[ctI],[ctI,bZHR],[ctI,Qo],[ctI,Qo,bZHR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "geg","qPjsO","zGJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zGJ],[qPjsO],[qPjsO,zGJ],[geg],[geg,zGJ],[geg,qPjsO],[geg,qPjsO,zGJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "K","hfQoa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hfQoa],[K],[K,hfQoa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ANtYz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ANtYz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","uE","p","Vte","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[Vte],[Vte,o],[p],[p,o],[p,Vte],[p,Vte,o],[uE],[uE,o],[uE,Vte],[uE,Vte,o],[uE,p],[uE,p,o],[uE,p,Vte],[uE,p,Vte,o],[P],[P,o],[P,Vte],[P,Vte,o],[P,p],[P,p,o],[P,p,Vte],[P,p,Vte,o],[P,uE],[P,uE,o],[P,uE,Vte],[P,uE,Vte,o],[P,uE,p],[P,uE,p,o],[P,uE,p,Vte],[P,uE,p,Vte,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EyNc","bpV","z","FE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FE],[z],[z,FE],[bpV],[bpV,FE],[bpV,z],[bpV,z,FE],[EyNc],[EyNc,FE],[EyNc,z],[EyNc,z,FE],[EyNc,bpV],[EyNc,bpV,FE],[EyNc,bpV,z],[EyNc,bpV,z,FE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QQdyd","EfZ","AL","Fb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Fb],[AL],[AL,Fb],[EfZ],[EfZ,Fb],[EfZ,AL],[EfZ,AL,Fb],[QQdyd],[QQdyd,Fb],[QQdyd,AL],[QQdyd,AL,Fb],[QQdyd,EfZ],[QQdyd,EfZ,Fb],[QQdyd,EfZ,AL],[QQdyd,EfZ,AL,Fb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZAY","CNVGK","yDrn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yDrn],[CNVGK],[CNVGK,yDrn],[ZAY],[ZAY,yDrn],[ZAY,CNVGK],[ZAY,CNVGK,yDrn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","DqmSx","g","eSv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eSv],[g],[g,eSv],[DqmSx],[DqmSx,eSv],[DqmSx,g],[DqmSx,g,eSv],[r],[r,eSv],[r,g],[r,g,eSv],[r,DqmSx],[r,DqmSx,eSv],[r,DqmSx,g],[r,DqmSx,g,eSv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "w","tSeRZ","RDJDU","n","IVEnI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IVEnI],[n],[n,IVEnI],[RDJDU],[RDJDU,IVEnI],[RDJDU,n],[RDJDU,n,IVEnI],[tSeRZ],[tSeRZ,IVEnI],[tSeRZ,n],[tSeRZ,n,IVEnI],[tSeRZ,RDJDU],[tSeRZ,RDJDU,IVEnI],[tSeRZ,RDJDU,n],[tSeRZ,RDJDU,n,IVEnI],[w],[w,IVEnI],[w,n],[w,n,IVEnI],[w,RDJDU],[w,RDJDU,IVEnI],[w,RDJDU,n],[w,RDJDU,n,IVEnI],[w,tSeRZ],[w,tSeRZ,IVEnI],[w,tSeRZ,n],[w,tSeRZ,n,IVEnI],[w,tSeRZ,RDJDU],[w,tSeRZ,RDJDU,IVEnI],[w,tSeRZ,RDJDU,n],[w,tSeRZ,RDJDU,n,IVEnI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "drpO","jUKOM","xjeYJ","Jjak","so")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[so],[Jjak],[Jjak,so],[xjeYJ],[xjeYJ,so],[xjeYJ,Jjak],[xjeYJ,Jjak,so],[jUKOM],[jUKOM,so],[jUKOM,Jjak],[jUKOM,Jjak,so],[jUKOM,xjeYJ],[jUKOM,xjeYJ,so],[jUKOM,xjeYJ,Jjak],[jUKOM,xjeYJ,Jjak,so],[drpO],[drpO,so],[drpO,Jjak],[drpO,Jjak,so],[drpO,xjeYJ],[drpO,xjeYJ,so],[drpO,xjeYJ,Jjak],[drpO,xjeYJ,Jjak,so],[drpO,jUKOM],[drpO,jUKOM,so],[drpO,jUKOM,Jjak],[drpO,jUKOM,Jjak,so],[drpO,jUKOM,xjeYJ],[drpO,jUKOM,xjeYJ,so],[drpO,jUKOM,xjeYJ,Jjak],[drpO,jUKOM,xjeYJ,Jjak,so]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cAxXU","G","ZaD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZaD],[G],[G,ZaD],[cAxXU],[cAxXU,ZaD],[cAxXU,G],[cAxXU,G,ZaD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IQN","Een")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Een],[IQN],[IQN,Een]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "I","mJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mJ],[I],[I,mJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JxZtD","DhFcG","Gbkh","MLlTq","VmjH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VmjH],[MLlTq],[MLlTq,VmjH],[Gbkh],[Gbkh,VmjH],[Gbkh,MLlTq],[Gbkh,MLlTq,VmjH],[DhFcG],[DhFcG,VmjH],[DhFcG,MLlTq],[DhFcG,MLlTq,VmjH],[DhFcG,Gbkh],[DhFcG,Gbkh,VmjH],[DhFcG,Gbkh,MLlTq],[DhFcG,Gbkh,MLlTq,VmjH],[JxZtD],[JxZtD,VmjH],[JxZtD,MLlTq],[JxZtD,MLlTq,VmjH],[JxZtD,Gbkh],[JxZtD,Gbkh,VmjH],[JxZtD,Gbkh,MLlTq],[JxZtD,Gbkh,MLlTq,VmjH],[JxZtD,DhFcG],[JxZtD,DhFcG,VmjH],[JxZtD,DhFcG,MLlTq],[JxZtD,DhFcG,MLlTq,VmjH],[JxZtD,DhFcG,Gbkh],[JxZtD,DhFcG,Gbkh,VmjH],[JxZtD,DhFcG,Gbkh,MLlTq],[JxZtD,DhFcG,Gbkh,MLlTq,VmjH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Oms","DGlM","YO","viYFf","iFuu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iFuu],[viYFf],[viYFf,iFuu],[YO],[YO,iFuu],[YO,viYFf],[YO,viYFf,iFuu],[DGlM],[DGlM,iFuu],[DGlM,viYFf],[DGlM,viYFf,iFuu],[DGlM,YO],[DGlM,YO,iFuu],[DGlM,YO,viYFf],[DGlM,YO,viYFf,iFuu],[Oms],[Oms,iFuu],[Oms,viYFf],[Oms,viYFf,iFuu],[Oms,YO],[Oms,YO,iFuu],[Oms,YO,viYFf],[Oms,YO,viYFf,iFuu],[Oms,DGlM],[Oms,DGlM,iFuu],[Oms,DGlM,viYFf],[Oms,DGlM,viYFf,iFuu],[Oms,DGlM,YO],[Oms,DGlM,YO,iFuu],[Oms,DGlM,YO,viYFf],[Oms,DGlM,YO,viYFf,iFuu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mo","eZGy","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[eZGy],[eZGy,z],[Mo],[Mo,z],[Mo,eZGy],[Mo,eZGy,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zBL","EPxU","TUZSF","HEGSc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HEGSc],[TUZSF],[TUZSF,HEGSc],[EPxU],[EPxU,HEGSc],[EPxU,TUZSF],[EPxU,TUZSF,HEGSc],[zBL],[zBL,HEGSc],[zBL,TUZSF],[zBL,TUZSF,HEGSc],[zBL,EPxU],[zBL,EPxU,HEGSc],[zBL,EPxU,TUZSF],[zBL,EPxU,TUZSF,HEGSc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mmk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mmk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jB","sn","Mi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mi],[sn],[sn,Mi],[jB],[jB,Mi],[jB,sn],[jB,sn,Mi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","xaY","uXlF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uXlF],[xaY],[xaY,uXlF],[P],[P,uXlF],[P,xaY],[P,xaY,uXlF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "y","gyGEI","rbKUT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rbKUT],[gyGEI],[gyGEI,rbKUT],[y],[y,rbKUT],[y,gyGEI],[y,gyGEI,rbKUT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","nBi","WM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WM],[nBi],[nBi,WM],[A],[A,WM],[A,nBi],[A,nBi,WM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DFV","pV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pV],[DFV],[DFV,pV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XCd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XCd]]", resultFormatted);
    }
}

