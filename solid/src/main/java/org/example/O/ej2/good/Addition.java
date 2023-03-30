package org.example.O.ej2.good;

public class Addition implements changeStateOperation {
  private double left, right;
  private double result;
  private StateOperation state;

  @Override
  public void changeState(StateOperation stateOperation) {
    this.state=stateOperation;
    System.out.println(stateOperation.toString());
  }
}
