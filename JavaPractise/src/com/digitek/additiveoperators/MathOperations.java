package com.digitek.mathoperations;

public class MathOperations {

	//with a return type of int
	public static int addNumbersWithReturnTypeAndAcceptParameters(int a, int b) {

		int c = a+b;
		System.out.println("result from addition with return type/accepts parameters:" + c);
		
		return c;
	}

	public static int multiplication(int no) {
		
		int result = 10 * no;
		System.out.println("result from multiplication"+ result);
		return result;
	}
	
	public static int divideNumbers(int numerator, int denominator) {
		
		int result = numerator/denominator;
		System.out.println("result of division:" + numerator/denominator);
		
		return result;
	}
	
	public static double divideNumbers(int numerator, double denominator) {
		
		double result = numerator/denominator;
		System.out.println("result of division:" + numerator/denominator);
		
		return result;
	}
	
	public static int subtractNumbers(int a, int b) {

		int c = a-b;
		System.out.println("result from subtraction method:" + c);
		return c;
	}
	
	public static boolean isEvenNumber(int number) {
		
		boolean result = false;
		
		if(number%2 == 0) {
			result = true;
			System.out.println("even number");
		} else {
			System.out.println("odd number");
		}
		
		return result;
	}
	
	public static void main(String params[]) {
	//	addNumbers();
	//	int result = addNumbersWithReturnType();
		
		//subtractNumbers();
		//multiplication();
	//	int result1 = addNumbersWithReturnTypeAndAcceptParameters(10, 15);
	//	int result2 = addNumbersWithReturnTypeAndAcceptParameters(40, 60);
	//	int result3 = addNumbersWithReturnTypeAndAcceptParameters(20, 30);
		
	//	isEvenNumber(2);
		
	//	divideNumbers(5,2);
		divideNumbers(5,2.0);
	//	divideNumbers(4,0);
		
	}
	
}

