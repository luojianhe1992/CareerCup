package OperatorImplement;

public class Main {
	public static void main(String [] args){
		System.out.println("5-3="+minusOperator(5,3));
		
		System.out.println("5*3="+timesOperator(5,3));
		
		System.out.println("1/3="+divideOperator(1,3));
		
	}
	
	public static int fnNegate(int a){
		int neg = 0;
		int d = a < 0? 1 : -1;
		
		while(a!=0){
			neg = neg + d;
			a = a + d;
		}
		
		return neg;
	}
	
	//replace minus operator with plus
	public static int minusOperator(int a, int b){
		return a + fnNegate(b);
	}
	
	public static int timesOperator(int a, int b){
		
		int sum = 0;
		
		for(int i=0;i<b;i++){
			sum = sum + a;
		}
		
		return sum;
	}
	
	public static int divideOperator(int a, int b){
		
		int times = 0;
		while(a>0){
			a = minusOperator(a, b);
			times = times + 1;
			
		}
		
		return times - 1;
	}
}
