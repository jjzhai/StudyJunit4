package com.jjzhai.calculator;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//参数化测试平方
@RunWith(Parameterized.class)
public class SquareTest {
	private static Calculator calculator = new Calculator();
	private int param;
	private int result;
	
	public SquareTest(int param,int result) {
		this.param = param;
		this.result = result;
	}
	
	@Parameters
	public static Collection data(){
		return Arrays.asList(new Object[][]{
			{2,4},
			{0,0},
			{-3,9}
		});
	}
	
	@Test
	public void testSquare() {
		calculator.square(param);
		assertEquals(result, calculator.getResult());
	}

}
