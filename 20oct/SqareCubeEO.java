//impoting package
import java.util.Scanner;
//Creating class
class SqareCubeEO
{
	//mian method started
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num1;
	    num1 =  sc.nextInt();
		
		// taking input
		
		int num = sc.nextInt();

		//we are creating a menu
		System.out.println("1. Square");
		System.out.println("2. Cube");
		System.out.println("3. Even/Odd");

		int choice= sc.nextInt();

		//Switch case
		switch(choice)
		{
			case 1: square( num1);
			break;
			case 2: cube( num1);
			break;
			case 3: EvenOdd( num1);
			break;
			case 4: System.exit(0);
			break;
			default: System.out.println("wrong input");
		}

	}
	//Method for Square
	static void square(int num1)
	{
		int square = num1*num1;
		System.out.println("Square of number is : "+square);
	}

	//Method for Cube
	static void cube(int num1)
	{
		int cube = num1*num1*num1;
		System.out.println("Square of number is : "+cube);
	}

	//Method for Even/Odd
	static void EvenOdd(int num1)
	{
		if(num1%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
	}


}