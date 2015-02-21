package FindInSortedArray;

public class Main {
	public static void main(String [] args){
		int [] array = new int [10];
		
		for(int i=9;i>0;i--){
			array[9-i] = i * 3;
		}
		
		for(int i=0;i<10;i++){
			System.out.print(array[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("****************");
		
		System.out.println(search(array,0));
		
	}
	
	public static int search(int [] array, int x){
		return search(array, 0, array.length-1, x);
	}
	
	//modification of binary search
	public static int search(int [] array, int l, int r, int x){
		
		System.out.println("call the function(array,"+l+","+r+","+x+")");
		
		int m = (l + r)/2;
		
		while(l<=r){
			if(x == array[m]){
				return m;
			}
			else if(array[l]<array[m]){
				if(x > array[m]){
					l = m + 1;
					return search(array, l,r, x);
				}
				else{
					r = m - 1;
					return search(array, l, r, x);
				}
			}
			else
			{
				if(x > array[m]){
					r = m - 1;
					return search(array, l, r, x);
				}
				else{
					l = m + 1;
					
					System.out.println("l="+l);
					
					return search(array, l, r, x);
				}
			}
		}
		return -1;
	}
}
