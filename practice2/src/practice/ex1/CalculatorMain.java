package practice.ex1;

public class CalculatorMain {
  public static void main(String[] args) {
      Calculator calculator = new Calculator();

      System.out.println("加算: 2 + 3 = " + calculator.add(2, 3));
      System.out.println("減算: 5 - 3 = " + calculator.subtract(5, 3));
      System.out.println("乗算: 2 * 3 = " + calculator.multiply(2, 3));
      try {
          System.out.println("除算: 6 / 3 = " + calculator.divide(6, 3));
          System.out.println("除算: 1 / 0 = " + calculator.divide(1, 0)); // 例外を発生させる
      } catch (IllegalArgumentException e) {
          System.out.println("エラー: " + e.getMessage());
      }
  }
}
