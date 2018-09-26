package com.plb.java.test7;
import static net.mindview.util.Print.print;
@SuppressWarnings("unused")
class Insect {
  private int i = 9;//4
  protected int j;
  Insect() {
    print("i = " + i + ", j = " + j);//5
    j = 39;
  }
  
private static int x1 =printInit("static Insect.x1 initialized");//1
  static int printInit(String s) {
    print(s);
    return 47;
  }
}
@SuppressWarnings("unused")
public class Beetle extends Insect {
  private int k = printInit("Beetle.k initialized");//6
  public Beetle() {
    print("k = " + k);//7
    print("j = " + j);
  }
  private static int x2 =printInit("static Beetle.x2 initialized");//2
  public static void main(String[] args) {
    print("Beetle constructor");//3
    Beetle b = new Beetle();
  }
} /* Output:
static Insect.x1 initialized//��̬����1
static Beetle.x2 initialized//��̬����2
Beetle constructor//ִ��main
i = 9, j = 0//��ʼ�����࣬�������Ĺ��������ٴ�֮ǰ��������ͳ�Ա������ʼֵ
Beetle.k initialized//��ʼ����Ա
k = 47//���캯��
j = 39
*///:~
