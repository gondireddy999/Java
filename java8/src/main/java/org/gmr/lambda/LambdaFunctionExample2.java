package org.gmr.lambda;
import java.util.function.Function;

public class LambdaFunctionExample2 {

  public static void main(String[] args) {


    //Without Lambda functions
   add(10, 20);

    //With Lambda functions
   // (a,b) ->  System.out.println("sum:" + a+b);

  }

  private static void add( int a, int b) {
    System.out.println("sum:" + a+b);
  }


}
