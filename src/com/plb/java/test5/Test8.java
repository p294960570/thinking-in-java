package com.plb.java.test5;

/**
 * 97.2 静态代码块
 * 
 * @author 庞彬彬
 *
 */

class Dog {

	static int mark;
	static {
		System.out.println("mark=" + ++mark);
	}

	Dog(int i) {
		System.out.println("Dog" + i);
	}

	protected void finalize() throws Throwable {
		if (this != null) {
			System.out.println("对象没有被清理");
		}
		new Dog(3);
		// super.finalize();

	}
}

public class Test8 {

	public static void main(String[] args) {
		System.out.println(Dog.mark);
		new Dog(1);
		new Dog(2);
		System.gc();
		System.out.println("end");
	}
}
