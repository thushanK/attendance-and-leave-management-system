package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AttendanceTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void MarkAttendance() {
		
		Attendance attendance =  new Attendance();
		
		String userID = "800";
		String DateAndTime = "10/01/2021";
		
		String actual = attendance.MarkAttendance(DateAndTime,userID);
		String expected = "800";
		
		assertEquals(expected,actual);
	
	}
	
	@Test
	void RequestLeave() {
		
		Attendance attendance =  new Attendance();
		
		float numberOfLeaveDays = 8;
	
		float actual = attendance.RequestLeave(numberOfLeaveDays);
		float expected = 8;
		
		assertEquals(expected,actual);
	
	}
	
	@Test
	void PendingLeave() {
		
		Attendance attendance =  new Attendance();
	
		float actual = attendance.PendingLeave();
		float expected = 8;
		
		assertEquals(expected,actual);
	
	}
	
	@Test
	void CancleLeave() {
		
		Attendance attendance =  new Attendance();
		
		float numberOfCancleLeaveDates = 8;
	
		float actual = attendance.CancleLeave(numberOfCancleLeaveDates);
		float expected = 0;
		
		assertEquals(expected,actual);
	
	}
	
	@Test
	void RequestNoPayLeave() {
		
		Attendance attendance =  new Attendance();
		
		float numberOfLeaveDays = 8;
	
		float actual = attendance.RequestNoPayLeave(numberOfLeaveDays);
		float expected = 8;
		
		assertEquals(expected,actual);
	
	}
	
	@Test
	void viewLeftLeaves() {
		
		Attendance attendance =  new Attendance();
		
		float initialLeaves = 40;
	
		float actual = attendance.viewLeftLeaves(initialLeaves);
		float expected = 32;
		
		assertEquals(expected,actual);
	
	}
	
	@Test
	void RequestToWorkingFromHome() {
		
		Attendance attendance =  new Attendance();
		
		float numberOfWorkingFromDays = 40;
	
		float actual = attendance.RequestToWorkingFromHome(numberOfWorkingFromDays);
		float expected = 40;
		
		assertEquals(expected,actual);
	}
	
	@Test
	void RequestMedicalLeave() {
		
		Attendance attendance =  new Attendance();
		
		String reaason = "stomach pain";
	
		String actual = attendance.RequestMedicalLeave(reaason);
		String expected = "stomach pain";
		
		assertEquals(expected,actual);
	}
	
	@Test
	void RequestMaternityLeave() {
		
		Attendance attendance =  new Attendance();
		
		float actual = attendance.RequestMaternityLeave();
		float expected = 85;
		
		assertEquals(expected,actual);
	}

	@Test
	void EarnLeave() {
		
		Attendance attendance =  new Attendance();
		
		float workingPayPerWeek = 45;
		
		float actual = attendance.EarnLeave(workingPayPerWeek);
		float expected = 5;
		
		assertEquals(expected,actual);
	}

}
