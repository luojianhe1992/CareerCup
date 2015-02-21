package AnagramsSort;

import java.util.Arrays;

public class Main {
	public static void main(String [] args){
		String [] array = new String [5];
		
		array [0] = "jianheluo";
		array [1] = "yingyuyan";
		array [2] = "luojianhe";
		array [3] = "wanyingfu";
		array [4] = "fuwanying";
		
		Arrays.sort(array,new AnagramComparator());
		
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("************");
		
		Arrays.sort(array);
		
		
	}
}
