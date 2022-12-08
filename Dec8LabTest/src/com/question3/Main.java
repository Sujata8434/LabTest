
package com.question3;
//declaring  main class
public class Main {


		//main method started
		public static void main(String[] args) {
			
			EmployeeSalary obj1 = new EmployeeSalary(1, "Sujata", 95000f, 2);
			EmployeeSalary obj2 = new EmployeeSalary(2, "Sneha", 97000f, 5);
			//printing the salary of emp
			System.out.println("ID: "+obj1.id);
			System.out.println("Name: "+obj1.name);
			System.out.println("Salary: "+obj1.sal);
			System.out.println("Year of Experience: "+obj1.year);
			obj1.increment();
			
			System.out.println("\n");
			System.out.println("ID: "+obj2.id);
			System.out.println("Name: "+obj2.name);
			System.out.println("Salary: "+obj2.sal);
			System.out.println("Year of Experience: "+obj2.year);
			obj2.increment();
				
			
		}//end of main method
}//end of class
