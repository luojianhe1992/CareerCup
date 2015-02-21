package MergeSortedArray;

public class Main {
	public static void main(String [] args){
		int [] arr1 = {2,35,63,2,1,52,4,7,4,1};
		
		arraySort(arr1);
		
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
		
		int [] arr2 = {5,2,6,2,3,75,8,4,2,1,2,3,6,6,34};
		
		arraySort(arr2);
		
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("***************");
		
		int [] a = new int [20];
		
		for(int i=0;i<10;i++){
			a[i] = i*7;
		}
		
		
		int [] b = {3,-6,-2,123,53,632,3,7,54,2,1,23,3,34,4};
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("***************");
		
		arraySort(a);
		
		arraySort(b);
		
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("***************");
		
		int [] result = mergeSorted(a, b);
		
		for(int i=0;i<result.length;i++){
			System.out.print(result[i]+" ");
		}
		
		System.out.println();
		
		System.out.println("****************");
		
	}
	
	//选择排序
	public static void arraySort(int[] arr){
		for(int i=0;i<arr.length;i++){
			
			int min_num = i;
			
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min_num]){
					min_num = j;
				}
			}
			
			int temp;
			temp = arr[i];
			arr[i] = arr[min_num];
			arr[min_num] = temp;
		}
	}
	
	//冒泡排序
	public static void arraySort2(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=0;i<arr.length-i;j++){
				if(arr[j]>arr[j+1]){
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	//put the element from the back of the array
	public static int[] mergeSorted(int[] arr1, int[] arr2){
		int k;
		k = arr1.length + arr2.length -1;
		
		int [] result = new int [arr1.length + arr2.length];
		
		int i = arr1.length - 1;
		
		int j = arr2.length - 1;
		
		
		System.out.println();
		
		
		System.out.println("i="+i+", j="+j+", k="+k);
		
		while(i>=0&&j>=0){
			if(arr1[i]>arr2[j]){
				result[k] = arr1[i];
				
				System.out.println("result["+k+"]="+result[k]);
				
				i--;
				k--;
				
				
			}
			else{
				result[k] = arr2[j];
				
				System.out.println("result["+k+"]="+result[k]);
				
				j--;
				k--;
				
				
			}
		}
		
		while(i>=0){
			result[k] = arr1[i];
			
			i--;
			k--;
		}
		
		while(j>=0){
			result[k] = arr2[j];
			
			j--;
			k--;
		}
		
		return result;
		
	}
}
