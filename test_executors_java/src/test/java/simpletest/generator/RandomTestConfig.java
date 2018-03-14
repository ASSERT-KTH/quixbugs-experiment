package simpletest.generator;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomTestConfig {
	
	private final static int MAX_ARRAY_SIZE = 20;
	
	private final static int INTEGER_SIZE = 100;
	
	public static Map getRandomParamters(Type[] parametersTypes,String program){
		
		
		Map map = new HashMap();
		Object[] params = new Object[parametersTypes.length];
		String paramStr = "";
		for(int index = 0;index<parametersTypes.length;index++ ) {
			Type type = parametersTypes[index];
			String type1 = type.getTypeName();
			
			if("java.util.ArrayList".equals(type.getTypeName())) {
				if("rpn_eval".equals(program)) {
					ArrayList array = getRandomDoubleList();
					params[index]=array;		
					paramStr += "new java.util.ArrayList(java.util.Arrays.asList("+array.toString()+"))";
					paramStr=paramStr.replace("[", "").replace("]", "")+",";
				} else if ("powerset".equals(program)) {
					ArrayList array = getRandomStringList();
					params[index]=array;		
					paramStr += "new java.util.ArrayList(java.util.Arrays.asList("+strArrayToString(array)+"))";
					paramStr=paramStr.replace("[", "").replace("]", "")+",";
				} else {
				ArrayList array = getRandomList();
				params[index]=array;		
				paramStr += "new java.util.ArrayList(java.util.Arrays.asList("+array.toString()+"))";
				paramStr=paramStr.replace("[", "").replace("]", "")+",";
				}
			} else if("int[][]".equals(type.getTypeName())) {
				int[][] twoDimArray = getRandomTwoDimArray() ;
				params[index]=twoDimArray;
				paramStr += "new " + type.getTypeName() + "{" + twoArraysToString(twoDimArray)+"},";
			} else if("int[]".equals(type.getTypeName())) {
				int[] array = getRandomArray() ;
				params[index]=array;
				//For program find_in_sorted, a sorted array is needed
				if("find_in_sorted".equals(program)) {
					Arrays.sort(array);
				}			
				paramStr += "new " + type.getTypeName() + "{" + arrayToString(array)+"},";
			} else if(type.getTypeName().equals("int")){
				int i = (int)(Math.random()*INTEGER_SIZE)*getRandomNegative();
				params[index]= i;
				paramStr += "(" + type.getTypeName() + ")" + i+",";
			} else if(type.getTypeName().equals("java.lang.String")) {
				if("is_valid_parenthesization".equals(program)) {
					String parentheses = randomparentheses();
					params[index] = parentheses;
					paramStr +="\""+parentheses+"\""+",";
				} else {
					String string = randomString();
					params[index] = string;
					paramStr +="\""+string+"\""+",";
				}
			}
		}
		
		map.put("parameters",params );
		map.put("parametersToString",paramStr.substring(0,paramStr.length()-1));
		return map;
	}
	
	
	private static String strArrayToString(ArrayList array) {
		String str = " ";
		for(int i =0;i<array.size();i++) {
			str+="\""+array.get(i)+"\""+",";
		}
		return str.substring(0,str.length()-1);
	}


	private static ArrayList getRandomStringList() {
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   ArrayList<String> stringList= new  ArrayList<String>();
	   Random random=new Random();
	   int arraySize = random.nextInt(5);
	   for(int j=0;j<arraySize;j++) {
	   StringBuffer sb=new StringBuffer();
	   int charNum = random.nextInt(5);
	   for(int i=0;i<charNum;i++) {
		   int number=random.nextInt(52);
	       sb.append(str.charAt(number));
	   }	   
	   stringList.add(sb.toString());
	   }	   
		return stringList;
	}


	private static String randomString() {
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     Random random=new Random();
	     StringBuffer sb=new StringBuffer();
	     int strSize = random.nextInt(10);
	     for(int i=0;i<strSize;i++){
	       int number=random.nextInt(52);
	       sb.append(str.charAt(number));
	     }
	     return sb.toString();
	}


	private static String twoArraysToString(int[][] twoDimArray) {
		String s= " ";
		for(int i = 0; i<twoDimArray.length;i++) {
			int column = twoDimArray[i].length;
			s+="{";
			for(int j = 0;j<column;j++) {
				s+=twoDimArray[i][j]+",";
			}
			s=s.substring(0,s.length()-1);
			s+="}" +",";
		}
		
		return s.substring(0, s.length()-1);
	}


	private static int[][] getRandomTwoDimArray() {
		
		int rowNum =(int) ((Math.random()*INTEGER_SIZE) %MAX_ARRAY_SIZE);
		//int columnNum =(int) ((Math.random()*INTEGER_SIZE) %MAX_ARRAY_SIZE);
		int columnNum =2;
		int[][] arrays = new int[rowNum][columnNum];
		for(int i=0;i<rowNum;i++) {
			for(int j =0; j<columnNum; j++) {
				arrays[i][j] = (int)(Math.random()*INTEGER_SIZE)*getRandomNegative();
			}
		}		
		return arrays;
	}


	private static String randomparentheses() {
		String randomParentheses = "";
		
		int num =(int) ((Math.random()*INTEGER_SIZE) %MAX_ARRAY_SIZE);
		for(int i=0;i<num;i++) {
		if(	Math.random()>0.5) {
			randomParentheses+="(";
		} else {
			randomParentheses+=")";
		}
		}
		return randomParentheses;
	}


	private static String arrayToString(int[] array) {
		String str = " ";
		for(int i = 0; i<array.length;i++) {
			str+=String.valueOf(array[i])+",";
		}
		return str.substring(0, str.length()-1);
	}


	private static  int[]  getRandomArray() {
		int num =(int) ((Math.random()*INTEGER_SIZE) %MAX_ARRAY_SIZE);
	    int[] rval = new int[num];
		    for(int i=0; i<num; i++){
		      rval[i] = (int)(Math.random()*INTEGER_SIZE)*getRandomNegative();
		    }
		return rval;				
	}
	

	private static ArrayList getRandomList() {		
		 Random random=new Random();
		 int num = random.nextInt(MAX_ARRAY_SIZE);
    		ArrayList arrayList = new ArrayList();
		for(int i=0;i<num;i++) {
			int randomValue=random.nextInt(INTEGER_SIZE);
			arrayList.add(getRandomNegative()*randomValue);

		}	
		return arrayList;
	}
	
	private static ArrayList getRandomDoubleList() {		
		 Random random=new Random();
		 int num = random.nextInt(MAX_ARRAY_SIZE);
   		ArrayList arrayList = new ArrayList();
		for(int i=0;i<num;i++) {
			double randomValue=Math.random()*INTEGER_SIZE;
			arrayList.add(getRandomNegative()*randomValue);

		}	
		return arrayList;
	}
	
	
	private static int getRandomNegative() {
	if(	Math.random()>0.8) {
		return -1;
	} else {
		return 1;
	}
		
	
	}



	
}
