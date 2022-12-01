/*
 * @Program: The application must fulfill the following requirements:
Initially, when the application is executed, only the RED light must be ON.
After 3 seconds, the RED light should turn off and only the GREEN light should turn ON for 5 seconds.
Then, the GREEN light should turn off and only the YELLOW light should turn ON for 2 seconds.
Then, the YELLOW light should turn to RED.
The preceding process should continue, infinitely.
You also need to display the remaining time for each light.
 * 
 * @Author: Sujata Kumari
 * @Date: 01/12/2022
 * */


package com.question2;
//importing packages
import java.io.*;
//declaring a class
public class TriColorLight extends Thread{
	//main method started
	public static void main(String[] args) {
		
		//methods for thread
		Thread Green = new Thread();
		Thread  Yellow= new Thread();
		Thread Red = new Thread();

	//	public void run()
	//	{
			System.out.println("RED LIGHT IS ON");
			//try catch started
			try {
				
				  Green.sleep(4000);
				System.out.println(" RED Light is OFF");
				System.out.println("Now GREEN Light is ON");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
			Yellow.sleep(4000);
				System.out.println(" GREEN Light is OFF");
				System.out.println("Now YELLOW Light is  ON");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Red.sleep(4000);
				System.out.println("YELLOW Light is OFF");
				System.out.println("Now RED Light is ON");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}//end of main  method
}//end of class 

	
		

