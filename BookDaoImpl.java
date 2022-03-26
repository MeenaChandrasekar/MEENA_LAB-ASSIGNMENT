
package com.bookapp.model.dao;
import java.util.*;
import java.sql.*;

public class BookDaoImpl implements BookDao {
	// connection factory
	private Connection connection;

	public BookDaoImpl() {
		connection = ConnectionFactory.getConnection();
	}

	public List<Book> getAll() {
		List<Book> books = new ArrayList<Book>();
		Book tempBook;
		try {
			PreparedStatement pstmt = connection.prepareStatement("select * from books");
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				tempBook = new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3));
				books.add(tempBook);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return books;
	}

	public void addBook(Book b) {
		try {
			PreparedStatement pstmt = 
					connection.prepareStatement("insert into books(title, price) values(?,?)");
			pstmt.setString(1, b.getTitle());
			pstmt.setDouble(2, b.getPrice());
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}


