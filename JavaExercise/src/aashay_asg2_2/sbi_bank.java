package aashay_asg2_2;

import java.util.Scanner;

public class sbi_bank implements bank_atm_interface {
	
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
	
	
	public static void main(String args[])
	{
		int amt;
		Scanner s = new Scanner(System.in);
		sbi_bank sb = new sbi_bank();
		System.out.println("Enter you choice: \n Press 1 for Withdrawl\n Press 2 for Accoount statement");
		int a = s.nextInt();
		//-----------Withdraw amount from SBI Bank-------------------
		if(a == 1)
		{
			System.out.println("Enter you choice: \n Press 1 for Saving account\n Press 2 for Current\n Press 3 for Corporate account");
			int b = s.nextInt();
			if(b == 1)
			{
				System.out.println("Enter the amount in Rupees/-");
				amt = s.nextInt();
				sb.withdrawFromAccount(amt, "Saving");
			}
			else if(b == 2)
			{
				System.out.println("Enter the amount in Rupees/-");
				amt = s.nextInt();
				sb.withdrawFromAccount(amt, "Current");
			}
			else if(b == 3)
			{
				System.out.println("Enter the amount in Rupees/-");
				amt = s.nextInt();
				sb.withdrawFromAccount(amt, "Corporate");
			}
			else
			{
				System.out.println("You have entered incorrect option");
			}
		}
		//-----------Account statement from SBI Bank-------------------
		else if (a == 2)
		{
			System.out.println("Enter you choice: \n Press 1 for Saving Account Statement \n Press 2 for Current Account Statement \n Press 3 for Corporate Account Statement");
			int c = s.nextInt();
			if(c == 1)
			{
				sb.displayStatement("Saving");
			}
			else if(c == 2)
			{
				sb.displayStatement("Current");
			}
			else if(c == 3)
			{
				sb.displayStatement("Corporate");
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
