package ChallengeKeduaA;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter initial balance:");
        double balance;
        while (true) {
            balance = scanner.nextDouble();
            if (balance >= 0) break;
            System.out.println("Balance cannot be negative. Enter a valid balance:");
        }
        scanner.nextLine();

        System.out.println("Enter customer name:");
        String customerName = scanner.nextLine();

        System.out.println("Enter customer email:");
        String customerEmail = scanner.nextLine();

        System.out.println("Enter customer phone number:");
        String customerPhone = scanner.nextLine();

        BankAccount bankAccount = new BankAccount(accountNumber, balance, customerName, customerEmail, customerPhone);

        boolean quit = false;
        while (!quit) {
            System.out.println("\nChoose an operation:\n1: Deposit\n2: Withdraw\n3: Show Balance\n4: Quit");
            int operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                    bankAccount.deposit(depositAmount);
                } else {
                    System.out.println("Deposit amount must be positive.");
                }
                break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0) {
                    bankAccount.withdraw(withdrawAmount);
                } else {
                    System.out.println("Withdraw amount must be positive.");
                }
                break;
                case 3:
                    System.out.println("Current balance: " + bankAccount.getBalance());
                    break;
                case 4:
                    quit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid operation selected.");
            }
        }

        scanner.close();
    }
}