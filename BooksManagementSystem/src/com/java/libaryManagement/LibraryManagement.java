package com.java.libaryManagement;

import java.util.Scanner;

import com.java.controller.*;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserController userController = new UserController();
		BookController bookController = new BookController();
		BookTransactionController bookTransactionController = new BookTransactionController();
		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) {
			System.out.println("\n========= Library Management System =========");
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

		scanner.close();
	}

}
