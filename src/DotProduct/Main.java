package DotProduct;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++){
			list1.add(i);
		}
		
		for(int i=10;i<20;i++){
			list2.add(i);
		}
		
		ArrayList<Integer> result = dotProduct(list1, list2);
		
		System.out.println(list1);
		
		System.out.println(list2);
		
		System.out.println(result);
		
		System.out.println("***********************");
		
		
	}
	
	public static ArrayList<Integer> dotProduct(ArrayList<Integer> list1, ArrayList<Integer> list2){
		
		if(list1.size()!=list2.size()){
			System.out.println("error");
			return null;
		}
		
		
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		int len = list1.size();
		
		for(int i=0;i<len;i++){
			result.add(list1.get(i)*list2.get(i));
		}
		
		return result;
		
	}
	
	
}
