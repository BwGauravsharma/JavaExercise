package avinashpkg2;

public abstract class BankATM {
	public int amount;
	public boolean TransacationSuccess=false;
	
	public abstract void displayStatement(String accountType);

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
}
