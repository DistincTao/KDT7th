package com.distinctao.controller.service;

import java.sql.SQLException;

import com.distinctao.dao.FriendMngDao;
import com.distinctao.dao.FriendMngDaoImpl;
import com.distinctao.service.FriendManagementService;
import com.distinctao.view.FriendUpdate;

public class UpdateFriendMobileService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		FriendMngDao fmd = FriendMngDaoImpl.getInstance();
		FriendUpdate update = new FriendUpdate().updateAddr();
		fmd.updateMobile(update);
	}

}
