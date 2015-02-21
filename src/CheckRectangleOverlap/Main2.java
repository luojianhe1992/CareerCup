package CheckRectangleOverlap;

public class Main2 {
	public static void main(String [] args){
		
		Point rec1Point1 = new Point(0,6);
		Point rec1Point2 = new Point(3,6);
		Point rec1Point3 = new Point(3,3);
		Point rec1Point4 = new Point(0,3);
		
		Point rec2Point1 = new Point(2,5);
		Point rec2Point2 = new Point(2,2);
		Point rec2Point3 = new Point(2,0);
		Point rec2Point4 = new Point(0,0);
		
		Rectangle2 rec1 = new Rectangle2(rec1Point1, rec1Point2, rec1Point3, rec1Point4);
		Rectangle2 rec2 = new Rectangle2(rec2Point1, rec2Point2, rec2Point3, rec2Point4);
		
		System.out.println(checkWholeOverlap2(rec1, rec2));
		
	}
	
	public static boolean checkXRecOverlap(Rectangle2 rec1, Rectangle2 rec2){
		
		return false;
	}
	
	public static boolean checkYRecOverlap(Rectangle2 rec1, Rectangle2 rec2){
		
		
		return false;
	}
	
	public static boolean checkWholeOverlap(Rectangle2 rec1, Rectangle2 rec2){
		
		
		return false;
	}
	
	public static boolean checkWholeOverlap2(Rectangle2 rec1, Rectangle2 rec2){
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		return rec1.isInTheRectangle(rec2.getPoint1()) || rec1.isInTheRectangle(rec2.getPoint2()) || rec1.isInTheRectangle(rec2.getPoint3()) || rec1.isInTheRectangle(rec2.getPoint4());
		
	}
	
	
}
