package com.altran.bank.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.altran.bank.service.BankingService;

public class Account{

    String accountName, accountId;
    long balance;
    List<Transaction> operations = new ArrayList<Transaction>();  
   
    public Account(String accountName, String accountId) {
		super();
		this.accountName = accountName;
		this.accountId = accountId;
	}
    
    
    public String getAccountId() {
		return accountId;
	}


	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}


	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public List<Transaction> getOperations() {
		return operations;
	}

	public void setOperations(List<Transaction> operations) {
		this.operations = operations;
	}

}
