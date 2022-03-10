package com;
import java.util.Scanner;

public class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private int empID;
	private String department;
	public float salary = 0;

	public User () {
		
		System.out.println("-----------------------------Create New Account----------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student first name : ");
		this.firstName = scanner.nextLine();
		System.out.println("Enter student last name : ");
		this.lastName = scanner.nextLine();
		System.out.println("Enter student age : ");
		this.age = scanner.nextInt();
		System.out.println("Enter student department : ");
		this.department = scanner.nextLine();
		System.out.println("Enter student employee ID : ");
		this.empID = scanner.nextInt();
		System.out.println("Enter student salary per day : ");
		this.salary = scanner.nextFloat();
		System.out.println("-----------------------------New Account----------------------------------");
		System.out.println("First name  : " + firstName);
		System.out.println("Last name   : " + lastName);
		System.out.println("Age         : " + age);
		System.out.println("Employee ID : " + empID);
		System.out.println("Department  : " + department);
		System.out.println("Salary      : " + salary);
		
		


	}
	
	
	
	

}
