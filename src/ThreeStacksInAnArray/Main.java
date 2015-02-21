package ThreeStacksInAnArray;

public class Main {
	
	public static void main(String [] args){
		
		TheWholeStack wholeStack = new TheWholeStack();
		
		for(int i=1;i<11;i++){
			wholeStack.push(0, i);
		}
		
		for(int j=11;j<21;j++){
			wholeStack.push(1, j);
		}
		
		for(int k=21;k<31;k++){
			wholeStack.push(2, k);
		}
		
		System.out.println("***********");
		
		wholeStack.show(0);
		
		System.out.println("***********");
		
		wholeStack.show(1);
		
		System.out.println("***********");
		
		wholeStack.show(2);
		
		System.out.println("***********");
		
		
	}
}
