package com.sp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer cc1=(Customer)context.getBean("cc1");
		System.out.println(cc1.getLists());
		System.out.println(cc1.getSets());
	}
}
