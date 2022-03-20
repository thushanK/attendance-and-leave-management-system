package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class SalaryTest {

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
	void testCalculateOTPerDay() {
		
		Salary salary =  new Salary();
		
		float initialSalary = 800;
		float workingPayaPerDay = 10;
		
		float actual = (float) salary.CalculateOTPerDay(initialSalary,workingPayaPerDay);
		float expected = 200;
		
		assertEquals(expected,actual);
	
	}

	@Test
	void testCalculateOTPerMonth() {
		
        Salary salary =  new Salary();
		
		float initialSalary = 800;
		float workingPayaPerMonth = 165;
		float LeavesPerMonth = 0;
		
		float actual = (float) salary.CalculateOTPerMonth (initialSalary, workingPayaPerMonth, LeavesPerMonth);
		float expected = 16500;
		
	}

	@Test
	void testRequestAllowance() {

		Salary salary =  new Salary();
		
		float initialSalary = 800;
		String userID = "123";
		float allowance = 1000;
		
		float actual = (float) salary.RequestAllowance (initialSalary, userID, allowance);
		float expected = 1000;
		
		 
	}
	
	@Test
	void CalculateMedicalAllowances() {
		
		Salary salary =  new Salary();
		
		float medicalCost = 100;
		
		float actual = (float) salary.CalculateMedicalAllowances(medicalCost);
		float expected = 10;
		
		assertEquals(expected,actual);
	
		
	}
	
	@Test
	void CalculateFoodlowances() {
		
		Salary salary =  new Salary();
		
		float foodAllowance  = 100000;
		
		float actual = (float) salary.CalculateFoodlowances(foodAllowance);
		float expected = 100000;
		
		assertEquals(expected,actual);
	
		
	}
	
	@Test
	void CalculateEPF() {
		
		Salary salary =  new Salary();
		
		float initialSalary = 100;
		
		float actual = (float) salary.CalculateEPF(initialSalary);
		float expected = 8;
		
		assertEquals(expected,actual);
	
		
	}
	
	@Test
	void PetrolAllowance() {
		
		Salary salary =  new Salary();
		
		float initialSalary = 8;
		
		float actual = (float) salary.PetrolAllowance(initialSalary);
		float expected = 1;
		
		assertEquals(expected,actual);
	
		
	}
	

	@Test
	void CalculateNetPay() {
		
		Salary salary =  new Salary();
		
		float calculatedNetPay  = 100;
		
		float actual = (float) salary.CalculateNetPay(calculatedNetPay);
		float expected = 100;
		
		assertEquals(expected,actual);
	
		
	}

	@Test
	void CalculateInsurance() {
		
		Salary salary =  new Salary();
		
		float insurance  = 100;
		
		float actual = (float) salary.CalculateInsurance(insurance);
		float expected = 100;
		
		assertEquals(expected,actual);
	
		
	}
	
	@Test
	void CalculateTax() {
		
		Salary salary =  new Salary();
		
		float tax   = 100;
		
		float actual = (float) salary.CalculateTax(tax );
		float expected = 12;
		
		assertEquals(expected,actual);
	
		
	}
}
