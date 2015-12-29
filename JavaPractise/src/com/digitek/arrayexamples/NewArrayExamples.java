package com.digitek.arrayexamples;

public class NewArrayExamples {

	private static int counter;
	public static void main(String[] args) {
		//intarray();
		usingloopinarray();
		//Stringarray();
	}
	public static void intarray(){
		int[]listofnumber = {5,10,15,20,25};
		
		System.out.println("No of elements in the array"+listofnumber.length);
		
		System.out.println("1st elements in the array"+listofnumber[0]);
		System.out.println("2nd elements in the array"+listofnumber[1]);
		System.out.println("3rd elements in the array"+listofnumber[2]);
		System.out.println("4th elements in the array"+listofnumber[3]);
		System.out.println("5th elements in the array"+listofnumber[4]);
	}
	public static void usingloopinarray(){
		int[]listofnumber = {5,10,15,20,25};
		
	
		System.out.println("No of elements in the array"+listofnumber.length);
		for(int counter=5; counter<25; counter=counter++){
		System.out.println("value in array"+listofnumber[counter]);
		}
	}
		public static void Stringarray(){
			String[] months = {"jan","feb","mar","apr","may"};
			
			for(int counter=0; counter<months.length; counter++);
			System.out.println("month from array"+months[counter+2]);
			
		}
			
			
		
		}


