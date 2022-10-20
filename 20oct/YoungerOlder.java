
//Program: WAP to calculate the youngest and oldest person in the group
//@author : Sujata Kumari 
//@Date :20 oct 2022 

import java.util.Scanner;

//creating a class
public class YoungerOlder
{	
//main method started
	public static void main(String[] args)
     {
		 //taking inout
		System.out.println("This will show you who is older one and who is youngest person in the group");
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number for the 1st person's age:  ");
		int age1 = sc.nextInt();
		System.out.print("Please enter a number for the 2nd person's age: ");
		int age2 = sc.nextInt();
		System.out.print("Please enter a number for the 3rd person's age: ");
		int age3 = sc.nextInt();
		//declaring min and max
		int maxAge = 0;
		int minAge = 0;
     //comparing the age among three persons who is oldest
		if (age1 > age2 && age1 > age3) { maxAge = age1; }
		if (age2 > age1 && age2 > age3) { maxAge = age2; }
		if (age3 > age1 && age3 > age2) { maxAge = age3; }
	//comparing the age among three persons who is oldest
		if (age1 < age2 && age1 < age3) { minAge = age1; }
		if (age2 < age1 && age2 < age3) { minAge = age2; }
		if (age3 < age2 && age3 < age1) { minAge = age3; }

		System.out.println("The youngest person's age is " + minAge + " and the oldest person's is " + maxAge + " years old.");


	}// end of main method
  }// end of class YoungerOlder