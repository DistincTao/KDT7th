package com.distinctao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.distinctao.controller.service.DeleteFriendService;
import com.distinctao.dto.FriendDTO;
import com.distinctao.view.FriendDeleteByName;
import com.distinctao.view.FriendUpdate;
import com.distinctao.vo.FriendVo;

public class FriendMngDaoImpl implements FriendMngDao {
	private static FriendMngDaoImpl instance = null;
	Scanner sc = new Scanner(System.in);

	private FriendMngDaoImpl() {
	};

	public static FriendMngDaoImpl getInstance() {
		if (instance == null) {
			instance = new FriendMngDaoImpl();
		}
		return instance;
	}

	@Override
	public List<FriendVo> selectAllFriends() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FriendVo> list = new ArrayList<>();

		if (con != null) {
			String sql = "SELECT * FROM FRIENDS ORDER BY FRIEND_NO";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new FriendVo(rs.getInt("FRIEND_NO"), rs.getString("FRIEND_NAME"), rs.getString("MOBILE"),
						rs.getString("ADDR")));
			}

			DBConnection.close(rs, pstmt, con);
		}

		return list;
	}

	@Override
	public int getNextFriend() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		if (con != null) {
			String sql = "SELECT MAX(FRIEND_NO) AS MAX_NO FROM FRIENDS";
//			String sql = "SELECT MAX(FRIEND_NO) FROM FRIENDS";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				result = rs.getInt("MAX_NO") + 1;
//				result = rs.getInt(1) + 1;
			}
		}
		DBConnection.close(rs, pstmt, con);

		return result;
	}

	@Override
	public int getDuplicateMobile(String mobile) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		int result = 0;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		if (con != null) {
			String sql = "SELECT COUNT(*) FROM FRIENDS WHERE MOBILE = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				result = rs.getInt(1);
			}
		}
		DBConnection.close(rs, pstmt, con);

		return result;
	}

	@Override
	public int insertFriends(int friendNo, FriendDTO friend) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int result = 0;

		if (con != null) {
			String sql = "INSERT INTO FRIENDS VALUES (?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, friendNo);
			pstmt.setString(2, friend.getFriend_name());
			pstmt.setString(3, friend.getMobile());
			pstmt.setString(4, friend.getAddr());
			result = pstmt.executeUpdate();

			DBConnection.close(pstmt, con);
		}
		return result;
	}

	@Override
	public List<FriendVo> selectByName(String friend_Name) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FriendVo> list = new ArrayList<>();

		if (con != null) {
			String sql = "SELECT * FROM FRIENDS WHERE FRIEND_NAME = ? ORDER BY FRIEND_NO";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, friend_Name);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new FriendVo(rs.getInt("FRIEND_NO"), rs.getString("FRIEND_NAME"), rs.getString("MOBILE"),
						rs.getString("ADDR")));
			}

			DBConnection.close(rs, pstmt, con);
		}

		return list;
	}

	@Override
	public List<FriendVo> selectByMobile(String mobile) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<FriendVo> list = new ArrayList<>();

		if (con != null) {
			String sql = "SELECT * FROM FRIENDS WHERE MOBILE = ? ORDER BY FRIEND_NO";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			rs = pstmt.executeQuery();

			if (!rs.next()) {
				System.out.println("조회할 정보가 없습니다.");
			} else {
				while (rs.next()) {
					list.add(new FriendVo(rs.getInt("FRIEND_NO"), rs.getString("FRIEND_NAME"), rs.getString("MOBILE"),
							rs.getString("ADDR")));
				}
			}

			DBConnection.close(rs, pstmt, con);
		}
		return list;
	}

	@Override
	public void updateName(FriendUpdate update) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;

		if (con != null) {
			String sql = "UPDATE FRIENDS SET FRIEND_NAME = ? WHERE FRIEND_NO = ? AND FRIEND_NAME = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, update.newName);
			pstmt.setInt(2, update.friend_No);
			pstmt.setString(3, update.friend_Name);
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println(update.friend_Name + "의 이름이 " + update.newName + "로 변경 되었습니다.");
			}

		}
		DBConnection.close(pstmt, con);

	}

	@Override
	public void updateMobile(FriendUpdate update) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;

		if (con != null) {
			String sql = "UPDATE FRIENDS SET MOBILE = ? WHERE FRIEND_NO = ?, FRIEND_NAME = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, update.mobile);
			pstmt.setInt(2, update.friend_No);
			pstmt.setString(3, update.friend_Name);
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println(update.friend_Name + "의 전화번호가 " + update.mobile + "로 변경 되었습니다.");
			}

		}
		DBConnection.close(pstmt, con);
	}

	@Override
	public void updateAddr(FriendUpdate update) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;

		if (con != null) {
			String sql = "UPDATE FRIENDS SET ADDR = ? WHERE FRIEND_NO = ?, WHERE FRIEND_NAME = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, update.addr);
			pstmt.setInt(2, update.friend_No);
			pstmt.setString(3, update.friend_Name);
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println(update.friend_Name + "의 주소가 " + update.addr + "로 변경 되었습니다.");
			}

		}

	}

	@Override
	public void deleteFriend(int friend_No) throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;

		if (con != null) {
			String sql = "DELETE FROM FRIENDS WHERE FRIEND_NO = ?";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, friend_No);
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println(friend_No + "번 친구의 정보가 삭제 되었습니다.");
			}

		}
		DBConnection.close(pstmt, con);
	}

	@Override
	public void deleteAllFriend() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;

		if (con != null) {
			String sql = "TRUNCATE TABLE FRIENDS";

			pstmt = con.prepareStatement(sql);
			int result = pstmt.executeUpdate();

			if (result == 1) {
				System.out.println("주소록이 초기화 되었습니다.");
			}

		}
		DBConnection.close(pstmt, con);
	}

}
