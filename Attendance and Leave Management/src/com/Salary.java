package com;
import java.util.Scanner;

import com.User;
public class Salary{
	private float initialSalary;
	private int workingPayaPerDay;
	private float workingPayaPerMonth;
	private float LeavesPerMonth;
	private float OTPerDay;
	private float OTPerMonth;
	
	
	public float CalculateOTPerDay (float initialSalary) {
		System.out.println("-----------------------------Calculate OT PerDay----------------------------------");
		Scanner scannerSalary = new Scanner(System.in);
		System.out.println("Enter Working paya perDay : ");
		this.workingPayaPerDay = scannerSalary.nextInt();
		
		if(workingPayaPerDay > 8) {
			float OTpaya = (workingPayaPerDay - 8);
			float OTRate = (initialSalary / 8);
			OTPerDay = OTpaya * OTRate;
			
		}else {
			OTPerDay = 0;
		}
		System.out.println("OT PerDay: " + OTPerDay);
		
		return OTPerDay;
	}
	
	public float CalculateOTPerMonth (float initialSalary) {
		System.out.println("-----------------------------Calculate OT Per Month ----------------------------------");
		Scanner scannerSalary = new Scanner(System.in);
		System.out.println("Enter Working paya per Month : ");
		this.workingPayaPerMonth = scannerSalary.nextFloat();
		System.out.println("Total number of leave day per month (for half day use 0.5) : ");
		this.LeavesPerMonth = scannerSalary.nextFloat();
		
		workingPayaPerMonth = (workingPayaPerMonth - (LeavesPerMonth * 8));
		
		if(workingPayaPerMonth > 160) {
			float OTpaya = (workingPayaPerMonth - 160);
			float OTRate = (initialSalary / 8);
			OTPerMonth = OTpaya * OTRate;
			
		}else {
			OTPerMonth = 0;
		}
		System.out.println("OT Per Month: " + OTPerMonth);
		
		return OTPerMonth;
	}
	

	


	

}