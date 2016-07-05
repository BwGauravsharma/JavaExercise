package aashay_asg2_2;

public class axis_bank {
	
	String account_type;
	int amount;
	
	public void withdrawFromAccount(int amount, String account_type)
	{
		System.out.println("Welcome to Axis Bank ATM Facility");
		
		if(account_type=="Saving" && amount>20000)
		{
			System.out.println("You have entered amount "+amount+"/- Sorry, you cannot withdraw more than 20000 at a time/per day. Thank you ");
		}
		else if (account_type=="Saving" && amount < 20000)
		{
			System.out.println("You have withdrawn Rupees"+amount+"/- Please collect your cash, otherwise transaction will be canceled after 30 seconds");
		}
		else if (account_type=="Current" && amount > 75000)
		{
			System.out.println("You have entered amount "+amount+"/- Sorry, you cannot withdraw more than 20000 at a time/per day. Thank you");
			
		}
		else if (account_type=="Current" && amount < 75000)
		{
			System.out.println("You have withdrawn Rupees"+amount+"/- Please collect your cash, otherwise transaction will be canceled after 30 seconds ");
		}
	}
	
	
	public void displayStatement(String account_type)
	{
		System.out.println("Welcome to Account Statement Facility");
		
		if(account_type=="Saving")
		{
			System.out.println("Your Saving account statement is sent to your registered email account");
		}
		else if(account_type=="Current")
		{
			System.out.println("Your Current account statement is sent to your registered email account ");
		}
	}

	
}
