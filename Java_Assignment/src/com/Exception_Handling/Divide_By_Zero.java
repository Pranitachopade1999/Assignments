package com.Exception_Handling;

import java.util.Scanner;

public class Divide_By_Zero {

	public void divide(int num1,int num2) throws UnsupportedOperationException
	{
		if(num2!=0)
		{
			int result=num1/num2;
			System.out.println("Result : " + result);
		}
		else
		{
			throw new UnsupportedOperationException("You can not divide number by zero");
		}	
	}
	

	
	public static void main(String[] args) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		Divide_By_Zero d= new Divide_By_Zero();
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1= sc.nextInt();
		System.out.println("Enter second number :");
		int num2= sc.nextInt();
		d.divide(num1, num2);
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println("Exception Caught : " + e.getMessage());
		}
		
		
	}

}

class UnsupportedOperationException extends Exception
{
	UnsupportedOperationException(String s)
	{
		super(s);
	}
}
