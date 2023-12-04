package collection2;


public class DescendingByStuNo implements Sortable {

	@Override
	public int compare(Student s1, Student s2) {

			return s1.getStuNo().compareTo(s2.getStuNo()) * -1;
		
	}
}
