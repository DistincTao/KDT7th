import java.util.Arrays;

public class ArrayEx6 {

	public static void main(String[] args) {
		// 버블 정렬 -> 바로 옆의 수와 비교하여 정렬
		// 0~9까지의 수를 랜덤하게 int 배열에 넣어 보고
		// 버블 정렬을 이용하여 오름차순 정렬을 해보자
		
		int[] arr = new int [10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
			for (int j = 0; j < i; j ++) {
				if (arr[i] == arr[j]) {
					i--;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length - 1 ; i++) {
			boolean isSort = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
					isSort = true;
				}
		
			}
			if (!isSort) break;
		}
		System.out.println(Arrays.toString(arr));



		
	}

}
