/* Question number 3
 * @Author name : Sujata Kumari
 *  @Date : 22/12/2022
 */

package com.question3;

 class  Demo {
	//declaring variables
		  String name;
		  int age;
		  String number;
		  String address;
		  int salary;

		  public void printSalary(){
		    System.out.println(salary);
		  }
		  @Override
			public String toString() {
				return "Member [name=" + name + ", age=" + age + ", number=" + number + ", address=" + address + ", salary="
						+ salary + "]";
			}
		}
	//extends Demo into Employee class
		class Employee extends Demo{
		  String specialization;
		  String department;
		}
		//extends Demo into Manager class
		class Manager extends Demo{
			String specialization;
			String department;
		}
		//declare class
		public class Member{
			//main method started
		 public static void main(String[] args){
			 //creating object of employee class
			 Employee emp = new Employee();
		    emp.name = "Sneha Gupta";
		    emp.age = 25;
		    emp.number = "9866548798";
		    emp.address = "Jharkhand";
		    emp.salary = 90000;
		    emp.specialization = "Computer Science";
		    emp.department="Computer Application";
		    System.out.println("Employee Details........");
			System.out.println(emp);

			 //creating object of manager class
		   Manager m = new Manager();
		   m.name = "Sujata kumari";
			m.age = 26;
			m.number = "9955664478";
			m.address = "Chennai";
			m.salary = 95000;
			m.specialization = "Computer Science";
			m.department = "Management";
			System.out.println("Manager Details...................");
			System.out.println(m);

		    
		  }//end of main method
		}//end of class


		

