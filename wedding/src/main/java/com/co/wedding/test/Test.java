package com.co.wedding.test;

import java.sql.*;

public class Test {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	static final String DB_URL = "jdbc:mysql://localhost:3306/wedding";

	static final String USERNAME = "user01";
	
	static final String PASSWORD = "1q2w3e4r";

	public static void main(String[] args) {
		System.out.println("«Ô∑Œ");
		Connection conn = null;
		Statement stmt = null;
		try{
			System.out.println("√Ú∂Û¿Ã√Ú∂Û¿Ã");
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			System.out.println("\n- MySQL Connection : conn"+conn);
			stmt = conn.createStatement();
			System.out.println("stmt : "+stmt);
			
			String sql;
			sql = "SELECT USER_ID, USER_PWD FROM CO_USER";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("rs : "+rs);

			while(rs.next()){
				String USER_ID = rs.getString("USER_ID");
				String USER_PWD = rs.getString("USER_PWD");

				System.out.print("\n** USER_ID : " + USER_ID);
				System.out.print("\n    -> USER_PWD: " + USER_PWD);
			}
			rs.close();
			stmt.close();
			conn.close();
		}catch(SQLException se1){
			System.out.println("sqlException se1");
			se1.printStackTrace();
		}catch(Exception ex){
			System.out.println("sqlException ex");
			ex.printStackTrace();
		}finally{
			System.out.println("finally");
			try{
				System.out.println("finally try");
				if(stmt!=null) {
					System.out.println("finally null¿Ã æ∆¥œ∏È");
					stmt.close();
				}
			}catch(SQLException se2){
				System.out.println("finally catch se2");
				
			}
			try{
				if(conn!=null)
					conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("\n\n- MySQL Connection Close");
	}
}