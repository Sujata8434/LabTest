/*Write a java program that loads names and phone numbers from a text
file where the data is organized as one line per record and each field in
a record are separated by tab(\t).It takes a name or phone number as
input and prints the corresponding other value from the hash table (hint: use hash tables)
* @ Author: Sujata kumri
* @ Date: 05/01/2023
*/

package com.question1;

//importing packages
import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.Scanner;

//Declaring a class
public class PhoneBook {
	
	//main method started
	public static void main(String args[]) {
		try {
			FileInputStream fi = new FileInputStream("F://myfiledemo.txt");
			Scanner sc = new Scanner(fi).useDelimiter("\t");
			Hashtable<String, String> ht = new Hashtable<String, String>();
			String[] strarray;
			String s, str;
			while (sc.hasNext()) {
				s = sc.nextLine();
				strarray = s.split("\t");
				ht.put(strarray[0], strarray[1]);
				System.out.println("hash table values are" + strarray[0] + ":" + strarray[1]);
			}
			//creating an object of scanner class
			Scanner scn= new Scanner(System.in);
			
			System.out.println("Enter the name as given in the phone book");
			str = scn.next();
			if (ht.containsKey(str)) {
				System.out.println("phone no is" + ht.get(str));
			} else {
				System.out.println("Name is not matched");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
