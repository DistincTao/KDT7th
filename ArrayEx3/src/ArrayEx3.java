import java.util.Arrays;
public class ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] charArray = new char [] {'a', 'b', 'c'};
		
		System.out.println("변경 전 원본 배열 : " + Arrays.toString(charArray));
		
		// 원본 배열을 복사 ( deep copy - 깊은 복사)
		char [] copyCharArray = new char [charArray.length];
		
		int i = 0;
		for (char c : charArray) {
			copyCharArray [i] = c;
			i++;
		}
		
		System.out.println("변경 전 사본 배열 : " + Arrays.toString(copyCharArray));
		
		System.out.println("원본 배열의 주소 값 : " + charArray.hashCode());
		System.out.println("사본 배열의 주소 값 : " + copyCharArray.hashCode());
		System.out.println(charArray == copyCharArray); // false => 배열 변수에 담긴 배열 객체의 주소 값이 같은가??
		// hashCode 값이 다르면 다를 객채로 봄
		
		// 원본의 1번째 요소의 값을 변경해보자
		charArray [1] = 'B';
		System.out.println("변경 후 원본 배열 : " + Arrays.toString(charArray));
		System.out.println("변경 후 사본 배열 : " + Arrays.toString(copyCharArray));
		
		System.out.println(charArray == copyCharArray);
		
		
		// (shallow copy - 얕은 복사)
		
		String [] heroes = new String [] {"아이언맨", "캡틴아메리카노", "헐크"};
		System.out.println("변경 전 원본 배열 : " + Arrays.toString(heroes));
		
		String [] copyHeroes = heroes;
		System.out.println("변경 전 사본 배열 : " + Arrays.toString(copyHeroes));
		System.out.println("원본 배열의 주소 값 : " + heroes.hashCode());
		System.out.println("사본 배열의 주소 값 : " + copyHeroes.hashCode());
		
		// 원본 배열의 값을 변경
		heroes [1] = "캡틴라떼";
		System.out.println("변경 후 원본 배열 : " + Arrays.toString(heroes));
		System.out.println("변경 후 사본 배열 : " + Arrays.toString(copyHeroes));
		
		// 사본 배열의 값을 변경
		copyHeroes[0] = "토르";
		System.out.println("변경 후 원본 배열 : " + Arrays.toString(heroes));
		System.out.println("변경 후 사본 배열 : " + Arrays.toString(copyHeroes));
		
		//==============================================================================
		
		System.out.println("------------------------- String -------------------------");
		
		String str1 = "대한민국"; // 문자열 리터럴
		String str2 = "대한민국";
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		if (str1 == str2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		if (str1.equals(str2)) {
			System.out.println("값이 같은 문자");
		} else {
			System.out.println("값이 다른 문자");
		}
		
		String str3 = new String ("대한민국");
		String str4 = new String ("대한민국");
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		if (str3 == str4) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}
		
		if (str3.equals(str4
				)) {
			System.out.println("값이 같은 문자");
		} else {
			System.out.println("값이 다른 문자");
		}
		
	}

}
