package com.distinctao.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.distinctao.controller.service.OuputFriendByNameService;
import com.distinctao.service.FriendManagementService;

public class FriendUpdate {
	public String friend_Name;
	public String newName;
	public String mobile;
	public String addr;
	public int friend_No;
	
	public FriendUpdate updateName() throws ClassNotFoundException, SQLException {
		FriendUpdate update = new FriendUpdate();
		FriendManagementService fms = new OuputFriendByNameService();
		fms.toDo();
		System.out.println("수정하고 싶은 친구의 번호를 입력하세요 >>>");
		Scanner sc = new Scanner(System.in);
	    friend_No = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 이름을 입력하세요 >>>");
		newName = sc.nextLine();
		
		return update;

	}
	
	public FriendUpdate updateMobile() throws ClassNotFoundException, SQLException {
		FriendUpdate update = new FriendUpdate();
		FriendManagementService fms = new OuputFriendByNameService();
		fms.toDo();
		System.out.println("수정하고 싶은 친구의 번호를 입력하세요 >>>");
		Scanner sc = new Scanner(System.in);
	    friend_No = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 전화번호를 입력하세요 >>>");
		mobile = sc.nextLine();
		
		return update;

	}
	
	public FriendUpdate updateAddr() throws ClassNotFoundException, SQLException {
		FriendUpdate update = new FriendUpdate();
		FriendManagementService fms = new OuputFriendByNameService();
		fms.toDo();
		System.out.println("수정하고 싶은 친구의 번호를 입력하세요 >>>");
		Scanner sc = new Scanner(System.in);
	    friend_No = Integer.parseInt(sc.nextLine());
		System.out.print("변경할 주소를 입력하세요 >>>");
		addr = sc.nextLine();
		return update;

	}
}
