package com.lirary.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.lirary.entity.User;
import com.lirary.service.UserService;

public class UserController {
	Scanner scanner = new Scanner(System.in);
	UserService userService = new UserService();

	public void userMenu() throws InputMismatchException{
		boolean exit = true;
		while (exit) {
			System.out.println("\n*********** User Management Menu ***********");
			System.out.println("1. Register User");
			System.out.println("2. Get User");
			System.out.println("3. Update User Profile");
			System.out.println("4. Get All Users");
			System.out.println("5. Exit");
			System.out.print("Choose an option: ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Enter User ID: ");
				String userId = scanner.nextLine();
				System.out.print("Enter User Name: ");
				String userName = scanner.nextLine();
				User user = new User(userId, userName);
				userService.registerUser(user);
				break;

			case 2:
				System.out.print("Enter User ID to fetch: ");
				String fetchId = scanner.nextLine();
				userService.getUser(fetchId);
				break;

			case 3:
				System.out.print("Enter User ID to update: ");
				String updateId = scanner.nextLine();
				System.out.print("Enter New User Name: ");
				String newName = scanner.nextLine();
				userService.updateProfile(new User(updateId, newName));
				break;

			case 4:
				userService.getAllUsers();
				break;

			case 5:
				exit = false;
				System.out.println("Exiting User Management.");
				break;

			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}

}
