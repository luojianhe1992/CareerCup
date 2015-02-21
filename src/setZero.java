
public class setZero {
	public static int[][] setZero(int[][] matrix,int n){
		
		int zeroRow = -1;
		int zeroColumn = -1;
		boolean hasZero = false;
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(matrix[i][j]==0){
					zeroRow=i;
					zeroColumn=j;
					hasZero = true;
				}
			}
		}
		
		if(hasZero){
			for(int i=0;i<n;i++){
				matrix[i][zeroColumn]=0;
			}
			for(int j=0;j<n;j++){
				matrix[zeroRow][j]=0;
			}
		}
		
		return matrix;
		
	}
	
	public static void main(String[] args){
		int [] [] matrix = {{1,2,3,4},{5,6,7,8},{9,10,0,12},{13,14,15,16}};
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		
		setZero(matrix, 4);
		
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("*******************");
		
		
	}
}
