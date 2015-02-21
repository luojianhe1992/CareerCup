package CheckRectangleOverlap;

public class Rectangle {
	float left;
	float top;
	float width;
	float height;
	float topLeftX;
	float topLeftY;
	float bottomRightX;
	float BottomRightY;
	
	public Rectangle(float left, float top, float width, float height) {
		super();
		this.left = left;
		this.top = top;
		this.width = width;
		this.height = height;
	}


	public float getLeft() {
		return left;
	}


	public void setLeft(float left) {
		this.left = left;
	}


	public float getTop() {
		return top;
	}


	public void setTop(float top) {
		this.top = top;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	
	
	public float getTopLeftX() {
		return topLeftX;
	}


	public void setTopLeftX(float topLeftX) {
		this.topLeftX = topLeftX;
	}


	public float getTopLeftY() {
		return topLeftY;
	}


	public void setTopLeftY(float topLeftY) {
		this.topLeftY = topLeftY;
	}


	public float getBottomRightX() {
		return bottomRightX;
	}


	public void setBottomRightX(float bottomRightX) {
		this.bottomRightX = bottomRightX;
	}


	public float getBottomRightY() {
		return BottomRightY;
	}


	public void setBottomRightY(float bottomRightY) {
		BottomRightY = bottomRightY;
	}


	public void updateTopLeft(){
		topLeftX = left;
		topLeftY = top;
	}
	
	public void updateBottomRight(){
		bottomRightX = left + width;
		BottomRightY = top - height;
	}
	
	
	
	
	
}
