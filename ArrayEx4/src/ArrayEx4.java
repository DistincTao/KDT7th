import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {

	public static void main(String[] args) {
		// 연습 문제
		// int 배열에 난수 20개를 넣어 놓고 (1 ~ 100 사이)
		// user에게 찾을 숫자를 입력을 받고,
		// 출력 : 찾는 값은 n번째에 있습니다.
		// 출력 : 찾는 값이 없습니다.
		
		// 1) 배열을 생성
		
		int [] array = new int [20];
		// 2) 난수 20개 생성 후 배열에 넣기
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println(Arrays.toString(array));
		
		// 3) 숫자를 입력받아서 저장
		
		Scanner sc = new Scanner (System.in);
		System.out.println("찾고 싶은 숫자를 입력하세요>>>");
		int num = sc.nextInt();

		// 4) 숫자 탐색

//		for (int i = 0; i < array.length; i ++) {
//			if (num == array[i]) {		
//			    System.out.println("찾는 값은 " + (i + 1) + "번째 있습니다.");
//			} else {
//				System.out.println("찾는 값이 없습니다.");
//			}
//		}
		
		boolean isFind = false;
		int i = 1;
		for ( int number : array) {
			if (num == number) {		
			    System.out.println("찾는 값은 " + i + "번째 있습니다.");
			    isFind = true;
			}
			i ++;
		}
		if (!isFind) {
			System.out.println("찾는 값이 없습니다.");
		}
	
	}


}
