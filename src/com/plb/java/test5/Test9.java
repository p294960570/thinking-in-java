package com.plb.java.test5;

/**
 * 102.1
 * 
 * @author �ӱ��
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
		// printArray("һ", "��");
		printArray((Object[]) new Integer[] { 1, 2, 3 }, "��");
		// Object aObject = 2.2;
		// int i = (int) aObject;
		// System.out.println(i + 1);
		Integer t = 23;// getClass�����������ڻ�������
		int[] tArray = { 1, 23 };// ����ֻ�г�ʼ��֮�������

		System.out.println(tArray.getClass());

	}
}

/*
 * [Ljava.lang.Integer;
 * 
 * @70dea4e ��
 * 
 * class [I [����֮����һ���������� I �����Ǹ�int
 */