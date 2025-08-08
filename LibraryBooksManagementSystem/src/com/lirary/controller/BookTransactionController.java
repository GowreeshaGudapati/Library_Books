package com.lirary.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.lirary.entity.Book;
import com.lirary.entity.User;
import com.lirary.service.BookService;
import com.lirary.service.BookTransactionService;
import com.lirary.service.UserService;

public class BookTransactionController {
	Scanner scanner = new Scanner(System.in);
	BookTransactionService transactionService = new BookTransactionService();

	public void menu() throws InputMismatchException{
		boolean exit = true;

		while (exit) {
			System.out.println("\n*********** Book Transaction Menu ***********");
			System.out.println("1. Borrow Book");
			System.out.println("2. Return Book");
			System.out.println("3. Renew Book");
			System.out.println("4. Show All Borrow Records");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine(); // clear buffer

			switch (choice) {
			case 1:
				System.out.print("Enter book details(i.e id, titel, author,...) which you want:");
				String bookDetails = scanner.nextLine();
				Book book = new BookService().searchBook(bookDetails);
				System.out.print("Enter your user ID :");
				String userId = scanner.next();
				User user = new UserService().getUser(userId);
				if(user != null && book != null)
				transactionService.borrowBook(user, book);
				else
					System.out.println("Unable to proceed: Book or user record does not exist.");
				break;
			case 2:
				System.out.print("Enter Borrow ID to return: ");
				String returnId = scanner.nextLine();
				transactionService.returnBook(returnId);
				break;
			case 3:
				System.out.print("Enter Borrow ID to renew: ");
				String renewId = scanner.nextLine();
				transactionService.renewBook(renewId);
				break;
			case 4:
				transactionService.showAllBorrowRecords();
				break;
			case 5:
				exit = false;
				break;
			default:
				System.out.println("Invalid option.");
			}
		}
	}

}
