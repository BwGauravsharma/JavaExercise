package avinashpkg2;

public class SBI implements ATM{
	
	private int amount;
	
	private boolean TransacationSuccess=false;
	
	/*public SBI(int amount, String accountType){
		this.amount=amount;
		this.accountType=accountType;
	}*/
	
	@Override
	public void withdrawFromAccount(int amount, String accountType) {
		
		switch(accountType.toLowerCase()){
		case "corporate":
			if(amount<=100000){
				this.amount=amount;
				TransacationSuccess=true;
			}
			break;
			
		case "savings":
			if(amount<=15000){
				this.amount=amount;
				TransacationSuccess=true;
			}
			break;
			
		case "current":
			if(amount<=50000){
				this.amount=amount; 
				TransacationSuccess=true;
		}
			
			break;
			
			default:
				System.out.println("Please enter valid account details");
		}
		
	}

	@Override
	public void displayStatement(String accountType) {
		
		if(TransacationSuccess){
			System.out.println("SBI Bank "+ accountType  + " Account transacation of "+amount +" was sucessful" );
		}
		else
			System.out.println("SBI Bank "+accountType  + " account's Amount exceeds the limit for the day");
	}

}
