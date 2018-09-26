package com.plb.java.test7;


class Instrument {
  public void play() {}
  static void tune(Instrument i) {
    System.out.println(i.getClass().getName());
    i.play();
  }
}

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
  public static void main(String[] args) {
    Wind flute = new Wind();
    Instrument test=new Instrument();
    Instrument.tune(test);
    Instrument.tune(flute); // Upcasting
  }
} ///:~