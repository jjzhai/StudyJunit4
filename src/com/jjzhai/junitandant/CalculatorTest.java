package com.jjzhai.junitandant;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	private static Calculator calculator=new Calculator();
	
	@Test
	public void testSum() {
		assertEquals(10, calculator.sum(6, 4));
	}

	@Test
	public void testSub() {
		assertEquals(2, calculator.sub(6, 4));
	}

	@Test
	public void testMul() {
		assertEquals(24, calculator.mul(6, 4));
	}

}
