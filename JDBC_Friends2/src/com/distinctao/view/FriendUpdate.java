package com.distinctao.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.distinctao.controller.service.OuputFriendByNameService;
import com.distinctao.service.FriendManagementService;

public class FriendUpdate {
	public static String newName;
	public static String newMobile;
	public static String newAddr;
	public static int friend_No;

	public static FriendUpdate updateNameInfo() throws ClassNotFoundException, SQLException {

		FriendUpdate update = new FriendUpdate();
		FriendManagementService fms = new OuputFriendByNameService();
		do {
			fms.toDo();
		} while (fms != null);
		
		System.out.println("수정하고 싶은 친구의 번호를 입력하세요 >>>");
		Scanner sc = new Scanner(System.in);
		friend_No = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 이름을 입력하세요 >>>");
		newName = sc.nextLine();

		return update;
	}

	public static FriendUpdate updateMobileInfo() throws ClassNotFoundException, SQLException {
		FriendUpdate update = new FriendUpdate();
		FriendManagementService fms = new OuputFriendByNameService();
		do {
			fms.toDo();
		} while (fms != null);
		
		System.out.println("수정하고 싶은 친구의 번호를 입력하세요 >>>");
		Scanner sc = new Scanner(System.in);
		friend_No = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 전화번호를 입력하세요 >>>");
		newMobile = sc.nextLine();

		return update;

	}

	public static FriendUpdate updateAddrInfo() throws ClassNotFoundException, SQLException {
		FriendUpdate update = new FriendUpdate();
		FriendManagementService fms = new OuputFriendByNameService();
		do {
			fms.toDo();
		} while (fms != null);
		
		System.out.println("수정하고 싶은 친구의 번호를 입력하세요 >>>");
		Scanner sc = new Scanner(System.in);
		friend_No = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 주소를 입력하세요 >>>");
		newAddr = sc.nextLine();
		return update;

	}
}
