import java.util.Arrays;

public class ArrayEx1 {

	public static void main(String[] args) {
		char[] charArr = new char[3];

				
		int a; // 오류 발생 => The local variable a may not have been initialized
		// 지역 변수는 초기화를 하지 않으면 사용하지 못홤
		int[] scores = new int[3]; // 객체는 자동 초기화됨
		System.out.println(scores); // 타입 @주소 => [I@15db9742 (바뀔 수 있음)
		System.out.println(Arrays.toString(scores)); // [0, 0, 0]
		
		String[] names = new String[5];
		System.out.println(names); // 타입 @주소 => [Ljava.lang.String;@4678c730
		
		boolean isOk[] = new boolean[2];
		System.out.println(isOk); // 타입 @ 주소 => [Z@7852e922

		// scores 배열의 요소에 값 할당
		scores[0] = 45;
		scores[1] = 23;
		scores[2] = 100;
//		scores[3] = 90; // runtime 오류 (실행 시에 에러 발생)
		// 배열의 범위에서 벗어남 => Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3	 at ArrayEx1.main(ArrayEx1.java:25)

		System.out.println(scores[2]);
		
		// 배열의 길이를 변경하는 법
		// 1. 더 큰 배열을 새로 생성
		// 2. 기존 배열의 내용을 새로운 배열에 복사
		
		scores = new int[4]; // 크기가 4인 베열을 생성 => 값들은 초기화됨
//		scores = new char[4]; // 오류 => Type mismatch: cannot convert from char[] to int[]
		// 같은 블럭 내에서는 다른 타입으로 할당이 불가
		
		// 배열의 각 요소에 값을 할당 할 때 아래와 같은 방법을 쓰면 편리
		int[] scores2 = {100, 20, 30, 55, 23}; // new 연산자가 없어도 {}안에 있는 값을 할당
		System.out.println(Arrays.toString(scores2));
		
		int[] scores3 = new int[] {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(scores3));
		
		int[] socres4;
		socres4 = new int[] {100, 200, 300}; // 생성 + 할당
//		scores4 = { 100, 200, 300}; // 오류 : new int[]를 생략 할 수 없다
		
		// 배열의 각 요소를 콘솔에 출력
		String[] heros = {"아이언맨", "스파이더맨", "스칼렛위치"};
		
		for (int i = 0; i < heros.length; i ++) {
			System.out.println(heros[i]);
		}
		
		for (String hero : heros) {
			System.out.println(hero);
		}
		
	}

}
