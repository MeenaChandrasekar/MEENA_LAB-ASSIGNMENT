
package com.bookapp.model.dao;
import java.awt.print.Book;
import java.util.List;

public interface BookDao {
	public List<Book> getAll();
	public void addBook(Book b);

}