package OneStackTwoType;

public class Dog extends Animal {
	
	int dogValue;

	public Dog() {
		super();
	}

	public Dog(int dogValue) {
		super();
		this.dogValue = dogValue;
	}
	
	@Override
	public void shout() {
		// TODO Auto-generated method stub
		System.out.println("I am a dog.");
	}

	public int getDogValue() {
		return dogValue;
	}

	public void setDogValue(int dogValue) {
		this.dogValue = dogValue;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder();
		sb.append("dog "+dogValue);
		return sb.toString();
	}
	
}
