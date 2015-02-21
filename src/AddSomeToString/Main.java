package AddSomeToString;

public class Main {
	
	public static void main(String [] args){
		char [] c = new char[100];
		
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';
		c[4] = ' ';
		c[5] = 'e';
		c[6] = 'f';
		
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		c = addSomeToString(c, 7);
		
		for(int i=0;i<c.length;i++){
			System.out.print(c[i]);
		}
		
		System.out.println();
		
	}
	
	public static char[] addSomeToString(char[] str, int length){
		for(int i=0;i<length;i++){
			if(str[i] == ' '){
				length = length + 2;
				for(int j = length - 1;j > i + 2; j--){
					str[j] = str[j - 2];
				}
				
				//insertion in the array
				str[i++] = '%';
				str[i++] = '2';
				str[i] = '0';
			}
		}
		
		return str;
	}
}
