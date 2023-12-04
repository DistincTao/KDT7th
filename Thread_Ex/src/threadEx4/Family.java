package threadEx4;

public class Family implements Runnable{
	private String name;
	private Account acc = new Account(); // 가족은 가족통장을 가지고 있다.
	
	Family(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		// 가족들이 acc에서 돈을 인출
		while (this.acc.getBalance() > 0) {
			int money =(int)(Math.random() * 40000 / 100) * 100;
					
			if (this.acc.withdraw(money)) {
				System.out.println(this.name + "이/가 " + money + "원을 인출했습니다. 잔액 : " + this.acc.getBalance());
			}
			
		}
		
	}
	
}
