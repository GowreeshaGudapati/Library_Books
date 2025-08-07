package com.library.service;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.library.entity.Book;
import com.library.entity.BookTransaction;
import com.library.entity.User;

public class BookTransactionService {
	private Map<String, BookTransaction> bookTransactions = new HashMap<>();

	public void borrowBook(User user, Book book) {
		String borrowId = UUID.randomUUID().toString();
		LocalDate borrowDate = LocalDate.now();
		LocalDate dueDate = borrowDate.plusDays(14);
		BookTransaction bookTransaction = new BookTransaction(borrowId, user.getUserId(), user.getUserName(),
				book.getBookId(), book.getBookTitle(), borrowDate, dueDate, null);
		bookTransactions.put(borrowId, bookTransaction);
		System.out.println("Book borrowed successfully.\n"+bookTransaction);
	}

	public void showAllBorrowRecords() {
		if (bookTransactions.isEmpty()) {
			System.out.println("No borrow records found.");
			return;
		}

		for (BookTransaction record : bookTransactions.values()) {
			System.out.println(record);
		}
	}
	public void returnBook(String borrowId) {
        BookTransaction record = bookTransactions.get(borrowId);
        if (record != null) {
            record.setReturnDate(LocalDate.now());
            System.out.println("Book returned successfully" + record);
        } else {
            System.out.println("Borrow record not found.");
        }
    }
	public void renewBook(String borrowId) {
        BookTransaction bookTransaction = bookTransactions.get(borrowId);
        if (bookTransaction != null && bookTransaction.getReturnDate() == null) {
        	bookTransaction.setDueDate(bookTransaction.getDueDate().plusDays(7));
            System.out.println("Book renewed successfully. New due date: " + bookTransaction.getDueDate());
        } else {
            System.out.println("Cannot renew. Either record not found or book already returned.");
        }
    }
}
