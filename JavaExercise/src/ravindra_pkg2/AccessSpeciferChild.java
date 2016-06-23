package ravindra_pkg2;

import ravindra_pkg1.AccessSpeciferBase;



public class AccessSpeciferChild extends AccessSpeciferBase
{
	public static void main(String[] args){
		AccessSpeciferBase obj = new AccessSpeciferBase();
		obj.testPublic();  // can be accessed from anywhere
		//  obj.testProtected(); 	can not be accessed outside pkg, not even for child in other pkg
		// obj.testPrivate();		can not be accessed outside pkg
		// obj.testDefault();		can not be accessed outside pkg 
	}
	
}