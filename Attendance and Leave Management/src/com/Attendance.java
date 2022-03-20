package com;

import java.util.Scanner;

public class Attendance {

	private String userID;
	private float numberOfLeaveDays = 8;
	private String leaveStartDay;
	private String leaveEndDay;
	private String leaveReason;
	private float pendingLeave;
	private float leftLeaves;
	private float numberOfWorkingFromDays = 0;
	private String workingFromHomeStartDay;
	private String workingFromHomeEndDay;
	private String medicalReason;
	
	public String MarkAttendance(String DateAndTime, String userID ) {

		System.out.println("-----------------------------Mark Attendance----------------------------------");
		Scanner scannerAttendance = new Scanner(System.in);
//		System.out.print("Enter User ID (User Id should have numbers) : ");
//		this.userID = scannerAttendance.next();
		if (!userID.matches("[0-9]+")) {
		    System.out.println("Invalid User ID");
		    System.out.print("Enter valid User ID (User Id should have numbers) : ");
			this.userID = scannerAttendance.next();
			do {
				System.out.print("Enter valid User ID (User Id should have numbers) : ");
				this.userID = scannerAttendance.next();
			}while (!userID.matches("[0-9]+"));
		}else {
			System.out.println("****** Marked Attendance Sucessfuly ******");

			System.out.println(DateAndTime + " --> " + userID);
		}

		
		return userID;

	}

	public float RequestLeave(float numberOfLeaveDays) {

		System.out.println("-----------------------------Request a Leave----------------------------------");
		Scanner scannerLeave = new Scanner(System.in);

//		System.out.print("Enter User ID : ");
//		this.userID = scannerLeave.next();
//		
//		System.out.print("Leave start date (yyyy/MM/dd) : ");
//		this.leaveStartDay = scannerLeave.next();
//		System.out.print("Leave end date (yyyy/MM/dd) : ");
//		this.leaveEndDay = scannerLeave.next();
//
//		System.out.print("Enter Number of days : ");
//		this.numberOfLeaveDays = scannerLeave.nextInt();

		if (numberOfLeaveDays > 0) {

			System.out.print("Number of leave dates  : " + numberOfLeaveDays);

		} else {
			System.out.print("Enter vaild date : ");
			this.numberOfLeaveDays = scannerLeave.nextInt();
			
			do {
				System.out.print("Enter vaild date : ");
				this.numberOfLeaveDays = scannerLeave.nextInt();
			}while (numberOfLeaveDays < 0);
		}
		
		System.out.println("****** Requested Leave details ******");
		
//		System.out.println("User ID           : " + userID);
//		System.out.println("Leave start date  : " + userID);
//		System.out.println("Leave end date    : " + userID);
//		System.out.println("Number of days    : " + userID);
		
		return numberOfLeaveDays;

	}
	
	public float PendingLeave() {
		
		pendingLeave =  numberOfLeaveDays;
		
		return pendingLeave;
		
	}
	
	public float CancleLeave(float numberOfCancleLeaveDates) {
		
		if(numberOfCancleLeaveDates > numberOfLeaveDays) {
			System.out.println("Your Requested leave dates are " + numberOfLeaveDays);
		}else {
			numberOfLeaveDays = numberOfLeaveDays - numberOfCancleLeaveDates;
		}
		
		return numberOfLeaveDays;
		
	}
	
	public float RequestNoPayLeave(float numberOfLeaveDays) {

		System.out.println("-----------------------------Request NoPay Leave----------------------------------");
		Scanner scannerLeave = new Scanner(System.in);

//		System.out.print("Enter User ID : ");
//		this.userID = scannerLeave.next();
//		
//		System.out.print("Leave start date (yyyy/MM/dd) : ");
//		this.leaveStartDay = scannerLeave.next();
//		System.out.print("Leave end date (yyyy/MM/dd) : ");
//		this.leaveEndDay = scannerLeave.next();
//
//		System.out.print("Enter Number of days : ");
//		this.numberOfLeaveDays = scannerLeave.nextInt();

		if (numberOfLeaveDays > 0) {

			System.out.print("Number of leave dates  : " + numberOfLeaveDays);

		} else {
			System.out.print("Enter vaild date : ");
			this.numberOfLeaveDays = scannerLeave.nextInt();
			
			do {
				System.out.print("Enter vaild date : ");
				this.numberOfLeaveDays = scannerLeave.nextInt();
			}while (numberOfLeaveDays < 0);
		}
		
		System.out.println("****** Requested NoPay Leave details ******");
		
//		System.out.println("User ID           : " + userID);
//		System.out.println("Leave start date  : " + leaveStartDay);
//		System.out.println("Leave end date    : " + leaveEndDay);
//		System.out.println("Number of days    : " + numberOfLeaveDays);
		
		return numberOfLeaveDays;

	}
	
	
	public float viewLeftLeaves(float initialLeaves) {
		
		float leftLeaves = initialLeaves - numberOfLeaveDays;
		
		return leftLeaves;
	}
	
	public float RequestToWorkingFromHome(float numberOfWorkingFromDays) {

		System.out.println("-----------------------------Request to working from home----------------------------------");
		Scanner scannerWFH = new Scanner(System.in);

//		System.out.print("Enter User ID : ");
//		this.userID = scannerWFH.next();
//		
//		System.out.print("working from start date (yyyy/MM/dd) : ");
//		this.workingFromHomeStartDay = scannerWFH.next();
//		System.out.print("working from end date (yyyy/MM/dd) : ");
//		this.workingFromHomeEndDay = scannerWFH.next();
//
//		System.out.print("Enter Number of days : ");
//		this.numberOfWorkingFromDays = scannerWFH.nextInt();

		if (numberOfWorkingFromDays > 0) {

			System.out.print("Number of WFH dates  : " + numberOfWorkingFromDays);

		} else {
			System.out.print("Enter vaild date : ");
			this.numberOfWorkingFromDays = scannerWFH.nextInt();
			
			do {
				System.out.print("Enter vaild date : ");
				this.numberOfWorkingFromDays = scannerWFH.nextInt();
			}while (numberOfWorkingFromDays < 0);
		}
		
		System.out.println("****** Requested working from home ******");
//		
//		System.out.println("User ID           : " + userID);
//		System.out.println("Leave start date  : " + workingFromHomeStartDay);
//		System.out.println("Leave end date    : " + workingFromHomeEndDay);
		System.out.println("Number of days    : " + numberOfLeaveDays);
		
		return numberOfWorkingFromDays;

	}
	
	public String RequestMedicalLeave(String medicalReason) {

		System.out.println("-----------------------------Request medical Leave ----------------------------------");
		Scanner scannerWFH = new Scanner(System.in);

//		System.out.print("Enter User ID : ");
//		this.userID = scannerWFH.next();
//		System.out.print("Reason : ");
//		this.medicalReason = scannerWFH.next();
		
		
		return medicalReason;

	}
	
	
	public float RequestMaternityLeave() {

		System.out.println("-----------------------------Request maternity Leave ----------------------------------");
		Scanner scannerMaternity = new Scanner(System.in);

//		System.out.print("Enter User ID : ");
//		this.userID = scannerMaternity.next();
//		System.out.print("Start date : ");
//		this.leaveStartDay = scannerMaternity.next();
		
		numberOfLeaveDays = 85;
	
		return numberOfLeaveDays;

	}
	public float EarnLeave(float workingPayPerWeek) {
		
		float earnedLeaveHoures = workingPayPerWeek - 40;
		
		return earnedLeaveHoures;
		
	}
	
	
	
	
}
