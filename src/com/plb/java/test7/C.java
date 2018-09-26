package com.plb.java.test7;

class A{
	
	A(String i){
		System.out.println("a的构造器"+i);
	}
}

class B {
	B(){
		System.out.println("b的构造器");
	}
}
public class C extends A {
 B b;
 
 C(){
	 super("ew");//没有这个会报错，找不到基类中的默认构造器
	 System.out.println("c的构造器");
 }
 public static void main(String[] args) {
	C c=new C();
}
}
