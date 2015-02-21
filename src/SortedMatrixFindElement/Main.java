package SortedMatrixFindElement;

public class Main {
	public static void main(String [] args){
		
		int [][] matrix = new int[5][5];
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				matrix[i][j] = i * 10 + j * 1;
			}
		}
		
		System.out.println("******************");
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrix[i][j]+"\t");
			}
			
			System.out.println();
			
		}
		
		System.out.println("******************");
		
		int [] result = findElement(matrix,14);
		
		System.out.println("result:"+result[0]+","+result[1]);
		
	}
	
	public static int[] findElement(int [][] matrix, int element){
		
		int [] result = new int[2];
		
		result[0] = -1;
		result[1] = -1;
		
		int row = 0;
		int column = matrix[0].length - 1;
		
		return findElement(matrix, element, row, column, result);
		
	}
	
	public static int[] findElement(int [][] matrix, int element, int row, int column, int[] result){
		
		
			
		if(matrix[row][column] == element){
			result [0] = row;
			result [1] = column;
				
			return result;
		}
		else if(matrix[row][column]>element){
			column--;
				
			return findElement(matrix, element, row, column, result);
		}
		else{
			row++;
				
			return findElement(matrix, element, row, column, result);
		}
		
		
	}
}
