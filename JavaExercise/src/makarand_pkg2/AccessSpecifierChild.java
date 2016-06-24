package makarand_pkg2;

import makarand_pkg1.AccessSpecifierBase;

public class AccessSpecifierChild extends AccessSpecifierBase {
	
	
	public static void main(String arg[])
	{
		
		AccessSpecifierChild c1=new AccessSpecifierChild();
		
		c1.add(5, 5);
      //c1.mult(5, 2);
	  //c1.divide(10, 2);
		c1.subtract(10, 2);
	}
	
}

/*
Access specifier:
 1. public:- visible in child class from another package
 
 2. private:- Not visible in child class from another package
 
 3. protected:- visible in child class from another package
 
 4. default:- Not visible in child class from another package
   

 




*/