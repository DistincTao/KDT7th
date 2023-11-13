
public class MethodCreationEx1 {

	static void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i ++) {
			if (i < arr.length - 1) {
				System.out.print(arr[i] + ", ");
			} else {
			System.out.print(arr[i]);
			}
		}
		System.out.print("]");
		System.out.println();
	}
	
	static void sortArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = ' ';
			for (int j = 0; j < arr.length - 1 - i; j++ ) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
	}
	
	static int sumArr(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		// 크기가 6인 int 배열을 임의의 수로 생성
		int[] arr = {10, 4, 6, 7, 2, 1};

		
		// 메소드1 : 배열을 출력하는 메소드를 static으로 만들고, 호출
		// 메소드2 : 위의 배열을 오름 차순 정렬하는 메소드를 만들고, 정렬된 배열을 출력
		// 메소드3 : 배열의 총 합을 구하는 메소드를 만들고, 총합을 출력
		printArr(arr);
		sortArr(arr);
		printArr(arr);
		
		int resultSum = sumArr(arr);
		System.out.println("배열의 총합은 : " + resultSum);
		

		
	
		
		
		
		
		
		


	}

}
