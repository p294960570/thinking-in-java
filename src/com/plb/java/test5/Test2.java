package com.plb.java.test5;

/**
 * 77.2 以构造器优先
 * 
 * @author 庞彬彬
 *
 */
public class Test2 {

	public static void main(String[] args) {
		Student1 student1 = new Student1();
		System.out.println(student1.str);
	}
}

class Student1 {
	public String str = "asd";

	public Student1() {
		str = "zxc";
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
