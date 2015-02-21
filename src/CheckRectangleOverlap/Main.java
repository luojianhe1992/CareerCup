package CheckRectangleOverlap;
import org.w3c.dom.css.Rect;

public class Main {
	public static void main(String [] args){
		
		Rectangle rec1 = new Rectangle(0, 6, 2, 2);
		
		Rectangle rec2 = new Rectangle(3, 3, 2, 2);
		
		rec1.updateTopLeft();
		rec1.updateBottomRight();
		
		rec2.updateTopLeft();
		rec2.updateBottomRight();
		
		System.out.println(rec1.getTopLeftX()+","+rec1.getTopLeftY());
		System.out.println(rec1.getBottomRightX()+","+rec1.getBottomRightY());
		
		System.out.println(rec2.getTopLeftX()+","+rec2.getTopLeftY());
		System.out.println(rec2.getBottomRightX()+","+rec2.getBottomRightY());
		
		System.out.println(checkWholeOverlap(rec1, rec2));
		
	}
	
	//check the X overlap
	public static boolean checkXRecOverlap(Rectangle rec1, Rectangle rec2){
		
		//
		if((rec1.topLeftX < rec2.bottomRightX) && (rec1.topLeftX > rec2.topLeftX)){
			return true;
		}
		
		
		//
		if((rec1.bottomRightX > rec2.topLeftX) && (rec1.bottomRightX < rec2.bottomRightX)){
			return true;
		}
		
		//fully overlap
		if((rec1.topLeftX < rec2.topLeftX) && (rec1.bottomRightX > rec2.bottomRightX)){
			return true;
		}
		
		//fully overlap
		if((rec1.topLeftX > rec2.topLeftX) && (rec1.bottomRightX < rec2.bottomRightX)){
			return true;
		}
		
		return false;
	}
	
	//check the Y overlap
	public static boolean checkYRecOverlap(Rectangle rec1, Rectangle rec2){
		
		if((rec1.topLeftY < rec2.topLeftY) && (rec1.topLeftY > rec2.BottomRightY)){
			return true;
		}
		
		if((rec1.BottomRightY < rec2.topLeftY) && (rec1.BottomRightY > rec2.BottomRightY)){
			return true;
		}
		
		//fully overlap
		if((rec1.topLeftY > rec2.topLeftY) && (rec1.BottomRightY < rec2.BottomRightY)){
			return true;
		}
		
		//fully overlap
		if((rec1.topLeftY < rec2.topLeftY) && (rec1.BottomRightY > rec2.BottomRightY)){
			return true;
		}
		
		return false;
		
	}
	
	public static boolean checkWholeOverlap(Rectangle rec1, Rectangle rec2){
		
		boolean xOverlap = checkXRecOverlap(rec1, rec2);
		
		boolean yOverlap = checkYRecOverlap(rec1, rec2);
		
		
		System.out.println("xOverlap="+xOverlap);
		
		System.out.println("yOverlap="+yOverlap);
		
		return xOverlap&&yOverlap;
		
	}
}
