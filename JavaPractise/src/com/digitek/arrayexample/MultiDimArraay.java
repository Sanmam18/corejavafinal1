package com.digitek.arrayexample;

public class MultiDimArraay {

	public static void main(String[] args) {
		
		String[][] names = {
				{"Mr","Mrs","Ms"},
				{"sam","mam","jas"},
				{"Patel","Shah","Desai"}
				
		};
		System.out.println(names[0][0]+names[1][0]+names[2][0]);
		System.out.println(names[0][1]+names[1][1]+names[2][1]);
		System.out.println(names[0][2]+names[1][2]+names[2][2]);

		}
}