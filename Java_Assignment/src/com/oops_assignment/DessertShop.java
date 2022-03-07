package com.oops_assignment;
import java.util.Scanner;

abstract class DessertItem{
	abstract public void getCost(int amt);
}

class Candy extends DessertItem{
	public void getCost(int amount)
	{
		System.out.println("Cost is "+amount*60+"Rs");
	}
}

class Cookie extends DessertItem{
	public void getCost(int amount)
	{
		System.out.println("Cost is "+amount*70+"Rs");
	}
}

class IceCream extends DessertItem{
	public void getCost(int amount)
	{
		System.out.println("Cost is "+amount+"Rs");
	}
}

class AddItem
{
	public void addItem(String s)
	{
	System.out.println(s+ " added successfully!!");	
	}
}


public class DessertShop {

	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your role \n1.Owner\n2.Customer");
			String choose=sc.nextLine();
			switch(choose)
			{
				case "Owner":System.out.println("Which item you want to add? \n1.Apple Pie \n2.Fruit Salad");
				             AddItem a= new AddItem();
				             String add=sc.nextLine();
				             a.addItem(add);
				             
						break;
				case "Customer":System.out.println("\n1.Candy\n2.Cookie\n3.IceCream");
						String chooseDI=sc.nextLine();
						switch (chooseDI)
						{
							case "Candy": System.out.println("Enter amount(Dollars):");
									int amount1=sc.nextInt();
									DessertItem cn =new Candy();
									cn.getCost(amount1);
									break;
							case "Cookie":System.out.println("Enter amount(Euros):");
									int amount2=sc.nextInt();
									DessertItem co =new Cookie();
									co.getCost(amount2);
									break;
							case "IceCream":System.out.println("Enter amount(Rupees):");
									int amount3=sc.nextInt();
									DessertItem ic=new IceCream();
									ic.getCost(amount3);
									break;
							default:System.out.println("Invalid Item");
						}
						break;
				default:System.out.println("Invalid Item Caught");
			}
		
	}
	}

	
