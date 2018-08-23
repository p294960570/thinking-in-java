package com.plb.java.test5;

import static net.mindview.util.Print.print;

/**
 * 97.2 初始化顺序 静态变量初始化 ➡ 静态代码块执行 ➡ 动态变量初始化 ➡构造函数初始化
 *
 * tips：静态变量和静态代码块只执行一次
 * 
 * @author 庞彬彬
 *
 */
class Cup {
	Cup(int marker) {
		print("Cup(" + marker + ")");
	}

	void f(int marker) {
		print("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2 = new Cup(2);
	Cup cup3 = new Cup(3);
	static {
		System.out.println("静态代码块执行");
		cup1 = new Cup(1);
	}

	Cups() {
		print("Cups()");
	}
}

public class ExplicitStatic {
	public static void main(String[] args) {
		print("Inside main()");

		// Cups.cup1.f(99); // (1)
	}

	static Cups cups1 = new Cups(); // (2)
	static Cups cups2 = new Cups(); // (2)
}