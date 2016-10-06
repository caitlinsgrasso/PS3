package pkg1;

import java.util.Date;

public class CheckingAccount {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	

	public CheckingAccount() {
		this.setId(1);
		this.setBalance(0);
		this.setAnnualInterestRate(0.045);
		this.dateCreated = new Date();
	}


	public CheckingAccount(int id, double balance) {
		this.setId(id);
		this.setBalance(balance);
	}


	public void setId(int id) {
		this.id = id;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}


	public int getId() {
		return id;
	}


	public double getBalance() {
		return balance;
	}


	public double getAnnualInterestRate() {
		return annualInterestRate;
	}


	public Date getDateCreated() {
		return dateCreated;
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void withdraw(double withdrawAmmount) throws InsufficientFundsException{
		if (withdrawAmmount<balance){
			balance=balance - withdrawAmmount;
		}
		else {
			double needs = balance - withdrawAmmount;
			throw new InsufficientFundsException(needs);
		}
	}
	
	public void deposit(double depositAmount){
		balance = balance + depositAmount;
	}
}
