package ExceptionThrow;

public class Main {

	public static void main(String [] args){
		
		ExceptionThrow();
		
	}
	
	public static void ExceptionThrow(){
		
		int [] array = new int [5];
		
		for(int i=0;i<5;i++){
			array[i] = i + 1;
		}
		
		try {
			array[5] = 5;
		} catch (IndexOutOfBoundsException e) {
		    System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		}
		
		
	}
}
