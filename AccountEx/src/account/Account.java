package account;

public class Account {
	// 계좌 번호 (String accNo)
	// 예금주 (String owner)
	// 잔액 (int balance)
	
	// 은행 계좌 객체인 Account 객체는 잔고(balance) 필드를 가지고 있다.
	// balance 필드는 음수 값이 될 수 없고, 최대 백만원 까지만 저장 할 수 있다.
	// 외부에서 balance 필드를 마음대ㅔ로 변경하지 못하도록 하고
	// 0 <= balance <=1000000 범위의 값만 가질 수 있도록 Account 클래스를 작성
	// getter와 setter이용
	// 0과 1000000은 MIN_BALANCE와 MAX_BALANCE 상수를 선언해서 사용
	// setter의 매개 값이 음수이거나 백만원을 초과하면 현재 balance 유지
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private String accNo;
	private String owner;
	private int balance;

		
	public Account(String accNo, String owner, int balance) {
		this.accNo = accNo;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAccNo() {
		return this.accNo;
	}

	public String getOwner() {
		return this.owner;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
//	public void setAccNo(String accNo) { // setter를 만들어주지 않으면 Read-Only
//		this.accNo = accNo;
//	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

//	public void setBalance(int money) {
//		if (this.balance + money <= MIN_BALANCE || this.balance + money >= MAX_BALANCE) {
//			this.balance += 0;
//		} else {
//			this.balance += money;
//		}
//	}
	
	public void setBalance(int balance) {
		if (balance < Account.MIN_BALANCE || balance > Account.MAX_BALANCE) {
			return;
		} 
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
}
