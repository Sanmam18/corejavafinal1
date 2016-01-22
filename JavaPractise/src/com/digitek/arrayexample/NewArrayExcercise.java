package com.digitek.arrayexample;

public class NewArrayExcercise {

	public static void main(String[] args) {
	
		int[] sanArray;
		sanArray = new int[5];
		
		
		sanArray[0] = 10;
		sanArray[1] = 20;
		sanArray[2] = 30;
		sanArray[3] = 40;
		sanArray[4] = 50;
		
		System.out.println("total"+ sanArray.length);
		
		System.out.println("Element in 1st index"+sanArray[0]);
		System.out.println("Element in 2nd index"+sanArray[0]);
		System.out.println("Element in 3rd index"+sanArray[0]);
		System.out.println("Element in 4th index"+sanArray[0]);
		System.out.println("Element in 5th index"+sanArray[0]);
		
		int[] sanArray1 = {10,20,30,40,50}; 
		
		System.out.println("Element in 1st index"+sanArray1[0]);
		System.out.println("Element in 2nd index"+sanArray1[1]);
		System.out.println("Element in 3rd index"+sanArray1[2]);
		System.out.println("Element in 4th index"+sanArray1[3]);
		System.out.println("Element in 5th index"+sanArray1[4]);
		
		String[][]names =  {
				{"mr","mrs","ms"},
				{"sanjay","chhaya","x"}
				
		};
		System.out.println(names[0][0]+names[1][0]);
		System.out.println((names[0][2]+names[1][1]));
	
		
	}
	
	
	}
		

	


