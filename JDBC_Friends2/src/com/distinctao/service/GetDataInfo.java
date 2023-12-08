package com.distinctao.service;

import java.sql.SQLException;

import com.distinctao.view.FriendSearchMobile;
import com.distinctao.view.FriendSearchName;

public class GetDataInfo{
	private static GetDataInfo instance;

	public GetDataInfo() {
	};

	public static GetDataInfo getInstance() {

		if (instance == null) {
			instance = new GetDataInfo();
		}
		return instance;
	}

	public String inputMobile() throws ClassNotFoundException, SQLException {
		new FriendSearchMobile();
		String data = FriendSearchMobile.getData();

		return data;
	}
	
	public String inputName() throws ClassNotFoundException, SQLException {
		new FriendSearchMobile();
		String data = FriendSearchName.getData();

		return data;
	}

}
