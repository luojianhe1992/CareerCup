package OneStackTwoType;

public class Cat extends Animal {
	int catValue;
	
	public Cat() {
		super();
	}

	public Cat(int catValue) {
		super();
		this.catValue = catValue;
	}

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("I am a cat.");
	}

	public int getCatValue() {
		return catValue;
	}

	public void setCatValue(int catValue) {
		this.catValue = catValue;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("cat "+catValue);
		
		return sb.toString();
	}
	
}
