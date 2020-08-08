package org.gmr.lambda;
import java.util.function.Function;

public class LambdaFunctionExample4 {

  public static void main(String[] args) {


    //Without Lambda functions
    System.out.println("Lenght of Stirng:" + strLength(""));


    //With Lambda functions
    // s -> s.length();

  }

  private static int strLength(String s) {
    return s.length();
  }



}
