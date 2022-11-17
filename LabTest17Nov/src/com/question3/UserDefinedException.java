/*
	 * Program: Peter wants to implement exception handling, such that if a user enters a menu input other 
	 * than 1, 2, or 3 in the game menu option, an appropriate user-defined exception should be generated. 
	 * In addition, a user-defined exception should be generated if the player
	 *  inputs multiple characters, instead of a single character to identify the possible alphabet in the word.

	 * @Author: Sujata Kumari
	 * @Date: 17/11/2022
 */

package com.question3;
// importing packages
import java.util.Scanner;
//declaring a class 
public class UserDefinedException {

	
		
			//method to create menu
					static void menu()
					{
						System.out.println("1. Play");
						System.out.println("2. Score");
						System.out.println("3. Exit");
						System.out.println("Please enter your choice: ");
					}
					//main method started
					public static void main(String args[])
					{
						menu();
						try {
							//creating scanner object
						Scanner sc = new Scanner(System.in);
						int choice = sc.nextInt();
						System.out.println(choice);
						sc.close();
						
					}
					
					catch(ArithmeticException e)
					{
						System.out.println(e.getMessage());
					}
				} //end of main method
	}	//end of class
