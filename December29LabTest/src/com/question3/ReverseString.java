	/*
	 * Program: Write a Java program to reverse a string without using StringBuffer and StringBuilder
	 * @Author: Sujata kumari
	 * @Date: 29/12/2022
	 * */
package com.question3;

//importing packages
	import java.util.Scanner;
	//Declaring a class
public class ReverseString {

//		function for reversing string
		void revString(String string) {
			System.out.print("Reversed String: ");
			for (int i = string.length() - 1; i >= 0; i--) {
				System.out.print(string.charAt(i));
			}
		}

//		main method started
		public static void main(String[] args) {

//			scanner class object
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter String: ");
			String str = sc.next();

//			class object
			ReverseString obj = new ReverseString();

//			function calling
			obj.revString(str);
			sc.close();
		}//end of main method

	}// end of class

