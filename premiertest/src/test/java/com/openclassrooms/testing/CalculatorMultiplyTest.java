package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import premiertest.Calculator;

public class CalculatorMultiplyTest {
	
	@Test
	void testMultiplyTwoPositiveNumbers () {
		//Arrange
		int a =2;
		int b= 4;
		
		Calculator calculator= new Calculator();
		
		// Act
		int multi = calculator.multiply(a, b);
		
		// Assert
		assertEquals(8, multi);
		
	}

	
	

}
