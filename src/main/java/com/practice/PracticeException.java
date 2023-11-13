package com.practice;

import java.io.IOException;

public class PracticeException {
	public static void getMethod1() {
		System.out.println("This is the first method.");
	}
	
	//Unchecked or Run time Exception:
	public static void getMethod2() {
		int x = 5;
		try {
			System.out.println(x/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//error (undefined)= Arithmetic Exception
		finally {
			System.out.println("This is finally block.");
		}
	}
	
	public static void getMethod3() {
		System.out.println("This is the third method.");
	}
	
	//Checked or Compile time Exception:
	public static void getCheckedException() throws InterruptedException, IOException {
		Thread.sleep(5000);
	}
	public static void main(String[] args) {
		getMethod1();
		getMethod2();
		getMethod3();
	}

}
