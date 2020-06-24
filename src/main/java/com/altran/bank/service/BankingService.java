package com.altran.bank.service;

import java.util.List;

import com.altran.bank.model.Account;
import com.altran.bank.model.Transaction;

public interface BankingService {
	public long deposit(Account account,int amount); 
	public long withdraw(Account account,int amount);
	public List<Transaction> getOperations(Account account);

}
