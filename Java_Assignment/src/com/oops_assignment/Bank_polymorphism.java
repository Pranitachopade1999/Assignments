package com.oops_assignment;

import java.util.Scanner;

public class Bank_polymorphism {

	private double cash;
	
	
	public double getCash() {
		return cash;
	}

	public double setCash(double cash) {
		return this.cash = cash;
	}

	double totalCash(double cash,double FD,double CC)
	{
		double total_cash=0;
		total_cash=total_cash+cash+FD-CC;
		return total_cash;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bank_polymorphism b=new Bank_polymorphism();
		double cash=b.setCash(2000000);
		Saving_Account s= new Saving_Account();
		System.out.println("Enter FD amount :");
		double FD=s.setFD_amount(sc.nextDouble());
		
		Current_Account c= new Current_Account();
		System.out.println("Enter Cash credit amount :");
		double CC=c.setCC_amount(sc.nextDouble());
		
		System.out.println("Total Cash in bank :" + b.totalCash(cash,FD, CC));
	}

}


class Saving_Account extends Bank_polymorphism
{
	private double FD_amount;
	public double getFD_amount() {
		return FD_amount;
	}
	public double setFD_amount(double fD_amount) {
		return FD_amount = fD_amount;
	}
	double totalCash(double FD_amount)
	{
		
		return FD_amount;
		
	}
	}

 class Current_Account extends Bank_polymorphism
 {
	 private double CC_amount;
		public double getCC_amount() {
			return CC_amount;
		}
		public double setCC_amount(double cC_amount) {
			return CC_amount = cC_amount;
		}
	 
	 double totalCash(double CC_amount)
		{
			return CC_amount;
			
		} 
 }