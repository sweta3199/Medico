package com.dao;
import com.dbconnection.*;
import com.bean.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MedicoDaoForView {
	Connection conn;
	TransactionBean Tbean;
	List<TransactionBean> list=new ArrayList<TransactionBean>();
	public MedicoDaoForView(TransactionBean bean)
	{
		this.Tbean=bean;
	}
	
	public List<TransactionBean> showTotalProcedureType() throws Exception
	{
		this.conn=DBConnection.createConnection();
		Statement stmt=conn.createStatement();
		String query="select transactioninfo.procedureType,clinicinfo.clinicName,transactioninfo.prov,date_format(str_to_date(procedureDate,\"%d-%m-%Y\"),\"%Y\") \r\n"
				+ "as year,date_format(str_to_date(procedureDate,\"%d-%m-%Y\"),\"%m\") as Month,COUNT(*) as Count,SUM(transactioninfo.amount) as Amount,transactioninfo.amount \r\n"
				+ "from transactioninfo join clinicinfo on transactioninfo.clinicID=clinicinfo.clinicID  \r\n"
				+ "where date_format(str_to_date(procedureDate,\"%d-%m-%Y\"),'%Y')=\""+Tbean.getYear()+"\" or date_format(str_to_date(procedureDate,\"%d-%m-%Y\"),'%m')=\""+Tbean.getMonth()+"\" or transactioninfo.prov='"+Tbean.getProvider()+"' or clinicinfo.clinicName=\""+Tbean.getclinicName()+"\" group by procedureType;";
		ResultSet rset=stmt.executeQuery(query);
		while(rset.next())
		{
			TransactionBean Tbean=new TransactionBean();
			Tbean.setProcedureType(rset.getString(1));
			Tbean.setclinicName(rset.getString(2)); 
			Tbean.setProvider(rset.getString(3)); 
			Tbean.setYear(rset.getString(4));
			Tbean.setMonth(rset.getString(5));
			Tbean.setCount(rset.getInt(6));
			Tbean.setSumAmount(rset.getInt(7));
			Tbean.setAmount(rset.getInt(8));
			
			list.add(Tbean);
		}
		return list;
		
	}
	
}
