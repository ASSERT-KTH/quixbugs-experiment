#!/usr/bin/python
import sys, os, subprocess,fnmatch, shutil, csv,re, datetime

# ./autotest.py <patch name>  <D_correct|D_incorrect|D_unassessed> <ASE15_Evosuite|ASE15_Randoop|EMSE18_Evosuite>
if __name__ == '__main__':
	with open('result.json', 'r') as file:
		lines = file.readlines()
		count = 1
		for line in lines:
			if 'diff' in line:
		 		with open('Patch'+str(count)+'_DEPTH_FIRST_SEARCH_Arja.diff', 'a') as patch:
				 pf = line.split('\"diff\": \"')[1]
				 pf = pf.split('\\n\\n\\n",')[0]
				 pf = pf.replace('\\t','    ')
				 lines = pf.split("\\n")
				 for line in lines:
					 patch.write(line+'\n')

				#  print pf[0:3]
				#  print pf[0]
				#  new = pf[:len(pf)-2]
				#  print new
				#  print "**********"
				#  l = new.split()
				#  print l
		
				#  patch.write(pf[:len(pf)-2])
				 count+=1
			
