package com.distinctao.dto;

public class FriendDTO {
	private String friend_name;
	private String mobile;
	private String addr;
	
	 // 생성자
	public FriendDTO(String friend_name, String mobile, String addr) {
		this.friend_name = friend_name;
		this.mobile = mobile;
		this.addr = addr;
	}
	
	public String getFriend_name() {
		return friend_name;
	}

	public String getMobile() {
		return mobile;
	}

	public String getAddr() {
		return addr;
	}

	@Override
	public String toString() {
		return "이름 : " + friend_name + ", 전번 : " + mobile + ", 주소 : " + addr + "]";
	}
	
	
}
