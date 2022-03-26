package com.bookapp.model.dao;

public class Book {
	private int id;
	private String title;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(int id, String title, double price) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
	}
	public Book(String title, double price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "book [id=" + id + ", title=" + title + ", price=" + price + "]";
	}
	
	
}