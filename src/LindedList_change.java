
public class LindedList_change {
	LinkedListNode firstNode;

	public LindedList_change() {
		super();
	}

	public LindedList_change(LinkedListNode firstNode) {
		super();
		this.firstNode = firstNode;
	}

	public LinkedListNode getFirstNode() {
		return firstNode;
	}

	public void setFirstNode(LinkedListNode firstNode) {
		this.firstNode = firstNode;
	}
	
	public void display(){
		
		LinkedListNode temp = new LinkedListNode(firstNode.data, firstNode.next);
		
		do {
			System.out.print(temp.data+" ");
			
			temp = temp.next;
		} while(temp.next!=null);
		
		System.out.print(temp.data+"");
		
		System.out.println();
		
		
	}
	
	public void removeTheNthNode(int n){	
		
		LinkedListNode temp = new LinkedListNode(firstNode.data, firstNode.next);
		
		int length = 1;
		
		
		
		while(temp.next!=null){
			length++;
			
			temp = temp.next;
		}
		
		//back to the first
		temp = new LinkedListNode(firstNode.data, firstNode.next);
		
		int num = 1;
		
		while(num<length-n){
			temp = temp.next;
			num++;
		}
		
		LinkedListNode tempNext = new LinkedListNode(temp.next.next.data, temp.next.next.next);
		
		temp.next.setNext(null);
		
		temp.setNext(tempNext);
		
		
		
		
	}
	
}
