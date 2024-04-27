package com.entity;

public class BookDtls {
	private int bookId;
	private String bookName;
	private String author;
	private String price;
	private String status;
	private String  photoName;
	private String email;
	private String category;
	public BookDtls(String bookName, String author, String price, String categories, String status, String photoName, String email) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.category = categories;
		this.status = status;
		this.photoName = photoName;
		this.email = email;
	}
	public BookDtls() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookDtls [bootId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price
				+ ", status=" + status + ", photoName=" + photoName + ", email=" + email + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBookCategory() {
		// TODO Auto-generated method stub
		return category;
	}
	public void setBookCategory(String category) {
		this.category = category;
	}
	
	
 
}