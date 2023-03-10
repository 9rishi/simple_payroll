package com.rishitha.service;

public class SimpleInterestCalculator implements InterestCalclulator {

	@Override
	public String computeInt(double amount, double period, double rate,
			int terms) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double computeInterest(double amount, double period, double rate,
			int terms) {
		
		return amount*period*rate/100;
	}

	

		

}
