package com.Problem2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of bookings");
		int number  =sc.nextInt();
		
		for(int a = 0;a<number;a++) {
			
			System.out.println(" Enter the available tickets");
			int availableTickets  =sc.nextInt();
			
			System.out.println("Enter the ticketid");
			int id = sc.nextInt();
			
			System.out.println("Enter no. of tickets");
			int tickets = sc.nextInt();
			
			System.out.println("Enter price per ticket");
			int price = sc.nextInt();
			
			Ticket t1 = new Ticket();
			t1.setPrice(price);
			t1.setAvailableTickets(availableTickets);
			t1.setTicketid(tickets);
			
			if(t1.getAvailableTickets()>0) {
				int total = t1.calculateTicketCost(tickets);
				if(total != -1)
				System.out.println("total amount is : " +total);
				else
					System.out.println("required no. of tickets are not available");
				System.out.println("No. of tickets available is : "+t1.getAvailableTickets());
			}
			
		}
		
		
				
		
	}

}
