package newtestingManasi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SBIBank implements ATM_M

{
	String ac_type;
	int amt;
	
	public void withdrawFromAccount(int amount, String accountType) 
	{
		//System.out.println("Please enter amount to be withdrawn and account type");
		//InputStreamReader r=new InputStreamReader(System.in);  
		//BufferedReader br=new BufferedReader(r); 
		
		
		
		
		//amt=Integer.parseInt(br.readLine());
		//ac_type=br.readLine();
		
		
		if((amount<=100000)&&accountType.equalsIgnoreCase("Corporate"))
		{
			System.out.println("You can withdraw the "+amount +"amount");
		
			
		}
		else if((amount<=15000)&&accountType.equalsIgnoreCase("Saving"))
		{
			System.out.println("You can withdraw the "+amount +"amount");
		}
		else if((amount<=50000)&&accountType.equalsIgnoreCase("Current"))
		{
			System.out.println("You can withdraw the "+amount +"amount");
		}
		else
		{
			System.out.println("Invalid acount type or amount");
		}
	
		
}
	
		
	
	public void displayStatement (String accounttype)
		
		
		 {
			if (accounttype.equalsIgnoreCase("Corporate"))
			{
			System.out.println("Your Statement of A/C is as below:");	
			}
			else if(accounttype.equalsIgnoreCase("Saving"))
			{
				System.out.println("Your Statement of A/C is as below:");
					
			}
			else if(accounttype.equalsIgnoreCase("Current"))
			{
				System.out.println("Your Statement of A/C is as below:");
			}
			else
			{
				System.out.println("No Statement available for "+accounttype);
				
			}
 }
}
		
			
		

	
	

	
	

	
	
	


