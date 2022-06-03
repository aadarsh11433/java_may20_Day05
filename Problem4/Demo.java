package com.Problem4;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of Students you want to add ");
		
		int num = sc.nextInt();
		
		Student[] studentarr  = new Student[num];
		
		for(int a = 0; a<num ; a++) {
			
			System.out.println("Enter name of Student "+(a+1));
			String name = sc.next();
			
			System.out.println("Enter address of Student "+(a+1));
			String address = sc.next();
			
			System.out.println("Enter Roll no. of Student "+(a+1));
			int roll = sc.nextInt();
			
			System.out.println("Enter marks of Student "+(a+1));
			int marks = sc.nextInt();
			
			
			studentarr[a] = new Student();
			studentarr[a].setName(name);
			studentarr[a].setRoll(roll);
			studentarr[a].setAddress(address);
			studentarr[a].setMarks(marks);
			
			
			
		}
		
		System.out.println("Student details are  : ");
		System.out.println("===================================");
		
		float sum = 0;
		for(Student a :studentarr) {
			
		System.out.println("student's name:  "+a.getName());	
		System.out.println("student's roll no. : "+a.getAddress());
		
		System.out.println("student's address : "+a.getAddress());
		System.out.println("student's marks : "+a.getRoll());
	    
		sum =sum + a.getMarks();
			
			System.out.println("===================================");
			
		}
		
		float average = sum/studentarr.length;
		System.out.println("The average marks of students is : " + average);

	}

}
