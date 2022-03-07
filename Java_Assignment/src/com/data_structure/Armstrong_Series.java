package com.data_structure;

import java.util.Scanner;

public class Armstrong_Series {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int rem,result=0;
		int newNumber;
		System.out.println("Armstrong number from 100 to 999 are : ");
		for(int i= 100;i<=999;i++)
		{
			int number=i;
			while(number>0)
			{
			rem=number%10;
			result=result+(rem*rem*rem);
     		number=number/10;
		}
			if(result==i)
			{
				System.out.println(i + " ");
			}
			result=0;
		}
		
		
		
	}

	
}
