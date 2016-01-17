package com.digitek.operators;

public class IncrementDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computingresult1();
	}
	public static int computingresult1(){
		
		int no1 =10;
		int no2 = 2*++no1 + no1++ + 3*no1--;
		
		System.out.println("no2"+no2);
		return no2;
	}

}
