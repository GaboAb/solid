package org.example.junitTest;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FizzBussTest {

  @Test
  void fizzbuss() {

    //given
    var rta = FizzBuss.fizzBussCalculator();
    //when

    //then
   Assert.assertEquals("1,2,fizz,4,Buzz,fizz,7,8,fizz,Buzz,11,fizz,13,14,fizzBuzz,16,17,fizz,19,Buzz",rta);
  }


}