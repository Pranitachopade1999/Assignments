package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Java11_5 {

	 public static void main(String[] args) {
		 
	 Scanner sc=new Scanner(System.in);
	 int total=0, choice, price, count=1;
	 var uri="C:\\Pranita\\Price.txt";
	 var uri1="C:\\Pranita\\Total.txt";
	 String resp="yes";
	 do {
	 System.out.println("Select your option \n1:Insert New Price,2: View Purchase, 3: Exit");
	 choice=sc.nextInt();
	 
	 if(choice==1){
	 while(resp.equalsIgnoreCase("yes")){
		 
	 System.out.println("Insert " + count+ " Price");
	 count++;
	 price = sc.nextInt();
	 total=total+price;
	 
	 try {
	 Files.writeString(Path.of(uri),price+ "\n", StandardOpenOption.APPEND);
	 } 
	 catch (IOException e)
	 {
		 e.printStackTrace();
	 }
	 sc.nextLine();
	 System.out.println("Do you want to enter more items? (Yes/No)");
	 resp=sc.nextLine();
	 
	 if(resp.equalsIgnoreCase("no"))
	 break;
	 }
	 }
	 
	 if(choice==2) {
	 System.out.println("Total price of all items is " + total);
	 try {
	 Files.writeString(Path.of(uri1),total+ "\n", StandardOpenOption.APPEND);
	 } 
	 catch (IOException e) 
	 {
		 e.printStackTrace();
	 }
	 }
	 }while(choice!=3);
	 }
	}
