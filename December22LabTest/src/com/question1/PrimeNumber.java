
/*
 *  Program to find prime number in Java
 *  @Author name : Sujata Kumari
 *  @Date : 22/12/2022
 */

package com.question1;
//importing packages
import java.util.Scanner;
public class PrimeNumber {

		//main method started
	   public static void main(String[] args) 
	   {  
	       
	       //Create instance of the Scanner class
	       Scanner sc = new Scanner(System.in);  
	     //Taking input from the user
	       System.out.println("Enter a number : ");  
	       int num = sc.nextInt();  
	       int flag=0; 
	       int i, temp=num/2;      
	       if(num==0||num==1)
	       {  
	          System.out.println(num+" is not prime number");      
	       }
	       else
	       {  
	         for(i=2;i<=temp;i++)
	         {      
	           if(num%i==0)
	           {      
	               System.out.println(num+" is not a prime number");      
	               flag=1;      
	               break;      
	           }      
	         }      
	         if(flag==0)  
	         { 
	             System.out.println(num+" is a prime number");  
	         }  
	        }//end of else  
	   sc.close();
	   }//end of main method
}//end of class
	

