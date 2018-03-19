package java_programs;


public class POWERSET_TEST {
    @org.junit.Test(timeout = 3000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KAeaU")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KAeaU]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MNtYv","Qv","gPKVZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gPKVZ],[Qv],[Qv,gPKVZ],[MNtYv],[MNtYv,gPKVZ],[MNtYv,Qv],[MNtYv,Qv,gPKVZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Eqbqn","BtD","juP","Z","FRDE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FRDE],[Z],[Z,FRDE],[juP],[juP,FRDE],[juP,Z],[juP,Z,FRDE],[BtD],[BtD,FRDE],[BtD,Z],[BtD,Z,FRDE],[BtD,juP],[BtD,juP,FRDE],[BtD,juP,Z],[BtD,juP,Z,FRDE],[Eqbqn],[Eqbqn,FRDE],[Eqbqn,Z],[Eqbqn,Z,FRDE],[Eqbqn,juP],[Eqbqn,juP,FRDE],[Eqbqn,juP,Z],[Eqbqn,juP,Z,FRDE],[Eqbqn,BtD],[Eqbqn,BtD,FRDE],[Eqbqn,BtD,Z],[Eqbqn,BtD,Z,FRDE],[Eqbqn,BtD,juP],[Eqbqn,BtD,juP,FRDE],[Eqbqn,BtD,juP,Z],[Eqbqn,BtD,juP,Z,FRDE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rwH","ni","RN","DfrVH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DfrVH],[RN],[RN,DfrVH],[ni],[ni,DfrVH],[ni,RN],[ni,RN,DfrVH],[rwH],[rwH,DfrVH],[rwH,RN],[rwH,RN,DfrVH],[rwH,ni],[rwH,ni,DfrVH],[rwH,ni,RN],[rwH,ni,RN,DfrVH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UnOKx","vKhGz","MK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MK],[vKhGz],[vKhGz,MK],[UnOKx],[UnOKx,MK],[UnOKx,vKhGz],[UnOKx,vKhGz,MK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IeFur","IcxH","h")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[h],[IcxH],[IcxH,h],[IeFur],[IeFur,h],[IeFur,IcxH],[IeFur,IcxH,h]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "soO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[soO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","YjNRu","vRYw","SYSh","efFW")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[efFW],[SYSh],[SYSh,efFW],[vRYw],[vRYw,efFW],[vRYw,SYSh],[vRYw,SYSh,efFW],[YjNRu],[YjNRu,efFW],[YjNRu,SYSh],[YjNRu,SYSh,efFW],[YjNRu,vRYw],[YjNRu,vRYw,efFW],[YjNRu,vRYw,SYSh],[YjNRu,vRYw,SYSh,efFW],[a],[a,efFW],[a,SYSh],[a,SYSh,efFW],[a,vRYw],[a,vRYw,efFW],[a,vRYw,SYSh],[a,vRYw,SYSh,efFW],[a,YjNRu],[a,YjNRu,efFW],[a,YjNRu,SYSh],[a,YjNRu,SYSh,efFW],[a,YjNRu,vRYw],[a,YjNRu,vRYw,efFW],[a,YjNRu,vRYw,SYSh],[a,YjNRu,vRYw,SYSh,efFW]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IYK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[IYK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Csq","Q","V","gCDyS")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gCDyS],[V],[V,gCDyS],[Q],[Q,gCDyS],[Q,V],[Q,V,gCDyS],[Csq],[Csq,gCDyS],[Csq,V],[Csq,V,gCDyS],[Csq,Q],[Csq,Q,gCDyS],[Csq,Q,V],[Csq,Q,V,gCDyS]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pBgEy","I","lePv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lePv],[I],[I,lePv],[pBgEy],[pBgEy,lePv],[pBgEy,I],[pBgEy,I,lePv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gyXVV","VrS","m","vHMrv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vHMrv],[m],[m,vHMrv],[VrS],[VrS,vHMrv],[VrS,m],[VrS,m,vHMrv],[gyXVV],[gyXVV,vHMrv],[gyXVV,m],[gyXVV,m,vHMrv],[gyXVV,VrS],[gyXVV,VrS,vHMrv],[gyXVV,VrS,m],[gyXVV,VrS,m,vHMrv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "jtiNK","NAI","L")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[L],[NAI],[NAI,L],[jtiNK],[jtiNK,L],[jtiNK,NAI],[jtiNK,NAI,L]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "VxLdM","Tu","u","nU","ZGvm")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZGvm],[nU],[nU,ZGvm],[u],[u,ZGvm],[u,nU],[u,nU,ZGvm],[Tu],[Tu,ZGvm],[Tu,nU],[Tu,nU,ZGvm],[Tu,u],[Tu,u,ZGvm],[Tu,u,nU],[Tu,u,nU,ZGvm],[VxLdM],[VxLdM,ZGvm],[VxLdM,nU],[VxLdM,nU,ZGvm],[VxLdM,u],[VxLdM,u,ZGvm],[VxLdM,u,nU],[VxLdM,u,nU,ZGvm],[VxLdM,Tu],[VxLdM,Tu,ZGvm],[VxLdM,Tu,nU],[VxLdM,Tu,nU,ZGvm],[VxLdM,Tu,u],[VxLdM,Tu,u,ZGvm],[VxLdM,Tu,u,nU],[VxLdM,Tu,u,nU,ZGvm]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OIj","dylZk","q","EONJ","VWN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VWN],[EONJ],[EONJ,VWN],[q],[q,VWN],[q,EONJ],[q,EONJ,VWN],[dylZk],[dylZk,VWN],[dylZk,EONJ],[dylZk,EONJ,VWN],[dylZk,q],[dylZk,q,VWN],[dylZk,q,EONJ],[dylZk,q,EONJ,VWN],[OIj],[OIj,VWN],[OIj,EONJ],[OIj,EONJ,VWN],[OIj,q],[OIj,q,VWN],[OIj,q,EONJ],[OIj,q,EONJ,VWN],[OIj,dylZk],[OIj,dylZk,VWN],[OIj,dylZk,EONJ],[OIj,dylZk,EONJ,VWN],[OIj,dylZk,q],[OIj,dylZk,q,VWN],[OIj,dylZk,q,EONJ],[OIj,dylZk,q,EONJ,VWN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Q","K","GTnK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GTnK],[K],[K,GTnK],[Q],[Q,GTnK],[Q,K],[Q,K,GTnK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "e","EXYNj","GTH","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[GTH],[GTH,N],[EXYNj],[EXYNj,N],[EXYNj,GTH],[EXYNj,GTH,N],[e],[e,N],[e,GTH],[e,GTH,N],[e,EXYNj],[e,EXYNj,N],[e,EXYNj,GTH],[e,EXYNj,GTH,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ia","Fa","Tq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tq],[Fa],[Fa,Tq],[Ia],[Ia,Tq],[Ia,Fa],[Ia,Fa,Tq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BbFgm","xeHb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xeHb],[BbFgm],[BbFgm,xeHb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Nv","kTzj","axB","EQVHJ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EQVHJ],[axB],[axB,EQVHJ],[kTzj],[kTzj,EQVHJ],[kTzj,axB],[kTzj,axB,EQVHJ],[Nv],[Nv,EQVHJ],[Nv,axB],[Nv,axB,EQVHJ],[Nv,kTzj],[Nv,kTzj,EQVHJ],[Nv,kTzj,axB],[Nv,kTzj,axB,EQVHJ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "z")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[z]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "h","tFl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tFl],[h],[h,tFl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "HHQ","WGl","bgmH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bgmH],[WGl],[WGl,bgmH],[HHQ],[HHQ,bgmH],[HHQ,WGl],[HHQ,WGl,bgmH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "w","sbh","y","pyV","Yw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Yw],[pyV],[pyV,Yw],[y],[y,Yw],[y,pyV],[y,pyV,Yw],[sbh],[sbh,Yw],[sbh,pyV],[sbh,pyV,Yw],[sbh,y],[sbh,y,Yw],[sbh,y,pyV],[sbh,y,pyV,Yw],[w],[w,Yw],[w,pyV],[w,pyV,Yw],[w,y],[w,y,Yw],[w,y,pyV],[w,y,pyV,Yw],[w,sbh],[w,sbh,Yw],[w,sbh,pyV],[w,sbh,pyV,Yw],[w,sbh,y],[w,sbh,y,Yw],[w,sbh,y,pyV],[w,sbh,y,pyV,Yw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "WRmmK","t","bNU","UFvQ","bRn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bRn],[UFvQ],[UFvQ,bRn],[bNU],[bNU,bRn],[bNU,UFvQ],[bNU,UFvQ,bRn],[t],[t,bRn],[t,UFvQ],[t,UFvQ,bRn],[t,bNU],[t,bNU,bRn],[t,bNU,UFvQ],[t,bNU,UFvQ,bRn],[WRmmK],[WRmmK,bRn],[WRmmK,UFvQ],[WRmmK,UFvQ,bRn],[WRmmK,bNU],[WRmmK,bNU,bRn],[WRmmK,bNU,UFvQ],[WRmmK,bNU,UFvQ,bRn],[WRmmK,t],[WRmmK,t,bRn],[WRmmK,t,UFvQ],[WRmmK,t,UFvQ,bRn],[WRmmK,t,bNU],[WRmmK,t,bNU,bRn],[WRmmK,t,bNU,UFvQ],[WRmmK,t,bNU,UFvQ,bRn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sPPP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sPPP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fCyk","uf","NlIA","RdV","pDj")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pDj],[RdV],[RdV,pDj],[NlIA],[NlIA,pDj],[NlIA,RdV],[NlIA,RdV,pDj],[uf],[uf,pDj],[uf,RdV],[uf,RdV,pDj],[uf,NlIA],[uf,NlIA,pDj],[uf,NlIA,RdV],[uf,NlIA,RdV,pDj],[fCyk],[fCyk,pDj],[fCyk,RdV],[fCyk,RdV,pDj],[fCyk,NlIA],[fCyk,NlIA,pDj],[fCyk,NlIA,RdV],[fCyk,NlIA,RdV,pDj],[fCyk,uf],[fCyk,uf,pDj],[fCyk,uf,RdV],[fCyk,uf,RdV,pDj],[fCyk,uf,NlIA],[fCyk,uf,NlIA,pDj],[fCyk,uf,NlIA,RdV],[fCyk,uf,NlIA,RdV,pDj]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dPl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dPl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[kD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xgLpn","a","PV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[PV],[a],[a,PV],[xgLpn],[xgLpn,PV],[xgLpn,a],[xgLpn,a,PV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zizE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zizE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","RW","lx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[lx],[RW],[RW,lx],[U],[U,lx],[U,RW],[U,RW,lx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zBDf","MOx","erZO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[erZO],[MOx],[MOx,erZO],[zBDf],[zBDf,erZO],[zBDf,MOx],[zBDf,MOx,erZO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "klX")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[klX]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "upMi","TV","t","xvoGJ","vo")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vo],[xvoGJ],[xvoGJ,vo],[t],[t,vo],[t,xvoGJ],[t,xvoGJ,vo],[TV],[TV,vo],[TV,xvoGJ],[TV,xvoGJ,vo],[TV,t],[TV,t,vo],[TV,t,xvoGJ],[TV,t,xvoGJ,vo],[upMi],[upMi,vo],[upMi,xvoGJ],[upMi,xvoGJ,vo],[upMi,t],[upMi,t,vo],[upMi,t,xvoGJ],[upMi,t,xvoGJ,vo],[upMi,TV],[upMi,TV,vo],[upMi,TV,xvoGJ],[upMi,TV,xvoGJ,vo],[upMi,TV,t],[upMi,TV,t,vo],[upMi,TV,t,xvoGJ],[upMi,TV,t,xvoGJ,vo]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "E","nbz","ki")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ki],[nbz],[nbz,ki],[E],[E,ki],[E,nbz],[E,nbz,ki]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","S","oHp")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[oHp],[S],[S,oHp],[s],[s,oHp],[s,S],[s,S,oHp]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "hHch","QDiRw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QDiRw],[hHch],[hHch,QDiRw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sd","TnGVP","pzP","ZcQfc","umdkZ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[umdkZ],[ZcQfc],[ZcQfc,umdkZ],[pzP],[pzP,umdkZ],[pzP,ZcQfc],[pzP,ZcQfc,umdkZ],[TnGVP],[TnGVP,umdkZ],[TnGVP,ZcQfc],[TnGVP,ZcQfc,umdkZ],[TnGVP,pzP],[TnGVP,pzP,umdkZ],[TnGVP,pzP,ZcQfc],[TnGVP,pzP,ZcQfc,umdkZ],[sd],[sd,umdkZ],[sd,ZcQfc],[sd,ZcQfc,umdkZ],[sd,pzP],[sd,pzP,umdkZ],[sd,pzP,ZcQfc],[sd,pzP,ZcQfc,umdkZ],[sd,TnGVP],[sd,TnGVP,umdkZ],[sd,TnGVP,ZcQfc],[sd,TnGVP,ZcQfc,umdkZ],[sd,TnGVP,pzP],[sd,TnGVP,pzP,umdkZ],[sd,TnGVP,pzP,ZcQfc],[sd,TnGVP,pzP,ZcQfc,umdkZ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "X")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[X]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ug","gcr","Unc","sDnLM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sDnLM],[Unc],[Unc,sDnLM],[gcr],[gcr,sDnLM],[gcr,Unc],[gcr,Unc,sDnLM],[Ug],[Ug,sDnLM],[Ug,Unc],[Ug,Unc,sDnLM],[Ug,gcr],[Ug,gcr,sDnLM],[Ug,gcr,Unc],[Ug,gcr,Unc,sDnLM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "dfC","ZwmI","gzGCG","VNPM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[VNPM],[gzGCG],[gzGCG,VNPM],[ZwmI],[ZwmI,VNPM],[ZwmI,gzGCG],[ZwmI,gzGCG,VNPM],[dfC],[dfC,VNPM],[dfC,gzGCG],[dfC,gzGCG,VNPM],[dfC,ZwmI],[dfC,ZwmI,VNPM],[dfC,ZwmI,gzGCG],[dfC,ZwmI,gzGCG,VNPM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Oyv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Oyv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KN","k","chq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[chq],[k],[k,chq],[KN],[KN,chq],[KN,k],[KN,k,chq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "gTl")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gTl]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zfFdH","OJnHi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OJnHi],[zfFdH],[zfFdH,OJnHi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QqC","Tp","BSed")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BSed],[Tp],[Tp,BSed],[QqC],[QqC,BSed],[QqC,Tp],[QqC,Tp,BSed]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "JLu","KrGWZ","w","BNf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BNf],[w],[w,BNf],[KrGWZ],[KrGWZ,BNf],[KrGWZ,w],[KrGWZ,w,BNf],[JLu],[JLu,BNf],[JLu,w],[JLu,w,BNf],[JLu,KrGWZ],[JLu,KrGWZ,BNf],[JLu,KrGWZ,w],[JLu,KrGWZ,w,BNf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_50() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lL","osw","pux","WSr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[WSr],[pux],[pux,WSr],[osw],[osw,WSr],[osw,pux],[osw,pux,WSr],[lL],[lL,WSr],[lL,pux],[lL,pux,WSr],[lL,osw],[lL,osw,WSr],[lL,osw,pux],[lL,osw,pux,WSr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_51() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "S","K","UurG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UurG],[K],[K,UurG],[S],[S,UurG],[S,K],[S,K,UurG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_52() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tRB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tRB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_53() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iI","iir","xXY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xXY],[iir],[iir,xXY],[iI],[iI,xXY],[iI,iir],[iI,iir,xXY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_54() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vqSva","bb","jFg","Vcdzx")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Vcdzx],[jFg],[jFg,Vcdzx],[bb],[bb,Vcdzx],[bb,jFg],[bb,jFg,Vcdzx],[vqSva],[vqSva,Vcdzx],[vqSva,jFg],[vqSva,jFg,Vcdzx],[vqSva,bb],[vqSva,bb,Vcdzx],[vqSva,bb,jFg],[vqSva,bb,jFg,Vcdzx]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_55() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bViO","cUJvn","Sa")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Sa],[cUJvn],[cUJvn,Sa],[bViO],[bViO,Sa],[bViO,cUJvn],[bViO,cUJvn,Sa]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_56() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pt","Ylvqu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Ylvqu],[pt],[pt,Ylvqu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_57() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "b","diJp","wln","Tr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Tr],[wln],[wln,Tr],[diJp],[diJp,Tr],[diJp,wln],[diJp,wln,Tr],[b],[b,Tr],[b,wln],[b,wln,Tr],[b,diJp],[b,diJp,Tr],[b,diJp,wln],[b,diJp,wln,Tr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_58() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eIgXl","GFv","jQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jQ],[GFv],[GFv,jQ],[eIgXl],[eIgXl,jQ],[eIgXl,GFv],[eIgXl,GFv,jQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_59() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mEw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[mEw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_60() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "lbsdr","uQk","Xw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xw],[uQk],[uQk,Xw],[lbsdr],[lbsdr,Xw],[lbsdr,uQk],[lbsdr,uQk,Xw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_61() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","fPT","Am","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[Am],[Am,N],[fPT],[fPT,N],[fPT,Am],[fPT,Am,N],[U],[U,N],[U,Am],[U,Am,N],[U,fPT],[U,fPT,N],[U,fPT,Am],[U,fPT,Am,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_62() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cfs","D","Xsnzn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Xsnzn],[D],[D,Xsnzn],[cfs],[cfs,Xsnzn],[cfs,D],[cfs,D,Xsnzn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_63() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qE","F")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[F],[qE],[qE,F]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_64() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZOBtV","Kc","GuEA","zTT","yNjY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yNjY],[zTT],[zTT,yNjY],[GuEA],[GuEA,yNjY],[GuEA,zTT],[GuEA,zTT,yNjY],[Kc],[Kc,yNjY],[Kc,zTT],[Kc,zTT,yNjY],[Kc,GuEA],[Kc,GuEA,yNjY],[Kc,GuEA,zTT],[Kc,GuEA,zTT,yNjY],[ZOBtV],[ZOBtV,yNjY],[ZOBtV,zTT],[ZOBtV,zTT,yNjY],[ZOBtV,GuEA],[ZOBtV,GuEA,yNjY],[ZOBtV,GuEA,zTT],[ZOBtV,GuEA,zTT,yNjY],[ZOBtV,Kc],[ZOBtV,Kc,yNjY],[ZOBtV,Kc,zTT],[ZOBtV,Kc,zTT,yNjY],[ZOBtV,Kc,GuEA],[ZOBtV,Kc,GuEA,yNjY],[ZOBtV,Kc,GuEA,zTT],[ZOBtV,Kc,GuEA,zTT,yNjY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_65() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "YisPC","q","lzQ","OLFUJ","TPz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TPz],[OLFUJ],[OLFUJ,TPz],[lzQ],[lzQ,TPz],[lzQ,OLFUJ],[lzQ,OLFUJ,TPz],[q],[q,TPz],[q,OLFUJ],[q,OLFUJ,TPz],[q,lzQ],[q,lzQ,TPz],[q,lzQ,OLFUJ],[q,lzQ,OLFUJ,TPz],[YisPC],[YisPC,TPz],[YisPC,OLFUJ],[YisPC,OLFUJ,TPz],[YisPC,lzQ],[YisPC,lzQ,TPz],[YisPC,lzQ,OLFUJ],[YisPC,lzQ,OLFUJ,TPz],[YisPC,q],[YisPC,q,TPz],[YisPC,q,OLFUJ],[YisPC,q,OLFUJ,TPz],[YisPC,q,lzQ],[YisPC,q,lzQ,TPz],[YisPC,q,lzQ,OLFUJ],[YisPC,q,lzQ,OLFUJ,TPz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_66() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "XSMEs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[XSMEs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_67() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BR","KpXu","QEz","Lnz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Lnz],[QEz],[QEz,Lnz],[KpXu],[KpXu,Lnz],[KpXu,QEz],[KpXu,QEz,Lnz],[BR],[BR,Lnz],[BR,QEz],[BR,QEz,Lnz],[BR,KpXu],[BR,KpXu,Lnz],[BR,KpXu,QEz],[BR,KpXu,QEz,Lnz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_68() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","jHHpA","UB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UB],[jHHpA],[jHHpA,UB],[U],[U,UB],[U,jHHpA],[U,jHHpA,UB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_69() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GG","KHjH","YYH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YYH],[KHjH],[KHjH,YYH],[GG],[GG,YYH],[GG,KHjH],[GG,KHjH,YYH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_70() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "tbDd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[tbDd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_71() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ZrDqn")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ZrDqn]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_72() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iho","KPnLd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[KPnLd],[iho],[iho,KPnLd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_73() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "U","sOSw","DTQcz")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[DTQcz],[sOSw],[sOSw,DTQcz],[U],[U,DTQcz],[U,sOSw],[U,sOSw,DTQcz]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_74() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MSR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MSR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_75() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UjNae")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UjNae]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_76() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[R],[R,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_77() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ruCe","pNkss","UMEnd","JM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[JM],[UMEnd],[UMEnd,JM],[pNkss],[pNkss,JM],[pNkss,UMEnd],[pNkss,UMEnd,JM],[ruCe],[ruCe,JM],[ruCe,UMEnd],[ruCe,UMEnd,JM],[ruCe,pNkss],[ruCe,pNkss,JM],[ruCe,pNkss,UMEnd],[ruCe,pNkss,UMEnd,JM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_78() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KQZV","nya","gxHLb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[gxHLb],[nya],[nya,gxHLb],[KQZV],[KQZV,gxHLb],[KQZV,nya],[KQZV,nya,gxHLb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_79() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vG","HUm","ospR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ospR],[HUm],[HUm,ospR],[vG],[vG,ospR],[vG,HUm],[vG,HUm,ospR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_80() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "a","pcW","u","Y","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[Y],[Y,K],[u],[u,K],[u,Y],[u,Y,K],[pcW],[pcW,K],[pcW,Y],[pcW,Y,K],[pcW,u],[pcW,u,K],[pcW,u,Y],[pcW,u,Y,K],[a],[a,K],[a,Y],[a,Y,K],[a,u],[a,u,K],[a,u,Y],[a,u,Y,K],[a,pcW],[a,pcW,K],[a,pcW,Y],[a,pcW,Y,K],[a,pcW,u],[a,pcW,u,K],[a,pcW,u,Y],[a,pcW,u,Y,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_81() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TUye","Hdv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Hdv],[TUye],[TUye,Hdv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_82() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ET")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ET]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_83() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "NjWF")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[NjWF]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_84() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UjRZk","c","DqQ","ES")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ES],[DqQ],[DqQ,ES],[c],[c,ES],[c,DqQ],[c,DqQ,ES],[UjRZk],[UjRZk,ES],[UjRZk,DqQ],[UjRZk,DqQ,ES],[UjRZk,c],[UjRZk,c,ES],[UjRZk,c,DqQ],[UjRZk,c,DqQ,ES]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_85() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "QGNm","E","YQgXO")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[YQgXO],[E],[E,YQgXO],[QGNm],[QGNm,YQgXO],[QGNm,E],[QGNm,E,YQgXO]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_86() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "KL","r","Ju","N")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[N],[Ju],[Ju,N],[r],[r,N],[r,Ju],[r,Ju,N],[KL],[KL,N],[KL,Ju],[KL,Ju,N],[KL,r],[KL,r,N],[KL,r,Ju],[KL,r,Ju,N]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_87() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bYZ","IYe","QSXWI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[QSXWI],[IYe],[IYe,QSXWI],[bYZ],[bYZ,QSXWI],[bYZ,IYe],[bYZ,IYe,QSXWI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_88() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","B","fetF","MezL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[MezL],[fetF],[fetF,MezL],[B],[B,MezL],[B,fetF],[B,fetF,MezL],[P],[P,MezL],[P,fetF],[P,fetF,MezL],[P,B],[P,B,MezL],[P,B,fetF],[P,B,fetF,MezL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_89() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "RUwNc","SrA","bv")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[bv],[SrA],[SrA,bv],[RUwNc],[RUwNc,bv],[RUwNc,SrA],[RUwNc,SrA,bv]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_90() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "esDU","fue")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fue],[esDU],[esDU,fue]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_91() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "cmTH","T","vepm","ktg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ktg],[vepm],[vepm,ktg],[T],[T,ktg],[T,vepm],[T,vepm,ktg],[cmTH],[cmTH,ktg],[cmTH,vepm],[cmTH,vepm,ktg],[cmTH,T],[cmTH,T,ktg],[cmTH,T,vepm],[cmTH,T,vepm,ktg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_92() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ToR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ToR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_93() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "oTsT","jp","Ne","keB","TWuL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TWuL],[keB],[keB,TWuL],[Ne],[Ne,TWuL],[Ne,keB],[Ne,keB,TWuL],[jp],[jp,TWuL],[jp,keB],[jp,keB,TWuL],[jp,Ne],[jp,Ne,TWuL],[jp,Ne,keB],[jp,Ne,keB,TWuL],[oTsT],[oTsT,TWuL],[oTsT,keB],[oTsT,keB,TWuL],[oTsT,Ne],[oTsT,Ne,TWuL],[oTsT,Ne,keB],[oTsT,Ne,keB,TWuL],[oTsT,jp],[oTsT,jp,TWuL],[oTsT,jp,keB],[oTsT,jp,keB,TWuL],[oTsT,jp,Ne],[oTsT,jp,Ne,TWuL],[oTsT,jp,Ne,keB],[oTsT,jp,Ne,keB,TWuL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_94() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zGhaf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[zGhaf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_95() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "iPi")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[iPi]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_96() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","YGdf","ifZxD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ifZxD],[YGdf],[YGdf,ifZxD],[R],[R,ifZxD],[R,YGdf],[R,YGdf,ifZxD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_97() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_98() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "zr","X","htEzw")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[htEzw],[X],[X,htEzw],[zr],[zr,htEzw],[zr,X],[zr,X,htEzw]]", resultFormatted);
    }

    @org.junit.Test(timeout = 3000)
    public void test_99() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "SD","jBg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[jBg],[SD],[SD,jBg]]", resultFormatted);
    }
}

