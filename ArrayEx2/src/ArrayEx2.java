import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// 연습 문제
		// 거스름돈을 몇개 의 동전으로 지불 할 수 있는지 구하는 프로그램을 작성하세요.
		// 예) 거스름돈 money = 2680원이라고 하면
		// 출력 : 500원 짜리 5개 100원짜리 1개 50원 짜리 1개 10월 짜리 3개
		
//		2680원 / 500원 = 5 ... 180원 -> 500원 갯수  = (거스름돈 / 500 ) 의 몫
//		180원 / 100원 = 1 ... 80원 -> 100원 갯수  = (거스름돈 / 100 ) 의 몫
//		80원 / 50원 = 1 ... 30원 -> 50원 갯수 = 1	
//		30원 / 10원 = 3 ... 		
		
		
		Scanner sc = new Scanner (System.in);
		System.out.println("잔돈을 받을 금액을 입력하세요>>>");
		int money = sc.nextInt();
		
		int [] charge = new int[] {500, 100, 50, 10};
		int [] cnt = new int [4];
		
//		for (int i = 0; i < charge.length; i ++) {
//				cnt[i] = money / charge[i];
//				money %= charge[i];
//			}
//		System.out.println(charge[0] + "원 짜리 " + cnt[0] + "개 " + charge[1] + "원 짜리 " + cnt[1] + "개 " + charge[2] + "원 짜리 " + cnt[2] + "개 " + charge[3] + "원 짜리 " + cnt[3] + "개");	

		for (int coin : charge) {
			System.out.println(coin +"원짜리 동전: " + (money/coin) + "개");
			money %= coin;
		}
		

		
		// 69, 28, 91, 33, 99, 55, 95, 11, 44
		// int 배열에 넣고 최대 값과 최소 값을 구하세요
		
		int[] array = new int [] {69, 28, 91, 33, 99, 55, 95, 11, 44};
		int temp = ' ';
		for (int i = 0; i < array.length - 1; i ++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println("최대 값은 : " + array[0] + ", 최소 값은 : " + array[array.length - 1] );
		
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 1 ; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			} else if (array[i] <min) {
				min = array[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}

}
