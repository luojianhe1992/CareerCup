package PermutationRecursion;

import java.util.ArrayList;

public class StringPermutation {
	public static void main(String [] args){
		ArrayList<char[]> result = new ArrayList<char[]>();
		
		char[] builder = new char[6];
		
		ArrayList<char[]> newResult = new ArrayList<char[]>();
		
		newResult = stringPermutation(new char[]{'a','b','c'},new int[]{1,2,3}, builder, 0, result);
		
		for(char[]r:result){
			System.out.println(r);
		}
		
		System.out.println("********************");
		
		for(char[]r:newResult){
			System.out.println(r);
		}
		
	}
	
	public static ArrayList<char[]> stringPermutation(char[] chars, int[] count,char[] builder, int index, ArrayList<char[]>result){
		
		boolean stopped = true;
		
		for(int i=0;i<count.length;i++){
			
			//
			if(count[i]<=0){
				continue;
			}
			
			//using clone
			int [] clone = count.clone();
			
			//using clone
			char[] sb = builder.clone();
			
			//
			clone[i]--;
			
			//
			sb[index] = chars[i];
			
			//recursion
			stringPermutation(chars, clone, sb, index + 1, result);
			
			//there still have some character left, so the builder can not stop.  
			stopped = false;
			
		}
		
		if(stopped){
			result.add(builder);
		}
		
		return result;
		
	}
	
	
	
	
}
