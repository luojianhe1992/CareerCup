package SinglyLinkedList;

public class Main {
	public static void main(String [] args){
		Node first = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		ListDefinedByMyself list = new ListDefinedByMyself(first);
		
		System.out.println("length="+list.getLength());
		
		list.insert(0, 2);
		
		System.out.println("length="+list.getLength());
		
		list.insert(1, 3);
		
		System.out.println("length="+list.getLength());
		
		System.out.println("**************");
		
		System.out.println(first.getValue());
		
		System.out.println(first.getNext().getValue());
		
		System.out.println(first.getNext().getNext().getValue());
		
		int value;
		
		value = list.remove(0);
		
		System.out.println("******************");
		
		System.out.println(list.getLength());
		
		System.out.println(list.getHead().getValue());
		
		System.out.println(list.getHead().getNext().getValue());
		
		System.out.println("*******************");
		
		list.addNode(0, second);
		
		System.out.println(list.getHead().getValue());
		
		System.out.println(list.getHead().getNext().getValue());
		
		System.out.println(list.getHead().getNext().getNext().getValue());
		
		System.out.println("*******************");
		
		int findOutResult = findTheKthLastElement.findTheKthLastElement(1, list);
		
		System.out.println(findOutResult);
	}
}
