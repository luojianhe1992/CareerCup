package PaintImage;

public class Main {
	public static void main(String [] args){
		Color[][] screen = new Color[5][5];
		
		for(int i=0;i<5;i++){
			screen[0][i] = Color.Black;
		}
		
		for(int i=0;i<5;i++){
			screen[1][i] = Color.White;
		}
		
		for(int i=0;i<5;i++){
			screen[2][i] = Color.Red;
		}
		
		for(int i=0;i<5;i++){
			screen[3][i] = Color.Yellow;
		}
		
		for(int i=0;i<5;i++){
			screen[4][i] = Color.Green;
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(screen[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println("***************");
		
		System.out.println(PaintFill(screen,2,4,Color.Black));
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(screen[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	enum Color{
		Black, White, Red, Yellow, Green
	}
	
	public static boolean PaintFill(Color[][]screen, int x, int y, Color ncolor){
		return PaintFill(screen, x, y, screen[x][y], ncolor);
	}
	
	public static boolean PaintFill(Color[][] screen, int x, int y, Color ocolor, Color ncolor){
		
		if(x<0||x>screen[0].length||y<0||y>screen.length){
			return false;
		}
		
		if(screen[y][x]==ocolor){
			screen[y][x] = ncolor;
			
			PaintFill(screen, x-1, y, ocolor, ncolor);//top
			PaintFill(screen, x+1, y, ocolor, ncolor);//down
			PaintFill(screen, x, y-1, ocolor, ncolor);//left
			PaintFill(screen, x, y+1, ocolor, ncolor);//right
			
			
		}
		
		return true;
	}
}
