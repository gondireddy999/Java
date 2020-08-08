package org.gmr.lambda;
import java.util.function.Function;

public class LambdaFunctionExample3 {

  public static void main(String[] args) {


    //Without Lambda functions
    System.out.println("Squre of 4:" + squreIt(4));
    System.out.println("Squre of 5:" + squreIt(4));

    //With Lambda functions
    Function<Integer, Integer> squreIt = i -> i * i;
    System.out.println("With Lambda -> Squre of 4:" + squreIt.apply(4));
  }

  public static Integer squreIt(int n) {
    return n * n;
  }




  /*
  i -> i * i;
  -> Without curly basis we cannot use return keyword. Compiler will consider returned value automatically
  -> With curly basis if we want to return some value compulsory should use return keyword.
  -----

  Funcational Interfaces
  ======================
    Which contains single abstract method (SAM)

    Note: Java8 on words => allows default methods and static methods

   */
}
