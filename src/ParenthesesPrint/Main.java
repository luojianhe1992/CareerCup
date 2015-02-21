package ParenthesesPrint;

public class Main {
	public static void main(String [] args){
		printPar(3);
	}
	
	public static void printPar(int count){
		char [] str = new char[count * 2];
		
		printPar(count,count, str, 0);
	}
	
	public static void printPar(int l, int r, char[] str, int count){
		
		System.out.println("call the function("+l+","+r+","+str.toString()+","+count+")");
		
		//there are no more left or there are more right than left
		if(l<0||r<l){
			return;
		}
		
		//all the left and right are used up
		if(l==0&&r==0){
			System.out.println(str);
		}
		else{
			
			//there are some left 
			if(l>0){
				str[count] = '(';
				printPar(l-1, r, str, count+1);
			}
			
			//there are more right remaining
			if(r>l){
				str[count] = ')';
				printPar(l, r-1, str, count+1);
			}
		}
	}
}
