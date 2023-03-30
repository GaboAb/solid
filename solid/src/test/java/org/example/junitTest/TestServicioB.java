package org.example.junitTest;

import org.example.junitTest.services.ServicioA;
import org.example.junitTest.services.ServicioAimpl;
import org.example.junitTest.services.ServicioB;
import org.example.junitTest.services.ServicioBimpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestServicioB {

  @Test
  public void testMultiplicar(){
    ServicioB servicioB = new ServicioBimpl();

    Assert.assertEquals(4,servicioB.multiplicar(2,2));
  }

  @Test
  public void testMultiplicarsumar() {
    ServicioB servicioB = new ServicioBimpl();
    ServicioA servicioA = Mockito.mock(ServicioA.class);
    servicioB.setServicioA(servicioA);
    Mockito.when(servicioA.sumar(2,3)).thenReturn(5);

    Assert.assertEquals(servicioB.multiplicarsumar(2,3,2),10);
  }
}
