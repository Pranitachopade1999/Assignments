package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest {

	@Test
	void test() {
		BankAccount b=new BankAccount();
		double expected=15000;
		double actual=b.withdraw(5000, 20000);
		assertEquals(expected,actual);
			}
	
	@Test
	void test1() {
		BankAccount b=new BankAccount();
		assertThrows(InsufficentFundException.class,()->b.withdraw(20000,19000),"Please enter valid amount");
	}

}
