package com.java.problemsolving;

public class Fibonacci {

	public void formFibonacciSeriesLoop(int n) {

		int num1 = 0, num2 = 1, num3;
		int count = n - 2;
		System.out.print(num1 + "  " + num2 + "  ");
		while (count > 0) {

			num3 = num1 + num2;
			System.out.print(num3 + "  ");
			num1 = num2;
			num2 = num3;
			count--;

		}

	}

	public static void main(String args[]) {
		int n = 10;
		Fibonacci fibonacci = new Fibonacci();
		fibonacci.formFibonacciSeriesLoop(10);
	}
}