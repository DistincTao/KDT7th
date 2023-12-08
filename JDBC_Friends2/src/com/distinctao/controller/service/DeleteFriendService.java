package com.distinctao.controller.service;

import java.sql.SQLException;

import com.distinctao.dao.FriendMngDao;
import com.distinctao.dao.FriendMngDaoImpl;
import com.distinctao.service.FriendManagementService;
import com.distinctao.view.FriendDeleteByName;

public class DeleteFriendService implements FriendManagementService {

	public int friend_No;

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		FriendMngDao fmd = FriendMngDaoImpl.getInstance();
		int friend_No= new FriendDeleteByName().deleData();
		
		fmd.deleteFriend(friend_No);
	}

}
