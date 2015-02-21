package SinglyLinkedList;

import java.util.Stack;

public class ListCheckPalindrome {
	public static void main(String[] args){
		Node head = new Node(1);
		ListDefinedByMyself list = new ListDefinedByMyself(head);
		
		list.insert(0, 2);
		list.insert(1, 3);
		list.insert(2, 4);
		list.insert(3, 4);
		list.insert(4, 3);
		list.insert(5, 2);
		list.insert(6, 1);
//		list.insert(3, 5);
	
		
		System.out.println(list);
		
		System.out.println("****************");
		
		System.out.println("check = "+checkPalindrome(list));
	}
	
	public static boolean checkPalindrome(ListDefinedByMyself list){
		int len = list.getLength();
		int middle = len/2;
		
		Node pointer = list.getHead();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<middle;i++){
			stack.push(pointer.getValue());
			pointer = pointer.getNext();
		}
		
		System.out.println(stack);
		
		boolean check = true;
		
		if(list.getLength()%2 != 0){
			pointer = pointer.getNext();
		}
		
		while(pointer!=null){
			if(pointer.getValue()!=stack.pop()){
				
				check = false;
			
			}
			
			pointer = pointer.getNext();
			
		}
		
		return check;
		
	}
}
