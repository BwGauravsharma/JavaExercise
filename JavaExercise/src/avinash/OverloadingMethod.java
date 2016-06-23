package avinash;




public class OverloadingMethod {

	public void displayDetails(String name){

		System.out.println("Name: "+name);

		}
	
	public void displayDetails(String name, String address){
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		
	}
	public void displayDetails(String name, String address, int salary){
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
		System.out.println("Salary: "+salary);
	}

	public static void main(String[] args) {
		OverloadingMethod obj = new OverloadingMethod();
		obj.displayDetails("Avinash");
		obj.displayDetails("Avinash", "Bitwise");
		obj.displayDetails("Avinash", "Bitwise",500000);

	}

}
