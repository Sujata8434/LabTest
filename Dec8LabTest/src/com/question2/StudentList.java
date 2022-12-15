/*
 * Program: Identify the student(name) with the help of thier id(unique) from the 
 * 	generic list of students
 * @Author: Sujata kumari
 * @Date: 08/12/2022
 * */

package com.question2;
//importing packages
	import java.util.HashMap;
	import java.util.*;
	//declaring a class
public class StudentList {
		public int iD(int Id)
			{
				return Id;
				}
			public String Name( String Name)
			{
				return Name;	
			}
			//main method started
				public static void main(String[] args) {
			//using HadMap for list
				Map <Integer, String> list = new HashMap<>();
				list.put(1, "Sujata kumari");
				list.put(2, "Sneha Kumari");
				list.put(3, "Sakshi kumari");
				//printing the details
				System.out.println("List is: "+list);
				
		
			}//end of main method
}
