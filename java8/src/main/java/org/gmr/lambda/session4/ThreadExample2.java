

package org.gmr.lambda.session4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreadExample2 {

  public static void main(String[] args) {

    //Regular way of defining anonymous inner class [ For instant use we will go for A.I]

    Runnable r = new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10; i++) {
          System.out.println("Child Thread");
        }
      }
    };

    Thread t = new Thread(r);
    t.start();

    //Main thread code
    for (int i = 0; i < 10; i++) {
      System.out.println("Main Thread");
    }

    //Above anonymous inner class with single abstract method (Any class with SAM then it considered as Funcation Interface)
    //So, we can use lambda expression on it



  }

}
