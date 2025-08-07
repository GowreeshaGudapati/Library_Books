package com.library.entity;

import java.time.LocalDate;

public class BookTransaction {
	    private String borrowId;
	    private String userId;
	    private String userName;
	    private Long bookId;
	    private String bookTitle;
	    private LocalDate borrowDate;
	    private LocalDate dueDate;
	    private LocalDate returnDate;
		public String getBorrowId() {
			return borrowId;
		}
		public void setBorrowId(String borrowId) {
			this.borrowId = borrowId;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
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
		public LocalDate getBorrowDate() {
			return borrowDate;
		}
		public void setBorrowDate(LocalDate borrowDate) {
			this.borrowDate = borrowDate;
		}
		public LocalDate getDueDate() {
			return dueDate;
		}
		public void setDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
		}
		public LocalDate getReturnDate() {
			return returnDate;
		}
		public void setReturnDate(LocalDate returnDate) {
			this.returnDate = returnDate;
		}
		public BookTransaction(String borrowId, String userId, String userName, Long bookId, String bookTitle,
				LocalDate borrowDate, LocalDate dueDate, LocalDate returnDate) {
			super();
			this.borrowId = borrowId;
			this.userId = userId;
			this.userName = userName;
			this.bookId = bookId;
			this.bookTitle = bookTitle;
			this.borrowDate = borrowDate;
			this.dueDate = dueDate;
			this.returnDate = returnDate;
		}
		@Override
		public String toString() {
			return "BookTransaction [borrowId=" + borrowId + ", userId=" + userId + ", userName=" + userName
					+ ", bookId=" + bookId + ", bookTitle=" + bookTitle + ", borrowDate=" + borrowDate + ", dueDate="
					+ dueDate + ", returnDate=" + returnDate + "]";
		}
	    
}
