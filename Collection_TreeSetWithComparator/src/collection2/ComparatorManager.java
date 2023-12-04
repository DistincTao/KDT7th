package collection2;

public class ComparatorManager {

	public static Sortable getComparator(int menu) {
		Sortable myComparator = null;
		switch (menu) {
		case 1 :
			myComparator = new DescendingByScore();
			break;
		case 2 :
			myComparator = new AccendingByName();
			break;
		case 3 :
			myComparator = new DescendingByStuNo();
			break;	
		default :
			System.exit(0);	
		}
		return myComparator;	
	}

	
}
