// File: Main.java

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            printMenu();
            System.out.print("Enter your choice (1-4): ");

            try {
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> account.showBalance();
                    case 2 -> {
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    }
                    case 3 -> {
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    }
                    case 4 -> {
                        System.out.println("Thank you for using Java Bank. Goodbye!");
                        isRunning = false;
                    }
                    default -> System.out.println("❌ Invalid choice. Please select a number between 1 and 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("****************************");
        System.out.println("       JAVA BANK SYSTEM     ");
        System.out.println("****************************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
        System.out.println("****************************");
    }
}
