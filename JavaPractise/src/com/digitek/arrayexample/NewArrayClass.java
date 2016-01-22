package com.digitek.arrayexample;

public class NewArrayClass {
    private static int cointer;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	intarray();
		usingloop();
	}
	public static void intarray(){
		int[] listofnumber = {2,4,6,8,10};
		System.out.println("no of element in hte array"+listofnumber.length);
		
		System.out.println("1st element in the array"+listofnumber[0]);
		System.out.println("2nd element in the array"+listofnumber[1]);
		System.out.println("3rd element in the array"+listofnumber[2]);
		System.out.println("4th element in the array"+listofnumber[3]);
		System.out.println("5th element in the array"+listofnumber[4]);
	}
     public static void usingloop(){
    	 int[] listofnumber = {2,4,6,8,10};
 		System.out.println("no of element in hte array"+listofnumber.length);
 		for(int counter=0;counter<10;counter++);
 		
		int counter= 0;
		System.out.println("value in array"+listofnumber[counter]);
     }
}
