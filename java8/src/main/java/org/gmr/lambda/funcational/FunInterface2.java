package org.gmr.lambda.funcational;


@FunctionalInterface
interface AFunInterface {

  void m2();

}

@FunctionalInterface //Optional, to perform the validation
public interface FunInterface2 extends AFunInterface {

  // If no methods, then only valid F.I

//  void m1(); //will provide the compilation error :: If parent is F.I automatically child interface is F.I then


}

