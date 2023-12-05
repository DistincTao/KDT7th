package thread;

import javax.swing.JOptionPane;

public class Thread_InterruptTest2 {

	public static void main(String[] args) {
		ThreadInterrupt thI = new ThreadInterrupt();
		thI.start();
		
		String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
		System.out.println("입력값 : " + input);
		
		thI.interrupt(); // interrupt() 를 호출하면 isInterrupt()상태가 true로 반환
		System.out.println("ThreadInterrupt >> isInterrupted() : " + thI.isInterrupted());
		System.out.println("main Thread >> interrupted() : " + Thread.interrupted()); // main Thread 가 interrupt 되었는지 확인
		
		// isInterrupted() : interrupt 된 상태 여부
		// interrupted() : interrupt()가 호출 되었는지 여부 (한번 호출 되면, false로 초기화)

	}

}

class ThreadInterrupt extends Thread {
	
	@Override
	public void run() {
		int i = 10;
		
		while (i != 0 && !isInterrupted()) {
			System.out.println(i--);
			for (long x = 0; x < 25000000000L; x++) ; // 지연
		}
		
		System.out.println("ThreadInterrupt >> isInterrupted() : " + this.isInterrupted());
		System.out.println("ThreadInterrupt >> interrupted() : " + Thread.interrupted()); // true
		System.out.println("ThreadInterrupt >> interrupted() : " + Thread.interrupted()); // false로 초기화

	}
}