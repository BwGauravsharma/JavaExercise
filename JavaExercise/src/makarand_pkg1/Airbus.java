package makarand_pkg1;

public class Airbus {
	
	int weight_in_tons, no_of_engines, max_altitude, max_speed_mph;

	// Setters 
	
	public void set_weight_in_tons(int new_weight_in_tons)
	{
		this.weight_in_tons=new_weight_in_tons;
	}
	
	public void set_no_of_engines(int new_no_of_engines)
	{
		this.no_of_engines=new_no_of_engines;
	}
	
	public void set_max_altitude(int new_max_altitude)
	{
		this.max_altitude=new_max_altitude;
	}
	
	public void set_max_speed_mph(int new_max_speed_mph)
	{
		this.max_speed_mph=new_max_speed_mph;
	}
	
  //getters
	
	public int get_weight_in_tons()
	{
		return weight_in_tons;
	}
	
	public int get_no_of_engines()
	{
		return no_of_engines;
	}
	
	public int get_max_altitude()
	{
		return max_altitude;
	}
	
	public int get_max_speed_mph()
	{
		return max_speed_mph;
	}

	
}
