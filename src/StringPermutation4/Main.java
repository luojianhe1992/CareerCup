package StringPermutation4;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		System.out.println("********************");
		
		ArrayList<Character> result = new ArrayList<Character>();
		
		ArrayList<Character> newResult = new ArrayList<Character>();
		
		newResult = getPermutation("abcd".toCharArray(),new int[]{1,1,1,2},result);
		
		System.out.println("********************");
		
		System.out.println(newResult);
		
		System.out.println("num="+num);
	}
	
	
	public static int num = 0;
	
	public static ArrayList<Character> getPermutation(char[] chars, int [] counts,ArrayList<Character> result){
		
		boolean stopped = true;
		
		for(int i=0;i<counts.length;i++){
			
			if(counts[i]<=0){
				continue;
			}
			
			
			
			//
			int [] clone = counts.clone();
			
			//StringBuilder builder = new StringBuilder(sb.toString());
			
			ArrayList<Character> newResult = new ArrayList<Character>();
			
			clone[i]--;
			
			newResult.add(chars[i]);
			
			//builder.append(chars[i]);
			
			//recursion
			result.addAll(getPermutation(chars,clone,newResult));
			
			stopped = false;
			
		}
		
		if(stopped){
			
			num = num + 1;
			
			return result;
			
			
			
		}
		
		return result;
		
	}
}
