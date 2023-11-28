package queueNumber;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1_WaitingList {

	public static void main(String[] args) {
		Queue <Integer> waitList = new LinkedList<>();
		
		try (Scanner sc = new Scanner (System.in)) {
			while (true) {
				System.out.println("1. 대기 번호 발급");
				System.out.println("2. 대기 번호 호출");
				System.out.println("3. 종료");
				System.out.println("메뉴를 선택 하세요");
				
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 : 
					issueWaitNumber(waitList);
					break;
				case 2 :
					callWaitNumber(waitList);
					break;
				case 3 :
					System.out.println("종료합니다.");
					System.exit(0);
					break;
				default : 
					System.out.println("잘못 누르셨습니다. 다시 선택해주세요.");
				}
			}
		}
	}

	private static void callWaitNumber(Queue<Integer> waitList) {
		if (waitList.isEmpty()) {
			System.out.println("대기 중인 손님이 없습니다.");
		} else {
			int nextNumber = waitList.poll();
			System.out.println("대기 번호 " + nextNumber + " 손님");
		}
	}

	private static void issueWaitNumber(Queue<Integer> waitList) {
		int waitNumber = waitList.size() + 1;
		waitList.offer(waitNumber);
		System.out.println("대기번호 " + waitNumber + "가 발급되었습니다.");
	}

}
