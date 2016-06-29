package ravindra_pkg3;

public class Testinheritence {

	public static void main(String[] args) {
	
	Jaguar j = new Jaguar(150,6,"2010","Jaguar");
	j.details();
	
	Audi a = new Audi(300,10,"2016","Audi");
	a.details();
	}

}

class Car {
	public int maxSpeed, maxGear;
	public String make, model;
	
	public Car(int maxSpeed, int maxGear, String make, String model){
		this.maxSpeed = maxSpeed;
		this.maxSpeed = maxGear;
		this.make =make;
		this.model = model;
	}
	
	public void makeAndModel()
	{
		System.out.println("============================");
		System.out.println("Model :"+model);
		System.out.println("Make : "+make);
	}
	
	public void maxGearAndSpeed()
	{
		System.out.println("max Speed : " +maxSpeed);
		System.out.println("Max Gear : "+maxGear);
		System.out.println("============================");
	}
}


class Jaguar extends Car{
	public Jaguar(int a, int b, String c, String d){
		super(a, b, c, d);
	}
	
	void details(){
		super.makeAndModel();
		super.maxGearAndSpeed();
	}
}

class Audi extends Car{
	
	public Audi(int a, int b, String c, String d){
		super(a,b,c,d);
		
	}
	
	void details(){
		super.makeAndModel();
		super.maxGearAndSpeed();
	}
}