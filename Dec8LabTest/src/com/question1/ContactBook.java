/*
 * Program: Anna wants to create a Contact book of friends.
 * She needs name,contact number and email of her friends.
 * She don't want duplicates.Help Anna achieve the task.
 * @Author: Sujata kumari
 * @Date: 08/12/2022
 * */

package com.question1;
//importing packages
	import java.util.Iterator;
	import java.util.Vector;
//declaring a class
public class ContactBook {

	public class Contact {
	//main  method started
		public static void main(String args[]){  
			//
			Vector<String> v1=new Vector<String>();  
			v1.add("Ayushi");  
			v1.add("Amit"); 
			v1.add("Sujata");  
			v1.add("Garima");  
			//printing name
			System.out.println("Vector v1 is " + v1);
		 
			  Vector<Integer> v2 = new Vector<Integer>();
			  v2.add(1);
		        v2.add(2);
		        v2.add(3);
		        v2.add(4);
		        //printing id
		        System.out.println("Vector v2 is " + v2);
		  
		    	Vector<String> v3=new Vector<String>();  
				v3.add("Ayushi@gmail.com");  
				v3.add("Amit@gmail.com");  
				v3.add("Sujata@gamil.com");  
				v3.add("Garima@gmail.com");  
				   //printing email id
				 System.out.println("Vector v3 is " + v3);
				
			}  
}
}
