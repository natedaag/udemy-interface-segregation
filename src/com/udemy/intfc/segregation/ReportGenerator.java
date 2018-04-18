package com.udemy.intfc.segregation;

public class ReportGenerator {
	
	private Reporting transactionObject;
	
	public void generateReport() {
		System.out.println(transactionObject.getName()
							+" "+transactionObject.getDate()
							+" "+transactionObject.getProductBreakdown());
	}

}
