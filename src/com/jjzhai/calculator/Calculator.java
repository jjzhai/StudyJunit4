package com.jjzhai.calculator;

/*
 * example: http://www.cnblogs.com/kakafra/archive/2012/09/23/2699332.html
 */
public class Calculator {
	public static int result;  //��̬���������ڴ洢���н��
	public void add(int n){
		result = result + n;
	}
	public void substract(int n) {
		result = result -1;   //bug����ȷ��Ӧ����   result = result - n;
	}
	public void multiply(int n) {
		//�÷�����δ��д��
	} 
	public void divide(int n){
		result = result/n;
	}
	public void square(int n) {
		result = n*n;
	}
	public void squareRoot(int n) {
		for(;;);   //bug����ѭ��
	}
	public void clear() {
		result=0;  //�������0
	}
	public int getResult() {
		return result;
	}
	public static void main(String[] args) {
		
	}
}
