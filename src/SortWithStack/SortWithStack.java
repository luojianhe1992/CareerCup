package SortWithStack;

import java.util.Stack;

public class SortWithStack {
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> newStack = new Stack<Integer>();
		
		int temp;
		
		while(!s.isEmpty()){
			temp = s.pop();
			
			while(!newStack.isEmpty()&&newStack.peek()>temp){
				s.push(newStack.pop());
			}
			
			newStack.push(temp);
		}
		
		return newStack;
		
	}
	
	public static void main(String [] args){
		
		//use two stack
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(1);
		s.push(12);
		s.push(1);
		s.push(12);
		s.push(21);
		s.push(1);
		s.push(31);
		s.push(1);
		s.push(51);
		
		Stack<Integer> newStack = new Stack<Integer>();
		
		newStack = sort(s);
		
		//until the original stack pop all the element
		while(!newStack.isEmpty()){
			System.out.print(newStack.pop()+" ");
		}
		
		System.out.println();
		
		System.out.println("**************");
		
	}

}
