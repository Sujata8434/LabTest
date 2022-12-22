	/* Java program to find palindrome number
   *@Author name : Sujata Kumari
 *  @Date : 22/12/2022
 */
package com.question2;
import java.util.*;
public class PalindromNumber {

		//main method started
	   public static void main(String[] args) 
	   {  
	      
	       //Create instance of the Scanner class
	       Scanner sc = new Scanner(System.in);  
	       //Taking input from the user
	       System.out.println("Enter the number: ");  
	       int num=sc.nextInt();
	       int r,sum=0;
	       int temp=num;    
	       while(num>0)
	       {    
	       r=num%10;    
	       sum=(sum*10)+r;    
	       num=num/10;    
	       }    
	        if(temp==sum)    
	        System.out.println("The entered number "+temp+" is a palindrome number ");    
	        else    
	        System.out.println("The entered number "+temp+" is not a palindrome");
	      sc.close();  
	  }  //end of main method
	} // end of class
	

