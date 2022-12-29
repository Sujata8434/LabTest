/*
	 * Program: wap to to print duplicate characters in a given string.
	 * @Author: Sujata kumari
	 * @Date: 29/12/2022
	 * */
package com.question4;
// importing packages
import java.util.Scanner;
//Declaring a class
public class DuplicateCharacters {

	
		void duplicate(String string) {
			String dup = "";
			for (int i = 0; i < string.length(); i++) {
//				char x = string.charAt(i);
				for (int j = 0; j < string.length(); j++) {
					if (string.charAt(i) == string.charAt(j)) {
						dup = dup + string.charAt(i);
					}

				}
			}
			System.out.print("Duplicate Characters: " + dup);
		}
		//main method started
		public static void main(String[] args) {
//			scanner class object
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter String: ");
			String str = sc.next();

//			class object
			DuplicateCharacters obj = new DuplicateCharacters();

//			function calling
			obj.duplicate(str);
			sc.close();

		}//end of main  method

	}//end of class

