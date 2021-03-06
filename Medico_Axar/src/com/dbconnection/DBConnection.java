package com.dbconnection;
import java.sql.*;
public class DBConnection {
	
	public static Connection createConnection() throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Medico","root","rathod@99");
		
		return conn;
	}

}
