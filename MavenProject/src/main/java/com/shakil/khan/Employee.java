package com.shakil.khan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;


	public class Employee {
		final static String INSERT_STRING="insert into Remo(id,name,city,salary) values(?,?,?,?)";
		public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException{
			
			
			Properties properties=new Properties();
			FileInputStream f1 =new FileInputStream("C:\\Users\\HP\\Desktop\\bhediya\\MavenProject\\src\\main\\java\\com\\shakil\\khan");
			properties.load(f1);
			String driverString=properties.getProperty("driver");
			String conString=properties.getProperty("constring");
			String user=properties.getProperty("user");
			String password=properties.getProperty("password");
			
			Class.forName(driverString);
			Connection connection=DriverManager.getConnection(conString,user,password);
			System.out.println("connected");
			
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter Name:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String nameString=sc.next();
			System.out.println("Enter city:");
			String cityString=sc.next();
			float salary=sc.nextFloat();

			
			PreparedStatement ps=connection.prepareStatement(INSERT_STRING);
			ps.setInt(1, id);
			ps.setString(2, nameString);
			ps.setString(3, cityString);
			ps.setFloat(4, salary);
			
			ps.executeUpdate();
			System.out.println("Hogaya");

			
			

		}

	}


