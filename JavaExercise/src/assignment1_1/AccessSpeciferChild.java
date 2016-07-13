package assignment1_1;


import assignment1_1.AccessSpeciferBase;

public class AccessSpeciferChild extends AccessSpeciferBase {
	
	public static void main(String arg[])
	{
		AccessSpeciferChild c1 = new AccessSpeciferChild();
		c1.addition(5,9);
		
		/*
		AccessSpeciferChild c2 = new AccessSpeciferChild();
		c2.multiplication(6,7);
		Private class cannot be accessed out side, hence commented
		*/
		
		AccessSpeciferChild c3 = new AccessSpeciferChild(); 
		c3.Subtraction(9,5);
		
		/*AccessSpeciferChild c4 = new AccessSpeciferChild();
		c4.Divide(100,5);
		default class cannot be accessed out side, hence commented
		*/
		
	}

}
