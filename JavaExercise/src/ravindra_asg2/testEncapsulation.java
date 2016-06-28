package ravindra_asg2;

public class testEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testEncapsulation1 e = new testEncapsulation1();
		e.setData(1000, 4, 200, 180);
		e.getData();

	}

}


class testEncapsulation1 {
	
	private int weight_in_tons, no_of_engines,max_altitude, max_speed_mph;
	
	public void setData(int weight_in_tons, int no_of_engines,int max_altitude,int max_speed_mph) {
		
	this.weight_in_tons = weight_in_tons;
	this.no_of_engines =no_of_engines;
	this.max_altitude=max_altitude;
	this.max_speed_mph=max_speed_mph;
	}
	
	public void getData(){
		System.out.println("Weight :"+weight_in_tons);
		System.out.println("No of engines :"+no_of_engines);
		System.out.println("Max Altitude : "+max_altitude);
		System.out.println("Max speed mph : "+max_speed_mph);
	}
	
}