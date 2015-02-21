package RobotMoving;

public class Main {
	public static void main(String [] args){
		
		int x_end;
		int y_end;
		
		System.out.println(getPath(2,3));
		
		int N = 3;
		
		int result = 0;
		
		for(int i=1;i<=N;i++){
			for(int j=1;j<=N;j++){
				
				x_end = i;
				y_end = j;
				
				System.out.println("from (1,1) to ("+x_end+","+y_end+")"+" paths:"+getPath(x_end,y_end));
				
				result = result + getPath(x_end,y_end);
			}
		}
		
		System.out.println(result);
	}
	
	public static int getPath(int x,int y){
		if(x==1&&y==1){
			return 0;
		}
		
		int result  = 0;
		
		result = jieCheng((x-1)+(y-1))/(jieCheng(x-1)*jieCheng(y-1));
		
		return result;
	}
	
	//
	public static int zuhe (int i, int n){
		
		if(i==0){
			return 1;
		}
		
		int result;
		
		result = jieCheng(n)/(jieCheng(i)*jieCheng(n-i));
		
		return result;
		
	}
	
	//
	public static int jieCheng(int n){
		
		int result = 1;
		
		for(int i=1;i<=n;i++){
			result = result * i;
		}
		
		return result;
	}
}
