	
	/*
	 * Program: Steve is a programmer in Global Systems Inc.
	 * He has been assigned a task to create a Java application 
	 * that stores the following details about the 
	 * computer products in a text file:
	 * Product ID
	 * Product name
	 * Product price
	 * As the details are added, they must be appended in the 
	 * ProductDetails.txt file in the D:\Details directory.
	 * 
	 * @Author: Sujata kumari
	 * @Date: 15/12/2022
	 * */
package com.question1;
//Importing packages
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//Declare Class
public class ProductDetails {

		// Main method started
		public static void main(String[] args) throws IOException {

			// Scanner class object
			Scanner sc = new Scanner(System.in);

			// asking user to enter details of product 
			System.out.println("Enter Product ID: ");
			String productID = sc.next();
			System.out.println("Enter Product Name: ");
			String productName = sc.next();
			System.out.println("Enter Product Price: ");
			String productPrice = sc.next();

			// FileWriter Object
			FileWriter fwr = new FileWriter("F:\\Details Directory/ProductDetails.txt");

			// Calling FileWriter with his object for writing in a file
			fwr.write(productID + "\n" + productName + "\n" + productPrice);
			fwr.close();
			sc.close();

		}// end of main method 

	}// end of class

