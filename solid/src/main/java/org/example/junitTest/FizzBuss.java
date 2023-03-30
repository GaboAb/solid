package org.example.junitTest;

public class FizzBuss {

  public static String fizzBussCalculator() {
    int contarHasta = 20;
    String rta = "";
    for (int i = 1; i <= contarHasta; i++) {
      if (i > 1) {
        rta += ",";
      }
      if ((i % 3 == 0) && (i % 5 == 0)) {
        rta += "fizzBuzz";
      } else if (i % 3 == 0) {
        rta += "fizz";
      } else if (i % 5 == 0) {
        rta += "Buzz";
      } else {
        rta = rta + i;

      }
    }

    return rta;
  }

  ;
}
