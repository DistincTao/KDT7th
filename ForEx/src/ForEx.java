import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//*
//**
//***
//****
//*****
			
//		System.out.println("출력할 라인 수를 입력하세요>>>");
//		Scanner sc = new Scanner (System.in);
//		String tmp = sc.nextLine();
//		int num = 0;
//		num = Integer.parseInt(tmp);
//		
//		System.out.println(num);
		int num = 5;
		
		
		for (int i = 0; i < num; i ++) {
			for (int j = 0; j < i + 1 ; j++) {
			System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 구구단 2단부터 9단까지
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
//				System.out.printf("%d X %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
		
	
	}
	

}
