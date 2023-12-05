package thread;

public class Thread_InterruptTest {

	public static void main(String[] args) {
		Thread pThread = new PrintThread();
		pThread.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		pThread.interrupt();
	}
}


class PrintThread extends Thread {
	
	@Override
	public void run() {
		try {
			while (true) {
				System.out.println("실행 중 ... .... ...");
				Thread.sleep(1);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("예외 발생!!!!");
		}
		System.out.println("리소스 정리 중 .. .. .. ");
		System.out.println("실행 종료!");
	}
}