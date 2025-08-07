package com.java.controller;

import java.util.Scanner;
import com.library.entity.Book;
import com.library.service.BookService;

public class BookController {
    Scanner scanner = new Scanner(System.in);
    BookService bookService = new BookService();
    public void bookMenu() {
    	boolean exit = true;
        while (exit) {
            System.out.println("\n===== Book Management Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Update Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    Book newBook = createBook(scanner);
                    bookService.addBook(newBook);
                    break;
                case 2:
                    System.out.print("Enter Book ID to remove: ");
                    Long removeId = scanner.nextLong();
                    bookService.removeBook(removeId);
                    break;
                case 3:
                    Book updatedBook = createBook(scanner);
                    bookService.updateBook(updatedBook);
                    break;
                case 4:
                    bookService.displayBooks();
                    break;
                case 5:
                    exit = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
}
    private static Book createBook(Scanner scanner) {
        System.out.print("Enter Book ID: ");
        Long id = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter Book Title: ");
        String title = scanner.nextLine();

        System.out.print("Enter Author: ");
        String author = scanner.nextLine();

        System.out.print("Enter Publication Year: ");
        int year = scanner.nextInt();

        System.out.print("Enter Number of Copies: ");
        int copies = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Book Location: ");
        String location = scanner.nextLine();

        System.out.print("Enter Description: ");
        String description = scanner.nextLine();

        return new Book(id, title, author, year, copies, location, description);
    }

}

