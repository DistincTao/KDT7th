package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.Scanner;

public class SelectTest {

	public static void main(String[] args) {
		
		// 오라클 DB 접속하기 위해 필요한 정보 (아이디, 패스워드, DB서버 주소)
		String id = "hr";
		String pwd = "1234";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		
		Connection con = null;
		Statement stmt = null;		
		String sql = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url, id, pwd);


			if (con != null) {
				System.out.print("조회할 직원 번호 >>>");
				int empNo = sc.nextInt();
				
				// 실행할 쿼리문 준비
				sql = "select * from Employees where EMPLOYEE_ID = " + empNo;
				// Statement 객체 생성 : 쿼리문을 Connection 객체가 연결하고 있는 DB서버로 전송하고 실행하는 역할을 하는 객체
				stmt = con.createStatement();
				// ResultSet 객체 생성 : 쿼리문이 실행된 후에 결과 테이블을 담고 있는 객체
				rs = stmt.executeQuery(sql);
				
				if (rs.next()) {
					System.out.println("EMPID FIRST LAST EMAIL PHONE "
									+ "HIRE JOBID SAL COMM MANID DEPTID");
					System.out.println(rs.getInt("EMPLOYEE_ID") + " " + rs.getString("FIRST_NAME") + " "
									+ rs.getString("LAST_NAME") + " " + rs.getString("EMAIL") + " " + rs.getString("PHONE_NUMBER") 
									+ " " + rs.getDate("HIRE_DATE") + " " + rs.getString("JOB_ID") + " " + rs.getInt("SALARY") + " " 
									+ rs.getInt("COMMISSION_PCT") + " " + rs.getInt("MANAGER_ID") + " " + rs.getInt("DEPARTMENT_ID"));
				} else {
					System.out.println("찾는 사원번호가 존재하지 않습니다.");	
				} 
				
			}
			stmt.close();
			con.close();
			rs.close();

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
