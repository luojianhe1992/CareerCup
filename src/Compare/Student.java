package Compare;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	String id;
	String name;
	
	@Override
	public int compareTo(Student o) {
		Comparator<Student> defaultComparator = idComparator;
		return defaultComparator.compare(this, o);
	}
	
	//define a comparator
	public static Comparator<Student> idComparator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.id.compareTo(o2.id);
		}
	};
	
	//define a comparator
	public static Comparator<Student> nameComparator = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.name.compareTo(o2.name);
		}
	};
	
}
