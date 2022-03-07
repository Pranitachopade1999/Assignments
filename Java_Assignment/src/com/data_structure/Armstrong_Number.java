package com.data_structure;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number= sc.nextInt();
		
		int rem,result=0;
		int newNumber=number;
		while(newNumber!=0)
		{
			rem=newNumber%10;
			result=result+(rem*rem*rem);
			newNumber=newNumber/10;
		}
		
		if(result==number)
		{
			System.out.println(number + " is armstrong number ");
		}
		else
		{
			System.out.println(number + " is not armstrong number ");
		}
	}

}
