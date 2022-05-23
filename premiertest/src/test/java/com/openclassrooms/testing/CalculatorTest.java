package com.openclassrooms.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import premiertest.Calculator;

public class CalculatorTest {
	
	@Test
	void testAddTwoPositiveNumbers () {
		//Arrange
		int a =2;
		int b= 4;
		
		Calculator calculator= new Calculator();
		
		// Act
		int somme = calculator.add(a, b);
		
		// Assert
		assertEquals(6, somme);
		
	}
	

}
