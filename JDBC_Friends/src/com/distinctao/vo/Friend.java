package com.distinctao.vo;

public class Friend {
	private int friend_no;
	private String friend_name;
	private String mobile;
	private String addr;
	

	 // 생성자
	public Friend(int friend_no, String friend_name, String mobile, String addr) {
		this.friend_no = friend_no;
		this.friend_name = friend_name;
		this.mobile = mobile;
		this.addr = addr;
	}


	public int getFriend_no() {
		return friend_no;
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

	public void setFriend_name(String friend_name) {
		this.friend_name = friend_name;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "번호 : " + friend_no + ", 이름 : " + friend_name + ", 전번 : " + mobile + ", 주소 : "
				+ addr;
	}
	
	
	
	
}
