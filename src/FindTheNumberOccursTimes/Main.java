package FindTheNumberOccursTimes;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
	public static void main(String [] args){
		int [] array = new int[]{0,1,0,1,22,22,22,22,22,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33};
		
		int result = findNumberOccursTimes(array);
		
		
		System.out.println(result);
		
		System.out.println("*******************");
		
		int result2;
		
		result2 = findNumberOccursTimes2(array);
		
		System.out.println("result2 =" + result2);
		
	}
	
	public static int findNumberOccursTimes(int[] array){
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		
		for(int i=0;i<array.length;i++){
			hashSet.add(array[i]);
		}
		
		int [] num = new int [hashSet.size()];
		int [] count = new int [hashSet.size()];
		
		int index = 0;
		
		for(int i : hashSet){
			num[index] = i;
			index++;
		}
		
		for(int i=0;i<array.length;i++){
			
			for(int j=0;j<hashSet.size();j++){
				if(array[i] == num[j]){
					count [j]++;
				}
			}
			
		}
		
		int check = array.length/2;
		
		for(int i=0;i<count.length;i++){
			if(count[i] > check){
				return num[i];
			}
		}
		
		return - 1;
		
	}
	
	public static int findNumberOccursTimes2(int []array){
		
		//firstly, we sort the array
		Arrays.sort(array);
		
		//initialization
		int count = 1;
		
		//initialization
		int last = array[0];
		
		for(int i=1; i < array.length;i++){
			if(array[i] == last){
				count++;
				if(count>(array.length/2)){
					return array[i];
				}
			}
			else{
				count = 1;
				last = array[i];
			}
		}
		
		return -1;
		
		
	}
	
}
