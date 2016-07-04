package avinashpkg2;

	public class AXIS implements ATM{
		
		private int amount;
		private String accountType;
		private boolean TransacationSuccess=false;
		
		/*public SBI(int amount, String accountType){
			this.amount=amount;
			this.accountType=accountType;
		}*/
		
		@Override
		public void withdrawFromAccount(int amount, String accountType) {
			
			switch(accountType.toLowerCase()){
			case "corporate":
				this.amount=amount;
					TransacationSuccess=true;
				break;
				
			case "savings":
				if(amount<=20000){
					this.amount=amount;
					TransacationSuccess=true;
				}
				break;
				
			case "current":
				if(amount<=75000){
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
				System.out.println("AXIS Bank "+accountType  + " Account transacation of "+amount +" was sucessful" );
			}
			else
				System.out.println("AXIS Bank "+accountType  + " account's Amount exceeds the limit for the day");
		}

	}


