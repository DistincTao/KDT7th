package collection;

import java.util.Comparator;

public class ComparatorManager {

	public Comparator <Student> getComparator(int i) {
		Comparator <Student> myComparator = null;
		switch (i) {
		case 1 :
			myComparator = new CompInt();
			break;
		case 2 :
			myComparator = new CompMulti();
			break;
		default :
			myComparator = new CompString();
			break;	
		}
		return myComparator;	
	}
	
}
