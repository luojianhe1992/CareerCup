package SinglyLinkedList;

public class Node {
	int value;
	Node next;
	
	
	
	public Node() {
		super();
	}


	public Node(int value) {
		super();
		this.value = value;
		this.next = null;
	}


	public Node(int value, Node next) {
		super();
		this.value = value;
		this.next = next;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}
	
	
}
