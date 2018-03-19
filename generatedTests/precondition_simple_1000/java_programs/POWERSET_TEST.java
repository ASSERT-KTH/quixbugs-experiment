package java_programs;


public class POWERSET_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aJz","R","s","nR","Ej")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ej],[nR],[nR,Ej],[s],[s,Ej],[s,nR],[s,nR,Ej],[R],[R,Ej],[R,nR],[R,nR,Ej],[R,s],[R,s,Ej],[R,s,nR],[R,s,nR,Ej],[aJz],[aJz,Ej],[aJz,nR],[aJz,nR,Ej],[aJz,s],[aJz,s,Ej],[aJz,s,nR],[aJz,s,nR,Ej],[aJz,R],[aJz,R,Ej],[aJz,R,nR],[aJz,R,nR,Ej],[aJz,R,s],[aJz,R,s,Ej],[aJz,R,s,nR],[aJz,R,s,nR,Ej]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gUJl","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[gUJl],[gUJl,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SC","r","LsqVm","HqMEt","slszm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[slszm],[HqMEt],[HqMEt,slszm],[LsqVm],[LsqVm,slszm],[LsqVm,HqMEt],[LsqVm,HqMEt,slszm],[r],[r,slszm],[r,HqMEt],[r,HqMEt,slszm],[r,LsqVm],[r,LsqVm,slszm],[r,LsqVm,HqMEt],[r,LsqVm,HqMEt,slszm],[SC],[SC,slszm],[SC,HqMEt],[SC,HqMEt,slszm],[SC,LsqVm],[SC,LsqVm,slszm],[SC,LsqVm,HqMEt],[SC,LsqVm,HqMEt,slszm],[SC,r],[SC,r,slszm],[SC,r,HqMEt],[SC,r,HqMEt,slszm],[SC,r,LsqVm],[SC,r,LsqVm,slszm],[SC,r,LsqVm,HqMEt],[SC,r,LsqVm,HqMEt,slszm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "S","McU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[McU],[S],[S,McU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oNiiG","ZcXPY","fCtRq","ncZCu","nxH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nxH],[ncZCu],[ncZCu,nxH],[fCtRq],[fCtRq,nxH],[fCtRq,ncZCu],[fCtRq,ncZCu,nxH],[ZcXPY],[ZcXPY,nxH],[ZcXPY,ncZCu],[ZcXPY,ncZCu,nxH],[ZcXPY,fCtRq],[ZcXPY,fCtRq,nxH],[ZcXPY,fCtRq,ncZCu],[ZcXPY,fCtRq,ncZCu,nxH],[oNiiG],[oNiiG,nxH],[oNiiG,ncZCu],[oNiiG,ncZCu,nxH],[oNiiG,fCtRq],[oNiiG,fCtRq,nxH],[oNiiG,fCtRq,ncZCu],[oNiiG,fCtRq,ncZCu,nxH],[oNiiG,ZcXPY],[oNiiG,ZcXPY,nxH],[oNiiG,ZcXPY,ncZCu],[oNiiG,ZcXPY,ncZCu,nxH],[oNiiG,ZcXPY,fCtRq],[oNiiG,ZcXPY,fCtRq,nxH],[oNiiG,ZcXPY,fCtRq,ncZCu],[oNiiG,ZcXPY,fCtRq,ncZCu,nxH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bkqbe","qzBB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qzBB],[bkqbe],[bkqbe,qzBB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ETAu","COE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[COE],[ETAu],[ETAu,COE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QFrq","gJu","t")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[t],[gJu],[gJu,t],[QFrq],[QFrq,t],[QFrq,gJu],[QFrq,gJu,t]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PeH","E")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[E],[PeH],[PeH,E]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IyWRz","LVl","QYLw","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[QYLw],[QYLw,z],[LVl],[LVl,z],[LVl,QYLw],[LVl,QYLw,z],[IyWRz],[IyWRz,z],[IyWRz,QYLw],[IyWRz,QYLw,z],[IyWRz,LVl],[IyWRz,LVl,z],[IyWRz,LVl,QYLw],[IyWRz,LVl,QYLw,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cozo","yR","UYC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UYC],[yR],[yR,UYC],[Cozo],[Cozo,UYC],[Cozo,yR],[Cozo,yR,UYC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ELli")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ELli]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vLiI","jwB","CIBF","bKq","RLyYE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RLyYE],[bKq],[bKq,RLyYE],[CIBF],[CIBF,RLyYE],[CIBF,bKq],[CIBF,bKq,RLyYE],[jwB],[jwB,RLyYE],[jwB,bKq],[jwB,bKq,RLyYE],[jwB,CIBF],[jwB,CIBF,RLyYE],[jwB,CIBF,bKq],[jwB,CIBF,bKq,RLyYE],[vLiI],[vLiI,RLyYE],[vLiI,bKq],[vLiI,bKq,RLyYE],[vLiI,CIBF],[vLiI,CIBF,RLyYE],[vLiI,CIBF,bKq],[vLiI,CIBF,bKq,RLyYE],[vLiI,jwB],[vLiI,jwB,RLyYE],[vLiI,jwB,bKq],[vLiI,jwB,bKq,RLyYE],[vLiI,jwB,CIBF],[vLiI,jwB,CIBF,RLyYE],[vLiI,jwB,CIBF,bKq],[vLiI,jwB,CIBF,bKq,RLyYE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MO","FOBjM","biSQK","vzPl","FPc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FPc],[vzPl],[vzPl,FPc],[biSQK],[biSQK,FPc],[biSQK,vzPl],[biSQK,vzPl,FPc],[FOBjM],[FOBjM,FPc],[FOBjM,vzPl],[FOBjM,vzPl,FPc],[FOBjM,biSQK],[FOBjM,biSQK,FPc],[FOBjM,biSQK,vzPl],[FOBjM,biSQK,vzPl,FPc],[MO],[MO,FPc],[MO,vzPl],[MO,vzPl,FPc],[MO,biSQK],[MO,biSQK,FPc],[MO,biSQK,vzPl],[MO,biSQK,vzPl,FPc],[MO,FOBjM],[MO,FOBjM,FPc],[MO,FOBjM,vzPl],[MO,FOBjM,vzPl,FPc],[MO,FOBjM,biSQK],[MO,FOBjM,biSQK,FPc],[MO,FOBjM,biSQK,vzPl],[MO,FOBjM,biSQK,vzPl,FPc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Wk","wN","Z","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[Z],[Z,k],[wN],[wN,k],[wN,Z],[wN,Z,k],[Wk],[Wk,k],[Wk,Z],[Wk,Z,k],[Wk,wN],[Wk,wN,k],[Wk,wN,Z],[Wk,wN,Z,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GI","Upo","v","sdk","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[sdk],[sdk,k],[v],[v,k],[v,sdk],[v,sdk,k],[Upo],[Upo,k],[Upo,sdk],[Upo,sdk,k],[Upo,v],[Upo,v,k],[Upo,v,sdk],[Upo,v,sdk,k],[GI],[GI,k],[GI,sdk],[GI,sdk,k],[GI,v],[GI,v,k],[GI,v,sdk],[GI,v,sdk,k],[GI,Upo],[GI,Upo,k],[GI,Upo,sdk],[GI,Upo,sdk,k],[GI,Upo,v],[GI,Upo,v,k],[GI,Upo,v,sdk],[GI,Upo,v,sdk,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","enxDL","uZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uZ],[enxDL],[enxDL,uZ],[r],[r,uZ],[r,enxDL],[r,enxDL,uZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","ZZS","VI","umBsp","u")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[u],[umBsp],[umBsp,u],[VI],[VI,u],[VI,umBsp],[VI,umBsp,u],[ZZS],[ZZS,u],[ZZS,umBsp],[ZZS,umBsp,u],[ZZS,VI],[ZZS,VI,u],[ZZS,VI,umBsp],[ZZS,VI,umBsp,u],[Q],[Q,u],[Q,umBsp],[Q,umBsp,u],[Q,VI],[Q,VI,u],[Q,VI,umBsp],[Q,VI,umBsp,u],[Q,ZZS],[Q,ZZS,u],[Q,ZZS,umBsp],[Q,ZZS,umBsp,u],[Q,ZZS,VI],[Q,ZZS,VI,u],[Q,ZZS,VI,umBsp],[Q,ZZS,VI,umBsp,u]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Yv","tLQd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tLQd],[Yv],[Yv,tLQd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ELiSF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ELiSF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Yho")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Yho]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Yi","plQrk","OhiCQ","mzSa","AOG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AOG],[mzSa],[mzSa,AOG],[OhiCQ],[OhiCQ,AOG],[OhiCQ,mzSa],[OhiCQ,mzSa,AOG],[plQrk],[plQrk,AOG],[plQrk,mzSa],[plQrk,mzSa,AOG],[plQrk,OhiCQ],[plQrk,OhiCQ,AOG],[plQrk,OhiCQ,mzSa],[plQrk,OhiCQ,mzSa,AOG],[Yi],[Yi,AOG],[Yi,mzSa],[Yi,mzSa,AOG],[Yi,OhiCQ],[Yi,OhiCQ,AOG],[Yi,OhiCQ,mzSa],[Yi,OhiCQ,mzSa,AOG],[Yi,plQrk],[Yi,plQrk,AOG],[Yi,plQrk,mzSa],[Yi,plQrk,mzSa,AOG],[Yi,plQrk,OhiCQ],[Yi,plQrk,OhiCQ,AOG],[Yi,plQrk,OhiCQ,mzSa],[Yi,plQrk,OhiCQ,mzSa,AOG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qgNJj","s","ESC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ESC],[s],[s,ESC],[qgNJj],[qgNJj,ESC],[qgNJj,s],[qgNJj,s,ESC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IbfPS","G","MF","vzA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vzA],[MF],[MF,vzA],[G],[G,vzA],[G,MF],[G,MF,vzA],[IbfPS],[IbfPS,vzA],[IbfPS,MF],[IbfPS,MF,vzA],[IbfPS,G],[IbfPS,G,vzA],[IbfPS,G,MF],[IbfPS,G,MF,vzA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","NQ","YF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YF],[NQ],[NQ,YF],[s],[s,YF],[s,NQ],[s,NQ,YF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","z","faBeo","OGbMI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OGbMI],[faBeo],[faBeo,OGbMI],[z],[z,OGbMI],[z,faBeo],[z,faBeo,OGbMI],[B],[B,OGbMI],[B,faBeo],[B,faBeo,OGbMI],[B,z],[B,z,OGbMI],[B,z,faBeo],[B,z,faBeo,OGbMI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TV","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[TV],[TV,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[p]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","jqz","xeHFs","D","ATKTq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ATKTq],[D],[D,ATKTq],[xeHFs],[xeHFs,ATKTq],[xeHFs,D],[xeHFs,D,ATKTq],[jqz],[jqz,ATKTq],[jqz,D],[jqz,D,ATKTq],[jqz,xeHFs],[jqz,xeHFs,ATKTq],[jqz,xeHFs,D],[jqz,xeHFs,D,ATKTq],[R],[R,ATKTq],[R,D],[R,D,ATKTq],[R,xeHFs],[R,xeHFs,ATKTq],[R,xeHFs,D],[R,xeHFs,D,ATKTq],[R,jqz],[R,jqz,ATKTq],[R,jqz,D],[R,jqz,D,ATKTq],[R,jqz,xeHFs],[R,jqz,xeHFs,ATKTq],[R,jqz,xeHFs,D],[R,jqz,xeHFs,D,ATKTq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OO","i")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[i],[OO],[OO,i]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tSP","uV","B","eK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eK],[B],[B,eK],[uV],[uV,eK],[uV,B],[uV,B,eK],[tSP],[tSP,eK],[tSP,B],[tSP,B,eK],[tSP,uV],[tSP,uV,eK],[tSP,uV,B],[tSP,uV,B,eK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "I")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[I]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "e","f","Dzmn","QnMVe","Nix")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Nix],[QnMVe],[QnMVe,Nix],[Dzmn],[Dzmn,Nix],[Dzmn,QnMVe],[Dzmn,QnMVe,Nix],[f],[f,Nix],[f,QnMVe],[f,QnMVe,Nix],[f,Dzmn],[f,Dzmn,Nix],[f,Dzmn,QnMVe],[f,Dzmn,QnMVe,Nix],[e],[e,Nix],[e,QnMVe],[e,QnMVe,Nix],[e,Dzmn],[e,Dzmn,Nix],[e,Dzmn,QnMVe],[e,Dzmn,QnMVe,Nix],[e,f],[e,f,Nix],[e,f,QnMVe],[e,f,QnMVe,Nix],[e,f,Dzmn],[e,f,Dzmn,Nix],[e,f,Dzmn,QnMVe],[e,f,Dzmn,QnMVe,Nix]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ko","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[Ko],[Ko,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hAi","OR","oJjJ","jts","hVK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hVK],[jts],[jts,hVK],[oJjJ],[oJjJ,hVK],[oJjJ,jts],[oJjJ,jts,hVK],[OR],[OR,hVK],[OR,jts],[OR,jts,hVK],[OR,oJjJ],[OR,oJjJ,hVK],[OR,oJjJ,jts],[OR,oJjJ,jts,hVK],[hAi],[hAi,hVK],[hAi,jts],[hAi,jts,hVK],[hAi,oJjJ],[hAi,oJjJ,hVK],[hAi,oJjJ,jts],[hAi,oJjJ,jts,hVK],[hAi,OR],[hAi,OR,hVK],[hAi,OR,jts],[hAi,OR,jts,hVK],[hAi,OR,oJjJ],[hAi,OR,oJjJ,hVK],[hAi,OR,oJjJ,jts],[hAi,OR,oJjJ,jts,hVK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yIhuw","aADHs","WQme","Z","MRgWT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MRgWT],[Z],[Z,MRgWT],[WQme],[WQme,MRgWT],[WQme,Z],[WQme,Z,MRgWT],[aADHs],[aADHs,MRgWT],[aADHs,Z],[aADHs,Z,MRgWT],[aADHs,WQme],[aADHs,WQme,MRgWT],[aADHs,WQme,Z],[aADHs,WQme,Z,MRgWT],[yIhuw],[yIhuw,MRgWT],[yIhuw,Z],[yIhuw,Z,MRgWT],[yIhuw,WQme],[yIhuw,WQme,MRgWT],[yIhuw,WQme,Z],[yIhuw,WQme,Z,MRgWT],[yIhuw,aADHs],[yIhuw,aADHs,MRgWT],[yIhuw,aADHs,Z],[yIhuw,aADHs,Z,MRgWT],[yIhuw,aADHs,WQme],[yIhuw,aADHs,WQme,MRgWT],[yIhuw,aADHs,WQme,Z],[yIhuw,aADHs,WQme,Z,MRgWT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jYXfx","E","SaX","vzq","yRuUf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yRuUf],[vzq],[vzq,yRuUf],[SaX],[SaX,yRuUf],[SaX,vzq],[SaX,vzq,yRuUf],[E],[E,yRuUf],[E,vzq],[E,vzq,yRuUf],[E,SaX],[E,SaX,yRuUf],[E,SaX,vzq],[E,SaX,vzq,yRuUf],[jYXfx],[jYXfx,yRuUf],[jYXfx,vzq],[jYXfx,vzq,yRuUf],[jYXfx,SaX],[jYXfx,SaX,yRuUf],[jYXfx,SaX,vzq],[jYXfx,SaX,vzq,yRuUf],[jYXfx,E],[jYXfx,E,yRuUf],[jYXfx,E,vzq],[jYXfx,E,vzq,yRuUf],[jYXfx,E,SaX],[jYXfx,E,SaX,yRuUf],[jYXfx,E,SaX,vzq],[jYXfx,E,SaX,vzq,yRuUf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","PS","u","GSu","Kh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Kh],[GSu],[GSu,Kh],[u],[u,Kh],[u,GSu],[u,GSu,Kh],[PS],[PS,Kh],[PS,GSu],[PS,GSu,Kh],[PS,u],[PS,u,Kh],[PS,u,GSu],[PS,u,GSu,Kh],[s],[s,Kh],[s,GSu],[s,GSu,Kh],[s,u],[s,u,Kh],[s,u,GSu],[s,u,GSu,Kh],[s,PS],[s,PS,Kh],[s,PS,GSu],[s,PS,GSu,Kh],[s,PS,u],[s,PS,u,Kh],[s,PS,u,GSu],[s,PS,u,GSu,Kh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AEe","VhY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VhY],[AEe],[AEe,VhY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UqP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UqP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HJvT","Gkgf","lyWPe","IrnuQ","OLZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OLZ],[IrnuQ],[IrnuQ,OLZ],[lyWPe],[lyWPe,OLZ],[lyWPe,IrnuQ],[lyWPe,IrnuQ,OLZ],[Gkgf],[Gkgf,OLZ],[Gkgf,IrnuQ],[Gkgf,IrnuQ,OLZ],[Gkgf,lyWPe],[Gkgf,lyWPe,OLZ],[Gkgf,lyWPe,IrnuQ],[Gkgf,lyWPe,IrnuQ,OLZ],[HJvT],[HJvT,OLZ],[HJvT,IrnuQ],[HJvT,IrnuQ,OLZ],[HJvT,lyWPe],[HJvT,lyWPe,OLZ],[HJvT,lyWPe,IrnuQ],[HJvT,lyWPe,IrnuQ,OLZ],[HJvT,Gkgf],[HJvT,Gkgf,OLZ],[HJvT,Gkgf,IrnuQ],[HJvT,Gkgf,IrnuQ,OLZ],[HJvT,Gkgf,lyWPe],[HJvT,Gkgf,lyWPe,OLZ],[HJvT,Gkgf,lyWPe,IrnuQ],[HJvT,Gkgf,lyWPe,IrnuQ,OLZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uTq","S","ueTmP","DKBH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DKBH],[ueTmP],[ueTmP,DKBH],[S],[S,DKBH],[S,ueTmP],[S,ueTmP,DKBH],[uTq],[uTq,DKBH],[uTq,ueTmP],[uTq,ueTmP,DKBH],[uTq,S],[uTq,S,DKBH],[uTq,S,ueTmP],[uTq,S,ueTmP,DKBH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vaXd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vaXd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EnBc","k","INq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[INq],[k],[k,INq],[EnBc],[EnBc,INq],[EnBc,k],[EnBc,k,INq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QeHEx","iYfpq","IFCQ","l","nLM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nLM],[l],[l,nLM],[IFCQ],[IFCQ,nLM],[IFCQ,l],[IFCQ,l,nLM],[iYfpq],[iYfpq,nLM],[iYfpq,l],[iYfpq,l,nLM],[iYfpq,IFCQ],[iYfpq,IFCQ,nLM],[iYfpq,IFCQ,l],[iYfpq,IFCQ,l,nLM],[QeHEx],[QeHEx,nLM],[QeHEx,l],[QeHEx,l,nLM],[QeHEx,IFCQ],[QeHEx,IFCQ,nLM],[QeHEx,IFCQ,l],[QeHEx,IFCQ,l,nLM],[QeHEx,iYfpq],[QeHEx,iYfpq,nLM],[QeHEx,iYfpq,l],[QeHEx,iYfpq,l,nLM],[QeHEx,iYfpq,IFCQ],[QeHEx,iYfpq,IFCQ,nLM],[QeHEx,iYfpq,IFCQ,l],[QeHEx,iYfpq,IFCQ,l,nLM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","sYVW","x","vMU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vMU],[x],[x,vMU],[sYVW],[sYVW,vMU],[sYVW,x],[sYVW,x,vMU],[r],[r,vMU],[r,x],[r,x,vMU],[r,sYVW],[r,sYVW,vMU],[r,sYVW,x],[r,sYVW,x,vMU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zm","TZj","ngWLP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ngWLP],[TZj],[TZj,ngWLP],[Zm],[Zm,ngWLP],[Zm,TZj],[Zm,TZj,ngWLP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SH","ZlZvZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZlZvZ],[SH],[SH,ZlZvZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "L","bA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bA],[L],[L,bA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Dub","kYueW","ELM","Wr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wr],[ELM],[ELM,Wr],[kYueW],[kYueW,Wr],[kYueW,ELM],[kYueW,ELM,Wr],[Dub],[Dub,Wr],[Dub,ELM],[Dub,ELM,Wr],[Dub,kYueW],[Dub,kYueW,Wr],[Dub,kYueW,ELM],[Dub,kYueW,ELM,Wr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xyR","CD","DuTf","uPeAX","TRlI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TRlI],[uPeAX],[uPeAX,TRlI],[DuTf],[DuTf,TRlI],[DuTf,uPeAX],[DuTf,uPeAX,TRlI],[CD],[CD,TRlI],[CD,uPeAX],[CD,uPeAX,TRlI],[CD,DuTf],[CD,DuTf,TRlI],[CD,DuTf,uPeAX],[CD,DuTf,uPeAX,TRlI],[xyR],[xyR,TRlI],[xyR,uPeAX],[xyR,uPeAX,TRlI],[xyR,DuTf],[xyR,DuTf,TRlI],[xyR,DuTf,uPeAX],[xyR,DuTf,uPeAX,TRlI],[xyR,CD],[xyR,CD,TRlI],[xyR,CD,uPeAX],[xyR,CD,uPeAX,TRlI],[xyR,CD,DuTf],[xyR,CD,DuTf,TRlI],[xyR,CD,DuTf,uPeAX],[xyR,CD,DuTf,uPeAX,TRlI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fjRg","xRrkX","onTkN","UmtFt","trdQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[trdQ],[UmtFt],[UmtFt,trdQ],[onTkN],[onTkN,trdQ],[onTkN,UmtFt],[onTkN,UmtFt,trdQ],[xRrkX],[xRrkX,trdQ],[xRrkX,UmtFt],[xRrkX,UmtFt,trdQ],[xRrkX,onTkN],[xRrkX,onTkN,trdQ],[xRrkX,onTkN,UmtFt],[xRrkX,onTkN,UmtFt,trdQ],[fjRg],[fjRg,trdQ],[fjRg,UmtFt],[fjRg,UmtFt,trdQ],[fjRg,onTkN],[fjRg,onTkN,trdQ],[fjRg,onTkN,UmtFt],[fjRg,onTkN,UmtFt,trdQ],[fjRg,xRrkX],[fjRg,xRrkX,trdQ],[fjRg,xRrkX,UmtFt],[fjRg,xRrkX,UmtFt,trdQ],[fjRg,xRrkX,onTkN],[fjRg,xRrkX,onTkN,trdQ],[fjRg,xRrkX,onTkN,UmtFt],[fjRg,xRrkX,onTkN,UmtFt,trdQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YqVLs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YqVLs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xzOu","ee","p","OT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OT],[p],[p,OT],[ee],[ee,OT],[ee,p],[ee,p,OT],[xzOu],[xzOu,OT],[xzOu,p],[xzOu,p,OT],[xzOu,ee],[xzOu,ee,OT],[xzOu,ee,p],[xzOu,ee,p,OT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bEhVS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bEhVS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f","J","leH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[leH],[J],[J,leH],[f],[f,leH],[f,J],[f,J,leH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ps","AHl","Kmv","dz","tCELD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tCELD],[dz],[dz,tCELD],[Kmv],[Kmv,tCELD],[Kmv,dz],[Kmv,dz,tCELD],[AHl],[AHl,tCELD],[AHl,dz],[AHl,dz,tCELD],[AHl,Kmv],[AHl,Kmv,tCELD],[AHl,Kmv,dz],[AHl,Kmv,dz,tCELD],[ps],[ps,tCELD],[ps,dz],[ps,dz,tCELD],[ps,Kmv],[ps,Kmv,tCELD],[ps,Kmv,dz],[ps,Kmv,dz,tCELD],[ps,AHl],[ps,AHl,tCELD],[ps,AHl,dz],[ps,AHl,dz,tCELD],[ps,AHl,Kmv],[ps,AHl,Kmv,tCELD],[ps,AHl,Kmv,dz],[ps,AHl,Kmv,dz,tCELD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kTS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kTS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OVng")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OVng]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TpFq","RxEhq","h","Wf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wf],[h],[h,Wf],[RxEhq],[RxEhq,Wf],[RxEhq,h],[RxEhq,h,Wf],[TpFq],[TpFq,Wf],[TpFq,h],[TpFq,h,Wf],[TpFq,RxEhq],[TpFq,RxEhq,Wf],[TpFq,RxEhq,h],[TpFq,RxEhq,h,Wf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Sen")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Sen]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oSD","JlEE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JlEE],[oSD],[oSD,JlEE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AUQj","czgm","d","nKyKC","wvBZK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wvBZK],[nKyKC],[nKyKC,wvBZK],[d],[d,wvBZK],[d,nKyKC],[d,nKyKC,wvBZK],[czgm],[czgm,wvBZK],[czgm,nKyKC],[czgm,nKyKC,wvBZK],[czgm,d],[czgm,d,wvBZK],[czgm,d,nKyKC],[czgm,d,nKyKC,wvBZK],[AUQj],[AUQj,wvBZK],[AUQj,nKyKC],[AUQj,nKyKC,wvBZK],[AUQj,d],[AUQj,d,wvBZK],[AUQj,d,nKyKC],[AUQj,d,nKyKC,wvBZK],[AUQj,czgm],[AUQj,czgm,wvBZK],[AUQj,czgm,nKyKC],[AUQj,czgm,nKyKC,wvBZK],[AUQj,czgm,d],[AUQj,czgm,d,wvBZK],[AUQj,czgm,d,nKyKC],[AUQj,czgm,d,nKyKC,wvBZK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "afee","Nf","JMGMf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JMGMf],[Nf],[Nf,JMGMf],[afee],[afee,JMGMf],[afee,Nf],[afee,Nf,JMGMf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OxJ","h","K","ylcv","uePYi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uePYi],[ylcv],[ylcv,uePYi],[K],[K,uePYi],[K,ylcv],[K,ylcv,uePYi],[h],[h,uePYi],[h,ylcv],[h,ylcv,uePYi],[h,K],[h,K,uePYi],[h,K,ylcv],[h,K,ylcv,uePYi],[OxJ],[OxJ,uePYi],[OxJ,ylcv],[OxJ,ylcv,uePYi],[OxJ,K],[OxJ,K,uePYi],[OxJ,K,ylcv],[OxJ,K,ylcv,uePYi],[OxJ,h],[OxJ,h,uePYi],[OxJ,h,ylcv],[OxJ,h,ylcv,uePYi],[OxJ,h,K],[OxJ,h,K,uePYi],[OxJ,h,K,ylcv],[OxJ,h,K,ylcv,uePYi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dE","sko","kr","Isy","IW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IW],[Isy],[Isy,IW],[kr],[kr,IW],[kr,Isy],[kr,Isy,IW],[sko],[sko,IW],[sko,Isy],[sko,Isy,IW],[sko,kr],[sko,kr,IW],[sko,kr,Isy],[sko,kr,Isy,IW],[dE],[dE,IW],[dE,Isy],[dE,Isy,IW],[dE,kr],[dE,kr,IW],[dE,kr,Isy],[dE,kr,Isy,IW],[dE,sko],[dE,sko,IW],[dE,sko,Isy],[dE,sko,Isy,IW],[dE,sko,kr],[dE,sko,kr,IW],[dE,sko,kr,Isy],[dE,sko,kr,Isy,IW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PI","tmed")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tmed],[PI],[PI,tmed]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","IrtOc","MFpOh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MFpOh],[IrtOc],[IrtOc,MFpOh],[Q],[Q,MFpOh],[Q,IrtOc],[Q,IrtOc,MFpOh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cut","oMCGx","YLP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YLP],[oMCGx],[oMCGx,YLP],[Cut],[Cut,YLP],[Cut,oMCGx],[Cut,oMCGx,YLP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MQ","GN","it","hpRF","YzSF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YzSF],[hpRF],[hpRF,YzSF],[it],[it,YzSF],[it,hpRF],[it,hpRF,YzSF],[GN],[GN,YzSF],[GN,hpRF],[GN,hpRF,YzSF],[GN,it],[GN,it,YzSF],[GN,it,hpRF],[GN,it,hpRF,YzSF],[MQ],[MQ,YzSF],[MQ,hpRF],[MQ,hpRF,YzSF],[MQ,it],[MQ,it,YzSF],[MQ,it,hpRF],[MQ,it,hpRF,YzSF],[MQ,GN],[MQ,GN,YzSF],[MQ,GN,hpRF],[MQ,GN,hpRF,YzSF],[MQ,GN,it],[MQ,GN,it,YzSF],[MQ,GN,it,hpRF],[MQ,GN,it,hpRF,YzSF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FhHj","iKOU","pTCI","Yav")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Yav],[pTCI],[pTCI,Yav],[iKOU],[iKOU,Yav],[iKOU,pTCI],[iKOU,pTCI,Yav],[FhHj],[FhHj,Yav],[FhHj,pTCI],[FhHj,pTCI,Yav],[FhHj,iKOU],[FhHj,iKOU,Yav],[FhHj,iKOU,pTCI],[FhHj,iKOU,pTCI,Yav]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Fidxo","H","hzqir","kauG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kauG],[hzqir],[hzqir,kauG],[H],[H,kauG],[H,hzqir],[H,hzqir,kauG],[Fidxo],[Fidxo,kauG],[Fidxo,hzqir],[Fidxo,hzqir,kauG],[Fidxo,H],[Fidxo,H,kauG],[Fidxo,H,hzqir],[Fidxo,H,hzqir,kauG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "agZW","XW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XW],[agZW],[agZW,XW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "asmy","ytJeC","G","h","JHuyL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JHuyL],[h],[h,JHuyL],[G],[G,JHuyL],[G,h],[G,h,JHuyL],[ytJeC],[ytJeC,JHuyL],[ytJeC,h],[ytJeC,h,JHuyL],[ytJeC,G],[ytJeC,G,JHuyL],[ytJeC,G,h],[ytJeC,G,h,JHuyL],[asmy],[asmy,JHuyL],[asmy,h],[asmy,h,JHuyL],[asmy,G],[asmy,G,JHuyL],[asmy,G,h],[asmy,G,h,JHuyL],[asmy,ytJeC],[asmy,ytJeC,JHuyL],[asmy,ytJeC,h],[asmy,ytJeC,h,JHuyL],[asmy,ytJeC,G],[asmy,ytJeC,G,JHuyL],[asmy,ytJeC,G,h],[asmy,ytJeC,G,h,JHuyL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gAj","VLtqW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VLtqW],[gAj],[gAj,VLtqW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qVy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qVy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zwsdg","HC","CPMCk","NAvM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NAvM],[CPMCk],[CPMCk,NAvM],[HC],[HC,NAvM],[HC,CPMCk],[HC,CPMCk,NAvM],[Zwsdg],[Zwsdg,NAvM],[Zwsdg,CPMCk],[Zwsdg,CPMCk,NAvM],[Zwsdg,HC],[Zwsdg,HC,NAvM],[Zwsdg,HC,CPMCk],[Zwsdg,HC,CPMCk,NAvM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oEqIi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oEqIi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bHspX","GY","hNc","lNly","tosBU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tosBU],[lNly],[lNly,tosBU],[hNc],[hNc,tosBU],[hNc,lNly],[hNc,lNly,tosBU],[GY],[GY,tosBU],[GY,lNly],[GY,lNly,tosBU],[GY,hNc],[GY,hNc,tosBU],[GY,hNc,lNly],[GY,hNc,lNly,tosBU],[bHspX],[bHspX,tosBU],[bHspX,lNly],[bHspX,lNly,tosBU],[bHspX,hNc],[bHspX,hNc,tosBU],[bHspX,hNc,lNly],[bHspX,hNc,lNly,tosBU],[bHspX,GY],[bHspX,GY,tosBU],[bHspX,GY,lNly],[bHspX,GY,lNly,tosBU],[bHspX,GY,hNc],[bHspX,GY,hNc,tosBU],[bHspX,GY,hNc,lNly],[bHspX,GY,hNc,lNly,tosBU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","lM","Ysp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ysp],[lM],[lM,Ysp],[q],[q,Ysp],[q,lM],[q,lM,Ysp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "msEKC","arjh","eqX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eqX],[arjh],[arjh,eqX],[msEKC],[msEKC,eqX],[msEKC,arjh],[msEKC,arjh,eqX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Gts","h","KLdfB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KLdfB],[h],[h,KLdfB],[Gts],[Gts,KLdfB],[Gts,h],[Gts,h,KLdfB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jMf","zp","X","Uttz","tMG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tMG],[Uttz],[Uttz,tMG],[X],[X,tMG],[X,Uttz],[X,Uttz,tMG],[zp],[zp,tMG],[zp,Uttz],[zp,Uttz,tMG],[zp,X],[zp,X,tMG],[zp,X,Uttz],[zp,X,Uttz,tMG],[jMf],[jMf,tMG],[jMf,Uttz],[jMf,Uttz,tMG],[jMf,X],[jMf,X,tMG],[jMf,X,Uttz],[jMf,X,Uttz,tMG],[jMf,zp],[jMf,zp,tMG],[jMf,zp,Uttz],[jMf,zp,Uttz,tMG],[jMf,zp,X],[jMf,zp,X,tMG],[jMf,zp,X,Uttz],[jMf,zp,X,Uttz,tMG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "g","wEV","wlP","dHS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dHS],[wlP],[wlP,dHS],[wEV],[wEV,dHS],[wEV,wlP],[wEV,wlP,dHS],[g],[g,dHS],[g,wlP],[g,wlP,dHS],[g,wEV],[g,wEV,dHS],[g,wEV,wlP],[g,wEV,wlP,dHS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IkPC","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[IkPC],[IkPC,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LRi","DMo","BL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BL],[DMo],[DMo,BL],[LRi],[LRi,BL],[LRi,DMo],[LRi,DMo,BL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "neQz","GK","t","SN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SN],[t],[t,SN],[GK],[GK,SN],[GK,t],[GK,t,SN],[neQz],[neQz,SN],[neQz,t],[neQz,t,SN],[neQz,GK],[neQz,GK,SN],[neQz,GK,t],[neQz,GK,t,SN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dz","imm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[imm],[dz],[dz,imm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ecvMt","IhSh","hFYfg","ljpz","JG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JG],[ljpz],[ljpz,JG],[hFYfg],[hFYfg,JG],[hFYfg,ljpz],[hFYfg,ljpz,JG],[IhSh],[IhSh,JG],[IhSh,ljpz],[IhSh,ljpz,JG],[IhSh,hFYfg],[IhSh,hFYfg,JG],[IhSh,hFYfg,ljpz],[IhSh,hFYfg,ljpz,JG],[ecvMt],[ecvMt,JG],[ecvMt,ljpz],[ecvMt,ljpz,JG],[ecvMt,hFYfg],[ecvMt,hFYfg,JG],[ecvMt,hFYfg,ljpz],[ecvMt,hFYfg,ljpz,JG],[ecvMt,IhSh],[ecvMt,IhSh,JG],[ecvMt,IhSh,ljpz],[ecvMt,IhSh,ljpz,JG],[ecvMt,IhSh,hFYfg],[ecvMt,IhSh,hFYfg,JG],[ecvMt,IhSh,hFYfg,ljpz],[ecvMt,IhSh,hFYfg,ljpz,JG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gTV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gTV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XUS","sqlmo","J","cTo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cTo],[J],[J,cTo],[sqlmo],[sqlmo,cTo],[sqlmo,J],[sqlmo,J,cTo],[XUS],[XUS,cTo],[XUS,J],[XUS,J,cTo],[XUS,sqlmo],[XUS,sqlmo,cTo],[XUS,sqlmo,J],[XUS,sqlmo,J,cTo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","yXA","dDOz","k","JWco")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JWco],[k],[k,JWco],[dDOz],[dDOz,JWco],[dDOz,k],[dDOz,k,JWco],[yXA],[yXA,JWco],[yXA,k],[yXA,k,JWco],[yXA,dDOz],[yXA,dDOz,JWco],[yXA,dDOz,k],[yXA,dDOz,k,JWco],[A],[A,JWco],[A,k],[A,k,JWco],[A,dDOz],[A,dDOz,JWco],[A,dDOz,k],[A,dDOz,k,JWco],[A,yXA],[A,yXA,JWco],[A,yXA,k],[A,yXA,k,JWco],[A,yXA,dDOz],[A,yXA,dDOz,JWco],[A,yXA,dDOz,k],[A,yXA,dDOz,k,JWco]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lON","ak","dIb","vxzp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vxzp],[dIb],[dIb,vxzp],[ak],[ak,vxzp],[ak,dIb],[ak,dIb,vxzp],[lON],[lON,vxzp],[lON,dIb],[lON,dIb,vxzp],[lON,ak],[lON,ak,vxzp],[lON,ak,dIb],[lON,ak,dIb,vxzp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wm","i","YFROw","DmMO","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[DmMO],[DmMO,L],[YFROw],[YFROw,L],[YFROw,DmMO],[YFROw,DmMO,L],[i],[i,L],[i,DmMO],[i,DmMO,L],[i,YFROw],[i,YFROw,L],[i,YFROw,DmMO],[i,YFROw,DmMO,L],[wm],[wm,L],[wm,DmMO],[wm,DmMO,L],[wm,YFROw],[wm,YFROw,L],[wm,YFROw,DmMO],[wm,YFROw,DmMO,L],[wm,i],[wm,i,L],[wm,i,DmMO],[wm,i,DmMO,L],[wm,i,YFROw],[wm,i,YFROw,L],[wm,i,YFROw,DmMO],[wm,i,YFROw,DmMO,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pOccM","Zc","exB","kVQU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kVQU],[exB],[exB,kVQU],[Zc],[Zc,kVQU],[Zc,exB],[Zc,exB,kVQU],[pOccM],[pOccM,kVQU],[pOccM,exB],[pOccM,exB,kVQU],[pOccM,Zc],[pOccM,Zc,kVQU],[pOccM,Zc,exB],[pOccM,Zc,exB,kVQU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_100() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uEa","dD","S","slJhA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[slJhA],[S],[S,slJhA],[dD],[dD,slJhA],[dD,S],[dD,S,slJhA],[uEa],[uEa,slJhA],[uEa,S],[uEa,S,slJhA],[uEa,dD],[uEa,dD,slJhA],[uEa,dD,S],[uEa,dD,S,slJhA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_101() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BV","Pz","pwGSn","Ub")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ub],[pwGSn],[pwGSn,Ub],[Pz],[Pz,Ub],[Pz,pwGSn],[Pz,pwGSn,Ub],[BV],[BV,Ub],[BV,pwGSn],[BV,pwGSn,Ub],[BV,Pz],[BV,Pz,Ub],[BV,Pz,pwGSn],[BV,Pz,pwGSn,Ub]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_102() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QqG","fSE","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[fSE],[fSE,k],[QqG],[QqG,k],[QqG,fSE],[QqG,fSE,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_103() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BloR","nrH","E","YT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YT],[E],[E,YT],[nrH],[nrH,YT],[nrH,E],[nrH,E,YT],[BloR],[BloR,YT],[BloR,E],[BloR,E,YT],[BloR,nrH],[BloR,nrH,YT],[BloR,nrH,E],[BloR,nrH,E,YT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_104() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UqwYv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UqwYv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_105() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YtL","HYPgI","LXzjV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LXzjV],[HYPgI],[HYPgI,LXzjV],[YtL],[YtL,LXzjV],[YtL,HYPgI],[YtL,HYPgI,LXzjV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_106() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hZ","feFFc","WxpA","nl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nl],[WxpA],[WxpA,nl],[feFFc],[feFFc,nl],[feFFc,WxpA],[feFFc,WxpA,nl],[hZ],[hZ,nl],[hZ,WxpA],[hZ,WxpA,nl],[hZ,feFFc],[hZ,feFFc,nl],[hZ,feFFc,WxpA],[hZ,feFFc,WxpA,nl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_107() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Aa","md","bxte")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bxte],[md],[md,bxte],[Aa],[Aa,bxte],[Aa,md],[Aa,md,bxte]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_108() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vx","QNVcy","oNNOH","dq","xscUK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xscUK],[dq],[dq,xscUK],[oNNOH],[oNNOH,xscUK],[oNNOH,dq],[oNNOH,dq,xscUK],[QNVcy],[QNVcy,xscUK],[QNVcy,dq],[QNVcy,dq,xscUK],[QNVcy,oNNOH],[QNVcy,oNNOH,xscUK],[QNVcy,oNNOH,dq],[QNVcy,oNNOH,dq,xscUK],[vx],[vx,xscUK],[vx,dq],[vx,dq,xscUK],[vx,oNNOH],[vx,oNNOH,xscUK],[vx,oNNOH,dq],[vx,oNNOH,dq,xscUK],[vx,QNVcy],[vx,QNVcy,xscUK],[vx,QNVcy,dq],[vx,QNVcy,dq,xscUK],[vx,QNVcy,oNNOH],[vx,QNVcy,oNNOH,xscUK],[vx,QNVcy,oNNOH,dq],[vx,QNVcy,oNNOH,dq,xscUK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_109() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rde","YZG","DBPR","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[DBPR],[DBPR,o],[YZG],[YZG,o],[YZG,DBPR],[YZG,DBPR,o],[rde],[rde,o],[rde,DBPR],[rde,DBPR,o],[rde,YZG],[rde,YZG,o],[rde,YZG,DBPR],[rde,YZG,DBPR,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_110() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bFOV","v","pH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pH],[v],[v,pH],[bFOV],[bFOV,pH],[bFOV,v],[bFOV,v,pH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_111() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XndX","Nr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Nr],[XndX],[XndX,Nr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_112() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E","nmVR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nmVR],[E],[E,nmVR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_113() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JQ","NaTd","DpONT","FEiy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FEiy],[DpONT],[DpONT,FEiy],[NaTd],[NaTd,FEiy],[NaTd,DpONT],[NaTd,DpONT,FEiy],[JQ],[JQ,FEiy],[JQ,DpONT],[JQ,DpONT,FEiy],[JQ,NaTd],[JQ,NaTd,FEiy],[JQ,NaTd,DpONT],[JQ,NaTd,DpONT,FEiy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_114() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RDE","NdL","el","Dyem")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Dyem],[el],[el,Dyem],[NdL],[NdL,Dyem],[NdL,el],[NdL,el,Dyem],[RDE],[RDE,Dyem],[RDE,el],[RDE,el,Dyem],[RDE,NdL],[RDE,NdL,Dyem],[RDE,NdL,el],[RDE,NdL,el,Dyem]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_115() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aCu","pMTrP","lj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lj],[pMTrP],[pMTrP,lj],[aCu],[aCu,lj],[aCu,pMTrP],[aCu,pMTrP,lj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_116() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Qdd","I","woDFc","CkDh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CkDh],[woDFc],[woDFc,CkDh],[I],[I,CkDh],[I,woDFc],[I,woDFc,CkDh],[Qdd],[Qdd,CkDh],[Qdd,woDFc],[Qdd,woDFc,CkDh],[Qdd,I],[Qdd,I,CkDh],[Qdd,I,woDFc],[Qdd,I,woDFc,CkDh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_117() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rvev","bKNC","Ggiac","wOEJj","wv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wv],[wOEJj],[wOEJj,wv],[Ggiac],[Ggiac,wv],[Ggiac,wOEJj],[Ggiac,wOEJj,wv],[bKNC],[bKNC,wv],[bKNC,wOEJj],[bKNC,wOEJj,wv],[bKNC,Ggiac],[bKNC,Ggiac,wv],[bKNC,Ggiac,wOEJj],[bKNC,Ggiac,wOEJj,wv],[rvev],[rvev,wv],[rvev,wOEJj],[rvev,wOEJj,wv],[rvev,Ggiac],[rvev,Ggiac,wv],[rvev,Ggiac,wOEJj],[rvev,Ggiac,wOEJj,wv],[rvev,bKNC],[rvev,bKNC,wv],[rvev,bKNC,wOEJj],[rvev,bKNC,wOEJj,wv],[rvev,bKNC,Ggiac],[rvev,bKNC,Ggiac,wv],[rvev,bKNC,Ggiac,wOEJj],[rvev,bKNC,Ggiac,wOEJj,wv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_118() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KFAR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KFAR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_119() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zjhpq","u","fo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fo],[u],[u,fo],[zjhpq],[zjhpq,fo],[zjhpq,u],[zjhpq,u,fo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_120() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","f","QMH","OXvtT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OXvtT],[QMH],[QMH,OXvtT],[f],[f,OXvtT],[f,QMH],[f,QMH,OXvtT],[d],[d,OXvtT],[d,QMH],[d,QMH,OXvtT],[d,f],[d,f,OXvtT],[d,f,QMH],[d,f,QMH,OXvtT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_121() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RQYoP","z","gPdvG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gPdvG],[z],[z,gPdvG],[RQYoP],[RQYoP,gPdvG],[RQYoP,z],[RQYoP,z,gPdvG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_122() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eU","mVqK","aG","UO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UO],[aG],[aG,UO],[mVqK],[mVqK,UO],[mVqK,aG],[mVqK,aG,UO],[eU],[eU,UO],[eU,aG],[eU,aG,UO],[eU,mVqK],[eU,mVqK,UO],[eU,mVqK,aG],[eU,mVqK,aG,UO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_123() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Awk","wGXD","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[wGXD],[wGXD,L],[Awk],[Awk,L],[Awk,wGXD],[Awk,wGXD,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_124() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","qy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qy],[R],[R,qy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_125() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JZPs","IMGYB","ZaJp","Z","AO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AO],[Z],[Z,AO],[ZaJp],[ZaJp,AO],[ZaJp,Z],[ZaJp,Z,AO],[IMGYB],[IMGYB,AO],[IMGYB,Z],[IMGYB,Z,AO],[IMGYB,ZaJp],[IMGYB,ZaJp,AO],[IMGYB,ZaJp,Z],[IMGYB,ZaJp,Z,AO],[JZPs],[JZPs,AO],[JZPs,Z],[JZPs,Z,AO],[JZPs,ZaJp],[JZPs,ZaJp,AO],[JZPs,ZaJp,Z],[JZPs,ZaJp,Z,AO],[JZPs,IMGYB],[JZPs,IMGYB,AO],[JZPs,IMGYB,Z],[JZPs,IMGYB,Z,AO],[JZPs,IMGYB,ZaJp],[JZPs,IMGYB,ZaJp,AO],[JZPs,IMGYB,ZaJp,Z],[JZPs,IMGYB,ZaJp,Z,AO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_126() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","EiAH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EiAH],[q],[q,EiAH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_127() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LDom","y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[y],[LDom],[LDom,y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_128() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eyIpy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eyIpy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_129() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EqWKC","D","OUNk","NOia")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NOia],[OUNk],[OUNk,NOia],[D],[D,NOia],[D,OUNk],[D,OUNk,NOia],[EqWKC],[EqWKC,NOia],[EqWKC,OUNk],[EqWKC,OUNk,NOia],[EqWKC,D],[EqWKC,D,NOia],[EqWKC,D,OUNk],[EqWKC,D,OUNk,NOia]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_130() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cU","YcX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YcX],[cU],[cU,YcX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_131() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "txmOl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[txmOl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_132() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ufs","eUg","H","oY","LWX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LWX],[oY],[oY,LWX],[H],[H,LWX],[H,oY],[H,oY,LWX],[eUg],[eUg,LWX],[eUg,oY],[eUg,oY,LWX],[eUg,H],[eUg,H,LWX],[eUg,H,oY],[eUg,H,oY,LWX],[Ufs],[Ufs,LWX],[Ufs,oY],[Ufs,oY,LWX],[Ufs,H],[Ufs,H,LWX],[Ufs,H,oY],[Ufs,H,oY,LWX],[Ufs,eUg],[Ufs,eUg,LWX],[Ufs,eUg,oY],[Ufs,eUg,oY,LWX],[Ufs,eUg,H],[Ufs,eUg,H,LWX],[Ufs,eUg,H,oY],[Ufs,eUg,H,oY,LWX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_133() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jjyn","CX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CX],[jjyn],[jjyn,CX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_134() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ToA","qFDl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qFDl],[ToA],[ToA,qFDl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_135() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LVZWn","JZmLl","pubNs","jCNL","oN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oN],[jCNL],[jCNL,oN],[pubNs],[pubNs,oN],[pubNs,jCNL],[pubNs,jCNL,oN],[JZmLl],[JZmLl,oN],[JZmLl,jCNL],[JZmLl,jCNL,oN],[JZmLl,pubNs],[JZmLl,pubNs,oN],[JZmLl,pubNs,jCNL],[JZmLl,pubNs,jCNL,oN],[LVZWn],[LVZWn,oN],[LVZWn,jCNL],[LVZWn,jCNL,oN],[LVZWn,pubNs],[LVZWn,pubNs,oN],[LVZWn,pubNs,jCNL],[LVZWn,pubNs,jCNL,oN],[LVZWn,JZmLl],[LVZWn,JZmLl,oN],[LVZWn,JZmLl,jCNL],[LVZWn,JZmLl,jCNL,oN],[LVZWn,JZmLl,pubNs],[LVZWn,JZmLl,pubNs,oN],[LVZWn,JZmLl,pubNs,jCNL],[LVZWn,JZmLl,pubNs,jCNL,oN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_136() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZJHP","Vm","zDi","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[zDi],[zDi,N],[Vm],[Vm,N],[Vm,zDi],[Vm,zDi,N],[ZJHP],[ZJHP,N],[ZJHP,zDi],[ZJHP,zDi,N],[ZJHP,Vm],[ZJHP,Vm,N],[ZJHP,Vm,zDi],[ZJHP,Vm,zDi,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_137() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bb","UF","NPyvH","etBwS","MEwfz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MEwfz],[etBwS],[etBwS,MEwfz],[NPyvH],[NPyvH,MEwfz],[NPyvH,etBwS],[NPyvH,etBwS,MEwfz],[UF],[UF,MEwfz],[UF,etBwS],[UF,etBwS,MEwfz],[UF,NPyvH],[UF,NPyvH,MEwfz],[UF,NPyvH,etBwS],[UF,NPyvH,etBwS,MEwfz],[Bb],[Bb,MEwfz],[Bb,etBwS],[Bb,etBwS,MEwfz],[Bb,NPyvH],[Bb,NPyvH,MEwfz],[Bb,NPyvH,etBwS],[Bb,NPyvH,etBwS,MEwfz],[Bb,UF],[Bb,UF,MEwfz],[Bb,UF,etBwS],[Bb,UF,etBwS,MEwfz],[Bb,UF,NPyvH],[Bb,UF,NPyvH,MEwfz],[Bb,UF,NPyvH,etBwS],[Bb,UF,NPyvH,etBwS,MEwfz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_138() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WsmJ","B")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[B],[WsmJ],[WsmJ,B]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_139() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VZg","TsQA","UrowB","Cb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Cb],[UrowB],[UrowB,Cb],[TsQA],[TsQA,Cb],[TsQA,UrowB],[TsQA,UrowB,Cb],[VZg],[VZg,Cb],[VZg,UrowB],[VZg,UrowB,Cb],[VZg,TsQA],[VZg,TsQA,Cb],[VZg,TsQA,UrowB],[VZg,TsQA,UrowB,Cb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_140() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kVp","cAd","n","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[n],[n,O],[cAd],[cAd,O],[cAd,n],[cAd,n,O],[kVp],[kVp,O],[kVp,n],[kVp,n,O],[kVp,cAd],[kVp,cAd,O],[kVp,cAd,n],[kVp,cAd,n,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_141() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "S","pW","safA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[safA],[pW],[pW,safA],[S],[S,safA],[S,pW],[S,pW,safA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_142() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MRYTr","GcgB","Qkxj","SDAK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SDAK],[Qkxj],[Qkxj,SDAK],[GcgB],[GcgB,SDAK],[GcgB,Qkxj],[GcgB,Qkxj,SDAK],[MRYTr],[MRYTr,SDAK],[MRYTr,Qkxj],[MRYTr,Qkxj,SDAK],[MRYTr,GcgB],[MRYTr,GcgB,SDAK],[MRYTr,GcgB,Qkxj],[MRYTr,GcgB,Qkxj,SDAK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_143() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","Qx","Ebpxj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ebpxj],[Qx],[Qx,Ebpxj],[d],[d,Ebpxj],[d,Qx],[d,Qx,Ebpxj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_144() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xKXCy","NC","li","xGn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xGn],[li],[li,xGn],[NC],[NC,xGn],[NC,li],[NC,li,xGn],[xKXCy],[xKXCy,xGn],[xKXCy,li],[xKXCy,li,xGn],[xKXCy,NC],[xKXCy,NC,xGn],[xKXCy,NC,li],[xKXCy,NC,li,xGn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_145() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vqkmM","FWN","NUvgV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NUvgV],[FWN],[FWN,NUvgV],[vqkmM],[vqkmM,NUvgV],[vqkmM,FWN],[vqkmM,FWN,NUvgV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_146() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ISaH","KYD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KYD],[ISaH],[ISaH,KYD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_147() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nQT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nQT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_148() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PZqQo","emn","TGoDu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TGoDu],[emn],[emn,TGoDu],[PZqQo],[PZqQo,TGoDu],[PZqQo,emn],[PZqQo,emn,TGoDu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_149() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zya","Ad","rgk","lVR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lVR],[rgk],[rgk,lVR],[Ad],[Ad,lVR],[Ad,rgk],[Ad,rgk,lVR],[Zya],[Zya,lVR],[Zya,rgk],[Zya,rgk,lVR],[Zya,Ad],[Zya,Ad,lVR],[Zya,Ad,rgk],[Zya,Ad,rgk,lVR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_150() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qws","Uld")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Uld],[qws],[qws,Uld]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_151() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","iYr","f","XZUy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XZUy],[f],[f,XZUy],[iYr],[iYr,XZUy],[iYr,f],[iYr,f,XZUy],[q],[q,XZUy],[q,f],[q,f,XZUy],[q,iYr],[q,iYr,XZUy],[q,iYr,f],[q,iYr,f,XZUy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_152() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "J")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[J]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_153() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[q]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_154() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wJMN","sILRL","yO","y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[y],[yO],[yO,y],[sILRL],[sILRL,y],[sILRL,yO],[sILRL,yO,y],[wJMN],[wJMN,y],[wJMN,yO],[wJMN,yO,y],[wJMN,sILRL],[wJMN,sILRL,y],[wJMN,sILRL,yO],[wJMN,sILRL,yO,y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_155() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iNFr","iSA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iSA],[iNFr],[iNFr,iSA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_156() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bnP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bnP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_157() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_158() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aYda","lnMx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lnMx],[aYda],[aYda,lnMx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_159() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bXnfn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bXnfn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_160() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[x]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_161() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yle","elOxx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[elOxx],[yle],[yle,elOxx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_162() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_163() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KyhjN","BMSY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BMSY],[KyhjN],[KyhjN,BMSY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_164() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IAWC","hpBni")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hpBni],[IAWC],[IAWC,hpBni]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_165() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_166() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","Wolt","nY","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[nY],[nY,O],[Wolt],[Wolt,O],[Wolt,nY],[Wolt,nY,O],[A],[A,O],[A,nY],[A,nY,O],[A,Wolt],[A,Wolt,O],[A,Wolt,nY],[A,Wolt,nY,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_167() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sDs","nEIiO","Hd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Hd],[nEIiO],[nEIiO,Hd],[sDs],[sDs,Hd],[sDs,nEIiO],[sDs,nEIiO,Hd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_168() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","iNxPH","nvsT","N","wOW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wOW],[N],[N,wOW],[nvsT],[nvsT,wOW],[nvsT,N],[nvsT,N,wOW],[iNxPH],[iNxPH,wOW],[iNxPH,N],[iNxPH,N,wOW],[iNxPH,nvsT],[iNxPH,nvsT,wOW],[iNxPH,nvsT,N],[iNxPH,nvsT,N,wOW],[B],[B,wOW],[B,N],[B,N,wOW],[B,nvsT],[B,nvsT,wOW],[B,nvsT,N],[B,nvsT,N,wOW],[B,iNxPH],[B,iNxPH,wOW],[B,iNxPH,N],[B,iNxPH,N,wOW],[B,iNxPH,nvsT],[B,iNxPH,nvsT,wOW],[B,iNxPH,nvsT,N],[B,iNxPH,nvsT,N,wOW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_169() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","FiF","bFstF","pzTMk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pzTMk],[bFstF],[bFstF,pzTMk],[FiF],[FiF,pzTMk],[FiF,bFstF],[FiF,bFstF,pzTMk],[q],[q,pzTMk],[q,bFstF],[q,bFstF,pzTMk],[q,FiF],[q,FiF,pzTMk],[q,FiF,bFstF],[q,FiF,bFstF,pzTMk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_170() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vDwDP","l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l],[vDwDP],[vDwDP,l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_171() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yqwi","BrBY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BrBY],[yqwi],[yqwi,BrBY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_172() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uRWBO","luHo","KtSlb","XjX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XjX],[KtSlb],[KtSlb,XjX],[luHo],[luHo,XjX],[luHo,KtSlb],[luHo,KtSlb,XjX],[uRWBO],[uRWBO,XjX],[uRWBO,KtSlb],[uRWBO,KtSlb,XjX],[uRWBO,luHo],[uRWBO,luHo,XjX],[uRWBO,luHo,KtSlb],[uRWBO,luHo,KtSlb,XjX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_173() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cSVP","aNG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aNG],[cSVP],[cSVP,aNG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_174() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","JYF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JYF],[R],[R,JYF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_175() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BSJAF","EpcO","eQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eQ],[EpcO],[EpcO,eQ],[BSJAF],[BSJAF,eQ],[BSJAF,EpcO],[BSJAF,EpcO,eQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_176() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DkYwV","HNZG","Oe","YjLl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YjLl],[Oe],[Oe,YjLl],[HNZG],[HNZG,YjLl],[HNZG,Oe],[HNZG,Oe,YjLl],[DkYwV],[DkYwV,YjLl],[DkYwV,Oe],[DkYwV,Oe,YjLl],[DkYwV,HNZG],[DkYwV,HNZG,YjLl],[DkYwV,HNZG,Oe],[DkYwV,HNZG,Oe,YjLl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_177() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Trzmx","XQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XQ],[Trzmx],[Trzmx,XQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_178() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QNoX","tzcw","McEFM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[McEFM],[tzcw],[tzcw,McEFM],[QNoX],[QNoX,McEFM],[QNoX,tzcw],[QNoX,tzcw,McEFM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_179() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xH","YWG","K","VdQH","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[VdQH],[VdQH,n],[K],[K,n],[K,VdQH],[K,VdQH,n],[YWG],[YWG,n],[YWG,VdQH],[YWG,VdQH,n],[YWG,K],[YWG,K,n],[YWG,K,VdQH],[YWG,K,VdQH,n],[xH],[xH,n],[xH,VdQH],[xH,VdQH,n],[xH,K],[xH,K,n],[xH,K,VdQH],[xH,K,VdQH,n],[xH,YWG],[xH,YWG,n],[xH,YWG,VdQH],[xH,YWG,VdQH,n],[xH,YWG,K],[xH,YWG,K,n],[xH,YWG,K,VdQH],[xH,YWG,K,VdQH,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_180() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UnJZY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UnJZY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_181() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bff","zP","HAO","i")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[i],[HAO],[HAO,i],[zP],[zP,i],[zP,HAO],[zP,HAO,i],[bff],[bff,i],[bff,HAO],[bff,HAO,i],[bff,zP],[bff,zP,i],[bff,zP,HAO],[bff,zP,HAO,i]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_182() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wFHPS","qb","JTJTr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JTJTr],[qb],[qb,JTJTr],[wFHPS],[wFHPS,JTJTr],[wFHPS,qb],[wFHPS,qb,JTJTr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_183() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "khx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[khx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_184() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "T","sLV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sLV],[T],[T,sLV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_185() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fgru")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fgru]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_186() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HSv","KICNa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KICNa],[HSv],[HSv,KICNa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_187() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VmG","rfEOt","V")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[V],[rfEOt],[rfEOt,V],[VmG],[VmG,V],[VmG,rfEOt],[VmG,rfEOt,V]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_188() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dgiD","WTTG","Z","ueSYV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ueSYV],[Z],[Z,ueSYV],[WTTG],[WTTG,ueSYV],[WTTG,Z],[WTTG,Z,ueSYV],[dgiD],[dgiD,ueSYV],[dgiD,Z],[dgiD,Z,ueSYV],[dgiD,WTTG],[dgiD,WTTG,ueSYV],[dgiD,WTTG,Z],[dgiD,WTTG,Z,ueSYV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_189() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "K","OmcVX","NpnpE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NpnpE],[OmcVX],[OmcVX,NpnpE],[K],[K,NpnpE],[K,OmcVX],[K,OmcVX,NpnpE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_190() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XH","cGgDh","V","BFREt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BFREt],[V],[V,BFREt],[cGgDh],[cGgDh,BFREt],[cGgDh,V],[cGgDh,V,BFREt],[XH],[XH,BFREt],[XH,V],[XH,V,BFREt],[XH,cGgDh],[XH,cGgDh,BFREt],[XH,cGgDh,V],[XH,cGgDh,V,BFREt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_191() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZLQrS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZLQrS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_192() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NUf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NUf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_193() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Hh","IOUuB","GoA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GoA],[IOUuB],[IOUuB,GoA],[Hh],[Hh,GoA],[Hh,IOUuB],[Hh,IOUuB,GoA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_194() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xX","pjoiW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pjoiW],[xX],[xX,pjoiW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_195() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KKQVy","lH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lH],[KKQVy],[KKQVy,lH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_196() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OtilR","gMkZ","icp","cCh","mh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mh],[cCh],[cCh,mh],[icp],[icp,mh],[icp,cCh],[icp,cCh,mh],[gMkZ],[gMkZ,mh],[gMkZ,cCh],[gMkZ,cCh,mh],[gMkZ,icp],[gMkZ,icp,mh],[gMkZ,icp,cCh],[gMkZ,icp,cCh,mh],[OtilR],[OtilR,mh],[OtilR,cCh],[OtilR,cCh,mh],[OtilR,icp],[OtilR,icp,mh],[OtilR,icp,cCh],[OtilR,icp,cCh,mh],[OtilR,gMkZ],[OtilR,gMkZ,mh],[OtilR,gMkZ,cCh],[OtilR,gMkZ,cCh,mh],[OtilR,gMkZ,icp],[OtilR,gMkZ,icp,mh],[OtilR,gMkZ,icp,cCh],[OtilR,gMkZ,icp,cCh,mh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_197() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RApr","IzvCp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IzvCp],[RApr],[RApr,IzvCp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_198() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "M","Lqd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Lqd],[M],[M,Lqd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_199() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GMn","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[GMn],[GMn,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_200() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tDyp","qxlRc","lYZix","Ve")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ve],[lYZix],[lYZix,Ve],[qxlRc],[qxlRc,Ve],[qxlRc,lYZix],[qxlRc,lYZix,Ve],[tDyp],[tDyp,Ve],[tDyp,lYZix],[tDyp,lYZix,Ve],[tDyp,qxlRc],[tDyp,qxlRc,Ve],[tDyp,qxlRc,lYZix],[tDyp,qxlRc,lYZix,Ve]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_201() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Uw","E","zoL","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[zoL],[zoL,o],[E],[E,o],[E,zoL],[E,zoL,o],[Uw],[Uw,o],[Uw,zoL],[Uw,zoL,o],[Uw,E],[Uw,E,o],[Uw,E,zoL],[Uw,E,zoL,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_202() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZoFqQ","ieC","VDlWP","Rn","hHTQs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hHTQs],[Rn],[Rn,hHTQs],[VDlWP],[VDlWP,hHTQs],[VDlWP,Rn],[VDlWP,Rn,hHTQs],[ieC],[ieC,hHTQs],[ieC,Rn],[ieC,Rn,hHTQs],[ieC,VDlWP],[ieC,VDlWP,hHTQs],[ieC,VDlWP,Rn],[ieC,VDlWP,Rn,hHTQs],[ZoFqQ],[ZoFqQ,hHTQs],[ZoFqQ,Rn],[ZoFqQ,Rn,hHTQs],[ZoFqQ,VDlWP],[ZoFqQ,VDlWP,hHTQs],[ZoFqQ,VDlWP,Rn],[ZoFqQ,VDlWP,Rn,hHTQs],[ZoFqQ,ieC],[ZoFqQ,ieC,hHTQs],[ZoFqQ,ieC,Rn],[ZoFqQ,ieC,Rn,hHTQs],[ZoFqQ,ieC,VDlWP],[ZoFqQ,ieC,VDlWP,hHTQs],[ZoFqQ,ieC,VDlWP,Rn],[ZoFqQ,ieC,VDlWP,Rn,hHTQs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_203() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Jpw","g","ibIJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ibIJ],[g],[g,ibIJ],[Jpw],[Jpw,ibIJ],[Jpw,g],[Jpw,g,ibIJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_204() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dxKG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dxKG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_205() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","di","cgth","YYUjJ","FD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FD],[YYUjJ],[YYUjJ,FD],[cgth],[cgth,FD],[cgth,YYUjJ],[cgth,YYUjJ,FD],[di],[di,FD],[di,YYUjJ],[di,YYUjJ,FD],[di,cgth],[di,cgth,FD],[di,cgth,YYUjJ],[di,cgth,YYUjJ,FD],[R],[R,FD],[R,YYUjJ],[R,YYUjJ,FD],[R,cgth],[R,cgth,FD],[R,cgth,YYUjJ],[R,cgth,YYUjJ,FD],[R,di],[R,di,FD],[R,di,YYUjJ],[R,di,YYUjJ,FD],[R,di,cgth],[R,di,cgth,FD],[R,di,cgth,YYUjJ],[R,di,cgth,YYUjJ,FD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_206() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uMx","dgUAa","Quh","eK","dc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dc],[eK],[eK,dc],[Quh],[Quh,dc],[Quh,eK],[Quh,eK,dc],[dgUAa],[dgUAa,dc],[dgUAa,eK],[dgUAa,eK,dc],[dgUAa,Quh],[dgUAa,Quh,dc],[dgUAa,Quh,eK],[dgUAa,Quh,eK,dc],[uMx],[uMx,dc],[uMx,eK],[uMx,eK,dc],[uMx,Quh],[uMx,Quh,dc],[uMx,Quh,eK],[uMx,Quh,eK,dc],[uMx,dgUAa],[uMx,dgUAa,dc],[uMx,dgUAa,eK],[uMx,dgUAa,eK,dc],[uMx,dgUAa,Quh],[uMx,dgUAa,Quh,dc],[uMx,dgUAa,Quh,eK],[uMx,dgUAa,Quh,eK,dc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_207() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BrOOf","ZmN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZmN],[BrOOf],[BrOOf,ZmN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_208() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LPh","fNn","pW","rMGRI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rMGRI],[pW],[pW,rMGRI],[fNn],[fNn,rMGRI],[fNn,pW],[fNn,pW,rMGRI],[LPh],[LPh,rMGRI],[LPh,pW],[LPh,pW,rMGRI],[LPh,fNn],[LPh,fNn,rMGRI],[LPh,fNn,pW],[LPh,fNn,pW,rMGRI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_209() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zKnE","qBX","xyvk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xyvk],[qBX],[qBX,xyvk],[zKnE],[zKnE,xyvk],[zKnE,qBX],[zKnE,qBX,xyvk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_210() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VEvl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VEvl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_211() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OUgu","UDv","kKV","ceHL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ceHL],[kKV],[kKV,ceHL],[UDv],[UDv,ceHL],[UDv,kKV],[UDv,kKV,ceHL],[OUgu],[OUgu,ceHL],[OUgu,kKV],[OUgu,kKV,ceHL],[OUgu,UDv],[OUgu,UDv,ceHL],[OUgu,UDv,kKV],[OUgu,UDv,kKV,ceHL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_212() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ljYOw","w","NfIL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NfIL],[w],[w,NfIL],[ljYOw],[ljYOw,NfIL],[ljYOw,w],[ljYOw,w,NfIL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_213() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_214() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[D]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_215() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wX","pa","UFs","Re","CeA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CeA],[Re],[Re,CeA],[UFs],[UFs,CeA],[UFs,Re],[UFs,Re,CeA],[pa],[pa,CeA],[pa,Re],[pa,Re,CeA],[pa,UFs],[pa,UFs,CeA],[pa,UFs,Re],[pa,UFs,Re,CeA],[wX],[wX,CeA],[wX,Re],[wX,Re,CeA],[wX,UFs],[wX,UFs,CeA],[wX,UFs,Re],[wX,UFs,Re,CeA],[wX,pa],[wX,pa,CeA],[wX,pa,Re],[wX,pa,Re,CeA],[wX,pa,UFs],[wX,pa,UFs,CeA],[wX,pa,UFs,Re],[wX,pa,UFs,Re,CeA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_216() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rkC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rkC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_217() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QgW","FkTLh","iNN","kJVD","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[kJVD],[kJVD,N],[iNN],[iNN,N],[iNN,kJVD],[iNN,kJVD,N],[FkTLh],[FkTLh,N],[FkTLh,kJVD],[FkTLh,kJVD,N],[FkTLh,iNN],[FkTLh,iNN,N],[FkTLh,iNN,kJVD],[FkTLh,iNN,kJVD,N],[QgW],[QgW,N],[QgW,kJVD],[QgW,kJVD,N],[QgW,iNN],[QgW,iNN,N],[QgW,iNN,kJVD],[QgW,iNN,kJVD,N],[QgW,FkTLh],[QgW,FkTLh,N],[QgW,FkTLh,kJVD],[QgW,FkTLh,kJVD,N],[QgW,FkTLh,iNN],[QgW,FkTLh,iNN,N],[QgW,FkTLh,iNN,kJVD],[QgW,FkTLh,iNN,kJVD,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_218() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mak","dbv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dbv],[Mak],[Mak,dbv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_219() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","JCo","YP","KGEw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KGEw],[YP],[YP,KGEw],[JCo],[JCo,KGEw],[JCo,YP],[JCo,YP,KGEw],[U],[U,KGEw],[U,YP],[U,YP,KGEw],[U,JCo],[U,JCo,KGEw],[U,JCo,YP],[U,JCo,YP,KGEw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_220() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E","MF","tMPB","kI","mL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mL],[kI],[kI,mL],[tMPB],[tMPB,mL],[tMPB,kI],[tMPB,kI,mL],[MF],[MF,mL],[MF,kI],[MF,kI,mL],[MF,tMPB],[MF,tMPB,mL],[MF,tMPB,kI],[MF,tMPB,kI,mL],[E],[E,mL],[E,kI],[E,kI,mL],[E,tMPB],[E,tMPB,mL],[E,tMPB,kI],[E,tMPB,kI,mL],[E,MF],[E,MF,mL],[E,MF,kI],[E,MF,kI,mL],[E,MF,tMPB],[E,MF,tMPB,mL],[E,MF,tMPB,kI],[E,MF,tMPB,kI,mL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_221() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oQyx","bG","fOVE","dWIdL","PNy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PNy],[dWIdL],[dWIdL,PNy],[fOVE],[fOVE,PNy],[fOVE,dWIdL],[fOVE,dWIdL,PNy],[bG],[bG,PNy],[bG,dWIdL],[bG,dWIdL,PNy],[bG,fOVE],[bG,fOVE,PNy],[bG,fOVE,dWIdL],[bG,fOVE,dWIdL,PNy],[oQyx],[oQyx,PNy],[oQyx,dWIdL],[oQyx,dWIdL,PNy],[oQyx,fOVE],[oQyx,fOVE,PNy],[oQyx,fOVE,dWIdL],[oQyx,fOVE,dWIdL,PNy],[oQyx,bG],[oQyx,bG,PNy],[oQyx,bG,dWIdL],[oQyx,bG,dWIdL,PNy],[oQyx,bG,fOVE],[oQyx,bG,fOVE,PNy],[oQyx,bG,fOVE,dWIdL],[oQyx,bG,fOVE,dWIdL,PNy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_222() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "imyF","QZhf","denXN","LSBHF","QMLmC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QMLmC],[LSBHF],[LSBHF,QMLmC],[denXN],[denXN,QMLmC],[denXN,LSBHF],[denXN,LSBHF,QMLmC],[QZhf],[QZhf,QMLmC],[QZhf,LSBHF],[QZhf,LSBHF,QMLmC],[QZhf,denXN],[QZhf,denXN,QMLmC],[QZhf,denXN,LSBHF],[QZhf,denXN,LSBHF,QMLmC],[imyF],[imyF,QMLmC],[imyF,LSBHF],[imyF,LSBHF,QMLmC],[imyF,denXN],[imyF,denXN,QMLmC],[imyF,denXN,LSBHF],[imyF,denXN,LSBHF,QMLmC],[imyF,QZhf],[imyF,QZhf,QMLmC],[imyF,QZhf,LSBHF],[imyF,QZhf,LSBHF,QMLmC],[imyF,QZhf,denXN],[imyF,QZhf,denXN,QMLmC],[imyF,QZhf,denXN,LSBHF],[imyF,QZhf,denXN,LSBHF,QMLmC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_223() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[B]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_224() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "At","ypHIb","zR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zR],[ypHIb],[ypHIb,zR],[At],[At,zR],[At,ypHIb],[At,ypHIb,zR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_225() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","Ryl","QSF","x","SB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SB],[x],[x,SB],[QSF],[QSF,SB],[QSF,x],[QSF,x,SB],[Ryl],[Ryl,SB],[Ryl,x],[Ryl,x,SB],[Ryl,QSF],[Ryl,QSF,SB],[Ryl,QSF,x],[Ryl,QSF,x,SB],[A],[A,SB],[A,x],[A,x,SB],[A,QSF],[A,QSF,SB],[A,QSF,x],[A,QSF,x,SB],[A,Ryl],[A,Ryl,SB],[A,Ryl,x],[A,Ryl,x,SB],[A,Ryl,QSF],[A,Ryl,QSF,SB],[A,Ryl,QSF,x],[A,Ryl,QSF,x,SB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_226() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LsvVm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LsvVm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_227() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","b","DMv","oGT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oGT],[DMv],[DMv,oGT],[b],[b,oGT],[b,DMv],[b,DMv,oGT],[a],[a,oGT],[a,DMv],[a,DMv,oGT],[a,b],[a,b,oGT],[a,b,DMv],[a,b,DMv,oGT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_228() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yLayJ","ZI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZI],[yLayJ],[yLayJ,ZI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_229() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yi","q","aHvX","AGyN","TAgSL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TAgSL],[AGyN],[AGyN,TAgSL],[aHvX],[aHvX,TAgSL],[aHvX,AGyN],[aHvX,AGyN,TAgSL],[q],[q,TAgSL],[q,AGyN],[q,AGyN,TAgSL],[q,aHvX],[q,aHvX,TAgSL],[q,aHvX,AGyN],[q,aHvX,AGyN,TAgSL],[yi],[yi,TAgSL],[yi,AGyN],[yi,AGyN,TAgSL],[yi,aHvX],[yi,aHvX,TAgSL],[yi,aHvX,AGyN],[yi,aHvX,AGyN,TAgSL],[yi,q],[yi,q,TAgSL],[yi,q,AGyN],[yi,q,AGyN,TAgSL],[yi,q,aHvX],[yi,q,aHvX,TAgSL],[yi,q,aHvX,AGyN],[yi,q,aHvX,AGyN,TAgSL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_230() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lqup","uk","mSZn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mSZn],[uk],[uk,mSZn],[lqup],[lqup,mSZn],[lqup,uk],[lqup,uk,mSZn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_231() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nJw","kX","Tks")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tks],[kX],[kX,Tks],[nJw],[nJw,Tks],[nJw,kX],[nJw,kX,Tks]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_232() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tsg","HMT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HMT],[tsg],[tsg,HMT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_233() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HpTsT","I","yblKd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yblKd],[I],[I,yblKd],[HpTsT],[HpTsT,yblKd],[HpTsT,I],[HpTsT,I,yblKd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_234() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fiV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fiV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_235() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RG","Wt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wt],[RG],[RG,Wt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_236() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dcR","Npada")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Npada],[dcR],[dcR,Npada]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_237() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "swXVo","H","en","gnd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gnd],[en],[en,gnd],[H],[H,gnd],[H,en],[H,en,gnd],[swXVo],[swXVo,gnd],[swXVo,en],[swXVo,en,gnd],[swXVo,H],[swXVo,H,gnd],[swXVo,H,en],[swXVo,H,en,gnd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_238() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TCzK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TCzK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_239() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MWSo","PC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PC],[MWSo],[MWSo,PC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_240() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pS","xJQga","wteX","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[wteX],[wteX,L],[xJQga],[xJQga,L],[xJQga,wteX],[xJQga,wteX,L],[pS],[pS,L],[pS,wteX],[pS,wteX,L],[pS,xJQga],[pS,xJQga,L],[pS,xJQga,wteX],[pS,xJQga,wteX,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_241() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_242() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_243() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cKbf","wP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wP],[cKbf],[cKbf,wP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_244() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","qrk","sFKCd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sFKCd],[qrk],[qrk,sFKCd],[r],[r,sFKCd],[r,qrk],[r,qrk,sFKCd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_245() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lVM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lVM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_246() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ymHC","iB","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[iB],[iB,z],[ymHC],[ymHC,z],[ymHC,iB],[ymHC,iB,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_247() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MkoQG","I","iWam","Jv","aSKI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aSKI],[Jv],[Jv,aSKI],[iWam],[iWam,aSKI],[iWam,Jv],[iWam,Jv,aSKI],[I],[I,aSKI],[I,Jv],[I,Jv,aSKI],[I,iWam],[I,iWam,aSKI],[I,iWam,Jv],[I,iWam,Jv,aSKI],[MkoQG],[MkoQG,aSKI],[MkoQG,Jv],[MkoQG,Jv,aSKI],[MkoQG,iWam],[MkoQG,iWam,aSKI],[MkoQG,iWam,Jv],[MkoQG,iWam,Jv,aSKI],[MkoQG,I],[MkoQG,I,aSKI],[MkoQG,I,Jv],[MkoQG,I,Jv,aSKI],[MkoQG,I,iWam],[MkoQG,I,iWam,aSKI],[MkoQG,I,iWam,Jv],[MkoQG,I,iWam,Jv,aSKI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_248() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zVkGG","nvzaL","JzSb","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[JzSb],[JzSb,O],[nvzaL],[nvzaL,O],[nvzaL,JzSb],[nvzaL,JzSb,O],[zVkGG],[zVkGG,O],[zVkGG,JzSb],[zVkGG,JzSb,O],[zVkGG,nvzaL],[zVkGG,nvzaL,O],[zVkGG,nvzaL,JzSb],[zVkGG,nvzaL,JzSb,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_249() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LMLK","vqA","PfLC","mH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mH],[PfLC],[PfLC,mH],[vqA],[vqA,mH],[vqA,PfLC],[vqA,PfLC,mH],[LMLK],[LMLK,mH],[LMLK,PfLC],[LMLK,PfLC,mH],[LMLK,vqA],[LMLK,vqA,mH],[LMLK,vqA,PfLC],[LMLK,vqA,PfLC,mH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_250() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "siUb","cqBif")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cqBif],[siUb],[siUb,cqBif]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_251() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ii","pg","JNQFI","jRDym")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jRDym],[JNQFI],[JNQFI,jRDym],[pg],[pg,jRDym],[pg,JNQFI],[pg,JNQFI,jRDym],[ii],[ii,jRDym],[ii,JNQFI],[ii,JNQFI,jRDym],[ii,pg],[ii,pg,jRDym],[ii,pg,JNQFI],[ii,pg,JNQFI,jRDym]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_252() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","RCpc","AtDx","uC","LJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LJ],[uC],[uC,LJ],[AtDx],[AtDx,LJ],[AtDx,uC],[AtDx,uC,LJ],[RCpc],[RCpc,LJ],[RCpc,uC],[RCpc,uC,LJ],[RCpc,AtDx],[RCpc,AtDx,LJ],[RCpc,AtDx,uC],[RCpc,AtDx,uC,LJ],[q],[q,LJ],[q,uC],[q,uC,LJ],[q,AtDx],[q,AtDx,LJ],[q,AtDx,uC],[q,AtDx,uC,LJ],[q,RCpc],[q,RCpc,LJ],[q,RCpc,uC],[q,RCpc,uC,LJ],[q,RCpc,AtDx],[q,RCpc,AtDx,LJ],[q,RCpc,AtDx,uC],[q,RCpc,AtDx,uC,LJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_253() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BWv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BWv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_254() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kyfN","QnUH","YXu","SKT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SKT],[YXu],[YXu,SKT],[QnUH],[QnUH,SKT],[QnUH,YXu],[QnUH,YXu,SKT],[kyfN],[kyfN,SKT],[kyfN,YXu],[kyfN,YXu,SKT],[kyfN,QnUH],[kyfN,QnUH,SKT],[kyfN,QnUH,YXu],[kyfN,QnUH,YXu,SKT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_255() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mlEY","dDRl","xVH","khlYb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[khlYb],[xVH],[xVH,khlYb],[dDRl],[dDRl,khlYb],[dDRl,xVH],[dDRl,xVH,khlYb],[mlEY],[mlEY,khlYb],[mlEY,xVH],[mlEY,xVH,khlYb],[mlEY,dDRl],[mlEY,dDRl,khlYb],[mlEY,dDRl,xVH],[mlEY,dDRl,xVH,khlYb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_256() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ho")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ho]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_257() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "w","g")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[g],[w],[w,g]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_258() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mnnri")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mnnri]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_259() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ILmlO","uK","Xczus","vOCb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vOCb],[Xczus],[Xczus,vOCb],[uK],[uK,vOCb],[uK,Xczus],[uK,Xczus,vOCb],[ILmlO],[ILmlO,vOCb],[ILmlO,Xczus],[ILmlO,Xczus,vOCb],[ILmlO,uK],[ILmlO,uK,vOCb],[ILmlO,uK,Xczus],[ILmlO,uK,Xczus,vOCb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_260() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Aq","oeF","sfWXg","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[sfWXg],[sfWXg,K],[oeF],[oeF,K],[oeF,sfWXg],[oeF,sfWXg,K],[Aq],[Aq,K],[Aq,sfWXg],[Aq,sfWXg,K],[Aq,oeF],[Aq,oeF,K],[Aq,oeF,sfWXg],[Aq,oeF,sfWXg,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_261() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ab","RDSF","U","Aw","h")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[h],[Aw],[Aw,h],[U],[U,h],[U,Aw],[U,Aw,h],[RDSF],[RDSF,h],[RDSF,Aw],[RDSF,Aw,h],[RDSF,U],[RDSF,U,h],[RDSF,U,Aw],[RDSF,U,Aw,h],[Ab],[Ab,h],[Ab,Aw],[Ab,Aw,h],[Ab,U],[Ab,U,h],[Ab,U,Aw],[Ab,U,Aw,h],[Ab,RDSF],[Ab,RDSF,h],[Ab,RDSF,Aw],[Ab,RDSF,Aw,h],[Ab,RDSF,U],[Ab,RDSF,U,h],[Ab,RDSF,U,Aw],[Ab,RDSF,U,Aw,h]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_262() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SJHE","F","W","TFP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TFP],[W],[W,TFP],[F],[F,TFP],[F,W],[F,W,TFP],[SJHE],[SJHE,TFP],[SJHE,W],[SJHE,W,TFP],[SJHE,F],[SJHE,F,TFP],[SJHE,F,W],[SJHE,F,W,TFP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_263() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qPnc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qPnc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_264() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nsF","ARIc","qvTm","Hw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Hw],[qvTm],[qvTm,Hw],[ARIc],[ARIc,Hw],[ARIc,qvTm],[ARIc,qvTm,Hw],[nsF],[nsF,Hw],[nsF,qvTm],[nsF,qvTm,Hw],[nsF,ARIc],[nsF,ARIc,Hw],[nsF,ARIc,qvTm],[nsF,ARIc,qvTm,Hw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_265() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VqET","e","F","K","gdWI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gdWI],[K],[K,gdWI],[F],[F,gdWI],[F,K],[F,K,gdWI],[e],[e,gdWI],[e,K],[e,K,gdWI],[e,F],[e,F,gdWI],[e,F,K],[e,F,K,gdWI],[VqET],[VqET,gdWI],[VqET,K],[VqET,K,gdWI],[VqET,F],[VqET,F,gdWI],[VqET,F,K],[VqET,F,K,gdWI],[VqET,e],[VqET,e,gdWI],[VqET,e,K],[VqET,e,K,gdWI],[VqET,e,F],[VqET,e,F,gdWI],[VqET,e,F,K],[VqET,e,F,K,gdWI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_266() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CG","oE","Xpp","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[Xpp],[Xpp,O],[oE],[oE,O],[oE,Xpp],[oE,Xpp,O],[CG],[CG,O],[CG,Xpp],[CG,Xpp,O],[CG,oE],[CG,oE,O],[CG,oE,Xpp],[CG,oE,Xpp,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_267() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "G","jI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jI],[G],[G,jI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_268() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","cgj","WRC","mWe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mWe],[WRC],[WRC,mWe],[cgj],[cgj,mWe],[cgj,WRC],[cgj,WRC,mWe],[U],[U,mWe],[U,WRC],[U,WRC,mWe],[U,cgj],[U,cgj,mWe],[U,cgj,WRC],[U,cgj,WRC,mWe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_269() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "w","zycWJ","MtBC","fYo","OXg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OXg],[fYo],[fYo,OXg],[MtBC],[MtBC,OXg],[MtBC,fYo],[MtBC,fYo,OXg],[zycWJ],[zycWJ,OXg],[zycWJ,fYo],[zycWJ,fYo,OXg],[zycWJ,MtBC],[zycWJ,MtBC,OXg],[zycWJ,MtBC,fYo],[zycWJ,MtBC,fYo,OXg],[w],[w,OXg],[w,fYo],[w,fYo,OXg],[w,MtBC],[w,MtBC,OXg],[w,MtBC,fYo],[w,MtBC,fYo,OXg],[w,zycWJ],[w,zycWJ,OXg],[w,zycWJ,fYo],[w,zycWJ,fYo,OXg],[w,zycWJ,MtBC],[w,zycWJ,MtBC,OXg],[w,zycWJ,MtBC,fYo],[w,zycWJ,MtBC,fYo,OXg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_270() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Xjc","LYor","mbW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mbW],[LYor],[LYor,mbW],[Xjc],[Xjc,mbW],[Xjc,LYor],[Xjc,LYor,mbW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_271() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Sz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Sz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_272() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RPN","suNx","JG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JG],[suNx],[suNx,JG],[RPN],[RPN,JG],[RPN,suNx],[RPN,suNx,JG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_273() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xGEVi","TqxS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TqxS],[xGEVi],[xGEVi,TqxS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_274() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[t],[t,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_275() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eVIw","arGt","ncnS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ncnS],[arGt],[arGt,ncnS],[eVIw],[eVIw,ncnS],[eVIw,arGt],[eVIw,arGt,ncnS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_276() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "stD","SE","DOu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DOu],[SE],[SE,DOu],[stD],[stD,DOu],[stD,SE],[stD,SE,DOu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_277() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kKgK","UmQIL","tqgJY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tqgJY],[UmQIL],[UmQIL,tqgJY],[kKgK],[kKgK,tqgJY],[kKgK,UmQIL],[kKgK,UmQIL,tqgJY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_278() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "drg","SZA","gidhg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gidhg],[SZA],[SZA,gidhg],[drg],[drg,gidhg],[drg,SZA],[drg,SZA,gidhg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_279() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tE","C","CNzB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CNzB],[C],[C,CNzB],[tE],[tE,CNzB],[tE,C],[tE,C,CNzB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_280() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EKCTb","KVG","SFR","nL","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[nL],[nL,n],[SFR],[SFR,n],[SFR,nL],[SFR,nL,n],[KVG],[KVG,n],[KVG,nL],[KVG,nL,n],[KVG,SFR],[KVG,SFR,n],[KVG,SFR,nL],[KVG,SFR,nL,n],[EKCTb],[EKCTb,n],[EKCTb,nL],[EKCTb,nL,n],[EKCTb,SFR],[EKCTb,SFR,n],[EKCTb,SFR,nL],[EKCTb,SFR,nL,n],[EKCTb,KVG],[EKCTb,KVG,n],[EKCTb,KVG,nL],[EKCTb,KVG,nL,n],[EKCTb,KVG,SFR],[EKCTb,KVG,SFR,n],[EKCTb,KVG,SFR,nL],[EKCTb,KVG,SFR,nL,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_281() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_282() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "G","Kw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Kw],[G],[G,Kw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_283() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RbzT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RbzT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_284() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","dkB","Eb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Eb],[dkB],[dkB,Eb],[V],[V,Eb],[V,dkB],[V,dkB,Eb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_285() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UJ","eeyL","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[eeyL],[eeyL,N],[UJ],[UJ,N],[UJ,eeyL],[UJ,eeyL,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_286() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oCiM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oCiM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_287() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pa","H","M","QnGlx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QnGlx],[M],[M,QnGlx],[H],[H,QnGlx],[H,M],[H,M,QnGlx],[pa],[pa,QnGlx],[pa,M],[pa,M,QnGlx],[pa,H],[pa,H,QnGlx],[pa,H,M],[pa,H,M,QnGlx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_288() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_289() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QA","v","J")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[J],[v],[v,J],[QA],[QA,J],[QA,v],[QA,v,J]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_290() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ls")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ls]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_291() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kpv","oFC","JUJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JUJ],[oFC],[oFC,JUJ],[kpv],[kpv,JUJ],[kpv,oFC],[kpv,oFC,JUJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_292() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pjM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pjM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_293() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Eyi","nXltb","FQfil","zXWp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zXWp],[FQfil],[FQfil,zXWp],[nXltb],[nXltb,zXWp],[nXltb,FQfil],[nXltb,FQfil,zXWp],[Eyi],[Eyi,zXWp],[Eyi,FQfil],[Eyi,FQfil,zXWp],[Eyi,nXltb],[Eyi,nXltb,zXWp],[Eyi,nXltb,FQfil],[Eyi,nXltb,FQfil,zXWp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_294() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fnI","BGCeb","kyUb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kyUb],[BGCeb],[BGCeb,kyUb],[fnI],[fnI,kyUb],[fnI,BGCeb],[fnI,BGCeb,kyUb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_295() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uW","jiyqF","UQ","sDN","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[sDN],[sDN,M],[UQ],[UQ,M],[UQ,sDN],[UQ,sDN,M],[jiyqF],[jiyqF,M],[jiyqF,sDN],[jiyqF,sDN,M],[jiyqF,UQ],[jiyqF,UQ,M],[jiyqF,UQ,sDN],[jiyqF,UQ,sDN,M],[uW],[uW,M],[uW,sDN],[uW,sDN,M],[uW,UQ],[uW,UQ,M],[uW,UQ,sDN],[uW,UQ,sDN,M],[uW,jiyqF],[uW,jiyqF,M],[uW,jiyqF,sDN],[uW,jiyqF,sDN,M],[uW,jiyqF,UQ],[uW,jiyqF,UQ,M],[uW,jiyqF,UQ,sDN],[uW,jiyqF,UQ,sDN,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_296() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LsdQ","HjM","GjFXZ","SRXr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SRXr],[GjFXZ],[GjFXZ,SRXr],[HjM],[HjM,SRXr],[HjM,GjFXZ],[HjM,GjFXZ,SRXr],[LsdQ],[LsdQ,SRXr],[LsdQ,GjFXZ],[LsdQ,GjFXZ,SRXr],[LsdQ,HjM],[LsdQ,HjM,SRXr],[LsdQ,HjM,GjFXZ],[LsdQ,HjM,GjFXZ,SRXr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_297() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nmit")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nmit]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_298() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Pg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Pg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_299() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OG","yJGw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yJGw],[OG],[OG,yJGw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_300() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JRqpD","OeAC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OeAC],[JRqpD],[JRqpD,OeAC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_301() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mpWZb","l","Xoc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xoc],[l],[l,Xoc],[mpWZb],[mpWZb,Xoc],[mpWZb,l],[mpWZb,l,Xoc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_302() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ps","lNugg","wpSX","pyvX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pyvX],[wpSX],[wpSX,pyvX],[lNugg],[lNugg,pyvX],[lNugg,wpSX],[lNugg,wpSX,pyvX],[ps],[ps,pyvX],[ps,wpSX],[ps,wpSX,pyvX],[ps,lNugg],[ps,lNugg,pyvX],[ps,lNugg,wpSX],[ps,lNugg,wpSX,pyvX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_303() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sc","EJSkO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EJSkO],[sc],[sc,EJSkO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_304() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yDpOb","A","FGEHR","g")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[g],[FGEHR],[FGEHR,g],[A],[A,g],[A,FGEHR],[A,FGEHR,g],[yDpOb],[yDpOb,g],[yDpOb,FGEHR],[yDpOb,FGEHR,g],[yDpOb,A],[yDpOb,A,g],[yDpOb,A,FGEHR],[yDpOb,A,FGEHR,g]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_305() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cd","rjqau","Wd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wd],[rjqau],[rjqau,Wd],[Cd],[Cd,Wd],[Cd,rjqau],[Cd,rjqau,Wd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_306() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YtN","wCtz","W","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[W],[W,N],[wCtz],[wCtz,N],[wCtz,W],[wCtz,W,N],[YtN],[YtN,N],[YtN,W],[YtN,W,N],[YtN,wCtz],[YtN,wCtz,N],[YtN,wCtz,W],[YtN,wCtz,W,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_307() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_308() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","C","Im","rVz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rVz],[Im],[Im,rVz],[C],[C,rVz],[C,Im],[C,Im,rVz],[r],[r,rVz],[r,Im],[r,Im,rVz],[r,C],[r,C,rVz],[r,C,Im],[r,C,Im,rVz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_309() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gHR","pzKZL","BXgj","qYcNN","Xe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xe],[qYcNN],[qYcNN,Xe],[BXgj],[BXgj,Xe],[BXgj,qYcNN],[BXgj,qYcNN,Xe],[pzKZL],[pzKZL,Xe],[pzKZL,qYcNN],[pzKZL,qYcNN,Xe],[pzKZL,BXgj],[pzKZL,BXgj,Xe],[pzKZL,BXgj,qYcNN],[pzKZL,BXgj,qYcNN,Xe],[gHR],[gHR,Xe],[gHR,qYcNN],[gHR,qYcNN,Xe],[gHR,BXgj],[gHR,BXgj,Xe],[gHR,BXgj,qYcNN],[gHR,BXgj,qYcNN,Xe],[gHR,pzKZL],[gHR,pzKZL,Xe],[gHR,pzKZL,qYcNN],[gHR,pzKZL,qYcNN,Xe],[gHR,pzKZL,BXgj],[gHR,pzKZL,BXgj,Xe],[gHR,pzKZL,BXgj,qYcNN],[gHR,pzKZL,BXgj,qYcNN,Xe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_310() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QJqj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QJqj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_311() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W","hU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hU],[W],[W,hU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_312() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QsYUy","kOFS","tV","bAoJy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bAoJy],[tV],[tV,bAoJy],[kOFS],[kOFS,bAoJy],[kOFS,tV],[kOFS,tV,bAoJy],[QsYUy],[QsYUy,bAoJy],[QsYUy,tV],[QsYUy,tV,bAoJy],[QsYUy,kOFS],[QsYUy,kOFS,bAoJy],[QsYUy,kOFS,tV],[QsYUy,kOFS,tV,bAoJy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_313() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zyv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Zyv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_314() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W","i","Y","xmTsJ","NlRo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NlRo],[xmTsJ],[xmTsJ,NlRo],[Y],[Y,NlRo],[Y,xmTsJ],[Y,xmTsJ,NlRo],[i],[i,NlRo],[i,xmTsJ],[i,xmTsJ,NlRo],[i,Y],[i,Y,NlRo],[i,Y,xmTsJ],[i,Y,xmTsJ,NlRo],[W],[W,NlRo],[W,xmTsJ],[W,xmTsJ,NlRo],[W,Y],[W,Y,NlRo],[W,Y,xmTsJ],[W,Y,xmTsJ,NlRo],[W,i],[W,i,NlRo],[W,i,xmTsJ],[W,i,xmTsJ,NlRo],[W,i,Y],[W,i,Y,NlRo],[W,i,Y,xmTsJ],[W,i,Y,xmTsJ,NlRo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_315() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JfD","PaUKt","Rgc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Rgc],[PaUKt],[PaUKt,Rgc],[JfD],[JfD,Rgc],[JfD,PaUKt],[JfD,PaUKt,Rgc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_316() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rCna")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rCna]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_317() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JOvp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JOvp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_318() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qVpKY","hHKe","kpP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kpP],[hHKe],[hHKe,kpP],[qVpKY],[qVpKY,kpP],[qVpKY,hHKe],[qVpKY,hHKe,kpP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_319() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","Sl","bDNww","ih")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ih],[bDNww],[bDNww,ih],[Sl],[Sl,ih],[Sl,bDNww],[Sl,bDNww,ih],[B],[B,ih],[B,bDNww],[B,bDNww,ih],[B,Sl],[B,Sl,ih],[B,Sl,bDNww],[B,Sl,bDNww,ih]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_320() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","aGk","zit","G","mwqzb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mwqzb],[G],[G,mwqzb],[zit],[zit,mwqzb],[zit,G],[zit,G,mwqzb],[aGk],[aGk,mwqzb],[aGk,G],[aGk,G,mwqzb],[aGk,zit],[aGk,zit,mwqzb],[aGk,zit,G],[aGk,zit,G,mwqzb],[p],[p,mwqzb],[p,G],[p,G,mwqzb],[p,zit],[p,zit,mwqzb],[p,zit,G],[p,zit,G,mwqzb],[p,aGk],[p,aGk,mwqzb],[p,aGk,G],[p,aGk,G,mwqzb],[p,aGk,zit],[p,aGk,zit,mwqzb],[p,aGk,zit,G],[p,aGk,zit,G,mwqzb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_321() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zndh","mYa","L","cqPS","olK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[olK],[cqPS],[cqPS,olK],[L],[L,olK],[L,cqPS],[L,cqPS,olK],[mYa],[mYa,olK],[mYa,cqPS],[mYa,cqPS,olK],[mYa,L],[mYa,L,olK],[mYa,L,cqPS],[mYa,L,cqPS,olK],[zndh],[zndh,olK],[zndh,cqPS],[zndh,cqPS,olK],[zndh,L],[zndh,L,olK],[zndh,L,cqPS],[zndh,L,cqPS,olK],[zndh,mYa],[zndh,mYa,olK],[zndh,mYa,cqPS],[zndh,mYa,cqPS,olK],[zndh,mYa,L],[zndh,mYa,L,olK],[zndh,mYa,L,cqPS],[zndh,mYa,L,cqPS,olK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_322() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qhG","c","w","MGGK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MGGK],[w],[w,MGGK],[c],[c,MGGK],[c,w],[c,w,MGGK],[qhG],[qhG,MGGK],[qhG,w],[qhG,w,MGGK],[qhG,c],[qhG,c,MGGK],[qhG,c,w],[qhG,c,w,MGGK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_323() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hVdXu","VFUeD","bpI","nVry")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nVry],[bpI],[bpI,nVry],[VFUeD],[VFUeD,nVry],[VFUeD,bpI],[VFUeD,bpI,nVry],[hVdXu],[hVdXu,nVry],[hVdXu,bpI],[hVdXu,bpI,nVry],[hVdXu,VFUeD],[hVdXu,VFUeD,nVry],[hVdXu,VFUeD,bpI],[hVdXu,VFUeD,bpI,nVry]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_324() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WHC","fsh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fsh],[WHC],[WHC,fsh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_325() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hJpR","xbLtP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xbLtP],[hJpR],[hJpR,xbLtP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_326() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","c")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[c],[q],[q,c]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_327() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "e","HyN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HyN],[e],[e,HyN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_328() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bG","E","m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m],[E],[E,m],[bG],[bG,m],[bG,E],[bG,E,m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_329() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","ef","jBSM","Af","mw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mw],[Af],[Af,mw],[jBSM],[jBSM,mw],[jBSM,Af],[jBSM,Af,mw],[ef],[ef,mw],[ef,Af],[ef,Af,mw],[ef,jBSM],[ef,jBSM,mw],[ef,jBSM,Af],[ef,jBSM,Af,mw],[P],[P,mw],[P,Af],[P,Af,mw],[P,jBSM],[P,jBSM,mw],[P,jBSM,Af],[P,jBSM,Af,mw],[P,ef],[P,ef,mw],[P,ef,Af],[P,ef,Af,mw],[P,ef,jBSM],[P,ef,jBSM,mw],[P,ef,jBSM,Af],[P,ef,jBSM,Af,mw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_330() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","E","njUQn","pLhHP","Ut")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ut],[pLhHP],[pLhHP,Ut],[njUQn],[njUQn,Ut],[njUQn,pLhHP],[njUQn,pLhHP,Ut],[E],[E,Ut],[E,pLhHP],[E,pLhHP,Ut],[E,njUQn],[E,njUQn,Ut],[E,njUQn,pLhHP],[E,njUQn,pLhHP,Ut],[b],[b,Ut],[b,pLhHP],[b,pLhHP,Ut],[b,njUQn],[b,njUQn,Ut],[b,njUQn,pLhHP],[b,njUQn,pLhHP,Ut],[b,E],[b,E,Ut],[b,E,pLhHP],[b,E,pLhHP,Ut],[b,E,njUQn],[b,E,njUQn,Ut],[b,E,njUQn,pLhHP],[b,E,njUQn,pLhHP,Ut]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_331() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","C","e","v","IYi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IYi],[v],[v,IYi],[e],[e,IYi],[e,v],[e,v,IYi],[C],[C,IYi],[C,v],[C,v,IYi],[C,e],[C,e,IYi],[C,e,v],[C,e,v,IYi],[Q],[Q,IYi],[Q,v],[Q,v,IYi],[Q,e],[Q,e,IYi],[Q,e,v],[Q,e,v,IYi],[Q,C],[Q,C,IYi],[Q,C,v],[Q,C,v,IYi],[Q,C,e],[Q,C,e,IYi],[Q,C,e,v],[Q,C,e,v,IYi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_332() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vqPtU","ViFu","zzRuh","BcTg","oNOfc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oNOfc],[BcTg],[BcTg,oNOfc],[zzRuh],[zzRuh,oNOfc],[zzRuh,BcTg],[zzRuh,BcTg,oNOfc],[ViFu],[ViFu,oNOfc],[ViFu,BcTg],[ViFu,BcTg,oNOfc],[ViFu,zzRuh],[ViFu,zzRuh,oNOfc],[ViFu,zzRuh,BcTg],[ViFu,zzRuh,BcTg,oNOfc],[vqPtU],[vqPtU,oNOfc],[vqPtU,BcTg],[vqPtU,BcTg,oNOfc],[vqPtU,zzRuh],[vqPtU,zzRuh,oNOfc],[vqPtU,zzRuh,BcTg],[vqPtU,zzRuh,BcTg,oNOfc],[vqPtU,ViFu],[vqPtU,ViFu,oNOfc],[vqPtU,ViFu,BcTg],[vqPtU,ViFu,BcTg,oNOfc],[vqPtU,ViFu,zzRuh],[vqPtU,ViFu,zzRuh,oNOfc],[vqPtU,ViFu,zzRuh,BcTg],[vqPtU,ViFu,zzRuh,BcTg,oNOfc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_333() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "se","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[se],[se,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_334() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tBa","XMn","Bk","fxP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fxP],[Bk],[Bk,fxP],[XMn],[XMn,fxP],[XMn,Bk],[XMn,Bk,fxP],[tBa],[tBa,fxP],[tBa,Bk],[tBa,Bk,fxP],[tBa,XMn],[tBa,XMn,fxP],[tBa,XMn,Bk],[tBa,XMn,Bk,fxP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_335() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xXe","F")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[F],[xXe],[xXe,F]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_336() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cwV","UaqyC","V")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[V],[UaqyC],[UaqyC,V],[cwV],[cwV,V],[cwV,UaqyC],[cwV,UaqyC,V]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_337() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Plm","aJxg","YVJQM","Y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Y],[YVJQM],[YVJQM,Y],[aJxg],[aJxg,Y],[aJxg,YVJQM],[aJxg,YVJQM,Y],[Plm],[Plm,Y],[Plm,YVJQM],[Plm,YVJQM,Y],[Plm,aJxg],[Plm,aJxg,Y],[Plm,aJxg,YVJQM],[Plm,aJxg,YVJQM,Y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_338() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "plPY","ZUIk","Dm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Dm],[ZUIk],[ZUIk,Dm],[plPY],[plPY,Dm],[plPY,ZUIk],[plPY,ZUIk,Dm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_339() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DY","OmlQ","Jbvw","zvIWk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zvIWk],[Jbvw],[Jbvw,zvIWk],[OmlQ],[OmlQ,zvIWk],[OmlQ,Jbvw],[OmlQ,Jbvw,zvIWk],[DY],[DY,zvIWk],[DY,Jbvw],[DY,Jbvw,zvIWk],[DY,OmlQ],[DY,OmlQ,zvIWk],[DY,OmlQ,Jbvw],[DY,OmlQ,Jbvw,zvIWk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_340() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[t]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_341() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "c","CrNC","nPf","F","cPbnl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cPbnl],[F],[F,cPbnl],[nPf],[nPf,cPbnl],[nPf,F],[nPf,F,cPbnl],[CrNC],[CrNC,cPbnl],[CrNC,F],[CrNC,F,cPbnl],[CrNC,nPf],[CrNC,nPf,cPbnl],[CrNC,nPf,F],[CrNC,nPf,F,cPbnl],[c],[c,cPbnl],[c,F],[c,F,cPbnl],[c,nPf],[c,nPf,cPbnl],[c,nPf,F],[c,nPf,F,cPbnl],[c,CrNC],[c,CrNC,cPbnl],[c,CrNC,F],[c,CrNC,F,cPbnl],[c,CrNC,nPf],[c,CrNC,nPf,cPbnl],[c,CrNC,nPf,F],[c,CrNC,nPf,F,cPbnl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_342() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cpo","U","IsS","LIju","mmIW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mmIW],[LIju],[LIju,mmIW],[IsS],[IsS,mmIW],[IsS,LIju],[IsS,LIju,mmIW],[U],[U,mmIW],[U,LIju],[U,LIju,mmIW],[U,IsS],[U,IsS,mmIW],[U,IsS,LIju],[U,IsS,LIju,mmIW],[Cpo],[Cpo,mmIW],[Cpo,LIju],[Cpo,LIju,mmIW],[Cpo,IsS],[Cpo,IsS,mmIW],[Cpo,IsS,LIju],[Cpo,IsS,LIju,mmIW],[Cpo,U],[Cpo,U,mmIW],[Cpo,U,LIju],[Cpo,U,LIju,mmIW],[Cpo,U,IsS],[Cpo,U,IsS,mmIW],[Cpo,U,IsS,LIju],[Cpo,U,IsS,LIju,mmIW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_343() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","F","qzaSd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qzaSd],[F],[F,qzaSd],[D],[D,qzaSd],[D,F],[D,F,qzaSd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_344() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eGoTX","kbxDJ","Ima")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ima],[kbxDJ],[kbxDJ,Ima],[eGoTX],[eGoTX,Ima],[eGoTX,kbxDJ],[eGoTX,kbxDJ,Ima]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_345() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hLXqJ","T","mB","hbA","AvCF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AvCF],[hbA],[hbA,AvCF],[mB],[mB,AvCF],[mB,hbA],[mB,hbA,AvCF],[T],[T,AvCF],[T,hbA],[T,hbA,AvCF],[T,mB],[T,mB,AvCF],[T,mB,hbA],[T,mB,hbA,AvCF],[hLXqJ],[hLXqJ,AvCF],[hLXqJ,hbA],[hLXqJ,hbA,AvCF],[hLXqJ,mB],[hLXqJ,mB,AvCF],[hLXqJ,mB,hbA],[hLXqJ,mB,hbA,AvCF],[hLXqJ,T],[hLXqJ,T,AvCF],[hLXqJ,T,hbA],[hLXqJ,T,hbA,AvCF],[hLXqJ,T,mB],[hLXqJ,T,mB,AvCF],[hLXqJ,T,mB,hbA],[hLXqJ,T,mB,hbA,AvCF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_346() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rg","G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G],[rg],[rg,G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_347() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PTtm","GvBAu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GvBAu],[PTtm],[PTtm,GvBAu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_348() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EUK","KkiB","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[KkiB],[KkiB,M],[EUK],[EUK,M],[EUK,KkiB],[EUK,KkiB,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_349() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","R","T","ftw","YU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YU],[ftw],[ftw,YU],[T],[T,YU],[T,ftw],[T,ftw,YU],[R],[R,YU],[R,ftw],[R,ftw,YU],[R,T],[R,T,YU],[R,T,ftw],[R,T,ftw,YU],[q],[q,YU],[q,ftw],[q,ftw,YU],[q,T],[q,T,YU],[q,T,ftw],[q,T,ftw,YU],[q,R],[q,R,YU],[q,R,ftw],[q,R,ftw,YU],[q,R,T],[q,R,T,YU],[q,R,T,ftw],[q,R,T,ftw,YU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_350() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[D]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_351() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nAB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nAB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_352() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dnHj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dnHj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_353() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EA","WfSvY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WfSvY],[EA],[EA,WfSvY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_354() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ww","B","lp","hO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hO],[lp],[lp,hO],[B],[B,hO],[B,lp],[B,lp,hO],[ww],[ww,hO],[ww,lp],[ww,lp,hO],[ww,B],[ww,B,hO],[ww,B,lp],[ww,B,lp,hO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_355() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tmJs","X","ywbrx","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[ywbrx],[ywbrx,N],[X],[X,N],[X,ywbrx],[X,ywbrx,N],[tmJs],[tmJs,N],[tmJs,ywbrx],[tmJs,ywbrx,N],[tmJs,X],[tmJs,X,N],[tmJs,X,ywbrx],[tmJs,X,ywbrx,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_356() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Kr","ULA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ULA],[Kr],[Kr,ULA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_357() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "at","IXph","ONle","cR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cR],[ONle],[ONle,cR],[IXph],[IXph,cR],[IXph,ONle],[IXph,ONle,cR],[at],[at,cR],[at,ONle],[at,ONle,cR],[at,IXph],[at,IXph,cR],[at,IXph,ONle],[at,IXph,ONle,cR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_358() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zOCV","EkRpB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EkRpB],[zOCV],[zOCV,EkRpB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_359() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ktO","OhkGX","N","wf","SB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SB],[wf],[wf,SB],[N],[N,SB],[N,wf],[N,wf,SB],[OhkGX],[OhkGX,SB],[OhkGX,wf],[OhkGX,wf,SB],[OhkGX,N],[OhkGX,N,SB],[OhkGX,N,wf],[OhkGX,N,wf,SB],[ktO],[ktO,SB],[ktO,wf],[ktO,wf,SB],[ktO,N],[ktO,N,SB],[ktO,N,wf],[ktO,N,wf,SB],[ktO,OhkGX],[ktO,OhkGX,SB],[ktO,OhkGX,wf],[ktO,OhkGX,wf,SB],[ktO,OhkGX,N],[ktO,OhkGX,N,SB],[ktO,OhkGX,N,wf],[ktO,OhkGX,N,wf,SB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_360() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","qf","uYJu","ql")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ql],[uYJu],[uYJu,ql],[qf],[qf,ql],[qf,uYJu],[qf,uYJu,ql],[s],[s,ql],[s,uYJu],[s,uYJu,ql],[s,qf],[s,qf,ql],[s,qf,uYJu],[s,qf,uYJu,ql]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_361() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wAyDd","iS","Gae","wLPAU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wLPAU],[Gae],[Gae,wLPAU],[iS],[iS,wLPAU],[iS,Gae],[iS,Gae,wLPAU],[wAyDd],[wAyDd,wLPAU],[wAyDd,Gae],[wAyDd,Gae,wLPAU],[wAyDd,iS],[wAyDd,iS,wLPAU],[wAyDd,iS,Gae],[wAyDd,iS,Gae,wLPAU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_362() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_363() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nHqjl","PK","JI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JI],[PK],[PK,JI],[nHqjl],[nHqjl,JI],[nHqjl,PK],[nHqjl,PK,JI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_364() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SDV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SDV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_365() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_366() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pSNE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pSNE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_367() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rlG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rlG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_368() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oxj","dPQPL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dPQPL],[oxj],[oxj,dPQPL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_369() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","QVF","mb","upU","RYoLg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RYoLg],[upU],[upU,RYoLg],[mb],[mb,RYoLg],[mb,upU],[mb,upU,RYoLg],[QVF],[QVF,RYoLg],[QVF,upU],[QVF,upU,RYoLg],[QVF,mb],[QVF,mb,RYoLg],[QVF,mb,upU],[QVF,mb,upU,RYoLg],[P],[P,RYoLg],[P,upU],[P,upU,RYoLg],[P,mb],[P,mb,RYoLg],[P,mb,upU],[P,mb,upU,RYoLg],[P,QVF],[P,QVF,RYoLg],[P,QVF,upU],[P,QVF,upU,RYoLg],[P,QVF,mb],[P,QVF,mb,RYoLg],[P,QVF,mb,upU],[P,QVF,mb,upU,RYoLg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_370() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","yG","vVdSw","fwRP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fwRP],[vVdSw],[vVdSw,fwRP],[yG],[yG,fwRP],[yG,vVdSw],[yG,vVdSw,fwRP],[r],[r,fwRP],[r,vVdSw],[r,vVdSw,fwRP],[r,yG],[r,yG,fwRP],[r,yG,vVdSw],[r,yG,vVdSw,fwRP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_371() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "toTL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[toTL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_372() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bd","QGOfP","w","qZB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qZB],[w],[w,qZB],[QGOfP],[QGOfP,qZB],[QGOfP,w],[QGOfP,w,qZB],[Bd],[Bd,qZB],[Bd,w],[Bd,w,qZB],[Bd,QGOfP],[Bd,QGOfP,qZB],[Bd,QGOfP,w],[Bd,QGOfP,w,qZB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_373() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "G","AOkfm","mqYez","KzHwu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KzHwu],[mqYez],[mqYez,KzHwu],[AOkfm],[AOkfm,KzHwu],[AOkfm,mqYez],[AOkfm,mqYez,KzHwu],[G],[G,KzHwu],[G,mqYez],[G,mqYez,KzHwu],[G,AOkfm],[G,AOkfm,KzHwu],[G,AOkfm,mqYez],[G,AOkfm,mqYez,KzHwu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_374() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AenW","OMY","vP","RKX","bA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bA],[RKX],[RKX,bA],[vP],[vP,bA],[vP,RKX],[vP,RKX,bA],[OMY],[OMY,bA],[OMY,RKX],[OMY,RKX,bA],[OMY,vP],[OMY,vP,bA],[OMY,vP,RKX],[OMY,vP,RKX,bA],[AenW],[AenW,bA],[AenW,RKX],[AenW,RKX,bA],[AenW,vP],[AenW,vP,bA],[AenW,vP,RKX],[AenW,vP,RKX,bA],[AenW,OMY],[AenW,OMY,bA],[AenW,OMY,RKX],[AenW,OMY,RKX,bA],[AenW,OMY,vP],[AenW,OMY,vP,bA],[AenW,OMY,vP,RKX],[AenW,OMY,vP,RKX,bA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_375() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lmG","k","vR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vR],[k],[k,vR],[lmG],[lmG,vR],[lmG,k],[lmG,k,vR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_376() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mDh","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[mDh],[mDh,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_377() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jBmV","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[jBmV],[jBmV,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_378() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QJZG","Uk","Z","uMYqZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uMYqZ],[Z],[Z,uMYqZ],[Uk],[Uk,uMYqZ],[Uk,Z],[Uk,Z,uMYqZ],[QJZG],[QJZG,uMYqZ],[QJZG,Z],[QJZG,Z,uMYqZ],[QJZG,Uk],[QJZG,Uk,uMYqZ],[QJZG,Uk,Z],[QJZG,Uk,Z,uMYqZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_379() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hUM","QD","vlePj","rUk","kev")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kev],[rUk],[rUk,kev],[vlePj],[vlePj,kev],[vlePj,rUk],[vlePj,rUk,kev],[QD],[QD,kev],[QD,rUk],[QD,rUk,kev],[QD,vlePj],[QD,vlePj,kev],[QD,vlePj,rUk],[QD,vlePj,rUk,kev],[hUM],[hUM,kev],[hUM,rUk],[hUM,rUk,kev],[hUM,vlePj],[hUM,vlePj,kev],[hUM,vlePj,rUk],[hUM,vlePj,rUk,kev],[hUM,QD],[hUM,QD,kev],[hUM,QD,rUk],[hUM,QD,rUk,kev],[hUM,QD,vlePj],[hUM,QD,vlePj,kev],[hUM,QD,vlePj,rUk],[hUM,QD,vlePj,rUk,kev]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_380() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SD","Mb","XUX","cVp","Hg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Hg],[cVp],[cVp,Hg],[XUX],[XUX,Hg],[XUX,cVp],[XUX,cVp,Hg],[Mb],[Mb,Hg],[Mb,cVp],[Mb,cVp,Hg],[Mb,XUX],[Mb,XUX,Hg],[Mb,XUX,cVp],[Mb,XUX,cVp,Hg],[SD],[SD,Hg],[SD,cVp],[SD,cVp,Hg],[SD,XUX],[SD,XUX,Hg],[SD,XUX,cVp],[SD,XUX,cVp,Hg],[SD,Mb],[SD,Mb,Hg],[SD,Mb,cVp],[SD,Mb,cVp,Hg],[SD,Mb,XUX],[SD,Mb,XUX,Hg],[SD,Mb,XUX,cVp],[SD,Mb,XUX,cVp,Hg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_381() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","qs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qs],[q],[q,qs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_382() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YGI","HPS","L","lWxuN","SR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SR],[lWxuN],[lWxuN,SR],[L],[L,SR],[L,lWxuN],[L,lWxuN,SR],[HPS],[HPS,SR],[HPS,lWxuN],[HPS,lWxuN,SR],[HPS,L],[HPS,L,SR],[HPS,L,lWxuN],[HPS,L,lWxuN,SR],[YGI],[YGI,SR],[YGI,lWxuN],[YGI,lWxuN,SR],[YGI,L],[YGI,L,SR],[YGI,L,lWxuN],[YGI,L,lWxuN,SR],[YGI,HPS],[YGI,HPS,SR],[YGI,HPS,lWxuN],[YGI,HPS,lWxuN,SR],[YGI,HPS,L],[YGI,HPS,L,SR],[YGI,HPS,L,lWxuN],[YGI,HPS,L,lWxuN,SR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_383() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OKog","MLIV","Iml")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Iml],[MLIV],[MLIV,Iml],[OKog],[OKog,Iml],[OKog,MLIV],[OKog,MLIV,Iml]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_384() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cDLf","KB","l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l],[KB],[KB,l],[cDLf],[cDLf,l],[cDLf,KB],[cDLf,KB,l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_385() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qxl","J","CZLwc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CZLwc],[J],[J,CZLwc],[qxl],[qxl,CZLwc],[qxl,J],[qxl,J,CZLwc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_386() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZGkx","wvV","gWF","rdvqz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rdvqz],[gWF],[gWF,rdvqz],[wvV],[wvV,rdvqz],[wvV,gWF],[wvV,gWF,rdvqz],[ZGkx],[ZGkx,rdvqz],[ZGkx,gWF],[ZGkx,gWF,rdvqz],[ZGkx,wvV],[ZGkx,wvV,rdvqz],[ZGkx,wvV,gWF],[ZGkx,wvV,gWF,rdvqz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_387() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_388() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jiYvs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jiYvs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_389() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bziav")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bziav]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_390() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SrWJF","Bi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Bi],[SrWJF],[SrWJF,Bi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_391() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CiIWT","RgE","i","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[i],[i,o],[RgE],[RgE,o],[RgE,i],[RgE,i,o],[CiIWT],[CiIWT,o],[CiIWT,i],[CiIWT,i,o],[CiIWT,RgE],[CiIWT,RgE,o],[CiIWT,RgE,i],[CiIWT,RgE,i,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_392() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Vo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_393() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qEvUR","K","UC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UC],[K],[K,UC],[qEvUR],[qEvUR,UC],[qEvUR,K],[qEvUR,K,UC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_394() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_395() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rIi","exQqv","u","JzWK","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[JzWK],[JzWK,Z],[u],[u,Z],[u,JzWK],[u,JzWK,Z],[exQqv],[exQqv,Z],[exQqv,JzWK],[exQqv,JzWK,Z],[exQqv,u],[exQqv,u,Z],[exQqv,u,JzWK],[exQqv,u,JzWK,Z],[rIi],[rIi,Z],[rIi,JzWK],[rIi,JzWK,Z],[rIi,u],[rIi,u,Z],[rIi,u,JzWK],[rIi,u,JzWK,Z],[rIi,exQqv],[rIi,exQqv,Z],[rIi,exQqv,JzWK],[rIi,exQqv,JzWK,Z],[rIi,exQqv,u],[rIi,exQqv,u,Z],[rIi,exQqv,u,JzWK],[rIi,exQqv,u,JzWK,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_396() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_397() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VmA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VmA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_398() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "g","xQ","HMAi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HMAi],[xQ],[xQ,HMAi],[g],[g,HMAi],[g,xQ],[g,xQ,HMAi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_399() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_400() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qgadw","yR","z","fRFm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fRFm],[z],[z,fRFm],[yR],[yR,fRFm],[yR,z],[yR,z,fRFm],[qgadw],[qgadw,fRFm],[qgadw,z],[qgadw,z,fRFm],[qgadw,yR],[qgadw,yR,fRFm],[qgadw,yR,z],[qgadw,yR,z,fRFm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_401() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ihWtJ","yoXzm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yoXzm],[ihWtJ],[ihWtJ,yoXzm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_402() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "S","e","z","M","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[M],[M,n],[z],[z,n],[z,M],[z,M,n],[e],[e,n],[e,M],[e,M,n],[e,z],[e,z,n],[e,z,M],[e,z,M,n],[S],[S,n],[S,M],[S,M,n],[S,z],[S,z,n],[S,z,M],[S,z,M,n],[S,e],[S,e,n],[S,e,M],[S,e,M,n],[S,e,z],[S,e,z,n],[S,e,z,M],[S,e,z,M,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_403() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sNVa","C","U","dEoDs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dEoDs],[U],[U,dEoDs],[C],[C,dEoDs],[C,U],[C,U,dEoDs],[sNVa],[sNVa,dEoDs],[sNVa,U],[sNVa,U,dEoDs],[sNVa,C],[sNVa,C,dEoDs],[sNVa,C,U],[sNVa,C,U,dEoDs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_404() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f","bDL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bDL],[f],[f,bDL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_405() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZXIG","rIbFK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rIbFK],[ZXIG],[ZXIG,rIbFK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_406() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jsSZ","e","vC","aNK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aNK],[vC],[vC,aNK],[e],[e,aNK],[e,vC],[e,vC,aNK],[jsSZ],[jsSZ,aNK],[jsSZ,vC],[jsSZ,vC,aNK],[jsSZ,e],[jsSZ,e,aNK],[jsSZ,e,vC],[jsSZ,e,vC,aNK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_407() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UbH","JHSA","iH","Ud")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ud],[iH],[iH,Ud],[JHSA],[JHSA,Ud],[JHSA,iH],[JHSA,iH,Ud],[UbH],[UbH,Ud],[UbH,iH],[UbH,iH,Ud],[UbH,JHSA],[UbH,JHSA,Ud],[UbH,JHSA,iH],[UbH,JHSA,iH,Ud]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_408() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","SJ","tftCF","VS","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[VS],[VS,o],[tftCF],[tftCF,o],[tftCF,VS],[tftCF,VS,o],[SJ],[SJ,o],[SJ,VS],[SJ,VS,o],[SJ,tftCF],[SJ,tftCF,o],[SJ,tftCF,VS],[SJ,tftCF,VS,o],[D],[D,o],[D,VS],[D,VS,o],[D,tftCF],[D,tftCF,o],[D,tftCF,VS],[D,tftCF,VS,o],[D,SJ],[D,SJ,o],[D,SJ,VS],[D,SJ,VS,o],[D,SJ,tftCF],[D,SJ,tftCF,o],[D,SJ,tftCF,VS],[D,SJ,tftCF,VS,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_409() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tH","sPuu","HdvnS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HdvnS],[sPuu],[sPuu,HdvnS],[tH],[tH,HdvnS],[tH,sPuu],[tH,sPuu,HdvnS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_410() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qkka","CPA","AmC","Nx","m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m],[Nx],[Nx,m],[AmC],[AmC,m],[AmC,Nx],[AmC,Nx,m],[CPA],[CPA,m],[CPA,Nx],[CPA,Nx,m],[CPA,AmC],[CPA,AmC,m],[CPA,AmC,Nx],[CPA,AmC,Nx,m],[qkka],[qkka,m],[qkka,Nx],[qkka,Nx,m],[qkka,AmC],[qkka,AmC,m],[qkka,AmC,Nx],[qkka,AmC,Nx,m],[qkka,CPA],[qkka,CPA,m],[qkka,CPA,Nx],[qkka,CPA,Nx,m],[qkka,CPA,AmC],[qkka,CPA,AmC,m],[qkka,CPA,AmC,Nx],[qkka,CPA,AmC,Nx,m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_411() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "waJ","H","TCuu","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[TCuu],[TCuu,N],[H],[H,N],[H,TCuu],[H,TCuu,N],[waJ],[waJ,N],[waJ,TCuu],[waJ,TCuu,N],[waJ,H],[waJ,H,N],[waJ,H,TCuu],[waJ,H,TCuu,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_412() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nu","myx","glogp","uigK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uigK],[glogp],[glogp,uigK],[myx],[myx,uigK],[myx,glogp],[myx,glogp,uigK],[nu],[nu,uigK],[nu,glogp],[nu,glogp,uigK],[nu,myx],[nu,myx,uigK],[nu,myx,glogp],[nu,myx,glogp,uigK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_413() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZeY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZeY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_414() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","u","BmqZA","VA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VA],[BmqZA],[BmqZA,VA],[u],[u,VA],[u,BmqZA],[u,BmqZA,VA],[R],[R,VA],[R,BmqZA],[R,BmqZA,VA],[R,u],[R,u,VA],[R,u,BmqZA],[R,u,BmqZA,VA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_415() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_416() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "w","mYT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mYT],[w],[w,mYT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_417() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NnSBg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NnSBg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_418() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PApdk","rT","se","tw","agB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[agB],[tw],[tw,agB],[se],[se,agB],[se,tw],[se,tw,agB],[rT],[rT,agB],[rT,tw],[rT,tw,agB],[rT,se],[rT,se,agB],[rT,se,tw],[rT,se,tw,agB],[PApdk],[PApdk,agB],[PApdk,tw],[PApdk,tw,agB],[PApdk,se],[PApdk,se,agB],[PApdk,se,tw],[PApdk,se,tw,agB],[PApdk,rT],[PApdk,rT,agB],[PApdk,rT,tw],[PApdk,rT,tw,agB],[PApdk,rT,se],[PApdk,rT,se,agB],[PApdk,rT,se,tw],[PApdk,rT,se,tw,agB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_419() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","KwBBL","pj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pj],[KwBBL],[KwBBL,pj],[d],[d,pj],[d,KwBBL],[d,KwBBL,pj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_420() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wcrx","v","OKSf","VmMLj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VmMLj],[OKSf],[OKSf,VmMLj],[v],[v,VmMLj],[v,OKSf],[v,OKSf,VmMLj],[wcrx],[wcrx,VmMLj],[wcrx,OKSf],[wcrx,OKSf,VmMLj],[wcrx,v],[wcrx,v,VmMLj],[wcrx,v,OKSf],[wcrx,v,OKSf,VmMLj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_421() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mq","u","Rjl","uz","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[uz],[uz,Z],[Rjl],[Rjl,Z],[Rjl,uz],[Rjl,uz,Z],[u],[u,Z],[u,uz],[u,uz,Z],[u,Rjl],[u,Rjl,Z],[u,Rjl,uz],[u,Rjl,uz,Z],[mq],[mq,Z],[mq,uz],[mq,uz,Z],[mq,Rjl],[mq,Rjl,Z],[mq,Rjl,uz],[mq,Rjl,uz,Z],[mq,u],[mq,u,Z],[mq,u,uz],[mq,u,uz,Z],[mq,u,Rjl],[mq,u,Rjl,Z],[mq,u,Rjl,uz],[mq,u,Rjl,uz,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_422() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Jy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Jy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_423() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QGtmh","KvBs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KvBs],[QGtmh],[QGtmh,KvBs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_424() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UI","v","k","eQ","wpyj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wpyj],[eQ],[eQ,wpyj],[k],[k,wpyj],[k,eQ],[k,eQ,wpyj],[v],[v,wpyj],[v,eQ],[v,eQ,wpyj],[v,k],[v,k,wpyj],[v,k,eQ],[v,k,eQ,wpyj],[UI],[UI,wpyj],[UI,eQ],[UI,eQ,wpyj],[UI,k],[UI,k,wpyj],[UI,k,eQ],[UI,k,eQ,wpyj],[UI,v],[UI,v,wpyj],[UI,v,eQ],[UI,v,eQ,wpyj],[UI,v,k],[UI,v,k,wpyj],[UI,v,k,eQ],[UI,v,k,eQ,wpyj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_425() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RgZ","bCbDE","uk","PWT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PWT],[uk],[uk,PWT],[bCbDE],[bCbDE,PWT],[bCbDE,uk],[bCbDE,uk,PWT],[RgZ],[RgZ,PWT],[RgZ,uk],[RgZ,uk,PWT],[RgZ,bCbDE],[RgZ,bCbDE,PWT],[RgZ,bCbDE,uk],[RgZ,bCbDE,uk,PWT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_426() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "i")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[i]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_427() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ejcJU","zbS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zbS],[ejcJU],[ejcJU,zbS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_428() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eDtB","HxBV","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[HxBV],[HxBV,M],[eDtB],[eDtB,M],[eDtB,HxBV],[eDtB,HxBV,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_429() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oDgg","DDG","ZP","oUZTz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oUZTz],[ZP],[ZP,oUZTz],[DDG],[DDG,oUZTz],[DDG,ZP],[DDG,ZP,oUZTz],[oDgg],[oDgg,oUZTz],[oDgg,ZP],[oDgg,ZP,oUZTz],[oDgg,DDG],[oDgg,DDG,oUZTz],[oDgg,DDG,ZP],[oDgg,DDG,ZP,oUZTz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_430() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "I","UO","oDMAp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oDMAp],[UO],[UO,oDMAp],[I],[I,oDMAp],[I,UO],[I,UO,oDMAp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_431() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sed","Rf","tBh","RnJI","sB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sB],[RnJI],[RnJI,sB],[tBh],[tBh,sB],[tBh,RnJI],[tBh,RnJI,sB],[Rf],[Rf,sB],[Rf,RnJI],[Rf,RnJI,sB],[Rf,tBh],[Rf,tBh,sB],[Rf,tBh,RnJI],[Rf,tBh,RnJI,sB],[sed],[sed,sB],[sed,RnJI],[sed,RnJI,sB],[sed,tBh],[sed,tBh,sB],[sed,tBh,RnJI],[sed,tBh,RnJI,sB],[sed,Rf],[sed,Rf,sB],[sed,Rf,RnJI],[sed,Rf,RnJI,sB],[sed,Rf,tBh],[sed,Rf,tBh,sB],[sed,Rf,tBh,RnJI],[sed,Rf,tBh,RnJI,sB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_432() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "u","muT","geJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[geJ],[muT],[muT,geJ],[u],[u,geJ],[u,muT],[u,muT,geJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_433() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wN","AOmZL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AOmZL],[wN],[wN,AOmZL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_434() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iyGoT","Boo","mds")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mds],[Boo],[Boo,mds],[iyGoT],[iyGoT,mds],[iyGoT,Boo],[iyGoT,Boo,mds]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_435() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FZF","brb","pw","I")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[I],[pw],[pw,I],[brb],[brb,I],[brb,pw],[brb,pw,I],[FZF],[FZF,I],[FZF,pw],[FZF,pw,I],[FZF,brb],[FZF,brb,I],[FZF,brb,pw],[FZF,brb,pw,I]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_436() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","Mxw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mxw],[d],[d,Mxw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_437() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JiO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JiO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_438() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UV","X")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[X],[UV],[UV,X]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_439() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YCGjK","pN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pN],[YCGjK],[YCGjK,pN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_440() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "frltX","yLXMl","I","IZKRl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IZKRl],[I],[I,IZKRl],[yLXMl],[yLXMl,IZKRl],[yLXMl,I],[yLXMl,I,IZKRl],[frltX],[frltX,IZKRl],[frltX,I],[frltX,I,IZKRl],[frltX,yLXMl],[frltX,yLXMl,IZKRl],[frltX,yLXMl,I],[frltX,yLXMl,I,IZKRl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_441() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "u","Yieu","dlu","vsUC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vsUC],[dlu],[dlu,vsUC],[Yieu],[Yieu,vsUC],[Yieu,dlu],[Yieu,dlu,vsUC],[u],[u,vsUC],[u,dlu],[u,dlu,vsUC],[u,Yieu],[u,Yieu,vsUC],[u,Yieu,dlu],[u,Yieu,dlu,vsUC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_442() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nVKUm","xMCRU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xMCRU],[nVKUm],[nVKUm,xMCRU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_443() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "u")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[u]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_444() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[A]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_445() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "u","JF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JF],[u],[u,JF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_446() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ctev","U","KWE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KWE],[U],[U,KWE],[Ctev],[Ctev,KWE],[Ctev,U],[Ctev,U,KWE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_447() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","IAK","UMS","rKWwM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rKWwM],[UMS],[UMS,rKWwM],[IAK],[IAK,rKWwM],[IAK,UMS],[IAK,UMS,rKWwM],[q],[q,rKWwM],[q,UMS],[q,UMS,rKWwM],[q,IAK],[q,IAK,rKWwM],[q,IAK,UMS],[q,IAK,UMS,rKWwM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_448() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tvk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tvk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_449() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jEMcG","E","h")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[h],[E],[E,h],[jEMcG],[jEMcG,h],[jEMcG,E],[jEMcG,E,h]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_450() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","pYxq","f","Y","ihj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ihj],[Y],[Y,ihj],[f],[f,ihj],[f,Y],[f,Y,ihj],[pYxq],[pYxq,ihj],[pYxq,Y],[pYxq,Y,ihj],[pYxq,f],[pYxq,f,ihj],[pYxq,f,Y],[pYxq,f,Y,ihj],[t],[t,ihj],[t,Y],[t,Y,ihj],[t,f],[t,f,ihj],[t,f,Y],[t,f,Y,ihj],[t,pYxq],[t,pYxq,ihj],[t,pYxq,Y],[t,pYxq,Y,ihj],[t,pYxq,f],[t,pYxq,f,ihj],[t,pYxq,f,Y],[t,pYxq,f,Y,ihj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_451() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eZcco","U","JIE","VD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VD],[JIE],[JIE,VD],[U],[U,VD],[U,JIE],[U,JIE,VD],[eZcco],[eZcco,VD],[eZcco,JIE],[eZcco,JIE,VD],[eZcco,U],[eZcco,U,VD],[eZcco,U,JIE],[eZcco,U,JIE,VD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_452() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PR","zY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zY],[PR],[PR,zY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_453() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lpczB","Aizwq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Aizwq],[lpczB],[lpczB,Aizwq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_454() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f","Xu","poOI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[poOI],[Xu],[Xu,poOI],[f],[f,poOI],[f,Xu],[f,Xu,poOI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_455() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mSXX","sh","H","zaA","QM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QM],[zaA],[zaA,QM],[H],[H,QM],[H,zaA],[H,zaA,QM],[sh],[sh,QM],[sh,zaA],[sh,zaA,QM],[sh,H],[sh,H,QM],[sh,H,zaA],[sh,H,zaA,QM],[mSXX],[mSXX,QM],[mSXX,zaA],[mSXX,zaA,QM],[mSXX,H],[mSXX,H,QM],[mSXX,H,zaA],[mSXX,H,zaA,QM],[mSXX,sh],[mSXX,sh,QM],[mSXX,sh,zaA],[mSXX,sh,zaA,QM],[mSXX,sh,H],[mSXX,sh,H,QM],[mSXX,sh,H,zaA],[mSXX,sh,H,zaA,QM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_456() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Tg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_457() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "S","XJHG","fgFI","iHM","QjlrG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QjlrG],[iHM],[iHM,QjlrG],[fgFI],[fgFI,QjlrG],[fgFI,iHM],[fgFI,iHM,QjlrG],[XJHG],[XJHG,QjlrG],[XJHG,iHM],[XJHG,iHM,QjlrG],[XJHG,fgFI],[XJHG,fgFI,QjlrG],[XJHG,fgFI,iHM],[XJHG,fgFI,iHM,QjlrG],[S],[S,QjlrG],[S,iHM],[S,iHM,QjlrG],[S,fgFI],[S,fgFI,QjlrG],[S,fgFI,iHM],[S,fgFI,iHM,QjlrG],[S,XJHG],[S,XJHG,QjlrG],[S,XJHG,iHM],[S,XJHG,iHM,QjlrG],[S,XJHG,fgFI],[S,XJHG,fgFI,QjlrG],[S,XJHG,fgFI,iHM],[S,XJHG,fgFI,iHM,QjlrG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_458() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iUFm","AoLet")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AoLet],[iUFm],[iUFm,AoLet]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_459() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zbUH","FBp","fK","Sae","hgNh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hgNh],[Sae],[Sae,hgNh],[fK],[fK,hgNh],[fK,Sae],[fK,Sae,hgNh],[FBp],[FBp,hgNh],[FBp,Sae],[FBp,Sae,hgNh],[FBp,fK],[FBp,fK,hgNh],[FBp,fK,Sae],[FBp,fK,Sae,hgNh],[zbUH],[zbUH,hgNh],[zbUH,Sae],[zbUH,Sae,hgNh],[zbUH,fK],[zbUH,fK,hgNh],[zbUH,fK,Sae],[zbUH,fK,Sae,hgNh],[zbUH,FBp],[zbUH,FBp,hgNh],[zbUH,FBp,Sae],[zbUH,FBp,Sae,hgNh],[zbUH,FBp,fK],[zbUH,FBp,fK,hgNh],[zbUH,FBp,fK,Sae],[zbUH,FBp,fK,Sae,hgNh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_460() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hFIAP","EEx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EEx],[hFIAP],[hFIAP,EEx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_461() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mepHV","DhL","ApBc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ApBc],[DhL],[DhL,ApBc],[mepHV],[mepHV,ApBc],[mepHV,DhL],[mepHV,DhL,ApBc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_462() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FSdxf","RflvU","rEFeU","MJt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MJt],[rEFeU],[rEFeU,MJt],[RflvU],[RflvU,MJt],[RflvU,rEFeU],[RflvU,rEFeU,MJt],[FSdxf],[FSdxf,MJt],[FSdxf,rEFeU],[FSdxf,rEFeU,MJt],[FSdxf,RflvU],[FSdxf,RflvU,MJt],[FSdxf,RflvU,rEFeU],[FSdxf,RflvU,rEFeU,MJt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_463() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hY","G","qJ","Joa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Joa],[qJ],[qJ,Joa],[G],[G,Joa],[G,qJ],[G,qJ,Joa],[hY],[hY,Joa],[hY,qJ],[hY,qJ,Joa],[hY,G],[hY,G,Joa],[hY,G,qJ],[hY,G,qJ,Joa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_464() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sNL","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[sNL],[sNL,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_465() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Jk","WJX","dc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dc],[WJX],[WJX,dc],[Jk],[Jk,dc],[Jk,WJX],[Jk,WJX,dc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_466() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rt","hugUS","Vd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vd],[hugUS],[hugUS,Vd],[rt],[rt,Vd],[rt,hugUS],[rt,hugUS,Vd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_467() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","DJp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DJp],[V],[V,DJp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_468() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mPt","tCAos","qMqh","x","gHMqh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gHMqh],[x],[x,gHMqh],[qMqh],[qMqh,gHMqh],[qMqh,x],[qMqh,x,gHMqh],[tCAos],[tCAos,gHMqh],[tCAos,x],[tCAos,x,gHMqh],[tCAos,qMqh],[tCAos,qMqh,gHMqh],[tCAos,qMqh,x],[tCAos,qMqh,x,gHMqh],[mPt],[mPt,gHMqh],[mPt,x],[mPt,x,gHMqh],[mPt,qMqh],[mPt,qMqh,gHMqh],[mPt,qMqh,x],[mPt,qMqh,x,gHMqh],[mPt,tCAos],[mPt,tCAos,gHMqh],[mPt,tCAos,x],[mPt,tCAos,x,gHMqh],[mPt,tCAos,qMqh],[mPt,tCAos,qMqh,gHMqh],[mPt,tCAos,qMqh,x],[mPt,tCAos,qMqh,x,gHMqh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_469() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SrXA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SrXA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_470() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RaMt","ZOIMb","LluCe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LluCe],[ZOIMb],[ZOIMb,LluCe],[RaMt],[RaMt,LluCe],[RaMt,ZOIMb],[RaMt,ZOIMb,LluCe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_471() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uKw","GPz","XYeft","qH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qH],[XYeft],[XYeft,qH],[GPz],[GPz,qH],[GPz,XYeft],[GPz,XYeft,qH],[uKw],[uKw,qH],[uKw,XYeft],[uKw,XYeft,qH],[uKw,GPz],[uKw,GPz,qH],[uKw,GPz,XYeft],[uKw,GPz,XYeft,qH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_472() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yHh","UhqB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UhqB],[yHh],[yHh,UhqB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_473() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "F","G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G],[F],[F,G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_474() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ght","j","Z","Tpaav")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tpaav],[Z],[Z,Tpaav],[j],[j,Tpaav],[j,Z],[j,Z,Tpaav],[ght],[ght,Tpaav],[ght,Z],[ght,Z,Tpaav],[ght,j],[ght,j,Tpaav],[ght,j,Z],[ght,j,Z,Tpaav]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_475() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cC","llrL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[llrL],[cC],[cC,llrL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_476() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CF","sDJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sDJ],[CF],[CF,sDJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_477() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","Wj","Ujz","rZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rZ],[Ujz],[Ujz,rZ],[Wj],[Wj,rZ],[Wj,Ujz],[Wj,Ujz,rZ],[b],[b,rZ],[b,Ujz],[b,Ujz,rZ],[b,Wj],[b,Wj,rZ],[b,Wj,Ujz],[b,Wj,Ujz,rZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_478() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xlz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xlz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_479() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","Jd","mxQu","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[mxQu],[mxQu,L],[Jd],[Jd,L],[Jd,mxQu],[Jd,mxQu,L],[t],[t,L],[t,mxQu],[t,mxQu,L],[t,Jd],[t,Jd,L],[t,Jd,mxQu],[t,Jd,mxQu,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_480() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_481() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "z","ohEQU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ohEQU],[z],[z,ohEQU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_482() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YBCkS","Tm","Lg","ZF","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[ZF],[ZF,O],[Lg],[Lg,O],[Lg,ZF],[Lg,ZF,O],[Tm],[Tm,O],[Tm,ZF],[Tm,ZF,O],[Tm,Lg],[Tm,Lg,O],[Tm,Lg,ZF],[Tm,Lg,ZF,O],[YBCkS],[YBCkS,O],[YBCkS,ZF],[YBCkS,ZF,O],[YBCkS,Lg],[YBCkS,Lg,O],[YBCkS,Lg,ZF],[YBCkS,Lg,ZF,O],[YBCkS,Tm],[YBCkS,Tm,O],[YBCkS,Tm,ZF],[YBCkS,Tm,ZF,O],[YBCkS,Tm,Lg],[YBCkS,Tm,Lg,O],[YBCkS,Tm,Lg,ZF],[YBCkS,Tm,Lg,ZF,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_483() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_484() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W","oVlO","sMu","zH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zH],[sMu],[sMu,zH],[oVlO],[oVlO,zH],[oVlO,sMu],[oVlO,sMu,zH],[W],[W,zH],[W,sMu],[W,sMu,zH],[W,oVlO],[W,oVlO,zH],[W,oVlO,sMu],[W,oVlO,sMu,zH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_485() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vlmTs","DL","dkIFL","Ix")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ix],[dkIFL],[dkIFL,Ix],[DL],[DL,Ix],[DL,dkIFL],[DL,dkIFL,Ix],[vlmTs],[vlmTs,Ix],[vlmTs,dkIFL],[vlmTs,dkIFL,Ix],[vlmTs,DL],[vlmTs,DL,Ix],[vlmTs,DL,dkIFL],[vlmTs,DL,dkIFL,Ix]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_486() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RQdui","OQ","E","M","glbK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[glbK],[M],[M,glbK],[E],[E,glbK],[E,M],[E,M,glbK],[OQ],[OQ,glbK],[OQ,M],[OQ,M,glbK],[OQ,E],[OQ,E,glbK],[OQ,E,M],[OQ,E,M,glbK],[RQdui],[RQdui,glbK],[RQdui,M],[RQdui,M,glbK],[RQdui,E],[RQdui,E,glbK],[RQdui,E,M],[RQdui,E,M,glbK],[RQdui,OQ],[RQdui,OQ,glbK],[RQdui,OQ,M],[RQdui,OQ,M,glbK],[RQdui,OQ,E],[RQdui,OQ,E,glbK],[RQdui,OQ,E,M],[RQdui,OQ,E,M,glbK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_487() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Vg","Guil","VKg","d")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[d],[VKg],[VKg,d],[Guil],[Guil,d],[Guil,VKg],[Guil,VKg,d],[Vg],[Vg,d],[Vg,VKg],[Vg,VKg,d],[Vg,Guil],[Vg,Guil,d],[Vg,Guil,VKg],[Vg,Guil,VKg,d]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_488() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IHYiU","b","RgFLE","fa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fa],[RgFLE],[RgFLE,fa],[b],[b,fa],[b,RgFLE],[b,RgFLE,fa],[IHYiU],[IHYiU,fa],[IHYiU,RgFLE],[IHYiU,RgFLE,fa],[IHYiU,b],[IHYiU,b,fa],[IHYiU,b,RgFLE],[IHYiU,b,RgFLE,fa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_489() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pEj","E","L","cA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cA],[L],[L,cA],[E],[E,cA],[E,L],[E,L,cA],[pEj],[pEj,cA],[pEj,L],[pEj,L,cA],[pEj,E],[pEj,E,cA],[pEj,E,L],[pEj,E,L,cA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_490() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UG","rQV","OwHvO","Z","vS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vS],[Z],[Z,vS],[OwHvO],[OwHvO,vS],[OwHvO,Z],[OwHvO,Z,vS],[rQV],[rQV,vS],[rQV,Z],[rQV,Z,vS],[rQV,OwHvO],[rQV,OwHvO,vS],[rQV,OwHvO,Z],[rQV,OwHvO,Z,vS],[UG],[UG,vS],[UG,Z],[UG,Z,vS],[UG,OwHvO],[UG,OwHvO,vS],[UG,OwHvO,Z],[UG,OwHvO,Z,vS],[UG,rQV],[UG,rQV,vS],[UG,rQV,Z],[UG,rQV,Z,vS],[UG,rQV,OwHvO],[UG,rQV,OwHvO,vS],[UG,rQV,OwHvO,Z],[UG,rQV,OwHvO,Z,vS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_491() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "juEWs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[juEWs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_492() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Og")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Og]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_493() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cmJgN","s","bN","bQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bQ],[bN],[bN,bQ],[s],[s,bQ],[s,bN],[s,bN,bQ],[cmJgN],[cmJgN,bQ],[cmJgN,bN],[cmJgN,bN,bQ],[cmJgN,s],[cmJgN,s,bQ],[cmJgN,s,bN],[cmJgN,s,bN,bQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_494() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fG","yPaL","Sp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Sp],[yPaL],[yPaL,Sp],[fG],[fG,Sp],[fG,yPaL],[fG,yPaL,Sp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_495() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xBoip","ZbLv","cOD","GiDno","qsp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qsp],[GiDno],[GiDno,qsp],[cOD],[cOD,qsp],[cOD,GiDno],[cOD,GiDno,qsp],[ZbLv],[ZbLv,qsp],[ZbLv,GiDno],[ZbLv,GiDno,qsp],[ZbLv,cOD],[ZbLv,cOD,qsp],[ZbLv,cOD,GiDno],[ZbLv,cOD,GiDno,qsp],[xBoip],[xBoip,qsp],[xBoip,GiDno],[xBoip,GiDno,qsp],[xBoip,cOD],[xBoip,cOD,qsp],[xBoip,cOD,GiDno],[xBoip,cOD,GiDno,qsp],[xBoip,ZbLv],[xBoip,ZbLv,qsp],[xBoip,ZbLv,GiDno],[xBoip,ZbLv,GiDno,qsp],[xBoip,ZbLv,cOD],[xBoip,ZbLv,cOD,qsp],[xBoip,ZbLv,cOD,GiDno],[xBoip,ZbLv,cOD,GiDno,qsp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_496() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NwnJf","lAN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lAN],[NwnJf],[NwnJf,lAN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_497() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eaP","ZUXY","G","eYVw","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[eYVw],[eYVw,j],[G],[G,j],[G,eYVw],[G,eYVw,j],[ZUXY],[ZUXY,j],[ZUXY,eYVw],[ZUXY,eYVw,j],[ZUXY,G],[ZUXY,G,j],[ZUXY,G,eYVw],[ZUXY,G,eYVw,j],[eaP],[eaP,j],[eaP,eYVw],[eaP,eYVw,j],[eaP,G],[eaP,G,j],[eaP,G,eYVw],[eaP,G,eYVw,j],[eaP,ZUXY],[eaP,ZUXY,j],[eaP,ZUXY,eYVw],[eaP,ZUXY,eYVw,j],[eaP,ZUXY,G],[eaP,ZUXY,G,j],[eaP,ZUXY,G,eYVw],[eaP,ZUXY,G,eYVw,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_498() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rFOy","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[rFOy],[rFOy,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_499() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yZx","wcv","Pn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Pn],[wcv],[wcv,Pn],[yZx],[yZx,Pn],[yZx,wcv],[yZx,wcv,Pn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_500() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oRWWP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oRWWP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_501() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mcWT","DRjhr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DRjhr],[mcWT],[mcWT,DRjhr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_502() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "c","Ho","m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m],[Ho],[Ho,m],[c],[c,m],[c,Ho],[c,Ho,m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_503() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rGV","DNMf","k","EQ","ZLBU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZLBU],[EQ],[EQ,ZLBU],[k],[k,ZLBU],[k,EQ],[k,EQ,ZLBU],[DNMf],[DNMf,ZLBU],[DNMf,EQ],[DNMf,EQ,ZLBU],[DNMf,k],[DNMf,k,ZLBU],[DNMf,k,EQ],[DNMf,k,EQ,ZLBU],[rGV],[rGV,ZLBU],[rGV,EQ],[rGV,EQ,ZLBU],[rGV,k],[rGV,k,ZLBU],[rGV,k,EQ],[rGV,k,EQ,ZLBU],[rGV,DNMf],[rGV,DNMf,ZLBU],[rGV,DNMf,EQ],[rGV,DNMf,EQ,ZLBU],[rGV,DNMf,k],[rGV,DNMf,k,ZLBU],[rGV,DNMf,k,EQ],[rGV,DNMf,k,EQ,ZLBU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_504() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","KMTi","BkkHW","ka","UO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UO],[ka],[ka,UO],[BkkHW],[BkkHW,UO],[BkkHW,ka],[BkkHW,ka,UO],[KMTi],[KMTi,UO],[KMTi,ka],[KMTi,ka,UO],[KMTi,BkkHW],[KMTi,BkkHW,UO],[KMTi,BkkHW,ka],[KMTi,BkkHW,ka,UO],[D],[D,UO],[D,ka],[D,ka,UO],[D,BkkHW],[D,BkkHW,UO],[D,BkkHW,ka],[D,BkkHW,ka,UO],[D,KMTi],[D,KMTi,UO],[D,KMTi,ka],[D,KMTi,ka,UO],[D,KMTi,BkkHW],[D,KMTi,BkkHW,UO],[D,KMTi,BkkHW,ka],[D,KMTi,BkkHW,ka,UO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_505() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vk","zTqGR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zTqGR],[vk],[vk,zTqGR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_506() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_507() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dGJiB","zxd","lNJ","qgwFi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qgwFi],[lNJ],[lNJ,qgwFi],[zxd],[zxd,qgwFi],[zxd,lNJ],[zxd,lNJ,qgwFi],[dGJiB],[dGJiB,qgwFi],[dGJiB,lNJ],[dGJiB,lNJ,qgwFi],[dGJiB,zxd],[dGJiB,zxd,qgwFi],[dGJiB,zxd,lNJ],[dGJiB,zxd,lNJ,qgwFi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_508() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fF","riTtM","Pu","kLokd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kLokd],[Pu],[Pu,kLokd],[riTtM],[riTtM,kLokd],[riTtM,Pu],[riTtM,Pu,kLokd],[fF],[fF,kLokd],[fF,Pu],[fF,Pu,kLokd],[fF,riTtM],[fF,riTtM,kLokd],[fF,riTtM,Pu],[fF,riTtM,Pu,kLokd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_509() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "liSrQ","mG","zG","N","TVa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TVa],[N],[N,TVa],[zG],[zG,TVa],[zG,N],[zG,N,TVa],[mG],[mG,TVa],[mG,N],[mG,N,TVa],[mG,zG],[mG,zG,TVa],[mG,zG,N],[mG,zG,N,TVa],[liSrQ],[liSrQ,TVa],[liSrQ,N],[liSrQ,N,TVa],[liSrQ,zG],[liSrQ,zG,TVa],[liSrQ,zG,N],[liSrQ,zG,N,TVa],[liSrQ,mG],[liSrQ,mG,TVa],[liSrQ,mG,N],[liSrQ,mG,N,TVa],[liSrQ,mG,zG],[liSrQ,mG,zG,TVa],[liSrQ,mG,zG,N],[liSrQ,mG,zG,N,TVa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_510() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VLaJ","Xo","BBDk","AVhOb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AVhOb],[BBDk],[BBDk,AVhOb],[Xo],[Xo,AVhOb],[Xo,BBDk],[Xo,BBDk,AVhOb],[VLaJ],[VLaJ,AVhOb],[VLaJ,BBDk],[VLaJ,BBDk,AVhOb],[VLaJ,Xo],[VLaJ,Xo,AVhOb],[VLaJ,Xo,BBDk],[VLaJ,Xo,BBDk,AVhOb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_511() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jVbVe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jVbVe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_512() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bX","ulwRa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ulwRa],[bX],[bX,ulwRa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_513() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "H","AwB","Dc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Dc],[AwB],[AwB,Dc],[H],[H,Dc],[H,AwB],[H,AwB,Dc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_514() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XmNPJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XmNPJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_515() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ulJry")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ulJry]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_516() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Gnzf","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[Gnzf],[Gnzf,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_517() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xTiC","Wp","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[Wp],[Wp,Z],[xTiC],[xTiC,Z],[xTiC,Wp],[xTiC,Wp,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_518() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kM","vSHzv","QJRJ","VtZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VtZ],[QJRJ],[QJRJ,VtZ],[vSHzv],[vSHzv,VtZ],[vSHzv,QJRJ],[vSHzv,QJRJ,VtZ],[kM],[kM,VtZ],[kM,QJRJ],[kM,QJRJ,VtZ],[kM,vSHzv],[kM,vSHzv,VtZ],[kM,vSHzv,QJRJ],[kM,vSHzv,QJRJ,VtZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_519() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WwJuT","xRGY","jiI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jiI],[xRGY],[xRGY,jiI],[WwJuT],[WwJuT,jiI],[WwJuT,xRGY],[WwJuT,xRGY,jiI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_520() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pRVpA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pRVpA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_521() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","gCUVK","UBw","Cvobr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Cvobr],[UBw],[UBw,Cvobr],[gCUVK],[gCUVK,Cvobr],[gCUVK,UBw],[gCUVK,UBw,Cvobr],[A],[A,Cvobr],[A,UBw],[A,UBw,Cvobr],[A,gCUVK],[A,gCUVK,Cvobr],[A,gCUVK,UBw],[A,gCUVK,UBw,Cvobr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_522() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","Hn","mgfv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mgfv],[Hn],[Hn,mgfv],[A],[A,mgfv],[A,Hn],[A,Hn,mgfv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_523() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IcwAR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IcwAR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_524() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GYqD","ZlF","f","zQ","I")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[I],[zQ],[zQ,I],[f],[f,I],[f,zQ],[f,zQ,I],[ZlF],[ZlF,I],[ZlF,zQ],[ZlF,zQ,I],[ZlF,f],[ZlF,f,I],[ZlF,f,zQ],[ZlF,f,zQ,I],[GYqD],[GYqD,I],[GYqD,zQ],[GYqD,zQ,I],[GYqD,f],[GYqD,f,I],[GYqD,f,zQ],[GYqD,f,zQ,I],[GYqD,ZlF],[GYqD,ZlF,I],[GYqD,ZlF,zQ],[GYqD,ZlF,zQ,I],[GYqD,ZlF,f],[GYqD,ZlF,f,I],[GYqD,ZlF,f,zQ],[GYqD,ZlF,f,zQ,I]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_525() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "T")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[T]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_526() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AE","k","qhE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qhE],[k],[k,qhE],[AE],[AE,qhE],[AE,k],[AE,k,qhE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_527() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[s]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_528() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WtOLf","Qlcm","XdARz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XdARz],[Qlcm],[Qlcm,XdARz],[WtOLf],[WtOLf,XdARz],[WtOLf,Qlcm],[WtOLf,Qlcm,XdARz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_529() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yWs","Z","EBPNQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EBPNQ],[Z],[Z,EBPNQ],[yWs],[yWs,EBPNQ],[yWs,Z],[yWs,Z,EBPNQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_530() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hp","pjmN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pjmN],[hp],[hp,pjmN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_531() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","YodN","VQ","OZ","WoTr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WoTr],[OZ],[OZ,WoTr],[VQ],[VQ,WoTr],[VQ,OZ],[VQ,OZ,WoTr],[YodN],[YodN,WoTr],[YodN,OZ],[YodN,OZ,WoTr],[YodN,VQ],[YodN,VQ,WoTr],[YodN,VQ,OZ],[YodN,VQ,OZ,WoTr],[d],[d,WoTr],[d,OZ],[d,OZ,WoTr],[d,VQ],[d,VQ,WoTr],[d,VQ,OZ],[d,VQ,OZ,WoTr],[d,YodN],[d,YodN,WoTr],[d,YodN,OZ],[d,YodN,OZ,WoTr],[d,YodN,VQ],[d,YodN,VQ,WoTr],[d,YodN,VQ,OZ],[d,YodN,VQ,OZ,WoTr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_532() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","Tpf","epg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[epg],[Tpf],[Tpf,epg],[V],[V,epg],[V,Tpf],[V,Tpf,epg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_533() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hJZz","Ogj","AU","LKj","kY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kY],[LKj],[LKj,kY],[AU],[AU,kY],[AU,LKj],[AU,LKj,kY],[Ogj],[Ogj,kY],[Ogj,LKj],[Ogj,LKj,kY],[Ogj,AU],[Ogj,AU,kY],[Ogj,AU,LKj],[Ogj,AU,LKj,kY],[hJZz],[hJZz,kY],[hJZz,LKj],[hJZz,LKj,kY],[hJZz,AU],[hJZz,AU,kY],[hJZz,AU,LKj],[hJZz,AU,LKj,kY],[hJZz,Ogj],[hJZz,Ogj,kY],[hJZz,Ogj,LKj],[hJZz,Ogj,LKj,kY],[hJZz,Ogj,AU],[hJZz,Ogj,AU,kY],[hJZz,Ogj,AU,LKj],[hJZz,Ogj,AU,LKj,kY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_534() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cyve")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cyve]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_535() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mIINR","i","xoGA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xoGA],[i],[i,xoGA],[mIINR],[mIINR,xoGA],[mIINR,i],[mIINR,i,xoGA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_536() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ty","NmTRU","gFG","tFj","Mg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Mg],[tFj],[tFj,Mg],[gFG],[gFG,Mg],[gFG,tFj],[gFG,tFj,Mg],[NmTRU],[NmTRU,Mg],[NmTRU,tFj],[NmTRU,tFj,Mg],[NmTRU,gFG],[NmTRU,gFG,Mg],[NmTRU,gFG,tFj],[NmTRU,gFG,tFj,Mg],[ty],[ty,Mg],[ty,tFj],[ty,tFj,Mg],[ty,gFG],[ty,gFG,Mg],[ty,gFG,tFj],[ty,gFG,tFj,Mg],[ty,NmTRU],[ty,NmTRU,Mg],[ty,NmTRU,tFj],[ty,NmTRU,tFj,Mg],[ty,NmTRU,gFG],[ty,NmTRU,gFG,Mg],[ty,NmTRU,gFG,tFj],[ty,NmTRU,gFG,tFj,Mg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_537() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UalfA","w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w],[UalfA],[UalfA,w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_538() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ubfv","ON")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ON],[ubfv],[ubfv,ON]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_539() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lLKZV","d")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[d],[lLKZV],[lLKZV,d]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_540() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ILI","h","sR","FU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FU],[sR],[sR,FU],[h],[h,FU],[h,sR],[h,sR,FU],[ILI],[ILI,FU],[ILI,sR],[ILI,sR,FU],[ILI,h],[ILI,h,FU],[ILI,h,sR],[ILI,h,sR,FU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_541() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FomJd","IGzph")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IGzph],[FomJd],[FomJd,IGzph]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_542() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rEoMh","CZ","EXq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EXq],[CZ],[CZ,EXq],[rEoMh],[rEoMh,EXq],[rEoMh,CZ],[rEoMh,CZ,EXq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_543() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lN","NQO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NQO],[lN],[lN,NQO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_544() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sSjeV","uCHh","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[uCHh],[uCHh,z],[sSjeV],[sSjeV,z],[sSjeV,uCHh],[sSjeV,uCHh,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_545() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ExL","FYkWh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FYkWh],[ExL],[ExL,FYkWh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_546() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E","UA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UA],[E],[E,UA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_547() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bx","XiLB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XiLB],[bx],[bx,XiLB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_548() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IyqW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IyqW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_549() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jOXY","z","sppeD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sppeD],[z],[z,sppeD],[jOXY],[jOXY,sppeD],[jOXY,z],[jOXY,z,sppeD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_550() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VF","axxG","ISGj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ISGj],[axxG],[axxG,ISGj],[VF],[VF,ISGj],[VF,axxG],[VF,axxG,ISGj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_551() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LP","MJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MJ],[LP],[LP,MJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_552() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_553() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rcR","q","V","Qkpc","xtdqF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xtdqF],[Qkpc],[Qkpc,xtdqF],[V],[V,xtdqF],[V,Qkpc],[V,Qkpc,xtdqF],[q],[q,xtdqF],[q,Qkpc],[q,Qkpc,xtdqF],[q,V],[q,V,xtdqF],[q,V,Qkpc],[q,V,Qkpc,xtdqF],[rcR],[rcR,xtdqF],[rcR,Qkpc],[rcR,Qkpc,xtdqF],[rcR,V],[rcR,V,xtdqF],[rcR,V,Qkpc],[rcR,V,Qkpc,xtdqF],[rcR,q],[rcR,q,xtdqF],[rcR,q,Qkpc],[rcR,q,Qkpc,xtdqF],[rcR,q,V],[rcR,q,V,xtdqF],[rcR,q,V,Qkpc],[rcR,q,V,Qkpc,xtdqF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_554() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ri")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ri]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_555() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qOF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qOF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_556() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Hx","WTcUp","tor","RQpR","jetW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jetW],[RQpR],[RQpR,jetW],[tor],[tor,jetW],[tor,RQpR],[tor,RQpR,jetW],[WTcUp],[WTcUp,jetW],[WTcUp,RQpR],[WTcUp,RQpR,jetW],[WTcUp,tor],[WTcUp,tor,jetW],[WTcUp,tor,RQpR],[WTcUp,tor,RQpR,jetW],[Hx],[Hx,jetW],[Hx,RQpR],[Hx,RQpR,jetW],[Hx,tor],[Hx,tor,jetW],[Hx,tor,RQpR],[Hx,tor,RQpR,jetW],[Hx,WTcUp],[Hx,WTcUp,jetW],[Hx,WTcUp,RQpR],[Hx,WTcUp,RQpR,jetW],[Hx,WTcUp,tor],[Hx,WTcUp,tor,jetW],[Hx,WTcUp,tor,RQpR],[Hx,WTcUp,tor,RQpR,jetW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_557() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E","Ruk","rcYHH","BMtz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BMtz],[rcYHH],[rcYHH,BMtz],[Ruk],[Ruk,BMtz],[Ruk,rcYHH],[Ruk,rcYHH,BMtz],[E],[E,BMtz],[E,rcYHH],[E,rcYHH,BMtz],[E,Ruk],[E,Ruk,BMtz],[E,Ruk,rcYHH],[E,Ruk,rcYHH,BMtz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_558() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Rwh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Rwh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_559() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "J","VDZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VDZ],[J],[J,VDZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_560() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yahuK","Gi","Cf","Hfjyo","DuW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DuW],[Hfjyo],[Hfjyo,DuW],[Cf],[Cf,DuW],[Cf,Hfjyo],[Cf,Hfjyo,DuW],[Gi],[Gi,DuW],[Gi,Hfjyo],[Gi,Hfjyo,DuW],[Gi,Cf],[Gi,Cf,DuW],[Gi,Cf,Hfjyo],[Gi,Cf,Hfjyo,DuW],[yahuK],[yahuK,DuW],[yahuK,Hfjyo],[yahuK,Hfjyo,DuW],[yahuK,Cf],[yahuK,Cf,DuW],[yahuK,Cf,Hfjyo],[yahuK,Cf,Hfjyo,DuW],[yahuK,Gi],[yahuK,Gi,DuW],[yahuK,Gi,Hfjyo],[yahuK,Gi,Hfjyo,DuW],[yahuK,Gi,Cf],[yahuK,Gi,Cf,DuW],[yahuK,Gi,Cf,Hfjyo],[yahuK,Gi,Cf,Hfjyo,DuW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_561() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QyY","BZivC","Knct","vdJD","FE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FE],[vdJD],[vdJD,FE],[Knct],[Knct,FE],[Knct,vdJD],[Knct,vdJD,FE],[BZivC],[BZivC,FE],[BZivC,vdJD],[BZivC,vdJD,FE],[BZivC,Knct],[BZivC,Knct,FE],[BZivC,Knct,vdJD],[BZivC,Knct,vdJD,FE],[QyY],[QyY,FE],[QyY,vdJD],[QyY,vdJD,FE],[QyY,Knct],[QyY,Knct,FE],[QyY,Knct,vdJD],[QyY,Knct,vdJD,FE],[QyY,BZivC],[QyY,BZivC,FE],[QyY,BZivC,vdJD],[QyY,BZivC,vdJD,FE],[QyY,BZivC,Knct],[QyY,BZivC,Knct,FE],[QyY,BZivC,Knct,vdJD],[QyY,BZivC,Knct,vdJD,FE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_562() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Bk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_563() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gRQk","KZ","o","LGY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LGY],[o],[o,LGY],[KZ],[KZ,LGY],[KZ,o],[KZ,o,LGY],[gRQk],[gRQk,LGY],[gRQk,o],[gRQk,o,LGY],[gRQk,KZ],[gRQk,KZ,LGY],[gRQk,KZ,o],[gRQk,KZ,o,LGY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_564() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WegKK","awIFs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[awIFs],[WegKK],[WegKK,awIFs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_565() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Crb","WU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WU],[Crb],[Crb,WU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_566() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","UmLFv","hr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hr],[UmLFv],[UmLFv,hr],[a],[a,hr],[a,UmLFv],[a,UmLFv,hr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_567() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x","dO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dO],[x],[x,dO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_568() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","aFtG","OETZ","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[OETZ],[OETZ,o],[aFtG],[aFtG,o],[aFtG,OETZ],[aFtG,OETZ,o],[s],[s,o],[s,OETZ],[s,OETZ,o],[s,aFtG],[s,aFtG,o],[s,aFtG,OETZ],[s,aFtG,OETZ,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_569() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","JVd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JVd],[P],[P,JVd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_570() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_571() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HO","KGCcQ","XqYV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XqYV],[KGCcQ],[KGCcQ,XqYV],[HO],[HO,XqYV],[HO,KGCcQ],[HO,KGCcQ,XqYV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_572() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","W","bdSmg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bdSmg],[W],[W,bdSmg],[C],[C,bdSmg],[C,W],[C,W,bdSmg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_573() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nImc","k","Xt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xt],[k],[k,Xt],[nImc],[nImc,Xt],[nImc,k],[nImc,k,Xt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_574() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wcwJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wcwJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_575() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Saa","fGy","i","J","eESij")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eESij],[J],[J,eESij],[i],[i,eESij],[i,J],[i,J,eESij],[fGy],[fGy,eESij],[fGy,J],[fGy,J,eESij],[fGy,i],[fGy,i,eESij],[fGy,i,J],[fGy,i,J,eESij],[Saa],[Saa,eESij],[Saa,J],[Saa,J,eESij],[Saa,i],[Saa,i,eESij],[Saa,i,J],[Saa,i,J,eESij],[Saa,fGy],[Saa,fGy,eESij],[Saa,fGy,J],[Saa,fGy,J,eESij],[Saa,fGy,i],[Saa,fGy,i,eESij],[Saa,fGy,i,J],[Saa,fGy,i,J,eESij]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_576() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yOdH","LPqb","vNQ","Y","rKu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rKu],[Y],[Y,rKu],[vNQ],[vNQ,rKu],[vNQ,Y],[vNQ,Y,rKu],[LPqb],[LPqb,rKu],[LPqb,Y],[LPqb,Y,rKu],[LPqb,vNQ],[LPqb,vNQ,rKu],[LPqb,vNQ,Y],[LPqb,vNQ,Y,rKu],[yOdH],[yOdH,rKu],[yOdH,Y],[yOdH,Y,rKu],[yOdH,vNQ],[yOdH,vNQ,rKu],[yOdH,vNQ,Y],[yOdH,vNQ,Y,rKu],[yOdH,LPqb],[yOdH,LPqb,rKu],[yOdH,LPqb,Y],[yOdH,LPqb,Y,rKu],[yOdH,LPqb,vNQ],[yOdH,LPqb,vNQ,rKu],[yOdH,LPqb,vNQ,Y],[yOdH,LPqb,vNQ,Y,rKu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_577() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uDENa","RKc","hD","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[hD],[hD,N],[RKc],[RKc,N],[RKc,hD],[RKc,hD,N],[uDENa],[uDENa,N],[uDENa,hD],[uDENa,hD,N],[uDENa,RKc],[uDENa,RKc,N],[uDENa,RKc,hD],[uDENa,RKc,hD,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_578() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aIAaR","lC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lC],[aIAaR],[aIAaR,lC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_579() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pfkw","VjnKF","OkI","KX","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[KX],[KX,o],[OkI],[OkI,o],[OkI,KX],[OkI,KX,o],[VjnKF],[VjnKF,o],[VjnKF,KX],[VjnKF,KX,o],[VjnKF,OkI],[VjnKF,OkI,o],[VjnKF,OkI,KX],[VjnKF,OkI,KX,o],[pfkw],[pfkw,o],[pfkw,KX],[pfkw,KX,o],[pfkw,OkI],[pfkw,OkI,o],[pfkw,OkI,KX],[pfkw,OkI,KX,o],[pfkw,VjnKF],[pfkw,VjnKF,o],[pfkw,VjnKF,KX],[pfkw,VjnKF,KX,o],[pfkw,VjnKF,OkI],[pfkw,VjnKF,OkI,o],[pfkw,VjnKF,OkI,KX],[pfkw,VjnKF,OkI,KX,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_580() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dfmQY","tg","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[tg],[tg,j],[dfmQY],[dfmQY,j],[dfmQY,tg],[dfmQY,tg,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_581() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","WM","QJcI","yC","Xr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xr],[yC],[yC,Xr],[QJcI],[QJcI,Xr],[QJcI,yC],[QJcI,yC,Xr],[WM],[WM,Xr],[WM,yC],[WM,yC,Xr],[WM,QJcI],[WM,QJcI,Xr],[WM,QJcI,yC],[WM,QJcI,yC,Xr],[r],[r,Xr],[r,yC],[r,yC,Xr],[r,QJcI],[r,QJcI,Xr],[r,QJcI,yC],[r,QJcI,yC,Xr],[r,WM],[r,WM,Xr],[r,WM,yC],[r,WM,yC,Xr],[r,WM,QJcI],[r,WM,QJcI,Xr],[r,WM,QJcI,yC],[r,WM,QJcI,yC,Xr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_582() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zk","AMF","syR","DiCL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DiCL],[syR],[syR,DiCL],[AMF],[AMF,DiCL],[AMF,syR],[AMF,syR,DiCL],[zk],[zk,DiCL],[zk,syR],[zk,syR,DiCL],[zk,AMF],[zk,AMF,DiCL],[zk,AMF,syR],[zk,AMF,syR,DiCL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_583() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[W]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_584() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hWsQ","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[hWsQ],[hWsQ,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_585() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eEZaW","eOBb","pLaBS","jnIpk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jnIpk],[pLaBS],[pLaBS,jnIpk],[eOBb],[eOBb,jnIpk],[eOBb,pLaBS],[eOBb,pLaBS,jnIpk],[eEZaW],[eEZaW,jnIpk],[eEZaW,pLaBS],[eEZaW,pLaBS,jnIpk],[eEZaW,eOBb],[eEZaW,eOBb,jnIpk],[eEZaW,eOBb,pLaBS],[eEZaW,eOBb,pLaBS,jnIpk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_586() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BupI","FLzrA","uVYvE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uVYvE],[FLzrA],[FLzrA,uVYvE],[BupI],[BupI,uVYvE],[BupI,FLzrA],[BupI,FLzrA,uVYvE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_587() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yaaC","aRGac","uvdmJ","l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l],[uvdmJ],[uvdmJ,l],[aRGac],[aRGac,l],[aRGac,uvdmJ],[aRGac,uvdmJ,l],[yaaC],[yaaC,l],[yaaC,uvdmJ],[yaaC,uvdmJ,l],[yaaC,aRGac],[yaaC,aRGac,l],[yaaC,aRGac,uvdmJ],[yaaC,aRGac,uvdmJ,l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_588() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qv","h","Gr","DjcX","hIPtJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hIPtJ],[DjcX],[DjcX,hIPtJ],[Gr],[Gr,hIPtJ],[Gr,DjcX],[Gr,DjcX,hIPtJ],[h],[h,hIPtJ],[h,DjcX],[h,DjcX,hIPtJ],[h,Gr],[h,Gr,hIPtJ],[h,Gr,DjcX],[h,Gr,DjcX,hIPtJ],[qv],[qv,hIPtJ],[qv,DjcX],[qv,DjcX,hIPtJ],[qv,Gr],[qv,Gr,hIPtJ],[qv,Gr,DjcX],[qv,Gr,DjcX,hIPtJ],[qv,h],[qv,h,hIPtJ],[qv,h,DjcX],[qv,h,DjcX,hIPtJ],[qv,h,Gr],[qv,h,Gr,hIPtJ],[qv,h,Gr,DjcX],[qv,h,Gr,DjcX,hIPtJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_589() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XGyAB","HDq","U","aPrxL","JZJh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JZJh],[aPrxL],[aPrxL,JZJh],[U],[U,JZJh],[U,aPrxL],[U,aPrxL,JZJh],[HDq],[HDq,JZJh],[HDq,aPrxL],[HDq,aPrxL,JZJh],[HDq,U],[HDq,U,JZJh],[HDq,U,aPrxL],[HDq,U,aPrxL,JZJh],[XGyAB],[XGyAB,JZJh],[XGyAB,aPrxL],[XGyAB,aPrxL,JZJh],[XGyAB,U],[XGyAB,U,JZJh],[XGyAB,U,aPrxL],[XGyAB,U,aPrxL,JZJh],[XGyAB,HDq],[XGyAB,HDq,JZJh],[XGyAB,HDq,aPrxL],[XGyAB,HDq,aPrxL,JZJh],[XGyAB,HDq,U],[XGyAB,HDq,U,JZJh],[XGyAB,HDq,U,aPrxL],[XGyAB,HDq,U,aPrxL,JZJh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_590() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","xGHln","Srx","Jfkl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Jfkl],[Srx],[Srx,Jfkl],[xGHln],[xGHln,Jfkl],[xGHln,Srx],[xGHln,Srx,Jfkl],[a],[a,Jfkl],[a,Srx],[a,Srx,Jfkl],[a,xGHln],[a,xGHln,Jfkl],[a,xGHln,Srx],[a,xGHln,Srx,Jfkl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_591() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jxLs","g","i")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[i],[g],[g,i],[jxLs],[jxLs,i],[jxLs,g],[jxLs,g,i]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_592() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BJEzp","VDG","xiYN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xiYN],[VDG],[VDG,xiYN],[BJEzp],[BJEzp,xiYN],[BJEzp,VDG],[BJEzp,VDG,xiYN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_593() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pUBA","s","To")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[To],[s],[s,To],[pUBA],[pUBA,To],[pUBA,s],[pUBA,s,To]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_594() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qoo","B","hB","fP","qDREk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qDREk],[fP],[fP,qDREk],[hB],[hB,qDREk],[hB,fP],[hB,fP,qDREk],[B],[B,qDREk],[B,fP],[B,fP,qDREk],[B,hB],[B,hB,qDREk],[B,hB,fP],[B,hB,fP,qDREk],[qoo],[qoo,qDREk],[qoo,fP],[qoo,fP,qDREk],[qoo,hB],[qoo,hB,qDREk],[qoo,hB,fP],[qoo,hB,fP,qDREk],[qoo,B],[qoo,B,qDREk],[qoo,B,fP],[qoo,B,fP,qDREk],[qoo,B,hB],[qoo,B,hB,qDREk],[qoo,B,hB,fP],[qoo,B,hB,fP,qDREk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_595() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aex","W","WgBc","H","WbW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WbW],[H],[H,WbW],[WgBc],[WgBc,WbW],[WgBc,H],[WgBc,H,WbW],[W],[W,WbW],[W,H],[W,H,WbW],[W,WgBc],[W,WgBc,WbW],[W,WgBc,H],[W,WgBc,H,WbW],[aex],[aex,WbW],[aex,H],[aex,H,WbW],[aex,WgBc],[aex,WgBc,WbW],[aex,WgBc,H],[aex,WgBc,H,WbW],[aex,W],[aex,W,WbW],[aex,W,H],[aex,W,H,WbW],[aex,W,WgBc],[aex,W,WgBc,WbW],[aex,W,WgBc,H],[aex,W,WgBc,H,WbW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_596() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RWGL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RWGL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_597() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pU","Obk","lnj","wpw","CQgy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CQgy],[wpw],[wpw,CQgy],[lnj],[lnj,CQgy],[lnj,wpw],[lnj,wpw,CQgy],[Obk],[Obk,CQgy],[Obk,wpw],[Obk,wpw,CQgy],[Obk,lnj],[Obk,lnj,CQgy],[Obk,lnj,wpw],[Obk,lnj,wpw,CQgy],[pU],[pU,CQgy],[pU,wpw],[pU,wpw,CQgy],[pU,lnj],[pU,lnj,CQgy],[pU,lnj,wpw],[pU,lnj,wpw,CQgy],[pU,Obk],[pU,Obk,CQgy],[pU,Obk,wpw],[pU,Obk,wpw,CQgy],[pU,Obk,lnj],[pU,Obk,lnj,CQgy],[pU,Obk,lnj,wpw],[pU,Obk,lnj,wpw,CQgy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_598() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wtp","JKJ","y","NHd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NHd],[y],[y,NHd],[JKJ],[JKJ,NHd],[JKJ,y],[JKJ,y,NHd],[wtp],[wtp,NHd],[wtp,y],[wtp,y,NHd],[wtp,JKJ],[wtp,JKJ,NHd],[wtp,JKJ,y],[wtp,JKJ,y,NHd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_599() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XmLWL","iZTiM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iZTiM],[XmLWL],[XmLWL,iZTiM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_600() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aeQKC","nBl","L","vTGq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vTGq],[L],[L,vTGq],[nBl],[nBl,vTGq],[nBl,L],[nBl,L,vTGq],[aeQKC],[aeQKC,vTGq],[aeQKC,L],[aeQKC,L,vTGq],[aeQKC,nBl],[aeQKC,nBl,vTGq],[aeQKC,nBl,L],[aeQKC,nBl,L,vTGq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_601() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OdF","mE","YB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YB],[mE],[mE,YB],[OdF],[OdF,YB],[OdF,mE],[OdF,mE,YB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_602() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[q]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_603() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hOPMQ","c","exH","f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f],[exH],[exH,f],[c],[c,f],[c,exH],[c,exH,f],[hOPMQ],[hOPMQ,f],[hOPMQ,exH],[hOPMQ,exH,f],[hOPMQ,c],[hOPMQ,c,f],[hOPMQ,c,exH],[hOPMQ,c,exH,f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_604() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aHLQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aHLQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_605() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","tXzMu","xJe","S")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[S],[xJe],[xJe,S],[tXzMu],[tXzMu,S],[tXzMu,xJe],[tXzMu,xJe,S],[P],[P,S],[P,xJe],[P,xJe,S],[P,tXzMu],[P,tXzMu,S],[P,tXzMu,xJe],[P,tXzMu,xJe,S]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_606() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gnIdO","x","ZkZ","ijxPL","Fe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Fe],[ijxPL],[ijxPL,Fe],[ZkZ],[ZkZ,Fe],[ZkZ,ijxPL],[ZkZ,ijxPL,Fe],[x],[x,Fe],[x,ijxPL],[x,ijxPL,Fe],[x,ZkZ],[x,ZkZ,Fe],[x,ZkZ,ijxPL],[x,ZkZ,ijxPL,Fe],[gnIdO],[gnIdO,Fe],[gnIdO,ijxPL],[gnIdO,ijxPL,Fe],[gnIdO,ZkZ],[gnIdO,ZkZ,Fe],[gnIdO,ZkZ,ijxPL],[gnIdO,ZkZ,ijxPL,Fe],[gnIdO,x],[gnIdO,x,Fe],[gnIdO,x,ijxPL],[gnIdO,x,ijxPL,Fe],[gnIdO,x,ZkZ],[gnIdO,x,ZkZ,Fe],[gnIdO,x,ZkZ,ijxPL],[gnIdO,x,ZkZ,ijxPL,Fe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_607() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VyG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VyG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_608() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lm","f","h")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[h],[f],[f,h],[lm],[lm,h],[lm,f],[lm,f,h]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_609() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wL","Yw","RWnWq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RWnWq],[Yw],[Yw,RWnWq],[wL],[wL,RWnWq],[wL,Yw],[wL,Yw,RWnWq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_610() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZrSKm","mcJ","Dm","TB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TB],[Dm],[Dm,TB],[mcJ],[mcJ,TB],[mcJ,Dm],[mcJ,Dm,TB],[ZrSKm],[ZrSKm,TB],[ZrSKm,Dm],[ZrSKm,Dm,TB],[ZrSKm,mcJ],[ZrSKm,mcJ,TB],[ZrSKm,mcJ,Dm],[ZrSKm,mcJ,Dm,TB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_611() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Jugwd","wxhMV","Tm","vyJQ","fqUx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fqUx],[vyJQ],[vyJQ,fqUx],[Tm],[Tm,fqUx],[Tm,vyJQ],[Tm,vyJQ,fqUx],[wxhMV],[wxhMV,fqUx],[wxhMV,vyJQ],[wxhMV,vyJQ,fqUx],[wxhMV,Tm],[wxhMV,Tm,fqUx],[wxhMV,Tm,vyJQ],[wxhMV,Tm,vyJQ,fqUx],[Jugwd],[Jugwd,fqUx],[Jugwd,vyJQ],[Jugwd,vyJQ,fqUx],[Jugwd,Tm],[Jugwd,Tm,fqUx],[Jugwd,Tm,vyJQ],[Jugwd,Tm,vyJQ,fqUx],[Jugwd,wxhMV],[Jugwd,wxhMV,fqUx],[Jugwd,wxhMV,vyJQ],[Jugwd,wxhMV,vyJQ,fqUx],[Jugwd,wxhMV,Tm],[Jugwd,wxhMV,Tm,fqUx],[Jugwd,wxhMV,Tm,vyJQ],[Jugwd,wxhMV,Tm,vyJQ,fqUx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_612() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vhzY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vhzY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_613() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Tyy","l","EmjA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EmjA],[l],[l,EmjA],[Tyy],[Tyy,EmjA],[Tyy,l],[Tyy,l,EmjA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_614() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zJJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zJJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_615() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "En")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[En]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_616() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jLJGK","zpD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zpD],[jLJGK],[jLJGK,zpD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_617() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PltjL","NP","CvPy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CvPy],[NP],[NP,CvPy],[PltjL],[PltjL,CvPy],[PltjL,NP],[PltjL,NP,CvPy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_618() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mW","vDz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vDz],[mW],[mW,vDz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_619() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bc","lD","QVSF","YHMt","Ve")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ve],[YHMt],[YHMt,Ve],[QVSF],[QVSF,Ve],[QVSF,YHMt],[QVSF,YHMt,Ve],[lD],[lD,Ve],[lD,YHMt],[lD,YHMt,Ve],[lD,QVSF],[lD,QVSF,Ve],[lD,QVSF,YHMt],[lD,QVSF,YHMt,Ve],[bc],[bc,Ve],[bc,YHMt],[bc,YHMt,Ve],[bc,QVSF],[bc,QVSF,Ve],[bc,QVSF,YHMt],[bc,QVSF,YHMt,Ve],[bc,lD],[bc,lD,Ve],[bc,lD,YHMt],[bc,lD,YHMt,Ve],[bc,lD,QVSF],[bc,lD,QVSF,Ve],[bc,lD,QVSF,YHMt],[bc,lD,QVSF,YHMt,Ve]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_620() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Wqadw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wqadw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_621() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "I","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[I],[I,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_622() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CigcU","REf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[REf],[CigcU],[CigcU,REf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_623() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XWK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XWK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_624() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iyeKG","yPK","W","jE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jE],[W],[W,jE],[yPK],[yPK,jE],[yPK,W],[yPK,W,jE],[iyeKG],[iyeKG,jE],[iyeKG,W],[iyeKG,W,jE],[iyeKG,yPK],[iyeKG,yPK,jE],[iyeKG,yPK,W],[iyeKG,yPK,W,jE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_625() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VAL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VAL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_626() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","DJ","WdQwT","MHtw","PQiTN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PQiTN],[MHtw],[MHtw,PQiTN],[WdQwT],[WdQwT,PQiTN],[WdQwT,MHtw],[WdQwT,MHtw,PQiTN],[DJ],[DJ,PQiTN],[DJ,MHtw],[DJ,MHtw,PQiTN],[DJ,WdQwT],[DJ,WdQwT,PQiTN],[DJ,WdQwT,MHtw],[DJ,WdQwT,MHtw,PQiTN],[r],[r,PQiTN],[r,MHtw],[r,MHtw,PQiTN],[r,WdQwT],[r,WdQwT,PQiTN],[r,WdQwT,MHtw],[r,WdQwT,MHtw,PQiTN],[r,DJ],[r,DJ,PQiTN],[r,DJ,MHtw],[r,DJ,MHtw,PQiTN],[r,DJ,WdQwT],[r,DJ,WdQwT,PQiTN],[r,DJ,WdQwT,MHtw],[r,DJ,WdQwT,MHtw,PQiTN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_627() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tjaUQ","zbM","U","tBYv","Bqlkv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Bqlkv],[tBYv],[tBYv,Bqlkv],[U],[U,Bqlkv],[U,tBYv],[U,tBYv,Bqlkv],[zbM],[zbM,Bqlkv],[zbM,tBYv],[zbM,tBYv,Bqlkv],[zbM,U],[zbM,U,Bqlkv],[zbM,U,tBYv],[zbM,U,tBYv,Bqlkv],[tjaUQ],[tjaUQ,Bqlkv],[tjaUQ,tBYv],[tjaUQ,tBYv,Bqlkv],[tjaUQ,U],[tjaUQ,U,Bqlkv],[tjaUQ,U,tBYv],[tjaUQ,U,tBYv,Bqlkv],[tjaUQ,zbM],[tjaUQ,zbM,Bqlkv],[tjaUQ,zbM,tBYv],[tjaUQ,zbM,tBYv,Bqlkv],[tjaUQ,zbM,U],[tjaUQ,zbM,U,Bqlkv],[tjaUQ,zbM,U,tBYv],[tjaUQ,zbM,U,tBYv,Bqlkv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_628() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","v")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[v],[D],[D,v]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_629() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DxmcQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DxmcQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_630() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mBOqb","mBMNw","WU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WU],[mBMNw],[mBMNw,WU],[mBOqb],[mBOqb,WU],[mBOqb,mBMNw],[mBOqb,mBMNw,WU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_631() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xtTf","rje")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rje],[xtTf],[xtTf,rje]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_632() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gEsj","CbGsn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CbGsn],[gEsj],[gEsj,CbGsn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_633() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sc","dVr","YzNl","qeZRl","gdhXB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gdhXB],[qeZRl],[qeZRl,gdhXB],[YzNl],[YzNl,gdhXB],[YzNl,qeZRl],[YzNl,qeZRl,gdhXB],[dVr],[dVr,gdhXB],[dVr,qeZRl],[dVr,qeZRl,gdhXB],[dVr,YzNl],[dVr,YzNl,gdhXB],[dVr,YzNl,qeZRl],[dVr,YzNl,qeZRl,gdhXB],[sc],[sc,gdhXB],[sc,qeZRl],[sc,qeZRl,gdhXB],[sc,YzNl],[sc,YzNl,gdhXB],[sc,YzNl,qeZRl],[sc,YzNl,qeZRl,gdhXB],[sc,dVr],[sc,dVr,gdhXB],[sc,dVr,qeZRl],[sc,dVr,qeZRl,gdhXB],[sc,dVr,YzNl],[sc,dVr,YzNl,gdhXB],[sc,dVr,YzNl,qeZRl],[sc,dVr,YzNl,qeZRl,gdhXB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_634() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","CN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CN],[V],[V,CN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_635() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","Y","jw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jw],[Y],[Y,jw],[b],[b,jw],[b,Y],[b,Y,jw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_636() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XrK","p","iBJu","ZH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZH],[iBJu],[iBJu,ZH],[p],[p,ZH],[p,iBJu],[p,iBJu,ZH],[XrK],[XrK,ZH],[XrK,iBJu],[XrK,iBJu,ZH],[XrK,p],[XrK,p,ZH],[XrK,p,iBJu],[XrK,p,iBJu,ZH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_637() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","qIeC","kwSxI","lj","XjQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XjQ],[lj],[lj,XjQ],[kwSxI],[kwSxI,XjQ],[kwSxI,lj],[kwSxI,lj,XjQ],[qIeC],[qIeC,XjQ],[qIeC,lj],[qIeC,lj,XjQ],[qIeC,kwSxI],[qIeC,kwSxI,XjQ],[qIeC,kwSxI,lj],[qIeC,kwSxI,lj,XjQ],[Q],[Q,XjQ],[Q,lj],[Q,lj,XjQ],[Q,kwSxI],[Q,kwSxI,XjQ],[Q,kwSxI,lj],[Q,kwSxI,lj,XjQ],[Q,qIeC],[Q,qIeC,XjQ],[Q,qIeC,lj],[Q,qIeC,lj,XjQ],[Q,qIeC,kwSxI],[Q,qIeC,kwSxI,XjQ],[Q,qIeC,kwSxI,lj],[Q,qIeC,kwSxI,lj,XjQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_638() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fo","LQm","ScIf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ScIf],[LQm],[LQm,ScIf],[fo],[fo,ScIf],[fo,LQm],[fo,LQm,ScIf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_639() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pidp","TsA","ihSkw","dVwNM","ig")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ig],[dVwNM],[dVwNM,ig],[ihSkw],[ihSkw,ig],[ihSkw,dVwNM],[ihSkw,dVwNM,ig],[TsA],[TsA,ig],[TsA,dVwNM],[TsA,dVwNM,ig],[TsA,ihSkw],[TsA,ihSkw,ig],[TsA,ihSkw,dVwNM],[TsA,ihSkw,dVwNM,ig],[pidp],[pidp,ig],[pidp,dVwNM],[pidp,dVwNM,ig],[pidp,ihSkw],[pidp,ihSkw,ig],[pidp,ihSkw,dVwNM],[pidp,ihSkw,dVwNM,ig],[pidp,TsA],[pidp,TsA,ig],[pidp,TsA,dVwNM],[pidp,TsA,dVwNM,ig],[pidp,TsA,ihSkw],[pidp,TsA,ihSkw,ig],[pidp,TsA,ihSkw,dVwNM],[pidp,TsA,ihSkw,dVwNM,ig]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_640() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kbz","Vl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vl],[kbz],[kbz,Vl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_641() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_642() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QS","yIg","Lc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Lc],[yIg],[yIg,Lc],[QS],[QS,Lc],[QS,yIg],[QS,yIg,Lc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_643() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "goaI","wg","H","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[H],[H,O],[wg],[wg,O],[wg,H],[wg,H,O],[goaI],[goaI,O],[goaI,H],[goaI,H,O],[goaI,wg],[goaI,wg,O],[goaI,wg,H],[goaI,wg,H,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_644() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tKO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tKO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_645() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zz","UkRd","qbtu","ZEem")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZEem],[qbtu],[qbtu,ZEem],[UkRd],[UkRd,ZEem],[UkRd,qbtu],[UkRd,qbtu,ZEem],[Zz],[Zz,ZEem],[Zz,qbtu],[Zz,qbtu,ZEem],[Zz,UkRd],[Zz,UkRd,ZEem],[Zz,UkRd,qbtu],[Zz,UkRd,qbtu,ZEem]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_646() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","Te","IO","bQe","jUY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jUY],[bQe],[bQe,jUY],[IO],[IO,jUY],[IO,bQe],[IO,bQe,jUY],[Te],[Te,jUY],[Te,bQe],[Te,bQe,jUY],[Te,IO],[Te,IO,jUY],[Te,IO,bQe],[Te,IO,bQe,jUY],[p],[p,jUY],[p,bQe],[p,bQe,jUY],[p,IO],[p,IO,jUY],[p,IO,bQe],[p,IO,bQe,jUY],[p,Te],[p,Te,jUY],[p,Te,bQe],[p,Te,bQe,jUY],[p,Te,IO],[p,Te,IO,jUY],[p,Te,IO,bQe],[p,Te,IO,bQe,jUY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_647() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","Hl","jualV","wPbs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wPbs],[jualV],[jualV,wPbs],[Hl],[Hl,wPbs],[Hl,jualV],[Hl,jualV,wPbs],[R],[R,wPbs],[R,jualV],[R,jualV,wPbs],[R,Hl],[R,Hl,wPbs],[R,Hl,jualV],[R,Hl,jualV,wPbs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_648() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UPYe","Na","X","FDtoJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FDtoJ],[X],[X,FDtoJ],[Na],[Na,FDtoJ],[Na,X],[Na,X,FDtoJ],[UPYe],[UPYe,FDtoJ],[UPYe,X],[UPYe,X,FDtoJ],[UPYe,Na],[UPYe,Na,FDtoJ],[UPYe,Na,X],[UPYe,Na,X,FDtoJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_649() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RLOC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RLOC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_650() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FXw","aOR","G","x")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[x],[G],[G,x],[aOR],[aOR,x],[aOR,G],[aOR,G,x],[FXw],[FXw,x],[FXw,G],[FXw,G,x],[FXw,aOR],[FXw,aOR,x],[FXw,aOR,G],[FXw,aOR,G,x]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_651() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Fopx","NIc","EKr","aNpZy","hrx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hrx],[aNpZy],[aNpZy,hrx],[EKr],[EKr,hrx],[EKr,aNpZy],[EKr,aNpZy,hrx],[NIc],[NIc,hrx],[NIc,aNpZy],[NIc,aNpZy,hrx],[NIc,EKr],[NIc,EKr,hrx],[NIc,EKr,aNpZy],[NIc,EKr,aNpZy,hrx],[Fopx],[Fopx,hrx],[Fopx,aNpZy],[Fopx,aNpZy,hrx],[Fopx,EKr],[Fopx,EKr,hrx],[Fopx,EKr,aNpZy],[Fopx,EKr,aNpZy,hrx],[Fopx,NIc],[Fopx,NIc,hrx],[Fopx,NIc,aNpZy],[Fopx,NIc,aNpZy,hrx],[Fopx,NIc,EKr],[Fopx,NIc,EKr,hrx],[Fopx,NIc,EKr,aNpZy],[Fopx,NIc,EKr,aNpZy,hrx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_652() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","RyWD","RFQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RFQ],[RyWD],[RyWD,RFQ],[a],[a,RFQ],[a,RyWD],[a,RyWD,RFQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_653() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ug","qRg","yr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yr],[qRg],[qRg,yr],[Ug],[Ug,yr],[Ug,qRg],[Ug,qRg,yr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_654() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Vg","d","E","We","YVKOB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YVKOB],[We],[We,YVKOB],[E],[E,YVKOB],[E,We],[E,We,YVKOB],[d],[d,YVKOB],[d,We],[d,We,YVKOB],[d,E],[d,E,YVKOB],[d,E,We],[d,E,We,YVKOB],[Vg],[Vg,YVKOB],[Vg,We],[Vg,We,YVKOB],[Vg,E],[Vg,E,YVKOB],[Vg,E,We],[Vg,E,We,YVKOB],[Vg,d],[Vg,d,YVKOB],[Vg,d,We],[Vg,d,We,YVKOB],[Vg,d,E],[Vg,d,E,YVKOB],[Vg,d,E,We],[Vg,d,E,We,YVKOB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_655() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mdW","cM","z","qnLCd","KlpK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KlpK],[qnLCd],[qnLCd,KlpK],[z],[z,KlpK],[z,qnLCd],[z,qnLCd,KlpK],[cM],[cM,KlpK],[cM,qnLCd],[cM,qnLCd,KlpK],[cM,z],[cM,z,KlpK],[cM,z,qnLCd],[cM,z,qnLCd,KlpK],[mdW],[mdW,KlpK],[mdW,qnLCd],[mdW,qnLCd,KlpK],[mdW,z],[mdW,z,KlpK],[mdW,z,qnLCd],[mdW,z,qnLCd,KlpK],[mdW,cM],[mdW,cM,KlpK],[mdW,cM,qnLCd],[mdW,cM,qnLCd,KlpK],[mdW,cM,z],[mdW,cM,z,KlpK],[mdW,cM,z,qnLCd],[mdW,cM,z,qnLCd,KlpK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_656() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Krl","t","bk","n","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[n],[n,o],[bk],[bk,o],[bk,n],[bk,n,o],[t],[t,o],[t,n],[t,n,o],[t,bk],[t,bk,o],[t,bk,n],[t,bk,n,o],[Krl],[Krl,o],[Krl,n],[Krl,n,o],[Krl,bk],[Krl,bk,o],[Krl,bk,n],[Krl,bk,n,o],[Krl,t],[Krl,t,o],[Krl,t,n],[Krl,t,n,o],[Krl,t,bk],[Krl,t,bk,o],[Krl,t,bk,n],[Krl,t,bk,n,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_657() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "e","atyz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[atyz],[e],[e,atyz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_658() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EM","xLaK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xLaK],[EM],[EM,xLaK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_659() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nfuxx","kVgp","vDCs","iu","uWq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uWq],[iu],[iu,uWq],[vDCs],[vDCs,uWq],[vDCs,iu],[vDCs,iu,uWq],[kVgp],[kVgp,uWq],[kVgp,iu],[kVgp,iu,uWq],[kVgp,vDCs],[kVgp,vDCs,uWq],[kVgp,vDCs,iu],[kVgp,vDCs,iu,uWq],[nfuxx],[nfuxx,uWq],[nfuxx,iu],[nfuxx,iu,uWq],[nfuxx,vDCs],[nfuxx,vDCs,uWq],[nfuxx,vDCs,iu],[nfuxx,vDCs,iu,uWq],[nfuxx,kVgp],[nfuxx,kVgp,uWq],[nfuxx,kVgp,iu],[nfuxx,kVgp,iu,uWq],[nfuxx,kVgp,vDCs],[nfuxx,kVgp,vDCs,uWq],[nfuxx,kVgp,vDCs,iu],[nfuxx,kVgp,vDCs,iu,uWq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_660() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","F","MPXtY","Jqo","LibuY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LibuY],[Jqo],[Jqo,LibuY],[MPXtY],[MPXtY,LibuY],[MPXtY,Jqo],[MPXtY,Jqo,LibuY],[F],[F,LibuY],[F,Jqo],[F,Jqo,LibuY],[F,MPXtY],[F,MPXtY,LibuY],[F,MPXtY,Jqo],[F,MPXtY,Jqo,LibuY],[C],[C,LibuY],[C,Jqo],[C,Jqo,LibuY],[C,MPXtY],[C,MPXtY,LibuY],[C,MPXtY,Jqo],[C,MPXtY,Jqo,LibuY],[C,F],[C,F,LibuY],[C,F,Jqo],[C,F,Jqo,LibuY],[C,F,MPXtY],[C,F,MPXtY,LibuY],[C,F,MPXtY,Jqo],[C,F,MPXtY,Jqo,LibuY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_661() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SZZCJ","QRJ","WS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WS],[QRJ],[QRJ,WS],[SZZCJ],[SZZCJ,WS],[SZZCJ,QRJ],[SZZCJ,QRJ,WS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_662() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","zvqSu","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[zvqSu],[zvqSu,M],[a],[a,M],[a,zvqSu],[a,zvqSu,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_663() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XsN","i","RCdKg","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[RCdKg],[RCdKg,o],[i],[i,o],[i,RCdKg],[i,RCdKg,o],[XsN],[XsN,o],[XsN,RCdKg],[XsN,RCdKg,o],[XsN,i],[XsN,i,o],[XsN,i,RCdKg],[XsN,i,RCdKg,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_664() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uypB","fIldb","VMKMA","zC","PZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PZ],[zC],[zC,PZ],[VMKMA],[VMKMA,PZ],[VMKMA,zC],[VMKMA,zC,PZ],[fIldb],[fIldb,PZ],[fIldb,zC],[fIldb,zC,PZ],[fIldb,VMKMA],[fIldb,VMKMA,PZ],[fIldb,VMKMA,zC],[fIldb,VMKMA,zC,PZ],[uypB],[uypB,PZ],[uypB,zC],[uypB,zC,PZ],[uypB,VMKMA],[uypB,VMKMA,PZ],[uypB,VMKMA,zC],[uypB,VMKMA,zC,PZ],[uypB,fIldb],[uypB,fIldb,PZ],[uypB,fIldb,zC],[uypB,fIldb,zC,PZ],[uypB,fIldb,VMKMA],[uypB,fIldb,VMKMA,PZ],[uypB,fIldb,VMKMA,zC],[uypB,fIldb,VMKMA,zC,PZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_665() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UfT","rtL","QXc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QXc],[rtL],[rtL,QXc],[UfT],[UfT,QXc],[UfT,rtL],[UfT,rtL,QXc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_666() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "yJqk","x","rO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rO],[x],[x,rO],[yJqk],[yJqk,rO],[yJqk,x],[yJqk,x,rO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_667() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "saSeh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[saSeh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_668() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[s]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_669() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[a]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_670() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "n","JH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JH],[n],[n,JH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_671() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zlwo","GPugz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GPugz],[Zlwo],[Zlwo,GPugz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_672() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TrTzx","U","hQ","hc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hc],[hQ],[hQ,hc],[U],[U,hc],[U,hQ],[U,hQ,hc],[TrTzx],[TrTzx,hc],[TrTzx,hQ],[TrTzx,hQ,hc],[TrTzx,U],[TrTzx,U,hc],[TrTzx,U,hQ],[TrTzx,U,hQ,hc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_673() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LnMuE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LnMuE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_674() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","ccGr","bVL","z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z],[bVL],[bVL,z],[ccGr],[ccGr,z],[ccGr,bVL],[ccGr,bVL,z],[t],[t,z],[t,bVL],[t,bVL,z],[t,ccGr],[t,ccGr,z],[t,ccGr,bVL],[t,ccGr,bVL,z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_675() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KccmQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KccmQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_676() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iyybz","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[iyybz],[iyybz,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_677() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PSnO","Hs","ztxT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ztxT],[Hs],[Hs,ztxT],[PSnO],[PSnO,ztxT],[PSnO,Hs],[PSnO,Hs,ztxT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_678() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jZ","LAx","b","G","FXNV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FXNV],[G],[G,FXNV],[b],[b,FXNV],[b,G],[b,G,FXNV],[LAx],[LAx,FXNV],[LAx,G],[LAx,G,FXNV],[LAx,b],[LAx,b,FXNV],[LAx,b,G],[LAx,b,G,FXNV],[jZ],[jZ,FXNV],[jZ,G],[jZ,G,FXNV],[jZ,b],[jZ,b,FXNV],[jZ,b,G],[jZ,b,G,FXNV],[jZ,LAx],[jZ,LAx,FXNV],[jZ,LAx,G],[jZ,LAx,G,FXNV],[jZ,LAx,b],[jZ,LAx,b,FXNV],[jZ,LAx,b,G],[jZ,LAx,b,G,FXNV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_679() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Nt","oMy","KE","NL","cB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cB],[NL],[NL,cB],[KE],[KE,cB],[KE,NL],[KE,NL,cB],[oMy],[oMy,cB],[oMy,NL],[oMy,NL,cB],[oMy,KE],[oMy,KE,cB],[oMy,KE,NL],[oMy,KE,NL,cB],[Nt],[Nt,cB],[Nt,NL],[Nt,NL,cB],[Nt,KE],[Nt,KE,cB],[Nt,KE,NL],[Nt,KE,NL,cB],[Nt,oMy],[Nt,oMy,cB],[Nt,oMy,NL],[Nt,oMy,NL,cB],[Nt,oMy,KE],[Nt,oMy,KE,cB],[Nt,oMy,KE,NL],[Nt,oMy,KE,NL,cB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_680() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[W]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_681() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BT","eZ","VrlYo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VrlYo],[eZ],[eZ,VrlYo],[BT],[BT,VrlYo],[BT,eZ],[BT,eZ,VrlYo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_682() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","Zbz","ohT","Dry","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[Dry],[Dry,n],[ohT],[ohT,n],[ohT,Dry],[ohT,Dry,n],[Zbz],[Zbz,n],[Zbz,Dry],[Zbz,Dry,n],[Zbz,ohT],[Zbz,ohT,n],[Zbz,ohT,Dry],[Zbz,ohT,Dry,n],[r],[r,n],[r,Dry],[r,Dry,n],[r,ohT],[r,ohT,n],[r,ohT,Dry],[r,ohT,Dry,n],[r,Zbz],[r,Zbz,n],[r,Zbz,Dry],[r,Zbz,Dry,n],[r,Zbz,ohT],[r,Zbz,ohT,n],[r,Zbz,ohT,Dry],[r,Zbz,ohT,Dry,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_683() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "l","M","zqS","Qdqbo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Qdqbo],[zqS],[zqS,Qdqbo],[M],[M,Qdqbo],[M,zqS],[M,zqS,Qdqbo],[l],[l,Qdqbo],[l,zqS],[l,zqS,Qdqbo],[l,M],[l,M,Qdqbo],[l,M,zqS],[l,M,zqS,Qdqbo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_684() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UG","kIC","jtGhg","pqCWz","IxRub")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IxRub],[pqCWz],[pqCWz,IxRub],[jtGhg],[jtGhg,IxRub],[jtGhg,pqCWz],[jtGhg,pqCWz,IxRub],[kIC],[kIC,IxRub],[kIC,pqCWz],[kIC,pqCWz,IxRub],[kIC,jtGhg],[kIC,jtGhg,IxRub],[kIC,jtGhg,pqCWz],[kIC,jtGhg,pqCWz,IxRub],[UG],[UG,IxRub],[UG,pqCWz],[UG,pqCWz,IxRub],[UG,jtGhg],[UG,jtGhg,IxRub],[UG,jtGhg,pqCWz],[UG,jtGhg,pqCWz,IxRub],[UG,kIC],[UG,kIC,IxRub],[UG,kIC,pqCWz],[UG,kIC,pqCWz,IxRub],[UG,kIC,jtGhg],[UG,kIC,jtGhg,IxRub],[UG,kIC,jtGhg,pqCWz],[UG,kIC,jtGhg,pqCWz,IxRub]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_685() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vwv","Gazk","ysfRz","m","Zi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Zi],[m],[m,Zi],[ysfRz],[ysfRz,Zi],[ysfRz,m],[ysfRz,m,Zi],[Gazk],[Gazk,Zi],[Gazk,m],[Gazk,m,Zi],[Gazk,ysfRz],[Gazk,ysfRz,Zi],[Gazk,ysfRz,m],[Gazk,ysfRz,m,Zi],[vwv],[vwv,Zi],[vwv,m],[vwv,m,Zi],[vwv,ysfRz],[vwv,ysfRz,Zi],[vwv,ysfRz,m],[vwv,ysfRz,m,Zi],[vwv,Gazk],[vwv,Gazk,Zi],[vwv,Gazk,m],[vwv,Gazk,m,Zi],[vwv,Gazk,ysfRz],[vwv,Gazk,ysfRz,Zi],[vwv,Gazk,ysfRz,m],[vwv,Gazk,ysfRz,m,Zi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_686() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rAPkZ","rttn","fpGuG","nm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nm],[fpGuG],[fpGuG,nm],[rttn],[rttn,nm],[rttn,fpGuG],[rttn,fpGuG,nm],[rAPkZ],[rAPkZ,nm],[rAPkZ,fpGuG],[rAPkZ,fpGuG,nm],[rAPkZ,rttn],[rAPkZ,rttn,nm],[rAPkZ,rttn,fpGuG],[rAPkZ,rttn,fpGuG,nm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_687() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zjb","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[zjb],[zjb,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_688() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_689() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[b]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_690() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XLqYj","sWJpH","bY","x","ds")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ds],[x],[x,ds],[bY],[bY,ds],[bY,x],[bY,x,ds],[sWJpH],[sWJpH,ds],[sWJpH,x],[sWJpH,x,ds],[sWJpH,bY],[sWJpH,bY,ds],[sWJpH,bY,x],[sWJpH,bY,x,ds],[XLqYj],[XLqYj,ds],[XLqYj,x],[XLqYj,x,ds],[XLqYj,bY],[XLqYj,bY,ds],[XLqYj,bY,x],[XLqYj,bY,x,ds],[XLqYj,sWJpH],[XLqYj,sWJpH,ds],[XLqYj,sWJpH,x],[XLqYj,sWJpH,x,ds],[XLqYj,sWJpH,bY],[XLqYj,sWJpH,bY,ds],[XLqYj,sWJpH,bY,x],[XLqYj,sWJpH,bY,x,ds]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_691() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","C","XQD","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[XQD],[XQD,L],[C],[C,L],[C,XQD],[C,XQD,L],[b],[b,L],[b,XQD],[b,XQD,L],[b,C],[b,C,L],[b,C,XQD],[b,C,XQD,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_692() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[W]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_693() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","u","Rcx","snsz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[snsz],[Rcx],[Rcx,snsz],[u],[u,snsz],[u,Rcx],[u,Rcx,snsz],[s],[s,snsz],[s,Rcx],[s,Rcx,snsz],[s,u],[s,u,snsz],[s,u,Rcx],[s,u,Rcx,snsz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_694() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "daJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[daJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_695() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "txT","atTq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[atTq],[txT],[txT,atTq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_696() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iLZfY","j","ep","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[ep],[ep,L],[j],[j,L],[j,ep],[j,ep,L],[iLZfY],[iLZfY,L],[iLZfY,ep],[iLZfY,ep,L],[iLZfY,j],[iLZfY,j,L],[iLZfY,j,ep],[iLZfY,j,ep,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_697() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fmxXb","upWG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[upWG],[fmxXb],[fmxXb,upWG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_698() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fbi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fbi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_699() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","sPVXa","YG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YG],[sPVXa],[sPVXa,YG],[b],[b,YG],[b,sPVXa],[b,sPVXa,YG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_700() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ByhR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ByhR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_701() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IBJTD","K","SsUeJ","RmZ","pMK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pMK],[RmZ],[RmZ,pMK],[SsUeJ],[SsUeJ,pMK],[SsUeJ,RmZ],[SsUeJ,RmZ,pMK],[K],[K,pMK],[K,RmZ],[K,RmZ,pMK],[K,SsUeJ],[K,SsUeJ,pMK],[K,SsUeJ,RmZ],[K,SsUeJ,RmZ,pMK],[IBJTD],[IBJTD,pMK],[IBJTD,RmZ],[IBJTD,RmZ,pMK],[IBJTD,SsUeJ],[IBJTD,SsUeJ,pMK],[IBJTD,SsUeJ,RmZ],[IBJTD,SsUeJ,RmZ,pMK],[IBJTD,K],[IBJTD,K,pMK],[IBJTD,K,RmZ],[IBJTD,K,RmZ,pMK],[IBJTD,K,SsUeJ],[IBJTD,K,SsUeJ,pMK],[IBJTD,K,SsUeJ,RmZ],[IBJTD,K,SsUeJ,RmZ,pMK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_702() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XzJr","mljXh","LEZO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LEZO],[mljXh],[mljXh,LEZO],[XzJr],[XzJr,LEZO],[XzJr,mljXh],[XzJr,mljXh,LEZO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_703() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CD","J","jd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jd],[J],[J,jd],[CD],[CD,jd],[CD,J],[CD,J,jd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_704() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OAF","jlWJh","k","cPolO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cPolO],[k],[k,cPolO],[jlWJh],[jlWJh,cPolO],[jlWJh,k],[jlWJh,k,cPolO],[OAF],[OAF,cPolO],[OAF,k],[OAF,k,cPolO],[OAF,jlWJh],[OAF,jlWJh,cPolO],[OAF,jlWJh,k],[OAF,jlWJh,k,cPolO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_705() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ngY","cv","d","dRohK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dRohK],[d],[d,dRohK],[cv],[cv,dRohK],[cv,d],[cv,d,dRohK],[ngY],[ngY,dRohK],[ngY,d],[ngY,d,dRohK],[ngY,cv],[ngY,cv,dRohK],[ngY,cv,d],[ngY,cv,d,dRohK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_706() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Zj","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[Zj],[Zj,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_707() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IhQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IhQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_708() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Mcv","WNsv","PtxfJ","BPw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BPw],[PtxfJ],[PtxfJ,BPw],[WNsv],[WNsv,BPw],[WNsv,PtxfJ],[WNsv,PtxfJ,BPw],[Mcv],[Mcv,BPw],[Mcv,PtxfJ],[Mcv,PtxfJ,BPw],[Mcv,WNsv],[Mcv,WNsv,BPw],[Mcv,WNsv,PtxfJ],[Mcv,WNsv,PtxfJ,BPw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_709() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OtZA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OtZA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_710() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YPl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YPl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_711() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Kiq","Ov","zbB","UA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UA],[zbB],[zbB,UA],[Ov],[Ov,UA],[Ov,zbB],[Ov,zbB,UA],[Kiq],[Kiq,UA],[Kiq,zbB],[Kiq,zbB,UA],[Kiq,Ov],[Kiq,Ov,UA],[Kiq,Ov,zbB],[Kiq,Ov,zbB,UA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_712() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QsiN","Pr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Pr],[QsiN],[QsiN,Pr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_713() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Dk","ISS","Fa","XNJdc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XNJdc],[Fa],[Fa,XNJdc],[ISS],[ISS,XNJdc],[ISS,Fa],[ISS,Fa,XNJdc],[Dk],[Dk,XNJdc],[Dk,Fa],[Dk,Fa,XNJdc],[Dk,ISS],[Dk,ISS,XNJdc],[Dk,ISS,Fa],[Dk,ISS,Fa,XNJdc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_714() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rmDqa","zsKyD","DP","XbKH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XbKH],[DP],[DP,XbKH],[zsKyD],[zsKyD,XbKH],[zsKyD,DP],[zsKyD,DP,XbKH],[rmDqa],[rmDqa,XbKH],[rmDqa,DP],[rmDqa,DP,XbKH],[rmDqa,zsKyD],[rmDqa,zsKyD,XbKH],[rmDqa,zsKyD,DP],[rmDqa,zsKyD,DP,XbKH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_715() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FkF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FkF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_716() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","fXQi","K","ReldY","mbsK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mbsK],[ReldY],[ReldY,mbsK],[K],[K,mbsK],[K,ReldY],[K,ReldY,mbsK],[fXQi],[fXQi,mbsK],[fXQi,ReldY],[fXQi,ReldY,mbsK],[fXQi,K],[fXQi,K,mbsK],[fXQi,K,ReldY],[fXQi,K,ReldY,mbsK],[A],[A,mbsK],[A,ReldY],[A,ReldY,mbsK],[A,K],[A,K,mbsK],[A,K,ReldY],[A,K,ReldY,mbsK],[A,fXQi],[A,fXQi,mbsK],[A,fXQi,ReldY],[A,fXQi,ReldY,mbsK],[A,fXQi,K],[A,fXQi,K,mbsK],[A,fXQi,K,ReldY],[A,fXQi,K,ReldY,mbsK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_717() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vyNN","Dy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Dy],[vyNN],[vyNN,Dy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_718() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lvr","Cb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Cb],[lvr],[lvr,Cb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_719() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sHy","IqN","Kfd","y","TjE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TjE],[y],[y,TjE],[Kfd],[Kfd,TjE],[Kfd,y],[Kfd,y,TjE],[IqN],[IqN,TjE],[IqN,y],[IqN,y,TjE],[IqN,Kfd],[IqN,Kfd,TjE],[IqN,Kfd,y],[IqN,Kfd,y,TjE],[sHy],[sHy,TjE],[sHy,y],[sHy,y,TjE],[sHy,Kfd],[sHy,Kfd,TjE],[sHy,Kfd,y],[sHy,Kfd,y,TjE],[sHy,IqN],[sHy,IqN,TjE],[sHy,IqN,y],[sHy,IqN,y,TjE],[sHy,IqN,Kfd],[sHy,IqN,Kfd,TjE],[sHy,IqN,Kfd,y],[sHy,IqN,Kfd,y,TjE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_720() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oor","ohKia","gcGY","TC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TC],[gcGY],[gcGY,TC],[ohKia],[ohKia,TC],[ohKia,gcGY],[ohKia,gcGY,TC],[oor],[oor,TC],[oor,gcGY],[oor,gcGY,TC],[oor,ohKia],[oor,ohKia,TC],[oor,ohKia,gcGY],[oor,ohKia,gcGY,TC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_721() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Gu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Gu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_722() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RhoAl","gnI","ics","pY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pY],[ics],[ics,pY],[gnI],[gnI,pY],[gnI,ics],[gnI,ics,pY],[RhoAl],[RhoAl,pY],[RhoAl,ics],[RhoAl,ics,pY],[RhoAl,gnI],[RhoAl,gnI,pY],[RhoAl,gnI,ics],[RhoAl,gnI,ics,pY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_723() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "boNpI","qn","KnA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KnA],[qn],[qn,KnA],[boNpI],[boNpI,KnA],[boNpI,qn],[boNpI,qn,KnA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_724() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "M","MFxZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MFxZ],[M],[M,MFxZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_725() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WRgv","bPc","OE","xlEa","oPPK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oPPK],[xlEa],[xlEa,oPPK],[OE],[OE,oPPK],[OE,xlEa],[OE,xlEa,oPPK],[bPc],[bPc,oPPK],[bPc,xlEa],[bPc,xlEa,oPPK],[bPc,OE],[bPc,OE,oPPK],[bPc,OE,xlEa],[bPc,OE,xlEa,oPPK],[WRgv],[WRgv,oPPK],[WRgv,xlEa],[WRgv,xlEa,oPPK],[WRgv,OE],[WRgv,OE,oPPK],[WRgv,OE,xlEa],[WRgv,OE,xlEa,oPPK],[WRgv,bPc],[WRgv,bPc,oPPK],[WRgv,bPc,xlEa],[WRgv,bPc,xlEa,oPPK],[WRgv,bPc,OE],[WRgv,bPc,OE,oPPK],[WRgv,bPc,OE,xlEa],[WRgv,bPc,OE,xlEa,oPPK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_726() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","tdovg","VPq","NPZyw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NPZyw],[VPq],[VPq,NPZyw],[tdovg],[tdovg,NPZyw],[tdovg,VPq],[tdovg,VPq,NPZyw],[Q],[Q,NPZyw],[Q,VPq],[Q,VPq,NPZyw],[Q,tdovg],[Q,tdovg,NPZyw],[Q,tdovg,VPq],[Q,tdovg,VPq,NPZyw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_727() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "h")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[h]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_728() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","CI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[CI],[P],[P,CI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_729() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pT","jlv","Wm","hq","evL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[evL],[hq],[hq,evL],[Wm],[Wm,evL],[Wm,hq],[Wm,hq,evL],[jlv],[jlv,evL],[jlv,hq],[jlv,hq,evL],[jlv,Wm],[jlv,Wm,evL],[jlv,Wm,hq],[jlv,Wm,hq,evL],[pT],[pT,evL],[pT,hq],[pT,hq,evL],[pT,Wm],[pT,Wm,evL],[pT,Wm,hq],[pT,Wm,hq,evL],[pT,jlv],[pT,jlv,evL],[pT,jlv,hq],[pT,jlv,hq,evL],[pT,jlv,Wm],[pT,jlv,Wm,evL],[pT,jlv,Wm,hq],[pT,jlv,Wm,hq,evL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_730() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mAe","r","fRyx","Mj","COBf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[COBf],[Mj],[Mj,COBf],[fRyx],[fRyx,COBf],[fRyx,Mj],[fRyx,Mj,COBf],[r],[r,COBf],[r,Mj],[r,Mj,COBf],[r,fRyx],[r,fRyx,COBf],[r,fRyx,Mj],[r,fRyx,Mj,COBf],[mAe],[mAe,COBf],[mAe,Mj],[mAe,Mj,COBf],[mAe,fRyx],[mAe,fRyx,COBf],[mAe,fRyx,Mj],[mAe,fRyx,Mj,COBf],[mAe,r],[mAe,r,COBf],[mAe,r,Mj],[mAe,r,Mj,COBf],[mAe,r,fRyx],[mAe,r,fRyx,COBf],[mAe,r,fRyx,Mj],[mAe,r,fRyx,Mj,COBf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_731() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eW","E")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[E],[eW],[eW,E]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_732() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uW","X","vp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vp],[X],[X,vp],[uW],[uW,vp],[uW,X],[uW,X,vp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_733() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","EMuo","Cu","LS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LS],[Cu],[Cu,LS],[EMuo],[EMuo,LS],[EMuo,Cu],[EMuo,Cu,LS],[A],[A,LS],[A,Cu],[A,Cu,LS],[A,EMuo],[A,EMuo,LS],[A,EMuo,Cu],[A,EMuo,Cu,LS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_734() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OT","oE","OvbRT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OvbRT],[oE],[oE,OvbRT],[OT],[OT,OvbRT],[OT,oE],[OT,oE,OvbRT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_735() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "T","V","MEhc","LTr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LTr],[MEhc],[MEhc,LTr],[V],[V,LTr],[V,MEhc],[V,MEhc,LTr],[T],[T,LTr],[T,MEhc],[T,MEhc,LTr],[T,V],[T,V,LTr],[T,V,MEhc],[T,V,MEhc,LTr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_736() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fZ","Wq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wq],[fZ],[fZ,Wq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_737() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nP","bT","RNI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RNI],[bT],[bT,RNI],[nP],[nP,RNI],[nP,bT],[nP,bT,RNI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_738() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","TW","uTX","lE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lE],[uTX],[uTX,lE],[TW],[TW,lE],[TW,uTX],[TW,uTX,lE],[a],[a,lE],[a,uTX],[a,uTX,lE],[a,TW],[a,TW,lE],[a,TW,uTX],[a,TW,uTX,lE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_739() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_740() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aF","sJuEW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sJuEW],[aF],[aF,sJuEW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_741() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eF","iSbnZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iSbnZ],[eF],[eF,iSbnZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_742() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oTcn","lum","YJpp","oFB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oFB],[YJpp],[YJpp,oFB],[lum],[lum,oFB],[lum,YJpp],[lum,YJpp,oFB],[oTcn],[oTcn,oFB],[oTcn,YJpp],[oTcn,YJpp,oFB],[oTcn,lum],[oTcn,lum,oFB],[oTcn,lum,YJpp],[oTcn,lum,YJpp,oFB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_743() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GP","vym","tdm","SFGxQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SFGxQ],[tdm],[tdm,SFGxQ],[vym],[vym,SFGxQ],[vym,tdm],[vym,tdm,SFGxQ],[GP],[GP,SFGxQ],[GP,tdm],[GP,tdm,SFGxQ],[GP,vym],[GP,vym,SFGxQ],[GP,vym,tdm],[GP,vym,tdm,SFGxQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_744() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kk","K","JCJWB","jY","Fpwad")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Fpwad],[jY],[jY,Fpwad],[JCJWB],[JCJWB,Fpwad],[JCJWB,jY],[JCJWB,jY,Fpwad],[K],[K,Fpwad],[K,jY],[K,jY,Fpwad],[K,JCJWB],[K,JCJWB,Fpwad],[K,JCJWB,jY],[K,JCJWB,jY,Fpwad],[kk],[kk,Fpwad],[kk,jY],[kk,jY,Fpwad],[kk,JCJWB],[kk,JCJWB,Fpwad],[kk,JCJWB,jY],[kk,JCJWB,jY,Fpwad],[kk,K],[kk,K,Fpwad],[kk,K,jY],[kk,K,jY,Fpwad],[kk,K,JCJWB],[kk,K,JCJWB,Fpwad],[kk,K,JCJWB,jY],[kk,K,JCJWB,jY,Fpwad]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_745() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "H","NNH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NNH],[H],[H,NNH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_746() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "khnR","ozg","SMrQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SMrQ],[ozg],[ozg,SMrQ],[khnR],[khnR,SMrQ],[khnR,ozg],[khnR,ozg,SMrQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_747() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fdCd","XsB","w","cfuY","Euo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Euo],[cfuY],[cfuY,Euo],[w],[w,Euo],[w,cfuY],[w,cfuY,Euo],[XsB],[XsB,Euo],[XsB,cfuY],[XsB,cfuY,Euo],[XsB,w],[XsB,w,Euo],[XsB,w,cfuY],[XsB,w,cfuY,Euo],[fdCd],[fdCd,Euo],[fdCd,cfuY],[fdCd,cfuY,Euo],[fdCd,w],[fdCd,w,Euo],[fdCd,w,cfuY],[fdCd,w,cfuY,Euo],[fdCd,XsB],[fdCd,XsB,Euo],[fdCd,XsB,cfuY],[fdCd,XsB,cfuY,Euo],[fdCd,XsB,w],[fdCd,XsB,w,Euo],[fdCd,XsB,w,cfuY],[fdCd,XsB,w,cfuY,Euo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_748() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","Xqw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xqw],[V],[V,Xqw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_749() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","qTj","qql","Xpejp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xpejp],[qql],[qql,Xpejp],[qTj],[qTj,Xpejp],[qTj,qql],[qTj,qql,Xpejp],[s],[s,Xpejp],[s,qql],[s,qql,Xpejp],[s,qTj],[s,qTj,Xpejp],[s,qTj,qql],[s,qTj,qql,Xpejp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_750() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uxDSh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uxDSh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_751() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PoNV","BW","Vlwia","ShKA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ShKA],[Vlwia],[Vlwia,ShKA],[BW],[BW,ShKA],[BW,Vlwia],[BW,Vlwia,ShKA],[PoNV],[PoNV,ShKA],[PoNV,Vlwia],[PoNV,Vlwia,ShKA],[PoNV,BW],[PoNV,BW,ShKA],[PoNV,BW,Vlwia],[PoNV,BW,Vlwia,ShKA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_752() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rBpsI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rBpsI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_753() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jPH","f","LOPXn","hB","ED")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ED],[hB],[hB,ED],[LOPXn],[LOPXn,ED],[LOPXn,hB],[LOPXn,hB,ED],[f],[f,ED],[f,hB],[f,hB,ED],[f,LOPXn],[f,LOPXn,ED],[f,LOPXn,hB],[f,LOPXn,hB,ED],[jPH],[jPH,ED],[jPH,hB],[jPH,hB,ED],[jPH,LOPXn],[jPH,LOPXn,ED],[jPH,LOPXn,hB],[jPH,LOPXn,hB,ED],[jPH,f],[jPH,f,ED],[jPH,f,hB],[jPH,f,hB,ED],[jPH,f,LOPXn],[jPH,f,LOPXn,ED],[jPH,f,LOPXn,hB],[jPH,f,LOPXn,hB,ED]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_754() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uEA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uEA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_755() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VF","d","gkVg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gkVg],[d],[d,gkVg],[VF],[VF,gkVg],[VF,d],[VF,d,gkVg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_756() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TAQv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TAQv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_757() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","ixyQ","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[ixyQ],[ixyQ,o],[t],[t,o],[t,ixyQ],[t,ixyQ,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_758() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","C","W","JqIj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JqIj],[W],[W,JqIj],[C],[C,JqIj],[C,W],[C,W,JqIj],[R],[R,JqIj],[R,W],[R,W,JqIj],[R,C],[R,C,JqIj],[R,C,W],[R,C,W,JqIj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_759() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PwY","d","wHU","VsmPW","dPVN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dPVN],[VsmPW],[VsmPW,dPVN],[wHU],[wHU,dPVN],[wHU,VsmPW],[wHU,VsmPW,dPVN],[d],[d,dPVN],[d,VsmPW],[d,VsmPW,dPVN],[d,wHU],[d,wHU,dPVN],[d,wHU,VsmPW],[d,wHU,VsmPW,dPVN],[PwY],[PwY,dPVN],[PwY,VsmPW],[PwY,VsmPW,dPVN],[PwY,wHU],[PwY,wHU,dPVN],[PwY,wHU,VsmPW],[PwY,wHU,VsmPW,dPVN],[PwY,d],[PwY,d,dPVN],[PwY,d,VsmPW],[PwY,d,VsmPW,dPVN],[PwY,d,wHU],[PwY,d,wHU,dPVN],[PwY,d,wHU,VsmPW],[PwY,d,wHU,VsmPW,dPVN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_760() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_761() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SGJ","TWM","JG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JG],[TWM],[TWM,JG],[SGJ],[SGJ,JG],[SGJ,TWM],[SGJ,TWM,JG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_762() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sedY","CJDJ","bX","KC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KC],[bX],[bX,KC],[CJDJ],[CJDJ,KC],[CJDJ,bX],[CJDJ,bX,KC],[sedY],[sedY,KC],[sedY,bX],[sedY,bX,KC],[sedY,CJDJ],[sedY,CJDJ,KC],[sedY,CJDJ,bX],[sedY,CJDJ,bX,KC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_763() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","DgB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DgB],[D],[D,DgB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_764() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ieKyI","lJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lJ],[ieKyI],[ieKyI,lJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_765() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "coV","eisa","YSgt","bsJy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bsJy],[YSgt],[YSgt,bsJy],[eisa],[eisa,bsJy],[eisa,YSgt],[eisa,YSgt,bsJy],[coV],[coV,bsJy],[coV,YSgt],[coV,YSgt,bsJy],[coV,eisa],[coV,eisa,bsJy],[coV,eisa,YSgt],[coV,eisa,YSgt,bsJy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_766() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Dsv","Tj","dQoT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dQoT],[Tj],[Tj,dQoT],[Dsv],[Dsv,dQoT],[Dsv,Tj],[Dsv,Tj,dQoT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_767() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pcxTG","a","g","GrSF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GrSF],[g],[g,GrSF],[a],[a,GrSF],[a,g],[a,g,GrSF],[pcxTG],[pcxTG,GrSF],[pcxTG,g],[pcxTG,g,GrSF],[pcxTG,a],[pcxTG,a,GrSF],[pcxTG,a,g],[pcxTG,a,g,GrSF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_768() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QEO","hZMMJ","QPi","UPsTX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UPsTX],[QPi],[QPi,UPsTX],[hZMMJ],[hZMMJ,UPsTX],[hZMMJ,QPi],[hZMMJ,QPi,UPsTX],[QEO],[QEO,UPsTX],[QEO,QPi],[QEO,QPi,UPsTX],[QEO,hZMMJ],[QEO,hZMMJ,UPsTX],[QEO,hZMMJ,QPi],[QEO,hZMMJ,QPi,UPsTX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_769() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "F","lIwV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lIwV],[F],[F,lIwV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_770() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_771() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kwSx","inQXh","w","WCyQ","mJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mJ],[WCyQ],[WCyQ,mJ],[w],[w,mJ],[w,WCyQ],[w,WCyQ,mJ],[inQXh],[inQXh,mJ],[inQXh,WCyQ],[inQXh,WCyQ,mJ],[inQXh,w],[inQXh,w,mJ],[inQXh,w,WCyQ],[inQXh,w,WCyQ,mJ],[kwSx],[kwSx,mJ],[kwSx,WCyQ],[kwSx,WCyQ,mJ],[kwSx,w],[kwSx,w,mJ],[kwSx,w,WCyQ],[kwSx,w,WCyQ,mJ],[kwSx,inQXh],[kwSx,inQXh,mJ],[kwSx,inQXh,WCyQ],[kwSx,inQXh,WCyQ,mJ],[kwSx,inQXh,w],[kwSx,inQXh,w,mJ],[kwSx,inQXh,w,WCyQ],[kwSx,inQXh,w,WCyQ,mJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_772() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TcAT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TcAT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_773() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","Xro","FXLyN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FXLyN],[Xro],[Xro,FXLyN],[s],[s,FXLyN],[s,Xro],[s,Xro,FXLyN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_774() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wH","B","yTb","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[yTb],[yTb,O],[B],[B,O],[B,yTb],[B,yTb,O],[wH],[wH,O],[wH,yTb],[wH,yTb,O],[wH,B],[wH,B,O],[wH,B,yTb],[wH,B,yTb,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_775() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xASTc","eQg","cSmq","LLFLu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LLFLu],[cSmq],[cSmq,LLFLu],[eQg],[eQg,LLFLu],[eQg,cSmq],[eQg,cSmq,LLFLu],[xASTc],[xASTc,LLFLu],[xASTc,cSmq],[xASTc,cSmq,LLFLu],[xASTc,eQg],[xASTc,eQg,LLFLu],[xASTc,eQg,cSmq],[xASTc,eQg,cSmq,LLFLu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_776() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EXD","Ev","VKDaJ","H","so")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[so],[H],[H,so],[VKDaJ],[VKDaJ,so],[VKDaJ,H],[VKDaJ,H,so],[Ev],[Ev,so],[Ev,H],[Ev,H,so],[Ev,VKDaJ],[Ev,VKDaJ,so],[Ev,VKDaJ,H],[Ev,VKDaJ,H,so],[EXD],[EXD,so],[EXD,H],[EXD,H,so],[EXD,VKDaJ],[EXD,VKDaJ,so],[EXD,VKDaJ,H],[EXD,VKDaJ,H,so],[EXD,Ev],[EXD,Ev,so],[EXD,Ev,H],[EXD,Ev,H,so],[EXD,Ev,VKDaJ],[EXD,Ev,VKDaJ,so],[EXD,Ev,VKDaJ,H],[EXD,Ev,VKDaJ,H,so]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_777() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EACna","FMk","sqE","SsSPY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SsSPY],[sqE],[sqE,SsSPY],[FMk],[FMk,SsSPY],[FMk,sqE],[FMk,sqE,SsSPY],[EACna],[EACna,SsSPY],[EACna,sqE],[EACna,sqE,SsSPY],[EACna,FMk],[EACna,FMk,SsSPY],[EACna,FMk,sqE],[EACna,FMk,sqE,SsSPY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_778() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uDA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uDA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_779() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TE","TDoT","EK","CGvU","Uhp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Uhp],[CGvU],[CGvU,Uhp],[EK],[EK,Uhp],[EK,CGvU],[EK,CGvU,Uhp],[TDoT],[TDoT,Uhp],[TDoT,CGvU],[TDoT,CGvU,Uhp],[TDoT,EK],[TDoT,EK,Uhp],[TDoT,EK,CGvU],[TDoT,EK,CGvU,Uhp],[TE],[TE,Uhp],[TE,CGvU],[TE,CGvU,Uhp],[TE,EK],[TE,EK,Uhp],[TE,EK,CGvU],[TE,EK,CGvU,Uhp],[TE,TDoT],[TE,TDoT,Uhp],[TE,TDoT,CGvU],[TE,TDoT,CGvU,Uhp],[TE,TDoT,EK],[TE,TDoT,EK,Uhp],[TE,TDoT,EK,CGvU],[TE,TDoT,EK,CGvU,Uhp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_780() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "W","ojuV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ojuV],[W],[W,ojuV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_781() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Yzsyc","hOK","DdGC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DdGC],[hOK],[hOK,DdGC],[Yzsyc],[Yzsyc,DdGC],[Yzsyc,hOK],[Yzsyc,hOK,DdGC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_782() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ycjI","S","UR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UR],[S],[S,UR],[ycjI],[ycjI,UR],[ycjI,S],[ycjI,S,UR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_783() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XH","Q","T")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[T],[Q],[Q,T],[XH],[XH,T],[XH,Q],[XH,Q,T]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_784() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wj","XTDqq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XTDqq],[wj],[wj,XTDqq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_785() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OMmRD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OMmRD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_786() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","V","NtNFw","cRk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cRk],[NtNFw],[NtNFw,cRk],[V],[V,cRk],[V,NtNFw],[V,NtNFw,cRk],[a],[a,cRk],[a,NtNFw],[a,NtNFw,cRk],[a,V],[a,V,cRk],[a,V,NtNFw],[a,V,NtNFw,cRk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_787() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "igD","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[igD],[igD,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_788() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DYArd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DYArd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_789() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dd","mWUC","RgRx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RgRx],[mWUC],[mWUC,RgRx],[dd],[dd,RgRx],[dd,mWUC],[dd,mWUC,RgRx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_790() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ykr","r","Jn","IYuD","sb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sb],[IYuD],[IYuD,sb],[Jn],[Jn,sb],[Jn,IYuD],[Jn,IYuD,sb],[r],[r,sb],[r,IYuD],[r,IYuD,sb],[r,Jn],[r,Jn,sb],[r,Jn,IYuD],[r,Jn,IYuD,sb],[Ykr],[Ykr,sb],[Ykr,IYuD],[Ykr,IYuD,sb],[Ykr,Jn],[Ykr,Jn,sb],[Ykr,Jn,IYuD],[Ykr,Jn,IYuD,sb],[Ykr,r],[Ykr,r,sb],[Ykr,r,IYuD],[Ykr,r,IYuD,sb],[Ykr,r,Jn],[Ykr,r,Jn,sb],[Ykr,r,Jn,IYuD],[Ykr,r,Jn,IYuD,sb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_791() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","pC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pC],[Q],[Q,pC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_792() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","jqRjX","AWK","uyxvS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uyxvS],[AWK],[AWK,uyxvS],[jqRjX],[jqRjX,uyxvS],[jqRjX,AWK],[jqRjX,AWK,uyxvS],[B],[B,uyxvS],[B,AWK],[B,AWK,uyxvS],[B,jqRjX],[B,jqRjX,uyxvS],[B,jqRjX,AWK],[B,jqRjX,AWK,uyxvS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_793() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_794() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Yl","oSPCd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oSPCd],[Yl],[Yl,oSPCd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_795() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ae","YGGmr","dprDw","lj","SEQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SEQ],[lj],[lj,SEQ],[dprDw],[dprDw,SEQ],[dprDw,lj],[dprDw,lj,SEQ],[YGGmr],[YGGmr,SEQ],[YGGmr,lj],[YGGmr,lj,SEQ],[YGGmr,dprDw],[YGGmr,dprDw,SEQ],[YGGmr,dprDw,lj],[YGGmr,dprDw,lj,SEQ],[Ae],[Ae,SEQ],[Ae,lj],[Ae,lj,SEQ],[Ae,dprDw],[Ae,dprDw,SEQ],[Ae,dprDw,lj],[Ae,dprDw,lj,SEQ],[Ae,YGGmr],[Ae,YGGmr,SEQ],[Ae,YGGmr,lj],[Ae,YGGmr,lj,SEQ],[Ae,YGGmr,dprDw],[Ae,YGGmr,dprDw,SEQ],[Ae,YGGmr,dprDw,lj],[Ae,YGGmr,dprDw,lj,SEQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_796() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "foj","uKJ","w","RRf","BMKe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BMKe],[RRf],[RRf,BMKe],[w],[w,BMKe],[w,RRf],[w,RRf,BMKe],[uKJ],[uKJ,BMKe],[uKJ,RRf],[uKJ,RRf,BMKe],[uKJ,w],[uKJ,w,BMKe],[uKJ,w,RRf],[uKJ,w,RRf,BMKe],[foj],[foj,BMKe],[foj,RRf],[foj,RRf,BMKe],[foj,w],[foj,w,BMKe],[foj,w,RRf],[foj,w,RRf,BMKe],[foj,uKJ],[foj,uKJ,BMKe],[foj,uKJ,RRf],[foj,uKJ,RRf,BMKe],[foj,uKJ,w],[foj,uKJ,w,BMKe],[foj,uKJ,w,RRf],[foj,uKJ,w,RRf,BMKe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_797() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","S","nC","LqAJ","fIyG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fIyG],[LqAJ],[LqAJ,fIyG],[nC],[nC,fIyG],[nC,LqAJ],[nC,LqAJ,fIyG],[S],[S,fIyG],[S,LqAJ],[S,LqAJ,fIyG],[S,nC],[S,nC,fIyG],[S,nC,LqAJ],[S,nC,LqAJ,fIyG],[A],[A,fIyG],[A,LqAJ],[A,LqAJ,fIyG],[A,nC],[A,nC,fIyG],[A,nC,LqAJ],[A,nC,LqAJ,fIyG],[A,S],[A,S,fIyG],[A,S,LqAJ],[A,S,LqAJ,fIyG],[A,S,nC],[A,S,nC,fIyG],[A,S,nC,LqAJ],[A,S,nC,LqAJ,fIyG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_798() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lnYjy","TMnh","gYISl","bgRM","GYQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GYQ],[bgRM],[bgRM,GYQ],[gYISl],[gYISl,GYQ],[gYISl,bgRM],[gYISl,bgRM,GYQ],[TMnh],[TMnh,GYQ],[TMnh,bgRM],[TMnh,bgRM,GYQ],[TMnh,gYISl],[TMnh,gYISl,GYQ],[TMnh,gYISl,bgRM],[TMnh,gYISl,bgRM,GYQ],[lnYjy],[lnYjy,GYQ],[lnYjy,bgRM],[lnYjy,bgRM,GYQ],[lnYjy,gYISl],[lnYjy,gYISl,GYQ],[lnYjy,gYISl,bgRM],[lnYjy,gYISl,bgRM,GYQ],[lnYjy,TMnh],[lnYjy,TMnh,GYQ],[lnYjy,TMnh,bgRM],[lnYjy,TMnh,bgRM,GYQ],[lnYjy,TMnh,gYISl],[lnYjy,TMnh,gYISl,GYQ],[lnYjy,TMnh,gYISl,bgRM],[lnYjy,TMnh,gYISl,bgRM,GYQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_799() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rzEZf","k","aZH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aZH],[k],[k,aZH],[rzEZf],[rzEZf,aZH],[rzEZf,k],[rzEZf,k,aZH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_800() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ojSU","IB","Fp","tc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tc],[Fp],[Fp,tc],[IB],[IB,tc],[IB,Fp],[IB,Fp,tc],[ojSU],[ojSU,tc],[ojSU,Fp],[ojSU,Fp,tc],[ojSU,IB],[ojSU,IB,tc],[ojSU,IB,Fp],[ojSU,IB,Fp,tc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_801() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "h","Joc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Joc],[h],[h,Joc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_802() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AQi","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[AQi],[AQi,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_803() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SAmE","zxlkK","cUb","nuTC","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[nuTC],[nuTC,K],[cUb],[cUb,K],[cUb,nuTC],[cUb,nuTC,K],[zxlkK],[zxlkK,K],[zxlkK,nuTC],[zxlkK,nuTC,K],[zxlkK,cUb],[zxlkK,cUb,K],[zxlkK,cUb,nuTC],[zxlkK,cUb,nuTC,K],[SAmE],[SAmE,K],[SAmE,nuTC],[SAmE,nuTC,K],[SAmE,cUb],[SAmE,cUb,K],[SAmE,cUb,nuTC],[SAmE,cUb,nuTC,K],[SAmE,zxlkK],[SAmE,zxlkK,K],[SAmE,zxlkK,nuTC],[SAmE,zxlkK,nuTC,K],[SAmE,zxlkK,cUb],[SAmE,zxlkK,cUb,K],[SAmE,zxlkK,cUb,nuTC],[SAmE,zxlkK,cUb,nuTC,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_804() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[t]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_805() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "h")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[h]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_806() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","lZmEn","x")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[x],[lZmEn],[lZmEn,x],[Q],[Q,x],[Q,lZmEn],[Q,lZmEn,x]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_807() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pUl","zt")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zt],[pUl],[pUl,zt]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_808() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OV","J","ki")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ki],[J],[J,ki],[OV],[OV,ki],[OV,J],[OV,J,ki]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_809() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Bds","E","UFE","Z","wYA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wYA],[Z],[Z,wYA],[UFE],[UFE,wYA],[UFE,Z],[UFE,Z,wYA],[E],[E,wYA],[E,Z],[E,Z,wYA],[E,UFE],[E,UFE,wYA],[E,UFE,Z],[E,UFE,Z,wYA],[Bds],[Bds,wYA],[Bds,Z],[Bds,Z,wYA],[Bds,UFE],[Bds,UFE,wYA],[Bds,UFE,Z],[Bds,UFE,Z,wYA],[Bds,E],[Bds,E,wYA],[Bds,E,Z],[Bds,E,Z,wYA],[Bds,E,UFE],[Bds,E,UFE,wYA],[Bds,E,UFE,Z],[Bds,E,UFE,Z,wYA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_810() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rESrh","S","CkcxG","hfy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hfy],[CkcxG],[CkcxG,hfy],[S],[S,hfy],[S,CkcxG],[S,CkcxG,hfy],[rESrh],[rESrh,hfy],[rESrh,CkcxG],[rESrh,CkcxG,hfy],[rESrh,S],[rESrh,S,hfy],[rESrh,S,CkcxG],[rESrh,S,CkcxG,hfy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_811() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VuMG","cVVsi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cVVsi],[VuMG],[VuMG,cVVsi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_812() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EWfhy","E","G","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[G],[G,M],[E],[E,M],[E,G],[E,G,M],[EWfhy],[EWfhy,M],[EWfhy,G],[EWfhy,G,M],[EWfhy,E],[EWfhy,E,M],[EWfhy,E,G],[EWfhy,E,G,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_813() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZYtNF","bLOxr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bLOxr],[ZYtNF],[ZYtNF,bLOxr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_814() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PEyp","ep","MuGzZ","aID","cB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cB],[aID],[aID,cB],[MuGzZ],[MuGzZ,cB],[MuGzZ,aID],[MuGzZ,aID,cB],[ep],[ep,cB],[ep,aID],[ep,aID,cB],[ep,MuGzZ],[ep,MuGzZ,cB],[ep,MuGzZ,aID],[ep,MuGzZ,aID,cB],[PEyp],[PEyp,cB],[PEyp,aID],[PEyp,aID,cB],[PEyp,MuGzZ],[PEyp,MuGzZ,cB],[PEyp,MuGzZ,aID],[PEyp,MuGzZ,aID,cB],[PEyp,ep],[PEyp,ep,cB],[PEyp,ep,aID],[PEyp,ep,aID,cB],[PEyp,ep,MuGzZ],[PEyp,ep,MuGzZ,cB],[PEyp,ep,MuGzZ,aID],[PEyp,ep,MuGzZ,aID,cB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_815() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_816() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zZr","eNoq","iYbJM","yh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yh],[iYbJM],[iYbJM,yh],[eNoq],[eNoq,yh],[eNoq,iYbJM],[eNoq,iYbJM,yh],[zZr],[zZr,yh],[zZr,iYbJM],[zZr,iYbJM,yh],[zZr,eNoq],[zZr,eNoq,yh],[zZr,eNoq,iYbJM],[zZr,eNoq,iYbJM,yh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_817() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ylAhB","bX","Bx","rWwTh","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[rWwTh],[rWwTh,N],[Bx],[Bx,N],[Bx,rWwTh],[Bx,rWwTh,N],[bX],[bX,N],[bX,rWwTh],[bX,rWwTh,N],[bX,Bx],[bX,Bx,N],[bX,Bx,rWwTh],[bX,Bx,rWwTh,N],[ylAhB],[ylAhB,N],[ylAhB,rWwTh],[ylAhB,rWwTh,N],[ylAhB,Bx],[ylAhB,Bx,N],[ylAhB,Bx,rWwTh],[ylAhB,Bx,rWwTh,N],[ylAhB,bX],[ylAhB,bX,N],[ylAhB,bX,rWwTh],[ylAhB,bX,rWwTh,N],[ylAhB,bX,Bx],[ylAhB,bX,Bx,N],[ylAhB,bX,Bx,rWwTh],[ylAhB,bX,Bx,rWwTh,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_818() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "spR","ym","kwVqE","IYJNJ","y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[y],[IYJNJ],[IYJNJ,y],[kwVqE],[kwVqE,y],[kwVqE,IYJNJ],[kwVqE,IYJNJ,y],[ym],[ym,y],[ym,IYJNJ],[ym,IYJNJ,y],[ym,kwVqE],[ym,kwVqE,y],[ym,kwVqE,IYJNJ],[ym,kwVqE,IYJNJ,y],[spR],[spR,y],[spR,IYJNJ],[spR,IYJNJ,y],[spR,kwVqE],[spR,kwVqE,y],[spR,kwVqE,IYJNJ],[spR,kwVqE,IYJNJ,y],[spR,ym],[spR,ym,y],[spR,ym,IYJNJ],[spR,ym,IYJNJ,y],[spR,ym,kwVqE],[spR,ym,kwVqE,y],[spR,ym,kwVqE,IYJNJ],[spR,ym,kwVqE,IYJNJ,y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_819() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","sZcl","wNaC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wNaC],[sZcl],[sZcl,wNaC],[C],[C,wNaC],[C,sZcl],[C,sZcl,wNaC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_820() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LuI","qqXoB","GOo","ht","xu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xu],[ht],[ht,xu],[GOo],[GOo,xu],[GOo,ht],[GOo,ht,xu],[qqXoB],[qqXoB,xu],[qqXoB,ht],[qqXoB,ht,xu],[qqXoB,GOo],[qqXoB,GOo,xu],[qqXoB,GOo,ht],[qqXoB,GOo,ht,xu],[LuI],[LuI,xu],[LuI,ht],[LuI,ht,xu],[LuI,GOo],[LuI,GOo,xu],[LuI,GOo,ht],[LuI,GOo,ht,xu],[LuI,qqXoB],[LuI,qqXoB,xu],[LuI,qqXoB,ht],[LuI,qqXoB,ht,xu],[LuI,qqXoB,GOo],[LuI,qqXoB,GOo,xu],[LuI,qqXoB,GOo,ht],[LuI,qqXoB,GOo,ht,xu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_821() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "e","NWAg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NWAg],[e],[e,NWAg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_822() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sJgE","w")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[w],[sJgE],[sJgE,w]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_823() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jME")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jME]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_824() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","c","GQh","vU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vU],[GQh],[GQh,vU],[c],[c,vU],[c,GQh],[c,GQh,vU],[Q],[Q,vU],[Q,GQh],[Q,GQh,vU],[Q,c],[Q,c,vU],[Q,c,GQh],[Q,c,GQh,vU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_825() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KPLM","NPuu","hkrDe","DB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DB],[hkrDe],[hkrDe,DB],[NPuu],[NPuu,DB],[NPuu,hkrDe],[NPuu,hkrDe,DB],[KPLM],[KPLM,DB],[KPLM,hkrDe],[KPLM,hkrDe,DB],[KPLM,NPuu],[KPLM,NPuu,DB],[KPLM,NPuu,hkrDe],[KPLM,NPuu,hkrDe,DB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_826() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rJTYv","BzJTv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BzJTv],[rJTYv],[rJTYv,BzJTv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_827() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nyr","naKxG","nVpf","dBKFW","fu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fu],[dBKFW],[dBKFW,fu],[nVpf],[nVpf,fu],[nVpf,dBKFW],[nVpf,dBKFW,fu],[naKxG],[naKxG,fu],[naKxG,dBKFW],[naKxG,dBKFW,fu],[naKxG,nVpf],[naKxG,nVpf,fu],[naKxG,nVpf,dBKFW],[naKxG,nVpf,dBKFW,fu],[nyr],[nyr,fu],[nyr,dBKFW],[nyr,dBKFW,fu],[nyr,nVpf],[nyr,nVpf,fu],[nyr,nVpf,dBKFW],[nyr,nVpf,dBKFW,fu],[nyr,naKxG],[nyr,naKxG,fu],[nyr,naKxG,dBKFW],[nyr,naKxG,dBKFW,fu],[nyr,naKxG,nVpf],[nyr,naKxG,nVpf,fu],[nyr,naKxG,nVpf,dBKFW],[nyr,naKxG,nVpf,dBKFW,fu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_828() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZHza")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZHza]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_829() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NO","hqibo","Zkl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Zkl],[hqibo],[hqibo,Zkl],[NO],[NO,Zkl],[NO,hqibo],[NO,hqibo,Zkl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_830() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WAyH","XnZ","UdaeS","oDqcX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oDqcX],[UdaeS],[UdaeS,oDqcX],[XnZ],[XnZ,oDqcX],[XnZ,UdaeS],[XnZ,UdaeS,oDqcX],[WAyH],[WAyH,oDqcX],[WAyH,UdaeS],[WAyH,UdaeS,oDqcX],[WAyH,XnZ],[WAyH,XnZ,oDqcX],[WAyH,XnZ,UdaeS],[WAyH,XnZ,UdaeS,oDqcX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_831() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "u","ddG","SLuBC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SLuBC],[ddG],[ddG,SLuBC],[u],[u,SLuBC],[u,ddG],[u,ddG,SLuBC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_832() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MqK","iVSPa","eCaD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eCaD],[iVSPa],[iVSPa,eCaD],[MqK],[MqK,eCaD],[MqK,iVSPa],[MqK,iVSPa,eCaD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_833() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","cluhK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cluhK],[P],[P,cluhK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_834() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bB","cWJMU","LUjeU","Z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Z],[LUjeU],[LUjeU,Z],[cWJMU],[cWJMU,Z],[cWJMU,LUjeU],[cWJMU,LUjeU,Z],[bB],[bB,Z],[bB,LUjeU],[bB,LUjeU,Z],[bB,cWJMU],[bB,cWJMU,Z],[bB,cWJMU,LUjeU],[bB,cWJMU,LUjeU,Z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_835() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QXkR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QXkR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_836() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "G","iiO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iiO],[G],[G,iiO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_837() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UK","BGL","yQ","X","OsusF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OsusF],[X],[X,OsusF],[yQ],[yQ,OsusF],[yQ,X],[yQ,X,OsusF],[BGL],[BGL,OsusF],[BGL,X],[BGL,X,OsusF],[BGL,yQ],[BGL,yQ,OsusF],[BGL,yQ,X],[BGL,yQ,X,OsusF],[UK],[UK,OsusF],[UK,X],[UK,X,OsusF],[UK,yQ],[UK,yQ,OsusF],[UK,yQ,X],[UK,yQ,X,OsusF],[UK,BGL],[UK,BGL,OsusF],[UK,BGL,X],[UK,BGL,X,OsusF],[UK,BGL,yQ],[UK,BGL,yQ,OsusF],[UK,BGL,yQ,X],[UK,BGL,yQ,X,OsusF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_838() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fmz","u","DC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DC],[u],[u,DC],[fmz],[fmz,DC],[fmz,u],[fmz,u,DC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_839() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vF","vuIgP","F","Ub")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ub],[F],[F,Ub],[vuIgP],[vuIgP,Ub],[vuIgP,F],[vuIgP,F,Ub],[vF],[vF,Ub],[vF,F],[vF,F,Ub],[vF,vuIgP],[vF,vuIgP,Ub],[vF,vuIgP,F],[vF,vuIgP,F,Ub]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_840() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VvQ","cKi","NVL","zfC","nSND")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nSND],[zfC],[zfC,nSND],[NVL],[NVL,nSND],[NVL,zfC],[NVL,zfC,nSND],[cKi],[cKi,nSND],[cKi,zfC],[cKi,zfC,nSND],[cKi,NVL],[cKi,NVL,nSND],[cKi,NVL,zfC],[cKi,NVL,zfC,nSND],[VvQ],[VvQ,nSND],[VvQ,zfC],[VvQ,zfC,nSND],[VvQ,NVL],[VvQ,NVL,nSND],[VvQ,NVL,zfC],[VvQ,NVL,zfC,nSND],[VvQ,cKi],[VvQ,cKi,nSND],[VvQ,cKi,zfC],[VvQ,cKi,zfC,nSND],[VvQ,cKi,NVL],[VvQ,cKi,NVL,nSND],[VvQ,cKi,NVL,zfC],[VvQ,cKi,NVL,zfC,nSND]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_841() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kCWgQ","gF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gF],[kCWgQ],[kCWgQ,gF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_842() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kzq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kzq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_843() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IUk","pvQTx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pvQTx],[IUk],[IUk,pvQTx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_844() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "myqL","E","GZidM","vaCzX","HShbH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HShbH],[vaCzX],[vaCzX,HShbH],[GZidM],[GZidM,HShbH],[GZidM,vaCzX],[GZidM,vaCzX,HShbH],[E],[E,HShbH],[E,vaCzX],[E,vaCzX,HShbH],[E,GZidM],[E,GZidM,HShbH],[E,GZidM,vaCzX],[E,GZidM,vaCzX,HShbH],[myqL],[myqL,HShbH],[myqL,vaCzX],[myqL,vaCzX,HShbH],[myqL,GZidM],[myqL,GZidM,HShbH],[myqL,GZidM,vaCzX],[myqL,GZidM,vaCzX,HShbH],[myqL,E],[myqL,E,HShbH],[myqL,E,vaCzX],[myqL,E,vaCzX,HShbH],[myqL,E,GZidM],[myqL,E,GZidM,HShbH],[myqL,E,GZidM,vaCzX],[myqL,E,GZidM,vaCzX,HShbH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_845() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","COu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[COu],[Q],[Q,COu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_846() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cw","xQ","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[xQ],[xQ,k],[Cw],[Cw,k],[Cw,xQ],[Cw,xQ,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_847() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ccBa","OeDjZ","f","eP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eP],[f],[f,eP],[OeDjZ],[OeDjZ,eP],[OeDjZ,f],[OeDjZ,f,eP],[ccBa],[ccBa,eP],[ccBa,f],[ccBa,f,eP],[ccBa,OeDjZ],[ccBa,OeDjZ,eP],[ccBa,OeDjZ,f],[ccBa,OeDjZ,f,eP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_848() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "c","dw","Bw","pDnZL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pDnZL],[Bw],[Bw,pDnZL],[dw],[dw,pDnZL],[dw,Bw],[dw,Bw,pDnZL],[c],[c,pDnZL],[c,Bw],[c,Bw,pDnZL],[c,dw],[c,dw,pDnZL],[c,dw,Bw],[c,dw,Bw,pDnZL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_849() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","zUP","ZHDc","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[ZHDc],[ZHDc,n],[zUP],[zUP,n],[zUP,ZHDc],[zUP,ZHDc,n],[q],[q,n],[q,ZHDc],[q,ZHDc,n],[q,zUP],[q,zUP,n],[q,zUP,ZHDc],[q,zUP,ZHDc,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_850() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "D","xaA","zSRdM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zSRdM],[xaA],[xaA,zSRdM],[D],[D,zSRdM],[D,xaA],[D,xaA,zSRdM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_851() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Iowl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Iowl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_852() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hly","Ot","CqM","Zma","GLvTF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GLvTF],[Zma],[Zma,GLvTF],[CqM],[CqM,GLvTF],[CqM,Zma],[CqM,Zma,GLvTF],[Ot],[Ot,GLvTF],[Ot,Zma],[Ot,Zma,GLvTF],[Ot,CqM],[Ot,CqM,GLvTF],[Ot,CqM,Zma],[Ot,CqM,Zma,GLvTF],[hly],[hly,GLvTF],[hly,Zma],[hly,Zma,GLvTF],[hly,CqM],[hly,CqM,GLvTF],[hly,CqM,Zma],[hly,CqM,Zma,GLvTF],[hly,Ot],[hly,Ot,GLvTF],[hly,Ot,Zma],[hly,Ot,Zma,GLvTF],[hly,Ot,CqM],[hly,Ot,CqM,GLvTF],[hly,Ot,CqM,Zma],[hly,Ot,CqM,Zma,GLvTF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_853() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cBg","ephJe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ephJe],[cBg],[cBg,ephJe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_854() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Vw","lTnF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lTnF],[Vw],[Vw,lTnF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_855() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "CiO","hgxd","zyKBX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zyKBX],[hgxd],[hgxd,zyKBX],[CiO],[CiO,zyKBX],[CiO,hgxd],[CiO,hgxd,zyKBX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_856() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xFr","nlH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nlH],[xFr],[xFr,nlH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_857() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NbQq","XO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XO],[NbQq],[NbQq,XO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_858() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FpOh","S","yYI","kZJe","mhYZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mhYZ],[kZJe],[kZJe,mhYZ],[yYI],[yYI,mhYZ],[yYI,kZJe],[yYI,kZJe,mhYZ],[S],[S,mhYZ],[S,kZJe],[S,kZJe,mhYZ],[S,yYI],[S,yYI,mhYZ],[S,yYI,kZJe],[S,yYI,kZJe,mhYZ],[FpOh],[FpOh,mhYZ],[FpOh,kZJe],[FpOh,kZJe,mhYZ],[FpOh,yYI],[FpOh,yYI,mhYZ],[FpOh,yYI,kZJe],[FpOh,yYI,kZJe,mhYZ],[FpOh,S],[FpOh,S,mhYZ],[FpOh,S,kZJe],[FpOh,S,kZJe,mhYZ],[FpOh,S,yYI],[FpOh,S,yYI,mhYZ],[FpOh,S,yYI,kZJe],[FpOh,S,yYI,kZJe,mhYZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_859() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Fm","GoQ","Jv","ppEql")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ppEql],[Jv],[Jv,ppEql],[GoQ],[GoQ,ppEql],[GoQ,Jv],[GoQ,Jv,ppEql],[Fm],[Fm,ppEql],[Fm,Jv],[Fm,Jv,ppEql],[Fm,GoQ],[Fm,GoQ,ppEql],[Fm,GoQ,Jv],[Fm,GoQ,Jv,ppEql]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_860() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Lxo","vLY","kFf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kFf],[vLY],[vLY,kFf],[Lxo],[Lxo,kFf],[Lxo,vLY],[Lxo,vLY,kFf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_861() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tRS","npGfh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[npGfh],[tRS],[tRS,npGfh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_862() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WuNsf","AsTER")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AsTER],[WuNsf],[WuNsf,AsTER]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_863() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IiZ","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[IiZ],[IiZ,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_864() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "u","RHBSV","iS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iS],[RHBSV],[RHBSV,iS],[u],[u,iS],[u,RHBSV],[u,RHBSV,iS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_865() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TgcD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TgcD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_866() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ejQht","Tc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tc],[ejQht],[ejQht,Tc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_867() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bC","e","H","UaD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UaD],[H],[H,UaD],[e],[e,UaD],[e,H],[e,H,UaD],[bC],[bC,UaD],[bC,H],[bC,H,UaD],[bC,e],[bC,e,UaD],[bC,e,H],[bC,e,H,UaD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_868() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gzSzk","atKc","lE","IVQq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IVQq],[lE],[lE,IVQq],[atKc],[atKc,IVQq],[atKc,lE],[atKc,lE,IVQq],[gzSzk],[gzSzk,IVQq],[gzSzk,lE],[gzSzk,lE,IVQq],[gzSzk,atKc],[gzSzk,atKc,IVQq],[gzSzk,atKc,lE],[gzSzk,atKc,lE,IVQq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_869() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[b]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_870() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mhBy","Ch","x","qzx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qzx],[x],[x,qzx],[Ch],[Ch,qzx],[Ch,x],[Ch,x,qzx],[mhBy],[mhBy,qzx],[mhBy,x],[mhBy,x,qzx],[mhBy,Ch],[mhBy,Ch,qzx],[mhBy,Ch,x],[mhBy,Ch,x,qzx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_871() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x","crk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[crk],[x],[x,crk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_872() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oCejg","BYp","HLqu","RwB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RwB],[HLqu],[HLqu,RwB],[BYp],[BYp,RwB],[BYp,HLqu],[BYp,HLqu,RwB],[oCejg],[oCejg,RwB],[oCejg,HLqu],[oCejg,HLqu,RwB],[oCejg,BYp],[oCejg,BYp,RwB],[oCejg,BYp,HLqu],[oCejg,BYp,HLqu,RwB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_873() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Wtm","XS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XS],[Wtm],[Wtm,XS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_874() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RINCB","UelX","jVf","XT","RLWe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RLWe],[XT],[XT,RLWe],[jVf],[jVf,RLWe],[jVf,XT],[jVf,XT,RLWe],[UelX],[UelX,RLWe],[UelX,XT],[UelX,XT,RLWe],[UelX,jVf],[UelX,jVf,RLWe],[UelX,jVf,XT],[UelX,jVf,XT,RLWe],[RINCB],[RINCB,RLWe],[RINCB,XT],[RINCB,XT,RLWe],[RINCB,jVf],[RINCB,jVf,RLWe],[RINCB,jVf,XT],[RINCB,jVf,XT,RLWe],[RINCB,UelX],[RINCB,UelX,RLWe],[RINCB,UelX,XT],[RINCB,UelX,XT,RLWe],[RINCB,UelX,jVf],[RINCB,UelX,jVf,RLWe],[RINCB,UelX,jVf,XT],[RINCB,UelX,jVf,XT,RLWe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_875() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "St","VnXl","v","V","lAdM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lAdM],[V],[V,lAdM],[v],[v,lAdM],[v,V],[v,V,lAdM],[VnXl],[VnXl,lAdM],[VnXl,V],[VnXl,V,lAdM],[VnXl,v],[VnXl,v,lAdM],[VnXl,v,V],[VnXl,v,V,lAdM],[St],[St,lAdM],[St,V],[St,V,lAdM],[St,v],[St,v,lAdM],[St,v,V],[St,v,V,lAdM],[St,VnXl],[St,VnXl,lAdM],[St,VnXl,V],[St,VnXl,V,lAdM],[St,VnXl,v],[St,VnXl,v,lAdM],[St,VnXl,v,V],[St,VnXl,v,V,lAdM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_876() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xq","NZXfy","NpWN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NpWN],[NZXfy],[NZXfy,NpWN],[xq],[xq,NpWN],[xq,NZXfy],[xq,NZXfy,NpWN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_877() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BMnXi","pPe","eRdw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eRdw],[pPe],[pPe,eRdw],[BMnXi],[BMnXi,eRdw],[BMnXi,pPe],[BMnXi,pPe,eRdw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_878() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Uf","ej","nu","vSlYB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vSlYB],[nu],[nu,vSlYB],[ej],[ej,vSlYB],[ej,nu],[ej,nu,vSlYB],[Uf],[Uf,vSlYB],[Uf,nu],[Uf,nu,vSlYB],[Uf,ej],[Uf,ej,vSlYB],[Uf,ej,nu],[Uf,ej,nu,vSlYB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_879() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oCX","KZdr","ml")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ml],[KZdr],[KZdr,ml],[oCX],[oCX,ml],[oCX,KZdr],[oCX,KZdr,ml]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_880() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pUKYD","PVn","kAMb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kAMb],[PVn],[PVn,kAMb],[pUKYD],[pUKYD,kAMb],[pUKYD,PVn],[pUKYD,PVn,kAMb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_881() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zlroK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zlroK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_882() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "B","IMkB","DnAEI","RkpP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[RkpP],[DnAEI],[DnAEI,RkpP],[IMkB],[IMkB,RkpP],[IMkB,DnAEI],[IMkB,DnAEI,RkpP],[B],[B,RkpP],[B,DnAEI],[B,DnAEI,RkpP],[B,IMkB],[B,IMkB,RkpP],[B,IMkB,DnAEI],[B,IMkB,DnAEI,RkpP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_883() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qiG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qiG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_884() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hqBgc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[hqBgc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_885() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_886() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","VnBF","WWUmq","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[WWUmq],[WWUmq,L],[VnBF],[VnBF,L],[VnBF,WWUmq],[VnBF,WWUmq,L],[C],[C,L],[C,WWUmq],[C,WWUmq,L],[C,VnBF],[C,VnBF,L],[C,VnBF,WWUmq],[C,VnBF,WWUmq,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_887() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VI","furph","MbjCb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MbjCb],[furph],[furph,MbjCb],[VI],[VI,MbjCb],[VI,furph],[VI,furph,MbjCb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_888() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_889() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JHWxF","DH","e","PRH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PRH],[e],[e,PRH],[DH],[DH,PRH],[DH,e],[DH,e,PRH],[JHWxF],[JHWxF,PRH],[JHWxF,e],[JHWxF,e,PRH],[JHWxF,DH],[JHWxF,DH,PRH],[JHWxF,DH,e],[JHWxF,DH,e,PRH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_890() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Tu","E","eBVQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eBVQ],[E],[E,eBVQ],[Tu],[Tu,eBVQ],[Tu,E],[Tu,E,eBVQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_891() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eLeOh","TfKHj","XZx","nOI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nOI],[XZx],[XZx,nOI],[TfKHj],[TfKHj,nOI],[TfKHj,XZx],[TfKHj,XZx,nOI],[eLeOh],[eLeOh,nOI],[eLeOh,XZx],[eLeOh,XZx,nOI],[eLeOh,TfKHj],[eLeOh,TfKHj,nOI],[eLeOh,TfKHj,XZx],[eLeOh,TfKHj,XZx,nOI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_892() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TaO","dH","Krzm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Krzm],[dH],[dH,Krzm],[TaO],[TaO,Krzm],[TaO,dH],[TaO,dH,Krzm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_893() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ug","Z","UsK","JX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JX],[UsK],[UsK,JX],[Z],[Z,JX],[Z,UsK],[Z,UsK,JX],[ug],[ug,JX],[ug,UsK],[ug,UsK,JX],[ug,Z],[ug,Z,JX],[ug,Z,UsK],[ug,Z,UsK,JX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_894() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vmh","Np","wgT","ek","GLwbQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GLwbQ],[ek],[ek,GLwbQ],[wgT],[wgT,GLwbQ],[wgT,ek],[wgT,ek,GLwbQ],[Np],[Np,GLwbQ],[Np,ek],[Np,ek,GLwbQ],[Np,wgT],[Np,wgT,GLwbQ],[Np,wgT,ek],[Np,wgT,ek,GLwbQ],[vmh],[vmh,GLwbQ],[vmh,ek],[vmh,ek,GLwbQ],[vmh,wgT],[vmh,wgT,GLwbQ],[vmh,wgT,ek],[vmh,wgT,ek,GLwbQ],[vmh,Np],[vmh,Np,GLwbQ],[vmh,Np,ek],[vmh,Np,ek,GLwbQ],[vmh,Np,wgT],[vmh,Np,wgT,GLwbQ],[vmh,Np,wgT,ek],[vmh,Np,wgT,ek,GLwbQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_895() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","AF","U","NsA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NsA],[U],[U,NsA],[AF],[AF,NsA],[AF,U],[AF,U,NsA],[Q],[Q,NsA],[Q,U],[Q,U,NsA],[Q,AF],[Q,AF,NsA],[Q,AF,U],[Q,AF,U,NsA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_896() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZhSDW","gdZJ","IqcX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IqcX],[gdZJ],[gdZJ,IqcX],[ZhSDW],[ZhSDW,IqcX],[ZhSDW,gdZJ],[ZhSDW,gdZJ,IqcX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_897() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_898() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XEa","x","UbDw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UbDw],[x],[x,UbDw],[XEa],[XEa,UbDw],[XEa,x],[XEa,x,UbDw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_899() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vhrT","ppY","NzYtF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NzYtF],[ppY],[ppY,NzYtF],[vhrT],[vhrT,NzYtF],[vhrT,ppY],[vhrT,ppY,NzYtF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_900() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EMz","xGE","Aewaw","ymvHL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ymvHL],[Aewaw],[Aewaw,ymvHL],[xGE],[xGE,ymvHL],[xGE,Aewaw],[xGE,Aewaw,ymvHL],[EMz],[EMz,ymvHL],[EMz,Aewaw],[EMz,Aewaw,ymvHL],[EMz,xGE],[EMz,xGE,ymvHL],[EMz,xGE,Aewaw],[EMz,xGE,Aewaw,ymvHL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_901() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jp","J","oJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oJ],[J],[J,oJ],[jp],[jp,oJ],[jp,J],[jp,J,oJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_902() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Du","RC","XD","iIQo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iIQo],[XD],[XD,iIQo],[RC],[RC,iIQo],[RC,XD],[RC,XD,iIQo],[Du],[Du,iIQo],[Du,XD],[Du,XD,iIQo],[Du,RC],[Du,RC,iIQo],[Du,RC,XD],[Du,RC,XD,iIQo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_903() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xdJZ","sX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sX],[xdJZ],[xdJZ,sX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_904() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aJ","JBu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JBu],[aJ],[aJ,JBu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_905() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MLC","Cpa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Cpa],[MLC],[MLC,Cpa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_906() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QC","F","W","kAsG","tR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tR],[kAsG],[kAsG,tR],[W],[W,tR],[W,kAsG],[W,kAsG,tR],[F],[F,tR],[F,kAsG],[F,kAsG,tR],[F,W],[F,W,tR],[F,W,kAsG],[F,W,kAsG,tR],[QC],[QC,tR],[QC,kAsG],[QC,kAsG,tR],[QC,W],[QC,W,tR],[QC,W,kAsG],[QC,W,kAsG,tR],[QC,F],[QC,F,tR],[QC,F,kAsG],[QC,F,kAsG,tR],[QC,F,W],[QC,F,W,tR],[QC,F,W,kAsG],[QC,F,W,kAsG,tR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_907() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nlvL","XSMZn","i","bjUo","lz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lz],[bjUo],[bjUo,lz],[i],[i,lz],[i,bjUo],[i,bjUo,lz],[XSMZn],[XSMZn,lz],[XSMZn,bjUo],[XSMZn,bjUo,lz],[XSMZn,i],[XSMZn,i,lz],[XSMZn,i,bjUo],[XSMZn,i,bjUo,lz],[nlvL],[nlvL,lz],[nlvL,bjUo],[nlvL,bjUo,lz],[nlvL,i],[nlvL,i,lz],[nlvL,i,bjUo],[nlvL,i,bjUo,lz],[nlvL,XSMZn],[nlvL,XSMZn,lz],[nlvL,XSMZn,bjUo],[nlvL,XSMZn,bjUo,lz],[nlvL,XSMZn,i],[nlvL,XSMZn,i,lz],[nlvL,XSMZn,i,bjUo],[nlvL,XSMZn,i,bjUo,lz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_908() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[b]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_909() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "p","XF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XF],[p],[p,XF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_910() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ii","caWPO","K","Iw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Iw],[K],[K,Iw],[caWPO],[caWPO,Iw],[caWPO,K],[caWPO,K,Iw],[Ii],[Ii,Iw],[Ii,K],[Ii,K,Iw],[Ii,caWPO],[Ii,caWPO,Iw],[Ii,caWPO,K],[Ii,caWPO,K,Iw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_911() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eF","COgv","TM","KH","jI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jI],[KH],[KH,jI],[TM],[TM,jI],[TM,KH],[TM,KH,jI],[COgv],[COgv,jI],[COgv,KH],[COgv,KH,jI],[COgv,TM],[COgv,TM,jI],[COgv,TM,KH],[COgv,TM,KH,jI],[eF],[eF,jI],[eF,KH],[eF,KH,jI],[eF,TM],[eF,TM,jI],[eF,TM,KH],[eF,TM,KH,jI],[eF,COgv],[eF,COgv,jI],[eF,COgv,KH],[eF,COgv,KH,jI],[eF,COgv,TM],[eF,COgv,TM,jI],[eF,COgv,TM,KH],[eF,COgv,TM,KH,jI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_912() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zwPiB","G","jR","Aulk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Aulk],[jR],[jR,Aulk],[G],[G,Aulk],[G,jR],[G,jR,Aulk],[zwPiB],[zwPiB,Aulk],[zwPiB,jR],[zwPiB,jR,Aulk],[zwPiB,G],[zwPiB,G,Aulk],[zwPiB,G,jR],[zwPiB,G,jR,Aulk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_913() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UaWxu","xilx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xilx],[UaWxu],[UaWxu,xilx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_914() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_915() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "X")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[X]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_916() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","b","t","QM","FLDVH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FLDVH],[QM],[QM,FLDVH],[t],[t,FLDVH],[t,QM],[t,QM,FLDVH],[b],[b,FLDVH],[b,QM],[b,QM,FLDVH],[b,t],[b,t,FLDVH],[b,t,QM],[b,t,QM,FLDVH],[Q],[Q,FLDVH],[Q,QM],[Q,QM,FLDVH],[Q,t],[Q,t,FLDVH],[Q,t,QM],[Q,t,QM,FLDVH],[Q,b],[Q,b,FLDVH],[Q,b,QM],[Q,b,QM,FLDVH],[Q,b,t],[Q,b,t,FLDVH],[Q,b,t,QM],[Q,b,t,QM,FLDVH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_917() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Tsb","zuJDp","ebW","XrtcY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XrtcY],[ebW],[ebW,XrtcY],[zuJDp],[zuJDp,XrtcY],[zuJDp,ebW],[zuJDp,ebW,XrtcY],[Tsb],[Tsb,XrtcY],[Tsb,ebW],[Tsb,ebW,XrtcY],[Tsb,zuJDp],[Tsb,zuJDp,XrtcY],[Tsb,zuJDp,ebW],[Tsb,zuJDp,ebW,XrtcY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_918() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dUnW","E","U","FmfRH","ewxYk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ewxYk],[FmfRH],[FmfRH,ewxYk],[U],[U,ewxYk],[U,FmfRH],[U,FmfRH,ewxYk],[E],[E,ewxYk],[E,FmfRH],[E,FmfRH,ewxYk],[E,U],[E,U,ewxYk],[E,U,FmfRH],[E,U,FmfRH,ewxYk],[dUnW],[dUnW,ewxYk],[dUnW,FmfRH],[dUnW,FmfRH,ewxYk],[dUnW,U],[dUnW,U,ewxYk],[dUnW,U,FmfRH],[dUnW,U,FmfRH,ewxYk],[dUnW,E],[dUnW,E,ewxYk],[dUnW,E,FmfRH],[dUnW,E,FmfRH,ewxYk],[dUnW,E,U],[dUnW,E,U,ewxYk],[dUnW,E,U,FmfRH],[dUnW,E,U,FmfRH,ewxYk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_919() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_920() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dhSL","PAUUs","G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G],[PAUUs],[PAUUs,G],[dhSL],[dhSL,G],[dhSL,PAUUs],[dhSL,PAUUs,G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_921() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Gm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Gm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_922() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qJd","fa","BRct")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BRct],[fa],[fa,BRct],[qJd],[qJd,BRct],[qJd,fa],[qJd,fa,BRct]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_923() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EIwLh","T","H","OoH","eNtLY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eNtLY],[OoH],[OoH,eNtLY],[H],[H,eNtLY],[H,OoH],[H,OoH,eNtLY],[T],[T,eNtLY],[T,OoH],[T,OoH,eNtLY],[T,H],[T,H,eNtLY],[T,H,OoH],[T,H,OoH,eNtLY],[EIwLh],[EIwLh,eNtLY],[EIwLh,OoH],[EIwLh,OoH,eNtLY],[EIwLh,H],[EIwLh,H,eNtLY],[EIwLh,H,OoH],[EIwLh,H,OoH,eNtLY],[EIwLh,T],[EIwLh,T,eNtLY],[EIwLh,T,OoH],[EIwLh,T,OoH,eNtLY],[EIwLh,T,H],[EIwLh,T,H,eNtLY],[EIwLh,T,H,OoH],[EIwLh,T,H,OoH,eNtLY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_924() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oZZOt","F","kTe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kTe],[F],[F,kTe],[oZZOt],[oZZOt,kTe],[oZZOt,F],[oZZOt,F,kTe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_925() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Fgq","MHK","F","SxQ","soK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[soK],[SxQ],[SxQ,soK],[F],[F,soK],[F,SxQ],[F,SxQ,soK],[MHK],[MHK,soK],[MHK,SxQ],[MHK,SxQ,soK],[MHK,F],[MHK,F,soK],[MHK,F,SxQ],[MHK,F,SxQ,soK],[Fgq],[Fgq,soK],[Fgq,SxQ],[Fgq,SxQ,soK],[Fgq,F],[Fgq,F,soK],[Fgq,F,SxQ],[Fgq,F,SxQ,soK],[Fgq,MHK],[Fgq,MHK,soK],[Fgq,MHK,SxQ],[Fgq,MHK,SxQ,soK],[Fgq,MHK,F],[Fgq,MHK,F,soK],[Fgq,MHK,F,SxQ],[Fgq,MHK,F,SxQ,soK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_926() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ia")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ia]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_927() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xN","bRGso","SjchF","JOTj","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[JOTj],[JOTj,k],[SjchF],[SjchF,k],[SjchF,JOTj],[SjchF,JOTj,k],[bRGso],[bRGso,k],[bRGso,JOTj],[bRGso,JOTj,k],[bRGso,SjchF],[bRGso,SjchF,k],[bRGso,SjchF,JOTj],[bRGso,SjchF,JOTj,k],[xN],[xN,k],[xN,JOTj],[xN,JOTj,k],[xN,SjchF],[xN,SjchF,k],[xN,SjchF,JOTj],[xN,SjchF,JOTj,k],[xN,bRGso],[xN,bRGso,k],[xN,bRGso,JOTj],[xN,bRGso,JOTj,k],[xN,bRGso,SjchF],[xN,bRGso,SjchF,k],[xN,bRGso,SjchF,JOTj],[xN,bRGso,SjchF,JOTj,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_928() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KPzE","Egv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Egv],[KPzE],[KPzE,Egv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_929() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YCJ","hn","DHzmo","NW","uGa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uGa],[NW],[NW,uGa],[DHzmo],[DHzmo,uGa],[DHzmo,NW],[DHzmo,NW,uGa],[hn],[hn,uGa],[hn,NW],[hn,NW,uGa],[hn,DHzmo],[hn,DHzmo,uGa],[hn,DHzmo,NW],[hn,DHzmo,NW,uGa],[YCJ],[YCJ,uGa],[YCJ,NW],[YCJ,NW,uGa],[YCJ,DHzmo],[YCJ,DHzmo,uGa],[YCJ,DHzmo,NW],[YCJ,DHzmo,NW,uGa],[YCJ,hn],[YCJ,hn,uGa],[YCJ,hn,NW],[YCJ,hn,NW,uGa],[YCJ,hn,DHzmo],[YCJ,hn,DHzmo,uGa],[YCJ,hn,DHzmo,NW],[YCJ,hn,DHzmo,NW,uGa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_930() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kSXQ","A","f")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[f],[A],[A,f],[kSXQ],[kSXQ,f],[kSXQ,A],[kSXQ,A,f]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_931() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pIk","XxX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XxX],[pIk],[pIk,XxX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_932() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sy","bO","Lk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Lk],[bO],[bO,Lk],[sy],[sy,Lk],[sy,bO],[sy,bO,Lk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_933() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KxzN","Tx","qj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qj],[Tx],[Tx,qj],[KxzN],[KxzN,qj],[KxzN,Tx],[KxzN,Tx,qj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_934() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mYMB","YeYOC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YeYOC],[mYMB],[mYMB,YeYOC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_935() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MN","z","l","SzOB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SzOB],[l],[l,SzOB],[z],[z,SzOB],[z,l],[z,l,SzOB],[MN],[MN,SzOB],[MN,l],[MN,l,SzOB],[MN,z],[MN,z,SzOB],[MN,z,l],[MN,z,l,SzOB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_936() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fTww","Tw","LxTIV","Xisii")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xisii],[LxTIV],[LxTIV,Xisii],[Tw],[Tw,Xisii],[Tw,LxTIV],[Tw,LxTIV,Xisii],[fTww],[fTww,Xisii],[fTww,LxTIV],[fTww,LxTIV,Xisii],[fTww,Tw],[fTww,Tw,Xisii],[fTww,Tw,LxTIV],[fTww,Tw,LxTIV,Xisii]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_937() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nT","m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m],[nT],[nT,m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_938() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "btim","j","Sq","YAzck")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YAzck],[Sq],[Sq,YAzck],[j],[j,YAzck],[j,Sq],[j,Sq,YAzck],[btim],[btim,YAzck],[btim,Sq],[btim,Sq,YAzck],[btim,j],[btim,j,YAzck],[btim,j,Sq],[btim,j,Sq,YAzck]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_939() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lUZ","WgS","jHPu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jHPu],[WgS],[WgS,jHPu],[lUZ],[lUZ,jHPu],[lUZ,WgS],[lUZ,WgS,jHPu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_940() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "x","JKGQ","IchV","rQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rQ],[IchV],[IchV,rQ],[JKGQ],[JKGQ,rQ],[JKGQ,IchV],[JKGQ,IchV,rQ],[x],[x,rQ],[x,IchV],[x,IchV,rQ],[x,JKGQ],[x,JKGQ,rQ],[x,JKGQ,IchV],[x,JKGQ,IchV,rQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_941() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IP","PnWx","Zyl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Zyl],[PnWx],[PnWx,Zyl],[IP],[IP,Zyl],[IP,PnWx],[IP,PnWx,Zyl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_942() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iTL","kq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kq],[iTL],[iTL,kq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_943() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KK","MTL","MUbV","dr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dr],[MUbV],[MUbV,dr],[MTL],[MTL,dr],[MTL,MUbV],[MTL,MUbV,dr],[KK],[KK,dr],[KK,MUbV],[KK,MUbV,dr],[KK,MTL],[KK,MTL,dr],[KK,MTL,MUbV],[KK,MTL,MUbV,dr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_944() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UvBM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UvBM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_945() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nQaD","x","Kwi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Kwi],[x],[x,Kwi],[nQaD],[nQaD,Kwi],[nQaD,x],[nQaD,x,Kwi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_946() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UWU","OOzp","qIQ","XOP","GIrsE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GIrsE],[XOP],[XOP,GIrsE],[qIQ],[qIQ,GIrsE],[qIQ,XOP],[qIQ,XOP,GIrsE],[OOzp],[OOzp,GIrsE],[OOzp,XOP],[OOzp,XOP,GIrsE],[OOzp,qIQ],[OOzp,qIQ,GIrsE],[OOzp,qIQ,XOP],[OOzp,qIQ,XOP,GIrsE],[UWU],[UWU,GIrsE],[UWU,XOP],[UWU,XOP,GIrsE],[UWU,qIQ],[UWU,qIQ,GIrsE],[UWU,qIQ,XOP],[UWU,qIQ,XOP,GIrsE],[UWU,OOzp],[UWU,OOzp,GIrsE],[UWU,OOzp,XOP],[UWU,OOzp,XOP,GIrsE],[UWU,OOzp,qIQ],[UWU,OOzp,qIQ,GIrsE],[UWU,OOzp,qIQ,XOP],[UWU,OOzp,qIQ,XOP,GIrsE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_947() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "AaN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AaN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_948() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TH","ymiYL","hLK","y","EfZnz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EfZnz],[y],[y,EfZnz],[hLK],[hLK,EfZnz],[hLK,y],[hLK,y,EfZnz],[ymiYL],[ymiYL,EfZnz],[ymiYL,y],[ymiYL,y,EfZnz],[ymiYL,hLK],[ymiYL,hLK,EfZnz],[ymiYL,hLK,y],[ymiYL,hLK,y,EfZnz],[TH],[TH,EfZnz],[TH,y],[TH,y,EfZnz],[TH,hLK],[TH,hLK,EfZnz],[TH,hLK,y],[TH,hLK,y,EfZnz],[TH,ymiYL],[TH,ymiYL,EfZnz],[TH,ymiYL,y],[TH,ymiYL,y,EfZnz],[TH,ymiYL,hLK],[TH,ymiYL,hLK,EfZnz],[TH,ymiYL,hLK,y],[TH,ymiYL,hLK,y,EfZnz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_949() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sd","zb","Y","jh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jh],[Y],[Y,jh],[zb],[zb,jh],[zb,Y],[zb,Y,jh],[sd],[sd,jh],[sd,Y],[sd,Y,jh],[sd,zb],[sd,zb,jh],[sd,zb,Y],[sd,zb,Y,jh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_950() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UCMGe")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UCMGe]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_951() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MHM","FmdfN","RSUSA","Y")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Y],[RSUSA],[RSUSA,Y],[FmdfN],[FmdfN,Y],[FmdfN,RSUSA],[FmdfN,RSUSA,Y],[MHM],[MHM,Y],[MHM,RSUSA],[MHM,RSUSA,Y],[MHM,FmdfN],[MHM,FmdfN,Y],[MHM,FmdfN,RSUSA],[MHM,FmdfN,RSUSA,Y]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_952() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VwmA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VwmA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_953() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "LRYu","tH","odr","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[odr],[odr,O],[tH],[tH,O],[tH,odr],[tH,odr,O],[LRYu],[LRYu,O],[LRYu,odr],[LRYu,odr,O],[LRYu,tH],[LRYu,tH,O],[LRYu,tH,odr],[LRYu,tH,odr,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_954() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eOfN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[eOfN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_955() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gGUIB","Xbpqm","nFzQO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nFzQO],[Xbpqm],[Xbpqm,nFzQO],[gGUIB],[gGUIB,nFzQO],[gGUIB,Xbpqm],[gGUIB,Xbpqm,nFzQO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_956() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "uie","wI","aXC")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aXC],[wI],[wI,aXC],[uie],[uie,aXC],[uie,wI],[uie,wI,aXC]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_957() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Krepe","lx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lx],[Krepe],[Krepe,lx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_958() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","KZa","TX","E","JdF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JdF],[E],[E,JdF],[TX],[TX,JdF],[TX,E],[TX,E,JdF],[KZa],[KZa,JdF],[KZa,E],[KZa,E,JdF],[KZa,TX],[KZa,TX,JdF],[KZa,TX,E],[KZa,TX,E,JdF],[Q],[Q,JdF],[Q,E],[Q,E,JdF],[Q,TX],[Q,TX,JdF],[Q,TX,E],[Q,TX,E,JdF],[Q,KZa],[Q,KZa,JdF],[Q,KZa,E],[Q,KZa,E,JdF],[Q,KZa,TX],[Q,KZa,TX,JdF],[Q,KZa,TX,E],[Q,KZa,TX,E,JdF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_959() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ofak","uyiP","VFbEf","byf","UIs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UIs],[byf],[byf,UIs],[VFbEf],[VFbEf,UIs],[VFbEf,byf],[VFbEf,byf,UIs],[uyiP],[uyiP,UIs],[uyiP,byf],[uyiP,byf,UIs],[uyiP,VFbEf],[uyiP,VFbEf,UIs],[uyiP,VFbEf,byf],[uyiP,VFbEf,byf,UIs],[ofak],[ofak,UIs],[ofak,byf],[ofak,byf,UIs],[ofak,VFbEf],[ofak,VFbEf,UIs],[ofak,VFbEf,byf],[ofak,VFbEf,byf,UIs],[ofak,uyiP],[ofak,uyiP,UIs],[ofak,uyiP,byf],[ofak,uyiP,byf,UIs],[ofak,uyiP,VFbEf],[ofak,uyiP,VFbEf,UIs],[ofak,uyiP,VFbEf,byf],[ofak,uyiP,VFbEf,byf,UIs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_960() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tg","PG","IXBth","cToA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cToA],[IXBth],[IXBth,cToA],[PG],[PG,cToA],[PG,IXBth],[PG,IXBth,cToA],[tg],[tg,cToA],[tg,IXBth],[tg,IXBth,cToA],[tg,PG],[tg,PG,cToA],[tg,PG,IXBth],[tg,PG,IXBth,cToA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_961() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","kYGco","pChoo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pChoo],[kYGco],[kYGco,pChoo],[U],[U,pChoo],[U,kYGco],[U,kYGco,pChoo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_962() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SD","f","AVoST")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AVoST],[f],[f,AVoST],[SD],[SD,AVoST],[SD,f],[SD,f,AVoST]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_963() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QOcC","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[QOcC],[QOcC,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_964() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","HkIzA","cy","zmOtG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zmOtG],[cy],[cy,zmOtG],[HkIzA],[HkIzA,zmOtG],[HkIzA,cy],[HkIzA,cy,zmOtG],[R],[R,zmOtG],[R,cy],[R,cy,zmOtG],[R,HkIzA],[R,HkIzA,zmOtG],[R,HkIzA,cy],[R,HkIzA,cy,zmOtG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_965() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Qsc","ARDJy","j","HAS","dWxZJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dWxZJ],[HAS],[HAS,dWxZJ],[j],[j,dWxZJ],[j,HAS],[j,HAS,dWxZJ],[ARDJy],[ARDJy,dWxZJ],[ARDJy,HAS],[ARDJy,HAS,dWxZJ],[ARDJy,j],[ARDJy,j,dWxZJ],[ARDJy,j,HAS],[ARDJy,j,HAS,dWxZJ],[Qsc],[Qsc,dWxZJ],[Qsc,HAS],[Qsc,HAS,dWxZJ],[Qsc,j],[Qsc,j,dWxZJ],[Qsc,j,HAS],[Qsc,j,HAS,dWxZJ],[Qsc,ARDJy],[Qsc,ARDJy,dWxZJ],[Qsc,ARDJy,HAS],[Qsc,ARDJy,HAS,dWxZJ],[Qsc,ARDJy,j],[Qsc,ARDJy,j,dWxZJ],[Qsc,ARDJy,j,HAS],[Qsc,ARDJy,j,HAS,dWxZJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_966() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aAVq","McmQm","JHV","SDen")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[SDen],[JHV],[JHV,SDen],[McmQm],[McmQm,SDen],[McmQm,JHV],[McmQm,JHV,SDen],[aAVq],[aAVq,SDen],[aAVq,JHV],[aAVq,JHV,SDen],[aAVq,McmQm],[aAVq,McmQm,SDen],[aAVq,McmQm,JHV],[aAVq,McmQm,JHV,SDen]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_967() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bUD","Z","m")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[m],[Z],[Z,m],[bUD],[bUD,m],[bUD,Z],[bUD,Z,m]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_968() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YpuAb","eMr","MZcQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MZcQ],[eMr],[eMr,MZcQ],[YpuAb],[YpuAb,MZcQ],[YpuAb,eMr],[YpuAb,eMr,MZcQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_969() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "C","PV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PV],[C],[C,PV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_970() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "worj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[worj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_971() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Xx","tGzMz","s","vbu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vbu],[s],[s,vbu],[tGzMz],[tGzMz,vbu],[tGzMz,s],[tGzMz,s,vbu],[Xx],[Xx,vbu],[Xx,s],[Xx,s,vbu],[Xx,tGzMz],[Xx,tGzMz,vbu],[Xx,tGzMz,s],[Xx,tGzMz,s,vbu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_972() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","UWd","LKUdr","X","nm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nm],[X],[X,nm],[LKUdr],[LKUdr,nm],[LKUdr,X],[LKUdr,X,nm],[UWd],[UWd,nm],[UWd,X],[UWd,X,nm],[UWd,LKUdr],[UWd,LKUdr,nm],[UWd,LKUdr,X],[UWd,LKUdr,X,nm],[q],[q,nm],[q,X],[q,X,nm],[q,LKUdr],[q,LKUdr,nm],[q,LKUdr,X],[q,LKUdr,X,nm],[q,UWd],[q,UWd,nm],[q,UWd,X],[q,UWd,X,nm],[q,UWd,LKUdr],[q,UWd,LKUdr,nm],[q,UWd,LKUdr,X],[q,UWd,LKUdr,X,nm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_973() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "G")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[G]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_974() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cImf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cImf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_975() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EqXe","SWijK","n")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[n],[SWijK],[SWijK,n],[EqXe],[EqXe,n],[EqXe,SWijK],[EqXe,SWijK,n]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_976() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Gqx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Gqx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_977() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","r","H","J","djlh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[djlh],[J],[J,djlh],[H],[H,djlh],[H,J],[H,J,djlh],[r],[r,djlh],[r,J],[r,J,djlh],[r,H],[r,H,djlh],[r,H,J],[r,H,J,djlh],[q],[q,djlh],[q,J],[q,J,djlh],[q,H],[q,H,djlh],[q,H,J],[q,H,J,djlh],[q,r],[q,r,djlh],[q,r,J],[q,r,J,djlh],[q,r,H],[q,r,H,djlh],[q,r,H,J],[q,r,H,J,djlh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_978() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wh","ZC","Jmmf","ChoY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ChoY],[Jmmf],[Jmmf,ChoY],[ZC],[ZC,ChoY],[ZC,Jmmf],[ZC,Jmmf,ChoY],[wh],[wh,ChoY],[wh,Jmmf],[wh,Jmmf,ChoY],[wh,ZC],[wh,ZC,ChoY],[wh,ZC,Jmmf],[wh,ZC,Jmmf,ChoY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_979() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VgVx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VgVx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_980() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Au","u","ndl","x","kw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kw],[x],[x,kw],[ndl],[ndl,kw],[ndl,x],[ndl,x,kw],[u],[u,kw],[u,x],[u,x,kw],[u,ndl],[u,ndl,kw],[u,ndl,x],[u,ndl,x,kw],[Au],[Au,kw],[Au,x],[Au,x,kw],[Au,ndl],[Au,ndl,kw],[Au,ndl,x],[Au,ndl,x,kw],[Au,u],[Au,u,kw],[Au,u,x],[Au,u,x,kw],[Au,u,ndl],[Au,u,ndl,kw],[Au,u,ndl,x],[Au,u,ndl,x,kw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_981() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oaxX","YyZzf","z","gs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gs],[z],[z,gs],[YyZzf],[YyZzf,gs],[YyZzf,z],[YyZzf,z,gs],[oaxX],[oaxX,gs],[oaxX,z],[oaxX,z,gs],[oaxX,YyZzf],[oaxX,YyZzf,gs],[oaxX,YyZzf,z],[oaxX,YyZzf,z,gs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_982() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","PemB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PemB],[t],[t,PemB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_983() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "DjI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DjI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_984() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HQJT","T","vM","uUcAS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[uUcAS],[vM],[vM,uUcAS],[T],[T,uUcAS],[T,vM],[T,vM,uUcAS],[HQJT],[HQJT,uUcAS],[HQJT,vM],[HQJT,vM,uUcAS],[HQJT,T],[HQJT,T,uUcAS],[HQJT,T,vM],[HQJT,T,vM,uUcAS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_985() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","i")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[i],[Q],[Q,i]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_986() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hfu","VAy")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VAy],[hfu],[hfu,VAy]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_987() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rxh","RSX","Dm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Dm],[RSX],[RSX,Dm],[rxh],[rxh,Dm],[rxh,RSX],[rxh,RSX,Dm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_988() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rkpuh","Pe","wN","MVb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MVb],[wN],[wN,MVb],[Pe],[Pe,MVb],[Pe,wN],[Pe,wN,MVb],[rkpuh],[rkpuh,MVb],[rkpuh,wN],[rkpuh,wN,MVb],[rkpuh,Pe],[rkpuh,Pe,MVb],[rkpuh,Pe,wN],[rkpuh,Pe,wN,MVb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_989() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "r","PHUp","v","QQvrL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QQvrL],[v],[v,QQvrL],[PHUp],[PHUp,QQvrL],[PHUp,v],[PHUp,v,QQvrL],[r],[r,QQvrL],[r,v],[r,v,QQvrL],[r,PHUp],[r,PHUp,QQvrL],[r,PHUp,v],[r,PHUp,v,QQvrL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_990() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dXooT")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dXooT]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_991() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YVJy","zC","ewftj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ewftj],[zC],[zC,ewftj],[YVJy],[YVJy,ewftj],[YVJy,zC],[YVJy,zC,ewftj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_992() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zLpw","MXk","cZljl","Yx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Yx],[cZljl],[cZljl,Yx],[MXk],[MXk,Yx],[MXk,cZljl],[MXk,cZljl,Yx],[zLpw],[zLpw,Yx],[zLpw,cZljl],[zLpw,cZljl,Yx],[zLpw,MXk],[zLpw,MXk,Yx],[zLpw,MXk,cZljl],[zLpw,MXk,cZljl,Yx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_993() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[cf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_994() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "t","IDcf","Ao")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ao],[IDcf],[IDcf,Ao],[t],[t,Ao],[t,IDcf],[t,IDcf,Ao]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_995() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TbAHN","RTPj","mkUIA","cvB","lsrkh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lsrkh],[cvB],[cvB,lsrkh],[mkUIA],[mkUIA,lsrkh],[mkUIA,cvB],[mkUIA,cvB,lsrkh],[RTPj],[RTPj,lsrkh],[RTPj,cvB],[RTPj,cvB,lsrkh],[RTPj,mkUIA],[RTPj,mkUIA,lsrkh],[RTPj,mkUIA,cvB],[RTPj,mkUIA,cvB,lsrkh],[TbAHN],[TbAHN,lsrkh],[TbAHN,cvB],[TbAHN,cvB,lsrkh],[TbAHN,mkUIA],[TbAHN,mkUIA,lsrkh],[TbAHN,mkUIA,cvB],[TbAHN,mkUIA,cvB,lsrkh],[TbAHN,RTPj],[TbAHN,RTPj,lsrkh],[TbAHN,RTPj,cvB],[TbAHN,RTPj,cvB,lsrkh],[TbAHN,RTPj,mkUIA],[TbAHN,RTPj,mkUIA,lsrkh],[TbAHN,RTPj,mkUIA,cvB],[TbAHN,RTPj,mkUIA,cvB,lsrkh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_996() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GMImR","TIpJe","aK","ni","yh")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yh],[ni],[ni,yh],[aK],[aK,yh],[aK,ni],[aK,ni,yh],[TIpJe],[TIpJe,yh],[TIpJe,ni],[TIpJe,ni,yh],[TIpJe,aK],[TIpJe,aK,yh],[TIpJe,aK,ni],[TIpJe,aK,ni,yh],[GMImR],[GMImR,yh],[GMImR,ni],[GMImR,ni,yh],[GMImR,aK],[GMImR,aK,yh],[GMImR,aK,ni],[GMImR,aK,ni,yh],[GMImR,TIpJe],[GMImR,TIpJe,yh],[GMImR,TIpJe,ni],[GMImR,TIpJe,ni,yh],[GMImR,TIpJe,aK],[GMImR,TIpJe,aK,yh],[GMImR,TIpJe,aK,ni],[GMImR,TIpJe,aK,ni,yh]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_997() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FTls","Tz","aLi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[aLi],[Tz],[Tz,aLi],[FTls],[FTls,aLi],[FTls,Tz],[FTls,Tz,aLi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_998() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "PVjY","Erjp","Qrw","J","ub")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ub],[J],[J,ub],[Qrw],[Qrw,ub],[Qrw,J],[Qrw,J,ub],[Erjp],[Erjp,ub],[Erjp,J],[Erjp,J,ub],[Erjp,Qrw],[Erjp,Qrw,ub],[Erjp,Qrw,J],[Erjp,Qrw,J,ub],[PVjY],[PVjY,ub],[PVjY,J],[PVjY,J,ub],[PVjY,Qrw],[PVjY,Qrw,ub],[PVjY,Qrw,J],[PVjY,Qrw,J,ub],[PVjY,Erjp],[PVjY,Erjp,ub],[PVjY,Erjp,J],[PVjY,Erjp,J,ub],[PVjY,Erjp,Qrw],[PVjY,Erjp,Qrw,ub],[PVjY,Erjp,Qrw,J],[PVjY,Erjp,Qrw,J,ub]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_999() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BtMMX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BtMMX]]", resultFormatted);
    }
}

