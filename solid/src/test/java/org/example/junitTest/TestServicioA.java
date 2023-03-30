package org.example.junitTest;

import org.example.junitTest.services.ServicioA;
import org.example.junitTest.services.ServicioAimpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestServicioA {

  @Test
  public void testSumar() {
    int a = 2, b = 2;

    ServicioA servicioA = new ServicioAimpl();
    Assert.assertEquals(4,servicioA.sumar(a,b));


  }

}
