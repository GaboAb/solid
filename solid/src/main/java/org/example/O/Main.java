package org.example.O;

import org.example.O.ej2.good.Addition;
import org.example.O.ej2.good.Calculator;
import org.example.O.ej2.good.Subtract;

public class Main {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Addition addition=new Addition();
    Subtract subtract = new Subtract();

    calculator.calculate(subtract);
  }
}
