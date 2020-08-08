package org.gmr.lambda.funcational;

public class Test1 {

  public static void main(String[] args) {

    Interf i = new Demo();
    i.m1();

    //With Lambda
    Interf i1 = () -> System.out.println("Lambda Hello...");
    i1.m1();
    i1.m1();
    i1.m1();
    i1.m1();
    i1.m1();

  }

}


interface Interf {
  void m1();
}


class Demo implements Interf {
  public void m1() {
    System.out.println("Hello...");
  }
}