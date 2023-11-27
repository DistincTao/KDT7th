package exception;

public class ChainedTest {

	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("설치를 종료합니다.");

	}

	static void install() throws InstallException {
		 try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			System.out.println("ERROR : " + e.getMessage());
			InstallException ie = new InstallException("설치 중 예외 발생 : 공간을 확보 후에 다시 설치 하세요");
//			Throwable initCause (Throwable cause) // 지정한 예외를 원인 예외로 등록
//			Throwable getCause() // 원인 예외를 반환
			ie.initCause(e);
			ie.getCause();
			throw ie;
		} catch (MemoryException e) {
			System.out.println("ERROR : " + e.getMessage());
			
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

	static void startInstall() throws SpaceException, MemoryException, RuntimeException {
		System.out.println("설치를 시작합니다.");
		if(!enoughSpace()) {
			throw new SpaceException ("디스크 공간이 부족합니다.");
		};
		
		if(!enoughMemory()) {
//			throw new MemoryException ("메모리가 부족합니다.");
			throw new RuntimeException (new MemoryException("메모리가 부족합니다."));
		}
	}

	static void copyFiles() throws MemoryException {
		System.out.println("파일을 복사합니다.");	
	}

	static boolean enoughSpace() {
		return true;
	}
	
	static boolean enoughMemory() {
		return false;
	}
	
}


class InstallException extends Exception {
	// 사용자 정의 예외 클래스
	InstallException(String msg) {
		super(msg);
	}
}

class SpaceException extends Exception {
	// 사용자 정의 예외 클래스
	SpaceException(String msg) {
		super(msg);
	}
}

class MemoryException extends Exception {
	// 사용자 정의 예외 클래스
	MemoryException(String msg) {
		super(msg);
	}
}