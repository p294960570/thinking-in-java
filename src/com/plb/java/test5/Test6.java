package com.plb.java.test5;

/**
 * 97.2
 * 
 * @author ≈”±Ú±Ú
 *
 */
public class Test6 {

	public static void main(String[] args) {
		Apple1 apple1 = new Apple1();
		{
			System.out.println("tets6");
		}

	}
}

class Apple1 {

	static int i;
	static int j = 2;

	Apple1() {
		this.i = 6;
		this.j = 7;
		System.out.println(i);
		System.out.println(j);
	}

	static {
		i = 15;
		System.out.println(i);
		System.out.println(j);
	}

	static void f() {
		System.out.println(i);
		System.out.println(j);

	}
}