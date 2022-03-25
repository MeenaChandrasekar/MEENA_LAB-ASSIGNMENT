
package com.jdbc.crud;

import java.sql.*;

public class Update {

	public static void main(String[] args) {
		Connection  connection=ConnectionFactory.getConnection();

		try {
			PreparedStatement pstmt=connection.
					prepareStatement("update emp1 set salary=? where id=?");
			pstmt.setDouble(1, 34);
			pstmt.setDouble(2, 6);

			//if u are changing the stage of do then for executeUpdate
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
