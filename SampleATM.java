package javaAssignments;
import java.util.*;
public class SampleATM {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double Balance = 10000.00;
		System.out.println("Welcome to ATM...");
		while(true) {
			System.out.println("Please Select your option\n 1.Check Balance\n 2.Debit\n 3.Credit\n ");
			int input = sc.nextInt();

			switch(input) {
			case 1:{
				System.out.println("Your Bank balance is Rs"+Balance+"\n");
				break;
			}
			case 2:{
				System.out.print("Enter Amount to Debit : Rs ");
				int debit = sc.nextInt();
				if(debit <= Balance) {
					Balance = Balance - debit;
					System.out.println(debit+"Rs Amount Debited successfully.");
					System.out.println("After Debiting your bank balance is Rs"+Balance+"\n");
				}
				else {
					System.out.println("Insufficient balance...\n");
				}
				break;
			}
			case 3:{
				System.out.print("Enter Amount to Credit : Rs ");
				int credit = sc.nextInt();
				if(credit >= 0) {
					Balance = Balance + credit;
					System.out.println(credit+"Rs Credited successfully.\n");
					System.out.println("After Credited your bank balance is Rs"+Balance+"\n");
				}
				else {
					System.out.println("Please Enter Valid Amount...\n");
				}
				break;
			}
			}
		}
	}
}
