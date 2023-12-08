package com.distinctao.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private static String id = "hr";
	private static String pwd = "1234";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";

	static Connection getConnection () throws SQLException, ClassNotFoundException{
		Connection con = null;
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(url, id, pwd);

		return con;
	
	}

	static void close(ResultSet rs, Statement stmt, Connection con) throws SQLException {
		rs.close();
		stmt.close();
		con.close();
	}
	
	static void close(Statement stmt, Connection con) throws SQLException {
		stmt.close();
		con.close();
	}
	
	
}
