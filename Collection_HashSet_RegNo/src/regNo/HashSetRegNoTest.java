package regNo;

import java.util.HashSet;
import java.util.Set;

public class HashSetRegNoTest {

	public static void main(String[] args) {
		Korean k1 = new Korean("840821-1234567", "둘리");
		Korean k2 = new Korean("2301-33333", "희동이");
		Korean k3 = new Korean("999999", "둘리");
		Korean k4 = new Korean("2303", "희동이");
		Korean k5 = new Korean("2304", "철수");
		Korean k6 = new Korean("2304", "영희");

		System.out.println(k1.hashCode());
		System.out.println(k2.hashCode());
	
		Set<Korean> set = new HashSet<>();

		set.add(k1);	
		set.add(k2);
		set.add(k3);
		set.add(k4);
		set.add(k5);
		set.add(k6);

		for (Korean kor : set) {
			System.out.println(kor.toString() + ", " + kor.hashCode());
		}
		
		System.out.println(k2.equals(k4));
		
		String a = "3";
		a.hashCode();
	}


}
