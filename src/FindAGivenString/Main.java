package FindAGivenString;

public class Main {
	public static void main(String [] args){
		String [] strings = {"","","","at","","","","ball","","car","","dad","","",""};
		
		for(int i=0;i<strings.length;i++){
			System.out.print(strings[i]+" ");
		}
		
		System.out.println();
		
		System.out.println(search(strings,"ball"));
		
	}
	
	//
	public static int search(String [] strings, String str){
		if(strings==null||str==null){
			return -1;
		}
		if(str == ""){
			for(int i=0;i<strings.length;i++){
				if(strings[i]==""){
					return i;
				}
			}
			return -1;
		}
		
		return search(strings, str, 0, strings.length-1);
	}
	
	//
	public static int search(String [] strings, String str, int first, int last){
		
		//recursion loop
		while(first<=last){
			
			//reduce the "" in the end
			while(first<=last && strings[last]==""){
				last--;
			}
			
			//reduce the "" in the begin
			while(first<last && strings[first]==""){
				first++;
			}
			
			//all the string are ""
			if(last<first){
				return -1;
			}
			
			
			int mid = (first+last)/2;
			
			//find one string which is not ""
			while(strings[mid]==""){
				mid++;
			}
			
			//
			int r = strings[mid].compareTo(str);
			
			//find out the string
			if(r==0){
				return mid;
			}
			
			//
			if(r<0){
				first = mid + 1;
			}
			else{
				last = mid - 1;
			}
			
			//use the recursion
			return search(strings, str, first, last);
			
		}
		
		return -1;
		
	}
}
