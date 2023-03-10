package com.rishitha.service;

public class EmiInterestCalculator implements InterestCalclulator {

	

	@Override
	public double computeInterest(double amount, double period, double rate,
			int terms) {
				double a,b;
		a=amount*rate*Math.pow((1+rate),terms);
		b=Math.pow((1+rate),(terms-1));
		return a/b;
	}

	@Override
	public String computeInt(double amount, double period, double rate,
			int terms) {
		// TODO Auto-generated method stub
		return null;
	}

}
