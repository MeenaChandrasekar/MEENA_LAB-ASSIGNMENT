
package com.jdbc.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Add {

	public static void main(String[] args) {
		Connection  connection=Connection.getConnection();

		try {
			PreparedStatement pstmt=connection.
					prepareStatement("insert into emp1(name, salary, dept) values(?,?,?)");
			pstmt.setString(1, "rajat");
			pstmt.setDouble(2, 29);
			pstmt.setString(3, "Sales");
			
			//i u just want to print the data executeQuery
			//execute: both : when u are taking a query at run time

			int noOfRowsEffected=pstmt.executeUpdate();
			System.out.println(noOfRowsEffected);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
