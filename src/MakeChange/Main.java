package MakeChange;

public class Main {
	public static void main(String [] args){
		System.out.println(makeChange(12));
	}
	
	public static int makeChange(int change){
		return makeChange(change,25);
	}
	
	public static int makeChange(int n, int denom){
		
		System.out.println("call the function("+n+","+denom+")");
		
		int next_denom = 0;
		
		switch(denom){
		
		case 25:
			next_denom = 10;
			break;
		case 10:
			next_denom = 5;
			break;
		case 5:
			next_denom = 1;
			break;
		case 1:
			return 1;
		}
		
		int ways = 0;
		
		for(int i=0;i*denom<n;i++){
			
			System.out.println(i+"*"+denom);
			
			ways = ways + makeChange(n-i*denom,next_denom);
			
//			System.out.println("ways="+ways);
		}
		
		return ways;
	}
}
