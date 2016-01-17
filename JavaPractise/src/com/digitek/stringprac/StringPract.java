package com.digitek.stringprac;

public class StringPract {
	void stringManipulation() {
	}
	

	public static void stringManipulation1(){
		String str1 = "Hello World";
		String str2 = "Hello World";
		
	String str3 = new String("Hello World");
	String str4= new String("Hello World");
	String str5 = new String("Hello World");
		  
	System.out.println("str1==str2"+str1==str2);
	System.out.println("str1.equals(str2)"+str1.equals(str2));
	
	System.out.println("str2==str3"+str2==str3);
	System.out.println("str2.equals(str3)"+str2.equals(str3));
	
	System.out.println("str3==str4"+str3==str4);
	System.out.println("str3.equals(str4)"+str3.equals(str4));
	
	System.out.println("str4==str5"+str4==str5);
	System.out.println("str4.equals(str5)"+str4.equals(str5));
	
	String str6 = "hello world";
	System.out.println("str6.equals(str1)"+str6.equals(str1));
	System.out.println("str6.equalsIgnoreCase(str1)"+str6.equalsIgnoreCase(str1));
	
	String str7 = "HelloWorld";
	System.out.println("str7.substring(0)"+str7.substring(0));
	System.out.println("str7.substring(0)"+str7.substring(2));
	System.out.println("str7.substring(0)"+str7.substring(4));
	System.out.println("str7.substring(0)"+str7.substring(6));
	
	String str8 = "Helli World";
	System.out.println("str7.substring(0,1)"+str7.substring(0,1));
	System.out.println("str7.substring(0,2)"+str7.substring(0,2));
	System.out.println("str7.substring(0,4)"+str7.substring(0,4));
	System.out.println("str7.substring(0,8)"+str7.substring(0,8));
	
	
	
	
	
	}

}


