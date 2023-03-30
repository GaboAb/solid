package org.example.O.ej1.Bad;

public class Calculator {

  public void calculate(CalculateOperation operation) {

    if (operation == null) {
      throw new IllegalArgumentException("invalid operation");
    }

    if(operation instanceof Addition){
      System.out.println("Hago la suma");
    } else if (operation instanceof Subtract) {
      System.out.println("Hago la resta");
    }

  }

}
