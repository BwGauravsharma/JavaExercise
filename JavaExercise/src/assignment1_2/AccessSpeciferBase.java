package assignment1_2;

public class AccessSpeciferBase {
	
	public void addition(int a, int b)
	{
				
		System.out.println("Addition is "+(a+b));
		
	}
	private void multiplication(int a, int b)
	{
				
		System.out.println("Multiplication is "+(a*b));
		
	}
	protected void Subtraction(int a, int b)
	{
				
		System.out.println("Subtraction is "+(a-b));
		
	}
/*	default void Divide(int a, int b)
	{
				
		System.out.println("Divide  is "+(a/b));
		
	}
	Default methods are only allowed in Interfaces, so commenting the code for code execution
	*/

}
