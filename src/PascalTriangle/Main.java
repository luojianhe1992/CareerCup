package PascalTriangle;

public class Main {
	public static void main(String [] args){
		paintPascalTriangle(10);
		
		System.out.println("******************");
		
		
		System.out.println("("+9+","+3+")="+returnValueOfPascalTriangle(9, 3));
		
		System.out.println("******************");
		
		paintStandardPascalTriangle(5);
		
		System.out.println("******************");
		
		paintStandardPascalTriangle2(6);
	}
	
	
	//define two array, thisRow and lastRow to control the printout of pascal triangle
	public static void paintPascalTriangle(int num){
		if(num == 1){
			System.out.println(1);
			return;
		}
		
		if(num == 2){
			System.out.println(1);
			System.out.println(1+" "+1);
			return;
		}
		
		System.out.println(1);
		System.out.println(1+" "+1);
		
		int [] lastRow = new int [2];
		
		lastRow[0] = 1;
		lastRow[1] = 1;
		
		num = num - 2;
		
		
		
		for(int i=0;i<num;i++){
			
			int [] thisRow = new int [i + 3];
			
			thisRow[0] = 1;
			
			for(int m=1;m<i+2;m++){
				thisRow[m] = lastRow[m - 1] + lastRow[m];
			}
			
			thisRow[i + 2] = 1;
			
			for(int k=0;k<i+3;k++){
				System.out.print(thisRow[k]+"\t");
			}
			
			System.out.println();
			
			lastRow = thisRow;
			
		}
		
		return;
	}
	
	public static int returnValueOfPascalTriangle(int row,int column){
		
		if(row < column){
			return -1;
		}
		
		if(row <= 2){
			return 1;
		}
		
		int [] lastRow = new int [2];
		
		lastRow[0] = 1;
		lastRow[1] = 1;
		
		row = row - 2;
		
		for(int i=0;i < row; i++){
			int [] thisRow = new int [i + 3];
			
			thisRow[0] = 1;
			
			for(int m=1;m<i + 2;m++){
				thisRow[m] = lastRow[m - 1] + lastRow[m];
			}
			
			thisRow[i + 2] = 1;
			
			lastRow = thisRow;
		}
		
		return lastRow[column - 1];
		
	}
	
	
	//paint out the standard triangle, the most difficult thing is to control the " "
	public static void paintStandardPascalTriangle(int num){
		if(num==1){
			System.out.println(1);
			return;
		}
		
		if(num==2){
			System.out.println(" "+1+" ");
			System.out.println(1+" "+1);
			return;
		}
		
		int len = 2 * num -1;

		int [] firstRow = new int[len];
		
		firstRow[num - 1] = 1;
		
		for(int k=0;k<len;k++){
			//
			if(firstRow[k]==0){
				System.out.print(" ");
			}
			//
			else{
				System.out.print(firstRow[k]);
			}
		}
		
		System.out.println();
		
		
		//the third row
		int [] lastRow = new int [len];
		
		lastRow[num - 2] = 1;
		lastRow[num] = 1;
		
		for(int k=0;k<len;k++){
			//
			if(lastRow[k]==0){
				System.out.print(" ");
			}
			//
			else{
				System.out.print(lastRow[k]);
			}
		}
		
		System.out.println();
		
		
		
		
		//from the 3rd row to begin
		for(int i=0;i < num - 2; i++){
			
			int [] thisRow = new int [len];
			
			thisRow [num - 3 - i] = 1;
			
			int count = 1;
			
			for(int m=num-3-i+2;m<len&&count<i + 3 - 1;m=m+2,count++){
				
				//
				thisRow[m] = lastRow[m - 1] + lastRow[m + 1]; 
			}
			
			thisRow[num + 1 + i] = 1; 
			
			for(int k=0;k<len;k++){
				//
				if(thisRow[k]==0){
					System.out.print(" ");
				}
				//
				else{
					System.out.print(thisRow[k]);
				}
			}
			
			System.out.println();
			
			lastRow = thisRow;
			
			
		}
	}
	
	public static void paintStandardPascalTriangle2(int num){
		if(num==1){
			System.out.println(1);
			return;
		}
		
		if(num==2){
			System.out.println(" "+1);
			System.out.println(1+" "+1);
			return;
		}
		
		int [] lastRow = new int [2];
		lastRow[0] = 1;
		lastRow[1] = 1;
		
		//print out the first row
		for(int i=0;i<num - 1;i++){
			System.out.print(" ");
		}
		
		System.out.println(1);
		
		for(int i=0;i<num - 2;i++){
			System.out.print(" ");
		}
		
		System.out.println(1+" "+1);
		
		
		
		for(int i=0;i<num - 2;i++){
			
			int [] thisRow = new int [i + 3];
			
			//the first one
			thisRow[0] = 1;
			
			for(int m=1;m<i + 2;m++){
				
				thisRow[m] = lastRow[m-1] + lastRow[m];
				
			}
			
			//the last one
			thisRow[i + 2] = 1;
			
			//print out the " "
			for(int k=0;k<num - 1 - i - 2; k++){
				System.out.print(" ");
			}
			
			for(int j=0;j<thisRow.length;j++){
				System.out.print(thisRow[j]+" ");
			}
			
			System.out.println();
			
			lastRow = thisRow;
			
		}
		
		
		
	}
	
	
}
