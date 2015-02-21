package DiceSum;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static int num = 0;
	
	public static void main(String [] args){
		
		List<int[]> result = new ArrayList<int []>();
		
		int [] current = new int [6];
		
		getWays(current, 0, 36, result);
		
		System.out.println(result);
		
		for(int i=0;i<result.size();i++){
			for(int j=0;j<result.get(i).length;j++){
				System.out.print(result.get(i)[j]+" ");
			}
			
			System.out.println();
		}
		
		System.out.println("*****************");
		
		System.out.println("the size is:"+result.size());
		
		System.out.println("num="+num);
	}
	
	
	
	public static void getWays(int [] current, int index, int remain,List<int[]> result){
		//对于递归函数的编写，先写开头和结尾，最后编写递归部分。
		
		num++;
		
		for(int i=0;i<current.length;i++){
			System.out.print(current[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("index="+index);
		
		System.out.println("remain="+remain);
		
		System.out.println("result="+result);
		
		//assigning the last one
		if(index == 5){
			if(remain>=1 && remain<=6){
				current [index] = remain;
				result.add(current);
			}
			else{
				
			}
		}
		
		//this way is not complete
		if(index==6&&remain!=0){
			return;
		}
		
		//it is not possible
		if(remain < 5 - index){
			return;
		}
		
		//
		int max = Math.min(6, remain);
		
		for(int c=1;c<=max;c++){
			
			//set up a new array
			int [] newTemp = new int [6];
			
			for(int i=0;i<index;i++){
				newTemp [i] = current[i];
			}
			
			//have arranged the c to the index of the array
			newTemp [index] = c;
			
			getWays(newTemp, index + 1, remain - c, result);
		}
	}
}
