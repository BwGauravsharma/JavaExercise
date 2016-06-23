package newtesting;

import testing.AccessSpeciferBase;

public class AccessSpeciferChild extends AccessSpeciferBase 
{
	
	public static void main(String args[])
	
	{
		AccessSpeciferChild C1 = new AccessSpeciferChild();
		
		C1.name();
		//C1.address();
		// as address() is defined as private it should not be available outside the  AccessSpeciferBase class
		C1.city();
		//C1.country();
		// As country () is defined as default it should not be available outside the package
	}
	
	
}
