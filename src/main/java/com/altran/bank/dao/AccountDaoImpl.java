package com.altran.bank.dao;

import java.util.ArrayList;
import java.util.List;

import com.altran.bank.model.Account;

public class AccountDaoImpl implements AccountDao{
	
   List<Account> accounts;

   public AccountDaoImpl(){
	   accounts = new ArrayList<Account>();
	   Account account1 = new Account("Robert","ABC-001");
	   Account account2 = new Account("John","XYZ-002");
	   accounts.add(account1);
	   accounts.add(account2);		
   }

	@Override
	public List<Account> getAllAccounts() {
		return accounts;
	}

	@Override
	public Account getAccountById(String id) {
		return accounts.stream().filter(account -> id == (account.getAccountId())).findFirst().orElse(null);
	}
}
