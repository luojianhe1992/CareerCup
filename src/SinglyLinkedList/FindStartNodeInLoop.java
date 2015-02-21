package SinglyLinkedList;

public class FindStartNodeInLoop {
	public static void main(String []args){
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		Node node9 = new Node(9);
		
		//the list contain loop
		ListDefinedByMyself list = new ListDefinedByMyself(node1);
		
		list.addNodeAfter(node2);
		list.addNodeAfter(node3);
		list.addNodeAfter(node4);
		list.addNodeAfter(node5);
		list.addNodeAfter(node6);
		list.addNodeAfter(node7);
		list.addNodeAfter(node8);
		list.addNodeAfter(node9);
		
		node9.setNext(node7);
		
		Node result = new Node();
		
		result = findStartNodeInLoop(list);
		
		System.out.println("result = "+result.getValue());
		
	}
	
	public static Node findStartNodeInLoop(ListDefinedByMyself list){
		
		Node fastPointer = new Node();
		Node slowPointer = new Node();
		
		fastPointer = list.getHead();
		slowPointer = list.getHead();
		
		System.out.println("fastPointer = "+fastPointer.getValue());
		System.out.println("slowPointer = "+slowPointer.getValue());
		
		//fastPointer move 2 steps each time unit
		fastPointer = fastPointer.getNext().getNext();
		
		//slowPointer move 1 step each time unit
		slowPointer = slowPointer.getNext();
		
		
		//first move loop
		while(fastPointer!=slowPointer){
			
			//fastPointer move 2 steps each time unit
			fastPointer = fastPointer.getNext().getNext();
			
			//slowPointer move 1 step each time unit
			slowPointer = slowPointer.getNext();
			
			System.out.println("fastPointer = "+fastPointer.getValue());
			System.out.println("slowPointer = "+slowPointer.getValue());
			
		}
		
		slowPointer = list.getHead();
		
		System.out.println("fastPointer = "+fastPointer.getValue());
		System.out.println("slowPointer = "+slowPointer.getValue());
		
		//second move loop
		while(slowPointer!=fastPointer){
			
			//fastPointer move 1 step each time unit
			fastPointer = fastPointer.getNext();
			
			slowPointer = slowPointer.getNext();
			
			System.out.println("fastPointer = "+fastPointer.getValue());
			System.out.println("slowPointer = "+slowPointer.getValue());
			
		}
		
		return fastPointer;
		
		
	}
}
