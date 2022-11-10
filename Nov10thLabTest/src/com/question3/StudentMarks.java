/*program for student marks
 * author : Sujata kumari
 * date: 10/11/2022
 */
package com.question3;
//importing packages
import java.util.Scanner;

//declaring a class
public class StudentMarks {
	// main method started
	 public static void main(String args[]) 
	    {   
		//Creating the object of class
	        Scanner sc = new Scanner(System.in); 
	        //Declaring Variables
	        int n;    
	        String str="Your name";
	        // asking user to enter the array size
	        System.out.println("Enter the total subjects ");
	        n=sc.nextInt();
	        
	        //Declaring the array
	        int arr[] = new int[n]; 
	        System.out.println("Enter the marks secured in each subject ");
	        
	      //Initialize the array
	        for(int i=0;i<n;i++)   
	        {
	            arr[i]=sc.nextInt();
	        }
	        
	        int total=0;
	        
	        //Calculating the total marks
	        for(int i=0;i<n;i++)
	        {
	            total=total+arr[i];
	        }
	        
	        //printing details
	        System.out.println("Enter  your name");
	        str=sc.next();
	        
	        System.out.println(".......................................................................");
	        System.out.println("Student Result");
	        System.out.println("Student Name is :    " +str);
	        //Display the total marks
	        System.out.println("The total marks obtained........  "+total);
	        
	        //Calculating percentage
	        float percentage; 
	        percentage = (total / (float)n); 
	        if(percentage>=60) {
	        	System.out.println(" Congratulations!!!!! You got 1st Rank......");
	        }
	        	else if(percentage<60 && percentage>=50) {
	        	System.out.println("Very good !!!!!! You got 2nd Rank......");
	        	}
	        	else if(percentage<50 && percentage>=40) {
	        	System.out.println("You got 3rd Rank............");
	        	}
	    else 	
	        	System.out.println(" Sorry you are Fail..............");
	        
	        //Display the total percentage
	       // System.out.println( "Total Percentage : " + percentage + "%");   
	        
	    } //end of main method 
}// end of class
