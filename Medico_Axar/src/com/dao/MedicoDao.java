package com.dao;
import java.sql.*;
import com.bean.*;
import com.dbconnection.*;

public class MedicoDao {
	AppointmentBean bean;
	Connection conn;
	public MedicoDao(AppointmentBean bean)
	{
		this.bean=bean;
	}
	public int getTotalCountOfAppointment(int i) throws Exception
	{
		int count=0;
		this.conn=DBConnection.createConnection();
		Statement stmt=conn.createStatement();
		String query="";
		switch(i)
		{
			case 1:
				if(!bean.getclinicName().isBlank())
				{
					query="Select * from appointmentinfo  join clinicinfo on appointmentinfo.clinicID=clinicinfo.clinicID and clinicInfo.clinicName like \""+ bean.getclinicName()+"\";";
				}
				break;
			case 2:
				if(!bean.getMonth().isBlank())
				{
					query="select * from appointmentinfo where date_format(str_to_date(apptDate,\"%d-%m-%Y\"),\"%m\")="+bean.getMonth()+";";
				}
				break;
			case 3:
				if(!bean.getYear().isBlank())
				{
					query="select * from appointmentinfo where date_format(str_to_date(apptDate,\"%d-%m-%Y\"),\"%Y\")="+bean.getYear()+";";
				}
				break;
			default:
				query="";
		}
		//else
	//	{
			//System.out.print("Enter valid choice");
		//}
		
		ResultSet rset=stmt.executeQuery(query);
		while(rset.next())
		{
			count+=1;
		}
		return count;
	}
			
}
