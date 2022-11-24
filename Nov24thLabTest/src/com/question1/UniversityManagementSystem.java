package com.question1;
//importing packages
import java.util.Scanner;
//declaring a class
public class UniversityManagementSystem {

	//main method started
	public static void main(String[] args) {
		//creating an object of Scanner 
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to My University Management System");
		System.out.println("1.Student Details");
		System.out.println("2.Employee Details");
		
		UniversityDetails obj = new UniversityDetails();
		
		//taking choice of the user
		int ch=0;	
		System.out.println("Choose Operations for Entering the Details:");
		
		ch = sc.nextInt();
			switch(ch)
		{
		case 1: 
		{
			obj.studentDetails();
			break;
		}
		case 2:
		{
			obj.employeeDetails();
			break;
		}
		default:
			System.out.println("Invalid Cholice");
			
		}
		

	} //end of main method
}// end of class
