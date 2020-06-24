package com.altran.bank.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.altran.bank.dao.AccountDao;
import com.altran.bank.dao.AccountDaoImpl;
import com.altran.bank.model.Account;
import com.altran.bank.model.Transaction;
import com.altran.bank.service.BankingService;
import com.altran.bank.service.BankingServiceImpl;

@RestController
public class BankingController {
		
		BankingService bankInterface = new BankingServiceImpl();
		AccountDao accountDao = new AccountDaoImpl();
		Account account = accountDao.getAccountById("XYZ-002");
		long balance = account.getBalance();
				
		@RequestMapping(value="/deposit", method=RequestMethod.POST)
		long deposit(@RequestParam("amount") int amount) throws Exception {
			return bankInterface.deposit(account, amount);
		}
		
		@RequestMapping(value="/withdraw", method=RequestMethod.POST)
		long withdraw(@RequestParam("amount") int amount) throws Exception {
			return bankInterface.withdraw(account, amount);
		}
		
		@RequestMapping(value="/operations", method=RequestMethod.GET)
		List<Transaction> getHistory() throws Exception {
			//return account.getOperations();
			return bankInterface.getOperations(account);
		}
		

}
