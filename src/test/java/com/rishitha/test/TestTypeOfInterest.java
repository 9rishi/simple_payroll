package com.rishitha.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.rishitha.payroll.util.InterestType;
import com.rishitha.payroll.util.LoanPOJO;
import com.rishitha.service.CompoundInterestCalculator;
import com.rishitha.service.EmiInterestCalculator;
import com.rishitha.service.InterestCalclulator;

import com.rishitha.service.SimpleInterestCalculator;

public class TestTypeOfInterest {
	
	static final String interestFilePath = "C:/temp/interest.txt";
	
	public static void main(String[] args) {
		List<String> lines;
		try {
			
			lines = Files.readAllLines(Paths.get(interestFilePath));
			for (String data : lines) {
				System.out.println(data);			
				String[] s = data.split(",");	
			
			TestTypeOfInterest typeOfInterest= new TestTypeOfInterest();
			LoanPOJO loan1 = new LoanPOJO();
			loan1.setAccountName(s[1]);
	//		System.out.println("Account Name:"+loan1.getAccountName());
			loan1.setAccountNo(Long.parseLong(s[0]));
	//		System.out.println("Account Number:"+loan1.getAccountNo());
			loan1.setAmount(Double.parseDouble(s[2]));
   //			System.out.println("Amount:"+loan1.getAmount());
			loan1.setPeriod(Double.parseDouble(s[3]));
 //			System.out.println("Period:"+loan1.getPeriod());
			loan1.setRate(Double.parseDouble(s[5]));
//			System.out.println("Rate:"+loan1.getRate());
			loan1.setTerms(Integer.parseInt(s[4]));
	//	System.out.println("Terms:"+loan1.getTerms());
			loan1.setTypeOfLoan(InterestType.EMI);
			typeOfInterest.computeInt(loan1);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
		


	public void computeInt(LoanPOJO loan1) {
		
InterestCalclulator interestCalclulator;
		
		switch (loan1.getTypeOfLoan()) {
			case SIMPLE :
				
				interestCalclulator = new SimpleInterestCalculator();
			
				System.out.println("Account Number:"+loan1.getAccountNo());
			    System.out.println("Account Name:"+loan1.getAccountName());
				System.out.println("Amount:"+loan1.getAmount());
		     	System.out.println("Period:"+loan1.getPeriod());
				System.out.println("Rate:"+loan1.getRate());
				System.out.println("Terms:"+loan1.getTerms());
				System.out.println("interest:"+interestCalclulator.computeInterest(loan1.getAmount(), loan1.getPeriod(), loan1.getRate(), loan1.getTerms()));
				break;
			case COMPOUND:
				
				interestCalclulator = new CompoundInterestCalculator();
				
				System.out.println("Account Number:"+loan1.getAccountNo());
			    System.out.println("Account Name:"+loan1.getAccountName());
				System.out.println("Amount:"+loan1.getAmount());
		     	System.out.println("Period:"+loan1.getPeriod());
				System.out.println("Rate:"+loan1.getRate());
				System.out.println("Terms:"+loan1.getTerms());
				System.out.println("interest:"+interestCalclulator.computeInterest(loan1.getAmount(), loan1.getPeriod(), loan1.getRate(), loan1.getTerms()));
				break;
			case EMI:
				
             
                interestCalclulator = new EmiInterestCalculator();
				
                System.out.println("Account Number:"+loan1.getAccountNo());
			    System.out.println("Account Name:"+loan1.getAccountName());
				System.out.println("Amount:"+loan1.getAmount());
		     	System.out.println("Period:"+loan1.getPeriod());
				System.out.println("Rate:"+loan1.getRate());
				System.out.println("Terms:"+loan1.getTerms());
				System.out.println("interest:"+interestCalclulator.computeInterest(loan1.getAmount(), loan1.getPeriod(), loan1.getRate(), loan1.getTerms()));
               
				break;
			default :
				System.out.println("this is unknown");
				break;
		}
	}
}
 