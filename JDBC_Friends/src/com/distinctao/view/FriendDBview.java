package com.distinctao.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.distinctao.controller.Action;
import com.distinctao.service.FriendManagementService;

public class FriendDBview {

	private static void outputMenu() {
		System.out.println("=============================================");
		System.out.println("================= 친구 관리 v1 ================");
		System.out.println("=============================================");
		System.out.println("== 1. 친구 조회 (전체 조회)");
		System.out.println("== 2. 친구 입력");
		System.out.println("== 3. 친구 조회 (이름)");
		System.out.println("== 4. 친구 조회 (전화번호)");
		System.out.println("== 5. 친구 정보 수정 (이름)");
		System.out.println("== 6. 친구 정보 수정 (전화번호)");
		System.out.println("== 7. 친구 정보 수정 (주소)");
		System.out.println("== 8. 친구 삭제");
		System.out.println("== 9. 종료");
		System.out.println("=============================================");
		System.out.print("메뉴 번호 입력 >>");

	}
	
	public static void main(String[] args) {
		
		while (true) {
			outputMenu();
			Scanner sc = new Scanner(System.in);
			int menu = sc.nextInt();
			
			
			FriendManagementService fms = Action.getInstance().getService(menu);
			try {
				fms.toDo();
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
//				e.printStackTrace();
				System.out.println("정보를 다시 확인 해주세요");
			}
		}


	}

}
