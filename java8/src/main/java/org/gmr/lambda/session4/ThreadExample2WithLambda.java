

package org.gmr.lambda.session4;

public class ThreadExample2WithLambda {

  public static void main(String[] args) {

    // anonymous inner class with single abstract method (Any class with SAM then it considered as Funcation Interface)
    //So, we can use lambda expression on it
    Runnable runnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Lamda Exprression Child Thread");
      }
    };
    Thread t1 = new Thread(runnable);
    t1.start();


    //Main thread code
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }

  }

}
