package newtestingManasi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import sun.rmi.runtime.Log;



	public class MainBank 

	{

		static String type;
		 static int amt;
		static char c;
		static String str;
		//throws IOException, NumberFormatException
		
		
		public static void main(String[] args) 
		{
			//String type;
			 //int amt;
			//char c;
			//String str;
			SBIBank sb= new SBIBank();
			AxisBank ax= new AxisBank();
			try
			{
			System.out.println("From which bank you want to withdraw money?");
			System.out.println("your options are : SBI or Axis. Please enter...");
			
			InputStreamReader r=new InputStreamReader(System.in);  
			BufferedReader br=new BufferedReader(r);
			
			
			str=br.readLine();
			
	if(str.equalsIgnoreCase("SBI"))
		{	
			System.out.println("Do you want to withdraw money?");
			System.out.println("Please press 'Y' to withdraw");
			System.out.println("Please press 'N' to exit");
			str=br.readLine();
			c=str.charAt(0);
			
					 
			
					if (c=='Y'||c=='y' )
				
					{
						//System.out.println("Please enter Bank Name SBI or Axis");
						//str=br.readLine();
						
						System.out.println("Please enter amount to be withdrawn");
						amt =Integer.parseInt(br.readLine());
						System.out.println("Please enter account type");
						type =br.readLine();
						//r=new InputStreamReader(System.in);  
						 //br=new BufferedReader(r);
								//if(str.equals("SBI"))
													
									sb.withdrawFromAccount(amt,type);
									
									sb.displayStatement (type);
											}		
					else if (c=='N'|| c=='n') 
						{
							System.out.println("Thank you... Visit Again!!");
						}
				
					else
						{
							System.out.println("Invalid Operation");
						}
		}
		
		else if (str.equalsIgnoreCase("Axis"))
		{
					System.out.println("Do you want to withdraw money?");
					System.out.println("Please press 'Y' to withdraw");
					System.out.println("Please press 'N' to exit");
					str=br.readLine();
					c=str.charAt(0);
			
					 
			
					if (c=='Y'||c=='y' )
				
					{
						//System.out.println("Please enter Bank Name SBI or Axis");
						//str=br.readLine();
						
						System.out.println("Please enter amount to be withdrawn");
						amt =Integer.parseInt(br.readLine());
						System.out.println("Please enter account type");
						type =br.readLine();
						//r=new InputStreamReader(System.in);  
						 //br=new BufferedReader(r);
																		
						ax.withdrawFromAccount(amt,type);
									
						ax.displayStatement (type);
					}
						
					else if (c=='N'|| c=='n') 
					{
							System.out.println("You have selected No... Sorry!!");
					}
				
					else
					{
							System.out.println("Invalid Operation");
					}		
			
			

	}				
		
		else
		{
			
			System.out.println("Ivalid Bank Name!!");
			
		}//if end
						
				
				
	
		}
			catch (IOException e) 
			{
			    System.err.println("Caught IOException: " + e.getMessage());
			    
			}
		}
	
}	


