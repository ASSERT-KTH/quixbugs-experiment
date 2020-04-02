#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime
import time



def travFolder(dir):
    listdirs = os.listdir(dir)
    for f in listdirs:
        pattern = '*.patch'
        if os.path.isfile(os.path.join(dir, f)):
            if fnmatch.fnmatch(f, pattern):
                #apply patch
                print f
                tool = dir.split('/')[-1]
                bug= dir.split('/')[-2]
                print 'bug'+bug
                patchpath = os.path.join(dir, f)
                print 'patchpath: '+patchpath
                # plausible_check(bug,patchpath,f,tool) 
                evotest(bug,patchpath,f,tool)
               

        else:
            if 'tmp.patch' not in f:
                travFolder(dir+'/'+f)


def apply_patch(bugid,patchpath,opt,toolId,patchid):
    print 'in apply patch'
    with open(patchpath) as f:
        difffiles=f.read().split('\n\n\n')
        result=''
        diffcount=0
        patchedfiles=''
        applystatus=''
        for diffs in difffiles:
            if '--- '  in diffs:
                diffcount+=1
                print '*****diffcount******  ' + str(diffcount)
                # split a patch to several temporary patches in case one patch containes many fixes for different files
                filepath='./tmp.patch'
                f=open(filepath,"w")
                f.write(diffs)
                f.close()
                tmppatch='./tmp.patch'
                lines = diffs.split('\n')
                first_line=lines[0]
                for l in lines:
                    if '--- '  in l:
                        first_line=l

                # original buggy file patch
                #the path of patch source code
                filepath=first_line.split('/')[-1]               
                filename=filepath.split('.java')[0]
                print 'targetfile'+filename
               
                original_file= './src/main/java/java_programs/'+filename+'.java'
                os.system('dos2unix  '+original_file)
                os.system('dos2unix  '+tmppatch)
                # copy and save the patched file to local
                # toolpatchid=toolId+'_'+patchid.replace('.patch','')
                # if opt=='':
                #     os.system('mkdir -p ./chart/'+toolpatchid)
                #     os.system('cp '+original_file+' ./chart/'+toolpatchid+'/')
                #     soufilename = original_file.split('/')[-1].replace('.java','_s.java')
                #     os.system('mv ./chart/'+toolpatchid+'/'+original_file.split('/')[-1]+' ./chart/'+toolpatchid+'/'+soufilename)
                if 'reverse' in opt:
                    print "=====reverse========reverse=============reverse========"
                    applyscript = "patch -u -l --verbose --reverse --fuzz=10  -i  " +tmppatch +"  "+ original_file
                else:
                    applyscript = "patch -u -l --verbose --fuzz=10  -i  " +tmppatch +"  "+ original_file
                print applyscript
                currentresult=os.popen(applyscript).read()
                print currentresult

                hunkinfo='1'
                status='succeeded'
                for line in currentresult.split('\n'):
                    print line
                    if 'Hunk #' in line:
                        hunkinfo=line.split('Hunk #')[1].split(' ')[0]
                    if 'fail' in line or "FAIL" in line or "Fail" in line or 'reject' in line:
                        status = 'failed'

                print 'hunk info:  '+hunkinfo
                applystatus+=status+';'
                # copy and save the patched file to local
                # if opt=='':
                #     os.system('cp '+original_file+' ./chart/'+toolpatchid+'/')
                #     soufilename = original_file.split('/')[-1].replace('.java','_t.java')
                #     os.system('mv ./chart/'+toolpatchid+'/'+original_file.split('/')[-1]+' ./chart/'+toolpatchid+'/'+soufilename)
                os.remove(tmppatch)
        print diffcount, applystatus[:-1]
        return diffcount, applystatus[:-1]



# 
def plausible_check(testname,patchpath,bugid,tool):
    print 'This is plausible check for patch '+bugid
    diffcount, applystatus = apply_patch(testname,patchpath,'',tool,bugid)
    with open('./plausible.csv', 'a') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
                quotechar='|', quoting=csv.QUOTE_MINIMAL)
        filewriter.writerow([tool,bugid,testname,applystatus])
    apply_patch(testname,patchpath,'reverse',tool,bugid)




# This function enable to use JPF-symbolic for patch assessment
def jpf(testname,patchpath,bugid,tool):
    diffcount, aplysptatus = apply_patch(testname,patchpath,'')
    os.system('mvn compile')
    symstr='java -Djava.library.path=/Users/sophie/Documents/jpf/jpf-symbc/lib -jar /Users/sophie/Documents/jpf/jpf-core/build/RunJPF.jar ./src/main/java/jpf/DETECT_CYCLE.jpf'
    # os.system(symstr)
    result=os.popen(symstr).read()
    print result
    with open('./jpfresult/'+bugid+tool+'.txt', 'a') as fil:
        fil.write(result)
    apply_patch(testname,patchpath,'reverse')


# This function enable to use generated input sampling for patch assessment
def inputSample(testname,patchpath,bugid,tool):
    diffcount, aplysptatus = apply_patch(testname,patchpath,'',tool,bugid)
    cptstring = 'cp ./generatedTests/InputSampling_300/java_programs/'+testname+'_TEST.java  ./target/classes/java_programs/'
    cpilestr='javac -cp ./libs/evosuite-standalone-runtime-1.0.6-SNAPSHOT.jar:./libs/junit-4.12.jar:./libs/hamcrest-core-1.3.jar:./target/classes  ./target/classes/java_programs/'+testname+'_TEST.java'
    #execute tests
    exestr='java -cp ./libs/evosuite-standalone-runtime-1.0.6-SNAPSHOT.jar::./libs/hamcrest-core-1.3.jar:./libs/junit-4.12.jar org.junit.runner.JUnitCore  java_programs.'+testname+'_TEST'

    os.system(cptstring)
    os.system(cpilestr)   
    # print  cpilestr
    os.chdir('./target/classes')

    result=os.popen(exestr).read() 
    os.chdir('../../')
    print result

    with open('./stistics_randomsample2.csv', 'a') as csvfile:
        filewriter = csv.writer(csvfile, delimiter=',',
            quotechar='|', quoting=csv.QUOTE_MINIMAL)
        resultlines=result.split('\n')
        time=''
        okpattern='OK (* tests)'
        failpattern='Tests run: *,  Failures: *'         
        failInfoPattern='*test*(*)'           
        failingInfo=''
        failingTestsNo=0
        testrun=''
        NoTestFoundCount=0
        warningpatern='*warning*'
        reason=''

        for k in range(0,len(resultlines)):
            line=resultlines[k]
            if 'Time:' in line:
                time=line.split('Time: ')[1]
            if fnmatch.fnmatch(line, okpattern):
                failingTestsNo='0'
                testrun=line.split('(')[1].split(' ')[0]
            if fnmatch.fnmatch(line, failpattern):
                failingTestsNo=line.split("Failures:")[1]
                testrun=line.split(",")[0].split("Tests run: ")[1]
                print testrun
                print failingTestsNo
            if fnmatch.fnmatch(line, failInfoPattern):
                line=line.split('at')[0].replace(' ','')
                failingInfo+=line+'^'
                reason+=resultlines[k+1]+'^'
            if fnmatch.fnmatch(line, warningpatern):
                NoTestFoundCount=int(NoTestFoundCount)+1         
        
        # filewriter.writerow([tool,bugid, diffcount, testrun, aplysptatus, int(failingTestsNo)-int(NoTestFoundCount), time,  failingInfo,reason])    
        filewriter.writerow([tool,bugid, testrun, int(failingTestsNo)-int(NoTestFoundCount), time])    
    apply_patch(testname,patchpath,'reverse',tool,bugid)


def evotest(testname,patchpath,bugid,tool):
    diffcount, aplysptatus = apply_patch(testname,patchpath,'',tool,bugid)
    os.system('mvn compile')
    for i in range(1,31):
        print i
        #cp test:
        cptstring = 'cp ./generatedTests/seed_'+str(i)+'/evosuite-tests/java_programs/'+testname+'_ESTest.java  .//target/classes/java_programs'
        #compile tests
        cpilestr='javac -cp ./libs/evosuite-standalone-runtime-1.0.6-SNAPSHOT.jar:./libs/junit-4.12.jar:./libs/hamcrest-core-1.3.jar:./target/classes  ./target/classes/java_programs/'+testname+'_ESTest.java'
        #execute tests
        exestr='java -cp ./libs/evosuite-standalone-runtime-1.0.6-SNAPSHOT.jar::./libs/hamcrest-core-1.3.jar:./libs/junit-4.12.jar org.junit.runner.JUnitCore  java_programs.'+testname+'_ESTest'

        os.system(cptstring)
        os.system(cpilestr)   
        # print  cpilestr
        os.chdir('./target/classes')

        result=os.popen(exestr).read() 
        os.chdir('../../')
        print result

        with open('./evosuitestistics.csv', 'a') as csvfile:
            filewriter = csv.writer(csvfile, delimiter=',',
                quotechar='|', quoting=csv.QUOTE_MINIMAL)
            resultlines=result.split('\n')
            time=''
            okpattern='OK (* tests)'
            failpattern='Tests run: *,  Failures: *'         
            failInfoPattern='*test*(*)'           
            failingInfo=''
            failingTestsNo=0
            testrun=''
            NoTestFoundCount=0
            warningpatern='*warning*'
            reason=''

            for k in range(0,len(resultlines)):
                line=resultlines[k]
                if 'Time:' in line:
                    time=line.split('Time: ')[1]
                if fnmatch.fnmatch(line, okpattern):
                    failingTestsNo='0'
                    testrun=line.split('(')[1].split(' ')[0]
                if fnmatch.fnmatch(line, failpattern):
                    failingTestsNo=line.split("Failures:")[1]
                    testrun=line.split(",")[0].split("Tests run: ")[1]
                    print testrun
                    print failingTestsNo
                if fnmatch.fnmatch(line, failInfoPattern):
                    line=line.split('at')[0].replace(' ','')
                    failingInfo+=line+'^'
                    reason+=resultlines[k+1]+'^'
                if fnmatch.fnmatch(line, warningpatern):
                    NoTestFoundCount=int(NoTestFoundCount)+1         
            
            filewriter.writerow([tool,bugid, i, diffcount, testrun, aplysptatus, int(failingTestsNo)-int(NoTestFoundCount), time,  failingInfo,reason])    

    apply_patch(testname,patchpath,'reverse',tool,bugid)


if __name__ == '__main__':
    bug= 'LIS'
    # bug='DEPTH_FIRST_SEARCH'
    # bug= 'HANOI'
    # bug='QUICKSORT'       
    # bug='SQRT'
    # bug='DETECT_CYCLE'
    # bug='SHORTEST_PATH_LENGTHS'
    #bug='MERGESORT'
    dir='./patches'
    travFolder(dir)
    

