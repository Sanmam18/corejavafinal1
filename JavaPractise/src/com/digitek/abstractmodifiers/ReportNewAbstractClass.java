package com.digitek.abstractmodifiers;

public abstract class ReportNewAbstractClass {

	
	public void generateheader(){
		System.out.println("@@@@@@@@@@HEADER@@@@@@@@@@@@");
	}
	public void subheader(){
		System.out.println("@@@@@@@@@@SUBHEADER@@@@@@@@@@@@");
	}
	public void putlogo(){
		System.out.println("@@@@@@@@@@PUTLOGO@@@@@@@@@@@@");
	}
	public abstract void generatebody();
	
	public void generatefooter(){
		System.out.println("@@@@@@@@@@@FOOTER@@@@@@@@@@@@");
	}
}
