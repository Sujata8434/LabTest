/*program for car models
 * author : Sujata kumari
 * date: 10/11/2022
 */

package com.question5;
//importing packages
import java.util.Scanner;
//declaring a class
public class CarModel {
	//creating an object of class
	static Scanner sc = new Scanner(System.in);
	String name,model;
	
	//method to enter Car Details
	void getCarDetails()
	{
		//taking input from user
		System.out.println("Enter Car Company Name:");
		name = sc.next();
		System.out.println("Enter Car Model Name:");
		model = sc.next();
	}
	
	//Method for display Car Details
	void display()
	{
		System.out.println("Company Name: "+name+"\nModel:"+model);
	}
//main ,ethod started
	public static void main(String[] args) {
		
		//Declaring Variables
				int m,num;
				System.out.println("Enter no. of car do you want to enter:");
				num = sc.nextInt();
				
				//Creating object of CarModel class
				CarModel obj[] = new CarModel[num];
				
				//This loop is for entering car details
				for(m=0;m<num;m++)
				{
					obj[m] = new CarModel();//creating obj[0],obj[1],obj[2]......as object of StudentRecord class
					System.out.println("\nEnter data of Car "+(m+1)+"\n");
					obj[m].getCarDetails();
				}
				System.out.println("******************");
				System.out.println("Car Details:");
				System.out.println("----------------------------------------------");
				
				//This loop is for display car Details
				for(m=0;m<num;m++)
				{
					obj[m].display();
					System.out.println("-------------------------------------------");
				}

	} // end of main method 

} // end of class
