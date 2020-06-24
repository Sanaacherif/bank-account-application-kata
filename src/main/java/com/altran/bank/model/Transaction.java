package com.altran.bank.model;

import java.util.Date;

public class Transaction {
	
	private Date date;
	private double price;
	private double actualBalance;
	

	public Transaction(Date date, double price, double actualBalance) {
		super();
		this.date = date;
		this.price = price;
		this.actualBalance = actualBalance;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	public double getActualBalance() {
		return actualBalance;
	}
	public void setActualBalance(double actualBalance) {
		this.actualBalance = actualBalance;
	}
	

}