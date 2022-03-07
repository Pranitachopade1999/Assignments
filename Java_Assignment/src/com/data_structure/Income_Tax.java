package com.data_structure;

import java.util.Scanner;

public class Income_Tax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your CTC :");
		int salary=sc.nextInt();
		int result=0;
		
		if(salary==0 && salary<=180000)
		{
			System.out.println("Noo Tax(NIL)");
		}
		else if(salary>=181000 && salary<=300000)
		{
			result=(salary*10)/100;
			System.out.println("Tax Amount : " + result);
		}
		else if(salary>=300001 && salary<=500000)
		{
			result=(salary*20)/100;
			System.out.println("Tax Amount " + result);
		}
		else if(salary>=500001 && salary<=1000000)
		{
			result=(salary*30)/100;
			System.out.println("Tax Amount " + result);
		}
	}

}
