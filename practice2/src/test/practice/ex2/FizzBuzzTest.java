package test.practice.ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practice.ex2.FizzBuzz;

class FizzBuzzTest {

		private final FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void testFizzBuzz() {
      assertEquals("1", fizzBuzz.fizzBuzz(1));
      assertEquals("2", fizzBuzz.fizzBuzz(2));
      assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
      assertEquals("4", fizzBuzz.fizzBuzz(4));
      assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
      assertEquals("Fizz", fizzBuzz.fizzBuzz(6));
      assertEquals("7", fizzBuzz.fizzBuzz(7));
      assertEquals("8", fizzBuzz.fizzBuzz(8));
      assertEquals("Fizz", fizzBuzz.fizzBuzz(9));
      assertEquals("Buzz", fizzBuzz.fizzBuzz(10));
      assertEquals("11", fizzBuzz.fizzBuzz(11));
      assertEquals("Fizz", fizzBuzz.fizzBuzz(12));
      assertEquals("13", fizzBuzz.fizzBuzz(13));
      assertEquals("14", fizzBuzz.fizzBuzz(14));
      assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
  }
}
