package singletonDemoPackage;

public class SingletonDoubleCheckedLockingDemo {
	
	//volatile static data member ensuring obj variable is consistent in multi-threaded system
	private static volatile SingletonDoubleCheckedLockingDemo obj;

	//private constructor restricting object creation from outside the class
	private SingletonDoubleCheckedLockingDemo() {}

	//Ensuring only one thread at a time can access getInstance() method by using synchronized keyword
	public static SingletonDoubleCheckedLockingDemo getInstance()
	{
		//If obj has not been created (i.e , if it is null, then create a new object)
		if (obj==null)
		{
			//Synchronized block only when object is not yet created
			synchronized (SingletonDoubleCheckedLockingDemo.class) {
				obj = new SingletonDoubleCheckedLockingDemo();
			}
		
			
		}
		//else return the already instantiated object
			return obj;
	}
	
	public void diplayMessage(){
	      System.out.println("Singleton Demo with double check locking to ensure thread safety!!");
	   }
	
}
