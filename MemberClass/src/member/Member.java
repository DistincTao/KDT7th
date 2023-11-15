package member;

public class Member {
	// 인스턴스 변수 선언
	String name;
	String id;
	String password;
	int age;

	// 생성자 만들기
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member () {}
	
	
	public void setPassword(String password) {
		this.password = password;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
//	public boolean login(String id, String password) {
//		if (id == "hong" && password == "1234") {
//			System.out.println("로그인 되었습니다.");
//			return true;
//		} else {
//			System.out.println("아이디나 비밀번호가 틀렸습니다.");
//			return false;
//		}
//	}
//	
//	public void logout(String id) {
//		System.out.println(id + "님이 로그아웃 되었습니다.");
//	}
	
	public static boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("1234")) {
//			System.out.println("로그인 되었습니다.");
			return true;
		} else {
//			System.out.println("아이디나 비밀번호가 틀렸습니다.");
			return false;
		}
	}

	public static boolean login(Member m) {
		if (m.id.equals("hong") && m.password.equals("1234")) {
//			System.out.println("로그인 되었습니다.");
			return true;
		} else {
//			System.out.println("아이디나 비밀번호가 틀렸습니다.");
			return false;
		}
	}
	
	public static void loginMessage(boolean b) {
		if (b) {
			System.out.println("로그인 되었습니다.");
		} else {
			System.out.println("아이디나 비밀번호가 틀렸습니다.");
		}
	}
	
	public static void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
	public static void logout(Member m) {
		System.out.println(m.id + "님이 로그아웃 되었습니다.");
	}
}
