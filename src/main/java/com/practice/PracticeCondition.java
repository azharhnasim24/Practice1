package com.practice;

public class PracticeCondition {
	
	public void getCondition(int age) {
		if (age>= 18) {
			System.out.println("You're an adult.");
		} 
		else {
			System.out.println("You're a minor.");
		}
		
	}
	
	public void getCondition(String name) {
		if(name.contains("Rez")) {
			System.out.println("Match found.");
		} 
		else {
			System.out.println("Match not found.");
		}
	}
	
	public static void getCondition2(int x) {
		if(x>=1901 && x<=1927) {
			System.out.println("The Greatest Generation");
		}
		else if(x>=1928 && x<=1945) {
			System.out.println("The Silent Generation");
		}
		else if(x>=1946 && x<=1964) {
			System.out.println("The Baby Boomer Generation");
		}
		else if(x>=1965 && x<=1980) {
			System.out.println("Generation X");
		}
		else if(x>=1981 && x<=1996) {
			System.out.println("Millenials");
		}
		else if(x>=1997 && x<=2012) {
			System.out.println("Generation Z");
		}
		else if(x>=2013 && x<=2025) {
			System.out.println("Gen Alpha");
		}
		else {
			System.out.println("Generation not found!");
		}
	}
	
	public static void main(String[] args) {
		PracticeCondition obj = new PracticeCondition();
		obj.getCondition(65);
		
		obj.getCondition("Rezwan Ahmed");
		obj.getCondition("Ahmed Rezwan");
		obj.getCondition("David");
		
		PracticeCondition.getCondition2(1999);
		getCondition2(2020);
		getCondition2(1899);
	}

}
