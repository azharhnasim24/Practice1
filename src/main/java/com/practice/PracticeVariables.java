package com.practice;

public class PracticeVariables {
	//Instance Variables (AKA global variables)
	int a = 10;
	int b;
	
	static int c = 2;//static variable can be handled by both static and non-static method
	
	public void getInstanceVariables() {//non-static method can handle both static and non-static variables
		System.out.println(a+b);//10
		System.out.println(a+c);//12
	}
	
	public void getLoaclVariables() {
		//Local Variables (only for this specific method)
		int e = 25;
		int f = 0; //must have to initialize a value for the variable in Local Variable.
		
		System.out.println(e-f);//25
		System.out.println(a*b);//0(since variable a & b are both instance variable they can be used in any method of the same class.)
	}
	
	public static void getStaticVariable() {//static method can only handle static variable
		System.out.println(c);//2
	}
	public static void main(String[] args) {
		PracticeVariables obj = new PracticeVariables();
		
		obj.getInstanceVariables();
		
		obj.getLoaclVariables();
		
		getStaticVariable();
		
		
	}

}
