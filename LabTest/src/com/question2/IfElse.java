/*
 * Lab test
Program: WAP check he/she is allowed tom sit in exam or not
@author: Sujata kumari
@Date: 26 oct 2022  
*/

package com.question2;

import java.util.Scanner;
public class IfElse {

	//main started
		public static void main(String args[])
		{
			//declaring the object of scanner
			Scanner sc= new Scanner(System.in);
			
			//declaring variable 
			int classheld,classattend;
			float percentage;
			
			//taking input
			System.out.println("Enter number of classes held:");
		classheld= sc.nextInt();
		System.out.println("Enter number of classes attended attended by You:");
		classattend= sc.nextInt();
			
			
			//calculating percentage
			percentage= (classattend*100)*classheld;
			
			//checking the student's attendance percentage
			
			if(percentage>=75) {
				//printing student is allowed to sit in exam or not
				System.out.println("Yes you are allowed to sit in the exam"+percentage);
			}
				else {
				System.out.println("No you are not allwed to sit in the exam "+percentage);
				}
			//end of ifelse
			    
		}
			
		// end of main
	
}
//end class