package com.rishitha.service;

public class SimpleInterestCal implements  InterestCompute {

	public double computeInterest(double amount, double period, double rate,
		int terms) {
		
		return amount*period*rate/100;
	}

	

}