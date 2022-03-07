package com.data_structure;

import java.util.Scanner;

public class Student_Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks of Physics");
		double phy=sc.nextDouble();
		System.out.println("Enter the marks of Chemistry");
		double chem=sc.nextDouble();
		System.out.println("Enter the marks of Biology");
		double bio=sc.nextDouble();
		
		if(phy>60 && chem>60 && bio>60)
		{
			System.out.println("Passed");
		}
		else if(phy>60 && chem>60 || phy>60 && bio>60 || chem>60 && bio>60 )
		{
			System.out.println("Promoted");
		}
		else
		{
			System.out.println("Failed");
		}
		
	}

}
