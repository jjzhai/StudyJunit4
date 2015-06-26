package com.jjzhai.calculator;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class CalculatorTest {

	private static Calculator calculator = new Calculator();
	@Before
	public void setUp() throws Exception {
		calculator.clear();
	}

	@Test
	public void testAdd() {
		calculator.add(2);
		calculator.add(3);
		assertEquals(5, calculator.getResult());
	}

	@Test
	public void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8, calculator.getResult());
	}

	@Ignore("Multiply() Not yet implemented")
	@Test
	public void testMultiply() {
		
	}

	@Test
	public void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}

	@Test(timeout=1000)  //限时测试
	public void testsquareRoot(){
		calculator.squareRoot(4);
		assertEquals(2, calculator.getResult());
	}
	
	@Test(expected = ArithmeticException.class)  //异常测试
	public void divideByZero(){
		calculator.divide(0);
	}
	
	@Test                  //非参数化测试平方正数
	public void testSquare1(){
		calculator.square(2);
		assertEquals(4, calculator.getResult());
	}
	
	@Test                  //非参数化测试平方0
	public void testSquare2(){
		calculator.square(0);
		assertEquals(0, calculator.getResult());
	}
	
	@Test                  //非参数化测试平方负数
	public void testSquare3(){
		calculator.square(-3);
		assertEquals(9, calculator.getResult());
	}
}
