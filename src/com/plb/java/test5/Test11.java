package com.plb.java.test5;

public class Test11 {

	enum Templete {
		FREEZE, COLD, HOT, FIRE
	}

	enum LALA {
		FREEZE
	}

	public static void main(String[] args) {
		System.out.println(Templete.FREEZE.compareTo(Templete.FIRE));// �λ
		System.out.println(Templete.HOT.ordinal());// �����±�
		System.out.println(Templete.values());//

		for (Enum e : Templete.values()) {
			System.out.print(" ˳��" + e.ordinal());
		}
		System.out.println();
		Templete templete = Templete.FREEZE;

		switch (templete) {// ö�ٿ�����switch���
		case FREEZE:

			System.out.println(true);

		default:
			break;
		}
	}

}
