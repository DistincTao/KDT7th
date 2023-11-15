package member;

public class MemberClass {

	public static void main(String[] args) {
		Member member1 = new Member("둘리", "dooly");
		
		System.out.println(member1);
		
		Member member2 = new Member("홍길동", "hong");
		member2.setPassword("1234");
		
		Member.loginMessage(Member.login("hong", "1234"));
		Member.loginMessage(Member.login(member2));
		Member.loginMessage(Member.login(member1));
		Member.logout("hong");
		Member.logout(member2);
		Member.logout(member1);
		
		

	}

}
