package com.udemy.intfc.segregation;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
	
	private List<Product> products;
	private Customer customer;
	
	public CustomerTransaction(Customer cust, List<Product> products) {
		this.products = products;
		this.customer = customer;
	}
	
	// methods for reporting
	/* (non-Javadoc)
	 * @see com.udemy.intfc.segregation.Reporting#getName()
	 */
	@Override
	public String getName() {
		System.out.println("Getting Customer Name");
		return customer.getName();
	}
	/* (non-Javadoc)
	 * @see com.udemy.intfc.segregation.Reporting#getDate()
	 */
	@Override
	public Date getDate() {
		System.out.println("Getting Date");
		return new Date();
	}
	@Override
	public String getProductBreakdown() {
		String reportList = "";
		for (Product product : products) {
			reportList += product.getProductName();
}
		return reportList;
	}
	
	// methods for billing
	/* (non-Javadoc)
	 * @see com.udemy.intfc.segregation.Accounting#prepareInvoice()
	 */
	@Override
	public void prepareInvoice() {
		System.out.println("Preparing Invoice");
	}
	/* (non-Javadoc)
	 * @see com.udemy.intfc.segregation.Accounting#chargeCustomer()
	 */
	@Override
	public void chargeCustomer() {
		System.out.println("Charging Customer");
	}

}
