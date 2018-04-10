package simpletest.generator;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import java_programs.Node;

public class RandomTestConfig {
	
	private final static int MAX_ARRAY_SIZE = 20;
	
	private final static int INTEGER_SIZE = 100;
	
	private static DecimalFormat df=new DecimalFormat("0.00");
	
	public static Map getRandomParamters(Type[] parametersTypes,String program){
		
		
		Map map = new HashMap();
		Object[] params = new Object[parametersTypes.length];
		String paramStr = "";
		String paramArray = "";
		String paramInt = "";
		for(int index = 0;index<parametersTypes.length;index++ ) {
			Type type = parametersTypes[index];
			String type1 = type.getTypeName();
			
			if("java.util.ArrayList".equals(type.getTypeName())) {
				if("rpn_eval".equals(program)) {
					
					//preconditions: isinstance(token, float) or token in ('+', '-', '*', '/') for token in tokens
					ArrayList array = getTokenList();
					params[index]=array;		
					paramStr += "new java.util.ArrayList(java.util.Arrays.asList("+strArrayToString(array)+"))";
					paramStr=paramStr.replace("[", "").replace("]", "")+",";
				} else if ("powerset".equals(program)) {
					ArrayList array = getRandomStringList();
							
					////precondition: A list of unique elements
					ArrayList newarray = uniqueIntegerList(array);
					params[index]=newarray;
					paramStr += "new java.util.ArrayList(java.util.Arrays.asList("+strArrayToString(newarray)+"))";
					paramStr=paramStr.replace("[", "").replace("]", "")+",";
				} else {
				ArrayList array = getRandomList();
					
				if("next_permutation".equals(program)) {
					//precondition: A list of unique ints
					array = uniqueIntegerList(array);
				}		
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
				//For program find_in_sorted, a sorted array is needed
				if("find_in_sorted".equals(program)) {
					Arrays.sort(array);
				} else if("lis".equals(program))	{
					if(array.length>2) {
						//precondition for lis：unique array
						array = uniqueArray(array);
					}
				}
				params[index]=array;
				paramStr += "new " + type.getTypeName() + "{" + arrayToString(array)+"},";
			} else if(type.getTypeName().equals("int")){
				int i = 0;
				if("get_factors".equals(program)) {
					//precondition: >=1
					Random random = new Random();
					i=random.nextInt(2000)+1;
				} else {
					i = (int)(Math.random()*INTEGER_SIZE);

				}
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
			} else if(type.getTypeName().contains("Node")) {
				Node node = randomNode();
				params[index] = node;
				
				if(node.getSuccessors().size()!=0) {
				paramStr += "new Node( \""+node.getValue()+"\",new java.util.ArrayList<Node>(java.util.Arrays.asList( new Node(\""+node.getSuccessors().get(0).getValue()+"\"))))" +",";
				} else {
					paramStr += "new Node(\""+node.getValue() +  "\") ,";
				}
				
				}else if(type.getTypeName().contains("Map")) {
					if("shortest_path_lengths".equals(program)) {
						Map resultMap = randomMap();
						params[index] = resultMap.get("map");
						paramStr += "map ,";
						paramArray = resultMap.get("array")+"";
						paramInt = resultMap.get("int")+"";
					}
				}
		}
		
		map.put("parameters",params );
		map.put("parametersToString",paramStr.substring(0,paramStr.length()-1));
		map.put("array", paramArray);
		map.put("int", paramInt);
		return map;
	}
	
	

	private static Map randomMap() {
		 Random random=new Random();
		 int int1 = random.nextInt(10);
		 int int2 = random.nextInt(10);
		 int int3 = random.nextInt(10);
		 Map<List<Integer>, Integer> map =  (Map<List<Integer>, Integer>) new HashMap();
		 map.put(new ArrayList<Integer>(Arrays.asList(int1, int2)), int3);
		
		 HashMap results = new HashMap();
		 results.put("map", map);
		 results.put("array",int1+","+int2);
		 results.put("int",int3);
		 
		 return results;

	}



	private static Node randomNode() {
		// TODO Auto-generated method stub
		
		Node node = new Node(randomString());
		
		 Random random=new Random();
		int randomNumber = random.nextInt(10);
		if(randomNumber>=5) {
			//return a new node with current node as successors
			node = new Node(randomString(),new ArrayList<Node>(Arrays.asList(node)));
				
		}	
		return node;
	}



	private static ArrayList<Integer> uniqueIntegerList(ArrayList list) {
		 Set<Integer> set = new  HashSet<Integer>(); 
         ArrayList<Integer> newList = new  ArrayList<Integer>(); 
         set.addAll(list);
         newList.addAll(set);
       
		return newList;
	}


	private static int[] uniqueArray(int[] array) {
		Integer[] integerArr = getDistinct(array);
		int[] uniqueArray = new int[integerArr.length];
		uniqueArray= Arrays.stream(integerArr).mapToInt(Integer::valueOf).toArray();
	     return uniqueArray;
	}

	static Integer[] getDistinct(int num[]) {
        List<Integer> list = new java.util.ArrayList<Integer>();
        for (int i = 0; i < num.length; i++) {
            if (!list.contains(num[i])) {
                list.add(num[i]); 
            }
        }
        return list.toArray(new Integer[0]);  
	}

	private static String strArrayToString(ArrayList array) {
		String str = " ";
		for(int i =0;i<array.size();i++) {
			if(array.get(i) instanceof Double) {
				str+= array.get(i)+",";
			}
			else {
				str+="\""+array.get(i)+"\""+",";
			} 
		}
		return str.substring(0,str.length()-1);
	}


	private static ArrayList getRandomStringList() {
		String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	   ArrayList<String> stringList= new  ArrayList<String>();
	   Random random=new Random();
	   int arraySize = random.nextInt(5)+1;
	   for(int j=0;j<arraySize;j++) {
	   StringBuffer sb=new StringBuffer();
	   int charNum = random.nextInt(5)+1;
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
	     int strSize = random.nextInt(10)+1;
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
	
	private static ArrayList<Object> getTokenList() {		
		String operator="+-*/";
		 Random random=new Random();
		 int num = random.nextInt(7)+2;
   		ArrayList<Object> arrayList = new ArrayList<Object>();
		for(int i=0;i<num;i++) {
			if(Math.random()>0.6) {
				arrayList.add(operator.charAt(random.nextInt(4))+"");
			}else {
				arrayList.add(Double.parseDouble(df.format(random.nextDouble())));
			}
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
