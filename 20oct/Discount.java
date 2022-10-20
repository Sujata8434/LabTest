
//Program: WAP to 
//@author : Sujata Kumari
//@Date :20 oct 2022 

import java.util.Scanner;
class Discount
{
	 //main method started
public static void main(String args[])
{
	//declaring the object of scanner 
Scanner sc=new Scanner(System.in);
   //declaring variables
	float price;
	float amount;
	float discount;
	int quantity;
//taking input
		System.out.println("Enter the number of quantity");
		quantity= sc.nextInt();
		price= sc.nextFloat();
		amount=sc.nextFloat();
		discount= sc.nextFloat();
//calculating the total amount of the oroduct
		amount=quantity*540;
		System.out.println("The total amount is:"+ amount);

//using if condition for calculating the discount
		if(amount>=2000)
		{	
		discount=(amount/100)*10;
		discount=amount-discount;
		}
		//printing the final amount which have to pay 
		System.out.println("you have to pay: "+discount);

	}//end of main 
} // end of class Discount
