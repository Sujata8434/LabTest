/*
 * Program: Create a class with a method that prints "This is parent class" 
 * and its subclass with another method that prints "This is child class".
 *  Now, create an object for each of the class and call
 * 1 - method of parent class by object of parent class
 * 2 - method of child class by object of child class
 * 3 - method of parent class by object of child class
 * @Author: Sujata Kumari
 * @Date: 24/11/2022
 * */

package com.question2;
//importing packages
public  class Inheritance {

	public void show()
	{
		System.out.println("This is Parent Class");
	}

}
//extend class 
class Inheritance2 extends Inheritance{

	public void show()
	{
		//super.show();
		System.out.println("This is  Child Class");
	}
	
}

