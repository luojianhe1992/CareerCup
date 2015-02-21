package StandOnShoulder;

public class Person implements Comparable{
	int height;
	int weight;
	
	//constructor function
	public Person(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}
	
	//constructor function
	public Person() {
		super();
	}

	//get and set function
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Person obj = (Person) arg0;
		int result;
		
		result = this.getHeight() - obj.getHeight();
		
		if(result == 0){
			result = this.getWeight() - obj.getWeight();
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("(");
		
		sb.append(this.height).append(",");
		
		sb.append(this.weight).append(")");
		
		return sb.toString();
	}
	
	
	
}
