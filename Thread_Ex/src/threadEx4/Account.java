package threadEx4;

public class Account {
	private int balance = 1000000;
	
	public int getBalance() {
		return this.balance;
	}
	
//	public synchronized Boolean withdraw(int money) {
//		boolean result = false;
//		
//		if (this.balance >= money) {
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			this.balance -= money;
//			result = true;
//		}
//		return result;
//	}
	
	
	public  Boolean withdraw(int money) {
		boolean result = false;
		
		synchronized (this) {
			if (this.balance >= money) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				this.balance -= money;
				result = true;
			}
		}
		return result;
	}
	
	
	
}
