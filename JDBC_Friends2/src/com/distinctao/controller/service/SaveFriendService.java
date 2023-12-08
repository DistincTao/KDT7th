package com.distinctao.controller.service;


import java.sql.SQLException;

import com.distinctao.dao.FriendMngDao;
import com.distinctao.dao.FriendMngDaoImpl;
import com.distinctao.dto.FriendDTO;
import com.distinctao.service.FriendManagementService;
import com.distinctao.view.FriendDBInsert;


public class SaveFriendService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		FriendMngDao fmd = FriendMngDaoImpl.getInstance();
		
		FriendDTO friend = FriendDBInsert.getFriendData();
		
		int friendNo = fmd.getNextFriend();
		int result = fmd.insertFriends(friendNo, friend);
		if (result == 1) {
			System.out.println(friend.getFriend_name() + "의 정보가 등록 되었습니다.");
		}
		

	}

}
