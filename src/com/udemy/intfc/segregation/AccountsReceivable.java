package com.udemy.intfc.segregation;

public class AccountsReceivable {
	
	private Accounting transactionObject;
	
	public AccountsReceivable(Accounting transaction) {
		transactionObject = transaction;
	}
	
	public void postPayment() {
		transactionObject.chargeCustomer();
	}
	public void sendInvoice() {
		transactionObject.prepareInvoice();
		//send invoice
	}

}
