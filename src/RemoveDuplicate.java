
public class RemoveDuplicate {
	
	public static void removeDuplicate(char[] str){
		if(str==null)
			return;
		
		int len=str.length;
		
		if(len<2)
			return;
		
		//there are at least two letter.
		int tail=1;
		
		for(int i=1;i<len;i++){
			int j;
			for(j=0;j<tail;j++){
				
				
				if(str[i]==str[j]){
					break;
				}
			}
			
			
			if(j==tail){
				str[tail]=str[i];
				tail++;
				
			}
		}
		
		str[tail]=0;
		
	}
	
	public static void removeDuplicateEff(char[]str){
		
		if(str==null)
			return;
		
		int len=str.length;
		
		if(len<2)
			return;
		
		boolean[] hit=new boolean[256];
		
		for(int i=0;i<256;i++){
			hit[i] = false;
		}
		
		hit[str[0]] = true;
		
		int tail=1;
		
		for(int i=1;i<len;i++){
			if(!hit[str[i]]){
				str[tail]=str[i];
				tail++;
				hit[str[i]]=true;
			}
		}
		str[tail]=0;
		
	}
	
	public static void main(String[] args){
		
		System.out.println("hello world");
		
		char[] str = {'a','b','c','d','b','e'};
		
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		
		System.out.println("*******************");
		
		removeDuplicate(str);
		
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}
		
		System.out.println("***************");
		
		char[] str2={'a','a','a','b','b','c','c','d'};
		
		for(int i=0;i<str2.length;i++){
			System.out.println(str2[i]);
		}
		
		System.out.println("***************");
		
		
		removeDuplicate(str2);
		
		for(int i=0;i<str2.length;i++){
			System.out.println(str2[i]);
		}
		
		System.out.println("***************");
		
		
		char[] str3 = {'a','b','b','b','c','d','e','e','f'};
		
		for(int i=0;i<str3.length;i++){
			System.out.print(str3[i]+"");
		}
		
		System.out.println();
		
		System.out.println("******************");
		
		removeDuplicateEff(str3);
		
		for(int i=0;i<str3.length;i++){
			System.out.print(str3[i]+"");
		}
		
		System.out.println();
		
		System.out.println("******************");
		
		
	}

}
