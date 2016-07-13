package aashay_asg2_3;

import java.util.Scanner;

public class abstract_axis_atm {

	public static void main(String args[])
	{
		
		int amt;
		abstract_sbi_atm sb = new abstract_sbi_atm();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter you choice: \n Press 1 for Withdrawl\n Press 2 for Accoount statement");
		int a = s.nextInt();
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
