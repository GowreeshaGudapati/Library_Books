package com.library.entity;

public class Book {
	private Long bookId;
	private String bookTitle;
	private String author;
	private Integer publicationYear;
	private Integer numberOfCopies;
	private String bookLocation;
	private String description;
	
	public Book(Long bookId, String bookTitle, String author, Integer publicationYear, Integer numberOfCopies,
			String bookLocation, String description) {
		super();
		this.bookId = bookId;
		this.bookTitle = bookTitle;
		this.author = author;
		this.publicationYear = publicationYear;
		this.numberOfCopies = numberOfCopies;
		this.bookLocation = bookLocation;
		this.description = description;
	}
	public Long getBookId() {
		return bookId;
	}


	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}


	public String getBookTitle() {
		return bookTitle;
	}


	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public Integer getPublicationYear() {
		return publicationYear;
	}


	public void setPublicationYear(Integer publicationYear) {
		this.publicationYear = publicationYear;
	}


	public Integer getNumberOfCopies() {
		return numberOfCopies;
	}


	public void setNumberOfCopies(Integer numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}


	public String getBookLocation() {
		return bookLocation;
	}


	public void setBookLocation(String bookLocation) {
		this.bookLocation = bookLocation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Book Id\t:\t" + bookId + ", \nBook Title\t:\t" + bookTitle + ", \nAuthor\t:\t" + author + ", \nPublication Year\t:\t"
				+ publicationYear + ", \nNumber of copies\t:\t" + numberOfCopies + ", \nBook Location\t:\t" + bookLocation
				+ ", \nDescription\t:\t" + description ;
	}
}
