package com.data_structure;

import java.util.Scanner;

public class SI_CI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principal value :");
		double principal=sc.nextDouble();
		System.out.println("Enter the Rate:");
		double rate=sc.nextDouble();
		System.out.println("Enter the Time:");
		double time=sc.nextDouble();
		
		double simple_interest=(principal*rate*time)/100;
		System.out.println("Simple Interest : " + simple_interest);
		
		double compound_interest=principal*(Math.pow((1+rate/100), time));
		System.out.println("Compound Interest : " + compound_interest);
		
	}

}
