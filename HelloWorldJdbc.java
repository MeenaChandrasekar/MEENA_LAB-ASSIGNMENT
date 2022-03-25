

package com.jdbc.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class HelloWorldJdbc {

	private static final String rs = null;

	public static void main(String[] args) throws SQLException {
		//2. load the driver 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("done");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//3. connection object
		Connection connection=null;
		try {
			 connection=DriverManager.getConnection
					("jdbc:mysql://127.0.0.1:3306/yms21", "root", "root");
			// SQL injection			No SQL injection
			//poor performance			good per, driver can cached the query
			//Statement, 			PrepparedStatement, CallableStatemnt

			Statement stmt=connection.createStatement();
			while(rs.next()) {
				System.out.println(rs.getInt("id")+":"+rs.substring("name")+":"+rs.getDouble("salary")
				+":"+rs.substring("dept"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(connection!=null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
 