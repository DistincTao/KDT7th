package com.distinctao.view;

import java.util.Scanner;

public class FriendSearchName {

	public static String getData() {
		System.out.println("이름을 입력하세요 >>>");
		Scanner sc = new Scanner (System.in);
		String data = sc.nextLine();
		
		return data;
	}
}
