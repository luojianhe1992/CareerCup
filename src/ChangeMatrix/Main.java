package ChangeMatrix;

public class Main {
	public static void main(String [] args){
		int[][] matrix = new int [][] {{0,1,2,3},{4,5,0,7},{8,9,10,11}};
		
		changeMatrix(matrix);
	}
	
	public static int [][] changeMatrix(int [][] matrix){
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		System.out.println("rows="+rows+" "+"columns="+columns);
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		int [][] result = new int[rows][columns];
		
		System.out.println("rows="+rows+" "+"columns="+columns);
		
		boolean[][] mark = new boolean[rows][columns];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				
				
				//
				if(matrix[i][j]!=0){
					result[i][j] = matrix[i][j];
				}else{
					mark[i][j] = true;
				}
			}
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				if(mark[i][j]==true){
					for(int m=0;m<rows;m++){
						result[m][j] = 0;
					}
					
					for(int n=0;n<columns;n++){
						result[i][n] = 0;
					}
				}
			}
		}
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<columns;j++){
				System.out.print(result[i][j]+"\t");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		return result;
	}
}
