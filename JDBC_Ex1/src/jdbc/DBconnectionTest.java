package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnectionTest {

	public static void main(String[] args) {
		
		// 오라클 DB 접속하기 위해 필요한 정보 (아이디, 패스워드, DB서버 주소)
		String id = "hr";
		String pwd = "1234";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		Connection con = null;		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);

		} catch (ClassNotFoundException e) { // 클래스 부재 예외
			System.out.println("드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) { // 연결 문제 예외
			System.out.println("DB에 연결할 수 없습니다.");
		}

		if (con != null) {
			System.out.println("DB 연결 성공 => " + con.toString());
			try {
				con.close();
				System.out.println("DB 연결 해제 => "  + con.toString());
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
