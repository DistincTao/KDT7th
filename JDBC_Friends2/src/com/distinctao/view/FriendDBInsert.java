package com.distinctao.view;

import java.sql.SQLException;
import java.util.Scanner;

import com.distinctao.dto.FriendDTO;
import com.distinctao.service.DuplicatedMobileCheckService;

public class FriendDBInsert {

	// 키보드로 부터 친구 정보를 입력 받자

	public static FriendDTO getFriendData() {

		String friend_name = null;
		String mobile = null;
		String addr = null;
		FriendDTO friend = null;
		Scanner sc = new Scanner(System.in);
		boolean duplicateResult = false;

		// 친구 정보 입력 받기
		do {
			System.out.println("저장할 친구 이름 >>>>");
			friend_name = sc.nextLine();
		} while (friend_name.equals(""));

		do {
			System.out.println("친구 전화번호 >>>>");
			mobile = sc.nextLine();

			// 중복 체크
			try {
				duplicateResult = DuplicatedMobileCheckService.getInstance().isDuplicateMobile(mobile);
				if (duplicateResult) {
					System.out.println("이미 등록된 번호입니다.");
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		} while (duplicateResult);

		System.out.println("친구 주소 >>>>");
		addr = sc.nextLine();

		friend = new FriendDTO(friend_name, mobile, addr);

		return friend;

	}
}