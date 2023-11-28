package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> setA = new HashSet<>();
		HashSet<String> setB = new HashSet<>();
		HashSet<String> setUni = new HashSet<>();
		HashSet<String> setInter = new HashSet<>();
		HashSet<String> setSubA = new HashSet<>();
		HashSet<String> setSubB = new HashSet<>();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		setA.add("3"); // 중복 허용 않음
		setA.add("4"); // 중복 허용 않음
		
		System.out.println(setA.add("3")); // 추가 되지 않았으므로 false 반환
		System.out.println("setA = " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		
		System.out.println("setB = " + setB);
		
		//iterator()
		Iterator<String> iterA = setA.iterator();
		Iterator<String> iterB = setB.iterator();
		Iterator<String> iterSubA = setSubA.iterator();
		Iterator<String> iterSubB = setSubB.iterator();
		
		while (iterA.hasNext()) {
			System.out.println(iterA.next());
		}
		
		// 합집합
		iterA = setA.iterator();
		while (iterA.hasNext()) {
			setUni.add(iterA.next());
		}
		iterB = setB.iterator();
		while (iterB.hasNext()) {
			setUni.add(iterB.next());
		}
		System.out.println("setUni2 = " + setUni);
		
		//차집합
		
		iterA = setA.iterator(); 
		iterB = setB.iterator();
		while (iterB.hasNext()) {
			setSubA.add(iterB.next());
		}
		
		while (iterA.hasNext()) {
			setSubA.remove(iterA.next());
		}

		System.out.println("setSubA = " + setSubA);

		iterA = setA.iterator(); 
		iterB = setB.iterator();
		while (iterA.hasNext()) {
			setSubB.add(iterA.next());
		}
		while (iterB.hasNext()) {
			setSubB.remove(iterB.next());
		}

		System.out.println("setSubB = " + setSubB);

		
		
		iterSubA = setSubA.iterator();
		iterSubB = setSubB.iterator();
		
		setInter = setUni;
		
		while (iterSubA.hasNext()) {
			setInter.remove(iterSubA.next());
		}
		while (iterSubB.hasNext()) {
			setInter.remove(iterSubB.next());
			
		}
		System.out.println("setInter = " + setInter);
		
	}

}
