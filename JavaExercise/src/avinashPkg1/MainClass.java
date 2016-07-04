package avinashPkg1;

import avinashPkg1.Audi;
import avinashPkg1.Car;
import avinashPkg1.Jaguar;

public class MainClass {

	public static void main(String[] args) {
		Jaguar j = new Jaguar(500,5,"J7");
		j.displayModel();
		j.displayMaximumSpeedandGears();
		Audi a = new Audi(900,8,"A10");
		a.displayModel();
		a.displayMaximumSpeedandGears();
	}

}
