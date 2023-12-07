package com.distinctao.dao;

import java.sql.SQLException;
import java.util.List;

import com.distinctao.vo.Friend;

public interface FriendMngDao {
	public abstract List<Friend> selectAllFriends() throws ClassNotFoundException, SQLException;
	public abstract void saveFriends() throws ClassNotFoundException, SQLException;
	public abstract List<Friend> selectByName() throws ClassNotFoundException, SQLException;
	public abstract List<Friend> selectByMobile() throws ClassNotFoundException, SQLException;
	public abstract void updateName() throws ClassNotFoundException, SQLException;
	public abstract void updateMobile() throws ClassNotFoundException, SQLException;
	public abstract void updateAddr() throws ClassNotFoundException, SQLException;
	public abstract void deleteFriend() throws ClassNotFoundException, SQLException;

}
