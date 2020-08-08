package org.gmr.falabella;

import java.util.Scanner;

public class GivenStringToTitleCaseTest {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String A = sc.next(); //hello
    String B = sc.next(); //java

    System.out.println(A.length() + B.length());
    System.out.println(A.charAt(0) > B.charAt(0) ? "Yes" : "No");

    System.out.println(toTitleCase(A + " " + B));

    /* Expected output
    * 9
      No
      Hello Java
    *  */


  }

  public static String toTitleCase(String input) {
    StringBuilder titleCase = new StringBuilder(input.length());
    boolean nextTitleCase = true;

    for (char c : input.toCharArray()) {
      if (Character.isSpaceChar(c)) {
        nextTitleCase = true;
      } else if (nextTitleCase) {
        c = Character.toTitleCase(c);
        nextTitleCase = false;
      }

      titleCase.append(c);
    }

    return titleCase.toString();
  }
}

