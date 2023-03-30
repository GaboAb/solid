package org.example.O.ej2.good;

import lombok.Data;

@Data
public class Subtract implements changeStateOperation {
private double left, right;
private double result;
private StateOperation state;

  @Override
  public void changeState(StateOperation stateOperation) {
    this.state=stateOperation;
    System.out.println(state.toString());
  }
}
