package threadEx2;

import javax.swing.JOptionPane;


class NewThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(Thread.currentThread().getName() + ", 번호 : " + i );
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Thread_Ex2 {

	public static void main(String[] args) {
		
		NewThread nt = new NewThread();
		nt.start();
		
		String input = JOptionPane.showInputDialog("아무값이나 입력하시오");
		System.out.println("입력값은 " + input + "입니다.");
//		

		
		
//		for (int i = 0; i < 50; i++) {
//			System.out.println(Thread.currentThread().getName() + ", 번호 : " + i );
//			
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

	}

}
