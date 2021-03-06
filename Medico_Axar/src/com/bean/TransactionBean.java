package com.bean;

public class TransactionBean {
	String provider;
	String clinicName;
	String month;
	String year;
	String procedureType;
	int count;
	int sumAmount;
	int amount;
	
	public void setCount(int c)
	{
		this.count=c;
	}
	public int getCount()
	{
		return this.count;
	}
	public void setProcedureType(String pt)
	{
		this.procedureType=pt;
	}
	public String getProcedureType()
	{
		return this.procedureType;
	}
	
	public void setclinicName(String cn)
	{
		this.clinicName=cn;
	}
	
	public void setSumAmount(int sa)
	{
		this.sumAmount=sa;
	}
	public int getSumAmount()
	{
		return this.sumAmount;
	}
	
	public void setAmount(int a)
	{
		this.amount=a;
	}
	public int getAmount()
	{
		return this.amount;
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
	public String getProvider()
	{
		return this.provider;
	}
	public void setProvider(String prov)
	{
		this.provider=prov;
	}

}
