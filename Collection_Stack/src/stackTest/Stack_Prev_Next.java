package stackTest;

import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;


public class Stack_Prev_Next {
	static Stack <String> websites = new Stack<>();
	static Stack <String> passedSites = new Stack<>();
	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		Boolean repeat = true;
		while (repeat) {
			System.out.println("--------------------------");
			System.out.println("--1. 사이트 방문하기");
//			System.out.println("--2. 현재 사이트 확인");
			System.out.println("--2. 앞으로 이동하기");
			System.out.println("--3. 뒤로 이동하기");
			System.out.println("--4. 최근 방문한 사이트");
			System.out.println("--5. 사이트 자동 방문");
			System.out.println("--9. 종료");
			System.out.println("--------------------------");
			System.out.println("번호를 입력하세요>>");
			
			String input;
			
			try {
				input = sc.nextLine();

				switch (Integer.parseInt(input)) {
				case 1 : 
					goToSite();
					break;
//				case 2 : 
//					currentPage();
//					break;
				case 2 : 
					PrevSite();
					break;
				case 3 :
					nextSite();
					break;
				case 4 : 
					printList();
					break;
				case 5 : 
					autoFill();
					break;
				case 9 :
					System.exit(0);
					repeat = false;
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("다시 입력 해주세요");
			}
		}

	}

	private static void autoFill() {
		websites.add("google.com");
		websites.add("naver.com");
		websites.add("goott351.cafe24.com");
		websites.add("nullish.cafe24.com");
		websites.add("oracle.com");
		websites.add("facebook.com");
		websites.add("instagram.com");
		websites.add("youtube.com");
	}

//	private static void currentPage() {
//		System.out.println(websites.peek());
//	}

	private static void printList() {
		System.out.println("----최근 방문한 사이트 순 정렬");
		if (websites.size() > 0) {
			for (int i = websites.size() - 1; i > -1; i--) {
				System.out.println(websites.get(i));
			}
			
		} else {
			System.out.println(passedSites.peek());
		}
	}

	private static void nextSite() {
		try {
			System.out.print("뒤로 가기>>");
			websites.push(passedSites.pop());
			System.out.println(passedSites.peek());
			if (websites.size() < 0) throw new EmptyStackException();
		} catch (EmptyStackException e) {
			System.out.println("더 이상 방문할 사이트가 없습니다");
		} catch (Exception e) {
			System.out.println("문제가 있으니 사이트 관리자에게 연락주세요.");
		}
	}

	private static void PrevSite() {
		try {
			System.out.print("앞으로 가기>>");
			passedSites.push(websites.pop());
			System.out.println(websites.peek());

		} catch (EmptyStackException e) {
			System.out.println("더 이상 방문한 사이트가 없습니다");
		} catch (Exception e) {
			System.out.println("문제가 있으니 사이트 관리자에게 연락주세요.");
		}
	}

	private static void goToSite() {
			try {
				System.out.print("방문할 웹 사이트를 입력하세요 >> ");
				String visitSite = sc.nextLine();
				websites.push(visitSite);
				if (visitSite == null || visitSite.equals("")) {
					throw new AddressException();
				}	
			} catch (AddressException e) {
					System.out.println("주소를 정확히 입력해주세요.");
			} catch (Exception e) {
				System.out.println("문제가 있으니 사이트 관리자에게 연락주세요.");
			}
	}
}

class AddressException extends Exception {
	public AddressException() {
		
	}
	
	public AddressException(String msg) {
		super(msg);
	}
}
