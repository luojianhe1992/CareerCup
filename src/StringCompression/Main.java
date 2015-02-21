package StringCompression;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
	public static void main(String [] args){
		System.out.println(stringCompression("abccaa"));
		
		
	}
	
	public static String stringCompression(String str){
		
		System.out.println(str);
		
		//count the number of character
		int [] count = new int [str.length()];
		
		//control to count the number of character
		int order = 0;
		
		//transfer the String into char[]
		char[] stringArray = str.toCharArray();

		//use stack to store the result
		Stack<Character> result = new Stack<Character>();
		
		//push the first character into the stack
		result.push(stringArray[0]);
		
		//count the number
		count[order]++;
		
		//iterate the whole string
		for(int i=1;i<stringArray.length;i++){
			
			//the next character is not identical to the last character
			if(result.peek()!=stringArray[i]){
				result.push(stringArray[i]);
				
				order++;
				count[order]++;
			}
			
			//the next character is identical to the last character
			else{
				count[order]++;
			}
			
			
		}
		
		
		
		
		
		System.out.println("*****************");
		
		System.out.println(result);
		
		ArrayList<Integer> finalCount = new ArrayList<Integer>();
		
		for(int i=0;i<count.length;i++){
				
			System.out.print(count[i] + " ");
				
		}
		
		System.out.println();
		
		for(int i=0;i<count.length;i++){
			if(count[i]!=0){
				System.out.print(count[i] + " ");
				finalCount.add(count[i]);
			}
			
		}
		
		System.out.println();
		
		System.out.println("*****************");
		
		System.out.println();
		
		String returnString = "";
		
		for(int i=0;i<result.size();i++){
			returnString = returnString + result.get(i) + finalCount.get(i);
		}
		
		String returnString2 = "";
		
		/*
		
		System.out.println("*****************");
		
		for(int i=0;i<result.size();i++){
			returnString2 = returnString2 + result.get(i) + count[i];
		}
		
		System.out.println("****"+returnString2+"****");
		
		*/
		
		return returnString;
		
	}
	
	
}
