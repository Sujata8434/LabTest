/*
	 * Program: Peter wants to implement exception handling, such that if a user enters a menu input other
	 *  than 1, 2, or 3 in the game menu option, an appropriate user-defined exception should be generated.
	 *   In addition, a user-defined exception should be generated if the player inputs multiple characters, 
	 * instead of a single character to identify the possible alphabet in the word.
	 
	 * @Author: Sujata Kumari
	 * @Date: 17/11/2022
 */

package com.question4;
//importing packages
import java.util.Scanner;
//declaring a class
	public class Calculator {
		//main method started
		public static void main(String args[])
		{
			//declaring variables
			int number1,number2,ch;
			//creating object of a scanner class
			Scanner sc = new Scanner(System.in);
			//using try 
			try 
			{
				//taking input from user
			System.out.println("Please Enter two numbers : ");
			number1 = sc.nextInt();
		   number2= sc.nextInt();
			System.out.println("Choose the following operations that you want to do:-");
			System.out.println("Addition: 1\n"+"Subtraction: 2\n"+"Multiplication: 3\n"+"Division: 4");
			ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					System.out.println("Addition: "+ (number1+number2));
					break;
				case 2:
					System.out.println("Subtraction: "+ (number1-number2));
					break;
				case 3:
					System.out.println("Multipication: "+ (number1*number2));
					break;
				case 4:
					System.out.println("Division: "+ (number1/number2));
					break;
				case 5: System.exit(0);
				break;
				default:
					System.out.println("Invalid Choice");
					break;
			}
			}
			//catch block
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
			sc.close();
			
		}   // end of main method
}   // end of class
