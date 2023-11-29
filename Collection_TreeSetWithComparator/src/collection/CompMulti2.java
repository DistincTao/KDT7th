package collection;

import java.util.Comparator;

public class CompMulti2 implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		Comparator <Student > compInt = new CompInt();
		compInt.compare(s1, s2);

		return s1.getStuNo().compareTo(s2.getStuNo());
		
	}
}
