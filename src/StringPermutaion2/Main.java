package StringPermutaion2;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		stringPermutaion("abcd");
		
		
		
	}
	
	public static void stringPermutaion(String s){
		
		ArrayList<String> result = new ArrayList<String>();
		
		stringPermutation("",s,result);
		
		System.out.println(result);
	}
	
	public static void stringPermutation(String prefix,String s, ArrayList<String> result){
		int n = s.length();
	
		System.out.println("prefix="+prefix+" "+"s="+s);
		
		if(n == 0){
			System.out.println(prefix);
			
			result.add(prefix);
			
			
		}
		else{
			for(int i=0;i<n;i++){
				stringPermutation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1,n), result);
			}
		}
		
	}
}
