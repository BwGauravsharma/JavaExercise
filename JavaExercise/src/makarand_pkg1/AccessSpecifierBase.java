package makarand_pkg1;

public class AccessSpecifierBase {
	
//using public 	
	public void add(int a, int b)
	{
		System.out.println("Addition is: "+(a+b));
	}
	
	//Added comment
	
// using private	
	private void mult(int a,int b)
	{
		System.out.println("Multiplication is: "+(a*b));	
	}

// using default	
	 void divide(int a, int b)
	{
	 System.out.println("division is: "+(a/b));
	}
	
// using protected	
	protected void subtract(int a,int b)
	{	}
	
// main method
	
	public static void main(String arg[])
	{
		AccessSpecifierBase a1=new AccessSpecifierBase();
// method call
		a1.add(5, 7);
		a1.mult(5, 10);
		a1.divide(10, 2);
		a1.subtract(20, 5);		
	}
	
}


