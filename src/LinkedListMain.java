
public class LinkedListMain {
	public static void main(String [] args){
		
		LinkedListNode node1 = new LinkedListNode(1);
		LinkedListNode node2 = new LinkedListNode(2);
		LinkedListNode node3 = new LinkedListNode(3);
		LinkedListNode node4 = new LinkedListNode(4);
		LinkedListNode node5 = new LinkedListNode(5);
		LinkedListNode node6 = new LinkedListNode(6);
		LinkedListNode node7 = new LinkedListNode(7);
		LinkedListNode node8 = new LinkedListNode(8);
		LinkedListNode node9 = new LinkedListNode(9);
		LinkedListNode node10 = new LinkedListNode(10);
		
		LindedList_change linkedlist = new LindedList_change(node1);
		
		node1.setNext(node2);
		
		node2.setNext(node3);
		
		node3.setNext(node4);
		
		node4.setNext(node5);
		
		node5.setNext(node6);
		
		node6.setNext(node7);
		
		node7.setNext(node8);
		
		node8.setNext(node9);

		node9.setNext(node10);
		
		
		System.out.println("*************");
		
		linkedlist.display();
		
		linkedlist.display();
		
		System.out.println("*************");
		
		linkedlist.removeTheNthNode(7);
		
		linkedlist.display();
		
		System.out.println("*************");
		
		
		
	}
}
