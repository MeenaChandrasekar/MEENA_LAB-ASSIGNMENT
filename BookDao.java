package com.bookapp.model.dao;
import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookapp.model.entities.Book;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
	public List<Book> findByTitle(String title);
}