package SinglyLinkedList;

public class findTheKthLastElement {
	public static int findTheKthLastElement(int k, ListDefinedByMyself list){
		if(k > list.getLength()){
			System.out.println("function error");
			return -1;
		}
		
		Node tempHead = list.getHead();
		
		int index = list.getLength() - k;
		
		System.out.println("index=" + index);
		
		int count = 0;
		
		while(true){
			if(index == count){
				break;
			}
			
			tempHead = tempHead.getNext();
			count++;
			
		}
		
		int value;
		value = tempHead.getValue();
		
		return value;
		
	}
}
