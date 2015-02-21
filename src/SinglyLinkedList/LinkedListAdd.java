package SinglyLinkedList;

public class LinkedListAdd {
	public static void main(String[] args){
		
		Node head1 = new Node(7);
		Node head2 = new Node(5);
		
		ListDefinedByMyself list1 = new ListDefinedByMyself(head1);
		list1.insert(0, 2);
		list1.insert(1, 3);
		list1.insert(2, 4);
		
		ListDefinedByMyself list2 = new ListDefinedByMyself(head2);
		
		list2.insert(0, 6);
		list2.insert(1, 7);
		list2.insert(2, 8);
		list2.insert(3, 9);
		list2.insert(4, 3);
		
		System.out.println("********************");
		
		
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		ListDefinedByMyself result = linkedListAdd(list1, list2);
		
		System.out.println(result);
		
	}
	
	public static ListDefinedByMyself linkedListAdd (ListDefinedByMyself list1, ListDefinedByMyself list2){
		
		int carrier = 0;
		int value = 0;
		int digit = 0;
		
		Node pointer1 = list1.getHead();
		Node pointer2 = list2.getHead();
		
		value = pointer1.getValue() + pointer2.getValue();
		digit = value%10;
		carrier = value >= 10 ? 1:0;
		
		Node head = new Node(digit);
		
		ListDefinedByMyself result = new ListDefinedByMyself(head);
		
		Node last = head;
		
		//pointer move
		pointer1 = pointer1.getNext();
		pointer2 = pointer2.getNext();
		
		//initialization
		boolean stop1 = false;
		boolean stop2 = false;
		
		//reset the value
		value = 0;
		
		while(pointer1!=null || pointer2!=null){
			
			//adding
			if(pointer1!=null){
				value = value + pointer1.getValue();
			}
			
			if(pointer2!=null){
				value = value + pointer2.getValue();
			}
			
			value = value + carrier;
			digit = value%10;
			carrier = value >= 10 ? 1:0;
			
			Node current = new Node(digit);
			
			//pointer mover
			last.setNext(current);
			
			//pointer move
			last = last.getNext();
			
			//pointer move
			if(!stop1){
				pointer1 = pointer1.getNext();
			}
			
			//pointer move
			if(!stop2){
				pointer2 = pointer2.getNext();
			}
			
			if(pointer1==null){
				stop1 = true;
			}
			if(pointer2==null){
				stop2 = true;
			}
			
			//reset the value
			value = 0;
			
		}
		
		if(carrier>0){
			Node current = new Node(1);
			
			result.addNodeAfter(current);
			
		}
		
		
		return result;
		
	}
}
