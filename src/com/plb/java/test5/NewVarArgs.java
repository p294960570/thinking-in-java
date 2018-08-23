package com.plb.java.test5;

public class NewVarArgs {
	static void printArray(Object... args) {
		for (Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// Can take individual elements:
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new D(), new D(), new D());
		// Or an array:
		printArray((Object[]) new Integer[] { 1, 2, 3, 4 });
		printArray(); // Empty list is OK
	}
}

class D {
}/*
	 * Output: (75% match) 47 3.14 11.11 47 3.14 11.11 one two three A@1bab50a
	 * A@c3c749 A@150bd4d 1 2 3 4
	 */// :~
