package pkg1;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckingAccountTest {

	CheckingAccount c;

	@Before
	public void setUp() throws Exception {
		c = new CheckingAccount(1122, 20000);
		c.setAnnualInterestRate(0.045);
		
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test(expected = InsufficientFundsException.class) // makes sure the
														// exception is thrown
	public final void testWithdrawException() throws InsufficientFundsException {
		assertEquals("$1000 Expected, actual is $20000", (long) c.getBalance(), (long) 20000);
		c.withdraw(21000);
	}

	@Test
	public final void testDeposit() {
		c.deposit(3000);
		assertTrue(c.getBalance() == 23000);
	}

	@Test
	public final void testWithdraw() throws InsufficientFundsException {
		c.withdraw(2500);
		assertTrue("The balance is now $17500", c.getBalance() == 17500);
	}

	@Test
	public final void testGetBalance() {
		assertTrue(c.getBalance() == 20000);
	}

	@Test
	public final void testGetNumber() {
		assertTrue(c.getId() == 1122);
	}

	@Test
	public final void testGetMonthlyInterestRate() {
		assertTrue("The monthly interest rate is 0.375%", c.getMonthlyInterestRate() == 0.00375);
	}

}


