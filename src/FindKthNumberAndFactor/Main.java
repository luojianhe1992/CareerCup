package FindKthNumberAndFactor;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String [] args){
		System.out.println(getKthMagicNumber(10));
		
		System.out.println("************");
		
	}
	
	//method 1
	public static int getKthMagicNumber(int k){
		if(k<=0){
			return 0;
		}
		
		int var = 1;
		
		Queue<Integer> q3 = new LinkedList<Integer>();
		Queue<Integer> q5 = new LinkedList<Integer>();
		Queue<Integer> q7 = new LinkedList<Integer>();
		
		q3.add(3);
		q5.add(5);
		q7.add(7);
		
		for(k--;k>0;k--){
			
			System.out.println("k="+k);
			
			var = Math.min(q3.peek().intValue(), Math.min(q5.peek().intValue(), q7.peek().intValue()));
			
			System.out.println("var="+var);
			
			System.out.println("q3.peek="+q3.peek()+" "+"q5.peek="+q5.peek()+" "+"q7.peek="+q7.peek());
			
			System.out.println("q3="+q3);
			System.out.println("q5="+q5);
			System.out.println("q7="+q7);
			
			//using queue to implement
			if(var == q7.peek()){
				q7.remove();
			}
			else{
				if(var == q5.peek()){
					q5.remove();
				}
				else{
					q3.remove();
					q3.add(var * 3);
				}
				q5.add(var * 5);
			}
			q7.add(var * 7);
			
			System.out.println("q3="+q3);
			System.out.println("q5="+q5);
			System.out.println("q7="+q7);
			
		}
		
		return var;
		
	}
	
	
	/*
	
	public static int getMagicNumber2(int k){
		if(k<=0){
			return 0;
		}
		
		int var = 1;
		
		Queue<Integer> q3 = new LinkedList<Integer>();
		Queue<Integer> q5 = new LinkedList<Integer>();
		Queue<Integer> q7 = new LinkedList<Integer>();
		
		q3.add(3);
		q5.add(5);
		q7.add(7);
		
		while(k>1){
			
			System.out.println("q3="+q3);
			System.out.println("q5="+q5);
			System.out.println("q7="+q7);
			
			var = Math.min(q3.peek(), Math.min(q5.peek(), q7.peek()));
			
			if(var == q3.peek()){
				q3.add(q3.peek()*3);
				q3.remove();
			}
			else if(var == q5.peek()){
				q5.add(q5.peek()*5);
				q5.remove();
			}
			else{
				q7.add(q7.peek()*7);
				q5.remove();
			}
			
			k--;
		}
		
		return var;
	}
	
	*/
}
