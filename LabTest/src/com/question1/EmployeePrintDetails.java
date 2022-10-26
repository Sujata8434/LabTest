package com.question1;

import java.util.Scanner;

import com.question1.Employee;

public class EmployeePrintDetails {

	public static void main(String[] args) {

		// creating object of Student class
		Employee e1 = new 	Employee();
		Employee e2= new 	Employee();

		// declaring an object of Scanner
		Scanner sc = new Scanner(System.in);

		// declaring variables
		int eid;
		float 	esalary;
		String ename, edepartment;

		// taking input
		System.out.println("Enter the Employee Name:");
		ename = sc.next();
		System.out.println("Enter the EmployeeId:");
		eid = sc.nextInt();

		System.out.println("Enter the Employee department:");
		edepartment = sc.next();
		System.out.println("Enter the Employee salary:");
		esalary= sc.nextFloat();
		
		System.out.println("Enter the Employee Name:");
		ename = sc.next();
		System.out.println("Enter the EmployeeId:");
		eid = sc.nextInt();

		System.out.println("Enter the Employee department:");
		edepartment = sc.next();
		System.out.println("Enter the Employee salary:");
		esalary= sc.nextFloat();

		// call the method getDetails
		e1.getDetails(eid, ename, edepartment,esalary);

		// printDetails()

		System.out.println("-------------------------------------");
		System.out.println("-------------------------------------");

		e1.printDetails();
		
		// call the method getDetails
				e2.getDetails(eid, ename, edepartment,esalary);
				
				// printDetails()

				System.out.println("-------------------------------------");// printDetails()

				System.out.println("-------------------------------------");

				e2.printDetails();
		sc.close();

	}

}
