package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementTest {

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

		doInsert(con);
		doDelete(con);
		
		PreparedStatement pstmt;
		ResultSet rs = null;
//		String sql = "SELECT * FROM EMPLOYEES WHERE FIRST_NAME LIKE '%' || ? || '%'"; // => pstmt.setString(1, firstName);
		String sql = "SELECT * FROM EMPLOYEES WHERE FIRST_NAME LIKE ? ";

		if (con != null) {
			String firstName = "David";

			try {
				pstmt = con.prepareStatement(sql);
//				pstmt.setString(1, firstName); // ?를 매개 변수에 할당 (1부터 시작)
				pstmt.setString(1, "%" + firstName + "%"); // '%DAVID%'
				rs = pstmt.executeQuery();

				System.out.println(
						"EMPID  FIRST  LAST EMAIL    PHONE    " + "  HIRE      JOBID   SAL    COMM    MANID    DEPTID");
				while (rs.next()) {
					System.out.println(rs.getInt("EMPLOYEE_ID") + "   " + rs.getString("FIRST_NAME") + " "
							+ rs.getString("LAST_NAME") + " " + rs.getString("EMAIL") + " "
							+ rs.getString("PHONE_NUMBER") + " " + rs.getDate("HIRE_DATE") + " "
							+ rs.getString("JOB_ID") + " " + rs.getInt("SALARY") + "     " + rs.getInt("COMMISSION_PCT")
							+ "     " + rs.getInt("MANAGER_ID") + "    " + rs.getInt("DEPARTMENT_ID"));

				}

				rs.close();
				pstmt.close();
				con.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	private static void doInsert(Connection con) {
		int deptNo = 280;
		String dName = "IT_DB";
		int manId = 105;
		int locId = 1700;		
		
		PreparedStatement pstmt;
		String sql = "INSERT INTO DEPARTMENTS VALUES (?, ?, ?, ?)";

		if (con != null) {
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, deptNo);
				pstmt.setString(2, dName);
				pstmt.setInt(3, manId);
				pstmt.setInt(4, locId);
				int result = pstmt.executeUpdate();
				
				if (result == 1) {
					System.out.println("INSERT 완료");
				}
				pstmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Please Check the connection");
		}
		
	}
	
	private static void doDelete(Connection con) {
	
		PreparedStatement pstmt;
		String sql = "DELETE FROM DEPARTMENTS WHERE DEPARTMENT_ID = ?";

		if (con != null) {
			try {
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, 280);
				int result = pstmt.executeUpdate();
				
				if (result == 1) {
					System.out.println("DELETE 완료");
				}
				
				pstmt.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("Please Check the connection");
		}
		
	}

}
