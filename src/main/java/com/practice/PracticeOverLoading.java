package com.practice;

public class PracticeOverLoading {
	
	public static void method1() {
		System.out.println("This is first method.");
	}
	public static void method1(String s) {
		System.out.println(s);
	}
	public static void method1(int a, int b, double d, boolean e) {
		System.out.println(a+b);
	}
	public static void method1(int a, double d) {
		System.out.println(a);
		System.out.println(d);
	}
	public static void method1(double d, int a) {
		System.out.println(a);
		System.out.println(d);
	}
	public static void method1(int a, double d, int b, boolean e) {
		System.out.println(e);
	}
	
	public static void main(String[] args) {
		method1();
		method1("Anything");
		method1(5, 7, 9.8, true);
		method1(9, 8.9);
		method1(9.8, 89);
		method1(10, 10.0, 10, true);
	}

}
