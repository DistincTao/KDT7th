package com.distinctao.view;

import java.util.Scanner;

public class FriendSearchMobile {

	public static String getData() {
		System.out.println("전화번호를 입력하세요 >>>");
		Scanner sc = new Scanner (System.in);
		String data = sc.nextLine();
		
		return data;
	}
}
