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
	private float allowance;
	private String userID;
	private float toatalSalary;
	private float numberOfDaysWorked;
	private float medicalAllowances;
	
	public float CalculateOTPerDay (float initialSalary, float workingPayaPerDay) {
		System.out.println("-----------------------------Calculate OT PerDay----------------------------------");
		Scanner scannerSalary = new Scanner(System.in);
//		System.out.println("Enter Working paya perDay : ");
//		this.workingPayaPerDay = scannerSalary.nextInt();
		
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
	
	public float CalculateOTPerMonth (float initialSalary, float workingPayaPerMonth, float LeavesPerMonth) {
		System.out.println("-----------------------------Calculate OT Per Month ----------------------------------");
		Scanner scannerSalary = new Scanner(System.in);
//		System.out.println("Enter Working paya per Month : ");
//		this.workingPayaPerMonth = scannerSalary.nextFloat();
//		System.out.println("Total number of leave day per month (for half day use 0.5) : ");
//		this.LeavesPerMonth = scannerSalary.nextFloat();
		
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
	
	public float RequestAllowance (float initialSalary, String userID, float allowance) {
		System.out.println("-----------------------------Request Allowance----------------------------------");
		Scanner scannerAllowance = new Scanner(System.in);
		
//		System.out.print("Enter User ID (User Id should have numbers) : ");
//		this.userID = scannerAllowance.next();
		if (!userID.matches("[0-9]+")) {
		    System.out.println("Invalid User ID");
		    System.out.print("Enter valid User ID (User Id should have numbers) : ");
			this.userID = scannerAllowance.next();
			do {
				System.out.print("Enter valid User ID (User Id should have numbers) : ");
				this.userID = scannerAllowance.next();
			}while (!userID.matches("[0-9]+"));
		}else {
//			System.out.println("Enter expected allowance (half of monthly salary or less) : ");
//			this.allowance = scannerAllowance.nextFloat();
//			
			float halfOfMonthlySalary = (initialSalary * 20);
			
			if(halfOfMonthlySalary < allowance) {
				System.out.println("Allowance must be half of monthly salary or less");
				System.out.println("Enter expected allowance (half of monthly salary or less) : ");
				this.allowance = scannerAllowance.nextFloat();
				do {
					System.out.println("Enter expected allowance (half of monthly salary or less) : ");
					this.allowance = scannerAllowance.nextFloat();
				}while (halfOfMonthlySalary < allowance);
			}
				
		}
		
		System.out.println("****** Request Allowance details ******");
		
		System.out.println("User ID           : " + userID);
		System.out.println("Allowance         : " + allowance);
		

		
		return 0;
	}
	
	
	public float CalculateMedicalAllowances(float medicalCost) {
		
		float medicalAllowance = medicalCost*10/100;
		
		System.out.println("Medical allowance : " + medicalAllowance );
		
		return medicalAllowance;
		
	}
	
	public float CalculateFoodlowances(float foodCost) {
		
		
		float foodAllowance = foodCost*100/100;
		
		System.out.println("Food allowance : " + foodAllowance );
		
		return foodAllowance;
		
	}
	
	public static float CalculateEPF(float initialSalary) {
        float epf = initialSalary * 8/100;
		
		System.out.println("EPF : " + epf );
		
		return epf;
	}
	
	public static float PetrolAllowance(float initialSalary) {
		
        float petrolAllowance = initialSalary /8;
		
		System.out.println("Petrol allowance : " + petrolAllowance );
		
		return petrolAllowance;
	}
		
	public static float CalculateNetPay(float netpay) {
		
		float  CalculateNetPay = netpay*100/100;
		System.out.println("CalculateNetPay : " + CalculateNetPay );
	
		return CalculateNetPay;
		
	}
	public static float CalculateInsurance(float insurance) {
		return insurance;
		
	}
	public static float CalculateTax(float tax) {
		float a = tax * 12/100;
		return a;
			
	}

//	public float CalculateToatalSalary (float initialSalary) {
//		System.out.println("-----------------------------Calculate Toatal  Salary----------------------------------");
//		Scanner scannerSalary = new Scanner(System.in);
//		
//		System.out.print("Enter User ID (User Id should have numbers) : ");
//		this.userID = scannerSalary.next();
//		if (!userID.matches("[0-9]+")) {
//		    System.out.println("Invalid User ID");
//		    System.out.print("Enter valid User ID (User Id should have numbers) : ");
//			this.userID = scannerSalary.next();
//			do {
//				System.out.print("Enter valid User ID (User Id should have numbers) : ");
//				this.userID = scannerSalary.next();
//			}while (!userID.matches("[0-9]+"));
//		}else {
//			System.out.println("Enter Working paya per Month : ");
//			this.workingPayaPerMonth = scannerSalary.nextFloat();
//			System.out.println("Total number of leave day per month (for half day use 0.5) : ");
//			this.LeavesPerMonth = scannerSalary.nextFloat();
//			
//			workingPayaPerMonth = (workingPayaPerMonth - (LeavesPerMonth * 8));
//			
//			if(workingPayaPerMonth > 160) {
//				float OTpaya = (workingPayaPerMonth - 160);
//				float OTRate = (initialSalary / 8);
//				OTPerMonth = OTpaya * OTRate;
//				
//			}else {
//				OTPerMonth = 0;
//			}
//			
//			System.out.println("Enter allowance (half of monthly salary or less) : ");
//			this.allowance = scannerSalary.nextFloat();
//			
//			float halfOfMonthlySalary = (initialSalary * 20);
//			
//			if(halfOfMonthlySalary < allowance) {
//				System.out.println("Allowance must be half of monthly salary or less");
//				System.out.println("Enter allowance (half of monthly salary or less) : ");
//				this.allowance = scannerSalary.nextFloat();
//				do {
//					System.out.println("Enter allowance (half of monthly salary or less) : ");
//					this.allowance = scannerSalary.nextFloat();
//				}while (halfOfMonthlySalary < allowance);
//			}
//			
////			toatalSalary = OTPerMonth - allowance + ()
//			
//			
//			
//			
//		}
//		
//		return 0;
//	}
//	


	

}