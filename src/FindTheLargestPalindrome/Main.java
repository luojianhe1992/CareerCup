package FindTheLargestPalindrome;

import java.util.ArrayList;

public class Main {
	
	public static void main(String [] args){
		
		String str = "abccbaddabcdeffedcba";
		
		char[] arrayString = str.toCharArray();
		
		int temp = checkPalindrome(1, 10, arrayString);
		
		System.out.println(temp);
		
		System.out.println("**********");
		
		
		System.out.println("abccbaddabcdeffedcba");
		
		System.out.println(findLargestPalindrome("abccbaddabcdeffedcba"));
	
	}
	
	
	public static String findLargestPalindrome(String s){
		
		int len = s.length();
		
		char [] arrayString = s.toCharArray();
		
		ArrayList<Character> result = new ArrayList<Character>();
		
		int max = 0;
		
		for(int i=0;i<arrayString.length-1;i++){
			
			for(int j=i+1;j<=(i+arrayString.length-1)/2;j++){
				int temp = checkPalindrome(i,j,arrayString);
				
				
				if(temp>max){
					max = temp;
					
					result.clear();
					
					for(int m=i;m<=i+temp-1;m++){
						result.add(arrayString[m]);
					}
					
				}
				
			}
			
			
		}
		
		System.out.println(result);
		
		String resultString = "";
		
		for(int m=0;m<result.size();m++){
			resultString = resultString + result.get(m);
		}
		
		return resultString;
	}
	
	public static int checkPalindrome(int i,int j, char[] arrayString){
		
		boolean check1 = true;
		boolean check2 = true;
		
		for(int m=i;m<j;m++){
			if(arrayString[m]!=arrayString[2*j-m]){
				check1 = false;
				
//				System.out.println("1"+arrayString[m]+"!="+arrayString[2*j-m]);
				
			}
		}
		
		if(arrayString.length-1>=2*j-i+1){
			for(int m=i;m<=j;m++){
				if(arrayString[m]!=arrayString[2*j-m+1]){
					check2 = false;
					
//					System.out.println("2"+arrayString[m]+"!="+arrayString[2*j-m+1]);
				}
			}
		}
		else{
			return 0;
		}
		
		if(check1){
			return 2*(j-i) + 1;
		}
		
		if(check2){
			return 2*(j-i+1);
		}
		
		return 0;
	}
}
