package HanioTowerUsingStack;

import java.util.Stack;

public class Tower {
	int index;
	Stack<Integer> stack;
	
	
	public Tower(int index) {
		super();
		this.index = index;
		stack = new Stack<Integer>();
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public Stack<Integer> getStack() {
		return stack;
	}


	public void setStack(Stack<Integer> stack) {
		this.stack = stack;
	}
	
	//check if the tower is empty
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	//get the top disk from 
	public int getTop(){
		return this.getStack().peek();
	}
	
	//
	public void addDisk(int disk){
		if(!isEmpty()&&disk > this.getStack().peek()){
			System.out.println("error, can no add the disk to this tower");
			return;
		}
		else{
			this.getStack().push(disk);
		}
		
	}
	
	public int removeDisk(){
		if(isEmpty()){
			System.out.println("the tower is empty, can not remove disk from this tower");
			return -1;
		}
		
		int value;
		value = this.getStack().pop();
		
		return value;
		
	}
	
	public boolean moveTopDiskTo(Tower t){
		
		int value;
		value = this.getStack().pop();
		t.addDisk(value);
		
		System.out.println("move disk " + this.getIndex() + "'s " + value + " to disk "+ t.getIndex());
		return true;
	}
	
	public void moveAllDisks(int n, Tower bufferTower, Tower destinationTower){
		
		
		
		//recursion
		if(n > 0){
			moveAllDisks(n - 1, destinationTower, bufferTower);
			
			moveTopDiskTo(destinationTower);
			
			bufferTower.moveAllDisks(n - 1, this , destinationTower);
			
		}
		
		
	}
	
	
}
