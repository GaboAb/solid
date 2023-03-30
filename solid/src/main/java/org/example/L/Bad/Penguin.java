package org.example.L.Bad;

public class Penguin extends Bird {
  @Override
  public void fly(){
    throw new UnsupportedOperationException("no puede volar");
  }
}
