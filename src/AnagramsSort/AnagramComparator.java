package AnagramsSort;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
	
	//define a function to sort the String
	public String sortChars(String s){
		char [] content  = s.toCharArray();
		Arrays.sort(content);
		
		return new String(content);
	}
	
	
	//override the compare function in the Comparator
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		
		return sortChars(s1).compareTo(sortChars(s2));		
	}
}
