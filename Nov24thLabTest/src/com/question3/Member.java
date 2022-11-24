/*
 * Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' 
classes have data members 'specialization' and 'department' respectively. Now, assign name, age,
 phone number, address and salary to an employee and a manager by making an object of both of 
 these classes and print the same.
 * @Author: Sujata kumari
 * @Date: 24/11/2022
 * */


package com.question3;
//declaring a class
public class Member {

	//declaring object
	public String name;
	public int age;
	public String phone_number;
	public String address;
	public int salary;
	
	void print_salary(int salary)
	{
		System.out.println(salary);
	}

}
//extends the details of menber
class Employee extends Member{
	public String Specialization;
	public String department;
	
}
//extends the details of menber
class Manager extends Member{
	public String Specialization;
	public String department;
	
}

