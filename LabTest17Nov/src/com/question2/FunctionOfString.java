/*
	 * Program: write 5 functions of string in java program
	 * @Author: Sujata Kumari
	 * @Date: 17/11/2022
 */
package com.question2;
//importing packages
import java.util.Scanner;
//declaring a class
public class FunctionOfString {
	
	//Creating object of a scanner class
	Scanner sc = new Scanner(System.in);
		
		void upperCase()
		{
			String str1="Hello this is my String Function program";
			System.out.println(str1.toUpperCase());
		}
		void Length()
		{
			String str2="Hello this is String Length program";
			System.out.println("Length of String: "+str2.length());
		}
		void IndexOf()
		{
			String str3 = "Hello this is index of program";
			System.out.println(str3.indexOf("index"));
		}
		void CharAt()
		{
			String str4 = "Java is object oriented programming language";
			System.out.println(str4.charAt(6));
		}
		void Equals()
		{
			String Str5 = "Sujata";
			String Str6 = "Sujata";
			String Str7 = "You are a programmer";
			System.out.println(Str5.equals(Str6)); // Returns true if they are equal
			System.out.println(Str5.equals(Str7)); // false if they are not equal
		}

		//main method started
		public static void main(String[] args) {
			
			//creating object of class
			FunctionOfString obj = new FunctionOfString();
			//calling methods
			obj.upperCase();
			obj.Length();
			obj.IndexOf();
			obj.CharAt();
			obj.Equals();
			

		}//end of main method

}// end of class
