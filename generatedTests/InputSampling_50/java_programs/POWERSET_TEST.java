package java_programs;


public class POWERSET_TEST {
    @org.junit.Test(timeout = 60000)
    public void test_0() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UEVgM","yMGc","UYq","lmmJG","AlG")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AlG],[lmmJG],[lmmJG,AlG],[UYq],[UYq,AlG],[UYq,lmmJG],[UYq,lmmJG,AlG],[yMGc],[yMGc,AlG],[yMGc,lmmJG],[yMGc,lmmJG,AlG],[yMGc,UYq],[yMGc,UYq,AlG],[yMGc,UYq,lmmJG],[yMGc,UYq,lmmJG,AlG],[UEVgM],[UEVgM,AlG],[UEVgM,lmmJG],[UEVgM,lmmJG,AlG],[UEVgM,UYq],[UEVgM,UYq,AlG],[UEVgM,UYq,lmmJG],[UEVgM,UYq,lmmJG,AlG],[UEVgM,yMGc],[UEVgM,yMGc,AlG],[UEVgM,yMGc,lmmJG],[UEVgM,yMGc,lmmJG,AlG],[UEVgM,yMGc,UYq],[UEVgM,yMGc,UYq,AlG],[UEVgM,yMGc,UYq,lmmJG],[UEVgM,yMGc,UYq,lmmJG,AlG]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_1() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "m","UZd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[UZd],[m],[m,UZd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_2() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BgoI","wBq","noY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[noY],[wBq],[wBq,noY],[BgoI],[BgoI,noY],[BgoI,wBq],[BgoI,wBq,noY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_3() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "P","Q","uhfll","MgP","yHArr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[yHArr],[MgP],[MgP,yHArr],[uhfll],[uhfll,yHArr],[uhfll,MgP],[uhfll,MgP,yHArr],[Q],[Q,yHArr],[Q,MgP],[Q,MgP,yHArr],[Q,uhfll],[Q,uhfll,yHArr],[Q,uhfll,MgP],[Q,uhfll,MgP,yHArr],[P],[P,yHArr],[P,MgP],[P,MgP,yHArr],[P,uhfll],[P,uhfll,yHArr],[P,uhfll,MgP],[P,uhfll,MgP,yHArr],[P,Q],[P,Q,yHArr],[P,Q,MgP],[P,Q,MgP,yHArr],[P,Q,uhfll],[P,Q,uhfll,yHArr],[P,Q,uhfll,MgP],[P,Q,uhfll,MgP,yHArr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_4() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "BR","GMw","anMAO","yigE","O")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[O],[yigE],[yigE,O],[anMAO],[anMAO,O],[anMAO,yigE],[anMAO,yigE,O],[GMw],[GMw,O],[GMw,yigE],[GMw,yigE,O],[GMw,anMAO],[GMw,anMAO,O],[GMw,anMAO,yigE],[GMw,anMAO,yigE,O],[BR],[BR,O],[BR,yigE],[BR,yigE,O],[BR,anMAO],[BR,anMAO,O],[BR,anMAO,yigE],[BR,anMAO,yigE,O],[BR,GMw],[BR,GMw,O],[BR,GMw,yigE],[BR,GMw,yigE,O],[BR,GMw,anMAO],[BR,GMw,anMAO,O],[BR,GMw,anMAO,yigE],[BR,GMw,anMAO,yigE,O]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_5() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "g")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[g]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_6() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "eIu","C","X","Wd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Wd],[X],[X,Wd],[C],[C,Wd],[C,X],[C,X,Wd],[eIu],[eIu,Wd],[eIu,X],[eIu,X,Wd],[eIu,C],[eIu,C,Wd],[eIu,C,X],[eIu,C,X,Wd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_7() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Vnbx","zRN","h","GpbV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[GpbV],[h],[h,GpbV],[zRN],[zRN,GpbV],[zRN,h],[zRN,h,GpbV],[Vnbx],[Vnbx,GpbV],[Vnbx,h],[Vnbx,h,GpbV],[Vnbx,zRN],[Vnbx,zRN,GpbV],[Vnbx,zRN,h],[Vnbx,zRN,h,GpbV]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_8() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "d","eWOv","lIX","pES")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pES],[lIX],[lIX,pES],[eWOv],[eWOv,pES],[eWOv,lIX],[eWOv,lIX,pES],[d],[d,pES],[d,lIX],[d,lIX,pES],[d,eWOv],[d,eWOv,pES],[d,eWOv,lIX],[d,eWOv,lIX,pES]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_9() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "fjIs","dOmCf","aWSpN","u","Er")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Er],[u],[u,Er],[aWSpN],[aWSpN,Er],[aWSpN,u],[aWSpN,u,Er],[dOmCf],[dOmCf,Er],[dOmCf,u],[dOmCf,u,Er],[dOmCf,aWSpN],[dOmCf,aWSpN,Er],[dOmCf,aWSpN,u],[dOmCf,aWSpN,u,Er],[fjIs],[fjIs,Er],[fjIs,u],[fjIs,u,Er],[fjIs,aWSpN],[fjIs,aWSpN,Er],[fjIs,aWSpN,u],[fjIs,aWSpN,u,Er],[fjIs,dOmCf],[fjIs,dOmCf,Er],[fjIs,dOmCf,u],[fjIs,dOmCf,u,Er],[fjIs,dOmCf,aWSpN],[fjIs,dOmCf,aWSpN,Er],[fjIs,dOmCf,aWSpN,u],[fjIs,dOmCf,aWSpN,u,Er]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_10() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "pxjSd")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[pxjSd]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_11() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xYN")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[xYN]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_12() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ct","G","XB","eNIS","qxu")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qxu],[eNIS],[eNIS,qxu],[XB],[XB,qxu],[XB,eNIS],[XB,eNIS,qxu],[G],[G,qxu],[G,eNIS],[G,eNIS,qxu],[G,XB],[G,XB,qxu],[G,XB,eNIS],[G,XB,eNIS,qxu],[ct],[ct,qxu],[ct,eNIS],[ct,eNIS,qxu],[ct,XB],[ct,XB,qxu],[ct,XB,eNIS],[ct,XB,eNIS,qxu],[ct,G],[ct,G,qxu],[ct,G,eNIS],[ct,G,eNIS,qxu],[ct,G,XB],[ct,G,XB,qxu],[ct,G,XB,eNIS],[ct,G,XB,eNIS,qxu]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_13() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f","Kr","HE","WXoqP","EaCPP")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[EaCPP],[WXoqP],[WXoqP,EaCPP],[HE],[HE,EaCPP],[HE,WXoqP],[HE,WXoqP,EaCPP],[Kr],[Kr,EaCPP],[Kr,WXoqP],[Kr,WXoqP,EaCPP],[Kr,HE],[Kr,HE,EaCPP],[Kr,HE,WXoqP],[Kr,HE,WXoqP,EaCPP],[f],[f,EaCPP],[f,WXoqP],[f,WXoqP,EaCPP],[f,HE],[f,HE,EaCPP],[f,HE,WXoqP],[f,HE,WXoqP,EaCPP],[f,Kr],[f,Kr,EaCPP],[f,Kr,WXoqP],[f,Kr,WXoqP,EaCPP],[f,Kr,HE],[f,Kr,HE,EaCPP],[f,Kr,HE,WXoqP],[f,Kr,HE,WXoqP,EaCPP]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_14() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "rfc")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rfc]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_15() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GDQPu","Eh","AkR")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[AkR],[Eh],[Eh,AkR],[GDQPu],[GDQPu,AkR],[GDQPu,Eh],[GDQPu,Eh,AkR]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_16() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "bHCpi","usRcA")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[usRcA],[bHCpi],[bHCpi,usRcA]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_17() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "vf","q","du","K")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[K],[du],[du,K],[q],[q,K],[q,du],[q,du,K],[vf],[vf,K],[vf,du],[vf,du,K],[vf,q],[vf,q,K],[vf,q,du],[vf,q,du,K]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_18() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","d","WwH","Ha","Hr")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Hr],[Ha],[Ha,Hr],[WwH],[WwH,Hr],[WwH,Ha],[WwH,Ha,Hr],[d],[d,Hr],[d,Ha],[d,Ha,Hr],[d,WwH],[d,WwH,Hr],[d,WwH,Ha],[d,WwH,Ha,Hr],[A],[A,Hr],[A,Ha],[A,Ha,Hr],[A,WwH],[A,WwH,Hr],[A,WwH,Ha],[A,WwH,Ha,Hr],[A,d],[A,d,Hr],[A,d,Ha],[A,d,Ha,Hr],[A,d,WwH],[A,d,WwH,Hr],[A,d,WwH,Ha],[A,d,WwH,Ha,Hr]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_19() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "naV","vXgdZ","TpLb")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TpLb],[vXgdZ],[vXgdZ,TpLb],[naV],[naV,TpLb],[naV,vXgdZ],[naV,vXgdZ,TpLb]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_20() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "mEmW","sdB","A","LwQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[LwQ],[A],[A,LwQ],[sdB],[sdB,LwQ],[sdB,A],[sdB,A,LwQ],[mEmW],[mEmW,LwQ],[mEmW,A],[mEmW,A,LwQ],[mEmW,sdB],[mEmW,sdB,LwQ],[mEmW,sdB,A],[mEmW,sdB,A,LwQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_21() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "FK","dWFE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dWFE],[FK],[FK,dWFE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_22() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Cjmqn","jSKbz","blR","k")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[k],[blR],[blR,k],[jSKbz],[jSKbz,k],[jSKbz,blR],[jSKbz,blR,k],[Cjmqn],[Cjmqn,k],[Cjmqn,blR],[Cjmqn,blR,k],[Cjmqn,jSKbz],[Cjmqn,jSKbz,k],[Cjmqn,jSKbz,blR],[Cjmqn,jSKbz,blR,k]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_23() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Tzl","cAtzc","M")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[M],[cAtzc],[cAtzc,M],[Tzl],[Tzl,M],[Tzl,cAtzc],[Tzl,cAtzc,M]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_24() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "IRj","C","F","x","sxtH")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sxtH],[x],[x,sxtH],[F],[F,sxtH],[F,x],[F,x,sxtH],[C],[C,sxtH],[C,x],[C,x,sxtH],[C,F],[C,F,sxtH],[C,F,x],[C,F,x,sxtH],[IRj],[IRj,sxtH],[IRj,x],[IRj,x,sxtH],[IRj,F],[IRj,F,sxtH],[IRj,F,x],[IRj,F,x,sxtH],[IRj,C],[IRj,C,sxtH],[IRj,C,x],[IRj,C,x,sxtH],[IRj,C,F],[IRj,C,F,sxtH],[IRj,C,F,x],[IRj,C,F,x,sxtH]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_25() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "V","ewLon")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[ewLon],[V],[V,ewLon]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_26() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "q","d","Bz","L","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[L],[L,o],[Bz],[Bz,o],[Bz,L],[Bz,L,o],[d],[d,o],[d,L],[d,L,o],[d,Bz],[d,Bz,o],[d,Bz,L],[d,Bz,L,o],[q],[q,o],[q,L],[q,L,o],[q,Bz],[q,Bz,o],[q,Bz,L],[q,Bz,L,o],[q,d],[q,d,o],[q,d,L],[q,d,L,o],[q,d,Bz],[q,d,Bz,o],[q,d,Bz,L],[q,d,Bz,L,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_27() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "sjL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[sjL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_28() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "xrz","Ly","o","wf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wf],[o],[o,wf],[Ly],[Ly,wf],[Ly,o],[Ly,o,wf],[xrz],[xrz,wf],[xrz,o],[xrz,o,wf],[xrz,Ly],[xrz,Ly,wf],[xrz,Ly,o],[xrz,Ly,o,wf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_29() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "f","QoLyl","jil","HKp","qbM")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[qbM],[HKp],[HKp,qbM],[jil],[jil,qbM],[jil,HKp],[jil,HKp,qbM],[QoLyl],[QoLyl,qbM],[QoLyl,HKp],[QoLyl,HKp,qbM],[QoLyl,jil],[QoLyl,jil,qbM],[QoLyl,jil,HKp],[QoLyl,jil,HKp,qbM],[f],[f,qbM],[f,HKp],[f,HKp,qbM],[f,jil],[f,jil,qbM],[f,jil,HKp],[f,jil,HKp,qbM],[f,QoLyl],[f,QoLyl,qbM],[f,QoLyl,HKp],[f,QoLyl,HKp,qbM],[f,QoLyl,jil],[f,QoLyl,jil,qbM],[f,QoLyl,jil,HKp],[f,QoLyl,jil,HKp,qbM]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_30() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Jux")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Jux]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_31() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "TwBYK")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[TwBYK]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_32() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "GKHnS","T","RDBDH","nuP","BL")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[BL],[nuP],[nuP,BL],[RDBDH],[RDBDH,BL],[RDBDH,nuP],[RDBDH,nuP,BL],[T],[T,BL],[T,nuP],[T,nuP,BL],[T,RDBDH],[T,RDBDH,BL],[T,RDBDH,nuP],[T,RDBDH,nuP,BL],[GKHnS],[GKHnS,BL],[GKHnS,nuP],[GKHnS,nuP,BL],[GKHnS,RDBDH],[GKHnS,RDBDH,BL],[GKHnS,RDBDH,nuP],[GKHnS,RDBDH,nuP,BL],[GKHnS,T],[GKHnS,T,BL],[GKHnS,T,nuP],[GKHnS,T,nuP,BL],[GKHnS,T,RDBDH],[GKHnS,T,RDBDH,BL],[GKHnS,T,RDBDH,nuP],[GKHnS,T,RDBDH,nuP,BL]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_33() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "aiPp","Seqic","OjNWk","Gkya","rpTQ")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rpTQ],[Gkya],[Gkya,rpTQ],[OjNWk],[OjNWk,rpTQ],[OjNWk,Gkya],[OjNWk,Gkya,rpTQ],[Seqic],[Seqic,rpTQ],[Seqic,Gkya],[Seqic,Gkya,rpTQ],[Seqic,OjNWk],[Seqic,OjNWk,rpTQ],[Seqic,OjNWk,Gkya],[Seqic,OjNWk,Gkya,rpTQ],[aiPp],[aiPp,rpTQ],[aiPp,Gkya],[aiPp,Gkya,rpTQ],[aiPp,OjNWk],[aiPp,OjNWk,rpTQ],[aiPp,OjNWk,Gkya],[aiPp,OjNWk,Gkya,rpTQ],[aiPp,Seqic],[aiPp,Seqic,rpTQ],[aiPp,Seqic,Gkya],[aiPp,Seqic,Gkya,rpTQ],[aiPp,Seqic,OjNWk],[aiPp,Seqic,OjNWk,rpTQ],[aiPp,Seqic,OjNWk,Gkya],[aiPp,Seqic,OjNWk,Gkya,rpTQ]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_34() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "MUQwT","TZJV","l")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[l],[TZJV],[TZJV,l],[MUQwT],[MUQwT,l],[MUQwT,TZJV],[MUQwT,TZJV,l]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_35() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "EVODj","Rg")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[Rg],[EVODj],[EVODj,Rg]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_36() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ni","o")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[o],[Ni],[Ni,o]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_37() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "ux","Qrfj","PYXMC","UBt","OE")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OE],[UBt],[UBt,OE],[PYXMC],[PYXMC,OE],[PYXMC,UBt],[PYXMC,UBt,OE],[Qrfj],[Qrfj,OE],[Qrfj,UBt],[Qrfj,UBt,OE],[Qrfj,PYXMC],[Qrfj,PYXMC,OE],[Qrfj,PYXMC,UBt],[Qrfj,PYXMC,UBt,OE],[ux],[ux,OE],[ux,UBt],[ux,UBt,OE],[ux,PYXMC],[ux,PYXMC,OE],[ux,PYXMC,UBt],[ux,PYXMC,UBt,OE],[ux,Qrfj],[ux,Qrfj,OE],[ux,Qrfj,UBt],[ux,Qrfj,UBt,OE],[ux,Qrfj,PYXMC],[ux,Qrfj,PYXMC,OE],[ux,Qrfj,PYXMC,UBt],[ux,Qrfj,PYXMC,UBt,OE]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_38() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "UTO","A","Gwtt","wjY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wjY],[Gwtt],[Gwtt,wjY],[A],[A,wjY],[A,Gwtt],[A,Gwtt,wjY],[UTO],[UTO,wjY],[UTO,Gwtt],[UTO,Gwtt,wjY],[UTO,A],[UTO,A,wjY],[UTO,A,Gwtt],[UTO,A,Gwtt,wjY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_39() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "A","Xj","YAQeC","fFD")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[fFD],[YAQeC],[YAQeC,fFD],[Xj],[Xj,fFD],[Xj,YAQeC],[Xj,YAQeC,fFD],[A],[A,fFD],[A,YAQeC],[A,YAQeC,fFD],[A,Xj],[A,Xj,fFD],[A,Xj,YAQeC],[A,Xj,YAQeC,fFD]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_40() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "R","pYcel","vrs")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[vrs],[pYcel],[pYcel,vrs],[R],[R,vrs],[R,pYcel],[R,pYcel,vrs]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_41() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "kBuv","rwLB")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[rwLB],[kBuv],[kBuv,rwLB]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_42() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "s","id")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[id],[s],[s,id]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_43() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "OvYo","FTf")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[FTf],[OvYo],[OvYo,FTf]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_44() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "qU","dlrq")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[dlrq],[qU],[qU,dlrq]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_45() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "nzVm","dBQ","nlk")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[nlk],[dBQ],[dBQ,nlk],[nzVm],[nzVm,nlk],[nzVm,dBQ],[nzVm,dBQ,nlk]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_46() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wTGRI")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[wTGRI]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_47() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "wO","j")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[j],[wO],[wO,j]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_48() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Ssa","hixqU","gHD","OY")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[OY],[gHD],[gHD,OY],[hixqU],[hixqU,OY],[hixqU,gHD],[hixqU,gHD,OY],[Ssa],[Ssa,OY],[Ssa,gHD],[Ssa,gHD,OY],[Ssa,hixqU],[Ssa,hixqU,OY],[Ssa,hixqU,gHD],[Ssa,hixqU,gHD,OY]]", resultFormatted);
    }

    @org.junit.Test(timeout = 60000)
    public void test_49() throws java.lang.Exception {
        java.util.ArrayList result = java_programs.POWERSET.powerset(new java.util.ArrayList(java.util.Arrays.asList( "Gjuqi","HwkZV")));
        String resultFormatted = java_programs.QuixFixOracleHelper.format(result,true);
        org.junit.Assert.assertEquals("[[],[HwkZV],[Gjuqi],[Gjuqi,HwkZV]]", resultFormatted);
    }
}

