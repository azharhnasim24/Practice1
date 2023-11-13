package com.practice;

public class PracticeWrapperClass {
	int a = 5; //DataType Variable = Value;
	public void getRed() {
		System.out.println("This is getRed() method." );
	}
	public static void main(String[] args) {
		//PracticeWrapperClass obj = new PracticeWrapperClass();
		//ClassName ObjectName = new ClassName();
		//DataType Variable = Value
		
		//int a = 5;
		//PracticeWrapperClass = int, obj = a, new PracticeWrapperClass() = 5
		//5 = a;
		//So, new PracticeWrapperClass() = obj
		//how do we call a method? - ObjectName.MethodName();
		new PracticeWrapperClass().getRed();//Another way to call the method - Advance Java
		
		//obj.getRed();
	}

}
