package org.gmr.lambda;

import static java.lang.System.*;

import java.util.function.Function;

public class LambdaFunctionExample1 {

  public static void main(String[] args) {


    //Without Lambda functions
   sayHello();

    //With Lambda functions
    // () -> out.println("Hello Java..");


  }

  private static void sayHello() {
    out.println("Hello Java..");
  }


}
