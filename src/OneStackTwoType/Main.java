package OneStackTwoType;

public class Main {
	
	public static void main(String[] args) {
		Cat cat1 = new Cat(1);
		Cat cat2 = new Cat(2);
		Cat cat3 = new Cat(3);
		Cat cat4 = new Cat(4);
		Cat cat5 = new Cat(5);
		Cat cat6 = new Cat(6);
		
		Dog dog1 = new Dog(11);
		Dog dog2 = new Dog(12);
		Dog dog3 = new Dog(13);
		Dog dog4 = new Dog(14);
		Dog dog5 = new Dog(15);
		Dog dog6 = new Dog(16);
		
		MyStack myStack = new MyStack();
		
		myStack.myPush(cat1);
		myStack.myPush(dog1);
		myStack.myPush(cat2);
		myStack.myPush(cat3);
		myStack.myPush(cat4);
		myStack.myPush(dog2);
		myStack.myPush(dog3);
		myStack.myPush(dog4);
		
		System.out.println(myStack.myPop());
		System.out.println(myStack.myPopCat());
	}
	
	
	
}
