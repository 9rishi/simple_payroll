package com.rishitha.payroll.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Builder(setterPrefix = "with")
public class Employee {
	long empId;
	String fistName;
	String lastName;
	double salary;
	double deduction;
	double netSalary;
	Date doj;
	String s;
	/**public long getEmpId() {
		return empId;
	}
	public void setEmpId(long empId) {
		this.empId = empId;
	}
	public String getFistName() {
		return fistName;
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getDeduction() {
		return deduction;
	}
	public void setDeduction(double deduction) {
	this.deduction =deduction;	
	}
	public double getNetSalary() {
		return netsalary;
	}
	public void setNetSalary(double netSalary) {
		this.netsalary=netSalary;
	}
	
**/
}
