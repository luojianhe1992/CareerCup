
public class rotateMatrix {
	
	public static int[][] rotateMatrix(int [][] matrix, int n){
		
		int [][] newMatrix = new int [n][n];
		
		for(int i=0;i<n;i++){
			newMatrix[0][i] = matrix[n-i-1][0];
		}
		
		for(int i=0;i<n;i++){
			newMatrix[1][i] = matrix[n-i-1][1];
		}
		
		for(int i=0;i<n;i++){
			newMatrix[2][i] = matrix[n-i-1][2];
		}
		
		for(int i=0;i<n;i++){
			newMatrix[3][i] = matrix[n-i-1][3];
		}
		
		return newMatrix;
		
	}
	
	public static int[][] rotateMatrix2(int [][] matrix, int n){
		int newMatrix[][] = new int [n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				newMatrix[i][j] = matrix[n-j-1][i];
			}
		}
		
		return newMatrix;
	}
	
	public static void main(String[] args){
		int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("********************");
		
		int[][] newMatrix = rotateMatrix(matrix,4);
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(newMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("********************");
		
		newMatrix = rotateMatrix2(newMatrix, 4);
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(newMatrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("********************");
		
	}
}
