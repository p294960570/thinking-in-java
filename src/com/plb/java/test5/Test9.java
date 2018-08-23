package com.plb.java.test5;

/**
 * 102.1
 * 
 * @author 庞彬彬
 *
 */

class C {
}

public class Test9 {

	static void printArray(Object... args) {
		for (Object object : args) {
			System.out.println(object);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// printArray(new Integer(47), new Integer(2));
		// printArray(1, 2, 3);
		// printArray("一", "二");
		printArray((Object[]) new Integer[] { 1, 2, 3 }, "二");
		// Object aObject = 2.2;
		// int i = (int) aObject;
		// System.out.println(i + 1);
		Integer t = 23;// getClass方法不适用于基本类型
		int[] tArray = { 1, 23 };// 数组只有初始化之后才能用

		System.out.println(tArray.getClass());

	}
}

/*
 * [Ljava.lang.Integer;
 * 
 * @70dea4e 二
 * 
 * class [I [代表之后是一个数组类型 I 代表是个int
 */