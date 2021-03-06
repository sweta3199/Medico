package com.bean;

public class PatientBean {
	
	int patId;
	int practiceId;
	String lastName;
	String firstName;
	String city;
	String state;
	String gender;
	String patientAgeGroup;
	String birthDate;
	String age;
	public int getpatId()
	{
		return this.patId;
	}
	public void setpatId(int id)
	{
		this.patId=id;
	}
	
	public void setpracticeId(int pid)
	{
		this.practiceId=pid;
	}
	public int getpracticeId()
	{
		return this.practiceId;
	}
	
	public void setlastName(String ln)
	{
		this.lastName=ln;
	}
	public String getlastName()
	{
		return this.lastName;
	}
	
	public void setfirstName(String fn)
	{
		this.firstName=fn;
	}
	public String getfirstName()
	{
		return this.firstName;
	}
	
	public void setcity(String c)
	{
		this.city=c;
	}
	public String getcity()
	{
		return this.city;
	}
	
	public void setstate(String s)
	{
		this.state=s;
	}
	public String getstate()
	{
		return this.state;
	}
	
	public void setgender(String g)
	{
		this.gender=g;
	}
	public String getgender()
	{
		return this.gender;
	}
	
	public void setpatientagegroup(String p)
	{
		this.patientAgeGroup=p;
	}
	public String getpatientagegroup()
	{
		return this.patientAgeGroup;
	}
	
	public void setbirthdate(String b)
	{
		this.birthDate=b;
	}
	public String getbirthdate()
	{
		return this.birthDate;
	}
	
	public void setage(String a)
	{
		this.age=a;
	}
	public String getage()
	{
		return this.age;
	}
}
