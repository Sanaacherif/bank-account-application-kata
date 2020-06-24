package com.altran.bank.service;

import java.util.Date;
import java.util.List;

import com.altran.bank.model.Account;
import com.altran.bank.model.Transaction;

public class BankingServiceImpl implements BankingService {
	
	
	/*US 1:
	In order to save money
	As a bank client
	I want to make a deposit in my account*/
	@Override
	public long deposit(Account account, int amount) {
        
        List<Transaction> operations = account.getOperations();  
        
        Date depositTime = new Date();
        account.setBalance(account.getBalance() + amount);
        Transaction transaction = new Transaction(depositTime, amount, account.getBalance());
        operations.add(transaction);
        return account.getBalance();
    }

	/*US 2:
	In order to retrieve some or all of my savings
	As a bank client
	I want to make a withdrawal from my account*/
	@Override
	public long withdraw(Account account,int amount) {
	    List<Transaction> operations = account.getOperations(); 
	    
	    account.setBalance(account.getBalance() - amount);
        Date withdrawTime = new Date();
        Transaction transaction = new Transaction(withdrawTime, -amount, account.getBalance());
        operations.add(transaction);
		return account.getBalance();
	}

	/*US 3:
	In order to check my operations
	As a bank client
	I want to see the history (operation, date, amount, balance) of my operations*/
	@Override
	public List<Transaction> getOperations(Account account) {
		return account.getOperations();
	}
	 
	
}
