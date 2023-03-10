package com.rishitha.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.rishitha.payroll.model.Employee;
import com.rishitha.payroll.model.EmployeeDTO;
import com.rishitha.payroll.util.POJOMapper;

public class TestEmpPojo {
	public static void main(String[] args) {
		TestEmpPojo test = new TestEmpPojo();
		Employee emp = test.fillObject(123L, "rishi", "gorle", 30000.0, 1,
				40.00);
		Employee emp1 = test.fillObject(453L, "gokul", "gorle", 45600.0, 2,
				50.00);
		// test.print(emp);
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp);
		emplist.add(emp1);
		test.print(emplist);
	}

	private void print(List<Employee> emplist) {
		for (Employee emp : emplist) {
			print(emp);
		}
	}

	public void print(Employee emp) {
		System.out.println(emp.getEmpId());
		System.out.println(emp.getFistName());
		System.out.println(emp.getLastName());
		System.out.println(emp.getSalary());
		System.out.println(emp.getDeduction());
		System.out.println(emp.getNetSalary());
	}

	public Employee fillObject(long l, String string, String string2, double d,
			double d1, double d2) {
		
		Employee emp = new Employee();
		//Employee emp1 = Employee.builder().withDoj(null).withEmpId(32323).withFistName("rishi").withLastName("sree").build();
		emp.setEmpId(l);
		emp.setFistName(string);
		emp.setLastName(string2);
		emp.setSalary(d);
		emp.setDeduction(d1);
		emp.setNetSalary(d2);
		return emp;

	}
	
	public static Employee testTransfer(EmployeeDTO source)
	{ 
			return POJOMapper.INSTANCE.employeeDTOToEmployee(source);
	}

}
