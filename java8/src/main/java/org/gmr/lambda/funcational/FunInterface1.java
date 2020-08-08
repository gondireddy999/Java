package org.gmr.lambda.funcational;

@FunctionalInterface //Optional, to perform the validation
public interface FunInterface1 {

  void m1();

  //void m11();

  default void m2() {
    System.out.println("m2");
  }
  static void m3() {
    System.out.println("static m3");
  }

}
