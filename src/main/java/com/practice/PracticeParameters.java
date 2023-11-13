package com.practice;

public class PracticeParameters {
	int x = 5;
	int y = 3;
	
	public void getNewYork() {//non-parameterized
		System.out.println(x+y);//8
	}
	
	public void getBoston() {//non-parameterized
		int x = 20;
		int y = 12;
		
		System.out.println(x+y);//32
	}
	
	public void getAtlanta(int x, int y, boolean w, String s) {
		System.out.println(x+y);
		System.out.println(s);
		
	}
	
	public static void main(String[] args) {
		//System.out.println(x+y);
		PracticeParameters obj = new PracticeParameters();
		
		obj.getNewYork();
		obj.getBoston();
		obj.getAtlanta(0, 0, false, null);
		obj.getAtlanta(0, 0, false, null);
		obj.getAtlanta(12, 15, false, "Nasim");
	}

}
