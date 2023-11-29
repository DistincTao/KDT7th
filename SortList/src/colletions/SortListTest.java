package colletions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListTest {

	public static void main(String[] args) {
		String[] strArr = {"a", "b", "e", "q", "E", "W", "B"};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없이 사전식으로 정렬
		System.out.println(Arrays.toString(strArr));
		
		List<String> list = new ArrayList<> ();
		list.add("둘리");
		list.add("또치");
		list.add("도우너");
		list.add("마이콜");
		list.add("고길동");
		System.out.println("------------------ 정렬 전 ------------------");
		System.out.println(list);
		
//		list.sort(Comparator);
		Comparator <String> comp = new Comparator<String>() {
			@Override
			public int compare (String o1, String o2) {
				return o1.compareTo(o2);
			}
		};
		
		Comparator <String> compRe = new Comparator<String>() {
			@Override
			public int compare (String o1, String o2) {
				return o1.compareTo(o2) * -1;
			}
		};
	
//		Comparator <String> compMy = new Comparator<String>() { 
//			@Override
//			public int compare (String o1, String o2) {
//				if (o1 < o2) {  // String Type에는 <, >, <=, >= 연산자 적용 불가
//					return -1;
//				} else if (o1.equals(o2)) {
//					return 0;
//				} else {
//					return 1;
//				}
//			}
//		};
		
		System.out.println("------------------ 정렬 후 ------------------");
		list.sort(comp);
		System.out.println(list);
		
		System.out.println("------------------ 정렬 후 ------------------");
		list.sort(compRe);
		System.out.println(list);

		// 
		List<Integer> intList = new ArrayList<>();

		intList.add(1);
		intList.add(534);
		intList.add(124);
		intList.add(54);
		intList.add(726);
		intList.add(32);
		intList.add(4);
		intList.add(163);
		
		System.out.println("------------------ 정렬 전 ------------------");
		System.out.println(intList);
		
		
		Comparator <Integer> compInt = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) { 
					return -1;
				} else if (o1 == o2) {
					return 0;
				} else {
					return 1;
				}
			}	
		};
		
		System.out.println("------------------ 정렬 후 ------------------");
		intList.sort(compInt);
		System.out.println(intList);
		
		Comparator <Integer> compIntRe = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 < o2) { 
					return 1;
				} else if (o1 == o2) {
					return 0;
				} else {
					return -1;
				}
			}	
		};
		
		System.out.println("------------------ 정렬 후 ------------------");
		intList.sort(compIntRe);
		System.out.println(intList);
		
	}

}
