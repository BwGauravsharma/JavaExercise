package aashay_asg2_2;

import java.util.Scanner;

public class axis_bank implements bank_atm_interface {
	
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

	public static void main(String args[])
	{
		int amt;
		Scanner s = new Scanner(System.in);
		axis_bank ax = new axis_bank();
		
		System.out.println("Enter you choice: \n Press 1 for Withdrawl\n Press 2 for Accoount statement");
		int o = s.nextInt();
		
		//-----------Withdrawl amount from Axis Bank-------------------
		if(o == 1 )
		{
			System.out.println("Enter you choice: \n Press 1 for Saving account\n Press 2 for Current");
			int p = s.nextInt();
			if(p == 1)
			{
				System.out.println("Enter the amount in Rupees/-");
				amt = s.nextInt();
				ax.withdrawFromAccount(amt, "Saving");
			}
			else if(p == 2)
			{
				
				System.out.println("Enter the amount in Rupees/-");
				amt = s.nextInt();
				ax.withdrawFromAccount(amt, "Current");
			}
			else
			{
				System.out.println("You have entered incorrect option");
			}
		}
		//-----------Account statement from Axis Bank-------------------
		else if(o == 2)
		{
			System.out.println("Enter you choice: \n Press 1 for Saving Account Statement \n Press 2 for Current Account Statement");
			int q = s.nextInt();
			if(q == 1)
			{
				ax.displayStatement("Saving");
			}	
			else if(q == 2)
			{
				ax.displayStatement("Current");
			}
			else
			{
				System.out.println("You have entered incorrect option");
			}
		}
		else
		{
			System.out.println("You have entered incorrect option");
		}
		s.close();
	}
}
