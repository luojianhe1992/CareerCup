package ThreeStacksInAnArray;

public class TheWholeStack {

	int eachStackSize = 300;
	
	int indexUsed = 0;
	
	int [] stackPointer = {-1,-1,-1};
	
	StackNode [] buffer = new StackNode[3*eachStackSize];
	
	public void push(int stackNum, int value){
		
		int lastIndex = stackPointer[stackNum];
		
		stackPointer[stackNum] = indexUsed;
		
		indexUsed++;
		
		//adding the new node to the buffer array
		buffer[stackPointer[stackNum]] = new StackNode(lastIndex, value);
		
		
	}
	
	public int pop(int stackNum){
		
		int value = buffer[stackPointer[stackNum]].value;
		
		int lastIndex = stackPointer[stackNum];
		
		stackPointer[stackNum] = buffer[stackPointer[stackNum]].previous;
		
		buffer[lastIndex] = null;
		
		indexUsed--;
		
		return value;
	}
	
	public int peek(int stackNum){
		
		int value = buffer[stackPointer[stackNum]].value;
		
		return value;
	}
	
	public boolean isEmpty(int stackNum){
		
		return (stackPointer[stackNum]==-1);
	}
	
	public void show(int stackNum){
		
		StackNode temp = new StackNode();
		
		temp.value = buffer[stackPointer[stackNum]].value;
		
		temp.previous = buffer[stackPointer[stackNum]].previous;
		
		while(temp.previous!=-1){
			
			System.out.print(temp.value+" ");
			
			temp = buffer[temp.previous];
		}
		
		System.out.println(temp.value);
		
		System.out.println();
		
	}
	
	//the StackNode class
	class StackNode{
		public int previous;
		public int value;
		public StackNode(int p,int v){
			this.previous = p;
			this.value = v;
		}
		
		public StackNode(){
			
		}
	}
}
