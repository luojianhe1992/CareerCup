package FindSubset;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		ArrayList<Integer> set = new ArrayList<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		set.add(6);
		
		ArrayList<ArrayList<Integer>> allSubSet = new ArrayList<ArrayList<Integer>>();
		
		allSubSet = getSubSets(set, 0);
		
		for(ArrayList<Integer> sets:allSubSet){
			System.out.println(sets);
			System.out.println("**************");
		}
	}
	
	public static ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set , int index){
		ArrayList<ArrayList<Integer>> allSubSets;
		
		System.out.println("&&&&&&&&&&&&&&&&&");
		
		//the end of recursion
		if(set.size()==index){
			allSubSets = new ArrayList<ArrayList<Integer>>();
			allSubSets.add(new ArrayList<Integer>());//empty set
		}
		else{
			
			//use recursion
			allSubSets = getSubSets(set, index+1);
			
			System.out.println("allSubsets is:"+allSubSets);
			
			int item = set.get(index);
			
			System.out.println("item is:"+item);
			
			ArrayList<ArrayList<Integer>> moreSubSets = new ArrayList<ArrayList<Integer>>();
			
			
			for(ArrayList<Integer> subSet:allSubSets){
				ArrayList<Integer> newSubSet = new ArrayList<Integer>();
				newSubSet.addAll(subSet);
				newSubSet.add(item);
				
				System.out.println("newSubSet is:"+newSubSet);
				
				moreSubSets.add(newSubSet);
			}
			
			System.out.println("moreSubSets is:"+moreSubSets);
			
			allSubSets.addAll(moreSubSets);
			
			System.out.println("allSubSets is:"+allSubSets);
		}
		
		System.out.println("&&&&&&&&&&&&&&&&&");
		
		return allSubSets;
		
		
	}
}
