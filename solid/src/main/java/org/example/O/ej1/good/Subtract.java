package org.example.O.ej1.good;

import lombok.Data;

@Data
public class Subtract implements CalculateOperation {
private double left, right;
private double result;


  @Override
  public void calculate() {
    System.out.println("Hago la resta");
  }
}
