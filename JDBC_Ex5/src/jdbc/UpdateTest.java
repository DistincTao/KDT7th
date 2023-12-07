package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;

public class UpdateTest {

public static void main(String[] args) {
		
		// 오라클 DB 접속하기 위해 필요한 정보 (아이디, 패스워드, DB서버 주소)
		String id = "hr";
		String pwd = "1234";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		Connection con = null;
//		Statement stmt = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);

			if (con != null) {
				int deptNo = 270;
				String dName = "R&D";
				int manId = 105;
				int locId = 1700;
				


//				sql = "UPDATE DEPARTMENTS SET MANAGER_ID = " + manId + " WHERE DEPARTMENT_ID = " + deptNo;
//				stmt = con.createStatement();
//				int result = stmt.executeUpdate(sql);

//				sql = "UPDATE DEPARTMENTS SET MANAGER_ID = ?, DEPARTMENT_NAME = ?, LOCATION_ID = ? WHERE DEPARTMENT_ID = ?";
				sql = "UPDATE DEPARTMENTS SET MANAGER_ID = ? WHERE DEPARTMENT_ID = ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, manId);
				pstmt.setInt(2, deptNo);
				int result = pstmt.executeUpdate();
				
				if (result == 1) {
					System.out.println("update 완료");
					System.out.println("Auto-Commit : " + con.getAutoCommit());
				}
				
				pstmt.close();
//				stmt.close();
				con.close();
			}

		} catch (ClassNotFoundException e) { // 클래스 부재 예외
			e.printStackTrace();
		} catch (SQLException e) { // 연결 문제 예외
			if (e instanceof SQLSyntaxErrorException) {
				System.out.println("Please check the Query statement");
			}
			e.printStackTrace();
		};
		
	}

}
