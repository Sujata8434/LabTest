/*
 * Program: ABC company wants to increment the salary of employees 10% from 
 * their current salary.But the MD of company set the one criteria,
 * those the employee need to be work more than 3 years in this company.
 * Help the HR of ABC company to achieve the task
 * @Author: Sujata Kumari
 * @Date: 08/12/2022
 * */

package com.question3;
//Declaring a class
public class EmployeeSalary {

// declaring the variables and data type
	int id,year;
	float sal;
	String name;
	//
	public EmployeeSalary(int id,String name,float sal,int year) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.year = year;
	}
	public void increment()
	{
		//putting conditions
		if(year>3)
		{
			System.out.println("Congratulations!! Your Salary is incremented");
			System.out.println("Your New Incremented Salary is: "+(sal+((sal*10)/100)));
		}
		else
			System.out.println("Oooh Sorry!! Your Experience is below 3 years");
	}
}


