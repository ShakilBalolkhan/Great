package com.shakil.khan;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Emp {final static String INSERT_STRING="insert into friends (id,name,branch) values(11,'mark','mech')";

public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/same","root","0000");
		System.out.println("hello world");
		Statement statement;
		statement=connection.createStatement();
		statement.executeUpdate(INSERT_STRING);
		System.out.println("data inserted ");
	}catch (ClassNotFoundException e) {
		System.out.println("Class not found");
	}catch (SQLException e) {
		System.out.println("Sql Exception");
		System.out.println(e);
	}



}}
