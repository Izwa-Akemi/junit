package practice.ex3;

public class MaxFinder {
  public int findMax(int[] numbers) {
      if (numbers == null || numbers.length == 0) {
          throw new IllegalArgumentException("Array must not be empty");
      }
      int max = numbers[0];
      for (int number : numbers) {
          if (number > max) {
              max = number;
          }
      }
      return max;
  }
}

