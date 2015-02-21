package SortStackWithAnotherStack;

import java.util.Stack;

public class Main {
	public static void main(String [] args){
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(2);
		stack.push(5);
		stack.push(12);
		stack.push(3);
		stack.push(1);
		stack.push(7);
		
		System.out.println(stack);

		sortStack(stack);
		
		System.out.println(stack);
		
	}
	
	public static void sortStack(Stack<Integer> stack){
		Stack<Integer> temp = new Stack<Integer>();
		
		int tempValue;
		
		
		
		while(!stack.isEmpty()){
			
			/*
			System.out.println("stack = "+stack);
			System.out.println("temp = "+temp);
			*/
			
			tempValue = stack.pop();
			
			if(temp.isEmpty()){
				temp.push(tempValue);
				continue;
			}
			
			if(tempValue > temp.peek()){
				while(!temp.isEmpty()){
					
					if(tempValue < temp.peek()){
						break;
					}
					
					stack.push(temp.pop());
				}
				
			}
			
			temp.push(tempValue);
			
		}
		
		
		while(!temp.isEmpty()){
			stack.push(temp.pop());
		}
		
		System.out.println("success");
	}
	
}
