package com.bean;

public class AppointmentBean {
	String clinicName;
	String month;
	String year;
	public void setclinicName(String cn)
	{
		this.clinicName=cn;
	}
	public String getclinicName()
	{
		return this.clinicName;
	}
	
	public void setMonth(String m)
	{
		this.month=m;
	}
	public String getMonth()
	{
		return this.month;
	}
	
	public void setYear(String y)
	{
		this.year=y;
	}
	public String getYear()
	{
		return this.year;
	}
}
