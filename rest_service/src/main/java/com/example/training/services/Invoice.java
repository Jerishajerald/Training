package com.example.training.services;

public class Invoice {
	private int invoiceNumber;
	private String customerName;
	private double quantity;
	private int productRef;
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public int getProductRef() {
		return productRef;
	}
	public void setProductRef(int productRef) {
		this.productRef = productRef;
	}
	@Override
	public String toString() {
		return "invoice [invoiceNumber=" + invoiceNumber + ", customerName=" + customerName + ", quantity=" + quantity
				+ ", productRef=" + productRef + "]";
	}
	public Invoice(int invoiceNumber, String customerName, double quantity, int productRef) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.quantity = quantity;
		this.productRef = productRef;
	}
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
