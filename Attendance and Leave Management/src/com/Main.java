package com;
import com.User;
import com.Salary;
import com.Attendance;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  


public class Main {

	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		   
		   
		User newUser = new User();
		Salary newSalary = new Salary();
//		newSalary.CalculateOTPerDay(newUser.salary);
//		newSalary.RequestAllowance(newUser.salary);
//		newSalary.CalculateOTPerMonth(newUser.salary);
//		Attendance newAttendance = new Attendance();
//		newAttendance.MarkAttendance(dtf.format(now));
//		newAttendance.RequestLeave();

	}

}
