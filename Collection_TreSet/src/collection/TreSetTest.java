package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreSetTest {

	public static void main(String[] args) {
		System.out.println("-------------- HashSet --------------");
		Set<Integer> hs = new HashSet<>();
		
//		hs.add(new Integer(1));
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(50);
		hs.add(60);
		
		for (Integer i : hs) {
			System.out.println(i);
		}
		System.out.println("-------------- TreeSet --------------");
		Set<Integer> ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(40);
		ts.add(50);
		ts.add(20);
		ts.add(60);
		ts.add(30);
		
		for (Integer i : ts) {
			System.out.println(i);
		}
		System.out.println("--------- TreeSet에 리스트 추가 ---------");
		List<Integer> listInt = new ArrayList<>();
		
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		listInt.add(4);
		listInt.add(5);
		
		ts.addAll(listInt);
		
		for (Integer i : ts) {
			System.out.println(i);
		}
		System.out.println("-------- TreeSet에 String 추가 --------");
		Set<String> setString = new TreeSet<>();
		
		setString.add("AA student 1");
		setString.add("AC student 3");
		setString.add("AE student 4");
		setString.add("하하하");
		setString.add("가나다");
		setString.add("AD student 4");
		setString.add("AB student 2");
		setString.add("Aa student 2");

		Iterator <String> iter = setString.iterator();

		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---------- TreeSet : subSet ---------");
		TreeSet set1 = new TreeSet();
		
		set1.add("a");
		set1.add("apple");
		set1.add("byte");
		set1.add("concat");
		set1.add("delete");
		set1.add("Enum");
		set1.add("finally");
		set1.add("bin");
		set1.add("four");
		set1.add("zebra");
		
		System.out.println(set1);
		
		System.out.println(set1.subSet("b", "f")); // fromElement 포함, toElement 불포함 
 		
		System.out.println("---- TreeSet : headSet / tailSet ----");
		TreeSet set2 = new TreeSet();
		int[] score = {80, 98, 66, 85, 100, 78, 44, 99};
		
		for (int i = 0; i < score.length; i++) {
			set2.add(new Integer(score[i]));
		}
		System.out.println(set2);
		System.out.println("60 보다 작은 값 : " + set2.headSet(new Integer(60)));
		System.out.println("60 보다 큰 값 : " + set2.tailSet(new Integer(60)));
		System.out.println("60 보다 작은 값 : " + set2.headSet(new Integer(80))); // less than
		System.out.println("60 보다 큰 값 : " + set2.tailSet(new Integer(80))); // greater than or equal
		System.out.println("60 보다 작은 값 : " + set2.headSet(new Integer(80),true)); // less than + equal
		System.out.println("60 보다 큰 값 : " + set2.tailSet(new Integer(80),false)); // greater than
		
		
		System.out.println("---------- HashSet Lotto ----------");
		Set <Integer> lottoH = new HashSet<>();
		
		for (int i = 0; lottoH.size() < 6; i++) {
			int num = (int) (Math.random() * 45 + 1);
				lottoH.add(num);
		}
		System.out.println(lottoH);
		
		
		System.out.println("---------- TreeSet Lotto ----------");
		Set <Integer> lottoT = new TreeSet<>();
		

		while (lottoT.size() < 6) {
			int num = (int) (Math.random() * 45) + 1;
			lottoT.add(num);
		}
		System.out.println(lottoT);
		
		
//		System.out.println(new TreeSet(lottoH));
		
		List list = new LinkedList(lottoH);
		Collections.sort(list);
		System.out.println(list);
		
	}
	
		

}
