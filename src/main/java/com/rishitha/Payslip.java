package com.rishitha;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Payslip {
	public static void main(String args[]) throws Exception {
		try {
			String st = "VENKATA GIRI,NOV,30,3000,2";
			String s[] = st.split(",");
            
			System.out.println("Employee payslip for month: " + s[1]);
			System.out.println("FirstName: " + s[0].split(" ")[0]);
			System.out.println("LastName: " + s[0].split(" ")[1]);
			System.out.println("No of working days: " + s[2]);
			System.out.println("salaray: " + s[3]);
			System.out.println("Leave: " + s[4]);
			Calendar calendar = Calendar.getInstance();
		//	double d=computeDeduction(Integer.parseInt(s[2]),
		//			Double.parseDouble(s[3]), Double.parseDouble(s[4]));
			calendar.add(Calendar.DAY_OF_MONTH, -1);
			calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
			double d=computeDeduction(calendar.getActualMaximum(Calendar.DAY_OF_MONTH),
						Double.parseDouble(s[3]), Double.parseDouble(s[4]));
	  //		double d=computeDeduction(calendar.getActualMaximum(Calendar.DAY_OF_MONTH),
	 //			Double.parseDouble(s[3]), Double.parseDouble(s[4]));
			double d1=computeDeduction(
					Double.parseDouble(s[3]), Double.parseDouble(s[4]));
			
			System.out
					.println("deduction:" +d );
			System.out
			.println("deduction:" +d1 );
			
			System.out.println("Net salary:"+ (Double.parseDouble(s[3]) -d));
			System.out.println(new Date());
			
			System.out.println(calendar.getTime()); calendar.getTime();
			System.out.println(calendar.get(Calendar.MONTH));
			System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
			System.out.println(calendar.getDisplayName(Calendar.MONTH, Calendar.LONG_FORMAT,Locale.ENGLISH));
			SimpleDateFormat sdf = new SimpleDateFormat("MMM");
			System.out.println(sdf.format(calendar.getTime()));
			sdf.applyPattern("dd MMMM yy hh:mm:sss z+");
			System.out.println(sdf.format(calendar.getTime()));
			List myList = new ArrayList();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
	
	}

	static double computeDeduction(int noOfWorkdays, double salary,
			double leaves) 
		{
			/*
			 * double salaryPerDay = salary/noOfWorkdays; double deduction =
			 * salaryPerDay * leaves; return deduction;
			 */
			return salary * leaves / noOfWorkdays;
		}

		
		static double computeDeduction( double salary,
				double leaves) {
			{
				/*
				 * double salaryPerDay = salary/noOfWorkdays; double deduction =
				 * salaryPerDay * leaves; return deduction;
				 */
				Calendar calendar = Calendar.getInstance();
				int noOfWorkdays = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 
				return salary * leaves / noOfWorkdays;
			}
	}
}
