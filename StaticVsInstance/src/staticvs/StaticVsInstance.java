package staticvs;

public class StaticVsInstance {

	static int sInt; // static 맴버 변수 (명시적 초기화)
	int iInt;		 // Instance 맴버 변수
	
	{	// instance 변수 초기화 블럭
		System.out.println("iInt의 초기 값 : " + iInt);
		iInt = 5;
		System.out.println("instance 초기화 블럭 {  }");
	}
	
	static { // static 맴버 초기화 블럭
		System.out.println("sInt의 초기 값 : " + sInt);
		sInt = 100;
		System.out.println("static 초기화 블럭 {  }");
	}
	
	public StaticVsInstance() {
		System.out.println("생성자");
	}
	
	public void acc() {
		sInt++;
		this.iInt++;
		
		System.out.println("no : " + this.hashCode() + ", sInt : " + StaticVsInstance.sInt + ", iInt : " + this.iInt);
	}
	
//	public StaticVsInstance() {
//		
//	}
	
	
	public static void main(String[] args) {
		// 코드를 타이핑하고 static 과 instance의 차이점을 구별해 보기
		
		for  (int i = 0; i < 10; i++) {
			StaticVsInstance svi = new StaticVsInstance ();
			svi.acc();
		}
		

		

	}

}
