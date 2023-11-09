
public class OperationEx {

	public static void main(String[] args) {
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte b1 = 10;
		byte b2 = 20;
//		byte result2 = b1 + b2; // 에러 => Type mismatch: cannot convert from int to byte
		int result2 = b1 + b2; // int type으로 변환 후 연산
		System.out.println(result2);

		byte b3 = 10;
		int b4 = 100;
		long b5 = 1000;
		
//		int result3 = b3 + b4; // 허용 => 계산 가능
//		byte result3 = b3 + b4; // 에러
//		int result3 = b3 + b4 + b5; // 에러 => Type mismatch: cannot convert from long to int'
		
		// long 타입으로 변환 후 연산 필요
		long result3 = b3 + b4 + b5;
		System.out.println(result3);
		
		int i1 = 10;
		int result4 = i1 / 4; // 결과 값의 소수점이하를 버림
		System.out.println(result4);
		
		int i2 = 10;
//		double result5 = i2 / 4F;  // => i2 / 4D; 도 가능 (같은 값 나옴)
		double result5 = (float)i2 / 4; // 가능 => 모두 실수 연산이 가능
		System.out.println(result5);
		
		int i3 = 1;
		int i4 = 2;
//		int result6 = i3 / i4; // => 0
		double result6 = i3 / i4; // => 0.0
		System.out.println(result6);
		
		double result7 = (double)i3 / i4;
		System.out.println(result7);
		
	}

}
