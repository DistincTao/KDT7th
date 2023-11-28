package queueNumber;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class waitingNumber {

	static Queue<Integer> waitingList = new LinkedList<>();
	static Scanner sc = new Scanner(System.in);
	static int waitCnt= 0;
	
	public static void main(String[] args) {

		Boolean reapeat = true;
		while (reapeat) {
			System.out.println("-------------------------------------");
			System.out.println("--1. 번호표 뽑기");
			System.out.println("--2. 손님 호출");
			System.out.println("--3. 번호표반납하기");
			System.out.println("--4. 종료");
			System.out.println("-------------------------------------");
			System.out.print("번호표를 뽑으세요!!");
			int number = sc.nextInt();
			
			switch (number) {
			case 1:
				pickWaitingNum(waitingList);
				break;
			case 2:
				callNumber(waitingList);
				break;
			case 3:
				throwWaitingNum(waitingList);
				break;
			case 4:
				System.exit(0);
				reapeat = false;
				break;
			}
		}
	}

	private static void pickWaitingNum(Queue<Integer> waitingList) {
		if (waitCnt == 0) {
			waitCnt = 1;
			waitingList.add(waitCnt);
		} else { 
			waitingList.add(++waitCnt);
		}
		System.out.println("대기번호 : " + waitCnt);
	}

	private static void callNumber(Queue<Integer> waitingList) {
		if (waitingList.isEmpty()) {
			System.out.println("대기자가 없습니다.");
		} else {
			System.out.println(waitingList.peek() + "번 손님!!");
			waitingList.poll();
		}		
	}

	private static void throwWaitingNum(Queue<Integer> waitingList) {
		System.out.print("본인의 대기 번호를 입력해 주세요.");
		int number = sc.nextInt();
		waitingList.remove(number);
		System.out.print("당신의 배려에 감사드립니다.");
	}

}
