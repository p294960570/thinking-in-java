package com.plb.java.test5;

/**
 * 79.1���淶���� �Բ���˳��ͬ��������
 * 
 * @author �ӱ��
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
