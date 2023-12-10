package com.distinctao.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.distinctao.controller.service.OuputFriendByNameService;
import com.distinctao.service.FriendManagementService;

public class FriendDeleteByName {
	private int friend_No;

	public int deleData() throws ClassNotFoundException, SQLException {
		FriendManagementService fms = new OuputFriendByNameService();
		do {
			fms.toDo();
		} while (fms != null);

		System.out.println("삭제할 번호를 입력하세요 >>>");
		Scanner sc = new Scanner(System.in);
		friend_No = Integer.parseInt(sc.nextLine());

		return friend_No;

	}

}
