package com.plb.java.test5;

public class Test11 {

	enum Templete {
		FREEZE, COLD, HOT, FIRE
	}

	enum LALA {
		FREEZE
	}

	public static void main(String[] args) {
		System.out.println(Templete.FREEZE.compareTo(Templete.FIRE));// 差几位
		System.out.println(Templete.HOT.ordinal());// 所在下标
		System.out.println(Templete.values());//

		for (Enum e : Templete.values()) {
			System.out.print(" 顺序" + e.ordinal());
		}
		System.out.println();
		Templete templete = Templete.FREEZE;

		switch (templete) {// 枚举可用于switch语句
		case FREEZE:

			System.out.println(true);

		default:
			break;
		}
	}

}
