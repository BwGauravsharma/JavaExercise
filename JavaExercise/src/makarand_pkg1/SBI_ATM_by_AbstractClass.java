package makarand_pkg1;

import java.util.Scanner;

 public class SBI_ATM_by_AbstractClass extends ATMclass {
		
		String accountType;
		int amount;
		static Scanner s=new Scanner(System.in);
		
	//--------------------------------------------------------------------
		 void withdrawFromAccount(int amount, String accountType)
		{
			System.out.println("ACC Type and Amount:"+accountType+" "+amount);
			
			if(accountType=="corporate" && amount>100000)
			{
				System.out.println("Sorry.! In corporate account, you cannot withdraw more than 100000 in one day!");
				
			}
			
			else if(accountType=="saving" && amount>15000)
			{
				System.out.println("Sorry.! In saving account, you cannot withdraw more than 15000 in one day!");
			}
					
			else if(accountType=="current" && amount>50000)
			{
				System.out.println("Sorry.! In current account, you cannot withdraw more than 50000 in one day!");
			}		
			else 
				System.out.println("Cash withdrawal successful. please collect the cash.! ");
		}
	//-----------------------------------------------------
		
		 void displayStatement(String accountType)
		{
			if(accountType=="invalid")
			{
				System.out.println("You have entered invalid account type.");
			}
			else
			{
			System.out.println("Your statement account type is: "+accountType);
			}
		}
		
		
		
	//----------------------------------------------------------------
		public static void main(String arg[])
		{
			int choice1,choice2,amount;
			String accountType=null;
			
			SBIBankATM sbi=new SBIBankATM();
			
				
			System.out.println("Welcome to SBI bank ATM.!");
			System.out.println("\nPlease Select the operation:\n\n");
			System.out.println("Press 1:  withdraw \nPress 2:  Statement");
			
			choice1=s.nextInt();			
			
			if(choice1==1)
			{
			System.out.println("Please select account type:");
			System.out.println("Press 1:  corporate \nPress 2:  Saving \nPress 3:  Currnet");
			choice2=s.nextInt();
			if(choice2==1)
			{ 
				accountType="corporate";
			}
			else if(choice2==2)
			{
				accountType="saving";
			}
			else if(choice2==3)
			{
				accountType="current";
			}
			 
			System.out.println("Please enter amount to withdraw");
			amount=s.nextInt();
			sbi.withdrawFromAccount(amount, accountType);
			}
			else if(choice1==2)
			{
				System.out.println("Please select account type:");
				System.out.println("Press 1:  corporate \nPress 2:  Saving \nPress 3:  Currnet");
				choice2=s.nextInt();
				if(choice2==1)
				{ 
					accountType="corporate";
				}
				else if(choice2==2)
				{
					accountType="saving";
				}
				else if(choice2==3)
				{
					accountType="current";
				}
				else
				{
					accountType="invalid";
				}
				sbi.displayStatement(accountType);
			}
			
		}
		
	}

	
	


