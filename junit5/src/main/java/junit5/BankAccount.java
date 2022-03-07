package junit5;

public class BankAccount {
	
	
	public double withdraw(double amount,double balance)
	{
		
		if(amount<=balance)
		{
			balance=balance-amount;
		}
		else if(balance<20000 )
		{
			throw new InsufficentFundException("Current balance " + balance + " not sufficent");
		}
		
		return balance;
	}

}
class InsufficentFundException extends RuntimeException
{

	public InsufficentFundException(String message) {
	super(message);
	}
	
}
