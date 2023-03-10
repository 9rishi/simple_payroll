package com.rishitha.test;

import com.rishitha.payroll.util.InterestType;
import com.rishitha.payroll.util.LoanPOJO;
import com.rishitha.service.CompoundInterestCal;
import com.rishitha.service.EmiInterestCal;
import com.rishitha.service.InterestCompute;
import com.rishitha.service.SimpleInterestCal;

public class InterestTest {
	public static void main(String[] args) {
		InterestTest test = new InterestTest();
		LoanPOJO loan = new LoanPOJO();
		loan.setAccountName("rishi");
		loan.setAccountNo(345);
		loan.setAmount(4000.00);
		loan.setPeriod(2);
		loan.setRate(12);
		loan.setTypeOfLoan(InterestType.EMI);
		test.computeInterest(loan);
		InterestType interestType[]=InterestType.values();
		for(InterestType type:interestType)
		{
			System.out.println(type.toString());
			System.out.println(type.ordinal());
		}
	}

	 void computeInterest(LoanPOJO loan) {
		
		InterestCompute interestCompute;
		
		switch (loan.getTypeOfLoan()) {
			case SIMPLE :
				interestCompute = new SimpleInterestCal();
			
				System.out.println("loanId:"+loan.getAccountNo());
				System.out.println("interest:"+interestCompute.computeInterest(loan.getAmount(), loan.getPeriod(), loan.getRate(), loan.getTerms()));
				break;
			case COMPOUND:
				interestCompute = new CompoundInterestCal();
				
				System.out.println("loanId:"+loan.getAccountNo());
				System.out.println("interest:"+interestCompute.computeInterest(loan.getAmount(), loan.getPeriod(), loan.getRate(), loan.getTerms()));
				break;
			case EMI:
                interestCompute = new EmiInterestCal();
				
				System.out.println("loanId:"+loan.getAccountNo());
				System.out.println("interest:"+interestCompute.computeInterest(loan.getAmount(), loan.getPeriod(), loan.getRate(), loan.getTerms()));
				break;
			default :
				System.out.println("this is unknown");
				break;
		}
		
	}
}
