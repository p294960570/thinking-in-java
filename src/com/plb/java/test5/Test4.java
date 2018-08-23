package com.plb.java.test5;

/*
 * 86.1
 */
public class Test4 {
	private char x = 'x';
	char s = 's';

	public static void test1() {
		// this.test2();
		Apple apple = new Apple();
		apple.test2();
	}

	public void test2() {
		System.out.println("方法中的非晶态");
	}

	public static void main(String[] args) {
		Test4.test1();
		Test4 test4 = new Test4();
		System.out.println("x=" + test4.x + ",s=" + test4.s);
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}

class Apple {

	public void test2() {
		System.out.println("非静态方法");
	}
}