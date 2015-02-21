package Exception;

public class Main {
	public static void main(String [] args){
	
		int [] array = new int []{2,3,5,3,21,25,11,63,755,2,8};
		
		int max = findMax(array);
		
		System.out.println(max);
		
		int [] array2 = null;
		
		findMax(array2);
		
	}
	
	public static int findMax(int []array){
		int max;
		
		//the try and catch to resolve the exception situation
		try{
			max = array[0];
		
			for(int i=1;i<array.length;i++){
				if(array[i] > max){
				max = array[i];
				}
			}
		
			return max;
			
		}
		catch(Exception e){
			System.out.println("there is an exception.");
		}
		
		return -1;
		
	}
	
}
