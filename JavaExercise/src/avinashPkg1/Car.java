package avinashPkg1;

public class Car {
	int Speed;
	int Gears;
	String Model;
	
	public Car(int Speed, int Gears, String Model){
		this.Speed=Speed;
		this.Gears=Gears;
		this.Model=Model;
	}
	
	public void displayModel(){
		System.out.println("Model is "+ Model);
	}

	public void displayMaximumSpeedandGears(){
		System.out.println("Max speed is  "+ Speed);
		System.out.println("Max Gears is  "+ Gears);
	
	}
}

