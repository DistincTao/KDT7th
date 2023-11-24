package MethodCreation;

public class MethodCreationEx {

	public static int add(int a, int b) { // static Method
//		outputNTimes("대한민국", 3); // non-static 메소드는 생성 불가능
		return a + b;
	}
	
	public float add(float a, float b) { // non-Static Method
		float result = 0f;
		result = a + b;
		return result;
	}
	
	// 메소드 오버로딩 
	public static int add (int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	public float add (int n, float m) {
		return n + m;
	}
	
	public void outputNTimes(String str, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(str);
		}
	}
	
	public void outputNTimes(float ft, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(ft);
		}
	}
	
	public static void main(String[] args) {
		// 
		int result = MethodCreationEx.add(4, 7); 
		// static method 호출 : 클래스명.메소드명
		System.out.println(result);
		
		System.out.println(add(300, 500));
		System.out.println(add(100, 200, 300));
		// 호출하는 곳과 호출되는 클래스가 같다면 메소드 호출 시 클래스명 생략 가능
		
		//static을 붙이지 않으면 객체 생성 후 메소드를 호출 해야한다!! 반드시!!
		MethodCreationEx mce = new MethodCreationEx ();
		float fResult = mce.add(3.14f, 5.67f);
		System.out.println(fResult);
		System.out.println(mce.add(3, 5f));
//		System.out.println(mce.add(3, 5)); //  오류가 나지는 않지만 추천 하지 않음 
		//The static method add(int, int) from the type MethodCreationEx should be accessed in a static way
		
		// 이름이 outputNTimes이고, 매개변수를 String 타입 변수 하나와 int 타입 하나를 받아서
		// 그 문자열을 화면에 n번 반복해서 출력하는 메소도 (인스턴스 메소드)를 만들고, 호출 하세요.
		mce.outputNTimes("안녕하세요", 3);
		mce.outputNTimes(3f, 5);
		
		// MyMath2 클래스 메소드 호출
		 MyMath2 mm2 = new MyMath2();
		 System.out.println(mm2.subtract(300, 400));
		 System.out.println(mm2.multiply(30, 50));
		 System.out.println(mm2.devide(6, 3));
	}

}

class MyMath2 {
	long subtract (long a, long b) {
		return a - b;
	}
	
	long multiply (long a, long b) {
		return a * b;
	}
	
	double devide (double a, double b) {
		return a / b;
	}
}