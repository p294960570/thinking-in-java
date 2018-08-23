package com.test.thread;

public class ThreadSupport {
	public static void main(String[] args) {
		int i = 100;
		while (i > 0) {
			System.out.println("current i value is:" + --i);
		}
		System.out.println("==============================");
		while (i < 100) {
			System.out.println("current i value is :" + ++i);
		}
	}
}