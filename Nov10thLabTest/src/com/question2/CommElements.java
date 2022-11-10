/*program to find  common elements of 2 different arrays
 * author : Sujata kumari
 * date: 10/11/2022
 */
package com.question2;

//importing packages
import java.util.Arrays;
import java.util.Scanner;
//declaring a class
public class CommElements {

	//main method started
		public static void main(String args[]) 
		    {
		      //declaring array
			  int[] array1st = new int[5];
		      int[] array2nd = new int[5];
		      
		     //Creating an object of Scanner
		      Scanner sc = new Scanner(System.in);
		      
		      //taking input of array1st from user
		      System.out.println("Enter Elements of 1st array");
		      for(int i=0; i<5; i++)
		      {
		    	  array1st[i] = sc.nextInt();
		    	  
		      }
		      
		      //taking input of array2nd from user
		      System.out.println("Enter  Elements of 2nd array");
		      for(int i=0; i<5; i++)
		      {
		    	  array2nd[i] = sc.nextInt();
		    	  
		      }
		 
		       //printing  the values of array
		       System.out.println("1stArray: "+Arrays.toString(array1st));
		       System.out.println("2ndArray : "+Arrays.toString(array2nd));
		 
		      
		       //Checking common array Elements 
		       for (int i = 0; i < 5; i++)
		        {
		            for (int j = 0; j < 5; j++)
		            {
		                if(array1st[i] == (array2nd[j]))
		                {
		                 
		                 System.out.println("Common element is : "+(array1st[i]));
		                 }
		            }
		        }
		       sc.close();
		 
		    }
	
}
