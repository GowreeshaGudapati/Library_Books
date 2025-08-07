package com.library.service;

import java.util.LinkedHashMap;
import java.util.Map;

import com.library.entity.Book;

public class BookService {
	public BookService() {
		// Sample book data
		books.put(1002L, new Book(100L, "Clean Code", "Robert C. Martin", 2008, 3, "B2", "Clean coding principles."));
		books.put(1003L, new Book(101L, "Atomic Habits", "James Clear", 2018, 4, "C1", "A guide to building good habits."));
		books.put(1004L, new Book(103L, "Java: The Complete Reference", "Herbert Schildt", 2019, 2, "D3", "Comprehensive Java programming guide."));
		books.put(1005L, new Book(104L, "Think and Grow Rich", "Napoleon Hill", 1937, 6, "E4", "Personal development and self-improvement."));
	}
	private Map<Long, Book> books = new LinkedHashMap<Long, Book>();
	// Adds a new book to the system
	public void addBook(Book book) {
		if (books.containsKey(book.getBookId())) {
			System.out.println("Book with this ID already exists.");
		} else {
			books.put(book.getBookId(), book);
			System.out.println("Book added successfully.");
		}
	}

	// Removes a book from the system using bookId
	public void removeBook(Long bookId) {
		if (books.containsKey(bookId)) {
			books.remove(bookId);
			System.out.println("Book removed successfully.");
		} else {
			System.out.println("No book found with the given ID.");
		}
	}

	// Updates a book's details (assumes bookId already exists)
	public void updateBook(Book updatedBook) {
		Long id = updatedBook.getBookId();
		if (books.containsKey(id)) {
			books.put(id, updatedBook);
			System.out.println("Book updated successfully.");
		} else {
			System.out.println("Book not found. Cannot update.");
		}
	}
    
	// Displays all books
	public void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No books available in the library.");
		} else {
			for (Map.Entry<Long, Book> entry : books.entrySet()) {
				Book book = entry.getValue();
				System.out.println(book.toString());
				System.out.println(book);
			}
		}
	}
	public Book searchBook(String searchTerm) {
	    boolean found = false;
	    for (Book book : books.values()) {
	        if (book.getBookTitle().toLowerCase().contains(searchTerm.toLowerCase()) ||
	            book.getAuthor().toLowerCase().contains(searchTerm.toLowerCase()) ||
	            String.valueOf(book.getBookId()).contains(searchTerm)) {
	            found = true;
	            return book;
	        }
	    }
	    if (!found) {
	        System.out.println("No books found for the search term: " + searchTerm);
	       
	    }
	    return null;
	}
}
