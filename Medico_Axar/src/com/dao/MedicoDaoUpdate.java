package com.dao;
import com.dbconnection.*;
import java.sql.*;

public class MedicoDaoUpdate {
	
	Connection conn;
	
	
	public int[] updateAge() throws Exception 
	{
		int affectedRows[];
		
		this.conn=DBConnection.createConnection();
		Statement stmt=conn.createStatement();
		String query1="update patientInfo set age=datediff(CURDATE(),str_to_date(birthDate,\"%d-%m-%Y\"))/365 where patientInfo.patID!=0;\r\n";
		String query2="UPDATE patientInfo set patientAgeGroup='minor'where age<18 and patID!=0;";
		String query3="UPDATE patientInfo set patientAgeGroup='adult'where age>=18 and patID!=0;";
		
		stmt.addBatch(query1);
		stmt.addBatch(query2);
		stmt.addBatch(query3);
		
		affectedRows=stmt.executeBatch();
		return affectedRows;
	}
	

}
