package com.crosskey.mortgageCalculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//Benjamin Finell Crosskey application
@SpringBootApplication
public class MortgageCalculatorApplication {
	public static void main(String[] args) throws Exception {
		ReadFile readFile = new ReadFile();
		SpringApplication.run(MortgageCalculatorApplication.class, args);
		readFile.read();
	}
}
