package com.practice;

public class Child extends Parent{
	public static void main(String[] args) {
		
//		first way
//		Parent obj1 = new Parent();
//		obj.getSum();
		
//		second way
//		Child obj2 = new Child();
//		obj2.getSum();
		
//		third way
		Parent obj3 = new Child();
		obj3.getSum();
	}

}
