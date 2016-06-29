package ravindra_asg2;

public class testInterface {

	public static void main(String[] args) {
		System.out.println("============SBI=============");
		SBI sbi = new SBI();
		sbi.withdrawFromAccount(50000, "corporate"); // corporate <1lakh allowed
		sbi.withdrawFromAccount(200000,"corporate");
		sbi.displayStatement("corporate");
		
		sbi.withdrawFromAccount(10000,"saving"); //saving < 15000 allowed
		sbi.withdrawFromAccount(20000, "saving");
		sbi.displayStatement("saving");
		
		sbi.withdrawFromAccount(40000,"current"); // current <50000 allowed
		sbi.withdrawFromAccount(60000,"current");
		sbi.displayStatement("current");

		
		
		System.out.println("\n======AXIS==========");
		AXIS ax = new AXIS();
		ax.withdrawFromAccount(20000, "corporate"); //corporate : NA
		ax.displayStatement("corporate");
		
		ax.withdrawFromAccount(20000,"saving"); 	// saving <20000 allowed
		ax.withdrawFromAccount(25000,"saving");
		ax.displayStatement("saving");
		
		ax.withdrawFromAccount(75000,"current"); 	//current <75000 allowed 
		ax.withdrawFromAccount(80000,"current");
		ax.displayStatement("current");
	}

}

interface ATM{
	
	public void withdrawFromAccount(int amount, String accountType);
	public void displayStatement(String accountType);
	
}

class SBI implements ATM {

	int accountType;
	@Override
	public void withdrawFromAccount(int amount, String accountType) {
		
		switch(accountType){
		
		case  "corporate" :
					if(amount<=100000 ){
					System.out.println("withdrawal is possible");
					}else {
					System.out.println("withdrawal is not possible");}
					break;
				
		case "saving" :

				if(amount <= 15000){
				System.out.println("withdrawal is possible");
				} else {System.out.println("withdrawal is not possible");}
				break;
			
		case "current" :
				if(amount<= 50000){
				System.out.println("withdrawal is possible");}
				else {System.out.println("withdrawal is not possible");}
				break;
				
		default : System.out.println("invalid case : please enter valid account type");
		}
		
	}
	
	@Override
	public void displayStatement(String accountType) {
		if(accountType.equals("corporate")) System.out.println("this is corporate account statement");
		if(accountType.equals("saving")) System.out.println("this is saving account statement");
		if(accountType.equals("current")) System.out.println("this is current account statement");
		
		}
	
		
}



class AXIS implements ATM{

	@Override
	public void withdrawFromAccount(int amount, String accountType) {
switch(accountType){
		
		case  "corporate" :
					System.out.println("NA : No corporate account allowed");
					break;
				
		case "saving" :

				if(amount <= 20000){
				System.out.println("withdrawal is possible");
				} else {System.out.println("withdrawal is not possible");}
				break;
			
		case "current" :
				if(amount<= 75000){
				System.out.println("withdrawal is possible");}
				else {System.out.println("withdrawal is not possible");}
				break;
				
		default : System.out.println("invalid case : please enter valid account type");
		}
		
	}

	@Override
	public void displayStatement(String accountType) {
		if(accountType.equals("corporate")) System.out.println("NA : Corporate account is not allowed");
		if(accountType.equals("saving")) System.out.println("this is saving account statement");
		if(accountType.equals("current")) System.out.println("this is current account statement");
		
	}
	
}
