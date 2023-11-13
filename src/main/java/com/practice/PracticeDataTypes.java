package com.practice;

public class PracticeDataTypes {
	int x = 5; //Data type variable name  = value
	int y = 12;
	int z;
	
	double a = 3.14;
	double b;
	
	boolean c = true;
	boolean d;
	
	String p ="smarttech";
	String q;
	
	public void getInt() {//not a static method
		System.out.println(x); //5
		System.out.println(y);//12
		System.out.println(x+y);//17
		System.out.println(x-y);//-7
		System.out.println(z);//default value 0
		
		System.out.println(a);//3.14
		System.out.println(b);// default value 0.0
		
		System.out.println(c);// true
		System.out.println(d);//default value false
		
		System.out.println(p);//smarttech
		System.out.println(q);//default value is NULL
	}
	
	public void getLocalVariables() {//not a static method
		//local variables
		int g = 58;
		int h = 10;
		int k = 0;
		double j = 0;
		String l = null;
		//when working with local variable we must have to assign the value.
		//inside the method we must need to assign variable value.
		
		System.out.println(g-h);//48
		System.out.println(l);
		System.out.println(k);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		PracticeDataTypes obj = new PracticeDataTypes();
		obj.getInt();
		obj.getLocalVariables();
	}

}
