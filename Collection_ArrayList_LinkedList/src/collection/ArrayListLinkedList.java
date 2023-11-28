package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList {
	
	public static void main(String [] args) {
		ArrayList<Integer> al = new ArrayList<>();
		LinkedList<Integer> ll = new LinkedList<>();
		
		System.out.println("순차적으로 추가");
		System.out.println("ArrayList : " + addSequance(al));
		System.out.println("LinkedList : " + addSequance(ll));
		System.out.println("--------------------------------");
		
		System.out.println("요소 값을 가져오기");
		System.out.println("ArrayList : " + getElement(al));
		System.out.println("LinkedList : " + getElement(ll));
		System.out.println("--------------------------------");
		
		System.out.println("중간에 추가");
		System.out.println("ArrayList : " + addMiddle(al));
		System.out.println("LinkedList : " + addMiddle(ll));
		System.out.println("--------------------------------");
		
		System.out.println("중간부터 삭제");
		System.out.println("ArrayList : " + removeMiddle(al));
		System.out.println("LinkedList : " + removeMiddle(ll));
		System.out.println("--------------------------------");
		
		System.out.println("뒤에서 부터 순차적으로 삭제");
		System.out.println("ArrayList : " + removeLast(al));
		System.out.println("LinkedList : " + removeLast(ll));
		System.out.println("--------------------------------");
	}
	
	private static long getElement(List<Integer> list) {
		long start = System.currentTimeMillis();
		// 시작 시간 저장

		// 중간에 시간 삭제
		for (int i = 0; i > 1000000; i++) {
			list.get(i);
		}
		
		//끝나는 시간
		long end = System.currentTimeMillis();
		
		return end-start;
	}

	private static long removeLast(List<Integer> list) {
		long start = System.currentTimeMillis();
		// 시작 시간 저장

		// 중간에 시간 삭제
		for (int i = list.size() - 1; i > 0; i--) {
			list.remove(i);
		}
		
		//끝나는 시간
		long end = System.currentTimeMillis();
		
		return end-start;
	}

	private static long removeMiddle(List<Integer> list) {
		long start = System.currentTimeMillis();
		// 시작 시간 저장

		// 중간에 시간 삭제
		for (int i = 0; i < 10000
				; i++) {
			list.remove(i + 500);
		}
		
		//끝나는 시간
		long end = System.currentTimeMillis();
		
		return end-start;
	}

	private static long addMiddle(List<Integer> list) {
		long start = System.currentTimeMillis();
		// 시작 시간 저장

		// 중간에 시간 저장
		for (int i = 0; i < 100000; i++) {
			list.add(400, 3);
		}
		
		//끝나는 시간
		long end = System.currentTimeMillis();
		
		return end-start;
	}

	public static long addSequance(List<Integer> list) {
		// 시작 시간 저장
		long start = System.currentTimeMillis();
		// 순차적으로 시간 저장
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
		//끝나는 시간
		long end = System.currentTimeMillis();
		
		return end - start;
	}


}
