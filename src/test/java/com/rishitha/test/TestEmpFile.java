package com.rishitha.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import com.rishitha.payroll.model.Employee;

public class TestEmpFile {
	//static final String empFilePath = "C:/temp/employees.txt";
	//static final String empFilePath1 = "C:/temp/hlo.txt";
	public static void main(String[] args) {
		try {
			// List<String> lines = Files.readAllLines(Paths.get(empFilePath));
			//List<String> lines = Files.readAllLines(Paths.get(args[0]));
			Properties myproperties = new Properties();
			 try {
					myproperties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("app.properties"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			String empFile =myproperties.getProperty("employee.salary.file");
			byte[] bytes1 = Files.readAllBytes(Paths.get(empFile));
			Path lines1 = Files.write(Paths.get(empFile), bytes1,
					StandardOpenOption.WRITE);
			List<String> lines = Files.readAllLines(lines1);
		//	boolean lines2 = Files.isWritable(Paths.get(empFilePath));
		//	System.out.println(lines2);
			for (String data : lines) {
				System.out.println(data);
				
				Calendar calendar = Calendar.getInstance();
				SimpleDateFormat sdf = new SimpleDateFormat("MMMMM");
				
				String s[] = data.split(",");
				
				double d1 = computeDeduction(
						calendar.getActualMaximum(Calendar.DAY_OF_MONTH),
						Double.parseDouble(s[3]), Double.parseDouble(s[4]));
			
				double d2 = totalsalary(Double.parseDouble(s[3]), d1);				
				
				System.out.println("Employee payslip for month: " + sdf.format(calendar.getTime()));
				System.out.println("Employee Id:"+s[0]);
				System.out.println("FirstName: " + s[1]);
				System.out.println("LastName: " + s[2]);
				System.out.println("No of working days: " + calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
				System.out.println("salaray: " + s[3]);
				System.out.println("Leave: " + s[4]);
				System.out.println("Deduction: " +d1);
				System.out.println("NetSalary: " +d2);
				
				
				//TestEmpPojo test = new TestEmpPojo();
				
			//	Employee emp = test.fillObject(Long.parseLong(s[0]), s[1], s[2],
				//		Double.parseDouble(s[3]), d1, d2);
			//	test.print(emp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static double totalsalary(double d, double d1) {
		
		return d- d1 ;
	}

	private static double computeDeduction(int noOfWorkdays, double salary,
			double leaves) {
		return salary * leaves / noOfWorkdays;
	}

}
