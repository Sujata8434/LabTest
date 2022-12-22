
package com.question4;

//declaring a class
public class MainRectangle {
	//main method started
	 public static void main(String[] args){
		 //creating object of class Rectangle
		    Rectangle r = new  Rectangle(4,5);
		    
		    //printing area and perimeter of Rectangle
		    System.out.println("Area of Rectangle is =");
		    r.printArea();
		    System.out.println("Perimeter of Rectangle is =");
		    r.printPerimeter();
		  //printing area and perimeter of Square
		    Square s = new Square(5,8,10);
			System.out.println("Area of Square is =");
		    s.printArea();
		    System.out.println("Perimeter of Square is =");
		    s.printPerimeter();
		    
		  }//end of main method
	}// end of class


