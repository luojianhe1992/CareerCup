package HanoiTower;

import java.util.Scanner;

public class TowerOfHanoi {

	public void solve(int n, String start, String auxiliary, String end){
		if(n==1){
			System.out.println(start+"->"+end);
		}
		else{
			solve(n-1,start,end,auxiliary);
			System.out.println(start+"->"+end);
			solve(n-1,auxiliary,start,end);
		}
	}
	
	public static void main(String [] args){
		TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
		System.out.println("Please enter the number of discs:");
		
		Scanner scanner = new Scanner(System.in);
		
		int discs = scanner.nextInt();
		
		towerOfHanoi.solve(5, "A", "B", "C");
	}
}
