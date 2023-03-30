package org.example.O.ej2.good;

public class Calculator {

  public void calculate(changeStateOperation operation) {

    if (operation == null) {
      throw new IllegalArgumentException("invalid operation");
    }


    operation.changeState(StateOperation.ENABLE);
   
  }

}
