package org.gmr.lambda.funcational;

public class Test2 {

  public static void main(String[] args) {

    Interf1 i = new Demo1();
    i.add(10, 20);

    //With Lambda
    Interf1 i1 = (a,b) -> System.out.println("Lambda sum a+b:"+ (a+b));
    i.add(100, 200);


  }

}


interface Interf1 {
  void add(int a, int b);
}


class Demo1 implements Interf1 {
  public void add(int a, int b) {
    System.out.println("Sum of a+b: "+ (a+b));
  }
}