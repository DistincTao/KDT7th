package threadEx1;

class ThreadInheritance extends Thread {

	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			System.out.println(this.getName() + ", i = " + i);
		}
		
	}
}

class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ", i = " + i);
		}
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class Thread_Ex1 {

	public static void main(String[] args) {
		// 스레드 객체 생성
		// 1) Thread 클래스를 상속 받아서 구현한 클래스
		ThreadInheritance t1 = new ThreadInheritance();

		// 2) Runnable 인터페이스를 구현한 클래스
		ThreadRunnable r = new ThreadRunnable();
		Thread t2 = new Thread(r);
		
		// 우선순위 결정 (실행 전에 설정) => 우선 순위에 대한 보장은 없음 (지정한 데로 따르지 않을 수 있음)
//		t1.setPriority(Thread.MAX_PRIORITY); // 최대 값 상수 => 10
//		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // 최소값 상수 => 1
		
		t1.start();
		t2.start();


		try {
//			t1.sleep(2000); // sleep()은 static 메소드 이므로 이렇게 사용 안함
			Thread.sleep(2000); // 항상 현재 실핼 중인 스레드에 동작 (현재 : main 스레드)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + ", i = " + i);
		}
	}

}
