package com.question3;

public class VehicelDemo extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread Car1 = new Thread();
		Thread 	Car2 = new Thread();
		Thread Car3 = new Thread();
		Thread Car4 = new Thread();
		Thread Car5 = new Thread();
		Car1.start();
		try {
			Car1.sleep(1000);
			System.out.println("1st Car Starts the journey");
	     Car1.sleep(2000);
			System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Car2.start();
		try {
			Car2.sleep(1400);
			System.out.println("2nd Car Starts the journey");
		     Car2.sleep(2000);
				System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Car3.start();
		try {
			Car3.sleep(1600);
			System.out.println("3rd Car Starts the journey");
		     Car3.sleep(2000);
				System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Car4.start();
		try {
			Car4.sleep(1800);
			System.out.println("4th Car Starts the journey");
		     Car4.sleep(2000);
				System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Car5.start();
		try {
			Car5.sleep(2000);
			System.out.println("5th Car Starts the journey");
		     Car5.sleep(3000);
				System.out.println("Crossed the Bridge");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
