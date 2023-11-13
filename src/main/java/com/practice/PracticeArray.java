package com.practice;

import java.util.Arrays;

public class PracticeArray {
	int a = 2;//can not handle more than one variable
	int[] b = {10, 20, 30, 50};//single dimensional array
	int[] c = {2, 3, 5, 8};//single dimensional array
	int[] f = {45, 56, 34, 50};//single dimensional array
	int[][] d = {{10, 20, 30, 50}, {2, 3, 5, 8}};//multi dimensional array
	int[][] e = {b,c};//multi dimensional array
	int[][] g = {b, c, f};//multi dimensional array
	
	public void getArray() {
		System.out.println(a);
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.deepToString(d));
		System.out.println(Arrays.deepToString(e));
		System.out.println(Arrays.deepToString(g));
	}
	
	public static void main(String[] args) {
		PracticeArray obj = new PracticeArray();
		obj.getArray();
	}

}
