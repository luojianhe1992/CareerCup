package OneStackTwoType;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyStack {
	
	Stack<Cat> catStack; 
	Stack<Dog> dogStack;
	
	int catOrder;
	int dogOrder;
	int order;
	
	public MyStack() {
		super();
		catStack = new Stack<Cat>();
		dogStack = new Stack<Dog>();
		
		catOrder = 0;
		dogOrder = 0;
		order = 0;
	}

	public MyStack(Stack<Cat> catStack, Stack<Dog> dogStack) {
		super();
		this.catStack = catStack;
		this.dogStack = dogStack;
		
		catOrder = 0;
		dogOrder = 0;
		order = 0;
	}
	
	public void myPush(Animal animal){
		if(animal instanceof Cat){
			order++;
			catOrder = order;
			catStack.push((Cat)animal);
		}
		else{
			dogOrder = order;
			dogStack.push((Dog)animal);
		}
	}
	
	//pop from the queue
	public Animal myPop(){
		if(catOrder > dogOrder){
			catOrder--;
			order--;
			return catStack.pop();
		}
		else{
			dogOrder--;
			order--;
			return dogStack.pop();
		}
	}
	
	//pop cat from the queue
	public Cat myPopCat(){
		catOrder--;
		order--;
		return catStack.pop();
	}
	
	//pop dog from the queue
	public Dog myPopDog(){
		dogOrder--;
		order--;
		return dogStack.pop();
	}
}
