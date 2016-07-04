package avinashpkg2;

    class Airbus {
	private int weight_in_tons;
	private int no_of_engines;
	private int maximum_altitude;
	private int maximum_speed_mph;
	
	public int getWeight_in_tons() {
		return weight_in_tons;
	}
	public void setWeight_in_tons(int weight_in_tons) {
		this.weight_in_tons = weight_in_tons;
	}
	public int getNo_of_engines() {
		return no_of_engines;
	}
	public void setNo_of_engines(int no_of_engines) {
		this.no_of_engines = no_of_engines;
	}
	public int getMaximum_altitude() {
		return maximum_altitude;
	}
	public void setMaximum_altitude(int maximum_altitude) {
		this.maximum_altitude = maximum_altitude;
	}
	public int getMaximum_speed_mph() {
		return maximum_speed_mph;
	}
	public void setMaximum_speed_mph(int maximum_speed_mph) {
		this.maximum_speed_mph = maximum_speed_mph;
	}
	
}

class AirbusExe {
	public static void main(String args[])
	{
		Airbus ab=new Airbus();
		ab.setWeight_in_tons(20);
		ab.setNo_of_engines(30);
		ab.setMaximum_altitude(5);
		ab.setMaximum_speed_mph(10);
		
		System.out.println("Weight_in_tons-> "+ab.getWeight_in_tons());
		System.out.println("No_of_engines-> "+ab.getNo_of_engines());
		System.out.println("Maximum_altitude-> "+ab.getMaximum_altitude());
		System.out.println("Maximum_speed_mph-> "+ab.getMaximum_speed_mph());
		
	}
}
