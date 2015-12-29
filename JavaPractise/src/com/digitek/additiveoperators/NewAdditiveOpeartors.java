package com.digitek.additiveoperators;

public class NewAdditiveOpeartors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		postincrement();
		preincrement();
		conctenation();
	}
		public static void postincrement(){
			int no1 = 5;
			int no = no1++;
			
			System.out.println("got result"+no);
	}

	public static void preincrement(){
		int no1 = 5;
		int no = ++no1;
		
		System.out.println("got result"+no);
	}
	public static void conctenation(){
		
		String text = "HELLO";
		int no = 10;
		
		
		String result = text+no;
		System.out.println("result"+result);
	}
}
