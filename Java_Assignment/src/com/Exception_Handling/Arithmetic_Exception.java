package com.Exception_Handling;

import java.util.Scanner;

public class Arithmetic_Exception {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1= sc.nextInt();
		System.out.println("Enter second number :");
		int num2= sc.nextInt();
		try
		{
			if(num2!=0)
			{
				int result=num1/num2;
				System.out.println("Result : " + result);
			}
			else
			{
				throw new ArithmeticException("You can not divide number by zero");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught: " + e.getMessage());
		}
		
	}

}
