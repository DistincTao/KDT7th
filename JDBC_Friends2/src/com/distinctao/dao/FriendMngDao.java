package com.distinctao.dao;

import java.sql.SQLException;
import java.util.List;

import com.distinctao.controller.service.DeleteFriendService;
import com.distinctao.dto.FriendDTO;
import com.distinctao.view.FriendDeleteByName;
import com.distinctao.view.FriendUpdate;
import com.distinctao.vo.FriendVo;

public interface FriendMngDao {
	public abstract List<FriendVo> selectAllFriends() throws ClassNotFoundException, SQLException;
	public int getNextFriend() throws ClassNotFoundException, SQLException;
	public abstract int insertFriends(int friendNo, FriendDTO friend) throws ClassNotFoundException, SQLException;
	public abstract List<FriendVo> selectByName(String friend_Name) throws ClassNotFoundException, SQLException;
	public abstract List<FriendVo> selectByMobile(String mobile) throws ClassNotFoundException, SQLException;
	public abstract void updateName(FriendUpdate update) throws ClassNotFoundException, SQLException;
	public abstract void updateMobile(FriendUpdate update) throws ClassNotFoundException, SQLException;
	public abstract void updateAddr(FriendUpdate update) throws ClassNotFoundException, SQLException;
	public abstract void deleteFriend(int friend_No) throws ClassNotFoundException, SQLException;
	public abstract void deleteAllFriend() throws ClassNotFoundException, SQLException;
	public abstract int getDuplicateMobile(String mobile) throws ClassNotFoundException, SQLException;
}
