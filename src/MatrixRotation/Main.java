package MatrixRotation;

public class Main {
	public static void main(String [] args){
		int[][] matrix = new int[][]{{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
		
		matrixRotation(matrix, 4);
	}
	
	public static int [][] matrixRotation(int [][] matrix, int n){
		int [][] result = new int [n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				result[i][j] = matrix[n - j - 1][i];
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(result[i][j]+"\t");
			}
			
			System.out.println();
		}
		
		return result;
	}
}
