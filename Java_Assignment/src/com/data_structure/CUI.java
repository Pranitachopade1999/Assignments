package com.data_structure;

import java.util.Scanner;

public class CUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String Username="PranitaChopade";
		final String Password="Pranita@1234";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your login Credentials");
		String username=" ";
		String password=" ";
		int count=1;
		
	while(count!=4 && !Username.equals(username) && !Password.equals(password))	
	{
		System.out.println("Enter Your Username ");
		username=sc.nextLine();
		System.out.println("Enter Your Password ");
		password=sc.nextLine();
		if(Username.equals(username) && Password.equals(password))
		{
			System.out.println("Welcome..!!");
			break;
		}
		System.out.println("\nThis is your " + count + " Attempt.\n");
		System.out.println("**********************");
		count++;
	}
	if(count==4)
		System.out.println("Your Three attempt unsuccessful.\n\nplease Contact Admin");
		
	}

}
