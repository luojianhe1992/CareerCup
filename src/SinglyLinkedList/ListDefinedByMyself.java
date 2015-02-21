package SinglyLinkedList;

public class ListDefinedByMyself {
	
	Node head;
	int length = 0;
	
	
	
	public ListDefinedByMyself() {
		super();
	}

	

	public ListDefinedByMyself(Node head) {
		super();
		this.head = head;
		length++;
	}



	public ListDefinedByMyself(Node head, int length) {
		super();
		this.head = head;
		this.length = length;
	}


	public Node getHead() {
		return head;
	}


	public void setHead(Node head) {
		this.head = head;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}
	
	public void insert(int index, int value){
		
		Node tempHead = head;
		int count = 0;
		
		if(index>length){
			System.out.println("insert error");
		}
		
		while(true){
			if(count == index){
				break;
			}
			
			tempHead = tempHead.getNext();
			count++;
		}
		
		Node insertNode = new Node(value);
		Node nextNode = tempHead.getNext();
		tempHead.setNext(insertNode);
		insertNode.setNext(nextNode);
		
		this.length++;
		
		System.out.println("insert success");
		
	}
	
	public int remove(int index){
		
		int value;
		
		if(index == 0){
			value = head.getValue();
			head = head.getNext();
			System.out.println("remove success");
			return value;
		}
		
		if(index < 0){
			System.out.println("remove error");
			
			return -1;
		}
		
		if(index > length){
			System.out.println("remove error");
			
			return -1;
		}
		
		
		Node previous = head;
		Node current = head.getNext();
		
		int count = 1;
		
		while(true){
			if(count == index){
				break;
			}
			
			count++;
			
			previous = current;
			current = current.getNext();
		}
		
		value = current.getValue();
		
		previous.setNext(current.getNext());
		
		length--;
		
		System.out.println("remove success");
		
		return value;
		
	}
	
	public void addNode(int index, Node node){
		if(index < 0){
			System.out.println("addNode error");
			return;
		}
		
		if(index == 0){
			node.setNext(head);
			head = node;
			System.out.println("addNode success");
			return;
		}
		
		Node tempHead = head;
		
		int count = 0;
		
		while(true){
			if(count == index){
				break;
			}
			
			tempHead = tempHead.getNext();
		}
		
		node.setNext(tempHead.getNext());
		tempHead.setNext(node);
		
		System.out.println("addNode success");
		
	}
	
	public void addNodeAfter(Node node){
		if(length == 0){
			head = node;
		}
		
		Node pointer = head;
		
		while(pointer.getNext() != null){
			
			pointer = pointer.getNext();
			
		}
		
		pointer.setNext(node);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
//		System.out.println("invoke the toString function");
		
		StringBuilder sb = new StringBuilder();
		
		Node pointer = head;
		
		while(pointer.getNext() != null){
			
			sb.append(pointer.getValue());
			
			pointer = pointer.getNext();
		}
		
		sb.append(pointer.getValue());
		
		return sb.toString();
	}
	
}
