package collection2;

public class DescendingByScore implements Sortable {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getScore() < s2.getScore()) { 
			return 1;
		} else if (s1.getScore() == s2.getScore()) { 
			return s1.getStuNo().compareTo(s2.getStuNo());
		} else {
			return  -1;
		}
	}
	
//	@Override
//	public int compare(Student s1, Student s2) {
//		return Integer.compare(s1.getScore(),s2.getScore()) * -1;
//	}	
}
