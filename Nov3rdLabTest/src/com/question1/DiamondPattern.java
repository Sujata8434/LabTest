/*program to print Diamond
 * author Sujata Kumari
 * date 3rd November 2022
 */
package com.question1;
//importing package
import java.util.Scanner;
//decalring class 
public class DiamondPattern {
	//main started
	public static void main(String args[])
	{
		//declaring variables
	int number, i, j, space = 1;
	System.out.print("Enter the number of rows you want to make the Dimond pattern : ");
	//creating object of Scanner 
	Scanner sc = new Scanner(System.in);
	number = sc.nextInt();
	space =number - 1;
	for (j = 1; j<= number; j++)
	{
	for (i = 1; i<= space; i++)
	{
	System.out.print(" ");
	}
	
	space--;
	for (i = 1; i <= 2 * j - 1; i++)
	{
	System.out.print("*");
	}
	System.out.println("");
	}
	
	space = 1;
	for (j = 1; j<= number - 1; j++)
	{
	for (i = 1; i<= space; i++)
	{
	System.out.print(" ");
	}
	
	space++;
	for (i = 1; i<= 2 * (number - j) - 1; i++)
	{
	System.out.print("*");
	}
	System.out.println("");
	}
	
	
	}//end of main method
}// end of class
