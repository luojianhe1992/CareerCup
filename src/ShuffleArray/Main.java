package ShuffleArray;

import java.util.Random;

public class Main {
	public static void main(String [] args){
		
		int[] array = new int [100];
		
		for(int i=0;i < array.length;i++){
			array[i] = i+1;
		}
		
		arrayShuffle(array);
		
		for(int i = 0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		int sum = 0;
		
		for(int i=0;i<array.length;i++){
			sum = sum + array[i];
		}
		
		System.out.println("sum =" + sum);
	}
	
	public static int [] arrayShuffle(int[] array){
		
		Random random = new Random();
		
//		System.out.println(random.nextInt(100));
		
		int len = array.length;
		
		for(int i=0;i<len;i++){
			int ran = random.nextInt(len) - 1;
			
			int temp;
			temp = array[i];
			array[i] = array[ran];
			array[ran] = temp;
			
		}
		
		return array;
		
		
	}
}
