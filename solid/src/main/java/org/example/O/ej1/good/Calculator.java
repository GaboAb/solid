package org.example.O.ej1.good;

public class Calculator {

  public void calculate(CalculateOperation operation) {

    if (operation == null) {
      throw new IllegalArgumentException("invalid operation");
    }

    operation.calculate();
   
  }

}
