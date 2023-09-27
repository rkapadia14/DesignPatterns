package singletonDemoPackage;

public class SingletonDemo {
	
	public static void main(String args[])
	{
		SingletonClass example1 = SingletonClass.getInstance();
		example1.diplayMessage();
		
		SingletonEagerInstantiationDemo example2 = SingletonEagerInstantiationDemo.getInstance();
		example2.diplayMessage();
		
		SingletonThreadSafeDemoClass example3 = SingletonThreadSafeDemoClass.getInstance();
		example3.diplayMessage();
		
		SingletonDoubleCheckedLockingDemo example4 = SingletonDoubleCheckedLockingDemo.getInstance();
		example4.diplayMessage();
		
	}

}
