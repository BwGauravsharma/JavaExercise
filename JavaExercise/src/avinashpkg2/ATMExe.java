package avinashpkg2;

public class ATMExe {

	public static void main(String[] args) {
		SBI sbi=new SBI();
		sbi.withdrawFromAccount(10000000,"corporate");
		sbi.displayStatement("corporate");
		
		AXIS axis=new AXIS();
		axis.withdrawFromAccount(1000000,"corporate");
		axis.displayStatement("corporate");
	}

}
