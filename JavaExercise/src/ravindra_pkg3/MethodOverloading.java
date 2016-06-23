package ravindra_pkg3;

public class MethodOverloading {

	public static void main(String[] args){
		TestOverload obj = new TestOverload();
		obj.displayDetails("Ravi");
		obj.displayDetails("Ravi", "Pune");
		obj.displayDetails("Ravi", "Pune", 30000);
		
	}
}



class TestOverload
{
	public void displayDetails(String name){

		System.out.println("Details: "+name);
	}

	public void displayDetails(String name, String address){
		System.out.println("Details :"+name+ "	"+ address);
	}
	
	public void displayDetails(String name, String address, int salary)
	{
		System.out.println("Details :"+name+ "	"+address+" 	"+salary);
	}
}