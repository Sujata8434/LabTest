
	/*
	 * Program: Create an application to retrieve information 
	 * (author ID, name, and city) about the authors who are 
	 * living in the city where the city name begins with the 
	 * letter “S”.
	 * 
	 * @Author: Sujata Kumari
	 * @Date: 15/12/2022
	 * */

package com.question2;
//importing packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.Statement;

	//Declaring class
public class AuthorInfo {

	// Main Method
		public static void main(String[] args)
				throws ClassNotFoundException, SQLException, SQLNonTransientConnectionException {
			
			// Declaring Variables
			String url ="jdbc:mysql://localhost:3306/authorinformation";
			String username = "root";
			String password = "";

			// Connection Class for make connection with our database
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement st = conn.createStatement();

			// SQL query for finding city name.
			String sql = "select * from authorinformation where city like '%S'";

			// ResultSet Class used for retrieve data from database.
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
			conn.close();

		}// Main Method Ends

	
	}// Class Ends

