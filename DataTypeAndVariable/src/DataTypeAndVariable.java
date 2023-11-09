
public class DataTypeAndVariable {

	public static void main(String[] args) {
		// boolean : true 또는  false 를 저장하는 1byte
		boolean bool = true;
		System.out.println(bool);
		
		// char : 문자형 2byte 한문자만 저장할 수 있다.
		char character = '\u0041';
		System.out.println(character);
		char korChar = '가';
		System.out.println(korChar);
//		char character2 = 'AB'; => error 한글자만 넣어야 한다 / Invalid character constant
//		System.out.println(character2);
		
		// byte : 정수형 1byte
		byte b = 127;
		System.out.println(b);
		System.out.println("Byte타입의 최대 값:" + Byte.MAX_VALUE); // 최대값 : 127
		System.out.println("Byte타입의 최소 값:" + Byte.MIN_VALUE); // 최소값 : - 128
//		b = b + 1;
		System.out.println(b + 1);
		
		
		//short : 정수형 2byte
		short sInt = 128;
		System.out.println(sInt);
		System.out.println("Short타입의 최대 값" + Short.MAX_VALUE);
		System.out.println("Short타입의 최소 값" + Short.MIN_VALUE);
		
		// int : 정수형 4byte
		int i = 35;
		System.out.println(i);
		System.out.println("Int타입의 최대 값" + Integer.MAX_VALUE);
		System.out.println("Int타입의 최소 값" + Integer.MIN_VALUE);
		
		//long : 정수형, 8byte
		long l = 35; // 35L
		System.out.println(l);
		System.out.println("long타입의 최대 값" + Long.MAX_VALUE);
		System.out.println("long타입의 최소 값" + Long.MIN_VALUE);
		
		
		// float : 실수형, 4byte
		float f = 3.14f; // 3.14F
		System.out.println(f);	
		System.out.println("float타입의 최대 값" + Float.MAX_VALUE);
		System.out.println("float타입의 최소 값" + Float.MIN_VALUE);
		
		// double : 실수형, 8byte 
		double d = 3.14; // 3.14D
		System.out.println(d);	
		System.out.println("double타입의 최대 값" + Double.MAX_VALUE);
		System.out.println("double타입의 최소 값" + Double.MIN_VALUE);
		
		// 문자열 : 기본 데이터 타입이 아님, 참조 타입 : String
		// 두문자 이상의 문자열 : " " (큰따옴표) 사용
		
		String str = "대한민국";
		System.out.println(str);
		System.out.println("str의 길이 : " +str.length());
		System.out.println(str.getClass().getName());
		
		String str1 = "";
//		char ch = ''; //  char는 빈문자열로 초기화 할 수 없다. => Invalid character constant
		char ch = ' '; // 공백 문자 (blank)로 변수 ch를 초기화 가능
		
		//
		String name = "Ja" + "va";
		String str2 = name + 8.0;
		System.out.println(name);
		System.out.println(str2);
		System.out.println(8 + " " + "]");
		System.out.println(" " + 8);
		System.out.println(8 + 8 + ""); // 8 + 8 계산 후 문자열로 변환
		System.out.println("" + 8 + 8); // 문자열 변환 후  8 + 8
	}
	

}
