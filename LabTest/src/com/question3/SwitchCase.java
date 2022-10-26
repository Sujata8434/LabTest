/*
 * Lab test
Program: WAP to print Companies tagline
@author: Sujata kumari
@Date: 26 oct 2022  
*/

package com.question3;
//import packages
import java.util.Scanner;
//method to print tagline
public class SwitchCase {

	static void printTagline(String tag)
	{
		//Switch case
		 switch(tag)
	   {
		   //expression level
	   case "tata" ->System.out.println("Isko Laga Dala toh life zingalala.");		               
       case "hp" ->System.out.println("Reinventing the future through transformative technologies.");		              		
       case "accenture"-> System.out.println("Ideate, innovate, change the world, repeat.");		               	
       default-> System.out.println("Wrong input");					
	   } 

	}	
//main started
	public static void main(String[] args)
	{
       // switch case with string
	   String inputTagline;

	    //declaring the object of scanner
		Scanner sc = new Scanner(System.in);
		//printing Companies tagline
		System.out.println("Enter any Company name (TATA,HP,ACCENTURE):");
		inputTagline= sc.next().toLowerCase();// converting the input to lowercase

	   //calling method
	  printTagline(inputTagline);



	}//end of main
}// end of class

