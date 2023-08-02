package oops.inherit;

import java.util.Scanner;

public class Mainaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
		
		System.out.println("Choose Account Type");
		System.out.println("1)Savings Account");
		System.out.println("2)Checking Account");
		int selection=sc.nextInt();
		
		if(selection==1)
		{
			SavingAccount account =new SavingAccount();
			System.out.println("Account:Savings Account");
			System.out.println("Balance="+account.getBalance());
			
			while (true) {
	            System.out.println("Select the option");
	            System.out.println("1) Deposit");
	            System.out.println("2) Withdraw");
	            System.out.println("3) Exit");

	            int option = sc.nextInt();
	            
	            if (option == 1) 
	            {
	                System.out.print("Deposit: ");
	                double amount = sc.nextDouble();
	                account.deposit(amount);
	                System.out.println("Balance: " + account.getBalance());
	            }
	            else if (option == 2) 
	            {
	            	System.out.print("Withdrawal amount: ");
	                double amount = sc.nextDouble();
	                if(account.withdraw(amount))
	                {
	                account.calculateInterest();
                    System.out.println("Account Balance after interest: " + account.getBalance());
	                }
	                else {
                        System.out.println("Insufficient balance.");
	                }
	            }
	            else if (option == 3) {
	                break;
	            } 
	            else 
	            {
	                System.out.println("Invalid option. Please try again.");
	            }
			}
			}
			
		
		else if(selection==2)
		{
			CheckingAccount account=new CheckingAccount();
			System.out.println("Account:Checking Account");
			System.out.println("Balance="+account.getBalance());
			while (true) {
	            System.out.println("Select the option");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Exit");

	            int option = sc.nextInt();
	            
	            if (option == 1) 
	            {
	                System.out.print("Deposit: ");
	                double amount = sc.nextDouble();
	                account.deposit(amount);
	                System.out.println("Balance: " + account.getBalance());
	            }
	            else if (option == 2) 
	            {
	            	System.out.print("Withdrawal amount: ");
	                double amount = sc.nextDouble();
	                
	                if(account.withdraw(amount))
	                {
	                    System.out.println("Balance after deduction: " + account.getBalance());
	                }
	                else {
                        System.out.println("Insufficient balance.");
	                }
	            }
	                
	            else if (option == 3) {
	                break;
	            } 
	            else 
	            {
	                System.out.println("Invalid option. Please try again.");
	            }
			}
		}
		else
		{
			System.out.println("INVALID OPTION");
			
			return;
			
		}
	
		sc.close();
	}
	}


