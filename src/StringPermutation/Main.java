package StringPermutation;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		
	}
	
	public static ArrayList<char[]> getPermutation(char a, char b, char c, int m, int n, int k){
		
		ArrayList<char[]> result = new ArrayList<char[]>();
		
		return result;
		
	}
	
	public static char[] getPermutationArray(char a, char b, char c, int m, int n, int k ,ArrayList<char[]> result){
		
		if(m==0&&n==0&&k==0){
			return null;
		}
		
		addPermutationArray(a, b, c, m, n, k, result);
		
		//recursion
		if(m > 0){
			
			
			char [] newArray = getPermutationArray(a, b, c, m - 1, n, k, result);
			
			return newArray; 
		}
		
		if(n > 0){
			char [] newArray = getPermutationArray(a, b, c, m, n - 1, k, result);
			
			return newArray;
		}
		
		if(k > 0){
			char [] newArray = getPermutationArray(a, b, c, m, n, k - 1, result);
			
			return newArray;
		}
		
	}
	
	//固定的m,n,k，进行字符数组的排列
	public static void addPermutation(char a, char b, char c, int m, int n, int k, ArrayList<char[]> result){
		
		int len = m + n + k;
		
		char[] temp = new char[len];
		
		
 		
		
	}
	
	
	public static int permutation(int m, int n){
		int result = 1;
		
		if(m>n){
			return 0;
		}
		
		for(int i=n;i>=(n - m + 1);i--){
			result = result * i;
		}
		
		return result;
	}
}
