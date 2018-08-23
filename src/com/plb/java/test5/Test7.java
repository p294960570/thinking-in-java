package com.plb.java.test5;

/**
 * 95.1
 * 
 * @author ≈”±Ú±Ú
 *
 */

class Bowls {
	static int mark;

	Bowls(int i) {
		System.out.println("Bowls" + i);
	}
}

class Table1 {

	Bowls bowls1 = new Bowls(1);

	static Bowls bowls2 = new Bowls(2);

	static Bowls bowls3 = new Bowls(3);

}

public class Test7 {

	public static void main(String[] args) {
		new Table1();
		Table1 table1 = new Table1();
		table1.bowls2 = new Bowls(4);
	}

}
