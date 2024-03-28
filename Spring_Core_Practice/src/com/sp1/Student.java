package com.sp1;

public class Student 
{
	private int sid;
	private String fname,lname,email,mobile;
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	public String toString()
	{
		return "Student[Sid : "+sid+" , Fname : "+fname+" , Lname : "+lname+", Email : "+email+", Mobile : "+mobile+"]" ;
	}
}
