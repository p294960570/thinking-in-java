package com.plb.java.test7;

class A{
	
	A(String i){
		System.out.println("a�Ĺ�����"+i);
	}
}

class B {
	B(){
		System.out.println("b�Ĺ�����");
	}
}
public class C extends A {
 B b;
 
 C(){
	 super("ew");//û������ᱨ���Ҳ��������е�Ĭ�Ϲ�����
	 System.out.println("c�Ĺ�����");
 }
 public static void main(String[] args) {
	C c=new C();
}
}
