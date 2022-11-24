package com.question3;
//declaring a class
public class Print {
	//main method started
	public static void main(String[] args) {
		
		//creating an object of employee
		Employee emp = new Employee();
		//passing values 
		emp.name = "Sujata";
		emp.age = 26;
		emp.phone_number = "0123456789";
		emp.address = "Ranchi";
		emp.department = "CS";
		emp.Specialization = "Java";
		
		//printing details of employee
		System.out.println("...............WELCOME...........");
		System.out.println("..............Employee Details.............");
		System.out.println("Name :"+emp.name);
		System.out.println("Age :"+emp.age);
		System.out.println("Contact :"+emp.phone_number);
		System.out.println("Address :"+emp.address);
		System.out.print("Salary :");
		emp.print_salary(90000);
		System.out.println("Department :"+emp.department);
		System.out.println("Specialization :"+emp.Specialization);
		
	//creating object of Manager 
		Manager m = new Manager();
		//passing values
		m.name = "Sneha";
		m.age= 27;
		m.phone_number = "0213456987";
		m.address= "Ranchi";
		m.department = "IT";
		m.Specialization = "ML";
		
		//printing details of manager
		System.out.println("..........This is for Manager..........");
		System.out.println("Name :"+m.name);
		System.out.println("Age :"+m.age);
		System.out.println("Contact :"+m.phone_number);
		System.out.println("Address :"+m.address);
		System.out.print("Salary :");
		m.print_salary(950000);
		System.out.println("Department :"+m.department);
		System.out.println("Specialization :"+m.Specialization);
		

	} //end of main method
	
	
}// end of class
