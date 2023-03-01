package JavaProject;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bank_Acttivities {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long details[] = new long[5];
		String detail[] = new String[1];
		String collect1 = " ";
		long collect2, collect3, collect4, balance = 10000,withdraw, deposit = 0;

		while (true) {

			System.out.println("Welcome to Tamil Nadu Bank");
			System.out.println("choose 1 Create New Account :");
			System.out.println("choose 2 Get account details :");
			System.out.println("choose 3 Deposite Ammount :");
			System.out.println("choose 4 Withdraw Ammount :");
			System.out.println("choose 5 Get Account Balance:");
			System.out.println("choose 6 exit:");
			 System.out.print("Select option to perform"); 
			 System.out.println("");
			int choose = sc.nextInt();
			switch (choose) {
			case 1:

				System.out.println(" Enter Your Name:");
				collect1 = sc.next();

				System.out.println(" Enter Your data of birth:");
				collect2 = sc.nextInt();
				
				System.out.println(" Enter Your Aadhar Number:");
				collect3 = sc.nextLong();

				System.out.println("Enter your mobile number:");
				collect4 = sc.nextLong();
				
				 detail[0] = collect1;
				details[1] = collect2;
				details[2] = collect3;
				details[3] = collect4;
				
				if(collect4>=10){
					System.out.println("Account create sucessfully");
				}else {
					System.out.println("Colud not create  your account try again");
				}
				System.out.println("");
				break;
			case 2:
				for (String n : detail) {
					System.out.println(n);
				}
				
				for (int i = 1; i < details.length; i++) {

					System.out.println(details[i]);
				}
				System.out.println(" ");
				break;
			case 3:
			
				System.out.println("Plece Enter Deposit Ammount:");
				deposit = sc.nextInt();
				balance = balance + deposit;
				if (balance >= 10000) {
					System.out.println("Your Money has been Deposited");
				} else {
					System.out.println("Your money has been not deposited");
				}
				System.out.println(" ");
				break;
//
			case 4:
				System.out.println("Please enter withdraw amount");
				withdraw = sc.nextInt();
     
				if (balance >= withdraw) {
					balance = balance - withdraw;
					System.out.println("Please collect your money");
				} else {
					System.out.println("insufficient balance");
				}
				System.out.println("");
				break;
			case 5:
				System.out.println("Balance:"+""+balance);
				System.out.println(" ");
				break;
				
			case 6:
				System.exit(0);
				System.out.println(" ");
			}
		}
	}
}