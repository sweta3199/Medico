package com.dao;
import com.bean.PatientBean;

import com.dbconnection.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDaoNoFutureAppointmnets {

	List<PatientBean> list=new ArrayList<PatientBean>();
	Connection conn;
	public List<PatientBean> listOfPatientsWithNoFutureAppointments() throws Exception
	{
		List<PatientBean> list=new ArrayList<PatientBean>();
		conn=DBConnection.createConnection();
		Statement stmt=conn.createStatement();
		String query="select patientinfo.patID,patientinfo.practiceID,patientinfo.lastName,patientinfo.firstName,patientinfo.city,patientinfo.state,patientinfo.gender,patientinfo.patientAgeGroup,patientinfo.birthDate,patientinfo.age from patientinfo,appointmentinfo where patientinfo.patID=appointmentinfo.patID and str_to_date(appointmentinfo.apptDate,\"%d-%m-%Y\")<curdate();";
		ResultSet rset=stmt.executeQuery(query);
		
		while(rset.next())
		{
			PatientBean p=new PatientBean();
			p.setpatId(rset.getInt(1));
			p.setpracticeId(rset.getInt(2));
			p.setlastName(rset.getString(3));
			p.setfirstName(rset.getString(4));
			p.setcity(rset.getString(5));
			p.setstate(rset.getString(6));
			p.setgender(rset.getString(7));
			p.setpatientagegroup(rset.getString(8));
			p.setbirthdate(rset.getString(9));
			p.setage(rset.getString(10));
			
			list.add(p);
		}
		return list;
		
	
	}
}
