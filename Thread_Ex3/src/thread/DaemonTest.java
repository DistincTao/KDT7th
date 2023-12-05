package thread;

public class DaemonTest {

	public static void main(String[] args) {
		
		AutoSaveThread saveThread = new AutoSaveThread();
		saveThread.setDaemon(true);
		saveThread.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 종료");
		System.out.println(saveThread.isDaemon());
	}
	
}

class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 문서 자동 저장 완료");
	}

	@Override
	public void run() {
		
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			
			save();
		}

	}
	
	
}