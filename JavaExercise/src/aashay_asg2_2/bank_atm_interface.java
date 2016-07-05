package aashay_asg2_2;
import java.util.Scanner;

public class bank_atm_interface {
	
	
	
	public static void main(String args[])
	{
		int amt; 		
		System.out.println("Welcome to Multi-National Bank ATM Interface");
		
		System.out.println("Please select the Bank");
				
		Scanner s = new Scanner(System.in);
		System.out.println("Press 1 for SBI Bank \nPress 2 for AXIS Bank");
		
		int text = s.nextInt();
			
	/*	System.out.println("Press 1 to confirm \nPress 2 to navigate back to Bank options");
		int n = s.nextInt();
		if(n == 1)
		{*/
		
		
		//-----------------------SBI bank code----------------------------------------
		if(text == 1)
			{	
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
				
			}
			
		//-----------------------Axis bank code----------------------------------------
		else if(text == 2)
			{
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
			}
			else if(text != 2 || text != 1)
			{
				System.out.println("You have entered incorrect option");
			}
			s.close();

	}
}
