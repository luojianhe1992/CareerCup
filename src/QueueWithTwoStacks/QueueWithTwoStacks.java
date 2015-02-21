package QueueWithTwoStacks;

import java.util.Stack;

public class QueueWithTwoStacks<T> {
	Stack<T> s1,s2;
	
	public QueueWithTwoStacks(){
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public int size(){
		return s1.size()+s2.size();
	}
	
	//push the stack s1 first
	public void add(T value){
		s1.push(value);
	}
	
	//return the value but not delete
	public T peek(){
		if(!s2.empty()){
			return s2.peek();
		}
		
		while(!s1.empty()){
			s2.push(s1.pop());
		}
		return s2.peek();
	}
	
	//just like the pop in the queue
	public T remove(){
		if(!s2.isEmpty()){
			return s2.pop();
		}
		
		while(!s1.isEmpty()){
			s2.push(s1.pop());
		}
		
		return s2.pop();
	}
}
