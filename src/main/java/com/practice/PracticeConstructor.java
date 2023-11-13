package com.practice;

public class PracticeConstructor {
	public void getMoney() {//a typical method
		
	}
	int a = 5;//instance variable
	int b = 4;
	//constructor
	//method like structure
	//name should be similar like class name
	//it should not be return type or void type
	
	//@SuppressWarnings("static-access")*** don't worry about it now!
	public PracticeConstructor(int c, int d) {
		this.a=c;
		this.b=d;
		System.out.println(c+d);
		
	}

}
