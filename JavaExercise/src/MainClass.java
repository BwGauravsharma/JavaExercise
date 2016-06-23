import avinash.Audi;
import avinash.Car;
import avinash.Jaguar;

public class MainClass {

	public static void main(String[] args) {
		Jaguar j = new Jaguar(500,5,"x7");
		j.displayModel();
		j.displayMaximumSpeedandGears();
		Audi a = new Audi(900,8,"x10");
		a.displayModel();
		a.displayMaximumSpeedandGears();
	}

}
