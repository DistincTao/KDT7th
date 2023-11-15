package account;

import java.util.Scanner;

public class AccountEx {
	private static Account[] accountArr = new Account[100];
	private static Scanner sc = new Scanner(System.in);	

	public static void main(String[] args) {
		
		boolean repeat = true;
		while (repeat) {
			
			System.out.println("--------------------------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌 목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------");
			
			System.out.println("선택 >>>> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch (selectNo) {
			case 1 : 
				// 계좌 생성 메소드 호출
				createAccount();
				break;
			case 2 : 
				// 계좌 목록 메소드 호출
				accountList();
				break;
			case 3 : 
				// 예금 메소드 호출
				deposit();
				break;
			case 4 : 
				// 출금 메소드 호출
				withdraw();
				break;
			case 5 : 
				// 종료 메소드 호출
				System.exit(0);
				break;
			}
		}
	}
	
	private static void createAccount() {
		System.out.println("--------------------------------------------------");
		System.out.println("1. 계좌 생성");
		System.out.println("--------------------------------------------------");
		
		System.out.println("계좌 번호 입력 >>>");
		String accNo = sc.nextLine();
		
		System.out.println("예금주 입력 >>>");
		String owner = sc.nextLine();
		
		System.out.println("입금액 입력 >>>");
		int balance = Integer.parseInt(sc.nextLine());
		
		Account newAccount = new Account(accNo, owner, balance);
		System.out.println(newAccount.toString());
		
		// 생성된 account 객체를 배열에 넣시
		for (int i = 0; i < accountArr.length; i++) {
			if (accountArr[i] == null) {
				accountArr[i] = newAccount;
				break;
			}
		}
	}
	
	private static void accountList() {
		System.out.println("--------------------------------------------------");
		System.out.println("2. 계좌 조회");
		System.out.println("--------------------------------------------------");
		System.out.println("계좌 번호 \t 예금주 \t 잔액");
		
		for (int i = 0; i < accountArr.length; i++) {
			if (accountArr[i] != null) {
				System.out.print(accountArr[i].getAccNo() + "\t");
				System.out.print(accountArr[i].getOwner() + "\t");
				System.out.print(accountArr[i].getBalance() + "\t");
				System.out.println();
			}

		}
	}
	
	private static void deposit() {
		System.out.println("--------------------------------------------------");
		System.out.println("3. 입금");
		System.out.println("--------------------------------------------------");
		
		System.out.println("계좌 번호 입력 >>>");
		String accNo = sc.nextLine();
		System.out.println("입금액 입력 >>>");
		int money = Integer.parseInt(sc.nextLine());
//		for (int i = 0; i < accountArr.length; i++) {
//			if (accountArr[i] != null && accountArr[i].getAccNo().equals(accNo)) {
//				accountArr[i].setBalance(money);
//			} 
//			
//		}
		Account account = findAccount(accNo);
		
		if (account != null) {
			if (account.getBalance() + money > 1000000) {
				System.out.println("입금 한도 초과");
			} else {
				account.setBalance(account.getBalance() + money);
				System.out.println("입금 완료");
			}
		} else {
			System.out.println("계좌가 존재하지 않습니다.");
		}
	}
	
	private static void withdraw() {
		System.out.println("--------------------------------------------------");
		System.out.println("4. 출금");
		System.out.println("--------------------------------------------------");
		
		System.out.println("계좌 번호 입력 >>>");
		String accNo = sc.nextLine();
		System.out.println("출금액 입력 >>>");
//		int money = -Integer.parseInt(sc.nextLine());
		int money = Integer.parseInt(sc.nextLine());
		
//		for (int i = 0; i < accountArr.length; i++) {
//			if (accountArr[i] != null && accountArr[i].getAccNo().equals(accNo)) {
//				accountArr[i].setBalance(money);
//			} 
//		}
		Account account = findAccount(accNo);
		
		if (account != null) {
			if (account.getBalance() - money < 0) {
				System.out.println("잔액 부족");
			} else {
				account.setBalance(account.getBalance() - money);
				System.out.println("출금 완료");
			}
		} else {
			System.out.println("계좌가 존재하지 않습니다.");
		}
	}
	
	private static Account findAccount(String accNo) {
		Account account = null;
		for (int i = 0; i < accountArr.length; i++) {
			if (accountArr[i] != null) {
				String savedAccNo = accountArr[i].getAccNo();
				if (savedAccNo.equals(accNo)) {
					account = accountArr[i];
					break;
				}
			}
		}
		return account;
	}
}
