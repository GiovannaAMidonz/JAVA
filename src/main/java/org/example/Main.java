package org.example;

import org.example.getstarted.model.UserDAO;
import org.example.getstarted.excepition.UserNotFoundException;
import org.example.getstarted.model.UserModel;
import org.example.getstarted.model.menuOption;

import java.util.Scanner;

public class Main {
    private static UserDAO dao = new UserDAO();

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var userInput = 0;

        while (userInput != 6) {
            System.out.println("\n--- USER MANAGEMENT SYSTEM ---");
            System.out.println("1 - Register");
            System.out.println("2 - Update");
            System.out.println("3 - Delete");
            System.out.println("4 - Find by ID");
            System.out.println("5 - List all");
            System.out.println("6 - Exit");
            System.out.print("Select an option: ");

            userInput = scanner.nextInt();


            if (userInput < 1 || userInput > 6) {
                System.out.println("Invalid option! Try again.");
                continue;
            }

            var selectedOption = menuOption.values()[userInput - 1];

            switch (selectedOption) {
                case save:
                    System.out.println("Registering user...");
                    System.out.print("Enter user name: ");
                    scanner.nextLine(); // Limpa o buffer antes de ler texto
                    String name = scanner.nextLine();


                    UserModel newUser = new UserModel();
                    newUser.setName(name);


                    dao.save(newUser);

                    System.out.println("User registered successfully with ID: " + newUser.getId());
                    break;
                case update:
                    System.out.println("Updating User");
                    System.out.print("Enter the ID of the user you want to update: ");
                    long idToUpdate = scanner.nextLong();
                    scanner.nextLine();

                    try {
                        System.out.print("Enter the new name: ");
                        String newName = scanner.nextLine();


                        UserModel updatedUser = new UserModel();
                        updatedUser.setId(idToUpdate);
                        updatedUser.setName(newName);


                        dao.update(updatedUser);
                        System.out.println("User updated successfully!");

                    } catch (UserNotFoundException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case findById:
                    System.out.print("Enter User ID: ");
                    long id = scanner.nextLong();
                    try {
                        var user = dao.findById(id);
                        System.out.println("User found: " + user.getName());
                    } catch (UserNotFoundException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case findAll:
                    System.out.println("Listing all users...");
                    dao.findAll();
                    break;
                case delete:
                    System.out.print("Enter User ID to delete: ");
                    long deleteId = scanner.nextLong();
                    try {
                        dao.delete(deleteId);
                        System.out.println("User deleted successfully.");
                    } catch (UserNotFoundException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
                case exit:
                    System.out.println("Closing system. Goodbye!");
                    break;
                default:
                    System.out.println("Developing...");
                    break;
            }
        }
        scanner.close();
    }
}
