package threadEx3;

class SumThread extends Thread {
	public int sum;
	
	public SumThread (String name) {
		super.setName(name);
	}
	
	public int getSum() {
		return this.sum;
	}
	
	@Override
	public void run() {
		System.out.println("sum 실행 중 ............");
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
	
}

public class ThreadJoinTest {
	public static void main (String [] args) {
		
		// 스레드 생성
		SumThread sTread = new SumThread("sum-Thread");
		
		// 스레드 Runnable 상태로 전환
		sTread.start();

		try {
			sTread.join(); // main 스레드는 일시 정지 상태에 있으면서, sThread 가 계산을 마칠 떄 까지 기다림
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		System.out.println("1 ~ 100까지의 합 : " + sTread.getSum());
	}

}
