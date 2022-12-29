	/*
	 * Program: Write a Java program to convert a decimal number to binary number.
	 * @Author: Sujata kumari
	 * @Date: 29/12/2022
	 * */


package com.question1;

//Importing packages
	import java.util.Scanner;
	//  declaring  a class
public class DecimalToBinary {

	
		// function used to convert decimal to binary
		void decToBin(int n) {
			// array to store binary number
			int[] binNum = new int[40];

			// counter for binary array
			int i = 0;
			while (n > 0) {
				binNum[i] = n % 2;
				n = n / 2;
				i++;
			}

			for (int j = i - 1; j >= 0; j--)
				System.out.print(binNum[j]);
		}

		// main method started
		public static void main(String[] args) {

			// Object of class
			DecimalToBinary obj = new DecimalToBinary();

			// Scanner class object
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a decimal no.: ");
			int number = sc.nextInt();
			System.out.println("Decimal No.: " + number);
			System.out.print("Binary No.: ");

			// function calling
			obj.decToBin(number);
			sc.close();
		} // end of main method

	} // end of class

