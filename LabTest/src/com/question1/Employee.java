/*
 * Lab test
Program: WAP to print Employee details 
@author: Sujata kumari
@Date: 26 oct 2022  
*/

package com.question1;

public class Employee {

	int eid;
	String ename;
	String edepartment;
	float esalary;

	// method to get the details
	public void getDetails(int id, String n, String d, float sal ) {
		eid = id;
		ename = n;
		edepartment = d;
		esalary= sal;
	}

	// method for printing details
	public void printDetails() {
		System.out.println("Employee Details are:");
		System.out.println("Employee ID:" + eid);
		System.out.println("Employeet Name:" + ename);
		System.out.println("Employee Salary:" + esalary);
	}
}
