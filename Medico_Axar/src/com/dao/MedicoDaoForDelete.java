package com.dao;
import com.dbconnection.*;
import java.sql.*;

public class MedicoDaoForDelete {
	
	Connection conn;
	int affectedRows;
	public int deleteappointment() throws Exception
	{
		conn=DBConnection.createConnection();
		Statement stmt=conn.createStatement();
		String query="delete from appointmentinfo where appointmentinfo.amount<50 and appointmentinfo.apptID!=0;";
		
		affectedRows=stmt.executeUpdate(query);
		return affectedRows;
	}

}
