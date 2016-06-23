package testingManasi;

public class Display 
{
	public void displayDetails(String name)
	{
		System.out.println("Details: "+name);
	}

	
	public void displayDetails(String name, String address)
	{
		System.out.println("My Name is: "+name);
		System.out.println("I am living in: "+address);
	}
	
	public void displayDetails(String name, String address, int salary)
	
	{
		System.out.println("My Name is: "+name);
		System.out.println("I am living in: "+address);
		System.out.println("Salary=: "+salary);
	}
}


