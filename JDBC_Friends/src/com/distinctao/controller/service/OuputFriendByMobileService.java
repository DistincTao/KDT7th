package com.distinctao.controller.service;

import java.sql.SQLException;
import java.util.List;

import com.distinctao.dao.FriendMngDao;
import com.distinctao.dao.FriendMngDaoImpl;
import com.distinctao.service.FriendManagementService;
import com.distinctao.vo.FriendVo;

public class OuputFriendByMobileService implements FriendManagementService {

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		FriendMngDao fmd = FriendMngDaoImpl.getInstance();
		List<FriendVo> list = fmd.selectByMobile();
		
		for (FriendVo f : list) {
			System.out.println(f.toString());
		}

	}

}
