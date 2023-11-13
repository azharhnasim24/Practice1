package com.practice;

public class Human {
	public void getMoney() {//not static
		System.out.println("Hi!");
	}
	
	public static void getEuro(){//static method ==> class level ==> no need to create object
		System.out.println("this is static getEuro().");
	}
	
	public static void main(String[] args) {
		//how to call a method inside the main method?
		//first find out if the method is STATIC or not. 
		//IF NOT STATIC ==>Instantiation (Create an object)
		//FORMULA : CLASS NAME OBJECT NAME = new CLASS NAME();
		Human obj = new Human();
		obj.getMoney();
		
		//method name(); [if calling the method from same method]
		getEuro();
	}
}
