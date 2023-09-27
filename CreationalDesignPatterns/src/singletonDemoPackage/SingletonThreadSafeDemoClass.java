package singletonDemoPackage;

public class SingletonThreadSafeDemoClass {
	//static data member
	private static SingletonThreadSafeDemoClass obj;

	//private constructor restricting object creation from outside the class
	private SingletonThreadSafeDemoClass() {}

	//Ensuring only one thread at a time can access getInstance() method by using synchronized keyword
	public static synchronized SingletonThreadSafeDemoClass getInstance()
	{
		//If obj has not been created (i.e , if it is null, then create a new object)
		if (obj==null)
			obj = new SingletonThreadSafeDemoClass();
		//else return the already instantiated object
			return obj;
	}
	
	public void diplayMessage(){
	      System.out.println("Singleton Demo for thread safety!!");
	   }
}
