package com.lirary.service;

import java.util.HashMap;
import java.util.Map;

import com.lirary.entity.User;

public class UserService {
	private Map<String, User> users = new HashMap<>();

	public UserService() {
		users.put("ABC100", new User("ABC100", "Anusha"));
		users.put("ABC101", new User("ABC101", "Sailu"));
		users.put("ABC102", new User("ABC102", "Ratna Gowreesha"));
		users.put("ABC103", new User("ABC103", "Mani"));
	}

	// Registers a new user
	public void registerUser(User user) {
		if (users.containsKey(user.getUserId())) {
			System.out.println("User already exists.");
		} else {
			users.put(user.getUserId(), user);
			System.out.println("User registered successfully.");
		}
	}

	// Getting user by ID
	public User getUser(String userId) {
		User user = users.get(userId);
		if (user != null) {
			System.out.println("User found:\n " + user + "\n");
			return user;
		} else {
			System.out.println("User not found.");
			return null;
		}
	}

	// Displays all registered users
	public void getAllUsers() {
		if (users.isEmpty()) {
			System.out.println("No users registered.");
		} else {
			for (User user : users.values()) {
				System.out.println(user + "\n");
			}
		}
	}

	public void updateProfile(User updatedUser) {
		String userId = updatedUser.getUserId();
		if (users.containsKey(userId)) {
			users.put(userId, updatedUser);
			System.out.println("User profile updated successfully.");
		} else {
			System.out.println("User not found. Cannot update.");
		}
	}

}
