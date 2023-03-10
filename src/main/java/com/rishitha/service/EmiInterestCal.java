package com.rishitha.service;

public class EmiInterestCal implements InterestCompute{

	@Override
	public double computeInterest(double amount, double period, double rate,
			int terms) {
		//P x R x (1+R)^N / [(1+R)^N-1]
		double a,b;
		a=amount*rate*Math.pow((1+rate),terms);
		b=Math.pow((1+rate),(terms-1));
		return a/b;
	}
        
	}
