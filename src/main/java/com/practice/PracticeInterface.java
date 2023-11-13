package com.practice;

public interface PracticeInterface {
	public abstract void getJob();
	
	public void getMoney();
	
	//From JAVA 8 in Interface we can use static and default methods.
	//These two methods are mainly for developers to use.
	static void getPound() {//this is static method.
		
	}
	default void getEuro() {//this is default method.
		
	}

}
