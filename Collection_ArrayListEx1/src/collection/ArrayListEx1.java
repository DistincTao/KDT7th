package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// 기본 생성자로 ArrayList를 생성 : 기본 초기 길이가 10인 ArrayList가 생성됨
		ArrayList list1 = new ArrayList(10);
		list1.add(0);
		list1.add(new Integer(1));
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);

		System.out.println("list1의 길이 : " + list1.size());
		System.out.println("list1 : " + list1);
		
		
		ArrayList list2 = new ArrayList (list1);
		System.out.println("list2 : " + list2);
		
		ArrayList list3 = new ArrayList(list1.subList(1, 4));
		System.out.println("list3 : " + list3);
		// containsAll(list2) : list2의 모든 요소가 포함되는지 여부
		System.out.println("list2.containsAll(list3) : " + list2.containsAll(list3)); // true
		
		list3.add("B");
		list3.add("C");
		list3.add(3, "A");
		System.out.println("list3 : " + list3);
		
		//get() => getter
		System.out.println(list3.get(3));
		
		//set() => setter
		list3.set(4, "BB");
		System.out.println("list3 : " + list3);
		
		// 문자열 "1"을  list1에 0번째에 추가 해보기
		list1.add(0, "1");
		System.out.println("list1 : " + list1);
		System.out.println("문자열 \"1\"이 있는 index : " + list1.indexOf("1"));
		System.out.println("숫자 1이 있는 index : " + list1.indexOf(1));
		System.out.println("숫자 1이 있는 index : " + list1.indexOf(new Integer(1)));
		
		// remove()
		list1.remove("1");
		System.out.println("list1 : " + list1);
		
		// retainAll() => list1에서 list3와 겹치는 부분만 남기고 나머지는 삭제
		list1.retainAll(list3);
		System.out.println("list3.retainAll(list2) : " + list1.retainAll(list3));
		System.out.println("list1 : " + list1);
		System.out.println("list3 : " + list3);
		
		// removeAll () 
		list2.removeAll(list1);
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		// clear()
		list3.clear();
		System.out.println("list3 : " + list3);
		list1.add(4);
		list1.add(5);

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		// iterater() => collection에서 유용하게 사용 가능한 메소드
		System.out.println("Iterator.....");
		Iterator<Integer> iter = list1.iterator();
		while (iter.hasNext()){ // 다음 요소가 있는지 여부 확인
			System.out.println(iter.next());
		}
		
		System.out.println("Iterator2.....");
		Iterator<Integer> iter2 = list1.iterator();
		while (iter2.hasNext()){ // 다음 요소가 있는지 여부 확인
			System.out.println(iter2.next());
		}

	}

}
