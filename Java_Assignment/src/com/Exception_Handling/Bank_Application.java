package com.Exception_Handling;

import java.util.Scanner;

public class Bank_Application {
	private long id;
	private double balance;
	private double amount;
	
   public double getAmount() {
		return amount;
	}

	public double setAmount(double amount) {
		return this.amount = amount;
	}

   public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

    public double withdraw(double amount) throws InsufficientBalanceException
    {
    try
    {
	double balance=getBalance();
	if(amount<=balance)
	{
		balance=balance-amount;
		System.out.println("Balance amount after withdrawn :" + balance);
	}
	else
	{
		throw new InsufficientBalanceException("Sorry !!! No enough balance");
	}
    }
    catch(InsufficientBalanceException e)
    {
    	System.out.println("Exception caught : " + e.getMessage());
    }
	return amount;
	
}
	
	
	public static void main(String args[]) throws InsufficientBalanceException
       {

		Bank_Application b= new Bank_Application();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account number:");
		b.setId(sc.nextLong());
		do
		{
		System.out.println("Enter the Balance:");
		b.setBalance(sc.nextDouble());
		double balance=b.getBalance();
		if(balance<=0)
		{
			System.out.println("Balance should be positive");
		}
		}while(b.getBalance()<=0);
		
		
		try
		{
	     double amount;
		 System.out.println("Enter the amount to withdraw:");
		 amount=b.setAmount(sc.nextDouble());
		 if(amount<=0)
		 {
			throw new IllegalBankTranscationException("Amount should be positive");
		 }
		 else
		 {
		 	b.withdraw(amount);
		 }
		}
	catch(IllegalBankTranscationException ex)
	{
		System.out.println("Exception caught : " + ex.getMessage());
       
	}
}
}


class IllegalBankTranscationException extends Exception
{
	IllegalBankTranscationException(String s)
	{
		super(s);
	}
}

class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String s)
	{
		super(s);
	}
}

