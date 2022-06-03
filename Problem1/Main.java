package com.Problem1;

import java.util.Scanner;

public class Main {
	
	public static Employee getEmployeeDetails() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Employee name");
		String name = sc.next(); 
		
		System.out.println("Enter Employee ID");
		int id = sc.nextInt();
		
		System.out.println("Enter employee's Salary");
		double salary = sc.nextDouble();
		
		Employee employee1 = new Employee(id,name,salary);
		return employee1;
	}
	
	public static int getPFPercentage() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter pf Percent ");
		int pfpercent = sc.nextInt();
	
		return pfpercent;
	}

	public static void main(String[] args) {
	
		Employee employee = getEmployeeDetails();
		
		int pf = getPFPercentage();
		
		 employee.calculateNetSalary(pf);
		 
		 System.out.println("Employee id: "+employee.getEmployeeId());
		 System.out.println("<<------------>>");
		 System.out.println("NAME : "+employee.getEmployeeName());
		 System.out.println("<<------------>>");
		 System.out.println("Gross SALARY IS :"+employee.getSalary());
		 System.out.println("<<------------>>");
		 System.out.println("NET SALARY IS :"+employee.getNetSalary());
		
	}

}
