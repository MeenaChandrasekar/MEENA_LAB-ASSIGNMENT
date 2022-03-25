
package com.jdbc.crud;
import java.sql.*;
public class Delete {
	public static void main(String[] args) {
		Connection  connection=ConnectionFactory.getConnection();
		try {
			PreparedStatement pstmt=connection.
					prepareStatement("delete from emp1 where id=?");
			pstmt.setInt(1, 6);

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

