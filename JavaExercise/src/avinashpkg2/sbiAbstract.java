package avinashpkg2;

public class sbiAbstract extends BankATM {
	
public void displayStatement(String accountType) {
		
		if(TransacationSuccess){
			System.out.println("SBI Bank "+ accountType  + " Account transacation of "+amount +" was sucessful" );
		}
		else
			System.out.println("SBI Bank "+accountType  + " account's Amount exceeds the limit for the day");
	}
}
