package com.plb.java.test5;

/**
 * 79.1不规范代码 以参数顺序不同区分重载
 * 
 * @author 庞彬彬
 *
 */
public class Test3 {

	public void test(int i, String str) {
		System.out.println(i + str);
	}

	public void test(String str, int i) {
		System.out.println(i + str);
	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		test3.test(1, "yi");
		test3.test("yi", 1);
	}
}
