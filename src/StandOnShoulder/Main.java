package StandOnShoulder;

import java.util.ArrayList;

public class Main {
	public static void main(String [] args){
		
		ArrayList<Person> people = new ArrayList<Person>();
		
		people.add(new Person(60,100));
		people.add(new Person(70,150));
		people.add(new Person(56,90));
		people.add(new Person(75,190));
		people.add(new Person(60,95));
		people.add(new Person(68,110));
		
		System.out.println(people);
		
		System.out.println("*********************");
		
		sortPeople(people);
		
		System.out.println(people);
		
		System.out.println("*********************");
		
		
		
		
	}
	
	public static void sortPeople(ArrayList<Person> people){
		for(int i=0;i<people.size();i++){
			
			for(int j=i+1;j<people.size();j++){
				if(people.get(i).compareTo(people.get(j)) > 0){
					
					Person temp = new Person();
					
//					temp.setHeight(people.get(j).getHeight());
//					temp.setWeight(people.get(j).getWeight());
//					
//					people.get(j).setHeight(first.getHeight());
//					people.get(j).setWeight(first.getWeight());
//					
//					first.setHeight(temp.getHeight());
//					first.setWeight(temp.getWeight());
					
					temp = people.get(j);
					people.set(j, people.get(i));
					people.set(i, temp);
					
				}
			}
		}
		
		
	}
}
