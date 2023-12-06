package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
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
		Statement stmt = null;
		String sql = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);

			if (con != null) {
				int manId = 100;
				int deptNo = 270;

				// 실행할 쿼리문 준비
				sql = "Update Departments set MANAGER_ID = " + manId + " where DEPARTMENT_ID = " + deptNo;
				// statement 객체 생성 : 연결하고 있는 DB서버로 전송하고 실행하는 역할을 하는 객체
				stmt = con.createStatement();
				int result = stmt.executeUpdate(sql);
				
				if (result == 1) {
					System.out.println("update 완료");	
				}
				stmt.close();
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
