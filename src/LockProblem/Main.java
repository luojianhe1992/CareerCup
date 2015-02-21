package LockProblem;

public class Main {
	public static void main(String [] args){
		boolean [] lock = new boolean [101];
		
		for(int i=1;i<101;i++){
			lock[i] = true;
		}
		
		for(int i=1;i<101;i++){
			System.out.print(lock[i]+"\t");
		}
		
		System.out.println();
		
		int temp = 2;
		
		while(temp<101){
			
			lock[temp] = false;
			
			temp = temp + 2;
			
		}
		
		for(int i=1;i<101;i++){
			System.out.print(lock[i]+"\t");
		}
		
		System.out.println();
		
		temp = 3;
		
		while(temp<101){
			
			if(lock[temp] == true){
				lock[temp] = false;
			}
			else
			{
				lock[temp] = true;
			}
			
			temp = temp + 3;
		}
		
		for(int i=1;i<101;i++){
			System.out.print(lock[i]+"\t");
		}
		
		System.out.println();
		
		int counter = 0;
		
		for(int i=1;i<101;i++){
			if(lock[i] == true){
				counter++;
			}
		}
		
		System.out.println("the number is:"+counter);
	}
}
