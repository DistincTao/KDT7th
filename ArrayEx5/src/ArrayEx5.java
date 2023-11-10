
import java.util.Arrays;

public class ArrayEx5 {

	public static void main(String[] args) {
		// shuffle 
		// int 배열에 0부터 9까지 차례대로 넣고 섞어서 섞인 배열을 출력 
		
		int[] arr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
	
		System.out.println("셔플 전 : " + Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			int index = (int)(Math.random() * 10);
			int temp = arr[0];
			arr[0] = arr[index];
			arr[index] = temp;
			
		}
		System.out.println("셔플 후 : " + Arrays.toString(arr));
		
		
		// 1 ~ 45 사이의 로또 번호 6개를 중복 없이
		int [] lotto = new int [6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto [i] = (int)(Math.random () * 45 + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
				i--;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
		
	}

}
