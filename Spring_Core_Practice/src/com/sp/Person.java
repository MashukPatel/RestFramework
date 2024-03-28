package com.sp;

public class Person 
{
	String name;
	Phone phone;
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	
	public void callPerson()
	{
		System.out.println("Person name :- "+name);
		phone.call();
	}
}
