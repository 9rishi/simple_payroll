package com.rishitha.payroll.util;

import lombok.Data;

@Data
public class LoanPOJO {
		
	long accountNo;
	String accountName;
	double amount;
	double period;
	double rate;
	int terms;
	InterestType typeOfLoan;
/**	public double setAccountNo(String string) {

		return Double.parseDouble(string); 
	}
	public double setAmount(String string) {
		
		return Double.parseDouble(string); 		
	}
	public double setPeriod(String string) {
		return Double.parseDouble(string); 
		
	}
	public double setRate(int i) {
		return Double.parseDouble(i); 
		
	}
	**/

}
