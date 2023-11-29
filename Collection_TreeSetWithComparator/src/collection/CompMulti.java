package collection;

import java.util.Comparator;

public class CompMulti implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		Comparator <Student > compInt = new CompInt();
		compInt.compare(s1, s2);

		Comparator <Student > compString = new CompString();
		compString = compInt ;



		return compString.compare(s1, s2);
		
	}
}
