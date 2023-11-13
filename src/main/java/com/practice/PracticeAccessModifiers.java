package com.practice;

public class PracticeAccessModifiers {
	public static void getPublic() {//public access modifier
		System.out.println("This is public access modifier.");
	}
	protected static void getProtected() {//protected access modifier
		System.out.println("This is protected access modifier" );
	}
	static void getDefault() {//default access modifier
		System.out.println("This is default access modifier");
	}
	
	public static void main(String[] args) {
		getProtected();
		getDefault();
	}

}
