package com.rishitha.test;

import java.io.IOException;
import java.util.Properties;

import com.rishitha.payroll.model.Employee;
import com.rishitha.payroll.model.EmployeeDTO;

public class TestProperty {
	public static void main(String[] args) {
		//System.getProperties().list(System.out);
		System.out.println(System.getProperty("user.name"));
		Properties myproperties = new Properties();
		
		myproperties.setProperty("hat", "23");
		System.out.println(myproperties.getProperty("hat"));
		
		// Thread.currentThread().getContextClassLoader().getResourceAsStream("app.properties");
	  
	    try {
			myproperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("app.properties"));
			myproperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("userapp.properties"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    myproperties.list(System.out);
	
	
	EmployeeDTO e1=new EmployeeDTO();
	e1.setEmpId(12);
	e1.setFName("sree");
	e1.setLName("g");
	e1.setSalary(34.00);
	Employee e = TestEmpPojo.testTransfer(e1);
	System.out.println(e.getEmpId());
	System.out.println(e.getFistName());
	System.out.println(e.getLastName());
	System.out.println(e.getSalary());
	
	}
}
