package PermutationRecursion;

import java.util.ArrayList;
import java.util.HashSet;

public class ComString {
	
	static int num = 0;
	static int num2 = 0;
	
	public static void main(String[] args){
		
		ArrayList<String> finalResult = new ArrayList<String>();
		
		finalResult = comString("aba");
		
		System.out.println("num="+num);
		
		System.out.println("*****************************");
		
		System.out.println(finalResult);
		
		System.out.println("num2 = "+num2);
	}
	
	public static ArrayList<String> comString(String s){
		
		ArrayList<String> result = new ArrayList<String>();
		
		System.out.println(s);
		result.add(s);
		num++;
		
		char[] stringArray = s.toCharArray();
		
		int len = s.length();
		
		
		//default value is 0
		int [] p = new int [len];
		
		int i = 1;
		
		while(i<len){
			
			
			//
			if(p[i] < i){
				
				//
				int j = ((i%2) == 0) ? 0:p[i];
				
				//
				swap(stringArray, i, j);
					
				System.out.println(transToString(stringArray));
				result.add(transToString(stringArray));
				num++;
				
				
				//
				p[i]++;
				
				//
				i = 1;
			}
			else{
				
				//
				p[i] = 0;
				//
				i++;
			}
		}
		
		//using HashSet to remove the duplicate
		HashSet<String> hashSet = new HashSet<String>();
		
		for(String str:result){
			hashSet.add(str);
		}
		
		
		ArrayList<String> finalResult = new ArrayList<String>();
		
		for(String str: hashSet){
			finalResult.add(str);
			num2++;
		}
		
		return finalResult;
		
		
		
		
	}
	
	//
	public static void swap(char[] chars, int i, int j){
		char temp = chars[i];
		chars[i] = chars[j];
		chars[j] = temp;
		
	}
	
	//
	public static String transToString(char[] chars){
		StringBuilder sb = new StringBuilder();
		sb.append(chars);
		return sb.toString();
	}
}
