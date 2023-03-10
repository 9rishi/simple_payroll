package com.rishitha.service;

public class CompoundInterestCal implements InterestCompute{

	@Override
	public double computeInterest(double amount, double period, double rate,
			int terms) {
		
		return amount*(Math.pow(1+rate/terms,terms*period));
	}

	public double computeInt(double amount, double period, double rate,
			int terms) {
		return amount*(Math.pow(1+rate/terms,terms*period));
	}
	}
