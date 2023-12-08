package com.distinctao.service;

import java.sql.SQLException;

import com.distinctao.dao.FriendMngDao;
import com.distinctao.dao.FriendMngDaoImpl;

public class DuplicatedMobileCheckService {
	private static DuplicatedMobileCheckService instance = null;

	public DuplicatedMobileCheckService() {};
	public static DuplicatedMobileCheckService getInstance() {
		if (instance == null) {
			instance = new DuplicatedMobileCheckService();
		}
		return instance;
	};
	
	public boolean isDuplicateMobile(String mobile) throws ClassNotFoundException, SQLException {
		System.out.println("전화 번호 중복 체크");
		boolean isDuplicate = false;
		FriendMngDao fmd = FriendMngDaoImpl.getInstance();
		//중복이 있으면 1을 반환
		if (fmd.getDuplicateMobile(mobile) == 1) {
			isDuplicate = true;
		}
		
		return isDuplicate;
	}
	

	
}
