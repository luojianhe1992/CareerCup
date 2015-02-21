package FibonacciNumber;

public class Main {
	public static void main(String [] args){
		
		for(int i=0;i<30;i++){
			System.out.print(fibo_recursion(i)+"\t");
		}
		
		System.out.println();
		
		System.out.println("*************************");
		
		for(int i=0;i<30;i++){
			System.out.print(fibo_iteration(i)+"\t");
		}
		
		System.out.println();
	}
	
	//using recursion
	public static int fibo_recursion(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		else if(n >= 2){
			return fibo_recursion(n-2) + fibo_recursion(n-1);
		}
		else{
			return -1;
		}
	}
	
	//using iteration
	public static int fibo_iteration(int n){
		if(n < 0){
			return -1;
		}
		
		if (n == 0){
			return 0;
		}
		
		if(n == 1){
			return 1;
		}
		
		int a = 0;
		int b = 1;
		
		for (int i = 1;i < n; i++){
			int c = a + b;
			a = b;
			b = c;
		}
		
		return b;
	}
}
