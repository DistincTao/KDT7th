package exception;

public class ExceptionTest4 {

	public static void method1() {
		boolean isSuccess = true;
		
		try {
			System.out.println("\t method1 : 로직 처리");
			if (isSuccess) {
				System.out.println("\t method1 : 실행");
				return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("\t method1 : 필수 로직 처리 완료");
	}
	
	public static void method2() {
		boolean isSuccess = true;
		
			try {
				System.out.println("\t method2 : 로직 처리");
				if (isSuccess) {
					System.out.println("\t method2 : 실행");
					return;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally { // 예외와 관계없이 사용해야할 필수 로직은 finally에 작성!!!!
				System.out.println("\t method2 : 필수 로직 처리 완료");
			}
		
	}
	
	public static void main(String[] args) {
		System.out.println("method1() 호춣");
		method1();
		System.out.println("method2() 호춣");
		method2();
		
	}

}
