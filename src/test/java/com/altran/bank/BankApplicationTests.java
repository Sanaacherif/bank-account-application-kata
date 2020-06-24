package com.altran.bank;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.altran.bank.model.Account;
import com.altran.bank.service.BankingService;
import com.altran.bank.service.BankingServiceImpl;

@SpringBootTest
class BankApplicationTests {

	long balance = 500;
	BankingService bankInterface = new BankingServiceImpl();
	Account account = new Account("DUBOIS", "XYZ-001");
	
	@Test
	public void depositTest() {
		bankInterface.deposit(account,500);
		assertEquals(balance, account.getBalance());
	}
	
	@Test
	public void withdrawTest() {
		bankInterface.deposit(account,500);
		bankInterface.withdraw(account,300);
		assertEquals(200, account.getBalance());
	}


}
