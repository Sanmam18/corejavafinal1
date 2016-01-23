package com.digitek.arrayexample;

public class ArrayCopy {

	public static void main(String[] args) {
		char [] copyfrom = {'b','e','a','u','t','y','f','u','l'};
		char []  copyto = new char[6];
		
		System.arraycopy(copyfrom,0,copyto,0,6);
		System.out.println(new String(copyto));

	}

	public Object ArrayCopy() {
		// TODO Auto-generated method stub
		return null;
	}

}
