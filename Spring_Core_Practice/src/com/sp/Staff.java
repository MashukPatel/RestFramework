package com.sp;

public class Staff 
{
	String stname;
	Subject subject;
	
	public Staff(String stname, Subject subject) 
	{
		this.stname=stname;
		this.subject=subject;
	}
	
	public void callStaff()
	{
		System.out.println("Staff name :- "+stname);
		System.out.println("Subject name :- "+subject.subname);
	}
}
