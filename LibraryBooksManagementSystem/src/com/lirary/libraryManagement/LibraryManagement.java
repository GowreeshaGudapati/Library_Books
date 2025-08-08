package com.lirary.libraryManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.lirary.controller.BookController;
import com.lirary.controller.BookTransactionController;
import com.lirary.controller.UserController;

public class LibraryManagement {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserController userController = new UserController();
		BookController bookController = new BookController();
		BookTransactionController bookTransactionController = new BookTransactionController();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;
		try {
		while (!exit) {
				System.out.println("\n*********** Library Management System ***********");
				System.out.println("1. User Management");
				System.out.println("2. Book Management");
				System.out.println("3. Book Transactions");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");

				int choice = scanner.nextInt();
				scanner.nextLine();

				switch (choice) {
				case 1:
					userController.userMenu();
					break;
				case 2:
					bookController.bookMenu();
					break;
				case 3:
					bookTransactionController.menu();
					break;
				case 4:
					exit = true;
					System.out.println("Exiting the system. Thank you!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} 
		}catch (InputMismatchException e) {
			System.out.println("Invalid input! Please enter a number.");
		}

		scanner.close();
	}

}
