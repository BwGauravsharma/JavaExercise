package ravindra_pkg1;

public class AccessSpeciferBase {
	public void testPublic()
	{
		System.out.println("This is testPublic");
		
	}

	
	private void testPrivate()
	{
		System.out.println("This is testPrivate");
	}
	
	protected void testProtected() {
		System.out.println("This is testProtected");
	}

	void testDefault(){
		System.out.println("This is testDefault");
	}

}
