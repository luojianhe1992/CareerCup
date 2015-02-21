package CheckRectangleOverlap;

public class Rectangle2 {
	
	//顺时针
	Point point1;
	Point point2;
	Point point3;
	Point point4;
	
	public Rectangle2(Point point1, Point point2, Point point3, Point point4) {
		super();
		
		this.point1 = point1;
		this.point2 = point2;
		this.point3 = point3;
		this.point4 = point4;
	}

	public Point getPoint1() {
		return point1;
	}

	public void setPoint1(Point point1) {
		this.point1 = point1;
	}

	public Point getPoint2() {
		return point2;
	}

	public void setPoint2(Point point2) {
		this.point2 = point2;
	}

	public Point getPoint3() {
		return point3;
	}

	public void setPoint3(Point point3) {
		this.point3 = point3;
	}

	public Point getPoint4() {
		return point4;
	}

	public void setPoint4(Point point4) {
		this.point4 = point4;
	}
	
	public boolean isInTheRectangle(Point p){
		
		//the point in the rectangle
		if((p.getCoordinateX() >= point1.getCoordinateX())&&(p.getCoordinateX() <= point2.getCoordinateX()) && (p.getCoordinateY() <= point1.getCoordinateY()) && (p.getCoordinateY() >= point4.getCoordinateY())){
			return true;
		}
		
		return false;
		
	}
}
