
	/**
	 * Program: Write a Java program and compute the sum of the digits of an integer.
	 * @Author: Sujata kumari
	 * @Date: 29/12/2022
	 */

package com.question2;

//importing packages 
	import java.util.Scanner;
	// Declaring a class
public class SumOfInteger {

//		method for add digits of number
		void integerSum(int n) {
			int r, sum=0;
			while(n>0)
			{
				
				r=n%10;
				sum = sum+ r;
				n=n/10;
				
			}
			System.out.println("Sum of digits of Integer is = "+sum);
			
		}

//		main method started
		public static void main(String[] args) {

			// Class Object
			SumOfInteger obj = new SumOfInteger();

			// Scanner class object
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a no.: ");
			int number = sc.nextInt();

//			calling function
			obj.integerSum(number);
			sc.close();
		}//end of  main method 

	}//  end of class

