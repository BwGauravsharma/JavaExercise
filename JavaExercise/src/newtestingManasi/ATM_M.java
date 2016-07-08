package newtestingManasi;

import java.io.IOException;

public interface ATM_M 
{
	public void withdrawFromAccount(int amount, String accountType) throws IOException;
	public void displayStatement(String accountType);
	
}

