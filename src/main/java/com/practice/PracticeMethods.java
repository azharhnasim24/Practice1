package com.practice;

public class PracticeMethods {
	
	//1. Non-static void method (non-return method)
	public void getVoidMethod() {//not static method
		System.out.println("This is a non-static void method.");
	}
	
	//2. Static void method (not returning anything)
	public static void getStaticVoid() {
		System.out.println("This is a static void method.");
	}
	
	//3. Non-static Return method
	public String getReturnMethod() {//not static method
		System.out.println("This is a non-static return method.");
		return "smarttech";
	}
	
	//4. Static return method (non void)
	public static int getStaticReturnMethod() {//static method
		System.out.println("This is a static return method.");
		return 5;
	}
	public static void main(String[] args) {
		//Instantiation ==> Creating an object.
		PracticeMethods obj = new PracticeMethods();
		
		obj.getVoidMethod(); //1.
		getStaticVoid(); //2.
		
		obj.getReturnMethod(); //3.
		getStaticReturnMethod(); //4.
	}

}
