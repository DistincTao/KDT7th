package thread;

public class ThreadTest5 {
	
	public static void main (String[] args) {
		yThread th1 = new yThread("-");
		yThread th2 = new yThread("|");
		yThread th3 = new yThread("X");


		th1.start();
		th2.start();
		th3.start();

		
		try {
			Thread.sleep(2000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(2000);
			th1.resume();
			Thread.sleep(2000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


class yThread implements Runnable {
	Boolean stopped = false;
	Boolean suspended = false;
	
	Thread th;
	yThread(String name) {
		th = new Thread(this, name); // Thread (Runnable target, String name);
	}
	
	public void start() {
		th.start();
	}
	
	public void stop() {
		stopped = true;
		th.interrupt();
		System.out.println(th.getName() + " interrupt() by stop()");
	}
	
	public void suspend() {
		suspended = true;
		th.interrupt();
		System.out.println(th.getName() + " interrupt() by suspend()");
	}
	
	public void resume() {
		suspended = false;
	}
	
	@Override
	public void run() {
		String name = th.getName();
		
		while (!stopped) { // 중지가 되지 않은 상황에서 반복 실행
			if (!suspended) { // 중단되지 않은 상황에서 실행
				System.out.println(name);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 				
			} else { // suspend가 된 상황
				Thread.yield(); // 다른 Thread에게 양보
			}
		}
		System.out.println(name + "(Stopped) 중지 되었습니다.");
	}
	
}