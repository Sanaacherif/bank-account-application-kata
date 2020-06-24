package com.altran.bank.dao;

import java.util.List;

import com.altran.bank.model.Account;

public interface AccountDao {
	   public List<Account> getAllAccounts();
	   public Account getAccountById(String id);
}
