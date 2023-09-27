package singletonDemoPackage;

public class SingletonClass {

		//static data member
		private static SingletonClass obj;

		//private constructor restricting object creation from outside the class
		private SingletonClass() {}

		//Lazy instantiation since obj is not created until getInstance() method is called
		public static synchronized SingletonClass getInstance()
		{
			//If obj has not been created (i.e , if it is null, then create a new object)
			if (obj==null)
				obj = new SingletonClass();
			//else return the already instantiated object
			return obj;
		}
		
		public void diplayMessage(){
		      System.out.println("Singleton Demo!!");
		   }
	}

