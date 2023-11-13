package com.practice;

public class PracticeReverse {
	//Print United States of America in reverse
	//1st way: using negative for loop
	public static void getStringReverse(String name) {
		System.out.println(name.length());
		
		for(int i=(name.length()-1);i>=0;i--) {//formula: for(end; start; --)
			System.out.print(name.charAt(i));//if we remove "ln" from println everything will print out in a single line
		}
	}
	
	//2nd way: Using StringBuilder or StringBuffer
	public void getReverseWithStringBuilder(String myname) {
		StringBuilder sb = new StringBuilder(myname);
		System.out.println(sb.reverse());
	}
	public static void main(String[] args) {
		getStringReverse("United States of America");
		
		PracticeReverse obj = new PracticeReverse();
		obj.getReverseWithStringBuilder("United States of America");
		obj.getReverseWithStringBuilder("TENET");
	}

}
