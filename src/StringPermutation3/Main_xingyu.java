package StringPermutation3;

public class Main_xingyu {
	
	public static void main(String [] args){
		
		stringPermutation("ab".toCharArray(),new int[]{1,3},new StringBuilder());
	
		System.out.println("num="+num);
	
	}
	
	public static int num = 0;
	
	public static void stringPermutation(char[] chars, int [] counts, StringBuilder sb){
		
		boolean stopped = true;
		
		for(int i=0;i<counts.length;i++){
			if(counts[i]<=0){
				continue;
			}
			
			
			
			//
			int [] clone = counts.clone();
			
			StringBuilder builder = new StringBuilder(sb.toString());
			
			clone[i]--;
			
			builder.append(chars[i]);
			
			//recursion
			stringPermutation(chars,clone,builder);
			
			stopped = false;
			
		}
		
		if(stopped){
			System.out.println(sb);
			
			num = num + 1;
			
		}
		
		
	}
}
