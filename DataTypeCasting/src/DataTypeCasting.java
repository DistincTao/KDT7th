	
public class DataTypeCasting {

	public static void main(String[] args) {
		byte b = 125;
		System.out.println(b);

		
		// 묵시적 (자동)형변환
		int i = b;
		System.out.println("i : " + i);
		
		float f = 1234; // => float f = (float) 1234;
		System.out.println(f);
		
		
		// 명시적 형변환
		int i1 = (int)3.14f;
		System.out.println(i1);
		
		// int -> byte
		int i2 = 300;  // 1 0 0 1 0 1 1 0 0
		byte b2 = (byte) i2; // 값손실 발생
		System.out.println(b2); // 44 => 0 0 1 0 1 1 0 0
		
		byte b3 = 100;
		byte b4 = b3;
		System.out.println(b4);
		
		int ii = 100;
		byte b5 = (byte) ii;
		System.out.println(b5);
		
		
		// Overflow
		short sMin = -32768;
		System.out.println((short)(sMin - 1)); // 담을 수 있는 최소의 수보다 하나 작을 수롤 기입하면 최대수를 반환 
		
		short sMax = 32767;
		System.out.println((short)(sMax + 1)); // 담을 수 있는 최대의 수보다 하나 큰 수를 기입하면 최소소를 반환
		
		// 명시적 형변환
		double pi = 3.141592;
		float fpi = (float) pi;
		System.out.println("fpi : " + fpi);
		
		int i3 = 32767;
		short s = (short)i3;
		System.out.println("s : " + s);
		
		long l = -2147483648;
		int i4 = (int)l;
		System.out.println("i4 : " + i4);
		
		int i5 = 32768;
		short s2 = (short)i5;
		System.out.println("s2 : " + s2);
		
		//
		char c = 'a';
		System.out.println(c);
		System.out.println((int)c);
		System.out.println((char)98);
	}

}
