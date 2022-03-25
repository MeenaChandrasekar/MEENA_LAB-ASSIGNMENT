

package com.jdbc.perforance;
import java.sql.*;

import com.jdbc.crud.ConnectionFactory;
public class BankAppWithoutACID {

	public static void main(String[] args) {

		Connection connection = ConnectionFactory.getConnection();
		try {
			//connection.setAutoCommit(false);

			PreparedStatement pstmt=connection.
					prepareStatement("update account set balance= balance-100 where id=?");
			pstmt.setInt(1, 1);

			pstmt.executeUpdate();

			 pstmt=connection.
						prepareStatement("update account set balance= balance+100 where id=?");
			pstmt.setInt(1, 2);

			pstmt.executeUpdate();

			//connection.commit();
			System.out.println("fund is transfred...");

		} catch (SQLException e) {

			e.printStackTrace();
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}

	}
}
