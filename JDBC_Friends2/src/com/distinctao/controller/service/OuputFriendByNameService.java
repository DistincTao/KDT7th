package com.distinctao.controller.service;

import java.sql.SQLException;
import java.util.List;

import com.distinctao.dao.FriendMngDao;
import com.distinctao.dao.FriendMngDaoImpl;
import com.distinctao.service.FriendManagementService;
import com.distinctao.service.GetDataInfo;
import com.distinctao.vo.FriendVo;

public class OuputFriendByNameService implements FriendManagementService {

	public List<FriendVo> list;
	public boolean isEmpty;

	@Override
	public void toDo() throws ClassNotFoundException, SQLException {
		isEmpty = false;
		FriendMngDao fmd = FriendMngDaoImpl.getInstance();
		String data = GetDataInfo.getInstance().inputName();
		list = fmd.selectByName(data);

		
		if (list == null) {
			System.out.println("조회할 정보가 업습니다.");
			isEmpty = true;
		} else {
			for (FriendVo f : list) {
				System.out.println(f.toString());
			}

		}
	}
}
