package HanioTowerUsingStack;

public class Main {
	public static void main(String [] args){
		
		Tower[] towers = new Tower[3];
		
		for(int i=0;i<3;i++){
			
			//
			towers[i] = new Tower (i);
		}
		
//		towers[0].addDisk(5);
//		towers[0].addDisk(4);
//		towers[0].addDisk(3);
//		towers[0].addDisk(2);
//		towers[0].addDisk(1);
		
		
		towers[0].getStack().add(3);
		towers[0].getStack().add(2);
		towers[0].getStack().add(1);
		
		
		System.out.println("************");
		
		
		towers[0].moveAllDisks(3, towers[1], towers[2]);
	}
}
