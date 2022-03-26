
package com.bookapp.web.controller;
import java.util.List;

import com.bookapp.model.dao.Book;
import com.bookapp.model.service.BookServiceImpl;

public class Main {

	public static void main(String[] args) {
		BookServiceImpl bookService=new BookServiceImpl();
		List<Book>books=bookService.getAll();
		for(Book book: books) {
			System.out.println(book);
		}
		Book book=new Book("effective java", 400);
		bookService.addBook(book);
	}
}

