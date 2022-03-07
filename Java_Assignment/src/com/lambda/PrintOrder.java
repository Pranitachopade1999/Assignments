package com.lambda;

@FunctionalInterface
interface Order
{
	void printOrder(int price,String status);
}


public class PrintOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order o = (price,status)->{
				 	  if(price>10000 && (status=="ACCEPTED" || status=="COMPLETED"))
				 	  {
				 		  System.out.println("Order is Confirm and printed");
				 	  }
				 	  else
				 	  {
				 		  System.out.println("Order is not Confirm and not printed");
				 	  }
		};
		o.printOrder(10001, "ACCEPTED");
		o.printOrder(20000, "COMPLETED");
		o.printOrder(10, "ACCEPTED");
		o.printOrder(20, "COMPLETED");
		

	}

}
