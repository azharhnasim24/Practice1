package com.practice;

public class PracticeEncapsulatiuon {
	private int value;
	
	public int getValue() {// getter ==> return method
		return value;
	}

	public void setValue(int value) {// setter ==> void method
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	private int salary = 500;

	public int getSalary() {
		return salary;
	}

}
