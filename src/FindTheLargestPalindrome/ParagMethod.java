package FindTheLargestPalindrome;

public class ParagMethod {
	public static void main(String [] args){
		
		findTheLargestPalindrome("aabaabaa");
		
	}
	
	public static void findTheLargestPalindrome(String str){
		
		char [] stringArray = str.toCharArray();
		
		int len = 2 * stringArray.length - 1;
		
		char[] newArray = new char[len];
		
		for(int i=0;i<newArray.length;i++){
			newArray[i] = ' ';
		}
		
		newArray[0] = stringArray[0];
		
		for(int i=1;i<stringArray.length;i++){
			newArray[2*i] = stringArray[i];
		}
		
		for(int i=0;i<stringArray.length;i++){
			System.out.print(stringArray[i]);
		}
		
		System.out.println();
		
		for(int i=0;i<newArray.length;i++){
			System.out.print(newArray[i]);
		}
		
		System.out.println();
		
		System.out.println("len1="+stringArray.length);
		System.out.println("len2="+newArray.length);
		
		int max = 0;
		
		for(int i=0;i<newArray.length;i++){
			
			int length = 0;
			int pointer = 0;
			
			if(newArray[i]!=' '){
				length++;
			}
			
			while(true){
				
				System.out.println("i="+i+" "+"pointer="+pointer+" "+"length="+length);

				
				System.out.println("***************");
				
				//to check if the array is out of bound
				if((i - pointer) < 0 || (i + pointer) >= newArray.length){
					break;
				}
				
				//do not count the first time
				if(pointer!=0){
					
					//to check if palindrome
					if(newArray[i - pointer] == newArray[i + pointer] && newArray[i - pointer]!=' '){
						length = length + 2;
						
						System.out.println("pointer="+pointer);
						
						System.out.println("length="+length);
						
					}
				}
				
				
				//
				if(newArray[i - pointer] != newArray[i + pointer]){
					break;
				}
				
				pointer++;
				
				System.out.println("i="+i+" "+"pointer="+pointer+" "+"length="+length);

			}
			
			System.out.println("length="+length);
			
			if(max < length){
				max = length;
			}
			
		}
		
		System.out.println(max);
		
	}
}
