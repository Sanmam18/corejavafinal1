package com.digitek.additiveoperators;

public class EqualityAndRelationalOperators {

	public static void main(String[] args) {
		 equalityoperators();
		 inequalityoperators();
		 graterthen();
		 graterthenequalto();
		 lessthenequalto();
		 lessthen();

	}
	public static void equalityoperators(){
		
		int no1 = 5;
		int no2 = 5;
		
		boolean sum = no1 == no2;
		System.out.println("my result"+sum);
	}
	public static void inequalityoperators(){
		
		int no1 = 5;
		int no2 = 5;
		
		boolean sum = no1 != no2;
		System.out.println("my result"+sum);
	}
public static void graterthen(){
		
		int no1 = 5;
		int no2 = 5;
		
		boolean sum = no1 > no2;
		System.out.println("grater then"+sum);
}
    public static void graterthenequalto(){
	
	int no1 = 5;
	int no2 = 5;
	
	boolean sum = no1 >= no2;
	System.out.println("grater then"+sum);
}
    public static void lessthenequalto(){
    	
    	int no1 = 5;
    	int no2 = 5;
    	
    	boolean sum = no1 <= no2;
    	System.out.println("less then"+sum);
    }
 public static void lessthen(){
    	
    	int no1 = 5;
    	int no2 = 5;
    	
    	boolean sum = no1 < no2;
    	System.out.println("less "+sum);
    }
}
