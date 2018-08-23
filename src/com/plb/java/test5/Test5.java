package com.plb.java.test5;

/***
 * 90.1
 * 
 * @author ≈”±Ú±Ú
 *
 */
public class Test5 {
	public static void main(String[] args) {
		A a = new A();
		a.test();
	}
}

class A {
	void test() {
		B b = new B();
		b.test1();
		System.out.println("A");
	}
}

class B {
	void test1() {
		A a = new A();
		a.test();
		System.out.println("B");
	}
}
