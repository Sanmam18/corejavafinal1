package com.digitek.abstractmodifiers;

public class NewReportClientClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		csvReportClient();
		htmlReportClient();
	}
    public static void csvReportClient(){
    	
    	CSVReportGenerator CSVreport = new CSVReportGenerator();
    	
    	CSVreport.generateheader();
    	CSVreport.subheader();
    	CSVreport.putlogo();
    	CSVreport.generatebody();
    	CSVreport.generatefooter();
    }
    public static void htmlReportClient(){
    	
    	htmlReportGenerator htmlreport = new htmlReportGenerator();
    	
    	htmlreport.generateheader();
    	htmlreport.subheader();
    	htmlreport.putlogo();
    	htmlreport.generatebody();
    	htmlreport.generatefooter();
    }
}
