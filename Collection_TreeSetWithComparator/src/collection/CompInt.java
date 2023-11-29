package collection;

import java.util.Comparator;

public class CompInt implements Comparator <Student>{

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getScore() > s2.getScore()) { 
			return 1;
		} else if (s1.getScore() == s2.getScore()) { 
			return s1.getStuNo().compareTo(s2.getStuNo());
		}else {
			return -1;
		}
		
	}
}
