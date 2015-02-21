import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class RemoveDuplicateInLinkedList {
	
	
	public static LinkedList removeDupInteger(LinkedList<Integer> ledlist){
		
		List<Integer> remove = new ArrayList<Integer>();
		
		for(int i=1;i<ledlist.size();i++){
			
			for(int j=0;j<i;j++){
				if(ledlist.get(j)==ledlist.get(i)){
					remove.add(i);
				}
			}
		}
		
		System.out.println(remove);
		
		for(int i=0;i<remove.size();i++){
			ledlist.remove((int)remove.get(i));
		}
		
		
		
		return ledlist;
	}
	
	
	public static LinkedList removeDupChar(LinkedList<Character> ledlist){
		
		int [] letters = new int[256];
		
		for(int i=0;i<256;i++){
			letters[i] = 0;
		}
		
		for(int i=0;i<ledlist.size();i++){
			letters[(int)ledlist.get(i)]++;
			
			//there are more than one letter in the linkedlist
			if(letters[ledlist.get(i)]>1){
				ledlist.remove(i);
			}
		}
		
		return ledlist;
		
	}
	
	public static void main(String[] args){
		LinkedList<Character> ledlist =  new LinkedList<Character>();
		
		ledlist.add('a');
		ledlist.add('b');
		ledlist.add('c');
		ledlist.add('d');
		ledlist.add('b');
		ledlist.add('e');
		ledlist.add('a');
		ledlist.add('f');
		
		
		System.out.println(ledlist);
		
		List<Character> ledlist2 = removeDupChar(ledlist);
		
		System.out.println(ledlist2);
		
		LinkedList<Integer> ledlist3 = new LinkedList<Integer>();
		
		ledlist3.add(2);
		ledlist3.add(12);
		ledlist3.add(22);
		ledlist3.add(42);
		ledlist3.add(112);
		ledlist3.add(1);
		ledlist3.add(3);
		ledlist3.add(2);
		
		System.out.println(ledlist3);
		
		LinkedList<Integer> ledlist4 = removeDupInteger(ledlist3);
		
		System.out.println(ledlist4);
		
	}
}
