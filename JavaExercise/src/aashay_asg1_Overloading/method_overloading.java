

package aashay_asg1_Overloading;

public class method_overloading {
	
	public void displayDetails(String name, String address )
	{
		System.out.println("Details: Name = "+ name+"Address = "+ address);
	}
	
	public void displayAllDetails(String name, String address, int Salary )
	{
		System.out.println("Details: Name = "+ name+" Address = "+ address+" Salary = "+ Salary);
	}
	
	public static void main(String args[])
	{
		
		method_overloading m = new method_overloading();
		m.displayDetails("Aashay Vilas Pilivkar"," Dhankwadi Pune");
		m.displayAllDetails("Aashay P", "Pune", 99999999);
	}

}

