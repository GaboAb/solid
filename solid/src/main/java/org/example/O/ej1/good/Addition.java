package org.example.O.ej1.good;

public class Addition implements CalculateOperation {
  private double left, right;
  private double result;

  @Override
  public void calculate() {
    System.out.println("Hago la suma");
  }
}
