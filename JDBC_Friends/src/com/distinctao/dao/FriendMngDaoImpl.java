package com.distinctao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.distinctao.vo.Friend;

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
	public List<Friend> selectAllFriends() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Friend> list = new ArrayList<>();

		if (con != null) {
			String sql = "SELECT * FROM FRIENDS ORDER BY FRIEND_NO";

			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Friend(rs.getInt("FRIEND_NO"), rs.getString("FRIEND_NAME"), rs.getString("MOBILE"),
						rs.getString("ADDR")));
			}

			DBConnection.close(rs, pstmt, con);
		}
		
		return list;
	}
	
	public void saveFriends() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		int friend_no;
		String friend_name;
		String mobile;
		String addr;
		System.out.print("친구 번호를 입력하세요 >>>");
		friend_no = Integer.parseInt(sc.nextLine());
		System.out.print("친구 이름을 입력하세요 >>>");
		friend_name = sc.nextLine();
		System.out.print("친구 전화번호를 입력하세요 >>>");
		mobile = sc.nextLine();
		System.out.print("친구의 주소를 입력하세요 >>>");
		addr = sc.nextLine();

		
		
		if (con != null) {
			String sql = "INSERT INTO FRIENDS VALUES (?, ?, ?, ?)";
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, friend_no);
			pstmt.setString(2, friend_name);
			pstmt.setString(3, mobile);
			pstmt.setString(4, addr);		
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println(friend_no + "번 친구 " + friend_name + "의 정보가 등록 되었습니다.");
			}

			DBConnection.close(pstmt, con);
		}
		
	}

	@Override
	public List<Friend> selectByName() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Friend> list = new ArrayList<>();

		if (con != null) {
			String sql = "SELECT * FROM FRIENDS WHERE FRIEND_NAME = ?";
			System.out.print("조회할 친구 이름을 입력하세요 >>>");
			String friend_name = sc.nextLine();

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, friend_name);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Friend(rs.getInt("FRIEND_NO"), rs.getString("FRIEND_NAME"), rs.getString("MOBILE"),
						rs.getString("ADDR")));
			}

			DBConnection.close(rs, pstmt, con);
		}
		
		return list;
	}

	@Override
	public List<Friend> selectByMobile() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Friend> list = new ArrayList<>();

		if (con != null) {
			String sql = "SELECT * FROM FRIENDS WHERE MOBILE = ?";
			System.out.print("조회할 전화번호를 입력하세요 >>>");
			String mobile = sc.nextLine();

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mobile);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				list.add(new Friend(rs.getInt("FRIEND_NO"), rs.getString("FRIEND_NAME"), rs.getString("MOBILE"),
						rs.getString("ADDR")));
			}

			DBConnection.close(rs, pstmt, con);
		}
		
		return list;
	}

	@Override
	public void updateName() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
		if (con != null) {
			String sql = "UPDATE FRIENDS SET FRIEND_NAME = ? WHERE FRIEND_NAME = ?";
			System.out.println("수정하고 싶은 친구의 이름을 입력하세요 >>>");
			String friendName = sc.nextLine();
			System.out.print("수정할 이름을 입력하세요 >>>");
			String revisedName = sc.nextLine();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, revisedName);
			pstmt.setString(2, friendName);
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println(friendName + "의 이름이 " + revisedName + "로 변경 되었습니다.");
			}

		}
		
	}

	@Override
	public void updateMobile() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
		if (con != null) {
			String sql = "UPDATE FRIENDS SET MOBILE = ? WHERE FRIEND_NAME = ?";
			System.out.print("수정하고 싶은 친구의 이름을 입력하세요 >>>");
			String friendName = sc.nextLine();
			System.out.print("수정할 전화번호를 입력하세요 >>>");
			String revisedMobile = sc.nextLine();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, revisedMobile);
			pstmt.setString(2, friendName);
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println(friendName + "의 전화번호가 " + revisedMobile + "로 변경 되었습니다.");
			}

		}
		
	}

	@Override
	public void updateAddr() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
		if (con != null) {
			String sql = "UPDATE FRIENDS SET ADDR = ? WHERE FRIEND_NAME = ?";
			System.out.print("수정하고 싶은 친구의 이름을 입력하세요 >>>");
			String friendName = sc.nextLine();
			System.out.print("수정할 주소를 입력하세요 >>>");
			String revisedAddr = sc.nextLine();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, revisedAddr);
			pstmt.setString(2, friendName);
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println(friendName + "의 주소가 " + revisedAddr + "로 변경 되었습니다.");
			}

		}
		
	}

	@Override
	public void deleteFriend() throws ClassNotFoundException, SQLException {
		Connection con = DBConnection.getConnection();
		PreparedStatement pstmt = null;
		
		if (con != null) {
			String sql = "DELETE FROM FRIENDS WHERE FRIEND_NAME = ?";
			System.out.print("삭제하고 싶은 친구의 이름을 입력하세요 >>>");
			String friendName = sc.nextLine();
			
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, friendName);
			int result = pstmt.executeUpdate();
			
			if (result == 1) {
				System.out.println(friendName + "의 정보가 삭제 되었습니다.");
			}

		}
		
	}
	

}
