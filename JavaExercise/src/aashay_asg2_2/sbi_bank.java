package aashay_asg2_2;

public class sbi_bank {
	
	String account_type;
	int amount;
	
	public void withdrawFromAccount(int amount, String account_type)
	{
		System.out.println("Welcome to SBI Bank ATM facility");
		
		if(account_type == "Saving" && amount > 15000)
		{
			System.out.println("You have entered amount"+amount+"/- Sorry, you cannot withdraw more than 15000/- at a time/perday");
		}
		else if(account_type == "Saving" && amount < 15000)
		{
			System.out.println("You have withdrawn Rupees"+amount+"/- Please collect your cash, otherwise transaction will be canceled after 30 seconds");
		}
		else if(account_type == "Corporate" && amount > 100000 )
		{
			System.out.println("You have entered amount"+amount+"/- Sorry, you cannot withdraw more than 100000/- at a time/perday");
		}
		else if(account_type == "Corporate" && amount < 100000 )
		{
			System.out.println("You have withdrawn Rupees"+amount+"/- Please collect your cash, otherwise transaction will be canceled after 30 seconds");
		}
		if(account_type == "Current" && amount > 50000)
		{
			System.out.println("You have entered amount"+amount+"/- Sorry, you cannot withdraw more than 50000/- at a time/perday");
		}
		else if(account_type == "Current" && amount < 50000)
		{
			System.out.println("You have withdrawn Rupees"+amount+"/- Please collect your cash, otherwise transaction will be canceled after 30 seconds");
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
		else if(account_type=="Corporate")
		{
			System.out.println("Your Current account statement is sent to your registered email account ");
		}
	}
	
}
