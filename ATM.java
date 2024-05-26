package internshipTask;

import java.util.Scanner;

public class ATM {
	private double balance;

	public ATM(double initialBalance) {
		this.balance = initialBalance;
	}

	public double checkBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: Rs" + amount);
		} else {
			System.out.println("Invalid deposit amount.");
			
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn: Rs" + amount);
		} else if (amount > balance) {
			System.out.println("Insufficient balance.");
		} else {
			System.out.println("Invalid withdrawal amount.");
		}
	}

	public void transfer(ATM otherAccount, double amount) {
		if (amount > 0 && amount <= balance) {
			this.withdraw(amount);
			otherAccount.deposit(amount);
			System.out.println("Transferred: Rs" + amount + " to the other account.");
		} else {
			System.out.println("Invalid transfer amount.");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ATM account1 = new ATM(1000.00);
		ATM account2 = new ATM(500.00);

		while (true) {
			System.out.println("Welcome to the ATM. Please select an option:");
			System.out.println("1. Check Balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Exit");

			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Current balance: Rs" + account1.checkBalance());
				break;
			case 2:
				System.out.println("Enter amount to deposit:");
				double depositAmount = scanner.nextDouble();
				account1.deposit(depositAmount);
				break;
			case 3:
				System.out.println("Enter amount to withdraw:");
				double withdrawAmount = scanner.nextDouble();
				account1.withdraw(withdrawAmount);
				break;
			case 4:
				System.out.println("Enter amount to transfer:");
				double transferAmount = scanner.nextDouble();
				account1.transfer(account2, transferAmount);
				break;
			case 5:
				System.out.println("Thank you for using the ATM. Goodbye!");
				scanner.close();
				return;
			default:
				System.out.println("Invalid option. Please try again.");
			}
		}
	}
}

