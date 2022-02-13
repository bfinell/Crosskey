package com.crosskey.mortgageCalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class MortgageCalculatorApplicationTests {
	CalculateMortgage calculateMortgage = new CalculateMortgage();

	@Test
	void contextLoads() {
	}

	@org.junit.jupiter.api.Test
	void calculateIsCorrect() {

		double loan = 2000;
		double interest = 5;
		int years = 8;
		double monthlySum = calculateMortgage.calculate(loan,interest,years);
		assertTrue(monthlySum == 25.32);
	}
	@org.junit.jupiter.api.Test
	void powerIsCorrect(){
		double power = calculateMortgage.power(5,3);
		assertTrue(power == 125);
	}
	@org.junit.jupiter.api.Test
	void roundIsCorrect(){
		double round = calculateMortgage.round(123.925);
		assertTrue(round == 123.93);
	}

}
