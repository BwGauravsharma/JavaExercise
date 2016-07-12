package newtestingManasi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AxisBank implements ATM_M

{

	String ac_type;
	int amt;
	public void withdrawFromAccount(int amount, String accountType) throws IOException
	{
		//System.out.println("Please enter amount to be withdrawn and account type");
		InputStreamReader r=new InputStreamReader(System.in);  
		BufferedReader br=new BufferedReader(r); 
		
		
	try
		{
			
		//InputStreamReader r=new InputStreamReader(System.in);  
		//BufferedReader br=new BufferedReader(r);
		amt=Integer.parseInt(br.readLine());
		ac_type=br.readLine();
		
		
		if(accountType.equalsIgnoreCase("Corporate")&&(amount<=0))
		{
			System.out.println("This is not valid a/c type");
		
			
		}
		else if(accountType.equalsIgnoreCase("Saving")&&(amount<=15000))
		{
			System.out.println("You can withdraw the "+amount +"amount");
		}
		else if(accountType.equalsIgnoreCase("Current")&&(amount<=50000))
		{
			System.out.println("You can withdraw the "+amount +"amount");
		}
		else
		{
			System.out.println("Invalid acount type or amount");
		}
	
		
}
	
	catch (Exception e) 
	{
	    System.err.println("Caught IOException: " + e.getMessage());
	    
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
