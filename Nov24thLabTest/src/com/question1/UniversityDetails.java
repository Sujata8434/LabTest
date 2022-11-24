/*
 * Program: Create a class with a method that prints "This is parent class" 
 * and its subclass with another method that prints "This is child class".
 *  Now, create an object for each of the class and call
 * 1 - method of parent class by object of parent class
 * 2 - method of child class by object of child class
 * 3 - method of parent class by object of child class
 * @Author: Sujata Kumari
 * @Date: 24/11/2022
 * */

package com.question1;
//importing packages
import java.util.Scanner;
//declaring a class
public class UniversityDetails {

	
		//creating object of the student and employee
		private int student_id,emp_id,student_age,emp_age,student_enrolled;
		private String student_firstname,student_lastname,emp_firstname,emp_lastname,student_course,emp_dept,emp_designation;
		private float emp_salary;
		static Scanner sc = new Scanner (System.in);
		private static int c;
		
		//taking student details
		public void studentDetails()
		{
			System.out.println("------Student Details------");
			System.out.println("Please enter your first name:");
			student_firstname = sc.next();
			System.out.println("Please enter your last name:");
			student_lastname = sc.next();
			System.out.println("Enter Student ID:");
			student_id = sc.nextInt();
			System.out.println("Enter your age:");
			student_age = sc.nextInt();
			System.out.println("Enter Enrolled year: ");
			student_enrolled = sc.nextInt();
			System.out.println("Enter the course:");
			student_course = sc.next();
		
		
		//printing student details
		System.out.println("---------------------------");
		System.out.println("Student ID :"+student_id);
		System.out.println("First Name :"+student_firstname);
		System.out.println("Last Name :"+student_firstname);
		System.out.println("Age :"+student_age);
		System.out.println("Course Name :"+student_course);
		System.out.println("Entrolled Year :"+student_enrolled);
		System.out.println("---------------------------");
		}
		
		
		
		public void employeeDetails()
		{
			//taking details of employee
			System.out.println("------Employee Details------");
			System.out.println("Please enter your first name:");
			emp_firstname = sc.next();
			System.out.println("Please enter your last name:");
			emp_lastname = sc.next();
			System.out.println("Enter Employee ID:");
			emp_id = sc.nextInt();
			System.out.println("Enter your age:");
			emp_age = sc.nextInt();
			System.out.println("Enter your Salary:");
			emp_salary = sc.nextFloat();
			System.out.println("Enter your Departmnet:");
			emp_dept = sc.next();
			System.out.println("Enter Designation:");
			emp_designation = sc.next();
			
			
			//printing employee details
			System.out.println("---------------------------");
			System.out.println("Employee ID :"+emp_id);
			System.out.println("First Name :"+emp_firstname);
			System.out.println("Last Name :"+emp_lastname);
			System.out.println("Department :"+emp_dept);
			System.out.println("Designation :"+emp_designation);
			System.out.println("Salary :"+emp_salary);
			System.out.println("---------------------------");
			
		}

		
	
}//end of class
