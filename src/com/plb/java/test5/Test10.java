package com.plb.java.test5;

public class Test10 {

	static void f(Integer... args) {
		System.out.println("integer");
		for (Integer i : args) {
			System.out.print(i + " ");
		}
	}

	static void f(int... args) {
		System.out.println("int");
		for (int i : args) {
			System.out.println(i + " ");
		}
	}

	public static void main(String[] args) {
		// f(1, 2);//±àÒëÆ÷·Ö²»Çå
	}
}
