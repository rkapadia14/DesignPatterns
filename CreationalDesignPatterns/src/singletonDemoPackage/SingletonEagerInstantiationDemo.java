package singletonDemoPackage;

public class SingletonEagerInstantiationDemo {
	//static data member object created at the time of declaration. Hence, the object is created at
	//the time of class loading. Hence, it is thread safe
	private static SingletonEagerInstantiationDemo obj =  new SingletonEagerInstantiationDemo();;

	//private constructor restricting object creation from outside the class
	private SingletonEagerInstantiationDemo() {}

	//this method only returns the already created object 
	public static SingletonEagerInstantiationDemo getInstance()
	{
		return obj;
	}
	
	public void diplayMessage(){
	      System.out.println("Singleton Demo with Eager Instantiation!!");
	   }
}
