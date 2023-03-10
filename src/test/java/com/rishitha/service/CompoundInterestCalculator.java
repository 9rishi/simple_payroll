package com.rishitha.service;

public class CompoundInterestCalculator implements InterestCalclulator {

		@Override
	public double computeInterest(double amount, double period, double rate,
			int terms) {
		
		return amount*(Math.pow(1+rate/terms,terms*period));
	}

		@Override
		public String computeInt(double amount, double period, double rate,
				int terms) {
			// TODO Auto-generated method stub
			return null;
		}

}
