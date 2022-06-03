package com.Problem3;

import java.util.Scanner;

public class AccountDetails {

	public Account getAccountDetails() {
	
		Scanner sc = new Scanner(System.in);
		
		
		Account account = new Account();
		
		System.out.println("enter account Id");
		int id  = sc.nextInt();
		
		System.out.println("Enter account type ");
		String type  = sc.next();
		int balance;
		
		while(true) {
	
			System.out.println("Enter balance");
			 balance = sc.nextInt();
			
			if(balance>0) {
				break;
			}else {
				System.out.println("Balance should be positive ");
			}
			
		}
		
		account.setAccountId(id);
		account.setAccountType(type);
        account.setBalance(balance);	
		return account;
	}
	
	public int getWithdrawAmount() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Enter amount to be withdrawn ");
			int  amount = sc.nextInt();
			
			if(amount <= 0) {
				System.out.println(" Withdrawal Amount should be positive");
			}
			else
				return amount;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		AccountDetails acc  = new AccountDetails();
		
		Account account = acc.getAccountDetails();
		
		int withdrawlAmount = acc.getWithdrawAmount();
		
		account.withdraw(withdrawlAmount);

	}

}
