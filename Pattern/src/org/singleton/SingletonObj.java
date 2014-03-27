package org.singleton;

public class SingletonObj {
	
	private static SingletonObj SingletonObject=null;
	
	private SingletonObj(){
		
		
	}
	
	public static SingletonObj getSingletonInstant(){
		if(SingletonObject==null){
			SingletonObject=new SingletonObj();
		}
		
		return SingletonObject;
	}
	
	public void printTest(){
		System.out.println("Test");
	}
	
}
