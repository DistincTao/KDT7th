package thread;

public class WaitNotifyTest {

	public static void main(String[] args) {
		// 공유작업 객체 생성
		WorkObject workObject = new WorkObject();
		
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
		
	}

}
