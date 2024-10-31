package test.practice.ex1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import practice.ex1.Calculator;

class CalculatorTest {


  private final Calculator calculator = new Calculator();

  @Test
  public void testAdd() {
      assertEquals(5, calculator.add(2, 3));
      assertEquals(-1, calculator.add(-1, 0));
  }

  @Test
  public void testSubtract() {
      assertEquals(1, calculator.subtract(3, 2));
      assertEquals(-1, calculator.subtract(2, 3));
  }

  @Test
  public void testMultiply() {
      assertEquals(6, calculator.multiply(2, 3));
      assertEquals(0, calculator.multiply(0, 5));
  }

  @Test
  public void testDivide() {
      assertEquals(2.0, calculator.divide(6, 3));
      assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
  }
}
