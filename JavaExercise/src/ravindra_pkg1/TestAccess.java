package ravindra_pkg1;

public class TestAccess {

	public static void main(String[] args) {
		
		AccessSpeciferBase obj = new AccessSpeciferBase();
		// obj.testPrivate(); can not be accessed outside the class, not even for same pkg
		obj.testPublic();
		obj.testProtected(); // can be accessed in same pkg , even if that is not a child 
		obj.testDefault();   // can be accessed in any class in same pkg only
	}

}
