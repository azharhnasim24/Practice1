package com.practice;

public class PracticeLoop {
	public void getForLoop() {
		//positive For Loop:
		//FORMULA = for(start;end;++) 
		//position = 0,1,2,3
		//Print the number from 0 to 100
		for(int i=0; i<=100; i++) {
			System.out.println(i);
		}
		//Negative For Loop:
		//FORMULA = for(end;start;--) 
		//position 3,2,1
		//Print the number from 100 to 0
		for(int j=100;j>=0; j--) {
			System.out.println(j);
		}
		//Infinite Loop:
		for(int k=0;; k++) {
			System.out.println(k);
			if(k==30) {
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		PracticeLoop obj = new PracticeLoop();
		obj.getForLoop();
	}

}
