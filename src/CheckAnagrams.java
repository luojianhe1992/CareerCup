import java.util.Arrays;


public class CheckAnagrams {
	
	public static boolean anagrams(String s, String t){
		if(s.length()!=t.length()){
			return false;
		}
		
		int[] letters = new int[256];
		for(int i=0;i<letters.length;i++){
			letters[i]=0;
		}
		
		int num_unique_chars=0;
		int num_completed_t=0;
		
		char[] s_array = s.toCharArray();
		
		for(char c : s_array){
			
			//
			if(letters[c]==0){
				num_unique_chars++;
			}
			letters[c]++;
		}
		
		//
		for(int i=0;i<t.length();i++){
			int c=(int) t.charAt(i);
			if(letters[c]==0){
				return false;
			}
			
			//have check one letter
			--letters[c];
			
			//
			if(letters[c]==0){
				num_completed_t++;
				if(num_completed_t==num_unique_chars){
					return i==t.length()-1;
				}
			}
		}
		return false;
		
	}
	
	public static void main(String[] args){
		
		String s="abcde";
		
		String t="edcba";
		
		System.out.println(anagrams(s, t));
		
		String t2="abdde";
		
		System.out.println(anagrams(s, t2));
		
		System.out.println("********************");
		
		String s3 = "aasdfghjkl";
		
		String t3 = "lkjhgfdsaa";
		
		System.out.println(anagrams2(s3,t3));
		
		System.out.println("********************");
		
	}
	
	public static boolean anagrams2 (String s,String t){
		char[] s_array = s.toCharArray();
		char[] t_array = t.toCharArray();
		
		if(s_array.length!=t_array.length){
			return false;
		}
		
		Arrays.sort(s_array);
		Arrays.sort(t_array);
		
		for(int i=0;i<s_array.length;i++){
			System.out.print(s_array[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<t_array.length;i++){
			System.out.print(t_array[i]+" ");
		}
		
		for(int i=0;i<s_array.length;i++){
			if(s_array[i]!=t_array[i]){
				return false;
			}
		}
		
		return true;
		
	}
}
