package com.jjzhai.calculator;

/*
 * example: http://www.cnblogs.com/kakafra/archive/2012/09/23/2699332.html
 */
public class Calculator {
	public static int result;  //静态变量，用于存储运行结果
	public void add(int n){
		result = result + n;
	}
	public void substract(int n) {
		result = result -1;   //bug：正确的应该是   result = result - n;
	}
	public void multiply(int n) {
		//该方法尚未编写好
	} 
	public void divide(int n){
		result = result/n;
	}
	public void square(int n) {
		result = n*n;
	}
	public void squareRoot(int n) {
		for(;;);   //bug：死循环
	}
	public void clear() {
		result=0;  //将结果清0
	}
	public int getResult() {
		return result;
	}
	public static void main(String[] args) {
		
	}
}
