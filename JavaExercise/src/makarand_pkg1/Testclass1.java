package makarand_pkg1;

public class Testclass1 {
	
	public void DisplayDetails(String name)
	{
		System.out.println("Details: "+name);
		
	}

	public void DisplayDetails(String name, String address)
	{
		System.out.println("Details: "+name+" , "+address);

	}
	
	public void DisplayDetails(String name, String address, int salary)
	{
		System.out.println("Details: "+name+" , "+address+" , "+salary);

	}

	public static void main(String arg[])
	{
		
		Testclass1 tc=new Testclass1();
		
		tc.DisplayDetails("John");
		tc.DisplayDetails("John", "pune");
		tc.DisplayDetails("John", "pune", 1000);
			
	}

}

