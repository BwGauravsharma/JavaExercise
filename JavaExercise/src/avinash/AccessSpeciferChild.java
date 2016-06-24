package avinash;

import accessSpeciferBasePackageAvinash.AccessSpecifeBase;

public class AccessSpeciferChild extends AccessSpecifeBase {

	public static void main(String[] args) {
		
		AccessSpeciferChild obj = new AccessSpeciferChild();
		//Method is accessible in child class object
		obj.protectedDisplay();
		//Method is accessible in child class object
		obj.publicDisplay();
		
		//Default and Private method are not visible/accessible to child class object 
		/*obj.defaultDisplay();
		obj.privateDisplay()
*/
	}

}
