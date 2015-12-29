package com.digitek.datastructure;

public class NewArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//intarray();
		//intarrays();
		intarraysloop();
	}
	public static void intarray(){
		
		int[] Listofnumber = {5,10,15,20,25};
		  System.out.println("1st element in the array"+ Listofnumber[0]);
		  System.out.println("2nd element in the array"+ Listofnumber[1]);
		  System.out.println("3rd element in the array"+ Listofnumber[2]);
		  System.out.println("4th element in the array"+ Listofnumber[3]);
		  System.out.println("5th element in the array"+ Listofnumber[4]);
		
	}
public static void intarrays(){
		
		int[] Listofnumber = {5,10,15,20,25};
		  System.out.println("1st element in the array"+ Listofnumber.length);
		
		
	}public static void intarraysloop(){
		
		int[] listofNumber = {5,10,15,20,25};
		 
		  for(int counter=0;counter<listofNumber.length;counter++);{
		  
		
		System.out.println("counter value"+ listofNumber);
		  }
	}	
}
