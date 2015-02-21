
public class CheckStrRotation {
	
	public static boolean checkStrRotation(String s1,String s2){
		
		if(s1.length()!=s2.length()){
			return false;
		}
		
		String s3 = s1 + s1;
		
		if(s3.contains(s2)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	public static void main(String [] args){
		
		String s1="JianheLuo";
		
		String s2="LuoJianhe";
		
		System.out.println(checkStrRotation(s1, s2));
		
		
	}
}
