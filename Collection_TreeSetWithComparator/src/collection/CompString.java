package collection;

import java.util.Comparator;

public class CompString implements Comparator<Student> {


	@Override
	public int compare(Student s1, Student s2) {
		return s1.getStuNo().compareTo(s2.getStuNo());
	}	
	
}
