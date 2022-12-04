package model.entities;

import model.exception.AccountErrorException;

public class Account {

	private Integer number;
	private String holder; 
	private Double balance;
	private Double withdrawLimit;
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void deposit(Double amount) {
		balance += amount;
	}
	public void withdraw(Double amount) {
		if(amount > withdrawLimit) {
			throw new AccountErrorException("The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new AccountErrorException("Not enough balance");
		}
		balance -= amount;
	}
	
//	public void updateStatusAccount()
	
	public String toString() {
		return "New balance: " + String.format("%.2f", balance);
	}
}
