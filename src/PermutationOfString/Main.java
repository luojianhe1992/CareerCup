package PermutationOfString;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		String s = "abcde";
		
		ArrayList<String> permutations = getPerms(s);
		
		System.out.println(permutations);
		
		System.out.println("size:"+permutations.size());
	}
	
	public static ArrayList<String> getPerms(String s){
		
		//use ArrayList<String> to store the result
		ArrayList<String> permutations = new ArrayList<String>();
		
		if(s==null){
			return null;
		}
		
		if(s.length()==0){
			permutations.add("");
			return permutations;
		}
		
		//firstly, choose the first char
		char first = s.charAt(0);
		
		//store the remainder
		String remainder = s.substring(1);
		
		
		//using recursion
		ArrayList<String> words = getPerms(remainder);
		
		//adding the first char to the result of the getPerms(remainder)
		for(String word:words){
			for(int i=0;i<=word.length();i++){
				permutations.add(insertCharAt(word,first,i));
			}
		}
		
		return permutations;
	}
	
	
	public static String insertCharAt(String word, char c, int i){
		String start = word.substring(0, i);
		
		String end = word.substring(i);
		
		String result = "";
		
		result = start + c + end;
		
		return result;
	}
}
